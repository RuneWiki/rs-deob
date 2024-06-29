import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class371 extends class368 {

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "B")
    public byte field5325;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    public int field5327;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "Ldga;")
    public class138 field5324;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)[B")
    public final byte[] method88(int arg0) {
        ++field5326;
        int var2 = 57 / ((arg0 - -11) / 40);
        if (!super.field5297 && ~this.field5324.field1745 <= ~(this.field5324.field1712.length + -this.field5325)) {
            return this.field5324.field1712;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
    public final int method86(int arg0) {
        ++field5328;
        if (this.field5324 == null) {
            return 0;
        } else {
            if (arg0 >= -74) {
                this.field5324 = null;
            }
            return this.field5324.field1745 * 100 / (this.field5324.field1712.length - this.field5325);
        }
    }
}
