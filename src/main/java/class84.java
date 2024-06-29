import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class84 extends class695 {

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "Z")
    private boolean field1133 = false;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "Z")
    private boolean field1137;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "[Ltda;")
    private class342[] field1134;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lfc;)V")
    public class84(class575 arg0) {
        super(arg0);
        if (arg0.field7761) {
            this.field1137 = ~arg0.field7683 > -4;
            int var2 = !this.field1137 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (~var14 == -2) {
                            var15 = var13;
                        } else if (~var14 == -3) {
                            var15 = var12;
                        } else if (~var14 != -4) {
                            if (~var14 == -5) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field1134 = new class342[3];
            this.field1134[0] = super.field9493.method204((byte) -98, 64, var4, false);
            this.field1134[1] = super.field9493.method204((byte) -78, 64, var5, false);
            this.field1134[2] = super.field9493.method204((byte) -56, 64, var3, false);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V")
    public final void method489(int arg0, int arg1, int arg2) {
        if (arg2 >= 69) {
            if (this.field1133) {
                super.field9493.method3088((byte) 91, 1);
                super.field9493.method3091(true, this.field1134[arg0 + -1]);
                super.field9493.method3088((byte) 91, 0);
            }
            ++field1136;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)V")
    public final void method495(int arg0, boolean arg1) {
        super.field9493.method3105(class510.field6687, true, class219.field2875);
        if (arg0 == 1) {
            ++field1138;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method641(int arg0, long arg1) {
        ++field1132;
        if (~arg1 < -1L && ~arg1 > -6582952005840035282L) {
            if (~(arg1 % (long) arg0) == -1L) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg1 != -1L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    var6.append(class555.field7269[(int) (-(arg1 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZB)V")
    public final void method498(boolean arg0, byte arg1) {
        if (arg1 > -82) {
            this.field1134 = null;
        }
        ++field1131;
        if (this.field1134 != null && arg0) {
            super.field9493.method3088((byte) 91, 1);
            super.field9493.method183((byte) 46, class553.field7241);
            class131 var3 = super.field9493.method3125((byte) 122);
            var3.method147(1024);
            super.field9493.method3140(30604, class234.field3135);
            if (!this.field1137) {
                super.field9493.method3105(class219.field2875, true, class510.field6687);
                super.field9493.method3115(0, 0, class243.field3260);
                super.field9493.method3088((byte) 91, 2);
                super.field9493.method3105(class510.field6687, true, class600.field8091);
                super.field9493.method3115(0, 0, class243.field3260);
                super.field9493.method206(false, class243.field3260, true, 1, 23798);
                super.field9493.method3143(4, class697.field9582, 0);
                super.field9493.method3091(true, super.field9493.field7696);
            } else {
                super.field9493.method3105(class510.field6687, true, class600.field8091);
                super.field9493.method206(false, class61.field833, true, 0, 23798);
                super.field9493.method3143(4, class697.field9582, 0);
            }
            super.field9493.method3088((byte) 91, 0);
            this.field1133 = true;
        } else {
            super.field9493.method3143(4, class697.field9582, 0);
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
    public final void method491(int arg0) {
        if (arg0 < 38) {
            method642((byte) -16, -52, -20, (class700) null, (class43) null, (class576) null);
        }
        ++field1141;
        if (!this.field1133) {
            super.field9493.method3143(4, class61.field833, 0);
        } else {
            super.field9493.method3088((byte) 91, 1);
            super.field9493.method3091(true, (class391) null);
            super.field9493.method183((byte) 33, class141.field1863);
            super.field9493.method3114(15);
            if (!this.field1137) {
                super.field9493.method3105(class219.field2875, true, class219.field2875);
                super.field9493.method3115(0, 0, class61.field833);
                super.field9493.method3088((byte) 91, 2);
                super.field9493.method3105(class219.field2875, true, class219.field2875);
                super.field9493.method3115(0, 0, class61.field833);
                super.field9493.method3115(1, 0, class243.field3260);
                super.field9493.method3143(4, class61.field833, 0);
                super.field9493.method3091(true, (class391) null);
            } else {
                super.field9493.method3105(class219.field2875, true, class219.field2875);
                super.field9493.method3115(0, 0, class61.field833);
                super.field9493.method3143(4, class61.field833, 0);
            }
            super.field9493.method3088((byte) 91, 0);
            this.field1133 = false;
        }
        super.field9493.method3105(class219.field2875, true, class219.field2875);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BIILkq;Loa;Ldt;)Z")
    public static final boolean method642(byte arg0, int arg1, int arg2, class700 arg3, class43 arg4, class576 arg5) {
        ++field1139;
        int var6 = Integer.MAX_VALUE;
        if (arg0 >= -3) {
            return false;
        } else {
            int var7 = Integer.MIN_VALUE;
            int var8 = Integer.MAX_VALUE;
            int var9 = Integer.MIN_VALUE;
            if (arg5.field7805 != null) {
                var9 = -((-class706.field9864 + arg3.field9759 + arg5.field7828) * (-class706.field9854 + class706.field9855) / (-class706.field9864 + class706.field9859)) + class706.field9855;
                var6 = (-class706.field9863 + arg5.field7808 + arg3.field9760) * (-class706.field9849 + class706.field9847) / (class706.field9856 - class706.field9863) + class706.field9849;
                var8 = -((class706.field9855 - class706.field9854) * (arg3.field9759 + arg5.field7846 + -class706.field9864) / (class706.field9859 - class706.field9864)) + class706.field9855;
                var7 = (-class706.field9863 + arg3.field9760 + arg5.field7829) * (-class706.field9849 + class706.field9847) / (class706.field9856 - class706.field9863) + class706.field9849;
            }
            class511 var10 = null;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            if (arg5.field7816 != -1) {
                if (arg3.field9766 && ~arg5.field7818 != 0) {
                    var10 = arg5.method3155(-95, arg4, true);
                } else {
                    var10 = arg5.method3155(-72, arg4, false);
                }
                if (var10 != null) {
                    var11 = arg3.field9764 - (1 + var10.method602() >> 1);
                    var12 = arg3.field9764 - -(1 + var10.method602() >> 1);
                    if (var11 < var6) {
                        var6 = var11;
                    }
                    var13 = arg3.field9767 - (1 + var10.method595() >> 1);
                    if (~var12 < ~var7) {
                        var7 = var12;
                    }
                    var14 = arg3.field9767 + (var10.method595() - -1 >> 1);
                    if (~var8 < ~var13) {
                        var8 = var13;
                    }
                    if (var14 > var9) {
                        var9 = var14;
                    }
                }
            }
            class10 var15 = null;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            int var20 = 0;
            int var21 = 0;
            int var22 = 0;
            if (arg5.field7841 != null) {
                var15 = class604.method3279(1, arg5.field7821);
                if (var15 != null) {
                    var16 = class47.field665.method2906((byte) 125, (int[]) null, (class511[]) null, class415.field5338, arg5.field7841);
                    int var23 = arg3.field9767;
                    if (var10 == null) {
                        var17 = var23 - var16 * var15.method49() / 2;
                    } else {
                        var17 = var23 - ((var10.method595() >> 1) - -(var15.method51() * var16));
                    }
                    for (int var24 = 0; var16 > var24; ++var24) {
                        String var25 = class415.field5338[var24];
                        if (var24 < var16 + -1) {
                            var25 = var25.substring(0, -4 + var25.length());
                        }
                        int var26 = var15.method52(var25);
                        if (~var18 > ~var26) {
                            var18 = var26;
                        }
                    }
                    var19 = -(var18 / 2) + arg3.field9764 + arg2;
                    if (~var19 > ~var6) {
                        var6 = var19;
                    }
                    var20 = var18 / 2 + arg3.field9764 + arg2;
                    if (~var7 > ~var20) {
                        var7 = var20;
                    }
                    var21 = var17 - -arg1;
                    var22 = var17 - (-(var16 * var15.method51()) - arg1);
                    if (~var8 < ~var21) {
                        var8 = var21;
                    }
                    if (var22 > var9) {
                        var9 = var22;
                    }
                }
            }
            if (~class706.field9849 >= ~var7 && ~var6 >= ~class706.field9847 && var9 >= class706.field9854 && ~class706.field9855 <= ~var8) {
                if (arg5.field7805 != null) {
                    int[] var27 = new int[arg5.field7805.length];
                    for (int var28 = 0; var27.length / 2 > var28; ++var28) {
                        int var30 = arg5.field7805[var28 * 2] + arg3.field9760;
                        int var31 = arg5.field7805[var28 * 2 - -1] + arg3.field9759;
                        var27[var28 * 2] = class706.field9849 - -((-class706.field9863 + var30) * (-class706.field9849 + class706.field9847) / (-class706.field9863 + class706.field9856));
                        var27[var28 * 2 - -1] = -((-class706.field9864 + var31) * (-class706.field9854 + class706.field9855) / (class706.field9859 - class706.field9864)) + class706.field9855;
                    }
                    class551.method2915(arg4, var27, arg5.field7826);
                    for (int var29 = 0; ~var29 > ~(var27.length / 2 + -1); ++var29) {
                        arg4.method337(var27[var29 * 2], var27[var29 * 2 + 2], var27[(var29 - -1) * 2 + 1], arg5.field7836, var27[var29 * 2 + 1], -11);
                    }
                    arg4.method337(var27[var27.length + -2], var27[0], var27[1], arg5.field7836, var27[var27.length + -1], 105);
                }
                if (var10 != null) {
                    if (class414.field5328 > 0 && (~class215.field2773 != 0 && class215.field2773 == arg3.field9761 || ~class513.field6721 != 0 && class513.field6721 == arg5.field7831)) {
                        int var32;
                        if (class273.field3599 > 50) {
                            var32 = 200 - class273.field3599 * 2;
                        } else {
                            var32 = class273.field3599 * 2;
                        }
                        int var33 = var32 << 24 | 16776960;
                        arg4.method362(arg3.field9764, arg3.field9767, true, 7 + var10.method608() / 2, var33);
                        arg4.method362(arg3.field9764, arg3.field9767, true, var10.method608() / 2 + 5, var33);
                        arg4.method362(arg3.field9764, arg3.field9767, true, var10.method608() / 2 + 3, var33);
                        arg4.method362(arg3.field9764, arg3.field9767, true, var10.method608() / 2 + 1, var33);
                        arg4.method362(arg3.field9764, arg3.field9767, true, var10.method608() / 2, var33);
                    }
                    var10.method2751(arg3.field9764 + -(var10.method602() >> 1), arg3.field9767 + -(var10.method595() >> 1));
                }
                if (arg5.field7841 != null && var15 != null) {
                    class46.method430(var18, var15, arg4, var16, arg3, var17, arg5, 22384);
                }
                if (arg5.field7816 != -1 || arg5.field7841 != null) {
                    class123 var34 = new class123(arg3);
                    var34.field1603 = var22;
                    var34.field1591 = var21;
                    var34.field1593 = var19;
                    var34.field1597 = var14;
                    var34.field1595 = var11;
                    var34.field1594 = var12;
                    var34.field1590 = var13;
                    var34.field1598 = var20;
                    class453.field5907.method2087(var34, 34);
                }
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lnm;ZI)V")
    public final void method488(class391 arg0, boolean arg1, int arg2) {
        ++field1135;
        super.field9493.method3091(true, arg0);
        super.field9493.method3072((byte) -57, arg2);
        if (arg1) {
            this.field1133 = true;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)Z")
    public final boolean method494(boolean arg0) {
        ++field1140;
        return arg0;
    }
}
