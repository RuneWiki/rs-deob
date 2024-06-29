import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public abstract class class496 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field7529 = -1;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public abstract void method194(int arg0);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2984(int arg0, int arg1, byte arg2) {
        int var3 = -108 % ((arg2 - 12) / 33);
        field7531++;
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V")
    public abstract void method195();

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public abstract void method204(int arg0);

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
    public abstract void method185(int arg0);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIII)V")
    public abstract void method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lql;)V")
    public abstract void method187(class496 arg0);

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V")
    public abstract void method199(int arg0);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III[I)V")
    public abstract void method190(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)B")
    public static final byte method2985(int arg0, int arg1, int arg2) {
        field7530++;
        if (~arg0 == arg2) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(III)V")
    public abstract void method198(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V")
    public abstract void method196(int arg0);

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)[Lba;")
    public static final class252[] method2986(int arg0) {
        if (arg0 == 540800) {
            field7528++;
            return new class252[] { class247.field3773, class247.field3787, class247.field3789, class247.field3790, class247.field3791, class247.field3792, class247.field3793, class247.field3794, class247.field3795, class247.field3796 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([I)V")
    public abstract void method188(int[] arg0);

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(III[I)V")
    public abstract void method186(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(III)V")
    public abstract void method201(int arg0, int arg1, int arg2);
}
