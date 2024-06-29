import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class571 extends class134 {

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field8038 = -1;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field8036 = -1;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lea;")
    public static class547 field8037 = new class547(64, 6);

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Lfha;")
    public static class382 field8045 = new class382(12, -1);

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        ++field8042;
        super.field1708 = arg1;
        int var3 = 16 / ((-26 - arg0) / 41);
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ILkda;)V")
    public class571(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)I")
    public final int method3210(byte arg0) {
        ++field8041;
        if (arg0 < 119) {
            field8038 = -111;
        }
        return super.field1708;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        if (arg0 <= 118) {
            method3211(44);
        }
        ++field8039;
        if (~super.field1708 != -2 && ~super.field1708 != -1) {
            super.field1708 = this.method58(0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lkda;)V")
    public class571(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)I")
    public final int method58(int arg0) {
        ++field8044;
        if (arg0 != 0) {
            this.method55(110, -78);
        }
        return 1;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field8043;
        if (arg1 != 29053) {
            field8037 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public static void method3211(int arg0) {
        field8037 = null;
        int var1 = 55 % ((arg0 - -48) / 38);
        field8045 = null;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)Z")
    public static final boolean method3212(int arg0, int arg1, int arg2) {
        if (arg1 != 6) {
            return true;
        } else {
            ++field8040;
            return ~(arg0 & 1048832) != -1;
        }
    }
}
