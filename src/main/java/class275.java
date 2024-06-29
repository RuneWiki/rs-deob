import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class275 {

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    private int field4836 = 0;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public int field4813;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "[Lij;")
    public class194[] field4824;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Lqk;")
    public static class207 field4810 = class24.method212(255, "runes");

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field4815 = -1;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "[I")
    public static int[] field4811 = new int[200];

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "[Lqk;")
    public static class207[] field4833 = new class207[100];

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "Z")
    public static boolean field4828 = false;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field4821 = 0;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Lqk;")
    private static class207 field4827 = class24.method212(255, "Attack");

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "Lqk;")
    public static class207 field4829 = field4827;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "J")
    private long field4812;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "Lij;")
    private class194 field4831;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "Lij;")
    private class194 field4834;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4809;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLij;J)V")
    public final void method1863(byte arg0, class194 arg1, long arg2) {
        field4814++;
        if (arg1.field3408 != null) {
            arg1.method1346((byte) -16);
        }
        int var5 = -22 % ((-arg0 - 21) / 60);
        class194 var6 = this.field4824[(int) (arg2 & (long) (this.field4813 - 1))];
        arg1.field3407 = arg2;
        arg1.field3408 = var6.field3408;
        arg1.field3410 = var6;
        arg1.field3408.field3410 = arg1;
        arg1.field3410.field3408 = arg1;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([[II)V")
    public static final void method1864(int[][] arg0, int arg1) {
        class15.field238 = arg0;
        if (arg1 != 7746) {
            method1875(59);
        }
        field4817++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class115 var7 = new class115();
        var7.field2001 = arg1 / 128;
        var7.field1980 = arg2 / 128;
        var7.field1983 = arg3 / 128;
        var7.field1995 = arg4 / 128;
        var7.field1989 = arg0;
        var7.field1996 = arg1;
        var7.field1986 = arg2;
        var7.field1982 = arg3;
        var7.field1994 = arg4;
        var7.field1981 = arg5;
        var7.field2000 = arg6;
        class92.field1639[class170.field3016++] = var7;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Lij;")
    public final class194 method1866(byte arg0) {
        field4830++;
        if (this.field4836 > 0 && this.field4824[this.field4836 - 1] != this.field4834) {
            class194 var2 = this.field4834;
            this.field4834 = var2.field3410;
            return var2;
        } else if (arg0 > -3) {
            return null;
        } else {
            while (this.field4836 < this.field4813) {
                class194 var3 = this.field4824[this.field4836++].field3410;
                if (this.field4824[this.field4836 - 1] != var3) {
                    this.field4834 = var3.field3410;
                    return var3;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(JZ)Lij;")
    public final class194 method1867(long arg0, boolean arg1) {
        field4825++;
        this.field4812 = arg0;
        class194 var4 = this.field4824[(int) (arg0 & (long) (this.field4813 - 1))];
        this.field4831 = var4.field3410;
        if (!arg1) {
            field4809 = null;
        }
        while (this.field4831 != var4) {
            if (this.field4831.field3407 == arg0) {
                class194 var5 = this.field4831;
                this.field4831 = this.field4831.field3410;
                return var5;
            }
            this.field4831 = this.field4831.field3410;
        }
        this.field4831 = null;
        return null;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public static final void method1868(byte arg0) {
        if (arg0 >= 105) {
            field4808++;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)Lij;")
    public final class194 method1869(int arg0) {
        field4818++;
        if (arg0 != 255) {
            method1864((int[][]) null, -99);
        }
        if (this.field4831 == null) {
            return null;
        }
        class194 var2 = this.field4824[(int) (this.field4812 & (long) (this.field4813 - 1))];
        while (this.field4831 != var2) {
            if (this.field4831.field3407 == this.field4812) {
                class194 var3 = this.field4831;
                this.field4831 = this.field4831.field3410;
                return var3;
            }
            this.field4831 = this.field4831.field3410;
        }
        this.field4831 = null;
        return null;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)V")
    public final void method1870(byte arg0) {
        field4826++;
        int var2 = 0;
        if (arg0 > -92) {
            return;
        }
        while (var2 < this.field4813) {
            class194 var3 = this.field4824[var2];
            while (true) {
                class194 var4 = var3.field3410;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method1346((byte) -16);
            }
        }
        this.field4831 = null;
        this.field4834 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILfk;)I")
    public static final int method1871(int arg0, class14 arg1) {
        field4835++;
        int var2 = arg1.field230;
        class200 var3 = arg1.method1947(9);
        if (arg1.field5039 == var3.field3539) {
            var2 = arg1.field217;
        } else if (arg1.field5039 == var3.field3528 || arg1.field5039 == var3.field3541 || arg1.field5039 == var3.field3519 || arg1.field5039 == var3.field3527) {
            var2 = arg1.field218;
        } else if (arg1.field5039 == var3.field3531 || arg1.field5039 == var3.field3545 || arg1.field5039 == var3.field3536 || arg1.field5039 == var3.field3540) {
            var2 = arg1.field210;
        }
        if (arg0 != -1) {
            method1874(-77);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V")
    public static final void method1872(byte arg0) {
        for (int var1 = 0; var1 < class242.field4404; var1++) {
            int var10002 = class73.field1344[var1]--;
            if (class73.field1344[var1] >= -10) {
                class76 var3 = class261.field4656[var1];
                if (var3 == null) {
                    var3 = class76.method548(class153.field2656, class162.field2868[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class73.field1344[var1] += var3.method546();
                    class261.field4656[var1] = var3;
                }
                if (class73.field1344[var1] < 0) {
                    int var10;
                    if (class285.field5004[var1] == 0) {
                        var10 = class32.field653;
                    } else {
                        int var4 = (class285.field5004[var1] & 0xFF) * 128;
                        int var5 = (class285.field5004[var1] & 0xFF06B9) >> 16;
                        int var6 = class285.field5004[var1] >> 8 & 0xFF;
                        int var7 = var5 * 128 + 64 - class202.field3565.field5104;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var6 * 128 + 64 - class202.field3565.field5072;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var7 - (128 - var8);
                        if (var9 > var4) {
                            class73.field1344[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class167.field2927 / var4;
                    }
                    if (var10 > 0) {
                        class222 var11 = var3.method547().method1578(class106.field1888);
                        class77 var12 = class77.method585(var11, 100, var10);
                        var12.method559(class245.field4435[var1] - 1);
                        class65.field1177.method659(var12);
                    }
                    class73.field1344[var1] = -100;
                }
            } else {
                class242.field4404--;
                for (int var2 = var1; var2 < class242.field4404; var2++) {
                    class162.field2868[var2] = class162.field2868[var2 + 1];
                    class261.field4656[var2] = class261.field4656[var2 + 1];
                    class245.field4435[var2] = class245.field4435[var2 + 1];
                    class73.field1344[var2] = class73.field1344[var2 + 1];
                    class285.field5004[var2] = class285.field5004[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 <= 105) {
            return;
        }
        field4820++;
        if (class223.field4081 && !class178.method1274(-40)) {
            if (class123.field2125 != 0 && class219.field3865 != -1) {
                class245.method1723(0, class123.field2125, class56.field1050, false, -128, class219.field3865);
            }
            class223.field4081 = false;
        } else if (class123.field2125 != 0 && class219.field3865 != -1 && !class178.method1274(-41)) {
            class261.field4645.method767(198, (byte) 26);
            class162.field2857++;
            class261.field4645.method1068(class219.field3865, 113);
            class219.field3865 = -1;
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(B)Lij;")
    public final class194 method1873(byte arg0) {
        this.field4836 = 0;
        field4816++;
        int var2 = 71 % ((arg0 + 31) / 42);
        return this.method1866((byte) -66);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public static void method1874(int arg0) {
        if (arg0 < 108) {
            return;
        }
        field4833 = null;
        field4827 = null;
        field4829 = null;
        field4810 = null;
        field4811 = null;
        field4809 = null;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(I)V")
    public class275(int arg0) {
        this.field4813 = arg0;
        this.field4824 = new class194[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class194 var3 = this.field4824[var2] = new class194();
            var3.field3408 = var3;
            var3.field3410 = var3;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
    public static final void method1875(int arg0) {
        field4823++;
        class92.field1628.method1382(arg0 ^ 0x55F2);
        class14.field232.method1382(31346);
        if (arg0 != 12160) {
            field4833 = null;
        }
        class185.field3275.method1382(arg0 + 19186);
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)I")
    public final int method1876(int arg0) {
        field4832++;
        if (arg0 != -1) {
            this.field4831 = null;
        }
        return this.field4813;
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(B)I")
    public final int method1877(byte arg0) {
        int var2 = 0;
        if (arg0 < 21) {
            this.method1863((byte) -77, (class194) null, 90L);
        }
        for (int var3 = 0; var3 < this.field4813; var3++) {
            class194 var4 = this.field4824[var3];
            for (class194 var5 = var4.field3410; var5 != var4; var5 = var5.field3410) {
                var2++;
            }
        }
        field4819++;
        return var2;
    }
}
