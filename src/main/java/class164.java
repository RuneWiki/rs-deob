import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class164 extends class79 {

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "J")
    public long field2581;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "Lck;")
    public static class119 field2582 = class298.method1987((byte) 86, "m");

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "[I")
    public static int[] field2586 = new int[100];

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field2584 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "Ljava/lang/Object;")
    public static Object field2583 = new Object();

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public static int field2592 = 0;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "Lck;")
    private static class119 field2596 = class298.method1987((byte) 44, "wave2:");

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "Lck;")
    public static class119 field2595 = class298.method1987((byte) 34, "Mem:");

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "Lck;")
    public static class119 field2594 = field2596;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "Lck;")
    public static class119 field2593 = field2596;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "Lmd;")
    public static class88 field2579;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -569653402) {
            field2594 = (class119) null;
        }
        field2590++;
        if (arg6 - arg5 >= class79.field1226 && (arg6 + arg5) <= class59.field957 && class108.field1650 <= arg0 - arg5 && arg0 + arg5 <= class236.field3800) {
            class268.method1779(0, arg0, arg3, arg4, arg5, arg6, arg2);
        } else {
            class166.method1049(arg0, arg4, 2, arg6, arg5, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([BIII)Z", line = 22)
    public static final boolean method1040(byte[] arg0, int arg1, int arg2, int arg3) {
        field2587++;
        boolean var4 = true;
        if (arg1 != 0) {
            return false;
        }
        class3 var5 = new class3(arg0);
        int var6 = -1;
        label76: while (true) {
            int var7 = var5.method17(true);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var12;
                class291 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method75(-32768);
                                        if (var17 == 0) {
                                            continue label76;
                                        }
                                        var5.method64((byte) 13);
                                    }
                                    int var10 = var5.method75(arg1 - 32768);
                                    if (var10 == 0) {
                                        continue label76;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    var12 = var5.method64((byte) -96) >> 2;
                                    int var13 = var8 >> 6 & 0x3F;
                                    var14 = arg3 + var13;
                                    var15 = arg2 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class291.method1939(0, var6);
                } while (var12 == 22 && !class198.field3168 && var16.field4776 == 0 && var16.field4773 != 1 && !var16.field4768);
                if (!var16.method1933(-109)) {
                    var4 = false;
                    class96.field1474++;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)V", line = 107)
    public static final void method1041(boolean arg0) {
        field2585++;
        Object var1 = field2583;
        synchronized (field2583) {
            if (!arg0) {
                method1044(true);
            }
            if (class163.field2578 != 0) {
                class163.field2578 = 1;
                try {
                    field2583.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V", line = 133)
    public static void method1042(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2586 = null;
        field2595 = null;
        field2594 = null;
        field2579 = null;
        field2596 = null;
        field2583 = null;
        field2582 = null;
        field2593 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 154)
    public class164() {
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V", line = 166)
    public static final void method1043(byte arg0) {
        field2588++;
        if (class242.field3888 != null) {
            class57 var1 = class242.field3888;
            synchronized (class242.field3888) {
                class242.field3888 = null;
            }
        }
        if (arg0 != -40) {
            method1042(-11);
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(Z)Lsa;", line = 186)
    public static final class179 method1044(boolean arg0) {
        field2580++;
        class179 var1 = (class179) class126.field1936.method583((byte) 106);
        if (var1 != null) {
            var1.method552((byte) -125);
            var1.method911((byte) 96);
            return var1;
        }
        if (arg0) {
            field2584 = -126;
        }
        class179 var2;
        do {
            var2 = (class179) class73.field1137.method583((byte) 122);
            if (var2 == null) {
                return null;
            }
            if (var2.method1149(0) > class110.method707((byte) 119)) {
                return null;
            }
            var2.method552((byte) 85);
            var2.method911((byte) 82);
        } while ((Long.MIN_VALUE & var2.field2212) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(J)V", line = 229)
    public class164(long arg0) {
        this.field2581 = arg0;
    }
}
