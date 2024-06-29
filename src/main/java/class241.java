import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class241 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
    public static int[] field4227 = new int[1000];

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lda;")
    public static class275 field4228 = class255.method1672(121, "Stufe: ");

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "[[[B")
    public static byte[][][] field4225;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)Lda;")
    public static final class275 method1582(int arg0, byte arg1) {
        field4226++;
        class275 var2 = class250.method1644(arg0, (byte) -115);
        for (int var3 = var2.method1838(arg1 + 103) - 3; var3 > 0; var3 -= 3) {
            var2 = class197.method1291(new class275[] { var2.method1815(0, var3, 0), class12.field184, var2.method1839(var3, (byte) 118) }, -30025);
        }
        if (arg1 != -100) {
            field4229 = -9;
        }
        if (var2.method1838(3) > 9) {
            return class197.method1291(new class275[] { client.field1497, var2.method1815(0, var2.method1838(arg1 ^ 0xFFFFFF9F) - 8, 0), class207.field3508, class11.field161, var2, class200.field3426 }, arg1 ^ 0x752B);
        } else if (var2.method1838(3) > 6) {
            return class197.method1291(new class275[] { class1.field8, var2.method1815(0, var2.method1838(3) - 4, 0), class42.field705, class11.field161, var2, class200.field3426 }, -30025);
        } else {
            return class197.method1291(new class275[] { class209.field3538, var2, class168.field2926 }, -30025);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public static void method1583(boolean arg0) {
        field4225 = null;
        if (!arg0) {
            field4227 = null;
            field4228 = null;
        }
    }
}
