import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class592 extends class502 {

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lcb;")
    public static class548 field8317 = new class548();

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field8326 = 1409;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lfja;")
    public static class783 field8324 = new class783(5, -2);

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        ++field8320;
        if (super.field6863.method2826(arg0) != class505.field6887) {
            super.field6865 = 1;
        } else if (super.field6863.method2830((byte) 115)) {
            super.field6865 = 0;
        }
        if (super.field6865 != 0 && ~super.field6865 != -2) {
            super.field6865 = this.method55(-2);
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        ++field8319;
        if (arg1 == 0) {
            super.field6865 = arg0;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(ILeka;)V")
    public class592(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field8323;
        if (arg1 != 0) {
            field8324 = null;
        }
        if (super.field6863.method2826(true) == class505.field6887) {
            if (super.field6863.method2830((byte) 102)) {
                return 3;
            } else {
                return ~arg0 != -1 && super.field6863.field6754.method3467((byte) 117) != 1 ? 2 : 1;
            }
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(B)I")
    public final int method3385(byte arg0) {
        if (arg0 <= 49) {
            return -10;
        } else {
            ++field8322;
            return super.field6865;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Leka;)V")
    public class592(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)Z")
    public final boolean method3386(int arg0) {
        ++field8316;
        if (arg0 != 0) {
            field8317 = null;
        }
        if (super.field6863.method2826(true) == class505.field6887) {
            return !super.field6863.method2830((byte) 104);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)I")
    public final int method55(int arg0) {
        ++field8325;
        if (arg0 != -2) {
            field8317 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V")
    public static final void method3387(boolean arg0) {
        class777.field10728 = true;
        ++field8318;
        if (arg0) {
            method3388(51);
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
    public static void method3388(int arg0) {
        field8324 = null;
        if (arg0 != 3) {
            field8324 = null;
        }
        field8317 = null;
    }
}
