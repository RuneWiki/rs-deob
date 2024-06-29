import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class41 extends class3 {

    @OriginalMember(owner = "client!en", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field871;

    @OriginalMember(owner = "client!en", name = "N", descriptor = "[[[I")
    public static int[][][] field872 = new int[4][13][13];

    @OriginalMember(owner = "client!en", name = "Q", descriptor = "I")
    public static int field875 = 127;

    @OriginalMember(owner = "client!en", name = "H", descriptor = "[Lud;")
    public static class279[] field866 = new class279[8];

    @OriginalMember(owner = "client!en", name = "U", descriptor = "[F")
    public static float[] field879 = new float[4];

    @OriginalMember(owner = "client!en", name = "I", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!en", name = "J", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!en", name = "K", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!en", name = "L", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!en", name = "O", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!en", name = "P", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!en", name = "R", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!en", name = "S", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!en", name = "T", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V", line = 4)
    public static void method351(int arg0) {
        field879 = null;
        int var1 = -5 % ((-arg0 - 36) / 46);
        field872 = (int[][][]) null;
        field866 = null;
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(B)Ljava/lang/Object;", line = 17)
    public final Object method21(byte arg0) {
        if (arg0 == 37) {
            field874++;
            return this.field871;
        } else {
            return (Object) null;
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 34)
    public class41(Object arg0) {
        this.field871 = arg0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lud;I)V", line = 49)
    public static final void method352(class279 arg0, int arg1) {
        if (arg1 == 30922) {
            field870++;
            class85.method733(false, arg1 - 30923);
            class200.method1488(arg0, 57);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III)I", line = 71)
    public static final int method353(int arg0, int arg1, int arg2) {
        field877++;
        int var3 = class218.method1598(arg0 - 1, arg2 + -1, false) - (-class218.method1598(arg0 - 1, arg2 + 1, false) - (class218.method1598(arg0 + 1, arg2 + -1, false) + class218.method1598(arg0 + 1, arg2 + 1, false)));
        int var4 = class218.method1598(arg0, arg2 - 1, false) + (class218.method1598(arg0, arg2 + 1, false) - (-class218.method1598(arg0 - 1, arg2, false) - class218.method1598(arg0 + 1, arg2, false)));
        if (arg1 != 7853) {
            field879 = (float[]) null;
        }
        int var5 = class218.method1598(arg0, arg2, false);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)Z", line = 97)
    public final boolean method22(int arg0) {
        field867++;
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)Z", line = 111)
    public static final boolean method354(int arg0, int arg1) {
        if (arg1 < 106) {
            field866 = (class279[]) null;
        }
        field869++;
        return arg0 >= 0 && class33.field740.length > arg0 ? class33.field740[arg0] : false;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IB)Llf;", line = 128)
    public static final class124 method355(int arg0, byte arg1) {
        int var2 = 78 % ((14 - arg1) / 51);
        field868++;
        class124 var3 = (class124) class249.field4427.method1336((long) arg0, 0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class262.field4690.method1192(0, 1, arg0);
        class124 var5 = new class124();
        if (var4 != null) {
            var5.method987(0, arg0, new class53(var4));
        }
        class249.field4427.method1331(var5, 30237, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Laj;I)V", line = 148)
    public static final void method356(class1 arg0, int arg1) {
        field873++;
        arg0.field20 = false;
        if (arg0.field25 != -1) {
            class182 var2 = class131.method1033((byte) -82, arg0.field25);
            if (var2 == null || var2.field3341 == null) {
                arg0.field25 = -1;
            } else {
                arg0.field66++;
                if (var2.field3341.length > arg0.field14 && var2.field3318[arg0.field14] < arg0.field66) {
                    arg0.field66 = 1;
                    arg0.field14++;
                    arg0.field9++;
                    class194.method1460(class72.field1420 == arg0, arg0.field86, arg0.field14, var2, arg0.field79, (byte) 117);
                }
                if (var2.field3341.length <= arg0.field14) {
                    arg0.field66 = 0;
                    arg0.field14 = 0;
                    class194.method1460(class72.field1420 == arg0, arg0.field86, arg0.field14, var2, arg0.field79, (byte) 120);
                }
                arg0.field9 = arg0.field14 + 1;
                if (var2.field3341.length <= arg0.field9) {
                    arg0.field9 = 0;
                }
            }
        }
        if (arg0.field81 != -1 && class8.field279 >= arg0.field75) {
            int var3 = class103.method874(arg0.field81, -601).field3755;
            if (var3 == -1) {
                arg0.field81 = -1;
            } else {
                class182 var4 = class131.method1033((byte) -82, var3);
                if (var4 == null || var4.field3341 == null) {
                    arg0.field81 = -1;
                } else {
                    if (arg0.field5 < 0) {
                        arg0.field5 = 0;
                        class194.method1460(class72.field1420 == arg0, arg0.field86, 0, var4, arg0.field79, (byte) 106);
                    }
                    arg0.field102++;
                    if (arg0.field5 < var4.field3341.length && arg0.field102 > var4.field3318[arg0.field5]) {
                        arg0.field5++;
                        arg0.field102 = 1;
                        class194.method1460(class72.field1420 == arg0, arg0.field86, arg0.field5, var4, arg0.field79, (byte) 100);
                    }
                    if (arg0.field5 >= var4.field3341.length) {
                        arg0.field81 = -1;
                    }
                    arg0.field2 = arg0.field5 + 1;
                    if (arg0.field2 >= var4.field3341.length) {
                        arg0.field2 = -1;
                    }
                }
            }
        }
        if (arg1 > -39) {
            field872 = (int[][][]) ((int[][][]) null);
        }
        if (arg0.field30 != -1 && arg0.field27 <= 1) {
            class182 var5 = class131.method1033((byte) -82, arg0.field30);
            if (var5.field3339 == 1 && arg0.field16 > 0 && class8.field279 >= arg0.field65 && arg0.field98 < class8.field279) {
                arg0.field27 = 1;
                return;
            }
        }
        if (arg0.field30 != -1 && arg0.field27 == 0) {
            class182 var6 = class131.method1033((byte) -82, arg0.field30);
            if (var6 == null || var6.field3341 == null) {
                arg0.field30 = -1;
            } else {
                arg0.field101++;
                if (arg0.field18 < var6.field3341.length && arg0.field101 > var6.field3318[arg0.field18]) {
                    arg0.field101 = 1;
                    arg0.field18++;
                    class194.method1460(class72.field1420 == arg0, arg0.field86, arg0.field18, var6, arg0.field79, (byte) 118);
                }
                if (var6.field3341.length <= arg0.field18) {
                    arg0.field69++;
                    arg0.field18 -= var6.field3350;
                    if (var6.field3344 <= arg0.field69) {
                        arg0.field30 = -1;
                    } else if (arg0.field18 >= 0 && var6.field3341.length > arg0.field18) {
                        class194.method1460(class72.field1420 == arg0, arg0.field86, arg0.field18, var6, arg0.field79, (byte) 122);
                    } else {
                        arg0.field30 = -1;
                    }
                }
                arg0.field29 = arg0.field18 + 1;
                if (arg0.field29 >= var6.field3341.length) {
                    arg0.field29 -= var6.field3350;
                    if ((arg0.field69 + 1) >= var6.field3344) {
                        arg0.field29 = -1;
                    } else if (arg0.field29 < 0 || arg0.field29 >= var6.field3341.length) {
                        arg0.field29 = -1;
                    }
                }
                arg0.field20 = var6.field3349;
            }
        }
        if (arg0.field27 > 0) {
            arg0.field27--;
        }
        for (int var7 = 0; var7 < arg0.field87.length; var7++) {
            class266 var8 = arg0.field87[var7];
            if (var8 != null) {
                if (var8.field4791 > 0) {
                    var8.field4791--;
                } else {
                    class182 var9 = class131.method1033((byte) -82, var8.field4783);
                    if (var9 == null || var9.field3341 == null) {
                        arg0.field87[var7] = null;
                    } else {
                        var8.field4789++;
                        if (var9.field3341.length > var8.field4796 && var9.field3318[var8.field4796] < var8.field4789) {
                            var8.field4796++;
                            var8.field4789 = 1;
                            class194.method1460(class72.field1420 == arg0, arg0.field86, var8.field4796, var9, arg0.field79, (byte) 113);
                        }
                        if (var8.field4796 >= var9.field3341.length) {
                            var8.field4796 -= var9.field3350;
                            var8.field4793++;
                            if (var8.field4793 >= var9.field3344) {
                                arg0.field87[var7] = null;
                            } else if (var8.field4796 >= 0 && var8.field4796 < var9.field3341.length) {
                                class194.method1460(class72.field1420 == arg0, arg0.field86, var8.field4796, var9, arg0.field79, (byte) 110);
                            } else {
                                arg0.field87[var7] = null;
                            }
                        }
                        var8.field4787 = var8.field4796 + 1;
                        if (var9.field3341.length <= var8.field4787) {
                            var8.field4787 -= var9.field3350;
                            if (var8.field4793 + 1 >= var9.field3344) {
                                var8.field4787 = -1;
                            } else if (var8.field4787 < 0 || var9.field3341.length <= var8.field4787) {
                                var8.field4787 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([[IZIIII)I", line = 371)
    public static final int method357(int[][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field878++;
        if (!arg1) {
            method357((int[][]) ((int[][]) null), true, -50, -7, -75, -71);
        }
        int var6 = (128 - arg4) * arg0[arg2][arg5] + arg0[arg2 + 1][arg5] * arg4 >> 7;
        int var7 = (128 - arg4) * arg0[arg2][arg5 + 1] + arg0[arg2 + 1][arg5 + 1] * arg4 >> 7;
        return (128 - arg3) * var6 + arg3 * var7 >> 7;
    }
}
