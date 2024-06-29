import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class492 extends class478 {

    @OriginalMember(owner = "client!bo", name = "Q", descriptor = "Z")
    public boolean field7511 = false;

    @OriginalMember(owner = "client!bo", name = "S", descriptor = "Z")
    public boolean field7513 = false;

    @OriginalMember(owner = "client!bo", name = "V", descriptor = "Z")
    public static boolean field7516 = false;

    @OriginalMember(owner = "client!bo", name = "X", descriptor = "[I")
    public static int[] field7518 = new int[32];

    @OriginalMember(owner = "client!bo", name = "bb", descriptor = "I")
    public static int field7522 = 0;

    @OriginalMember(owner = "client!bo", name = "O", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!bo", name = "R", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!bo", name = "T", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!bo", name = "U", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!bo", name = "W", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!bo", name = "Y", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!bo", name = "Z", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!bo", name = "ab", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!bo", name = "cb", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 3)
    public static void method2956(int arg0) {
        field7518 = null;
        if (arg0 != 32) {
            method2956(-83);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Z", line = 13)
    public final boolean method2957(int arg0, int arg1) {
        ++field7512;
        return ~arg0 == arg1 ? super.field6914 : true;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lae;I)V", line = 26)
    private final void method2958(class156 arg0, int arg1) {
        ++field7509;
        if (~(arg0.field2041.length + -arg0.field2018) <= -2) {
            int var3 = arg0.method941((byte) 125);
            if (var3 >= 0 && ~var3 >= -17) {
                byte var4;
                if (~var3 != -17) {
                    if (~var3 != -16) {
                        if (var3 == 14) {
                            var4 = 36;
                        } else if (~var3 != -14) {
                            if (var3 == 12) {
                                var4 = 34;
                            } else if (var3 == 11) {
                                var4 = 33;
                            } else if (~var3 != -11) {
                                if (~var3 != -10) {
                                    if (~var3 != -9) {
                                        if (~var3 != -8) {
                                            if (~var3 == -7) {
                                                var4 = 28;
                                            } else if (~var3 == -6) {
                                                var4 = 28;
                                            } else if (~var3 != -5) {
                                                if (~var3 != -4) {
                                                    if (var3 == 2) {
                                                        var4 = 22;
                                                    } else if (var3 == 1) {
                                                        var4 = 23;
                                                    } else {
                                                        var4 = 19;
                                                    }
                                                } else {
                                                    var4 = 23;
                                                }
                                            } else {
                                                var4 = 24;
                                            }
                                        } else {
                                            var4 = 29;
                                        }
                                    } else {
                                        var4 = 30;
                                    }
                                } else {
                                    var4 = 31;
                                }
                            } else {
                                var4 = 32;
                            }
                        } else {
                            var4 = 35;
                        }
                    } else {
                        var4 = 37;
                    }
                } else {
                    var4 = 38;
                }
                if (~var4 >= ~(arg0.field2041.length + -arg0.field2018)) {
                    super.field6913 = arg0.method941((byte) 123);
                    if (arg1 <= super.field6913) {
                        if (~super.field6913 < -5) {
                            super.field6913 = 4;
                        }
                    } else {
                        super.field6913 = 1;
                    }
                    this.method2963(~arg0.method941((byte) 126) == -2, -118);
                    super.field6880 = arg0.method941((byte) 126) == 1;
                    super.field6892 = ~arg0.method941((byte) 123) == -2;
                    super.field6875 = arg0.method941((byte) 127) == 1;
                    super.field6909 = ~arg0.method941((byte) 125) != -2 ? 0 : 1;
                    super.field6896 = arg0.method941((byte) 126) == 1;
                    super.field6900 = ~arg0.method941((byte) 124) == -2;
                    super.field6890 = ~arg0.method941((byte) 124) == -2;
                    super.field6901 = arg0.method941((byte) 125);
                    if (~super.field6901 < -3) {
                        super.field6901 = 2;
                    }
                    if (~var3 <= -3) {
                        super.field6886 = ~arg0.method941((byte) 123) == -2;
                    } else {
                        super.field6886 = ~arg0.method941((byte) 124) == -2;
                        arg0.method941((byte) 123);
                    }
                    super.field6911 = ~arg0.method941((byte) 127) == -2;
                    super.field6907 = arg0.method941((byte) 123) == 1;
                    super.field6902 = arg0.method941((byte) 124);
                    if (~super.field6902 < -3) {
                        super.field6902 = 2;
                    }
                    super.field6905 = super.field6902;
                    super.field6884 = ~arg0.method941((byte) 124) == -2;
                    super.field6912 = arg0.method941((byte) 126);
                    if (super.field6912 > 127) {
                        super.field6912 = 127;
                    }
                    super.field6899 = arg0.method941((byte) 127);
                    super.field6903 = arg0.method941((byte) 125);
                    if (~super.field6903 < -128) {
                        super.field6903 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field6893 = arg0.method993((byte) -107);
                        super.field6878 = arg0.method993((byte) -85);
                    }
                    if (~var3 <= -4 && var3 < 6) {
                        arg0.method941((byte) 127);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method941((byte) 125);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (~class315.field4620 > -97) {
                            var5 = 0;
                        }
                        class322.method1932(var5, 255);
                    }
                    if (var3 >= 5) {
                        super.field6876 = arg0.method950(186);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field6877 = var6 = arg0.method941((byte) 126);
                    }
                    if (~super.field6877 != -2 && ~super.field6877 != -3) {
                        super.field6877 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field6894 = ~arg0.method941((byte) 125) == -2;
                    }
                    if (~var3 <= -9) {
                        super.field6908 = arg0.method941((byte) 123) == 1;
                    }
                    if (var3 >= 9) {
                        super.field6904 = arg0.method941((byte) 127);
                    }
                    if (~super.field6904 > -1 || super.field6904 > class71.method482(22730, class315.field4620)) {
                        super.field6904 = 0;
                    }
                    if (var3 >= 10) {
                        super.field6898 = ~arg0.method941((byte) 125) != -1;
                    }
                    if (~var3 <= -12) {
                        super.field6897 = arg0.method941((byte) 125) != 0;
                    }
                    if (var3 >= 12) {
                        super.field6909 = arg0.method941((byte) 127);
                    }
                    if (~super.field6909 > -1 || super.field6909 > 2) {
                        super.field6909 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field6888 = ~arg0.method941((byte) 123) == -2;
                    }
                    if (var3 < 14) {
                        if (~var6 == -1) {
                            super.field6895 = 2;
                        } else {
                            super.field6895 = 1;
                        }
                    } else {
                        super.field6895 = arg0.method941((byte) 123);
                    }
                    if (super.field6895 < 0 || super.field6895 > 3) {
                        super.field6895 = 2;
                    }
                    if (var3 >= 15) {
                        super.field6881 = arg0.method941((byte) 127);
                        if (~super.field6881 > -1 || super.field6881 > 4) {
                            super.field6881 = ~class331.field4811 != -2 ? 4 : 2;
                        }
                    }
                    if (var3 >= 16) {
                        super.field6887 = ~arg0.method941((byte) 126) != -2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)I", line = 265)
    public final int method2959(int arg0, int arg1) {
        ++field7514;
        if (this.field7513) {
            return 0;
        } else if (!this.method2961(arg1, 29)) {
            return 1;
        } else if (arg0 != 0) {
            return -85;
        } else {
            return !super.field6880 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILqn;)V", line = 289)
    public final void method2960(int arg0, class44 arg1) {
        ++field7519;
        class353 var3 = null;
        try {
            class439 var4 = arg1.method343(14, "");
            while (~var4.field6417 == -1) {
                class322.method1935(true, 1L);
            }
            if (var4.field6417 == 1) {
                var3 = (class353) var4.field6416;
                class156 var5 = this.method2962(25311);
                var3.method2140(var5.field2018, 1, 0, var5.field2041);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg0 <= 66) {
                field7522 = -72;
            }
            if (var3 != null) {
                var3.method2141(-92);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(II)Z", line = 327)
    public final boolean method2961(int arg0, int arg1) {
        ++field7517;
        if (arg1 != 29) {
            field7522 = -12;
        }
        return arg0 == 0 && !this.field7511 ? super.field6914 : true;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lqn;)V", line = 351)
    public class492(class44 arg0) {
        super.field6913 = 3;
        this.method2963(true, -98);
        super.field6900 = true;
        super.field6901 = 2;
        super.field6892 = true;
        super.field6893 = 0;
        super.field6886 = true;
        super.field6878 = 0;
        super.field6907 = true;
        super.field6896 = true;
        super.field6911 = true;
        super.field6905 = 0;
        super.field6890 = true;
        super.field6884 = true;
        super.field6909 = 1;
        super.field6875 = true;
        super.field6912 = 127;
        super.field6899 = 255;
        super.field6903 = 127;
        super.field6880 = true;
        super.field6902 = 0;
        if (~class315.field4620 > -97) {
            class322.method1932(0, 255);
        } else {
            class322.method1932(2, 255);
        }
        super.field6876 = 0;
        super.field6908 = false;
        super.field6877 = 2;
        super.field6881 = ~class331.field4811 == -2 ? 2 : 4;
        super.field6895 = 2;
        super.field6898 = false;
        super.field6904 = 0;
        super.field6888 = true;
        super.field6894 = false;
        super.field6897 = true;
        class353 var2 = null;
        try {
            class439 var3 = arg0.method343(14, "");
            while (~var3.field6417 == -1) {
                class322.method1935(true, 1L);
            }
            if (var3.field6417 == 1) {
                var2 = (class353) var3.field6416;
                byte[] var4 = new byte[(int) var2.method2142((byte) -17)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2139(var4, var4.length - var5, var5, (byte) 19);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method2958(new class156(var4), 1);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2141(-91);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Lae;", line = 433)
    public final class156 method2962(int arg0) {
        ++field7523;
        class156 var2 = new class156(39);
        var2.method947(arg0 ^ -25254, 16);
        var2.method947(arg0 ^ -25264, super.field6913);
        var2.method947(-44, !super.field6914 ? 0 : 1);
        var2.method947(arg0 + -25372, !super.field6880 ? 0 : 1);
        var2.method947(-126, !super.field6892 ? 0 : 1);
        var2.method947(arg0 ^ -25238, !super.field6875 ? 0 : 1);
        var2.method947(arg0 + -25370, 0);
        var2.method947(-58, !super.field6896 ? 0 : 1);
        var2.method947(-128, !super.field6900 ? 0 : 1);
        var2.method947(-51, !super.field6890 ? 0 : 1);
        var2.method947(-84, super.field6901);
        var2.method947(-70, super.field6886 ? 1 : 0);
        var2.method947(-88, !super.field6911 ? 0 : 1);
        var2.method947(-71, !super.field6907 ? 0 : 1);
        var2.method947(-58, super.field6902);
        var2.method947(arg0 ^ -25276, !super.field6884 ? 0 : 1);
        var2.method947(arg0 + -25393, super.field6912);
        var2.method947(-89, super.field6899);
        var2.method947(arg0 + -25365, super.field6903);
        var2.method961(super.field6893, 1608339368);
        var2.method961(super.field6878, 1608339368);
        var2.method947(-47, class466.method2727(57));
        var2.method969(19869, super.field6876);
        var2.method947(-69, super.field6877);
        var2.method947(arg0 + -25425, !super.field6894 ? 0 : 1);
        if (arg0 != 25311) {
            this.method2962(102);
        }
        var2.method947(arg0 + -25388, !super.field6908 ? 0 : 1);
        var2.method947(arg0 ^ -25319, super.field6904);
        var2.method947(-96, super.field6898 ? 1 : 0);
        var2.method947(-104, !super.field6897 ? 0 : 1);
        var2.method947(-48, super.field6909);
        var2.method947(-102, !super.field6888 ? 0 : 1);
        var2.method947(arg0 ^ -25342, super.field6895);
        var2.method947(arg0 ^ -25253, super.field6881);
        var2.method947(-65, super.field6887 ? 0 : 1);
        return var2;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V", line = 482)
    public final void method2963(boolean arg0, int arg1) {
        if (arg1 < -83) {
            ++field7510;
            super.field6914 = arg0;
            if (class114.field1471 != null) {
                class114.field1471.method2135(!this.method2961(class293.field4174, 29), 126);
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Leq;ILts;)V", line = 502)
    public static final void method2964(class134 arg0, int arg1, class356 arg2) {
        int var3 = 31 / ((-38 - arg1) / 53);
        ++field7515;
        boolean var4 = class405.field5947.method1152(arg2.field5173, arg2.field5222, 16131, !arg2.field5286 ? null : class415.field6145.field4599, arg0, arg2.field5174, arg2.field5132 | -16777216, arg2.field5216) == null;
        if (var4) {
            class51.field763.method2086((byte) -124, new class68(arg2.field5174, arg2.field5222, arg2.field5216, arg2.field5132 | -16777216, arg2.field5173, arg2.field5286));
        }
    }
}
