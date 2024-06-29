import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class285 extends class270 {

    @OriginalMember(owner = "client!io", name = "T", descriptor = "I")
    private int field4276 = 4096;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    private int field4269 = 16;

    @OriginalMember(owner = "client!io", name = "O", descriptor = "I")
    private int field4271 = 2000;

    @OriginalMember(owner = "client!io", name = "U", descriptor = "I")
    private int field4277 = 0;

    @OriginalMember(owner = "client!io", name = "S", descriptor = "I")
    private int field4275 = 0;

    @OriginalMember(owner = "client!io", name = "V", descriptor = "I")
    public static int field4278 = -1;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!io", name = "R", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!io", name = "W", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!io", name = "X", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!io", name = "Y", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "Lcj;")
    public static class181 field4272;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V", line = 5)
    public static final void method2011(int arg0, int arg1) {
        ++field4270;
        if (arg1 != -1) {
            method2015(-45);
        }
        class120.field1872.method104(arg0, (byte) -34);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BLec;I)V", line = 21)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        ++field4264;
        if (arg0 == 108) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (arg2 == 4) {
                                this.field4276 = arg1.method320((byte) -87);
                            }
                        } else {
                            this.field4275 = arg1.method320((byte) -87);
                        }
                    } else {
                        this.field4269 = arg1.method271((byte) 111);
                    }
                } else {
                    this.field4271 = arg1.method320((byte) -87);
                }
            } else {
                this.field4277 = arg1.method271((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V", line = 83)
    public final void method83(boolean arg0) {
        class164.method1269(0);
        ++field4268;
        if (!arg0) {
            method2018((byte) -110);
        }
    }

    @OriginalMember(owner = "client!io", name = "e", descriptor = "(B)Ljava/lang/String;", line = 94)
    public static final String method2012(byte arg0) {
        ++field4280;
        String var1 = "www";
        if (class360.field5124 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class170.field2531 != null) {
            var2 = "/p=" + class170.field2531;
        }
        if (arg0 <= 2) {
            method2016(112, (class242) null, (class198) null, (class90) null, 103, (byte) -121);
        }
        return ~class336.field4809 != -2 ? "http://" + var1 + ".runescape.com/l=" + class202.field2945 + "/a=" + class351.field4986 + var2 + "/" : "http://" + var1 + ".stellardawn.com/l=" + class202.field2945 + "/a=" + class351.field4986 + var2 + "/";
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZILbc;)V", line = 121)
    public static final void method2013(boolean arg0, int arg1, class283 arg2) {
        if (!arg0) {
            if (class390.field5654) {
                class390.field5654 = false;
                arg1 = 0;
            }
            ++field4281;
            if (class409.field5972 == null || !class409.field5972.method2005(32, arg2)) {
                class409.field5972 = arg2;
                class281.field4213 = class10.method63(-21149);
                class230.field3365 = arg1;
                class190.field2823 = arg1;
                if (~class190.field2823 == -1) {
                    class109.method954((byte) -94);
                    return;
                }
                class88.field1409 = class152.field2321;
                class128.field2089 = class435.field6343;
                class158.field2417 = class113.field1822;
                class441.field6413 = class37.field545;
                class162.field2454 = class185.field2721;
                class30.field443 = class257.field3711;
                class158.field2404 = class157.field2383;
                class428.field6202 = class84.field1369;
                class66.field1054 = class376.field5328;
                class50.field802 = class52.field852;
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V", line = 163)
    public class285() {
        super(0, true);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)[I", line = 167)
    public final int[] method81(byte arg0, int arg1) {
        ++field4265;
        if (arg0 <= 26) {
            field4272 = null;
        }
        int[] var3 = super.field4053.method396(arg1, -78);
        if (super.field4053.field815) {
            int var4 = this.field4276 >> 1;
            int[][] var5 = super.field4053.method394(0);
            Random var6 = new Random((long) this.field4277);
            for (int var7 = 0; this.field4271 > var7; ++var7) {
                int var8 = ~this.field4276 < -1 ? this.field4275 + class11.method74(this.field4276, 16384, var6) - var4 : this.field4275;
                int var9 = 255 & var8 >> 4;
                int var10 = class11.method74(class161.field2445, 16384, var6);
                int var11 = class11.method74(class364.field5188, 16384, var6);
                int var12 = (class133.field2145[var9] * this.field4269 >> 12) + var10;
                int var13 = (class42.field640[var9] * this.field4269 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || var14 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class11.method74(4096, 16384, var6) >> 2);
                    int var27 = ~var13 < ~var11 ? 1 : -1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = var26 - -((var28 - var10) * var25) + 1024;
                        int var30 = var28 & class267.field3997;
                        int var31 = class30.field442 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var24 -= var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 299)
    public static final boolean method2014(byte arg0, String arg1) {
        int var2 = -101 / ((-28 - arg0) / 58);
        ++field4274;
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; ~class119.field1866 < ~var3; ++var3) {
                if (arg1.equalsIgnoreCase(class390.field5636[var3])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class267.field4005[var3])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!io", name = "f", descriptor = "(I)I", line = 329)
    public static final int method2015(int arg0) {
        ++field4273;
        if (arg0 != 6071) {
            return 104;
        } else if (class315.field4585 != null) {
            return 3;
        } else {
            return class28.field414 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILqa;Lrr;Lja;IB)Z", line = 363)
    public static final boolean method2016(int arg0, class242 arg1, class198 arg2, class90 arg3, int arg4, byte arg5) {
        ++field4267;
        int var6 = Integer.MAX_VALUE;
        int var7 = -23 / ((arg5 - -48) / 53);
        int var8 = Integer.MIN_VALUE;
        int var9 = Integer.MAX_VALUE;
        int var10 = Integer.MIN_VALUE;
        if (arg1.field3488 != null) {
            var8 = class272.field4090 - -((arg1.field3492 + arg2.field2896 - class272.field4098) * (-class272.field4090 + class272.field4095) / (-class272.field4098 + class272.field4086));
            var10 = -((arg1.field3501 + arg2.field2900 - class272.field4104) * (-class272.field4087 + class272.field4101) / (-class272.field4104 + class272.field4091)) + class272.field4101;
            var9 = -((arg2.field2900 - class272.field4104 + arg1.field3487) * (-class272.field4087 + class272.field4101) / (-class272.field4104 + class272.field4091)) + class272.field4101;
            var6 = class272.field4090 - -((class272.field4095 - class272.field4090) * (-class272.field4098 + arg1.field3516 + arg2.field2896) / (-class272.field4098 + class272.field4086));
        }
        class421 var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (~arg1.field3514 != 0) {
            if (arg2.field2886 && ~arg1.field3505 != 0) {
                var11 = arg1.method1772((byte) 121, arg3, true);
            } else {
                var11 = arg1.method1772((byte) 78, arg3, false);
            }
            if (var11 != null) {
                var12 = arg2.field2898 - (var11.method1461() + 1 >> 1);
                if (~var6 < ~var12) {
                    var6 = var12;
                }
                var13 = arg2.field2898 + (1 + var11.method1461() >> 1);
                var14 = arg2.field2899 - (1 + var11.method1463() >> 1);
                if (~var13 < ~var8) {
                    var8 = var13;
                }
                if (var14 < var9) {
                    var9 = var14;
                }
                var15 = arg2.field2899 + (1 + var11.method1463() >> 1);
                if (var15 > var10) {
                    var10 = var15;
                }
            }
        }
        class304 var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg1.field3483 != null) {
            var16 = class22.method155(arg1.field3519, -1);
            if (var16 != null) {
                var17 = class221.field3294.method1440(class74.field1273, (int[]) null, (class421[]) null, -105, arg1.field3483);
                int var24 = arg2.field2899;
                if (var11 != null) {
                    var18 = var24 - ((var11.method1463() >> 1) + var17 * var16.method2081());
                } else {
                    var18 = var24 - var17 * var16.method2085() / 2;
                }
                for (int var25 = 0; ~var25 > ~var17; ++var25) {
                    String var26 = class74.field1273[var25];
                    if (~var25 > ~(var17 + -1)) {
                        var26 = var26.substring(0, var26.length() + -4);
                    }
                    int var27 = var16.method2080(var26);
                    if (var19 < var27) {
                        var19 = var27;
                    }
                }
                var20 = -(var19 / 2) + arg2.field2898 - -arg4;
                var21 = var19 / 2 + arg4 + arg2.field2898;
                if (~var20 > ~var6) {
                    var6 = var20;
                }
                var22 = arg0 + var18;
                if (var21 > var8) {
                    var8 = var21;
                }
                if (~var9 < ~var22) {
                    var9 = var22;
                }
                var23 = var16.method2081() * var17 + var18 + arg0;
                if (~var10 > ~var23) {
                    var10 = var23;
                }
            }
        }
        if (~var8 <= ~class272.field4090 && var6 <= class272.field4095 && class272.field4087 <= var10 && class272.field4101 >= var9) {
            if (arg1.field3488 != null) {
                int[] var28 = new int[arg1.field3488.length];
                for (int var29 = 0; ~(var28.length / 2) < ~var29; ++var29) {
                    int var31 = arg1.field3488[var29 * 2] + arg2.field2896;
                    int var32 = arg1.field3488[var29 * 2 - -1] + arg2.field2900;
                    var28[var29 * 2] = class272.field4090 - -((-class272.field4098 + var31) * (-class272.field4090 + class272.field4095) / (-class272.field4098 + class272.field4086));
                    var28[var29 * 2 - -1] = -((-class272.field4104 + var32) * (-class272.field4087 + class272.field4101) / (-class272.field4104 + class272.field4091)) + class272.field4101;
                }
                class173.method1322(arg3, var28, arg1.field3521);
                for (int var30 = 0; var30 < var28.length / 2 + -1; ++var30) {
                    arg3.method723(15281, var28[(var30 - -1) * 2 - -1], var28[var30 * 2 - -1], var28[var30 * 2], var28[(var30 - -1) * 2], arg1.field3512);
                }
                arg3.method723(15281, var28[1], var28[var28.length - 1], var28[var28.length - 2], var28[0], arg1.field3512);
            }
            if (var11 != null) {
                if (~class351.field4992 < -1 && (class218.field3234 != -1 && ~class218.field3234 == ~arg2.field2883 || ~class333.field4785 != 0 && ~class333.field4785 == ~arg1.field3528)) {
                    int var33;
                    if (~class319.field4609 >= -51) {
                        var33 = class319.field4609 * 2;
                    } else {
                        var33 = -(class319.field4609 * 2) + 200;
                    }
                    int var34 = 16776960 | var33 << 24;
                    arg3.method733(arg2.field2899, 4805, var11.method1469() / 2 + 7, arg2.field2898, var34);
                    arg3.method733(arg2.field2899, 4805, 5 + var11.method1469() / 2, arg2.field2898, var34);
                    arg3.method733(arg2.field2899, 4805, var11.method1469() / 2 - -3, arg2.field2898, var34);
                    arg3.method733(arg2.field2899, 4805, var11.method1469() / 2 + 1, arg2.field2898, var34);
                    arg3.method733(arg2.field2899, 4805, var11.method1469() / 2, arg2.field2898, var34);
                }
                var11.method2645(arg2.field2898 - (var11.method1461() >> 1), arg2.field2899 + -(var11.method1463() >> 1));
            }
            if (arg1.field3483 != null && var16 != null) {
                class162.method1266(var17, arg3, var16, arg1, var19, -78, var18, arg2);
            }
            if (arg1.field3514 != -1 || arg1.field3483 != null) {
                class307 var35 = new class307(arg2);
                var35.field4477 = var22;
                var35.field4482 = var12;
                var35.field4491 = var15;
                var35.field4486 = var13;
                var35.field4479 = var21;
                var35.field4480 = var20;
                var35.field4481 = var23;
                var35.field4483 = var14;
                class356.field5064.method148((byte) 96, var35);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLmb;)Lmb;", line = 582)
    public static final class258 method2017(boolean arg0, class258 arg1) {
        if (arg0) {
            method2017(true, (class258) null);
        }
        ++field4279;
        class258 var2 = client.method1819(arg1);
        if (var2 == null) {
            var2 = arg1.field3844;
        }
        return var2;
    }

    @OriginalMember(owner = "client!io", name = "f", descriptor = "(B)V", line = 611)
    public static void method2018(byte arg0) {
        if (arg0 >= -51) {
            field4278 = -43;
        }
        field4272 = null;
    }
}
