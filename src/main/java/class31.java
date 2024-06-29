import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class31 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Ljd;")
    private static class92 field695 = class202.method1325((byte) 90, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Ljd;")
    public static class92 field696 = class202.method1325((byte) 90, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field701 = 0;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Ljd;")
    private static class92 field704 = class202.method1325((byte) 90, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field705 = 0;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Ljd;")
    public static class92 field711 = field704;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field710 = 0;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Ljd;")
    public static class92 field703 = class202.method1325((byte) 90, ": ");

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Z")
    public static boolean field714 = false;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field708 = -1;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Ljd;")
    public static class92 field713 = field695;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "[[I")
    public static int[][] field717 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lbi;")
    public static class20 field702 = new class20(0, 0);

    @OriginalMember(owner = "client!d", name = "x", descriptor = "Ljd;")
    public static class92 field718 = class202.method1325((byte) 90, "Benutzen");

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lud;")
    public static class192 field700;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "[S")
    public static short[] field712;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "[[[Leb;")
    public static class43[][][] field698;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method200(int arg0) {
        field703 = null;
        field713 = null;
        field704 = null;
        field717 = null;
        field700 = null;
        field711 = null;
        field695 = null;
        field718 = null;
        field696 = null;
        field698 = null;
        field712 = null;
        if (arg0 != 12) {
            method205(56, 13);
        }
        field702 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BII)V")
    public abstract void method201(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIB)V")
    public abstract void method202(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
    public abstract void method203(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(DI)V")
    public static final void method204(double arg0, int arg1) {
        if (class14.field409 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class111.field2253[var3] = var4 <= 255 ? var4 : 255;
            }
            class14.field409 = arg0;
        }
        field709++;
        if (arg1 <= 72) {
            method206(94, -41, 13);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I")
    public static final int method205(int arg0, int arg1) {
        if (arg1 != 21645) {
            method205(70, 113);
        }
        field697++;
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V")
    public static final void method206(int arg0, int arg1, int arg2) {
        field706++;
        if (class3.field182 < 2 && class59.field1235 == 0 && !class95.field1918) {
            return;
        }
        class92 var3;
        if (class59.field1235 == 1 && class3.field182 < 2) {
            var3 = class77.method529(arg0 ^ 0x2, new class92[] { class25.field581, class136.field2729, class1.field6, class174.field3368 });
        } else if (class95.field1918 && class3.field182 < 2) {
            var3 = class77.method529(-3, new class92[] { class124.field2527, class136.field2729, class33.field746, class174.field3368 });
        } else {
            var3 = class206.method1340(false, class3.field182 - 1);
        }
        if (class3.field182 > 2) {
            var3 = class77.method529(-3, new class92[] { var3, class137.field2756, class142.method938(class3.field182 - 2, false), class97.field1951 });
        }
        int var4 = class4.field242.method980(var3, arg1 + 4, arg2 - -15, 16777215, 0, class43.field952, class153.field3038);
        if (arg0 == -1) {
            class168.method1116(var4 + class4.field242.method1000(var3), (byte) 82, arg1 + 4, 15, arg2);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static final void method207(int arg0) {
        field707++;
        class196 var1 = class79.field1617;
        synchronized (class79.field1617) {
            class193.field3773 = class22.field526;
            if (class77.field1596 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class16.field445[var2] = false;
                }
                class77.field1596 = class207.field3989;
            } else {
                while (class77.field1596 != class207.field3989) {
                    int var3 = class28.field631[class207.field3989];
                    class207.field3989 = class207.field3989 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class16.field445[var3] = true;
                    } else {
                        class16.field445[~var3] = false;
                    }
                }
            }
            class22.field526 = class147.field2918;
            if (arg0 < 66) {
                field702 = null;
            }
        }
    }
}
