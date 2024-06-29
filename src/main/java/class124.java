import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class124 {

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lwd;")
    public static class150 field2864 = class2.method9(true, ": ");

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lwd;")
    private static class150 field2871 = class2.method9(true, "Hidden");

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lwd;")
    public static class150 field2869 = field2871;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2873 = 0;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lwd;")
    public static class150 field2867 = class2.method9(true, "cross");

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2874 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field2861;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Lkc;")
    public static class72 field2872;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Z")
    public static boolean field2870;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lwb;Lwd;B)I")
    public static final int method939(class148 arg0, class150 arg1, byte arg2) {
        field2862++;
        int var3 = arg0.field3601;
        arg0.method1138(true, arg1.field3718);
        int var4 = 100 / ((arg2 + 41) / 47);
        arg0.field3601 += class99.field2277.method883(0, arg1.field3718, arg1.field3678, arg0.field3601, arg0.field3592, (byte) -121);
        return arg0.field3601 - var3;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)Lwd;")
    public static final class150 method940(long arg0, int arg1) {
        field2868++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            if (arg1 != 12391) {
                return null;
            }
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class144.field3474[(int) (var8 - arg0 * 37L)];
            }
            class150 var7 = new class150();
            var7.field3678 = var6;
            var7.field3718 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
    public static final Object method941(boolean arg0, int arg1, byte[] arg2) {
        field2865++;
        if (arg2 == null) {
            return null;
        }
        if (arg1 != 0) {
            method945((byte) -74);
        }
        if (arg2.length > 136 && !class112.field2593) {
            try {
                class142 var3 = (class142) Class.forName("jb").getDeclaredConstructor().newInstance();
                var3.method505(arg2, arg1 ^ 0x56);
                return var3;
            } catch (Throwable var4) {
                class112.field2593 = true;
            }
        }
        return arg0 ? class150.method1180((byte) -99, arg2) : arg2;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lva;Z)I")
    public static final int method942(class141 arg0, boolean arg1) {
        field2860++;
        class86 var2 = (class86) class2.field25.method534((byte) -112, ((long) arg0.field3323 << 32) + ((long) arg0.field3322));
        if (var2 == null) {
            if (!arg1) {
                field2870 = false;
            }
            return arg0.field3376;
        } else {
            return var2.field2039;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static final void method943(int arg0) {
        field2876++;
        if (arg0 != 0) {
            method944(-7);
        }
        if (!class58.field1490) {
            return;
        }
        class82.field1976 = null;
        class69.field1728 = null;
        class149.field3655 = null;
        class92.field2145 = null;
        class65.field1651 = null;
        class22.field640 = null;
        class56.field1452 = null;
        class21.field583 = null;
        class109.field2524 = null;
        class118.field2717 = null;
        class82.field1980 = null;
        class4.field76 = null;
        class50.field1330 = null;
        class43.field1157 = null;
        class74.field1855 = null;
        class150.field3698 = null;
        class82.field1979 = null;
        class32.field937 = null;
        class131.field3102 = null;
        class126.field2925 = null;
        class136.field3205 = null;
        class130.method985(arg0 ^ 0x7A, 2);
        class30.method246((byte) -77, true);
        class58.field1490 = false;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method944(int arg0) {
        if (arg0 != 20462) {
            method940(-71L, 0);
        }
        field2863++;
        class90.field2096.method431(0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method945(byte arg0) {
        if (arg0 <= 87) {
            return;
        }
        field2869 = null;
        field2872 = null;
        field2864 = null;
        field2871 = null;
        field2867 = null;
    }
}
