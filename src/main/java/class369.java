import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public abstract class class369 extends class35 {

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "Lnm;")
    public class254 field5562;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Z")
    public boolean field5563;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
    public abstract void method2277(int arg0);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V")
    public abstract void method2278();

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)Z")
    public final boolean method2279(int arg0) {
        if (arg0 != 1) {
            this.method2284();
        }
        return this.field5563;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)I")
    public final int method2280(int arg0) {
        if (arg0 != -15240) {
            this.field5563 = true;
        }
        return 1;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "()Z")
    public abstract boolean method2281();

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
    public abstract void method2282(int arg0, int arg1);

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)Z")
    public final boolean method2283(int arg0) {
        if (arg0 != 15271) {
            this.method2282(-123, 86);
        }
        return false;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "()Z")
    public abstract boolean method2284();

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "()I")
    public int method2285() {
        return 0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILhi;Lhi;)V")
    public abstract void method2286(int arg0, class41 arg1, class41 arg2);

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lnm;)V")
    public class369(class254 arg0) {
        this.field5562 = arg0;
    }
}
