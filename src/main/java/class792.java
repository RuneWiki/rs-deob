import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class792 extends class502 {

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    public static int field10848 = 4;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public static int field10852 = 0;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    public static int field10844;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field10845;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public static int field10846;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field10847;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public static int field10849;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    public static int field10850;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    public static int field10851;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public static int field10853;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field10854;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
    public static int field10855;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        ++field10846;
        super.field6865 = arg0;
        if (arg1 != 0) {
            this.method4323(-32);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        if (this.method4321((byte) -112)) {
            if (super.field6863.field6725.method3781((byte) 98) && !class118.method1048((byte) -93, super.field6863.field6725.method3784((byte) 90))) {
                super.field6865 = 1;
            }
            if (super.field6863.field6768.method2951((byte) 74) == 1) {
                super.field6865 = 1;
            }
        }
        ++field10854;
        if (!arg0) {
            field10852 = 75;
        }
        if (super.field6865 == 3) {
            super.field6865 = 2;
        }
        if (super.field6865 < 0 || super.field6865 > 3) {
            super.field6865 = this.method55(-2);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field10845;
        if (class106.method914(true, arg0)) {
            if (super.field6863.field6725.method3781((byte) -36) && !class118.method1048((byte) -80, super.field6863.field6725.method3784((byte) 126))) {
                return 3;
            }
            if (super.field6863.field6768.method2951((byte) 50) == 1) {
                return 3;
            }
        }
        if (arg1 != 0) {
            return 10;
        } else if (arg0 == 3) {
            return 3;
        } else {
            return class106.method914(true, arg0) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(B)Z")
    public final boolean method4321(byte arg0) {
        if (arg0 >= -107) {
            return true;
        } else {
            ++field10849;
            return class106.method914(true, super.field6865);
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Leka;)V")
    public class792(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)I")
    public final int method55(int arg0) {
        ++field10851;
        if (arg0 != -2) {
            this.method4321((byte) -102);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(ILeka;)V")
    public class792(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(B)I")
    public final int method4322(byte arg0) {
        ++field10850;
        return arg0 <= 49 ? 78 : super.field6865;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)Z")
    public final boolean method4323(int arg0) {
        ++field10855;
        return arg0 != 0 ? true : true;
    }
}
