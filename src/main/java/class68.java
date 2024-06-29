import java.awt.Image;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class68 extends class226 {

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field992 = -1;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field998 = 0;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "[C")
    public static char[] field997 = new char[] { '-', ' ', ' ', '_', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "[I")
    public static int[] field999 = new int[500];

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Ltl;")
    public class68 field987;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "Ltl;")
    public class68 field994;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field986;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
    public final void method426(int arg0) {
        field991++;
        if (this.field987 == null) {
            return;
        }
        this.field987.field994 = this.field994;
        this.field994.field987 = this.field987;
        int var2 = 68 / ((4 - arg0) / 53);
        this.field987 = null;
        this.field994 = null;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
    public static final void method427(byte arg0) {
        int var1 = -111 % ((arg0 - 26) / 42);
        class216.field3442 = null;
        class178.field2769 = null;
        class137.field2118 = null;
        class22.field282 = null;
        class92.field1406 = null;
        class225.field3573 = null;
        class179.field2779 = null;
        class78.field1244 = null;
        class202.field3233 = null;
        class144.field2263 = null;
        class11.field141 = null;
        field985++;
        class196.field3121 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lte;II)V")
    public static final void method428(class80 arg0, int arg1, int arg2) {
        class148.field2316 = 0;
        field1000++;
        int var3 = arg2;
        int[] var4 = arg0.field1270;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = arg0.field1266;
        byte var8 = -1;
        try {
            int var9 = 0;
            label4115: while (true) {
                var9++;
                if (var9 > arg1) {
                    throw new RuntimeException("slow");
                }
                var6++;
                int var538 = var4[var6];
                if (var538 < 100) {
                    if (var538 == 0) {
                        class20.field268[var3++] = var7[var6];
                        continue;
                    }
                    if (var538 == 1) {
                        int var10 = var7[var6];
                        class20.field268[var3++] = class209.field3356[var10];
                        continue;
                    }
                    if (var538 == 2) {
                        int var11 = var7[var6];
                        var3--;
                        class189.method1282((byte) 44, class20.field268[var3], var11);
                        continue;
                    }
                    if (var538 == 3) {
                        class204.field3286[var5++] = arg0.field1268[var6];
                        continue;
                    }
                    if (var538 == 6) {
                        var6 += var7[var6];
                        continue;
                    }
                    if (var538 == 7) {
                        var3 -= 2;
                        if (class20.field268[var3 + 1] != class20.field268[var3]) {
                            var6 += var7[var6];
                        }
                        continue;
                    }
                    if (var538 == 8) {
                        var3 -= 2;
                        if (class20.field268[var3 + 1] == class20.field268[var3]) {
                            var6 += var7[var6];
                        }
                        continue;
                    }
                    if (var538 == 9) {
                        var3 -= 2;
                        if (class20.field268[var3] < class20.field268[var3 + 1]) {
                            var6 += var7[var6];
                        }
                        continue;
                    }
                    if (var538 == 10) {
                        var3 -= 2;
                        if (class20.field268[var3] > class20.field268[var3 + 1]) {
                            var6 += var7[var6];
                        }
                        continue;
                    }
                    if (var538 == 21) {
                        if (class148.field2316 == 0) {
                            return;
                        }
                        class224 var12 = class141.field2182[--class148.field2316];
                        var6 = var12.field3563;
                        class246.field3925 = var12.field3560;
                        arg0 = var12.field3567;
                        class111.field1695 = var12.field3564;
                        var7 = arg0.field1266;
                        var4 = arg0.field1270;
                        continue;
                    }
                    if (var538 == 25) {
                        int var13 = var7[var6];
                        class20.field268[var3++] = class201.method1393(false, var13);
                        continue;
                    }
                    if (var538 == 27) {
                        int var14 = var7[var6];
                        var3--;
                        class313.method2118(var14, -86, class20.field268[var3]);
                        continue;
                    }
                    if (var538 == 31) {
                        var3 -= 2;
                        if (class20.field268[var3] <= class20.field268[var3 + 1]) {
                            var6 += var7[var6];
                        }
                        continue;
                    }
                    if (var538 == 32) {
                        var3 -= 2;
                        if (class20.field268[var3] >= class20.field268[var3 + 1]) {
                            var6 += var7[var6];
                        }
                        continue;
                    }
                    if (var538 == 33) {
                        class20.field268[var3++] = class246.field3925[var7[var6]];
                        continue;
                    }
                    int var10001;
                    if (var538 == 34) {
                        var10001 = var7[var6];
                        var3--;
                        class246.field3925[var10001] = class20.field268[var3];
                        continue;
                    }
                    if (var538 == 35) {
                        class204.field3286[var5++] = class111.field1695[var7[var6]];
                        continue;
                    }
                    if (var538 == 36) {
                        var10001 = var7[var6];
                        var5--;
                        class111.field1695[var10001] = class204.field3286[var5];
                        continue;
                    }
                    if (var538 == 37) {
                        int var15 = var7[var6];
                        var5 -= var15;
                        String var16 = class225.method1567(class204.field3286, var15, (byte) 11, var5);
                        class204.field3286[var5++] = var16;
                        continue;
                    }
                    if (var538 == 38) {
                        var3--;
                        continue;
                    }
                    if (var538 == 39) {
                        var5--;
                        continue;
                    }
                    if (var538 == 40) {
                        int var17 = var7[var6];
                        class80 var18 = class115.method724((byte) -49, var17);
                        int[] var19 = new int[var18.field1262];
                        String[] var20 = new String[var18.field1264];
                        for (int var21 = 0; var21 < var18.field1271; var21++) {
                            var19[var21] = class20.field268[var3 + var21 - var18.field1271];
                        }
                        for (int var22 = 0; var22 < var18.field1276; var22++) {
                            var20[var22] = class204.field3286[var5 - (var18.field1276 - var22)];
                        }
                        var5 -= var18.field1276;
                        var3 -= var18.field1271;
                        class224 var23 = new class224();
                        var23.field3564 = class111.field1695;
                        var23.field3560 = class246.field3925;
                        var23.field3563 = var6;
                        var23.field3567 = arg0;
                        if (class148.field2316 >= class141.field2182.length) {
                            throw new RuntimeException();
                        }
                        arg0 = var18;
                        class141.field2182[class148.field2316++] = var23;
                        class111.field1695 = var20;
                        var4 = var18.field1270;
                        class246.field3925 = var19;
                        var7 = var18.field1266;
                        var6 = -1;
                        continue;
                    }
                    if (var538 == 42) {
                        class20.field268[var3++] = class19.field260[var7[var6]];
                        continue;
                    }
                    if (var538 == 43) {
                        int var24 = var7[var6];
                        var3--;
                        class19.field260[var24] = class20.field268[var3];
                        class272.method1870(2272, var24);
                        continue;
                    }
                    if (var538 == 44) {
                        int var25 = var7[var6] & 0xFFFF;
                        var3--;
                        int var26 = class20.field268[var3];
                        int var27 = var7[var6] >> 16;
                        if (var26 >= 0 && var26 <= 5000) {
                            byte var28 = -1;
                            class25.field332[var27] = var26;
                            if (var25 == 105) {
                                var28 = 0;
                            }
                            int var29 = 0;
                            while (true) {
                                if (var26 <= var29) {
                                    continue label4115;
                                }
                                class168.field2620[var27][var29] = var28;
                                var29++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var538 == 45) {
                        int var30 = var7[var6];
                        var3--;
                        int var31 = class20.field268[var3];
                        if (var31 >= 0 && class25.field332[var30] > var31) {
                            class20.field268[var3++] = class168.field2620[var30][var31];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var538 == 46) {
                        int var32 = var7[var6];
                        var3 -= 2;
                        int var33 = class20.field268[var3];
                        if (var33 >= 0 && var33 < class25.field332[var32]) {
                            class168.field2620[var32][var33] = class20.field268[var3 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var538 == 47) {
                        String var34 = class16.field232[var7[var6]];
                        if (var34 == null) {
                            var34 = "null";
                        }
                        class204.field3286[var5++] = var34;
                        continue;
                    }
                    if (var538 == 48) {
                        int var35 = var7[var6];
                        var5--;
                        class16.field232[var35] = class204.field3286[var5];
                        class71.method444(var35, (byte) -126);
                        continue;
                    }
                    if (var538 == 51) {
                        class130 var36 = arg0.field1269[var7[var6]];
                        var3--;
                        class221 var37 = (class221) var36.method872((byte) -107, (long) class20.field268[var3]);
                        if (var37 != null) {
                            var6 += var37.field3542;
                        }
                        continue;
                    }
                }
                boolean var38;
                if (var7[var6] == 1) {
                    var38 = true;
                } else {
                    var38 = false;
                }
                if (var538 < 300) {
                    if (var538 == 100) {
                        var3 -= 3;
                        int var39 = class20.field268[var3];
                        int var40 = class20.field268[var3 + 2];
                        int var41 = class20.field268[var3 + 1];
                        if (var41 == 0) {
                            throw new RuntimeException();
                        }
                        class254 var42 = class80.method534(-64, var39);
                        if (var42.field4123 == null) {
                            var42.field4123 = new class254[var40 + 1];
                        }
                        if (var40 >= var42.field4123.length) {
                            class254[] var43 = new class254[var40 + 1];
                            for (int var44 = 0; var44 < var42.field4123.length; var44++) {
                                var43[var44] = var42.field4123[var44];
                            }
                            var42.field4123 = var43;
                        }
                        if (var40 > 0 && var42.field4123[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class254 var45 = new class254();
                        var45.field4167 = var45.field4077 = var42.field4077;
                        var45.field4040 = var40;
                        var45.field4181 = true;
                        var45.field4052 = var41;
                        var42.field4123[var40] = var45;
                        if (var38) {
                            class140.field2165 = var45;
                        } else {
                            class139.field2149 = var45;
                        }
                        class58.method354(true, var42);
                        continue;
                    }
                    if (var538 == 101) {
                        class254 var46 = var38 ? class140.field2165 : class139.field2149;
                        if (var46.field4040 == -1) {
                            if (var38) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class254 var47 = class80.method534(arg2 ^ 0x6C, var46.field4077);
                        var47.field4123[var46.field4040] = null;
                        class58.method354(true, var47);
                        continue;
                    }
                    if (var538 == 102) {
                        var3--;
                        class254 var48 = class80.method534(112, class20.field268[var3]);
                        var48.field4123 = null;
                        class58.method354(true, var48);
                        continue;
                    }
                    if (var538 == 200) {
                        var3 -= 2;
                        int var49 = class20.field268[var3];
                        int var50 = class20.field268[var3 + 1];
                        class254 var51 = class79.method529(var49, 116, var50);
                        if (var51 != null && var50 != -1) {
                            class20.field268[var3++] = 1;
                            if (var38) {
                                class140.field2165 = var51;
                            } else {
                                class139.field2149 = var51;
                            }
                            continue;
                        }
                        class20.field268[var3++] = 0;
                        continue;
                    }
                    if (var538 == 201) {
                        var3--;
                        int var52 = class20.field268[var3];
                        class254 var53 = class80.method534(96, var52);
                        if (var53 == null) {
                            class20.field268[var3++] = 0;
                        } else {
                            class20.field268[var3++] = 1;
                            if (var38) {
                                class140.field2165 = var53;
                            } else {
                                class139.field2149 = var53;
                            }
                        }
                        continue;
                    }
                } else if (var538 < 500) {
                    if (var538 == 403) {
                        var3 -= 2;
                        int var526 = class20.field268[var3];
                        int var527 = class20.field268[var3 + 1];
                        for (int var528 = 0; var528 < class301.field4941.length; var528++) {
                            if (class301.field4941[var528] == var526) {
                                class309.field5006.field3319.method1037(var527, var528, -98);
                                continue label4115;
                            }
                        }
                        int var529 = 0;
                        while (true) {
                            if (class313.field5049.length <= var529) {
                                continue label4115;
                            }
                            if (class313.field5049[var529] == var526) {
                                class309.field5006.field3319.method1037(var527, var529, -70);
                                continue label4115;
                            }
                            var529++;
                        }
                    }
                    if (var538 == 404) {
                        var3 -= 2;
                        int var530 = class20.field268[var3];
                        int var531 = class20.field268[var3 + 1];
                        class309.field5006.field3319.method1040(var531, var530, (byte) -109);
                        continue;
                    }
                    if (var538 == 410) {
                        var3--;
                        boolean var532 = class20.field268[var3] != 0;
                        class309.field5006.field3319.method1042(var532, 2982);
                        continue;
                    }
                } else if ((var538 < 1000 || var538 >= 1100) && (var538 < 2000 || var538 >= 2100)) {
                    int var10000;
                    if (var538 >= 1100 && var538 < 1200 || var538 >= 2100 && var538 < 2200) {
                        class254 var60;
                        if (var538 < 2000) {
                            var60 = var38 ? class140.field2165 : class139.field2149;
                        } else {
                            var538 -= 1000;
                            var10000 = arg2 ^ 0xFFFFFFAB;
                            var3--;
                            var60 = class80.method534(var10000, class20.field268[var3]);
                        }
                        if (var538 == 1100) {
                            var3 -= 2;
                            var60.field4175 = class20.field268[var3];
                            if (var60.field4175 > (var60.field4186 - var60.field4085)) {
                                var60.field4175 = var60.field4186 - var60.field4085;
                            }
                            if (var60.field4175 < 0) {
                                var60.field4175 = 0;
                            }
                            var60.field4125 = class20.field268[var3 + 1];
                            if (var60.field4125 > var60.field4081 - var60.field4152) {
                                var60.field4125 = var60.field4081 - var60.field4152;
                            }
                            if (var60.field4125 < 0) {
                                var60.field4125 = 0;
                            }
                            class58.method354(true, var60);
                            if (var60.field4040 == -1) {
                                class224.method1566((byte) 99, var60.field4077);
                            }
                            continue;
                        }
                        if (var538 == 1101) {
                            var3--;
                            var60.field4075 = class20.field268[var3];
                            class58.method354(true, var60);
                            if (var60.field4040 == -1) {
                                class149.method988(arg2 + 6, var60.field4077);
                            }
                            continue;
                        }
                        if (var538 == 1102) {
                            var3--;
                            var60.field4150 = class20.field268[var3] == 1;
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1103) {
                            var3--;
                            var60.field4025 = class20.field268[var3];
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1104) {
                            var3--;
                            var60.field4101 = class20.field268[var3];
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1105) {
                            var3--;
                            int var61 = class20.field268[var3];
                            if (var60.field4188 != var61) {
                                var60.field4188 = var61;
                                class58.method354(true, var60);
                            }
                            if (var60.field4040 == -1) {
                                class124.method817(var60.field4077, arg2 ^ 0xFFFFAF89);
                            }
                            continue;
                        }
                        if (var538 == 1106) {
                            var3--;
                            var60.field4190 = class20.field268[var3];
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1107) {
                            var3--;
                            var60.field4169 = class20.field268[var3] == 1;
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1108) {
                            var60.field4054 = 1;
                            var3--;
                            var60.field4073 = class20.field268[var3];
                            class58.method354(true, var60);
                            if (var60.field4040 == -1) {
                                class102.method667(false, var60.field4077);
                            }
                            continue;
                        }
                        if (var538 == 1109) {
                            var3 -= 6;
                            var60.field4047 = class20.field268[var3];
                            var60.field4080 = class20.field268[var3 + 1];
                            var60.field4139 = class20.field268[var3 + 2];
                            var60.field4154 = class20.field268[var3 + 3];
                            var60.field4191 = class20.field268[var3 + 4];
                            var60.field4093 = class20.field268[var3 + 5];
                            class58.method354(true, var60);
                            if (var60.field4040 == -1) {
                                class80.method536(var60.field4077, (byte) 126);
                                class18.method110(var60.field4077, -60);
                            }
                            continue;
                        }
                        if (var538 == 1110) {
                            var3--;
                            int var62 = class20.field268[var3];
                            if (var60.field4121 != var62) {
                                var60.field4165 = 0;
                                var60.field4121 = var62;
                                var60.field4033 = 0;
                                var60.field4117 = 1;
                                class58.method354(true, var60);
                            }
                            if (var60.field4040 == -1) {
                                class75.method494(var60.field4077, (byte) -75);
                            }
                            continue;
                        }
                        if (var538 == 1111) {
                            var3--;
                            var60.field4100 = class20.field268[var3] == 1;
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1112) {
                            var5--;
                            String var63 = class204.field3286[var5];
                            if (!var63.equals(var60.field4113)) {
                                var60.field4113 = var63;
                                class58.method354(true, var60);
                            }
                            if (var60.field4040 == -1) {
                                class125.method835(-124, var60.field4077);
                            }
                            continue;
                        }
                        if (var538 == 1113) {
                            var3--;
                            var60.field4137 = class20.field268[var3];
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1114) {
                            var3 -= 3;
                            var60.field4170 = class20.field268[var3];
                            var60.field4094 = class20.field268[var3 + 1];
                            var60.field4159 = class20.field268[var3 + 2];
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1115) {
                            var3--;
                            var60.field4189 = class20.field268[var3] == 1;
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1116) {
                            var3--;
                            var60.field4059 = class20.field268[var3];
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1117) {
                            var3--;
                            var60.field4135 = class20.field268[var3];
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1118) {
                            var3--;
                            var60.field4098 = class20.field268[var3] == 1;
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1119) {
                            var3--;
                            var60.field4045 = class20.field268[var3] == 1;
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1120) {
                            var3 -= 2;
                            var60.field4186 = class20.field268[var3];
                            var60.field4081 = class20.field268[var3 + 1];
                            class58.method354(true, var60);
                            if (var60.field4052 == 0) {
                                class58.method358(false, var60, (byte) -16);
                            }
                            continue;
                        }
                        if (var538 == 1121) {
                            var3 -= 2;
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1122) {
                            var3--;
                            var60.field4053 = class20.field268[var3] == 1;
                            class58.method354(true, var60);
                            continue;
                        }
                        if (var538 == 1123) {
                            var3--;
                            var60.field4093 = class20.field268[var3];
                            class58.method354(true, var60);
                            if (var60.field4040 == -1) {
                                class80.method536(var60.field4077, (byte) 125);
                            }
                            continue;
                        }
                        if (var538 == 1124) {
                            var3--;
                            int var64 = class20.field268[var3];
                            var60.field4142 = var64 == 1;
                            class58.method354(true, var60);
                            continue;
                        }
                    } else if (!(var538 < 1200 || var538 >= 1300) || !(var538 < 2200 || var538 >= 2300)) {
                        class254 var522;
                        if (var538 >= 2000) {
                            var538 -= 1000;
                            var3--;
                            var522 = class80.method534(-81, class20.field268[var3]);
                        } else {
                            var522 = var38 ? class140.field2165 : class139.field2149;
                        }
                        class58.method354(true, var522);
                        if (var538 == 1200 || var538 == 1205 || var538 == 1208 || var538 == 1209) {
                            var3 -= 2;
                            int var523 = class20.field268[var3 + 1];
                            int var524 = class20.field268[var3];
                            if (var522.field4040 == -1) {
                                class22.method126(var522.field4077, arg2 - 765);
                                class80.method536(var522.field4077, (byte) 124);
                                class18.method110(var522.field4077, -47);
                            }
                            if (var524 == -1) {
                                var522.field4174 = -1;
                                var522.field4073 = -1;
                                var522.field4054 = 1;
                                continue;
                            }
                            var522.field4174 = var524;
                            var522.field4183 = var523;
                            if (var538 == 1208 || var538 == 1209) {
                                var522.field4119 = true;
                            } else {
                                var522.field4119 = false;
                            }
                            class132 var525 = class14.method92(var524, false);
                            var522.field4139 = var525.field2049;
                            if (var538 == 1205) {
                                var522.field4148 = false;
                            } else {
                                var522.field4148 = true;
                            }
                            var522.field4154 = var525.field2038;
                            var522.field4093 = var525.field2091;
                            var522.field4080 = var525.field2061;
                            var522.field4191 = var525.field2076;
                            var522.field4047 = var525.field2046;
                            if (var522.field4122 > 0) {
                                var522.field4093 = var522.field4093 * 32 / var522.field4122;
                            } else if (var522.field4105 > 0) {
                                var522.field4093 = var522.field4093 * 32 / var522.field4105;
                            }
                            continue;
                        }
                        if (var538 == 1201) {
                            var522.field4054 = 2;
                            var3--;
                            var522.field4073 = class20.field268[var3];
                            if (var522.field4040 == -1) {
                                class102.method667(false, var522.field4077);
                            }
                            continue;
                        }
                        if (var538 == 1202) {
                            var522.field4054 = 3;
                            var522.field4073 = class309.field5006.field3319.method1032(-16406);
                            if (var522.field4040 == -1) {
                                class102.method667(false, var522.field4077);
                            }
                            continue;
                        }
                        if (var538 == 1203) {
                            var522.field4054 = 6;
                            var3--;
                            var522.field4073 = class20.field268[var3];
                            if (var522.field4040 == -1) {
                                class102.method667(false, var522.field4077);
                            }
                            continue;
                        }
                        if (var538 == 1204) {
                            var522.field4054 = 5;
                            var3--;
                            var522.field4073 = class20.field268[var3];
                            if (var522.field4040 == -1) {
                                class102.method667(false, var522.field4077);
                            }
                            continue;
                        }
                        if (var538 == 1206) {
                            var3 -= 4;
                            var522.field4128 = class20.field268[var3];
                            var522.field4162 = class20.field268[var3 + 1];
                            var522.field4089 = class20.field268[var3 + 2];
                            var522.field4028 = class20.field268[var3 + 3];
                            class58.method354(true, var522);
                            continue;
                        }
                        if (var538 == 1207) {
                            var3 -= 2;
                            var522.field4120 = class20.field268[var3];
                            var522.field4066 = class20.field268[var3 + 1];
                            class58.method354(true, var522);
                            continue;
                        }
                        if (var538 == 1211) {
                            var522.field4064 = 0;
                            var522.field4054 = 5;
                            var522.field4073 = 2047;
                            if (var522.field4040 == -1) {
                                class102.method667(false, var522.field4077);
                            }
                            continue;
                        }
                    } else if (var538 >= 1300 && var538 < 1400 || var538 >= 2300 && var538 < 2400) {
                        class254 var65;
                        if (var538 < 2000) {
                            var65 = var38 ? class140.field2165 : class139.field2149;
                        } else {
                            var10000 = arg2 + 113;
                            var3--;
                            var65 = class80.method534(var10000, class20.field268[var3]);
                            var538 -= 1000;
                        }
                        if (var538 == 1300) {
                            var3--;
                            int var66 = class20.field268[var3] - 1;
                            if (var66 >= 0 && var66 <= 9) {
                                var5--;
                                var65.method1762(class204.field3286[var5], var66, (byte) -121);
                                continue;
                            }
                            var5--;
                            continue;
                        }
                        if (var538 == 1301) {
                            var3 -= 2;
                            int var67 = class20.field268[var3];
                            int var68 = class20.field268[var3 + 1];
                            var65.field4042 = class79.method529(var67, 7, var68);
                            continue;
                        }
                        if (var538 == 1302) {
                            var3--;
                            var65.field4164 = class20.field268[var3] == 1;
                            continue;
                        }
                        if (var538 == 1303) {
                            var3--;
                            var65.field4156 = class20.field268[var3];
                            continue;
                        }
                        if (var538 == 1304) {
                            var3--;
                            var65.field4173 = class20.field268[var3];
                            continue;
                        }
                        if (var538 == 1305) {
                            var5--;
                            var65.field4146 = class204.field3286[var5];
                            continue;
                        }
                        if (var538 == 1306) {
                            var5--;
                            var65.field4095 = class204.field3286[var5];
                            continue;
                        }
                        if (var538 == 1307) {
                            var65.field4099 = null;
                            continue;
                        }
                        if (var538 == 1308) {
                            var3--;
                            var65.field4102 = class20.field268[var3];
                            var3--;
                            var65.field4067 = class20.field268[var3];
                            continue;
                        }
                        if (var538 == 1309) {
                            var3--;
                            int var69 = class20.field268[var3];
                            var3--;
                            int var70 = class20.field268[var3];
                            if (var70 >= 1 && var70 <= 10) {
                                var65.method1758(var69, false, var70 - 1);
                            }
                            continue;
                        }
                        if (var538 == 1310) {
                            var5--;
                            var65.field4171 = class204.field3286[var5];
                            continue;
                        }
                    } else {
                        if (var538 >= 1400 && var538 < 1500 || var538 >= 2400 && var538 < 2500) {
                            class254 var515;
                            if (var538 >= 2000) {
                                var538 -= 1000;
                                var3--;
                                var515 = class80.method534(-27, class20.field268[var3]);
                            } else {
                                var515 = var38 ? class140.field2165 : class139.field2149;
                            }
                            int[] var516 = null;
                            var5--;
                            String var517 = class204.field3286[var5];
                            if (var517.length() > 0 && var517.charAt(var517.length() - 1) == 'Y') {
                                var3--;
                                int var518 = class20.field268[var3];
                                if (var518 > 0) {
                                    var516 = new int[var518];
                                    while (var518-- > 0) {
                                        var3--;
                                        var516[var518] = class20.field268[var3];
                                    }
                                }
                                var517 = var517.substring(0, var517.length() - 1);
                            }
                            Object[] var519 = new Object[var517.length() + 1];
                            for (int var520 = var519.length - 1; var520 >= 1; var520--) {
                                if (var517.charAt(var520 - 1) == 's') {
                                    var5--;
                                    var519[var520] = class204.field3286[var5];
                                } else {
                                    var3--;
                                    var519[var520] = Integer.valueOf(class20.field268[var3]);
                                }
                            }
                            var3--;
                            int var521 = class20.field268[var3];
                            if (var521 == -1) {
                                var519 = null;
                            } else {
                                var519[0] = Integer.valueOf(var521);
                            }
                            if (var538 == 1400) {
                                var515.field4039 = var519;
                            } else if (var538 == 1401) {
                                var515.field4083 = var519;
                            } else if (var538 == 1402) {
                                var515.field4030 = var519;
                            } else if (var538 == 1403) {
                                var515.field4029 = var519;
                            } else if (var538 == 1404) {
                                var515.field4090 = var519;
                            } else if (var538 == 1405) {
                                var515.field4172 = var519;
                            } else if (var538 == 1406) {
                                var515.field4141 = var519;
                            } else if (var538 == 1407) {
                                var515.field4124 = var519;
                                var515.field4157 = var516;
                            } else if (var538 == 1408) {
                                var515.field4198 = var519;
                            } else if (var538 == 1409) {
                                var515.field4032 = var519;
                            } else if (var538 == 1410) {
                                var515.field4057 = var519;
                            } else if (var538 == 1411) {
                                var515.field4108 = var519;
                            } else if (var538 == 1412) {
                                var515.field4179 = var519;
                            } else if (var538 == 1414) {
                                var515.field4076 = var516;
                                var515.field4070 = var519;
                            } else if (var538 == 1415) {
                                var515.field4161 = var519;
                                var515.field4071 = var516;
                            } else if (var538 == 1416) {
                                var515.field4182 = var519;
                            } else if (var538 == 1417) {
                                var515.field4079 = var519;
                            } else if (var538 == 1418) {
                                var515.field4036 = var519;
                            } else if (var538 == 1419) {
                                var515.field4107 = var519;
                            } else if (var538 == 1420) {
                                var515.field4026 = var519;
                            } else if (var538 == 1421) {
                                var515.field4180 = var519;
                            } else if (var538 == 1422) {
                                var515.field4115 = var519;
                            } else if (var538 == 1423) {
                                var515.field4086 = var519;
                            } else if (var538 == 1424) {
                                var515.field4195 = var519;
                            } else if (var538 == 1425) {
                                var515.field4194 = var519;
                            } else if (var538 == 1426) {
                                var515.field4061 = var519;
                            } else if (var538 == 1427) {
                                var515.field4177 = var519;
                            } else if (var538 == 1428) {
                                var515.field4144 = var516;
                                var515.field4111 = var519;
                            } else if (var538 == 1429) {
                                var515.field4116 = var519;
                                var515.field4027 = var516;
                            }
                            var515.field4110 = true;
                            continue;
                        }
                        if (var538 < 1600) {
                            class254 var71 = var38 ? class140.field2165 : class139.field2149;
                            if (var538 == 1500) {
                                class20.field268[var3++] = var71.field4197;
                                continue;
                            }
                            if (var538 == 1501) {
                                class20.field268[var3++] = var71.field4200;
                                continue;
                            }
                            if (var538 == 1502) {
                                class20.field268[var3++] = var71.field4085;
                                continue;
                            }
                            if (var538 == 1503) {
                                class20.field268[var3++] = var71.field4152;
                                continue;
                            }
                            if (var538 == 1504) {
                                class20.field268[var3++] = var71.field4049 ? 1 : 0;
                                continue;
                            }
                            if (var538 == 1505) {
                                class20.field268[var3++] = var71.field4167;
                                continue;
                            }
                        } else if (var538 < 1700) {
                            class254 var72 = var38 ? class140.field2165 : class139.field2149;
                            if (var538 == 1600) {
                                class20.field268[var3++] = var72.field4175;
                                continue;
                            }
                            if (var538 == 1601) {
                                class20.field268[var3++] = var72.field4125;
                                continue;
                            }
                            if (var538 == 1602) {
                                class204.field3286[var5++] = var72.field4113;
                                continue;
                            }
                            if (var538 == 1603) {
                                class20.field268[var3++] = var72.field4186;
                                continue;
                            }
                            if (var538 == 1604) {
                                class20.field268[var3++] = var72.field4081;
                                continue;
                            }
                            if (var538 == 1605) {
                                class20.field268[var3++] = var72.field4093;
                                continue;
                            }
                            if (var538 == 1606) {
                                class20.field268[var3++] = var72.field4139;
                                continue;
                            }
                            if (var538 == 1607) {
                                class20.field268[var3++] = var72.field4191;
                                continue;
                            }
                            if (var538 == 1608) {
                                class20.field268[var3++] = var72.field4154;
                                continue;
                            }
                            if (var538 == 1609) {
                                class20.field268[var3++] = var72.field4025;
                                continue;
                            }
                            if (var538 == 1610) {
                                class20.field268[var3++] = var72.field4047;
                                continue;
                            }
                            if (var538 == 1611) {
                                class20.field268[var3++] = var72.field4080;
                                continue;
                            }
                            if (var538 == 1612) {
                                class20.field268[var3++] = var72.field4188;
                                continue;
                            }
                        } else if (var538 < 1800) {
                            class254 var514 = var38 ? class140.field2165 : class139.field2149;
                            if (var538 == 1700) {
                                class20.field268[var3++] = var514.field4174;
                                continue;
                            }
                            if (var538 == 1701) {
                                if (var514.field4174 == -1) {
                                    class20.field268[var3++] = 0;
                                } else {
                                    class20.field268[var3++] = var514.field4183;
                                }
                                continue;
                            }
                            if (var538 == 1702) {
                                class20.field268[var3++] = var514.field4040;
                                continue;
                            }
                        } else if (var538 < 1900) {
                            class254 var73 = var38 ? class140.field2165 : class139.field2149;
                            if (var538 == 1800) {
                                class20.field268[var3++] = client.method1085(var73).method1646((byte) -81);
                                continue;
                            }
                            if (var538 == 1801) {
                                var3--;
                                int var74 = class20.field268[var3];
                                int var539 = var74 - 1;
                                if (var73.field4099 != null && var539 < var73.field4099.length && var73.field4099[var539] != null) {
                                    class204.field3286[var5++] = var73.field4099[var539];
                                    continue;
                                }
                                class204.field3286[var5++] = "";
                                continue;
                            }
                            if (var538 == 1802) {
                                if (var73.field4146 == null) {
                                    class204.field3286[var5++] = "";
                                } else {
                                    class204.field3286[var5++] = var73.field4146;
                                }
                                continue;
                            }
                        } else if (var538 < 2600) {
                            var10000 = arg2 + 110;
                            var3--;
                            class254 var75 = class80.method534(var10000, class20.field268[var3]);
                            if (var538 == 2500) {
                                class20.field268[var3++] = var75.field4197;
                                continue;
                            }
                            if (var538 == 2501) {
                                class20.field268[var3++] = var75.field4200;
                                continue;
                            }
                            if (var538 == 2502) {
                                class20.field268[var3++] = var75.field4085;
                                continue;
                            }
                            if (var538 == 2503) {
                                class20.field268[var3++] = var75.field4152;
                                continue;
                            }
                            if (var538 == 2504) {
                                class20.field268[var3++] = var75.field4049 ? 1 : 0;
                                continue;
                            }
                            if (var538 == 2505) {
                                class20.field268[var3++] = var75.field4167;
                                continue;
                            }
                        } else if (var538 < 2700) {
                            var3--;
                            class254 var513 = class80.method534(105, class20.field268[var3]);
                            if (var538 == 2600) {
                                class20.field268[var3++] = var513.field4175;
                                continue;
                            }
                            if (var538 == 2601) {
                                class20.field268[var3++] = var513.field4125;
                                continue;
                            }
                            if (var538 == 2602) {
                                class204.field3286[var5++] = var513.field4113;
                                continue;
                            }
                            if (var538 == 2603) {
                                class20.field268[var3++] = var513.field4186;
                                continue;
                            }
                            if (var538 == 2604) {
                                class20.field268[var3++] = var513.field4081;
                                continue;
                            }
                            if (var538 == 2605) {
                                class20.field268[var3++] = var513.field4093;
                                continue;
                            }
                            if (var538 == 2606) {
                                class20.field268[var3++] = var513.field4139;
                                continue;
                            }
                            if (var538 == 2607) {
                                class20.field268[var3++] = var513.field4191;
                                continue;
                            }
                            if (var538 == 2608) {
                                class20.field268[var3++] = var513.field4154;
                                continue;
                            }
                            if (var538 == 2609) {
                                class20.field268[var3++] = var513.field4025;
                                continue;
                            }
                            if (var538 == 2610) {
                                class20.field268[var3++] = var513.field4047;
                                continue;
                            }
                            if (var538 == 2611) {
                                class20.field268[var3++] = var513.field4080;
                                continue;
                            }
                            if (var538 == 2612) {
                                class20.field268[var3++] = var513.field4188;
                                continue;
                            }
                        } else if (var538 < 2800) {
                            if (var538 == 2700) {
                                var3--;
                                class254 var503 = class80.method534(127, class20.field268[var3]);
                                class20.field268[var3++] = var503.field4174;
                                continue;
                            }
                            if (var538 == 2701) {
                                var3--;
                                class254 var504 = class80.method534(121, class20.field268[var3]);
                                if (var504.field4174 == -1) {
                                    class20.field268[var3++] = 0;
                                } else {
                                    class20.field268[var3++] = var504.field4183;
                                }
                                continue;
                            }
                            if (var538 == 2702) {
                                var3--;
                                int var505 = class20.field268[var3];
                                class229 var506 = (class229) class258.field4241.method872((byte) -94, (long) var505);
                                if (var506 == null) {
                                    class20.field268[var3++] = 0;
                                } else {
                                    class20.field268[var3++] = 1;
                                }
                                continue;
                            }
                            if (var538 == 2703) {
                                var3--;
                                class254 var507 = class80.method534(-109, class20.field268[var3]);
                                if (var507.field4123 == null) {
                                    class20.field268[var3++] = 0;
                                    continue;
                                }
                                int var508 = var507.field4123.length;
                                for (int var509 = 0; var509 < var507.field4123.length; var509++) {
                                    if (var507.field4123[var509] == null) {
                                        var508 = var509;
                                        break;
                                    }
                                }
                                class20.field268[var3++] = var508;
                                continue;
                            }
                            if (var538 == 2704 || var538 == 2705) {
                                var3 -= 2;
                                int var510 = class20.field268[var3];
                                int var511 = class20.field268[var3 + 1];
                                class229 var512 = (class229) class258.field4241.method872((byte) -92, (long) var510);
                                if (var512 != null && var512.field3658 == var511) {
                                    class20.field268[var3++] = 1;
                                } else {
                                    class20.field268[var3++] = 0;
                                }
                                continue;
                            }
                        } else if (var538 < 2900) {
                            var3--;
                            class254 var501 = class80.method534(-118, class20.field268[var3]);
                            if (var538 == 2800) {
                                class20.field268[var3++] = client.method1085(var501).method1646((byte) -89);
                                continue;
                            }
                            if (var538 == 2801) {
                                var3--;
                                int var502 = class20.field268[var3];
                                int var540 = var502 - 1;
                                if (var501.field4099 != null && var501.field4099.length > var540 && var501.field4099[var540] != null) {
                                    class204.field3286[var5++] = var501.field4099[var540];
                                    continue;
                                }
                                class204.field3286[var5++] = "";
                                continue;
                            }
                            if (var538 == 2802) {
                                if (var501.field4146 == null) {
                                    class204.field3286[var5++] = "";
                                } else {
                                    class204.field3286[var5++] = var501.field4146;
                                }
                                continue;
                            }
                        } else if (var538 < 3200) {
                            if (var538 == 3100) {
                                var5--;
                                String var486 = class204.field3286[var5];
                                class286.method2013((byte) -124, var486);
                                continue;
                            }
                            if (var538 == 3101) {
                                var3 -= 2;
                                class266.method1837(class20.field268[var3], class20.field268[var3 + 1], class309.field5006, 1);
                                continue;
                            }
                            if (var538 == 3103) {
                                class278.method1940(2);
                                continue;
                            }
                            if (var538 == 3104) {
                                class64.field956++;
                                var5--;
                                String var487 = class204.field3286[var5];
                                int var488 = 0;
                                if (class198.method1374(var487, -16928)) {
                                    var488 = class104.method672(var487, (byte) 19);
                                }
                                class276.field4572.method1391(0, 94);
                                class276.field4572.method1425(var488, (byte) -104);
                                continue;
                            }
                            if (var538 == 3105) {
                                class86.field1353++;
                                var5--;
                                String var489 = class204.field3286[var5];
                                class276.field4572.method1391(arg2, 226);
                                class276.field4572.method1446((byte) 117, var489.length() + 1);
                                class276.field4572.method1409(var489, (byte) 77);
                                continue;
                            }
                            if (var538 == 3106) {
                                class119.field1822++;
                                var5--;
                                String var490 = class204.field3286[var5];
                                class276.field4572.method1391(0, 70);
                                class276.field4572.method1446((byte) 124, var490.length() + 1);
                                class276.field4572.method1409(var490, (byte) 77);
                                continue;
                            }
                            if (var538 == 3107) {
                                var3--;
                                int var491 = class20.field268[var3];
                                var5--;
                                String var492 = class204.field3286[var5];
                                class287.method2019(var491, (byte) -61, var492);
                                continue;
                            }
                            if (var538 == 3108) {
                                var3 -= 3;
                                int var493 = class20.field268[var3];
                                int var494 = class20.field268[var3 + 1];
                                int var495 = class20.field268[var3 + 2];
                                class254 var496 = class80.method534(-128, var495);
                                class281.method1953(var496, var494, var493, arg2);
                                continue;
                            }
                            if (var538 == 3109) {
                                var3 -= 2;
                                int var497 = class20.field268[var3];
                                int var498 = class20.field268[var3 + 1];
                                class254 var499 = var38 ? class140.field2165 : class139.field2149;
                                class281.method1953(var499, var498, var497, 0);
                                continue;
                            }
                            if (var538 == 3110) {
                                var3--;
                                int var500 = class20.field268[var3];
                                class276.field4572.method1391(0, 146);
                                class15.field222++;
                                class276.field4572.method1412(var500, false);
                                continue;
                            }
                        } else if (var538 < 3300) {
                            if (var538 == 3200) {
                                var3 -= 3;
                                class78.method520(-1, class20.field268[var3 + 1], class20.field268[var3], class20.field268[var3 + 2], 255);
                                continue;
                            }
                            if (var538 == 3201) {
                                var3--;
                                class176.method1183(class20.field268[var3], 0, 255);
                                continue;
                            }
                            if (var538 == 3202) {
                                var3 -= 2;
                                class69.method435(class20.field268[var3 + 1], 255, class20.field268[var3], 13583);
                                continue;
                            }
                        } else if (var538 < 3400) {
                            if (var538 == 3300) {
                                class20.field268[var3++] = class4.field32;
                                continue;
                            }
                            if (var538 == 3301) {
                                var3 -= 2;
                                int var76 = class20.field268[var3];
                                int var77 = class20.field268[var3 + 1];
                                class20.field268[var3++] = class34.method193(var76, var77, arg2 - 13057);
                                continue;
                            }
                            if (var538 == 3302) {
                                var3 -= 2;
                                int var78 = class20.field268[var3];
                                int var79 = class20.field268[var3 + 1];
                                class20.field268[var3++] = class104.method674(var78, var79, -32206);
                                continue;
                            }
                            if (var538 == 3303) {
                                var3 -= 2;
                                int var80 = class20.field268[var3];
                                int var81 = class20.field268[var3 + 1];
                                class20.field268[var3++] = class282.method1970(72, var80, var81);
                                continue;
                            }
                            if (var538 == 3304) {
                                var3--;
                                int var82 = class20.field268[var3];
                                class20.field268[var3++] = class252.method1744(var82, 0).field4360;
                                continue;
                            }
                            if (var538 == 3305) {
                                var3--;
                                int var83 = class20.field268[var3];
                                class20.field268[var3++] = class189.field2911[var83];
                                continue;
                            }
                            if (var538 == 3306) {
                                var3--;
                                int var84 = class20.field268[var3];
                                class20.field268[var3++] = class177.field2757[var84];
                                continue;
                            }
                            if (var538 == 3307) {
                                var3--;
                                int var85 = class20.field268[var3];
                                class20.field268[var3++] = class113.field1710[var85];
                                continue;
                            }
                            if (var538 == 3308) {
                                int var86 = (class309.field5006.field836 >> 7) + class101.field1517;
                                int var87 = (class309.field5006.field850 >> 7) + class254.field4063;
                                int var88 = class165.field2600;
                                class20.field268[var3++] = (var86 << 14) + (var88 << 28) + var87;
                                continue;
                            }
                            if (var538 == 3309) {
                                var3--;
                                int var89 = class20.field268[var3];
                                class20.field268[var3++] = class10.method53(268431644, var89) >> 14;
                                continue;
                            }
                            if (var538 == 3310) {
                                var3--;
                                int var90 = class20.field268[var3];
                                class20.field268[var3++] = var90 >> 28;
                                continue;
                            }
                            if (var538 == 3311) {
                                var3--;
                                int var91 = class20.field268[var3];
                                class20.field268[var3++] = class10.method53(16383, var91);
                                continue;
                            }
                            if (var538 == 3312) {
                                class20.field268[var3++] = class141.field2180 ? 1 : 0;
                                continue;
                            }
                            if (var538 == 3313) {
                                var3 -= 2;
                                int var92 = class20.field268[var3] + 32768;
                                int var93 = class20.field268[var3 + 1];
                                class20.field268[var3++] = class34.method193(var92, var93, -13057);
                                continue;
                            }
                            if (var538 == 3314) {
                                var3 -= 2;
                                int var94 = class20.field268[var3] + 32768;
                                int var95 = class20.field268[var3 + 1];
                                class20.field268[var3++] = class104.method674(var94, var95, -32206);
                                continue;
                            }
                            if (var538 == 3315) {
                                var3 -= 2;
                                int var96 = class20.field268[var3] + 32768;
                                int var97 = class20.field268[var3 + 1];
                                class20.field268[var3++] = class282.method1970(arg2 - 92, var96, var97);
                                continue;
                            }
                            if (var538 == 3316) {
                                if (class37.field484 < 2) {
                                    class20.field268[var3++] = 0;
                                } else {
                                    class20.field268[var3++] = class37.field484;
                                }
                                continue;
                            }
                            if (var538 == 3317) {
                                class20.field268[var3++] = class296.field4871;
                                continue;
                            }
                            if (var538 == 3318) {
                                class20.field268[var3++] = class285.field4763;
                                continue;
                            }
                            if (var538 == 3321) {
                                class20.field268[var3++] = class212.field3388;
                                continue;
                            }
                            if (var538 == 3322) {
                                class20.field268[var3++] = class187.field2895;
                                continue;
                            }
                            if (var538 == 3323) {
                                if (class241.field3806 >= 5 && class241.field3806 <= 9) {
                                    class20.field268[var3++] = 1;
                                    continue;
                                }
                                class20.field268[var3++] = 0;
                                continue;
                            }
                            if (var538 == 3324) {
                                if (class241.field3806 >= 5 && class241.field3806 <= 9) {
                                    class20.field268[var3++] = class241.field3806;
                                    continue;
                                }
                                class20.field268[var3++] = 0;
                                continue;
                            }
                            if (var538 == 3325) {
                                class20.field268[var3++] = class63.field950 ? 1 : 0;
                                continue;
                            }
                            if (var538 == 3326) {
                                class20.field268[var3++] = class309.field5006.field3330;
                                continue;
                            }
                            if (var538 == 3327) {
                                class20.field268[var3++] = class309.field5006.field3319.field2478 ? 1 : 0;
                                continue;
                            }
                            if (var538 == 3328) {
                                class20.field268[var3++] = class45.field625 && !class302.field4951 ? 1 : 0;
                                continue;
                            }
                            if (var538 == 3329) {
                                class20.field268[var3++] = class124.field1894 ? 1 : 0;
                                continue;
                            }
                            if (var538 == 3330) {
                                var3--;
                                int var98 = class20.field268[var3];
                                class20.field268[var3++] = class300.method2075(var98, class93.method605(arg2, 1));
                                continue;
                            }
                            if (var538 == 3331) {
                                var3 -= 2;
                                int var99 = class20.field268[var3];
                                int var100 = class20.field268[var3 + 1];
                                class20.field268[var3++] = class271.method1863(var100, var99, (byte) 109, false);
                                continue;
                            }
                            if (var538 == 3332) {
                                var3 -= 2;
                                int var101 = class20.field268[var3];
                                int var102 = class20.field268[var3 + 1];
                                class20.field268[var3++] = class271.method1863(var102, var101, (byte) 109, true);
                                continue;
                            }
                            if (var538 == 3333) {
                                class20.field268[var3++] = class11.field146;
                                continue;
                            }
                            if (var538 == 3335) {
                                class20.field268[var3++] = class284.field4755;
                                continue;
                            }
                            if (var538 == 3336) {
                                var3 -= 4;
                                int var103 = class20.field268[var3 + 1];
                                int var104 = class20.field268[var3];
                                int var105 = class20.field268[var3 + 2];
                                int var106 = class20.field268[var3 + 3];
                                int var107 = (var103 << 14) + var104;
                                int var108 = (var105 << 28) + var107;
                                int var109 = var106 + var108;
                                class20.field268[var3++] = var109;
                                continue;
                            }
                            if (var538 == 3337) {
                                class20.field268[var3++] = class115.field1742;
                                continue;
                            }
                        } else if (var538 < 3500) {
                            if (var538 == 3400) {
                                var3 -= 2;
                                int var110 = class20.field268[var3];
                                int var111 = class20.field268[var3 + 1];
                                class124 var112 = class154.method1012(var110, false);
                                class204.field3286[var5++] = var112.method827(var111, (byte) 40);
                                continue;
                            }
                            if (var538 == 3408) {
                                var3 -= 4;
                                int var113 = class20.field268[var3];
                                int var114 = class20.field268[var3 + 1];
                                int var115 = class20.field268[var3 + 2];
                                int var116 = class20.field268[var3 + 3];
                                class124 var117 = class154.method1012(var115, false);
                                if (var117.field1907 == var113 && var117.field1898 == var114) {
                                    if (var114 == 115) {
                                        class204.field3286[var5++] = var117.method827(var116, (byte) 40);
                                    } else {
                                        class20.field268[var3++] = var117.method824(90, var116);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var538 == 3409) {
                                var3 -= 3;
                                int var118 = class20.field268[var3];
                                int var119 = class20.field268[var3 + 1];
                                int var120 = class20.field268[var3 + 2];
                                if (var119 == -1) {
                                    throw new RuntimeException("C3409-2");
                                }
                                class124 var121 = class154.method1012(var119, false);
                                if (var121.field1898 != var118) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class20.field268[var3++] = var121.method825(19697, var120) ? 1 : 0;
                                continue;
                            }
                            if (var538 == 3410) {
                                var3--;
                                int var122 = class20.field268[var3];
                                var5--;
                                String var123 = class204.field3286[var5];
                                if (var122 == -1) {
                                    throw new RuntimeException("C3410-2");
                                }
                                class124 var124 = class154.method1012(var122, false);
                                if (var124.field1898 != 's') {
                                    throw new RuntimeException("C3410-1");
                                }
                                class20.field268[var3++] = var124.method815(true, var123) ? 1 : 0;
                                continue;
                            }
                            if (var538 == 3411) {
                                var3--;
                                int var125 = class20.field268[var3];
                                class124 var126 = class154.method1012(var125, false);
                                class20.field268[var3++] = var126.field1897.method873(32);
                                continue;
                            }
                        } else if (var538 < 3700) {
                            if (var538 == 3600) {
                                if (class117.field1784 == 0) {
                                    class20.field268[var3++] = -2;
                                } else if (class117.field1784 == 1) {
                                    class20.field268[var3++] = -1;
                                } else {
                                    class20.field268[var3++] = class140.field2164;
                                }
                                continue;
                            }
                            if (var538 == 3601) {
                                var3--;
                                int var127 = class20.field268[var3];
                                if (class117.field1784 == 2 && class140.field2164 > var127) {
                                    class204.field3286[var5++] = class120.field1848[var127];
                                    if (class241.field3808[var127] == null) {
                                        class204.field3286[var5++] = "";
                                    } else {
                                        class204.field3286[var5++] = class241.field3808[var127];
                                    }
                                    continue;
                                }
                                class204.field3286[var5++] = "";
                                class204.field3286[var5++] = "";
                                continue;
                            }
                            if (var538 == 3602) {
                                var3--;
                                int var128 = class20.field268[var3];
                                if (class117.field1784 == 2 && var128 < class140.field2164) {
                                    class20.field268[var3++] = class69.field1013[var128];
                                    continue;
                                }
                                class20.field268[var3++] = 0;
                                continue;
                            }
                            if (var538 == 3603) {
                                var3--;
                                int var129 = class20.field268[var3];
                                if (class117.field1784 == 2 && var129 < class140.field2164) {
                                    class20.field268[var3++] = class53.field719[var129];
                                    continue;
                                }
                                class20.field268[var3++] = 0;
                                continue;
                            }
                            if (var538 == 3604) {
                                var5--;
                                String var130 = class204.field3286[var5];
                                var3--;
                                int var131 = class20.field268[var3];
                                class48.method298(var131, var130, (byte) 110);
                                continue;
                            }
                            if (var538 == 3605) {
                                var5--;
                                String var132 = class204.field3286[var5];
                                class45.method286(var132, -12319);
                                continue;
                            }
                            if (var538 == 3606) {
                                var5--;
                                String var133 = class204.field3286[var5];
                                class98.method636(arg2 ^ 0x1F39, var133);
                                continue;
                            }
                            if (var538 == 3607) {
                                var5--;
                                String var134 = class204.field3286[var5];
                                class245.method1715(var134, false, (byte) 64);
                                continue;
                            }
                            if (var538 == 3608) {
                                var5--;
                                String var135 = class204.field3286[var5];
                                class248.method1731(var135, arg2 ^ 0x7F);
                                continue;
                            }
                            if (var538 == 3609) {
                                var5--;
                                String var136 = class204.field3286[var5];
                                if (var136.startsWith("<img=0>") || var136.startsWith("<img=1>")) {
                                    var136 = var136.substring(7);
                                }
                                class20.field268[var3++] = class130.method858(80, var136) ? 1 : 0;
                                continue;
                            }
                            if (var538 == 3610) {
                                var3--;
                                int var137 = class20.field268[var3];
                                if (class117.field1784 == 2 && var137 < class140.field2164) {
                                    class204.field3286[var5++] = class277.field4593[var137];
                                    continue;
                                }
                                class204.field3286[var5++] = "";
                                continue;
                            }
                            if (var538 == 3611) {
                                if (class7.field68 == null) {
                                    class204.field3286[var5++] = "";
                                } else {
                                    class204.field3286[var5++] = class210.method1491(21950, class7.field68);
                                }
                                continue;
                            }
                            if (var538 == 3612) {
                                if (class7.field68 == null) {
                                    class20.field268[var3++] = 0;
                                } else {
                                    class20.field268[var3++] = class297.field4885;
                                }
                                continue;
                            }
                            if (var538 == 3613) {
                                var3--;
                                int var138 = class20.field268[var3];
                                if (class7.field68 != null && var138 < class297.field4885) {
                                    class204.field3286[var5++] = class276.field4567[var138].field2138;
                                    continue;
                                }
                                class204.field3286[var5++] = "";
                                continue;
                            }
                            if (var538 == 3614) {
                                var3--;
                                int var139 = class20.field268[var3];
                                if (class7.field68 != null && class297.field4885 > var139) {
                                    class20.field268[var3++] = class276.field4567[var139].field2144;
                                    continue;
                                }
                                class20.field268[var3++] = 0;
                                continue;
                            }
                            if (var538 == 3615) {
                                var3--;
                                int var140 = class20.field268[var3];
                                if (class7.field68 != null && var140 < class297.field4885) {
                                    class20.field268[var3++] = class276.field4567[var140].field2140;
                                    continue;
                                }
                                class20.field268[var3++] = 0;
                                continue;
                            }
                            if (var538 == 3616) {
                                class20.field268[var3++] = class236.field3747;
                                continue;
                            }
                            if (var538 == 3617) {
                                var5--;
                                String var141 = class204.field3286[var5];
                                class284.method2002(var141, 1);
                                continue;
                            }
                            if (var538 == 3618) {
                                class20.field268[var3++] = class252.field3991;
                                continue;
                            }
                            if (var538 == 3619) {
                                var5--;
                                String var142 = class204.field3286[var5];
                                class35.method202(2, var142);
                                continue;
                            }
                            if (var538 == 3620) {
                                class138.method922(-23232);
                                continue;
                            }
                            if (var538 == 3621) {
                                if (class117.field1784 == 0) {
                                    class20.field268[var3++] = -1;
                                } else {
                                    class20.field268[var3++] = class20.field270;
                                }
                                continue;
                            }
                            if (var538 == 3622) {
                                var3--;
                                int var143 = class20.field268[var3];
                                if (class117.field1784 != 0 && class20.field270 > var143) {
                                    class204.field3286[var5++] = class143.field2257[var143];
                                    if (class296.field4876[var143] == null) {
                                        class204.field3286[var5++] = "";
                                    } else {
                                        class204.field3286[var5++] = class296.field4876[var143];
                                    }
                                    continue;
                                }
                                class204.field3286[var5++] = "";
                                class204.field3286[var5++] = "";
                                continue;
                            }
                            if (var538 == 3623) {
                                var5--;
                                String var144 = class204.field3286[var5];
                                if (var144.startsWith("<img=0>") || var144.startsWith("<img=1>")) {
                                    var144 = var144.substring(7);
                                }
                                class20.field268[var3++] = class304.method2086(var144, 1) ? 1 : 0;
                                continue;
                            }
                            if (var538 == 3624) {
                                var3--;
                                int var145 = class20.field268[var3];
                                if (class276.field4567 != null && class297.field4885 > var145 && class276.field4567[var145].field2132.equalsIgnoreCase(class309.field5006.field3329)) {
                                    class20.field268[var3++] = 1;
                                    continue;
                                }
                                class20.field268[var3++] = 0;
                                continue;
                            }
                            if (var538 == 3625) {
                                if (class59.field904 == null) {
                                    class204.field3286[var5++] = "";
                                } else {
                                    class204.field3286[var5++] = class59.field904;
                                }
                                continue;
                            }
                            if (var538 == 3626) {
                                var3--;
                                int var146 = class20.field268[var3];
                                if (class7.field68 != null && class297.field4885 > var146) {
                                    class204.field3286[var5++] = class276.field4567[var146].field2137;
                                    continue;
                                }
                                class204.field3286[var5++] = "";
                                continue;
                            }
                            if (var538 == 3627) {
                                var3--;
                                int var147 = class20.field268[var3];
                                if (class117.field1784 == 2 && var147 >= 0 && class140.field2164 > var147) {
                                    class20.field268[var3++] = class175.field2738[var147] ? 1 : 0;
                                    continue;
                                }
                                class20.field268[var3++] = 0;
                                continue;
                            }
                            if (var538 == 3628) {
                                var5--;
                                String var148 = class204.field3286[var5];
                                if (var148.startsWith("<img=0>") || var148.startsWith("<img=1>")) {
                                    var148 = var148.substring(7);
                                }
                                class20.field268[var3++] = class34.method195(1430, var148);
                                continue;
                            }
                            if (var538 == 3629) {
                                class20.field268[var3++] = class280.field4630;
                                continue;
                            }
                            if (var538 == 3630) {
                                var5--;
                                String var149 = class204.field3286[var5];
                                class245.method1715(var149, true, (byte) 101);
                                continue;
                            }
                            if (var538 == 3631) {
                                var3--;
                                int var150 = class20.field268[var3];
                                class20.field268[var3++] = class6.field53[var150] ? 1 : 0;
                                continue;
                            }
                            if (var538 == 3632) {
                                var3--;
                                int var151 = class20.field268[var3];
                                if (class7.field68 != null && var151 < class297.field4885) {
                                    class204.field3286[var5++] = class276.field4567[var151].field2132;
                                    continue;
                                }
                                class204.field3286[var5++] = "";
                                continue;
                            }
                            if (var538 == 3633) {
                                var3--;
                                int var152 = class20.field268[var3];
                                if (class117.field1784 != 0 && var152 < class20.field270) {
                                    class204.field3286[var5++] = class174.field2714[var152];
                                    continue;
                                }
                                class204.field3286[var5++] = "";
                                continue;
                            }
                        } else if (var538 < 4000) {
                            if (var538 == 3903) {
                                var3--;
                                int var472 = class20.field268[var3];
                                class20.field268[var3++] = class160.field2529[var472].method2057(0);
                                continue;
                            }
                            if (var538 == 3904) {
                                var3--;
                                int var473 = class20.field268[var3];
                                class20.field268[var3++] = class160.field2529[var473].field4848;
                                continue;
                            }
                            if (var538 == 3905) {
                                var3--;
                                int var474 = class20.field268[var3];
                                class20.field268[var3++] = class160.field2529[var474].field4852;
                                continue;
                            }
                            if (var538 == 3906) {
                                var3--;
                                int var475 = class20.field268[var3];
                                class20.field268[var3++] = class160.field2529[var475].field4857;
                                continue;
                            }
                            if (var538 == 3907) {
                                var3--;
                                int var476 = class20.field268[var3];
                                class20.field268[var3++] = class160.field2529[var476].field4853;
                                continue;
                            }
                            if (var538 == 3908) {
                                var3--;
                                int var477 = class20.field268[var3];
                                class20.field268[var3++] = class160.field2529[var477].field4845;
                                continue;
                            }
                            if (var538 == 3910) {
                                var3--;
                                int var478 = class20.field268[var3];
                                int var479 = class160.field2529[var478].method2056((byte) -49);
                                class20.field268[var3++] = var479 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var538 == 3911) {
                                var3--;
                                int var480 = class20.field268[var3];
                                int var481 = class160.field2529[var480].method2056((byte) 127);
                                class20.field268[var3++] = var481 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var538 == 3912) {
                                var3--;
                                int var482 = class20.field268[var3];
                                int var483 = class160.field2529[var482].method2056((byte) 106);
                                class20.field268[var3++] = var483 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var538 == 3913) {
                                var3--;
                                int var484 = class20.field268[var3];
                                int var485 = class160.field2529[var484].method2056((byte) -120);
                                class20.field268[var3++] = var485 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var538 < 4100) {
                            if (var538 == 4000) {
                                var3 -= 2;
                                int var153 = class20.field268[var3 + 1];
                                int var154 = class20.field268[var3];
                                class20.field268[var3++] = var153 + var154;
                                continue;
                            }
                            if (var538 == 4001) {
                                var3 -= 2;
                                int var155 = class20.field268[var3 + 1];
                                int var156 = class20.field268[var3];
                                class20.field268[var3++] = var156 - var155;
                                continue;
                            }
                            if (var538 == 4002) {
                                var3 -= 2;
                                int var157 = class20.field268[var3];
                                int var158 = class20.field268[var3 + 1];
                                class20.field268[var3++] = var157 * var158;
                                continue;
                            }
                            if (var538 == 4003) {
                                var3 -= 2;
                                int var159 = class20.field268[var3 + 1];
                                int var160 = class20.field268[var3];
                                class20.field268[var3++] = var160 / var159;
                                continue;
                            }
                            if (var538 == 4004) {
                                var3--;
                                int var161 = class20.field268[var3];
                                class20.field268[var3++] = (int) ((double) var161 * Math.random());
                                continue;
                            }
                            if (var538 == 4005) {
                                var3--;
                                int var162 = class20.field268[var3];
                                class20.field268[var3++] = (int) (Math.random() * (double) (var162 + 1));
                                continue;
                            }
                            if (var538 == 4006) {
                                var3 -= 5;
                                int var163 = class20.field268[var3];
                                int var164 = class20.field268[var3 + 1];
                                int var165 = class20.field268[var3 + 3];
                                int var166 = class20.field268[var3 + 2];
                                int var167 = class20.field268[var3 + 4];
                                class20.field268[var3++] = var163 + ((var164 - var163) * (var167 - var166) / (var165 - var166));
                                continue;
                            }
                            if (var538 == 4007) {
                                var3 -= 2;
                                long var168 = (long) class20.field268[var3];
                                long var170 = (long) class20.field268[var3 + 1];
                                class20.field268[var3++] = (int) (var168 * var170 / 100L + var168);
                                continue;
                            }
                            if (var538 == 4008) {
                                var3 -= 2;
                                int var172 = class20.field268[var3];
                                int var173 = class20.field268[var3 + 1];
                                class20.field268[var3++] = class82.method554(0x1 << var173, var172);
                                continue;
                            }
                            if (var538 == 4009) {
                                var3 -= 2;
                                int var174 = class20.field268[var3];
                                int var175 = class20.field268[var3 + 1];
                                class20.field268[var3++] = class10.method53(-(0x1 << var175) - 1, var174);
                                continue;
                            }
                            if (var538 == 4010) {
                                var3 -= 2;
                                int var176 = class20.field268[var3 + 1];
                                int var177 = class20.field268[var3];
                                class20.field268[var3++] = class10.method53(0x1 << var176, var177) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var538 == 4011) {
                                var3 -= 2;
                                int var178 = class20.field268[var3];
                                int var179 = class20.field268[var3 + 1];
                                class20.field268[var3++] = var178 % var179;
                                continue;
                            }
                            if (var538 == 4012) {
                                var3 -= 2;
                                int var180 = class20.field268[var3];
                                int var181 = class20.field268[var3 + 1];
                                if (var180 == 0) {
                                    class20.field268[var3++] = 0;
                                } else {
                                    class20.field268[var3++] = (int) Math.pow((double) var180, (double) var181);
                                }
                                continue;
                            }
                            if (var538 == 4013) {
                                var3 -= 2;
                                int var182 = class20.field268[var3 + 1];
                                int var183 = class20.field268[var3];
                                if (var183 == 0) {
                                    class20.field268[var3++] = 0;
                                } else if (var182 == 0) {
                                    class20.field268[var3++] = Integer.MAX_VALUE;
                                } else {
                                    class20.field268[var3++] = (int) Math.pow((double) var183, 1.0D / (double) var182);
                                }
                                continue;
                            }
                            if (var538 == 4014) {
                                var3 -= 2;
                                int var184 = class20.field268[var3];
                                int var185 = class20.field268[var3 + 1];
                                class20.field268[var3++] = class10.method53(var185, var184);
                                continue;
                            }
                            if (var538 == 4015) {
                                var3 -= 2;
                                int var186 = class20.field268[var3 + 1];
                                int var187 = class20.field268[var3];
                                class20.field268[var3++] = class82.method554(var186, var187);
                                continue;
                            }
                            if (var538 == 4016) {
                                var3 -= 2;
                                int var188 = class20.field268[var3];
                                int var189 = class20.field268[var3 + 1];
                                class20.field268[var3++] = var189 <= var188 ? var189 : var188;
                                continue;
                            }
                            if (var538 == 4017) {
                                var3 -= 2;
                                int var190 = class20.field268[var3];
                                int var191 = class20.field268[var3 + 1];
                                class20.field268[var3++] = var191 < var190 ? var190 : var191;
                                continue;
                            }
                            if (var538 == 4018) {
                                var3 -= 3;
                                long var192 = (long) class20.field268[var3];
                                long var194 = (long) class20.field268[var3 + 1];
                                long var196 = (long) class20.field268[var3 + 2];
                                class20.field268[var3++] = (int) (var192 * var196 / var194);
                                continue;
                            }
                        } else if (var538 < 4200) {
                            if (var538 == 4100) {
                                var5--;
                                String var198 = class204.field3286[var5];
                                var3--;
                                int var199 = class20.field268[var3];
                                class204.field3286[var5++] = var198 + var199;
                                continue;
                            }
                            if (var538 == 4101) {
                                var5 -= 2;
                                String var200 = class204.field3286[var5 + 1];
                                String var201 = class204.field3286[var5];
                                class204.field3286[var5++] = var201 + var200;
                                continue;
                            }
                            if (var538 == 4102) {
                                var5--;
                                String var202 = class204.field3286[var5];
                                var3--;
                                int var203 = class20.field268[var3];
                                class204.field3286[var5++] = var202 + class196.method1362((byte) 82, true, var203);
                                continue;
                            }
                            if (var538 == 4103) {
                                var5--;
                                String var204 = class204.field3286[var5];
                                class204.field3286[var5++] = var204.toLowerCase();
                                continue;
                            }
                            if (var538 == 4104) {
                                var3--;
                                int var205 = class20.field268[var3];
                                long var206 = (long) var205 * 86400000L + 1014768000000L;
                                class284.field4753.setTime(new Date(var206));
                                int var208 = class284.field4753.get(5);
                                int var209 = class284.field4753.get(2);
                                int var210 = class284.field4753.get(1);
                                class204.field3286[var5++] = var208 + "-" + class2.field8[var209] + "-" + var210;
                                continue;
                            }
                            if (var538 == 4105) {
                                var5 -= 2;
                                String var211 = class204.field3286[var5 + 1];
                                String var212 = class204.field3286[var5];
                                if (class309.field5006.field3319 != null && class309.field5006.field3319.field2478) {
                                    class204.field3286[var5++] = var211;
                                    continue;
                                }
                                class204.field3286[var5++] = var212;
                                continue;
                            }
                            if (var538 == 4106) {
                                var3--;
                                int var213 = class20.field268[var3];
                                class204.field3286[var5++] = Integer.toString(var213);
                                continue;
                            }
                            if (var538 == 4107) {
                                var5 -= 2;
                                class20.field268[var3++] = class286.method2016(class154.method1013(class204.field3286[var5], class284.field4755, class204.field3286[var5 + 1], class93.method605(arg2, 81)), 1);
                                continue;
                            }
                            if (var538 == 4108) {
                                var3 -= 2;
                                var5--;
                                String var214 = class204.field3286[var5];
                                int var215 = class20.field268[var3];
                                int var216 = class20.field268[var3 + 1];
                                class20.field268[var3++] = class190.method1288(var216, -8227).method750(var214, var215);
                                continue;
                            }
                            if (var538 == 4109) {
                                var3 -= 2;
                                var5--;
                                String var217 = class204.field3286[var5];
                                int var218 = class20.field268[var3];
                                int var219 = class20.field268[var3 + 1];
                                class20.field268[var3++] = class190.method1288(var219, -8227).method734(var217, var218);
                                continue;
                            }
                            if (var538 == 4110) {
                                var5 -= 2;
                                String var220 = class204.field3286[var5 + 1];
                                String var221 = class204.field3286[var5];
                                var3--;
                                if (class20.field268[var3] == 1) {
                                    class204.field3286[var5++] = var221;
                                } else {
                                    class204.field3286[var5++] = var220;
                                }
                                continue;
                            }
                            if (var538 == 4111) {
                                var5--;
                                String var222 = class204.field3286[var5];
                                class204.field3286[var5++] = class116.method755(var222);
                                continue;
                            }
                            if (var538 == 4112) {
                                var5--;
                                String var223 = class204.field3286[var5];
                                var3--;
                                int var224 = class20.field268[var3];
                                if (var224 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class204.field3286[var5++] = var223 + (char) var224;
                                continue;
                            }
                            if (var538 == 4113) {
                                var3--;
                                int var225 = class20.field268[var3];
                                class20.field268[var3++] = class142.method950((char) var225, (byte) -15) ? 1 : 0;
                                continue;
                            }
                            if (var538 == 4114) {
                                var3--;
                                int var226 = class20.field268[var3];
                                class20.field268[var3++] = class79.method525((byte) -110, (char) var226) ? 1 : 0;
                                continue;
                            }
                            if (var538 == 4115) {
                                var3--;
                                int var227 = class20.field268[var3];
                                class20.field268[var3++] = class92.method598((char) var227, (byte) 125) ? 1 : 0;
                                continue;
                            }
                            if (var538 == 4116) {
                                var3--;
                                int var228 = class20.field268[var3];
                                class20.field268[var3++] = class40.method261(-1, (char) var228) ? 1 : 0;
                                continue;
                            }
                            if (var538 == 4117) {
                                var5--;
                                String var229 = class204.field3286[var5];
                                if (var229 == null) {
                                    class20.field268[var3++] = 0;
                                } else {
                                    class20.field268[var3++] = var229.length();
                                }
                                continue;
                            }
                            if (var538 == 4118) {
                                var3 -= 2;
                                var5--;
                                String var230 = class204.field3286[var5];
                                int var231 = class20.field268[var3 + 1];
                                int var232 = class20.field268[var3];
                                class204.field3286[var5++] = var230.substring(var232, var231);
                                continue;
                            }
                            if (var538 == 4119) {
                                var5--;
                                String var233 = class204.field3286[var5];
                                StringBuffer var234 = new StringBuffer(var233.length());
                                boolean var235 = false;
                                for (int var236 = 0; var236 < var233.length(); var236++) {
                                    char var237 = var233.charAt(var236);
                                    if (var237 == '<') {
                                        var235 = true;
                                    } else if (var237 == '>') {
                                        var235 = false;
                                    } else if (!var235) {
                                        var234.append(var237);
                                    }
                                }
                                class204.field3286[var5++] = var234.toString();
                                continue;
                            }
                            if (var538 == 4120) {
                                var3 -= 2;
                                var5--;
                                String var238 = class204.field3286[var5];
                                int var239 = class20.field268[var3];
                                int var240 = class20.field268[var3 + 1];
                                class20.field268[var3++] = var238.indexOf(var239, var240);
                                continue;
                            }
                            if (var538 == 4121) {
                                var5 -= 2;
                                String var241 = class204.field3286[var5 + 1];
                                String var242 = class204.field3286[var5];
                                var3--;
                                int var243 = class20.field268[var3];
                                class20.field268[var3++] = var242.indexOf(var241, var243);
                                continue;
                            }
                            if (var538 == 4122) {
                                var3--;
                                int var244 = class20.field268[var3];
                                class20.field268[var3++] = Character.toLowerCase((char) var244);
                                continue;
                            }
                            if (var538 == 4123) {
                                var3--;
                                int var245 = class20.field268[var3];
                                class20.field268[var3++] = Character.toUpperCase((char) var245);
                                continue;
                            }
                            if (var538 == 4124) {
                                var3--;
                                boolean var246 = class20.field268[var3] != 0;
                                var3--;
                                int var247 = class20.field268[var3];
                                class204.field3286[var5++] = class174.method1168(class284.field4755, 0, (long) var247, arg2 - 1, var246);
                                continue;
                            }
                        } else if (var538 < 4300) {
                            if (var538 == 4200) {
                                var3--;
                                int var248 = class20.field268[var3];
                                class204.field3286[var5++] = class14.method92(var248, false).field2071;
                                continue;
                            }
                            if (var538 == 4201) {
                                var3 -= 2;
                                int var249 = class20.field268[var3];
                                int var250 = class20.field268[var3 + 1];
                                class132 var251 = class14.method92(var249, false);
                                if (var250 >= 1 && var250 <= 5 && var251.field2044[var250 - 1] != null) {
                                    class204.field3286[var5++] = var251.field2044[var250 - 1];
                                    continue;
                                }
                                class204.field3286[var5++] = "";
                                continue;
                            }
                            if (var538 == 4202) {
                                var3 -= 2;
                                int var252 = class20.field268[var3];
                                int var253 = class20.field268[var3 + 1];
                                class132 var254 = class14.method92(var252, false);
                                if (var253 >= 1 && var253 <= 5 && var254.field2093[var253 - 1] != null) {
                                    class204.field3286[var5++] = var254.field2093[var253 - 1];
                                    continue;
                                }
                                class204.field3286[var5++] = "";
                                continue;
                            }
                            if (var538 == 4203) {
                                var3--;
                                int var255 = class20.field268[var3];
                                class20.field268[var3++] = class14.method92(var255, false).field2051;
                                continue;
                            }
                            if (var538 == 4204) {
                                var3--;
                                int var256 = class20.field268[var3];
                                class20.field268[var3++] = class14.method92(var256, false).field2050 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var538 == 4205) {
                                var3--;
                                int var257 = class20.field268[var3];
                                class132 var258 = class14.method92(var257, false);
                                if (var258.field2068 == -1 && var258.field2094 >= 0) {
                                    class20.field268[var3++] = var258.field2094;
                                    continue;
                                }
                                class20.field268[var3++] = var257;
                                continue;
                            }
                            if (var538 == 4206) {
                                var3--;
                                int var259 = class20.field268[var3];
                                class132 var260 = class14.method92(var259, false);
                                if (var260.field2068 >= 0 && var260.field2094 >= 0) {
                                    class20.field268[var3++] = var260.field2094;
                                    continue;
                                }
                                class20.field268[var3++] = var259;
                                continue;
                            }
                            if (var538 == 4207) {
                                var3--;
                                int var261 = class20.field268[var3];
                                class20.field268[var3++] = class14.method92(var261, false).field2077 ? 1 : 0;
                                continue;
                            }
                            if (var538 == 4208) {
                                var3 -= 2;
                                int var262 = class20.field268[var3];
                                int var263 = class20.field268[var3 + 1];
                                class139 var264 = class56.method338(var263, (byte) 120);
                                if (var264.method926(true)) {
                                    class204.field3286[var5++] = class14.method92(var262, false).method886(var263, (byte) -116, var264.field2148);
                                } else {
                                    class20.field268[var3++] = class14.method92(var262, false).method892(var263, var264.field2150, 74);
                                }
                                continue;
                            }
                            if (var538 == 4210) {
                                var5--;
                                String var265 = class204.field3286[var5];
                                var3--;
                                int var266 = class20.field268[var3];
                                class263.method1821((byte) 81, var265, var266 == 1);
                                class20.field268[var3++] = class231.field3704;
                                continue;
                            }
                            if (var538 == 4211) {
                                if (class230.field3684 != null && class29.field365 < class231.field3704) {
                                    class20.field268[var3++] = class10.method53(65535, class230.field3684[class29.field365++]);
                                    continue;
                                }
                                class20.field268[var3++] = -1;
                                continue;
                            }
                            if (var538 == 4212) {
                                class29.field365 = 0;
                                continue;
                            }
                        } else if (var538 >= 4400) {
                            if (var538 < 4500) {
                                if (var538 == 4400) {
                                    var3 -= 2;
                                    int var267 = class20.field268[var3];
                                    int var268 = class20.field268[var3 + 1];
                                    class139 var269 = class56.method338(var268, (byte) 97);
                                    if (var269.method926(true)) {
                                        class204.field3286[var5++] = class216.method1510(0, var267).method470(var269.field2148, 0, var268);
                                    } else {
                                        class20.field268[var3++] = class216.method1510(arg2, var267).method478(106, var269.field2150, var268);
                                    }
                                    continue;
                                }
                            } else if (var538 < 4600) {
                                if (var538 == 4500) {
                                    var3 -= 2;
                                    int var270 = class20.field268[var3];
                                    int var271 = class20.field268[var3 + 1];
                                    class139 var272 = class56.method338(var271, (byte) 68);
                                    if (var272.method926(true)) {
                                        class204.field3286[var5++] = class148.method984(-27185, var270).method1287(var271, var272.field2148, (byte) 121);
                                    } else {
                                        class20.field268[var3++] = class148.method984(-27185, var270).method1290(var271, var272.field2150, (byte) 121);
                                    }
                                    continue;
                                }
                            } else if (var538 < 5100) {
                                if (var538 == 5000) {
                                    class20.field268[var3++] = class187.field2899;
                                    continue;
                                }
                                if (var538 == 5001) {
                                    class56.field756++;
                                    var3 -= 3;
                                    class187.field2899 = class20.field268[var3];
                                    class113.field1705 = class20.field268[var3 + 1];
                                    class162.field2558 = class20.field268[var3 + 2];
                                    class276.field4572.method1391(0, 52);
                                    class276.field4572.method1446((byte) 92, class187.field2899);
                                    class276.field4572.method1446((byte) 71, class113.field1705);
                                    class276.field4572.method1446((byte) 110, class162.field2558);
                                    continue;
                                }
                                if (var538 == 5002) {
                                    class65.field961++;
                                    var5--;
                                    String var273 = class204.field3286[var5];
                                    var3 -= 2;
                                    int var274 = class20.field268[var3 + 1];
                                    int var275 = class20.field268[var3];
                                    class276.field4572.method1391(0, 185);
                                    class276.field4572.method1446((byte) 62, class187.method1270((byte) -92, var273) + 2);
                                    class276.field4572.method1409(var273, (byte) 77);
                                    class276.field4572.method1446((byte) 122, var275 - 1);
                                    class276.field4572.method1446((byte) 42, var274);
                                    continue;
                                }
                                if (var538 == 5003) {
                                    String var276 = null;
                                    var3--;
                                    int var277 = class20.field268[var3];
                                    if (var277 < 100) {
                                        var276 = class78.field1242[var277];
                                    }
                                    if (var276 == null) {
                                        var276 = "";
                                    }
                                    class204.field3286[var5++] = var276;
                                    continue;
                                }
                                if (var538 == 5004) {
                                    int var278 = -1;
                                    var3--;
                                    int var279 = class20.field268[var3];
                                    if (var279 < 100 && class78.field1242[var279] != null) {
                                        var278 = class157.field2477[var279];
                                    }
                                    class20.field268[var3++] = var278;
                                    continue;
                                }
                                if (var538 == 5005) {
                                    class20.field268[var3++] = class113.field1705;
                                    continue;
                                }
                                if (var538 == 5008) {
                                    var5--;
                                    String var280 = class204.field3286[var5];
                                    if (var280.startsWith("::")) {
                                        class311.method2113(91, var280);
                                        continue;
                                    }
                                    if (class37.field484 == 0 && (class45.field625 && !class302.field4951 || class124.field1894)) {
                                        continue;
                                    }
                                    class127.field1963++;
                                    String var281 = var280.toLowerCase();
                                    byte var282 = 0;
                                    byte var283 = 0;
                                    if (var281.startsWith(class296.field4861)) {
                                        var282 = 0;
                                        var280 = var280.substring(class296.field4861.length());
                                    } else if (var281.startsWith(class163.field2561)) {
                                        var282 = 1;
                                        var280 = var280.substring(class163.field2561.length());
                                    } else if (var281.startsWith(class229.field3656)) {
                                        var280 = var280.substring(class229.field3656.length());
                                        var282 = 2;
                                    } else if (var281.startsWith(class161.field2544)) {
                                        var280 = var280.substring(class161.field2544.length());
                                        var282 = 3;
                                    } else if (var281.startsWith(class229.field3661)) {
                                        var280 = var280.substring(class229.field3661.length());
                                        var282 = 4;
                                    } else if (var281.startsWith(class230.field3670)) {
                                        var282 = 5;
                                        var280 = var280.substring(class230.field3670.length());
                                    } else if (var281.startsWith(class36.field468)) {
                                        var280 = var280.substring(class36.field468.length());
                                        var282 = 6;
                                    } else if (var281.startsWith(class16.field228)) {
                                        var282 = 7;
                                        var280 = var280.substring(class16.field228.length());
                                    } else if (var281.startsWith(class268.field4404)) {
                                        var280 = var280.substring(class268.field4404.length());
                                        var282 = 8;
                                    } else if (var281.startsWith(class151.field2354)) {
                                        var280 = var280.substring(class151.field2354.length());
                                        var282 = 9;
                                    } else if (var281.startsWith(class225.field3572)) {
                                        var282 = 10;
                                        var280 = var280.substring(class225.field3572.length());
                                    } else if (var281.startsWith(class11.field143)) {
                                        var280 = var280.substring(class11.field143.length());
                                        var282 = 11;
                                    } else if (class284.field4755 != 0) {
                                        if (var281.startsWith(class138.field2143)) {
                                            var282 = 0;
                                            var280 = var280.substring(class138.field2143.length());
                                        } else if (var281.startsWith(class299.field4914)) {
                                            var280 = var280.substring(class299.field4914.length());
                                            var282 = 1;
                                        } else if (var281.startsWith(class93.field1415)) {
                                            var282 = 2;
                                            var280 = var280.substring(class93.field1415.length());
                                        } else if (var281.startsWith(class76.field1191)) {
                                            var280 = var280.substring(class76.field1191.length());
                                            var282 = 3;
                                        } else if (var281.startsWith(class196.field3116)) {
                                            var280 = var280.substring(class196.field3116.length());
                                            var282 = 4;
                                        } else if (var281.startsWith(class294.field4844)) {
                                            var280 = var280.substring(class294.field4844.length());
                                            var282 = 5;
                                        } else if (var281.startsWith(class204.field3290)) {
                                            var282 = 6;
                                            var280 = var280.substring(class204.field3290.length());
                                        } else if (var281.startsWith(class248.field3949)) {
                                            var280 = var280.substring(class248.field3949.length());
                                            var282 = 7;
                                        } else if (var281.startsWith(class78.field1238)) {
                                            var280 = var280.substring(class78.field1238.length());
                                            var282 = 8;
                                        } else if (var281.startsWith(class110.field1683)) {
                                            var282 = 9;
                                            var280 = var280.substring(class110.field1683.length());
                                        } else if (var281.startsWith(class50.field681)) {
                                            var280 = var280.substring(class50.field681.length());
                                            var282 = 10;
                                        } else if (var281.startsWith(class121.field1860)) {
                                            var282 = 11;
                                            var280 = var280.substring(class121.field1860.length());
                                        }
                                    }
                                    String var284 = var280.toLowerCase();
                                    if (var284.startsWith(class140.field2160)) {
                                        var280 = var280.substring(class140.field2160.length());
                                        var283 = 1;
                                    } else if (var284.startsWith(class181.field2804)) {
                                        var280 = var280.substring(class181.field2804.length());
                                        var283 = 2;
                                    } else if (var284.startsWith(class306.field4983)) {
                                        var280 = var280.substring(class306.field4983.length());
                                        var283 = 3;
                                    } else if (var284.startsWith(class258.field4235)) {
                                        var283 = 4;
                                        var280 = var280.substring(class258.field4235.length());
                                    } else if (var284.startsWith(class256.field4224)) {
                                        var283 = 5;
                                        var280 = var280.substring(class256.field4224.length());
                                    } else if (class284.field4755 != 0) {
                                        if (var284.startsWith(class131.field2014)) {
                                            var283 = 1;
                                            var280 = var280.substring(class131.field2014.length());
                                        } else if (var284.startsWith(class285.field4760)) {
                                            var283 = 2;
                                            var280 = var280.substring(class285.field4760.length());
                                        } else if (var284.startsWith(class98.field1470)) {
                                            var280 = var280.substring(class98.field1470.length());
                                            var283 = 3;
                                        } else if (var284.startsWith(class42.field588)) {
                                            var280 = var280.substring(class42.field588.length());
                                            var283 = 4;
                                        } else if (var284.startsWith(class218.field3489)) {
                                            var280 = var280.substring(class218.field3489.length());
                                            var283 = 5;
                                        }
                                    }
                                    class276.field4572.method1391(arg2, 112);
                                    class276.field4572.method1446((byte) 93, 0);
                                    int var285 = class276.field4572.field3272;
                                    class276.field4572.method1446((byte) 43, var282);
                                    class276.field4572.method1446((byte) 29, var283);
                                    class93.method604(29087, var280, class276.field4572);
                                    class276.field4572.method1408((byte) 46, class276.field4572.field3272 - var285);
                                    continue;
                                }
                                if (var538 == 5009) {
                                    var5 -= 2;
                                    String var286 = class204.field3286[var5 + 1];
                                    String var287 = class204.field3286[var5];
                                    if (class37.field484 != 0 || (!class45.field625 || class302.field4951) && !class124.field1894) {
                                        class276.field4572.method1391(arg2, 80);
                                        class276.field4572.method1446((byte) 112, 0);
                                        int var288 = class276.field4572.field3272;
                                        class169.field2631++;
                                        class276.field4572.method1409(var287, (byte) 77);
                                        class93.method604(29087, var286, class276.field4572);
                                        class276.field4572.method1408((byte) 46, class276.field4572.field3272 - var288);
                                    }
                                    continue;
                                }
                                if (var538 == 5010) {
                                    String var289 = null;
                                    var3--;
                                    int var290 = class20.field268[var3];
                                    if (var290 < 100) {
                                        var289 = class173.field2696[var290];
                                    }
                                    if (var289 == null) {
                                        var289 = "";
                                    }
                                    class204.field3286[var5++] = var289;
                                    continue;
                                }
                                if (var538 == 5011) {
                                    String var291 = null;
                                    var3--;
                                    int var292 = class20.field268[var3];
                                    if (var292 < 100) {
                                        var291 = class9.field111[var292];
                                    }
                                    if (var291 == null) {
                                        var291 = "";
                                    }
                                    class204.field3286[var5++] = var291;
                                    continue;
                                }
                                if (var538 == 5012) {
                                    var3--;
                                    int var293 = class20.field268[var3];
                                    int var294 = -1;
                                    if (var293 < 100) {
                                        var294 = class305.field4974[var293];
                                    }
                                    class20.field268[var3++] = var294;
                                    continue;
                                }
                                if (var538 == 5015) {
                                    String var295;
                                    if (class309.field5006 == null || class309.field5006.field3333 == null) {
                                        var295 = class217.field3453;
                                    } else {
                                        var295 = class309.field5006.method1477((byte) 119, true);
                                    }
                                    class204.field3286[var5++] = var295;
                                    continue;
                                }
                                if (var538 == 5018) {
                                    int var296 = 0;
                                    var3--;
                                    int var297 = class20.field268[var3];
                                    if (var297 < 100 && class78.field1242[var297] != null) {
                                        var296 = class157.field2477[var297];
                                    }
                                    class20.field268[var3++] = var296;
                                    continue;
                                }
                                if (var538 == 5019) {
                                    var3--;
                                    int var298 = class20.field268[var3];
                                    String var299 = null;
                                    if (var298 < 100) {
                                        var299 = class221.field3544[var298];
                                    }
                                    if (var299 == null) {
                                        var299 = "";
                                    }
                                    class204.field3286[var5++] = var299;
                                    continue;
                                }
                                if (var538 == 5016) {
                                    class20.field268[var3++] = class162.field2558;
                                    continue;
                                }
                                if (var538 == 5017) {
                                    class20.field268[var3++] = field998;
                                    continue;
                                }
                                if (var538 == 5050) {
                                    var3--;
                                    int var300 = class20.field268[var3];
                                    class204.field3286[var5++] = class277.method1928(32767, var300).field4952;
                                    continue;
                                }
                                if (var538 == 5051) {
                                    var3--;
                                    int var301 = class20.field268[var3];
                                    class302 var302 = class277.method1928(32767, var301);
                                    if (var302.field4943 == null) {
                                        class20.field268[var3++] = 0;
                                    } else {
                                        class20.field268[var3++] = var302.field4943.length;
                                    }
                                    continue;
                                }
                                if (var538 == 5052) {
                                    var3 -= 2;
                                    int var303 = class20.field268[var3];
                                    int var304 = class20.field268[var3 + 1];
                                    class302 var305 = class277.method1928(32767, var303);
                                    int var306 = var305.field4943[var304];
                                    class20.field268[var3++] = var306;
                                    continue;
                                }
                                if (var538 == 5053) {
                                    var3--;
                                    int var307 = class20.field268[var3];
                                    class302 var308 = class277.method1928(32767, var307);
                                    if (var308.field4945 == null) {
                                        class20.field268[var3++] = 0;
                                    } else {
                                        class20.field268[var3++] = var308.field4945.length;
                                    }
                                    continue;
                                }
                                if (var538 == 5054) {
                                    var3 -= 2;
                                    int var309 = class20.field268[var3 + 1];
                                    int var310 = class20.field268[var3];
                                    class20.field268[var3++] = class277.method1928(arg2 + 32767, var310).field4945[var309];
                                    continue;
                                }
                                if (var538 == 5055) {
                                    var3--;
                                    int var311 = class20.field268[var3];
                                    class204.field3286[var5++] = class79.method532(-32769, var311).method1176(false);
                                    continue;
                                }
                                if (var538 == 5056) {
                                    var3--;
                                    int var312 = class20.field268[var3];
                                    class174 var313 = class79.method532(arg2 - 32769, var312);
                                    if (var313.field2717 == null) {
                                        class20.field268[var3++] = 0;
                                    } else {
                                        class20.field268[var3++] = var313.field2717.length;
                                    }
                                    continue;
                                }
                                if (var538 == 5057) {
                                    var3 -= 2;
                                    int var314 = class20.field268[var3];
                                    int var315 = class20.field268[var3 + 1];
                                    class20.field268[var3++] = class79.method532(-32769, var314).field2717[var315];
                                    continue;
                                }
                                if (var538 == 5058) {
                                    class87.field1357 = new class151();
                                    var3--;
                                    class87.field1357.field2352 = class20.field268[var3];
                                    class87.field1357.field2353 = class79.method532(-32769, class87.field1357.field2352);
                                    class87.field1357.field2346 = new int[class87.field1357.field2353.method1166(arg2 ^ 0xFFFFFF88)];
                                    continue;
                                }
                                if (var538 == 5059) {
                                    class276.field4572.method1391(0, 86);
                                    field988++;
                                    class276.field4572.method1446((byte) 58, 0);
                                    int var316 = class276.field4572.field3272;
                                    class276.field4572.method1446((byte) 113, 0);
                                    class276.field4572.method1412(class87.field1357.field2352, false);
                                    class87.field1357.field2353.method1171((byte) 74, class87.field1357.field2346, class276.field4572);
                                    class276.field4572.method1408((byte) 46, class276.field4572.field3272 - var316);
                                    continue;
                                }
                                if (var538 == 5060) {
                                    class125.field1929++;
                                    var5--;
                                    String var317 = class204.field3286[var5];
                                    class276.field4572.method1391(0, 110);
                                    class276.field4572.method1446((byte) 124, 0);
                                    int var318 = class276.field4572.field3272;
                                    class276.field4572.method1409(var317, (byte) 77);
                                    class276.field4572.method1412(class87.field1357.field2352, false);
                                    class87.field1357.field2353.method1171((byte) 112, class87.field1357.field2346, class276.field4572);
                                    class276.field4572.method1408((byte) 46, class276.field4572.field3272 - var318);
                                    continue;
                                }
                                if (var538 == 5061) {
                                    field988++;
                                    class276.field4572.method1391(0, 86);
                                    class276.field4572.method1446((byte) 122, 0);
                                    int var319 = class276.field4572.field3272;
                                    class276.field4572.method1446((byte) 91, 1);
                                    class276.field4572.method1412(class87.field1357.field2352, false);
                                    class87.field1357.field2353.method1171((byte) 122, class87.field1357.field2346, class276.field4572);
                                    class276.field4572.method1408((byte) 46, class276.field4572.field3272 - var319);
                                    continue;
                                }
                                if (var538 == 5062) {
                                    var3 -= 2;
                                    int var320 = class20.field268[var3];
                                    int var321 = class20.field268[var3 + 1];
                                    class20.field268[var3++] = class277.method1928(32767, var320).field4954[var321];
                                    continue;
                                }
                                if (var538 == 5063) {
                                    var3 -= 2;
                                    int var322 = class20.field268[var3 + 1];
                                    int var323 = class20.field268[var3];
                                    class20.field268[var3++] = class277.method1928(arg2 + 32767, var323).field4944[var322];
                                    continue;
                                }
                                if (var538 == 5064) {
                                    var3 -= 2;
                                    int var324 = class20.field268[var3];
                                    int var325 = class20.field268[var3 + 1];
                                    if (var325 == -1) {
                                        class20.field268[var3++] = -1;
                                    } else {
                                        class20.field268[var3++] = class277.method1928(arg2 + 32767, var324).method2085((char) var325, class93.method605(arg2, 5733));
                                    }
                                    continue;
                                }
                                if (var538 == 5065) {
                                    var3 -= 2;
                                    int var326 = class20.field268[var3 + 1];
                                    int var327 = class20.field268[var3];
                                    if (var326 == -1) {
                                        class20.field268[var3++] = -1;
                                    } else {
                                        class20.field268[var3++] = class277.method1928(32767, var327).method2081((byte) -39, (char) var326);
                                    }
                                    continue;
                                }
                                if (var538 == 5066) {
                                    var3--;
                                    int var328 = class20.field268[var3];
                                    class20.field268[var3++] = class79.method532(-32769, var328).method1166(-126);
                                    continue;
                                }
                                if (var538 == 5067) {
                                    var3 -= 2;
                                    int var329 = class20.field268[var3];
                                    int var330 = class20.field268[var3 + 1];
                                    int var331 = class79.method532(arg2 ^ 0xFFFF7FFF, var329).method1175(var330, (byte) 43);
                                    class20.field268[var3++] = var331;
                                    continue;
                                }
                                if (var538 == 5068) {
                                    var3 -= 2;
                                    int var332 = class20.field268[var3 + 1];
                                    int var333 = class20.field268[var3];
                                    class87.field1357.field2346[var333] = var332;
                                    continue;
                                }
                                if (var538 == 5069) {
                                    var3 -= 2;
                                    int var334 = class20.field268[var3];
                                    int var335 = class20.field268[var3 + 1];
                                    class87.field1357.field2346[var334] = var335;
                                    continue;
                                }
                                if (var538 == 5070) {
                                    var3 -= 3;
                                    int var336 = class20.field268[var3];
                                    int var337 = class20.field268[var3 + 1];
                                    int var338 = class20.field268[var3 + 2];
                                    class174 var339 = class79.method532(-32769, var336);
                                    if (var339.method1175(var337, (byte) 43) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class20.field268[var3++] = var339.method1167(var338, var337, false);
                                    continue;
                                }
                                if (var538 == 5071) {
                                    var5--;
                                    String var340 = class204.field3286[var5];
                                    var3--;
                                    boolean var341 = class20.field268[var3] == 1;
                                    class60.method373(arg2 + 50, var341, var340);
                                    class20.field268[var3++] = class231.field3704;
                                    continue;
                                }
                                if (var538 == 5072) {
                                    if (class230.field3684 != null && class231.field3704 > class29.field365) {
                                        class20.field268[var3++] = class10.method53(65535, class230.field3684[class29.field365++]);
                                        continue;
                                    }
                                    class20.field268[var3++] = -1;
                                    continue;
                                }
                                if (var538 == 5073) {
                                    class29.field365 = 0;
                                    continue;
                                }
                            } else if (var538 < 5200) {
                                if (var538 == 5100) {
                                    if (class3.field26[86]) {
                                        class20.field268[var3++] = 1;
                                    } else {
                                        class20.field268[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var538 == 5101) {
                                    if (class3.field26[82]) {
                                        class20.field268[var3++] = 1;
                                    } else {
                                        class20.field268[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var538 == 5102) {
                                    if (class3.field26[81]) {
                                        class20.field268[var3++] = 1;
                                    } else {
                                        class20.field268[var3++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var538 < 5300) {
                                if (var538 == 5200) {
                                    var3--;
                                    class194.method1347(class20.field268[var3], (byte) 81);
                                    continue;
                                }
                                if (var538 == 5201) {
                                    class20.field268[var3++] = class150.method993((byte) 114);
                                    continue;
                                }
                                if (var538 == 5205) {
                                    var3--;
                                    class169.method1115(8, -1, class20.field268[var3], -1, false);
                                    continue;
                                }
                                if (var538 == 5206) {
                                    var3--;
                                    int var342 = class20.field268[var3];
                                    class218 var343 = class13.method77((var342 & 0xFFFD0ED) >> 14, var342 & 0x3FFF);
                                    if (var343 == null) {
                                        class20.field268[var3++] = -1;
                                    } else {
                                        class20.field268[var3++] = var343.field3464;
                                    }
                                    continue;
                                }
                                if (var538 == 5207) {
                                    var3--;
                                    class218 var344 = class13.method75(class20.field268[var3]);
                                    if (var344 != null && var344.field3477 != null) {
                                        class204.field3286[var5++] = var344.field3477;
                                        continue;
                                    }
                                    class204.field3286[var5++] = "";
                                    continue;
                                }
                                if (var538 == 5208) {
                                    class20.field268[var3++] = class89.field1375;
                                    class20.field268[var3++] = class48.field661;
                                    continue;
                                }
                                if (var538 == 5209) {
                                    class20.field268[var3++] = class187.field2897 + class13.field173;
                                    class20.field268[var3++] = class13.field165 + class13.field169 - class44.field606 - 1;
                                    continue;
                                }
                                if (var538 == 5210) {
                                    var3--;
                                    int var345 = class20.field268[var3];
                                    class218 var346 = class13.method75(var345);
                                    if (var346 == null) {
                                        class20.field268[var3++] = 0;
                                        class20.field268[var3++] = 0;
                                    } else {
                                        class20.field268[var3++] = class10.method53(var346.field3467 >> 14, 16383);
                                        class20.field268[var3++] = class10.method53(16383, var346.field3467);
                                    }
                                    continue;
                                }
                                if (var538 == 5211) {
                                    var3--;
                                    int var347 = class20.field268[var3];
                                    class218 var348 = class13.method75(var347);
                                    if (var348 == null) {
                                        class20.field268[var3++] = 0;
                                        class20.field268[var3++] = 0;
                                    } else {
                                        class20.field268[var3++] = var348.field3466 - var348.field3470;
                                        class20.field268[var3++] = var348.field3476 - var348.field3471;
                                    }
                                    continue;
                                }
                                if (var538 == 5212) {
                                    class314 var349 = class261.method1808(-10883);
                                    if (var349 == null) {
                                        class20.field268[var3++] = -1;
                                        class20.field268[var3++] = -1;
                                    } else {
                                        class20.field268[var3++] = var349.field5051;
                                        int var350 = var349.field5052 << 28 | class13.field173 + var349.field5065 << 14 | class13.field169 + class13.field165 - var349.field5056 - 1;
                                        class20.field268[var3++] = var350;
                                    }
                                    continue;
                                }
                                if (var538 == 5213) {
                                    class314 var351 = class141.method935(arg2 - 29743);
                                    if (var351 == null) {
                                        class20.field268[var3++] = -1;
                                        class20.field268[var3++] = -1;
                                    } else {
                                        class20.field268[var3++] = var351.field5051;
                                        int var352 = class13.field165 - (var351.field5056 - class13.field169) - 1 | class13.field173 + var351.field5065 << 14 | var351.field5052 << 28;
                                        class20.field268[var3++] = var352;
                                    }
                                    continue;
                                }
                                if (var538 == 5214) {
                                    var3--;
                                    int var353 = class20.field268[var3];
                                    class218 var354 = class25.method146(92);
                                    if (var354 != null) {
                                        boolean var355 = var354.method1526(false, var353 >> 14 & 0x3FFF, var353 & 0x3FFF, var353 >> 28 & 0x3, class159.field2515);
                                        if (var355) {
                                            class34.method199(class159.field2515[1], (byte) -124, class159.field2515[2]);
                                        }
                                    }
                                    continue;
                                }
                                if (var538 == 5215) {
                                    var3 -= 2;
                                    int var356 = class20.field268[var3];
                                    int var357 = class20.field268[var3 + 1];
                                    class177 var358 = class13.method69(var356 >> 14 & 0x3FFF, var356 & 0x3FFF);
                                    boolean var359 = false;
                                    for (class218 var360 = (class218) var358.method1187((byte) 127); var360 != null; var360 = (class218) var358.method1186(true)) {
                                        if (var360.field3464 == var357) {
                                            var359 = true;
                                            break;
                                        }
                                    }
                                    if (var359) {
                                        class20.field268[var3++] = 1;
                                    } else {
                                        class20.field268[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (var538 == 5218) {
                                    var3--;
                                    int var361 = class20.field268[var3];
                                    class218 var362 = class13.method75(var361);
                                    if (var362 == null) {
                                        class20.field268[var3++] = -1;
                                    } else {
                                        class20.field268[var3++] = var362.field3481;
                                    }
                                    continue;
                                }
                                if (var538 == 5220) {
                                    class20.field268[var3++] = class127.field1968 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 5221) {
                                    var3--;
                                    int var363 = class20.field268[var3];
                                    class34.method199(var363 >> 14 & 0x3FFF, (byte) -124, var363 & 0x3FFF);
                                    continue;
                                }
                                if (var538 == 5222) {
                                    class218 var364 = class25.method146(arg2 ^ 0xFFFFFF83);
                                    if (var364 == null) {
                                        class20.field268[var3++] = -1;
                                        class20.field268[var3++] = -1;
                                    } else {
                                        boolean var365 = var364.method1524(arg2 ^ 0x1A7A, class13.field165 + class13.field169 - class44.field606 - 1, class187.field2897 - -class13.field173, class159.field2515);
                                        if (var365) {
                                            class20.field268[var3++] = class159.field2515[1];
                                            class20.field268[var3++] = class159.field2515[2];
                                        } else {
                                            class20.field268[var3++] = -1;
                                            class20.field268[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var538 == 5223) {
                                    var3 -= 2;
                                    int var366 = class20.field268[var3 + 1];
                                    int var367 = class20.field268[var3];
                                    class169.method1115(arg2 + 8, var366 >> 14 & 0x3FFF, var367, var366 & 0x3FFF, false);
                                    continue;
                                }
                                if (var538 == 5224) {
                                    var3--;
                                    int var368 = class20.field268[var3];
                                    class218 var369 = class25.method146(arg2 ^ 0x24);
                                    if (var369 == null) {
                                        class20.field268[var3++] = -1;
                                        class20.field268[var3++] = -1;
                                    } else {
                                        boolean var370 = var369.method1526(false, (var368 & 0xFFFC3BE) >> 14, var368 & 0x3FFF, var368 >> 28 & 0x3, class159.field2515);
                                        if (var370) {
                                            class20.field268[var3++] = class159.field2515[1];
                                            class20.field268[var3++] = class159.field2515[2];
                                        } else {
                                            class20.field268[var3++] = -1;
                                            class20.field268[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var538 == 5225) {
                                    var3--;
                                    int var371 = class20.field268[var3];
                                    class218 var372 = class25.method146(arg2 + 93);
                                    if (var372 == null) {
                                        class20.field268[var3++] = -1;
                                        class20.field268[var3++] = -1;
                                    } else {
                                        boolean var373 = var372.method1524(arg2 ^ 0x1A7A, var371 & 0x3FFF, (var371 & 0xFFFDB36) >> 14, class159.field2515);
                                        if (var373) {
                                            class20.field268[var3++] = class159.field2515[1];
                                            class20.field268[var3++] = class159.field2515[2];
                                        } else {
                                            class20.field268[var3++] = -1;
                                            class20.field268[var3++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var538 == 5226) {
                                    var3--;
                                    class249.method1734(class20.field268[var3], -115);
                                    continue;
                                }
                                if (var538 == 5227) {
                                    var3 -= 2;
                                    int var374 = class20.field268[var3];
                                    int var375 = class20.field268[var3 + 1];
                                    class169.method1115(8, (var375 & 0xFFFD1DB) >> 14, var374, var375 & 0x3FFF, true);
                                    continue;
                                }
                                if (var538 == 5228) {
                                    var3--;
                                    class45.field624 = class20.field268[var3] == 1;
                                    continue;
                                }
                                if (var538 == 5229) {
                                    class20.field268[var3++] = class45.field624 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 5230) {
                                    var3--;
                                    int var376 = class20.field268[var3];
                                    class271.method1864(arg2 + 100, var376);
                                    continue;
                                }
                                if (var538 == 5231) {
                                    var3 -= 2;
                                    int var377 = class20.field268[var3];
                                    boolean var378 = class20.field268[var3 + 1] == 1;
                                    if (class75.field1183 == null) {
                                        continue;
                                    }
                                    class134 var379 = class75.field1183.method872((byte) -127, (long) var377);
                                    if (var379 != null && !var378) {
                                        var379.method900(45);
                                        continue;
                                    }
                                    if (var379 == null && var378) {
                                        class134 var380 = new class134();
                                        class75.field1183.method857(false, var380, (long) var377);
                                    }
                                    continue;
                                }
                                if (var538 == 5232) {
                                    var3--;
                                    int var381 = class20.field268[var3];
                                    if (class75.field1183 == null) {
                                        class20.field268[var3++] = 0;
                                    } else {
                                        class134 var382 = class75.field1183.method872((byte) -91, (long) var381);
                                        class20.field268[var3++] = var382 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var538 == 5233) {
                                    var3 -= 2;
                                    boolean var383 = class20.field268[var3 + 1] == 1;
                                    int var384 = class20.field268[var3];
                                    if (class145.field2289 == null) {
                                        continue;
                                    }
                                    class134 var385 = class145.field2289.method872((byte) -101, (long) var384);
                                    if (var385 != null && !var383) {
                                        var385.method900(69);
                                        continue;
                                    }
                                    if (var385 == null && var383) {
                                        class134 var386 = new class134();
                                        class145.field2289.method857(false, var386, (long) var384);
                                    }
                                    continue;
                                }
                                if (var538 == 5234) {
                                    var3--;
                                    int var387 = class20.field268[var3];
                                    if (class145.field2289 == null) {
                                        class20.field268[var3++] = 0;
                                    } else {
                                        class134 var388 = class145.field2289.method872((byte) -121, (long) var387);
                                        class20.field268[var3++] = var388 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var538 == 5235) {
                                    class20.field268[var3++] = class13.field171 == null ? -1 : class13.field171.field3464;
                                    continue;
                                }
                            } else if (var538 < 5400) {
                                if (var538 == 5300) {
                                    var3 -= 2;
                                    class20.field268[var3++] = 0;
                                    continue;
                                }
                                if (var538 == 5301) {
                                    continue;
                                }
                                if (var538 == 5302) {
                                    class20.field268[var3++] = 0;
                                    continue;
                                }
                                if (var538 == 5303) {
                                    var3--;
                                    class20.field268[var3++] = 0;
                                    class20.field268[var3++] = 0;
                                    continue;
                                }
                                if (var538 == 5305) {
                                    byte var466 = -1;
                                    class20.field268[var3++] = var466;
                                    continue;
                                }
                                if (var538 == 5306) {
                                    class20.field268[var3++] = class115.method725((byte) -49);
                                    continue;
                                }
                                if (var538 == 5307) {
                                    var3--;
                                    int var467 = class20.field268[var3];
                                    if (var467 < 0 || var467 > 2) {
                                        var467 = 0;
                                    }
                                    class204.method1463(false, -1, var467, false, -1);
                                    continue;
                                }
                                if (var538 == 5308) {
                                    class20.field268[var3++] = class258.field4245;
                                    continue;
                                }
                                if (var538 == 5309) {
                                    var3--;
                                    int var468 = class20.field268[var3];
                                    if (var468 < 0 || var468 > 2) {
                                        var468 = 0;
                                    }
                                    class258.field4245 = var468;
                                    class248.method1733(false, class259.field4254);
                                    continue;
                                }
                            } else if (var538 < 5500) {
                                if (var538 == 5400) {
                                    class106.field1590++;
                                    var5 -= 2;
                                    String var444 = class204.field3286[var5];
                                    String var445 = class204.field3286[var5 + 1];
                                    var3--;
                                    int var446 = class20.field268[var3];
                                    class276.field4572.method1391(0, 143);
                                    class276.field4572.method1446((byte) 96, class187.method1270((byte) -48, var444) - (-class187.method1270((byte) -99, var445) - 1));
                                    class276.field4572.method1409(var444, (byte) 77);
                                    class276.field4572.method1409(var445, (byte) 77);
                                    class276.field4572.method1446((byte) 65, var446);
                                    continue;
                                }
                                if (var538 == 5401) {
                                    var3 -= 2;
                                    class218.field3472[class20.field268[var3]] = (short) class33.method192(class20.field268[var3 + 1], false);
                                    class179.method1200(0);
                                    class256.method1788((byte) 76);
                                    class19.method117(-111);
                                    class125.method833(-1911116255);
                                    class268.method1842(arg2 ^ 0x35);
                                    continue;
                                }
                                if (var538 == 5405) {
                                    var3 -= 2;
                                    int var447 = class20.field268[var3 + 1];
                                    int var448 = class20.field268[var3];
                                    if (var448 >= 0 && var448 < 2) {
                                        class24.field313[var448] = new int[var447 << 1][4];
                                    }
                                    continue;
                                }
                                if (var538 == 5406) {
                                    var3 -= 7;
                                    int var449 = class20.field268[var3 + 1] << 1;
                                    int var450 = class20.field268[var3];
                                    int var451 = class20.field268[var3 + 3];
                                    int var452 = class20.field268[var3 + 2];
                                    int var453 = class20.field268[var3 + 5];
                                    int var454 = class20.field268[var3 + 6];
                                    int var455 = class20.field268[var3 + 4];
                                    if (var450 >= 0 && var450 < 2 && class24.field313[var450] != null && var449 >= 0 && class24.field313[var450].length > var449) {
                                        class24.field313[var450][var449] = new int[] { class10.method53(16383, var452 >> 14) * 128, var451, class10.method53(var452, 16383) * 128, var454 };
                                        class24.field313[var450][var449 + 1] = new int[] { class10.method53(16383, var455 >> 14) * 128, var453, class10.method53(var455, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var538 == 5407) {
                                    var3--;
                                    int var456 = class24.field313[class20.field268[var3]].length >> 1;
                                    class20.field268[var3++] = var456;
                                    continue;
                                }
                                if (var538 == 5411) {
                                    if (class224.field3565 == null) {
                                        class182.method1210(class230.method1619(0), true, false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var538 == 5419) {
                                    String var457 = "";
                                    if (class235.field3725 != null) {
                                        if (class235.field3725.field723 == null) {
                                            var457 = class143.method964((byte) 113, class235.field3725.field724);
                                        } else {
                                            var457 = (String) class235.field3725.field723;
                                        }
                                    }
                                    class204.field3286[var5++] = var457;
                                    continue;
                                }
                                if (var538 == 5420) {
                                    class20.field268[var3++] = class255.field4217 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 5421) {
                                    var5--;
                                    String var458 = class204.field3286[var5];
                                    var3--;
                                    boolean var459 = class20.field268[var3] == 1;
                                    String var460 = class230.method1619(arg2) + var458;
                                    if (class224.field3565 == null && (!var459 || class255.field4217 == 3 || !class255.field4203.startsWith("win") || class34.field420)) {
                                        class182.method1210(var460, true, var459);
                                        continue;
                                    }
                                    class212.field3387 = var459;
                                    class300.field4929 = var460;
                                    class104.field1569 = class259.field4254.method1786(92, var460);
                                    continue;
                                }
                                if (var538 == 5422) {
                                    var5 -= 2;
                                    var3--;
                                    int var461 = class20.field268[var3];
                                    String var462 = class204.field3286[var5 + 1];
                                    String var463 = class204.field3286[var5];
                                    if (var463.length() > 0) {
                                        if (class301.field4940 == null) {
                                            class301.field4940 = new String[class52.field710[class121.field1857]];
                                        }
                                        class301.field4940[var461] = var463;
                                    }
                                    if (var462.length() > 0) {
                                        if (class294.field4837 == null) {
                                            class294.field4837 = new String[class52.field710[class121.field1857]];
                                        }
                                        class294.field4837[var461] = var462;
                                    }
                                    continue;
                                }
                                if (var538 == 5423) {
                                    var5--;
                                    System.out.println(class204.field3286[var5]);
                                    continue;
                                }
                                if (var538 == 5424) {
                                    var3 -= 11;
                                    class259.field4251 = class20.field268[var3];
                                    class48.field664 = class20.field268[var3 + 1];
                                    class27.field344 = class20.field268[var3 + 2];
                                    class161.field2539 = class20.field268[var3 + 3];
                                    class124.field1902 = class20.field268[var3 + 4];
                                    class195.field3078 = class20.field268[var3 + 5];
                                    class59.field898 = class20.field268[var3 + 6];
                                    class299.field4916 = class20.field268[var3 + 7];
                                    class262.field4332 = class20.field268[var3 + 8];
                                    class67.field981 = class20.field268[var3 + 9];
                                    class16.field230 = class20.field268[var3 + 10];
                                    class3.field22.method1874(class124.field1902, 3883);
                                    class3.field22.method1874(class195.field3078, arg2 + 3883);
                                    class3.field22.method1874(class59.field898, 3883);
                                    class3.field22.method1874(class299.field4916, 3883);
                                    class3.field22.method1874(class262.field4332, 3883);
                                    class163.field2563 = true;
                                    continue;
                                }
                                if (var538 == 5425) {
                                    class183.method1216((byte) 27);
                                    class163.field2563 = false;
                                    continue;
                                }
                                if (var538 == 5426) {
                                    var3--;
                                    class246.field3926 = class20.field268[var3];
                                    continue;
                                }
                                if (var538 == 5427) {
                                    var3 -= 2;
                                    class19.field258 = class20.field268[var3];
                                    class208.field3325 = class20.field268[var3 + 1];
                                    continue;
                                }
                                if (var538 == 5428) {
                                    var3 -= 2;
                                    int var464 = class20.field268[var3];
                                    int var465 = class20.field268[var3 + 1];
                                    class20.field268[var3++] = class245.method1716(var464, var465, 20) ? 1 : 0;
                                    continue;
                                }
                            } else if (var538 < 5600) {
                                if (var538 == 5500) {
                                    var3 -= 4;
                                    int var427 = class20.field268[var3];
                                    int var428 = class20.field268[var3 + 1];
                                    int var429 = class20.field268[var3 + 2];
                                    int var430 = class20.field268[var3 + 3];
                                    class12.method65(((var427 & 0xFFFCD41) >> 14) - class101.field1517, var430, false, var428, (byte) 46, var429, (var427 & 0x3FFF) - class254.field4063);
                                    continue;
                                }
                                if (var538 == 5501) {
                                    var3 -= 4;
                                    int var431 = class20.field268[var3];
                                    int var432 = class20.field268[var3 + 1];
                                    int var433 = class20.field268[var3 + 3];
                                    int var434 = class20.field268[var3 + 2];
                                    class150.method991(var434, arg2 ^ 0xFFFFDE69, var433, var432, (var431 >> 14 & 0x3FFF) - class101.field1517, (var431 & 0x3FFF) + -class254.field4063);
                                    continue;
                                }
                                if (var538 == 5502) {
                                    var3 -= 6;
                                    int var435 = class20.field268[var3];
                                    if (var435 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class310.field5018 = var435;
                                    int var436 = class20.field268[var3 + 1];
                                    if (class24.field313[class310.field5018].length >> 1 <= var436 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class111.field1697 = var436;
                                    class262.field4329 = 0;
                                    class307.field4984 = class20.field268[var3 + 2];
                                    class154.field2406 = class20.field268[var3 + 3];
                                    int var437 = class20.field268[var3 + 4];
                                    if (var437 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class117.field1778 = var437;
                                    int var438 = class20.field268[var3 + 5];
                                    if (class24.field313[class117.field1778].length >> 1 <= var438 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class92.field1402 = 3;
                                    class18.field249 = var438;
                                    continue;
                                }
                                if (var538 == 5503) {
                                    class301.method2079((byte) -64);
                                    continue;
                                }
                                if (var538 == 5504) {
                                    var3 -= 2;
                                    class223.method1560(class20.field268[var3], arg2 ^ 0xFFFFFF8F, class20.field268[var3 + 1]);
                                    continue;
                                }
                                if (var538 == 5505) {
                                    class20.field268[var3++] = (int) class79.field1255;
                                    continue;
                                }
                                if (var538 == 5506) {
                                    class20.field268[var3++] = (int) class202.field3253;
                                    continue;
                                }
                                if (var538 == 5507) {
                                    class275.method1917(false);
                                    continue;
                                }
                                if (var538 == 5508) {
                                    class111.method715(-103);
                                    continue;
                                }
                                if (var538 == 5509) {
                                    class137.method918(92);
                                    continue;
                                }
                                if (var538 == 5510) {
                                    class216.method1508(-118);
                                    continue;
                                }
                                if (var538 == 5511) {
                                    var3--;
                                    int var439 = class20.field268[var3];
                                    int var440 = (var439 & 0xFFFEEEC) >> 14;
                                    int var441 = var439 & 0x3FFF;
                                    class92.field1402 = 4;
                                    int var442 = var441 - class254.field4063;
                                    if (var442 < 0) {
                                        var442 = 0;
                                    } else if (var442 >= 104) {
                                        var442 = 104;
                                    }
                                    class49.field677 = var442 * 128 + 64;
                                    int var443 = var440 - class101.field1517;
                                    if (var443 < 0) {
                                        var443 = 0;
                                    } else if (var443 >= 104) {
                                        var443 = 104;
                                    }
                                    class274.field4531 = var443 * 128 + 64;
                                    continue;
                                }
                                if (var538 == 5512) {
                                    class288.method2023(arg2 ^ 0xC0AE5);
                                    continue;
                                }
                            } else if (var538 < 5700) {
                                if (var538 == 5600) {
                                    var5 -= 2;
                                    String var389 = class204.field3286[var5 + 1];
                                    var3--;
                                    int var390 = class20.field268[var3];
                                    String var391 = class204.field3286[var5];
                                    if (class115.field1733 == 10 && class189.field2916 == 0 && class4.field34 == 0 && class52.field708 == 0 && class7.field61 == 0) {
                                        class41.method262(var389, var390, -116, var391);
                                    }
                                    continue;
                                }
                                if (var538 == 5601) {
                                    class148.method983((byte) -125);
                                    continue;
                                }
                                if (var538 == 5602) {
                                    if (class4.field34 == 0) {
                                        class198.field3133 = -2;
                                    }
                                    continue;
                                }
                                if (var538 == 5603) {
                                    var3 -= 4;
                                    if (class115.field1733 == 10 && class189.field2916 == 0 && class4.field34 == 0 && class52.field708 == 0 && class7.field61 == 0) {
                                        class72.method462(class20.field268[var3], false, class20.field268[var3 + 2], class20.field268[var3 + 1], class20.field268[var3 + 3]);
                                    }
                                    continue;
                                }
                                if (var538 == 5604) {
                                    var5--;
                                    if (class115.field1733 == 10 && class189.field2916 == 0 && class4.field34 == 0 && class52.field708 == 0 && class7.field61 == 0) {
                                        class217.method1517((byte) -99, class294.method2051(-58, class204.field3286[var5]));
                                    }
                                    continue;
                                }
                                if (var538 == 5605) {
                                    var3 -= 7;
                                    var5 -= 3;
                                    if (class115.field1733 == 10 && class189.field2916 == 0 && class4.field34 == 0 && class52.field708 == 0 && class7.field61 == 0) {
                                        class118.method773(class20.field268[var3 + 1], (byte) 117, class204.field3286[var5 + 2], class20.field268[var3 + 5] == 1, class20.field268[var3 + 4] == 1, class20.field268[var3 + 2], class20.field268[var3 + 6] == 1, class20.field268[var3 + 3], class204.field3286[var5 + 1], class20.field268[var3], class294.method2051(40, class204.field3286[var5]));
                                    }
                                    continue;
                                }
                                if (var538 == 5606) {
                                    if (class52.field708 == 0) {
                                        class248.field3947 = -2;
                                    }
                                    continue;
                                }
                                if (var538 == 5607) {
                                    class20.field268[var3++] = class198.field3133;
                                    continue;
                                }
                                if (var538 == 5608) {
                                    class20.field268[var3++] = class183.field2847;
                                    continue;
                                }
                                if (var538 == 5609) {
                                    class20.field268[var3++] = class248.field3947;
                                    continue;
                                }
                                if (var538 == 5610) {
                                    for (int var392 = 0; var392 < 5; var392++) {
                                        class204.field3286[var5++] = var392 >= class146.field2298.length ? "" : class210.method1491(21950, class146.field2298[var392]);
                                    }
                                    class146.field2298 = null;
                                    continue;
                                }
                                if (var538 == 5611) {
                                    class20.field268[var3++] = class80.field1265;
                                    continue;
                                }
                            } else if (var538 < 6100) {
                                if (var538 == 6001) {
                                    var3--;
                                    int var418 = class20.field268[var3];
                                    if (var418 < 1) {
                                        var418 = 1;
                                    }
                                    if (var418 > 4) {
                                        var418 = 4;
                                    }
                                    class73.field1067 = var418;
                                    if (class73.field1067 == 1) {
                                        class172.method1137(0.9F);
                                    }
                                    if (class73.field1067 == 2) {
                                        class172.method1137(0.8F);
                                    }
                                    if (class73.field1067 == 3) {
                                        class172.method1137(0.7F);
                                    }
                                    if (class73.field1067 == 4) {
                                        class172.method1137(0.6F);
                                    }
                                    class256.method1788((byte) 76);
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6002) {
                                    var3--;
                                    class80.method537(class20.field268[var3] == 1, -60);
                                    class181.method1208(arg2 - 97);
                                    class130.method865(arg2 ^ 0xFFFFFF82);
                                    class45.method285((byte) -111);
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6003) {
                                    var3--;
                                    class208.field3342 = class20.field268[var3] == 1;
                                    class45.method285((byte) -111);
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6005) {
                                    var3--;
                                    class123.field1878 = class20.field268[var3] == 1;
                                    class130.method865(-126);
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6006) {
                                    var3--;
                                    class51.field687 = class20.field268[var3] == 1;
                                    ((class266) class172.field2670).method1838(!class51.field687, arg2 ^ 0x63);
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6007) {
                                    var3--;
                                    class12.field160 = class20.field268[var3] == 1;
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6008) {
                                    var3--;
                                    class135.field2113 = class20.field268[var3] == 1;
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6009) {
                                    var3--;
                                    class182.field2830 = class20.field268[var3] == 1;
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6010) {
                                    var3--;
                                    class180.field2800 = class20.field268[var3] == 1;
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6011) {
                                    var3--;
                                    int var419 = class20.field268[var3];
                                    if (var419 < 0 || var419 > 2) {
                                        var419 = 0;
                                    }
                                    class163.field2567 = var419;
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6012) {
                                    var3--;
                                    class272.field4462 = class20.field268[var3] == 1;
                                    if (class73.field1067 == 1) {
                                        class172.method1137(0.9F);
                                    }
                                    if (class73.field1067 == 2) {
                                        class172.method1137(0.8F);
                                    }
                                    if (class73.field1067 == 3) {
                                        class172.method1137(0.7F);
                                    }
                                    if (class73.field1067 == 4) {
                                        class172.method1137(0.6F);
                                    }
                                    class130.method865(75);
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6014) {
                                    var3--;
                                    class176.field2746 = class20.field268[var3] == 1;
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6015) {
                                    var3--;
                                    class143.field2228 = class20.field268[var3] == 1;
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6016) {
                                    var3--;
                                    int var420 = class20.field268[var3];
                                    if (var420 < 0 || var420 > 2) {
                                        var420 = 0;
                                    }
                                    class230.field3687 = var420;
                                    continue;
                                }
                                if (var538 == 6017) {
                                    var3--;
                                    class175.field2740 = class20.field268[var3] == 1;
                                    class60.method375((byte) -109);
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6018) {
                                    var3--;
                                    int var421 = class20.field268[var3];
                                    if (var421 < 0) {
                                        var421 = 0;
                                    }
                                    if (var421 > 127) {
                                        var421 = 127;
                                    }
                                    class11.field145 = var421;
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6019) {
                                    var3--;
                                    int var422 = class20.field268[var3];
                                    if (var422 < 0) {
                                        var422 = 0;
                                    }
                                    if (var422 > 255) {
                                        var422 = 255;
                                    }
                                    if (class223.field3550 != var422) {
                                        if (class223.field3550 == 0 && class35.field441 != -1) {
                                            class35.method201(false, class35.field441, (byte) 126, class274.field4518, var422, 0);
                                            class6.field52 = false;
                                        } else if (var422 == 0) {
                                            class210.method1490((byte) 121);
                                            class6.field52 = false;
                                        } else {
                                            class284.method2007((byte) -53, var422);
                                        }
                                        class223.field3550 = var422;
                                    }
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6020) {
                                    var3--;
                                    int var423 = class20.field268[var3];
                                    if (var423 < 0) {
                                        var423 = 0;
                                    }
                                    if (var423 > 127) {
                                        var423 = 127;
                                    }
                                    class19.field257 = var423;
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    continue;
                                }
                                if (var538 == 6021) {
                                    var3--;
                                    class175.field2736 = class20.field268[var3] == 1;
                                    class45.method285((byte) -111);
                                    continue;
                                }
                                if (var538 == 6023) {
                                    var3--;
                                    int var424 = class20.field268[var3];
                                    if (var424 < 0) {
                                        var424 = 0;
                                    }
                                    if (var424 > 2) {
                                        var424 = 2;
                                    }
                                    boolean var425 = false;
                                    if (class93.field1412 < 96) {
                                        var425 = true;
                                        var424 = 0;
                                    }
                                    class77.method504(var424);
                                    class248.method1733(false, class259.field4254);
                                    class217.field3462 = false;
                                    class20.field268[var3++] = var425 ? 0 : 1;
                                    continue;
                                }
                                if (var538 == 6024) {
                                    var3--;
                                    int var426 = class20.field268[var3];
                                    if (var426 < 0 || var426 > 2) {
                                        var426 = 0;
                                    }
                                    class218.field3463 = var426;
                                    class248.method1733(false, class259.field4254);
                                    continue;
                                }
                                if (var538 == 6027) {
                                    var3--;
                                    continue;
                                }
                                if (var538 == 6028) {
                                    var3--;
                                    class144.field2261 = class20.field268[var3] != 0;
                                    class248.method1733(false, class259.field4254);
                                    continue;
                                }
                            } else if (var538 < 6200) {
                                if (var538 == 6101) {
                                    class20.field268[var3++] = class73.field1067;
                                    continue;
                                }
                                if (var538 == 6102) {
                                    class20.field268[var3++] = class165.method1108(0) ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6103) {
                                    class20.field268[var3++] = class208.field3342 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6105) {
                                    class20.field268[var3++] = class123.field1878 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6106) {
                                    class20.field268[var3++] = class51.field687 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6107) {
                                    class20.field268[var3++] = class12.field160 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6108) {
                                    class20.field268[var3++] = class135.field2113 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6109) {
                                    class20.field268[var3++] = class182.field2830 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6110) {
                                    class20.field268[var3++] = class180.field2800 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6111) {
                                    class20.field268[var3++] = class163.field2567;
                                    continue;
                                }
                                if (var538 == 6112) {
                                    class20.field268[var3++] = class272.field4462 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6114) {
                                    class20.field268[var3++] = class176.field2746 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6115) {
                                    class20.field268[var3++] = class143.field2228 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6116) {
                                    class20.field268[var3++] = class230.field3687;
                                    continue;
                                }
                                if (var538 == 6117) {
                                    class20.field268[var3++] = class175.field2740 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6118) {
                                    class20.field268[var3++] = class11.field145;
                                    continue;
                                }
                                if (var538 == 6119) {
                                    class20.field268[var3++] = class223.field3550;
                                    continue;
                                }
                                if (var538 == 6120) {
                                    class20.field268[var3++] = class19.field257;
                                    continue;
                                }
                                if (var538 == 6121) {
                                    class20.field268[var3++] = 0;
                                    continue;
                                }
                                if (var538 == 6123) {
                                    class20.field268[var3++] = class77.method506();
                                    continue;
                                }
                                if (var538 == 6124) {
                                    class20.field268[var3++] = class218.field3463;
                                    continue;
                                }
                                if (var538 == 6126) {
                                    class20.field268[var3++] = 0;
                                    continue;
                                }
                                if (var538 == 6127) {
                                    class20.field268[var3++] = class241.field3822 ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6128) {
                                    class20.field268[var3++] = class144.field2261 ? 1 : 0;
                                    continue;
                                }
                            } else if (var538 < 6300) {
                                if (var538 == 6200) {
                                    var3 -= 2;
                                    class56.field749 = (short) class20.field268[var3];
                                    if (class56.field749 <= 0) {
                                        class56.field749 = 256;
                                    }
                                    class225.field3579 = (short) class20.field268[var3 + 1];
                                    if (class225.field3579 <= 0) {
                                        class225.field3579 = 205;
                                    }
                                    continue;
                                }
                                if (var538 == 6201) {
                                    var3 -= 2;
                                    class132.field2092 = (short) class20.field268[var3];
                                    if (class132.field2092 <= 0) {
                                        class132.field2092 = 256;
                                    }
                                    class4.field30 = (short) class20.field268[var3 + 1];
                                    if (class4.field30 <= 0) {
                                        class4.field30 = 320;
                                    }
                                    continue;
                                }
                                if (var538 == 6202) {
                                    var3 -= 4;
                                    class219.field3505 = (short) class20.field268[var3];
                                    if (class219.field3505 <= 0) {
                                        class219.field3505 = 1;
                                    }
                                    class178.field2766 = (short) class20.field268[var3 + 1];
                                    if (class178.field2766 <= 0) {
                                        class178.field2766 = 32767;
                                    } else if (class178.field2766 < class219.field3505) {
                                        class178.field2766 = class219.field3505;
                                    }
                                    class98.field1476 = (short) class20.field268[var3 + 2];
                                    if (class98.field1476 <= 0) {
                                        class98.field1476 = 1;
                                    }
                                    class296.field4875 = (short) class20.field268[var3 + 3];
                                    if (class296.field4875 <= 0) {
                                        class296.field4875 = 32767;
                                    } else if (class98.field1476 > class296.field4875) {
                                        class296.field4875 = class98.field1476;
                                    }
                                    continue;
                                }
                                if (var538 == 6203) {
                                    class200.method1378(0, class22.field296.field4085, 0, false, class22.field296.field4152, 14837);
                                    class20.field268[var3++] = class225.field3578;
                                    class20.field268[var3++] = class186.field2886;
                                    continue;
                                }
                                if (var538 == 6204) {
                                    class20.field268[var3++] = class132.field2092;
                                    class20.field268[var3++] = class4.field30;
                                    continue;
                                }
                                if (var538 == 6205) {
                                    class20.field268[var3++] = class56.field749;
                                    class20.field268[var3++] = class225.field3579;
                                    continue;
                                }
                            } else if (var538 < 6400) {
                                if (var538 == 6300) {
                                    class20.field268[var3++] = (int) (class267.method1841((byte) 116) / 60000L);
                                    continue;
                                }
                                if (var538 == 6301) {
                                    class20.field268[var3++] = (int) (class267.method1841((byte) 104) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var538 == 6302) {
                                    var3 -= 3;
                                    int var393 = class20.field268[var3 + 1];
                                    int var394 = class20.field268[var3];
                                    int var395 = class20.field268[var3 + 2];
                                    class284.field4753.clear();
                                    class284.field4753.set(11, 12);
                                    class284.field4753.set(var395, var393, var394);
                                    class20.field268[var3++] = (int) (class284.field4753.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var538 == 6303) {
                                    class284.field4753.clear();
                                    class284.field4753.setTime(new Date(class267.method1841((byte) 121)));
                                    class20.field268[var3++] = class284.field4753.get(1);
                                    continue;
                                }
                                if (var538 == 6304) {
                                    boolean var396 = true;
                                    var3--;
                                    int var397 = class20.field268[var3];
                                    if (var397 < 0) {
                                        var396 = ((var397 + 1) % 4) == 0;
                                    } else if (var397 < 1582) {
                                        var396 = var397 % 4 == 0;
                                    } else if ((var397 % 4) != 0) {
                                        var396 = false;
                                    } else if (var397 % 100 != 0) {
                                        var396 = true;
                                    } else if (var397 % 400 != 0) {
                                        var396 = false;
                                    }
                                    class20.field268[var3++] = var396 ? 1 : 0;
                                    continue;
                                }
                            } else if (var538 < 6500) {
                                if (var538 == 6405) {
                                    class20.field268[var3++] = class84.method566(0) ? 1 : 0;
                                    continue;
                                }
                                if (var538 == 6406) {
                                    class20.field268[var3++] = class47.method294(-16349) ? 1 : 0;
                                    continue;
                                }
                            } else if (var538 < 6600) {
                                if (var538 == 6500) {
                                    if (class115.field1733 == 10 && class189.field2916 == 0 && class4.field34 == 0 && class52.field708 == 0) {
                                        class20.field268[var3++] = class35.method212((byte) 118) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class20.field268[var3++] = 1;
                                    continue;
                                }
                                if (var538 == 6501) {
                                    class203 var398 = class241.method1682(8);
                                    if (var398 == null) {
                                        class20.field268[var3++] = -1;
                                        class20.field268[var3++] = 0;
                                        class204.field3286[var5++] = "";
                                        class20.field268[var3++] = 0;
                                        class204.field3286[var5++] = "";
                                        class20.field268[var3++] = 0;
                                    } else {
                                        class20.field268[var3++] = var398.field3278;
                                        class20.field268[var3++] = var398.field4000;
                                        class204.field3286[var5++] = var398.field3283;
                                        class160 var399 = var398.method1460((byte) 12);
                                        class20.field268[var3++] = var399.field2524;
                                        class204.field3286[var5++] = var399.field2526;
                                        class20.field268[var3++] = var398.field3997;
                                    }
                                    continue;
                                }
                                if (var538 == 6502) {
                                    class203 var400 = class271.method1861(-16307);
                                    if (var400 == null) {
                                        class20.field268[var3++] = -1;
                                        class20.field268[var3++] = 0;
                                        class204.field3286[var5++] = "";
                                        class20.field268[var3++] = 0;
                                        class204.field3286[var5++] = "";
                                        class20.field268[var3++] = 0;
                                    } else {
                                        class20.field268[var3++] = var400.field3278;
                                        class20.field268[var3++] = var400.field4000;
                                        class204.field3286[var5++] = var400.field3283;
                                        class160 var401 = var400.method1460((byte) 12);
                                        class20.field268[var3++] = var401.field2524;
                                        class204.field3286[var5++] = var401.field2526;
                                        class20.field268[var3++] = var400.field3997;
                                    }
                                    continue;
                                }
                                if (var538 == 6503) {
                                    var3--;
                                    int var402 = class20.field268[var3];
                                    if (class115.field1733 == 10 && class189.field2916 == 0 && class4.field34 == 0 && class52.field708 == 0) {
                                        class20.field268[var3++] = class74.method477(var402, (byte) -102) ? 1 : 0;
                                        continue;
                                    }
                                    class20.field268[var3++] = 0;
                                    continue;
                                }
                                if (var538 == 6504) {
                                    var3--;
                                    class51.field689 = class20.field268[var3];
                                    class248.method1733(false, class259.field4254);
                                    continue;
                                }
                                if (var538 == 6505) {
                                    class20.field268[var3++] = class51.field689;
                                    continue;
                                }
                                if (var538 == 6506) {
                                    var3--;
                                    int var403 = class20.field268[var3];
                                    class203 var404 = class138.method920(17514, var403);
                                    if (var404 == null) {
                                        class20.field268[var3++] = -1;
                                        class204.field3286[var5++] = "";
                                        class20.field268[var3++] = 0;
                                        class204.field3286[var5++] = "";
                                        class20.field268[var3++] = 0;
                                    } else {
                                        class20.field268[var3++] = var404.field4000;
                                        class204.field3286[var5++] = var404.field3283;
                                        class160 var405 = var404.method1460((byte) 12);
                                        class20.field268[var3++] = var405.field2524;
                                        class204.field3286[var5++] = var405.field2526;
                                        class20.field268[var3++] = var404.field3997;
                                    }
                                    continue;
                                }
                                if (var538 == 6507) {
                                    var3 -= 4;
                                    int var406 = class20.field268[var3];
                                    boolean var407 = class20.field268[var3 + 1] == 1;
                                    int var408 = class20.field268[var3 + 2];
                                    boolean var409 = class20.field268[var3 + 3] == 1;
                                    class237.method1656(arg2 ^ 0x2DB5, var406, var407, var409, var408);
                                    continue;
                                }
                            } else if (var538 < 6700) {
                                if (var538 == 6600) {
                                    var3--;
                                    class74.field1123 = class20.field268[var3] == 1;
                                    class248.method1733(false, class259.field4254);
                                    continue;
                                }
                                if (var538 == 6601) {
                                    class20.field268[var3++] = class74.field1123 ? 1 : 0;
                                    continue;
                                }
                            } else if (var538 < 6900) {
                                if (var538 == 6800) {
                                    var3--;
                                    int var410 = class20.field268[var3];
                                    class195 var411 = class192.method1334(false, var410);
                                    if (var411.field3088 == null) {
                                        class204.field3286[var5++] = "";
                                    } else {
                                        class204.field3286[var5++] = var411.field3088;
                                    }
                                    continue;
                                }
                                if (var538 == 6801) {
                                    var3--;
                                    int var412 = class20.field268[var3];
                                    class195 var413 = class192.method1334(false, var412);
                                    class20.field268[var3++] = var413.field3104;
                                    continue;
                                }
                                if (var538 == 6802) {
                                    var3--;
                                    int var414 = class20.field268[var3];
                                    class195 var415 = class192.method1334(false, var414);
                                    class20.field268[var3++] = var415.field3093;
                                    continue;
                                }
                                if (var538 == 6803) {
                                    var3--;
                                    int var416 = class20.field268[var3];
                                    class195 var417 = class192.method1334(false, var416);
                                    class20.field268[var3++] = var417.field3099;
                                    continue;
                                }
                            }
                        } else if (var538 == 4300) {
                            var3 -= 2;
                            int var469 = class20.field268[var3];
                            int var470 = class20.field268[var3 + 1];
                            class139 var471 = class56.method338(var470, (byte) 68);
                            if (var471.method926(true)) {
                                class204.field3286[var5++] = class145.method974(class93.method605(arg2, -118), var469).method688((byte) -64, var470, var471.field2148);
                            } else {
                                class20.field268[var3++] = class145.method974(-95, var469).method686(arg2 + 95, var471.field2150, var470);
                            }
                            continue;
                        }
                    }
                } else {
                    class254 var54;
                    if (var538 >= 2000) {
                        var3--;
                        var54 = class80.method534(98, class20.field268[var3]);
                        var538 -= 1000;
                    } else {
                        var54 = var38 ? class140.field2165 : class139.field2149;
                    }
                    if (var538 == 1000) {
                        var3 -= 4;
                        var54.field4088 = class20.field268[var3];
                        var54.field4178 = class20.field268[var3 + 1];
                        int var55 = class20.field268[var3 + 3];
                        if (var55 < 0) {
                            var55 = 0;
                        } else if (var55 > 5) {
                            var55 = 5;
                        }
                        int var56 = class20.field268[var3 + 2];
                        if (var56 < 0) {
                            var56 = 0;
                        } else if (var56 > 5) {
                            var56 = 5;
                        }
                        var54.field4074 = (byte) var56;
                        var54.field4131 = (byte) var55;
                        class58.method354(true, var54);
                        class73.method465(var54, 8);
                        if (var54.field4040 == -1) {
                            class314.method2127(arg2, var54.field4077);
                        }
                        continue;
                    }
                    if (var538 == 1001) {
                        var3 -= 4;
                        var54.field4105 = class20.field268[var3];
                        var54.field4106 = class20.field268[var3 + 1];
                        var54.field4048 = 0;
                        var54.field4122 = 0;
                        int var57 = class20.field268[var3 + 2];
                        if (var57 < 0) {
                            var57 = 0;
                        } else if (var57 > 4) {
                            var57 = 4;
                        }
                        int var58 = class20.field268[var3 + 3];
                        var54.field4155 = (byte) var57;
                        if (var58 < 0) {
                            var58 = 0;
                        } else if (var58 > 4) {
                            var58 = 4;
                        }
                        var54.field4035 = (byte) var58;
                        class58.method354(true, var54);
                        class73.method465(var54, arg2 + 8);
                        if (var54.field4052 == 0) {
                            class58.method358(false, var54, (byte) -16);
                        }
                        continue;
                    }
                    if (var538 == 1003) {
                        var3--;
                        boolean var59 = class20.field268[var3] == 1;
                        if (var59 != var54.field4049) {
                            var54.field4049 = var59;
                            class58.method354(true, var54);
                        }
                        if (var54.field4040 == -1) {
                            class56.method334(true, var54.field4077);
                        }
                        continue;
                    }
                    if (var538 == 1004) {
                        var3 -= 2;
                        var54.field4050 = class20.field268[var3];
                        var54.field4127 = class20.field268[var3 + 1];
                        class58.method354(true, var54);
                        class73.method465(var54, 8);
                        if (var54.field4052 == 0) {
                            class58.method358(false, var54, (byte) -16);
                        }
                        continue;
                    }
                    if (var538 == 1005) {
                        var3--;
                        var54.field4078 = class20.field268[var3] == 1;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var537) {
            if (arg0.field1272 == null) {
                if (class138.field2130 != 0) {
                    class286.method2013((byte) -93, "Clientscript error - check log for details");
                }
                class159.method1055("CS2 - scr:" + arg0.field2102 + " op:" + var8, arg2 ^ 0xFFFFBABD, var537);
            } else {
                StringBuffer var534 = new StringBuffer(30);
                var534.append("%0a - in: ").append(arg0.field1272);
                for (int var535 = class148.field2316 - 1; var535 >= 0; var535--) {
                    var534.append("%0a - via: ").append(class141.field2182[var535].field3567.field1272);
                }
                if (var8 == 40) {
                    int var536 = var7[var6];
                    var534.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var536));
                }
                if (class138.field2130 != 0) {
                    class286.method2013((byte) -116, "Clientscript error in: " + arg0.field1272);
                }
                class159.method1055("CS2 - scr:" + arg0.field2102 + " op:" + var8 + var534.toString(), -17731, var537);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)V")
    public static final void method429(byte arg0) {
        client.method1101();
        field990++;
        client.method1088();
        client.method1092();
        client.method1090();
        client.method1095();
        if (arg0 != 79) {
            field993 = 49;
        }
        client.method1098();
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
    public static final void method430(int arg0) {
        field989++;
        if (arg0 != 223) {
            return;
        }
        if (class255.field4208.toLowerCase().indexOf("microsoft") != -1) {
            class56.field751[223] = 28;
            class56.field751[187] = 27;
            class56.field751[222] = 59;
            class56.field751[190] = 72;
            class56.field751[186] = 57;
            class56.field751[219] = 42;
            class56.field751[189] = 26;
            class56.field751[191] = 73;
            class56.field751[221] = 43;
            class56.field751[220] = 74;
            class56.field751[192] = 58;
            class56.field751[188] = 71;
            return;
        }
        class56.field751[59] = 57;
        class56.field751[44] = 71;
        class56.field751[92] = 74;
        class56.field751[47] = 73;
        class56.field751[61] = 27;
        class56.field751[45] = 26;
        class56.field751[93] = 43;
        class56.field751[91] = 42;
        class56.field751[46] = 72;
        if (class255.field4220 == null) {
            class56.field751[192] = 58;
            class56.field751[222] = 59;
        } else {
            class56.field751[222] = 58;
            class56.field751[520] = 59;
            class56.field751[192] = 28;
        }
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V")
    public static void method431(int arg0) {
        if (arg0 != 233) {
            method431(-1);
        }
        field997 = null;
        field986 = null;
        field999 = null;
    }
}
