import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class84 extends class2 {

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lkc;")
    public static class67 field1978 = class19.method144("runes", 68);

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "[I")
    public static int[] field1983 = new int[5];

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Lkc;")
    public static class67 field1988 = class19.method144("Bitte versuchen Sie)1", 127);

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Lga;")
    public static class42 field1977 = null;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Lkc;")
    public static class67 field1990 = class19.method144("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3", 77);

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Lkc;")
    public static class67 field1993 = class19.method144("Ung-Ultige Session)2ID)3", 103);

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public int field1980;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public int field1984;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "Led;")
    public static class33 field1991;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "[I")
    public int[] field1976;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "[I")
    public int[] field1981;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "[I")
    public int[] field1987;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "[Ljd;")
    public class62[] field1979;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "[Ljd;")
    public class62[] field1992;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "[[[B")
    public byte[][][] field1982;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 4)
    public static final void method651(Component arg0, boolean arg1) {
        if (arg1) {
            field1975 = -108;
        }
        arg0.removeKeyListener(class94.field2156);
        arg0.removeFocusListener(class94.field2156);
        field1986++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 31)
    public static void method652(byte arg0) {
        if (arg0 < 87) {
            method651(null, true);
        }
        field1990 = null;
        field1991 = null;
        field1978 = null;
        field1993 = null;
        field1988 = null;
        field1983 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(JB)V", line = 76)
    public static final void method653(long arg0, byte arg1) {
        field1985++;
        if (arg1 != 124 || arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class76.method617(arg0 - 1L, false);
            class76.method617(1L, false);
        } else {
            class76.method617(arg0, false);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Z", line = 98)
    public static final boolean method654(int arg0, int arg1) {
        field1989++;
        if (arg0 != 0) {
            method654(72, -60);
        }
        return (arg1 >> 20 & 0x1) != 0;
    }
}
