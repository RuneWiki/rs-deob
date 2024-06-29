import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class661 extends class435 {

    @OriginalMember(owner = "client!nfa", name = "r", descriptor = "J")
    public long field9299;

    @OriginalMember(owner = "client!nfa", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field9302 = new String[200];

    @OriginalMember(owner = "client!nfa", name = "q", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!nfa", name = "t", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!nfa", name = "s", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field9300;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V", line = 5)
    public static void method3716(int arg0) {
        field9300 = null;
        field9302 = null;
        if (arg0 <= 95) {
            field9298 = 27;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "()V", line = 18)
    public class661() {
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILvp;ZILvp;IZ)I", line = 21)
    public static final int method3717(int arg0, class613 arg1, boolean arg2, int arg3, class613 arg4, int arg5, boolean arg6) {
        if (arg0 != 200) {
            method3717(25, null, true, 117, null, 2, false);
        }
        field9301++;
        int var7 = class637.method3593(true, arg6, arg4, arg1, arg3);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class637.method3593(true, arg2, arg4, arg1, arg5);
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(J)V", line = 52)
    public class661(long arg0) {
        this.field9299 = arg0;
    }
}
