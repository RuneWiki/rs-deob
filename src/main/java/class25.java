import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class25 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
    public static int[] field649 = new int[50];

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "[[I")
    public static int[][] field653 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Ljava/lang/String;")
    public static String field655 = "wave2:";

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lek;")
    public static class206 field645;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lek;")
    public static class206 field652;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lek;")
    public static class206 field656;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[I")
    public static int[] field644;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 70)
    public static void method208(int arg0) {
        field645 = null;
        field644 = null;
        field655 = null;
        field656 = null;
        field653 = (int[][]) null;
        field649 = null;
        if (arg0 != 0) {
            method209(-42, -17, 60);
        }
        field652 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Ltk;", line = 89)
    public static final class278 method209(int arg0, int arg1, int arg2) {
        class312 var3 = class353.field5644[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field5078; var4++) {
            class278 var5 = var3.field5089[var4];
            if ((var5.field4527 >> 29 & 0x3L) == 2L && var5.field4523 == arg1 && var5.field4530 == arg2) {
                return var5;
            }
        }
        return null;
    }
}
