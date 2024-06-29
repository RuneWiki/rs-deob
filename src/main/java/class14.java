import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class14 {

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lqc;")
    private class325 field122 = new class325(64);

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Ldda;")
    private class597 field125;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Ldda;")
    public class597 field126;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Leaa;")
    public static class43 field128 = new class43(128);

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "[I")
    public static int[] field129 = new int[16384];

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "[I")
    public static int[] field130 = new int[16384];

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "J")
    public static long field131;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Lqp;")
    public static class586 field132;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "[[Lwca;")
    public static class311[][] field123;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIB)I")
    public static final int method60(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -89) {
            return -66;
        }
        int var4 = arg0 & 0x3;
        field121++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
    public final void method61(int arg0, byte arg1) {
        field117++;
        class325 var3 = this.field122;
        synchronized (this.field122) {
            if (arg1 <= -113) {
                this.field122.method2028(arg0, true);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIII)V")
    public static final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field127++;
        class201.method1305((byte) -128, arg4);
        if (arg6 != 2) {
            method68((byte) -17);
        }
        int var7 = 0;
        int var8 = arg4 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg1 >= class483.field7334 && class202.field3021 >= arg1) {
            int[] var15 = class47.field558[arg1];
            int var16 = class406.method2430(class130.field1712, arg2 - arg4, class401.field5755, 64);
            int var17 = class406.method2430(class130.field1712, arg2 + arg4, class401.field5755, arg6 + 62);
            int var18 = class406.method2430(class130.field1712, arg2 - var8, class401.field5755, arg6 ^ 0x42);
            int var19 = class406.method2430(class130.field1712, arg2 + var8, class401.field5755, 64);
            class69.method418(arg0, var15, var18, (byte) 117, var16);
            class69.method418(arg3, var15, var19, (byte) 117, var18);
            class69.method418(arg0, var15, var17, (byte) 117, var19);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class481.field7293[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (class483.field7334 <= var21 && class202.field3021 >= var20) {
                    if (var9 < var8) {
                        int var22 = class481.field7293[var9];
                        int var23 = class406.method2430(class130.field1712, arg2 + var7, class401.field5755, 64);
                        int var24 = class406.method2430(class130.field1712, arg2 - var7, class401.field5755, 64);
                        int var25 = class406.method2430(class130.field1712, arg2 + var22, class401.field5755, 64);
                        int var26 = class406.method2430(class130.field1712, arg2 - var22, class401.field5755, arg6 + 62);
                        if (var21 <= class202.field3021) {
                            int[] var27 = class47.field558[var21];
                            class69.method418(arg0, var27, var26, (byte) 117, var24);
                            class69.method418(arg3, var27, var25, (byte) 117, var26);
                            class69.method418(arg0, var27, var23, (byte) 117, var25);
                        }
                        if (var20 >= class483.field7334) {
                            int[] var28 = class47.field558[var20];
                            class69.method418(arg0, var28, var26, (byte) 117, var24);
                            class69.method418(arg3, var28, var25, (byte) 117, var26);
                            class69.method418(arg0, var28, var23, (byte) 117, var25);
                        }
                    } else {
                        int var29 = class406.method2430(class130.field1712, arg2 + var7, class401.field5755, arg6 ^ 0x42);
                        int var30 = class406.method2430(class130.field1712, arg2 - var7, class401.field5755, arg6 + 62);
                        if (class202.field3021 >= var21) {
                            class69.method418(arg0, class47.field558[var21], var29, (byte) 117, var30);
                        }
                        if (var20 >= class483.field7334) {
                            class69.method418(arg0, class47.field558[var20], var29, (byte) 117, var30);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class483.field7334 && class202.field3021 >= var31) {
                int var33 = arg2 + var9;
                int var34 = arg2 - var9;
                if (class130.field1712 <= var33 && class401.field5755 >= var34) {
                    int var35 = class406.method2430(class130.field1712, var33, class401.field5755, 64);
                    int var36 = class406.method2430(class130.field1712, var34, class401.field5755, 64);
                    if (var7 < var8) {
                        int var37 = var7 <= var11 ? var11 : class481.field7293[var7];
                        int var38 = class406.method2430(class130.field1712, arg2 + var37, class401.field5755, 64);
                        int var39 = class406.method2430(class130.field1712, arg2 - var37, class401.field5755, 64);
                        if (class202.field3021 >= var32) {
                            int[] var40 = class47.field558[var32];
                            class69.method418(arg0, var40, var39, (byte) 117, var36);
                            class69.method418(arg3, var40, var38, (byte) 117, var39);
                            class69.method418(arg0, var40, var35, (byte) 117, var38);
                        }
                        if (class483.field7334 <= var31) {
                            int[] var41 = class47.field558[var31];
                            class69.method418(arg0, var41, var39, (byte) 117, var36);
                            class69.method418(arg3, var41, var38, (byte) 117, var39);
                            class69.method418(arg0, var41, var35, (byte) 117, var38);
                        }
                    } else {
                        if (var32 <= class202.field3021) {
                            class69.method418(arg0, class47.field558[var32], var35, (byte) 117, var36);
                        }
                        if (var31 >= class483.field7334) {
                            class69.method418(arg0, class47.field558[var31], var35, (byte) 117, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Luv;")
    public final class3 method63(int arg0, int arg1) {
        field120++;
        class325 var3 = this.field122;
        class3 var4;
        synchronized (this.field122) {
            var4 = (class3) this.field122.method2025((long) arg1, arg0 + 2);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 0) {
            method62(-109, -48, 50, 106, -16, -80, -51);
        }
        class597 var5 = this.field125;
        byte[] var6;
        synchronized (this.field125) {
            var6 = this.field125.method3486((byte) -61, arg1, 3);
        }
        class3 var7 = new class3();
        var7.field28 = this;
        if (var6 != null) {
            var7.method8(false, new class428(var6));
        }
        class325 var8 = this.field122;
        synchronized (this.field122) {
            this.field122.method2029(false, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method64(String arg0, byte arg1) {
        field119++;
        if (arg0 == null) {
            return false;
        }
        int var2 = -68 / ((25 - arg1) / 37);
        for (int var3 = 0; var3 < class103.field1309; var3++) {
            if (arg0.equalsIgnoreCase(class288.field4250[var3])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class451.field6589[var3])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public final void method65(boolean arg0) {
        field118++;
        class325 var2 = this.field122;
        synchronized (this.field122) {
            if (!arg0) {
                this.field122.method2024((byte) -81);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public final void method66(int arg0) {
        class325 var2 = this.field122;
        synchronized (this.field122) {
            this.field122.method2037(true);
        }
        if (arg0 == 2851) {
            field124++;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static final void method67(byte arg0) {
        class248.method1580((long) class576.field8505, (byte) -61, class379.field5558);
        field116++;
        if (class540.field8007 != -1) {
            class611.method3566(class540.field8007, arg0 ^ 0x49);
        }
        for (int var1 = 0; var1 < class395.field5741; var1++) {
            if (class587.field8718[var1]) {
                class644.field9344[var1] = true;
            }
            class359.field5215[var1] = class587.field8718[var1];
            class587.field8718[var1] = false;
        }
        class43.field529 = class576.field8505;
        if (class379.field5558.method976()) {
            class385.field5638 = true;
        }
        if (class540.field8007 != -1) {
            class395.field5741 = 0;
            class508.method3036((byte) 5);
        }
        class379.field5558.method985();
        class538.method3158(-98, class379.field5558);
        int var2 = class639.method3703((byte) -30);
        if (var2 == -1) {
            var2 = class362.field5233;
        }
        if (var2 == -1) {
            var2 = class591.field8746;
        }
        class235.method1523(false, var2);
        class394.field5735 = 0;
        if (arg0 != -74) {
            field123 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public static void method68(byte arg0) {
        field128 = null;
        if (arg0 >= -85) {
            method64(null, (byte) 53);
        }
        field123 = null;
        field132 = null;
        field130 = null;
        field129 = null;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Loda;ILdda;Ldda;)V")
    public class14(class559 arg0, int arg1, class597 arg2, class597 arg3) {
        this.field125 = arg2;
        this.field126 = arg3;
        this.field125.method3462(3, 87);
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field129[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field130[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field131 = -1L;
        new class487("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field132 = new class586(86, 5);
    }
}
