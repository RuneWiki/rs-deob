import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class class160 extends class115 {

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "Z")
    public volatile boolean field2399 = true;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "Lbs;")
    public class160 field2398;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "Lwo;")
    public class329 field2400;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "()I", line = 4)
    public int method1132() {
        return 255;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([III)V", line = 8)
    public final void method1133(int[] arg0, int arg1, int arg2) {
        if (this.field2399) {
            this.method1136(arg0, arg1, arg2);
        } else {
            this.method1135(arg2);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "()Lbs;")
    public abstract class160 method1131();

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "()I")
    public abstract int method1134();

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public abstract void method1135(int arg0);

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "([III)V")
    public abstract void method1136(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "()Lbs;")
    public abstract class160 method1137();
}
