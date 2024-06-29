import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class109 extends class502 {

    @OriginalMember(owner = "client!al", name = "j", descriptor = "[I")
    public static int[] field1704 = new int[8];

    @OriginalMember(owner = "client!al", name = "n", descriptor = "[I")
    public static int[] field1708 = new int[25];

    @OriginalMember(owner = "client!al", name = "q", descriptor = "Z")
    public static boolean field1711 = false;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Lgj;")
    public static class662 field1705;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)I", line = 3)
    public final int method57(int arg0, int arg1) {
        ++field1707;
        if (arg1 != 0) {
            field1704 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(ILeka;)V", line = 18)
    public class109(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V", line = 21)
    public static void method924(int arg0) {
        field1708 = null;
        if (arg0 != 127) {
            method924(2);
        }
        field1705 = null;
        field1704 = null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Leka;)V", line = 37)
    public class109(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I", line = 41)
    public final int method55(int arg0) {
        if (arg0 != -2) {
            field1704 = null;
        }
        ++field1703;
        return 127;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(II)V", line = 54)
    public final void method52(int arg0, int arg1) {
        ++field1706;
        if (arg1 != 0) {
            this.method58(true);
        }
        super.field6865 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)I", line = 69)
    public final int method925(byte arg0) {
        ++field1709;
        if (arg0 <= 49) {
            this.method52(-94, -63);
        }
        return super.field6865;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V", line = 81)
    public final void method58(boolean arg0) {
        if (~super.field6865 > -1 && ~super.field6865 < -128) {
            super.field6865 = this.method55(-2);
        }
        ++field1710;
        if (!arg0) {
            field1704 = null;
        }
    }
}
