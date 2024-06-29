import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public abstract class class184 extends class424 {

    @OriginalMember(owner = "client!ega", name = "q", descriptor = "Z")
    public volatile boolean field2363 = true;

    @OriginalMember(owner = "client!ega", name = "p", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!ega", name = "n", descriptor = "Lega;")
    public class184 field2360;

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "Lnb;")
    public class320 field2361;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "()I", line = 4)
    public int method1023() {
        return 255;
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "([III)V", line = 14)
    public final void method1232(int[] arg0, int arg1, int arg2) {
        if (this.field2363) {
            this.method1010(arg0, arg1, arg2);
        } else {
            this.method1020(arg2);
        }
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "()Lega;")
    public abstract class184 method1005();

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "()I")
    public abstract int method1022();

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
    public abstract void method1020(int arg0);

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "()Lega;")
    public abstract class184 method997();

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "([III)V")
    public abstract void method1010(int[] arg0, int arg1, int arg2);
}
