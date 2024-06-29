import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public abstract class class16 extends class43 {

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "Lh;")
    public class327 field181;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "Z")
    public boolean field182;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "()I", line = 4)
    public int method89() {
        return 0;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)I", line = 12)
    public final int method90(byte arg0) {
        return arg0 >= -91 ? 32 : 1;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)Z", line = 27)
    public final boolean method94(int arg0) {
        if (arg0 != 18826) {
            this.field182 = false;
        }
        return this.field182;
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)Z", line = 39)
    public final boolean method97(int arg0) {
        if (arg0 != 1) {
            this.field181 = (class327) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lh;)V", line = 48)
    public class16(class327 arg0) {
        this.field181 = arg0;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "()V")
    public abstract void method91();

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "()Z")
    public abstract boolean method92();

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
    public abstract void method93(int arg0, int arg1);

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "()Z")
    public abstract boolean method95();

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V")
    public abstract void method96(int arg0);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILbj;Lbj;)V")
    public abstract void method98(int arg0, class313 arg1, class313 arg2);
}
