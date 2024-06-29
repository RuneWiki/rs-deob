import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public abstract class class210 extends class60 {

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "Z")
    public volatile boolean field3308 = true;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public int field3307;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "Lmc;")
    public class193 field3306;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "Lkn;")
    public class210 field3309;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "([III)V", line = 4)
    public final void method1537(int[] arg0, int arg1, int arg2) {
        if (this.field3308) {
            this.method232(arg0, arg1, arg2);
        } else {
            this.method235(arg2);
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "()I", line = 20)
    public int method1538() {
        return 255;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "()Lkn;")
    public abstract class210 method233();

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public abstract void method235(int arg0);

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "()Lkn;")
    public abstract class210 method239();

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "([III)V")
    public abstract void method232(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "()I")
    public abstract int method240();
}
