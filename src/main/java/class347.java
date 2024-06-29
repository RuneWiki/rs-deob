import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class347 extends class86 {

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method76(int arg0, boolean arg1) {
        super.field1200 = arg0;
        ++field4256;
        if (arg1) {
            field4257 = 17;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)I", line = 15)
    public final int method73(int arg0) {
        ++field4251;
        if (~super.field1203.method2983(-19236).method721(false) < -2) {
            return 4;
        } else {
            return arg0 != 0 ? 71 : 2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILha;Lbha;)V", line = 29)
    public static final void method2011(int arg0, int arg1, class570 arg2, class318 arg3) {
        ++field4250;
        if (class370.field4536 != null && arg1 <= arg3.field3962) {
            for (int var4 = 0; ~class370.field4536.length < ~var4; ++var4) {
                if (class370.field4536[var4] != -1000000 && (arg3.field3958[0] <= class370.field4536[var4] || ~arg3.field3958[1] >= ~class370.field4536[var4] || arg3.field3958[2] <= class370.field4536[var4] || ~arg3.field3958[3] >= ~class370.field4536[var4]) && (~class299.field3790[var4] <= ~arg3.field3960[0] || ~arg3.field3960[1] >= ~class299.field3790[var4] || arg3.field3960[2] <= class299.field3790[var4] || arg3.field3960[3] <= class299.field3790[var4]) && (~arg3.field3960[0] <= ~class376.field4595[var4] || ~class376.field4595[var4] >= ~arg3.field3960[1] || arg3.field3960[2] >= class376.field4595[var4] || ~arg3.field3960[3] <= ~class376.field4595[var4]) && (~class661.field8631[var4] <= ~arg3.field3968[0] || ~arg3.field3968[1] >= ~class661.field8631[var4] || class661.field8631[var4] >= arg3.field3968[2] || ~class661.field8631[var4] <= ~arg3.field3968[3]) && (class30.field272[var4] <= arg3.field3968[0] || class30.field272[var4] <= arg3.field3968[1] || arg3.field3968[2] >= class30.field272[var4] || ~arg3.field3968[3] <= ~class30.field272[var4])) {
                    return;
                }
            }
        }
        if (arg3.field3964 == 1) {
            int var5 = arg3.field3961 - class454.field5914 + class76.field1069;
            if (var5 >= 0 && var5 <= class76.field1069 - -class76.field1069) {
                int var6 = -class309.field3875 + arg3.field3957 + class76.field1069;
                if (var6 < 0) {
                    var6 = 0;
                } else if (~(class76.field1069 + class76.field1069) > ~var6) {
                    return;
                }
                int var7 = class76.field1069 + arg3.field3959 + -class309.field3875;
                if (~(class76.field1069 - -class76.field1069) > ~var7) {
                    var7 = class76.field1069 - -class76.field1069;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (~var7 <= ~var6) {
                    if (class145.field1873[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (-arg3.field3960[0] + class602.field7656);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class100.field1333)) {
                        if (class507.method2804(0, (byte) 92, arg3)) {
                            if (class507.method2804(1, (byte) 59, arg3)) {
                                if (class507.method2804(2, (byte) 82, arg3)) {
                                    if (class507.method2804(3, (byte) 72, arg3)) {
                                        class656.field8454[class216.field2943++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (arg3.field3964 == 2) {
            int var10 = class76.field1069 + arg3.field3957 - class309.field3875;
            if (var10 >= 0 && ~(class76.field1069 - -class76.field1069) <= ~var10) {
                int var11 = -class454.field5914 + arg3.field3961 - -class76.field1069;
                if (var11 < 0) {
                    var11 = 0;
                } else if (~var11 < ~(class76.field1069 + class76.field1069)) {
                    return;
                }
                int var12 = -class454.field5914 + arg3.field3963 + class76.field1069;
                if (class76.field1069 + class76.field1069 < var12) {
                    var12 = class76.field1069 + class76.field1069;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var11 <= var12) {
                    if (class145.field1873[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (-arg3.field3968[0] + class82.field1172);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!(var14 < (float) class100.field1333)) {
                        if (class507.method2804(0, (byte) 73, arg3)) {
                            if (class507.method2804(1, (byte) 118, arg3)) {
                                if (class507.method2804(2, (byte) 83, arg3)) {
                                    if (class507.method2804(3, (byte) 77, arg3)) {
                                        class656.field8454[class216.field2943++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (~arg3.field3964 != -17 && ~arg3.field3964 != -9) {
            if (arg0 != 0) {
                field4257 = -26;
            }
            if (arg3.field3964 == 4) {
                float var15 = (float) (arg3.field3958[0] + -class459.field5998);
                if (!((float) class734.field9969 >= var15)) {
                    int var16 = class76.field1069 + arg3.field3957 + -class309.field3875;
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (var16 > class76.field1069 + class76.field1069) {
                        return;
                    }
                    int var17 = class76.field1069 + arg3.field3959 + -class309.field3875;
                    if (~(class76.field1069 + class76.field1069) > ~var17) {
                        var17 = class76.field1069 + class76.field1069;
                    } else if (var17 < 0) {
                        return;
                    }
                    int var18 = -class454.field5914 + arg3.field3961 + class76.field1069;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (class76.field1069 - -class76.field1069 < var18) {
                        return;
                    }
                    int var19 = arg3.field3963 - (-class76.field1069 + class454.field5914);
                    if (class76.field1069 + class76.field1069 >= var19) {
                        if (var19 < 0) {
                            return;
                        }
                    } else {
                        var19 = class76.field1069 + class76.field1069;
                    }
                    boolean var20 = false;
                    label296: for (int var21 = var18; var21 <= var19; ++var21) {
                        for (int var22 = var16; ~var22 >= ~var17; ++var22) {
                            if (class145.field1873[var21][var22]) {
                                var20 = true;
                                break label296;
                            }
                        }
                    }
                    if (var20) {
                        if (class507.method2804(0, (byte) 96, arg3)) {
                            if (class507.method2804(1, (byte) 60, arg3)) {
                                if (class507.method2804(2, (byte) 60, arg3)) {
                                    if (class507.method2804(3, (byte) 91, arg3)) {
                                        class656.field8454[class216.field2943++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            int var23 = arg3.field3961 - class454.field5914 + class76.field1069;
            if (var23 >= 0 && ~var23 >= ~(class76.field1069 + class76.field1069)) {
                int var24 = -class309.field3875 + arg3.field3957 - -class76.field1069;
                if (~var24 <= -1 && ~var24 >= ~(class76.field1069 - -class76.field1069)) {
                    if (class145.field1873[var23][var24]) {
                        float var25 = (float) (-arg3.field3960[0] + class602.field7656);
                        if (var25 < 0.0F) {
                            var25 *= -1.0F;
                        }
                        float var26 = (float) (-arg3.field3968[0] + class82.field1172);
                        if (var26 < 0.0F) {
                            var26 *= -1.0F;
                        }
                        if (!((float) class100.field1333 > var25) || !(var26 < (float) class100.field1333)) {
                            if (class507.method2804(0, (byte) 97, arg3)) {
                                if (class507.method2804(1, (byte) 58, arg3)) {
                                    if (class507.method2804(2, (byte) 71, arg3)) {
                                        if (class507.method2804(3, (byte) 119, arg3)) {
                                            class656.field8454[class216.field2943++] = arg3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)I", line = 364)
    public final int method72(int arg0, int arg1) {
        ++field4254;
        if (arg1 != -2) {
            method2011(34, 98, (class570) null, (class318) null);
        }
        return 1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 377)
    public final void method71(byte arg0) {
        ++field4252;
        if (arg0 != -65) {
            method2012((int[]) null, (byte) 70, (String[]) null);
        }
        if (super.field1200 < 0 && super.field1200 > 4) {
            super.field1200 = this.method73(0);
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(ILsf;)V", line = 391)
    public class347(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([IB[Ljava/lang/String;)V", line = 395)
    public static final void method2012(int[] arg0, byte arg1, String[] arg2) {
        ++field4255;
        class793.method4338(arg0, (byte) -126, arg2, 0, arg2.length + -1);
        if (arg1 != 41) {
            method2012((int[]) null, (byte) 90, (String[]) null);
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lsf;)V", line = 406)
    public class347(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)I", line = 410)
    public final int method2013(boolean arg0) {
        ++field4253;
        if (arg0) {
            field4257 = -98;
        }
        return super.field1200;
    }
}
