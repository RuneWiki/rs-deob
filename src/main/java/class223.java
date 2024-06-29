import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class223 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Lij;")
    public static class50 field3749 = class78.method578(126, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lij;")
    private static class50 field3754 = class78.method578(123, "Continue");

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lij;")
    public static class50 field3755 = field3754;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lij;")
    public static class50 field3758 = class78.method578(124, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lij;")
    private static class50 field3746 = class78.method578(127, "flash1:");

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lij;")
    public static class50 field3750 = field3746;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field3762 = 0;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "Lij;")
    public static class50 field3763 = class78.method578(124, "www)2wtrc");

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lij;")
    public static class50 field3745 = field3746;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lce;B)Lce;")
    public static final class10 method1524(class10 arg0, byte arg1) {
        field3761++;
        if (arg1 != 50) {
            return null;
        }
        class10 var2 = client.method618(arg0);
        if (var2 == null) {
            var2 = arg0.field277;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZZ)V")
    public static final void method1525(boolean arg0, boolean arg1) {
        class80.field1466 = new int[104];
        class139.field2416 = 99;
        class201.field3315 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class196.field3250 = new byte[var2][105][105];
        class102.field1869 = new byte[var2][104][104];
        class155.field2702 = new int[104];
        class179.field2984 = new int[var2][105][105];
        class186.field3056 = new byte[var2][104][104];
        class36.field701 = new int[104];
        if (!arg0) {
            field3754 = null;
        }
        class130.field2280 = new byte[var2][104][104];
        class172.field2871 = new int[104];
        field3759++;
        class203.field3383 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)I")
    public static final int method1526(boolean arg0, int arg1) {
        field3753++;
        if (arg0) {
            method1525(false, false);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZI)Lij;")
    public static final class50 method1527(int arg0, boolean arg1, int arg2) {
        field3752++;
        int var3 = 67 % ((-arg0 - 57) / 40);
        return class102.method777(arg2, 10, 117, arg1);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method1528(int arg0, boolean arg1, byte[] arg2) {
        if (arg0 != 13744) {
            method1525(false, false);
        }
        field3756++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class68.field1289) {
            try {
                class112 var3 = (class112) Class.forName("cc").getDeclaredConstructor().newInstance();
                var3.method592(arg2, (byte) -66);
                return var3;
            } catch (Throwable var4) {
                class68.field1289 = true;
            }
        }
        return arg1 ? class173.method1192(103, arg2) : arg2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lgh;)V")
    public static final void method1529(class106 arg0) {
        for (int var1 = arg0.field1913; var1 <= arg0.field1907; var1++) {
            for (int var2 = arg0.field1906; var2 <= arg0.field1919; var2++) {
                class65 var3 = class59.field1089[arg0.field1912][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1244; var4++) {
                        if (var3.field1236[var4] == arg0) {
                            var3.field1244--;
                            for (int var5 = var4; var5 < var3.field1244; var5++) {
                                var3.field1236[var5] = var3.field1236[var5 + 1];
                                var3.field1239[var5] = var3.field1239[var5 + 1];
                            }
                            var3.field1236[var3.field1244] = null;
                            break;
                        }
                    }
                    var3.field1240 = 0;
                    for (int var6 = 0; var6 < var3.field1244; var6++) {
                        var3.field1240 |= var3.field1239[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static final void method1530(byte arg0) {
        field3751++;
        class170.field2855 = 0;
        class207.field3446 = 0;
        class3.method17(118);
        class140.method973(0);
        class189.method1271(-31530);
        for (int var1 = 0; var1 < class207.field3446; var1++) {
            int var3 = class104.field1896[var1];
            if (class244.field4245 != class41.field764[var3].field3981) {
                if (class41.field764[var3].field959.method481(107)) {
                    class190.method1282(class41.field764[var3], 27262);
                }
                class41.field764[var3].field959 = null;
                class41.field764[var3] = null;
            }
        }
        if (arg0 > -94) {
            method1525(true, true);
        }
        if (class20.field428 != class119.field2109.field3581) {
            throw new RuntimeException("gnp1 pos:" + class119.field2109.field3581 + " psize:" + class20.field428);
        }
        for (int var2 = 0; var2 < class6.field77; var2++) {
            if (class41.field764[class153.field2678[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class6.field77);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static final void method1531(int arg0) {
        class188.field3107.method763(0);
        field3747++;
        if (arg0 != -20184) {
            field3763 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
    public static void method1532(byte arg0) {
        field3745 = null;
        field3763 = null;
        field3755 = null;
        field3749 = null;
        field3746 = null;
        if (arg0 != 13) {
            field3763 = null;
        }
        field3758 = null;
        field3750 = null;
        field3754 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BJ)Lij;")
    public static final class50 method1533(byte arg0, long arg1) {
        field3760++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else if (arg0 == -30) {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class175.field2942[(int) (var8 - (arg1 * 37L))];
            }
            class50 var7 = new class50();
            var7.field909 = var6;
            var7.field898 = var6.length;
            return var7;
        } else {
            return null;
        }
    }
}
