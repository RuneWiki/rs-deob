import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class class515 extends class568 {

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Z")
    public volatile boolean field7606 = true;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public int field7604;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Ltea;")
    public class249 field7605;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "Lef;")
    public class515 field7607;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()I")
    public int method3862() {
        return 255;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([III)V")
    public final void method3863(int[] arg0, int arg1, int arg2) {
        if (this.field7606) {
            this.method1097(arg0, arg1, arg2);
        } else {
            this.method1116(arg2);
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()I")
    public abstract int method1108();

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "()Lef;")
    public abstract class515 method1134();

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public abstract void method1116(int arg0);

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "([III)V")
    public abstract void method1097(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()Lef;")
    public abstract class515 method1136();
}
