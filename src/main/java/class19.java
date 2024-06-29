import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 extends class395 {

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "[B")
    public byte[] field205;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "Z")
    public boolean field203;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lmt;)Lbu;")
    public final class19 method206(class362 arg0) {
        this.field205 = arg0.method2064(-17, this.field205);
        this.field202 = arg0.method2068(this.field202, -30);
        if (this.field204 == this.field201) {
            this.field201 = this.field204 = arg0.method2067(this.field201, (byte) 80);
        } else {
            this.field201 = arg0.method2067(this.field201, (byte) 57);
            this.field204 = arg0.method2067(this.field204, (byte) -106);
            if (this.field204 == this.field201) {
                this.field201--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(I[BII)V")
    public class19(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field202 = arg0;
        this.field205 = arg1;
        this.field201 = arg2;
        this.field204 = arg3;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(I[BIIZ)V")
    public class19(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field202 = arg0;
        this.field205 = arg1;
        this.field201 = arg2;
        this.field204 = arg3;
        this.field203 = arg4;
    }
}
