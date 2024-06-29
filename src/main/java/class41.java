import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class41 {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Led;")
    private class29 field1149 = new class29();

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lie;")
    private class53 field1152 = new class53();

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    private int field1153;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Lbc;")
    private class10 field1159;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[[B")
    public static byte[][] field1146 = new byte[1000][];

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field1148 = 0;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static volatile int field1145 = -1;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lwb;")
    private static class130 field1151 = class26.method212("Checking for updates )2 ", -32376);

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lwb;")
    public static class130 field1160 = field1151;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Ls;")
    public static class108 field1155 = new class108();

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field1164 = 10;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Lwb;")
    private static class130 field1168 = class26.method212(" from your ignore list first", -32376);

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Lwb;")
    private static class130 field1165 = class26.method212(" ", -32376);

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "Lwb;")
    public static class130 field1167 = field1165;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Lwb;")
    public static class130 field1162 = field1168;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Lge;")
    public static class41 field1169 = new class41(64);

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "[Lqd;")
    public static class100[] field1166;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)I", line = 18)
    public static final int method399(boolean arg0, int arg1) {
        field1157++;
        class63 var2 = class40.method388(arg1, 14);
        if (arg0) {
            method406(-119, 28);
        }
        int var3 = var2.field1596;
        int var4 = var2.field1608;
        int var5 = var2.field1602;
        int var6 = class32.field880[var4 - var5];
        return class29.field819[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V", line = 389)
    public class41(int arg0) {
        this.field1158 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1153 = arg0;
        this.field1159 = new class10(var2);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lwb;BLwb;I)V", line = 55)
    public static final void method400(class130 arg0, byte arg1, class130 arg2, int arg3) {
        if (arg3 == 0 && class6.field200 != -1) {
            class109.field2676 = arg2;
            class119.field2921 = 0;
        }
        field1163++;
        if (class22.field632 == -1) {
            class129.field3047 = true;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class69.field1786[var4] = class69.field1786[var4 - 1];
            class93.field2218[var4] = class93.field2218[var4 - 1];
            class37.field1089[var4] = class37.field1089[var4 - 1];
        }
        class69.field1786[0] = arg3;
        class93.field2218[0] = arg0;
        if (arg1 == 56) {
            class37.field1089[0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 98)
    public final void method401(int arg0) {
        field1156++;
        if (arg0 != 26116) {
            method400(null, (byte) 91, null, -21);
        }
        while (true) {
            class29 var2 = this.field1152.method459(48);
            if (var2 == null) {
                this.field1153 = this.field1158;
                return;
            }
            var2.method714((byte) 76);
            var2.method239(arg0 - 26115);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JI)Led;", line = 136)
    public final class29 method402(long arg0, int arg1) {
        field1150++;
        if (arg1 >= -105) {
            this.method401(-102);
        }
        class29 var4 = (class29) this.field1159.method78((byte) -21, arg0);
        if (var4 != null) {
            this.field1152.method449(var4, -101);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JLed;B)V", line = 165)
    public final void method403(long arg0, class29 arg1, byte arg2) {
        if (this.field1153 == 0) {
            class29 var5 = this.field1152.method459(48);
            var5.method714((byte) 66);
            var5.method239(1);
            if (this.field1149 == var5) {
                class29 var6 = this.field1152.method459(48);
                var6.method714((byte) 117);
                var6.method239(1);
            }
        } else {
            this.field1153--;
        }
        field1154++;
        if (arg2 != -101) {
            this.method405(99L, true);
        }
        this.field1159.method80(arg0, arg1, -1);
        this.field1152.method449(arg1, -101);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 194)
    public static void method404(int arg0) {
        field1167 = null;
        field1166 = null;
        field1165 = null;
        field1168 = null;
        field1151 = null;
        field1162 = null;
        if (arg0 != -22861) {
            method406(110, -50);
        }
        field1160 = null;
        field1155 = null;
        field1169 = null;
        field1146 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(JZ)V", line = 215)
    public final void method405(long arg0, boolean arg1) {
        if (arg1) {
            this.method405(-52L, false);
        }
        class29 var4 = (class29) this.field1159.method78((byte) -21, arg0);
        field1147++;
        if (var4 != null) {
            var4.method714((byte) -114);
            var4.method239(1);
            this.field1153++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V", line = 240)
    public static final void method406(int arg0, int arg1) {
        if (arg0 == -3) {
            class30.method244(class120.field2942, (byte) 43, class1.field2, class130.field3108);
        } else if (arg0 == -2) {
            class30.method244(class105.field2559, (byte) 75, class130.field3106, class130.field3131);
        } else if (arg0 == -1) {
            class30.method244(class120.field2953, (byte) 51, class63.field1610, class130.field3110);
        } else if (arg0 == 3) {
            class30.method244(class19.field565, (byte) 41, class130.field3119, class130.field3117);
        } else if (arg0 == 4) {
            class30.method244(class8.field277, (byte) 94, class47.field1263, class130.field3123);
        } else if (arg0 == 5) {
            class30.method244(class46.field1247, (byte) 121, class58.field1460, class130.field3120);
        } else if (arg0 == 6) {
            class30.method244(class2.field21, (byte) 112, class71.field1808, class130.field3146);
        } else if (arg0 == 7) {
            class30.method244(class21.field614, (byte) 115, class68.field1746, class130.field3140);
        } else if (arg0 == 8) {
            class30.method244(class35.field1000, (byte) 96, class26.field759, class130.field3144);
        } else if (arg0 == 9) {
            class30.method244(class117.field2885, (byte) 109, class79.field1919, class130.field3143);
        } else if (arg0 == 10) {
            class30.method244(class27.field789, (byte) 51, class26.field750, class130.field3124);
        } else if (arg0 == 11) {
            class30.method244(class97.field2340, (byte) 98, class130.field3105, class130.field3130);
        } else if (arg0 == 12) {
            class30.method244(class132.field3189, (byte) 114, class106.field2563, class130.field3134);
        } else if (arg0 == 13) {
            class30.method244(class120.field2939, (byte) 95, class123.field2979, class130.field3133);
        } else if (arg0 == 14) {
            class30.method244(class26.field761, (byte) 120, class51.field1350, class130.field3136);
        } else if (arg0 == 16) {
            class30.method244(class26.field765, (byte) 49, class99.field2387, class130.field3139);
        } else if (arg0 == 17) {
            class30.method244(class115.field2832, (byte) 68, class103.field2519, class130.field3109);
        } else if (arg0 == 18) {
            class30.method244(class94.field2268, (byte) 94, class61.field1579, class130.field3125);
        } else if (arg0 == 20) {
            class30.method244(class120.field2948, (byte) 63, class24.field694, class130.field3104);
        } else if (arg0 == 22) {
            class30.method244(class14.field414, (byte) 99, class123.field2990, class130.field3118);
        } else if (arg0 == 23) {
            class30.method244(class26.field755, (byte) 57, class8.field279, class130.field3114);
        } else if (arg0 == 24) {
            class30.method244(class17.field481, (byte) 126, class69.field1769, class130.field3127);
        } else if (arg0 == 25) {
            class30.method244(class120.field2935, (byte) 106, class68.field1756, class130.field3142);
        } else if (arg0 == 26) {
            class30.method244(class79.field1910, (byte) 62, class115.field2848, class130.field3137);
        } else if (arg0 == 27) {
            class30.method244(class109.field2651, (byte) 44, class130.field3147, class130.field3138);
        } else {
            class30.method244(class120.field2954, (byte) 55, class121.field2967, class130.field3149);
        }
        if (arg1 != -28388) {
            method404(70);
        }
        class90.method669(arg1 ^ 0xFFFFDB59, 10);
        field1161++;
    }
}
