import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CTXDUSNR")
public class class10 extends class20 {

    @OriginalMember(owner = "CTXDUSNR", name = "l", descriptor = "Z")
    private boolean field597 = true;

    @OriginalMember(owner = "CTXDUSNR", name = "m", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "CTXDUSNR", name = "n", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "CTXDUSNR", name = "a", descriptor = "(I)LRTQSBWRH;")
    public final class59 method199(int arg0) {
        class41 var2 = class41.method374(this.field599);
        if (arg0 >= 0) {
            this.field597 = !this.field597;
        }
        return var2.method371(this.field598);
    }
}
