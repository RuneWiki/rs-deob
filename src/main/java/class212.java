import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class212 {

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Ldb;")
    public static class102 field3472 = new class102(16);

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3473 = "Close";

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "[I")
    public static int[] field3474 = new int[500];

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 19)
    public static final void method1527(int arg0) {
        if (arg0 == -6010) {
            class24.field327.method707(0);
            class172.field2858.method707(0);
            field3463++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIILda;B)V", line = 31)
    public static final void method1528(int arg0, int arg1, int arg2, int arg3, class155 arg4, byte arg5) {
        field3469++;
        if (arg4.field2398 == -1 && arg4.field2392 == null || arg5 >= -62) {
            return;
        }
        int var6 = 0;
        int var7 = class174.field2883 * arg4.field2396 >> 8;
        if (arg0 > arg4.field2374) {
            var6 += arg0 - arg4.field2374;
        } else if (arg4.field2395 > arg0) {
            var6 += arg4.field2395 - arg0;
        }
        if (arg2 > arg4.field2387) {
            var6 += arg2 - arg4.field2387;
        } else if (arg4.field2389 > arg2) {
            var6 += arg4.field2389 - arg2;
        }
        if (arg4.field2397 == 0 || (var6 - 64) > arg4.field2397 || class174.field2883 == 0 || arg4.field2394 != arg1) {
            if (arg4.field2375 != null) {
                class191.field3127.method118(arg4.field2375);
                arg4.field2375 = null;
            }
            if (arg4.field2399 != null) {
                class191.field3127.method118(arg4.field2399);
                arg4.field2399 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg4.field2397 - var6) * var7 / arg4.field2397;
        if (arg4.field2375 != null) {
            arg4.field2375.method1967(var8);
        } else if (arg4.field2398 >= 0) {
            class171 var9 = class171.method1267(class128.field1997, arg4.field2398, 0);
            if (var9 != null) {
                class125 var10 = var9.method1268().method911(class333.field5184);
                class272 var11 = class272.method1931(var10, 100, var8);
                var11.method1959(-1);
                class191.field3127.method120(var11);
                arg4.field2375 = var11;
            }
        }
        if (arg4.field2399 != null) {
            arg4.field2399.method1967(var8);
            if (!arg4.field2399.method1214((byte) -55)) {
                arg4.field2399 = null;
            }
        } else if (arg4.field2392 != null && (arg4.field2400 -= arg3) <= 0) {
            int var12 = (int) (Math.random() * (double) arg4.field2392.length);
            class171 var13 = class171.method1267(class128.field1997, arg4.field2392[var12], 0);
            if (var13 != null) {
                class125 var14 = var13.method1268().method911(class333.field5184);
                class272 var15 = class272.method1931(var14, 100, var8);
                var15.method1959(0);
                class191.field3127.method120(var15);
                arg4.field2400 = (int) ((double) (arg4.field2382 - arg4.field2388) * Math.random()) + arg4.field2388;
                arg4.field2399 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILak;)I", line = 161)
    public static final int method1529(int arg0, class172 arg1) {
        if (arg0 != 255) {
            return -105;
        }
        field3470++;
        int var2 = 0;
        if (arg1.method1276(class67.field961, 117)) {
            var2++;
        }
        if (arg1.method1276(class100.field1454, arg0 - 354)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 180)
    public static final void method1530(byte arg0) {
        field3466++;
        if (arg0 >= -18) {
            method1532(15, 16);
        }
        class184.field3042 = new class169();
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)Z", line = 196)
    public static final boolean method1531(byte arg0) {
        if (arg0 != -81) {
            method1532(127, 126);
        }
        field3464++;
        class23 var1 = class29.field396;
        synchronized (class29.field396) {
            if (class53.field753 == class159.field2635) {
                return false;
            } else {
                class176.field2933 = class213.field3480[class53.field753];
                class54.field767 = class192.field3139[class53.field753];
                class53.field753 = class53.field753 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V", line = 218)
    public static final void method1532(int arg0, int arg1) {
        class316.field4898[arg1] = (float) client.method767(arg0, 255) / 255.0F;
        class316.field4898[0] = (float) (client.method767(16719146, arg0) >> 16) / 255.0F;
        class316.field4898[1] = (float) client.method767(255, arg0 >> 8) / 255.0F;
        class50.method322(-1, 3);
        class50.method322(-1, 4);
        field3467++;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V", line = 230)
    public static void method1533(byte arg0) {
        field3474 = null;
        if (arg0 < 44) {
            field3474 = (int[]) null;
        }
        field3473 = null;
        field3472 = null;
    }
}
