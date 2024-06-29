import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class19 {

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Lmf;")
    public static class43 field360 = new class43(16);

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "Lcd;")
    public static class64 field362 = class44.method335((byte) 71, "Sprites geladen)3");

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Lqm;")
    public static class222 field359;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 4)
    public static final void method190(int arg0) {
        class122.field2190.method1198(false);
        class27.field435.method1198(false);
        if (arg0 >= -78) {
            method191(-121);
        }
        field358++;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 27)
    public static void method191(int arg0) {
        field360 = null;
        field359 = null;
        int var1 = 109 % ((70 - arg0) / 35);
        field362 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 49)
    public static final void method192(byte arg0) {
        if (arg0 <= 109) {
            field360 = (class43) null;
        }
        field357++;
        class77.field1447.method1198(false);
    }
}
