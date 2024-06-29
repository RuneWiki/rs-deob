import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class class29 extends class425 {

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "Lig;")
    public class132 field361;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "Z")
    public boolean field360;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method156(int arg0) {
        int var2 = 76 / ((-arg0 - 24) / 40);
        return false;
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "()I", line = 17)
    public int method159() {
        return 0;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)I", line = 25)
    public final int method160(int arg0) {
        return arg0 == 1 ? 1 : 16;
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)Z", line = 37)
    public final boolean method163(int arg0) {
        if (arg0 != 0) {
            this.method156(-27);
        }
        return this.field360;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lig;)V", line = 45)
    public class29(class132 arg0) {
        this.field361 = arg0;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "()Z")
    public abstract boolean method157();

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "()V")
    public abstract void method158();

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILhf;Lhf;)V")
    public abstract void method161(int arg0, class225 arg1, class225 arg2);

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V")
    public abstract void method162(int arg0);

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "()Z")
    public abstract boolean method164();

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)V")
    public abstract void method165(int arg0, int arg1);
}
