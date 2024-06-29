import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class158 {

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lkg;")
    public static class115 field2863 = new class115(64);

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Lmb;")
    public static class132 field2865 = class166.method1092("headicons_prayer", 125);

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Lmb;")
    public static class132 field2868 = class166.method1092("<img=0>", 121);

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[Lgj;")
    public static class76[] field2867 = new class76[4];

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field2872 = 0;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Lmb;")
    private static class132 field2871 = class166.method1092("white:", 121);

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Lmb;")
    public static class132 field2869 = field2871;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Lmb;")
    public static class132 field2866 = field2871;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIZ)V")
    public static final void method1025(int arg0, int arg1, boolean arg2) {
        field2859++;
        class19 var3 = class15.field216[class139.field2615][arg1][arg0];
        if (var3 == null) {
            class232.method1474(class139.field2615, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class39 var5 = null;
        for (class39 var6 = (class39) var3.method119(arg2); var6 != null; var6 = (class39) var3.method125((byte) -23)) {
            class243 var13 = class58.method389(0, var6.field634.field3620);
            int var14 = var13.field4422;
            if (var13.field4427 == 1) {
                var14 = (var6.field634.field3628 + 1) * var14;
            }
            if (var4 < var14) {
                var4 = var14;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class232.method1474(class139.field2615, arg1, arg0);
            return;
        }
        var3.method122(var5, 3);
        class195 var7 = null;
        class195 var8 = null;
        for (class39 var9 = (class39) var3.method119(arg2); var9 != null; var9 = (class39) var3.method125((byte) -76)) {
            class195 var12 = var9.field634;
            if (var5.field634.field3620 != var12.field3620) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field3620 != var12.field3620 && var7 == null) {
                    var7 = var12;
                }
            }
        }
        long var10 = (long) (arg1 + (arg0 << 7) + 1610612736);
        class128.method842(class139.field2615, arg1, arg0, class195.method1239(arg0 * 128 + 64, class139.field2615, false, arg1 * 128 + 64), var5.field634, var10, var8, var7);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lkd;I)Led;")
    public static final class49 method1026(class112 arg0, int arg1) {
        field2862++;
        if (arg1 >= -5) {
            field2865 = null;
        }
        return new class49(arg0.method750(65280), arg0.method750(65280), arg0.method750(65280), arg0.method750(65280), arg0.method718(false), arg0.method718(false), arg0.method716(-1308));
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method1027(int arg0) {
        field2871 = null;
        field2863 = null;
        field2868 = null;
        if (arg0 == 292) {
            field2869 = null;
            field2865 = null;
            field2866 = null;
            field2867 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I")
    public static final int method1028(int arg0, int arg1) {
        if (arg1 == -15768) {
            field2864++;
            return arg0 >>> 8;
        } else {
            return -74;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)Lii;")
    public static final class96 method1029(byte arg0, int arg1) {
        field2861++;
        if (arg0 >= -91) {
            return null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class97.field1866[var2] == null || class97.field1866[var2][var3] == null) {
            boolean var4 = class137.method933(256, var2);
            if (!var4) {
                return null;
            }
        }
        return class97.field1866[var2][var3];
    }
}
