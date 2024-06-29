import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class218 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Ljd;")
    public static class86 field3917 = class122.method868("Nehmen", true);

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "[I")
    public static int[] field3921 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Ljd;")
    public static class86 field3922 = class122.method868("Konfig geladen)3", true);

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lrk;")
    public static class257 field3919 = new class257();

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Ljd;")
    public static class86 field3924 = class122.method868(" steht bereits auf Ihrer Ignorieren)2Liste(Q", true);

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "[I")
    public static int[] field3923 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Laa;")
    public static class164 field3918;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZBLwk;)V")
    public static final void method1535(boolean arg0, byte arg1, class259 arg2) {
        field3920++;
        if (arg0) {
            int var3 = class248.field4414;
            int var4 = var3 * 956 / 503;
            class11.field339.method669((class4.field53 - var4) / 2, 0, var4, var3);
            class59.field1184.method447(class4.field53 / 2 - (class59.field1184.field1227 / 2), 18);
        }
        arg2.method1758(class139.field2655, class4.field53 / 2, class248.field4414 / 2 - 26, 16777215, -1);
        int var5 = class248.field4414 / 2 - 18;
        class131.method932(class4.field53 / 2 - 152, var5, 304, 34, 9179409);
        if (arg1 < 97) {
            method1537(78, -67, 81);
        }
        class131.method932(class4.field53 / 2 - 151, var5 + 1, 302, 32, 0);
        class131.method927(class4.field53 / 2 - 150, var5 - -2, class234.field4223 * 3, 30, 9179409);
        class131.method927(class4.field53 / 2 + class234.field4223 * 3 - 150, var5 + 2, 300 - class234.field4223 * 3, 30, 0);
        arg2.method1758(class122.field2389, class4.field53 / 2, class248.field4414 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1536(int arg0) {
        field3924 = null;
        if (arg0 != -1011) {
            field3919 = null;
        }
        field3921 = null;
        field3923 = null;
        field3918 = null;
        field3919 = null;
        field3917 = null;
        field3922 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)J")
    public static final long method1537(int arg0, int arg1, int arg2) {
        class249 var3 = class248.field4406[arg0][arg1][arg2];
        return var3 == null || var3.field4437 == null ? 0L : var3.field4437.field2065;
    }
}
