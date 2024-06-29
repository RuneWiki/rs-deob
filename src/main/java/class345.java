import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class345 extends class359 {

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Z")
    public volatile boolean field5071 = true;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public int field5070;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Lrk;")
    public class22 field5072;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lnf;")
    public class345 field5069;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([III)V", line = 4)
    public final void method2207(int[] arg0, int arg1, int arg2) {
        if (this.field5071) {
            this.method270(arg0, arg1, arg2);
        } else {
            this.method265(arg2);
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "()I", line = 13)
    public int method2208() {
        return 255;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()I")
    public abstract int method274();

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "()Lnf;")
    public abstract class345 method268();

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "()Lnf;")
    public abstract class345 method273();

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "([III)V")
    public abstract void method270(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public abstract void method265(int arg0);
}
