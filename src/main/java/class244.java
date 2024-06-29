import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class244 extends class5 {

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Z")
    public volatile boolean field3704 = true;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Lmd;")
    public class244 field3703;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Lel;")
    public class247 field3701;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()I", line = 4)
    public int method1681() {
        return 255;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([III)V", line = 10)
    public final void method1682(int[] arg0, int arg1, int arg2) {
        if (this.field3704) {
            this.method140(arg0, arg1, arg2);
        } else {
            this.method149(arg2);
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
    public abstract void method149(int arg0);

    @OriginalMember(owner = "client!md", name = "c", descriptor = "()Lmd;")
    public abstract class244 method145();

    @OriginalMember(owner = "client!md", name = "d", descriptor = "()I")
    public abstract int method146();

    @OriginalMember(owner = "client!md", name = "b", descriptor = "([III)V")
    public abstract void method140(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!md", name = "e", descriptor = "()Lmd;")
    public abstract class244 method142();
}
