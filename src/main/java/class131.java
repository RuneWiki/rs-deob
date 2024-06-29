import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class131 {

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "Z")
    public boolean field1633;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Ljda;")
    public static class300 field1628;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Lnba;")
    public class401 field1627;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Lnba;")
    public class401 field1632;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Z")
    public boolean field1626;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)Z")
    public static final boolean method688(int arg0, int arg1, int arg2) {
        field1630++;
        if (arg1 == 0) {
            return (arg0 & 0x800) != 0 && (arg2 & 0x37) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)Z")
    public final boolean method689(byte arg0) {
        int var2 = -125 % ((arg0 - 84) / 35);
        field1631++;
        return this.field1626 && !this.field1633;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public final void method690(int arg0) {
        if (this.field1627 != null) {
            this.field1627.method323(-21271);
        }
        field1629++;
        this.field1626 = false;
        if (arg0 != 55) {
            this.field1627 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
    public static void method691(boolean arg0) {
        field1628 = null;
        if (arg0) {
            field1628 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Z)V")
    public class131(boolean arg0) {
        this.field1633 = arg0;
    }
}
