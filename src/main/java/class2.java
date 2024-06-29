import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 {

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "[I")
    private int[] field37;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "[I")
    private int[] field32;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lsf;")
    public static class108 field27 = class140.method973(255, "<br>");

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "[I")
    public static int[] field40 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field28 = 0;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field31 = 1;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Lsf;")
    public static class108 field44 = class140.method973(255, "Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3");

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lsf;")
    public static class108 field43 = class140.method973(255, "::wm1");

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lsf;")
    public static class108 field33 = class140.method973(255, "welle2:");

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field47 = 0;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "Lsf;")
    public static class108 field46 = class140.method973(255, "Cache:");

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "Lsf;")
    public static class108 field48 = class140.method973(255, "blanc:");

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    private int field34;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    private int field35;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    private int field45;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Lig;", line = 5)
    public static final class180 method16(int arg0, int arg1) {
        class180 var2 = (class180) class255.field4434.method642((long) arg1, (byte) -51);
        field38++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class81.field1265.method1868(12236, arg0, arg1);
        class180 var4 = new class180();
        if (var3 != null) {
            var4.method1304(new class249(var3), false);
        }
        var4.method1308(-67);
        class255.field4434.method643((byte) -49, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 39)
    public static void method17(int arg0) {
        field48 = null;
        if (arg0 != 261338) {
            return;
        }
        field43 = null;
        field44 = null;
        field40 = null;
        field27 = null;
        field46 = null;
        field33 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lrm;I)V", line = 64)
    public static final void method18(class249 arg0, int arg1) {
        for (int var2 = arg1; var2 < class110.field1926; var2++) {
            int var3 = arg0.method1739((byte) -37);
            int var4 = arg0.method1712(arg1 - 1);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class184.field3388[var3] != null) {
                class184.field3388[var3].field2880 = var4;
            }
        }
        field41++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V", line = 91)
    private final void method19(boolean arg0) {
        field30++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var7 + var12;
            int var16 = var15 ^ var12 << 8;
            int var17 = var5 + var14;
            int var18 = var12 + var17;
            int var19 = var4 + var16;
            var6 = var18 ^ var17 >>> 16;
            int var20 = var17 + var19;
            int var21 = var3 + var6;
            var5 = var20 ^ var19 << 10;
            int var22 = var19 + var21;
            int var23 = var2 + var5;
            var4 = var22 ^ var21 >>> 4;
            int var24 = var4 + var11;
            int var25 = var21 + var23;
            var3 = var25 ^ var23 << 8;
            var8 = var3 + var14;
            int var26 = var23 + var24;
            var2 = var26 ^ var24 >>> 9;
            var9 = var8 + var24;
            var7 = var2 + var16;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field32[var27 + 3] + var6;
            int var29 = this.field32[var27 + 6] + var3;
            int var30 = this.field32[var27 + 1] + var8;
            int var31 = this.field32[var27 + 4] + var5;
            int var32 = this.field32[var27 + 7] + var2;
            int var33 = this.field32[var27] + var9;
            int var34 = this.field32[var27 + 2] + var7;
            int var35 = this.field32[var27 + 5] + var4;
            int var36 = var33 ^ var30 << 11;
            int var37 = var28 + var36;
            int var38 = var30 + var34;
            int var39 = var38 ^ var34 >>> 2;
            int var40 = var34 + var37;
            int var41 = var40 ^ var37 << 8;
            int var42 = var35 + var41;
            int var43 = var31 + var39;
            int var44 = var37 + var43;
            var6 = var44 ^ var43 >>> 16;
            int var45 = var6 + var29;
            int var46 = var42 + var43;
            var5 = var46 ^ var42 << 10;
            int var47 = var5 + var32;
            int var48 = var42 + var45;
            var4 = var48 ^ var45 >>> 4;
            int var49 = var45 + var47;
            int var50 = var4 + var36;
            var3 = var49 ^ var47 << 8;
            var8 = var3 + var39;
            int var51 = var47 + var50;
            var2 = var51 ^ var50 >>> 9;
            var9 = var8 + var50;
            var7 = var2 + var41;
            this.field37[var27] = var9;
            this.field37[var27 + 1] = var8;
            this.field37[var27 + 2] = var7;
            this.field37[var27 + 3] = var6;
            this.field37[var27 + 4] = var5;
            this.field37[var27 + 5] = var4;
            this.field37[var27 + 6] = var3;
            this.field37[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field37[var52 + 4] + var5;
            int var54 = this.field37[var52 + 1] + var8;
            int var55 = this.field37[var52 + 6] + var3;
            int var56 = this.field37[var52 + 7] + var2;
            int var57 = this.field37[var52 + 3] + var6;
            int var58 = this.field37[var52] + var9;
            int var59 = this.field37[var52 + 2] + var7;
            int var60 = var58 ^ var54 << 11;
            int var61 = this.field37[var52 + 5] + var4;
            int var62 = var54 + var59;
            int var63 = var57 + var60;
            int var64 = var62 ^ var59 >>> 2;
            int var65 = var59 + var63;
            int var66 = var53 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var63 + var66;
            var6 = var68 ^ var66 >>> 16;
            int var69 = var6 + var55;
            int var70 = var61 + var67;
            int var71 = var66 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var69 + var70;
            int var73 = var5 + var56;
            var4 = var72 ^ var69 >>> 4;
            int var74 = var4 + var60;
            int var75 = var69 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var64;
            var9 = var8 + var74;
            this.field37[var52] = var9;
            this.field37[var52 + 1] = var8;
            this.field37[var52 + 2] = var7;
            this.field37[var52 + 3] = var6;
            this.field37[var52 + 4] = var5;
            this.field37[var52 + 5] = var4;
            this.field37[var52 + 6] = var3;
            this.field37[var52 + 7] = var2;
        }
        if (!arg0) {
            this.method20(-13);
        }
        this.method20(453702472);
        this.field29 = 256;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V", line = 285)
    private final void method20(int arg0) {
        if (arg0 != 453702472) {
            this.field29 = 98;
        }
        this.field45 += ++this.field34;
        field42++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field37[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field35 ^= this.field35 << 13;
                } else {
                    this.field35 ^= this.field35 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field35 ^= this.field35 << 2;
            } else {
                this.field35 ^= this.field35 >>> 16;
            }
            this.field35 += this.field37[var2 + 128 & 0xFF];
            int var4;
            this.field37[var2] = var4 = this.field45 + this.field37[class162.method1118(1020, var3) >> 2] + this.field35;
            this.field32[var2] = this.field45 = this.field37[class162.method1118(var4, 261338) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)I", line = 326)
    public final int method21(int arg0) {
        if (this.field29-- == 0) {
            this.method20(453702472);
            this.field29 = 255;
        }
        if (arg0 != 255) {
            this.field29 = -55;
        }
        field36++;
        return this.field32[this.field29];
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V", line = 343)
    private class2() {
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([I)V", line = 348)
    public class2(int[] arg0) {
        this.field37 = new int[256];
        this.field32 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field32[var2] = arg0[var2];
        }
        this.method19(true);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZILsf;)V", line = 376)
    public static final void method22(boolean arg0, int arg1, class108 arg2) {
        field39++;
        class108 var3 = arg2.method749(-112).method755(8975);
        boolean var4 = arg0;
        for (int var5 = 0; var5 < class43.field569; var5++) {
            class51 var6 = class96.field1558[class194.field3511[var5]];
            if (var6 != null && var6.field757 != null && var6.field757.method781(var3, -26321)) {
                class328.method2245(var6.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var6.field4498[0], 1);
                var4 = true;
                if (arg1 == 1) {
                    class185.field3396++;
                    class256.field4471.method1427(72, 0);
                    class256.field4471.method1754(class194.field3511[var5], -12);
                } else if (arg1 == 4) {
                    class256.field4471.method1427(230, 0);
                    class256.field4471.method1729(class194.field3511[var5], 4110);
                    class147.field2638++;
                } else if (arg1 == 5) {
                    class216.field3855++;
                    class256.field4471.method1427(219, 0);
                    class256.field4471.method1724(false, class194.field3511[var5]);
                } else if (arg1 == 6) {
                    class277.field4834++;
                    class256.field4471.method1427(136, 0);
                    class256.field4471.method1754(class194.field3511[var5], -46);
                } else if (arg1 == 7) {
                    class149.field2726++;
                    class256.field4471.method1427(130, 0);
                    class256.field4471.method1761(-25, class194.field3511[var5]);
                }
                break;
            }
        }
        if (!var4) {
            class210.method1456(class117.method833(new class108[] { class46.field688, var3 }, false), 0, -88, class63.field1016);
        }
    }
}
