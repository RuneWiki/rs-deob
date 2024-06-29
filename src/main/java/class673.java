import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class673 extends class581 {

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "I")
    public int field9582;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "[B")
    public byte[] field9579;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "I")
    public int field9580;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
    public int field9578;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "Z")
    public boolean field9581;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Let;)Ljda;", line = 4)
    public final class673 method3829(class415 arg0) {
        this.field9579 = arg0.method2501(-63, this.field9579);
        this.field9582 = arg0.method2504((byte) -126, this.field9582);
        if (this.field9580 == this.field9578) {
            this.field9580 = this.field9578 = arg0.method2500((byte) -66, this.field9580);
        } else {
            this.field9580 = arg0.method2500((byte) -116, this.field9580);
            this.field9578 = arg0.method2500((byte) -43, this.field9578);
            if (this.field9580 == this.field9578) {
                this.field9580--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class673(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field9582 = arg0;
        this.field9579 = arg1;
        this.field9580 = arg2;
        this.field9578 = arg3;
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class673(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field9582 = arg0;
        this.field9579 = arg1;
        this.field9580 = arg2;
        this.field9578 = arg3;
        this.field9581 = arg4;
    }
}
