import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class321 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lac;")
    private class541 field4308;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field4312;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Z")
    public static boolean field4310 = false;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lsv;")
    public static class659 field4313;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lhaa;")
    public static class82 field4309;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BIIII)V", line = 4)
    public static final void method1915(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4307++;
        float var5 = (float) class642.field8956 / (float) class642.field8961;
        int var6 = arg2;
        if (arg0 < 47) {
            method1917(43, null, true, -10, null);
        }
        int var7 = arg4;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg1 - (arg4 - var7) / 2;
        int var9 = arg3 - (arg2 - var6) / 2;
        class450.field6297 = class642.field8956 - (class642.field8956 * var8 / var7);
        class239.field3133 = -1;
        class278.field3706 = -1;
        class510.field6893 = class642.field8961 * var9 / var6;
        class582.method3255(-1);
    }

    @OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() throws Throwable {
        field4316++;
        this.field4308.method3015(this.field4312, 2834);
        super.finalize();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 50)
    public static void method1916(byte arg0) {
        if (arg0 == 44) {
            field4309 = null;
            field4313 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjha;ZILjha;)I", line = 61)
    public static final int method1917(int arg0, class695 arg1, boolean arg2, int arg3, class695 arg4) {
        field4311++;
        if (arg0 == 1) {
            int var5 = arg1.field697;
            int var6 = arg4.field697;
            if (!arg2) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 == 2) {
            return class387.method2262(arg1.method3925(arg3).field2161, arg4.method3925(-1).field2161, class723.field10095, 1166845806);
        } else if (arg0 == 3) {
            if (arg1.field9706.equals("-")) {
                if (arg4.field9706.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field9706.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class387.method2262(arg1.field9706, arg4.field9706, class723.field10095, 1166845806);
            }
        } else if (arg0 == 4) {
            if (arg1.method491((byte) 122)) {
                return arg4.method491((byte) 122) ? 0 : 1;
            } else if (arg4.method491((byte) 127)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 5) {
            if (arg1.method489(9811)) {
                return arg4.method489(9811) ? 0 : 1;
            } else if (arg4.method489(9811)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 != 6) {
            if (arg3 != -1) {
                method1917(-89, null, true, -108, null);
            }
            if (arg0 == 7) {
                if (arg1.method493(false)) {
                    return arg4.method493(false) ? 0 : 1;
                } else if (arg4.method493(false)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 8) {
                int var7 = arg1.field9707;
                int var8 = arg4.field9707;
                if (arg2) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg1.field9709 - arg4.field9709;
            }
        } else if (arg1.method492((byte) 72)) {
            return arg4.method492((byte) 90) ? 0 : 1;
        } else if (arg4.method492((byte) 60)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILha;IBI)V", line = 163)
    public static final void method1918(int arg0, int arg1, class60 arg2, int arg3, byte arg4, int arg5) {
        arg2.method426(arg0, arg3, arg0 + arg1, arg3 + arg5);
        field4314++;
        arg2.method368(arg1, arg5, arg3, -16777216, (byte) -66, arg0);
        if (class491.field6703 < 100) {
            return;
        }
        float var6 = (float) class642.field8956 / (float) class642.field8961;
        int var7 = arg1;
        int var8 = arg5;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg1 * var6);
        } else {
            var7 = (int) ((float) arg5 / var6);
        }
        int var9 = (arg1 - var7) / 2 + arg0;
        int var10 = (arg5 - var8) / 2 + arg3;
        if (class599.field8344 == null || class599.field8344.method674() != arg1 || arg5 != class599.field8344.method676()) {
            class642.method3622(class642.field8947, class642.field8956 + class642.field8950, class642.field8961 + class642.field8947, class642.field8950, var9, var10, var9 + var7, var8 + var10);
            class642.method3623(arg2);
            class599.field8344 = arg2.method414(var9, var10, var7, var8, false);
        }
        if (arg4 != -90) {
            return;
        }
        class599.field8344.method3859(var9, var10);
        int var11 = class487.field6677 * var7 / class642.field8961;
        int var12 = class561.field7923 * var8 / class642.field8956;
        int var13 = class18.field124 * var7 / class642.field8961 + var9;
        int var14 = var8 + var10 - (class191.field2306 * var8 / class642.field8956) - var12;
        int var15 = -1996554240;
        if (class639.field8868 == class51.field541) {
            var15 = -1996488705;
        }
        arg2.method447(var13, var14, var11, var12, var15, 1);
        arg2.method391(var13, var14, var11, var12, var15, 0);
        if (class41.field420 <= 0) {
            return;
        }
        int var16;
        if (class354.field4718 <= 50) {
            var16 = class354.field4718 * 5;
        } else {
            var16 = 500 - (class354.field4718 * 5);
        }
        for (class513 var17 = (class513) class642.field8937.method724(32); var17 != null; var17 = (class513) class642.field8937.method723(105)) {
            class292 var18 = class642.field8929.method1647(117, var17.field6940);
            if (class653.method3685(arg4 + 215, var18)) {
                if (class572.field8051 == var17.field6940) {
                    int var19 = var17.field6945 * var7 / class642.field8961 + var9;
                    int var20 = var10 + ((class642.field8956 - var17.field6939) * var8 / class642.field8956);
                    arg2.method368(4, 4, var20 - 2, var16 << 24 | 0xFFFF00, (byte) -66, var19 - 2);
                } else if (class251.field3238 != -1 && class251.field3238 == var18.field3880) {
                    int var21 = var17.field6945 * var7 / class642.field8961 + var9;
                    int var22 = (class642.field8956 - var17.field6939) * var8 / class642.field8956 + var10;
                    arg2.method368(4, 4, var22 - 2, var16 << 24 | 0xFFFF00, (byte) -66, var21 - 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I", line = 258)
    public static int method1919(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 265)
    public static final void method1920(boolean arg0) {
        if (class739.field10304.toLowerCase().indexOf("microsoft") == -1) {
            class653.field9094[45] = 26;
            class653.field9094[92] = 74;
            class653.field9094[46] = 72;
            class653.field9094[59] = 57;
            class653.field9094[47] = 73;
            class653.field9094[91] = 42;
            if (class739.field10308 == null) {
                class653.field9094[222] = 59;
                class653.field9094[192] = 58;
            } else {
                class653.field9094[222] = 58;
                class653.field9094[520] = 59;
                class653.field9094[192] = 28;
            }
            class653.field9094[61] = 27;
            class653.field9094[93] = 43;
            class653.field9094[44] = 71;
        } else {
            class653.field9094[192] = 58;
            class653.field9094[191] = 73;
            class653.field9094[220] = 74;
            class653.field9094[221] = 43;
            class653.field9094[188] = 71;
            class653.field9094[190] = 72;
            class653.field9094[189] = 26;
            class653.field9094[223] = 28;
            class653.field9094[187] = 27;
            class653.field9094[219] = 42;
            class653.field9094[222] = 59;
            class653.field9094[186] = 57;
        }
        field4315++;
        if (arg0) {
            method1917(-70, null, false, 0, null);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lac;II)V", line = 319)
    public class321(class541 arg0, int arg1, int arg2) {
        this.field4308 = arg0;
        this.field4312 = arg2;
    }
}
