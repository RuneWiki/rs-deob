import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class7 extends class88 {

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Z")
    public volatile boolean field50 = true;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public int field48;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Lbh;")
    public class7 field49;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "Lub;")
    public class87 field51;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()I")
    public int method29() {
        return 255;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([III)V")
    public final void method30(int[] arg0, int arg1, int arg2) {
        if (this.field50) {
            this.method32(arg0, arg1, arg2);
        } else {
            this.method31(arg2);
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public abstract void method31(int arg0);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "([III)V")
    public abstract void method32(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()Lbh;")
    public abstract class7 method33();

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()Lbh;")
    public abstract class7 method34();

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "()I")
    public abstract int method35();
}
