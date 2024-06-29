import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class BZip2State {

    @OriginalMember(owner = "mapview!w", name = "h", descriptor = "[[I")
    public int[][] field485 = new int[6][258];

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "[I")
    public int[] field478 = new int[257];

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "[[I")
    public int[][] field479 = new int[6][258];

    @OriginalMember(owner = "mapview!w", name = "t", descriptor = "[[B")
    public byte[][] field497 = new byte[6][258];

    @OriginalMember(owner = "mapview!w", name = "s", descriptor = "[Z")
    public boolean[] field496 = new boolean[16];

    @OriginalMember(owner = "mapview!w", name = "l", descriptor = "I")
    public int field489 = 0;

    @OriginalMember(owner = "mapview!w", name = "n", descriptor = "[I")
    public int[] field491 = new int[256];

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "[B")
    public byte[] field480 = new byte[18002];

    @OriginalMember(owner = "mapview!w", name = "x", descriptor = "[B")
    public byte[] field501 = new byte[4096];

    @OriginalMember(owner = "mapview!w", name = "q", descriptor = "[B")
    public byte[] field494 = new byte[18002];

    @OriginalMember(owner = "mapview!w", name = "p", descriptor = "I")
    public int field493 = 0;

    @OriginalMember(owner = "mapview!w", name = "r", descriptor = "[I")
    public int[] field495 = new int[6];

    @OriginalMember(owner = "mapview!w", name = "B", descriptor = "[B")
    public byte[] field505 = new byte[256];

    @OriginalMember(owner = "mapview!w", name = "A", descriptor = "[Z")
    public boolean[] field504 = new boolean[256];

    @OriginalMember(owner = "mapview!w", name = "y", descriptor = "[I")
    public int[] field502 = new int[16];

    @OriginalMember(owner = "mapview!w", name = "G", descriptor = "[[I")
    public int[][] field510 = new int[6][258];

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "Lv;")
    public static JagString field483 = class1.method2(255, "Enter place name to find");

    @OriginalMember(owner = "mapview!w", name = "v", descriptor = "Lv;")
    public static JagString field499 = class1.method2(255, "Archery Shop");

    @OriginalMember(owner = "mapview!w", name = "H", descriptor = "Z")
    public static boolean field511 = true;

    @OriginalMember(owner = "mapview!w", name = "I", descriptor = "B")
    public byte field512;

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "mapview!w", name = "i", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "mapview!w", name = "j", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "mapview!w", name = "k", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "mapview!w", name = "m", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "mapview!w", name = "u", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "mapview!w", name = "w", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "mapview!w", name = "z", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "mapview!w", name = "D", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "mapview!w", name = "E", descriptor = "I")
    public int field508;

    @OriginalMember(owner = "mapview!w", name = "F", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "mapview!w", name = "J", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "mapview!w", name = "K", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "mapview!w", name = "g", descriptor = "[B")
    public byte[] field484;

    @OriginalMember(owner = "mapview!w", name = "o", descriptor = "[B")
    public byte[] field492;

    @OriginalMember(owner = "mapview!w", name = "C", descriptor = "[I")
    public static int[] field506;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lh;", line = 12)
    public static final JagException method252(Throwable arg0, String arg1) {
        JagException var2;
        if (arg0 instanceof JagException) {
            var2 = (JagException) arg0;
            var2.field102 = var2.field102 + ' ' + arg1;
        } else {
            var2 = new JagException(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 30)
    public static final void method253(Component arg0, int arg1) {
        if (arg1 == 32) {
            arg0.addMouseListener(Worldmap.field347);
            arg0.addMouseMotionListener(Worldmap.field347);
            arg0.addFocusListener(Worldmap.field347);
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Z)V", line = 124)
    public static void method254(boolean arg0) {
        field506 = null;
        field483 = null;
        field499 = null;
        if (!arg0) {
            field511 = true;
        }
    }
}
