import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class147 extends class241 {

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Z")
    public volatile boolean field2685 = true;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Lq;")
    public class123 field2683;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Lv;")
    public class147 field2686;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public abstract void method744(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()Lv;")
    public abstract class147 method742();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()Lv;")
    public abstract class147 method747();

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()I")
    public int method964() {
        return 255;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([III)V")
    public abstract void method748(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()I")
    public abstract int method741();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "([III)V")
    public final void method965(int[] arg0, int arg1, int arg2) {
        if (this.field2685) {
            this.method748(arg0, arg1, arg2);
        } else {
            this.method744(arg2);
        }
    }
}
