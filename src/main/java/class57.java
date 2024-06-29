import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class57 extends class30 {

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "Z")
    public boolean field1134 = false;

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lsd;")
    private class183 field1136;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "Z")
    public boolean field1131;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "Z")
    public boolean field1118;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    private int field1130;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
    private int field1132;

    @OriginalMember(owner = "client!ff", name = "hb", descriptor = "I")
    private int field1141;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "Z")
    public static boolean field1128 = false;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "Llc;")
    public static class112 field1126 = new class112(512);

    @OriginalMember(owner = "client!ff", name = "ib", descriptor = "I")
    public static int field1142 = 0;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "F")
    private float field1119;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!ff", name = "gb", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ff", name = "kb", descriptor = "Ldh;")
    public static class39 field1144;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "[I")
    public static int[] field1125;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "[I")
    private int[] field1137;

    @OriginalMember(owner = "client!ff", name = "jb", descriptor = "[I")
    public static int[] field1143;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLbc;)V")
    public static final void method365(byte arg0, class14 arg1) {
        class153.field2897 = arg1;
        field1120++;
        if (arg0 != 0) {
            field1142 = -117;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V")
    public static final void method366(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1129++;
        if (class155.field2925 == 1) {
            class25.field541[class161.field2996 / 100].method1222(class20.field447 - 8, class31.field650 + -8);
        }
        if (arg2 != -25707) {
            return;
        }
        if (class155.field2925 == 2) {
            class25.field541[class161.field2996 / 100 + 4].method1222(class20.field447 - 8, class31.field650 + -8);
        }
        class30.method238((byte) 66);
        if (!field1128) {
            return;
        }
        int var5 = arg0 + 20;
        int var6 = arg3 + 512 - 5;
        class150.field2851.method519(class173.method1158(-3, new class173[] { class93.field1750, class93.method588(class139.field2601, true) }), var6, var5, 16776960, -1);
        int var7 = 16776960;
        Runtime var8 = Runtime.getRuntime();
        int var10 = var5 + 15;
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        if (var9 > 32768 && class107.field2003) {
            var7 = 16711680;
        }
        if (var9 > 65536 && !class107.field2003) {
            var7 = 16711680;
        }
        class150.field2851.method519(class173.method1158(-3, new class173[] { class219.field4211, class93.method588(var9, true), class155.field2926 }), var6, var10, var7, -1);
        var5 = var10 + 15;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)V")
    public final void method367(int arg0, int arg1) {
        field1138++;
        if (this.field1137 == null) {
            return;
        }
        if (this.field1141 != 0 || this.field1132 != 0) {
            if (class7.field132 == null || class7.field132.length < this.field1137.length) {
                class7.field132 = new int[this.field1137.length];
            }
            int var3 = this.field1137.length == 4096 ? 64 : 128;
            int var4 = this.field1132 * arg1;
            int var5 = this.field1137.length;
            int var6 = var5 - 1;
            int var7 = var3 - 1;
            int var8 = arg1 * var3 * this.field1141;
            for (int var9 = 0; var9 < var5; var9 += var3) {
                int var11 = var6 & var8 + var9;
                for (int var12 = 0; var12 < var3; var12++) {
                    int var13 = var9 + var12;
                    int var14 = (var7 & var4 + var12) + var11;
                    class7.field132[var13] = this.field1137[var14];
                }
            }
            int[] var10 = this.field1137;
            this.field1137 = class7.field132;
            class7.field132 = var10;
        }
        if (arg0 < 13) {
            this.field1141 = -51;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lkf;Z)V")
    public static final void method368(class105 arg0, boolean arg1) {
        class4.field65.method920(false, arg0);
        while (true) {
            class105 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class105[][] var7;
            class105 var65;
            do {
                class105 var64;
                do {
                    class105 var63;
                    do {
                        class105 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class105) class4.field65.method919(0);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1944);
                                            var3 = var2.field1951;
                                            var4 = var2.field1960;
                                            var5 = var2.field1947;
                                            var6 = var2.field1966;
                                            var7 = class208.field4055[var5];
                                            if (!var2.field1942) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class105 var8 = class208.field4055[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1944) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class64.field1267 && var3 > class148.field2831) {
                                                    class105 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1944 && (var9.field1942 || (var2.field1943 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class64.field1267 && var3 < class79.field1537 - 1) {
                                                    class105 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1944 && (var10.field1942 || (var2.field1943 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class33.field722 && var4 > class76.field1492) {
                                                    class105 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1944 && (var11.field1942 || (var2.field1943 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class33.field722 && var4 < class159.field2975 - 1) {
                                                    class105 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1944 && (var12.field1942 || (var2.field1943 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1942 = false;
                                            if (var2.field1963 != null) {
                                                class105 var13 = var2.field1963;
                                                if (var13.field1965 == null) {
                                                    if (var13.field1964 != null && !class212.method1394(0, var3, var4)) {
                                                        class28.method227(var13.field1964, class17.field365, class24.field517, class125.field2350, class125.field2363, var3, var4);
                                                    }
                                                } else if (!class212.method1394(0, var3, var4)) {
                                                    class176.method1172(var13.field1965, 0, class17.field365, class24.field517, class125.field2350, class125.field2363, var3, var4);
                                                }
                                                class107 var14 = var13.field1959;
                                                if (var14 != null) {
                                                    var14.field1995.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var14.field1999 - class98.field1791, var14.field2002 - class106.field1984, var14.field1992 - class161.field2998, var14.field1997);
                                                }
                                                for (int var15 = 0; var15 < var13.field1972; var15++) {
                                                    class5 var16 = var13.field1948[var15];
                                                    if (var16 != null) {
                                                        var16.field113.method272(var16.field107, class17.field365, class24.field517, class125.field2350, class125.field2363, var16.field111 - class98.field1791, var16.field126 - class106.field1984, var16.field119 - class161.field2998, var16.field123);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1965 == null) {
                                                if (var2.field1964 != null && !class212.method1394(var6, var3, var4)) {
                                                    var17 = true;
                                                    class28.method227(var2.field1964, class17.field365, class24.field517, class125.field2350, class125.field2363, var3, var4);
                                                }
                                            } else if (!class212.method1394(var6, var3, var4)) {
                                                var17 = true;
                                                if (var2.field1965.field1066 != 12345678 || class97.field1773 && var5 <= class23.field497) {
                                                    class176.method1172(var2.field1965, var6, class17.field365, class24.field517, class125.field2350, class125.field2363, var3, var4);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class107 var20 = var2.field1959;
                                            class216 var21 = var2.field1957;
                                            if (var20 != null || var21 != null) {
                                                if (class64.field1267 == var3) {
                                                    var18++;
                                                } else if (class64.field1267 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class33.field722 == var4) {
                                                    var18 += 3;
                                                } else if (class33.field722 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class104.field1933[var18];
                                                var2.field1946 = class107.field2004[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field1991 & class170.field3301[var18]) == 0) {
                                                    var2.field1953 = 0;
                                                } else if (var20.field1991 == 16) {
                                                    var2.field1953 = 3;
                                                    var2.field1962 = class159.field2979[var18];
                                                    var2.field1945 = 3 - var2.field1962;
                                                } else if (var20.field1991 == 32) {
                                                    var2.field1953 = 6;
                                                    var2.field1962 = class8.field154[var18];
                                                    var2.field1945 = 6 - var2.field1962;
                                                } else if (var20.field1991 == 64) {
                                                    var2.field1953 = 12;
                                                    var2.field1962 = class193.field3752[var18];
                                                    var2.field1945 = 12 - var2.field1962;
                                                } else {
                                                    var2.field1953 = 9;
                                                    var2.field1962 = class116.field2139[var18];
                                                    var2.field1945 = 9 - var2.field1962;
                                                }
                                                if ((var20.field1991 & var19) != 0 && !class8.method57(var6, var3, var4, var20.field1991)) {
                                                    var20.field1995.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var20.field1999 - class98.field1791, var20.field2002 - class106.field1984, var20.field1992 - class161.field2998, var20.field1997);
                                                }
                                                if ((var20.field1996 & var19) != 0 && !class8.method57(var6, var3, var4, var20.field1996)) {
                                                    var20.field1987.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var20.field1999 - class98.field1791, var20.field2002 - class106.field1984, var20.field1992 - class161.field2998, var20.field1997);
                                                }
                                            }
                                            if (var21 != null && !class47.method326(var6, var3, var4, var21.field4184.field758)) {
                                                if ((var21.field4193 & var19) != 0) {
                                                    var21.field4184.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var21.field4176 + var21.field4188 - class98.field1791, var21.field4187 - class106.field1984, var21.field4186 + var21.field4174 - class161.field2998, var21.field4178);
                                                } else if (var21.field4193 == 256) {
                                                    int var22 = var21.field4176 - class98.field1791;
                                                    int var23 = var21.field4187 - class106.field1984;
                                                    int var24 = var21.field4186 - class161.field2998;
                                                    int var25 = var21.field4190;
                                                    int var26;
                                                    if (var25 == 1 || var25 == 2) {
                                                        var26 = -var22;
                                                    } else {
                                                        var26 = var22;
                                                    }
                                                    int var27;
                                                    if (var25 == 2 || var25 == 3) {
                                                        var27 = -var24;
                                                    } else {
                                                        var27 = var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field4184.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var21.field4188 + var22, var23, var21.field4174 + var24, var21.field4178);
                                                    } else if (var21.field4183 != null) {
                                                        var21.field4183.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var22, var23, var24, var21.field4178);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class22 var28 = var2.field1954;
                                                if (var28 != null) {
                                                    var28.field475.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var28.field488 - class98.field1791, var28.field478 - class106.field1984, var28.field481 - class161.field2998, var28.field487);
                                                }
                                                class148 var29 = var2.field1952;
                                                if (var29 != null && var29.field2836 == 0) {
                                                    if (var29.field2824 != null) {
                                                        var29.field2824.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var29.field2827 - class98.field1791, var29.field2830 - class106.field1984, var29.field2832 - class161.field2998, var29.field2829);
                                                    }
                                                    if (var29.field2822 != null) {
                                                        var29.field2822.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var29.field2827 - class98.field1791, var29.field2830 - class106.field1984, var29.field2832 - class161.field2998, var29.field2829);
                                                    }
                                                    if (var29.field2821 != null) {
                                                        var29.field2821.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var29.field2827 - class98.field1791, var29.field2830 - class106.field1984, var29.field2832 - class161.field2998, var29.field2829);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field1943;
                                            if (var30 != 0) {
                                                if (var3 < class64.field1267 && (var30 & 0x4) != 0) {
                                                    class105 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field1944) {
                                                        class4.field65.method920(false, var31);
                                                    }
                                                }
                                                if (var4 < class33.field722 && (var30 & 0x2) != 0) {
                                                    class105 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field1944) {
                                                        class4.field65.method920(false, var32);
                                                    }
                                                }
                                                if (var3 > class64.field1267 && (var30 & 0x1) != 0) {
                                                    class105 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field1944) {
                                                        class4.field65.method920(false, var33);
                                                    }
                                                }
                                                if (var4 > class33.field722 && (var30 & 0x8) != 0) {
                                                    class105 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field1944) {
                                                        class4.field65.method920(false, var34);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1953 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field1972; var36++) {
                                                if (class122.field2291 != var2.field1948[var36].field108 && (var2.field1950[var36] & var2.field1953) == var2.field1962) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class107 var37 = var2.field1959;
                                                if (!class8.method57(var6, var3, var4, var37.field1991)) {
                                                    var37.field1995.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var37.field1999 - class98.field1791, var37.field2002 - class106.field1984, var37.field1992 - class161.field2998, var37.field1997);
                                                }
                                                var2.field1953 = 0;
                                            }
                                        }
                                        if (!var2.field1949) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field1972;
                                            var2.field1949 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; var40++) {
                                                class5 var41 = var2.field1948[var40];
                                                if (class122.field2291 != var41.field108) {
                                                    for (int var42 = var41.field120; var42 <= var41.field112; var42++) {
                                                        for (int var43 = var41.field125; var43 <= var41.field104; var43++) {
                                                            class105 var44 = var7[var42][var43];
                                                            if (var44.field1942) {
                                                                var2.field1949 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field1953 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field120) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field112) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field125) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field104) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field1953) == var2.field1945) {
                                                                    var2.field1949 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class181.field3553[var39++] = var41;
                                                    int var46 = class64.field1267 - var41.field120;
                                                    int var47 = var41.field112 - class64.field1267;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class33.field722 - var41.field125;
                                                    int var49 = var41.field104 - class33.field722;
                                                    if (var49 > var48) {
                                                        var41.field106 = var46 + var49;
                                                    } else {
                                                        var41.field106 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class5 var53 = class181.field3553[var52];
                                                    if (class122.field2291 != var53.field108) {
                                                        if (var53.field106 > var50) {
                                                            var50 = var53.field106;
                                                            var51 = var52;
                                                        } else if (var53.field106 == var50) {
                                                            int var54 = var53.field111 - class98.field1791;
                                                            int var55 = var53.field119 - class161.field2998;
                                                            int var56 = class181.field3553[var51].field111 - class98.field1791;
                                                            int var57 = class181.field3553[var51].field119 - class161.field2998;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class5 var58 = class181.field3553[var51];
                                                var58.field108 = class122.field2291;
                                                if (!class36.method278(var6, var58.field120, var58.field112, var58.field125, var58.field104, var58.field113.field758)) {
                                                    var58.field113.method272(var58.field107, class17.field365, class24.field517, class125.field2350, class125.field2363, var58.field111 - class98.field1791, var58.field126 - class106.field1984, var58.field119 - class161.field2998, var58.field123);
                                                }
                                                for (int var59 = var58.field120; var59 <= var58.field112; var59++) {
                                                    for (int var60 = var58.field125; var60 <= var58.field104; var60++) {
                                                        class105 var61 = var7[var59][var60];
                                                        if (var61.field1953 != 0) {
                                                            class4.field65.method920(false, var61);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field1944) {
                                                            class4.field65.method920(false, var61);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1949) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field1949 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1944);
                            } while (var2.field1953 != 0);
                            if (var3 > class64.field1267 || var3 <= class148.field2831) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field1944);
                        if (var3 < class64.field1267 || var3 >= class79.field1537 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field1944);
                    if (var4 > class33.field722 || var4 <= class76.field1492) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field1944);
                if (var4 < class33.field722 || var4 >= class159.field2975 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field1944);
            var2.field1944 = false;
            class81.field1586--;
            class148 var66 = var2.field1952;
            if (var66 != null && var66.field2836 != 0) {
                if (var66.field2824 != null) {
                    var66.field2824.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var66.field2827 - class98.field1791, var66.field2830 - class106.field1984 - var66.field2836, var66.field2832 - class161.field2998, var66.field2829);
                }
                if (var66.field2822 != null) {
                    var66.field2822.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var66.field2827 - class98.field1791, var66.field2830 - class106.field1984 - var66.field2836, var66.field2832 - class161.field2998, var66.field2829);
                }
                if (var66.field2821 != null) {
                    var66.field2821.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var66.field2827 - class98.field1791, var66.field2830 - class106.field1984 - var66.field2836, var66.field2832 - class161.field2998, var66.field2829);
                }
            }
            if (var2.field1946 != 0) {
                class216 var67 = var2.field1957;
                if (var67 != null && !class47.method326(var6, var3, var4, var67.field4184.field758)) {
                    if ((var67.field4193 & var2.field1946) != 0) {
                        var67.field4184.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var67.field4176 + var67.field4188 - class98.field1791, var67.field4187 - class106.field1984, var67.field4186 + var67.field4174 - class161.field2998, var67.field4178);
                    } else if (var67.field4193 == 256) {
                        int var68 = var67.field4176 - class98.field1791;
                        int var69 = var67.field4187 - class106.field1984;
                        int var70 = var67.field4186 - class161.field2998;
                        int var71 = var67.field4190;
                        int var72;
                        if (var71 == 1 || var71 == 2) {
                            var72 = -var68;
                        } else {
                            var72 = var68;
                        }
                        int var73;
                        if (var71 == 2 || var71 == 3) {
                            var73 = -var70;
                        } else {
                            var73 = var70;
                        }
                        if (var73 >= var72) {
                            var67.field4184.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var67.field4188 + var68, var69, var67.field4174 + var70, var67.field4178);
                        } else if (var67.field4183 != null) {
                            var67.field4183.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var68, var69, var70, var67.field4178);
                        }
                    }
                }
                class107 var74 = var2.field1959;
                if (var74 != null) {
                    if ((var74.field1996 & var2.field1946) != 0 && !class8.method57(var6, var3, var4, var74.field1996)) {
                        var74.field1987.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var74.field1999 - class98.field1791, var74.field2002 - class106.field1984, var74.field1992 - class161.field2998, var74.field1997);
                    }
                    if ((var74.field1991 & var2.field1946) != 0 && !class8.method57(var6, var3, var4, var74.field1991)) {
                        var74.field1995.method272(0, class17.field365, class24.field517, class125.field2350, class125.field2363, var74.field1999 - class98.field1791, var74.field2002 - class106.field1984, var74.field1992 - class161.field2998, var74.field1997);
                    }
                }
            }
            if (var5 < class108.field2023 - 1) {
                class105 var75 = class208.field4055[var5 + 1][var3][var4];
                if (var75 != null && var75.field1944) {
                    class4.field65.method920(false, var75);
                }
            }
            if (var3 < class64.field1267) {
                class105 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field1944) {
                    class4.field65.method920(false, var76);
                }
            }
            if (var4 < class33.field722) {
                class105 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field1944) {
                    class4.field65.method920(false, var77);
                }
            }
            if (var3 > class64.field1267) {
                class105 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field1944) {
                    class4.field65.method920(false, var78);
                }
            }
            if (var4 > class33.field722) {
                class105 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field1944) {
                    class4.field65.method920(false, var79);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILbc;Laa;)[I")
    public final int[] method369(int arg0, int arg1, class14 arg2, class2 arg3) {
        field1135++;
        if (!this.field1136.method1244(arg3, arg2, 0)) {
            return null;
        } else if (arg0 == 1) {
            int var5 = this.field1133 > arg1 ? arg1 : this.field1133;
            return this.field1136.method1241(var5, 1.0D, arg3, false, arg2, var5, (byte) 126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1127++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILbc;BLaa;F)[I")
    public final int[] method370(int arg0, class14 arg1, byte arg2, class2 arg3, float arg4) {
        field1124++;
        if (arg2 <= 118) {
            return null;
        }
        if (this.field1137 == null || this.field1119 != arg4) {
            if (!this.field1136.method1244(arg3, arg1, 0)) {
                return null;
            }
            int var6 = this.field1133 <= arg0 ? this.field1133 : arg0;
            this.field1137 = this.field1136.method1241(var6, (double) arg4, arg3, true, arg1, var6, (byte) 118);
            this.field1119 = arg4;
        }
        return this.field1137;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V")
    public static void method371(byte arg0) {
        field1126 = null;
        field1143 = null;
        if (arg0 != -1) {
            field1128 = true;
        }
        field1125 = null;
        field1144 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V")
    public static final void method372(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class108.field2023; var3++) {
            for (int var4 = 0; var4 < class71.field1384; var4++) {
                for (int var5 = 0; var5 < class55.field1093; var5++) {
                    class105 var6 = class208.field4055[var3][var4][var5];
                    if (var6 != null) {
                        class107 var7 = var6.field1959;
                        if (var7 != null && var7.field1995 instanceof class141) {
                            class141 var8 = (class141) var7.field1995;
                            class25.method195(var8, var3, var4, var5, 1, 1);
                            if (var7.field1987 instanceof class141) {
                                class141 var9 = (class141) var7.field1987;
                                class25.method195(var9, var3, var4, var5, 1, 1);
                                class141.method877(var8, var9, 0, 0, 0, false);
                                var7.field1987 = var9.method897(var9.field2638, var9.field2658, arg0, arg1, arg2, false, false);
                            }
                            var7.field1995 = var8.method897(var8.field2638, var8.field2658, arg0, arg1, arg2, false, false);
                        }
                        for (int var10 = 0; var10 < var6.field1972; var10++) {
                            class5 var13 = var6.field1948[var10];
                            if (var13 != null && var13.field113 instanceof class141) {
                                class141 var14 = (class141) var13.field113;
                                class25.method195(var14, var3, var4, var5, var13.field112 + 1 - var13.field120, var13.field104 - var13.field125 + 1);
                                var13.field113 = var14.method897(var14.field2638, var14.field2658, arg0, arg1, arg2, false, false);
                            }
                        }
                        class22 var11 = var6.field1954;
                        if (var11 != null && var11.field475 instanceof class141) {
                            class141 var12 = (class141) var11.field475;
                            class131.method839(var12, var3, var4, var5);
                            var11.field475 = var12.method897(var12.field2638, var12.field2658, arg0, arg1, arg2, false, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLaa;Lbc;)Z")
    public final boolean method373(boolean arg0, class2 arg1, class14 arg2) {
        if (arg0) {
            return true;
        } else {
            field1139++;
            return this.field1136.method1244(arg1, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lmb;)V")
    public class57(class121 arg0) {
        this.field1136 = new class183(arg0);
        int var2 = arg0.method751((byte) -103);
        this.field1131 = (var2 & 0x2) != 0;
        this.field1118 = (var2 & 0x1) != 0;
        int var3 = var2 >> 3 & 0x3;
        int var4 = arg0.method751((byte) -122);
        this.field1133 = 0x1 << (var4 & 0x7) + 1;
        this.field1121 = arg0.method755((byte) -108);
        this.field1130 = arg0.method751((byte) -105);
        if (this.field1130 == 255) {
            this.field1130 = 256;
        }
        this.field1132 = arg0.method767(-85);
        this.field1141 = arg0.method767(-102);
        arg0.method751((byte) 127);
        arg0.method751((byte) -43);
        arg0.method751((byte) -91);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class57() {
        this.field1136 = new class183();
        this.field1118 = true;
        this.field1133 = 64;
    }
}
