import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class80 extends class240 {

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Z")
    public volatile boolean field1215 = true;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "Lji;")
    public class106 field1214;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Lvl;")
    public class80 field1213;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "()I", line = 4)
    public int method583() {
        return 255;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "([III)V", line = 10)
    public final void method584(int[] arg0, int arg1, int arg2) {
        if (this.field1215) {
            this.method275(arg0, arg1, arg2);
        } else {
            this.method286(arg2);
        }
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
    public abstract void method286(int arg0);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([III)V")
    public abstract void method275(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "()Lvl;")
    public abstract class80 method294();

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "()I")
    public abstract int method293();

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "()Lvl;")
    public abstract class80 method295();
}
