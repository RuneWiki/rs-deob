import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class55 {

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Lfi;")
    public class55 field734;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Lm;")
    public class105 field741;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "[I")
    public static int[] field737 = new int[14];

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "[S")
    public static short[] field738 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field742 = 1405;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Lha;")
    public static class116 field731;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Lbb;")
    public final class381 method302(int arg0) {
        field736++;
        return arg0 == 22461 ? class140.method739(this.field732, -3) : null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static void method303(byte arg0) {
        field738 = null;
        field731 = null;
        if (arg0 > 48) {
            field737 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZII)Z")
    public static final boolean method304(boolean arg0, int arg1, int arg2) {
        field740++;
        if (arg0) {
            method304(true, -46, -34);
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)Lfi;")
    public final class55 method305(int arg0, int arg1) {
        if (arg0 != 1405) {
            this.field741 = null;
        }
        field739++;
        return new class55(this.field732, arg1);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(II)V")
    public class55(int arg0, int arg1) {
        this.field733 = arg1;
        this.field732 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lfi;I)V")
    public class55(class55 arg0, int arg1) {
        this.field734 = arg0;
        this.field733 = this.field734.field733 + arg1;
        this.field741 = this.field734.field741;
        this.field732 = this.field734.field732;
    }
}
