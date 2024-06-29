import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public abstract class class79 extends class42 {

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "Z")
    public volatile boolean field1177 = true;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "Lvg;")
    public class38 field1180;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "Lgm;")
    public class79 field1179;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "([III)V", line = 10)
    public final void method494(int[] arg0, int arg1, int arg2) {
        if (this.field1177) {
            this.method80(arg0, arg1, arg2);
        } else {
            this.method71(arg2);
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "()I", line = 19)
    public int method63() {
        return 255;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()I")
    public abstract int method83();

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([III)V")
    public abstract void method80(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()Lgm;")
    public abstract class79 method89();

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public abstract void method71(int arg0);

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "()Lgm;")
    public abstract class79 method92();
}
