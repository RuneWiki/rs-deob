import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class217 extends class284 {

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public static int field3115 = -1;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "Lrn;")
    public static class174 field3119 = new class174(77, 3);

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field3124 = -1;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "Z")
    public static boolean field3129 = false;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "Lsk;")
    public class438 field3113;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "Ler;")
    public static class68 field3125;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bb", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field3130;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "[B")
    public byte[] field3123;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "[[[J")
    public static long[][][] field3128;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1444(String arg0, int arg1) {
        if (arg1 > -119) {
            field3124 = 123;
        }
        ++field3117;
        return 1 + arg0.length();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)[B")
    public final byte[] method1445(byte arg0) {
        ++field3121;
        if (super.field4053) {
            throw new RuntimeException();
        } else {
            return arg0 <= 73 ? null : this.field3123;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
    public static final void method1446(boolean arg0) {
        if (class116.field1927 != null) {
            class116.field1927.method1305((byte) -74);
            class116.field1927 = null;
        }
        ++field3114;
        class385.method2384((byte) 52);
        class39.method405();
        for (int var1 = 0; var1 < 4; ++var1) {
            class141.field2244[var1].method1726(-51);
        }
        class54.method479(arg0, (byte) 107);
        System.gc();
        class431.method2583(2, (byte) -55);
        class281.field4026 = -1;
        field3129 = false;
        class442.method2652(true, (byte) 109);
        class200.field2931 = 0;
        class187.field2781 = 0;
        class403.field6059 = 0;
        class412.field6157 = 0;
        class185.field2771 = 0;
        for (int var2 = 0; ~class45.field835.length < ~var2; ++var2) {
            class45.field835[var2] = null;
        }
        class355.method2245(122);
        for (int var3 = 0; ~var3 > -2049; ++var3) {
            class183.field2747[var3] = null;
        }
        class510.field7529 = 0;
        for (int var4 = 0; var4 < 32768; ++var4) {
            class34.field668[var4] = null;
        }
        class433.field6430.method159(0);
        class123.method945((byte) 70);
        class334.field5043 = 0;
        class335.field5059.method2305(true);
        class203.method1399((byte) -125);
        class106.method799(-125);
        class319.method2078((byte) 76, true);
        try {
            class512.method3065("loggedout", class368.field5553.field4170, (byte) 10);
        } catch (Throwable var5) {
        }
        class462.field6919 = 0L;
        class188.field2817 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
    public static final void method1447(int arg0, int arg1) {
        ++field3126;
        class54 var2 = class442.method2651(arg0, 2, -13208);
        if (arg1 == -15084) {
            var2.method476((byte) -44);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(IIB)V")
    public static final void method1448(int arg0, int arg1, byte arg2) {
        ++field3116;
        if (class428.field6357 == class403.field6054) {
            if (class222.method1475(false, arg0, 0, 1, 1, -2, true, arg1, 0)) {
                return;
            }
            class222.method1475(false, arg0, 0, 1, 1, -3, true, arg1, 0);
        } else {
            if (class222.method1475(false, arg0, 0, 1, 1, -3, true, arg1, 0)) {
                return;
            }
            class222.method1475(false, arg0, 0, 1, 1, -2, true, arg1, 0);
        }
        int var3 = -78 % ((arg2 - 16) / 57);
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
    public static void method1449(int arg0) {
        field3128 = null;
        field3119 = null;
        field3125 = null;
        if (arg0 > -49) {
            field3127 = 106;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIILqa;IZ)V")
    public static final void method1450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class162 arg6, int arg7, boolean arg8) {
        ++field3122;
        class248 var9 = (class248) class310.method2028(arg5, arg3, arg0);
        if (!arg8) {
            if (var9 != null) {
                class79 var10 = class319.field4807.method2874(var9.method17((byte) -113), -17045);
                int var11 = var9.method19((byte) -69) & 3;
                int var12 = var9.method12(3765);
                if (~var10.field1349 != 0) {
                    class26.method316(arg2, var10, arg6, arg4, -16777216, var11);
                } else {
                    int var13 = arg7;
                    if (~var10.field1357 < -1) {
                        var13 = arg1;
                    }
                    if (~var12 == -1 || var12 == 2) {
                        if (var11 != 0) {
                            if (~var11 == -2) {
                                arg6.method1202(arg4, var13, 1, arg2, 4);
                            } else if (~var11 == -3) {
                                arg6.method1197(4, arg4 - -3, 124, arg2, var13);
                            } else if (~var11 == -4) {
                                arg6.method1202(arg4, var13, 1, arg2 - -3, 4);
                            }
                        } else {
                            arg6.method1197(4, arg4, 116, arg2, var13);
                        }
                    }
                    if (var12 == 3) {
                        if (~var11 != -1) {
                            if (~var11 != -2) {
                                if (var11 != 2) {
                                    if (var11 == 3) {
                                        arg6.method1200(var13, 1, arg4, arg2 + 3, 1, 10);
                                    }
                                } else {
                                    arg6.method1200(var13, 1, arg4 + 3, arg2 + 3, 1, 10);
                                }
                            } else {
                                arg6.method1200(var13, 1, arg4 - -3, arg2, 1, 10);
                            }
                        } else {
                            arg6.method1200(var13, 1, arg4, arg2, 1, 10);
                        }
                    }
                    if (var12 == 2) {
                        if (~var11 != -1) {
                            if (~var11 == -2) {
                                arg6.method1197(4, arg4 - -3, 121, arg2, var13);
                            } else if (~var11 == -3) {
                                arg6.method1202(arg4, var13, 1, arg2 + 3, 4);
                            } else if (var11 == 3) {
                                arg6.method1197(4, arg4, 126, arg2, var13);
                            }
                        } else {
                            arg6.method1202(arg4, var13, 1, arg2, 4);
                        }
                    }
                }
            }
            class248 var14 = (class248) class367.method2294(arg5, arg3, arg0, field3130 != null ? field3130 : (field3130 = method1452("pa")));
            if (var14 != null) {
                class79 var15 = class319.field4807.method2874(var14.method17((byte) 8), -17045);
                int var16 = var14.method19((byte) -69) & 3;
                int var17 = var14.method12(3765);
                if (~var15.field1349 == 0) {
                    if (var17 == 9) {
                        int var18 = -1118482;
                        if (var15.field1357 > 0) {
                            var18 = -1179648;
                        }
                        if (var16 != 0 && var16 != 2) {
                            arg6.method1201(arg4, arg2, var18, arg2 + 3, true, arg4 + 3);
                        } else {
                            arg6.method1201(arg4, arg2 + 3, var18, arg2, !arg8, arg4 - -3);
                        }
                    }
                } else {
                    class26.method316(arg2, var15, arg6, arg4, -16777216, var16);
                }
            }
            class248 var19 = (class248) class412.method2496(arg5, arg3, arg0);
            if (var19 != null) {
                class79 var20 = class319.field4807.method2874(var19.method17((byte) 93), -17045);
                int var21 = var19.method19((byte) -69) & 3;
                if (var20.field1349 != -1) {
                    class26.method316(arg2, var20, arg6, arg4, -16777216, var21);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)I")
    public final int method1451(int arg0) {
        ++field3120;
        if (super.field4053) {
            return 0;
        } else {
            return arg0 != 0 ? 58 : 100;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1452(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
