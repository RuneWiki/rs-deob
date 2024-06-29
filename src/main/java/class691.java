import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class691 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[I")
    public static int[] field9749 = new int[1000];

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field9751;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field9752;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field9753;

    @OriginalMember(owner = "client!td", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field9752++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 11)
    public static final void method3825(byte arg0) {
        class553.method3100(class377.field5414, 0);
        field9750++;
        class436.field6020++;
        if (class648.field9191 && class172.field2156) {
            int var1 = class592.field8107.method268((byte) -90);
            int var2 = class592.field8107.method269((byte) -25);
            int var3 = var2 - class223.field2895;
            int var4 = var1 - class363.field5238;
            if (var4 < class497.field6716) {
                var4 = class497.field6716;
            }
            if ((class497.field6716 + class278.field3766.field2438) < (var4 + class377.field5414.field2438)) {
                var4 = class497.field6716 + class278.field3766.field2438 - class377.field5414.field2438;
            }
            if (arg0 == 5) {
                if (class632.field8579 > var3) {
                    var3 = class632.field8579;
                }
                if (class377.field5414.field2371 + var3 > class632.field8579 + class278.field3766.field2371) {
                    var3 = class632.field8579 + class278.field3766.field2371 - class377.field5414.field2371;
                }
                int var5 = var4 + class278.field3766.field2315 - class497.field6716;
                int var6 = var3 + class278.field3766.field2431 - class632.field8579;
                if (class592.field8107.method2173((byte) 121)) {
                    if (class377.field5414.field2311 < class436.field6020) {
                        int var8 = var4 - class104.field1267;
                        int var9 = var3 - class384.field5574;
                        if (var8 > class377.field5414.field2358 || var8 < (-class377.field5414.field2358) || class377.field5414.field2358 < var9 || var9 < -class377.field5414.field2358) {
                            class299.field3998 = true;
                        }
                    }
                    if (class377.field5414.field2444 != null && class299.field3998) {
                        class425 var10 = new class425();
                        var10.field5913 = class377.field5414.field2444;
                        var10.field5903 = var6;
                        var10.field5904 = var5;
                        var10.field5911 = class377.field5414;
                        class317.method2051(var10);
                    }
                } else {
                    if (class299.field3998) {
                        class497.method2800((byte) -107);
                        if (class377.field5414.field2331 != null) {
                            class425 var7 = new class425();
                            var7.field5903 = var6;
                            var7.field5916 = class570.field7894;
                            var7.field5904 = var5;
                            var7.field5911 = class377.field5414;
                            var7.field5913 = class377.field5414.field2331;
                            class317.method2051(var7);
                        }
                        if (class570.field7894 != null && client.method1407(class377.field5414) != null) {
                            class492.method2785(class377.field5414, class570.field7894, (byte) 70);
                        }
                    } else if ((class291.field3890 == 1 || class292.method1729(131)) && class179.field2242 > 2) {
                        class294.method1741(class384.field5574 + class223.field2895, (byte) -8, class363.field5238 + class104.field1267);
                    } else if (class554.method3110(false)) {
                        class294.method1741(class384.field5574 + class223.field2895, (byte) -8, class363.field5238 + class104.field1267);
                    }
                    class377.field5414 = null;
                }
            }
        } else if (class436.field6020 > 1) {
            class377.field5414 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 142)
    public static void method3826(byte arg0) {
        if (arg0 != 47) {
            method3827(-77, -56, 14, null, true);
        }
        field9749 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILrq;Z)V", line = 154)
    public static final void method3827(int arg0, int arg1, int arg2, class39 arg3, boolean arg4) {
        field9753++;
        class334 var5 = arg3.method242(5832);
        int var6 = arg3.field488 - arg3.field421.field2095 & 0x3FFF;
        if (arg1 == -1) {
            if (var6 != 0 || arg3.field498 > 25) {
                if (arg0 < 0 && var5.field4878 != -1) {
                    arg3.field454 = var5.field4878;
                } else if (arg0 <= 0 || var5.field4890 == -1) {
                    arg3.field454 = var5.field4913;
                } else {
                    arg3.field454 = var5.field4890;
                }
                arg3.field456 = false;
            } else if (!arg3.field456 || !var5.method2132(arg3.field454, (byte) -115)) {
                arg3.field454 = var5.method2134(2733);
                arg3.field456 = arg3.field454 != -1;
            }
        } else if (arg3.field430 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class47.field639[arg2] - arg3.field421.field2095 & 0x3FFF;
            if (arg1 == 2 && var5.field4880 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4914 != -1) {
                    arg3.field454 = var5.field4914;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4888 != -1) {
                    arg3.field454 = var5.field4888;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4915 == -1) {
                    arg3.field454 = var5.field4880;
                } else {
                    arg3.field454 = var5.field4915;
                }
            } else if (arg1 == 0 && var5.field4920 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4875 != -1) {
                    arg3.field454 = var5.field4875;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4912 != -1) {
                    arg3.field454 = var5.field4912;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4871 == -1) {
                    arg3.field454 = var5.field4920;
                } else {
                    arg3.field454 = var5.field4871;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field4891 != -1) {
                arg3.field454 = var5.field4891;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field4872 != -1) {
                arg3.field454 = var5.field4872;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field4901 == -1) {
                arg3.field454 = var5.field4913;
            } else {
                arg3.field454 = var5.field4901;
            }
            arg3.field456 = false;
        } else if (var6 == 0 && arg3.field498 <= 25) {
            arg3.field456 = false;
            if (arg1 == 2 && var5.field4880 != -1) {
                arg3.field454 = var5.field4880;
            } else if (arg1 == 0 && var5.field4920 != -1) {
                arg3.field454 = var5.field4920;
            } else {
                arg3.field454 = var5.field4913;
            }
        } else {
            if (arg1 == 2 && var5.field4880 != -1) {
                if (arg0 < 0 && var5.field4893 != -1) {
                    arg3.field454 = var5.field4893;
                } else if (arg0 <= 0 || var5.field4904 == -1) {
                    arg3.field454 = var5.field4880;
                } else {
                    arg3.field454 = var5.field4904;
                }
            } else if (arg1 == 0 && var5.field4920 != -1) {
                if (arg0 < 0 && var5.field4876 != -1) {
                    arg3.field454 = var5.field4876;
                } else if (arg0 <= 0 || var5.field4899 == -1) {
                    arg3.field454 = var5.field4920;
                } else {
                    arg3.field454 = var5.field4899;
                }
            } else if (arg0 < 0 && var5.field4917 != -1) {
                arg3.field454 = var5.field4917;
            } else if (arg0 <= 0 || var5.field4918 == -1) {
                arg3.field454 = var5.field4913;
            } else {
                arg3.field454 = var5.field4918;
            }
            arg3.field456 = false;
        }
        if (!arg4) {
            method3828(73, (byte) 42, 55, false, null);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBIZLjava/lang/String;)V", line = 315)
    public static final void method3828(int arg0, byte arg1, int arg2, boolean arg3, String arg4) {
        if (arg1 == -11) {
            field9751++;
            class133.method869(arg2, arg3, arg4, arg0, null, false, -1);
        }
    }
}
