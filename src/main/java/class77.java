import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class77 {

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Lgd;")
    private class46 field1676 = new class46();

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1674 = 0;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lsc;")
    private static class128 field1670 = class129.method1017(false, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Lsc;")
    public static class128 field1682 = class129.method1017(false, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Lsc;")
    public static class128 field1681 = class129.method1017(false, "scrollbar");

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lsc;")
    private static class128 field1673 = class129.method1017(false, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lsc;")
    public static class128 field1683 = class129.method1017(false, "Benutzen");

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lsc;")
    public static class128 field1671 = field1673;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Lsc;")
    public static class128 field1686 = class129.method1017(false, "sl_button");

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field1688 = 2;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Lsc;")
    public static class128 field1678 = field1670;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILhe;)I")
    public static final int method561(int arg0, class54 arg1) {
        field1685++;
        class110 var2 = (class110) class152.field3495.method969(((long) arg1.field1117 << 32) + ((long) arg1.field1162), -90);
        if (var2 == null) {
            if (arg0 < 17) {
                field1688 = -106;
            }
            return arg1.field1195;
        } else {
            return var2.field2478;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Lgd;")
    public final class46 method562(byte arg0) {
        if (arg0 > -47) {
            return null;
        }
        class46 var2 = this.field1676.field853;
        field1677++;
        if (this.field1676 == var2) {
            return null;
        } else {
            var2.method339(120);
            return var2;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Lgd;")
    public final class46 method563(int arg0) {
        class46 var2 = this.field1676.field853;
        if (arg0 > -70) {
            return null;
        } else {
            field1687++;
            return this.field1676 == var2 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZLsf;)V")
    public static final void method564(boolean arg0, class131 arg1) {
        class54.field1198 = arg1;
        if (!arg0) {
            method569((byte) 63, null, -63);
        }
        field1680++;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
    public static void method565(byte arg0) {
        field1686 = null;
        field1673 = null;
        field1671 = null;
        field1670 = null;
        field1681 = null;
        field1682 = null;
        field1678 = null;
        field1683 = null;
        if (arg0 >= -21) {
            method569((byte) -24, null, -117);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILi;)V")
    public static final void method566(int arg0, class56 arg1) {
        short var2 = 256;
        field1679++;
        for (int var3 = 0; var3 < class9.field135.length; var3++) {
            class9.field135[var3] = 0;
        }
        if (arg0 != 1) {
            field1670 = null;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class9.field135[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class53.field1044[var15] = (class9.field135[var15 - 128] + class9.field135[var15 + 128] + class9.field135[var15 + 1] + class9.field135[var15 + -1]) / 4;
                }
            }
            int[] var13 = class9.field135;
            class9.field135 = class53.field1044;
            class53.field1044 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field1234; var7++) {
            for (int var8 = 0; var8 < arg1.field1237; var8++) {
                if (arg1.field1239[var6++] != 0) {
                    int var9 = var8 + arg1.field1238 + 16;
                    int var10 = arg1.field1240 + var7 + 16;
                    int var11 = var9 + (var10 << 7);
                    class9.field135[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lgd;I)V")
    public final void method567(class46 arg0, int arg1) {
        field1684++;
        if (arg1 != 0) {
            this.method562((byte) 33);
        }
        if (arg0.field855 != null) {
            arg0.method339(124);
        }
        arg0.field853 = this.field1676;
        arg0.field855 = this.field1676.field855;
        arg0.field855.field853 = arg0;
        arg0.field853.field855 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILgd;)V")
    public final void method568(int arg0, class46 arg1) {
        if (arg1.field855 != null) {
            arg1.method339(67);
        }
        field1672++;
        arg1.field855 = this.field1676;
        arg1.field853 = this.field1676.field853;
        int var3 = -71 % ((-arg0 - 63) / 39);
        arg1.field855.field853 = arg1;
        arg1.field853.field855 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLhe;I)Lsc;")
    public static final class128 method569(byte arg0, class54 arg1, int arg2) {
        field1669++;
        if (!class143.method1165(31740, arg2, method561(28, arg1)) && arg1.field1113 == null) {
            return null;
        }
        if (arg0 >= -94) {
            method566(0, null);
        }
        if (arg1.field1134 == null || arg2 >= arg1.field1134.length || arg1.field1134[arg2] == null || arg1.field1134[arg2].method975(-1).method1014(-9) == 0) {
            return class5.field43 ? class51.method395(new class128[] { class21.field409, class111.method857(arg2, (byte) 125) }, false) : null;
        } else {
            return arg1.field1134[arg2];
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
    public static final void method570(int arg0, int arg1) {
        if (arg0 == arg1) {
            class62.method462(true, class86.field1968, class154.field3555, class132.field3098);
        } else if (arg1 == -2) {
            class62.method462(true, class132.field3068, class112.field2538, class132.field3084);
        } else if (arg1 == -1) {
            class62.method462(true, class117.field2635, class154.field3548, class132.field3096);
        } else if (arg1 == 3) {
            class62.method462(true, class132.field3064, class120.field2739, class132.field3099);
        } else if (arg1 == 4) {
            class62.method462(true, class79.field1754, class128.field2935, class132.field3081);
        } else if (arg1 == 5) {
            class62.method462(true, class60.field1281, field1671, class132.field3078);
        } else if (arg1 == 6) {
            class62.method462(true, class20.field376, class134.field3144, class132.field3056);
        } else if (arg1 == 7) {
            class62.method462(true, class157.field3595, class33.field636, class132.field3088);
        } else if (arg1 == 8) {
            class62.method462(true, class14.field281, class131.field3027, class132.field3100);
        } else if (arg1 == 9) {
            class62.method462(true, class63.field1357, class2.field29, class132.field3082);
        } else if (arg1 == 10) {
            class62.method462(true, class14.field264, class144.field3365, class132.field3055);
        } else if (arg1 == 11) {
            class62.method462(true, class115.field2594, class99.field2285, class132.field3049);
        } else if (arg1 == 12) {
            class62.method462(true, class82.field1826, class153.field3523, class132.field3062);
        } else if (arg1 == 13) {
            class62.method462(true, class36.field696, class154.field3556, class132.field3071);
        } else if (arg1 == 14) {
            class62.method462(true, class142.field3337, class151.field3462, class132.field3047);
        } else if (arg1 == 16) {
            class62.method462(true, class20.field383, field1678, class132.field3042);
        } else if (arg1 == 17) {
            class62.method462(true, class12.field195, class68.field1535, class132.field3045);
        } else if (arg1 == 18) {
            class62.method462(true, class118.field2678, class60.field1296, class132.field3075);
        } else if (arg1 == 19) {
            class62.method462(true, class154.field3544, class86.field1976, class33.field630);
        } else if (arg1 == 20) {
            class62.method462(true, class73.field1638, class154.field3537, class132.field3074);
        } else if (arg1 == 22) {
            class62.method462(true, class79.field1782, class95.field2217, class132.field3087);
        } else if (arg1 == 23) {
            class62.method462(true, class54.field1206, class151.field3482, class132.field3065);
        } else if (arg1 == 24) {
            class62.method462(true, class95.field2216, class69.field1545, class132.field3086);
        } else if (arg1 == 25) {
            class62.method462(true, class156.field3576, class154.field3531, class132.field3097);
        } else if (arg1 == 26) {
            class62.method462(true, class25.field500, class75.field1645, class132.field3066);
        } else if (arg1 == 27) {
            class62.method462(true, class132.field3048, class89.field2033, class132.field3063);
        } else {
            class62.method462(true, class58.field1249, class154.field3536, class132.field3073);
        }
        class23.method206(20, 10);
        field1675++;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class77() {
        this.field1676.field853 = this.field1676;
        this.field1676.field855 = this.field1676;
    }
}
