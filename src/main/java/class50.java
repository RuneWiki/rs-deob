import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class50 extends class13 {

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "Ljava/lang/String;")
    public static String field681 = "glow2:";

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field680 = 0;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field683 = 1;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "[C")
    public static char[] field684 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "Lec;")
    public static class25 field682 = new class25(500);

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
    public static void method307(int arg0) {
        field682 = null;
        if (arg0 == 8222) {
            field684 = null;
            field681 = null;
        }
    }
}
