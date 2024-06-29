import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lje;")
    public static class67 field482 = class85.method592(255, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!de", name = "f", descriptor = "[[S")
    public static short[][] field484 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lje;")
    private static class67 field481 = class85.method592(255, "Unable to connect)3");

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Lje;")
    public static class67 field494 = class85.method592(255, "scape main");

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Lje;")
    public static class67 field493 = class85.method592(255, ":assist:");

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Lje;")
    public static class67 field492 = class85.method592(255, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field486 = 0;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Lje;")
    private static class67 field496 = class85.method592(255, "Loading textures )2 ");

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field487 = 0;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lje;")
    public static class67 field483 = field481;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Lje;")
    public static class67 field499 = field496;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Lje;")
    public static class67 field498 = class85.method592(255, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Lje;")
    public static class67 field490 = field481;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Lje;")
    public static class67 field501 = class85.method592(255, "(U0a )2 in: ");

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Lje;")
    public static class67 field495 = class85.method592(255, "");

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Ljava/awt/Frame;")
    public static Frame field489;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "[I")
    public static int[] field485;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "[[[B")
    public static byte[][][] field491;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method178(int arg0) {
        field490 = null;
        field482 = null;
        field493 = null;
        field491 = null;
        field498 = null;
        field489 = null;
        field499 = null;
        field501 = null;
        field494 = null;
        field484 = null;
        field485 = null;
        field495 = null;
        if (arg0 < -40) {
            field496 = null;
            field492 = null;
            field483 = null;
            field481 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V")
    public static final void method179(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field479++;
        for (int var5 = arg3; var5 < class86.field1918; var5++) {
            if (class75.field1625[var5] + class56.field1114[var5] > arg2 && arg2 + arg4 > class75.field1625[var5] && arg1 < class30.field540[var5] + class141.field3228[var5] && arg1 + arg0 > class30.field540[var5]) {
                class103.field2301[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lha;IBLua;)V")
    public static final void method180(class50 arg0, int arg1, byte arg2, class140 arg3) {
        field497++;
        if (arg2 <= 43) {
            method179(2, -113, 78, 52, -33);
        }
        class98 var4 = new class98();
        var4.field2182 = arg0;
        var4.field300 = arg1;
        var4.field2185 = arg3;
        var4.field2192 = 1;
        class4 var5 = class6.field142;
        synchronized (class6.field142) {
            class6.field142.method19((byte) 99, var4);
        }
        class99.method766(false);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
    public static final void method181(int arg0, int arg1) {
        field480++;
        if (class128.field2823 == arg0) {
            return;
        }
        if (class128.field2823 == 0) {
            class135.method1023((byte) 50);
        }
        if (arg0 == 20 || arg0 == 40) {
            class50.field957 = 0;
            class32.field574 = 0;
            class45.field841 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class154.field3515 != null) {
            class154.field3515.method847(-84);
            class154.field3515 = null;
        }
        if (class128.field2823 == 25) {
            class116.field2621 = 0;
            class128.field2805 = 1;
            field487 = 0;
            class101.field2262 = 0;
            class126.field2777 = 1;
        }
        if (arg1 > -25) {
            method179(114, 89, -74, 63, -14);
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class49.method315(class14.field255, class112.field2531, class98.field2193, 192);
        } else {
            class64.method430(64);
        }
        class128.field2823 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IIIII)V")
    public static final void method182(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 62) {
            method179(-1, -66, -122, -1, 5);
        }
        class117 var5 = (class117) class79.field1705.method1119(28254, (long) arg0);
        if (var5 == null) {
            var5 = new class117();
            class79.field1705.method1115((long) arg0, var5, 1);
        }
        if (var5.field2638.length <= arg3) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field2638.length; var8++) {
                var6[var8] = var5.field2638[var8];
                var7[var8] = var5.field2637[var8];
            }
            for (int var9 = var5.field2638.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2638 = var6;
            var5.field2637 = var7;
        }
        var5.field2638[arg3] = arg2;
        field488++;
        var5.field2637[arg3] = arg1;
    }
}
