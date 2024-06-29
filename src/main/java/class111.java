import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class111 implements Runnable {

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Z")
    public boolean field2546 = true;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field2536 = new Object();

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public int field2548 = 0;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "[I")
    public int[] field2551 = new int[500];

    @OriginalMember(owner = "client!re", name = "t", descriptor = "[I")
    public int[] field2550 = new int[500];

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lkc;")
    public static class67 field2532 = class19.method144("@or1@", 77);

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lja;")
    public static class59 field2535 = new class59(32);

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Lkc;")
    public static class67 field2544 = class19.method144("redstone1", 76);

    @OriginalMember(owner = "client!re", name = "i", descriptor = "[I")
    public static int[] field2539 = new int[1000];

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lkc;")
    public static class67 field2545 = class19.method144("titlebutton", 117);

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field2547 = -1;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Z")
    public static boolean field2542 = false;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lkc;")
    public static class67 field2538 = class19.method144(")2", 83);

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field2540 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Lac;")
    public static class4 field2549;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "[I")
    public static int[] field2543;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 11)
    public static final void method838(int arg0) {
        Object var1 = class76.field1814;
        synchronized (class76.field1814) {
            if (class60.field1412 == 0) {
                class83.field1966.method130(5, new class77(), -10870);
            }
            class60.field1412 = 600;
        }
        field2541++;
        if (arg0 != -1001) {
            method842(null, null, 61, -91);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 33)
    public static void method839(int arg0) {
        if (arg0 >= -72) {
            field2539 = null;
        }
        field2539 = null;
        field2535 = null;
        field2544 = null;
        field2532 = null;
        field2538 = null;
        field2543 = null;
        field2549 = null;
        field2545 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V", line = 53)
    public static final void method840(boolean arg0, int arg1) {
        field2533++;
        if (class69.field1640.field1260 >> 7 == class29.field609 && class69.field1640.field1190 >> 7 == class96.field2174) {
            class29.field609 = 0;
        }
        int var2 = class81.field1948;
        if (arg0) {
            var2 = 1;
        }
        if (arg1 != 16693) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            int var4;
            class103 var5;
            if (arg0) {
                var4 = 33538048;
                var5 = class69.field1640;
            } else {
                var4 = class119.field2820[var3] << 14;
                var5 = class44.field1067[class119.field2820[var3]];
            }
            if (var5 != null && var5.method420((byte) -120)) {
                var5.field2328 = false;
                if ((class45.field1105 && class81.field1948 > 50 || class81.field1948 > 200) && !arg0 && var5.field1254 == var5.field1233) {
                    var5.field2328 = true;
                }
                int var6 = var5.field1260 >> 7;
                int var7 = var5.field1190 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field2310 == null || var5.field2313 > class135.field3243 || var5.field2325 <= class135.field3243) {
                        if ((var5.field1260 & 0x7F) == 64 && (var5.field1190 & 0x7F) == 64) {
                            if (class11.field233[var6][var7] == class91.field2115) {
                                continue;
                            }
                            class11.field233[var6][var7] = class91.field2115;
                        }
                        var5.field2309 = class70.method575(var5.field1190, 1, var5.field1260, class112.field2593);
                        class103.field2332.method857(class112.field2593, var5.field1260, var5.field1190, var5.field2309, 60, var5, var5.field1199, var4, var5.field1205);
                    } else {
                        var5.field2328 = false;
                        var5.field2309 = class70.method575(var5.field1190, 1, var5.field1260, class112.field2593);
                        class103.field2332.method895(class112.field2593, var5.field1260, var5.field1190, var5.field2309, 60, var5, var5.field1199, var4, var5.field2308, var5.field2336, var5.field2327, var5.field2306);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Led;II)Lkc;", line = 145)
    public static final class67 method841(class33 arg0, int arg1, int arg2) {
        field2534++;
        if (!class121.method951((byte) 46, arg2, class83.method649((byte) -102, arg0))) {
            return null;
        }
        int var3 = -123 % ((arg1 + 11) / 43);
        if (arg0.field701 == null || arg2 >= arg0.field701.length || arg0.field701[arg2] == null || arg0.field701[arg2].method525((byte) 56).method539(2618) == 0) {
            return class140.field3383 ? class63.method479(new class67[] { class119.field2809, class71.method586(103, arg2) }, 0) : null;
        } else {
            return arg0.field701[arg2];
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lkc;Ljava/awt/Color;II)V", line = 168)
    public static final void method842(class67 arg0, Color arg1, int arg2, int arg3) {
        field2531++;
        try {
            Graphics var4 = class129.field3020.getGraphics();
            if (class121.field2845 == null) {
                class121.field2845 = new Font("Helvetica", 1, 13);
                class32.field683 = class129.field3020.getFontMetrics(class121.field2845);
            }
            if (class130.field3045) {
                class130.field3045 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class65.field1522, class49.field1176);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class19.field379 == null) {
                    class19.field379 = class129.field3020.createImage(304, 34);
                }
                Graphics var5 = class19.field379.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                if (arg2 == 304) {
                    var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                    var5.setFont(class121.field2845);
                    var5.setColor(Color.white);
                    arg0.method547(var5, 31689, (304 - arg0.method538(false, class32.field683)) / 2, 22);
                    var4.drawImage(class19.field379, class65.field1522 / 2 - 152, class49.field1176 / 2 + -18, null);
                }
            } catch (Exception var8) {
                int var6 = class65.field1522 / 2 - 152;
                int var7 = class49.field1176 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 - -1, 301, 31);
                var4.fillRect(arg3 * 3 + var6 + 2, var7 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class121.field2845);
                var4.setColor(Color.white);
                arg0.method547(var4, arg2 + 31385, (-arg0.method538(false, class32.field683) + 304) / 2 + var6, var7 + 22);
            }
        } catch (Exception var9) {
            class129.field3020.repaint();
        }
    }

    @OriginalMember(owner = "client!re", name = "run", descriptor = "()V", line = 240)
    public final void run() {
        field2537++;
        while (this.field2546) {
            Object var1 = this.field2536;
            synchronized (this.field2536) {
                if (this.field2548 < 500) {
                    this.field2551[this.field2548] = class138.field3298;
                    this.field2550[this.field2548] = class80.field1889;
                    this.field2548++;
                }
            }
            class84.method653(50L, (byte) 124);
        }
    }
}
