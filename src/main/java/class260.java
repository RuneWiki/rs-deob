import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class260 extends class45 {

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    private int field3781 = 4096;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    private int field3779 = 409;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
    private int field3780 = 4096;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "[I")
    private int[] field3775 = new int[3];

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    private int field3783 = 4096;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "Z")
    public static boolean field3774 = true;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "Liv;")
    public static class64 field3771 = new class64(102, 8);

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public static int field3785 = 0;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "Lbu;")
    public static class17 field3788;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "[[[B")
    public static byte[][][] field3784;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
    public static final void method1681(int arg0) {
        if (arg0 != 128) {
            field3784 = null;
        }
        for (int var1 = 0; class452.field6759 > var1; ++var1) {
            int var2 = class88.field1543[var1];
            class255 var3 = class34.field668[var2];
            int var4 = class92.field1573.method1063((byte) 104);
            if (~(var4 & 32) != -1) {
                var4 += class92.field1573.method1063((byte) -15) << 8;
            }
            if ((512 & var4) != 0) {
                var3.field7622 = class92.field1573.method1090(arg0 + -31779);
                var3.field7640 = class92.field1573.method1100(111);
                var3.field7596 = class92.field1573.method1090(arg0 ^ -31523);
                var3.field7601 = (byte) class92.field1573.method1120((byte) -115);
                var3.field7636 = class531.field7821 + class92.field1573.method1074((byte) -121);
                var3.field7641 = class531.field7821 - -class92.field1573.method1069((byte) -46);
            }
            if (~(var4 & 2048) != -1) {
                var3.field3657 = class92.field1573.method1116(128);
                var3.field3663 = class92.field1573.method1079(arg0 + -255);
            }
            if ((var4 & 2) != 0) {
                if (var3.field3677.method416(-24707)) {
                    class66.method553(var3, -867418649);
                }
                var3.method1648(37, class61.field1070.method502(class92.field1573.method1069((byte) -106), -8));
                var3.method3095(var3.field3677.field807, (byte) -110);
                var3.field7638 = var3.field3677.field768 << 3;
                if (var3.field3677.method416(-24707)) {
                    class228.method1490(var3.field6232, 0, (byte) 117, (class79) null, var3.field7694[0], (class256) null, var3, var3.field7692[0]);
                }
            }
            if ((var4 & 4) != 0) {
                var3.field7602 = class92.field1573.method1074((byte) -25);
                if (~var3.field7602 == -65536) {
                    var3.field7602 = -1;
                }
            }
            if (~(var4 & 64) != -1) {
                int var5 = class92.field1573.method1119(-81);
                int var6 = class92.field1573.method1120((byte) -63);
                var3.method3084(var5, arg0 ^ 16714, class531.field7821, var6);
            }
            if ((var4 & 8192) != 0) {
                var3.field7648 = class92.field1573.method1093(15);
                var3.field7615 = class92.field1573.method1111((byte) -35);
                var3.field7654 = class92.field1573.method1093(15);
                var3.field7672 = class92.field1573.method1111((byte) -48);
                var3.field7611 = class92.field1573.method1074((byte) -107) + class531.field7821;
                var3.field7677 = class92.field1573.method1074((byte) -66) + class531.field7821;
                var3.field7671 = class92.field1573.method1063((byte) 107);
                var3.field7648 += var3.field7692[0];
                var3.field7687 = 0;
                var3.field7654 += var3.field7692[0];
                var3.field7615 += var3.field7694[0];
                var3.field7690 = 1;
                var3.field7672 += var3.field7694[0];
            }
            if (~(var4 & 16) != -1) {
                int var7 = class92.field1573.method1116(128);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class92.field1573.method1063((byte) -115);
                class124.method949(var3, var7, 112, var8);
            }
            if (~(256 & var4) != -1) {
                int var9 = class92.field1573.method1063((byte) -100);
                int[] var10 = new int[var9];
                int[] var11 = new int[var9];
                int[] var12 = new int[var9];
                for (int var13 = 0; ~var9 < ~var13; ++var13) {
                    int var14 = class92.field1573.method1079(-3);
                    if (~var14 == -65536) {
                        var14 = -1;
                    }
                    var10[var13] = var14;
                    var11[var13] = class92.field1573.method1063((byte) 110);
                    var12[var13] = class92.field1573.method1069((byte) -40);
                }
                class132.method984((byte) -81, var11, var3, var12, var10);
            }
            if ((var4 & 128) != 0) {
                var3.field7657 = class92.field1573.method1101((byte) -119);
                var3.field7606 = 100;
            }
            if ((8 & var4) != 0) {
                int var15 = class92.field1573.method1074((byte) -107);
                int var16 = class92.field1573.method1077(1148025000);
                if (~var15 == -65536) {
                    var15 = -1;
                }
                int var17 = class92.field1573.method1118(-77);
                var3.method3082((byte) -90, var17, var15, var16, false);
            }
            if ((var4 & 1024) != 0) {
                int var18 = class92.field1573.method1074((byte) -53);
                if (~var18 == -65536) {
                    var18 = -1;
                }
                int var19 = class92.field1573.method1113((byte) -70);
                int var20 = class92.field1573.method1063((byte) 116);
                var3.method3082((byte) -90, var20, var18, var19, true);
            }
            if (~(var4 & 1) != -1) {
                int var21 = class92.field1573.method1119(arg0 ^ -247);
                int var22 = class92.field1573.method1065((byte) -125);
                var3.method3084(var21, 16842, class531.field7821, var22);
                var3.field7616 = class531.field7821 + 300;
                var3.field7652 = class92.field1573.method1118(arg0 ^ -181);
            }
            if (~(4096 & var4) != -1) {
                int var23 = class92.field1573.method1069((byte) -23);
                var3.field7660 = class92.field1573.method1120((byte) -16);
                var3.field7633 = class92.field1573.method1063((byte) 122);
                var3.field7668 = (32768 & var23) != 0;
                var3.field7609 = 32767 & var23;
                var3.field7605 = class531.field7821 + var3.field7609 + var3.field7660;
            }
        }
        ++field3786;
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V")
    public static void method1682(int arg0) {
        if (arg0 > -82) {
            field3785 = 100;
        }
        field3771 = null;
        field3784 = null;
        field3788 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILqa;IIIIIZLc;IIILkf;II)Lc;")
    public static final class121 method1683(int arg0, class162 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class121 arg8, int arg9, int arg10, int arg11, class165 arg12, int arg13, int arg14) {
        ++field3773;
        if (arg8 == null) {
            return null;
        } else {
            int var15 = 2055;
            if (arg0 != -17411) {
                field3771 = null;
            }
            if (arg12 != null) {
                int var16 = var15 | arg12.method1215((byte) -34, false, arg9, -1);
                var15 = var16 & -513;
            }
            long var17 = ((long) arg10 << 32) + (long) (arg3 - -(arg4 << 16) - -(arg14 << 24)) - -((long) arg5 << 48);
            class55 var19 = class487.field7215;
            class121 var20;
            synchronized (class487.field7215) {
                var20 = (class121) class487.field7215.method494(0, var17);
            }
            if (var20 == null || arg1.method255(var20.method889(), var15) != 0) {
                if (var20 != null) {
                    var15 = arg1.method280(var15, var20.method889());
                }
                byte var21;
                if (arg3 != 1) {
                    if (~arg3 != -3) {
                        if (arg3 == 3) {
                            var21 = 15;
                        } else if (~arg3 == -5) {
                            var21 = 18;
                        } else {
                            var21 = 21;
                        }
                    } else {
                        var21 = 12;
                    }
                } else {
                    var21 = 9;
                }
                byte var22 = 3;
                int[] var23 = new int[] { 64, 96, 128 };
                class380 var24 = new class380(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
                int var25 = var24.method2364(0, 0, 0, -96);
                int[][] var26 = new int[var22][var21];
                for (int var27 = 0; var22 > var27; ++var27) {
                    int var28 = var23[var27];
                    int var29 = var23[var27];
                    for (int var30 = 0; var21 > var30; ++var30) {
                        int var31 = (var30 << 14) / var21;
                        int var32 = class528.field7783[var31] * var28 >> 15;
                        int var33 = class528.field7786[var31] * var29 >> 15;
                        var26[var27][var30] = var24.method2364(var32, 0, var33, 21);
                    }
                }
                for (int var34 = 0; var22 > var34; ++var34) {
                    int var35 = (var34 * 256 + 128) / var22;
                    int var36 = -var35 + 256;
                    byte var37 = (byte) (arg4 * var36 + arg14 * var35 >> 8);
                    short var38 = (short) ((229376 & (arg5 & 896) * var35 + (896 & arg10) * var36) + ((64512 & arg5) * var35 + (arg10 & 64512) * var36 & 16515072) + ((127 & arg5) * var35 + (127 & arg10) * var36 & 32512) >> 8);
                    for (int var39 = 0; var21 > var39; ++var39) {
                        if (~var34 == -1) {
                            var24.method2358(var26[0][var39], var37, var38, (byte) 1, var25, 124, (short) -1, var26[0][(var39 + 1) % var21], (byte) -1);
                        } else {
                            var24.method2358(var26[var34][(var39 + 1) % var21], var37, var38, (byte) 1, var26[var34 + -1][var39], arg0 + 17304, (short) -1, var26[var34 + -1][(var39 + 1) % var21], (byte) -1);
                            var24.method2358(var26[var34][var39], var37, var38, (byte) 1, var26[var34 + -1][var39], 127, (short) -1, var26[var34][(var39 + 1) % var21], (byte) -1);
                        }
                    }
                }
                var20 = arg1.method265(var24, var15, class399.field6019, 64, 768);
                class55 var40 = class487.field7215;
                synchronized (class487.field7215) {
                    class487.field7215.method485(var17, (byte) -125, var20);
                }
            }
            int var41 = (arg3 << 6) - 1;
            int var42 = -var41;
            int var43 = -var41;
            int var44 = var41;
            int var45 = var41;
            if (arg7) {
                if (~arg2 < -9217 && ~arg2 > -15361) {
                    var44 = var41 + 128;
                }
                if (arg2 > 5120 && arg2 < 11264) {
                    var45 = var41 + 128;
                }
                if (~arg2 < -1025 && ~arg2 > -7169) {
                    var42 -= 128;
                }
                if (~arg2 < -13313 || arg2 < 3072) {
                    var43 -= 128;
                }
            }
            int var46 = arg8.method907();
            int var47 = arg8.method911();
            int var48 = arg8.method931();
            int var49 = arg8.method921();
            if (~var42 < ~var46) {
                var46 = var42;
            }
            if (~var43 < ~var48) {
                var48 = var43;
            }
            if (~var47 < ~var44) {
                var47 = var44;
            }
            if (var45 < var49) {
                var49 = var45;
            }
            class291 var50 = null;
            if (arg12 != null) {
                int var51 = arg12.field2539[arg9];
                var50 = class431.field6419.method1129(var51 >> 16, (byte) 100);
                arg9 = var51 & 65535;
            }
            class121 var52;
            if (var50 == null) {
                var52 = var20.method938((byte) 3, var15, true);
                var52.method925(-var46 + var47 >> 1, 128, var49 - var48 >> 1);
                var52.method923(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            } else {
                var52 = var20.method938((byte) 3, var15, true);
                var52.method925(-var46 + var47 >> 1, 128, -var48 + var49 >> 1);
                var52.method923(var46 + var47 >> 1, 0, var48 - -var49 >> 1);
                var52.method937(var50, arg9, -10988);
            }
            if (~arg6 != -1) {
                var52.method922(arg6);
            }
            if (arg11 != 0) {
                var52.method895(arg11);
            }
            if (arg13 != 0) {
                var52.method923(0, arg13, 0);
            }
            return var52;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class260() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(III)Z")
    public static final boolean method1684(int arg0, int arg1, int arg2) {
        ++field3777;
        if (arg0 != 9881) {
            method1685((char) 65417, -127);
        }
        return ~(1408 & arg1) != -1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(CI)Z")
    public static final boolean method1685(char arg0, int arg1) {
        ++field3776;
        if (arg1 <= 55) {
            return true;
        } else {
            return arg0 >= '0' && arg0 <= '9';
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static final void method1686(boolean arg0) {
        class448.field6722 = new class208(class49.field891.method2180(client.field2870, 29491), "", class245.field3518, 1001, -1, 0L, 0, 0, arg0, false);
        ++field3782;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)[[I")
    public final int[][] method49(int arg0, int arg1) {
        ++field3787;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (arg0 != 8) {
            field3785 = 75;
        }
        if (super.field833.field1888) {
            int[][] var4 = this.method437(0, arg1, 69);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class259.field3768; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field3775[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field3779) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field3775[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field3779) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3775[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field3779 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field3780 * var12 >> 12;
                            var9[var11] = this.field3781 * var14 >> 12;
                            var10[var11] = this.field3783 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg1 != -26471) {
            method1686(true);
        }
        ++field3772;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            int var5 = arg0.method1085(117);
                            this.field3775[0] = class207.method1405(267386880, var5 << 4);
                            this.field3775[1] = class207.method1405(var5, 65280) >> 4;
                            this.field3775[2] = class207.method1405(var5 >> 12, 0);
                        }
                    } else {
                        this.field3780 = arg0.method1069((byte) -98);
                    }
                } else {
                    this.field3781 = arg0.method1069((byte) -120);
                }
            } else {
                this.field3783 = arg0.method1069((byte) -66);
            }
        } else {
            this.field3779 = arg0.method1069((byte) -60);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[B)Ldj;")
    public static final class227 method1687(byte arg0, byte[] arg1) {
        ++field3778;
        class227 var2 = new class227();
        class145 var3 = new class145(arg1);
        var3.field2289 = var3.field2270.length - 2;
        int var4 = var3.method1069((byte) -109);
        int var5 = var3.field2270.length + -var4 - 2 - 12;
        if (arg0 != 46) {
            field3771 = null;
        }
        var3.field2289 = var5;
        int var6 = var3.method1070(arg0 + -32433);
        var2.field3235 = var3.method1069((byte) -28);
        var2.field3238 = var3.method1069((byte) -19);
        var2.field3239 = var3.method1069((byte) -57);
        var2.field3233 = var3.method1069((byte) -22);
        int var7 = var3.method1063((byte) -51);
        if (var7 > 0) {
            var2.field3232 = new class20[var7];
            for (int var8 = 0; var7 > var8; ++var8) {
                int var9 = var3.method1069((byte) -58);
                class20 var10 = new class20(class51.method464(1905326856, var9));
                var2.field3232[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1070(arg0 + -32433);
                    int var12 = var3.method1070(-32387);
                    var10.method166(new class451(var12), (long) var11, 60);
                }
            }
        }
        var3.field2289 = 0;
        var2.field3231 = var3.method1112((byte) -89);
        var2.field3228 = new int[var6];
        var2.field3234 = new String[var6];
        var2.field3229 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field2289) {
            int var14 = var3.method1069((byte) -73);
            if (~var14 != -4) {
                if (~var14 > -101 && ~var14 != -22 && var14 != 38 && var14 != 39) {
                    var2.field3229[var13] = var3.method1070(-32387);
                } else {
                    var2.field3229[var13] = var3.method1063((byte) 127);
                }
            } else {
                var2.field3234[var13] = var3.method1101((byte) -91).intern();
            }
            var2.field3228[var13++] = var14;
        }
        return var2;
    }
}
