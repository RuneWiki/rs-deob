import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class570 extends class350 {

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILpd;)Lpd;", line = 6)
    public final class216 method2120(int arg0, class216 arg1) {
        if (arg0 != 22608) {
            this.method2120(81, null);
        }
        return new class119(arg1.method855(arg0 ^ 0xFFFFA7CD), arg1.field3169);
    }
}
