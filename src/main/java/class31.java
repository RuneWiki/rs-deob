import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public abstract class class31 {

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "Lsl;")
    public static class461 field528 = new class461(1350);

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "Lkg;")
    public static class275 field529 = new class275(19, -1);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)Z")
    public static final boolean method206(int arg0, int arg1, int arg2) {
        field526++;
        if (arg0 == 11137) {
            return (arg2 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)Z")
    public abstract boolean method207(int arg0, int arg1);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Lno;")
    public abstract class704 method208(int arg0);

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V")
    public abstract void method209(int arg0);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
    public abstract void method210(byte arg0);

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)V")
    public static void method211(byte arg0) {
        field528 = null;
        field529 = null;
        if (arg0 != -46) {
            method206(93, -35, -17);
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lnd;BI)Lbr;")
    public static final class397 method212(class547 arg0, byte arg1, int arg2) {
        field527++;
        byte[] var3 = arg0.method3166((byte) 125, arg2);
        if (var3 == null) {
            return null;
        } else if (arg1 < 104) {
            return null;
        } else {
            return new class397(var3);
        }
    }
}
