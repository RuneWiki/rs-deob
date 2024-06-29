import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class231 {

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "Leda;")
    private class14 field3714 = new class14(64);

    @OriginalMember(owner = "client!qha", name = "k", descriptor = "I")
    public int field3721 = 0;

    @OriginalMember(owner = "client!qha", name = "i", descriptor = "Lla;")
    private class422 field3719;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!qha", name = "g", descriptor = "Ltm;")
    public static class334 field3717 = new class334(83, -1);

    @OriginalMember(owner = "client!qha", name = "o", descriptor = "J")
    public static long field3725 = 0L;

    @OriginalMember(owner = "client!qha", name = "m", descriptor = "I")
    public static int field3723 = 0;

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!qha", name = "h", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!qha", name = "j", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!qha", name = "n", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!qha", name = "p", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!qha", name = "l", descriptor = "[Lov;")
    public static class668[] field3722;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(IZII[IBZ[I[[[BII[II[IIZI[I)V", line = 3)
    public static final void method1601(int arg0, boolean arg1, int arg2, int arg3, int[] arg4, byte arg5, boolean arg6, int[] arg7, byte[][][] arg8, int arg9, int arg10, int[] arg11, int arg12, int[] arg13, int arg14, boolean arg15, int arg16, int[] arg17) {
        field3724++;
        if (class554.field7897 == -1) {
            return;
        }
        int[] var18 = class13.field119.method217();
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class554.field7897 == 1) {
            var24 = (int) ((double) class478.field6934 * (double) var22 / (double) class379.field5699);
            var23 = (int) ((double) class478.field6934 * (double) var21 / (double) class379.field5699);
        }
        if (!class245.field3947) {
            if (class554.field7897 == 1) {
                class368.method2352(-110);
            }
            int var25 = arg14 - class314.field4725;
            int var26 = arg3 - class40.field712;
            int var27 = arg16 - class252.field4007;
            int var28 = (int) (((double) var27 * class331.field4878 + (double) var25 * class570.field8088 + (double) var26 * class454.field6603) * (double) var23 / (double) arg9);
            int var29 = (int) (((double) var27 * class161.field2509 + (double) var25 * class535.field7672 + (double) var26 * class122.field1873) * (double) var24 / (double) arg9);
            double var30 = (double) var27 * class330.field4865 + (double) var25 * class230.field3708 + (double) var26 * class759.field10596;
            int var32 = class146.field2300 + var28 - class612.field8630;
            int var33 = class694.field9852 + var29 - class92.field1372;
            int var34 = class661.field9411 + var32;
            int var35 = class478.field6934 + var33;
            if (!(var32 < 0 || var33 < 0 || class208.field3477 < var34 || var35 > class379.field5699) || class554.field7897 == 2) {
                class26.field268 = var32;
                class560.field7941 = var33;
                if (class554.field7897 == 2) {
                    class680.field9613 = -var30;
                }
            } else if (var34 > 0 && var35 > 0 && var32 < class208.field3477 && var33 < class379.field5699) {
                int var36 = var32 - class146.field2300;
                int var37 = var33 - class694.field9852;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class554.field7897 == 0) {
                    var38 = var36;
                    var42 = class680.field9613 + var30;
                    var39 = var37;
                } else if (class554.field7897 == 1) {
                    var41 = var37 / class362.field5468;
                    var40 = var36 / class412.field6070;
                    var39 = class362.field5468 * var41;
                    var38 = class412.field6070 * var40;
                    var42 = (class680.field9613 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + (var37 * var37));
                }
                double var44 = -var42;
                int var46 = 0;
                int var47 = 0;
                int var48 = 0;
                int var49 = 0;
                int var50 = 0;
                int var51 = 0;
                int var52;
                int var53;
                int var54;
                int var55;
                if (var38 >= 0) {
                    var52 = class208.field3477 - var38;
                    var53 = 0;
                    var54 = var52;
                    var55 = var38;
                    if (class554.field7897 == 1) {
                        var50 = var40;
                        var48 = class390.field5830 - var40;
                    }
                } else {
                    var52 = class208.field3477 + var38;
                    var53 = -var38;
                    var54 = 0;
                    if (class554.field7897 == 1) {
                        var50 = -var40;
                        var48 = 0;
                    }
                    var55 = var53;
                }
                int var56;
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                if (var39 < 0) {
                    var56 = -var39;
                    var57 = 0;
                    var58 = class379.field5699 + var39;
                    var59 = var56;
                    var60 = var58;
                    if (class554.field7897 == 1) {
                        var47 = -var41;
                        var46 = 0;
                        var49 = var47;
                        var51 = class245.field3937 + var41;
                    }
                    var61 = var56;
                } else {
                    var56 = 0;
                    var58 = class379.field5699 - var39;
                    var60 = var58;
                    var57 = var58;
                    var59 = var39;
                    if (class554.field7897 == 1) {
                        var49 = 0;
                        var46 = class245.field3937 - var41;
                        var47 = var41;
                        var51 = var46;
                    }
                    var61 = 0;
                }
                class564 var62 = class666.field9451.field7;
                for (class48 var63 = (class48) var62.method3272(-123); var63 != null; var63 = (class48) var62.method3274(false)) {
                    class385[] var69 = var63.field795;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class385 var72 = var69[var71];
                        int var73 = var72.field5764;
                        int var74 = var72.field5766;
                        int var75 = var72.field5767;
                        int var76 = var72.field5765;
                        int var77;
                        var72.field5766 = var77 = var74 - var39;
                        int var78 = var72.field5769;
                        int var79;
                        var72.field5765 = var79 = var76 - var39;
                        int var80;
                        var72.field5767 = var80 = var75 - var38;
                        int var81;
                        var72.field5764 = var81 = var73 - var38;
                        if (var70) {
                            int var82 = (var81 < var80 ? var81 : var80) - var78;
                            if (var82 <= class208.field3477) {
                                int var83 = (var77 < var79 ? var77 : var79) - var78;
                                if (var83 <= class379.field5699) {
                                    int var84 = (var80 > var81 ? var80 : var81) + var78;
                                    if (var84 >= 0) {
                                        int var85 = var78 + (var79 > var77 ? var79 : var77);
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method3610(-25057);
                        class59.method577(var63, (byte) -77);
                    }
                }
                if (class554.field7897 == 0) {
                    class13.field119.method1340(class548.field7817);
                }
                class13.field119.method1290(-var38, -var39);
                class13.field119.method1278(var53, var56, var52, var58, var44);
                class475.method2886(true, class680.field9613 + var44);
                class602.field8517 = class680.field9613 + var44;
                if (class554.field7897 == 1) {
                    class436.field6374 = var24;
                    class173.field2958 = var23;
                    class171.field2940 = var20 - class92.field1372 - var39;
                    class369.field5617 = var19 - class612.field8630 - var38;
                    class13.field119.method288(class369.field5617, class171.field2940, class173.field2958, class436.field6374);
                } else {
                    class173.field2958 = var23;
                    class369.field5617 = var19 + class146.field2300 - class612.field8630 - var38;
                    class436.field6374 = var24;
                    class171.field2940 = var20 + class694.field9852 - class92.field1372 - var39;
                    class13.field119.method288(class369.field5617, class171.field2940, class173.field2958, class436.field6374);
                }
                class520.method3099(class666.field9451);
                if (var59 > 0) {
                    class13.field119.method240(0, var57, class208.field3477, var57 + var59);
                    class13.field119.method1287();
                    class13.field119.method1328(class76.field1114);
                    class262.method1745(arg0, arg14, arg3, arg16, arg8, arg13, arg7, arg11, arg17, arg4, arg12, arg5, arg10, arg2, arg15, arg6, arg9, 1, false);
                }
                if (var55 > 0) {
                    class13.field119.method240(var54, var61, var54 + var55, var60 + var61);
                    class13.field119.method1287();
                    class13.field119.method1328(class76.field1114);
                    class262.method1745(arg0, arg14, arg3, arg16, arg8, arg13, arg7, arg11, arg17, arg4, arg12, arg5, arg10, arg2, arg15, arg6, arg9, 1, false);
                }
                class13.field119.method374();
                class595.method3408();
                if (class554.field7897 == 0) {
                    class13.field119.method1274();
                }
                class92.field1372 += var39;
                class612.field8630 += var38;
                class680.field9613 += var44;
                class26.field268 = var28 + class146.field2300 - class612.field8630;
                class560.field7941 = var29 + class694.field9852 - class92.field1372;
                if (class554.field7897 == 1) {
                    class84.field1241 += var40;
                    class285.field4381 += var41;
                    for (int var64 = 0; var64 < class245.field3937; var64++) {
                        int var65 = class590.method3390(class245.field3937, 31019, class285.field4381 + var64) * class390.field5830;
                        for (int var66 = 0; var66 < class390.field5830; var66++) {
                            int var67 = class590.method3390(class390.field5830, 31019, class84.field1241 + var66) + var65;
                            boolean var68 = var46 <= var64 && var64 < var46 + var47 || var49 <= var64 && var64 < (var49 + var51) && var48 <= var66 && var66 < var48 + var50;
                            class70.field1087[var67].method56(class412.field6070 * var66, class362.field5468 * var64, class412.field6070, class362.field5468, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class245.field3947 = true;
            }
        }
        if (class245.field3947) {
            class92.field1372 = 0;
            class560.field7941 = class694.field9852;
            class40.field712 = arg3;
            class314.field4725 = arg14;
            class612.field8630 = 0;
            class680.field9613 = 0.0D;
            class26.field268 = class146.field2300;
            class252.field4007 = arg16;
            if (class554.field7897 == 0) {
                class13.field119.method1340(class548.field7817);
            }
            class13.field119.method374();
            class13.field119.method1287();
            class13.field119.method1328(class76.field1114);
            class377.field5673.method668(class314.field4725, class40.field712, class252.field4007, class607.field8569, class478.field6939, class221.field3592);
            class13.field119.method244(class377.field5673);
            if (class554.field7897 == 1) {
                class173.field2958 = var23;
                class369.field5617 = var19;
                class436.field6374 = var24;
                class171.field2940 = var20;
                class13.field119.method288(class369.field5617, class171.field2940, class173.field2958, class436.field6374);
            } else {
                class173.field2958 = var23;
                class171.field2940 = var20 + class694.field9852;
                class436.field6374 = var24;
                class369.field5617 = class146.field2300 + var19;
                class13.field119.method288(class369.field5617, class171.field2940, class173.field2958, class436.field6374);
            }
            class602.field8517 = 0.0D;
            class666.field9451.method3(32767);
            class520.method3099(class666.field9451);
            class262.method1745(arg0, arg14, arg3, arg16, arg8, arg13, arg7, arg11, arg17, arg4, arg12, arg5, arg10, arg2, arg15, arg6, arg9, 1, false);
            class595.method3408();
            class245.field3947 = false;
            if (class554.field7897 == 0) {
                class13.field119.method1274();
            }
            if (class554.field7897 == 1) {
                class719.method3969(27247);
            }
        }
        if (class554.field7897 == 0) {
            class548.field7817.method54(class26.field268, class560.field7941, class661.field9411, class478.field6934, 0, 0, true, true);
        }
        class418.field6149++;
        class475.method2886(arg1, class680.field9613);
        class293.field4498 = class680.field9613;
        if (class554.field7897 == 0 || class554.field7897 == 2) {
            if (class554.field7897 == 2) {
                class13.field119.method1328(class76.field1114);
                class13.field119.method1287();
            }
            class118.field1816 = var23;
            class259.field4049 = var20 + class694.field9852 - class92.field1372 - class560.field7941;
            class59.field928 = var24;
            class391.field5841 = class146.field2300 + var19 - (class612.field8630 + class26.field268);
            class13.field119.method288(class391.field5841, class259.field4049, class118.field1816, class59.field928);
        } else if (class554.field7897 == 1) {
            class118.field1816 = var23;
            class259.field4049 = var20 - class92.field1372;
            class391.field5841 = var19 - class612.field8630;
            class59.field928 = var24;
            class13.field119.method288(class391.field5841, class259.field4049, class118.field1816, class59.field928);
            class13.field119.method240(class26.field268, class560.field7941, class661.field9411 + class26.field268, class560.field7941 + class478.field6934);
        }
        class262.method1745(arg0, arg14, arg3, arg16, arg8, arg13, arg7, arg11, arg17, arg4, arg12, arg5, arg10, arg2, arg15, arg6, arg9, class554.field7897 == 2 ? 0 : 2, class554.field7897 == 1);
        class13.field119.method374();
        class13.field119.method288(var19, var20, var21, var22);
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lfea;[[BI)V", line = 442)
    public static final void method1602(class460 arg0, byte[][] arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.field1963; var3++) {
            class493.method2998((byte) -123);
            for (int var4 = 0; var4 < (class191.field3229 >> 3); var4++) {
                for (int var5 = 0; var5 < (class314.field4720 >> 3); var5++) {
                    int var6 = class36.field365[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3079C5D) >> 24;
                        if (!arg0.field1968 || var7 == 0) {
                            int var8 = (var6 & 0x6) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FFB) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class205.field3445.length; var12++) {
                                if (class205.field3445[var12] == var11 && arg1[var12] != null) {
                                    arg0.method2819((var10 & 0x7) * 8, var7, -1, var8, var3, arg1[var12], class364.field5573, (var9 & 0x7) * 8, var5 * 8, class247.field3958, var4 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == -5808) {
            field3715++;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)V", line = 520)
    public final void method1603(byte arg0) {
        field3713++;
        class14 var2 = this.field3714;
        synchronized (this.field3714) {
            if (arg0 < 68) {
                this.field3714 = null;
            }
            this.field3714.method71((byte) 44);
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)V", line = 535)
    public final void method1604(int arg0) {
        class14 var2 = this.field3714;
        synchronized (this.field3714) {
            this.field3714.method76(100);
            if (arg0 <= 62) {
                this.method1604(-111);
            }
        }
        field3716++;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "([Lwaa;Lrs;B)Lun;", line = 548)
    public static final class144 method1605(class621[] arg0, class166 arg1, byte arg2) {
        field3712++;
        if (arg2 >= -107) {
            field3717 = null;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field8726 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field8726);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class164.field2532, 0);
        if (class164.field2532[0] == 0) {
            if (class164.field2532[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class164.field2532, 1);
            if (class164.field2532[1] > 1) {
                byte[] var7 = new byte[class164.field2532[1]];
                OpenGL.glGetInfoLogARB(var4, class164.field2532[1], class164.field2532, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class164.field2532[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field8726);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class144(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V", line = 618)
    public static void method1606(int arg0) {
        field3717 = null;
        if (arg0 != -1) {
            method1601(85, false, -41, -88, null, (byte) -36, false, null, null, 104, -82, null, 31, null, 112, false, 96, null);
        }
        field3722 = null;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)Lmw;", line = 629)
    public final class658 method1607(int arg0, int arg1) {
        field3726++;
        class14 var3 = this.field3714;
        class658 var4;
        synchronized (this.field3714) {
            var4 = (class658) this.field3714.method80((byte) -108, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field3719;
        byte[] var6;
        synchronized (this.field3719) {
            var6 = this.field3719.method2624(0, 4, arg1);
        }
        class658 var7 = new class658();
        var7.field9370 = this;
        var7.field9368 = arg1;
        if (var6 != null) {
            var7.method3700(new class301(var6), 108);
        }
        var7.method3702(-11);
        class14 var8 = this.field3714;
        synchronized (this.field3714) {
            this.field3714.method67((long) arg1, var7, -6772);
            if (arg0 < 26) {
                field3722 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Z)I", line = 663)
    public static final int method1608(boolean arg0) {
        field3718++;
        if (class48.field798 == 0) {
            class499.field7239.method3026(new class555("jaclib"), false);
            if (class499.field7239.method3033(5).method1161((byte) 123) != 100) {
                return 1;
            }
            if (!((class555) class499.field7239.method3033(5)).method3236(-35)) {
                class52.field834.method3678((byte) 93);
            }
            class48.field798 = 1;
        }
        if (class48.field798 == 1) {
            class691.field9805 = class499.method3025(false);
            class499.field7227.method3026(new class199(class686.field9693), arg0);
            class499.field7240.method3026(new class555("jaggl"), false);
            class499.field7241.method3026(new class555("jagdx"), arg0);
            class499.field7242.method3026(new class555("jagmisc"), false);
            class499.field7243.method3026(new class555("sw3d"), arg0);
            class499.field7244.method3026(new class555("hw3d"), false);
            class499.field7245.method3026(new class555("jagtheora"), arg0);
            class499.field7246.method3026(new class199(class172.field2951), arg0);
            class499.field7247.method3026(new class199(class695.field9862), arg0);
            class499.field7248.method3026(new class199(class564.field7992), arg0);
            class499.field7249.method3026(new class199(class86.field1267), arg0);
            class499.field7250.method3026(new class199(class68.field1065), arg0);
            class499.field7251.method3026(new class199(class17.field182), arg0);
            class499.field7252.method3026(new class199(class666.field9462), false);
            class499.field7253.method3026(new class199(class383.field5748), arg0);
            class499.field7254.method3026(new class199(class602.field8511), arg0);
            class499.field7255.method3026(new class199(class92.field1375), arg0);
            class499.field7256.method3026(new class199(class714.field10034), false);
            class499.field7257.method3026(new class199(class735.field10364), arg0);
            class499.field7258.method3026(new class199(class371.field5635), false);
            class499.field7259.method3026(new class199(class386.field5772), false);
            class499.field7260.method3026(new class153(class236.field3799, "huffman"), false);
            class499.field7261.method3026(new class199(class460.field6677), false);
            class499.field7262.method3026(new class199(class403.field5986), false);
            class499.field7263.method3026(new class199(class312.field4704), false);
            class499.field7264.method3026(new class624(class147.field2306, "details"), false);
            for (int var1 = 0; var1 < class691.field9805.length; var1++) {
                if (class691.field9805[var1].method3033(5) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class499[] var3 = class691.field9805;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class499 var5 = var3[var4];
                int var6 = var5.method3029((byte) -82);
                int var7 = var5.method3033(5).method1161((byte) 123);
                var2 += var6 * var7 / 100;
            }
            class432.field6337 = var2;
            class48.field798 = 2;
        }
        if (class691.field9805 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class499[] var11 = class691.field9805;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class499 var16 = var11[var12];
            int var17 = var16.method3029((byte) -93);
            int var18 = var16.method3033(5).method1161((byte) 123);
            if (var18 < 100) {
                var10 = false;
            }
            var8 += var17;
            var9 += var17 * var18 / 100;
        }
        if (var10) {
            if (!((class555) class499.field7242.method3033(5)).method3236(-63)) {
                class52.field834.method3682(true);
            }
            if (!((class555) class499.field7245.method3033(5)).method3236(-96)) {
                class364.field5568 = class52.field834.method3688((byte) -6);
            }
            class691.field9805 = null;
        }
        int var13 = var8 - class432.field6337;
        int var14 = var9 - class432.field6337;
        int var15 = var13 <= 0 ? 100 : var14 * 100 / var13;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        if (arg0) {
            method1602(null, null, 54);
        }
        return var15;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(BI)V", line = 812)
    public final void method1609(byte arg0, int arg1) {
        field3720++;
        class14 var3 = this.field3714;
        synchronized (this.field3714) {
            if (arg0 >= -41) {
                method1605(null, null, (byte) -72);
            }
            this.field3714.method68(-16878, arg1);
        }
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Lcr;ILla;)V", line = 847)
    public class231(class292 arg0, int arg1, class422 arg2) {
        this.field3719 = arg2;
        this.field3711 = this.field3719.method2615(0, 4);
    }
}
