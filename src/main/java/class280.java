import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class280 {

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    private int field3560 = -1;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "Z")
    public boolean field3549 = true;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    private int field3555;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    private int field3559;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "Lk;")
    private class530 field3545;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "Ljaa;")
    private class576 field3558;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    private int field3556;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "Lco;")
    private class109 field3554;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "Lwb;")
    private class308 field3557;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "Lea;")
    private class512 field3546;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "[F")
    public static float[] field3548 = new float[16384];

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "[F")
    public static float[] field3550 = new float[16384];

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field3553;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mu", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field3561;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLoa;I)Z")
    public static final boolean method1682(byte arg0, class650 arg1, int arg2) {
        field3544++;
        int var3 = -123 % ((-arg0 - 17) / 44);
        int var4 = (class85.field1090 - 104) / 2;
        int var5 = (class656.field8932 - 104) / 2;
        boolean var6 = true;
        for (int var7 = var4; var7 < var4 + 104; var7++) {
            for (int var58 = var5; var58 < (var5 + 104); var58++) {
                for (int var59 = arg2; var59 <= 3; var59++) {
                    if (class28.method174(var58, -17783, var7, arg2, var59)) {
                        int var60 = var59;
                        if (class407.method2284(125, var7, var58)) {
                            var60 = var59 - 1;
                        }
                        if (var60 >= 0) {
                            var6 &= class229.method1386(67, var60, var58, var7);
                        }
                    }
                }
            }
        }
        if (!var6) {
            return false;
        }
        int[] var8 = new int[262144];
        for (int var9 = 0; var9 < var8.length; var9++) {
            var8[var9] = -16777216;
        }
        class136.field1651 = arg1.method428(var8, 0, 512, 512, 512);
        class513.method2794(-240);
        int var10 = -(-((int) (Math.random() * 20.0D)) - 238) + (((int) (Math.random() * 20.0D) + 228 << 16) + (((int) (Math.random() * 20.0D) - 10) + 238 << 8)) - 10 | 0xFF000000;
        int var11 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x49BFFF00) << 16;
        int var12 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var13 = new boolean[class710.field9929 + 1][class710.field9929 + 1];
        for (int var14 = var4; var14 < (var4 + 104); var14 += class710.field9929) {
            for (int var37 = var5; var37 < (var5 + 104); var37 += class710.field9929) {
                int var38 = 0;
                int var39 = 0;
                int var40 = var14;
                if (var14 > 0) {
                    var38 += 4;
                    var40 = var14 - 1;
                }
                int var41 = var37;
                if (var37 > 0) {
                    var41 = var37 - 1;
                }
                int var42 = class710.field9929 + var14;
                if (var42 < 104) {
                    var42++;
                }
                int var43 = class710.field9929 + var37;
                if (var43 < 104) {
                    var39 += 4;
                    var43++;
                }
                arg1.method403(0, 0, class710.field9929 * 4 + var38, class710.field9929 * 4 + var39);
                arg1.method315(-16777216);
                for (int var44 = arg2; var44 <= 3; var44++) {
                    for (int var51 = 0; var51 <= class710.field9929; var51++) {
                        for (int var57 = 0; var57 <= class710.field9929; var57++) {
                            var13[var51][var57] = class28.method174(var41 + var57, -17783, var40 + var51, arg2, var44);
                        }
                    }
                    class252.field3250[var44].method189(0, 0, 1024, var40, var41, var42, var43, var13);
                    if (!class257.field3288) {
                        for (int var52 = -4; var52 < class710.field9929; var52++) {
                            for (int var53 = -4; var53 < class710.field9929; var53++) {
                                int var54 = var14 + var52;
                                int var55 = var37 + var53;
                                if (var54 >= var4 && var5 <= var55 && class28.method174(var55, -17783, var54, arg2, var44)) {
                                    int var56 = var44;
                                    if (class407.method2284(-127, var54, var55)) {
                                        var56 = var44 - 1;
                                    }
                                    if (var56 >= 0) {
                                        class58.method500((class710.field9929 - var53) * 4 + var39 - 4, var10, var52 * 4 + var38, var55, (byte) -102, var11, var56, arg1, var54);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class257.field3288) {
                    class158 var45 = class634.field8601[arg2];
                    for (int var46 = 0; var46 < class710.field9929; var46++) {
                        for (int var47 = 0; var47 < class710.field9929; var47++) {
                            int var48 = var14 + var46;
                            int var49 = var37 + var47;
                            int var50 = var45.field1875[var48 - var45.field1872][var49 - var45.field1864];
                            if ((var50 & 0x40240000) != 0) {
                                arg1.method3630((byte) 36, 4, var39 + ((class710.field9929 - var47) * 4) - 4, var38 - -(var46 * 4), -1713569622, 4);
                            } else if ((var50 & 0x800000) != 0) {
                                arg1.method3634(-1713569622, 4, var38 + (var46 * 4), (-var47 + class710.field9929) * 4 + var39 + -4, 45365);
                            } else if ((var50 & 0x2000000) != 0) {
                                arg1.method3626(0, 4, -1713569622, var46 * 4 + (var38 + 3), var39 - -((-var47 + class710.field9929) * 4) + -4);
                            } else if ((var50 & 0x8000000) != 0) {
                                arg1.method3634(-1713569622, 4, var46 * 4 + var38, var39 + -4 - (-((class710.field9929 - var47) * 4) + -3), 45365);
                            } else if ((var50 & 0x20000000) != 0) {
                                arg1.method3626(0, 4, -1713569622, var46 * 4 + var38, (-var47 + class710.field9929) * 4 + -4 + var39);
                            }
                        }
                    }
                }
                arg1.method475(var38, var39, class710.field9929 * 4, class710.field9929 * 4, var12, 2);
                class136.field1651.method1546((var14 - var4) * 4 + 48, -(class710.field9929 * 4) + 464 - (-var5 + var37) * 4, class710.field9929 * 4, class710.field9929 * 4, var38, var39);
            }
        }
        arg1.method410();
        arg1.method315(-16777215);
        class377.method2172(100);
        class266.field3369 = 0;
        class703.field9847.method1913((byte) 109);
        if (!class257.field3288) {
            for (int var15 = var4; var15 < var4 + 104; var15++) {
                for (int var21 = var5; var21 < (var5 + 104); var21++) {
                    for (int var22 = arg2; (arg2 + 1) >= var22 && var22 <= 3; var22++) {
                        if (class28.method174(var21, -17783, var15, arg2, var22)) {
                            class310 var23 = (class310) class618.method3444(var22, var15, var21);
                            if (var23 == null) {
                                var23 = (class310) class513.method2796(var22, var15, var21, field3561 == null ? (field3561 = method1689("pba")) : field3561);
                            }
                            if (var23 == null) {
                                var23 = (class310) class593.method3281(var22, var15, var21);
                            }
                            if (var23 == null) {
                                var23 = (class310) class546.method2924(var22, var15, var21);
                            }
                            if (var23 != null) {
                                class687 var24 = class232.field3017.method2358(0, var23.method131((byte) -97));
                                if (!var24.field9456 || class196.field2308) {
                                    int var25 = var24.field9437;
                                    if (var24.field9421 != null) {
                                        for (int var26 = 0; var26 < var24.field9421.length; var26++) {
                                            if (var24.field9421[var26] != -1) {
                                                class687 var27 = class232.field3017.method2358(0, var24.field9421[var26]);
                                                if (var27.field9437 >= 0) {
                                                    var25 = var27.field9437;
                                                }
                                            }
                                        }
                                    }
                                    if (var25 >= 0) {
                                        boolean var28 = false;
                                        if (var25 >= 0) {
                                            class663 var29 = class530.field6699.method93(var25, (byte) 121);
                                            if (var29 != null && var29.field8990) {
                                                var28 = true;
                                            }
                                        }
                                        int var30 = var15;
                                        int var31 = var21;
                                        if (var28) {
                                            int[][] var32 = class634.field8601[var22].field1875;
                                            int var33 = class634.field8601[var22].field1872;
                                            int var34 = class634.field8601[var22].field1864;
                                            for (int var35 = 0; var35 < 10; var35++) {
                                                int var36 = (int) (Math.random() * 4.0D);
                                                if (var36 == 0 && var30 > var4 && var30 > (var15 - 3) && (var32[var30 - var33 - 1][var31 - var34] & 0x2C0108) == 0) {
                                                    var30--;
                                                }
                                                if (var36 == 1 && var30 < (var4 + 104 - 1) && var15 + 3 > var30 && (var32[var30 + 1 - var33][var31 - var34] & 0x2C0180) == 0) {
                                                    var30++;
                                                }
                                                if (var36 == 2 && var31 > var5 && var31 > var21 - 3 && (var32[var30 - var33][var31 - var34 - 1] & 0x2C0102) == 0) {
                                                    var31--;
                                                }
                                                if (var36 == 3 && (var5 + 104 - 1) > var31 && var21 + 3 > var31 && (var32[var30 - var33][var31 + 1 - var34] & 0x2C0120) == 0) {
                                                    var31++;
                                                }
                                            }
                                        }
                                        class661.field8969[class266.field3369] = var24.field9408;
                                        class250.field3219[class266.field3369] = var30;
                                        class545.field6858[class266.field3369] = var31;
                                        class266.field3369++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class469.field5796 != null) {
                class634.field8594.field3500 = 1;
                class530.field6699.method94(1024, (byte) 49, 64);
                for (int var16 = 0; var16 < class469.field5796.field6108; var16++) {
                    int var17 = class469.field5796.field6111[var16];
                    if ((var17 >> 28) == class67.field815.field8010) {
                        int var18 = ((var17 & 0xFFFD0F5) >> 14) - class227.field2938;
                        int var19 = (var17 & 0x3FFF) - class522.field6612;
                        if (var18 >= 0 && class85.field1090 > var18 && var19 >= 0 && var19 < class656.field8932) {
                            class703.field9847.method1904(new class319(var16), -67);
                        } else {
                            class663 var20 = class530.field6699.method93(class469.field5796.field6113[var16], (byte) 105);
                            if (var20.field9003 != null && (var20.field8995 + var18) >= 0 && class85.field1090 > var18 + var20.field8994 && (var19 + var20.field9016) >= 0 && class656.field8932 > var19 + var20.field8996) {
                                class703.field9847.method1904(new class319(var16), -113);
                            }
                        }
                    }
                }
                class530.field6699.method94(128, (byte) 49, 64);
                class634.field8594.field3500 = 2;
                class634.field8594.method1664(false);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B[BII)V")
    public final void method1683(byte arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = 93 % ((arg0 - 33) / 61);
        this.field3546.method1826(arg3, 29039, arg1, arg2 * this.field3558.method3173(arg3, 1252738544));
        field3553++;
        this.method1687(arg2, (byte) 127, this.field3546);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
    private final void method1684(byte arg0) {
        field3552++;
        if (!this.field3549) {
            return;
        }
        this.field3549 = false;
        byte[] var2 = this.field3545.field6693;
        byte[] var3 = this.field3558.field7744;
        int var4 = 0;
        int var5 = this.field3545.field6682;
        int var6 = this.field3545.field6682 * this.field3555 + this.field3559;
        if (arg0 >= -58) {
            this.method1683((byte) 13, null, -11, 20);
        }
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field3554 != null && this.field3560 == var4) {
            this.field3549 = false;
            return;
        }
        this.field3560 = var4;
        int var8 = this.field3555 * var5 + this.field3559;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field3545.field6682 - 128;
        }
        if (this.field3554 == null) {
            this.field3554 = new class109(this.field3558, 3553, 6406, 128, 128, false, this.field3558.field7744, 6406, false);
            this.field3554.method758(117, false, false);
            this.field3554.method1101(10240, true);
        } else {
            this.field3554.method765(128, 6406, 0, false, this.field3558.field7744, true, 0, 128, 0, 0);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
    public static void method1685(boolean arg0) {
        field3550 = null;
        field3548 = null;
        if (arg0) {
            method1682((byte) 50, null, -4);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public final void method1686(int arg0) {
        field3547++;
        this.method1687(this.field3556, (byte) 114, this.field3557);
        if (arg0 != 3287) {
            method1682((byte) -85, null, 27);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IBLwb;)V")
    private final void method1687(int arg0, byte arg1, class308 arg2) {
        field3551++;
        if (arg1 <= 107) {
            this.field3546 = null;
        }
        if (arg0 != 0) {
            this.method1684((byte) -122);
            this.field3558.method3194((byte) 75, this.field3554);
            this.field3558.method3129(arg2, 76, 0, arg0, 4);
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Ljaa;Lk;Lrk;IIIII)V")
    public class280(class576 arg0, class530 arg1, class30 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3555 = arg7;
        this.field3559 = arg6;
        this.field3545 = arg1;
        this.field3558 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field1685 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field388[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field3556 = var10;
        if (var10 <= 0) {
            this.field3554 = null;
        } else {
            class572 var14 = new class572(var10 * 2);
            if (this.field3558.field7643) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field1685 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field388[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method3080((byte) -54, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field1685 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field388[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method3060(-32768, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field3557 = this.field3558.method3150(var14.field7318, 5123, var14.field7313, (byte) 126, false);
            this.field3546 = new class512(this.field3558, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lba;IIII)Lqt;")
    public static final class595 method1688(class359 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -1) {
            method1688(null, 5, 93, 33, 20);
        }
        field3543++;
        return arg0 == null ? null : new class595(arg4, arg3, arg1, arg0.method2071(), arg0.method2061(), arg0.method2068(), arg0.method2084(), arg0.method2085(), arg0.method2089(), arg0.method2054());
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1689(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3548[var2] = (float) Math.sin((double) var2 * var0);
            field3550[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
