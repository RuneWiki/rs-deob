import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class class134 {

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "Ltg;")
    public static class304 field1839 = new class304();

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field1844 = 1338;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "Ljn;")
    public static class409 field1842 = new class409("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "Z")
    public static boolean field1847 = true;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 5)
    public static void method894(int arg0) {
        if (arg0 != 0) {
            method894(110);
        }
        field1839 = null;
        field1842 = null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I", line = 19)
    public static int method895(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)Z", line = 29)
    public final boolean method896(int arg0) {
        if (arg0 == -288) {
            field1836++;
            return (this.field1845 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)Z", line = 40)
    public final boolean method897(boolean arg0) {
        field1840++;
        if (!arg0) {
            this.method897(false);
        }
        return (this.field1845 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)Z", line = 54)
    public final boolean method898(byte arg0) {
        field1841++;
        if (arg0 < 111) {
            return true;
        } else {
            return (this.field1845 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)Z", line = 66)
    public final boolean method899(byte arg0) {
        field1837++;
        if (arg0 != 62) {
            this.method897(true);
        }
        return (this.field1845 & 0x1) != 0;
    }
}
