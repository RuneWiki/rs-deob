import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class154 extends class236 {

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field1972 = 1337;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public int field1969;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public int field1974;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public int field1976;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public int field1977;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "Ljava/lang/String;")
    public String field1970;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/util/Random;IB)I", line = 3)
    public static final int method931(Random arg0, int arg1, byte arg2) {
        field1975++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class403.method2418(arg1, (byte) 120)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else if (arg2 == 8) {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return class89.method556(false, arg1, var4);
        } else {
            return -88;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 40)
    public static final void method932(int arg0) {
        field1973++;
        for (int var1 = arg0; var1 < class99.field1353.length; var1++) {
            for (int var2 = 0; var2 < class99.field1353[var1].length; var2++) {
                class99.field1353[var1][var2] = class335.field4865;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIZ)V", line = 65)
    public static final void method933(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1978++;
        if (class358.field5312 == null) {
            class481.field6937.method801(-6625, arg0, arg4, -16777216, arg2, arg1);
        } else if (class415.field6145.field2959 >= 0 && class415.field6145.field2959 < class362.field5442 * 128 && class415.field6145.field2966 >= 0 && class415.field6145.field2966 < (class203.field2813 * 128)) {
            class287.field4103++;
            if (class415.field6145 != null && (class415.field6145.field2959 + 64 - class415.field6145.method1773(arg3 + -29) * 64 >> 7) == class495.field7547 && (class415.field6145.field2966 - (class415.field6145.method1773(arg3 ^ 0x21) - 1) * 64 >> 7) == class2.field33) {
                class2.field33 = -1;
                class495.field7547 = -1;
                class65.method459(-1);
            }
            class506.method3043(-109);
            if (!arg5) {
                class203.method1254(arg3 + 3);
            }
            class220.method1353((byte) -55);
            class463.method2717(arg2, true, arg4, 105, arg0, arg1);
            int var6 = class115.field1483;
            int var7 = class87.field1201;
            int var8 = class212.field3007;
            int var9 = class237.field3319;
            if (class306.field4454 == 1) {
                int var10 = (int) class473.field6841;
                if (class247.field3540 >> 8 > var10) {
                    var10 = class247.field3540 >> 8;
                }
                if (class179.field2584[4] && var10 < class242.field3473[4] + 128) {
                    var10 = class242.field3473[4] + 128;
                }
                int var11 = (int) class506.field7722 + class413.field6113 & 0x3FFF;
                class64.method451(var11, class356.field5150, var7, ((var10 >> 3) * 3) + 600 << 0, class103.method620(class355.field5121, class415.field6145.field2966, (byte) 20, class415.field6145.field2959) - 50, var10, class318.field4665, (byte) 13);
            } else if (class306.field4454 == 4) {
                int var12 = (int) class473.field6841;
                if (class247.field3540 >> 8 > var12) {
                    var12 = class247.field3540 >> 8;
                }
                if (class179.field2584[4] && var12 < (class242.field3473[4] + 128)) {
                    var12 = class242.field3473[4] + 128;
                }
                int var13 = (int) class506.field7722 & 0x3FFF;
                class64.method451(var13, class356.field5150, var7, (var12 >> 3) * 3 + 600 << 0, class103.method620(class355.field5121, class52.field780, (byte) 20, class365.field5493) - 50, var12, class318.field4665, (byte) 13);
            } else if (class306.field4454 == 5) {
                class298.method1807(var7, -23785);
            }
            int var14 = class205.field2843;
            int var15 = class432.field6338;
            int var16 = class282.field4026;
            int var17 = class317.field4653;
            int var18 = class21.field284;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class179.field2584[var19]) {
                    int var22 = (int) (Math.random() * (double) (class219.field3078[var19] * 2 + 1) + Math.sin((double) class208.field2927[var19] / 100.0D * (double) class484.field7017[var19]) * (double) class242.field3473[var19] - (double) class219.field3078[var19]);
                    if (var19 == 3) {
                        class21.field284 = class21.field284 + var22 & 0x3FFF;
                    }
                    if (var19 == 1) {
                        class432.field6338 += var22;
                    }
                    if (var19 == 2) {
                        class282.field4026 += var22;
                    }
                    if (var19 == 4) {
                        class317.field4653 += var22;
                        if (class317.field4653 < 1024) {
                            class317.field4653 = 1024;
                        } else if (class317.field4653 > 3072) {
                            class317.field4653 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class205.field2843 += var22;
                    }
                }
            }
            if (class205.field2843 < 0) {
                class205.field2843 = 0;
            }
            if ((class282.field4031 << 7) - 1 < class205.field2843) {
                class205.field2843 = (class282.field4031 << 7) - 1;
            }
            if (class282.field4026 < 0) {
                class282.field4026 = 0;
            }
            if (class282.field4026 > (class98.field1339 << 7) + arg3) {
                class282.field4026 = (class98.field1339 << 7) - 1;
            }
            class137.method867(4);
            class128.method714((byte) -34);
            class481.field6937.method810(var8, var9, var6 + var8, var7 + var9);
            class481.field6937.method756();
            int var20 = class430.field6326;
            if (class252.field3649 == null) {
                class481.field6937.method811(var20);
            } else {
                class252.field3649.method590(class317.field4653, class230.field3221 << 3, var8, var20, class21.field284, var6, class481.field6937, 127, var9, var7);
            }
            class498.method2992(arg3 + 1);
            class125.field1616.method265(class205.field2843, class432.field6338, class282.field4026, -class317.field4653 & 0x3FFF, -class21.field284 & 0x3FFF, -class236.field3317 & 0x3FFF);
            class481.field6937.method837(class125.field1616);
            class481.field6937.method769(var8 + (var6 / 2), var9 - -(var7 / 2), class22.field295 << 1, class22.field295 << 1);
            class501.method3018(var7 / 2 + var9, 31077, class22.field295 << 1, class22.field295 << 1, var6 / 2 + var8);
            class340.method2063(class205.field2843, class282.field4026, -class21.field284 & 0x3FFF, -class317.field4653 & 0x3FFF, class432.field6338, false, -class236.field3317 & 0x3FFF);
            byte var21 = class118.field1533.method2959(0, class293.field4174) == 2 ? (byte) class287.field4103 : 1;
            class413.method2459(class481.field6937, class263.field3748, class40.field620, class125.field1616, class205.field2843, class432.field6338, class282.field4026, class449.field6546, class67.field1008, class389.field5778, class157.field2058, class498.field7586, class16.field233, class415.field6145.field2956 + 1, var21, class415.field6145.field2959 >> 7, class415.field6145.field2966 >> 7, !class118.field1533.field6896);
            class498.method2992(arg3 + 1);
            if (class323.field4729 == 30) {
                class266.method1634(var8, 256, false, var9, var7, 256, var6);
                class223.method1380(var9, 256, var8, var7, 256, 123, var6);
                class327.method1966(256, var9, var7, (byte) -121, 256, var8, var6);
                class156.method971(var9, (byte) -112, var7, var6, var8);
            }
            class362.method2210();
            class432.field6338 = var15;
            class205.field2843 = var14;
            class21.field284 = var18;
            class282.field4026 = var16;
            class317.field4653 = var17;
            if (class477.field6872 && class90.field1238.method2642(3703) == 0) {
                class477.field6872 = false;
            }
            if (class477.field6872) {
                class481.field6937.method801(-6625, var6, var9, -16777216, var8, var7);
                class475.method2783(class181.field2587, class489.field7488.method1220(2969, class81.field1122), false, 6);
            }
        } else {
            class481.field6937.method801(-6625, arg0, arg4, -16777216, arg2, arg1);
        }
    }
}
