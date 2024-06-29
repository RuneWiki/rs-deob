import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class28 {

    @OriginalMember(owner = "mapview!o", name = "l", descriptor = "I")
    public int field332 = 0;

    @OriginalMember(owner = "mapview!o", name = "r", descriptor = "[I")
    public int[] field338 = new int[16];

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "[B")
    public byte[] field324 = new byte[4096];

    @OriginalMember(owner = "mapview!o", name = "m", descriptor = "[[I")
    public int[][] field333 = new int[6][258];

    @OriginalMember(owner = "mapview!o", name = "s", descriptor = "[Z")
    public boolean[] field339 = new boolean[16];

    @OriginalMember(owner = "mapview!o", name = "q", descriptor = "I")
    public int field337 = 0;

    @OriginalMember(owner = "mapview!o", name = "v", descriptor = "[B")
    public byte[] field342 = new byte[18002];

    @OriginalMember(owner = "mapview!o", name = "C", descriptor = "[[B")
    public byte[][] field349 = new byte[6][258];

    @OriginalMember(owner = "mapview!o", name = "B", descriptor = "[Z")
    public boolean[] field348 = new boolean[256];

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "[B")
    public byte[] field323 = new byte[256];

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "[I")
    public int[] field328 = new int[6];

    @OriginalMember(owner = "mapview!o", name = "p", descriptor = "[B")
    public byte[] field336 = new byte[18002];

    @OriginalMember(owner = "mapview!o", name = "u", descriptor = "[I")
    public int[] field341 = new int[257];

    @OriginalMember(owner = "mapview!o", name = "G", descriptor = "[[I")
    public int[][] field353 = new int[6][258];

    @OriginalMember(owner = "mapview!o", name = "k", descriptor = "[I")
    public int[] field331 = new int[256];

    @OriginalMember(owner = "mapview!o", name = "J", descriptor = "[[I")
    public int[][] field356 = new int[6][258];

    @OriginalMember(owner = "mapview!o", name = "A", descriptor = "I")
    public static volatile int field347 = -1;

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "Lba;")
    public static class4 field325 = class14.method105((byte) -70, "Slayer Master");

    @OriginalMember(owner = "mapview!o", name = "y", descriptor = "Lba;")
    public static class4 field345 = class14.method105((byte) -77, "world");

    @OriginalMember(owner = "mapview!o", name = "w", descriptor = "Lba;")
    public static class4 field343 = class14.method105((byte) -89, "Tannery");

    @OriginalMember(owner = "mapview!o", name = "t", descriptor = "Lba;")
    public static class4 field340 = class14.method105((byte) -95, "map");

    @OriginalMember(owner = "mapview!o", name = "i", descriptor = "B")
    public byte field329;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "mapview!o", name = "j", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "mapview!o", name = "n", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "mapview!o", name = "o", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "mapview!o", name = "x", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "mapview!o", name = "z", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "mapview!o", name = "E", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "mapview!o", name = "F", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "mapview!o", name = "H", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "mapview!o", name = "I", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "mapview!o", name = "K", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "[B")
    public byte[] field322;

    @OriginalMember(owner = "mapview!o", name = "D", descriptor = "[B")
    public byte[] field350;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I)V", line = 50)
    public static void method176(int arg0) {
        field340 = null;
        if (arg0 == 300) {
            field343 = null;
            field345 = null;
            field325 = null;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Ljava/awt/Color;ILba;Z)V", line = 140)
    public static final void method177(Color arg0, int arg1, class4 arg2, boolean arg3) {
        try {
            Graphics var4 = class27.field317.getGraphics();
            if (class13.field177 == null) {
                class13.field177 = new Font("Helvetica", 1, 13);
                mapview.field20 = class27.field317.getFontMetrics(class13.field177);
            }
            if (class29.field365) {
                class29.field365 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, mapview.field26, class34.field433);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class10.field157 == null) {
                    class10.field157 = class27.field317.createImage(304, 34);
                }
                if (arg3) {
                    return;
                }
                Graphics var5 = class10.field157.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var5.setFont(class13.field177);
                var5.setColor(Color.white);
                arg2.method28(var5, 22, (byte) -118, (304 - arg2.method46(mapview.field20, !arg3)) / 2);
                var4.drawImage(class10.field157, mapview.field26 / 2 - 152, class34.field433 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = mapview.field26 / 2 - 152;
                int var8 = class34.field433 / 2 - 18;
                var4.setColor(arg0);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg1 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg1 * 3 + var7 + 2, var8 + 2, 300 - arg1 * 3, 30);
                var4.setFont(class13.field177);
                var4.setColor(Color.white);
                arg2.method28(var4, var8 + 22, (byte) -115, (304 - arg2.method46(mapview.field20, true)) / 2 + var7);
            }
        } catch (Exception var11) {
            class27.field317.repaint();
        }
    }

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "(I)B", line = 223)
    public static final byte method178(int arg0) {
        if (arg0 == 0) {
            return class35.field440 == null ? 0 : class35.field440[class12.field172];
        } else {
            return 62;
        }
    }
}
