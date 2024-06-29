import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class55 extends class39 {

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "[B")
    public byte[] field1210;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Z")
    public boolean field1211;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lme;)Lie;", line = 3)
    public final class55 method422(class79 arg0) {
        this.field1210 = arg0.method685(this.field1210, 32767);
        this.field1207 = arg0.method683(102, this.field1207);
        if (this.field1209 == this.field1208) {
            this.field1209 = this.field1208 = arg0.method681(this.field1209, 6);
        } else {
            this.field1209 = arg0.method681(this.field1209, 6);
            this.field1208 = arg0.method681(this.field1208, 6);
            if (this.field1209 == this.field1208) {
                this.field1209--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class55(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1207 = arg0;
        this.field1210 = arg1;
        this.field1209 = arg2;
        this.field1208 = arg3;
    }
}
