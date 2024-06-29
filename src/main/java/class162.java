import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class162 implements Runnable {

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "[Log;")
    public volatile class225[] field2616 = new class225[2];

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Z")
    public volatile boolean field2613 = false;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Z")
    public volatile boolean field2615 = false;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2614 = "Opened title screen";

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field2617 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Lte;")
    public class124 field2621;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Loj;")
    public static class283 field2618;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIILsc;IJIIII)Z", line = 6)
    public static final boolean method1034(int arg0, int arg1, int arg2, int arg3, class19 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class196.method1262(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBZFIIIII)[[I", line = 17)
    public static final int[][] method1035(int arg0, byte arg1, boolean arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int[][] var9 = new int[arg4][arg5];
        field2619++;
        class157 var10 = new class157();
        var10.field2556 = arg2;
        var10.field2566 = arg0;
        var10.field2552 = arg7;
        var10.field2560 = arg8;
        var10.field2557 = (int) (arg3 * 4096.0F);
        var10.method183((byte) 91);
        class234.method1553(true, arg4, arg5);
        int var11 = 0;
        int var12 = -87 % ((arg1 - 8) / 48);
        while (var11 < arg4) {
            var10.method1018(var9[var11], -29163, var11);
            var11++;
        }
        return var9;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Lea;", line = 48)
    public static final class11 method1036(int arg0, int arg1, int arg2) {
        class47 var3 = class326.field4975[arg0][arg1][arg2];
        return var3 == null ? null : var3.field975;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lkl;IIZI)V", line = 58)
    public static final void method1037(class68 arg0, int arg1, int arg2, boolean arg3, int arg4) {
        int var5 = arg0.field1416;
        int var6 = arg0.field1414;
        if (arg0.field1442 == 0) {
            arg0.field1416 = arg0.field1381;
        } else if (arg0.field1442 == 1) {
            arg0.field1416 = arg2 - arg0.field1381;
        } else if (arg0.field1442 == 2) {
            arg0.field1416 = arg0.field1381 * arg2 >> 14;
        } else if (arg0.field1442 == 3) {
            if (arg0.field1358 == 2) {
                arg0.field1416 = (arg0.field1381 - 1) * arg0.field1318 + arg0.field1381 * 32;
            } else if (arg0.field1358 == 7) {
                arg0.field1416 = (arg0.field1381 - 1) * arg0.field1318 + arg0.field1381 * 115;
            }
        }
        if (arg0.field1347 == 0) {
            arg0.field1414 = arg0.field1386;
        } else if (arg0.field1347 == 1) {
            arg0.field1414 = arg4 - arg0.field1386;
        } else if (arg0.field1347 == 2) {
            arg0.field1414 = arg0.field1386 * arg4 >> 14;
        } else if (arg0.field1347 == 3) {
            if (arg0.field1358 == 2) {
                arg0.field1414 = arg0.field1386 * 32 + ((arg0.field1386 - 1) * arg0.field1389);
            } else if (arg0.field1358 == 7) {
                arg0.field1414 = arg0.field1386 * 12 + ((arg0.field1386 - 1) * arg0.field1389);
            }
        }
        field2611++;
        if (arg0.field1442 == 4) {
            arg0.field1416 = arg0.field1432 * arg0.field1414 / arg0.field1379;
        }
        int var7 = -99 % ((arg1 - 28) / 57);
        if (arg0.field1347 == 4) {
            arg0.field1414 = arg0.field1416 * arg0.field1379 / arg0.field1432;
        }
        if (class29.field551 && (client.method359(arg0).field4125 != 0 || arg0.field1358 == 0)) {
            if (arg0.field1414 < 5 && arg0.field1416 < 5) {
                arg0.field1414 = 5;
                arg0.field1416 = 5;
            } else {
                if (arg0.field1414 <= 0) {
                    arg0.field1414 = 5;
                }
                if (arg0.field1416 <= 0) {
                    arg0.field1416 = 5;
                }
            }
        }
        if (arg0.field1438 == 1337) {
            client.field908 = arg0;
        }
        if (arg3 && arg0.field1315 != null && (arg0.field1416 != var5 || arg0.field1414 != var6)) {
            class106 var8 = new class106();
            var8.field1841 = arg0.field1315;
            var8.field1823 = arg0;
            class12.field238.method427((byte) -110, var8);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 159)
    public static void method1038(byte arg0) {
        field2618 = null;
        if (arg0 < -71) {
            field2614 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "run", descriptor = "()V", line = 176)
    public final void run() {
        field2620++;
        this.field2615 = true;
        try {
            while (!this.field2613) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class225 var2 = this.field2616[var1];
                    if (var2 != null) {
                        var2.method1499((byte) 114);
                    }
                }
                class127.method843(-54, 10L);
                class215.method1446(this.field2621, (byte) -105, (Object) null);
            }
        } catch (Exception var7) {
            class106.method694(var7, (String) null, (byte) -121);
        } finally {
            this.field2615 = false;
        }
    }
}
