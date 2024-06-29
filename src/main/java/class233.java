import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class233 {

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lnga;")
    public static class510 field3308 = new class510(8);

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3310 = null;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I", line = 4)
    public static final int method1586(int arg0, int arg1) {
        field3309++;
        int var2 = 2 / ((23 - arg1) / 39);
        return (arg0 & 0x3FA02) >> 11;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)Z", line = 23)
    public final boolean method1593(int arg0) {
        field3306++;
        if (arg0 != 8) {
            field3310 = null;
        }
        return this.method1589(arg0) || this.method1596((byte) 44) || this.method1587(-47);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V", line = 35)
    public static void method1594(byte arg0) {
        field3310 = null;
        field3308 = null;
        if (arg0 != 52) {
            method1595(59, true, null, -106, false);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZLjava/lang/String;IZ)V", line = 50)
    public static final void method1595(int arg0, boolean arg1, String arg2, int arg3, boolean arg4) {
        field3307++;
        class96.method868(null, arg0, arg4, -30, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Z")
    public abstract boolean method1587(int arg0);

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public abstract void method1588(int arg0);

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)Z")
    public abstract boolean method1589(int arg0);

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)Llga;")
    public abstract class709 method1590(int arg0);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public abstract void method1591(byte arg0);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)I")
    public abstract int method1592(boolean arg0);

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)Z")
    public abstract boolean method1596(byte arg0);

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)I")
    public abstract int method1597(int arg0);
}
