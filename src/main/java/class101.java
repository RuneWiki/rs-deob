import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class101 extends class577 {

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Z")
    public volatile boolean field1178 = true;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lsd;")
    public class101 field1180;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lfc;")
    public class271 field1179;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()I", line = 7)
    public int method167() {
        return 255;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([III)V", line = 10)
    public final void method724(int[] arg0, int arg1, int arg2) {
        if (this.field1178) {
            this.method203(arg0, arg1, arg2);
        } else {
            this.method182(arg2);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
    public abstract int method210();

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public abstract void method182(int arg0);

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()Lsd;")
    public abstract class101 method191();

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "()Lsd;")
    public abstract class101 method176();

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "([III)V")
    public abstract void method203(int[] arg0, int arg1, int arg2);
}
