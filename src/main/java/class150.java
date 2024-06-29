import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class150 extends class128 {

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "Llc;")
    public static class175 field2084;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "[I")
    public static int[] field2082;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "[[[Ldk;")
    public static class225[][][] field2081;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 3)
    public static final void method1006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class57 var20 = new class57(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class158.field2184[var21][arg1][arg2] == null) {
                    class158.field2184[var21][arg1][arg2] = new class225(var21, arg1, arg2);
                }
            }
            class158.field2184[arg0][arg1][arg2].field3203 = var20;
        } else if (arg3 == 1) {
            class57 var22 = new class57(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class158.field2184[var23][arg1][arg2] == null) {
                    class158.field2184[var23][arg1][arg2] = new class225(var23, arg1, arg2);
                }
            }
            class158.field2184[arg0][arg1][arg2].field3203 = var22;
        } else {
            class290 var24 = new class290(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class158.field2184[var25][arg1][arg2] == null) {
                    class158.field2184[var25][arg1][arg2] = new class225(var25, arg1, arg2);
                }
            }
            class158.field2184[arg0][arg1][arg2].field3218 = var24;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 56)
    public class150() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V", line = 62)
    public static final void method1007(int arg0, int arg1) {
        class229.field3339.method1236(-495037017, arg1);
        field2086++;
        if (arg0 != 0) {
            field2082 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIII)Z", line = 74)
    public static final boolean method1008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var8 = class256.method1858(arg7, arg2 + arg4, arg1 + arg5);
        field2083++;
        if (var8 != 0L) {
            int var10 = (int) var8 >> 20 & 0x3;
            int var11 = ((int) var8 & 0x7EFE5) >> 14;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class238 var13 = class142.method951(var12, 26915);
            if (var13.field3545 == -1) {
                int var14 = arg0;
                int[] var15 = class144.field2005;
                if (var8 > 0L) {
                    var14 = arg6;
                }
                int var16 = (52736 - arg5 * 512) * 4 + arg2 * 4 + 24624;
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 2 + 1536] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1539] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
            } else if (!class9.method40(var10, arg5, var13, arg2, arg4, 4, arg1)) {
                return false;
            }
        }
        long var17 = class56.method332(arg7, arg2 + arg4, arg1 + arg5);
        if (arg3 != -18058) {
            method1010((String) null, -84, (byte) -21, (String) null);
        }
        if (var17 != 0L) {
            int var19 = (int) var17 >> 14 & 0x1F;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var21 = (int) var17 >> 20 & 0x3;
            class238 var22 = class142.method951(var20, 26915);
            if (var22.field3545 == -1) {
                if (var19 == 9) {
                    int var23 = arg2 * 4 + ((-(arg5 * 512) + 52736) * 4) + 24624;
                    int[] var24 = class144.field2005;
                    int var25 = 15658734;
                    if (var17 > 0L) {
                        var25 = 15597568;
                    }
                    if (var21 == 0 || var21 == 2) {
                        var24[var23 + 1536] = var25;
                        var24[var23 + 1024 + 1] = var25;
                        var24[var23 + 512 + 2] = var25;
                        var24[var23 + 3] = var25;
                    } else {
                        var24[var23] = var25;
                        var24[var23 + 1 + 512] = var25;
                        var24[var23 + 1024 + 2] = var25;
                        var24[var23 + 3 + 1536] = var25;
                    }
                }
            } else if (!class9.method40(var21, arg5, var22, arg2, arg4, 4, arg1)) {
                return false;
            }
        }
        long var26 = class208.method1431(arg7, arg2 + arg4, arg5 - -arg1);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class238 var30 = class142.method951(var29, 26915);
            if (var30.field3545 != -1 && !class9.method40(var28, arg5, var30, arg2, arg4, arg3 ^ 0xFFFFB972, arg1)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V", line = 284)
    public static void method1009(byte arg0) {
        field2081 = (class225[][][]) null;
        field2084 = null;
        if (arg0 != -125) {
            method1011(true, -54);
        }
        field2082 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(BI)[I", line = 301)
    public final int[] method126(byte arg0, int arg1) {
        field2088++;
        if (arg0 <= 100) {
            field2082 = (int[]) null;
        }
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            class86.method514(var3, 0, class10.field141, class49.field600[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)V", line = 325)
    public static final void method1010(String arg0, int arg1, byte arg2, String arg3) {
        if (arg2 != -59) {
            method1010((String) null, -92, (byte) -31, (String) null);
        }
        class146.method985(-1, arg0, (byte) -125, arg1, arg3, (String) null);
        field2085++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)V", line = 337)
    public static final void method1011(boolean arg0, int arg1) {
        field2087++;
        for (class298 var2 = (class298) class68.field895.method2331((byte) 117); var2 != null; var2 = (class298) class68.field895.method2332(-63)) {
            if (var2.field4650 != null) {
                class19.field255.method27(var2.field4650);
                var2.field4650 = null;
            }
            if (var2.field4638 != null) {
                class19.field255.method27(var2.field4638);
                var2.field4638 = null;
            }
            var2.method2285(true);
        }
        if (arg0) {
            for (class298 var3 = (class298) class299.field4667.method2331((byte) 5); var3 != null; var3 = (class298) class299.field4667.method2332(-109)) {
                if (var3.field4650 != null) {
                    class19.field255.method27(var3.field4650);
                    var3.field4650 = null;
                }
                var3.method2285(true);
            }
            for (class298 var4 = (class298) class120.field1695.method1540(arg1 ^ 0x6C); var4 != null; var4 = (class298) class120.field1695.method1544(arg1 + 125)) {
                if (var4.field4650 != null) {
                    class19.field255.method27(var4.field4650);
                    var4.field4650 = null;
                }
                var4.method2285(true);
            }
        }
        if (arg1 != 1) {
            method1007(80, -21);
        }
    }
}
