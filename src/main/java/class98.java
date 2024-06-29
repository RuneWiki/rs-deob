import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public abstract class class98 extends class540 {

    @OriginalMember(owner = "client!eha", name = "i", descriptor = "Z")
    public volatile boolean field1251 = true;

    @OriginalMember(owner = "client!eha", name = "j", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!eha", name = "l", descriptor = "Lnr;")
    public class65 field1254;

    @OriginalMember(owner = "client!eha", name = "k", descriptor = "Leha;")
    public class98 field1253;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V")
    public abstract void method686(int arg0);

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "()Leha;")
    public abstract class98 method687();

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "()Leha;")
    public abstract class98 method688();

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "([III)V")
    public abstract void method689(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "()I")
    public int method690() {
        return 255;
    }

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "()I")
    public abstract int method691();

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "([III)V")
    public final void method692(int[] arg0, int arg1, int arg2) {
        if (this.field1251) {
            this.method689(arg0, arg1, arg2);
        } else {
            this.method686(arg2);
        }
    }
}
