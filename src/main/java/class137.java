import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class137 implements Runnable {

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field3182 = -1;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Lec;")
    public static class32 field3186 = class73.method594("mapback", true);

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field3180 = 0;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "[I")
    public static int[] field3175 = new int[25];

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Lec;")
    public static class32 field3184 = class73.method594("<col=ffff00>", true);

    @OriginalMember(owner = "client!te", name = "n", descriptor = "[Lp;")
    public static class104[] field3188 = new class104[4];

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lec;")
    private static class32 field3179 = class73.method594("glow2:", true);

    @OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
    public static int[] field3178 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Lec;")
    public static class32 field3190 = field3179;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "[I")
    public static int[] field3189 = new int[2048];

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field3193 = -1;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Lec;")
    public static class32 field3194 = field3179;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Lec;")
    public static class32 field3192 = class73.method594("Lade Titelbild )2 ", true);

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Lja;")
    public static class63 field3187 = new class63(30);

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field3196 = 0;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lt;")
    public static class132 field3176;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "Lea;")
    public static class30 field3195;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
    public static final void method1039(boolean arg0) {
        if (class107.field2542[98]) {
            class134.field3123 += (12 - class134.field3123) / 2;
        } else if (class107.field2542[99]) {
            class134.field3123 += (-class134.field3123 - 12) / 2;
        } else {
            class134.field3123 /= 2;
        }
        field3181++;
        class133.field3084 += class134.field3123 / 2;
        if (class133.field3084 < 128) {
            class133.field3084 = 128;
        }
        if (class133.field3084 > 383) {
            class133.field3084 = 383;
        }
        if (class107.field2542[96]) {
            class110.field2579 += (-class110.field2579 - 24) / 2;
        } else if (class107.field2542[97]) {
            class110.field2579 += (24 - class110.field2579) / 2;
        } else {
            class110.field2579 /= 2;
        }
        class133.field3056 = class110.field2579 / 2 + class133.field3056 & 0x7FF;
        int var1 = class133.field3069 + class20.field373.field2749;
        int var2 = class13.field225 + class20.field373.field2700;
        if (class57.field1320 - var1 < -500 || class57.field1320 - var1 > 500 || class107.field2538 - var2 < -500 || class107.field2538 - var2 > 500) {
            class107.field2538 = var2;
            class57.field1320 = var1;
        }
        if (class57.field1320 != var1) {
            class57.field1320 += (var1 - class57.field1320) / 16;
        }
        if (class107.field2538 != var2) {
            class107.field2538 += (var2 - class107.field2538) / 16;
        }
        int var3 = class57.field1320 >> 7;
        int var4 = 0;
        int var5 = class107.field2538 >> 7;
        int var6 = class83.method654(-5736, class43.field990, class57.field1320, class107.field2538);
        if (var3 > 3 && var5 > 3 && var3 < 100 && var5 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class43.field990;
                    if (var9 < 3 && (class3.field50[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class70.field1631[var9][var7][var8];
                    if (var10 > var4) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (var11 > class26.field469) {
            class26.field469 += (var11 - class26.field469) / 24;
        } else if (class26.field469 > var11) {
            class26.field469 += (var11 - class26.field469) / 80;
        }
        if (!arg0) {
            field3195 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "run", descriptor = "()V")
    public final void run() {
        field3183++;
        try {
            while (true) {
                class157 var1 = class2.field18;
                class142 var2;
                synchronized (class2.field18) {
                    var2 = (class142) class2.field18.method1213(82);
                }
                if (var2 == null) {
                    class54.method427(100L, -27166);
                    Object var6 = class92.field2105;
                    synchronized (class92.field2105) {
                        if (class146.field3325 <= 1) {
                            class146.field3325 = 0;
                            class92.field2105.notifyAll();
                            return;
                        }
                        class146.field3325--;
                    }
                } else {
                    if (var2.field3245 == 0) {
                        var2.field3247.method1028((byte) -80, (int) var2.field3326, var2.field3251.length, var2.field3251);
                        class157 var4 = class2.field18;
                        synchronized (class2.field18) {
                            var2.method1093(0);
                        }
                    } else if (var2.field3245 == 1) {
                        var2.field3251 = var2.field3247.method1026(0, (int) var2.field3326);
                        class157 var3 = class2.field18;
                        synchronized (class2.field18) {
                            class159.field3651.method1216(var2, (byte) 104);
                        }
                    }
                    Object var5 = class92.field2105;
                    synchronized (class92.field2105) {
                        if (class146.field3325 <= 1) {
                            class146.field3325 = 0;
                            class92.field2105.notifyAll();
                            return;
                        }
                        class146.field3325 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class110.method872(var17, null, 95);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
    public static void method1040(boolean arg0) {
        field3176 = null;
        field3179 = null;
        field3189 = null;
        field3186 = null;
        if (!arg0) {
            method1043(null, 73, null, -47);
        }
        field3192 = null;
        field3188 = null;
        field3187 = null;
        field3195 = null;
        field3184 = null;
        field3194 = null;
        field3175 = null;
        field3190 = null;
        field3178 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static final void method1041(byte arg0) {
        field3191++;
        if (arg0 != 56) {
            method1041((byte) 77);
        }
        for (class23 var1 = (class23) class45.field1077.method1213(123); var1 != null; var1 = (class23) class45.field1077.method1211(-3)) {
            if (var1.field411 == -1) {
                var1.field412 = 0;
                class5.method20(var1, (byte) -78);
            } else {
                var1.method1093(0);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static final void method1042(int arg0) {
        field3185++;
        class109 var1 = class38.field910;
        synchronized (class38.field910) {
            class86.field2017 = class82.field1918;
            class86.field2002 = class126.field2917;
            class140.field3218 = class44.field1038;
            if (arg0 != -18075) {
                method1042(121);
            }
            class79.field1827 = class158.field3615;
            class9.field166 = class151.field3469;
            class66.field1590 = class15.field288;
            class84.field1975 = class31.field610;
            class158.field3615 = 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lec;ILjava/awt/Color;I)V")
    public static final void method1043(class32 arg0, int arg1, Color arg2, int arg3) {
        try {
            Graphics var4 = class107.field2541.getGraphics();
            if (class32.field656 == null) {
                class32.field656 = new Font("Helvetica", 1, 13);
                class112.field2633 = class107.field2541.getFontMetrics(class32.field656);
            }
            if (class1.field3) {
                class1.field3 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class144.field3294, class33.field697);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class102.field2397 == null) {
                    class102.field2397 = class107.field2541.createImage(304, 34);
                }
                Graphics var5 = class102.field2397.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, arg1 - arg3 * 3, 30);
                var5.setFont(class32.field656);
                var5.setColor(Color.white);
                arg0.method253((304 - arg0.method252(0, class112.field2633)) / 2, 22, arg1 ^ 0x12C, var5);
                var4.drawImage(class102.field2397, class144.field3294 / 2 - 152, class33.field697 / 2 - 18, null);
            } catch (Exception var8) {
                int var6 = class33.field697 / 2 - 18;
                int var7 = class144.field3294 / 2 - 152;
                var4.setColor(arg2);
                var4.drawRect(var7, var6, 303, 33);
                var4.fillRect(var7 + 2, var6 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var6 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var7 + 2, var6 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class32.field656);
                var4.setColor(Color.white);
                arg0.method253(var7 + (304 - arg0.method252(arg1 - 300, class112.field2633)) / 2, var6 - -22, arg1 - 300, var4);
            }
        } catch (Exception var9) {
            class107.field2541.repaint();
        }
        field3177++;
    }
}
