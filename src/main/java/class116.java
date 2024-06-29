import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class116 extends class70 {

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field2752 = 0;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field2747 = 0;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "Lwc;")
    public static class152 field2740 = new class152();

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public static int field2757 = -1;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "Z")
    public static boolean field2759 = false;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    public static int field2760 = 2;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "Lma;")
    public static class84 field2761;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "[I")
    public int[] field2739;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "[I")
    public int[] field2750;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "[I")
    public int[] field2754;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "[I")
    public static int[] field2758;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "[Laf;")
    public class7[] field2741;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "[Laf;")
    public class7[] field2744;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "[[[B")
    public byte[][][] field2743;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
    public static final void method897(byte arg0) {
        class149.field3708 = 0;
        int var1 = (class141.field3395.field1960 >> 7) + class19.field312;
        int var2 = 120 / ((24 - arg0) / 52);
        field2753++;
        int var3 = (class141.field3395.field1998 >> 7) + class133.field3153;
        if (var3 >= 3053 && var3 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class149.field3708 = 1;
        }
        if (var3 >= 3072 && var3 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class149.field3708 = 1;
        }
        if (class149.field3708 == 1 && var3 >= 3139 && var3 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class149.field3708 = 0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V")
    public static final void method898(boolean arg0, int arg1) {
        field2746++;
        if (arg1 != 64) {
            field2752 = 115;
        }
        for (int var2 = 0; var2 < class25.field483; var2++) {
            class58 var3 = class72.field1533[class150.field3724[var2]];
            int var4 = (class150.field3724[var2] << 14) + 536870912;
            if (var3 != null && var3.method162(true) && var3.field1172.field3194 == arg0 && var3.field1172.method1040(arg1 ^ 0x7A)) {
                int var5 = var3.field1998 >> 7;
                int var6 = var3.field1960 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field2009 == 1 && (var3.field1998 & 0x7F) == 64 && (var3.field1960 & 0x7F) == 64) {
                        if (class101.field2444[var5][var6] == class153.field3783) {
                            continue;
                        }
                        class101.field2444[var5][var6] = class153.field3783;
                    }
                    if (!var3.field1172.field3162) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class19.field311.method868(class140.field3344, var3.field1998, var3.field1960, class80.method626((var3.field2009 - 1) * 64 + var3.field1998, class140.field3344, var3.field2009 * 64 + var3.field1960 - 64, arg1 + -11), var3.field2009 * 64 - 4, var3, var3.field1999, var4, var3.field1968);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    public static void method899(int arg0) {
        if (arg0 >= -2) {
            field2757 = 34;
        }
        field2761 = null;
        field2758 = null;
        field2740 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(JI)Lqf;")
    public static final class117 method900(long arg0, int arg1) {
        field2751++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg0;
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            byte[] var6 = new byte[var5];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var5--;
                var6[var5] = class70.field1488[(int) (var8 - arg0 * 37L)];
            }
            if (arg1 < 91) {
                return null;
            } else {
                class117 var7 = new class117();
                var7.field2800 = var6;
                var7.field2799 = var6.length;
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
    public static final void method901(byte arg0) {
        field2756++;
        try {
            if (class65.field1363 == null) {
                class65.field1363 = new class76(class44.field873, class73.method530((byte) -83, new class117[] { class75.field1653, class141.field3411, class91.field2228 }).method916(arg0 ^ 0x6173));
            } else {
                byte[] var1 = class65.field1363.method548(-75);
                if (var1 != null) {
                    class77 var2 = new class77(var1);
                    class47.field958 = var2.method597(69);
                    class20.field336 = new class32[class47.field958];
                    for (int var3 = 0; var3 < class47.field958; var3++) {
                        class32 var4 = class20.field336[var3] = new class32();
                        int var5 = var2.method597(arg0 ^ 0x57);
                        var4.field684 = (var5 & 0x8000) != 0;
                        var4.field697 = var5 & 0x7FFF;
                        var4.field682 = var2.method577(-126);
                        var4.field690 = var2.method603(71);
                        var4.field687 = var3;
                        var4.field680 = class129.method1007(var4.field682, 89);
                    }
                    class90.method710(0, (byte) -116, class83.field1909, class152.field3736, class20.field336.length - 1, class20.field336);
                    class65.field1363 = null;
                    class26.field507 = true;
                }
            }
        } catch (Exception var6) {
            class65.field1363 = null;
        }
        if (arg0 != 110) {
            field2752 = 24;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)Z")
    public static final boolean method902(int arg0, int arg1) {
        field2745++;
        if (arg1 == 1) {
            return (arg0 >> 30 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)Lna;")
    public static final class91 method903(int arg0, int arg1) {
        class91 var2 = (class91) class148.field3624.method247(0, (long) arg0);
        field2748++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class28.field543.method458(false, arg0, 16);
        class91 var4 = new class91();
        if (var3 != null) {
            var4.method722(arg1 + 15874, new class77(var3));
        }
        class148.field3624.method248((long) arg0, (byte) -119, var4);
        if (arg1 != 1) {
            method899(-108);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method904(int arg0, int arg1, boolean arg2) {
        field2749++;
        if (!arg2) {
            return false;
        } else if (arg0 == 0 && field2757 == arg1) {
            return true;
        } else if (arg0 == 1 && class90.field2215 == arg1) {
            return true;
        } else {
            return (arg0 == 2 || arg0 == 3) && class107.field2544 == arg1;
        }
    }
}
