import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class63 extends class137 {

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "Z")
    public volatile boolean field1409 = true;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "Lja;")
    public class63 field1407;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "Ljc;")
    public class65 field1406;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lja;")
    public abstract class63 method4();

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public abstract void method6(int arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([III)V")
    public abstract void method12(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()I")
    public abstract int method5();

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()I")
    public int method480() {
        return 255;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "()Lja;")
    public abstract class63 method7();

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "([III)V")
    public final void method522(int[] arg0, int arg1, int arg2) {
        if (this.field1409) {
            this.method12(arg0, arg1, arg2);
        } else {
            this.method6(arg2);
        }
    }
}
