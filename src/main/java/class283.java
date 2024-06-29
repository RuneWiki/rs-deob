import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class class283 extends class161 {

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "Z")
    public volatile boolean field4543 = true;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public int field4544;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "Lkp;")
    public class283 field4545;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "Led;")
    public class420 field4542;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "([III)V", line = 5)
    public final void method1927(int[] arg0, int arg1, int arg2) {
        if (this.field4543) {
            this.method1072(arg0, arg1, arg2);
        } else {
            this.method1065(arg2);
        }
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "()I", line = 22)
    public int method1414() {
        return 255;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "([III)V")
    public abstract void method1072(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "()Lkp;")
    public abstract class283 method1066();

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)V")
    public abstract void method1065(int arg0);

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "()Lkp;")
    public abstract class283 method1064();

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "()I")
    public abstract int method1067();
}
