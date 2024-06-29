import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class135 extends class292 {

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public int field2110 = 0;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    public static int field2111 = 0;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "Luf;")
    public static class176 field2109;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
    public static void method949(byte arg0) {
        field2109 = null;
        if (arg0 != 103) {
            method950(21);
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
    public static final void method950(int arg0) {
        if (class261.field4058 != null && class261.field4058.field4176 - (class261.field4058.method226((byte) -97) - 1) * 64 >> 7 == class177.field2656 && class261.field4058.field4123 + 64 - (class261.field4058.method226((byte) -97) * 64) >> 7 == class8.field162) {
            class177.field2656 = 0;
        }
        for (int var1 = arg0; var1 < 104; var1++) {
            for (int var6 = 0; var6 < 104; var6++) {
                class295.field4643[var1][var6] = 0;
            }
        }
        for (int var2 = 0; var2 < class5.field78; var2++) {
            class28 var5 = class41.field675[class166.field2510[var2]];
            if (var5 != null) {
                var5.field4122 = false;
            }
        }
        field2112++;
        for (int var3 = 0; var3 < class62.field1006; var3++) {
            class32 var4 = class72.field1144[class198.field3113[var3]];
            if (var4 != null) {
                var4.field4122 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILf;I)V")
    private final void method951(int arg0, class37 arg1, int arg2) {
        field2108++;
        if (arg2 == 2) {
            this.field2110 = arg1.method293(-17);
        }
        int var4 = 86 % ((arg0 + 59) / 51);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lf;I)V")
    public final void method952(class37 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method333((byte) -59);
            if (var3 == 0) {
                field2113++;
                if (arg1 != 0) {
                    field2106 = -97;
                    return;
                }
                return;
            }
            this.method951(-122, arg0, var3);
        }
    }
}
