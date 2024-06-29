import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class212 {

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "[I")
    private int[] field2582;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "[I")
    private int[] field2591;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "[Lbe;")
    public static class131[] field2584;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    private int field2579;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    private int field2583;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    private int field2587;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    private int field2592;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "Ljk;")
    public static class117 field2588;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gq", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field2596;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "[I")
    public static int[] field2589;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "[I")
    public static int[] field2593;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)I")
    public final int method1293(byte arg0) {
        field2595++;
        if ((this.field2579--) == 0) {
            this.method1294(false);
            this.field2579 = 255;
        }
        return arg0 == -111 ? this.field2582[this.field2579] : 39;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V")
    private final void method1294(boolean arg0) {
        field2581++;
        this.field2592 += ++this.field2587;
        if (arg0) {
            this.method1293((byte) -111);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2591[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2583 ^= this.field2583 << 13;
                } else {
                    this.field2583 ^= this.field2583 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2583 ^= this.field2583 << 2;
            } else {
                this.field2583 ^= this.field2583 >>> 16;
            }
            this.field2583 += this.field2591[var2 + 128 & 0xFF];
            int var4;
            this.field2591[var2] = var4 = this.field2591[class191.method1183(1020, var3) >> 2] - (-this.field2592 - this.field2583);
            this.field2582[var2] = this.field2592 = this.field2591[class191.method1183(var4, 261308) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILmd;)V")
    public static final void method1295(int arg0, class186 arg1) {
        field2590++;
        if (class347.field4722 == null) {
            return;
        }
        class171 var2 = null;
        if (arg1.field2143 == arg0) {
            var2 = (class171) class440.method2708(arg1.field2156, arg1.field2150, arg1.field2157);
        }
        if (arg1.field2143 == 1) {
            var2 = (class171) class65.method373(arg1.field2156, arg1.field2150, arg1.field2157);
        }
        if (arg1.field2143 == 2) {
            var2 = (class171) class246.method1610(arg1.field2156, arg1.field2150, arg1.field2157, field2596 == null ? (field2596 = method1301("ol")) : field2596);
        }
        if (arg1.field2143 == 3) {
            var2 = (class171) class451.method2792(arg1.field2156, arg1.field2150, arg1.field2157);
        }
        if (var2 == null) {
            arg1.field2155 = 0;
            arg1.field2149 = -1;
            arg1.field2144 = 0;
        } else {
            arg1.field2149 = var2.method409(-50);
            arg1.field2144 = var2.method420((byte) 73);
            arg1.field2155 = var2.method417((byte) -116);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lbg;I)Lb;")
    public static final class401 method1296(class242 arg0, int arg1) {
        field2578++;
        if (arg1 != 261308) {
            method1300(-33, (byte) -88);
        }
        return new class401(arg0.method1582(false), arg0.method1582(false), arg0.method1582(false), arg0.method1582(false), arg0.method1545(8), arg0.method1545(arg1 ^ 0x3FCB4), arg0.method1563(-128));
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
    private final void method1297(int arg0) {
        field2585++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2582[var11 + 1] + var8;
            int var38 = this.field2582[var11 + 3] + var6;
            int var39 = this.field2582[var11 + 6] + var3;
            int var40 = this.field2582[var11] + var9;
            int var41 = this.field2582[var11 + 2] + var7;
            int var42 = this.field2582[var11 + 7] + var2;
            int var43 = this.field2582[var11 + 5] + var4;
            int var44 = this.field2582[var11 + 4] + var5;
            int var45 = var40 ^ var37 << 11;
            int var46 = var38 + var45;
            int var47 = var37 + var41;
            int var48 = var47 ^ var41 >>> 2;
            int var49 = var41 + var46;
            int var50 = var44 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var43 + var51;
            int var53 = var46 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            int var55 = var6 + var39;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var42;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field2591[var11] = var9;
            this.field2591[var11 + 1] = var8;
            this.field2591[var11 + 2] = var7;
            this.field2591[var11 + 3] = var6;
            this.field2591[var11 + 4] = var5;
            this.field2591[var11 + 5] = var4;
            this.field2591[var11 + 6] = var3;
            this.field2591[var11 + 7] = var2;
        }
        if (arg0 <= 94) {
            return;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2591[var12 + 6] + var3;
            int var14 = this.field2591[var12 + 7] + var2;
            int var15 = this.field2591[var12 + 4] + var5;
            int var16 = this.field2591[var12 + 3] + var6;
            int var17 = this.field2591[var12] + var9;
            int var18 = this.field2591[var12 + 5] + var4;
            int var19 = this.field2591[var12 + 1] + var8;
            int var20 = this.field2591[var12 + 2] + var7;
            int var21 = var17 ^ var19 << 11;
            int var22 = var16 + var21;
            int var23 = var19 + var20;
            int var24 = var23 ^ var20 >>> 2;
            int var25 = var15 + var24;
            int var26 = var20 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var18 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var13;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var14;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field2591[var12] = var9;
            this.field2591[var12 + 1] = var8;
            this.field2591[var12 + 2] = var7;
            this.field2591[var12 + 3] = var6;
            this.field2591[var12 + 4] = var5;
            this.field2591[var12 + 5] = var4;
            this.field2591[var12 + 6] = var3;
            this.field2591[var12 + 7] = var2;
        }
        this.method1294(false);
        this.field2579 = 256;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V")
    public static void method1298(byte arg0) {
        field2584 = null;
        if (arg0 <= -74) {
            field2588 = null;
            field2589 = null;
            field2593 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
    public static final void method1299(int arg0) {
        field2577++;
        if (class140.field1629) {
            return;
        }
        class140.field1629 = true;
        int var1 = 90 % ((-arg0 - 43) / 62);
        class392.field5340 = true;
        if (class244.field3246) {
            class301.field4020 = (float) ((int) class301.field4020 - 17 & 0xFFFFFFF0);
        } else {
            class49.field571 += (-12.0F - class49.field571) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
    private class212() {
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)Lkn;")
    public static final class326 method1300(int arg0, byte arg1) {
        field2580++;
        class365 var2 = class121.field1383;
        class326 var3;
        synchronized (class121.field1383) {
            var3 = (class326) class121.field1383.method2295((long) arg0, (byte) 74);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class382.field5227.method1794(5860, class174.method1095(128, arg0), class438.method2675(1023, arg0));
        class326 var5 = new class326();
        if (var4 != null) {
            var5.method2044((byte) 56, new class242(var4));
        }
        class365 var6 = class121.field1383;
        synchronized (class121.field1383) {
            if (arg1 >= -110) {
                method1296((class242) null, 64);
            }
            class121.field1383.method2294(var5, (byte) 61, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "([I)V")
    public class212(int[] arg0) {
        this.field2582 = new int[256];
        this.field2591 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2582[var2] = arg0[var2];
        }
        this.method1297(101);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1301(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class72("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field2584 = new class131[2048];
        field2594 = 0;
        field2586 = 0;
    }
}
