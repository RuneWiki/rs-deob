import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class331 extends class134 {

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field4464 = 0;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Z")
    public static boolean field4463 = false;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "[[[Z")
    public static boolean[][][] field4466;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V", line = 3)
    public final void method60(byte arg0) {
        ++field4461;
        if (super.field1708 < 0 || super.field1708 > 4) {
            super.field1708 = this.method58(0);
        }
        if (arg0 <= 118) {
            this.method55(-40, 88);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)I", line = 20)
    public final int method58(int arg0) {
        if (arg0 != 0) {
            field4466 = null;
        }
        ++field4460;
        return 0;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(ILkda;)V", line = 33)
    public class331(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)V", line = 45)
    public static void method1960(byte arg0) {
        field4466 = null;
        if (arg0 != -13) {
            field4466 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lkda;)V", line = 55)
    public class331(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V", line = 58)
    public final void method55(int arg0, int arg1) {
        super.field1708 = arg1;
        ++field4465;
        int var3 = -121 % ((arg0 - -26) / 41);
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(II)I", line = 69)
    public final int method57(int arg0, int arg1) {
        ++field4462;
        return arg1 != 29053 ? -96 : 1;
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)I", line = 80)
    public final int method1961(byte arg0) {
        ++field4467;
        if (arg0 <= 119) {
            this.method60((byte) -101);
        }
        return super.field1708;
    }
}
