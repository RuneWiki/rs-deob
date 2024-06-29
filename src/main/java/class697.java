import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class697 extends class60 {

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "I")
    public static int field9491 = 0;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "I")
    public static int field9489;

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "I")
    public static int field9490;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "I")
    public static int field9492;

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
    public static int field9495;

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
    public static final void method3880(int arg0) {
        ++field9489;
        if (arg0 != 0) {
            field9491 = 120;
        }
        class710.field9967 = "";
        class742.field10333 = "";
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lhd;)V")
    public class697(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)V")
    public final void method409(byte arg0) {
        super.field799 = this.method405(false);
        if (arg0 > -27) {
            field9491 = 53;
        }
        ++field9494;
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)I")
    public final int method3881(int arg0) {
        ++field9496;
        if (arg0 != 0) {
            this.method3881(53);
        }
        return super.field799;
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(ILhd;)V")
    public class697(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(II)I")
    public final int method406(int arg0, int arg1) {
        if (arg0 != 0) {
            method3880(71);
        }
        ++field9492;
        return 3;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(BI)V")
    public final void method407(byte arg0, int arg1) {
        ++field9495;
        super.field799 = arg1;
        int var3 = 52 / ((arg0 - 28) / 50);
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)V")
    public static final void method3882(int arg0) {
        if (arg0 != 20068) {
            field9491 = 31;
        }
        ++field9490;
        class402.method2352(arg0 + -20069, false);
        if (class303.field3618 >= 0 && class303.field3618 != 0) {
            class677.method3810(true, class303.field3618, false);
            class303.field3618 = -1;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)I")
    public final int method405(boolean arg0) {
        if (arg0) {
            field9491 = 79;
        }
        ++field9493;
        return super.field798.method4292(-4152) == class359.field4463 && super.field798.method4287((byte) 96) ? 0 : 1;
    }
}
