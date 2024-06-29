import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class class725 extends class71 {

    @OriginalMember(owner = "client!co", name = "j", descriptor = "Z")
    public volatile boolean field10051 = true;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public int field10054;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "Lfu;")
    public class640 field10053;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "Lco;")
    public class725 field10052;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([III)V")
    public abstract void method360(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public abstract void method366(int arg0);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "()Lco;")
    public abstract class725 method357();

    @OriginalMember(owner = "client!co", name = "b", descriptor = "()Lco;")
    public abstract class725 method358();

    @OriginalMember(owner = "client!co", name = "c", descriptor = "()I")
    public abstract int method355();

    @OriginalMember(owner = "client!co", name = "b", descriptor = "([III)V")
    public final void method4048(int[] arg0, int arg1, int arg2) {
        if (this.field10051) {
            this.method360(arg0, arg1, arg2);
        } else {
            this.method366(arg2);
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "()I")
    public int method4049() {
        return 255;
    }
}
