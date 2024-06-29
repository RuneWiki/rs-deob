import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class5 {

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Lrb;")
    public static class283 field74 = new class283(31, -1);

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "F")
    public static float field76;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 3)
    public static final void method31(int arg0) {
        field73++;
        if (class182.field2717) {
            return;
        }
        class163.field2483 = true;
        class182.field2717 = true;
        if (class76.field1075.field3649) {
            class191.field2797 = ((int) class191.field2797 + 191 & 0xFFFFFF80);
        } else {
            class526.field7686 += (24.0F - class526.field7686) / 2.0F;
        }
        if (arg0 != 191) {
            method31(25);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIILoa;Loa;)V", line = 28)
    public static final void method32(int arg0, int arg1, int arg2, class168 arg3, class168 arg4) {
        class532 var5 = class307.method1778(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7830 = arg3;
            var5.field7822 = arg4;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(CI)C", line = 41)
    public static final char method33(char arg0, int arg1) {
        field75++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg1 != 69) {
            return 'U';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Z", line = 70)
    public static final boolean method34(int arg0, int arg1) {
        int var2 = -78 / ((-arg1 - 22) / 35);
        field72++;
        return arg0 != 1 && arg0 != 7;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V", line = 80)
    public static void method35(int arg0) {
        field74 = null;
        if (arg0 != 338) {
            field76 = -0.22483103F;
        }
    }
}
