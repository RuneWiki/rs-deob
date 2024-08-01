import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public abstract class class97 extends class71 {

    @OriginalMember(owner = "kc", name = "n", descriptor = "Z")
    public volatile boolean field1961 = true;

    @OriginalMember(owner = "kc", name = "q", descriptor = "I")
    public int field1964;

    @OriginalMember(owner = "kc", name = "p", descriptor = "Lcd;")
    public class25 field1963;

    @OriginalMember(owner = "kc", name = "o", descriptor = "Lkc;")
    public class97 field1962;

    @OriginalMember(owner = "kc", name = "a", descriptor = "()I")
    public int method623() {
        return 255;
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "([III)V")
    public abstract void method620(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "kc", name = "b", descriptor = "([III)V")
    public final void method689(int[] arg0, int arg1, int arg2) {
        if (this.field1961) {
            this.method620(arg0, arg1, arg2);
        } else {
            this.method622(arg2);
        }
    }

    @OriginalMember(owner = "kc", name = "b", descriptor = "()Lkc;")
    public abstract class97 method613();

    @OriginalMember(owner = "kc", name = "a", descriptor = "(I)V")
    public abstract void method622(int arg0);

    @OriginalMember(owner = "kc", name = "c", descriptor = "()Lkc;")
    public abstract class97 method630();

    @OriginalMember(owner = "kc", name = "d", descriptor = "()I")
    public abstract int method650();
}
