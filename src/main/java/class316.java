import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class316 extends class190 {

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public int field5352;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "[B")
    public byte[] field5353;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public int field5351;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public int field5350;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "Z")
    public boolean field5354;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lhc;)Ltg;", line = 3)
    public final class316 method2141(class175 arg0) {
        this.field5353 = arg0.method1185(0, this.field5353);
        this.field5352 = arg0.method1187(3062, this.field5352);
        if (this.field5351 == this.field5350) {
            this.field5351 = this.field5350 = arg0.method1189(this.field5351, 6);
        } else {
            this.field5351 = arg0.method1189(this.field5351, 6);
            this.field5350 = arg0.method1189(this.field5350, 6);
            if (this.field5351 == this.field5350) {
                this.field5351--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class316(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field5352 = arg0;
        this.field5353 = arg1;
        this.field5351 = arg2;
        this.field5350 = arg3;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class316(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field5352 = arg0;
        this.field5353 = arg1;
        this.field5351 = arg2;
        this.field5350 = arg3;
        this.field5354 = arg4;
    }
}
