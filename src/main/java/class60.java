import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class60 extends class125 {

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "[B")
    public byte[] field1482;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
    public int field1485;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public int field1481;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "Z")
    public boolean field1484;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lmd;)Lka;", line = 8)
    public final class60 method459(class76 arg0) {
        this.field1482 = arg0.method565(this.field1482, 0);
        this.field1483 = arg0.method566(this.field1483, (byte) 102);
        if (this.field1485 == this.field1481) {
            this.field1485 = this.field1481 = arg0.method569(this.field1485, (byte) -23);
        } else {
            this.field1485 = arg0.method569(this.field1485, (byte) -23);
            this.field1481 = arg0.method569(this.field1481, (byte) -23);
            if (this.field1485 == this.field1481) {
                this.field1485--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class60(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1483 = arg0;
        this.field1482 = arg1;
        this.field1485 = arg2;
        this.field1481 = arg3;
    }
}
