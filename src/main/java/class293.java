import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class class293 extends class260 {

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Z")
    public volatile boolean field4048 = true;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Lad;")
    public class293 field4045;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Led;")
    public class496 field4046;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()I", line = 5)
    public int method1734() {
        return 255;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([III)V", line = 10)
    public final void method1735(int[] arg0, int arg1, int arg2) {
        if (this.field4048) {
            this.method523(arg0, arg1, arg2);
        } else {
            this.method546(arg2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()I")
    public abstract int method538();

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()Lad;")
    public abstract class293 method550();

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public abstract void method546(int arg0);

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()Lad;")
    public abstract class293 method521();

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "([III)V")
    public abstract void method523(int[] arg0, int arg1, int arg2);
}
