import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class44 {

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "Z")
    public boolean field491;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "Lpia;")
    public static class94 field496 = new class94(43, 3);

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "Ldh;")
    public static class320 field498 = new class320(120, 0);

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "Lkga;")
    public class543 field490;

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "Lkga;")
    public class543 field499;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "Z")
    public boolean field495;

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "[Lpd;")
    public static class257[] field497;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIILv;Lv;)V", line = 4)
    public static final void method256(int arg0, int arg1, int arg2, class577 arg3, class577 arg4) {
        class691 var5 = class510.method3014(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field9731 = arg3;
        var5.field9735 = arg4;
        int var6 = class504.field7120 == class159.field1758 ? 1 : 0;
        if (!arg3.method986(95)) {
            arg3.field4634 = class228.field2626[var6];
            class228.field2626[var6] = arg3;
        } else if (arg3.method989(-120)) {
            arg3.field4634 = class300.field3729[var6];
            class300.field3729[var6] = arg3;
        } else {
            arg3.field4634 = class436.field6357[var6];
            class436.field6357[var6] = arg3;
            class568.field8076 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method986(10)) {
            if (arg4.method989(-113)) {
                arg4.field4634 = class300.field3729[var6];
                class300.field3729[var6] = arg4;
                return;
            }
            arg4.field4634 = class436.field6357[var6];
            class436.field6357[var6] = arg4;
            class568.field8076 = true;
            return;
        }
        arg4.field4634 = class228.field2626[var6];
        class228.field2626[var6] = arg4;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V", line = 64)
    public static void method257(int arg0) {
        field496 = null;
        if (arg0 == -4576) {
            field498 = null;
            field497 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)Z", line = 77)
    public final boolean method258(byte arg0) {
        if (arg0 <= 41) {
            this.method258((byte) -13);
        }
        field494++;
        return this.field495 && !this.field491;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V", line = 92)
    public final void method259(int arg0) {
        if (arg0 <= 9) {
            return;
        }
        field493++;
        if (this.field490 != null) {
            this.field490.method262(true);
        }
        this.field495 = false;
    }

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)Z", line = 106)
    public static final boolean method260(int arg0) {
        if (arg0 == 11657) {
            field492++;
            return class343.field4449 > 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Z)V", line = 123)
    public class44(boolean arg0) {
        this.field491 = arg0;
    }
}
