import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class49 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field810 = -1;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lcd;")
    public static class64 field812 = class44.method335((byte) 71, "huffman");

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "[[B")
    public static byte[][] field813 = new byte[250][];

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lcd;")
    public static class64 field811 = class44.method335((byte) 71, " weitere Optionen");

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lqm;Lqm;I)I", line = 14)
    public static final int method358(class222 arg0, class222 arg1, int arg2) {
        field809++;
        int var3 = 0;
        if (arg0.method1585(class312.field5281, arg2)) {
            var3++;
        }
        if (arg0.method1585(class183.field3137, 1)) {
            var3++;
        }
        if (arg0.method1585(class216.field3598, 1)) {
            var3++;
        }
        if (arg1.method1585(class312.field5281, 1)) {
            var3++;
        }
        if (arg1.method1585(class183.field3137, arg2)) {
            var3++;
        }
        if (arg1.method1585(class216.field3598, 1)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(JB)V", line = 52)
    public static final void method359(long arg0, byte arg1) {
        field814++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg1 != -55) {
            method360(77);
        }
        while (var3 < class202.field3453) {
            if (class47.field776[var3] == arg0) {
                class202.field3453--;
                class74.field1406++;
                for (int var4 = var3; var4 < class202.field3453; var4++) {
                    class29.field493[var4] = class29.field493[var4 + 1];
                    class154.field2726[var4] = class154.field2726[var4 + 1];
                    class183.field3131[var4] = class183.field3131[var4 + 1];
                    class47.field776[var4] = class47.field776[var4 + 1];
                    class255.field4426[var4] = class255.field4426[var4 + 1];
                    class153.field2707[var4] = class153.field2707[var4 + 1];
                }
                class47.field781 = class238.field4039;
                class17.field353.method1214(-124, 0);
                class17.field353.method161((byte) 92, arg0);
                break;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 101)
    public static void method360(int arg0) {
        if (arg0 != 1) {
            field813 = (byte[][]) ((byte[][]) null);
        }
        field813 = (byte[][]) null;
        field811 = null;
        field812 = null;
    }
}
