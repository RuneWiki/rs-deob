import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class31 {

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "Lgga;")
    public static class237 field311 = new class237(0, 0);

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(III)Z")
    public static final boolean method162(int arg0, int arg1, int arg2) {
        field310++;
        if (arg0 == 7726) {
            return (arg1 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(BLvc;)V")
    public static final void method163(byte arg0, class622 arg1) {
        field312++;
        arg1.field7865 = null;
        if (arg0 < -27 && class136.field1802 < 20) {
            class96.field1307.method855(0, arg1);
            class136.field1802++;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V")
    public static void method164(int arg0) {
        field311 = null;
        if (arg0 != 0) {
            method163((byte) -86, null);
        }
    }
}
