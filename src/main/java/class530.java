import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public abstract class class530 {

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "Lah;")
    public class374 field7418;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public int field7419;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public static int field7415 = 0;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public static int field7420 = -2;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)Z", line = 10)
    public static final boolean method3150(int arg0, int arg1, int arg2) {
        if (arg0 < 74) {
            field7415 = -29;
        }
        field7416++;
        return class555.method3302(arg1, 16, arg2) | (arg2 & 0x70000) != 0 || class705.method3964(arg1, arg2, (byte) 90);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V", line = 25)
    public final void method3151(int arg0, boolean arg1) {
        if (this.method75(arg0, -5) != 3) {
            this.method70(arg0, -128);
        }
        field7417++;
        if (!arg1) {
            field7420 = 45;
        }
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lah;)V", line = 48)
    public class530(class374 arg0) {
        this.field7418 = arg0;
        this.field7419 = this.method74(0);
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(ILah;)V", line = 56)
    public class530(int arg0, class374 arg1) {
        this.field7418 = arg1;
        this.field7419 = arg0;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)I")
    public abstract int method74(int arg0);

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)I")
    public abstract int method75(int arg0, int arg1);

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V")
    public abstract void method73(boolean arg0);

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)V")
    public abstract void method70(int arg0, int arg1);
}
