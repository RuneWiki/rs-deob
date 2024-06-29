import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class101 extends class304 {

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "I")
    private int field1457 = 0;

    @OriginalMember(owner = "client!bj", name = "ab", descriptor = "I")
    private int field1460 = 4096;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    public static int field1450 = 0;

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "F")
    public static float field1459 = 0.0F;

    @OriginalMember(owner = "client!bj", name = "db", descriptor = "I")
    public static int field1463 = 0;

    @OriginalMember(owner = "client!bj", name = "gb", descriptor = "[I")
    public static int[] field1466 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!bj", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field1465 = "red:";

    @OriginalMember(owner = "client!bj", name = "cb", descriptor = "F")
    public static float field1462;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!bj", name = "bb", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!bj", name = "eb", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!bj", name = "hb", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!bj", name = "ib", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "Lkj;")
    public static class256 field1452;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)V", line = 10)
    public static final void method758(int arg0, int arg1) {
        field1467++;
        if (class152.field2308 == arg1) {
            return;
        }
        if (class152.field2308 == 0) {
            class202.method1460((byte) -105);
        }
        if (arg1 == 40) {
            class142.method1086(-3);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 != 40 && class270.field4219 != null) {
            class270.field4219.method1653(-19746);
            class270.field4219 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class114.field1794 = 1;
            class233.field3541 = 0;
            class162.field2633 = 1;
            class178.field2837 = 0;
            class111.field1673 = 0;
            class267.method1873(true, (byte) -32);
        }
        if (arg0 <= 122) {
            return;
        }
        if (arg1 == 25 || arg1 == 10) {
            class43.method334(true);
        }
        if (arg1 == 5) {
            class283.method1957(class264.field4087, -44);
        } else {
            class230.method1620((byte) -125);
        }
        boolean var3 = class152.field2308 == 5 || class152.field2308 == 10 || class152.field2308 == 28;
        if (var2 != var3) {
            if (var2) {
                class276.field4284 = class302.field4630;
                if (class59.field783 == 0) {
                    class239.method1664(2, (byte) 84);
                } else {
                    class318.method2215(0, false, class302.field4630, true, 255, 2, class222.field3389);
                }
                class340.field5285.method768(false, (byte) 45);
            } else {
                class239.method1664(2, (byte) 84);
                class340.field5285.method768(true, (byte) 45);
            }
        }
        if (class73.field1058 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class73.method551();
        }
        class152.field2308 = arg1;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 178)
    public class101() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 95)
    public static final String method759(long arg0, byte arg1) {
        if (arg1 >= -54) {
            return (String) null;
        }
        field1464++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class318.field4922[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)[I", line = 141)
    public final int[] method71(int arg0, int arg1) {
        field1461++;
        if (arg0 != 7) {
            this.method71(-78, -2);
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int[] var4 = this.method2086(arg1, 0, (byte) 112);
            for (int var5 = 0; var5 < class218.field3333; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field1457 <= var6 && var6 <= this.field1460 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(III)I", line = 184)
    public static final int method760(int arg0, int arg1, int arg2) {
        int var3 = arg1 * 57 + arg2;
        if (arg0 != 1) {
            field1459 = 1.2215813F;
        }
        int var4 = var3 ^ var3 << 13;
        field1456++;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lwm;II)V", line = 198)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field1468++;
        if (arg1 == 0) {
            this.field1457 = arg0.method1755(false);
        } else if (arg1 == 1) {
            this.field1460 = arg0.method1755(false);
        }
        if (arg2 != -2828) {
            method760(-44, -126, 102);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILwm;)V", line = 236)
    public static final void method761(int arg0, class254 arg1) {
        if (arg0 != -1) {
            field1450 = 60;
        }
        field1455++;
        while (true) {
            while (arg1.field3840.length > arg1.field3866) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1774((byte) 30) == 1) {
                    var3 = arg1.method1774((byte) -91);
                    var4 = arg1.method1774((byte) 54);
                    var2 = true;
                }
                int var5 = arg1.method1774((byte) -92);
                int var6 = arg1.method1774((byte) -122);
                int var7 = var5 * 64 - class196.field3024;
                int var8 = class229.field3494 - ((var6 * 64) + 1 - class176.field2822);
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class243.field3691 && var8 < class229.field3494) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                int var13 = arg1.method1774((byte) -126);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1774((byte) -104);
                                        if (class147.field2234[var9][var10] == null) {
                                            class147.field2234[var9][var10] = new byte[4096];
                                        }
                                        class147.field2234[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1758((byte) 62);
                                        if (class335.field5214[var9][var10] == null) {
                                            class335.field5214[var9][var10] = new int[4096];
                                        }
                                        class335.field5214[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg1.method1758((byte) 60);
                                        if (class217.field3330[var9][var10] == null) {
                                            class217.field3330[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class32 var17 = class226.method1607(116, var16);
                                        if (var17.field450 != null) {
                                            var17 = var17.method247(-1);
                                            if (var17 == null || var17.field400 == -1) {
                                                continue;
                                            }
                                        }
                                        class217.field3330[var9][var10][(63 - var12 << 6) + var11] = var17.field404 + 1;
                                        class83 var18 = new class83();
                                        var18.field1218 = var8;
                                        var18.field1223 = var7;
                                        var18.field1222 = var17.field400;
                                        class216.field3312.method1952(var18, arg0 ^ 0xFFFFFF85);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1774((byte) -112);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field3866++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field3866 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field3866 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(JB)V", line = 393)
    public static final void method762(long arg0, byte arg1) {
        if (arg1 < 18) {
            field1463 = 95;
        }
        field1453++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class159.field2416; var3++) {
            if (class110.field1659[var3] == arg0) {
                class159.field2416--;
                class75.field1093++;
                for (int var4 = var3; var4 < class159.field2416; var4++) {
                    class309.field4819[var4] = class309.field4819[var4 + 1];
                    class238.field3626[var4] = class238.field3626[var4 + 1];
                    class314.field4875[var4] = class314.field4875[var4 + 1];
                    class110.field1659[var4] = class110.field1659[var4 + 1];
                    class97.field1392[var4] = class97.field1392[var4 + 1];
                    class330.field5070[var4] = class330.field5070[var4 + 1];
                }
                class338.field5255 = class12.field155;
                class85.field1236.method1141((byte) 110, 231);
                class85.field1236.method1738((byte) 124, arg0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)V", line = 446)
    public static void method763(boolean arg0) {
        if (!arg0) {
            field1465 = null;
            field1452 = null;
            field1466 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBLjava/util/Random;)I", line = 467)
    public static final int method764(int arg0, byte arg1, Random arg2) {
        field1454++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class183.method1359(arg0, 1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else if (arg1 == 121) {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class115.method882(arg0, var4, -1);
        } else {
            return 76;
        }
    }
}
