import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class173 extends class242 {

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    private int field3014 = 32768;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "Lp;")
    public static class280 field3015 = class18.method140((byte) -119, "<col=ff9040>");

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "[I")
    public static int[] field3016 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "Lak;")
    public static class137 field3012;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "Llk;")
    public static class82 field3019;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILua;)V")
    public static final void method1193(int arg0, class113 arg1) {
        if (arg0 == 1) {
            ++field3013;
            class113 var2 = class157.method1115(arg1, 22226);
            int var3;
            int var4;
            if (var2 != null) {
                var3 = var2.field1869;
                var4 = var2.field1995;
            } else {
                var4 = class103.field1724;
                var3 = class190.field3328;
            }
            class181.method1266(var3, arg1, false, var4, (byte) 122);
            class205.method1394(arg1, var4, var3, arg0 + -2);
        }
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)I")
    public static final int method1194(int arg0) {
        ++field3022;
        return arg0 <= 6 ? 81 : 2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg0 <= -119) {
            ++field3020;
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    super.field4248 = ~arg2.method189((byte) -103) == -2;
                }
            } else {
                this.field3014 = arg2.method193((byte) 77) << 4;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        if (!arg0) {
            this.field3014 = -73;
        }
        ++field3010;
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (super.field4257.field2357) {
            int[] var4 = this.method1647(1, arg1, 48);
            int[] var5 = this.method1647(2, arg1, 48);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class264.field4654; ++var9) {
                int var10 = (1048388 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field3014 >> 12;
                int var12 = class90.field1459[var10] * var11 >> 12;
                int var13 = class201.field3516[var10] * var11 >> 12;
                int var14 = class230.field3968 & (var12 >> 12) + var9;
                int var15 = class29.field540 & (var13 >> 12) + arg1;
                int[][] var16 = this.method1648(26484, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int var3 = -125 % ((73 - arg1) / 41);
        ++field3017;
        int[] var4 = super.field4251.method1417((byte) 76, arg0);
        if (super.field4251.field3655) {
            int[] var5 = this.method1647(1, arg0, 48);
            int[] var6 = this.method1647(2, arg0, 48);
            for (int var7 = 0; var7 < class264.field4654; ++var7) {
                int var8 = var5[var7] >> 4 & 255;
                int var9 = var6[var7] * this.field3014 >> 12;
                int var10 = class90.field1459[var8] * var9 >> 12;
                int var11 = class201.field3516[var8] * var9 >> 12;
                int var12 = class29.field540 & (var11 >> 12) + arg0;
                int var13 = (var10 >> 12) + var7 & class230.field3968;
                int[] var14 = this.method1647(0, var12, 48);
                var4[var7] = var14[var13];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static final void method1195(byte arg0) {
        ++field3018;
        if (arg0 != -99) {
            method1195((byte) -11);
        }
        for (int var1 = 0; ~class79.field1304 < ~var1; ++var1) {
            int var10002 = class208.field3591[var1]--;
            if (class208.field3591[var1] >= -10) {
                class270 var3 = class64.field1051[var1];
                if (var3 == null) {
                    var3 = class270.method1809(class52.field862, class14.field274[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class208.field3591[var1] += var3.method1806();
                    class64.field1051[var1] = var3;
                }
                if (class208.field3591[var1] < 0) {
                    int var10;
                    if (~class237.field4115[var1] != -1) {
                        int var4 = (255 & class237.field4115[var1]) * 128;
                        int var5 = 255 & class237.field4115[var1] >> 16;
                        int var6 = 255 & class237.field4115[var1] >> 8;
                        int var7 = var6 * 128 - -64 - class262.field4631.field4793;
                        int var8 = var5 * 128 - (class262.field4631.field4791 + -64);
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        if (~var7 > -1) {
                            var7 = -var7;
                        }
                        int var9 = var7 + var8 - 128;
                        if (var4 < var9) {
                            class208.field3591[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class54.field892 / var4;
                    } else {
                        var10 = class261.field4617;
                    }
                    if (~var10 < -1) {
                        class171 var11 = var3.method1808().method1191(class140.field2433);
                        class70 var12 = class70.method473(var11, 100, var10);
                        var12.method493(class153.field2658[var1] + -1);
                        class234.field4082.method1821(var12);
                    }
                    class208.field3591[var1] = -100;
                }
            } else {
                --class79.field1304;
                for (int var2 = var1; class79.field1304 > var2; ++var2) {
                    class14.field274[var2] = class14.field274[var2 - -1];
                    class64.field1051[var2] = class64.field1051[var2 + 1];
                    class153.field2658[var2] = class153.field2658[var2 + 1];
                    class208.field3591[var2] = class208.field3591[var2 + 1];
                    class237.field4115[var2] = class237.field4115[var2 + 1];
                }
                --var1;
            }
        }
        if (class54.field893 && !class98.method688((byte) -100)) {
            if (~class188.field3307 != -1 && ~class243.field4270 != 0) {
                class112.method785(class243.field4270, class184.field3246, false, 0, 10000, class188.field3307);
            }
            class54.field893 = false;
        } else if (~class188.field3307 != -1 && class243.field4270 != -1 && !class98.method688((byte) -123)) {
            ++class191.field3342;
            class34.field627.method551(255, true);
            class34.field627.method231(11510, class243.field4270);
            class243.field4270 = -1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class173() {
        super(3, false);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II[B)I")
    public static final int method1196(int arg0, int arg1, byte[] arg2) {
        ++field3021;
        if (arg0 != 0) {
            method1194(41);
        }
        return class43.method328(0, arg2, arg1, 255);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V")
    public static void method1197(byte arg0) {
        field3016 = null;
        field3019 = null;
        field3015 = null;
        if (arg0 != -47) {
            method1196(-64, -120, (byte[]) null);
        }
        field3012 = null;
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
    public final void method111(int arg0) {
        class252.method1696(-72);
        ++field3011;
        if (arg0 <= 122) {
            method1193(93, (class113) null);
        }
    }
}
