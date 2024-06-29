import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class61 extends class418 {

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Lse;")
    public class282 field934;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "Z")
    public boolean field933;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Z", line = 7)
    public final boolean method539(byte arg0) {
        int var2 = -125 / ((-arg0 - 17) / 59);
        return false;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)I", line = 15)
    public final int method540(int arg0) {
        if (arg0 != 4) {
            this.method539((byte) -47);
        }
        return 1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()I", line = 25)
    public int method541() {
        return 0;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)Z", line = 35)
    public final boolean method544(byte arg0) {
        return arg0 == 105 ? this.field933 : true;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lse;)V", line = 45)
    public class61(class282 arg0) {
        this.field934 = arg0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILoa;Loa;)V")
    public abstract void method538(int arg0, class121 arg1, class121 arg2);

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "()Z")
    public abstract boolean method542();

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V")
    public abstract void method543(int arg0);

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "()Z")
    public abstract boolean method545();

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "()V")
    public abstract void method546();

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)V")
    public abstract void method547(int arg0, int arg1);
}
