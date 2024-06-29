import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class162 {

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Z")
    public boolean field2612 = false;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "[Lhm;")
    public static class240[] field2606 = new class240[4];

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2617 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Lph;")
    public static class229 field2619 = class266.method1858("(Z", 0);

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "[I")
    public static int[] field2620 = new int[32768];

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public int field2608;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public int field2613;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "J")
    public long field2615;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Lrk;")
    public class216 field2607;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1140(int arg0) {
        field2614++;
        int var1 = class95.field1605 + class230.field3820.field5168;
        int var2 = class131.field2138 + class230.field3820.field5147;
        if (class290.field4753 - var2 < -500 || class290.field4753 - var2 > 500 || (class147.field2385 - var1) < -500 || class147.field2385 - var1 > 500) {
            class147.field2385 = var1;
            class290.field4753 = var2;
        }
        if (class290.field4753 != var2) {
            class290.field4753 += (var2 - class290.field4753) / 16;
        }
        if (class147.field2385 != var1) {
            class147.field2385 += (var1 - class147.field2385) / 16;
        }
        if (class255.field4267) {
            for (int var3 = 0; var3 < class214.field3534; var3++) {
                int var4 = class275.field4593[var3];
                if (var4 == 98) {
                    class245.field4049 = class245.field4049 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class245.field4049 = class245.field4049 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class147.field2379 = class147.field2379 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class147.field2379 = class147.field2379 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class94.field1583[98]) {
                class80.field1319 += (12 - class80.field1319) / 2;
            } else if (class94.field1583[99]) {
                class80.field1319 += (-class80.field1319 - 12) / 2;
            } else {
                class80.field1319 /= 2;
            }
            if (class94.field1583[96]) {
                class196.field3278 += (-class196.field3278 - 24) / 2;
            } else if (class94.field1583[97]) {
                class196.field3278 += (24 - class196.field3278) / 2;
            } else {
                class196.field3278 /= 2;
            }
            class245.field4049 += class80.field1319 / 2;
            class147.field2379 += class196.field3278 / 2;
        }
        if (arg0 == 128) {
            class181.method1287(false);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIII)V", line = 91)
    public static final void method1141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2609++;
        int var8 = arg3 - arg2;
        int var9 = arg2 + arg4;
        if (arg7 != 2047) {
            method1142(-96);
        }
        int var10 = arg1 + arg2;
        for (int var11 = arg4; var11 < var9; var11++) {
            class193.method1354((byte) -37, arg0, arg1, arg6, class202.field3337[var11]);
        }
        int var12 = arg0 - arg2;
        for (int var13 = arg3; var13 > var8; var13--) {
            class193.method1354((byte) -37, arg0, arg1, arg6, class202.field3337[var13]);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class202.field3337[var14];
            class193.method1354((byte) -37, var10, arg1, arg6, var15);
            class193.method1354((byte) -37, var12, var10, arg5, var15);
            class193.method1354((byte) -37, arg0, var12, arg6, var15);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 142)
    public static void method1142(int arg0) {
        field2620 = null;
        field2606 = null;
        field2619 = null;
        field2617 = null;
        if (arg0 != -5483) {
            method1142(-83);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V", line = 174)
    public static final void method1143(int arg0) {
        if (!class186.field3027) {
            class53.field748[0] = 1006;
            class314.field5337 = 1;
            if (class145.field2351 != 0) {
                class18.field248 = class295.field4826;
                class312.field5254 = class136.field2207;
            } else if (class209.field3459 == 0) {
                class18.field248 = class118.field1985;
                class312.field5254 = class220.field3617;
            } else {
                class18.field248 = class48.field697;
                class312.field5254 = class220.field3613;
            }
            class94.field1579[0] = class135.field2188;
            class141.field2282[0] = class134.field2172;
        }
        field2618++;
        class194.method1359((long) class319.field5393);
        if (class198.field3292 != -1) {
            class213.method1506(class198.field3292, (byte) -40);
        }
        for (int var1 = 0; var1 < class15.field186; var1++) {
            if (class187.field3036[var1]) {
                class189.field3067[var1] = true;
            }
            class214.field3529[var1] = class187.field3036[var1];
            class187.field3036[var1] = false;
        }
        class257.field4299 = arg0;
        class328.field5593 = null;
        class185.field3008 = class319.field5393;
        class173.field2826 = -1;
        if (class99.field1675) {
            class132.field2145 = true;
        }
        class82.field1336 = null;
        if (class198.field3292 != -1) {
            class15.field186 = 0;
            class184.method1298(0, class273.field4567, 0, 74, -1, class266.field4484, class198.field3292, 0, 0);
        }
        if (class99.field1675) {
            class212.method1498();
        } else {
            class210.method1466();
        }
        class207.method1445((byte) 72);
        if (class186.field3027) {
            class43.method321(arg0 ^ 0x62A7);
        } else if (class82.field1336 != null) {
            class25.method157(0, class147.field2382, class82.field1336, class114.field1941);
        } else if (class257.field4299 != -1) {
            class25.method157(0, class257.field4299, (class301) null, class173.field2826);
        }
        if (class114.field1934 == 3) {
            for (int var2 = 0; var2 < class15.field186; var2++) {
                if (class214.field3529[var2]) {
                    if (class99.field1675) {
                        class212.method1503(class311.field5222[var2], class300.field4875[var2], class113.field1921[var2], class45.field691[var2], 16711935, 128);
                    } else {
                        class210.method1461(class311.field5222[var2], class300.field4875[var2], class113.field1921[var2], class45.field691[var2], 16711935, 128);
                    }
                } else if (class189.field3067[var2]) {
                    if (class99.field1675) {
                        class212.method1503(class311.field5222[var2], class300.field4875[var2], class113.field1921[var2], class45.field691[var2], 16711680, 128);
                    } else {
                        class210.method1461(class311.field5222[var2], class300.field4875[var2], class113.field1921[var2], class45.field691[var2], 16711680, 128);
                    }
                }
            }
        }
        class102.method785(class298.field4849, class69.field1106, 1, class230.field3820.field5168, class230.field3820.field5147);
        class69.field1106 = 0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 306)
    public static final void method1144(byte arg0) {
        field2605++;
        for (int var1 = -1; var1 < class139.field2248; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class166.field2708[var1];
            }
            class209 var3 = class114.field1931[var2];
            if (var3 != null && var3.field5132 > 0) {
                var3.field5132--;
                if (var3.field5132 == 0) {
                    var3.field5134 = null;
                }
            }
        }
        int var4 = 0;
        if (arg0 < 2) {
            field2616 = -117;
        }
        while (class253.field4233 > var4) {
            int var5 = field2620[var4];
            class217 var6 = class187.field3035[var5];
            if (var6 != null && var6.field5132 > 0) {
                var6.field5132--;
                if (var6.field5132 == 0) {
                    var6.field5134 = null;
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZB)V", line = 363)
    public static final void method1145(boolean arg0, byte arg1) {
        for (class332 var2 = (class332) class75.field1266.method1580((byte) -39); var2 != null; var2 = (class332) class75.field1266.method1579((byte) 28)) {
            if (var2.field5662 != null) {
                class239.field3949.method2150(var2.field5662);
                var2.field5662 = null;
            }
            if (var2.field5652 != null) {
                class239.field3949.method2150(var2.field5652);
                var2.field5652 = null;
            }
            var2.method598(123);
        }
        if (arg0) {
            for (class332 var3 = (class332) class299.field4866.method1580((byte) -39); var3 != null; var3 = (class332) class299.field4866.method1579((byte) 28)) {
                if (var3.field5662 != null) {
                    class239.field3949.method2150(var3.field5662);
                    var3.field5662 = null;
                }
                var3.method598(108);
            }
            for (class332 var4 = (class332) class122.field2049.method711(arg1 - 16); var4 != null; var4 = (class332) class122.field2049.method718(27263)) {
                if (var4.field5662 != null) {
                    class239.field3949.method2150(var4.field5662);
                    var4.field5662 = null;
                }
                var4.method598(39);
            }
        }
        field2610++;
        if (arg1 != 16) {
            field2606 = (class240[]) null;
        }
    }
}
