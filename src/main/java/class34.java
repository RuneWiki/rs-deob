import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 {

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public int field802 = 0;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public int field813 = 0;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Z")
    public static boolean field799 = false;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lja;")
    public static class62 field805 = class30.method243(43, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "[S")
    public static short[] field804 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "[I")
    public static int[] field820 = new int[100];

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field812 = -1;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field815 = 0;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field814 = 0;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "[I")
    public static int[] field824 = new int[100];

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lja;")
    public static class62 field800 = class30.method243(43, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "[I")
    public static int[] field816 = new int[50];

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "Lja;")
    public static class62 field826 = class30.method243(43, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public int field821;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "Luc;")
    public class140 field825;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "[I")
    public static int[] field811;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[[B")
    public static byte[][] field801;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "[[[B")
    public static byte[][][] field817;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)V")
    public static final void method261(boolean arg0, int arg1) {
        for (int var2 = 0; var2 < class83.field2001; var2++) {
            class130 var3 = class136.field3127[class36.field871[var2]];
            int var4 = (class36.field871[var2] << 14) + 536870912;
            if (var3 != null && var3.method66((byte) -24) && var3.field2966.field3191 == arg0 && var3.field2966.method1107((byte) 99)) {
                int var5 = var3.field136 >> 7;
                int var6 = var3.field134 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field149 == 1 && (var3.field136 & 0x7F) == 64 && (var3.field134 & 0x7F) == 64) {
                        if (class103.field2395[var5][var6] == class116.field2671) {
                            continue;
                        }
                        class103.field2395[var5][var6] = class116.field2671;
                    }
                    if (!var3.field2966.field3202) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class119.field2703.method576(class155.field3598, var3.field136, var3.field134, class111.method908(128, var3.field149 * 64 + var3.field136 - 64, (var3.field149 - 1) * 64 + var3.field134, class155.field3598), var3.field149 * 64 + 60 - 64, var3, var3.field168, var4, var3.field145);
                }
            }
        }
        if (arg1 != 60) {
            method261(true, 8);
        }
        field798++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IJ)V")
    public static final void method262(int arg0, long arg1) {
        field803++;
        if (arg1 == 0L) {
            return;
        }
        if (class100.field2339 >= 100) {
            class43.method320(0, 0, class143.field3349, class83.field1991);
            return;
        }
        class62 var3 = class111.method899(false, arg1).method462(95);
        for (int var4 = 0; var4 < class100.field2339; var4++) {
            if (class47.field1077[var4] == arg1) {
                class43.method320(~arg0, 0, class70.method594(new class62[] { var3, class40.field930 }, 1229), class83.field1991);
                return;
            }
        }
        for (int var5 = 0; var5 < class54.field1334; var5++) {
            if (class94.field2217[var5] == arg1) {
                class43.method320(0, 0, class70.method594(new class62[] { class39.field916, var3, class81.field1968 }, 1229), class83.field1991);
                return;
            }
        }
        if (var3.method475(25, class40.field936.field2653)) {
            class43.method320(0, 0, class12.field297, class83.field1991);
            return;
        }
        class47.field1077[class100.field2339++] = arg1;
        class5.field102 = class150.field3538;
        class136.field3140.method810(arg0 + arg0, 160);
        class8.field232++;
        class136.field3140.method1008(arg1, (byte) 38);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZI)V")
    public static final void method263(int arg0, boolean arg1, int arg2) {
        long var3 = (long) ((arg2 << 16) + arg0);
        field807++;
        class50 var5 = (class50) class138.field3192.method537(-1, var3);
        if (!arg1) {
            field824 = null;
        }
        if (var5 != null) {
            class96.field2249.method74(-6789, var5);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static void method264(boolean arg0) {
        field820 = null;
        if (!arg0) {
            field820 = null;
        }
        field804 = null;
        field801 = null;
        field800 = null;
        field805 = null;
        field816 = null;
        field824 = null;
        field817 = null;
        field826 = null;
        field811 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I")
    public static final int method265(int arg0, int arg1, int arg2) {
        field809++;
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        if (arg0 != -1) {
            method262(-9, 119L);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B[Lja;)[Lja;")
    public static final class62[] method266(byte arg0, class62[] arg1) {
        if (arg0 > -33) {
            method267(null, -70, null, 119);
        }
        field808++;
        class62[] var2 = new class62[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class70.method594(new class62[] { class31.method249(true, var3), class36.field860 }, 1229);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class70.method594(new class62[] { var2[var3], arg1[var3] }, 1229);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lea;ILu;I)V")
    public static final void method267(class29 arg0, int arg1, class141 arg2, int arg3) {
        field823++;
        class144 var4 = new class144();
        var4.field3369 = arg2;
        var4.field3357 = 1;
        if (arg3 >= -5) {
            method263(107, false, 86);
        }
        var4.field3360 = arg0;
        var4.field3493 = arg1;
        class105 var5 = class36.field863;
        synchronized (class36.field863) {
            class36.field863.method847(var4, (byte) 112);
        }
        class18.method125(0);
    }
}
