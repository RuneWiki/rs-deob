import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class244 {

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lve;")
    public static class255 field4116 = class87.method607(126, "leuchten1:");

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field4117 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field4112 = 2;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lrg;")
    public static class88 field4118;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "[Z")
    public static boolean[] field4114;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "[[B")
    public static byte[][] field4113;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 6)
    public static void method1690(int arg0) {
        field4118 = null;
        if (arg0 != 0) {
            field4118 = (class88) null;
        }
        field4114 = null;
        field4116 = null;
        field4113 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZII)V", line = 38)
    public static final void method1691(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4115++;
        if (arg1 < arg3) {
            for (int var5 = arg1; var5 < arg3; var5++) {
                class250.field4213[var5][arg4] = arg0;
            }
        } else {
            for (int var6 = arg3; var6 < arg1; var6++) {
                class250.field4213[var6][arg4] = arg0;
            }
        }
        if (arg2) {
            method1690(-85);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lrg;BLbl;Lrg;)V", line = 74)
    public static final void method1692(class88 arg0, byte arg1, class299 arg2, class88 arg3) {
        if (arg1 >= -43) {
            field4118 = (class88) null;
        }
        class249.field4168 = arg3;
        class68.field1013 = arg0;
        class266.field4499 = arg2;
        field4111++;
    }
}
