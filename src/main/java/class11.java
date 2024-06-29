import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class11 extends class250 {

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "[B")
    public byte[] field123;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Z")
    public boolean field125;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lea;)Llg;", line = 7)
    public final class11 method38(class62 arg0) {
        this.field123 = arg0.method350(this.field123, -60);
        this.field126 = arg0.method348((byte) -121, this.field126);
        if (this.field124 == this.field122) {
            this.field122 = this.field124 = arg0.method347(18445, this.field122);
        } else {
            this.field122 = arg0.method347(18445, this.field122);
            this.field124 = arg0.method347(18445, this.field124);
            if (this.field124 == this.field122) {
                this.field122--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(I[BII)V", line = 25)
    public class11(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field126 = arg0;
        this.field123 = arg1;
        this.field122 = arg2;
        this.field124 = arg3;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(I[BIIZ)V", line = 31)
    public class11(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field126 = arg0;
        this.field123 = arg1;
        this.field122 = arg2;
        this.field124 = arg3;
        this.field125 = arg4;
    }
}
