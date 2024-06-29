import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class150 extends class157 {

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
    public static int field2735 = 0;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "Lbd;")
    public static class185 field2734 = new class185(64);

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "Lcc;")
    public static class209 field2747 = class95.method669(122, "<img=0>");

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "I")
    public static int field2748 = 0;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "Lcc;")
    public static class209 field2742 = class95.method669(102, "m");

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    public static int field2741 = 0;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "[[S")
    public static short[][] field2744;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lw;Z)V")
    public static final void method1038(class143 arg0, boolean arg1) {
        ++field2743;
        class128.field2469 = 3;
        class41 var2 = null;
        class44.method335(!arg1, true);
        class281.field4940 = true;
        class39.field662 = true;
        class71.field1343 = true;
        class262.field4714 = 0;
        class202.field3639 = 0;
        class163.field2960 = 0;
        class258.field4662 = 255;
        class75.field1406 = 127;
        class234.field4209 = true;
        class163.field2961 = true;
        field2741 = 0;
        class52.field1022 = true;
        class129.field2484 = true;
        class176.field3202 = 127;
        class9.field185 = true;
        class145.field2671 = true;
        class161.field2917 = true;
        class254.field4587 = 2;
        class84.field1681 = true;
        class221.method1565(2);
        class68.field1309 = false;
        class70.field1338 = 0;
        class54.field1063 = 0;
        class69.field1319 = arg1;
        try {
            class203 var3 = arg0.method995("runescape", 0);
            while (var3.field3646 == 0) {
                class174.method1196((byte) 91, 1L);
            }
            if (~var3.field3646 == -2) {
                var2 = (class41) var3.field3642;
                byte[] var4 = new byte[(int) var2.method306((byte) 40)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method304(var5, -1, var4, var4.length - var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class274.method1869(new class106(var4), (byte) -89);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method307(-31335);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(III)V")
    private final void method1039(int arg0, int arg1, int arg2) {
        int var4 = class50.field987[arg0];
        ++field2736;
        int var5 = class129.field2479[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (arg2 + var5));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class187.field3384 = arg1;
            class200.field3582 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class200.field3582 = arg1;
            class187.field3384 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class200.field3582 = -arg1 + class226.field4124;
            class187.field3384 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class187.field3384 = -arg1 + class79.field1469;
            class200.field3582 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class187.field3384 = -arg1 + class79.field1469;
            class200.field3582 = -arg0 + class226.field4124;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class187.field3384 = -arg0 + class79.field1469;
            class200.field3582 = -arg1 + class226.field4124;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class200.field3582 = arg1;
            class187.field3384 = -arg0 + class79.field1469;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class187.field3384 = arg1;
            class200.field3582 = -arg0 + class226.field4124;
        }
        class187.field3384 &= class42.field859;
        class200.field3582 &= class249.field4490;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(BI)I")
    public static final int method1040(byte arg0, int arg1) {
        if (arg0 <= 93) {
            field2741 = -26;
        }
        ++field2739;
        return 127 & arg1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        ++field2740;
        if (arg0 != 1) {
            method1040((byte) -103, -57);
        }
        int[][] var3 = super.field2872.method533(arg1, arg0 + 2);
        if (super.field2872.field1434) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class226.field4124; ++var7) {
                this.method1039(var7, arg1, arg0 + -2049);
                int[][] var8 = this.method1093(class187.field3384, 0, 64);
                var4[var7] = var8[0][class200.field3582];
                var5[var7] = var8[1][class200.field3582];
                var6[var7] = var8[2][class200.field3582];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 < -29) {
            ++field2738;
            if (~arg0 == -1) {
                super.field2877 = ~arg2.method774((byte) 107) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class150() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        if (arg0 != -98) {
            field2734 = null;
        }
        ++field2737;
        int[] var3 = super.field2879.method1269(arg1, 17885);
        if (super.field2879.field3363) {
            for (int var4 = 0; class226.field4124 > var4; ++var4) {
                this.method1039(var4, arg1, -2048);
                int[] var5 = this.method1097((byte) 75, 0, class187.field3384);
                var3[var4] = var5[class200.field3582];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ltf;I)Llg;")
    public static final class13 method1041(class106 arg0, int arg1) {
        ++field2745;
        if (arg1 != 0) {
            field2741 = 63;
        }
        return new class13(arg0.method738(255), arg0.method738(arg1 ^ 255), arg0.method738(255), arg0.method738(255), arg0.method738(255), arg0.method738(255), arg0.method738(arg1 ^ 255), arg0.method738(arg1 ^ 255), arg0.method776(123), arg0.method774((byte) 121));
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V")
    public static void method1042(byte arg0) {
        field2744 = null;
        if (arg0 != 38) {
            field2741 = -13;
        }
        field2734 = null;
        field2742 = null;
        field2747 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(JI)Lcc;")
    public static final class209 method1043(long arg0, int arg1) {
        ++field2749;
        if (arg1 != 10) {
            method1042((byte) 126);
        }
        return class254.method1753(false, true, 10, arg0);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)I")
    public static final int method1044(boolean arg0) {
        ++field2746;
        return !arg0 ? -27 : class161.field2915;
    }
}
