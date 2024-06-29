import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class639 extends class178 {

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field8848;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "[B")
    public byte[] field8849;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public int field8846;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public int field8847;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Z")
    public boolean field8850;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lwu;)Lma;", line = 4)
    public final class639 method3467(class161 arg0) {
        this.field8849 = arg0.method993(-22763, this.field8849);
        this.field8848 = arg0.method997(0, this.field8848);
        if (this.field8847 == this.field8846) {
            this.field8846 = this.field8847 = arg0.method995(false, this.field8846);
        } else {
            this.field8846 = arg0.method995(false, this.field8846);
            this.field8847 = arg0.method995(false, this.field8847);
            if (this.field8847 == this.field8846) {
                this.field8846--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class639(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field8848 = arg0;
        this.field8849 = arg1;
        this.field8846 = arg2;
        this.field8847 = arg3;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class639(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field8848 = arg0;
        this.field8849 = arg1;
        this.field8846 = arg2;
        this.field8847 = arg3;
        this.field8850 = arg4;
    }
}
