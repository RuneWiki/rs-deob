import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class785 {

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "I")
    public int field10803 = 2048;

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "I")
    public int field10805 = 0;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "I")
    public int field10806 = 2048;

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "I")
    public int field10809 = 0;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "I")
    public static int field10804;

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "I")
    public static int field10807;

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "I")
    public static int field10810;

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "[[I")
    public static int[][] field10808;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V", line = 14)
    public static void method4341(boolean arg0) {
        field10808 = null;
        if (!arg0) {
            field10808 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljp;I)V", line = 38)
    public final void method4342(class376 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2398(-1372747256);
            if (var3 == 0) {
                if (arg1 != -1) {
                    return;
                }
                field10810++;
                return;
            }
            this.method4344(arg0, var3, 3);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIB)Z", line = 59)
    public static final boolean method4343(int arg0, int arg1, byte arg2) {
        if (arg2 != 83) {
            field10808 = null;
        }
        field10804++;
        if (((arg0 & 0x10000) != 0 | class481.method2801(arg0, -545, arg1)) || class270.method1755(arg0, arg1, 16385)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && class291.method1844(arg1, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljp;II)V", line = 73)
    private final void method4344(class376 arg0, int arg1, int arg2) {
        field10807++;
        if (arg2 != 3) {
            field10808 = null;
        }
        if (arg1 == 1) {
            this.field10809 = arg0.method2398(-1372747256);
        } else if (arg1 == 2) {
            this.field10806 = arg0.method2359(-1);
        } else if (arg1 == 3) {
            this.field10803 = arg0.method2359(-1);
        } else if (arg1 == 4) {
            this.field10805 = arg0.method2355(arg2);
            return;
        }
    }
}
