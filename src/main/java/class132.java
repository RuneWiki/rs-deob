import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class132 {

    @OriginalMember(owner = "client!w", name = "i", descriptor = "[I")
    public int[] field3179 = new int[6];

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[[I")
    public int[][] field3186 = new int[6][258];

    @OriginalMember(owner = "client!w", name = "d", descriptor = "[I")
    public int[] field3174 = new int[16];

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[I")
    public int[] field3185 = new int[256];

    @OriginalMember(owner = "client!w", name = "g", descriptor = "[B")
    public byte[] field3177 = new byte[4096];

    @OriginalMember(owner = "client!w", name = "A", descriptor = "[B")
    public byte[] field3197 = new byte[18002];

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public int field3180 = 0;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[B")
    public byte[] field3194 = new byte[256];

    @OriginalMember(owner = "client!w", name = "P", descriptor = "[[I")
    public int[][] field3212 = new int[6][258];

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public int field3201 = 0;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "[I")
    public int[] field3199 = new int[257];

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[Z")
    public boolean[] field3193 = new boolean[16];

    @OriginalMember(owner = "client!w", name = "K", descriptor = "[Z")
    public boolean[] field3207 = new boolean[256];

    @OriginalMember(owner = "client!w", name = "H", descriptor = "[B")
    public byte[] field3204 = new byte[18002];

    @OriginalMember(owner = "client!w", name = "V", descriptor = "[[I")
    public int[][] field3218 = new int[6][258];

    @OriginalMember(owner = "client!w", name = "s", descriptor = "[[B")
    public byte[][] field3189 = new byte[6][258];

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field3172 = 0;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Lrc;")
    public static class105 field3191 = class43.method374("Lade Spiel)2Fenster )2 ", 0);

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field3182 = 0;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public static int field3206 = 99;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field3173 = 0;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lrc;")
    public static class105 field3181 = class43.method374(" (X", 0);

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lrc;")
    private static class105 field3183 = class43.method374("Moderator option: Mute player for 48 hours: <ON>", 0);

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Lrc;")
    public static class105 field3210 = field3183;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Lrc;")
    private static class105 field3196 = class43.method374("Loaded input handler", 0);

    @OriginalMember(owner = "client!w", name = "U", descriptor = "Lrc;")
    public static class105 field3217 = field3196;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "B")
    public byte field3202;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public int field3211;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    public int field3213;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    public int field3215;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lle;")
    public static class71 field3184;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[B")
    public byte[] field3178;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "[B")
    public byte[] field3209;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[I")
    public static int[] field3195;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBI)Z", line = 10)
    public static final boolean method1046(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 18) {
            method1049((byte) -115);
        }
        field3214++;
        int var4 = arg1 >> 14 & 0x7FFF;
        int var5 = class130.field3161.method494(class73.field1619, arg3, arg0, arg1);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class121 var8 = class12.method149(var4, (byte) 62);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field2912;
                var9 = var8.field2906;
            } else {
                var9 = var8.field2912;
                var10 = var8.field2906;
            }
            int var11 = var8.field2970;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class93.method773((byte) 80, arg0, 0, class119.field2842.field1281[0], true, var11, 0, var10, 2, class119.field2842.field1261[0], var9, arg3);
        } else {
            class93.method773((byte) 80, arg0, var6 + 1, class119.field2842.field1281[0], true, 0, var7, 0, 2, class119.field2842.field1261[0], 0, arg3);
        }
        class24.field583 = 2;
        class81.field1835 = class30.field683;
        class16.field334 = class86.field1937;
        class133.field3228 = 0;
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lrc;ILjava/awt/Color;I)V", line = 135)
    public static final void method1047(class105 arg0, int arg1, Color arg2, int arg3) {
        field3216++;
        try {
            Graphics var4 = class41.field935.getGraphics();
            if (class130.field3169 == null) {
                class130.field3169 = new Font("Helvetica", 1, 13);
                class42.field959 = class41.field935.getFontMetrics(class130.field3169);
            }
            if (class67.field1506) {
                class67.field1506 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class107.field2440, class14.field283);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class105.field2388 == null) {
                    class105.field2388 = class41.field935.createImage(304, 34);
                }
                if (arg3 != 304) {
                    method1046(29, 26, (byte) -96, 55);
                }
                Graphics var5 = class105.field2388.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var5.setFont(class130.field3169);
                var5.setColor(Color.white);
                arg0.method830(-30874, var5, (304 - arg0.method841(121, class42.field959)) / 2, 22);
                var4.drawImage(class105.field2388, class107.field2440 / 2 - 152, class14.field283 / 2 - 18, null);
            } catch (Exception var8) {
                int var6 = class107.field2440 / 2 - 152;
                int var7 = class14.field283 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg1 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(var6 + arg1 * 3 + 2, var7 + 2, 300 - arg1 * 3, 30);
                var4.setFont(class130.field3169);
                var4.setColor(Color.white);
                arg0.method830(arg3 - 31178, var4, (304 - arg0.method841(120, class42.field959)) / 2 + var6, var7 + 22);
            }
        } catch (Exception var9) {
            class41.field935.repaint();
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 230)
    public static void method1048(byte arg0) {
        if (arg0 != -8) {
            return;
        }
        field3184 = null;
        field3181 = null;
        field3191 = null;
        field3217 = null;
        field3183 = null;
        field3195 = null;
        field3210 = null;
        field3196 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V", line = 247)
    public static final void method1049(byte arg0) {
        field3187++;
        class75.field1659.method602((byte) -70);
        if (arg0 != 80) {
            field3181 = null;
        }
    }
}
