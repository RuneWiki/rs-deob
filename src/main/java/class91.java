import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class91 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field1495 = 99;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1496 = "yellow:";

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Lqh;")
    public static class201 field1502;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Z")
    public final boolean method680(boolean arg0) {
        if (!arg0) {
            method689(12, 15);
        }
        field1504++;
        return (this.field1506 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Z")
    public final boolean method681(int arg0) {
        if (arg0 >= -41) {
            method682(3, 70, 19);
        }
        field1499++;
        return (this.field1506 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Lui;")
    public static final class229 method682(int arg0, int arg1, int arg2) {
        class134 var3 = class288.field4563[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2133;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static void method683(int arg0) {
        if (arg0 != 99) {
            field1502 = null;
        }
        field1496 = null;
        field1502 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
    public static final void method684(int arg0, int arg1) {
        class135.field2223.method476(false, arg1);
        field1498++;
        if (arg0 == 4733) {
            class278.field4388.method476(false, arg1);
            class108.field1777.method476(false, arg1);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIBIIIIII)V")
    public static final void method685(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1497++;
        int var9 = arg3 - arg1;
        int var10 = arg7 - arg6;
        int var11 = (arg4 - arg0 << 16) / var10;
        int var12 = (arg8 - arg5 << 16) / var9;
        class252.method1718(arg3, arg0, arg6, 0, arg1, var12, 0, arg5, arg7, var11, 0);
        if (arg2 <= 7) {
            method689(122, 115);
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Z")
    public final boolean method686(int arg0) {
        if (arg0 == -15708) {
            field1494++;
            return (this.field1506 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)I")
    public static int method687(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Z")
    public final boolean method688(int arg0) {
        if (arg0 != 0) {
            this.method686(-61);
        }
        field1505++;
        return (this.field1506 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II)I")
    public static final int method689(int arg0, int arg1) {
        field1501++;
        if (arg1 < arg0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
