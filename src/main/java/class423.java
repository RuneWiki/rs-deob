import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class423 extends class396 {

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Ltb;")
    public class227 field6076;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field6069 = -1;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field6070 = 0;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field6072 = -1;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "[I")
    public static int[] field6068 = new int[25];

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field6074 = null;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field6077 = 1;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V", line = 3)
    public static final void method2622(int arg0, int arg1) {
        class93.field1031.method2054(67, arg0);
        field6073++;
        if (arg1 >= -105) {
            field6077 = 7;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILra;)V", line = 22)
    public static final void method2623(int arg0, class57 arg1) {
        class96.field1073 = arg1;
        if (arg0 != 0) {
            field6072 = -7;
        }
        field6075++;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V", line = 53)
    public static void method2624(int arg0) {
        if (arg0 >= -106) {
            field6069 = 9;
        }
        field6068 = null;
        field6074 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLra;Lra;Lla;Lra;)Z", line = 64)
    public static final boolean method2625(boolean arg0, class57 arg1, class57 arg2, class262 arg3, class57 arg4) {
        if (arg0) {
            field6068 = null;
        }
        class443.field6477 = arg3;
        field6071++;
        class134.field1859 = arg4;
        class331.field4739 = arg2;
        class444.field6492 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ltb;)V", line = 90)
    public class423(class227 arg0) {
        this.field6076 = arg0;
    }
}
