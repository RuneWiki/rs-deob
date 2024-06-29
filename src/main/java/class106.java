import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class106 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[J")
    public static long[] field2412 = new long[100];

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Lff;")
    public static class54 field2411 = null;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lgg;")
    public static class63 field2420 = null;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lgg;")
    public static class63 field2417 = class116.method911(43, "headicons_pk");

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field2418 = 0;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[Lgg;")
    public static class63[] field2414 = new class63[500];

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field2419 = 0;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lgg;")
    private static class63 field2415 = class116.method911(43, "Create a free account");

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Lgg;")
    public static class63 field2413 = field2415;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "[[I")
    public static int[][] field2423 = new int[5][5000];

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field2421 = 0;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Lgg;")
    private static class63 field2424 = class116.method911(43, " is already on your friend list)3");

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lgg;")
    public static class63 field2422 = field2424;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static final void method866(byte arg0) {
        class99 var1 = class192.field3900;
        synchronized (class192.field3900) {
            class168.field3471 = class12.field278;
            int var2 = 89 % ((arg0 + 74) / 32);
            class100.field2365 = class13.field314;
            class188.field3794 = class154.field3215;
            class158.field3280 = class84.field1990;
            class110.field2480 = class202.field3995;
            class143.field3074 = class75.field1852;
            class123.field2723 = class63.field1629;
            class84.field1990 = 0;
        }
        field2416++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
    public static final void method867(int arg0, int arg1, int arg2) {
        class96 var3 = class148.field3117[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2271 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method868(int arg0) {
        field2413 = null;
        field2417 = null;
        field2415 = null;
        field2423 = null;
        field2422 = null;
        field2412 = null;
        field2420 = null;
        field2424 = null;
        field2414 = null;
        field2411 = null;
        if (arg0 != 19304) {
            method867(-97, 14, 36);
        }
    }
}
