import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class617 extends class55 {

    @OriginalMember(owner = "client!jia", name = "k", descriptor = "I")
    public int field8647 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!jia", name = "o", descriptor = "I")
    public int field8651 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!jia", name = "p", descriptor = "I")
    public int field8652 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!jia", name = "v", descriptor = "I")
    public int field8658 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!jia", name = "t", descriptor = "I")
    public int field8656 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!jia", name = "w", descriptor = "I")
    public int field8659 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!jia", name = "r", descriptor = "I")
    public int field8654 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!jia", name = "u", descriptor = "I")
    public int field8657 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!jia", name = "m", descriptor = "Luca;")
    public class513 field8649;

    @OriginalMember(owner = "client!jia", name = "n", descriptor = "Llga;")
    public static class712 field8650 = new class712(1, -1);

    @OriginalMember(owner = "client!jia", name = "x", descriptor = "Lfha;")
    public static class382 field8660 = new class382(3, 2);

    @OriginalMember(owner = "client!jia", name = "l", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!jia", name = "q", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!jia", name = "s", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Luca;)V", line = 69)
    public class617(class513 arg0) {
        this.field8649 = arg0;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)V", line = 29)
    public static void method3474(int arg0) {
        field8650 = null;
        if (arg0 != -6292) {
            field8650 = null;
        }
        field8660 = null;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(III)Z", line = 40)
    public final boolean method3475(int arg0, int arg1, int arg2) {
        field8655++;
        if (this.field8647 <= arg2 && this.field8659 >= arg2 && this.field8651 <= arg1 && arg1 <= this.field8652) {
            return true;
        } else {
            if (arg0 != Integer.MIN_VALUE) {
                this.method3475(85, -86, -89);
            }
            return this.field8656 <= arg2 && this.field8654 >= arg2 && this.field8658 <= arg1 && this.field8657 >= arg1;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(II[BB)[B", line = 81)
    public static final byte[] method3476(int arg0, int arg1, byte[] arg2, byte arg3) {
        int var4 = -34 / ((arg3 + 27) / 46);
        field8648++;
        byte[] var5 = new byte[arg0];
        class373.method2194(arg2, arg1, var5, 0, arg0);
        return var5;
    }
}
