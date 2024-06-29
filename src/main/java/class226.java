import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class class226 extends class35 {

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "Lge;")
    public class104 field3327;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "Z")
    public boolean field3328;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)I", line = 6)
    public final int method1699(int arg0) {
        if (arg0 > -15) {
            this.field3327 = (class104) null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)Z", line = 22)
    public final boolean method1700(int arg0) {
        return arg0 <= 16;
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "()I", line = 32)
    public int method330() {
        return 0;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lge;)V", line = 37)
    public class226(class104 arg0) {
        this.field3327 = arg0;
    }

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "(I)Z", line = 46)
    public final boolean method1701(int arg0) {
        return arg0 >= -53 ? false : this.field3328;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "()Z")
    public abstract boolean method327();

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)V")
    public abstract void method325(int arg0, int arg1);

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "()Z")
    public abstract boolean method328();

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)V")
    public abstract void method332(int arg0);

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "()V")
    public abstract void method331();

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILlb;Llb;)V")
    public abstract void method329(int arg0, class208 arg1, class208 arg2);
}
