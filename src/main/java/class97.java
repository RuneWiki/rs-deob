import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public abstract class class97 extends class379 {

    @OriginalMember(owner = "client!oia", name = "k", descriptor = "Z")
    public volatile boolean field1287 = true;

    @OriginalMember(owner = "client!oia", name = "h", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "client!oia", name = "i", descriptor = "Lim;")
    public class598 field1285;

    @OriginalMember(owner = "client!oia", name = "j", descriptor = "Loia;")
    public class97 field1286;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "()I")
    public abstract int method752();

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V")
    public abstract void method751(int arg0);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "([III)V")
    public final void method841(int[] arg0, int arg1, int arg2) {
        if (this.field1287) {
            this.method760(arg0, arg1, arg2);
        } else {
            this.method751(arg2);
        }
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "()I")
    public int method748() {
        return 255;
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "([III)V")
    public abstract void method760(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "()Loia;")
    public abstract class97 method745();

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "()Loia;")
    public abstract class97 method763();
}
