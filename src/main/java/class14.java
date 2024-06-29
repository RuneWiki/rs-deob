import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class14 {

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field394 = 3353893;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Z")
    public static boolean field393 = false;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lad;")
    public static class5 field395 = class88.method674("Lade Eingabe)2Steuerungsprogramm)3)3)3", 11);

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "[J")
    public static long[] field400 = new long[100];

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lbb;")
    public static class9 field396 = new class9(64);

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Lad;")
    private static class5 field402 = class88.method674("go back to the main RuneScape webpage", 86);

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field403 = 0;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lad;")
    public static class5 field401 = class88.method674(":  ", 107);

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lad;")
    public static class5 field405 = field402;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Z")
    public static boolean field407 = false;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "[I")
    public static int[] field408 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lad;")
    public static class5 field406 = class88.method674(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 47);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lsb;")
    public static class110 field404;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)[B", line = 4)
    public static final synchronized byte[] method119(byte arg0, int arg1) {
        field398++;
        if (arg1 == 100 && class79.field1868 > 0) {
            byte[] var2 = class135.field3265[--class79.field1868];
            class135.field3265[class79.field1868] = null;
            return var2;
        } else if (arg1 == 5000 && class33.field794 > 0) {
            byte[] var3 = class63.field1521[--class33.field794];
            class63.field1521[class33.field794] = null;
            return var3;
        } else if (arg0 < 36) {
            return null;
        } else if (arg1 == 30000 && class87.field2011 > 0) {
            byte[] var4 = class121.field3012[--class87.field2011];
            class121.field3012[class87.field2011] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Lub;", line = 40)
    public static final class122 method120(int arg0) {
        field397++;
        class122 var1 = new class122();
        var1.field3018 = class90.field2112;
        var1.field3016 = class5.field216;
        var1.field3019 = class61.field1504[0];
        var1.field3017 = class38.field930[0];
        var1.field3015 = class16.field432[0];
        var1.field3020 = class43.field1095[0];
        int var2 = var1.field3020 * var1.field3015;
        byte[] var3 = class17.field458[0];
        var1.field3014 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field3014[var4] = class46.field1198[class104.method832(255, var3[var4])];
        }
        class21.method169((byte) 25);
        if (arg0 != -1) {
            method123(70);
        }
        return var1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 83)
    public static final void method121(Component arg0, int arg1) {
        arg0.removeMouseListener(class116.field2860);
        arg0.removeMouseMotionListener(class116.field2860);
        arg0.removeFocusListener(class116.field2860);
        field391++;
        if (arg1 != 255) {
            method122(53, 91, 6, -46, false, null, (byte) -23);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIZLtb;B)V", line = 96)
    public static final void method122(int arg0, int arg1, int arg2, int arg3, boolean arg4, class116 arg5, byte arg6) {
        field399++;
        long var7 = (long) ((arg3 << 16) + arg2);
        class109 var9 = (class109) class61.field1503.method408(var7, arg1 ^ 0xFFFFDC97);
        if (var9 != null) {
            return;
        }
        class109 var10 = (class109) class43.field1091.method408(var7, 93);
        if (var10 != null) {
            return;
        }
        class109 var11 = (class109) class105.field2585.method408(var7, 78);
        if (var11 == null) {
            if (!arg4) {
                class109 var12 = (class109) class32.field785.method408(var7, 107);
                if (var12 != null) {
                    return;
                }
            }
            class109 var13 = new class109();
            var13.field2739 = arg5;
            var13.field2737 = arg6;
            var13.field2730 = arg0;
            if (arg1 == -8984) {
                if (arg4) {
                    class61.field1503.method403(var7, var13, true);
                    class128.field3056++;
                } else {
                    class56.field1393.method664(var13, (byte) -3);
                    class105.field2585.method403(var7, var13, true);
                    class9.field314++;
                }
            }
        } else if (arg4) {
            var11.method355(-530883280);
            class61.field1503.method403(var7, var11, true);
            class9.field314--;
            class128.field3056++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 163)
    public static void method123(int arg0) {
        field400 = null;
        field401 = null;
        field396 = null;
        field405 = null;
        if (arg0 <= 112) {
            field405 = null;
        }
        field406 = null;
        field408 = null;
        field402 = null;
        field404 = null;
        field395 = null;
    }
}
