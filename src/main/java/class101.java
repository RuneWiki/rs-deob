import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class101 extends Canvas {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field2553;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Lhb;")
    private static class44 field2567 = class102.method810("Could not complete login)3", -28606);

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Lhb;")
    private static class44 field2564 = class102.method810("The server is being updated)3", -28606);

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "Lhb;")
    public static class44 field2576 = class102.method810("headicons_pk", -28606);

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Lhb;")
    public static class44 field2559 = field2567;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "Z")
    public static boolean field2572 = false;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "[I")
    public static int[] field2573 = new int[4000];

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Lhb;")
    public static class44 field2560 = field2564;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field2574 = 0;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field2568 = 0;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "Lhb;")
    private static class44 field2578 = class102.method810("Please wait 1 minute and try again)3", -28606);

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lhb;")
    public static class44 field2562 = class102.method810("headicons_hint", -28606);

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Lhb;")
    public static class44 field2561 = field2578;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "Lhb;")
    public static class44 field2582 = field2578;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "Lhb;")
    private static class44 field2569 = class102.method810("Loading game screen )2 ", -28606);

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lhb;")
    public static class44 field2555 = field2569;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lhb;")
    public static class44 field2554 = field2578;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Lkb;")
    public static class62 field2566;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "Lpc;")
    public static class93 field2577;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "[[[I")
    public static int[][][] field2563;

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 8)
    public class101(Component arg0) {
        this.field2553 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)V", line = 16)
    public static final void method798(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            method801(-63, -21);
        }
        field2581++;
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class64.field1620[arg1][arg3 + var4][arg0 + var7] = 0;
            }
        }
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class64.field1620[arg1][arg3][arg0 + var5] = class64.field1620[arg1][arg3 - 1][arg0 + var5];
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class64.field1620[arg1][arg3 + var6][arg0] = class64.field1620[arg1][arg3 + var6][arg0 - 1];
            }
        }
        if (arg3 > 0 && class64.field1620[arg1][arg3 - 1][arg0] != 0) {
            class64.field1620[arg1][arg3][arg0] = class64.field1620[arg1][arg3 - 1][arg0];
        } else if (arg0 > 0 && class64.field1620[arg1][arg3][arg0 - 1] != 0) {
            class64.field1620[arg1][arg3][arg0] = class64.field1620[arg1][arg3][arg0 - 1];
        } else if (arg3 > 0 && arg0 > 0 && class64.field1620[arg1][arg3 - 1][arg0 - 1] != 0) {
            class64.field1620[arg1][arg3][arg0] = class64.field1620[arg1][arg3 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!qe", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 79)
    public final void paint(Graphics arg0) {
        this.field2553.paint(arg0);
        field2575++;
    }

    @OriginalMember(owner = "client!qe", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 90)
    public final void update(Graphics arg0) {
        field2557++;
        this.field2553.update(arg0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 100)
    public static final void method799(boolean arg0, Component arg1) {
        field2580++;
        arg1.removeMouseListener(class57.field1506);
        arg1.removeMouseMotionListener(class57.field1506);
        if (!arg0) {
            field2560 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 138)
    public static void method800(byte arg0) {
        field2582 = null;
        field2563 = null;
        field2577 = null;
        field2560 = null;
        field2554 = null;
        field2578 = null;
        if (arg0 < 5) {
            method801(24, -115);
        }
        field2567 = null;
        field2569 = null;
        field2561 = null;
        field2566 = null;
        field2576 = null;
        field2564 = null;
        field2555 = null;
        field2559 = null;
        field2573 = null;
        field2562 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lu;", line = 163)
    public static final class117 method801(int arg0, int arg1) {
        field2556++;
        class117 var2 = (class117) class18.field346.method330((long) arg0, -1);
        if (var2 != null) {
            return var2;
        } else if (arg1 == -5045) {
            byte[] var3 = class97.field2469.method892(14, arg0, false);
            class117 var4 = new class117();
            if (var3 != null) {
                var4.method904(16060, new class131(var3));
            }
            class18.field346.method332(var4, 0, (long) arg0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z", line = 233)
    public static final boolean method802(int arg0, int arg1, int arg2) {
        field2571++;
        if (arg0 == 0 && class90.field2304 == arg1) {
            return true;
        } else if (arg2 != -4) {
            return false;
        } else if (arg0 == 1 && class131.field3193 == arg1) {
            return true;
        } else {
            return (arg0 == 2 || arg0 == 3) && class5.field116 == arg1;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 260)
    public static final void method803(byte arg0) {
        if (arg0 != 36) {
            return;
        }
        short var1 = 256;
        for (int var2 = 10; var2 < 117; var2++) {
            int var17 = (int) (Math.random() * 100.0D);
            if (var17 < 50) {
                class9.field185[(var1 - 2 << 7) + var2] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = (int) (Math.random() * 124.0D) + 2;
            int var15 = (int) (Math.random() * 128.0D) + 128;
            int var16 = (var15 << 7) + var14;
            class9.field185[var16] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var12 = 1; var12 < 127; var12++) {
                int var13 = (var4 << 7) + var12;
                class98.field2503[var13] = (class9.field185[var13 + 128] + class9.field185[var13 - 1] + class9.field185[var13 + 1] + class9.field185[var13 + -128]) / 4;
            }
        }
        class23.field495 += 128;
        if (class23.field495 > class39.field875.length) {
            class23.field495 -= class39.field875.length;
            int var5 = (int) (Math.random() * 12.0D);
            class42.method357(class102.field2601[var5], (byte) 99);
        }
        field2552++;
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var9 = 1; var9 < 127; var9++) {
                int var10 = var9 + (var6 << 7);
                int var11 = class98.field2503[var10 + 128] - class39.field875[class39.field875.length - 1 & class23.field495 + var10] / 5;
                if (var11 < 0) {
                    var11 = 0;
                }
                class9.field185[var10] = var11;
            }
        }
        for (int var7 = 0; var7 < var1 - 1; var7++) {
            class98.field2500[var7] = class98.field2500[var7 + 1];
        }
        class98.field2500[var1 - 1] = (int) (Math.sin((double) class2.field73 / 14.0D) * 16.0D + Math.sin((double) class2.field73 / 15.0D) * 14.0D + Math.sin((double) class2.field73 / 16.0D) * 12.0D);
        if (class13.field252 > 0) {
            class13.field252 -= 4;
        }
        if (class22.field456 > 0) {
            class22.field456 -= 4;
        }
        if (class13.field252 != 0 || class22.field456 != 0) {
            return;
        }
        int var8 = (int) (Math.random() * 2000.0D);
        if (var8 == 1) {
            class22.field456 = 1024;
        }
        if (var8 == 0) {
            class13.field252 = 1024;
            return;
        }
    }
}
