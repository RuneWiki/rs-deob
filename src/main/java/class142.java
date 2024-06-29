import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class142 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lr;")
    private static class118 field3205 = class153.method1136(124, "level)2");

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lr;")
    private static class118 field3210 = class153.method1136(80, "M");

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lr;")
    public static class118 field3208 = field3210;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lr;")
    public static class118 field3211 = field3205;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lr;")
    public static class118 field3207 = field3210;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lr;")
    public static class118 field3212 = class153.method1136(105, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Lr;")
    private static class118 field3215 = class153.method1136(107, "Loaded wordpack");

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Lr;")
    public static class118 field3214 = field3215;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lge;")
    public static class47 field3213 = new class47(64);

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lr;")
    public static class118 field3217 = class153.method1136(102, "null");

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "[I")
    public static int[] field3218 = new int[100];

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "[I")
    public static int[] field3220 = new int[50];

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Ljf;")
    public static class68 field3221;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "[Ln;")
    public static class90[] field3219;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static void method1054(boolean arg0) {
        field3213 = null;
        field3220 = null;
        field3217 = null;
        if (arg0) {
            method1054(false);
        }
        field3210 = null;
        field3218 = null;
        field3205 = null;
        field3208 = null;
        field3207 = null;
        field3211 = null;
        field3221 = null;
        field3215 = null;
        field3212 = null;
        field3214 = null;
        field3219 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Object;ILvf;)V")
    public static final void method1055(Object arg0, int arg1, class152 arg2) {
        field3209++;
        if (arg2.field3431 == null) {
            return;
        }
        if (arg1 != 27114) {
            method1056((byte) 12);
        }
        for (int var3 = 0; var3 < 50 && arg2.field3431.peekEvent() != null; var3++) {
            class139.method1042(-73, 1L);
        }
        if (arg0 != null) {
            arg2.field3431.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static final void method1056(byte arg0) {
        if (arg0 <= 33) {
            field3215 = null;
        }
        field3206++;
        class23.field553.method394(12693);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lff;Lff;I)I")
    public static final int method1057(class42 arg0, class42 arg1, int arg2) {
        field3216++;
        int var3 = 0;
        if (arg1.method354(class132.field3023, class133.field3031, -99)) {
            var3++;
        }
        if (arg0.method354(class132.field3023, class128.field2922, 72)) {
            var3++;
        }
        if (arg0.method354(class132.field3023, class9.field211, 51)) {
            var3++;
        }
        if (arg0.method354(class132.field3023, class121.field2800, arg2 + 21439)) {
            var3++;
        }
        if (arg0.method354(class132.field3023, class29.field672, arg2 ^ 0xFFFFABDF)) {
            var3++;
        }
        if (arg0.method354(class132.field3023, class64.field1469, -106)) {
            var3++;
        }
        arg0.method354(class132.field3023, class84.field2017, arg2 ^ 0xFFFFABA9);
        arg0.method354(class132.field3023, class158.field3651, -86);
        arg0.method354(class132.field3023, class110.field2557, arg2 ^ 0x5467);
        arg0.method354(class132.field3023, class138.field3141, arg2 ^ 0xFFFFABF1);
        arg0.method354(class132.field3023, class127.field2910, arg2 + 21409);
        if (arg2 != -21528) {
            method1056((byte) 40);
        }
        return var3;
    }
}
