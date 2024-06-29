import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class49 {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Loh;")
    public static class258 field730 = class153.method1046(")4a=", 103);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Loh;")
    public static class258 field728 = class153.method1046("Clientscript error )2 check log for details", 115);

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Loh;")
    private static class258 field736 = class153.method1046("Loading world list data", 115);

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field729 = 0;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "[I")
    public static int[] field738 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Loh;")
    public static class258 field739 = field736;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Ls;")
    public static class171 field737;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)Ldb;", line = 8)
    public static final class41 method392(int arg0) {
        field733++;
        int var1 = class301.field5149[0] * class113.field1958[0];
        int[] var2 = new int[var1];
        byte[] var3 = class37.field497[0];
        if (arg0 != 8) {
            return (class41) null;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class121.field2143[class2.method15(var3[var4], 255)];
        }
        class41 var5 = new class41(class108.field1919, class23.field279, class279.field4795[0], class280.field4819[0], class113.field1958[0], class301.field5149[0], var2);
        class290.method2038(116);
        return var5;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 45)
    public static void method393(byte arg0) {
        int var1 = -1 / ((arg0 + 72) / 53);
        field730 = null;
        field739 = null;
        field738 = null;
        field737 = null;
        field728 = null;
        field736 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 66)
    public static final void method394(Component arg0, int arg1) {
        arg0.removeMouseListener(class299.field5112);
        arg0.removeMouseMotionListener(class299.field5112);
        if (arg1 != 26390) {
            method392(-53);
        }
        field732++;
        arg0.removeFocusListener(class299.field5112);
        class312.field5295 = 0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lgb;Lgb;BLgb;)V", line = 94)
    public static final void method395(class213 arg0, class213 arg1, byte arg2, class213 arg3) {
        field734++;
        int var4 = -128 % ((arg2 - 16) / 33);
        class217.field3749 = arg0;
        class186.field3300 = arg3;
        class192.field3389 = arg1;
    }
}
