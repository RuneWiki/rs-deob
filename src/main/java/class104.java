import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class104 extends class96 {

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "I")
    public static int field1615 = 0;

    @OriginalMember(owner = "client!gf", name = "hb", descriptor = "I")
    public static int field1620 = 0;

    @OriginalMember(owner = "client!gf", name = "gb", descriptor = "Leg;")
    public static class37 field1619 = class174.method1167("Speicher wird zugewiesen)3", 64);

    @OriginalMember(owner = "client!gf", name = "jb", descriptor = "Leg;")
    public static class37 field1622 = class174.method1167("::rebuild", 126);

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "B")
    public byte field1614;

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!gf", name = "fb", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!gf", name = "kb", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "Lva;")
    public class187 field1617;

    @OriginalMember(owner = "client!gf", name = "ib", descriptor = "[Lrk;")
    public static class14[] field1621;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)I")
    public final int method621(boolean arg0) {
        ++field1616;
        if (arg0) {
            return 85;
        } else {
            return this.field1617 == null ? 0 : this.field1617.field3169 * 100 / (this.field1617.field3175.length - this.field1614);
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
    public static void method694(byte arg0) {
        if (arg0 == -120) {
            field1622 = null;
            field1621 = null;
            field1619 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)[B")
    public final byte[] method618(int arg0) {
        ++field1618;
        if (arg0 != -31029) {
            field1621 = null;
        }
        if (!super.field1500 && ~this.field1617.field3169 <= ~(this.field1617.field3175.length - this.field1614)) {
            return this.field1617.field3175;
        } else {
            throw new RuntimeException();
        }
    }
}
