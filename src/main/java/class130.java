import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class130 {

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3154 = 0;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3156 = 0;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lae;")
    private static class6 field3148 = class64.method474(109, "Please use a different world)3");

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lae;")
    public static class6 field3147 = class64.method474(127, "Spiel)2Fenster geladen)3");

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lae;")
    public static class6 field3159 = field3148;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lae;")
    public static class6 field3158 = class64.method474(111, "Ausw-=hlen");

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3163 = 0;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Lae;")
    public static class6 field3161 = field3148;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3160 = 0;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lte;")
    public static class121 field3153;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "Lva;")
    public static class128 field3165;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
    public static int[] field3144;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIB)V", line = 4)
    public static final void method1049(int arg0, int arg1, byte arg2) {
        class95 var3 = class27.field682[class15.field305][arg0][arg1];
        field3166++;
        if (var3 == null) {
            class81.field1967.method538(class15.field305, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class49 var5 = null;
        for (class49 var6 = (class49) var3.method798(false); var6 != null; var6 = (class49) var3.method792((byte) -87)) {
            class22 var11 = class43.method356(-69, var6.field1106);
            int var12 = var11.field578;
            if (var11.field550 == 1) {
                var12 = (var6.field1099 + 1) * var12;
            }
            if (var12 > var4) {
                var5 = var6;
                var4 = var12;
            }
        }
        if (var5 == null) {
            class81.field1967.method538(class15.field305, arg0, arg1);
            return;
        }
        var3.method795(var5, -95);
        class49 var7 = null;
        int var8 = arg0 + (arg1 << 7) + 1610612736;
        class49 var9 = (class49) var3.method798(false);
        if (arg2 != -127) {
            field3164 = -15;
        }
        class49 var10 = null;
        while (var9 != null) {
            if (var5.field1106 != var9.field1106) {
                if (var7 == null) {
                    var7 = var9;
                }
                if (var7.field1106 != var9.field1106 && var10 == null) {
                    var10 = var9;
                }
            }
            var9 = (class49) var3.method792((byte) -87);
        }
        class81.field1967.method556(class15.field305, arg0, arg1, class20.method193(arg1 * 128 + 64, 9990, class15.field305, arg0 * 128 + 64), var5, var8, var7, var10);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 91)
    public static void method1050(int arg0) {
        field3144 = null;
        field3148 = null;
        field3159 = null;
        field3158 = null;
        field3161 = null;
        field3153 = null;
        field3165 = null;
        field3147 = null;
        if (arg0 < 98) {
            field3159 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILte;)[I", line = 113)
    public static final int[] method1051(int arg0, class121 arg1) {
        int var2 = arg1.field2960 >> 16;
        field3146++;
        if (!class21.method208(0, var2)) {
            return null;
        }
        int var3 = arg1.field2967;
        int var4 = arg1.field2879;
        class121 var7;
        for (int var5 = arg1.field2915; var5 != -1; var5 = var7.field2915) {
            var7 = class35.field828[var2][var5 & 0xFFFF];
            var4 += var7.field2879 - var7.field2847;
            var3 += var7.field2967 - var7.field2936;
        }
        int[] var6 = new int[] { 0, var4 };
        if (arg0 != -6622) {
            field3162 = 55;
        }
        var6[0] = var3;
        return var6;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V", line = 153)
    public static final void method1052(int arg0) {
        Object var1 = class7.field138;
        synchronized (class7.field138) {
            if (class37.field850 == 0) {
                class64.field1391.method280(-82, new class138(), 5);
            }
            if (arg0 < 116) {
                field3153 = null;
            }
            class37.field850 = 600;
        }
        field3145++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLed;Ljava/awt/Component;II)Lcc;", line = 188)
    public static final class17 method1053(boolean arg0, class31 arg1, Component arg2, int arg3, int arg4) {
        field3151++;
        if (arg3 != 20697) {
            field3158 = null;
        }
        class24.method227(arg4, arg2, arg0, arg1, 0);
        class17 var5 = new class17();
        class19.method184((byte) 121, var5);
        return var5;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IJ)V", line = 203)
    public static final void method1054(int arg0, long arg1) {
        field3149++;
        if (arg1 == 0L) {
            return;
        }
        if (class24.field613 >= 100) {
            class73.method575(class133.field3262, class37.field848, false, 0);
            return;
        }
        class6 var3 = class95.method783(arg1, (byte) 88).method44((byte) -84);
        for (int var4 = 0; var4 < class24.field613; var4++) {
            if (class64.field1402[var4] == arg1) {
                class73.method575(class133.field3262, class85.method731(new class6[] { var3, class72.field1642 }, arg0 + 14569), false, 0);
                return;
            }
        }
        for (int var5 = arg0; var5 < class7.field139; var5++) {
            if (class109.field2609[var5] == arg1) {
                class73.method575(class133.field3262, class85.method731(new class6[] { class103.field2436, var3, class25.field625 }, 14569), false, 0);
                return;
            }
        }
        if (var3.method60(class12.field229.field1456, (byte) 120)) {
            return;
        }
        class64.field1402[class24.field613++] = arg1;
        class139.field3380 = true;
        class122.field3004++;
        class111.field2660.method938((byte) 63, 198);
        class111.field2660.method639(true, arg1);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)Lia;", line = 264)
    public static final class50 method1055(byte arg0, int arg1) {
        field3157++;
        class50 var2 = (class50) class111.field2681.method128((byte) -45, (long) arg1);
        int var3 = 117 % ((arg0 - 57) / 35);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class116.field2749.method160(30605, 5, arg1);
        class50 var5 = new class50();
        if (var4 != null) {
            var5.method400(new class77(var4), (byte) 24);
        }
        class111.field2681.method130(var5, (long) arg1, (byte) 122);
        return var5;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLbf;)V", line = 296)
    public static final void method1056(byte arg0, class14 arg1) {
        field3155++;
        class22.field572 = arg1;
        if (arg0 < 50) {
            field3161 = null;
        }
    }
}
