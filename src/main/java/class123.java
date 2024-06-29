import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class123 extends class450 {

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "[S")
    private static short[] field2060 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "[S")
    private static short[] field2059 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "[S")
    private static short[] field2067 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "[[S")
    public static short[][] field2063 = new short[][] { field2059, field2060, field2067 };

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    public static int field2068 = 0;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "F")
    public static float field2066;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V", line = 4)
    public static void method983(int arg0) {
        field2067 = null;
        field2059 = null;
        if (arg0 == -2649) {
            field2060 = null;
            field2063 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lup;)V", line = 32)
    public class123(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZI)V", line = 35)
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        if (arg0) {
            ++field2064;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)I", line = 48)
    public final int method68(boolean arg0) {
        if (arg0) {
            return 31;
        } else {
            ++field2065;
            return super.field6171.method1671(7108) == class628.field8355 && super.field6171.method1672(0) ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(Z)I", line = 63)
    public final int method984(boolean arg0) {
        ++field2062;
        if (!arg0) {
            this.method75(-87, -5);
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)I", line = 76)
    public final int method75(int arg0, int arg1) {
        if (arg0 != 0) {
            field2068 = -93;
        }
        ++field2058;
        return 3;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(ILup;)V", line = 87)
    public class123(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V", line = 91)
    public final void method73(byte arg0) {
        if (arg0 == 98) {
            ++field2061;
            super.field6170 = this.method68(false);
        }
    }
}
