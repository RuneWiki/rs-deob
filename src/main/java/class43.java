import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class43 extends class109 {

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "Ldd;")
    public static class35 field939 = class180.method1196((byte) 127, "jolt");

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Ldd;")
    public static class35 field934 = class180.method1196((byte) -47, "rot:");

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Ldd;")
    public static class35 field936 = class180.method1196((byte) 2, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "Ldd;")
    private static class35 field943 = class180.method1196((byte) 127, "To play on this world move to a free area first)3");

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Ldd;")
    public static class35 field930 = field943;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "Z")
    public static boolean field948 = false;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "Ldd;")
    public static class35 field942 = class180.method1196((byte) -37, "hint_headicons");

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "Ldd;")
    public static class35 field952 = class180.method1196((byte) -119, "::noclip");

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Ldd;")
    private static class35 field941 = class180.method1196((byte) 126, " from your ignore list first)3");

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Ldd;")
    public static class35 field935 = field941;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "Ldd;")
    public static class35 field951 = class180.method1196((byte) 126, "<img=1>");

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "Lba;")
    public static class12 field940;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "Lba;")
    public static class12 field944;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "[I")
    public int[] field931;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "[I")
    public int[] field946;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "[I")
    public int[] field949;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "[Lba;")
    public static class12[] field953;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "[Lhf;")
    public class76[] field933;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "[Lhf;")
    public class76[] field950;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "[[[B")
    public byte[][][] field945;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILdd;Ljava/awt/Color;I)V")
    public static final void method401(int arg0, class35 arg1, Color arg2, int arg3) {
        field947++;
        try {
            Graphics var4 = class118.field2618.getGraphics();
            if (class107.field2377 == null) {
                class107.field2377 = new Font("Helvetica", 1, 13);
                class68.field1596 = class118.field2618.getFontMetrics(class107.field2377);
            }
            if (class17.field335) {
                class17.field335 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class55.field1334, class197.field3938);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class197.field3916 == null) {
                    class197.field3916 = class118.field2618.createImage(304, 34);
                }
                Graphics var5 = class197.field3916.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, arg3, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class107.field2377);
                var5.setColor(Color.white);
                arg1.method331(1, var5, 22, (304 - arg1.method345(class68.field1596, (byte) -61)) / 2);
                var4.drawImage(class197.field3916, class55.field1334 / 2 - 152, class197.field3938 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class55.field1334 / 2 - 152;
                int var7 = class197.field3938 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class107.field2377);
                var4.setColor(Color.white);
                arg1.method331(1, var4, var7 + 22, var6 + (-arg1.method345(class68.field1596, (byte) -52) + 304) / 2);
            }
        } catch (Exception var9) {
            class118.field2618.repaint();
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
    public static void method402(byte arg0) {
        field941 = null;
        if (arg0 != 107) {
            method401(-3, null, null, -80);
        }
        field936 = null;
        field953 = null;
        field940 = null;
        field942 = null;
        field952 = null;
        field943 = null;
        field935 = null;
        field930 = null;
        field939 = null;
        field944 = null;
        field951 = null;
        field934 = null;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(IIII)Z")
    public static final boolean method403(int arg0, int arg1, int arg2, int arg3) {
        if (class1.method9(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class120.method857(var4 + 1, class126.field2746[arg0][arg1][arg2] + arg3, var5 + 1) && class120.method857(var4 + 128 - 1, class126.field2746[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class120.method857(var4 + 128 - 1, class126.field2746[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class120.method857(var4 + 1, class126.field2746[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }
}
