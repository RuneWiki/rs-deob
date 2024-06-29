import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public abstract class class319 extends class101 {

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "Z")
    public volatile boolean field4809 = true;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public int field4812;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "Lcm;")
    public class319 field4811;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "Ld;")
    public class62 field4810;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "()I", line = 13)
    public int method1504() {
        return 255;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "([III)V", line = 17)
    public final void method2188(int[] arg0, int arg1, int arg2) {
        if (this.field4809) {
            this.method1502(arg0, arg1, arg2);
        } else {
            this.method1532(arg2);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()Lcm;")
    public abstract class319 method1521();

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([III)V")
    public abstract void method1502(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "()I")
    public abstract int method1540();

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "()Lcm;")
    public abstract class319 method1543();

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
    public abstract void method1532(int arg0);
}
