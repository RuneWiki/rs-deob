import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public abstract class class218 extends class467 {

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "Z")
    public volatile boolean field3020 = true;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "Lqt;")
    public class210 field3021;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "Lho;")
    public class218 field3022;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([III)V", line = 4)
    public final void method1477(int[] arg0, int arg1, int arg2) {
        if (this.field3020) {
            this.method1235(arg0, arg1, arg2);
        } else {
            this.method1225(arg2);
        }
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "()I", line = 15)
    public int method1247() {
        return 255;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
    public abstract void method1225(int arg0);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "()Lho;")
    public abstract class218 method1251();

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "()Lho;")
    public abstract class218 method1260();

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "()I")
    public abstract int method1237();

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "([III)V")
    public abstract void method1235(int[] arg0, int arg1, int arg2);
}
