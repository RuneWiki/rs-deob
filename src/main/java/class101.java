import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public abstract class class101 extends class396 {

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "Z")
    public volatile boolean field1141 = true;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1135 = "Checking for updates - ";

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "[Loq;")
    public static class200[] field1136 = new class200[4];

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "Z")
    public static boolean field1139 = false;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "Lra;")
    public static class57 field1133;

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "Z")
    public boolean field1144;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "Z")
    public boolean field1145;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "[[S")
    public static short[][] field1147;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLjf;)V")
    public static final void method543(byte arg0, class119 arg1) {
        if (class216.field2933 == arg1.field1431) {
            class266.field3723[arg1.field1590] = true;
        }
        field1138++;
        int var2 = 28 / ((arg0 + 25) / 33);
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(B)V")
    public static final void method544(byte arg0) {
        class331 var1 = class42.field512;
        synchronized (class42.field512) {
            class42.field512.method2052(0);
        }
        field1137++;
        class331 var2 = class140.field1983;
        synchronized (class140.field1983) {
            class140.field1983.method2052(arg0 ^ 0xFFFFFFBB);
        }
        class148 var3 = class134.field1864;
        synchronized (class134.field1864) {
            if (arg0 == -69) {
                class134.field1864.method877((byte) -19);
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lbo;I)V")
    public static final void method545(class433 arg0, int arg1) {
        arg0.field6300 = false;
        field1142++;
        if (arg0.field6265 != -1) {
            class182 var2 = class437.method2717(arg0.field6265, (byte) -103);
            if (var2 == null || var2.field2493 == null) {
                arg0.field6335 = false;
                arg0.field6265 = -1;
            } else {
                label300: {
                    arg0.field6295++;
                    if (var2.field2493.length > arg0.field6255 && var2.field2513[arg0.field6255] < arg0.field6295) {
                        arg0.field6255++;
                        arg0.field6296++;
                        arg0.field6295 = 1;
                        class424.method2628(arg0.field6255, arg0.field1304, var2, 0, arg0.field1311, class390.field5715 == arg0);
                    }
                    if (arg0.field6255 >= var2.field2493.length) {
                        arg0.field6255 = 0;
                        arg0.field6295 = 0;
                        if (arg0.field6335) {
                            arg0.field6265 = arg0.method2697((byte) 93).method1713(true);
                            if (arg0.field6265 == -1) {
                                arg0.field6335 = false;
                                break label300;
                            }
                            var2 = class437.method2717(arg0.field6265, (byte) -103);
                        }
                        class424.method2628(arg0.field6255, arg0.field1304, var2, ~arg1, arg0.field1311, class390.field5715 == arg0);
                    }
                    arg0.field6296 = arg0.field6255 + 1;
                    if (arg0.field6296 >= var2.field2493.length) {
                        arg0.field6296 = 0;
                    }
                }
            }
        }
        if (arg0.field6256 != arg1 && arg0.field6304 <= class221.field3033) {
            class377 var3 = class251.method1571(arg0.field6256, (byte) 90);
            int var4 = var3.field5536;
            if (var4 == -1) {
                arg0.field6256 = -1;
            } else {
                label302: {
                    class182 var5 = class437.method2717(var4, (byte) -103);
                    if (var3.field5521) {
                        if (var5.field2505 == 3) {
                            if (arg0.field6353 > 0 && arg0.field6331 <= class221.field3033 && class221.field3033 > arg0.field6285) {
                                arg0.field6256 = -1;
                                break label302;
                            }
                        } else if (var5.field2505 == 1 && arg0.field6353 > 0 && arg0.field6331 <= class221.field3033 && arg0.field6285 < class221.field3033) {
                            arg0.field6304 = class221.field3033 + 1;
                            break label302;
                        }
                    }
                    if (var5 == null || var5.field2493 == null) {
                        arg0.field6256 = -1;
                    } else {
                        if (arg0.field6315 < 0) {
                            arg0.field6315 = 0;
                            class424.method2628(0, arg0.field1304, var5, 0, arg0.field1311, class390.field5715 == arg0);
                        }
                        arg0.field6332++;
                        if (var5.field2493.length > arg0.field6315 && var5.field2513[arg0.field6315] < arg0.field6332) {
                            arg0.field6332 = 1;
                            arg0.field6315++;
                            class424.method2628(arg0.field6315, arg0.field1304, var5, 0, arg0.field1311, class390.field5715 == arg0);
                        }
                        if (var5.field2493.length <= arg0.field6315) {
                            if (var3.field5521) {
                                arg0.field6315 -= var5.field2510;
                                arg0.field6293++;
                                if (arg0.field6293 >= var5.field2512) {
                                    arg0.field6256 = -1;
                                } else if (arg0.field6315 >= 0 && arg0.field6315 < var5.field2493.length) {
                                    class424.method2628(arg0.field6315, arg0.field1304, var5, arg1 + 1, arg0.field1311, class390.field5715 == arg0);
                                } else {
                                    arg0.field6256 = -1;
                                }
                            } else {
                                arg0.field6256 = -1;
                            }
                        }
                        arg0.field6270 = arg0.field6315 + 1;
                        if (var5.field2493.length <= arg0.field6270) {
                            if (var3.field5521) {
                                arg0.field6270 -= var5.field2510;
                                if (arg0.field6293 + 1 >= var5.field2512) {
                                    arg0.field6270 = -1;
                                } else if (arg0.field6270 < 0 || arg0.field6270 >= var5.field2493.length) {
                                    arg0.field6270 = -1;
                                }
                            } else {
                                arg0.field6270 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field6312 != -1 && arg0.field6250 <= 1) {
            class182 var6 = class437.method2717(arg0.field6312, (byte) -103);
            if (var6.field2505 == 3) {
                if (arg0.field6353 > 0 && arg0.field6331 <= class221.field3033 && arg0.field6285 < class221.field3033) {
                    arg0.field6312 = -1;
                }
            } else if (var6.field2505 == 1 && arg0.field6353 > 0 && class221.field3033 >= arg0.field6331 && arg0.field6285 < class221.field3033) {
                arg0.field6250 = 2;
            }
        }
        if (arg0.field6312 != -1 && arg0.field6250 == 0) {
            class182 var7 = class437.method2717(arg0.field6312, (byte) -103);
            if (var7 == null || var7.field2493 == null) {
                arg0.field6312 = -1;
            } else {
                arg0.field6322++;
                if (var7.field2493.length > arg0.field6277 && arg0.field6322 > var7.field2513[arg0.field6277]) {
                    arg0.field6277++;
                    arg0.field6322 = 1;
                    class424.method2628(arg0.field6277, arg0.field1304, var7, 0, arg0.field1311, class390.field5715 == arg0);
                }
                if (arg0.field6277 >= var7.field2493.length) {
                    arg0.field6314++;
                    arg0.field6277 -= var7.field2510;
                    if (var7.field2512 <= arg0.field6314) {
                        arg0.field6312 = -1;
                    } else if (arg0.field6277 >= 0 && var7.field2493.length > arg0.field6277) {
                        class424.method2628(arg0.field6277, arg0.field1304, var7, 0, arg0.field1311, class390.field5715 == arg0);
                    } else {
                        arg0.field6312 = -1;
                    }
                }
                arg0.field6272 = arg0.field6277 + 1;
                if (var7.field2493.length <= arg0.field6272) {
                    arg0.field6272 -= var7.field2510;
                    if (var7.field2512 <= arg0.field6314 + 1) {
                        arg0.field6272 = -1;
                    } else if (arg0.field6272 < 0 || var7.field2493.length <= arg0.field6272) {
                        arg0.field6272 = -1;
                    }
                }
                arg0.field6300 = var7.field2488;
            }
        }
        if (arg0.field6250 > 0) {
            arg0.field6250--;
        }
        for (int var8 = 0; var8 < arg0.field6269.length; var8++) {
            class138 var9 = arg0.field6269[var8];
            if (var9 != null) {
                if (var9.field1962 > 0) {
                    var9.field1962--;
                } else {
                    class182 var10 = class437.method2717(var9.field1963, (byte) -103);
                    if (var10 == null || var10.field2493 == null) {
                        arg0.field6269[var8] = null;
                    } else {
                        var9.field1970++;
                        if (var9.field1959 < var10.field2493.length && var10.field2513[var9.field1959] < var9.field1970) {
                            var9.field1970 = 1;
                            var9.field1959++;
                            class424.method2628(var9.field1959, arg0.field1304, var10, 0, arg0.field1311, class390.field5715 == arg0);
                        }
                        if (var9.field1959 >= var10.field2493.length) {
                            var9.field1959 -= var10.field2510;
                            var9.field1960++;
                            if (var10.field2512 <= var9.field1960) {
                                arg0.field6269[var8] = null;
                            } else if (var9.field1959 >= 0 && var9.field1959 < var10.field2493.length) {
                                class424.method2628(var9.field1959, arg0.field1304, var10, 0, arg0.field1311, class390.field5715 == arg0);
                            } else {
                                arg0.field6269[var8] = null;
                            }
                        }
                        var9.field1967 = var9.field1959 + 1;
                        if (var10.field2493.length <= var9.field1967) {
                            var9.field1967 -= var10.field2510;
                            if (var9.field1960 + 1 >= var10.field2512) {
                                var9.field1967 = -1;
                            } else if (var9.field1967 < 0 || var10.field2493.length <= var9.field1967) {
                                var9.field1967 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(B)I")
    public abstract int method85(byte arg0);

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "(B)V")
    public static void method546(byte arg0) {
        field1147 = null;
        field1136 = null;
        field1133 = null;
        int var1 = 7 % ((arg0 + 69) / 56);
        field1135 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZLra;Lra;I)V")
    public static final void method547(boolean arg0, class57 arg1, class57 arg2, int arg3) {
        class112.field1295 = arg0;
        class140.field1987 = arg1;
        field1134++;
        class92.field1016 = arg2;
        if (arg3 != -3905) {
            field1133 = null;
        }
        int var4 = class92.field1016.method358((byte) -111) - 1;
        class350.field5116 = class92.field1016.method352(var4, (byte) -75) + var4 * 256;
        class423.field6074 = new String[] { null, null, class350.field5108, null, null };
        class191.field2613 = new String[] { null, null, null, null, class417.field5995 };
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)[B")
    public abstract byte[] method84(int arg0);
}
