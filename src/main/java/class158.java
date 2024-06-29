import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class158 {

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lic;")
    private class109 field2706 = new class109();

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    private int field2705;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    private int field2709;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Lvd;")
    private class126 field2702;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Li;")
    public static class203 field2701 = new class203(16);

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "[I")
    public static int[] field2717 = new int[32];

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field2719 = 0;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "[J")
    public static long[] field2720 = new long[32];

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lcb;")
    public static class267 field2707;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZJ)V", line = 4)
    public final void method1192(boolean arg0, long arg1) {
        if (arg0) {
            field2701 = (class203) null;
        }
        field2700++;
        class152 var4 = (class152) this.field2702.method1007(arg1, -17004);
        if (var4 != null) {
            var4.method1527(86);
            var4.method1937(106);
            this.field2705++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 39)
    public final Object method1193(long arg0, int arg1) {
        int var4 = 35 % ((17 - arg1) / 40);
        field2710++;
        class152 var5 = (class152) this.field2702.method1007(arg0, -17004);
        if (var5 == null) {
            return null;
        }
        Object var6 = var5.method680(17439);
        if (var6 == null) {
            var5.method1527(108);
            var5.method1937(112);
            this.field2705++;
            return null;
        }
        if (var5.method679(-1)) {
            class81 var7 = new class81(var6);
            this.field2702.method1004((byte) 73, var5.field3488, var7);
            this.field2706.method854(true, var7);
            var7.field4682 = 0L;
            var5.method1527(97);
            var5.method1937(104);
        } else {
            this.field2706.method854(true, var5);
            var5.field4682 = 0L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/Object;JZ)V", line = 80)
    public final void method1194(Object arg0, long arg1, boolean arg2) {
        this.method1192(arg2, arg1);
        field2716++;
        if (this.field2705 == 0) {
            class152 var5 = (class152) this.field2706.method853((byte) 84);
            var5.method1527(113);
            var5.method1937(55);
        } else {
            this.field2705--;
        }
        class81 var6 = new class81(arg0);
        this.field2702.method1004((byte) 73, arg1, var6);
        this.field2706.method854(!arg2, var6);
        var6.field4682 = 0L;
        if (arg2) {
            this.field2706 = (class109) null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZI)I", line = 109)
    public static final int method1195(int arg0, int arg1, boolean arg2, int arg3) {
        class118 var4 = (class118) class310.field5269.method1007((long) arg3, arg1 - 17068);
        field2711++;
        if (var4 == null) {
            return 0;
        }
        if (arg1 != 64) {
            method1197((byte) -5);
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field1999.length; var6++) {
            if (var4.field1999[var6] >= 0 && class259.field4343 > var4.field1999[var6]) {
                class278 var7 = class199.method1475(var4.field1999[var6], (byte) 127);
                if (var7.field4803 != null) {
                    class8 var8 = (class8) var7.field4803.method1007((long) arg0, arg1 ^ 0xFFFFBDD4);
                    if (var8 != null) {
                        if (arg2) {
                            var5 += var4.field2001[var6] * var8.field109;
                        } else {
                            var5 += var8.field109;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 160)
    public static final void method1196(int arg0) {
        if (arg0 != -13095) {
            return;
        }
        field2704++;
        for (int var1 = 0; var1 < class311.field5301; var1++) {
            int var10002 = class39.field588[var1]--;
            if (class39.field588[var1] >= -10) {
                class179 var3 = class262.field4393[var1];
                if (var3 == null) {
                    var3 = class179.method1317(class126.field2187, class268.field4641[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class39.field588[var1] += var3.method1318();
                    class262.field4393[var1] = var3;
                }
                if (class39.field588[var1] < 0) {
                    int var4;
                    if (class93.field1515[var1] == 0) {
                        var4 = class17.field221;
                    } else {
                        int var5 = (class93.field1515[var1] & 0xFF) * 128;
                        int var6 = class93.field1515[var1] >> 16 & 0xFF;
                        int var7 = (class93.field1515[var1] & 0xFFCA) >> 8;
                        int var8 = var6 * 128 + 64 - class279.field4831.field3259;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var7 * 128 + 64 - class279.field4831.field3218;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var9 + var8 - 128;
                        if (var10 > var5) {
                            class39.field588[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class285.field4909 / var5;
                    }
                    if (var4 > 0) {
                        class227 var11 = var3.method1319().method1664(class252.field4232);
                        class183 var12 = class183.method1377(var11, 100, var4);
                        var12.method1385(class130.field2242[var1] - 1);
                        class94.field1527.method1789(var12);
                    }
                    class39.field588[var1] = -100;
                }
            } else {
                class311.field5301--;
                for (int var2 = var1; var2 < class311.field5301; var2++) {
                    class268.field4641[var2] = class268.field4641[var2 + 1];
                    class262.field4393[var2] = class262.field4393[var2 + 1];
                    class130.field2242[var2] = class130.field2242[var2 + 1];
                    class39.field588[var2] = class39.field588[var2 + 1];
                    class93.field1515[var2] = class93.field1515[var2 + 1];
                }
                var1--;
            }
        }
        if (class283.field4886 && !class269.method1929(arg0 + 13046)) {
            if (class164.field2783 != 0 && class163.field2780 != -1) {
                class61.method539(false, class163.field2780, class164.field2783, 0, class302.field5172, false);
            }
            class283.field4886 = false;
        } else if (class164.field2783 != 0 && class163.field2780 != -1 && !class269.method1929(arg0 + 13054)) {
            class89.field1470.method87(65280, 190);
            class78.field1336++;
            class89.field1470.method510(class163.field2780, -118);
            class163.field2780 = -1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 287)
    public static void method1197(byte arg0) {
        field2701 = null;
        field2717 = null;
        field2707 = null;
        field2720 = null;
        if (arg0 >= -33) {
            method1198(23, (class295) null, -51, 41);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILbl;II)V", line = 302)
    public static final void method1198(int arg0, class295 arg1, int arg2, int arg3) {
        field2714++;
        int var4 = -49 / ((-arg3 - 17) / 59);
        if (arg1.field3204 == arg0 && arg0 != -1) {
            class28 var5 = class302.method2082(arg0, 109);
            int var6 = var5.field381;
            if (var6 == 1) {
                arg1.field3270 = 0;
                arg1.field3268 = arg2;
                arg1.field3234 = 0;
                arg1.field3260 = 0;
                class292.method2034(arg1.field3234, false, arg1.field3259, var5, 98, arg1.field3218);
            }
            if (var6 == 2) {
                arg1.field3270 = 0;
            }
        } else if (arg0 == -1 || arg1.field3204 == -1 || class302.method2082(arg0, 20).field383 >= class302.method2082(arg1.field3204, 72).field383) {
            arg1.field3268 = arg2;
            arg1.field3222 = arg1.field3246;
            arg1.field3234 = 0;
            arg1.field3270 = 0;
            arg1.field3204 = arg0;
            arg1.field3260 = 0;
            if (arg1.field3204 != -1) {
                class292.method2034(arg1.field3234, false, arg1.field3259, class302.method2082(arg1.field3204, 94), 88, arg1.field3218);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V", line = 356)
    public final void method1199(int arg0, int arg1) {
        if (arg1 < 117) {
            this.method1194((Object) null, 34L, true);
        }
        if (class73.field1223 != null) {
            for (class152 var3 = (class152) this.field2706.method857((byte) -35); var3 != null; var3 = (class152) this.field2706.method859(27260)) {
                if (var3.method679(-1)) {
                    if (var3.method680(17439) == null) {
                        var3.method1527(-71);
                        var3.method1937(49);
                        this.field2705++;
                    }
                } else if ((long) arg0 < ++var3.field4682) {
                    class152 var4 = class73.field1223.method21(27767, var3);
                    this.field2702.method1004((byte) 73, var3.field3488, var4);
                    class195.method1460(var3, var4, -430112692);
                    var3.method1527(-108);
                    var3.method1937(49);
                }
            }
        }
        field2712++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V", line = 405)
    public final void method1200(boolean arg0) {
        field2708++;
        class152 var2 = (class152) this.field2706.method857((byte) -35);
        if (arg0) {
            method1196(-32);
        }
        while (var2 != null) {
            if (var2.method679(-1)) {
                var2.method1527(126);
                var2.method1937(119);
                this.field2705++;
            }
            var2 = (class152) this.field2706.method859(27260);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V", line = 460)
    public class158(int arg0) {
        this.field2705 = arg0;
        int var2 = 1;
        this.field2709 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field2702 = new class126(var2);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V", line = 447)
    public final void method1201(int arg0) {
        this.field2706.method855(-104);
        if (arg0 != -20111) {
            field2715 = -40;
        }
        this.field2702.method1000(true);
        field2703++;
        this.field2705 = this.field2709;
    }
}
