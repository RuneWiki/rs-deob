import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class55 extends class54 {

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Z")
    public volatile boolean field1070 = true;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Lec;")
    public class47 field1072;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Lf;")
    public class55 field1071;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
    public abstract int method436();

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()Lf;")
    public abstract class55 method437();

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()Lf;")
    public abstract class55 method438();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([III)V")
    public final void method439(int[] arg0, int arg1, int arg2) {
        if (this.field1070) {
            this.method441(arg0, arg1, arg2);
        } else {
            this.method442(arg2);
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()I")
    public int method440() {
        return 255;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "([III)V")
    public abstract void method441(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public abstract void method442(int arg0);
}
