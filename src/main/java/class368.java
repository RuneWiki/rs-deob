import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class368 {

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field5102;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lbc;")
    public static class285 field5104 = null;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field5106 = 0;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!hc", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        field5107++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 38)
    public final String method2313(byte arg0, int arg1) {
        field5105++;
        if (arg0 >= -67) {
            field5106 = 89;
        }
        return this.field5102[arg1];
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Lgl;", line = 73)
    public static final class340 method2314(int arg0) {
        field5101++;
        if (arg0 <= 60) {
            method2315(false);
        }
        try {
            return (class340) Class.forName("pb").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 89)
    public static void method2315(boolean arg0) {
        field5104 = null;
        if (arg0) {
            method2316((byte) -17);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)J", line = 106)
    public static final long method2316(byte arg0) {
        field5100++;
        return arg0 < 32 ? -106L : class254.field3522.method550((byte) -4);
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 150)
    public class368(String arg0, String arg1, String arg2, String arg3) {
        this.field5102 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjq;)V", line = 159)
    public static final void method2317(int arg0, class185 arg1) {
        arg1.field2595 = false;
        field5103++;
        if (arg1.field2587 != -1) {
            class83 var2 = class408.method2521((byte) -6, arg1.field2587);
            if (var2 == null || var2.field1145 == null) {
                arg1.field2597 = false;
                arg1.field2587 = -1;
            } else {
                label306: {
                    arg1.field2634++;
                    if (var2.field1145.length > arg1.field2621 && var2.field1144[arg1.field2621] < arg1.field2634) {
                        arg1.field2621++;
                        arg1.field2620++;
                        arg1.field2634 = 1;
                        class431.method2657(var2, arg0 - 23858, arg1.field40, class359.field4970 == arg1, arg1.field2621, arg1.field44);
                    }
                    if (arg1.field2621 >= var2.field1145.length) {
                        arg1.field2621 = 0;
                        arg1.field2634 = 0;
                        if (arg1.field2597) {
                            arg1.field2587 = arg1.method1283((byte) 99).method478(arg0 ^ 0x4533);
                            if (arg1.field2587 == -1) {
                                arg1.field2597 = false;
                                break label306;
                            }
                            var2 = class408.method2521((byte) -99, arg1.field2587);
                        }
                        class431.method2657(var2, arg0 ^ 0xFFFFA332, arg1.field40, class359.field4970 == arg1, arg1.field2621, arg1.field44);
                    }
                    arg1.field2620 = arg1.field2621 + 1;
                    if (arg1.field2620 >= var2.field1145.length) {
                        arg1.field2620 = 0;
                    }
                }
            }
        }
        if (arg1.field2636 != -1 && class246.field3467 >= arg1.field2633) {
            class344 var3 = class186.method1296(arg1.field2636, false);
            int var4 = var3.field4648;
            if (var4 == -1) {
                arg1.field2636 = -1;
            } else {
                label308: {
                    class83 var5 = class408.method2521((byte) 55, var4);
                    if (var3.field4650) {
                        if (var5.field1147 == 3) {
                            if (arg1.field2666 > 0 && arg1.field2627 <= class246.field3467 && arg1.field2612 < class246.field3467) {
                                arg1.field2636 = -1;
                                break label308;
                            }
                        } else if (var5.field1147 == 1 && arg1.field2666 > 0 && class246.field3467 >= arg1.field2627 && arg1.field2612 < class246.field3467) {
                            arg1.field2633 = class246.field3467 + 1;
                            break label308;
                        }
                    }
                    if (var5 == null || var5.field1145 == null) {
                        arg1.field2636 = -1;
                    } else {
                        if (arg1.field2643 < 0) {
                            arg1.field2643 = 0;
                            class431.method2657(var5, -63, arg1.field40, class359.field4970 == arg1, 0, arg1.field44);
                        }
                        arg1.field2584++;
                        if (var5.field1145.length > arg1.field2643 && arg1.field2584 > var5.field1144[arg1.field2643]) {
                            arg1.field2584 = 1;
                            arg1.field2643++;
                            class431.method2657(var5, -63, arg1.field40, class359.field4970 == arg1, arg1.field2643, arg1.field44);
                        }
                        if (arg1.field2643 >= var5.field1145.length) {
                            if (var3.field4650) {
                                arg1.field2643 -= var5.field1164;
                                arg1.field2602++;
                                if (arg1.field2602 >= var5.field1152) {
                                    arg1.field2636 = -1;
                                } else if (arg1.field2643 >= 0 && var5.field1145.length > arg1.field2643) {
                                    class431.method2657(var5, arg0 ^ 0xFFFFA332, arg1.field40, class359.field4970 == arg1, arg1.field2643, arg1.field44);
                                } else {
                                    arg1.field2636 = -1;
                                }
                            } else {
                                arg1.field2636 = -1;
                            }
                        }
                        arg1.field2599 = arg1.field2643 + 1;
                        if (arg1.field2599 >= var5.field1145.length) {
                            if (var3.field4650) {
                                arg1.field2599 -= var5.field1164;
                                if (var5.field1152 <= arg1.field2602 + 1) {
                                    arg1.field2599 = -1;
                                } else if (arg1.field2599 < 0 || var5.field1145.length <= arg1.field2599) {
                                    arg1.field2599 = -1;
                                }
                            } else {
                                arg1.field2599 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field2619 != -1 && arg1.field2617 <= 1) {
            class83 var6 = class408.method2521((byte) 59, arg1.field2619);
            if (var6.field1147 == 3) {
                if (arg1.field2666 > 0 && class246.field3467 >= arg1.field2627 && class246.field3467 > arg1.field2612) {
                    arg1.field2619 = -1;
                }
            } else if (var6.field1147 == 1 && arg1.field2666 > 0 && arg1.field2627 <= class246.field3467 && class246.field3467 > arg1.field2612) {
                arg1.field2617 = 2;
            }
        }
        if (arg1.field2619 != -1 && arg1.field2617 == 0) {
            class83 var7 = class408.method2521((byte) 7, arg1.field2619);
            if (var7 == null || var7.field1145 == null) {
                arg1.field2619 = -1;
            } else {
                arg1.field2626++;
                if (var7.field1145.length > arg1.field2593 && var7.field1144[arg1.field2593] < arg1.field2626) {
                    arg1.field2593++;
                    arg1.field2626 = 1;
                    class431.method2657(var7, arg0 ^ 0xFFFFA332, arg1.field40, class359.field4970 == arg1, arg1.field2593, arg1.field44);
                }
                if (arg1.field2593 >= var7.field1145.length) {
                    arg1.field2593 -= var7.field1164;
                    arg1.field2578++;
                    if (arg1.field2578 >= var7.field1152) {
                        arg1.field2619 = -1;
                    } else if (arg1.field2593 >= 0 && arg1.field2593 < var7.field1145.length) {
                        class431.method2657(var7, arg0 ^ 0xFFFFA332, arg1.field40, class359.field4970 == arg1, arg1.field2593, arg1.field44);
                    } else {
                        arg1.field2619 = -1;
                    }
                }
                arg1.field2648 = arg1.field2593 + 1;
                if (arg1.field2648 >= var7.field1145.length) {
                    arg1.field2648 -= var7.field1164;
                    if (arg1.field2578 + 1 >= var7.field1152) {
                        arg1.field2648 = -1;
                    } else if (arg1.field2648 < 0 || var7.field1145.length <= arg1.field2648) {
                        arg1.field2648 = -1;
                    }
                }
                arg1.field2595 = var7.field1154;
            }
        }
        if (arg1.field2617 > 0) {
            arg1.field2617--;
        }
        for (int var8 = 0; var8 < arg1.field2588.length; var8++) {
            class134 var9 = arg1.field2588[var8];
            if (var9 != null) {
                if (var9.field2006 > 0) {
                    var9.field2006--;
                } else {
                    class83 var10 = class408.method2521((byte) -115, var9.field1998);
                    if (var10 == null || var10.field1145 == null) {
                        arg1.field2588[var8] = null;
                    } else {
                        var9.field2002++;
                        if (var9.field1995 < var10.field1145.length && var10.field1144[var9.field1995] < var9.field2002) {
                            var9.field2002 = 1;
                            var9.field1995++;
                            class431.method2657(var10, -63, arg1.field40, class359.field4970 == arg1, var9.field1995, arg1.field44);
                        }
                        if (var10.field1145.length <= var9.field1995) {
                            var9.field2001++;
                            var9.field1995 -= var10.field1164;
                            if (var10.field1152 <= var9.field2001) {
                                arg1.field2588[var8] = null;
                            } else if (var9.field1995 >= 0 && var9.field1995 < var10.field1145.length) {
                                class431.method2657(var10, -63, arg1.field40, class359.field4970 == arg1, var9.field1995, arg1.field44);
                            } else {
                                arg1.field2588[var8] = null;
                            }
                        }
                        var9.field1996 = var9.field1995 + 1;
                        if (var10.field1145.length <= var9.field1996) {
                            var9.field1996 -= var10.field1164;
                            if (var9.field2001 + 1 >= var10.field1152) {
                                var9.field1996 = -1;
                            } else if (var9.field1996 < 0 || var9.field1996 >= var10.field1145.length) {
                                var9.field1996 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 23795) {
            field5106 = 34;
        }
    }
}
