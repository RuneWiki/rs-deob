import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class44 extends class499 {

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "Z")
    public static boolean field603 = false;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "Ljava/lang/String;")
    public static String field617 = null;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "Lm;")
    public static class126 field618;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "Lss;")
    public class295 field610;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "Lss;")
    public class295 field613;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "Ljava/lang/String;")
    public String field605;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "Z")
    public boolean field602;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "[Ljava/lang/Object;")
    public Object[] field612;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)V", line = 9)
    public static void method279(byte arg0) {
        if (arg0 == 121) {
            field617 = null;
            field618 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILav;FBIFII[BFFFI)V", line = 30)
    public static final void method280(int arg0, class451 arg1, float arg2, byte arg3, int arg4, float arg5, int arg6, int arg7, byte[] arg8, float arg9, float arg10, float arg11, int arg12) {
        field615++;
        int var13 = 0;
        if (arg3 < 102) {
            return;
        }
        while (arg0 > var13) {
            class53.method344(arg7, 127, arg0, arg12, arg9, var13, arg2, arg4, arg5, arg8, arg1, arg6, arg10, arg11);
            arg7 += arg6 * arg12;
            var13++;
        }
    }
}
