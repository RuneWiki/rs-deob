import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class158 {

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "[[I")
    public static int[][] field2525 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Z")
    public static boolean field2533 = false;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2529 = "Loaded world list data";

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lmm;")
    public static class43 field2531 = new class43();

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Z")
    public static boolean field2528;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 16)
    public static void method1278(int arg0) {
        field2525 = (int[][]) null;
        field2529 = null;
        field2531 = null;
        if (arg0 < 8) {
            field2529 = (String) null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLrn;Lrn;Lrn;Lrn;)V", line = 28)
    public static final void method1279(boolean arg0, class18 arg1, class18 arg2, class18 arg3, class18 arg4) {
        class228.field3561 = arg1;
        class342.field5424 = arg2;
        class332.field5099 = arg4;
        if (arg0) {
            method1284(-71, (String) null, 36);
        }
        field2532++;
        class42.field669 = arg3;
        class334.field5108 = new class342[class228.field3561.method185(false)][];
        class151.field2468 = new boolean[class228.field3561.method185(arg0)];
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILrn;)V", line = 44)
    public static final void method1280(int arg0, class18 arg1) {
        class329.field5074 = arg1;
        class243.field3786 = class329.field5074.method197((byte) 127, arg0);
        field2527++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V", line = 59)
    public static final void method1281(int arg0, int arg1) {
        class274.field4251 = arg0;
        class254.method1886(true, arg1);
        field2530++;
        class254.method1886(true, 4);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)Z", line = 73)
    public static final boolean method1282(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field2524++;
            return class240.field3737 ? true : class190.field2985;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)Ldg;", line = 94)
    public static final class211 method1283(boolean arg0) {
        field2526++;
        try {
            return new class354();
        } catch (Throwable var4) {
            try {
                if (!arg0) {
                    field2528 = false;
                }
                return (class211) Class.forName("ok").getDeclaredConstructor().newInstance();
            } catch (Throwable var3) {
                return new class291();
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 125)
    public static final void method1284(int arg0, String arg1, int arg2) {
        field2523++;
        if (arg0 != 10) {
            method1283(false);
        }
        class138 var3 = class149.method1242(arg2, arg0 - 10, 3);
        var3.method1153((byte) 50);
        var3.field2291 = arg1;
    }
}
