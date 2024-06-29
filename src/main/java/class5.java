import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public int field103 = 0;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public int field110 = 0;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field112 = 0;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "Loc;")
    public static class99 field117 = class48.method402((byte) -104, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Loc;")
    public static class99 field108 = class48.method402((byte) -104, ": ");

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Loc;")
    public static class99 field122 = class48.method402((byte) -104, "Cabbage");

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Loc;")
    private static class99 field106 = class48.method402((byte) -104, "yellow:");

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "Loc;")
    public static class99 field123 = field106;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "Loc;")
    public static class99 field116 = field106;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public int field105;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "Ldc;")
    public static class24 field121;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Lef;")
    public static class35 field114;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Lme;")
    public class88 field118;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field99;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
    public static int[] field96;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "[Lld;")
    public static class80[] field104;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method28(int arg0) {
        class17.field453.method874((byte) 68);
        if (arg0 < 20) {
            field122 = null;
        }
        class32.field761 = class40.method336(class32.field761);
        field115++;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static final void method29(int arg0) {
        if (arg0 != -16) {
            method30(null, null, 120, false, null, -3);
        }
        while (class39.field965.method863(class77.field1903, -30878) >= 27) {
            int var1 = class39.field965.method864(15, -25644);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class149.field3691[var1] == null) {
                class149.field3691[var1] = new class149();
                var2 = true;
            }
            class149 var3 = class149.field3691[var1];
            class9.field232[class86.field2151++] = var1;
            var3.field3068 = class101.field2444;
            int var4 = class39.field965.method864(1, arg0 ^ 0x6424);
            if (var4 == 1) {
                class126.field3041[class141.field3493++] = var1;
            }
            int var5 = class46.field1136[class39.field965.method864(3, -25644)];
            if (var2) {
                var3.field3107 = var5;
            }
            int var6 = class39.field965.method864(5, arg0 ^ 0x6424);
            var3.field3689 = class149.method1206(class39.field965.method864(13, -25644), (byte) 46);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class39.field965.method864(5, -25644);
            int var8 = class39.field965.method864(1, arg0 ^ 0x6424);
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.field3126 = var3.field3689.field1114;
            var3.field3114 = var3.field3689.field1093;
            if (var3.field3114 == 0) {
                var3.field3107 = 0;
            }
            var3.field3082 = var3.field3689.field1120;
            var3.field3119 = var3.field3689.field1095;
            var3.field3109 = var3.field3689.field1106;
            var3.field3090 = var3.field3689.field1103;
            var3.field3084 = var3.field3689.field1115;
            var3.field3099 = var3.field3689.field1110;
            var3.field3078 = var3.field3689.field1124;
            var3.method1038(var8 == 1, class69.field1770.field3096[0] + var7, 25363, class69.field1770.field3100[0] + var6);
        }
        field94++;
        class39.field965.method872((byte) 95);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lpc;Loc;IZLoc;I)V")
    public static final void method30(class105 arg0, class99 arg1, int arg2, boolean arg3, class99 arg4, int arg5) {
        int var6 = arg0.method883(arg1, 121);
        field97++;
        int var7 = arg0.method898(arg4, arg2 ^ 0x3D, var6);
        class79.method683(arg0, arg5, false, arg3, var6, var7);
        if (arg2 != 1) {
            field120 = -109;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Loc;")
    public static final class99 method31(int arg0, int arg1) {
        if (arg1 == 10) {
            field95++;
            return class72.method657(26, 10, false, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public static void method32(boolean arg0) {
        field122 = null;
        field106 = null;
        field123 = null;
        field117 = null;
        field116 = null;
        field104 = null;
        field99 = null;
        field121 = null;
        field114 = null;
        field108 = null;
        if (arg0) {
            field96 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([Loc;B)[Loc;")
    public static final class99[] method33(class99[] arg0, byte arg1) {
        field88++;
        class99[] var2 = new class99[5];
        int var3 = 0;
        if (arg1 > -45) {
            field99 = null;
        }
        while (var3 < 5) {
            var2[var3] = class20.method189(new class99[] { method31(var3, 10), field108 }, 10);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class20.method189(new class99[] { var2[var3], arg0[var3] }, 102);
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public static final void method34(int arg0) {
        field93++;
        if (!class145.field3626) {
            return;
        }
        class89.field2210 = null;
        class1.field20 = null;
        class143.field3567 = null;
        class2.field43 = null;
        class80.field1978 = null;
        class59.field1580 = null;
        class60.field1597 = null;
        class16.field414 = null;
        class53.field1257 = null;
        class4.field70 = null;
        class105.field2558 = null;
        class52.field1236 = null;
        class49.field1188 = null;
        class37.field939 = null;
        class80.field1982 = null;
        class52.field1254 = null;
        class60.field1598 = null;
        if (arg0 >= -94) {
            method31(36, 118);
        }
        class54.field1282 = null;
        class42.field1021 = null;
        class59.field1592 = null;
        class104.field2518 = null;
        class69.method602(2, -109);
        class61.method543(true, -60);
        class145.field3626 = false;
    }
}
