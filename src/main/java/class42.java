import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class42 extends class252 {

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public int field589;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "J")
    public long field588;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)I", line = 4)
    public final int method320(int arg0) {
        return arg0 >= -92 ? 117 : this.field591;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I", line = 15)
    public final int method321(int arg0) {
        if (arg0 < 35) {
            this.method324(1);
        }
        return this.field592;
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)J", line = 26)
    public final long method322(int arg0) {
        return arg0 < 64 ? 120L : this.field588;
    }

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "(I)I", line = 38)
    public final int method323(int arg0) {
        if (arg0 != -5) {
            this.method321(-18);
        }
        return this.field590;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)I", line = 51)
    public final int method324(int arg0) {
        if (arg0 != -2) {
            this.method320(107);
        }
        return this.field589;
    }
}
