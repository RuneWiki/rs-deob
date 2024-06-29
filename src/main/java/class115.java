import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class115 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public int field1786;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public int field1791;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lrl;I)V")
    public static final void method837(class163 arg0, int arg1) {
        if (arg1 != -16657) {
            method837((class163) null, -44);
        }
        class257.field3943 = arg0;
        field1789++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)Z")
    public final boolean method838(boolean arg0) {
        if (arg0) {
            this.field1786 = -33;
        }
        field1793++;
        return (this.field1791 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)Z")
    public final boolean method839(boolean arg0) {
        field1792++;
        if (arg0) {
            method837((class163) null, -92);
        }
        return (this.field1791 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I")
    public static int method840(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)Z")
    public final boolean method841(int arg0) {
        if (arg0 != -18802) {
            this.field1786 = -116;
        }
        field1788++;
        return (this.field1791 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)Z")
    public final boolean method842(byte arg0) {
        field1790++;
        if (arg0 > -107) {
            this.field1791 = -86;
        }
        return (this.field1791 & 0x4) != 0;
    }
}
