import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class139 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Lmb;")
    public static class84 field3342 = class79.method672(true, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lmb;")
    private static class84 field3348 = class79.method672(true, "Continue");

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Lmb;")
    public static class84 field3353 = field3348;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public int field3343;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public int field3344;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public int field3345;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public int field3346;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Ljf;")
    public class68 field3350;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3354++;
        if (arg2 != -1121700368) {
            method1133(null, -35);
        }
        int var7 = 2048 - arg6 & 0x7FF;
        int var8 = 2048 - arg5 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg1;
        if (var7 != 0) {
            int var12 = class104.field2520[var7];
            int var13 = class104.field2527[var7];
            int var14 = var10 * var13 - arg1 * var12 >> 16;
            var11 = var10 * var12 + arg1 * var13 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class104.field2520[var8];
            int var16 = class104.field2527[var8];
            int var17 = var9 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class59.field1463 = arg4 - var11;
        class50.field1072 = arg6;
        class64.field1575 = arg3 - var10;
        class33.field733 = arg0 - var9;
        class71.field1733 = arg5;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1131(int arg0) {
        if (arg0 != 3) {
            method1131(87);
        }
        field3348 = null;
        field3353 = null;
        field3342 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)I")
    public static final int method1132(int arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> arg0 & 0x33333333) + (var2 & 0x33333333);
        field3355++;
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lia;I)V")
    public static final void method1133(class57 arg0, int arg1) {
        field3349++;
        int var2 = 40 % ((arg1 - 6) / 62);
        int var3 = arg0.field1369 >> 16;
        if (class83.field2038 == var3 || class120.field2880 == var3) {
            class65.field1615 = true;
        }
        if (class89.field2233 == var3 || class72.field1777[class68.field1654] == var3) {
            class89.field2220 = true;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Color;Lmb;II)V")
    public static final void method1134(Color arg0, class84 arg1, int arg2, int arg3) {
        try {
            Graphics var4 = class92.field2296.getGraphics();
            if (class15.field324 == null) {
                class15.field324 = new Font("Helvetica", 1, 13);
                class54.field1250 = class92.field2296.getFontMetrics(class15.field324);
            }
            if (arg3 >= -122) {
                method1131(-101);
            }
            if (class24.field572) {
                class24.field572 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class72.field1768, client.field489);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class6.field109 == null) {
                    class6.field109 = class92.field2296.createImage(304, 34);
                }
                Graphics var5 = class6.field109.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var5.setFont(class15.field324);
                var5.setColor(Color.white);
                arg1.method715((byte) -115, var5, 22, (304 - arg1.method714(false, class54.field1250)) / 2);
                var4.drawImage(class6.field109, class72.field1768 / 2 - 152, client.field489 / 2 - 18, null);
            } catch (Exception var8) {
                int var6 = class72.field1768 / 2 - 152;
                int var7 = client.field489 / 2 - 18;
                var4.setColor(arg0);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg2 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg2 * 3 + var6 + 2, var7 + 2, 300 - arg2 * 3, 30);
                var4.setFont(class15.field324);
                var4.setColor(Color.white);
                arg1.method715((byte) -115, var4, var7 + 22, var6 + (-arg1.method714(false, class54.field1250) + 304) / 2);
            }
        } catch (Exception var9) {
            class92.field2296.repaint();
        }
        field3352++;
    }
}
