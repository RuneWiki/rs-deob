import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class146 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lkd;")
    public static class73 field3599 = class126.method1070((byte) -66, "redstone2");

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Lkd;")
    private static class73 field3608 = class126.method1070((byte) -66, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Z")
    public static volatile boolean field3609 = true;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Lkd;")
    public static class73 field3610 = class126.method1070((byte) -66, "Aus");

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[Lpb;")
    public static class106[] field3604 = new class106[1000];

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lkd;")
    public static class73 field3602 = class126.method1070((byte) -66, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lkd;")
    public static class73 field3603 = class126.method1070((byte) -66, ":0");

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lkd;")
    public static class73 field3606 = class126.method1070((byte) -66, "M");

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Lkd;")
    public static class73 field3613 = class126.method1070((byte) -66, "mn");

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lkd;")
    public static class73 field3605 = class126.method1070((byte) -66, "bevor Sie die (WRegelversto-8 melden(W Option benutzen");

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lkd;")
    public static class73 field3612 = class126.method1070((byte) -66, "redstone3");

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Lkd;")
    public static class73 field3601 = field3608;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static void method1165(byte arg0) {
        field3601 = null;
        field3613 = null;
        field3603 = null;
        field3605 = null;
        field3599 = null;
        field3612 = null;
        field3604 = null;
        field3606 = null;
        field3610 = null;
        field3608 = null;
        field3602 = null;
        if (arg0 > -116) {
            method1167(50, null, null, -63);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)V")
    public static final void method1166(byte arg0, int arg1, int arg2) {
        field3614++;
        class41 var3 = class116.method1009(arg1, false);
        int var4 = var3.field1097;
        if (arg0 != -97) {
            field3602 = null;
        }
        int var5 = var3.field1087;
        int var6 = var3.field1092;
        int var7 = class73.field1845[var5 - var6];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var6;
        class48.field1299[var4] = class84.method713(class149.method1189(class48.field1299[var4], ~var8), class149.method1189(arg2 << var6, var8));
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/awt/Color;Lkd;I)V")
    public static final void method1167(int arg0, Color arg1, class73 arg2, int arg3) {
        try {
            Graphics var4 = class18.field519.getGraphics();
            if (class136.field3400 == null) {
                class136.field3400 = new Font("Helvetica", 1, 13);
                class129.field3265 = class18.field519.getFontMetrics(class136.field3400);
            }
            if (class140.field3479) {
                class140.field3479 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class33.field912, class72.field1826);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg3 != 991) {
                method1165((byte) 127);
            }
            try {
                if (class39.field1065 == null) {
                    class39.field1065 = class18.field519.createImage(304, 34);
                }
                Graphics var5 = class39.field1065.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class136.field3400);
                var5.setColor(Color.white);
                arg2.method635(22, var5, (304 - arg2.method628(class129.field3265, 57)) / 2, true);
                var4.drawImage(class39.field1065, class33.field912 / 2 - 152, class72.field1826 / 2 - 18, null);
            } catch (Exception var8) {
                int var6 = class33.field912 / 2 - 152;
                int var7 = class72.field1826 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class136.field3400);
                var4.setColor(Color.white);
                arg2.method635(var7 + 22, var4, (304 - arg2.method628(class129.field3265, 57)) / 2 + var6, true);
            }
        } catch (Exception var9) {
            class18.field519.repaint();
        }
        field3607++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)J")
    public static final synchronized long method1168(int arg0) {
        long var1 = System.currentTimeMillis();
        field3615++;
        if (var1 < class133.field3343) {
            class126.field3241 += class133.field3343 - var1;
        }
        if (arg0 >= -71) {
            method1167(-109, null, null, 28);
        }
        class133.field3343 = var1;
        return class126.field3241 + var1;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public static final void method1169(byte arg0) {
        field3600++;
        int var1 = class103.field2568;
        int var2 = class126.field3183;
        int var3 = class39.field1059;
        int var4 = 6116423;
        int var5 = class143.field3556;
        class17.method133(var3, var1, var2, var5, var4);
        class17.method133(var3 + 1, var1 + 1, var2 - 2, 16, 0);
        class17.method134(var3 + 1, var1 + 18, var2 - 2, var5 + -19, 0);
        class58.field1553.method355(class39.field1060, var3 + 3, var1 + 14, var4, -1);
        int var6 = class3.field161;
        int var7 = class31.field869;
        if (class50.field1333 == 0) {
            var7 -= 4;
            var6 -= 4;
        }
        if (class50.field1333 == 1) {
            var7 -= 553;
            var6 -= 205;
        }
        if (class50.field1333 == 2) {
            var7 -= 17;
            var6 -= 357;
        }
        if (arg0 <= 58) {
            field3601 = null;
        }
        for (int var8 = 0; var8 < class129.field3262; var8++) {
            int var9 = 16777215;
            int var10 = (class129.field3262 - var8 - 1) * 15 + var1 + 31;
            if (var3 < var7 && var2 + var3 > var7 && var6 > var10 - 13 && var10 + 3 > var6) {
                var9 = 16776960;
            }
            class58.field1553.method355(class54.field1440[var8], var3 + 3, var10, var9, 0);
        }
    }
}
