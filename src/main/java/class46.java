import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 extends RuntimeException {

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Ljava/lang/String;")
    public String field959;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field961;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lpe;")
    private static class109 field957 = class141.method1120("button near the top of that page)3", 0);

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lpe;")
    private static class109 field963 = class141.method1120("Loading )2 please wait)3", 0);

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lpe;")
    public static class109 field967 = field963;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field958 = 0;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field971 = 0;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lpe;")
    public static class109 field960 = field957;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static volatile int field972 = 0;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lpe;")
    public static class109 field956 = class141.method1120("Neuer Benutzer", 0);

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field970 = 0;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lpe;")
    private static class109 field973 = class141.method1120("Loading wordpack )2 ", 0);

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lpe;")
    public static class109 field965 = field973;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lvf;")
    public static class152 field968;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lg;")
    public static class43 field969;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBLha;I)V")
    public static final void method411(int arg0, int arg1, byte arg2, class50 arg3, int arg4) {
        if (arg2 != -26) {
            field957 = null;
        }
        field962++;
        if (class136.field2975 == arg3 || class63.field1302 >= 400) {
            return;
        }
        class109 var5;
        if (arg3.field1037 == 0) {
            var5 = class44.method405(new class109[] { arg3.field1051, class125.method1012(arg3.field1047, class136.field2975.field1047, -10), class42.field895, class86.field1845, class143.method1132(arg3.field1047, 117), class24.field569 }, (byte) -74);
        } else {
            var5 = class44.method405(new class109[] { arg3.field1051, class42.field895, class67.field1349, class143.method1132(arg3.field1037, arg2 + 124), class24.field569 }, (byte) -74);
        }
        if (class135.field2936 == 1) {
            class11.field247++;
            class121.method983(arg4, class92.field1982, arg1, arg0, arg2 + 74, 2, class44.method405(new class109[] { class20.field500, class88.field1867, var5 }, (byte) -74));
        } else if (!class139.field3031) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class50.field1040[var6] != null) {
                    class64.field1319++;
                    boolean var7 = false;
                    short var8 = 0;
                    if (class50.field1040[var6].method884(class25.field623, 107)) {
                        if (class136.field2975.field1047 < arg3.field1047) {
                            var8 = 2000;
                        }
                        if (class136.field2975.field1057 != 0 && arg3.field1057 != 0) {
                            if (class136.field2975.field1057 == arg3.field1057) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class68.field1378[var6]) {
                        var8 = 2000;
                    }
                    int var9 = class156.field3599[var6] + var8;
                    class121.method983(arg4, class50.field1040[var6], arg1, arg0, 48, var9, class44.method405(new class109[] { class126.field2803, var5 }, (byte) -74));
                }
            }
        } else if ((class18.field438 & 0x8) == 8) {
            class13.field304++;
            class121.method983(arg4, class123.field2698, arg1, arg0, 48, 9, class44.method405(new class109[] { class25.field621, class88.field1867, var5 }, (byte) -74));
        }
        for (int var10 = 0; var10 < class63.field1302; var10++) {
            if (class149.field3285[var10] == 40) {
                class101.field2135[var10] = class44.method405(new class109[] { class126.field2803, var5 }, (byte) -74);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class46(Throwable arg0, String arg1) {
        this.field959 = arg1;
        this.field961 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method412(byte arg0) {
        field963 = null;
        field965 = null;
        field960 = null;
        field969 = null;
        field957 = null;
        if (arg0 > 119) {
            field968 = null;
            field956 = null;
            field973 = null;
            field967 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static final void method413(int arg0) {
        class152.field3342 = null;
        class131.field2879 = null;
        class92.field1970 = null;
        class120.field2668 = null;
        field964++;
        class107.field2246 = null;
        if (arg0 != -18078) {
            field972 = -107;
        }
        class57.field1142 = null;
    }
}
