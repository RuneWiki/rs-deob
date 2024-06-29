import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public abstract class class240 extends class504 {

    @OriginalMember(owner = "client!sda", name = "l", descriptor = "Z")
    public volatile boolean field3373 = true;

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "Lsda;")
    public class240 field3371;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "Lsn;")
    public class589 field3370;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
    public abstract void method162(int arg0);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "()Lsda;")
    public abstract class240 method156();

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "()I")
    public abstract int method163();

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "()I")
    public int method660() {
        return 255;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "([III)V")
    public final void method1483(int[] arg0, int arg1, int arg2) {
        if (this.field3373) {
            this.method160(arg0, arg1, arg2);
        } else {
            this.method162(arg2);
        }
    }

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "()Lsda;")
    public abstract class240 method165();

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "([III)V")
    public abstract void method160(int[] arg0, int arg1, int arg2);
}
