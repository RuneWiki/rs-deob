import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class269 {

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public int field4168 = 2;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public int field4176 = -1;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "Z")
    public boolean field4171 = false;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "Z")
    public boolean field4182 = false;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public int field4174 = -1;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "Z")
    public boolean field4180 = false;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Z")
    public boolean field4177 = false;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public int field4187 = 5;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public int field4190 = -1;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public int field4188 = -1;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public int field4189 = 99;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public int field4186 = -1;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Lsa;")
    public static class110 field4170 = new class110(512);

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "Lkb;")
    public static class34 field4191 = new class34(5000);

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public static volatile int field4194 = -1;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "Led;")
    public static class296 field4195 = null;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public int field4184;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "Lmj;")
    private static class230 field4193;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
    public int[] field4165;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "[I")
    public int[] field4183;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "[I")
    private int[] field4185;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "[Z")
    public boolean[] field4162;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "[[I")
    public int[][] field4173;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILfa;III)Lfa;", line = 6)
    public final class199 method1933(int arg0, int arg1, class199 arg2, int arg3, int arg4, int arg5) {
        field4172++;
        int var7 = this.field4165[arg5];
        int var8 = this.field4183[arg5];
        class312 var9 = class240.method1702((byte) -98, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method1104(true, true, true);
        }
        int var11 = arg0 & 0x3;
        class312 var12 = null;
        if ((this.field4177 || class68.field1094) && arg4 != -1 && arg4 < this.field4183.length) {
            int var13 = this.field4183[arg4];
            var12 = class240.method1702((byte) -98, var13 >> 16);
            arg4 = var13 & 0xFFFF;
        }
        class199 var14;
        if (var12 == null) {
            var14 = arg2.method1104(!var9.method2154(var10, -122), !var9.method2156(var10, arg3 ^ 0x74), !this.field4171);
        } else {
            var14 = arg2.method1104(!var9.method2154(var10, -84) & !var12.method2154(arg4, arg3 - 77), !var9.method2156(var10, arg3 ^ 0xFFFFFFA1) & !var12.method2156(arg4, arg3 + 24), !this.field4171);
        }
        if (class265.field4126 && this.field4171) {
            if (var11 == 1) {
                ((class171) var14).method1266();
            } else if (var11 == 2) {
                ((class171) var14).method1272();
            } else if (var11 == 3) {
                ((class171) var14).method1259();
            }
        } else if (var11 == 1) {
            var14.method1115();
        } else if (var11 == 2) {
            var14.method1112();
        } else if (var11 == 3) {
            var14.method1105();
        }
        var14.method1444(var9, var10, var12, arg4, arg1 - arg3, var7, this.field4171);
        if (class265.field4126 && this.field4171) {
            if (var11 == 1) {
                ((class171) var14).method1259();
            } else if (var11 == 2) {
                ((class171) var14).method1272();
            } else if (var11 == 3) {
                ((class171) var14).method1266();
            }
        } else if (var11 == 1) {
            var14.method1105();
        } else if (var11 == 2) {
            var14.method1112();
        } else if (var11 == 3) {
            var14.method1115();
        }
        return var14;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 102)
    public static void method1934(int arg0) {
        field4191 = null;
        field4170 = null;
        field4193 = null;
        int var1 = -105 / ((arg0 + 64) / 60);
        field4195 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljk;II)V", line = 117)
    public static final void method1935(class88 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1340;
        int var4 = (Integer) var3[0];
        class136 var5 = class125.method938(var4, arg2 ^ 0xFFFFC045);
        field4169++;
        if (var5 == null) {
            return;
        }
        class26.field434 = 0;
        int var6 = -1;
        int var7 = 0;
        int[] var8 = var5.field2158;
        int var9 = 0;
        byte var10 = -1;
        int[] var11 = var5.field2173;
        try {
            class275.field4274 = new String[var5.field2172];
            if (arg2 == 16285) {
                int var12 = 0;
                class292.field4453 = new int[var5.field2168];
                int var13 = 0;
                for (int var14 = 1; var14 < var3.length; var14++) {
                    if ((var3[var14] instanceof Integer)) {
                        int var16 = (Integer) var3[var14];
                        if (var16 == -2147483647) {
                            var16 = arg0.field1350;
                        }
                        if (var16 == -2147483646) {
                            var16 = arg0.field1347;
                        }
                        if (var16 == -2147483645) {
                            var16 = arg0.field1357 == null ? -1 : arg0.field1357.field4531;
                        }
                        if (var16 == -2147483644) {
                            var16 = arg0.field1342;
                        }
                        if (var16 == -2147483643) {
                            var16 = arg0.field1357 == null ? -1 : arg0.field1357.field4536;
                        }
                        if (var16 == -2147483642) {
                            var16 = arg0.field1346 == null ? -1 : arg0.field1346.field4531;
                        }
                        if (var16 == -2147483641) {
                            var16 = arg0.field1346 == null ? -1 : arg0.field1346.field4536;
                        }
                        if (var16 == -2147483640) {
                            var16 = arg0.field1351;
                        }
                        if (var16 == -2147483639) {
                            var16 = arg0.field1345;
                        }
                        class292.field4453[var12++] = var16;
                    } else if (var3[var14] instanceof String) {
                        String var15 = (String) var3[var14];
                        if (var15.equals("event_opbase")) {
                            var15 = arg0.field1353;
                        }
                        class275.field4274[var13++] = var15;
                    }
                }
                int var17 = 0;
                label4265: while (true) {
                    var17++;
                    if (arg1 < var17) {
                        throw new RuntimeException("slow");
                    }
                    var6++;
                    int var506 = var8[var6];
                    if (var506 < 100) {
                        if (var506 == 0) {
                            class258.field3995[var7++] = var11[var6];
                            continue;
                        }
                        if (var506 == 1) {
                            int var18 = var11[var6];
                            class258.field3995[var7++] = class278.field4304[var18];
                            continue;
                        }
                        if (var506 == 2) {
                            int var19 = var11[var6];
                            var7--;
                            class120.method917(class258.field3995[var7], 8, var19);
                            continue;
                        }
                        if (var506 == 3) {
                            class29.field473[var9++] = var5.field2162[var6];
                            continue;
                        }
                        if (var506 == 6) {
                            var6 += var11[var6];
                            continue;
                        }
                        if (var506 == 7) {
                            var7 -= 2;
                            if (class258.field3995[var7 + 1] != class258.field3995[var7]) {
                                var6 += var11[var6];
                            }
                            continue;
                        }
                        if (var506 == 8) {
                            var7 -= 2;
                            if (class258.field3995[var7 + 1] == class258.field3995[var7]) {
                                var6 += var11[var6];
                            }
                            continue;
                        }
                        if (var506 == 9) {
                            var7 -= 2;
                            if (class258.field3995[var7 + 1] > class258.field3995[var7]) {
                                var6 += var11[var6];
                            }
                            continue;
                        }
                        if (var506 == 10) {
                            var7 -= 2;
                            if (class258.field3995[var7 + 1] < class258.field3995[var7]) {
                                var6 += var11[var6];
                            }
                            continue;
                        }
                        if (var506 == 21) {
                            if (class26.field434 == 0) {
                                return;
                            }
                            class109 var20 = class318.field4943[--class26.field434];
                            class292.field4453 = var20.field1807;
                            var5 = var20.field1810;
                            var8 = var5.field2158;
                            class275.field4274 = var20.field1802;
                            var11 = var5.field2173;
                            var6 = var20.field1809;
                            continue;
                        }
                        if (var506 == 25) {
                            int var21 = var11[var6];
                            class258.field3995[var7++] = class54.method397((byte) 18, var21);
                            continue;
                        }
                        if (var506 == 27) {
                            int var22 = var11[var6];
                            var7--;
                            class75.method559(var22, class258.field3995[var7], arg2 ^ 0xFFFFC802);
                            continue;
                        }
                        if (var506 == 31) {
                            var7 -= 2;
                            if (class258.field3995[var7 + 1] >= class258.field3995[var7]) {
                                var6 += var11[var6];
                            }
                            continue;
                        }
                        if (var506 == 32) {
                            var7 -= 2;
                            if (class258.field3995[var7] >= class258.field3995[var7 + 1]) {
                                var6 += var11[var6];
                            }
                            continue;
                        }
                        if (var506 == 33) {
                            class258.field3995[var7++] = class292.field4453[var11[var6]];
                            continue;
                        }
                        int var10001;
                        if (var506 == 34) {
                            var10001 = var11[var6];
                            var7--;
                            class292.field4453[var10001] = class258.field3995[var7];
                            continue;
                        }
                        if (var506 == 35) {
                            class29.field473[var9++] = class275.field4274[var11[var6]];
                            continue;
                        }
                        if (var506 == 36) {
                            var10001 = var11[var6];
                            var9--;
                            class275.field4274[var10001] = class29.field473[var9];
                            continue;
                        }
                        if (var506 == 37) {
                            int var23 = var11[var6];
                            var9 -= var23;
                            String var24 = class63.method455(class29.field473, var9, var23, false);
                            class29.field473[var9++] = var24;
                            continue;
                        }
                        if (var506 == 38) {
                            var7--;
                            continue;
                        }
                        if (var506 == 39) {
                            var9--;
                            continue;
                        }
                        if (var506 == 40) {
                            int var25 = var11[var6];
                            class136 var26 = class125.method938(var25, -40);
                            int[] var27 = new int[var26.field2168];
                            String[] var28 = new String[var26.field2172];
                            for (int var29 = 0; var29 < var26.field2163; var29++) {
                                var27[var29] = class258.field3995[var7 + var29 - var26.field2163];
                            }
                            for (int var30 = 0; var30 < var26.field2159; var30++) {
                                var28[var30] = class29.field473[var9 + var30 - var26.field2159];
                            }
                            var9 -= var26.field2159;
                            var7 -= var26.field2163;
                            class109 var31 = new class109();
                            var31.field1809 = var6;
                            var31.field1802 = class275.field4274;
                            var31.field1807 = class292.field4453;
                            var31.field1810 = var5;
                            if (class318.field4943.length <= class26.field434) {
                                throw new RuntimeException();
                            }
                            class318.field4943[class26.field434++] = var31;
                            var5 = var26;
                            var6 = -1;
                            class292.field4453 = var27;
                            var11 = var26.field2173;
                            var8 = var26.field2158;
                            class275.field4274 = var28;
                            continue;
                        }
                        if (var506 == 42) {
                            class258.field3995[var7++] = class254.field3944[var11[var6]];
                            continue;
                        }
                        if (var506 == 43) {
                            int var32 = var11[var6];
                            var7--;
                            class254.field3944[var32] = class258.field3995[var7];
                            class74.method556(59, var32);
                            continue;
                        }
                        if (var506 == 44) {
                            int var33 = var11[var6] & 0xFFFF;
                            int var34 = var11[var6] >> 16;
                            var7--;
                            int var35 = class258.field3995[var7];
                            if (var35 >= 0 && var35 <= 5000) {
                                class203.field3226[var34] = var35;
                                byte var36 = -1;
                                if (var33 == 105) {
                                    var36 = 0;
                                }
                                int var37 = 0;
                                while (true) {
                                    if (var37 >= var35) {
                                        continue label4265;
                                    }
                                    class110.field1816[var34][var37] = var36;
                                    var37++;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var506 == 45) {
                            var7--;
                            int var38 = class258.field3995[var7];
                            int var39 = var11[var6];
                            if (var38 >= 0 && var38 < class203.field3226[var39]) {
                                class258.field3995[var7++] = class110.field1816[var39][var38];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var506 == 46) {
                            var7 -= 2;
                            int var40 = var11[var6];
                            int var41 = class258.field3995[var7];
                            if (var41 >= 0 && var41 < class203.field3226[var40]) {
                                class110.field1816[var40][var41] = class258.field3995[var7 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var506 == 47) {
                            String var42 = class51.field814[var11[var6]];
                            if (var42 == null) {
                                var42 = "null";
                            }
                            class29.field473[var9++] = var42;
                            continue;
                        }
                        if (var506 == 48) {
                            int var43 = var11[var6];
                            var9--;
                            class51.field814[var43] = class29.field473[var9];
                            class140.method1067(var43, arg2 - 16401);
                            continue;
                        }
                        if (var506 == 51) {
                            class110 var44 = var5.field2164[var11[var6]];
                            var7--;
                            class250 var45 = (class250) var44.method833(false, (long) class258.field3995[var7]);
                            if (var45 != null) {
                                var6 += var45.field3858;
                            }
                            continue;
                        }
                    }
                    boolean var46;
                    if (var11[var6] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    if (var506 < 300) {
                        if (var506 == 100) {
                            var7 -= 3;
                            int var47 = class258.field3995[var7];
                            int var48 = class258.field3995[var7 + 1];
                            int var49 = class258.field3995[var7 + 2];
                            if (var48 != 0) {
                                class292 var50 = class215.method1555((byte) -48, var47);
                                if (var50.field4553 == null) {
                                    var50.field4553 = new class292[var49 + 1];
                                }
                                if (var49 >= var50.field4553.length) {
                                    class292[] var51 = new class292[var49 + 1];
                                    for (int var52 = 0; var52 < var50.field4553.length; var52++) {
                                        var51[var52] = var50.field4553[var52];
                                    }
                                    var50.field4553 = var51;
                                }
                                if (var49 > 0 && var50.field4553[var49 - 1] == null) {
                                    throw new RuntimeException("Gap at:" + (var49 - 1));
                                }
                                class292 var53 = new class292();
                                var53.field4536 = var49;
                                var53.field4537 = true;
                                var53.field4490 = var48;
                                var53.field4587 = var53.field4531 = var50.field4531;
                                var50.field4553[var49] = var53;
                                if (var46) {
                                    class224.field3597 = var53;
                                } else {
                                    class90.field1468 = var53;
                                }
                                class143.method1091(var50, (byte) 97);
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var506 == 101) {
                            class292 var54 = var46 ? class224.field3597 : class90.field1468;
                            if (var54.field4536 == -1) {
                                if (var46) {
                                    throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                }
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            class292 var55 = class215.method1555((byte) -48, var54.field4531);
                            var55.field4553[var54.field4536] = null;
                            class143.method1091(var55, (byte) 49);
                            continue;
                        }
                        if (var506 == 102) {
                            var7--;
                            class292 var56 = class215.method1555((byte) -48, class258.field3995[var7]);
                            var56.field4553 = null;
                            class143.method1091(var56, (byte) 78);
                            continue;
                        }
                        if (var506 == 200) {
                            var7 -= 2;
                            int var57 = class258.field3995[var7 + 1];
                            int var58 = class258.field3995[var7];
                            class292 var59 = class41.method330(var58, var57, -1);
                            if (var59 != null && var57 != -1) {
                                class258.field3995[var7++] = 1;
                                if (var46) {
                                    class224.field3597 = var59;
                                } else {
                                    class90.field1468 = var59;
                                }
                                continue;
                            }
                            class258.field3995[var7++] = 0;
                            continue;
                        }
                        if (var506 == 201) {
                            var7--;
                            int var60 = class258.field3995[var7];
                            class292 var61 = class215.method1555((byte) -48, var60);
                            if (var61 == null) {
                                class258.field3995[var7++] = 0;
                            } else {
                                class258.field3995[var7++] = 1;
                                if (var46) {
                                    class224.field3597 = var61;
                                } else {
                                    class90.field1468 = var61;
                                }
                            }
                            continue;
                        }
                    } else if (var506 < 500) {
                        if (var506 == 403) {
                            var7 -= 2;
                            int var62 = class258.field3995[var7];
                            int var63 = class258.field3995[var7 + 1];
                            for (int var64 = 0; var64 < class84.field1251.length; var64++) {
                                if (class84.field1251[var64] == var62) {
                                    class19.field356.field489.method1745(var63, (byte) 71, var64);
                                    continue label4265;
                                }
                            }
                            int var65 = 0;
                            while (true) {
                                if (class264.field4091.length <= var65) {
                                    continue label4265;
                                }
                                if (class264.field4091[var65] == var62) {
                                    class19.field356.field489.method1745(var63, (byte) 71, var65);
                                    continue label4265;
                                }
                                var65++;
                            }
                        }
                        if (var506 == 404) {
                            var7 -= 2;
                            int var66 = class258.field3995[var7 + 1];
                            int var67 = class258.field3995[var7];
                            class19.field356.field489.method1750(var67, false, var66);
                            continue;
                        }
                        if (var506 == 410) {
                            var7--;
                            boolean var68 = class258.field3995[var7] != 0;
                            class19.field356.field489.method1744(var68, 4);
                            continue;
                        }
                    } else if (!(var506 < 1000 || var506 >= 1100) || !(var506 < 2000 || var506 >= 2100)) {
                        class292 var495;
                        if (var506 < 2000) {
                            var495 = var46 ? class224.field3597 : class90.field1468;
                        } else {
                            var506 -= 1000;
                            var7--;
                            var495 = class215.method1555((byte) -48, class258.field3995[var7]);
                        }
                        if (var506 == 1000) {
                            var7 -= 4;
                            var495.field4434 = class258.field3995[var7];
                            var495.field4547 = class258.field3995[var7 + 1];
                            int var496 = class258.field3995[var7 + 2];
                            int var497 = class258.field3995[var7 + 3];
                            if (var497 < 0) {
                                var497 = 0;
                            } else if (var497 > 5) {
                                var497 = 5;
                            }
                            var495.field4458 = (byte) var497;
                            if (var496 < 0) {
                                var496 = 0;
                            } else if (var496 > 5) {
                                var496 = 5;
                            }
                            var495.field4548 = (byte) var496;
                            class143.method1091(var495, (byte) 45);
                            class104.method800(var495, (byte) -113);
                            if (var495.field4536 == -1) {
                                class245.method1740(-21863, var495.field4531);
                            }
                            continue;
                        }
                        if (var506 == 1001) {
                            var7 -= 4;
                            var495.field4432 = class258.field3995[var7];
                            var495.field4512 = class258.field3995[var7 + 1];
                            var495.field4535 = 0;
                            var495.field4521 = 0;
                            int var498 = class258.field3995[var7 + 2];
                            int var499 = class258.field3995[var7 + 3];
                            if (var499 < 0) {
                                var499 = 0;
                            } else if (var499 > 4) {
                                var499 = 4;
                            }
                            if (var498 < 0) {
                                var498 = 0;
                            } else if (var498 > 4) {
                                var498 = 4;
                            }
                            var495.field4589 = (byte) var498;
                            var495.field4456 = (byte) var499;
                            class143.method1091(var495, (byte) 99);
                            class104.method800(var495, (byte) -124);
                            if (var495.field4490 == 0) {
                                class314.method2162(false, false, var495);
                            }
                            continue;
                        }
                        if (var506 == 1003) {
                            var7--;
                            boolean var500 = class258.field3995[var7] == 1;
                            if (var495.field4515 != var500) {
                                var495.field4515 = var500;
                                class143.method1091(var495, (byte) 108);
                            }
                            if (var495.field4536 == -1) {
                                class45.method362(7, var495.field4531);
                            }
                            continue;
                        }
                        if (var506 == 1004) {
                            var7 -= 2;
                            var495.field4498 = class258.field3995[var7];
                            var495.field4592 = class258.field3995[var7 + 1];
                            class143.method1091(var495, (byte) 71);
                            class104.method800(var495, (byte) -94);
                            if (var495.field4490 == 0) {
                                class314.method2162(false, false, var495);
                            }
                            continue;
                        }
                        if (var506 == 1005) {
                            var7--;
                            var495.field4460 = class258.field3995[var7] == 1;
                            continue;
                        }
                    } else if (!(var506 < 1100 || var506 >= 1200) || !(var506 < 2100 || var506 >= 2200)) {
                        class292 var69;
                        if (var506 < 2000) {
                            var69 = var46 ? class224.field3597 : class90.field1468;
                        } else {
                            var506 -= 1000;
                            var7--;
                            var69 = class215.method1555((byte) -48, class258.field3995[var7]);
                        }
                        if (var506 == 1100) {
                            var7 -= 2;
                            var69.field4505 = class258.field3995[var7];
                            if (var69.field4505 > (var69.field4533 - var69.field4608)) {
                                var69.field4505 = var69.field4533 - var69.field4608;
                            }
                            if (var69.field4505 < 0) {
                                var69.field4505 = 0;
                            }
                            var69.field4578 = class258.field3995[var7 + 1];
                            if (var69.field4578 > var69.field4465 - var69.field4499) {
                                var69.field4578 = var69.field4465 - var69.field4499;
                            }
                            if (var69.field4578 < 0) {
                                var69.field4578 = 0;
                            }
                            class143.method1091(var69, (byte) 125);
                            if (var69.field4536 == -1) {
                                class310.method2148(14, var69.field4531);
                            }
                            continue;
                        }
                        if (var506 == 1101) {
                            var7--;
                            var69.field4538 = class258.field3995[var7];
                            class143.method1091(var69, (byte) 50);
                            if (var69.field4536 == -1) {
                                class293.method2061(var69.field4531, (byte) 89);
                            }
                            continue;
                        }
                        if (var506 == 1102) {
                            var7--;
                            var69.field4561 = class258.field3995[var7] == 1;
                            class143.method1091(var69, (byte) 112);
                            continue;
                        }
                        if (var506 == 1103) {
                            var7--;
                            var69.field4442 = class258.field3995[var7];
                            class143.method1091(var69, (byte) 50);
                            continue;
                        }
                        if (var506 == 1104) {
                            var7--;
                            var69.field4476 = class258.field3995[var7];
                            class143.method1091(var69, (byte) 123);
                            continue;
                        }
                        if (var506 == 1105) {
                            var7--;
                            var69.field4599 = class258.field3995[var7];
                            class143.method1091(var69, (byte) 71);
                            continue;
                        }
                        if (var506 == 1106) {
                            var7--;
                            var69.field4495 = class258.field3995[var7];
                            class143.method1091(var69, (byte) 126);
                            continue;
                        }
                        if (var506 == 1107) {
                            var7--;
                            var69.field4473 = class258.field3995[var7] == 1;
                            class143.method1091(var69, (byte) 84);
                            continue;
                        }
                        if (var506 == 1108) {
                            var69.field4500 = 1;
                            var7--;
                            var69.field4513 = class258.field3995[var7];
                            class143.method1091(var69, (byte) 87);
                            if (var69.field4536 == -1) {
                                class17.method142(-67, var69.field4531);
                            }
                            continue;
                        }
                        if (var506 == 1109) {
                            var7 -= 6;
                            var69.field4581 = class258.field3995[var7];
                            var69.field4468 = class258.field3995[var7 + 1];
                            var69.field4509 = class258.field3995[var7 + 2];
                            var69.field4511 = class258.field3995[var7 + 3];
                            var69.field4600 = class258.field3995[var7 + 4];
                            var69.field4522 = class258.field3995[var7 + 5];
                            class143.method1091(var69, (byte) 116);
                            if (var69.field4536 == -1) {
                                class162.method1200(var69.field4531, (byte) -117);
                                class291.method2038(var69.field4531, 64);
                            }
                            continue;
                        }
                        if (var506 == 1110) {
                            var7--;
                            int var70 = class258.field3995[var7];
                            if (var69.field4471 != var70) {
                                var69.field4484 = 1;
                                var69.field4565 = 0;
                                var69.field4471 = var70;
                                var69.field4479 = 0;
                                class143.method1091(var69, (byte) 50);
                            }
                            if (var69.field4536 == -1) {
                                class9.method71(var69.field4531, (byte) 5);
                            }
                            continue;
                        }
                        if (var506 == 1111) {
                            var7--;
                            var69.field4576 = class258.field3995[var7] == 1;
                            class143.method1091(var69, (byte) 89);
                            continue;
                        }
                        if (var506 == 1112) {
                            var9--;
                            String var71 = class29.field473[var9];
                            if (!var71.equals(var69.field4564)) {
                                var69.field4564 = var71;
                                class143.method1091(var69, (byte) 65);
                            }
                            if (var69.field4536 == -1) {
                                class53.method389(50, var69.field4531);
                            }
                            continue;
                        }
                        if (var506 == 1113) {
                            var7--;
                            var69.field4582 = class258.field3995[var7];
                            class143.method1091(var69, (byte) 61);
                            continue;
                        }
                        if (var506 == 1114) {
                            var7 -= 3;
                            var69.field4573 = class258.field3995[var7];
                            var69.field4506 = class258.field3995[var7 + 1];
                            var69.field4448 = class258.field3995[var7 + 2];
                            class143.method1091(var69, (byte) 93);
                            continue;
                        }
                        if (var506 == 1115) {
                            var7--;
                            var69.field4566 = class258.field3995[var7] == 1;
                            class143.method1091(var69, (byte) 60);
                            continue;
                        }
                        if (var506 == 1116) {
                            var7--;
                            var69.field4440 = class258.field3995[var7];
                            class143.method1091(var69, (byte) 118);
                            continue;
                        }
                        if (var506 == 1117) {
                            var7--;
                            var69.field4539 = class258.field3995[var7];
                            class143.method1091(var69, (byte) 53);
                            continue;
                        }
                        if (var506 == 1118) {
                            var7--;
                            var69.field4554 = class258.field3995[var7] == 1;
                            class143.method1091(var69, (byte) 92);
                            continue;
                        }
                        if (var506 == 1119) {
                            var7--;
                            var69.field4436 = class258.field3995[var7] == 1;
                            class143.method1091(var69, (byte) 88);
                            continue;
                        }
                        if (var506 == 1120) {
                            var7 -= 2;
                            var69.field4533 = class258.field3995[var7];
                            var69.field4465 = class258.field3995[var7 + 1];
                            class143.method1091(var69, (byte) 93);
                            if (var69.field4490 == 0) {
                                class314.method2162(false, false, var69);
                            }
                            continue;
                        }
                        if (var506 == 1121) {
                            var7 -= 2;
                            var69.field4508 = (short) class258.field3995[var7];
                            var69.field4514 = (short) class258.field3995[var7 + 1];
                            class143.method1091(var69, (byte) 87);
                            continue;
                        }
                        if (var506 == 1122) {
                            var7--;
                            var69.field4563 = class258.field3995[var7] == 1;
                            class143.method1091(var69, (byte) 119);
                            continue;
                        }
                        if (var506 == 1123) {
                            var7--;
                            var69.field4522 = class258.field3995[var7];
                            class143.method1091(var69, (byte) 59);
                            if (var69.field4536 == -1) {
                                class162.method1200(var69.field4531, (byte) -123);
                            }
                            continue;
                        }
                    } else if (!(var506 < 1200 || var506 >= 1300) || !(var506 < 2200 || var506 >= 2300)) {
                        class292 var72;
                        if (var506 < 2000) {
                            var72 = var46 ? class224.field3597 : class90.field1468;
                        } else {
                            var506 -= 1000;
                            var7--;
                            var72 = class215.method1555((byte) -48, class258.field3995[var7]);
                        }
                        class143.method1091(var72, (byte) 68);
                        if (var506 == 1200 || var506 == 1205) {
                            var7 -= 2;
                            int var73 = class258.field3995[var7];
                            int var74 = class258.field3995[var7 + 1];
                            if (var72.field4536 == -1) {
                                class329.method2247(22, var72.field4531);
                                class162.method1200(var72.field4531, (byte) -124);
                                class291.method2038(var72.field4531, arg2 - 16221);
                            }
                            if (var73 == -1) {
                                var72.field4567 = -1;
                                var72.field4513 = -1;
                                var72.field4500 = 1;
                            } else {
                                var72.field4544 = var74;
                                var72.field4567 = var73;
                                class179 var75 = class208.method1521(arg2 ^ 0xFFFFC532, var73);
                                var72.field4581 = var75.field2822;
                                if (var506 == 1205) {
                                    var72.field4501 = false;
                                } else {
                                    var72.field4501 = true;
                                }
                                var72.field4522 = var75.field2849;
                                var72.field4468 = var75.field2841;
                                var72.field4511 = var75.field2845;
                                var72.field4509 = var75.field2807;
                                if (var72.field4521 > 0) {
                                    var72.field4522 = var72.field4522 * 32 / var72.field4521;
                                } else if (var72.field4432 > 0) {
                                    var72.field4522 = var72.field4522 * 32 / var72.field4432;
                                }
                                var72.field4600 = var75.field2795;
                            }
                            continue;
                        }
                        if (var506 == 1201) {
                            var72.field4500 = 2;
                            var7--;
                            var72.field4513 = class258.field3995[var7];
                            if (var72.field4536 == -1) {
                                class17.method142(arg2 ^ 0xFFFFC036, var72.field4531);
                            }
                            continue;
                        }
                        if (var506 == 1202) {
                            var72.field4500 = 3;
                            var72.field4513 = class19.field356.field489.method1742(18208);
                            if (var72.field4536 == -1) {
                                class17.method142(-58, var72.field4531);
                            }
                            continue;
                        }
                        if (var506 == 1203) {
                            var72.field4500 = 6;
                            var7--;
                            var72.field4513 = class258.field3995[var7];
                            if (var72.field4536 == -1) {
                                class17.method142(-85, var72.field4531);
                            }
                            continue;
                        }
                        if (var506 == 1204) {
                            var72.field4500 = 5;
                            var7--;
                            var72.field4513 = class258.field3995[var7];
                            if (var72.field4536 == -1) {
                                class17.method142(arg2 - 16325, var72.field4531);
                            }
                            continue;
                        }
                    } else if (var506 >= 1300 && var506 < 1400 || var506 >= 2300 && var506 < 2400) {
                        class292 var76;
                        if (var506 < 2000) {
                            var76 = var46 ? class224.field3597 : class90.field1468;
                        } else {
                            var7--;
                            var76 = class215.method1555((byte) -48, class258.field3995[var7]);
                            var506 -= 1000;
                        }
                        if (var506 == 1300) {
                            var7--;
                            int var77 = class258.field3995[var7] - 1;
                            if (var77 >= 0 && var77 <= 9) {
                                var9--;
                                var76.method2041(true, class29.field473[var9], var77);
                                continue;
                            }
                            var9--;
                            continue;
                        }
                        if (var506 == 1301) {
                            var7 -= 2;
                            int var78 = class258.field3995[var7];
                            int var79 = class258.field3995[var7 + 1];
                            var76.field4447 = class41.method330(var78, var79, -1);
                            continue;
                        }
                        if (var506 == 1302) {
                            var7--;
                            var76.field4571 = class258.field3995[var7] == 1;
                            continue;
                        }
                        if (var506 == 1303) {
                            var7--;
                            var76.field4569 = class258.field3995[var7];
                            continue;
                        }
                        if (var506 == 1304) {
                            var7--;
                            var76.field4446 = class258.field3995[var7];
                            continue;
                        }
                        if (var506 == 1305) {
                            var9--;
                            var76.field4435 = class29.field473[var9];
                            continue;
                        }
                        if (var506 == 1306) {
                            var9--;
                            var76.field4559 = class29.field473[var9];
                            continue;
                        }
                        if (var506 == 1307) {
                            var76.field4493 = null;
                            continue;
                        }
                        if (var506 == 1308) {
                            var7--;
                            var76.field4445 = class258.field3995[var7];
                            var7--;
                            var76.field4529 = class258.field3995[var7];
                            continue;
                        }
                        if (var506 == 1309) {
                            var7--;
                            int var80 = class258.field3995[var7];
                            var7--;
                            int var81 = class258.field3995[var7];
                            if (var81 >= 1 && var81 <= 10) {
                                var76.method2046(var80, var81 - 1, (byte) 99);
                            }
                            continue;
                        }
                    } else {
                        if (var506 >= 1400 && var506 < 1500 || var506 >= 2400 && var506 < 2500) {
                            class292 var82;
                            if (var506 >= 2000) {
                                var506 -= 1000;
                                var7--;
                                var82 = class215.method1555((byte) -48, class258.field3995[var7]);
                            } else {
                                var82 = var46 ? class224.field3597 : class90.field1468;
                            }
                            var9--;
                            String var83 = class29.field473[var9];
                            int[] var84 = null;
                            if (var83.length() > 0 && var83.charAt(var83.length() - 1) == 'Y') {
                                var7--;
                                int var85 = class258.field3995[var7];
                                if (var85 > 0) {
                                    var84 = new int[var85];
                                    while ((var85--) > 0) {
                                        var7--;
                                        var84[var85] = class258.field3995[var7];
                                    }
                                }
                                var83 = var83.substring(0, var83.length() - 1);
                            }
                            Object[] var86 = new Object[var83.length() + 1];
                            for (int var87 = var86.length - 1; var87 >= 1; var87--) {
                                if (var83.charAt(var87 - 1) == 's') {
                                    var9--;
                                    var86[var87] = class29.field473[var9];
                                } else {
                                    var7--;
                                    var86[var87] = Integer.valueOf(class258.field3995[var7]);
                                }
                            }
                            var7--;
                            int var88 = class258.field3995[var7];
                            if (var88 == -1) {
                                var86 = null;
                            } else {
                                var86[0] = Integer.valueOf(var88);
                            }
                            if (var506 == 1400) {
                                var82.field4451 = var86;
                            } else if (var506 == 1401) {
                                var82.field4557 = var86;
                            } else if (var506 == 1402) {
                                var82.field4492 = var86;
                            } else if (var506 == 1403) {
                                var82.field4507 = var86;
                            } else if (var506 == 1404) {
                                var82.field4598 = var86;
                            } else if (var506 == 1405) {
                                var82.field4469 = var86;
                            } else if (var506 == 1406) {
                                var82.field4474 = var86;
                            } else if (var506 == 1407) {
                                var82.field4438 = var86;
                                var82.field4560 = var84;
                            } else if (var506 == 1408) {
                                var82.field4530 = var86;
                            } else if (var506 == 1409) {
                                var82.field4452 = var86;
                            } else if (var506 == 1410) {
                                var82.field4519 = var86;
                            } else if (var506 == 1411) {
                                var82.field4503 = var86;
                            } else if (var506 == 1412) {
                                var82.field4603 = var86;
                            } else if (var506 == 1414) {
                                var82.field4510 = var84;
                                var82.field4455 = var86;
                            } else if (var506 == 1415) {
                                var82.field4549 = var86;
                                var82.field4596 = var84;
                            } else if (var506 == 1416) {
                                var82.field4579 = var86;
                            } else if (var506 == 1417) {
                                var82.field4494 = var86;
                            } else if (var506 == 1418) {
                                var82.field4481 = var86;
                            } else if (var506 == 1419) {
                                var82.field4609 = var86;
                            } else if (var506 == 1420) {
                                var82.field4606 = var86;
                            } else if (var506 == 1421) {
                                var82.field4540 = var86;
                            } else if (var506 == 1422) {
                                var82.field4542 = var86;
                            } else if (var506 == 1423) {
                                var82.field4574 = var86;
                            } else if (var506 == 1424) {
                                var82.field4595 = var86;
                            } else if (var506 == 1425) {
                                var82.field4584 = var86;
                            } else if (var506 == 1426) {
                                var82.field4585 = var86;
                            } else if (var506 == 1427) {
                                var82.field4562 = var86;
                            } else if (var506 == 1428) {
                                var82.field4497 = var86;
                                var82.field4504 = var84;
                            } else if (var506 == 1429) {
                                var82.field4586 = var86;
                                var82.field4437 = var84;
                            }
                            var82.field4464 = true;
                            continue;
                        }
                        if (var506 < 1600) {
                            class292 var89 = var46 ? class224.field3597 : class90.field1468;
                            if (var506 == 1500) {
                                class258.field3995[var7++] = var89.field4580;
                                continue;
                            }
                            if (var506 == 1501) {
                                class258.field3995[var7++] = var89.field4605;
                                continue;
                            }
                            if (var506 == 1502) {
                                class258.field3995[var7++] = var89.field4608;
                                continue;
                            }
                            if (var506 == 1503) {
                                class258.field3995[var7++] = var89.field4499;
                                continue;
                            }
                            if (var506 == 1504) {
                                class258.field3995[var7++] = var89.field4515 ? 1 : 0;
                                continue;
                            }
                            if (var506 == 1505) {
                                class258.field3995[var7++] = var89.field4587;
                                continue;
                            }
                        } else if (var506 < 1700) {
                            class292 var494 = var46 ? class224.field3597 : class90.field1468;
                            if (var506 == 1600) {
                                class258.field3995[var7++] = var494.field4505;
                                continue;
                            }
                            if (var506 == 1601) {
                                class258.field3995[var7++] = var494.field4578;
                                continue;
                            }
                            if (var506 == 1602) {
                                class29.field473[var9++] = var494.field4564;
                                continue;
                            }
                            if (var506 == 1603) {
                                class258.field3995[var7++] = var494.field4533;
                                continue;
                            }
                            if (var506 == 1604) {
                                class258.field3995[var7++] = var494.field4465;
                                continue;
                            }
                            if (var506 == 1605) {
                                class258.field3995[var7++] = var494.field4522;
                                continue;
                            }
                            if (var506 == 1606) {
                                class258.field3995[var7++] = var494.field4509;
                                continue;
                            }
                            if (var506 == 1607) {
                                class258.field3995[var7++] = var494.field4600;
                                continue;
                            }
                            if (var506 == 1608) {
                                class258.field3995[var7++] = var494.field4511;
                                continue;
                            }
                            if (var506 == 1609) {
                                class258.field3995[var7++] = var494.field4442;
                                continue;
                            }
                            if (var506 == 1610) {
                                class258.field3995[var7++] = var494.field4581;
                                continue;
                            }
                            if (var506 == 1611) {
                                class258.field3995[var7++] = var494.field4468;
                                continue;
                            }
                            if (var506 == 1612) {
                                class258.field3995[var7++] = var494.field4599;
                                continue;
                            }
                        } else if (var506 < 1800) {
                            class292 var90 = var46 ? class224.field3597 : class90.field1468;
                            if (var506 == 1700) {
                                class258.field3995[var7++] = var90.field4567;
                                continue;
                            }
                            if (var506 == 1701) {
                                if (var90.field4567 == -1) {
                                    class258.field3995[var7++] = 0;
                                } else {
                                    class258.field3995[var7++] = var90.field4544;
                                }
                                continue;
                            }
                            if (var506 == 1702) {
                                class258.field3995[var7++] = var90.field4536;
                                continue;
                            }
                        } else if (var506 < 1900) {
                            class292 var492 = var46 ? class224.field3597 : class90.field1468;
                            if (var506 == 1800) {
                                class258.field3995[var7++] = client.method1786(var492).method345(0);
                                continue;
                            }
                            if (var506 == 1801) {
                                var7--;
                                int var493 = class258.field3995[var7];
                                int var508 = var493 - 1;
                                if (var492.field4493 != null && var492.field4493.length > var508 && var492.field4493[var508] != null) {
                                    class29.field473[var9++] = var492.field4493[var508];
                                    continue;
                                }
                                class29.field473[var9++] = "";
                                continue;
                            }
                            if (var506 == 1802) {
                                if (var492.field4435 == null) {
                                    class29.field473[var9++] = "";
                                } else {
                                    class29.field473[var9++] = var492.field4435;
                                }
                                continue;
                            }
                        } else if (var506 < 2600) {
                            var7--;
                            class292 var91 = class215.method1555((byte) -48, class258.field3995[var7]);
                            if (var506 == 2500) {
                                class258.field3995[var7++] = var91.field4580;
                                continue;
                            }
                            if (var506 == 2501) {
                                class258.field3995[var7++] = var91.field4605;
                                continue;
                            }
                            if (var506 == 2502) {
                                class258.field3995[var7++] = var91.field4608;
                                continue;
                            }
                            if (var506 == 2503) {
                                class258.field3995[var7++] = var91.field4499;
                                continue;
                            }
                            if (var506 == 2504) {
                                class258.field3995[var7++] = var91.field4515 ? 1 : 0;
                                continue;
                            }
                            if (var506 == 2505) {
                                class258.field3995[var7++] = var91.field4587;
                                continue;
                            }
                        } else if (var506 < 2700) {
                            var7--;
                            class292 var491 = class215.method1555((byte) -48, class258.field3995[var7]);
                            if (var506 == 2600) {
                                class258.field3995[var7++] = var491.field4505;
                                continue;
                            }
                            if (var506 == 2601) {
                                class258.field3995[var7++] = var491.field4578;
                                continue;
                            }
                            if (var506 == 2602) {
                                class29.field473[var9++] = var491.field4564;
                                continue;
                            }
                            if (var506 == 2603) {
                                class258.field3995[var7++] = var491.field4533;
                                continue;
                            }
                            if (var506 == 2604) {
                                class258.field3995[var7++] = var491.field4465;
                                continue;
                            }
                            if (var506 == 2605) {
                                class258.field3995[var7++] = var491.field4522;
                                continue;
                            }
                            if (var506 == 2606) {
                                class258.field3995[var7++] = var491.field4509;
                                continue;
                            }
                            if (var506 == 2607) {
                                class258.field3995[var7++] = var491.field4600;
                                continue;
                            }
                            if (var506 == 2608) {
                                class258.field3995[var7++] = var491.field4511;
                                continue;
                            }
                            if (var506 == 2609) {
                                class258.field3995[var7++] = var491.field4442;
                                continue;
                            }
                            if (var506 == 2610) {
                                class258.field3995[var7++] = var491.field4581;
                                continue;
                            }
                            if (var506 == 2611) {
                                class258.field3995[var7++] = var491.field4468;
                                continue;
                            }
                            if (var506 == 2612) {
                                class258.field3995[var7++] = var491.field4599;
                                continue;
                            }
                        } else if (var506 < 2800) {
                            if (var506 == 2700) {
                                var7--;
                                class292 var92 = class215.method1555((byte) -48, class258.field3995[var7]);
                                class258.field3995[var7++] = var92.field4567;
                                continue;
                            }
                            if (var506 == 2701) {
                                var7--;
                                class292 var93 = class215.method1555((byte) -48, class258.field3995[var7]);
                                if (var93.field4567 == -1) {
                                    class258.field3995[var7++] = 0;
                                } else {
                                    class258.field3995[var7++] = var93.field4544;
                                }
                                continue;
                            }
                            if (var506 == 2702) {
                                var7--;
                                int var94 = class258.field3995[var7];
                                class224 var95 = (class224) class268.field4148.method833(false, (long) var94);
                                if (var95 == null) {
                                    class258.field3995[var7++] = 0;
                                } else {
                                    class258.field3995[var7++] = 1;
                                }
                                continue;
                            }
                            if (var506 == 2703) {
                                var7--;
                                class292 var96 = class215.method1555((byte) -48, class258.field3995[var7]);
                                if (var96.field4553 == null) {
                                    class258.field3995[var7++] = 0;
                                    continue;
                                }
                                int var97 = var96.field4553.length;
                                for (int var98 = 0; var98 < var96.field4553.length; var98++) {
                                    if (var96.field4553[var98] == null) {
                                        var97 = var98;
                                        break;
                                    }
                                }
                                class258.field3995[var7++] = var97;
                                continue;
                            }
                            if (var506 == 2704 || var506 == 2705) {
                                var7 -= 2;
                                int var99 = class258.field3995[var7 + 1];
                                int var100 = class258.field3995[var7];
                                class224 var101 = (class224) class268.field4148.method833(false, (long) var100);
                                if (var101 != null && var101.field3596 == var99) {
                                    class258.field3995[var7++] = 1;
                                } else {
                                    class258.field3995[var7++] = 0;
                                }
                                continue;
                            }
                        } else if (var506 < 2900) {
                            var7--;
                            class292 var489 = class215.method1555((byte) -48, class258.field3995[var7]);
                            if (var506 == 2800) {
                                class258.field3995[var7++] = client.method1786(var489).method345(0);
                                continue;
                            }
                            if (var506 == 2801) {
                                var7--;
                                int var490 = class258.field3995[var7];
                                int var507 = var490 - 1;
                                if (var489.field4493 != null && var507 < var489.field4493.length && var489.field4493[var507] != null) {
                                    class29.field473[var9++] = var489.field4493[var507];
                                    continue;
                                }
                                class29.field473[var9++] = "";
                                continue;
                            }
                            if (var506 == 2802) {
                                if (var489.field4435 == null) {
                                    class29.field473[var9++] = "";
                                } else {
                                    class29.field473[var9++] = var489.field4435;
                                }
                                continue;
                            }
                        } else if (var506 < 3200) {
                            if (var506 == 3100) {
                                var9--;
                                String var474 = class29.field473[var9];
                                class252.method1782(var474, 0, "", false);
                                continue;
                            }
                            if (var506 == 3101) {
                                var7 -= 2;
                                class284.method2013(-27735, class258.field3995[var7], class19.field356, class258.field3995[var7 + 1]);
                                continue;
                            }
                            if (var506 == 3103) {
                                class14.method124(arg2 ^ 0x3F73);
                                continue;
                            }
                            if (var506 == 3104) {
                                class2.field3++;
                                var9--;
                                String var475 = class29.field473[var9];
                                int var476 = 0;
                                if (class310.method2147(var475, (byte) -118)) {
                                    var476 = class294.method2067(var475, (byte) -3);
                                }
                                field4191.method246(false, 54);
                                field4191.method784(-32, var476);
                                continue;
                            }
                            if (var506 == 3105) {
                                class291.field4421++;
                                var9--;
                                String var477 = class29.field473[var9];
                                field4191.method246(false, 216);
                                field4191.method760(class36.method281(113, var477), true);
                                continue;
                            }
                            if (var506 == 3106) {
                                class43.field756++;
                                var9--;
                                String var478 = class29.field473[var9];
                                field4191.method246(false, 219);
                                field4191.method772((byte) -72, var478.length() + 1);
                                field4191.method754((byte) 89, var478);
                                continue;
                            }
                            if (var506 == 3107) {
                                var7--;
                                int var479 = class258.field3995[var7];
                                var9--;
                                String var480 = class29.field473[var9];
                                class261.method1852(var479, var480, 1);
                                continue;
                            }
                            if (var506 == 3108) {
                                var7 -= 3;
                                int var481 = class258.field3995[var7 + 1];
                                int var482 = class258.field3995[var7];
                                int var483 = class258.field3995[var7 + 2];
                                class292 var484 = class215.method1555((byte) -48, var483);
                                class196.method1430(-9336, var481, var484, var482);
                                continue;
                            }
                            if (var506 == 3109) {
                                var7 -= 2;
                                int var485 = class258.field3995[var7 + 1];
                                int var486 = class258.field3995[var7];
                                class292 var487 = var46 ? class224.field3597 : class90.field1468;
                                class196.method1430(-9336, var485, var487, var486);
                                continue;
                            }
                            if (var506 == 3110) {
                                class88.field1348++;
                                var7--;
                                int var488 = class258.field3995[var7];
                                field4191.method246(false, 41);
                                field4191.method728(var488, arg2 + 1234840459);
                                continue;
                            }
                        } else if (var506 < 3300) {
                            if (var506 == 3200) {
                                var7 -= 3;
                                class151.method1158(class258.field3995[var7], class258.field3995[var7 + 1], false, class258.field3995[var7 + 2]);
                                continue;
                            }
                            if (var506 == 3201) {
                                var7--;
                                class255.method1809(class258.field3995[var7], -12599);
                                continue;
                            }
                            if (var506 == 3202) {
                                var7 -= 2;
                                class59.method437(class258.field3995[var7 + 1], arg2 ^ 0x3F9C, class258.field3995[var7]);
                                continue;
                            }
                        } else if (var506 < 3400) {
                            if (var506 == 3300) {
                                class258.field3995[var7++] = class205.field3252;
                                continue;
                            }
                            if (var506 == 3301) {
                                var7 -= 2;
                                int var102 = class258.field3995[var7];
                                int var103 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = class140.method1068(var102, -1, var103);
                                continue;
                            }
                            if (var506 == 3302) {
                                var7 -= 2;
                                int var104 = class258.field3995[var7];
                                int var105 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = class279.method1993(var104, var105, false);
                                continue;
                            }
                            if (var506 == 3303) {
                                var7 -= 2;
                                int var106 = class258.field3995[var7];
                                int var107 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = class293.method2059(var107, (byte) 12, var106);
                                continue;
                            }
                            if (var506 == 3304) {
                                var7--;
                                int var108 = class258.field3995[var7];
                                class258.field3995[var7++] = class278.method1988(-106, var108).field2259;
                                continue;
                            }
                            if (var506 == 3305) {
                                var7--;
                                int var109 = class258.field3995[var7];
                                class258.field3995[var7++] = class31.field526[var109];
                                continue;
                            }
                            if (var506 == 3306) {
                                var7--;
                                int var110 = class258.field3995[var7];
                                class258.field3995[var7++] = class260.field4035[var110];
                                continue;
                            }
                            if (var506 == 3307) {
                                var7--;
                                int var111 = class258.field3995[var7];
                                class258.field3995[var7++] = class252.field3883[var111];
                                continue;
                            }
                            if (var506 == 3308) {
                                int var112 = class41.field734;
                                int var113 = (class19.field356.field1442 >> 7) + class177.field2780;
                                int var114 = (class19.field356.field1369 >> 7) + class91.field1485;
                                class258.field3995[var7++] = (var113 << 14) + (var112 << 28) + var114;
                                continue;
                            }
                            if (var506 == 3309) {
                                var7--;
                                int var115 = class258.field3995[var7];
                                class258.field3995[var7++] = class280.method2001(16383, var115 >> 14);
                                continue;
                            }
                            if (var506 == 3310) {
                                var7--;
                                int var116 = class258.field3995[var7];
                                class258.field3995[var7++] = var116 >> 28;
                                continue;
                            }
                            if (var506 == 3311) {
                                var7--;
                                int var117 = class258.field3995[var7];
                                class258.field3995[var7++] = class280.method2001(16383, var117);
                                continue;
                            }
                            if (var506 == 3312) {
                                class258.field3995[var7++] = class295.field4672 ? 1 : 0;
                                continue;
                            }
                            if (var506 == 3313) {
                                var7 -= 2;
                                int var118 = class258.field3995[var7] + 32768;
                                int var119 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = class140.method1068(var118, class29.method193(arg2, -16286), var119);
                                continue;
                            }
                            if (var506 == 3314) {
                                var7 -= 2;
                                int var120 = class258.field3995[var7] + 32768;
                                int var121 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = class279.method1993(var120, var121, false);
                                continue;
                            }
                            if (var506 == 3315) {
                                var7 -= 2;
                                int var122 = class258.field3995[var7] + 32768;
                                int var123 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = class293.method2059(var123, (byte) 12, var122);
                                continue;
                            }
                            if (var506 == 3316) {
                                if (class235.field3699 >= 2) {
                                    class258.field3995[var7++] = class235.field3699;
                                } else {
                                    class258.field3995[var7++] = 0;
                                }
                                continue;
                            }
                            if (var506 == 3317) {
                                class258.field3995[var7++] = class165.field2558;
                                continue;
                            }
                            if (var506 == 3318) {
                                class258.field3995[var7++] = class193.field3072;
                                continue;
                            }
                            if (var506 == 3321) {
                                class258.field3995[var7++] = class33.field553;
                                continue;
                            }
                            if (var506 == 3322) {
                                class258.field3995[var7++] = class9.field136;
                                continue;
                            }
                            if (var506 == 3323) {
                                if (class243.field3765 >= 5 && class243.field3765 <= 9) {
                                    class258.field3995[var7++] = 1;
                                    continue;
                                }
                                class258.field3995[var7++] = 0;
                                continue;
                            }
                            if (var506 == 3324) {
                                if (class243.field3765 >= 5 && class243.field3765 <= 9) {
                                    class258.field3995[var7++] = class243.field3765;
                                    continue;
                                }
                                class258.field3995[var7++] = 0;
                                continue;
                            }
                            if (var506 == 3325) {
                                class258.field3995[var7++] = class53.field828 ? 1 : 0;
                                continue;
                            }
                            if (var506 == 3326) {
                                class258.field3995[var7++] = class19.field356.field481;
                                continue;
                            }
                            if (var506 == 3327) {
                                class258.field3995[var7++] = class19.field356.field489.field3807 ? 1 : 0;
                                continue;
                            }
                            if (var506 == 3328) {
                                class258.field3995[var7++] = class17.field322 && !class100.field1645 ? 1 : 0;
                                continue;
                            }
                            if (var506 == 3329) {
                                class258.field3995[var7++] = class53.field833 ? 1 : 0;
                                continue;
                            }
                            if (var506 == 3330) {
                                var7--;
                                int var124 = class258.field3995[var7];
                                class258.field3995[var7++] = class70.method545((byte) 53, var124);
                                continue;
                            }
                            if (var506 == 3331) {
                                var7 -= 2;
                                int var125 = class258.field3995[var7];
                                int var126 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = class178.method1319(false, var125, var126, -44);
                                continue;
                            }
                            if (var506 == 3332) {
                                var7 -= 2;
                                int var127 = class258.field3995[var7 + 1];
                                int var128 = class258.field3995[var7];
                                class258.field3995[var7++] = class178.method1319(true, var128, var127, -27);
                                continue;
                            }
                            if (var506 == 3333) {
                                class258.field3995[var7++] = class168.field2602;
                                continue;
                            }
                            if (var506 == 3335) {
                                class258.field3995[var7++] = class195.field3111;
                                continue;
                            }
                            if (var506 == 3336) {
                                var7 -= 4;
                                int var129 = class258.field3995[var7];
                                int var130 = class258.field3995[var7 + 1];
                                int var131 = class258.field3995[var7 + 2];
                                int var132 = (var130 << 14) + var129;
                                int var133 = (var131 << 28) + var132;
                                int var134 = class258.field3995[var7 + 3];
                                int var135 = var133 + var134;
                                class258.field3995[var7++] = var135;
                                continue;
                            }
                            if (var506 == 3337) {
                                class258.field3995[var7++] = class132.field2118;
                                continue;
                            }
                        } else if (var506 < 3500) {
                            if (var506 == 3400) {
                                var7 -= 2;
                                int var457 = class258.field3995[var7];
                                int var458 = class258.field3995[var7 + 1];
                                class268 var459 = class84.method604(var457, (byte) -77);
                                if (var459.field4143 == 's') {
                                }
                                class29.field473[var9++] = var459.method1923(var458, 4);
                                continue;
                            }
                            if (var506 == 3408) {
                                var7 -= 4;
                                int var460 = class258.field3995[var7 + 1];
                                int var461 = class258.field3995[var7 + 2];
                                int var462 = class258.field3995[var7 + 3];
                                int var463 = class258.field3995[var7];
                                class268 var464 = class84.method604(var461, (byte) -98);
                                if (var464.field4155 == var463 && var464.field4143 == var460) {
                                    if (var460 == 115) {
                                        class29.field473[var9++] = var464.method1923(var462, 4);
                                    } else {
                                        class258.field3995[var7++] = var464.method1928(var462, (byte) -76);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var506 == 3409) {
                                var7 -= 3;
                                int var465 = class258.field3995[var7];
                                int var466 = class258.field3995[var7 + 1];
                                int var467 = class258.field3995[var7 + 2];
                                if (var466 == -1) {
                                    throw new RuntimeException("C3409-2");
                                }
                                class268 var468 = class84.method604(var466, (byte) -79);
                                if (var468.field4143 != var465) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class258.field3995[var7++] = var468.method1927(-4, var467) ? 1 : 0;
                                continue;
                            }
                            if (var506 == 3410) {
                                var7--;
                                int var469 = class258.field3995[var7];
                                var9--;
                                String var470 = class29.field473[var9];
                                if (var469 == -1) {
                                    throw new RuntimeException("C3410-2");
                                }
                                class268 var471 = class84.method604(var469, (byte) 69);
                                if (var471.field4143 != 's') {
                                    throw new RuntimeException("C3410-1");
                                }
                                class258.field3995[var7++] = var471.method1932(class29.method193(arg2, 11285), var470) ? 1 : 0;
                                continue;
                            }
                            if (var506 == 3411) {
                                var7--;
                                int var472 = class258.field3995[var7];
                                class268 var473 = class84.method604(var472, (byte) -67);
                                class258.field3995[var7++] = var473.field4158.method844(5);
                                continue;
                            }
                        } else if (var506 < 3700) {
                            if (var506 == 3600) {
                                if (class85.field1274 == 0) {
                                    class258.field3995[var7++] = -2;
                                } else if (class85.field1274 == 1) {
                                    class258.field3995[var7++] = -1;
                                } else {
                                    class258.field3995[var7++] = class319.field4971;
                                }
                                continue;
                            }
                            if (var506 == 3601) {
                                var7--;
                                int var136 = class258.field3995[var7];
                                if (class85.field1274 == 2 && class319.field4971 > var136) {
                                    class29.field473[var9++] = class329.field5082[var136];
                                    continue;
                                }
                                class29.field473[var9++] = "";
                                continue;
                            }
                            if (var506 == 3602) {
                                var7--;
                                int var137 = class258.field3995[var7];
                                if (class85.field1274 == 2 && class319.field4971 > var137) {
                                    class258.field3995[var7++] = class204.field3246[var137];
                                    continue;
                                }
                                class258.field3995[var7++] = 0;
                                continue;
                            }
                            if (var506 == 3603) {
                                var7--;
                                int var138 = class258.field3995[var7];
                                if (class85.field1274 == 2 && var138 < class319.field4971) {
                                    class258.field3995[var7++] = class274.field4265[var138];
                                    continue;
                                }
                                class258.field3995[var7++] = 0;
                                continue;
                            }
                            if (var506 == 3604) {
                                var7--;
                                int var139 = class258.field3995[var7];
                                var9--;
                                String var140 = class29.field473[var9];
                                class96.method695(var140, var139, -22594);
                                continue;
                            }
                            if (var506 == 3605) {
                                var9--;
                                String var141 = class29.field473[var9];
                                class52.method386(136, class36.method281(83, var141));
                                continue;
                            }
                            if (var506 == 3606) {
                                var9--;
                                String var142 = class29.field473[var9];
                                class281.method2003(class36.method281(arg2 ^ 0x3FC5, var142), 1);
                                continue;
                            }
                            if (var506 == 3607) {
                                var9--;
                                String var143 = class29.field473[var9];
                                class314.method2157(0, class36.method281(arg2 ^ 0x3FB7, var143));
                                continue;
                            }
                            if (var506 == 3608) {
                                var9--;
                                String var144 = class29.field473[var9];
                                class25.method169((byte) 25, class36.method281(102, var144));
                                continue;
                            }
                            if (var506 == 3609) {
                                var9--;
                                String var145 = class29.field473[var9];
                                if (var145.startsWith("<img=0>") || var145.startsWith("<img=1>")) {
                                    var145 = var145.substring(7);
                                }
                                class258.field3995[var7++] = class94.method674(var145, 0) ? 1 : 0;
                                continue;
                            }
                            if (var506 == 3610) {
                                var7--;
                                int var146 = class258.field3995[var7];
                                if (class85.field1274 == 2 && var146 < class319.field4971) {
                                    class29.field473[var9++] = class70.field1102[var146];
                                    continue;
                                }
                                class29.field473[var9++] = "";
                                continue;
                            }
                            if (var506 == 3611) {
                                if (class138.field2189 == null) {
                                    class29.field473[var9++] = "";
                                } else {
                                    class29.field473[var9++] = class235.method1684(class138.field2189, (byte) 97);
                                }
                                continue;
                            }
                            if (var506 == 3612) {
                                if (class138.field2189 == null) {
                                    class258.field3995[var7++] = 0;
                                } else {
                                    class258.field3995[var7++] = class12.field237;
                                }
                                continue;
                            }
                            if (var506 == 3613) {
                                var7--;
                                int var147 = class258.field3995[var7];
                                if (class138.field2189 != null && var147 < class12.field237) {
                                    class29.field473[var9++] = class235.method1684(class245.field3789[var147].field1138, (byte) 37);
                                    continue;
                                }
                                class29.field473[var9++] = "";
                                continue;
                            }
                            if (var506 == 3614) {
                                var7--;
                                int var148 = class258.field3995[var7];
                                if (class138.field2189 != null && var148 < class12.field237) {
                                    class258.field3995[var7++] = class245.field3789[var148].field1142;
                                    continue;
                                }
                                class258.field3995[var7++] = 0;
                                continue;
                            }
                            if (var506 == 3615) {
                                var7--;
                                int var149 = class258.field3995[var7];
                                if (class138.field2189 != null && class12.field237 > var149) {
                                    class258.field3995[var7++] = class245.field3789[var149].field1145;
                                    continue;
                                }
                                class258.field3995[var7++] = 0;
                                continue;
                            }
                            if (var506 == 3616) {
                                class258.field3995[var7++] = class245.field3784;
                                continue;
                            }
                            if (var506 == 3617) {
                                var9--;
                                String var150 = class29.field473[var9];
                                class231.method1670(var150, -18641);
                                continue;
                            }
                            if (var506 == 3618) {
                                class258.field3995[var7++] = class239.field3726;
                                continue;
                            }
                            if (var506 == 3619) {
                                var9--;
                                String var151 = class29.field473[var9];
                                class26.method172(false, class36.method281(46, var151));
                                continue;
                            }
                            if (var506 == 3620) {
                                class67.method512((byte) 74);
                                continue;
                            }
                            if (var506 == 3621) {
                                if (class85.field1274 == 0) {
                                    class258.field3995[var7++] = -1;
                                } else {
                                    class258.field3995[var7++] = class169.field2631;
                                }
                                continue;
                            }
                            if (var506 == 3622) {
                                var7--;
                                int var152 = class258.field3995[var7];
                                if (class85.field1274 != 0 && var152 < class169.field2631) {
                                    class29.field473[var9++] = class259.method1835((byte) 126, class298.field4712[var152]);
                                    continue;
                                }
                                class29.field473[var9++] = "";
                                continue;
                            }
                            if (var506 == 3623) {
                                var9--;
                                String var153 = class29.field473[var9];
                                if (var153.startsWith("<img=0>") || var153.startsWith("<img=1>")) {
                                    var153 = var153.substring(7);
                                }
                                class258.field3995[var7++] = class259.method1833(true, var153) ? 1 : 0;
                                continue;
                            }
                            if (var506 == 3624) {
                                var7--;
                                int var154 = class258.field3995[var7];
                                if (class245.field3789 != null && var154 < class12.field237 && class245.field3789[var154].field1138.equalsIgnoreCase(class19.field356.field494)) {
                                    class258.field3995[var7++] = 1;
                                    continue;
                                }
                                class258.field3995[var7++] = 0;
                                continue;
                            }
                            if (var506 == 3625) {
                                if (class18.field355 == null) {
                                    class29.field473[var9++] = "";
                                } else {
                                    class29.field473[var9++] = class235.method1684(class18.field355, (byte) 35);
                                }
                                continue;
                            }
                            if (var506 == 3626) {
                                var7--;
                                int var155 = class258.field3995[var7];
                                if (class138.field2189 != null && var155 < class12.field237) {
                                    class29.field473[var9++] = class245.field3789[var155].field1141;
                                    continue;
                                }
                                class29.field473[var9++] = "";
                                continue;
                            }
                            if (var506 == 3627) {
                                var7--;
                                int var156 = class258.field3995[var7];
                                if (class85.field1274 == 2 && var156 >= 0 && class319.field4971 > var156) {
                                    class258.field3995[var7++] = class28.field461[var156] ? 1 : 0;
                                    continue;
                                }
                                class258.field3995[var7++] = 0;
                                continue;
                            }
                            if (var506 == 3628) {
                                var9--;
                                String var157 = class29.field473[var9];
                                if (var157.startsWith("<img=0>") || var157.startsWith("<img=1>")) {
                                    var157 = var157.substring(7);
                                }
                                class258.field3995[var7++] = class270.method1947((byte) 107, var157);
                                continue;
                            }
                            if (var506 == 3629) {
                                class258.field3995[var7++] = class124.field1980;
                                continue;
                            }
                        } else if (var506 < 4000) {
                            if (var506 == 3903) {
                                var7--;
                                int var443 = class258.field3995[var7];
                                class258.field3995[var7++] = class207.field3273[var443].method664((byte) -116);
                                continue;
                            }
                            if (var506 == 3904) {
                                var7--;
                                int var444 = class258.field3995[var7];
                                class258.field3995[var7++] = class207.field3273[var444].field1508;
                                continue;
                            }
                            if (var506 == 3905) {
                                var7--;
                                int var445 = class258.field3995[var7];
                                class258.field3995[var7++] = class207.field3273[var445].field1515;
                                continue;
                            }
                            if (var506 == 3906) {
                                var7--;
                                int var446 = class258.field3995[var7];
                                class258.field3995[var7++] = class207.field3273[var446].field1511;
                                continue;
                            }
                            if (var506 == 3907) {
                                var7--;
                                int var447 = class258.field3995[var7];
                                class258.field3995[var7++] = class207.field3273[var447].field1510;
                                continue;
                            }
                            if (var506 == 3908) {
                                var7--;
                                int var448 = class258.field3995[var7];
                                class258.field3995[var7++] = class207.field3273[var448].field1517;
                                continue;
                            }
                            if (var506 == 3910) {
                                var7--;
                                int var449 = class258.field3995[var7];
                                int var450 = class207.field3273[var449].method661((byte) -48);
                                class258.field3995[var7++] = var450 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var506 == 3911) {
                                var7--;
                                int var451 = class258.field3995[var7];
                                int var452 = class207.field3273[var451].method661((byte) -47);
                                class258.field3995[var7++] = var452 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var506 == 3912) {
                                var7--;
                                int var453 = class258.field3995[var7];
                                int var454 = class207.field3273[var453].method661((byte) -92);
                                class258.field3995[var7++] = var454 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var506 == 3913) {
                                var7--;
                                int var455 = class258.field3995[var7];
                                int var456 = class207.field3273[var455].method661((byte) -47);
                                class258.field3995[var7++] = var456 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var506 < 4100) {
                            if (var506 == 4000) {
                                var7 -= 2;
                                int var398 = class258.field3995[var7 + 1];
                                int var399 = class258.field3995[var7];
                                class258.field3995[var7++] = var398 + var399;
                                continue;
                            }
                            if (var506 == 4001) {
                                var7 -= 2;
                                int var400 = class258.field3995[var7];
                                int var401 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = var400 - var401;
                                continue;
                            }
                            if (var506 == 4002) {
                                var7 -= 2;
                                int var402 = class258.field3995[var7];
                                int var403 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = var402 * var403;
                                continue;
                            }
                            if (var506 == 4003) {
                                var7 -= 2;
                                int var404 = class258.field3995[var7 + 1];
                                int var405 = class258.field3995[var7];
                                class258.field3995[var7++] = var405 / var404;
                                continue;
                            }
                            if (var506 == 4004) {
                                var7--;
                                int var406 = class258.field3995[var7];
                                class258.field3995[var7++] = (int) ((double) var406 * Math.random());
                                continue;
                            }
                            if (var506 == 4005) {
                                var7--;
                                int var407 = class258.field3995[var7];
                                class258.field3995[var7++] = (int) ((double) (var407 + 1) * Math.random());
                                continue;
                            }
                            if (var506 == 4006) {
                                var7 -= 5;
                                int var408 = class258.field3995[var7 + 1];
                                int var409 = class258.field3995[var7];
                                int var410 = class258.field3995[var7 + 2];
                                int var411 = class258.field3995[var7 + 3];
                                int var412 = class258.field3995[var7 + 4];
                                class258.field3995[var7++] = var409 + ((var408 - var409) * (var412 - var410) / (var411 - var410));
                                continue;
                            }
                            if (var506 == 4007) {
                                var7 -= 2;
                                long var413 = (long) class258.field3995[var7];
                                long var415 = (long) class258.field3995[var7 + 1];
                                class258.field3995[var7++] = (int) (var413 * var415 / 100L + var413);
                                continue;
                            }
                            if (var506 == 4008) {
                                var7 -= 2;
                                int var417 = class258.field3995[var7];
                                int var418 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = class94.method673(var417, 0x1 << var418);
                                continue;
                            }
                            if (var506 == 4009) {
                                var7 -= 2;
                                int var419 = class258.field3995[var7];
                                int var420 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = class280.method2001(var419, -(0x1 << var420) - 1);
                                continue;
                            }
                            if (var506 == 4010) {
                                var7 -= 2;
                                int var421 = class258.field3995[var7 + 1];
                                int var422 = class258.field3995[var7];
                                class258.field3995[var7++] = class280.method2001(0x1 << var421, var422) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var506 == 4011) {
                                var7 -= 2;
                                int var423 = class258.field3995[var7];
                                int var424 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = var423 % var424;
                                continue;
                            }
                            if (var506 == 4012) {
                                var7 -= 2;
                                int var425 = class258.field3995[var7];
                                int var426 = class258.field3995[var7 + 1];
                                if (var425 == 0) {
                                    class258.field3995[var7++] = 0;
                                } else {
                                    class258.field3995[var7++] = (int) Math.pow((double) var425, (double) var426);
                                }
                                continue;
                            }
                            if (var506 == 4013) {
                                var7 -= 2;
                                int var427 = class258.field3995[var7];
                                int var428 = class258.field3995[var7 + 1];
                                if (var427 == 0) {
                                    class258.field3995[var7++] = 0;
                                } else if (var428 == 0) {
                                    class258.field3995[var7++] = Integer.MAX_VALUE;
                                } else {
                                    class258.field3995[var7++] = (int) Math.pow((double) var427, 1.0D / (double) var428);
                                }
                                continue;
                            }
                            if (var506 == 4014) {
                                var7 -= 2;
                                int var429 = class258.field3995[var7];
                                int var430 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = class280.method2001(var430, var429);
                                continue;
                            }
                            if (var506 == 4015) {
                                var7 -= 2;
                                int var431 = class258.field3995[var7];
                                int var432 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = class94.method673(var432, var431);
                                continue;
                            }
                            if (var506 == 4016) {
                                var7 -= 2;
                                int var433 = class258.field3995[var7];
                                int var434 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = var434 <= var433 ? var434 : var433;
                                continue;
                            }
                            if (var506 == 4017) {
                                var7 -= 2;
                                int var435 = class258.field3995[var7 + 1];
                                int var436 = class258.field3995[var7];
                                class258.field3995[var7++] = var435 >= var436 ? var435 : var436;
                                continue;
                            }
                            if (var506 == 4018) {
                                var7 -= 3;
                                long var437 = (long) class258.field3995[var7];
                                long var439 = (long) class258.field3995[var7 + 1];
                                long var441 = (long) class258.field3995[var7 + 2];
                                class258.field3995[var7++] = (int) (var437 * var441 / var439);
                                continue;
                            }
                        } else if (var506 < 4200) {
                            if (var506 == 4100) {
                                var7--;
                                int var158 = class258.field3995[var7];
                                var9--;
                                String var159 = class29.field473[var9];
                                class29.field473[var9++] = var159 + var158;
                                continue;
                            }
                            if (var506 == 4101) {
                                var9 -= 2;
                                String var160 = class29.field473[var9];
                                String var161 = class29.field473[var9 + 1];
                                class29.field473[var9++] = var160 + var161;
                                continue;
                            }
                            if (var506 == 4102) {
                                var9--;
                                String var162 = class29.field473[var9];
                                var7--;
                                int var163 = class258.field3995[var7];
                                class29.field473[var9++] = var162 + class298.method2085(var163, 0, true);
                                continue;
                            }
                            if (var506 == 4103) {
                                var9--;
                                String var164 = class29.field473[var9];
                                class29.field473[var9++] = var164.toLowerCase();
                                continue;
                            }
                            if (var506 == 4104) {
                                var7--;
                                int var165 = class258.field3995[var7];
                                long var166 = (long) var165 * 86400000L + 1014768000000L;
                                class254.field3941.setTime(new Date(var166));
                                int var168 = class254.field3941.get(5);
                                int var169 = class254.field3941.get(2);
                                int var170 = class254.field3941.get(1);
                                class29.field473[var9++] = var168 + "-" + class62.field965[var169] + "-" + var170;
                                continue;
                            }
                            if (var506 == 4105) {
                                var9 -= 2;
                                String var171 = class29.field473[var9 + 1];
                                String var172 = class29.field473[var9];
                                if (class19.field356.field489 != null && class19.field356.field489.field3807) {
                                    class29.field473[var9++] = var171;
                                    continue;
                                }
                                class29.field473[var9++] = var172;
                                continue;
                            }
                            if (var506 == 4106) {
                                var7--;
                                int var173 = class258.field3995[var7];
                                class29.field473[var9++] = Integer.toString(var173);
                                continue;
                            }
                            if (var506 == 4107) {
                                var9 -= 2;
                                class258.field3995[var7++] = class137.method1050(class254.method1802(class29.field473[var9 + 1], class29.field473[var9], class195.field3111, 19), (byte) -117);
                                continue;
                            }
                            if (var506 == 4108) {
                                var7 -= 2;
                                var9--;
                                String var174 = class29.field473[var9];
                                int var175 = class258.field3995[var7];
                                int var176 = class258.field3995[var7 + 1];
                                class258.field3995[var7++] = class26.method174(var176, true).method1015(var174, var175);
                                continue;
                            }
                            if (var506 == 4109) {
                                var7 -= 2;
                                int var177 = class258.field3995[var7];
                                int var178 = class258.field3995[var7 + 1];
                                var9--;
                                String var179 = class29.field473[var9];
                                class258.field3995[var7++] = class26.method174(var178, true).method1026(var179, var177);
                                continue;
                            }
                            if (var506 == 4110) {
                                var9 -= 2;
                                String var180 = class29.field473[var9];
                                String var181 = class29.field473[var9 + 1];
                                var7--;
                                if (class258.field3995[var7] == 1) {
                                    class29.field473[var9++] = var180;
                                } else {
                                    class29.field473[var9++] = var181;
                                }
                                continue;
                            }
                            if (var506 == 4111) {
                                var9--;
                                String var182 = class29.field473[var9];
                                class29.field473[var9++] = class135.method1028(var182);
                                continue;
                            }
                            if (var506 == 4112) {
                                var9--;
                                String var183 = class29.field473[var9];
                                var7--;
                                int var184 = class258.field3995[var7];
                                if (var184 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class29.field473[var9++] = var183 + (char) var184;
                                continue;
                            }
                            if (var506 == 4113) {
                                var7--;
                                int var185 = class258.field3995[var7];
                                class258.field3995[var7++] = class220.method1594((char) var185, 64) ? 1 : 0;
                                continue;
                            }
                            if (var506 == 4114) {
                                var7--;
                                int var186 = class258.field3995[var7];
                                class258.field3995[var7++] = class276.method1981(1, (char) var186) ? 1 : 0;
                                continue;
                            }
                            if (var506 == 4115) {
                                var7--;
                                int var187 = class258.field3995[var7];
                                class258.field3995[var7++] = class309.method2135((char) var187, (byte) -26) ? 1 : 0;
                                continue;
                            }
                            if (var506 == 4116) {
                                var7--;
                                int var188 = class258.field3995[var7];
                                class258.field3995[var7++] = class11.method107(true, (char) var188) ? 1 : 0;
                                continue;
                            }
                            if (var506 == 4117) {
                                var9--;
                                String var189 = class29.field473[var9];
                                if (var189 == null) {
                                    class258.field3995[var7++] = 0;
                                } else {
                                    class258.field3995[var7++] = var189.length();
                                }
                                continue;
                            }
                            if (var506 == 4118) {
                                var7 -= 2;
                                var9--;
                                String var190 = class29.field473[var9];
                                int var191 = class258.field3995[var7];
                                int var192 = class258.field3995[var7 + 1];
                                class29.field473[var9++] = var190.substring(var191, var192);
                                continue;
                            }
                            if (var506 == 4119) {
                                var9--;
                                String var193 = class29.field473[var9];
                                StringBuffer var194 = new StringBuffer(var193.length());
                                boolean var195 = false;
                                for (int var196 = 0; var193.length() > var196; var196++) {
                                    char var197 = var193.charAt(var196);
                                    if (var197 == '<') {
                                        var195 = true;
                                    } else if (var197 == '>') {
                                        var195 = false;
                                    } else if (!var195) {
                                        var194.append(var197);
                                    }
                                }
                                class29.field473[var9++] = var194.toString();
                                continue;
                            }
                            if (var506 == 4120) {
                                var7 -= 2;
                                int var198 = class258.field3995[var7];
                                int var199 = class258.field3995[var7 + 1];
                                var9--;
                                String var200 = class29.field473[var9];
                                class258.field3995[var7++] = var200.indexOf(var198, var199);
                                continue;
                            }
                            if (var506 == 4121) {
                                var9 -= 2;
                                String var201 = class29.field473[var9];
                                String var202 = class29.field473[var9 + 1];
                                var7--;
                                int var203 = class258.field3995[var7];
                                class258.field3995[var7++] = var201.indexOf(var202, var203);
                                continue;
                            }
                            if (var506 == 4122) {
                                var7--;
                                int var204 = class258.field3995[var7];
                                class258.field3995[var7++] = Character.toLowerCase((char) var204);
                                continue;
                            }
                            if (var506 == 4123) {
                                var7--;
                                int var205 = class258.field3995[var7];
                                class258.field3995[var7++] = Character.toUpperCase((char) var205);
                                continue;
                            }
                            if (var506 == 4124) {
                                var7--;
                                boolean var206 = class258.field3995[var7] != 0;
                                var7--;
                                int var207 = class258.field3995[var7];
                                class29.field473[var9++] = class27.method178(class195.field3111, (long) var207, var206, (byte) -104, 0);
                                continue;
                            }
                        } else if (var506 < 4300) {
                            if (var506 == 4200) {
                                var7--;
                                int var379 = class258.field3995[var7];
                                class29.field473[var9++] = class208.method1521(-1361, var379).field2825;
                                continue;
                            }
                            if (var506 == 4201) {
                                var7 -= 2;
                                int var380 = class258.field3995[var7];
                                int var381 = class258.field3995[var7 + 1];
                                class179 var382 = class208.method1521(-1361, var380);
                                if (var381 >= 1 && var381 <= 5 && var382.field2794[var381 - 1] != null) {
                                    class29.field473[var9++] = var382.field2794[var381 - 1];
                                    continue;
                                }
                                class29.field473[var9++] = "";
                                continue;
                            }
                            if (var506 == 4202) {
                                var7 -= 2;
                                int var383 = class258.field3995[var7];
                                int var384 = class258.field3995[var7 + 1];
                                class179 var385 = class208.method1521(-1361, var383);
                                if (var384 >= 1 && var384 <= 5 && var385.field2797[var384 - 1] != null) {
                                    class29.field473[var9++] = var385.field2797[var384 - 1];
                                    continue;
                                }
                                class29.field473[var9++] = "";
                                continue;
                            }
                            if (var506 == 4203) {
                                var7--;
                                int var386 = class258.field3995[var7];
                                class258.field3995[var7++] = class208.method1521(class29.method193(arg2, -15054), var386).field2818;
                                continue;
                            }
                            if (var506 == 4204) {
                                var7--;
                                int var387 = class258.field3995[var7];
                                class258.field3995[var7++] = class208.method1521(arg2 - 17646, var387).field2829 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var506 == 4205) {
                                var7--;
                                int var388 = class258.field3995[var7];
                                class179 var389 = class208.method1521(arg2 ^ 0xFFFFC532, var388);
                                if (var389.field2810 == -1 && var389.field2827 >= 0) {
                                    class258.field3995[var7++] = var389.field2827;
                                    continue;
                                }
                                class258.field3995[var7++] = var388;
                                continue;
                            }
                            if (var506 == 4206) {
                                var7--;
                                int var390 = class258.field3995[var7];
                                class179 var391 = class208.method1521(arg2 - 17646, var390);
                                if (var391.field2810 >= 0 && var391.field2827 >= 0) {
                                    class258.field3995[var7++] = var391.field2827;
                                    continue;
                                }
                                class258.field3995[var7++] = var390;
                                continue;
                            }
                            if (var506 == 4207) {
                                var7--;
                                int var392 = class258.field3995[var7];
                                class258.field3995[var7++] = class208.method1521(arg2 - 17646, var392).field2803 ? 1 : 0;
                                continue;
                            }
                            if (var506 == 4208) {
                                var7 -= 2;
                                int var393 = class258.field3995[var7 + 1];
                                int var394 = class258.field3995[var7];
                                class37 var395 = class185.method1392(var393, 11);
                                if (var395.method304(true)) {
                                    class29.field473[var9++] = class208.method1521(-1361, var394).method1337(var395.field677, (byte) -23, var393);
                                } else {
                                    class258.field3995[var7++] = class208.method1521(-1361, var394).method1336(var393, true, var395.field676);
                                }
                                continue;
                            }
                            if (var506 == 4210) {
                                var9--;
                                String var396 = class29.field473[var9];
                                var7--;
                                int var397 = class258.field3995[var7];
                                class121.method921(var396, var397 == 1, 2);
                                class258.field3995[var7++] = class297.field4681;
                                continue;
                            }
                            if (var506 == 4211) {
                                if (class114.field1871 != null && class297.field4681 > client.field3902) {
                                    class258.field3995[var7++] = class280.method2001(65535, class114.field1871[client.field3902++]);
                                    continue;
                                }
                                class258.field3995[var7++] = -1;
                                continue;
                            }
                            if (var506 == 4212) {
                                client.field3902 = 0;
                                continue;
                            }
                        } else if (var506 >= 4400) {
                            if (var506 >= 4500) {
                                if (var506 >= 4600) {
                                    if (var506 < 5100) {
                                        if (var506 == 5000) {
                                            class258.field3995[var7++] = class206.field3255;
                                            continue;
                                        }
                                        if (var506 == 5001) {
                                            var7 -= 3;
                                            class206.field3255 = class258.field3995[var7];
                                            class11.field217 = class258.field3995[var7 + 1];
                                            class35.field581++;
                                            class61.field951 = class258.field3995[var7 + 2];
                                            field4191.method246(false, 93);
                                            field4191.method772((byte) -91, class206.field3255);
                                            field4191.method772((byte) -125, class11.field217);
                                            field4191.method772((byte) -105, class61.field951);
                                            continue;
                                        }
                                        if (var506 == 5002) {
                                            class17.field330++;
                                            var7 -= 2;
                                            var9--;
                                            String var208 = class29.field473[var9];
                                            int var209 = class258.field3995[var7];
                                            int var210 = class258.field3995[var7 + 1];
                                            field4191.method246(false, 196);
                                            field4191.method760(class36.method281(121, var208), true);
                                            field4191.method772((byte) -68, var209 - 1);
                                            field4191.method772((byte) -115, var210);
                                            continue;
                                        }
                                        if (var506 == 5003) {
                                            var7--;
                                            int var211 = class258.field3995[var7];
                                            String var212 = null;
                                            if (var211 < 100) {
                                                var212 = class91.field1499[var211];
                                            }
                                            if (var212 == null) {
                                                var212 = "";
                                            }
                                            class29.field473[var9++] = var212;
                                            continue;
                                        }
                                        if (var506 == 5004) {
                                            var7--;
                                            int var213 = class258.field3995[var7];
                                            int var214 = -1;
                                            if (var213 < 100 && class91.field1499[var213] != null) {
                                                var214 = class243.field3756[var213];
                                            }
                                            class258.field3995[var7++] = var214;
                                            continue;
                                        }
                                        if (var506 == 5005) {
                                            class258.field3995[var7++] = class11.field217;
                                            continue;
                                        }
                                        if (var506 == 5008) {
                                            var9--;
                                            String var215 = class29.field473[var9];
                                            if (var215.startsWith("::")) {
                                                class318.method2180(var215, false);
                                                continue;
                                            }
                                            if (class235.field3699 == 0 && (class17.field322 && !class100.field1645 || class53.field833)) {
                                                continue;
                                            }
                                            class255.field3947++;
                                            byte var216 = 0;
                                            String var217 = var215.toLowerCase();
                                            byte var218 = 0;
                                            if (var217.startsWith(class285.field4386)) {
                                                var215 = var215.substring(class285.field4386.length());
                                                var218 = 0;
                                            } else if (var217.startsWith(class53.field839)) {
                                                var218 = 1;
                                                var215 = var215.substring(class53.field839.length());
                                            } else if (var217.startsWith(class87.field1331)) {
                                                var215 = var215.substring(class87.field1331.length());
                                                var218 = 2;
                                            } else if (var217.startsWith(class107.field1782)) {
                                                var218 = 3;
                                                var215 = var215.substring(class107.field1782.length());
                                            } else if (var217.startsWith(class87.field1333)) {
                                                var218 = 4;
                                                var215 = var215.substring(class87.field1333.length());
                                            } else if (var217.startsWith(class246.field3810)) {
                                                var218 = 5;
                                                var215 = var215.substring(class246.field3810.length());
                                            } else if (var217.startsWith(class236.field3711)) {
                                                var215 = var215.substring(class236.field3711.length());
                                                var218 = 6;
                                            } else if (var217.startsWith(class104.field1759)) {
                                                var218 = 7;
                                                var215 = var215.substring(class104.field1759.length());
                                            } else if (var217.startsWith(class71.field1114)) {
                                                var215 = var215.substring(class71.field1114.length());
                                                var218 = 8;
                                            } else if (var217.startsWith(class59.field925)) {
                                                var215 = var215.substring(class59.field925.length());
                                                var218 = 9;
                                            } else if (var217.startsWith(class190.field3039)) {
                                                var218 = 10;
                                                var215 = var215.substring(class190.field3039.length());
                                            } else if (var217.startsWith(class103.field1731)) {
                                                var215 = var215.substring(class103.field1731.length());
                                                var218 = 11;
                                            } else if (class195.field3111 != 0) {
                                                if (var217.startsWith(class281.field4336)) {
                                                    var215 = var215.substring(class281.field4336.length());
                                                    var218 = 0;
                                                } else if (var217.startsWith(class126.field2005)) {
                                                    var215 = var215.substring(class126.field2005.length());
                                                    var218 = 1;
                                                } else if (var217.startsWith(class85.field1287)) {
                                                    var218 = 2;
                                                    var215 = var215.substring(class85.field1287.length());
                                                } else if (var217.startsWith(class19.field357)) {
                                                    var218 = 3;
                                                    var215 = var215.substring(class19.field357.length());
                                                } else if (var217.startsWith(class245.field3787)) {
                                                    var215 = var215.substring(class245.field3787.length());
                                                    var218 = 4;
                                                } else if (var217.startsWith(class118.field1897)) {
                                                    var215 = var215.substring(class118.field1897.length());
                                                    var218 = 5;
                                                } else if (var217.startsWith(class254.field3945)) {
                                                    var215 = var215.substring(class254.field3945.length());
                                                    var218 = 6;
                                                } else if (var217.startsWith(class208.field3334)) {
                                                    var218 = 7;
                                                    var215 = var215.substring(class208.field3334.length());
                                                } else if (var217.startsWith(class252.field3888)) {
                                                    var218 = 8;
                                                    var215 = var215.substring(class252.field3888.length());
                                                } else if (var217.startsWith(class136.field2165)) {
                                                    var215 = var215.substring(class136.field2165.length());
                                                    var218 = 9;
                                                } else if (var217.startsWith(class244.field3771)) {
                                                    var218 = 10;
                                                    var215 = var215.substring(class244.field3771.length());
                                                } else if (var217.startsWith(class168.field2613)) {
                                                    var218 = 11;
                                                    var215 = var215.substring(class168.field2613.length());
                                                }
                                            }
                                            String var219 = var215.toLowerCase();
                                            if (var219.startsWith(class168.field2606)) {
                                                var216 = 1;
                                                var215 = var215.substring(class168.field2606.length());
                                            } else if (var219.startsWith(class191.field3060)) {
                                                var216 = 2;
                                                var215 = var215.substring(class191.field3060.length());
                                            } else if (var219.startsWith(class211.field3369)) {
                                                var216 = 3;
                                                var215 = var215.substring(class211.field3369.length());
                                            } else if (var219.startsWith(class157.field2498)) {
                                                var215 = var215.substring(class157.field2498.length());
                                                var216 = 4;
                                            } else if (var219.startsWith(class288.field4393)) {
                                                var215 = var215.substring(class288.field4393.length());
                                                var216 = 5;
                                            } else if (class195.field3111 != 0) {
                                                if (var219.startsWith(class279.field4320)) {
                                                    var216 = 1;
                                                    var215 = var215.substring(class279.field4320.length());
                                                } else if (var219.startsWith(class226.field3622)) {
                                                    var216 = 2;
                                                    var215 = var215.substring(class226.field3622.length());
                                                } else if (var219.startsWith(class298.field4716)) {
                                                    var216 = 3;
                                                    var215 = var215.substring(class298.field4716.length());
                                                } else if (var219.startsWith(class111.field1836)) {
                                                    var215 = var215.substring(class111.field1836.length());
                                                    var216 = 4;
                                                } else if (var219.startsWith(class179.field2831)) {
                                                    var215 = var215.substring(class179.field2831.length());
                                                    var216 = 5;
                                                }
                                            }
                                            field4191.method246(false, 125);
                                            field4191.method772((byte) -125, 0);
                                            int var220 = field4191.field1667;
                                            field4191.method772((byte) -77, var218);
                                            field4191.method772((byte) -106, var216);
                                            class121.method930((byte) -118, field4191, var215);
                                            field4191.method747(85, field4191.field1667 - var220);
                                            continue;
                                        }
                                        if (var506 == 5009) {
                                            var9 -= 2;
                                            String var221 = class29.field473[var9];
                                            String var222 = class29.field473[var9 + 1];
                                            if (class235.field3699 != 0 || (!class17.field322 || class100.field1645) && !class53.field833) {
                                                field4191.method246(false, 98);
                                                field4191.method772((byte) -66, 0);
                                                class247.field3824++;
                                                int var223 = field4191.field1667;
                                                field4191.method760(class36.method281(arg2 ^ 0x3FE2, var221), true);
                                                class121.method930((byte) -125, field4191, var222);
                                                field4191.method747(100, field4191.field1667 - var223);
                                            }
                                            continue;
                                        }
                                        if (var506 == 5010) {
                                            var7--;
                                            int var224 = class258.field3995[var7];
                                            String var225 = null;
                                            if (var224 < 100) {
                                                var225 = class63.field977[var224];
                                            }
                                            if (var225 == null) {
                                                var225 = "";
                                            }
                                            class29.field473[var9++] = var225;
                                            continue;
                                        }
                                        if (var506 == 5011) {
                                            String var226 = null;
                                            var7--;
                                            int var227 = class258.field3995[var7];
                                            if (var227 < 100) {
                                                var226 = class178.field2786[var227];
                                            }
                                            if (var226 == null) {
                                                var226 = "";
                                            }
                                            class29.field473[var9++] = var226;
                                            continue;
                                        }
                                        if (var506 == 5012) {
                                            var7--;
                                            int var228 = class258.field3995[var7];
                                            int var229 = -1;
                                            if (var228 < 100) {
                                                var229 = class134.field2121[var228];
                                            }
                                            class258.field3995[var7++] = var229;
                                            continue;
                                        }
                                        if (var506 == 5015) {
                                            String var230;
                                            if (class19.field356 == null || class19.field356.field494 == null) {
                                                var230 = class68.field1095;
                                            } else {
                                                var230 = class19.field356.method208((byte) 103);
                                            }
                                            class29.field473[var9++] = var230;
                                            continue;
                                        }
                                        if (var506 == 5016) {
                                            class258.field3995[var7++] = class61.field951;
                                            continue;
                                        }
                                        if (var506 == 5017) {
                                            class258.field3995[var7++] = class277.field4287;
                                            continue;
                                        }
                                        if (var506 == 5050) {
                                            var7--;
                                            int var231 = class258.field3995[var7];
                                            class29.field473[var9++] = class10.method79(var231, 32768).field2440;
                                            continue;
                                        }
                                        if (var506 == 5051) {
                                            var7--;
                                            int var232 = class258.field3995[var7];
                                            class152 var233 = class10.method79(var232, 32768);
                                            if (var233.field2449 == null) {
                                                class258.field3995[var7++] = 0;
                                            } else {
                                                class258.field3995[var7++] = var233.field2449.length;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5052) {
                                            var7 -= 2;
                                            int var234 = class258.field3995[var7];
                                            int var235 = class258.field3995[var7 + 1];
                                            class152 var236 = class10.method79(var234, 32768);
                                            int var237 = var236.field2449[var235];
                                            class258.field3995[var7++] = var237;
                                            continue;
                                        }
                                        if (var506 == 5053) {
                                            var7--;
                                            int var238 = class258.field3995[var7];
                                            class152 var239 = class10.method79(var238, 32768);
                                            if (var239.field2445 == null) {
                                                class258.field3995[var7++] = 0;
                                            } else {
                                                class258.field3995[var7++] = var239.field2445.length;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5054) {
                                            var7 -= 2;
                                            int var240 = class258.field3995[var7];
                                            int var241 = class258.field3995[var7 + 1];
                                            class258.field3995[var7++] = class10.method79(var240, 32768).field2445[var241];
                                            continue;
                                        }
                                        if (var506 == 5055) {
                                            var7--;
                                            int var242 = class258.field3995[var7];
                                            class29.field473[var9++] = class326.method2238(1, var242).method1582(-4);
                                            continue;
                                        }
                                        if (var506 == 5056) {
                                            var7--;
                                            int var243 = class258.field3995[var7];
                                            class219 var244 = class326.method2238(1, var243);
                                            if (var244.field3498 == null) {
                                                class258.field3995[var7++] = 0;
                                            } else {
                                                class258.field3995[var7++] = var244.field3498.length;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5057) {
                                            var7 -= 2;
                                            int var245 = class258.field3995[var7];
                                            int var246 = class258.field3995[var7 + 1];
                                            class258.field3995[var7++] = class326.method2238(1, var245).field3498[var246];
                                            continue;
                                        }
                                        if (var506 == 5058) {
                                            field4193 = new class230();
                                            var7--;
                                            field4193.field3659 = class258.field3995[var7];
                                            field4193.field3662 = class326.method2238(1, field4193.field3659);
                                            field4193.field3653 = new int[field4193.field3662.method1581(-1)];
                                            continue;
                                        }
                                        if (var506 == 5059) {
                                            class94.field1533++;
                                            field4191.method246(false, 244);
                                            field4191.method772((byte) -65, 0);
                                            int var247 = field4191.field1667;
                                            field4191.method772((byte) -104, 0);
                                            field4191.method728(field4193.field3659, 1234856744);
                                            field4193.field3662.method1588((byte) -114, field4193.field3653, field4191);
                                            field4191.method747(122, field4191.field1667 - var247);
                                            continue;
                                        }
                                        if (var506 == 5060) {
                                            class195.field3104++;
                                            var9--;
                                            String var248 = class29.field473[var9];
                                            field4191.method246(false, 12);
                                            field4191.method772((byte) -68, 0);
                                            int var249 = field4191.field1667;
                                            field4191.method760(class36.method281(39, var248), true);
                                            field4191.method728(field4193.field3659, 1234856744);
                                            field4193.field3662.method1588((byte) -125, field4193.field3653, field4191);
                                            field4191.method747(87, field4191.field1667 - var249);
                                            continue;
                                        }
                                        if (var506 == 5061) {
                                            field4191.method246(false, 244);
                                            field4191.method772((byte) -70, 0);
                                            class94.field1533++;
                                            int var250 = field4191.field1667;
                                            field4191.method772((byte) -109, 1);
                                            field4191.method728(field4193.field3659, arg2 ^ 0x499A54B5);
                                            field4193.field3662.method1588((byte) -116, field4193.field3653, field4191);
                                            field4191.method747(arg2 ^ 0x3FE8, field4191.field1667 - var250);
                                            continue;
                                        }
                                        if (var506 == 5062) {
                                            var7 -= 2;
                                            int var251 = class258.field3995[var7 + 1];
                                            int var252 = class258.field3995[var7];
                                            class258.field3995[var7++] = class10.method79(var252, 32768).field2448[var251];
                                            continue;
                                        }
                                        if (var506 == 5063) {
                                            var7 -= 2;
                                            int var253 = class258.field3995[var7 + 1];
                                            int var254 = class258.field3995[var7];
                                            class258.field3995[var7++] = class10.method79(var254, 32768).field2443[var253];
                                            continue;
                                        }
                                        if (var506 == 5064) {
                                            var7 -= 2;
                                            int var255 = class258.field3995[var7];
                                            int var256 = class258.field3995[var7 + 1];
                                            if (var256 == -1) {
                                                class258.field3995[var7++] = -1;
                                            } else {
                                                class258.field3995[var7++] = class10.method79(var255, 32768).method1165(-1, (char) var256);
                                            }
                                            continue;
                                        }
                                        if (var506 == 5065) {
                                            var7 -= 2;
                                            int var257 = class258.field3995[var7];
                                            int var258 = class258.field3995[var7 + 1];
                                            if (var258 == -1) {
                                                class258.field3995[var7++] = -1;
                                            } else {
                                                class258.field3995[var7++] = class10.method79(var257, class29.method193(arg2, 49053)).method1169(false, (char) var258);
                                            }
                                            continue;
                                        }
                                        if (var506 == 5066) {
                                            var7--;
                                            int var259 = class258.field3995[var7];
                                            class258.field3995[var7++] = class326.method2238(1, var259).method1581(-1);
                                            continue;
                                        }
                                        if (var506 == 5067) {
                                            var7 -= 2;
                                            int var260 = class258.field3995[var7 + 1];
                                            int var261 = class258.field3995[var7];
                                            int var262 = class326.method2238(arg2 ^ 0x3F9C, var261).method1577(var260, (byte) -86);
                                            class258.field3995[var7++] = var262;
                                            continue;
                                        }
                                        if (var506 == 5068) {
                                            var7 -= 2;
                                            int var263 = class258.field3995[var7];
                                            int var264 = class258.field3995[var7 + 1];
                                            field4193.field3653[var263] = var264;
                                            continue;
                                        }
                                        if (var506 == 5069) {
                                            var7 -= 2;
                                            int var265 = class258.field3995[var7];
                                            int var266 = class258.field3995[var7 + 1];
                                            field4193.field3653[var265] = var266;
                                            continue;
                                        }
                                        if (var506 == 5070) {
                                            var7 -= 3;
                                            int var267 = class258.field3995[var7 + 2];
                                            int var268 = class258.field3995[var7];
                                            int var269 = class258.field3995[var7 + 1];
                                            class219 var270 = class326.method2238(1, var268);
                                            if (var270.method1577(var269, (byte) -70) != 0) {
                                                throw new RuntimeException("bad command");
                                            }
                                            class258.field3995[var7++] = var270.method1580(var269, (byte) -93, var267);
                                            continue;
                                        }
                                        if (var506 == 5071) {
                                            var9--;
                                            String var271 = class29.field473[var9];
                                            var7--;
                                            boolean var272 = class258.field3995[var7] == 1;
                                            class101.method786(var272, (byte) -120, var271);
                                            class258.field3995[var7++] = class297.field4681;
                                            continue;
                                        }
                                        if (var506 == 5072) {
                                            if (class114.field1871 != null && class297.field4681 > client.field3902) {
                                                class258.field3995[var7++] = class280.method2001(65535, class114.field1871[client.field3902++]);
                                                continue;
                                            }
                                            class258.field3995[var7++] = -1;
                                            continue;
                                        }
                                        if (var506 == 5073) {
                                            client.field3902 = 0;
                                            continue;
                                        }
                                    } else if (var506 < 5200) {
                                        if (var506 == 5100) {
                                            if (class108.field1795[86]) {
                                                class258.field3995[var7++] = 1;
                                            } else {
                                                class258.field3995[var7++] = 0;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5101) {
                                            if (class108.field1795[82]) {
                                                class258.field3995[var7++] = 1;
                                            } else {
                                                class258.field3995[var7++] = 0;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5102) {
                                            if (class108.field1795[81]) {
                                                class258.field3995[var7++] = 1;
                                            } else {
                                                class258.field3995[var7++] = 0;
                                            }
                                            continue;
                                        }
                                    } else if (var506 < 5300) {
                                        if (var506 == 5200) {
                                            var7--;
                                            class170.method1240((byte) -78, class258.field3995[var7]);
                                            continue;
                                        }
                                        if (var506 == 5201) {
                                            class258.field3995[var7++] = class285.method2020((byte) -88);
                                            continue;
                                        }
                                        if (var506 == 5202) {
                                            var7--;
                                            class213.method1542(class258.field3995[var7], arg2 ^ 0xFFFF8E4B);
                                            continue;
                                        }
                                        if (var506 == 5203) {
                                            var9--;
                                            class178.method1323(98, class29.field473[var9]);
                                            continue;
                                        }
                                        if (var506 == 5204) {
                                            class29.field473[var9 - 1] = class231.method1671(class29.field473[var9 - 1], (byte) -48);
                                            continue;
                                        }
                                        if (var506 == 5205) {
                                            var9--;
                                            class136.method1043(class29.field473[var9], true);
                                            continue;
                                        }
                                        if (var506 == 5206) {
                                            var7--;
                                            int var273 = class258.field3995[var7];
                                            class169 var274 = class24.method167((var273 & 0xFFFD404) >> 14, var273 & 0x3FFF, (byte) 79);
                                            if (var274 == null) {
                                                class29.field473[var9++] = "";
                                            } else {
                                                class29.field473[var9++] = var274.field2624;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5207) {
                                            var9--;
                                            class169 var275 = class109.method830(class29.field473[var9], 256);
                                            if (var275 != null && var275.field2636 != null) {
                                                class29.field473[var9++] = var275.field2636;
                                                continue;
                                            }
                                            class29.field473[var9++] = "";
                                            continue;
                                        }
                                        if (var506 == 5208) {
                                            class258.field3995[var7++] = class222.field3553;
                                            class258.field3995[var7++] = class317.field4939;
                                            continue;
                                        }
                                        if (var506 == 5209) {
                                            class258.field3995[var7++] = class40.field725 + class310.field4885;
                                            class258.field3995[var7++] = class279.field4316 + class70.field1107 - class95.field1565 - 1;
                                            continue;
                                        }
                                        if (var506 == 5210) {
                                            class169 var276 = class157.method1181(127);
                                            if (var276 == null) {
                                                class258.field3995[var7++] = 0;
                                                class258.field3995[var7++] = 0;
                                            } else {
                                                class258.field3995[var7++] = var276.field2618 * 64;
                                                class258.field3995[var7++] = var276.field2619 * 64;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5211) {
                                            class169 var277 = class157.method1181(arg2 - 16158);
                                            if (var277 == null) {
                                                class258.field3995[var7++] = 0;
                                                class258.field3995[var7++] = 0;
                                            } else {
                                                class258.field3995[var7++] = var277.field2632 - var277.field2623;
                                                class258.field3995[var7++] = var277.field2622 - var277.field2634;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5212) {
                                            int var278 = class215.method1557(arg2 ^ 0xFFFFC031);
                                            int var279 = 0;
                                            String var280;
                                            if (var278 == -1) {
                                                var280 = "";
                                            } else {
                                                var280 = class43.field763.field3131[var278];
                                                var279 = class43.field763.method1438(var278, (byte) 81);
                                            }
                                            String var281 = class229.method1659(" ", var280, "<br>", -20263);
                                            class29.field473[var9++] = var281;
                                            class258.field3995[var7++] = var279;
                                            continue;
                                        }
                                        if (var506 == 5213) {
                                            int var282 = class292.method2057(arg2 - 926);
                                            int var283 = 0;
                                            String var284;
                                            if (var282 == -1) {
                                                var284 = "";
                                            } else {
                                                var284 = class43.field763.field3131[var282];
                                                var283 = class43.field763.method1438(var282, (byte) 81);
                                            }
                                            String var285 = class229.method1659(" ", var284, "<br>", -20263);
                                            class29.field473[var9++] = var285;
                                            class258.field3995[var7++] = var283;
                                            continue;
                                        }
                                        if (var506 == 5214) {
                                            var7--;
                                            int var286 = class258.field3995[var7];
                                            class228.method1653(true, (var286 & 0xFFFCC16) >> 14, var286 & 0x3FFF);
                                            continue;
                                        }
                                        if (var506 == 5215) {
                                            var9--;
                                            String var287 = class29.field473[var9];
                                            var7--;
                                            int var288 = class258.field3995[var7];
                                            boolean var289 = false;
                                            class222 var290 = class110.method836((byte) -106, var288 & 0x3FFF, (var288 & 0xFFFE14A) >> 14);
                                            for (class169 var291 = (class169) var290.method1612(false); var291 != null; var291 = (class169) var290.method1615(false)) {
                                                if (var291.field2624.equalsIgnoreCase(var287)) {
                                                    var289 = true;
                                                    break;
                                                }
                                            }
                                            if (var289) {
                                                class258.field3995[var7++] = 1;
                                            } else {
                                                class258.field3995[var7++] = 0;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5216) {
                                            var7--;
                                            int var292 = class258.field3995[var7];
                                            class86.method619(var292, -14463);
                                            continue;
                                        }
                                        if (var506 == 5217) {
                                            var7--;
                                            int var293 = class258.field3995[var7];
                                            if (class306.method2121(var293, false)) {
                                                class258.field3995[var7++] = 1;
                                            } else {
                                                class258.field3995[var7++] = 0;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5218) {
                                            class169 var294 = class157.method1181(127);
                                            if (var294 == null) {
                                                class258.field3995[var7++] = -1;
                                            } else {
                                                class258.field3995[var7++] = var294.field2638;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5219) {
                                            var9--;
                                            class274.method1974(class29.field473[var9], -117);
                                            continue;
                                        }
                                        if (var506 == 5220) {
                                            class258.field3995[var7++] = class78.field1183 == 100 ? 1 : 0;
                                            continue;
                                        }
                                    } else if (var506 < 5400) {
                                        if (var506 == 5300) {
                                            var7 -= 2;
                                            int var357 = class258.field3995[var7];
                                            int var358 = class258.field3995[var7 + 1];
                                            class240.method1705(-1, 3, var358, false, var357);
                                            class258.field3995[var7++] = class52.field823 == null ? 0 : 1;
                                            continue;
                                        }
                                        if (var506 == 5301) {
                                            if (class52.field823 != null) {
                                                class240.method1705(-1, class54.field860, -1, false, -1);
                                            }
                                            continue;
                                        }
                                        if (var506 == 5302) {
                                            class302[] var359 = class272.method1961(0);
                                            class258.field3995[var7++] = var359.length;
                                            continue;
                                        }
                                        if (var506 == 5303) {
                                            var7--;
                                            int var360 = class258.field3995[var7];
                                            class302[] var361 = class272.method1961(0);
                                            class258.field3995[var7++] = var361[var360].field4754;
                                            class258.field3995[var7++] = var361[var360].field4751;
                                            continue;
                                        }
                                        if (var506 == 5305) {
                                            int var362 = class107.field1786;
                                            int var363 = -1;
                                            int var364 = class247.field3825;
                                            class302[] var365 = class272.method1961(arg2 - 16285);
                                            for (int var366 = 0; var366 < var365.length; var366++) {
                                                class302 var367 = var365[var366];
                                                if (var367.field4754 == var362 && var367.field4751 == var364) {
                                                    var363 = var366;
                                                    break;
                                                }
                                            }
                                            class258.field3995[var7++] = var363;
                                            continue;
                                        }
                                        if (var506 == 5306) {
                                            class258.field3995[var7++] = class242.method1719(0);
                                            continue;
                                        }
                                        if (var506 == 5307) {
                                            var7--;
                                            int var368 = class258.field3995[var7];
                                            if (var368 < 0 || var368 > 2) {
                                                var368 = 0;
                                            }
                                            class240.method1705(-1, var368, -1, false, -1);
                                            continue;
                                        }
                                        if (var506 == 5308) {
                                            class258.field3995[var7++] = class54.field860;
                                            continue;
                                        }
                                        if (var506 == 5309) {
                                            var7--;
                                            int var369 = class258.field3995[var7];
                                            if (var369 < 0 || var369 > 2) {
                                                var369 = 0;
                                            }
                                            class54.field860 = var369;
                                            class41.method334(class83.field1235, true);
                                            continue;
                                        }
                                    } else if (var506 < 5500) {
                                        if (var506 == 5400) {
                                            var9 -= 2;
                                            class232.field3680++;
                                            String var337 = class29.field473[var9 + 1];
                                            String var338 = class29.field473[var9];
                                            var7--;
                                            int var339 = class258.field3995[var7];
                                            field4191.method246(false, 87);
                                            field4191.method772((byte) -119, class307.method2123((byte) -122, var338) - (-class307.method2123((byte) -122, var337) - 1));
                                            field4191.method754((byte) 106, var338);
                                            field4191.method754((byte) -100, var337);
                                            field4191.method772((byte) -115, var339);
                                            continue;
                                        }
                                        if (var506 == 5401) {
                                            var7 -= 2;
                                            class19.field362[class258.field3995[var7]] = (short) class137.method1049(class258.field3995[var7 + 1], 93);
                                            class78.method578(75);
                                            class329.method2249(16475);
                                            class261.method1846(-30584);
                                            class222.method1608(1);
                                            class26.method175((byte) -113);
                                            continue;
                                        }
                                        if (var506 == 5405) {
                                            var7 -= 2;
                                            int var340 = class258.field3995[var7];
                                            int var341 = class258.field3995[var7 + 1];
                                            if (var340 >= 0 && var340 < 2) {
                                                class195.field3109[var340] = new int[var341 << 1][4];
                                            }
                                            continue;
                                        }
                                        if (var506 == 5406) {
                                            var7 -= 7;
                                            int var342 = class258.field3995[var7 + 1] << 1;
                                            int var343 = class258.field3995[var7 + 3];
                                            int var344 = class258.field3995[var7];
                                            int var345 = class258.field3995[var7 + 2];
                                            int var346 = class258.field3995[var7 + 4];
                                            int var347 = class258.field3995[var7 + 5];
                                            int var348 = class258.field3995[var7 + 6];
                                            if (var344 >= 0 && var344 < 2 && class195.field3109[var344] != null && var342 >= 0 && var342 < class195.field3109[var344].length) {
                                                class195.field3109[var344][var342] = new int[] { class280.method2001(16383, var345 >> 14) * 128, var343, class280.method2001(var345, 16383) * 128, var348 };
                                                class195.field3109[var344][var342 + 1] = new int[] { (class280.method2001(268429070, var346) >> 14) * 128, var347, class280.method2001(16383, var346) * 128 };
                                            }
                                            continue;
                                        }
                                        if (var506 == 5407) {
                                            var7--;
                                            int var349 = class195.field3109[class258.field3995[var7]].length >> 1;
                                            class258.field3995[var7++] = var349;
                                            continue;
                                        }
                                        if (var506 == 5411) {
                                            if (class52.field823 != null) {
                                                class240.method1705(-1, class54.field860, -1, false, -1);
                                            }
                                            if (class81.field1219 == null) {
                                                class295.method2071((byte) 112, class179.method1333(97), false);
                                            } else {
                                                System.exit(0);
                                            }
                                            continue;
                                        }
                                        if (var506 == 5419) {
                                            String var350 = "";
                                            if (class178.field2790 != null) {
                                                if (class178.field2790.field391 == null) {
                                                    var350 = class319.method2192(arg2 ^ 0x3F9D, class178.field2790.field386);
                                                } else {
                                                    var350 = (String) class178.field2790.field391;
                                                }
                                            }
                                            class29.field473[var9++] = var350;
                                            continue;
                                        }
                                        if (var506 == 5420) {
                                            class258.field3995[var7++] = class325.field5048 == 3 ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 5421) {
                                            if (class52.field823 != null) {
                                                class240.method1705(-1, class54.field860, -1, false, -1);
                                            }
                                            var9--;
                                            String var351 = class29.field473[var9];
                                            var7--;
                                            boolean var352 = class258.field3995[var7] == 1;
                                            String var353 = class179.method1333(115) + var351;
                                            if (class81.field1219 != null || var352 && class325.field5048 != 3 && class325.field5042.startsWith("win") && !class273.field4243) {
                                                class183.field2929 = var352;
                                                class95.field1571 = var353;
                                                class48.field800 = class83.field1235.method2218(var353, false);
                                                continue;
                                            }
                                            class295.method2071((byte) 59, var353, var352);
                                            continue;
                                        }
                                        if (var506 == 5422) {
                                            var9 -= 2;
                                            String var354 = class29.field473[var9];
                                            var7--;
                                            int var355 = class258.field3995[var7];
                                            String var356 = class29.field473[var9 + 1];
                                            if (var354.length() > 0) {
                                                if (class236.field3712 == null) {
                                                    class236.field3712 = new String[class23.field401[class141.field2241]];
                                                }
                                                class236.field3712[var355] = var354;
                                            }
                                            if (var356.length() > 0) {
                                                if (class267.field4139 == null) {
                                                    class267.field4139 = new String[class23.field401[class141.field2241]];
                                                }
                                                class267.field4139[var355] = var356;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5423) {
                                            var9--;
                                            System.out.println(class29.field473[var9]);
                                            continue;
                                        }
                                        if (var506 == 5424) {
                                            var7 -= 11;
                                            class311.field4892 = class258.field3995[var7];
                                            class60.field947 = class258.field3995[var7 + 1];
                                            class191.field3062 = class258.field3995[var7 + 2];
                                            class246.field3814 = class258.field3995[var7 + 3];
                                            class163.field2556 = class258.field3995[var7 + 4];
                                            class24.field411 = class258.field3995[var7 + 5];
                                            class160.field2525 = class258.field3995[var7 + 6];
                                            class123.field1972 = class258.field3995[var7 + 7];
                                            class145.field2282 = class258.field3995[var7 + 8];
                                            class9.field147 = class258.field3995[var7 + 9];
                                            class220.field3520 = class258.field3995[var7 + 10];
                                            class210.field3356.method489(class163.field2556, 0);
                                            class210.field3356.method489(class24.field411, 0);
                                            class210.field3356.method489(class160.field2525, 0);
                                            class210.field3356.method489(class123.field1972, 0);
                                            class210.field3356.method489(class145.field2282, arg2 ^ 0x3F9D);
                                            class77.field1176 = true;
                                            continue;
                                        }
                                        if (var506 == 5425) {
                                            class169.method1231(arg2 + 13022);
                                            class77.field1176 = false;
                                            continue;
                                        }
                                        if (var506 == 5426) {
                                            var7--;
                                            class123.field1958 = class258.field3995[var7];
                                            continue;
                                        }
                                        if (var506 == 5427) {
                                            var7 -= 2;
                                            class89.field1364 = class258.field3995[var7];
                                            class68.field1087 = class258.field3995[var7 + 1];
                                            continue;
                                        }
                                    } else if (var506 < 5600) {
                                        if (var506 == 5500) {
                                            var7 -= 4;
                                            int var325 = class258.field3995[var7];
                                            int var326 = class258.field3995[var7 + 1];
                                            int var327 = class258.field3995[var7 + 2];
                                            int var328 = class258.field3995[var7 + 3];
                                            class61.method445((var325 & 0x3FFF) - class91.field1485, var328, false, var327, ((var325 & 0xFFFE119) >> 14) - class177.field2780, -64, var326);
                                            continue;
                                        }
                                        if (var506 == 5501) {
                                            var7 -= 4;
                                            int var329 = class258.field3995[var7];
                                            int var330 = class258.field3995[var7 + 1];
                                            int var331 = class258.field3995[var7 + 3];
                                            int var332 = class258.field3995[var7 + 2];
                                            class246.method1746((var329 & 0x3FFF) - class91.field1485, (byte) -37, var331, ((var329 & 0xFFFFB91) >> 14) - class177.field2780, var332, var330);
                                            continue;
                                        }
                                        if (var506 == 5502) {
                                            var7 -= 6;
                                            int var333 = class258.field3995[var7];
                                            if (var333 >= 2) {
                                                throw new RuntimeException();
                                            }
                                            class143.field2256 = var333;
                                            int var334 = class258.field3995[var7 + 1];
                                            if (class195.field3109[class143.field2256].length >> 1 <= var334 + 1) {
                                                throw new RuntimeException();
                                            }
                                            class65.field1060 = 0;
                                            class95.field1564 = var334;
                                            class92.field1523 = class258.field3995[var7 + 2];
                                            class115.field1883 = class258.field3995[var7 + 3];
                                            int var335 = class258.field3995[var7 + 4];
                                            if (var335 >= 2) {
                                                throw new RuntimeException();
                                            }
                                            class96.field1581 = var335;
                                            int var336 = class258.field3995[var7 + 5];
                                            if (class195.field3109[class96.field1581].length >> 1 <= var336 + 1) {
                                                throw new RuntimeException();
                                            }
                                            class91.field1505 = var336;
                                            class62.field960 = 3;
                                            continue;
                                        }
                                        if (var506 == 5503) {
                                            class103.method789(120);
                                            continue;
                                        }
                                        if (var506 == 5504) {
                                            var7 -= 2;
                                            class143.field2254 = class258.field3995[var7];
                                            class248.field3833 = class258.field3995[var7 + 1];
                                            if (class62.field960 == 2) {
                                                class103.field1746 = class248.field3833;
                                                class181.field2891 = class143.field2254;
                                            }
                                            class51.method382(-122);
                                            continue;
                                        }
                                        if (var506 == 5505) {
                                            class258.field3995[var7++] = class143.field2254;
                                            continue;
                                        }
                                        if (var506 == 5506) {
                                            class258.field3995[var7++] = class248.field3833;
                                            continue;
                                        }
                                    } else if (var506 < 5700) {
                                        if (var506 == 5600) {
                                            var9 -= 2;
                                            String var321 = class29.field473[var9 + 1];
                                            String var322 = class29.field473[var9];
                                            var7--;
                                            int var323 = class258.field3995[var7];
                                            if (class22.field394 == 10 && class198.field3132 == 0 && class277.field4293 == 0 && class316.field4932 == 0 && class285.field4383 == 0) {
                                                class212.method1537(var323, var321, var322, -32309);
                                            }
                                            continue;
                                        }
                                        if (var506 == 5601) {
                                            class30.method202((byte) 7);
                                            continue;
                                        }
                                        if (var506 == 5602) {
                                            if (class277.field4293 == 0) {
                                                class307.field4839 = -2;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5603) {
                                            var7 -= 4;
                                            if (class22.field394 == 10 && class198.field3132 == 0 && class277.field4293 == 0 && class316.field4932 == 0 && class285.field4383 == 0) {
                                                class165.method1210(class258.field3995[var7], class258.field3995[var7 + 2], false, class258.field3995[var7 + 3], class258.field3995[var7 + 1]);
                                            }
                                            continue;
                                        }
                                        if (var506 == 5604) {
                                            var9--;
                                            if (class22.field394 == 10 && class198.field3132 == 0 && class277.field4293 == 0 && class316.field4932 == 0 && class285.field4383 == 0) {
                                                class285.method2023(1, class36.method281(119, class29.field473[var9]));
                                            }
                                            continue;
                                        }
                                        if (var506 == 5605) {
                                            var7 -= 7;
                                            var9 -= 3;
                                            if (class22.field394 == 10 && class198.field3132 == 0 && class277.field4293 == 0 && class316.field4932 == 0 && class285.field4383 == 0) {
                                                class12.method108(class36.method281(arg2 ^ 0x3FAD, class29.field473[var9]), class258.field3995[var7 + 6] == 1, class258.field3995[var7 + 3], class29.field473[var9 + 2], class258.field3995[var7 + 2], class258.field3995[var7 + 1], (byte) 87, class258.field3995[var7 + 5] == 1, class258.field3995[var7], class258.field3995[var7 + 4] == 1, class29.field473[var9 + 1]);
                                            }
                                            continue;
                                        }
                                        if (var506 == 5606) {
                                            if (class316.field4932 == 0) {
                                                class231.field3671 = -2;
                                            }
                                            continue;
                                        }
                                        if (var506 == 5607) {
                                            class258.field3995[var7++] = class307.field4839;
                                            continue;
                                        }
                                        if (var506 == 5608) {
                                            class258.field3995[var7++] = class328.field5072;
                                            continue;
                                        }
                                        if (var506 == 5609) {
                                            class258.field3995[var7++] = class231.field3671;
                                            continue;
                                        }
                                        if (var506 == 5610) {
                                            for (int var324 = 0; var324 < 5; var324++) {
                                                class29.field473[var9++] = class236.field3714.length > var324 ? class235.method1684(class236.field3714[var324], (byte) 117) : "";
                                            }
                                            class236.field3714 = null;
                                            continue;
                                        }
                                        if (var506 == 5611) {
                                            class258.field3995[var7++] = class162.field2541;
                                            continue;
                                        }
                                    } else if (var506 < 6100) {
                                        if (var506 == 6001) {
                                            var7--;
                                            int var312 = class258.field3995[var7];
                                            if (var312 < 1) {
                                                var312 = 1;
                                            }
                                            if (var312 > 4) {
                                                var312 = 4;
                                            }
                                            class329.field5093 = var312;
                                            if (!class265.field4126 || !class302.field4753) {
                                                if (class329.field5093 == 1) {
                                                    class174.method1290(0.9F);
                                                }
                                                if (class329.field5093 == 2) {
                                                    class174.method1290(0.8F);
                                                }
                                                if (class329.field5093 == 3) {
                                                    class174.method1290(0.7F);
                                                }
                                                if (class329.field5093 == 4) {
                                                    class174.method1290(0.6F);
                                                }
                                            }
                                            if (class265.field4126) {
                                                class232.method1678(arg2 - 16331);
                                                if (!class302.field4753) {
                                                    class248.method1762(-13);
                                                }
                                            }
                                            class329.method2249(16475);
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6002) {
                                            var7--;
                                            class306.method2116(class258.field3995[var7] == 1, -19689);
                                            class17.method141(113);
                                            class248.method1762(-23);
                                            class19.method155(-125);
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6003) {
                                            var7--;
                                            class128.field2040 = class258.field3995[var7] == 1;
                                            class19.method155(-108);
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6005) {
                                            var7--;
                                            class289.field4406 = class258.field3995[var7] == 1;
                                            class248.method1762(125);
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6006) {
                                            var7--;
                                            class298.field4704 = class258.field3995[var7] == 1;
                                            ((class203) class174.field2734).method1482(-25, !class298.field4704);
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6007) {
                                            var7--;
                                            class65.field1055 = class258.field3995[var7] == 1;
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6008) {
                                            var7--;
                                            class29.field474 = class258.field3995[var7] == 1;
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6009) {
                                            var7--;
                                            class217.field3474 = class258.field3995[var7] == 1;
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6010) {
                                            var7--;
                                            class11.field219 = class258.field3995[var7] == 1;
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6011) {
                                            var7--;
                                            int var313 = class258.field3995[var7];
                                            if (var313 < 0 || var313 > 2) {
                                                var313 = 0;
                                            }
                                            class245.field3780 = var313;
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6012) {
                                            if (class265.field4126) {
                                                class308.method2132(0, (byte) -28, 0);
                                            }
                                            var7--;
                                            class302.field4753 = class258.field3995[var7] == 1;
                                            if (class265.field4126 && class302.field4753) {
                                                class174.method1290(0.7F);
                                            } else {
                                                if (class329.field5093 == 1) {
                                                    class174.method1290(0.9F);
                                                }
                                                if (class329.field5093 == 2) {
                                                    class174.method1290(0.8F);
                                                }
                                                if (class329.field5093 == 3) {
                                                    class174.method1290(0.7F);
                                                }
                                                if (class329.field5093 == 4) {
                                                    class174.method1290(0.6F);
                                                }
                                            }
                                            class248.method1762(arg2 - 16379);
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6014) {
                                            var7--;
                                            class6.field61 = class258.field3995[var7] == 1;
                                            if (class265.field4126) {
                                                class248.method1762(115);
                                            }
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6015) {
                                            var7--;
                                            class307.field4846 = class258.field3995[var7] == 1;
                                            if (class265.field4126) {
                                                class232.method1678(arg2 - 16331);
                                            }
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6016) {
                                            var7--;
                                            int var314 = class258.field3995[var7];
                                            if (class265.field4126) {
                                                class132.field2112 = true;
                                            }
                                            if (var314 < 0 || var314 > 2) {
                                                var314 = 0;
                                            }
                                            class141.field2240 = var314;
                                            continue;
                                        }
                                        if (var506 == 6017) {
                                            var7--;
                                            class151.field2424 = class258.field3995[var7] == 1;
                                            class89.method635(false);
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6018) {
                                            var7--;
                                            int var315 = class258.field3995[var7];
                                            if (var315 < 0) {
                                                var315 = 0;
                                            }
                                            if (var315 > 127) {
                                                var315 = 127;
                                            }
                                            class191.field3064 = var315;
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6019) {
                                            var7--;
                                            int var316 = class258.field3995[var7];
                                            if (var316 < 0) {
                                                var316 = 0;
                                            }
                                            if (var316 > 255) {
                                                var316 = 255;
                                            }
                                            if (class288.field4397 != var316) {
                                                if (class288.field4397 == 0 && class306.field4808 != -1) {
                                                    class110.method835(class306.field4808, var316, false, class111.field1842, 0, arg2 - 16383);
                                                    class165.field2559 = false;
                                                } else if (var316 == 0) {
                                                    class145.method1097(100);
                                                    class165.field2559 = false;
                                                } else {
                                                    class156.method1177((byte) 99, var316);
                                                }
                                                class288.field4397 = var316;
                                            }
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6020) {
                                            var7--;
                                            int var317 = class258.field3995[var7];
                                            if (var317 < 0) {
                                                var317 = 0;
                                            }
                                            if (var317 > 127) {
                                                var317 = 127;
                                            }
                                            class14.field263 = var317;
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            continue;
                                        }
                                        if (var506 == 6021) {
                                            var7--;
                                            class179.field2792 = class258.field3995[var7] == 1;
                                            class19.method155(-109);
                                            continue;
                                        }
                                        if (var506 == 6023) {
                                            boolean var318 = false;
                                            var7--;
                                            int var319 = class258.field3995[var7];
                                            if (var319 < 0) {
                                                var319 = 0;
                                            }
                                            if (var319 > 2) {
                                                var319 = 2;
                                            }
                                            if (class95.field1567 < 96) {
                                                var318 = true;
                                                var319 = 0;
                                            }
                                            class47.method370(var319);
                                            class41.method334(class83.field1235, true);
                                            class70.field1104 = false;
                                            class258.field3995[var7++] = var318 ? 0 : 1;
                                            continue;
                                        }
                                        if (var506 == 6024) {
                                            var7--;
                                            int var320 = class258.field3995[var7];
                                            if (var320 < 0 || var320 > 2) {
                                                var320 = 0;
                                            }
                                            class12.field239 = var320;
                                            class41.method334(class83.field1235, true);
                                            continue;
                                        }
                                        if (var506 == 6028) {
                                            var7--;
                                            class212.field3387 = class258.field3995[var7] != 0;
                                            class41.method334(class83.field1235, true);
                                            continue;
                                        }
                                    } else if (var506 < 6200) {
                                        if (var506 == 6101) {
                                            class258.field3995[var7++] = class329.field5093;
                                            continue;
                                        }
                                        if (var506 == 6102) {
                                            class258.field3995[var7++] = class34.method248(arg2 - 16404) ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 6103) {
                                            class258.field3995[var7++] = class128.field2040 ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 6105) {
                                            class258.field3995[var7++] = class289.field4406 ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 6106) {
                                            class258.field3995[var7++] = class298.field4704 ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 6107) {
                                            class258.field3995[var7++] = class65.field1055 ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 6108) {
                                            class258.field3995[var7++] = class29.field474 ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 6109) {
                                            class258.field3995[var7++] = class217.field3474 ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 6110) {
                                            class258.field3995[var7++] = class11.field219 ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 6111) {
                                            class258.field3995[var7++] = class245.field3780;
                                            continue;
                                        }
                                        if (var506 == 6112) {
                                            class258.field3995[var7++] = class302.field4753 ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 6114) {
                                            class258.field3995[var7++] = class6.field61 ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 6115) {
                                            class258.field3995[var7++] = class307.field4846 ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 6116) {
                                            class258.field3995[var7++] = class141.field2240;
                                            continue;
                                        }
                                        if (var506 == 6117) {
                                            class258.field3995[var7++] = class151.field2424 ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 6118) {
                                            class258.field3995[var7++] = class191.field3064;
                                            continue;
                                        }
                                        if (var506 == 6119) {
                                            class258.field3995[var7++] = class288.field4397;
                                            continue;
                                        }
                                        if (var506 == 6120) {
                                            class258.field3995[var7++] = class14.field263;
                                            continue;
                                        }
                                        if (var506 == 6121) {
                                            if (class265.field4126) {
                                                class258.field3995[var7++] = class265.field4106 ? 1 : 0;
                                            } else {
                                                class258.field3995[var7++] = 0;
                                            }
                                            continue;
                                        }
                                        if (var506 == 6123) {
                                            class258.field3995[var7++] = class47.method368();
                                            continue;
                                        }
                                        if (var506 == 6124) {
                                            class258.field3995[var7++] = class12.field239;
                                            continue;
                                        }
                                        if (var506 == 6128) {
                                            class258.field3995[var7++] = class212.field3387 ? 1 : 0;
                                            continue;
                                        }
                                    } else if (var506 < 6300) {
                                        if (var506 == 6200) {
                                            var7 -= 2;
                                            class67.field1085 = (short) class258.field3995[var7];
                                            if (class67.field1085 <= 0) {
                                                class67.field1085 = 256;
                                            }
                                            class127.field2023 = (short) class258.field3995[var7 + 1];
                                            if (class127.field2023 <= 0) {
                                                class127.field2023 = 205;
                                            }
                                            continue;
                                        }
                                        if (var506 == 6201) {
                                            var7 -= 2;
                                            class109.field1804 = (short) class258.field3995[var7];
                                            if (class109.field1804 <= 0) {
                                                class109.field1804 = 256;
                                            }
                                            class71.field1117 = (short) class258.field3995[var7 + 1];
                                            if (class71.field1117 <= 0) {
                                                class71.field1117 = 320;
                                            }
                                            continue;
                                        }
                                        if (var506 == 6202) {
                                            var7 -= 4;
                                            class328.field5075 = (short) class258.field3995[var7];
                                            if (class328.field5075 <= 0) {
                                                class328.field5075 = 1;
                                            }
                                            class168.field2608 = (short) class258.field3995[var7 + 1];
                                            if (class168.field2608 <= 0) {
                                                class168.field2608 = 32767;
                                            } else if (class328.field5075 > class168.field2608) {
                                                class168.field2608 = class328.field5075;
                                            }
                                            class96.field1592 = (short) class258.field3995[var7 + 2];
                                            if (class96.field1592 <= 0) {
                                                class96.field1592 = 1;
                                            }
                                            class12.field231 = (short) class258.field3995[var7 + 3];
                                            if (class12.field231 <= 0) {
                                                class12.field231 = 32767;
                                            } else if (class96.field1592 > class12.field231) {
                                                class12.field231 = class96.field1592;
                                            }
                                            continue;
                                        }
                                        if (var506 == 6203) {
                                            class170.method1239(-30400, false, class251.field3869.field4499, 0, class251.field3869.field4608, 0);
                                            class258.field3995[var7++] = class181.field2892;
                                            class258.field3995[var7++] = class147.field2376;
                                            continue;
                                        }
                                        if (var506 == 6204) {
                                            class258.field3995[var7++] = class109.field1804;
                                            class258.field3995[var7++] = class71.field1117;
                                            continue;
                                        }
                                        if (var506 == 6205) {
                                            class258.field3995[var7++] = class67.field1085;
                                            class258.field3995[var7++] = class127.field2023;
                                            continue;
                                        }
                                    } else if (var506 < 6400) {
                                        if (var506 == 6300) {
                                            class258.field3995[var7++] = (int) (class154.method1172((byte) 84) / 60000L);
                                            continue;
                                        }
                                        if (var506 == 6301) {
                                            class258.field3995[var7++] = (int) (class154.method1172((byte) 124) / 86400000L) - 11745;
                                            continue;
                                        }
                                        if (var506 == 6302) {
                                            var7 -= 3;
                                            int var295 = class258.field3995[var7];
                                            int var296 = class258.field3995[var7 + 1];
                                            int var297 = class258.field3995[var7 + 2];
                                            class254.field3941.clear();
                                            class254.field3941.set(11, 12);
                                            class254.field3941.set(var297, var296, var295);
                                            class258.field3995[var7++] = (int) (class254.field3941.getTime().getTime() / 86400000L) - 11745;
                                            continue;
                                        }
                                        if (var506 == 6303) {
                                            class254.field3941.clear();
                                            class254.field3941.setTime(new Date(class154.method1172((byte) 116)));
                                            class258.field3995[var7++] = class254.field3941.get(1);
                                            continue;
                                        }
                                        if (var506 == 6304) {
                                            boolean var298 = true;
                                            var7--;
                                            int var299 = class258.field3995[var7];
                                            if (var299 < 0) {
                                                var298 = (var299 + 1) % 4 == 0;
                                            } else if (var299 < 1582) {
                                                var298 = (var299 % 4) == 0;
                                            } else if (var299 % 4 != 0) {
                                                var298 = false;
                                            } else if ((var299 % 100) != 0) {
                                                var298 = true;
                                            } else if (var299 % 400 != 0) {
                                                var298 = false;
                                            }
                                            class258.field3995[var7++] = var298 ? 1 : 0;
                                            continue;
                                        }
                                    } else if (var506 < 6500) {
                                        if (var506 == 6405) {
                                            class258.field3995[var7++] = class301.method2098(20480) ? 1 : 0;
                                            continue;
                                        }
                                        if (var506 == 6406) {
                                            class258.field3995[var7++] = class244.method1733(-1482) ? 1 : 0;
                                            continue;
                                        }
                                    } else if (var506 < 6600) {
                                        if (var506 == 6500) {
                                            if (class22.field394 == 10 && class198.field3132 == 0 && class277.field4293 == 0 && class316.field4932 == 0) {
                                                class258.field3995[var7++] = class128.method959((byte) -65) == -1 ? 0 : 1;
                                                continue;
                                            }
                                            class258.field3995[var7++] = 1;
                                            continue;
                                        }
                                        if (var506 == 6501) {
                                            class120 var300 = class272.method1966(0);
                                            if (var300 == null) {
                                                class258.field3995[var7++] = -1;
                                                class258.field3995[var7++] = 0;
                                                class29.field473[var9++] = "";
                                                class258.field3995[var7++] = 0;
                                                class29.field473[var9++] = "";
                                                class258.field3995[var7++] = 0;
                                            } else {
                                                class258.field3995[var7++] = var300.field1932;
                                                class258.field3995[var7++] = var300.field4919;
                                                class29.field473[var9++] = var300.field1927;
                                                class125 var301 = var300.method919(true);
                                                class258.field3995[var7++] = var301.field1989;
                                                class29.field473[var9++] = var301.field1991;
                                                class258.field3995[var7++] = var300.field4912;
                                            }
                                            continue;
                                        }
                                        if (var506 == 6502) {
                                            class120 var302 = class250.method1772((byte) -41);
                                            if (var302 == null) {
                                                class258.field3995[var7++] = -1;
                                                class258.field3995[var7++] = 0;
                                                class29.field473[var9++] = "";
                                                class258.field3995[var7++] = 0;
                                                class29.field473[var9++] = "";
                                                class258.field3995[var7++] = 0;
                                            } else {
                                                class258.field3995[var7++] = var302.field1932;
                                                class258.field3995[var7++] = var302.field4919;
                                                class29.field473[var9++] = var302.field1927;
                                                class125 var303 = var302.method919(true);
                                                class258.field3995[var7++] = var303.field1989;
                                                class29.field473[var9++] = var303.field1991;
                                                class258.field3995[var7++] = var302.field4912;
                                            }
                                            continue;
                                        }
                                        if (var506 == 6503) {
                                            var7--;
                                            int var304 = class258.field3995[var7];
                                            if (class22.field394 == 10 && class198.field3132 == 0 && class277.field4293 == 0 && class316.field4932 == 0) {
                                                class258.field3995[var7++] = class43.method352(var304, (byte) 96) ? 1 : 0;
                                                continue;
                                            }
                                            class258.field3995[var7++] = 0;
                                            continue;
                                        }
                                        if (var506 == 6504) {
                                            var7--;
                                            class34.field566 = class258.field3995[var7];
                                            class41.method334(class83.field1235, true);
                                            continue;
                                        }
                                        if (var506 == 6505) {
                                            class258.field3995[var7++] = class34.field566;
                                            continue;
                                        }
                                        if (var506 == 6506) {
                                            var7--;
                                            int var305 = class258.field3995[var7];
                                            class120 var306 = class183.method1379(arg2 - 16410, var305);
                                            if (var306 == null) {
                                                class258.field3995[var7++] = -1;
                                                class29.field473[var9++] = "";
                                                class258.field3995[var7++] = 0;
                                                class29.field473[var9++] = "";
                                                class258.field3995[var7++] = 0;
                                            } else {
                                                class258.field3995[var7++] = var306.field4919;
                                                class29.field473[var9++] = var306.field1927;
                                                class125 var307 = var306.method919(true);
                                                class258.field3995[var7++] = var307.field1989;
                                                class29.field473[var9++] = var307.field1991;
                                                class258.field3995[var7++] = var306.field4912;
                                            }
                                            continue;
                                        }
                                        if (var506 == 6507) {
                                            var7 -= 4;
                                            int var308 = class258.field3995[var7];
                                            boolean var309 = class258.field3995[var7 + 1] == 1;
                                            int var310 = class258.field3995[var7 + 2];
                                            boolean var311 = class258.field3995[var7 + 3] == 1;
                                            class197.method1435(var309, var311, var308, -127, var310);
                                            continue;
                                        }
                                    } else if (var506 < 6700) {
                                        if (var506 == 6600) {
                                            var7--;
                                            class39.field707 = class258.field3995[var7] == 1;
                                            class41.method334(class83.field1235, true);
                                            continue;
                                        }
                                        if (var506 == 6601) {
                                            class258.field3995[var7++] = class39.field707 ? 1 : 0;
                                            continue;
                                        }
                                    }
                                } else if (var506 == 4500) {
                                    var7 -= 2;
                                    int var370 = class258.field3995[var7];
                                    int var371 = class258.field3995[var7 + 1];
                                    class37 var372 = class185.method1392(var371, arg2 ^ 0x3F96);
                                    if (var372.method304(true)) {
                                        class29.field473[var9++] = class179.method1338(var370, arg2 - 38531).method1735((byte) -128, var372.field677, var371);
                                    } else {
                                        class258.field3995[var7++] = class179.method1338(var370, -22246).method1737((byte) -59, var372.field676, var371);
                                    }
                                    continue;
                                }
                            } else if (var506 == 4400) {
                                var7 -= 2;
                                int var373 = class258.field3995[var7];
                                int var374 = class258.field3995[var7 + 1];
                                class37 var375 = class185.method1392(var374, 11);
                                if (var375.method304(true)) {
                                    class29.field473[var9++] = class28.method190(-114, var373).method34(var375.field677, var374, 128);
                                } else {
                                    class258.field3995[var7++] = class28.method190(71, var373).method30(true, var374, var375.field676);
                                }
                                continue;
                            }
                        } else if (var506 == 4300) {
                            var7 -= 2;
                            int var376 = class258.field3995[var7];
                            int var377 = class258.field3995[var7 + 1];
                            class37 var378 = class185.method1392(var377, arg2 ^ 0x3F96);
                            if (var378.method304(true)) {
                                class29.field473[var9++] = class17.method145((byte) -109, var376).method1520((byte) -39, var378.field677, var377);
                            } else {
                                class258.field3995[var7++] = class17.method145((byte) 116, var376).method1517(var378.field676, var377, 11239);
                            }
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var505) {
            if (var5.field2169 == null) {
                if (class76.field1162 != 0) {
                    class252.method1782("Clientscript error - check log for details", 0, "", false);
                }
                class134.method1009(-2, "CS2 - scr:" + var5.field3734 + " op:" + var10, var505);
            } else {
                StringBuffer var502 = new StringBuffer(30);
                var502.append("%0a - in: ").append(var5.field2169);
                for (int var503 = class26.field434 - 1; var503 >= 0; var503--) {
                    var502.append("%0a - via: ").append(class318.field4943[var503].field1810.field2169);
                }
                if (var10 == 40) {
                    int var504 = var11[var6];
                    var502.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var504));
                }
                if (class76.field1162 != 0) {
                    class252.method1782("Clientscript error in: " + var5.field2169, 0, "", false);
                }
                class134.method1009(-2, "CS2 - scr:" + var5.field3734 + " op:" + var10 + var502.toString(), var505);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 6371)
    public final void method1936(int arg0) {
        if (arg0 != 5003) {
            return;
        }
        field4192++;
        if (this.field4188 == -1) {
            if (this.field4162 == null) {
                this.field4188 = 0;
            } else {
                this.field4188 = 2;
            }
        }
        if (this.field4176 != -1) {
            return;
        }
        if (this.field4162 == null) {
            this.field4176 = 0;
        } else {
            this.field4176 = 2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILpe;)V", line = 6400)
    private final void method1937(int arg0, int arg1, class101 arg2) {
        if (arg0 == 1) {
            int var4 = arg2.method731(false);
            this.field4165 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4165[var5] = arg2.method731(false);
            }
            this.field4183 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4183[var6] = arg2.method731(false);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4183[var7] += arg2.method731(false) << 16;
            }
        } else if (arg0 == 2) {
            this.field4174 = arg2.method731(false);
        } else if (arg0 == 3) {
            this.field4162 = new boolean[256];
            int var8 = arg2.method741(34);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4162[arg2.method741(118)] = true;
            }
        } else if (arg0 == 4) {
            this.field4180 = true;
        } else if (arg0 == 5) {
            this.field4187 = arg2.method741(arg1 - 25447);
        } else if (arg0 == 6) {
            this.field4186 = arg2.method731(false);
        } else if (arg0 == 7) {
            this.field4190 = arg2.method731(false);
        } else if (arg0 == 8) {
            this.field4189 = arg2.method741(115);
        } else if (arg0 == 9) {
            this.field4176 = arg2.method741(40);
        } else if (arg0 == 10) {
            this.field4188 = arg2.method741(12);
        } else if (arg0 == 11) {
            this.field4168 = arg2.method741(95);
        } else if (arg0 == 12) {
            int var14 = arg2.method741(58);
            this.field4185 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field4185[var15] = arg2.method731(false);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field4185[var16] = (arg2.method731(false) << 16) + this.field4185[var16];
            }
        } else if (arg0 == 13) {
            int var10 = arg2.method731(false);
            this.field4173 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg2.method741(arg1 ^ 0x63F5);
                if (var12 > 0) {
                    this.field4173[var11] = new int[var12];
                    this.field4173[var11][0] = arg2.method776(-1574267376);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field4173[var11][var13] = arg2.method731(false);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field4171 = true;
        } else if (arg0 == 15) {
            this.field4177 = true;
        } else if (arg0 == 16) {
            this.field4182 = true;
        }
        field4166++;
        if (arg1 != 25513) {
            this.method1942(53, -20, 47, 26, -122, (class199) null);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 6560)
    public static final void method1938(byte arg0) {
        field4164++;
        if (arg0 >= -4) {
            field4193 = (class230) null;
        }
        class308.method2132(0, (byte) -28, 0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)V", line = 6580)
    public static final void method1939(byte arg0, int arg1) {
        field4175++;
        class195.field3099.method1828(arg1, (byte) -39);
        class191.field3048.method1828(arg1, (byte) 105);
        if (arg0 > -10) {
            field4195 = (class296) null;
        }
        class98.field1623.method1828(arg1, (byte) -69);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIILfa;Z)Lfa;", line = 6594)
    public final class199 method1940(int arg0, int arg1, int arg2, class199 arg3, boolean arg4) {
        field4163++;
        int var6 = this.field4165[arg1];
        int var7 = this.field4183[arg1];
        class312 var8 = class240.method1702((byte) -98, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method1103(true, true, true);
        }
        if (!arg4) {
            this.field4180 = true;
        }
        class312 var10 = null;
        if ((this.field4177 || class68.field1094) && arg2 != -1 && arg2 < this.field4183.length) {
            int var11 = this.field4183[arg2];
            var10 = class240.method1702((byte) -98, var11 >> 16);
            arg2 = var11 & 0xFFFF;
        }
        class199 var12;
        if (var10 == null) {
            var12 = arg3.method1103(!var8.method2154(var9, -74), !var8.method2156(var9, -72), !this.field4171);
        } else {
            var12 = arg3.method1103(!var8.method2154(var9, -113) & !var10.method2154(arg2, -114), !var8.method2156(var9, 114) & !var10.method2156(arg2, 114), !this.field4171);
        }
        var12.method1444(var8, var9, var10, arg2, arg0 - 1, var6, this.field4171);
        return var12;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIII)V", line = 6634)
    public static final void method1941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg2 + 1;
        class86.method614(arg4, -24891, arg3, arg0, class102.field1729[arg2]);
        field4181++;
        int var10 = arg5 - 1;
        class86.method614(arg4, -24891, arg3, arg0, class102.field1729[arg5]);
        if (arg1 < 89) {
            method1935((class88) null, 91, -93);
        }
        for (int var6 = var9; var6 <= var10; var6++) {
            int[] var7 = class102.field1729[var6];
            var7[arg0] = var7[arg3] = arg4;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIILfa;)Lfa;", line = 6664)
    public final class199 method1942(int arg0, int arg1, int arg2, int arg3, int arg4, class199 arg5) {
        field4179++;
        int var7 = this.field4165[arg1];
        int var8 = this.field4183[arg1];
        class312 var9 = class240.method1702((byte) -98, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        int var11 = -123 / ((arg4 - 48) / 61);
        if (var9 == null) {
            return arg5.method1133(true, true, true);
        }
        int var12 = arg2 & 0x3;
        class312 var13 = null;
        if ((this.field4177 || class68.field1094) && arg0 != -1 && arg0 < this.field4183.length) {
            int var14 = this.field4183[arg0];
            var13 = class240.method1702((byte) -98, var14 >> 16);
            arg0 = var14 & 0xFFFF;
        }
        class199 var15;
        if (var13 == null) {
            var15 = arg5.method1133(!var9.method2154(var10, -98), !var9.method2156(var10, -25), !this.field4171);
        } else {
            var15 = arg5.method1133(!var9.method2154(var10, -105) & !var13.method2154(arg0, -118), !var9.method2156(var10, 119) & !var13.method2156(arg0, 127), !this.field4171);
        }
        if (this.field4171 && class265.field4126) {
            if (var12 == 1) {
                ((class171) var15).method1266();
            } else if (var12 == 2) {
                ((class171) var15).method1272();
            } else if (var12 == 3) {
                ((class171) var15).method1259();
            }
        } else if (var12 == 1) {
            var15.method1115();
        } else if (var12 == 2) {
            var15.method1112();
        } else if (var12 == 3) {
            var15.method1105();
        }
        var15.method1444(var9, var10, var13, arg0, arg3 - 1, var7, this.field4171);
        if (this.field4171 && class265.field4126) {
            if (var12 == 1) {
                ((class171) var15).method1259();
            } else if (var12 == 2) {
                ((class171) var15).method1272();
            } else if (var12 == 3) {
                ((class171) var15).method1266();
            }
        } else if (var12 == 1) {
            var15.method1105();
        } else if (var12 == 2) {
            var15.method1112();
        } else if (var12 == 3) {
            var15.method1115();
        }
        return var15;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZLfa;I)Lfa;", line = 6762)
    public final class199 method1943(int arg0, int arg1, boolean arg2, class199 arg3, int arg4) {
        field4178++;
        int var6 = this.field4165[arg1];
        int var7 = this.field4183[arg1];
        class312 var8 = class240.method1702((byte) -98, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method1133(true, true, true);
        }
        class312 var10 = null;
        if ((this.field4177 || class68.field1094) && arg0 != -1 && this.field4183.length > arg0) {
            int var11 = this.field4183[arg0];
            var10 = class240.method1702((byte) -98, var11 >> 16);
            arg0 = var11 & 0xFFFF;
        }
        class312 var12 = null;
        int var13 = 0;
        if (!arg2) {
            this.method1940(-2, -21, -56, (class199) null, true);
        }
        int var14 = 0;
        class312 var15 = null;
        if (this.field4185 != null) {
            if (arg1 < this.field4185.length) {
                var13 = this.field4185[arg1];
                if (var13 != 65535) {
                    var12 = class240.method1702((byte) -98, var13 >> 16);
                    var13 &= 0xFFFF;
                }
            }
            if ((this.field4177 || class68.field1094) && arg0 != -1 && this.field4185.length > arg0) {
                var14 = this.field4185[arg0];
                if (var14 != 65535) {
                    var15 = class240.method1702((byte) -98, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method2154(var9, -100);
        boolean var17 = !var8.method2156(var9, 4);
        if (var12 != null) {
            var16 &= !var12.method2154(var13, -92);
            var17 &= !var12.method2156(var13, 33);
        }
        if (var10 != null) {
            var16 &= !var10.method2154(arg0, -81);
            var17 &= !var10.method2156(arg0, 118);
        }
        if (var15 != null) {
            var16 &= !var15.method2154(var14, -91);
            var17 &= !var15.method2156(var14, -15);
        }
        class199 var18 = arg3.method1133(var16, var17, !this.field4171);
        var18.method1444(var8, var9, var10, arg0, arg4 - 1, var6, this.field4171);
        if (var12 != null) {
            var18.method1444(var12, var13, var15, var14, arg4 - 1, var6, this.field4171);
        }
        return var18;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLpe;)V", line = 6894)
    public final void method1944(boolean arg0, class101 arg1) {
        while (true) {
            int var3 = arg1.method741(77);
            if (var3 == 0) {
                if (arg0) {
                    return;
                }
                field4167++;
                return;
            }
            this.method1937(var3, 25513, arg1);
        }
    }
}
