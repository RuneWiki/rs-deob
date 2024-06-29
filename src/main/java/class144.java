import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class144 extends class88 {

    @OriginalMember(owner = "client!v", name = "v", descriptor = "Z")
    public volatile boolean field3329 = true;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "Lte;")
    public class137 field3331;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "Lv;")
    public class144 field3332;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()I")
    public int method363() {
        return 255;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([III)V")
    public abstract void method87(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()I")
    public abstract int method88();

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()Lv;")
    public abstract class144 method83();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "([III)V")
    public final void method1168(int[] arg0, int arg1, int arg2) {
        if (this.field3329) {
            this.method87(arg0, arg1, arg2);
        } else {
            this.method80(arg2);
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public abstract void method80(int arg0);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()Lv;")
    public abstract class144 method79();
}
