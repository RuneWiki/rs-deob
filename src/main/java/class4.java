import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class4 extends class161 {

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lsq;")
    public class96 field82;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Z")
    public boolean field83;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)I")
    public final int method69(int arg0) {
        if (arg0 != 1) {
            this.field82 = (class96) null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()Z")
    public abstract boolean method70();

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()Z")
    public abstract boolean method71();

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
    public abstract void method72(int arg0);

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "()V")
    public abstract void method73();

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILai;Lai;)V")
    public abstract void method74(int arg0, class355 arg1, class355 arg2);

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "()I")
    public int method75() {
        return 0;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)Z")
    public final boolean method76(boolean arg0) {
        if (!arg0) {
            this.field83 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
    public abstract void method77(int arg0, int arg1);

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lsq;)V")
    public class4(class96 arg0) {
        this.field82 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Z")
    public final boolean method78(byte arg0) {
        if (arg0 != 46) {
            this.method74(56, (class355) null, (class355) null);
        }
        return this.field83;
    }
}
