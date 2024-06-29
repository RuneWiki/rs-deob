import java.awt.Font;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class182 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Ldl;")
    private class31 field3223 = null;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    private int field3226 = 65000;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Ldl;")
    private class31 field3243 = null;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    private int field3234;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "[I")
    public static int[] field3225 = new int[32];

    @OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
    public static int[] field3228 = new int[2500];

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lvf;")
    public static class265 field3238 = class87.method582(-46, "K");

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Ljava/awt/Font;")
    public static Font field3242;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "[Loe;")
    public static class108[] field3240;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "[[[B")
    public static byte[][][] field3245;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZZII[B)Z")
    private final boolean method1210(boolean arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        field3231++;
        class31 var6 = this.field3243;
        synchronized (this.field3243) {
            try {
                if (!arg1) {
                    field3228 = null;
                }
                int var7;
                if (arg0) {
                    if ((long) (arg3 * 6 + 6) > this.field3223.method257(true)) {
                        return false;
                    }
                    this.field3223.method252((long) (arg3 * 6), 0);
                    this.field3223.method251(6, 0, -109, class123.field2224);
                    var7 = ((class123.field2224[4] & 0xFF) << 8) + (class123.field2224[3] & 0xFF << 16) + (class123.field2224[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field3243.method257(true) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3243.method257(true) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class123.field2224[5] = (byte) var7;
                class123.field2224[2] = (byte) arg2;
                class123.field2224[4] = (byte) (var7 >> 8);
                class123.field2224[1] = (byte) (arg2 >> 8);
                class123.field2224[3] = (byte) (var7 >> 16);
                class123.field2224[0] = (byte) (arg2 >> 16);
                int var10 = 0;
                this.field3223.method252((long) (arg3 * 6), 0);
                int var11 = 0;
                this.field3223.method256((byte) -101, 6, class123.field2224, 0);
                while (var10 < arg2) {
                    int var12 = 0;
                    if (arg0) {
                        label109: {
                            this.field3243.method252((long) (var7 * 520), 0);
                            try {
                                this.field3243.method251(8, 0, 115, class123.field2224);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class123.field2224[4] & 0xFF) << 16) + (class123.field2224[5] & 0xFF << 8) + (class123.field2224[6] & 0xFF);
                            int var13 = (class123.field2224[2] & 0xFF << 8) + (class123.field2224[3] & 0xFF);
                            int var14 = (class123.field2224[0] & 0xFF << 8) + (class123.field2224[1] & 0xFF);
                            int var15 = class123.field2224[7] & 0xFF;
                            if (arg3 == var14 && var11 == var13 && this.field3234 == var15) {
                                if (var12 >= 0 && this.field3243.method257(true) / 520L >= (long) var12) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg0 = false;
                        var12 = (int) ((this.field3243.method257(true) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class123.field2224[0] = (byte) (arg3 >> 8);
                    class123.field2224[3] = (byte) var11;
                    int var18 = arg2 - var10;
                    class123.field2224[2] = (byte) (var11 >> 8);
                    if ((arg2 - var10) <= 512) {
                        var12 = 0;
                    }
                    class123.field2224[4] = (byte) (var12 >> 16);
                    class123.field2224[6] = (byte) var12;
                    class123.field2224[5] = (byte) (var12 >> 8);
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class123.field2224[7] = (byte) this.field3234;
                    class123.field2224[1] = (byte) arg3;
                    this.field3243.method252((long) (var7 * 520), 0);
                    var11++;
                    this.field3243.method256((byte) -58, 8, class123.field2224, 0);
                    var7 = var12;
                    this.field3243.method256((byte) -63, var18, arg4, var10);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static final void method1211(byte arg0) {
        field3229++;
        if (class8.field271 != -1) {
            class259.method1714(-115, class8.field271);
        }
        if (arg0 != -123) {
            method1219((class192) null, false, (class192) null, (byte) -104);
        }
        for (int var1 = 0; var1 < class119.field2104; var1++) {
            if (class135.field2481[var1]) {
                class80.field1516[var1] = true;
            }
            class4.field50[var1] = class135.field2481[var1];
            class135.field2481[var1] = false;
        }
        class125.field2248 = class93.field1655;
        class267.field4699 = -1;
        class193.field3480 = -1;
        class133.field2402 = null;
        if (class8.field271 != -1) {
            class119.field2104 = 0;
            class281.method1912(0, class26.field706, 0, class8.field271, (byte) -104, 0, class50.field1053, 0, -1);
        }
        class35.method296();
        class84.field1572 = 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BII[B)Z")
    public final boolean method1212(byte arg0, int arg1, int arg2, byte[] arg3) {
        field3222++;
        class31 var5 = this.field3243;
        synchronized (this.field3243) {
            int var6 = -126 % ((arg0 - 6) / 55);
            if (arg2 < 0 || this.field3226 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var7 = this.method1210(true, true, arg2, arg1, arg3);
            if (!var7) {
                var7 = this.method1210(false, true, arg2, arg1, arg3);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLvf;SLvf;IIJI)V")
    public static final void method1213(boolean arg0, class265 arg1, short arg2, class265 arg3, int arg4, int arg5, long arg6, int arg7) {
        field3235++;
        if (class50.field1049) {
            return;
        }
        if (class120.field2129 < 500) {
            class206.field3717[class120.field2129] = arg1;
            class40.field924[class120.field2129] = arg3;
            class206.field3714[class120.field2129] = arg4 == -1 ? class227.field4033 : arg4;
            class118.field2079[class120.field2129] = arg2;
            class101.field1795[class120.field2129] = arg6;
            class1.field4[class120.field2129] = arg7;
            class170.field3070[class120.field2129] = arg5;
            class120.field2129++;
        }
        if (arg0) {
            method1220((class192) null, 53);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V")
    public static final void method1214(int arg0, byte arg1) {
        field3244++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class1.field4[arg0];
        int var3 = class170.field3070[arg0];
        if (arg1 != 11) {
            return;
        }
        int var4 = class118.field2079[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class101.field1795[arg0];
        long var6 = class101.field1795[arg0];
        if (var4 == 38) {
            if (class229.field4051 == 1) {
                class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var2);
            } else {
                boolean var8 = class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 0, 0, 0, class214.field3827.field2575[0], var2);
                if (!var8) {
                    class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var2);
                }
            }
            class95.field1681 = class192.field3427;
            class162.field2944 = class122.field2193;
            class141.field2615 = 2;
            class277.field4905 = 0;
            class160.field2928++;
            class55.field1133.method1863(true, 59);
            class55.field1133.method897(71, var2 + class64.field1248);
            class55.field1133.method897(55, class231.field4073 + var3);
            class55.field1133.method935(var5, -2);
        }
        if (var4 == 7) {
            if (var5 == 0) {
                class106.field1872 = 1;
                class242.method1612(class216.field3902, var2, var3);
            } else if (var5 == 1) {
                class55.field1133.method1863(true, 205);
                class201.field3585++;
                class55.field1133.method934(arg1 - 30764, class26.field703);
                class55.field1133.method921(99, class231.field4073 + var3);
                class55.field1133.method919(-33, class192.field3457);
                class55.field1133.method897(arg1 ^ 0x44, class64.field1248 + var2);
            }
        }
        if (var4 == 37) {
            class174.field3131++;
            class55.field1133.method1863(true, 76);
            class55.field1133.method935(var2, -2);
            class55.field1133.method921(113, class73.field1406);
            class55.field1133.method934(arg1 ^ 0xFFFF87D4, class72.field1375);
            class55.field1133.method935(var5, -2);
            class55.field1133.method904(class223.field3984, arg1 ^ 0x6);
            class55.field1133.method898((byte) 115, var3);
            class127.field2265 = 0;
            class163.field2970 = class21.method204(var3, -16257);
            class140.field2597 = var2;
        }
        if (var4 == 33) {
            class122 var10 = class209.field3766[var5];
            if (var10 != null) {
                class217.method1496(0, var10.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var10.field2536[0]);
                class144.field2690++;
                class277.field4905 = 0;
                class162.field2944 = class122.field2193;
                class141.field2615 = 2;
                class95.field1681 = class192.field3427;
                class55.field1133.method1863(true, 95);
                class55.field1133.method935(var5, -2);
                class55.field1133.method921(126, class73.field1406);
                class55.field1133.method934(-30753, class72.field1375);
                class55.field1133.method919(-77, class223.field3984);
            }
        }
        if (var4 == 5) {
            class122 var11 = class209.field3766[var5];
            if (var11 != null) {
                class217.method1496(0, var11.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var11.field2536[0]);
                class141.field2615 = 2;
                class95.field1681 = class192.field3427;
                class277.field4905 = 0;
                class277.field4890++;
                class162.field2944 = class122.field2193;
                class55.field1133.method1863(true, 73);
                class55.field1133.method934(-30753, var5);
            }
        }
        if (var4 == 10) {
            class55.field1122++;
            class55.field1133.method1863(true, 25);
            class55.field1133.method946((byte) 126, var3);
            class55.field1133.method921(112, var5);
            class55.field1133.method934(-30753, var2);
            class127.field2265 = 0;
            class163.field2970 = class21.method204(var3, -16257);
            class140.field2597 = var2;
        }
        if (var4 == 42) {
            class55.field1133.method1863(true, 188);
            class55.field1133.method935(var2, arg1 - 13);
            class55.field1133.method921(121, var5);
            class202.field3623++;
            class55.field1133.method904(var3, arg1 ^ 0x6);
            class127.field2265 = 0;
            class163.field2970 = class21.method204(var3, arg1 ^ 0xFFFFC074);
            class140.field2597 = var2;
        }
        if (var4 == 9) {
            class73.field1404++;
            boolean var12 = class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 0, 0, 0, class214.field3827.field2575[0], var2);
            if (!var12) {
                class217.method1496(0, var3, class214.field3827.field2536[0], arg1 + 10385, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var2);
            }
            class162.field2944 = class122.field2193;
            class141.field2615 = 2;
            class95.field1681 = class192.field3427;
            class277.field4905 = 0;
            class55.field1133.method1863(true, 97);
            class55.field1133.method934(-30753, class231.field4073 + var3);
            class55.field1133.method904(class192.field3457, 13);
            class55.field1133.method934(-30753, var5);
            class55.field1133.method934(arg1 ^ 0xFFFF87D4, class64.field1248 + var2);
            class55.field1133.method921(107, class26.field703);
        }
        if (var4 == 47) {
            class122 var14 = class209.field3766[var5];
            if (var14 != null) {
                class141.field2613++;
                class217.method1496(0, var14.field2575[0], class214.field3827.field2536[0], arg1 ^ 0x2897, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var14.field2536[0]);
                class162.field2944 = class122.field2193;
                class141.field2615 = 2;
                class95.field1681 = class192.field3427;
                class277.field4905 = 0;
                class55.field1133.method1863(true, 4);
                class55.field1133.method921(108, var5);
            }
        }
        if (var4 == 23 && class79.method552(var2, var3, (byte) -12, var6)) {
            class55.field1133.method1863(true, 183);
            class23.field689++;
            class55.field1133.method897(113, class64.field1248 + var2);
            class55.field1133.method897(88, class72.field1375);
            class55.field1133.method921(123, class231.field4073 + var3);
            class55.field1133.method935((int) (var6 >>> 32) & Integer.MAX_VALUE, -2);
            class55.field1133.method935(class73.field1406, -2);
            class55.field1133.method919(119, class223.field3984);
        }
        if (var4 == 6) {
            if (var5 == 0) {
                class242.method1612(class216.field3902, var2, var3);
            } else if (var5 == 1) {
                if (class30.field773 > 0 && class69.field1311[82] && class69.field1311[81]) {
                    class107.method715(class64.field1248 + var2, class231.field4073 + var3, (byte) -103, class216.field3902);
                } else if (class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 1, true, 0, 0, 0, 0, class214.field3827.field2575[0], var2)) {
                    class55.field1133.method903((byte) 36, class232.field4100);
                    class55.field1133.method903((byte) 36, class89.field1602);
                    class55.field1133.method921(122, class79.field1500);
                    class55.field1133.method903((byte) 36, 57);
                    class55.field1133.method903((byte) 36, class122.field2180);
                    class55.field1133.method903((byte) 36, class39.field908);
                    class55.field1133.method903((byte) 36, 89);
                    class55.field1133.method921(arg1 + 103, class214.field3827.field2600);
                    class55.field1133.method921(103, class214.field3827.field2564);
                    class55.field1133.method903((byte) 36, class242.field4210);
                    class55.field1133.method903((byte) 36, 63);
                }
            }
        }
        if (var4 == 22) {
            class118.method796(-25946);
            class6 var15 = class21.method204(var3, -16257);
            class282.field4969 = 1;
            class223.field3984 = var3;
            class72.field1375 = var2;
            class73.field1406 = var5;
            class176.method1145((byte) 110, var15);
            class9.field305 = class148.method1022(10, new class265[] { class111.field1933, class54.method418(var5, 0).field4548, class269.field4792 });
            if (class9.field305 == null) {
                class9.field305 = class276.field4867;
            }
            return;
        }
        if (var4 == 35) {
            class6 var16 = class21.method204(var3, -16257);
            boolean var17 = true;
            if (var16.field146 > 0) {
                var17 = class257.method1683(arg1 ^ 0x4BD1, var16);
            }
            if (var17) {
                class76.field1456++;
                class55.field1133.method1863(true, 33);
                class55.field1133.method898((byte) 88, var3);
            }
        }
        if (var4 == 50) {
            class6 var18 = class12.method98(var3, var2, (byte) -124);
            if (var18 != null) {
                class118.method796(-25946);
                class187.method1279(class172.method1132(client.method1474(var18), (byte) 88), var2, 24463, var3);
                class282.field4969 = 0;
                class239.field4170 = class261.method1734(var18, arg1 ^ 0x76);
                if (class239.field4170 == null) {
                    class239.field4170 = class262.field4576;
                }
                if (!var18.field226) {
                    class130.field2286 = class148.method1022(10, new class265[] { class21.field621, var18.field247, class269.field4792 });
                    return;
                }
                class130.field2286 = class148.method1022(10, new class265[] { var18.field231, class269.field4792 });
            }
            return;
        }
        if (var4 == 58) {
            if (class229.field4051 == 1) {
                class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var2);
            } else {
                boolean var19 = class217.method1496(0, var3, class214.field3827.field2536[0], arg1 + 10385, 2, false, 0, 0, 0, 0, class214.field3827.field2575[0], var2);
                if (!var19) {
                    class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var2);
                }
            }
            class141.field2615 = 2;
            class118.field2098++;
            class95.field1681 = class192.field3427;
            class162.field2944 = class122.field2193;
            class277.field4905 = 0;
            class55.field1133.method1863(true, 79);
            class55.field1133.method897(119, var5);
            class55.field1133.method935(class231.field4073 + var3, -2);
            class55.field1133.method921(arg1 ^ 0x70, var2 + class64.field1248);
        }
        if (var4 == 1005) {
            class57.field1161++;
            class79.method552(var2, var3, (byte) -12, var6);
            class55.field1133.method1863(true, 96);
            class55.field1133.method897(44, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class55.field1133.method934(arg1 - 30764, class64.field1248 + var2);
            class55.field1133.method921(arg1 ^ 0x69, class231.field4073 + var3);
        }
        if (var4 == 44) {
            if (class229.field4051 == 1) {
                class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var2);
            } else {
                boolean var21 = class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 0, 0, 0, class214.field3827.field2575[0], var2);
                if (!var21) {
                    class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var2);
                }
            }
            class49.field1041++;
            class141.field2615 = 2;
            class95.field1681 = class192.field3427;
            class277.field4905 = 0;
            class162.field2944 = class122.field2193;
            class55.field1133.method1863(true, 143);
            class55.field1133.method921(122, class64.field1248 + var2);
            class55.field1133.method921(arg1 ^ 0x72, var5);
            class55.field1133.method934(-30753, var3 + class231.field4073);
        }
        if (var4 == 49 && class209.field3760 == null) {
            class201.method1382(var3, 184, var2);
            class209.field3760 = class12.method98(var3, var2, (byte) -124);
            class176.method1145((byte) 126, class209.field3760);
        }
        if (var4 == 29) {
            class78.field1482++;
            class55.field1133.method1863(true, 53);
            class55.field1133.method919(-34, var3);
            class55.field1133.method934(arg1 ^ 0xFFFF87D4, class26.field703);
            class55.field1133.method921(126, var2);
            class55.field1133.method946((byte) 124, class192.field3457);
        }
        if (var4 == 12) {
            class122 var23 = class209.field3766[var5];
            if (var23 != null) {
                class107.field1889++;
                class217.method1496(0, var23.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var23.field2536[0]);
                class162.field2944 = class122.field2193;
                class141.field2615 = 2;
                class95.field1681 = class192.field3427;
                class277.field4905 = 0;
                class55.field1133.method1863(true, 156);
                class55.field1133.method935(var5, -2);
                class55.field1133.method919(arg1 - 77, class192.field3457);
                class55.field1133.method935(class26.field703, -2);
            }
        }
        if (var4 == 45) {
            class79.method552(var2, var3, (byte) -12, var6);
            class55.field1133.method1863(true, 67);
            class55.field1133.method935((int) (var6 >>> 32) & Integer.MAX_VALUE, -2);
            class55.field1133.method935(class64.field1248 + var2, arg1 ^ 0xFFFFFFF5);
            class55.field1133.method934(-30753, var3 + class231.field4073);
            class22.field670++;
        }
        if (var4 == 8) {
            class39.field901++;
            if (class229.field4051 == 1) {
                class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var2);
            } else {
                boolean var24 = class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 0, 0, 0, class214.field3827.field2575[0], var2);
                if (!var24) {
                    class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var2);
                }
            }
            class95.field1681 = class192.field3427;
            class277.field4905 = 0;
            class162.field2944 = class122.field2193;
            class141.field2615 = 2;
            class55.field1133.method1863(true, 218);
            class55.field1133.method921(102, class231.field4073 + var3);
            class55.field1133.method934(-30753, var5);
            class55.field1133.method934(-30753, class64.field1248 + var2);
        }
        if (var4 == 26) {
            class55.field1133.method1863(true, 213);
            class212.field3812++;
            class55.field1133.method946((byte) 117, var3);
            class55.field1133.method935(var5, -2);
            class55.field1133.method935(var2, arg1 ^ 0xFFFFFFF5);
            class127.field2265 = 0;
            class163.field2970 = class21.method204(var3, -16257);
            class140.field2597 = var2;
        }
        if (var4 == 32) {
            class55.field1133.method1863(true, 119);
            class55.field1133.method897(65, var5);
            class55.field1133.method935(var2, -2);
            class258.field4425++;
            class55.field1133.method919(arg1 + 113, var3);
            class127.field2265 = 0;
            class163.field2970 = class21.method204(var3, arg1 - 16268);
            class140.field2597 = var2;
        }
        if (var4 == 59) {
            class55.field1133.method1863(true, 236);
            class55.field1133.method934(-30753, var5);
            class68.field1305++;
            class55.field1133.method919(120, var3);
            class55.field1133.method935(var2, -2);
            class127.field2265 = 0;
            class163.field2970 = class21.method204(var3, -16257);
            class140.field2597 = var2;
        }
        if (var4 == 13) {
            class55.field1133.method1863(true, 241);
            class121.field2147++;
            class55.field1133.method897(85, var5);
            class55.field1133.method897(100, var2);
            class55.field1133.method898((byte) 115, var3);
            class127.field2265 = 0;
            class163.field2970 = class21.method204(var3, -16257);
            class140.field2597 = var2;
        }
        if (var4 == 16) {
            class122 var26 = class209.field3766[var5];
            if (var26 != null) {
                class217.method1496(0, var26.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var26.field2536[0]);
                class44.field974++;
                class95.field1681 = class192.field3427;
                class277.field4905 = 0;
                class162.field2944 = class122.field2193;
                class141.field2615 = 2;
                class55.field1133.method1863(true, 74);
                class55.field1133.method897(64, var5);
            }
        }
        if (var4 == 4) {
            class50.field1065++;
            class55.field1133.method1863(true, 210);
            class55.field1133.method935(var5, -2);
            class55.field1133.method946((byte) 117, var3);
            class55.field1133.method897(122, var2);
            class127.field2265 = 0;
            class163.field2970 = class21.method204(var3, -16257);
            class140.field2597 = var2;
        }
        if (var4 == 1004) {
            class166.field3005++;
            class141.field2615 = 2;
            class95.field1681 = class192.field3427;
            class162.field2944 = class122.field2193;
            class277.field4905 = 0;
            class55.field1133.method1863(true, 244);
            class55.field1133.method934(-30753, var5);
        }
        if (var4 == 17) {
            class272.field4831++;
            class55.field1133.method1863(true, 43);
            class55.field1133.method934(-30753, var5);
            class55.field1133.method921(110, var2);
            class55.field1133.method904(var3, 13);
            class127.field2265 = 0;
            class163.field2970 = class21.method204(var3, -16257);
            class140.field2597 = var2;
        }
        if (var4 == 21) {
            class23 var27 = class4.field67[var5];
            if (var27 != null) {
                class217.method1496(0, var27.field2575[0], class214.field3827.field2536[0], arg1 ^ 0x2897, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var27.field2536[0]);
                class188.field3383++;
                class277.field4905 = 0;
                class95.field1681 = class192.field3427;
                class141.field2615 = 2;
                class162.field2944 = class122.field2193;
                class55.field1133.method1863(true, 247);
                class55.field1133.method921(108, class26.field703);
                class55.field1133.method897(101, var5);
                class55.field1133.method919(-112, class192.field3457);
            }
        }
        if (var4 == 43) {
            class122 var28 = class209.field3766[var5];
            if (var28 != null) {
                class150.field2776++;
                class217.method1496(0, var28.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var28.field2536[0]);
                class162.field2944 = class122.field2193;
                class277.field4905 = 0;
                class95.field1681 = class192.field3427;
                class141.field2615 = 2;
                class55.field1133.method1863(true, 46);
                class55.field1133.method934(-30753, var5);
            }
        }
        if (var4 == 57) {
            class23 var29 = class4.field67[var5];
            if (var29 != null) {
                class221.field3961++;
                class217.method1496(0, var29.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var29.field2536[0]);
                class162.field2944 = class122.field2193;
                class95.field1681 = class192.field3427;
                class277.field4905 = 0;
                class141.field2615 = 2;
                class55.field1133.method1863(true, 195);
                class55.field1133.method935(class73.field1406, -2);
                class55.field1133.method935(var5, -2);
                class55.field1133.method898((byte) 52, class223.field3984);
                class55.field1133.method921(110, class72.field1375);
            }
        }
        if (var4 == 15) {
            class122 var30 = class209.field3766[var5];
            if (var30 != null) {
                class217.method1496(0, var30.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var30.field2536[0]);
                class95.field1681 = class192.field3427;
                class277.field4905 = 0;
                class141.field2615 = 2;
                class162.field2944 = class122.field2193;
                class55.field1133.method1863(true, 27);
                class146.field2727++;
                class55.field1133.method934(-30753, var5);
            }
        }
        if (var4 == 18 || var4 == 1001) {
            class43.method360(class40.field924[arg0], var3, var5, (byte) 123, var2);
        }
        if (var4 == 25) {
            class122 var31 = class209.field3766[var5];
            if (var31 != null) {
                class253.field4353++;
                class217.method1496(0, var31.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var31.field2536[0]);
                class162.field2944 = class122.field2193;
                class141.field2615 = 2;
                class277.field4905 = 0;
                class95.field1681 = class192.field3427;
                class55.field1133.method1863(true, 23);
                class55.field1133.method934(-30753, var5);
            }
        }
        if (var4 == 3) {
            class76.field1456++;
            class55.field1133.method1863(true, 33);
            class55.field1133.method898((byte) 42, var3);
            class6 var32 = class21.method204(var3, -16257);
            if (var32.field128 != null && var32.field128[0][0] == 5) {
                int var33 = var32.field128[0][1];
                class256.field4385[var33] = 1 - class256.field4385[var33];
                class134.method888((byte) -126, var33);
            }
        }
        if (var4 == 1007) {
            class95.field1681 = class192.field3427;
            class141.field2615 = 2;
            class162.field2944 = class122.field2193;
            class277.field4905 = 0;
            class23 var34 = class4.field67[var5];
            if (var34 != null) {
                class268 var35 = var34.field681;
                if (var35.field4755 != null) {
                    var35 = var35.method1825(20656);
                }
                if (var35 != null) {
                    class52.field1086++;
                    class55.field1133.method1863(true, 145);
                    class55.field1133.method921(98, var35.field4754);
                }
            }
        }
        if (var4 == 41) {
            class23 var36 = class4.field67[var5];
            if (var36 != null) {
                class217.method1496(0, var36.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var36.field2536[0]);
                class277.field4905 = 0;
                class95.field1681 = class192.field3427;
                class141.field2615 = 2;
                class162.field2944 = class122.field2193;
                class55.field1133.method1863(true, 242);
                class55.field1133.method935(var5, -2);
                class28.field725++;
            }
        }
        if (var4 == 36) {
            class278.field4908++;
            if (class229.field4051 == 1) {
                class217.method1496(0, var3, class214.field3827.field2536[0], arg1 + 10385, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var2);
            } else {
                boolean var37 = class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 0, 0, 0, class214.field3827.field2575[0], var2);
                if (!var37) {
                    class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var2);
                }
            }
            class95.field1681 = class192.field3427;
            class141.field2615 = 2;
            class162.field2944 = class122.field2193;
            class277.field4905 = 0;
            class55.field1133.method1863(true, 60);
            class55.field1133.method897(47, var5);
            class55.field1133.method935(var2 + class64.field1248, arg1 ^ 0xFFFFFFF5);
            class55.field1133.method921(125, class231.field4073 + var3);
        }
        if (var4 == 46) {
            if (var5 == 0) {
                class58.field1179 = 1;
                class242.method1612(class216.field3902, var2, var3);
            } else if (class30.field773 > 0 && class69.field1311[82] && class69.field1311[81]) {
                class107.method715(class64.field1248 + var2, class231.field4073 + var3, (byte) -119, class216.field3902);
            } else {
                class55.field1133.method1863(true, 48);
                class55.field1133.method935(class231.field4073 + var3, -2);
                class55.field1133.method935(class64.field1248 + var2, -2);
                class277.field4888++;
            }
        }
        if (var4 == 11) {
            class201.field3591++;
            class55.field1133.method1863(true, 20);
            class55.field1133.method921(127, var5);
            class55.field1133.method935(var2, -2);
            class55.field1133.method904(var3, 13);
            class127.field2265 = 0;
            class163.field2970 = class21.method204(var3, -16257);
            class140.field2597 = var2;
        }
        if (var4 == 19) {
            class133.field2408++;
            class79.method552(var2, var3, (byte) -12, var6);
            class55.field1133.method1863(true, 150);
            class55.field1133.method897(99, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class55.field1133.method921(100, class64.field1248 + var2);
            class55.field1133.method897(117, var3 + class231.field4073);
        }
        if (var4 == 34) {
            class23 var39 = class4.field67[var5];
            if (var39 != null) {
                class217.method1496(0, var39.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var39.field2536[0]);
                class141.field2615 = 2;
                class277.field4905 = 0;
                class162.field2944 = class122.field2193;
                class265.field4620++;
                class95.field1681 = class192.field3427;
                class55.field1133.method1863(true, 92);
                class55.field1133.method897(127, var5);
            }
        }
        if (var4 == 1) {
            class55.field1133.method1863(true, 33);
            class55.field1133.method898((byte) 123, var3);
            class6 var40 = class21.method204(var3, arg1 - 16268);
            class76.field1456++;
            if (var40.field128 != null && var40.field128[0][0] == 5) {
                int var41 = var40.field128[0][1];
                if (class256.field4385[var41] != var40.field177[0]) {
                    class256.field4385[var41] = var40.field177[0];
                    class134.method888((byte) -125, var41);
                }
            }
        }
        if (var4 == 51) {
            class122 var42 = class209.field3766[var5];
            if (var42 != null) {
                class214.field3834++;
                class217.method1496(0, var42.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var42.field2536[0]);
                class141.field2615 = 2;
                class277.field4905 = 0;
                class162.field2944 = class122.field2193;
                class95.field1681 = class192.field3427;
                class55.field1133.method1863(true, 142);
                class55.field1133.method935(var5, -2);
            }
        }
        if (var4 == 60) {
            class23 var43 = class4.field67[var5];
            if (var43 != null) {
                class217.method1496(0, var43.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var43.field2536[0]);
                class95.field1681 = class192.field3427;
                class162.field2944 = class122.field2193;
                class141.field2615 = 2;
                class277.field4905 = 0;
                class89.field1595++;
                class55.field1133.method1863(true, 26);
                class55.field1133.method921(103, var5);
            }
        }
        if (var4 == 14) {
            class177.field3155++;
            class55.field1133.method1863(true, 113);
            class55.field1133.method897(74, var2);
            class55.field1133.method904(var3, 13);
            class55.field1133.method935(var5, arg1 ^ 0xFFFFFFF5);
            class127.field2265 = 0;
            class163.field2970 = class21.method204(var3, -16257);
            class140.field2597 = var2;
        }
        if (var4 == 24) {
            class122 var44 = class209.field3766[var5];
            if (var44 != null) {
                class217.method1496(0, var44.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var44.field2536[0]);
                class277.field4905 = 0;
                class252.field4337++;
                class162.field2944 = class122.field2193;
                class95.field1681 = class192.field3427;
                class141.field2615 = 2;
                class55.field1133.method1863(true, 31);
                class55.field1133.method934(-30753, var5);
            }
        }
        if (var4 == 48) {
            class162.method1074(arg1 - 6);
        }
        if (var4 == 31) {
            class79.method552(var2, var3, (byte) -12, var6);
            class55.field1133.method1863(true, 57);
            class142.field2647++;
            class55.field1133.method934(-30753, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class55.field1133.method934(-30753, var3 + class231.field4073);
            class55.field1133.method897(54, class64.field1248 + var2);
        }
        if (var4 == 40 && class79.method552(var2, var3, (byte) -12, var6)) {
            class55.field1133.method1863(true, 248);
            class55.field1133.method934(-30753, class64.field1248 + var2);
            class237.field4141++;
            class55.field1133.method897(107, class231.field4073 + var3);
            class55.field1133.method934(-30753, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class55.field1133.method897(arg1 ^ 0x30, class26.field703);
            class55.field1133.method898((byte) 65, class192.field3457);
        }
        if (var4 == 28) {
            class210.field3769++;
            class55.field1133.method1863(true, 91);
            class55.field1133.method946((byte) 120, var3);
            class55.field1133.method934(-30753, var2);
            class55.field1133.method935(class26.field703, arg1 ^ 0xFFFFFFF5);
            class55.field1133.method919(-105, class192.field3457);
            class55.field1133.method921(115, var5);
            class127.field2265 = 0;
            class163.field2970 = class21.method204(var3, -16257);
            class140.field2597 = var2;
        }
        if (var4 == 20) {
            class79.method552(var2, var3, (byte) -12, var6);
            class55.field1133.method1863(true, 72);
            class240.field4188++;
            class55.field1133.method934(arg1 ^ 0xFFFF87D4, class231.field4073 + var3);
            class55.field1133.method935((int) (var6 >>> 32) & Integer.MAX_VALUE, -2);
            class55.field1133.method897(arg1 + 50, var2 - -class64.field1248);
        }
        if (var4 == 2) {
            class45.field987++;
            boolean var45 = class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 0, 0, 0, class214.field3827.field2575[0], var2);
            if (!var45) {
                class217.method1496(0, var3, class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var2);
            }
            class162.field2944 = class122.field2193;
            class277.field4905 = 0;
            class95.field1681 = class192.field3427;
            class141.field2615 = 2;
            class55.field1133.method1863(true, 163);
            class55.field1133.method946((byte) 124, class223.field3984);
            class55.field1133.method935(class231.field4073 + var3, -2);
            class55.field1133.method897(119, class64.field1248 + var2);
            class55.field1133.method934(-30753, var5);
            class55.field1133.method921(arg1 ^ 0x74, class72.field1375);
            class55.field1133.method934(arg1 - 30764, class73.field1406);
        }
        if (var4 == 30) {
            class23 var47 = class4.field67[var5];
            if (var47 != null) {
                class133.field2407++;
                class217.method1496(0, var47.field2575[0], class214.field3827.field2536[0], 10396, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var47.field2536[0]);
                class95.field1681 = class192.field3427;
                class162.field2944 = class122.field2193;
                class277.field4905 = 0;
                class141.field2615 = 2;
                class55.field1133.method1863(true, 168);
                class55.field1133.method897(arg1 + 114, var5);
            }
        }
        if (var4 == 1003) {
            class6 var48 = class21.method204(var3, -16257);
            if (var48 == null || var48.field218[var2] < 100000) {
                class55.field1133.method1863(true, 178);
                class55.field1133.method935(var5, arg1 ^ 0xFFFFFFF5);
                class1.field5++;
            } else {
                class259.method1725(-59, class148.method1022(10, new class265[] { class241.method1609(true, var48.field218[var2]), class221.field3969, class54.method418(var5, arg1 - 11).field4548 }), 0, class4.field66);
            }
            class127.field2265 = 0;
            class163.field2970 = class21.method204(var3, -16257);
            class140.field2597 = var2;
        }
        if (var4 == 39) {
            class23 var49 = class4.field67[var5];
            if (var49 != null) {
                class265.field4614++;
                class217.method1496(0, var49.field2575[0], class214.field3827.field2536[0], arg1 + 10385, 2, false, 0, 1, 1, 0, class214.field3827.field2575[0], var49.field2536[0]);
                class141.field2615 = 2;
                class95.field1681 = class192.field3427;
                class277.field4905 = 0;
                class162.field2944 = class122.field2193;
                class55.field1133.method1863(true, 180);
                class55.field1133.method921(121, var5);
            }
        }
        if (var4 == 1002) {
            class1.field5++;
            class95.field1681 = class192.field3427;
            class277.field4905 = 0;
            class141.field2615 = 2;
            class162.field2944 = class122.field2193;
            class55.field1133.method1863(true, 178);
            class55.field1133.method935(var5, -2);
        }
        if (class282.field4969 != 0) {
            class282.field4969 = 0;
            class176.method1145((byte) -121, class21.method204(class223.field3984, -16257));
        }
        if (class25.field695) {
            class118.method796(-25946);
        }
        if (class163.field2970 != null && class127.field2265 == 0) {
            class176.method1145((byte) -107, class163.field2970);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)Z")
    public static final boolean method1215(byte arg0, int arg1) {
        field3224++;
        class229 var2 = class258.method1703((byte) -109, arg1);
        if (var2 == null) {
            return false;
        } else if (class226.field4010 == 1 || class226.field4010 == 2 || class264.field4601 == 2) {
            byte[] var3 = var2.field4047.method1787(0);
            class256.field4381 = new String(var3, 0, var3.length);
            class206.field3700 = var2.field4055;
            if (class264.field4601 != 0) {
                class177.field3152 = class206.field3700 + 40000;
                class53.field1106 = class177.field3152;
                class40.field910 = class206.field3700 + 50000;
            }
            return true;
        } else {
            class265 var4 = class51.field1077;
            if (class264.field4601 != 0) {
                var4 = class148.method1022(10, new class265[] { class184.field3291, class241.method1609(true, var2.field4055 + 7000) });
            }
            if (arg0 > -122) {
                return false;
            }
            class265 var5 = class51.field1077;
            if (class163.field2963 != null) {
                var5 = class148.method1022(10, new class265[] { class231.field4071, class163.field2963 });
            }
            class265 var6 = class148.method1022(10, new class265[] { class154.field2858, var2.field4047, var4, class52.field1081, class241.method1609(true, class44.field971), class233.field4107, class241.method1609(true, class23.field675), var5, class145.field2714, class153.field2848 ? class55.field1128 : class42.field945, class242.field4230, class202.field3624 ? class55.field1128 : class42.field945, class31.field800, class264.field4602 ? class55.field1128 : class42.field945 });
            try {
                class21.field652.getAppletContext().showDocument(var6.method1780(0), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)[B")
    public final byte[] method1216(int arg0, int arg1) {
        field3230++;
        class31 var3 = this.field3243;
        synchronized (this.field3243) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field3223.method257(true)) {
                    return null;
                }
                int var5 = 72 % ((arg0 + 71) / 53);
                this.field3223.method252((long) (arg1 * 6), 0);
                this.field3223.method251(6, 0, -116, class123.field2224);
                int var6 = (class123.field2224[0] & 0xFF << 16) + (((class123.field2224[1] & 0xFF) << 8) + (class123.field2224[2] & 0xFF));
                int var7 = ((class123.field2224[3] & 0xFF) << 16) - (-(class123.field2224[4] & 0xFF << 8) - (class123.field2224[5] & 0xFF));
                if (var6 < 0 || var6 > this.field3226) {
                    return null;
                } else if (var7 > 0 && (long) var7 <= this.field3243.method257(true) / 520L) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    while (var11 < var6) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field3243.method252((long) (var7 * 520), 0);
                        int var14 = var6 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field3243.method251(var14 + 8, 0, -22, class123.field2224);
                        int var15 = (class123.field2224[0] & 0xFF << 8) + (class123.field2224[1] & 0xFF);
                        int var16 = ((class123.field2224[2] & 0xFF) << 8) + (class123.field2224[3] & 0xFF);
                        int var17 = (class123.field2224[6] & 0xFF) + (class123.field2224[4] & 0xFF << 16) + (class123.field2224[5] & 0xFF << 8);
                        int var18 = class123.field2224[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field3234 == var18) {
                            if (var17 >= 0 && (this.field3243.method257(true) / 520L) >= ((long) var17)) {
                                var7 = var17;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class123.field2224[var21 + 8];
                                }
                                var12++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V")
    public static void method1217(byte arg0) {
        field3242 = null;
        if (arg0 <= 117) {
            return;
        }
        field3240 = null;
        field3225 = null;
        field3238 = null;
        field3228 = null;
        field3245 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILba;)V")
    public static final void method1218(int arg0, class140 arg1) {
        field3237++;
        if (class93.field1655 == arg1.field2554 || arg1.field2570 == -1 || arg1.field2591 != 0 || (arg1.field2581 + 1) > class174.method1142(arg1.field2570, false).field3894[arg1.field2552]) {
            int var2 = class93.field1655 - arg1.field2549;
            int var3 = arg1.field2554 - arg1.field2549;
            int var4 = arg1.field2539 * 128 + (arg1.method822(2) * 64);
            int var5 = arg1.field2593 * 128 + (arg1.method822(2) * 64);
            int var6 = arg1.field2607 * 128 + (arg1.method822(2) * 64);
            int var7 = arg1.field2557 * 128 + arg1.method822(2) * 64;
            arg1.field2600 = ((var3 - var2) * var4 + var2 * var6) / var3;
            arg1.field2564 = ((var3 - var2) * var5 + var2 * var7) / var3;
        }
        if (arg1.field2567 == 0) {
            arg1.field2580 = 1024;
        }
        arg1.field2599 = 0;
        if (arg1.field2567 == 1) {
            arg1.field2580 = 1536;
        }
        if (arg1.field2567 == 2) {
            arg1.field2580 = 0;
        }
        if (arg1.field2567 == 3) {
            arg1.field2580 = 512;
        }
        if (arg0 > 88) {
            arg1.field2563 = arg1.field2580;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lfl;ZLfl;B)V")
    public static final void method1219(class192 arg0, boolean arg1, class192 arg2, byte arg3) {
        class113.field1981 = arg2;
        field3239++;
        class8.field278 = arg0;
        class256.field4380 = arg1;
        if (arg3 != 29) {
            method1214(-5, (byte) 36);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lfl;I)Z")
    public static final boolean method1220(class192 arg0, int arg1) {
        field3232++;
        if (arg0.method1330(class184.field3297, (byte) -116)) {
            return true;
        } else {
            return arg1 != 2;
        }
    }

    @OriginalMember(owner = "client!i", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3241++;
        return "Cache:" + this.field3234;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(ILdl;Ldl;I)V")
    public class182(int arg0, class31 arg1, class31 arg2, int arg3) {
        this.field3243 = arg1;
        this.field3226 = arg3;
        this.field3234 = arg0;
        this.field3223 = arg2;
    }
}
