import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class98 {

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "Lqfa;")
    public static class98 field1667 = new class98();

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "Lqfa;")
    public static class98 field1668 = new class98();

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "Lqfa;")
    public static class98 field1670 = new class98();

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "Lqfa;")
    public static class98 field1671 = new class98();

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "Lqaa;")
    public static class27 field1672 = new class27(59, 4);

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "Lkca;")
    public static class82 field1673 = new class82(2);

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "[F")
    public static float[] field1674 = new float[4];

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "Z")
    public static boolean field1675 = false;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)V")
    public static void method877(boolean arg0) {
        field1671 = null;
        field1672 = null;
        if (!arg0) {
            method881(-58, -77);
        }
        field1667 = null;
        field1673 = null;
        field1670 = null;
        field1674 = null;
        field1668 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)Z")
    public static final boolean method878(byte arg0) {
        field1663++;
        if (class43.field657 == null) {
            return false;
        }
        if (class43.field657.field1198 >= 2000) {
            class43.field657.field1198 -= 2000;
        }
        if (class43.field657.field1198 == 1001) {
            return true;
        } else {
            if (arg0 < 42) {
                method877(true);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1666++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V")
    public static final void method879(int arg0) {
        class269.field3877 = false;
        field1664++;
        class237.method1608(true);
        if (arg0 < 27) {
            field1675 = false;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method880(int arg0, int arg1, byte[] arg2) {
        field1665++;
        byte[] var3 = new byte[arg0];
        class622.method3597(arg2, arg1, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)Z")
    public static final boolean method881(int arg0, int arg1) {
        if (arg0 != -1) {
            method878((byte) -124);
        }
        field1669++;
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }
}
