import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public abstract class class613 extends class168 {

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "Z")
    public volatile boolean field8476 = true;

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "I")
    public int field8475;

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "Lcw;")
    public class183 field8477;

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "Llea;")
    public class613 field8478;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([III)V")
    public abstract void method338(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "()Llea;")
    public abstract class613 method317();

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "()Llea;")
    public abstract class613 method327();

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "([III)V")
    public final void method3434(int[] arg0, int arg1, int arg2) {
        if (this.field8476) {
            this.method338(arg0, arg1, arg2);
        } else {
            this.method335(arg2);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
    public abstract void method335(int arg0);

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "()I")
    public int method347() {
        return 255;
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "()I")
    public abstract int method349();
}
