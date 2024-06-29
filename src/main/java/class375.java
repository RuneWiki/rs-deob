import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class375 extends class339 {

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "Lsl;")
    public class601 field4968;

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "Z")
    public static boolean field4971 = false;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "Lvu;")
    public static class204 field4967 = new class204();

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "Ltt;")
    public static class338 field4973 = new class338(15, 3);

    @OriginalMember(owner = "client!ov", name = "B", descriptor = "Z")
    public static boolean field4974 = true;

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!ov", name = "x", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lcv;Lcv;Z)V")
    public static final void method2148(class631 arg0, class631 arg1, boolean arg2) {
        field4969++;
        if (!arg2) {
            return;
        }
        if (arg0.field8734 != null) {
            arg0.method3499(12151);
        }
        arg0.field8733 = arg1;
        arg0.field8734 = arg1.field8734;
        arg0.field8734.field8733 = arg0;
        arg0.field8733.field8734 = arg0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
    public static void method2149(int arg0) {
        field4973 = null;
        field4967 = null;
        if (arg0 < 96) {
            method2150(-80, -71);
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lsl;)V")
    public class375(class601 arg0) {
        this.field4968 = arg0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)V")
    public static final void method2150(int arg0, int arg1) {
        class689.method3897(-1);
        field4972++;
        int var2 = class624.field8643.method2525(arg1, 16).field896;
        if (var2 == 0) {
            return;
        }
        int var3 = class564.field7696.field180[arg1];
        if (var2 == 5) {
            class52.field665 = var3;
        }
        if (~var2 == arg0) {
            class351.field4678 = var3;
        }
    }
}
