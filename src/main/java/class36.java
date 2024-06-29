import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class36 extends class222 {

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Z")
    public volatile boolean field553 = true;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public int field554;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lel;")
    public class202 field552;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Lf;")
    public class36 field555;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([III)V")
    public abstract void method209(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
    public int method210() {
        return 255;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()Lf;")
    public abstract class36 method211();

    @OriginalMember(owner = "client!f", name = "b", descriptor = "([III)V")
    public final void method212(int[] arg0, int arg1, int arg2) {
        if (this.field553) {
            this.method209(arg0, arg1, arg2);
        } else {
            this.method213(arg2);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public abstract void method213(int arg0);

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()I")
    public abstract int method214();

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()Lf;")
    public abstract class36 method215();
}
