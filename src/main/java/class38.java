import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class38 {

    @OriginalMember(owner = "mapview!v", name = "n", descriptor = "[I")
    public int[] field476 = new int[257];

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "[[I")
    public int[][] field463 = new int[6][258];

    @OriginalMember(owner = "mapview!v", name = "j", descriptor = "I")
    public int field472 = 0;

    @OriginalMember(owner = "mapview!v", name = "w", descriptor = "[I")
    public int[] field485 = new int[256];

    @OriginalMember(owner = "mapview!v", name = "m", descriptor = "[I")
    public int[] field475 = new int[6];

    @OriginalMember(owner = "mapview!v", name = "K", descriptor = "[Z")
    public boolean[] field499 = new boolean[16];

    @OriginalMember(owner = "mapview!v", name = "L", descriptor = "[I")
    public int[] field500 = new int[16];

    @OriginalMember(owner = "mapview!v", name = "M", descriptor = "[B")
    public byte[] field501 = new byte[18002];

    @OriginalMember(owner = "mapview!v", name = "J", descriptor = "[B")
    public byte[] field498 = new byte[4096];

    @OriginalMember(owner = "mapview!v", name = "I", descriptor = "[Z")
    public boolean[] field497 = new boolean[256];

    @OriginalMember(owner = "mapview!v", name = "l", descriptor = "[[I")
    public int[][] field474 = new int[6][258];

    @OriginalMember(owner = "mapview!v", name = "x", descriptor = "I")
    public int field486 = 0;

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "[B")
    public byte[] field465 = new byte[18002];

    @OriginalMember(owner = "mapview!v", name = "N", descriptor = "[[B")
    public byte[][] field502 = new byte[6][258];

    @OriginalMember(owner = "mapview!v", name = "R", descriptor = "[B")
    public byte[] field506 = new byte[256];

    @OriginalMember(owner = "mapview!v", name = "Q", descriptor = "[[I")
    public int[][] field505 = new int[6][258];

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "I")
    public static volatile int field466 = 0;

    @OriginalMember(owner = "mapview!v", name = "s", descriptor = "Lna;")
    public static class26 field481 = class6.method40("???", 48);

    @OriginalMember(owner = "mapview!v", name = "C", descriptor = "Lna;")
    public static class26 field491 = class6.method40("Cooking Range", 48);

    @OriginalMember(owner = "mapview!v", name = "z", descriptor = "Lna;")
    public static class26 field488 = class6.method40("Fishing Spot", 48);

    @OriginalMember(owner = "mapview!v", name = "G", descriptor = "Lna;")
    public static class26 field495 = class6.method40("Combat Training", 48);

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "Lna;")
    public static class26 field469 = class6.method40("Scimitar Shop", 48);

    @OriginalMember(owner = "mapview!v", name = "B", descriptor = "Lna;")
    public static class26 field490 = class6.method40("37(U", 48);

    @OriginalMember(owner = "mapview!v", name = "O", descriptor = "Lna;")
    public static class26 field503 = class6.method40("Water Source", 48);

    @OriginalMember(owner = "mapview!v", name = "h", descriptor = "Lna;")
    public static class26 field470 = class6.method40("overlay2)3dat", 48);

    @OriginalMember(owner = "mapview!v", name = "P", descriptor = "B")
    public byte field504;

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "mapview!v", name = "k", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "mapview!v", name = "o", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "mapview!v", name = "p", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "mapview!v", name = "q", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "mapview!v", name = "r", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "mapview!v", name = "u", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "mapview!v", name = "v", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "mapview!v", name = "y", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "mapview!v", name = "A", descriptor = "I")
    public int field489;

    @OriginalMember(owner = "mapview!v", name = "D", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "mapview!v", name = "E", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "mapview!v", name = "F", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "mapview!v", name = "H", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "mapview!v", name = "S", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "mapview!v", name = "t", descriptor = "Lia;")
    public static class16 field482;

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "Lba;")
    public static class4 field464;

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "[B")
    public byte[] field467;

    @OriginalMember(owner = "mapview!v", name = "i", descriptor = "[B")
    public byte[] field471;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 77)
    public static final void method251(int arg0, Component arg1) {
        if (arg0 != 0) {
            method254((byte) -126);
        }
        arg1.removeKeyListener(class8.field93);
        arg1.removeFocusListener(class8.field93);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 102)
    public static final void method252(Component arg0, int arg1) {
        arg0.addMouseListener(class11.field132);
        int var2 = 31 % ((27 - arg1) / 34);
        arg0.addMouseMotionListener(class11.field132);
        arg0.addFocusListener(class11.field132);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(B)V", line = 123)
    public static void method253(byte arg0) {
        if (arg0 > -83) {
            return;
        }
        field490 = null;
        field491 = null;
        field464 = null;
        field470 = null;
        field482 = null;
        field481 = null;
        field495 = null;
        field488 = null;
        field469 = null;
        field503 = null;
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(B)V", line = 142)
    public static final void method254(byte arg0) {
        if (arg0 != -99) {
            field495 = null;
        }
        if (class8.field93 != null) {
            class7 var1 = class8.field93;
            synchronized (class8.field93) {
                class8.field93 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IIBLa;)[Lq;", line = 231)
    public static final class30[] method255(int arg0, int arg1, byte arg2, class1 arg3) {
        if (class23.method134(arg1, (byte) 61, arg0, arg3)) {
            if (arg2 != -120) {
                field491 = null;
            }
            return class10.method64(25136);
        } else {
            return null;
        }
    }
}
