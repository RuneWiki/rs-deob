import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class177 extends class287 {

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Z")
    public volatile boolean field2896 = true;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public int field2895;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Ltb;")
    public class177 field2898;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Lcn;")
    public class227 field2897;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([III)V", line = 5)
    public final void method1312(int[] arg0, int arg1, int arg2) {
        if (this.field2896) {
            this.method179(arg0, arg1, arg2);
        } else {
            this.method157(arg2);
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()I", line = 20)
    public int method175() {
        return 255;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()Ltb;")
    public abstract class177 method187();

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()I")
    public abstract int method153();

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public abstract void method157(int arg0);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "([III)V")
    public abstract void method179(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "()Ltb;")
    public abstract class177 method178();
}
