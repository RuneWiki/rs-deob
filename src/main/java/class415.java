import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public abstract class class415 extends class393 {

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "Lih;")
    public class330 field6190;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "Z")
    public boolean field6191;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)Z", line = 5)
    public final boolean method2683(int arg0) {
        int var2 = -47 % ((-arg0 - 26) / 57);
        return false;
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)I", line = 15)
    public final int method2684(int arg0) {
        return arg0 == 0 ? 1 : -110;
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "()I", line = 26)
    public int method2217() {
        return 0;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)Z", line = 34)
    public final boolean method2685(boolean arg0) {
        if (!arg0) {
            this.field6190 = (class330) null;
        }
        return this.field6191;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lih;)V", line = 45)
    public class415(class330 arg0) {
        this.field6190 = arg0;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "()Z")
    public abstract boolean method2218();

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "()V")
    public abstract void method2215();

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "()Z")
    public abstract boolean method2219();

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)V")
    public abstract void method2220(int arg0, int arg1);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILeq;Leq;)V")
    public abstract void method2221(int arg0, class140 arg1, class140 arg2);

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V")
    public abstract void method2216(int arg0);
}
