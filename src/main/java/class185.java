import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class185 implements class222 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    private int field3226 = 50;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "Z")
    private boolean field3255 = false;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "Lbk;")
    private class136 field3249;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Lbk;")
    private class136 field3236;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "Lba;")
    private class93 field3246;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "[Z")
    private boolean[] field3227;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "[S")
    private short[] field3229;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "[Z")
    private boolean[] field3254;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "[Z")
    private boolean[] field3235;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "[Z")
    private boolean[] field3247;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "[B")
    private byte[] field3234;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "[Z")
    private boolean[] field3240;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "[B")
    private byte[] field3248;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[B")
    private byte[] field3225;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "[B")
    private byte[] field3228;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "Lqj;")
    public static class196 field3252 = class80.method502("null", -48);

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "Lba;")
    public static class93 field3250 = new class93(128);

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "D")
    public static double field3256 = -1.0D;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    public static int field3257 = 0;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "Lqj;")
    public static class196 field3258 = class80.method502("compass", -48);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(II)[I")
    public final int[] method1199(int arg0, int arg1) {
        field3239++;
        if (arg1 == 8) {
            class186 var3 = this.method1201(false, arg0);
            return var3 == null ? null : var3.method1219(this.field3255 || this.field3240[arg0], this, -20672, this.field3249);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)Z")
    public final boolean method1200(int arg0, int arg1) {
        field3253++;
        if (arg0 != 45757040) {
            this.method1213(64, (byte) 10);
        }
        return this.field3255 || this.field3240[arg1];
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)Lng;")
    private final class186 method1201(boolean arg0, int arg1) {
        field3233++;
        class186 var3 = (class186) this.field3246.method575(0, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3236.method842(arg1, (byte) -112, 0);
        if (var4 == null) {
            return null;
        } else {
            class56 var5 = new class56(var4);
            class186 var6 = new class186(var5);
            this.field3246.method574((long) arg1, arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z")
    public final boolean method1202(int arg0, int arg1) {
        if (arg0 == 206) {
            field3244++;
            return this.field3254[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(II)I")
    public final int method1203(int arg0, int arg1) {
        if (arg0 > -68) {
            this.field3229 = null;
        }
        field3243++;
        return this.field3229[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)Z")
    public final boolean method1204(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method1214(-106);
        }
        field3251++;
        return this.field3235[arg0];
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIF)[I")
    public final int[] method1205(int arg0, int arg1, float arg2) {
        class186 var4 = this.method1201(false, arg0);
        field3230++;
        if (var4 == null) {
            return null;
        }
        if (arg1 != 2) {
            this.field3236 = null;
        }
        var4.field3281 = true;
        return var4.method1216(arg2, this.field3249, this, arg1 ^ 0xFFFF82DB, this.field3255 || this.field3240[arg0]);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)Z")
    public static final boolean method1206(byte arg0, int arg1) {
        field3241++;
        if (arg0 > -21) {
            return true;
        } else {
            return (arg1 >> 20 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lpe;IIIII)V")
    public static final void method1207(class258 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class39.field442 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class23.field293) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class110.field1566 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class61 var14 = class249.field4410[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class42.field480[var11][var12 + 1][var13] + class42.field480[var11][var12][var13] + class42.field480[var11][var12][var13 + 1] + class42.field480[var11][var12 + 1][var13 + 1]) / 4 - (class42.field480[arg1][arg2 + 1][arg3] + class42.field480[arg1][arg2][arg3] + class42.field480[arg1][arg2][arg3 + 1] + class42.field480[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class221 var16 = var14.field829;
                                    if (var16 != null) {
                                        if (var16.field3992.method1435()) {
                                            arg0.method1443(var16.field3992, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3979 != null && var16.field3979.method1435()) {
                                            arg0.method1443(var16.field3979, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field836; var17++) {
                                        class200 var18 = var14.field823[var17];
                                        if (var18 != null && var18.field3544.method1435() && (var18.field3549 == var12 || var7 == var12) && (var18.field3548 == var13 || var9 == var13)) {
                                            int var19 = var18.field3539 + 1 - var18.field3549;
                                            int var20 = var18.field3556 + 1 - var18.field3548;
                                            arg0.method1443(var18.field3544, (var18.field3549 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3548 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1208(int arg0) {
        field3252 = null;
        field3258 = null;
        if (arg0 == 9174) {
            field3250 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZB)V")
    public final void method1209(boolean arg0, byte arg1) {
        this.field3255 = arg0;
        field3245++;
        if (arg1 == 107) {
            this.method1214(112);
        }
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(II)Lbi;")
    public static final class126 method1210(int arg0, int arg1) {
        field3231++;
        class126 var2 = (class126) class238.field4223.method1537((long) arg0, false);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 65535) {
            byte[] var3 = class86.field1276.method842(class18.method98((byte) -8, arg0), (byte) -120, class86.method538(arg0, -4));
            class126 var4 = new class126();
            if (var3 != null) {
                var4.method779(new class56(var3), 1878366668);
            }
            class238.field4223.method1532(true, (long) arg0, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public static final void method1211(int arg0) {
        if (class151.field2440 > 0) {
            class151.field2440--;
        }
        if (class84.field1233 > 1) {
            class84.field1233--;
            class151.field2423 = class92.field1341;
        }
        field3238++;
        if (class175.field2944) {
            class175.field2944 = false;
            class195.method1285(40);
            return;
        }
        for (int var1 = 0; var1 < 100 && class70.method451(0); var1++) {
        }
        if (class56.field741 != 30) {
            return;
        }
        class224.method1516((byte) -123, class44.field520, 176);
        Object var2 = class150.field2398.field21;
        synchronized (class150.field2398.field21) {
            if (!class94.field1379) {
                class150.field2398.field32 = 0;
            } else if (class178.field3052 != 0 || class150.field2398.field32 >= 40) {
                class44.field520.method1173(67, 14592);
                class44.field520.method329((byte) 15, 0);
                int var3 = class44.field520.field699;
                class81.field1170++;
                int var4 = 0;
                for (int var5 = 0; class150.field2398.field32 > var5 && class44.field520.field699 - var3 < 240; var5++) {
                    int var6 = class150.field2398.field30[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class150.field2398.field31[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    var4++;
                    if (class150.field2398.field30[var5] == -1 && class150.field2398.field31[var5] == -1) {
                        var7 = -1;
                        var8 = true;
                        var6 = -1;
                    }
                    if (class93.field1364 != var7 || class122.field1746 != var6) {
                        int var9 = var7 - class93.field1364;
                        class93.field1364 = var7;
                        int var10 = var6 - class122.field1746;
                        class122.field1746 = var6;
                        if (class10.field123 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class44.field520.method310((class10.field123 << 12) + (var9 << 6) + var10, -73);
                            class10.field123 = 0;
                        } else if (class10.field123 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class44.field520.method329((byte) 118, class10.field123 + 128);
                            class44.field520.method310((var9 << 8) + var10, arg0 ^ 0xFFFFFFA1);
                            class10.field123 = 0;
                        } else if (class10.field123 < 32) {
                            class44.field520.method329((byte) 74, class10.field123 + 192);
                            if (var8) {
                                class44.field520.method355((byte) 38, Integer.MIN_VALUE);
                            } else {
                                class44.field520.method355((byte) 22, var6 << 16 | var7);
                            }
                            class10.field123 = 0;
                        } else {
                            class44.field520.method310(class10.field123 + 57344, -77);
                            if (var8) {
                                class44.field520.method355((byte) 114, Integer.MIN_VALUE);
                            } else {
                                class44.field520.method355((byte) 35, var6 << 16 | var7);
                            }
                            class10.field123 = 0;
                        }
                    } else if (class10.field123 < 2047) {
                        class10.field123++;
                    }
                }
                class44.field520.method359(class44.field520.field699 - var3, (byte) -114);
                if (class150.field2398.field32 <= var4) {
                    class150.field2398.field32 = 0;
                } else {
                    class150.field2398.field32 -= var4;
                    for (int var11 = 0; var11 < class150.field2398.field32; var11++) {
                        class150.field2398.field31[var11] = class150.field2398.field31[var4 + var11];
                        class150.field2398.field30[var11] = class150.field2398.field30[var11 + var4];
                    }
                }
            }
        }
        if (class178.field3052 != 0) {
            class45.field533++;
            long var12 = (class216.field3888 - class66.field921) / 50L;
            class66.field921 = class216.field3888;
            int var14 = class28.field350;
            byte var15 = 0;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var16 = class61.field812;
            int var17 = (int) var12;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            if (class178.field3052 == 2) {
                var15 = 1;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            class44.field520.method1173(217, 14592);
            class44.field520.method345(-1, var14 << 16 | var16);
            class44.field520.method365(arg0 ^ 0xFFFF8FE9, var17 | var15 << 15);
        }
        if (class256.field4492 > 0) {
            class256.field4492--;
        }
        if (class174.field2936[96] || class174.field2936[97] || class174.field2936[98] || class174.field2936[99]) {
            class156.field2521 = true;
        }
        if (class156.field2521 && class256.field4492 <= 0) {
            class156.field2521 = false;
            class116.field1679++;
            class256.field4492 = 20;
            class44.field520.method1173(22, 14592);
            class44.field520.method365(arg0 - 28889, class194.field3417);
            class44.field520.method352(false, class18.field216);
        }
        if (class135.field1967 && !class13.field148) {
            class13.field148 = true;
            class246.field4373++;
            class44.field520.method1173(236, arg0 ^ 0x3961);
            class44.field520.method329((byte) 113, 1);
        }
        if (!class135.field1967 && class13.field148) {
            class246.field4373++;
            class13.field148 = false;
            class44.field520.method1173(236, 14592);
            class44.field520.method329((byte) 1, 0);
        }
        if (!class164.field2652) {
            class142.field2173++;
            class44.field520.method1173(235, arg0 ^ 0x3961);
            class44.field520.method337(true, class214.method1476(-954688305));
            class164.field2652 = true;
        }
        class136.method830((byte) 60);
        if (class56.field741 != 30) {
            return;
        }
        class65.method407((byte) -102);
        class80.method504(4095);
        class62.field855++;
        if (class62.field855 > 750) {
            class195.method1285(40);
            return;
        }
        class74.method469(true);
        class1.method5(112);
        class53.method278(arg0 ^ 0x79E);
        if (class12.field135 != null) {
            class158.method997(false);
        }
        for (int var18 = class218.method1490(arg0 - 97, true); var18 != -1; var18 = class218.method1490(arg0 ^ 0x61, false)) {
            class125.method771(arg0 ^ 0x7431, var18);
            class64.field885[class65.method409(31, class206.field3703++)] = var18;
        }
        for (class172 var19 = class83.method520(false); var19 != null; var19 = class83.method520(false)) {
            int var20 = var19.method1127(102);
            int var21 = var19.method1120(-2373);
            if (var20 == 1) {
                class33.field405[var21] = var19.field2901;
                class252.field4460[class65.method409(class135.field1961++, 31)] = var21;
            } else if (var20 == 2) {
                class253.field4482[var21] = var19.field2907;
                class16.field183[class65.method409(31, class158.field2552++)] = var21;
            }
        }
        class113.field1658++;
        if (class27.field342 != 0) {
            class96.field1409 += 20;
            if (class96.field1409 >= 400) {
                class27.field342 = 0;
            }
        }
        if (class201.field3568 != null) {
            class57.field768++;
            if (class57.field768 >= 15) {
                class214.method1472(88, class201.field3568);
                class201.field3568 = null;
            }
        }
        if (class76.field1101 != null) {
            class214.method1472(85, class76.field1101);
            if (class52.field646 > class154.field2503 + 5 || class154.field2503 - 5 > class52.field646 || class218.field3912 + 5 < class63.field869 || class63.field869 < class218.field3912 - 5) {
                class61.field838 = true;
            }
            client.field1462++;
            if (class227.field4052 == 0) {
                if (class61.field838 && client.field1462 >= 5) {
                    if (class80.field1159 == class76.field1101 && class43.field497 != class189.field3309) {
                        class159.field2565++;
                        byte var22 = 0;
                        class178 var23 = class76.field1101;
                        if (class127.field1797 == 1 && var23.field3121 == 206) {
                            var22 = 1;
                        }
                        if (var23.field3045[class189.field3309] <= 0) {
                            var22 = 0;
                        }
                        if (class192.method1270((byte) -20, client.method614(var23))) {
                            int var26 = class43.field497;
                            int var27 = class189.field3309;
                            var23.field3045[var27] = var23.field3045[var26];
                            var23.field2989[var27] = var23.field2989[var26];
                            var23.field3045[var26] = -1;
                            var23.field2989[var26] = 0;
                        } else if (var22 == 1) {
                            int var24 = class43.field497;
                            int var25 = class189.field3309;
                            while (var24 != var25) {
                                if (var25 < var24) {
                                    var23.method1156(var24, arg0 + 3438, var24 + -1);
                                    var24--;
                                } else if (var24 < var25) {
                                    var23.method1156(var24, 3535, var24 + 1);
                                    var24++;
                                }
                            }
                        } else {
                            var23.method1156(class43.field497, 3535, class189.field3309);
                        }
                        class44.field520.method1173(209, 14592);
                        class44.field520.method341(2165, var22);
                        class44.field520.method355((byte) -94, class76.field1101.field3117);
                        class44.field520.method310(class189.field3309, arg0 - 165);
                        class44.field520.method352(false, class43.field497);
                    }
                } else if ((class226.field4049 == 1 || class103.method632(class125.field1767 - 1, arg0 ^ 0xFFFFFFF9)) && class125.field1767 > 2) {
                    class111.method674(0);
                } else if (class125.field1767 > 0) {
                    class172.method1121(class125.field1767 - 1, 1);
                }
                class178.field3052 = 0;
                class76.field1101 = null;
                class57.field768 = 10;
            }
        }
        class14.field157 = 0;
        class238.field4226 = false;
        class178 var28 = class84.field1234;
        class214.field3833 = false;
        class246.field4388 = null;
        class84.field1234 = null;
        class178 var29 = class219.field3923;
        class219.field3923 = null;
        if (arg0 != 97) {
            return;
        }
        while (class215.method1477(127) && class14.field157 < 128) {
            class159.field2569[class14.field157] = class18.field219;
            class91.field1337[class14.field157] = class168.field2840;
            class14.field157++;
        }
        class12.field135 = null;
        if (class9.field103 != -1) {
            class220.method1504(0, 0, class61.field815, 0, false, class249.field4407, 0, class9.field103);
        }
        class92.field1341++;
        while (true) {
            class157 var30;
            class178 var31;
            class178 var32;
            do {
                var30 = (class157) class58.field792.method1665(arg0 + 2975);
                if (var30 == null) {
                    while (true) {
                        class157 var33;
                        class178 var34;
                        class178 var35;
                        do {
                            var33 = (class157) class27.field334.method1665(3072);
                            if (var33 == null) {
                                while (true) {
                                    class157 var36;
                                    class178 var37;
                                    class178 var38;
                                    do {
                                        var36 = (class157) class22.field277.method1665(3072);
                                        if (var36 == null) {
                                            if (class35.field417 && class12.field135 == null) {
                                                class35.field417 = false;
                                            }
                                            if (class118.field1698 != null) {
                                                class21.method113(true);
                                            }
                                            if (class183.field3220 != -1) {
                                                int var39 = class183.field3220;
                                                int var40 = class19.field227;
                                                boolean var41 = class194.method1277(class102.field1477.field2102[0], 0, true, 0, var39, 0, var40, class102.field1477.field2046[0], 0, 0, 54, 0);
                                                class183.field3220 = -1;
                                                if (var41) {
                                                    class27.field343 = class28.field350;
                                                    class27.field342 = 1;
                                                    class96.field1409 = 0;
                                                    class223.field4002 = class61.field812;
                                                }
                                            }
                                            class111.method669(-71);
                                            if (class84.field1234 != var28) {
                                                if (var28 != null) {
                                                    class214.method1472(84, var28);
                                                }
                                                if (class84.field1234 != null) {
                                                    class214.method1472(-77, class84.field1234);
                                                }
                                            }
                                            if (class219.field3923 != var29 && class256.field4498 == class148.field2347) {
                                                if (var29 != null) {
                                                    class214.method1472(arg0 ^ 0xFFFFFFF1, var29);
                                                }
                                                if (class219.field3923 != null) {
                                                    class214.method1472(55, class219.field3923);
                                                }
                                            }
                                            if (class219.field3923 == null) {
                                                if (class148.field2347 > 0) {
                                                    class148.field2347--;
                                                }
                                            } else if (class148.field2347 < class256.field4498) {
                                                class148.field2347++;
                                                if (class256.field4498 == class148.field2347) {
                                                    class214.method1472(arg0 ^ 0xFFFFFFD8, class219.field3923);
                                                }
                                            }
                                            if (class202.field3597 == 1) {
                                                class3.method13(-127);
                                            } else if (class202.field3597 == 2) {
                                                class47.method253(0);
                                            } else {
                                                class88.method551(2);
                                            }
                                            for (int var42 = 0; var42 < 5; var42++) {
                                                int var10002 = class194.field3415[var42]++;
                                            }
                                            int var43 = class45.method239(true);
                                            int var44 = class76.method477(arg0 ^ 0x6C2C);
                                            if (var43 > 4500 && var44 > 4500) {
                                                class151.field2440 = 250;
                                                class225.field4026++;
                                                class243.method1649(4000, arg0 + 9395);
                                                class44.field520.method1173(249, arg0 ^ 0x3961);
                                            }
                                            class132.field1878++;
                                            class76.field1094++;
                                            class177.field2987++;
                                            if (class177.field2987 > 500) {
                                                class177.field2987 = 0;
                                                int var45 = (int) (Math.random() * 8.0D);
                                                if ((var45 & 0x2) == 2) {
                                                    class48.field572 += class138.field2127;
                                                }
                                                if ((var45 & 0x4) == 4) {
                                                    class131.field1869 += class137.field2114;
                                                }
                                                if ((var45 & 0x1) == 1) {
                                                    class203.field3664 += class104.field1499;
                                                }
                                            }
                                            if (class131.field1869 < -40) {
                                                class137.field2114 = 1;
                                            }
                                            if (class131.field1869 > 40) {
                                                class137.field2114 = -1;
                                            }
                                            if (class132.field1878 > 500) {
                                                class132.field1878 = 0;
                                                int var46 = (int) (Math.random() * 8.0D);
                                                if ((var46 & 0x1) == 1) {
                                                    class249.field4408 += class49.field593;
                                                }
                                                if ((var46 & 0x2) == 2) {
                                                    class90.field1325 += class168.field2812;
                                                }
                                            }
                                            if (class249.field4408 < -60) {
                                                class49.field593 = 2;
                                            }
                                            if (class203.field3664 < -50) {
                                                class104.field1499 = 2;
                                            }
                                            if (class90.field1325 < -20) {
                                                class168.field2812 = 1;
                                            }
                                            if (class249.field4408 > 60) {
                                                class49.field593 = -2;
                                            }
                                            if (class203.field3664 > 50) {
                                                class104.field1499 = -2;
                                            }
                                            if (class90.field1325 > 10) {
                                                class168.field2812 = -1;
                                            }
                                            if (class48.field572 < -55) {
                                                class138.field2127 = 2;
                                            }
                                            if (class48.field572 > 55) {
                                                class138.field2127 = -2;
                                            }
                                            if (class76.field1094 > 50) {
                                                class44.field520.method1173(0, 14592);
                                                class90.field1317++;
                                            }
                                            class9.method34((byte) -105);
                                            try {
                                                if (class194.field3408 != null && class44.field520.field699 > 0) {
                                                    class194.field3408.method484(class44.field520.field693, class44.field520.field699, 0, 3);
                                                    class76.field1094 = 0;
                                                    class44.field520.field699 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var47) {
                                                class195.method1285(40);
                                                return;
                                            }
                                        }
                                        var37 = var36.field2526;
                                        if (var37.field3062 < 0) {
                                            break;
                                        }
                                        var38 = class201.method1356(var37.field2990, (byte) 104);
                                    } while (var38 == null || var38.field3087 == null || var38.field3087.length <= var37.field3062 || var38.field3087[var37.field3062] != var37);
                                    class88.method550(var36, -96);
                                }
                            }
                            var34 = var33.field2526;
                            if (var34.field3062 < 0) {
                                break;
                            }
                            var35 = class201.method1356(var34.field2990, (byte) -97);
                        } while (var35 == null || var35.field3087 == null || var35.field3087.length <= var34.field3062 || var35.field3087[var34.field3062] != var34);
                        class88.method550(var33, -128);
                    }
                }
                var31 = var30.field2526;
                if (var31.field3062 < 0) {
                    break;
                }
                var32 = class201.method1356(var31.field2990, (byte) 97);
            } while (var32 == null || var32.field3087 == null || var31.field3062 >= var32.field3087.length || var32.field3087[var31.field3062] != var31);
            class88.method550(var30, arg0 ^ 0xFFFFFFC4);
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IB)V")
    public final void method1212(int arg0, byte arg1) {
        if (arg1 != 27) {
            field3258 = null;
        }
        for (class186 var3 = (class186) this.field3246.method576((byte) -127); var3 != null; var3 = (class186) this.field3246.method570(0)) {
            if (var3.field3281) {
                var3.method1218(arg0, 128);
                var3.field3281 = false;
            }
        }
        field3224++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Z")
    public final boolean method1213(int arg0, byte arg1) {
        if (arg1 != -52) {
            this.method1199(114, 70);
        }
        class186 var3 = this.method1201(false, arg0);
        field3242++;
        return var3 == null ? false : var3.method1221(-2905, this, this.field3249);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public final void method1214(int arg0) {
        this.field3246.method577((byte) -118);
        field3237++;
        int var2 = 67 % ((24 - arg0) / 51);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lbk;Lbk;Lbk;IZ)V")
    public class185(class136 arg0, class136 arg1, class136 arg2, int arg3, boolean arg4) {
        this.field3255 = arg4;
        this.field3249 = arg2;
        this.field3226 = arg3;
        this.field3236 = arg0;
        this.field3246 = new class93(this.field3226);
        class56 var6 = new class56(arg1.method842(0, (byte) -118, 0));
        int var7 = var6.method318(true);
        this.field3227 = new boolean[var7];
        this.field3229 = new short[var7];
        this.field3254 = new boolean[var7];
        this.field3235 = new boolean[var7];
        this.field3247 = new boolean[var7];
        this.field3234 = new byte[var7];
        this.field3240 = new boolean[var7];
        this.field3248 = new byte[var7];
        this.field3225 = new byte[var7];
        this.field3228 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field3247[var8] = var6.method367(1) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field3247[var9]) {
                this.field3254[var9] = var6.method367(1) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field3247[var10]) {
                this.field3235[var10] = var6.method367(1) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field3247[var11]) {
                this.field3240[var11] = var6.method367(1) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field3247[var12]) {
                this.field3227[var12] = var6.method367(1) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field3247[var13]) {
                this.field3248[var13] = var6.method350(16);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field3247[var14]) {
                this.field3234[var14] = var6.method350(16);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field3247[var15]) {
                this.field3225[var15] = var6.method350(16);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field3247[var16]) {
                this.field3228[var16] = var6.method350(16);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field3247[var17]) {
                this.field3229[var17] = (short) var6.method318(true);
            }
        }
    }
}
