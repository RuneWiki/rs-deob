import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class16 extends class6 {

    @OriginalMember(owner = "mapview!ha", name = "r", descriptor = "Lh;")
    public static class15 field241 = class18.method153("(U", 1);

    @OriginalMember(owner = "mapview!ha", name = "o", descriptor = "Lh;")
    public static class15 field238 = class18.method153("37(U", 1);

    @OriginalMember(owner = "mapview!ha", name = "s", descriptor = "Lh;")
    public static class15 field242 = class18.method153("Tannery", 1);

    @OriginalMember(owner = "mapview!ha", name = "l", descriptor = "[[B")
    public static byte[][] field235 = new byte[50][];

    @OriginalMember(owner = "mapview!ha", name = "p", descriptor = "Lh;")
    public static class15 field239 = class18.method153("", 1);

    @OriginalMember(owner = "mapview!ha", name = "m", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "mapview!ha", name = "t", descriptor = "Lr;")
    public static class32 field243;

    @OriginalMember(owner = "mapview!ha", name = "u", descriptor = "Ljava/awt/Frame;")
    public static Frame field244;

    @OriginalMember(owner = "mapview!ha", name = "n", descriptor = "Z")
    public static boolean field237;

    @OriginalMember(owner = "mapview!ha", name = "q", descriptor = "[B")
    public static byte[] field240;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)V", line = 13)
    public static void method142(byte arg0) {
        field244 = null;
        int var1 = -100 / ((arg0 + 35) / 50);
        field243 = null;
        field240 = null;
        field241 = null;
        field239 = null;
        field238 = null;
        field235 = null;
        field242 = null;
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(B)Z", line = 75)
    public static final boolean method143(byte arg0) {
        class25 var1 = class21.field288;
        synchronized (class21.field288) {
            if (class22.field302 == class21.field301) {
                return false;
            }
            class15.field227 = class6.field102[class21.field301];
            if (arg0 <= 117) {
                return false;
            } else {
                class15.field222 = class11.field144[class21.field301];
                class21.field301 = class21.field301 + 1 & 0x7F;
                return true;
            }
        }
    }
}
