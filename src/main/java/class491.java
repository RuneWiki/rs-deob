import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class491 extends class324 {

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public int field7154 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public int field7155 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public int field7153 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public int field7160 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public int field7158 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public int field7151 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public int field7161 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public int field7162 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "Llq;")
    public class480 field7156;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "[[Z")
    public static boolean[][] field7157 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)Lbw;", line = 6)
    public static final class599 method2948(int arg0, int arg1, int arg2) {
        class99 var3 = class431.field6408[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1168;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Llq;)V", line = 82)
    public class491(class480 arg0) {
        this.field7156 = arg0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 25)
    public static void method2949(int arg0) {
        if (arg0 != 26070) {
            method2949(9);
        }
        field7157 = null;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(III)Z", line = 59)
    public final boolean method2950(int arg0, int arg1, int arg2) {
        field7152++;
        if (arg1 >= this.field7153 && this.field7162 >= arg1 && arg0 >= this.field7158 && arg0 <= this.field7154) {
            return true;
        } else if (arg2 == Integer.MAX_VALUE) {
            return this.field7161 <= arg1 && arg1 <= this.field7151 && this.field7155 <= arg0 && arg0 <= this.field7160;
        } else {
            return true;
        }
    }
}
