import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 extends class148 {

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field680 = 5063219;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "Lja;")
    public static class62 field682 = class30.method243(43, "ams");

    @OriginalMember(owner = "client!df", name = "F", descriptor = "[I")
    public static int[] field688 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!df", name = "I", descriptor = "Lja;")
    public static class62 field691 = class30.method243(43, "Nehmen");

    @OriginalMember(owner = "client!df", name = "C", descriptor = "Lja;")
    public static class62 field685 = class30.method243(43, "<br>(X");

    @OriginalMember(owner = "client!df", name = "J", descriptor = "Lja;")
    public static class62 field692 = class30.method243(43, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Z")
    public static boolean field681 = true;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "Lja;")
    private static class62 field696 = class30.method243(43, "M");

    @OriginalMember(owner = "client!df", name = "P", descriptor = "Lja;")
    public static class62 field698 = field696;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "Lja;")
    public static class62 field701 = field696;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "Lpd;")
    public static class108 field697;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Ldf;")
    public class28 field684;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "Ldf;")
    public class28 field689;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "Lhe;")
    public static class54 field687;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "Lhe;")
    public static class54 field693;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public static final void method221(int arg0) {
        field690++;
        if (arg0 != 0) {
            field694 = -5;
        }
        class100.field2319.method127((byte) -120);
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Lq;")
    public static final class114 method222(int arg0) {
        field702++;
        class114 var1 = new class114();
        var1.field2625 = class23.field539[0];
        var1.field2624 = class17.field395[0];
        var1.field2618 = class136.field3146;
        var1.field2622 = class10.field256;
        var1.field2620 = class82.field1986[0];
        var1.field2619 = class143.field3335[arg0];
        var1.field2623 = class57.field1397[0];
        var1.field2621 = class16.field377;
        class142.method1125(2157);
        return var1;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
    public static void method223(byte arg0) {
        field698 = null;
        field697 = null;
        int var1 = -57 / ((58 - arg0) / 49);
        field687 = null;
        field685 = null;
        field696 = null;
        field692 = null;
        field701 = null;
        field693 = null;
        field691 = null;
        field688 = null;
        field682 = null;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(II)Lof;")
    public static final class103 method224(int arg0, int arg1) {
        field703++;
        class103 var2 = (class103) class100.field2319.method129((long) arg1, 24838);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class105.field2432.method867(4, arg0 ^ 0x1BD9, arg1);
        if (arg0 != 7126) {
            field688 = null;
        }
        class103 var4 = new class103();
        if (var3 != null) {
            var4.method826((byte) 9, new class128(var3), arg1);
        }
        var4.method824((byte) -50);
        class100.field2319.method128((byte) -83, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lae;I)V")
    public static final void method225(class6 arg0, int arg1) {
        field700++;
        if (arg0.field154 == 0) {
            return;
        }
        if (arg0.field172 != -1 && arg0.field172 < 32768) {
            class130 var2 = class136.field3127[arg0.field172];
            if (var2 != null) {
                int var3 = arg0.field136 - var2.field136;
                int var4 = arg0.field134 - var2.field134;
                if (var3 != 0 || var4 != 0) {
                    arg0.field137 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field172 >= 32768) {
            int var5 = arg0.field172 - 32768;
            if (class34.field812 == var5) {
                var5 = 2047;
            }
            class115 var6 = class52.field1200[var5];
            if (var6 != null) {
                int var7 = arg0.field134 - var6.field134;
                int var8 = arg0.field136 - var6.field136;
                if (var8 != 0 || var7 != 0) {
                    arg0.field137 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field186 != 0 || arg0.field133 != 0) && (arg0.field156 == 0 || arg0.field141 > 0)) {
            int var9 = arg0.field136 - (arg0.field186 - class40.field926 - class40.field926) * 64;
            int var10 = arg0.field134 - (arg0.field133 - class27.field673 - class27.field673) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field137 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field133 = 0;
            arg0.field186 = 0;
        }
        int var11 = arg0.field137 - arg0.field168 & arg1;
        if (var11 == 0) {
            arg0.field146 = 0;
            return;
        }
        arg0.field146++;
        if (var11 > 1024) {
            arg0.field168 -= arg0.field154;
            boolean var12 = true;
            if (arg0.field154 > var11 || var11 > 2048 - arg0.field154) {
                arg0.field168 = arg0.field137;
                var12 = false;
            }
            if (arg0.field191 == arg0.field178 && (arg0.field146 > 25 || var12)) {
                if (arg0.field153 == -1) {
                    arg0.field191 = arg0.field190;
                } else {
                    arg0.field191 = arg0.field153;
                }
            }
        } else {
            arg0.field168 += arg0.field154;
            boolean var13 = true;
            if (var11 < arg0.field154 || var11 > 2048 - arg0.field154) {
                arg0.field168 = arg0.field137;
                var13 = false;
            }
            if (arg0.field191 == arg0.field178 && (arg0.field146 > 25 || var13)) {
                if (arg0.field152 == -1) {
                    arg0.field191 = arg0.field190;
                } else {
                    arg0.field191 = arg0.field152;
                }
            }
        }
        arg0.field168 &= 0x7FF;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)V")
    public static final void method226(long arg0, int arg1) {
        field686++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = arg1; var3 < class100.field2339; var3++) {
            if (class47.field1077[var3] == arg0) {
                class100.field2339--;
                class46.field1053++;
                for (int var4 = var3; var4 < class100.field2339; var4++) {
                    class47.field1077[var4] = class47.field1077[var4 + 1];
                }
                class5.field102 = class150.field3538;
                class136.field3140.method810(-2, 23);
                class136.field3140.method1008(arg0, (byte) 38);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lpd;B)V")
    public static final void method227(class108 arg0, byte arg1) {
        class26.field610 = arg0;
        field695++;
        if (arg1 != -105) {
            field701 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(B)V")
    public final void method228(byte arg0) {
        field699++;
        if (this.field684 == null) {
            return;
        }
        if (arg0 <= 98) {
            this.method228((byte) 112);
        }
        this.field684.field689 = this.field689;
        this.field689.field684 = this.field684;
        this.field684 = null;
        this.field689 = null;
    }
}
