import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class582 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lbe;")
    public static class37 field8201;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([BI)Lbl;", line = 3)
    public static final class648 method3306(byte[] arg0, int arg1) {
        field8204++;
        class648 var2 = new class648();
        class675 var3 = new class675(arg0);
        var3.field9146 = var3.field9154.length - 2;
        int var4 = var3.method3757((byte) -65);
        int var5 = var3.field9154.length - var4 - 14;
        var3.field9146 = var5;
        int var6 = var3.method3703(arg1 + 89);
        var2.field8913 = var3.method3757((byte) -65);
        var2.field8914 = var3.method3757((byte) -65);
        var2.field8907 = var3.method3757((byte) -65);
        var2.field8905 = var3.method3757((byte) -65);
        int var7 = var3.method3750((byte) 35);
        if (var7 > arg1) {
            var2.field8908 = new class188[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method3757((byte) -65);
                class188 var10 = new class188(class123.method837(arg1 ^ 0x73, var9));
                var2.field8908[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method3703(arg1 + 115);
                    int var12 = var3.method3703(arg1 ^ 0x79);
                    var10.method1179((long) var11, new class756(var12), (byte) -26);
                }
            }
        }
        var3.field9146 = 0;
        var2.field8909 = var3.method3754(59);
        var2.field8904 = new String[var6];
        var2.field8910 = new int[var6];
        var2.field8912 = new int[var6];
        int var13 = 0;
        while (var3.field9146 < var5) {
            int var14 = var3.method3757((byte) -65);
            if (var14 == 3) {
                var2.field8904[var13] = var3.method3697(-1).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field8910[var13] = var3.method3750((byte) 35);
            } else {
                var2.field8910[var13] = var3.method3703(123);
            }
            var2.field8912[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLwm;)V", line = 90)
    public static final void method3307(boolean arg0, class564 arg1) {
        field8202++;
        if (arg1.field7930 != -1) {
            class709 var2 = class343.field4785.method3525(arg1.field7930, (byte) -28);
            if (var2 == null || var2.field9826 == null) {
                arg1.field7968 = false;
                arg1.field7930 = -1;
            } else {
                label367: {
                    arg1.field7982++;
                    if (var2.field9826.length > arg1.field7906 && var2.field9849[arg1.field7906] < arg1.field7982) {
                        arg1.field7982 = 1;
                        arg1.field7927++;
                        arg1.field7906++;
                        if (!arg1.field7970) {
                            class346.method2239(-701644944, arg1.field7906, arg1, var2);
                        }
                    }
                    if (var2.field9826.length <= arg1.field7906) {
                        arg1.field7982 = 0;
                        arg1.field7906 = 0;
                        if (arg1.field7968) {
                            arg1.field7930 = arg1.method3247(21816).method1402(-1);
                            if (arg1.field7930 == -1) {
                                arg1.field7968 = false;
                                break label367;
                            }
                            var2 = class343.field4785.method3525(arg1.field7930, (byte) 105);
                        }
                        if (!arg1.field7970) {
                            class346.method2239(-701644944, arg1.field7906, arg1, var2);
                        }
                    }
                    arg1.field7927 = arg1.field7906 + 1;
                    if (var2.field9826 == null) {
                        arg1.field7930 = -1;
                        arg1.field7968 = false;
                    } else if (var2.field9826.length <= arg1.field7927) {
                        arg1.field7927 = 0;
                    }
                }
            }
        }
        if (arg1.field7928 != -1 && class740.field10285 >= arg1.field7940) {
            class752 var3 = class220.field2879.method977(arg1.field7928, (byte) -79);
            int var4 = var3.field10449;
            if (var4 == -1) {
                arg1.field7928 = -1;
            } else {
                label368: {
                    class709 var5 = class343.field4785.method3525(var4, (byte) -121);
                    if (var3.field10443) {
                        if (var5.field9823 == 3) {
                            if (arg1.field8007 > 0 && class740.field10285 >= arg1.field7954 && arg1.field7969 < class740.field10285) {
                                arg1.field7928 = -1;
                                break label368;
                            }
                        } else if (var5.field9823 == 1 && arg1.field8007 > 0 && class740.field10285 >= arg1.field7954 && arg1.field7969 < class740.field10285) {
                            arg1.field7940 = class740.field10285 + 1;
                            break label368;
                        }
                    }
                    if (var5 == null || var5.field9826 == null) {
                        arg1.field7928 = -1;
                    } else {
                        if (arg1.field7966 < 0) {
                            arg1.field7966 = 0;
                            if (!arg1.field7970) {
                                class346.method2239(-701644944, 0, arg1, var5);
                            }
                        }
                        arg1.field7923++;
                        if (arg1.field7966 < var5.field9826.length && arg1.field7923 > var5.field9849[arg1.field7966]) {
                            arg1.field7923 = 1;
                            arg1.field7966++;
                            if (!arg1.field7970) {
                                class346.method2239(-701644944, arg1.field7966, arg1, var5);
                            }
                        }
                        if (var5.field9826.length <= arg1.field7966) {
                            if (var3.field10443) {
                                arg1.field7966 -= var5.field9840;
                                arg1.field7979++;
                                if (arg1.field7979 >= var5.field9841) {
                                    arg1.field7928 = -1;
                                } else if (arg1.field7966 < 0 || var5.field9826.length <= arg1.field7966) {
                                    arg1.field7928 = -1;
                                } else if (!arg1.field7970) {
                                    class346.method2239(-701644944, arg1.field7966, arg1, var5);
                                }
                            } else {
                                arg1.field7928 = -1;
                            }
                        }
                        arg1.field7920 = arg1.field7966 + 1;
                        if (arg1.field7920 >= var5.field9826.length) {
                            if (var3.field10443) {
                                arg1.field7920 -= var5.field9840;
                                if (var5.field9841 <= arg1.field7979 + 1) {
                                    arg1.field7920 = -1;
                                } else if (arg1.field7920 < 0 || var5.field9826.length <= arg1.field7920) {
                                    arg1.field7920 = -1;
                                }
                            } else {
                                arg1.field7920 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field7977 != -1 && class740.field10285 >= arg1.field7919) {
            class752 var6 = class220.field2879.method977(arg1.field7977, (byte) -70);
            int var7 = var6.field10449;
            if (var7 == -1) {
                arg1.field7977 = -1;
            } else {
                label371: {
                    class709 var8 = class343.field4785.method3525(var7, (byte) -88);
                    if (var6.field10443) {
                        if (var8.field9823 == 3) {
                            if (arg1.field8007 > 0 && class740.field10285 >= arg1.field7954 && arg1.field7969 < class740.field10285) {
                                arg1.field7977 = -1;
                                break label371;
                            }
                        } else if (var8.field9823 == 1 && arg1.field8007 > 0 && class740.field10285 >= arg1.field7954 && arg1.field7969 < class740.field10285) {
                            arg1.field7919 = class740.field10285 + 1;
                            break label371;
                        }
                    }
                    if (var8 == null || var8.field9826 == null) {
                        arg1.field7977 = -1;
                    } else {
                        if (arg1.field7953 < 0) {
                            arg1.field7953 = 0;
                            if (!arg1.field7970) {
                                class346.method2239(-701644944, 0, arg1, var8);
                            }
                        }
                        arg1.field7912++;
                        if (arg1.field7953 < var8.field9826.length && var8.field9849[arg1.field7953] < arg1.field7912) {
                            arg1.field7953++;
                            arg1.field7912 = 1;
                            if (!arg1.field7970) {
                                class346.method2239(-701644944, arg1.field7953, arg1, var8);
                            }
                        }
                        if (var8.field9826.length <= arg1.field7953) {
                            if (var6.field10443) {
                                arg1.field7909++;
                                arg1.field7953 -= var8.field9840;
                                if (var8.field9841 <= arg1.field7909) {
                                    arg1.field7977 = -1;
                                } else if (arg1.field7953 < 0 || arg1.field7953 >= var8.field9826.length) {
                                    arg1.field7977 = -1;
                                } else if (!arg1.field7970) {
                                    class346.method2239(-701644944, arg1.field7953, arg1, var8);
                                }
                            } else {
                                arg1.field7977 = -1;
                            }
                        }
                        arg1.field7952 = arg1.field7953 + 1;
                        if (arg1.field7952 >= var8.field9826.length) {
                            if (var6.field10443) {
                                arg1.field7952 -= var8.field9840;
                                if ((arg1.field7909 + 1) >= var8.field9841) {
                                    arg1.field7952 = -1;
                                } else if (arg1.field7952 < 0 || arg1.field7952 >= var8.field9826.length) {
                                    arg1.field7952 = -1;
                                }
                            } else {
                                arg1.field7952 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field7991 != -1 && arg1.field7925 <= 1) {
            class709 var9 = class343.field4785.method3525(arg1.field7991, (byte) 91);
            if (var9.field9823 == 3) {
                if (arg1.field8007 > 0 && class740.field10285 >= arg1.field7954 && class740.field10285 > arg1.field7969) {
                    arg1.field7991 = -1;
                    arg1.field7911 = null;
                }
            } else if (var9.field9823 == 1 && arg1.field8007 > 0 && arg1.field7954 <= class740.field10285 && class740.field10285 > arg1.field7969) {
                arg1.field7925 = 2;
            }
        }
        if (arg1.field7991 != -1 && arg1.field7925 == 0) {
            class709 var10 = class343.field4785.method3525(arg1.field7991, (byte) 105);
            if (var10 == null || var10.field9826 == null) {
                arg1.field7911 = null;
                arg1.field7991 = -1;
            } else {
                arg1.field7921++;
                if (arg1.field7965 < var10.field9826.length && var10.field9849[arg1.field7965] < arg1.field7921) {
                    arg1.field7921 = 1;
                    arg1.field7965++;
                    if (!arg1.field7970) {
                        class346.method2239(-701644944, arg1.field7965, arg1, var10);
                    }
                }
                if (arg1.field7965 >= var10.field9826.length) {
                    arg1.field7965 -= var10.field9840;
                    arg1.field7944++;
                    if (var10.field9841 <= arg1.field7944) {
                        arg1.field7991 = -1;
                        arg1.field7911 = null;
                    } else if (arg1.field7965 < 0 || arg1.field7965 >= var10.field9826.length) {
                        arg1.field7911 = null;
                        arg1.field7991 = -1;
                    } else if (!arg1.field7970) {
                        class346.method2239(-701644944, arg1.field7965, arg1, var10);
                    }
                }
                arg1.field7922 = arg1.field7965 + 1;
                if (var10.field9826.length <= arg1.field7922) {
                    arg1.field7922 -= var10.field9840;
                    if (var10.field9841 <= (arg1.field7944 + 1)) {
                        arg1.field7922 = -1;
                    } else if (arg1.field7922 < 0 || var10.field9826.length <= arg1.field7922) {
                        arg1.field7922 = -1;
                    }
                }
            }
        }
        if (arg1.field7925 > 0) {
            arg1.field7925--;
        }
        if (arg0) {
            return;
        }
        for (int var11 = 0; var11 < arg1.field7981.length; var11++) {
            class132 var12 = arg1.field7981[var11];
            if (var12 != null) {
                if (var12.field1946 > 0) {
                    var12.field1946--;
                } else {
                    class709 var13 = class343.field4785.method3525(var12.field1944, (byte) -33);
                    if (var13 == null || var13.field9826 == null) {
                        arg1.field7981[var11] = null;
                    } else {
                        var12.field1947++;
                        if (var12.field1942 < var13.field9826.length && var12.field1947 > var13.field9849[var12.field1942]) {
                            var12.field1947 = 1;
                            var12.field1942++;
                            if (!arg1.field7970) {
                                class346.method2239(-701644944, var12.field1942, arg1, var13);
                            }
                        }
                        if (var12.field1942 >= var13.field9826.length) {
                            var12.field1942 -= var13.field9840;
                            var12.field1941++;
                            if (var13.field9841 <= var12.field1941) {
                                arg1.field7981[var11] = null;
                            } else if (var12.field1942 < 0 || var13.field9826.length <= var12.field1942) {
                                arg1.field7981[var11] = null;
                            } else if (!arg1.field7970) {
                                class346.method2239(-701644944, var12.field1942, arg1, var13);
                            }
                        }
                        var12.field1940 = var12.field1942 + 1;
                        if (var13.field9826.length <= var12.field1940) {
                            var12.field1940 -= var13.field9840;
                            if (var12.field1941 + 1 >= var13.field9841) {
                                var12.field1940 = -1;
                            } else if (var12.field1940 < 0 || var12.field1940 >= var13.field9826.length) {
                                var12.field1940 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 561)
    public static void method3308(int arg0) {
        if (arg0 <= -107) {
            field8201 = null;
        }
    }
}
