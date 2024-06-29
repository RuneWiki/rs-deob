import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public abstract class class1 extends class159 {

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "Z")
    public volatile boolean field3 = true;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "Lro;")
    public class1 field2;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "Lsn;")
    public class301 field4;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "()I", line = 4)
    public int method2() {
        return 255;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "([III)V", line = 13)
    public final void method6(int[] arg0, int arg1, int arg2) {
        if (this.field3) {
            this.method4(arg0, arg1, arg2);
        } else {
            this.method5(arg2);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "()Lro;")
    public abstract class1 method1();

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "()Lro;")
    public abstract class1 method3();

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "([III)V")
    public abstract void method4(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V")
    public abstract void method5(int arg0);

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "()I")
    public abstract int method7();
}
