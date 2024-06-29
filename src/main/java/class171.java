import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class171 extends class21 implements Runnable {

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public int field2285 = -1;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Z")
    private boolean field2291 = true;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "Lnl;")
    private class143 field2294;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Z")
    public static volatile boolean field2296 = true;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2295 = "Select";

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "Ljava/lang/String;")
    public static String field2300 = "Loaded config";

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field2293 = 0;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public static void method1055(int arg0) {
        if (arg0 != 2) {
            method1063(-28, 124, (byte) 117);
        }
        field2300 = null;
        field2295 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI)I")
    public static final int method1056(int arg0, byte arg1, int arg2) {
        if (arg1 != -7) {
            method1056(-40, (byte) -95, -34);
        }
        field2288++;
        int var3 = arg0 + (arg2 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return (var5 & 0x7FB787E) >> 19;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method1057(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5) {
        field2292++;
        if (arg5 <= -29) {
            class366.method2387((String) null, arg0, 0, arg3, -1, arg1, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public static final void method1058(int arg0) {
        if ((class293.field4176 < class293.field4179)) {
            class293.field4176 = (float) ((double) class293.field4176 / 30.0D + (double) class293.field4176);
            if (class293.field4176 > class293.field4179) {
                class293.field4176 = class293.field4179;
            }
            class62.method436((byte) -105);
            class293.field4185 = (int) class293.field4176 >> 1;
            class293.field4183 = class59.method415((byte) -98, class293.field4185);
        } else if (class293.field4179 < class293.field4176) {
            class293.field4176 = (float) ((double) class293.field4176 - (double) class293.field4176 / 30.0D);
            if (class293.field4176 < class293.field4179) {
                class293.field4176 = class293.field4179;
            }
            class62.method436((byte) -105);
            class293.field4185 = (int) class293.field4176 >> 1;
            class293.field4183 = class59.method415((byte) -102, class293.field4185);
        }
        field2290++;
        if (arg0 < 69) {
            return;
        }
        if (class28.field399 != -1 && class135.field1874 != -1) {
            int var1 = class28.field399 - class44.field624;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class135.field1874 - class373.field5426;
            class44.field624 += var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class373.field5426 -= -var2;
            if (var1 == 0 && var2 == 0) {
                class135.field1874 = -1;
                class28.field399 = -1;
            }
            class62.method436((byte) -105);
        }
        if (class449.field6577 <= 0) {
            class372.field5415 = -1;
            class319.field4665 = -1;
        } else {
            class249.field3365--;
            if (class249.field3365 == 0) {
                class249.field3365 = 100;
                class449.field6577--;
            }
        }
        if (!class265.field3841 || class56.field747 == null) {
            return;
        }
        for (class144 var3 = (class144) class56.field747.method332(-2130841184); var3 != null; var3 = (class144) class56.field747.method343((byte) -101)) {
            class7 var4 = class99.method674(36, var3.field1973.field3323);
            if (class435.field6397 == 0 && var3.method917(class323.field4747, class124.field1728, 16695)) {
                if (var4.field89 != null) {
                    if (var4.field89[4] != null) {
                        class41.method299(0, -1, var4.field89[4], (long) var3.field1973.field3323, var4.field113, 1001, false, var4.field100);
                    }
                    if (var4.field89[3] != null) {
                        class41.method299(0, -1, var4.field89[3], (long) var3.field1973.field3323, var4.field113, 1012, false, var4.field100);
                    }
                    if (var4.field89[2] != null) {
                        class41.method299(0, -1, var4.field89[2], (long) var3.field1973.field3323, var4.field113, 1002, false, var4.field100);
                    }
                    if (var4.field89[1] != null) {
                        class41.method299(0, -1, var4.field89[1], (long) var3.field1973.field3323, var4.field113, 1010, false, var4.field100);
                    }
                    if (var4.field89[0] != null) {
                        class41.method299(0, -1, var4.field89[0], (long) var3.field1973.field3323, var4.field113, 1007, false, var4.field100);
                    }
                }
                if (!var3.field1973.field3320) {
                    var3.field1973.field3320 = true;
                    class123.method782(15, var3.field1973.field3323, var4.field100);
                }
                if (var3.field1973.field3320) {
                    class123.method782(17, var3.field1973.field3323, var4.field100);
                }
            } else if (var3.field1973.field3320) {
                var3.field1973.field3320 = false;
                class123.method782(16, var3.field1973.field3323, var4.field100);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
    public final void method1059(int arg0) {
        field2286++;
        if (arg0 == 0) {
            (new Thread(this, "a")).start();
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILwl;Lcl;IIIILjava/lang/String;Lps;Lud;)V")
    public static final void method1060(int arg0, int arg1, int arg2, class273 arg3, class313 arg4, int arg5, int arg6, int arg7, int arg8, String arg9, class394 arg10, class2 arg11) {
        field2287++;
        int var12;
        if (class346.field4979 == 4) {
            var12 = (int) class396.field5847 & 0x3FFF;
        } else {
            var12 = (int) class396.field5847 + class399.field5948 & 0x3FFF;
        }
        int var13 = 85 % ((arg2 - 31) / 42);
        int var14 = Math.max(arg10.field5773 / 2, arg10.field5672 / 2) + 10;
        int var15 = arg0 * arg0 + arg6 * arg6;
        if (var14 * var14 < var15) {
            return;
        }
        int var16 = class117.field1644[var12];
        int var17 = class117.field1636[var12];
        if (class346.field4979 != 4) {
            var17 = var17 * 256 / (class364.field5261 + 256);
            var16 = var16 * 256 / (class364.field5261 + 256);
        }
        int var18 = arg0 * var17 + arg6 * var16 >> 15;
        int var19 = arg6 * var17 - (arg0 * var16) >> 15;
        int var20 = arg4.method2117(100, arg9, (class67[]) null, 125);
        int var21 = arg4.method2126(arg9, 0, 100, 0, (class67[]) null);
        int var22 = var18 - var20 / 2;
        if ((-arg10.field5773) <= var22 && var22 <= arg10.field5773 && (-arg10.field5672) <= var19 && arg10.field5672 >= var19) {
            arg3.method1877(arg7, arg7 + (arg10.field5672 / 2) - arg8 - var19 - var21, arg9, (int[]) null, arg5, arg1, 0, (class67[]) null, arg10.field5773 / 2 + var22 + arg1, var20, arg11, 0, 50, (byte) -26, 0, 1);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public final void method1061(byte arg0) {
        this.field2291 = false;
        field2289++;
        if (arg0 < 33) {
            this.field2285 = -79;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZILlm;Llm;)V")
    public static final void method1062(boolean arg0, int arg1, class347 arg2, class347 arg3) {
        class349.field5042 = arg0;
        class278.field4028 = arg2;
        class32.field456 = arg3;
        field2297++;
        if (arg1 >= -113) {
            field2293 = 65;
        }
    }

    @OriginalMember(owner = "client!ua", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2291) {
            this.field2294.method906(this, -24);
        }
        field2298++;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lnl;)V")
    public class171(class143 arg0) {
        this.field2294 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)V")
    public static final void method1063(int arg0, int arg1, byte arg2) {
        if (arg2 <= 73) {
            field2296 = true;
        }
        field2299++;
        class191.field2561[arg1] = arg0;
        class416 var3 = (class416) class312.field4570.method384((long) arg1, true);
        if (var3 == null) {
            class416 var4 = new class416(class114.method735(104) + 500L);
            class312.field4570.method381(true, var4, (long) arg1);
        } else {
            var3.field6108 = class114.method735(106) + 500L;
        }
    }
}
