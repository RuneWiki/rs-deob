import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public abstract class class124 {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Z")
    public static boolean field1527 = true;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field1526 = 0;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Let;")
    public static class509 field1530 = null;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Lse;")
    public static class213 field1529;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public static void method709(int arg0) {
        field1530 = null;
        field1529 = null;
        if (arg0 != 21738) {
            method710(-3, null, null);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILff;Lff;)V")
    public static final void method710(int arg0, class9 arg1, class9 arg2) {
        field1528++;
        if (arg2.field70 != null) {
            arg2.method48(-1);
        }
        arg2.field70 = arg1;
        arg2.field65 = arg1.field65;
        arg2.field70.field65 = arg2;
        arg2.field65.field70 = arg2;
        if (arg0 != 0) {
            method709(-90);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)[B")
    public abstract byte[] method711(int arg0);

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)[B")
    public abstract byte[] method712(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([BI)V")
    public abstract void method713(byte[] arg0, int arg1);
}
