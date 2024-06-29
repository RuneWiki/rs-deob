import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class30 {

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "Lt;")
    public static class31 field328 = class11.method64(83, "Potters Wheel");

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "[I")
    public static int[] field327 = new int[256];

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "I")
    public static volatile int field334;

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "Lt;")
    public static class31 field336;

    @OriginalMember(owner = "mapview!s", name = "l", descriptor = "Lt;")
    public static class31 field338;

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "Lt;")
    public static class31 field330;

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "Lt;")
    private static class31 field331;

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "Lt;")
    public static class31 field335;

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "mapview!s", name = "m", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "mapview!s", name = "n", descriptor = "Lt;")
    public static class31 field340;

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "Lt;")
    public static class31 field333;

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "mapview!s", name = "k", descriptor = "J")
    public static long field337;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(IILjava/awt/Color;Lt;)V", line = 17)
    public static final void method159(int arg0, int arg1, Color arg2, class31 arg3) {
        try {
            Graphics var4 = class28.field311.getGraphics();
            if (class4.field109 == null) {
                class4.field109 = new Font("Helvetica", 1, 13);
                class26.field295 = class28.field311.getFontMetrics(class4.field109);
            }
            if (arg1 >= -71) {
                field337 = -122L;
            }
            if (class10.field181) {
                class10.field181 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class28.field319, class31.field350);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class26.field294 == null) {
                    class26.field294 = class28.field311.createImage(304, 34);
                }
                Graphics var5 = class26.field294.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class4.field109);
                var5.setColor(Color.white);
                arg3.method177(var5, 5320, (304 - arg3.method170(class26.field295, 0)) / 2, 22);
                var4.drawImage(class26.field294, class28.field319 / 2 - 152, class31.field350 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = class28.field319 / 2 - 152;
                int var8 = class31.field350 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 - -2, 300 - arg0 * 3, 30);
                var4.setFont(class4.field109);
                var4.setColor(Color.white);
                arg3.method177(var4, 5320, var7 + (304 - arg3.method170(class26.field295, 0)) / 2, var8 + 22);
            }
        } catch (Exception var11) {
            class28.field311.repaint();
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field327[var0] = var1;
        }
        field334 = -1;
        field336 = class11.method64(100, "Prev page");
        field338 = class11.method64(88, "Key");
        field330 = class11.method64(101, "Agility Training");
        field331 = class11.method64(-120, "Loading )3)3)3");
        field335 = class11.method64(-30, "Fishing Shop");
        field332 = 0;
        field339 = 500;
        field340 = field331;
        field333 = class11.method64(109, "Shield Shop");
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(B)V", line = 94)
    public static void method160(byte arg0) {
        field338 = null;
        field328 = null;
        field330 = null;
        field333 = null;
        field331 = null;
        field340 = null;
        field335 = null;
        field336 = null;
        if (arg0 < 98) {
            field332 = 64;
        }
        field327 = null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I[B)V", line = 114)
    public static final void method161(int arg0, byte[] arg1) {
        class25 var2 = new class25(arg1);
        var2.field281 = arg1.length - 2;
        mapview.field20 = var2.method142(true);
        class10.field166 = new int[mapview.field20];
        class18.field245 = new int[mapview.field20];
        class32.field364 = new int[mapview.field20];
        class6.field115 = new int[mapview.field20];
        class28.field309 = new byte[mapview.field20][];
        var2.field281 = arg1.length - mapview.field20 * 8 - 7;
        class25.field285 = var2.method142(true);
        class1.field79 = var2.method142(true);
        int var3 = (var2.method145(98) & 0xFF) + 1;
        for (int var4 = 0; var4 < mapview.field20; var4++) {
            class6.field115[var4] = var2.method142(true);
        }
        if (arg0 < 21) {
            field335 = null;
        }
        for (int var5 = 0; var5 < mapview.field20; var5++) {
            class10.field166[var5] = var2.method142(true);
        }
        for (int var6 = 0; var6 < mapview.field20; var6++) {
            class32.field364[var6] = var2.method142(true);
        }
        for (int var7 = 0; var7 < mapview.field20; var7++) {
            class18.field245[var7] = var2.method142(true);
        }
        var2.field281 = arg1.length + 3 - var3 * 3 - mapview.field20 * 8 - 7;
        class33.field390 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class33.field390[var8] = var2.method147(-1847668240);
            if (class33.field390[var8] == 0) {
                class33.field390[var8] = 1;
            }
        }
        var2.field281 = 0;
        for (int var9 = 0; var9 < mapview.field20; var9++) {
            int var10 = class32.field364[var9];
            int var11 = class18.field245[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class28.field309[var9] = var13;
            int var14 = var2.method145(84);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method140(-120);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var16 + var10 * var17] = var2.method140(-85);
                    }
                }
            }
        }
    }
}
