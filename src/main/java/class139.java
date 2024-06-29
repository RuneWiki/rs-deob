import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class139 extends class501 {

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "Lia;")
    public class506 field1980;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "Lvda;")
    public class158 field1975;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    public static int field1982 = 0;

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "Lh;")
    public static class572 field1979 = new class572("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
    public static int field1983 = 0;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public int field1976;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "I")
    public int field1977;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(Z)V")
    public final void method965(boolean arg0) {
        this.field1981 = this.field1980.field7152;
        this.field1972 = this.field1980.field7156;
        this.field1976 = this.field1980.field7150;
        field1974++;
        if (this.field1980.field7159 != null) {
            this.field1980.field7159.method343(this.field1975.field2344, this.field1975.field2348, this.field1975.field2341, class577.field8497);
        }
        this.field1977 = class577.field8497[0];
        if (!arg0) {
            method966(-98);
        }
        this.field1973 = class577.field8497[2];
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public static void method966(int arg0) {
        if (arg0 == 0) {
            field1979 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lia;Ldea;)V")
    public class139(class506 arg0, class206 arg1) {
        this.field1980 = arg0;
        this.field1975 = this.field1980.method3003(false);
        this.method965(true);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BII)Z")
    public static final boolean method967(byte arg0, int arg1, int arg2) {
        if (arg0 > -90) {
            field1979 = null;
        }
        field1978++;
        return class90.method670((byte) 105, arg1, arg2) | (arg1 & 0x70000) != 0 || class47.method294(arg2, arg1, 1119090531);
    }
}
