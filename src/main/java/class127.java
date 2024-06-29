import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class127 extends class130 {

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public int field1802;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field1797 = 0;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field1800 = 0;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "[[B")
    public static byte[][] field1795 = new byte[1000][];

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Lqj;")
    public static class196 field1801 = class80.method502("Lade Titelbild )2 ", -48);

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Lbk;")
    public static class136 field1796;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static void method782(int arg0) {
        if (arg0 < 100) {
            field1801 = null;
        }
        field1801 = null;
        field1795 = null;
        field1796 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)Ltj;")
    public static final class203 method783(int arg0, int arg1) {
        class203 var2 = (class203) class201.field3561.method1537((long) arg0, false);
        field1803++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class133.field1903.method842(3, (byte) 119, arg0);
        class203 var4 = new class203();
        if (var3 != null) {
            var4.method1379(new class56(var3), 2001);
        }
        if (arg1 != -12816) {
            field1795 = null;
        }
        class201.field3561.method1532(true, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(II)V")
    public class127(int arg0, int arg1) {
        this.field1802 = arg0;
        this.field1798 = arg1;
    }
}
