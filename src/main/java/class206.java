import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class206 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lcd;")
    public static class64 field3511 = class44.method335((byte) 71, "Lade Liste der Welten");

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field3517 = 2;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "J")
    public static long field3512 = 0L;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field3516 = 0;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()V", line = 3)
    public static final void method1434() {
        class261.field4491 = 0;
        label194: for (int var0 = 0; var0 < class201.field3447; var0++) {
            class110 var1 = class81.field1496[var0];
            if (class254.field4421 != null) {
                for (int var2 = 0; var2 < class254.field4421.length; var2++) {
                    if (class254.field4421[var2] != -1000000 && (var1.field2024 <= class254.field4421[var2] || var1.field2035 <= class254.field4421[var2]) && (var1.field2039 <= class97.field1785[var2] || var1.field2029 <= class97.field1785[var2]) && (var1.field2039 >= class161.field2836[var2] || var1.field2029 >= class161.field2836[var2]) && (var1.field2030 <= class278.field4808[var2] || var1.field2043 <= class278.field4808[var2]) && (var1.field2030 >= class137.field2442[var2] || var1.field2043 >= class137.field2442[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field2027 == 1) {
                int var3 = var1.field2028 + class185.field3180 - class89.field1614;
                if (var3 >= 0 && var3 <= class185.field3180 + class185.field3180) {
                    int var4 = var1.field2023 + class185.field3180 - class172.field2968;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2031 + class185.field3180 - class172.field2968;
                    if (var5 > class185.field3180 + class185.field3180) {
                        var5 = class185.field3180 + class185.field3180;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class147.field2593[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class165.field2900 - var1.field2039;
                        if (var7 > 32) {
                            var1.field2034 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2034 = 2;
                            var7 = -var7;
                        }
                        var1.field2041 = (var1.field2030 - class249.field4331 << 8) / var7;
                        var1.field2021 = (var1.field2043 - class249.field4331 << 8) / var7;
                        var1.field2033 = (var1.field2024 - class159.field2796 << 8) / var7;
                        var1.field2019 = (var1.field2035 - class159.field2796 << 8) / var7;
                        class224.field3813[class261.field4491++] = var1;
                    }
                }
            } else if (var1.field2027 == 2) {
                int var8 = var1.field2023 + class185.field3180 - class172.field2968;
                if (var8 >= 0 && var8 <= class185.field3180 + class185.field3180) {
                    int var9 = var1.field2028 + class185.field3180 - class89.field1614;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2022 + class185.field3180 - class89.field1614;
                    if (var10 > class185.field3180 + class185.field3180) {
                        var10 = class185.field3180 + class185.field3180;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class147.field2593[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class249.field4331 - var1.field2030;
                        if (var12 > 32) {
                            var1.field2034 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2034 = 4;
                            var12 = -var12;
                        }
                        var1.field2026 = (var1.field2039 - class165.field2900 << 8) / var12;
                        var1.field2037 = (var1.field2029 - class165.field2900 << 8) / var12;
                        var1.field2033 = (var1.field2024 - class159.field2796 << 8) / var12;
                        var1.field2019 = (var1.field2035 - class159.field2796 << 8) / var12;
                        class224.field3813[class261.field4491++] = var1;
                    }
                }
            } else if (var1.field2027 == 4) {
                int var13 = var1.field2024 - class159.field2796;
                if (var13 > 128) {
                    int var14 = var1.field2023 + class185.field3180 - class172.field2968;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2031 + class185.field3180 - class172.field2968;
                    if (var15 > class185.field3180 + class185.field3180) {
                        var15 = class185.field3180 + class185.field3180;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2028 + class185.field3180 - class89.field1614;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2022 + class185.field3180 - class89.field1614;
                        if (var17 > class185.field3180 + class185.field3180) {
                            var17 = class185.field3180 + class185.field3180;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class147.field2593[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2034 = 5;
                            var1.field2026 = (var1.field2039 - class165.field2900 << 8) / var13;
                            var1.field2037 = (var1.field2029 - class165.field2900 << 8) / var13;
                            var1.field2041 = (var1.field2030 - class249.field4331 << 8) / var13;
                            var1.field2021 = (var1.field2043 - class249.field4331 << 8) / var13;
                            class224.field3813[class261.field4491++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBZILja;)V", line = 229)
    public static final void method1435(int arg0, byte arg1, boolean arg2, int arg3, class60 arg4) {
        field3518++;
        int var5 = arg4.field1016;
        int var6 = arg4.field1163;
        if (arg4.field1036 == 0) {
            arg4.field1016 = arg4.field1134;
        } else if (arg4.field1036 == 1) {
            arg4.field1016 = arg3 - arg4.field1134;
        } else if (arg4.field1036 == 2) {
            arg4.field1016 = arg4.field1134 * arg3 >> 14;
        } else if (arg4.field1036 == 3) {
            if (arg4.field1091 == 2) {
                arg4.field1016 = arg4.field1134 * 32 + ((arg4.field1134 - 1) * arg4.field1098);
            } else if (arg4.field1091 == 7) {
                arg4.field1016 = (arg4.field1134 - 1) * arg4.field1098 + arg4.field1134 * 12;
            }
        }
        if (arg4.field1157 == 0) {
            arg4.field1163 = arg4.field1161;
        } else if (arg4.field1157 == 1) {
            arg4.field1163 = arg0 - arg4.field1161;
        } else if (arg4.field1157 == 2) {
            arg4.field1163 = arg4.field1161 * arg0 >> 14;
        } else if (arg4.field1157 == 3) {
            if (arg4.field1091 == 2) {
                arg4.field1163 = (arg4.field1161 - 1) * arg4.field1074 + arg4.field1161 * 32;
            } else if (arg4.field1091 == 7) {
                arg4.field1163 = (arg4.field1161 - 1) * arg4.field1074 + arg4.field1161 * 115;
            }
        }
        if (arg1 != 85) {
            return;
        }
        if (arg4.field1157 == 4) {
            arg4.field1163 = arg4.field1075 * arg4.field1016 / arg4.field1015;
        }
        if (arg4.field1036 == 4) {
            arg4.field1016 = arg4.field1163 * arg4.field1015 / arg4.field1075;
        }
        if (class17.field346 && (client.method1762(arg4) != 0 || arg4.field1091 == 0)) {
            if (arg4.field1016 < 5 && arg4.field1163 < 5) {
                arg4.field1163 = 5;
                arg4.field1016 = 5;
            } else {
                if (arg4.field1163 <= 0) {
                    arg4.field1163 = 5;
                }
                if (arg4.field1016 <= 0) {
                    arg4.field1016 = 5;
                }
            }
        }
        if (arg4.field1013 == 1337) {
            class261.field4497 = arg4;
        }
        if (arg2 && arg4.field1144 != null && (arg4.field1163 != var6 || arg4.field1016 != var5)) {
            class11 var7 = new class11();
            var7.field229 = arg4.field1144;
            var7.field212 = arg4;
            class306.field5220.method781(var7, arg1 + 10666);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lsa;I)V", line = 331)
    public static final void method1436(class103 arg0, int arg1) {
        arg0.field1896 = arg0.field1901;
        field3515++;
        if (arg0.field1862 == 0) {
            arg0.field1890 = 0;
            return;
        }
        if (arg0.field1902 != -1 && arg0.field1874 == 0) {
            class199 var2 = class281.method1944(arg0.field1902, 0);
            if (arg0.field1858 > 0 && var2.field3397 == 0) {
                arg0.field1890++;
                return;
            }
            if (arg0.field1858 <= 0 && var2.field3392 == 0) {
                arg0.field1890++;
                return;
            }
        }
        int var3 = arg0.field1859;
        int var4 = arg0.field1865;
        int var5 = arg0.field1876[arg0.field1862 - 1] * 128 + arg0.method325(-12808) * 64;
        int var6 = arg0.field1898[arg0.field1862 - 1] * 128 + (arg0.method325(-12808) * 64);
        if (var5 - var3 > 256 || (var5 - var3) < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg0.field1859 = var5;
            arg0.field1865 = var6;
            return;
        }
        if (var3 < var5) {
            if (var4 < var6) {
                arg0.field1889 = 1280;
            } else if (var4 <= var6) {
                arg0.field1889 = 1536;
            } else {
                arg0.field1889 = 1792;
            }
        } else if (var5 < var3) {
            if (var6 > var4) {
                arg0.field1889 = 768;
            } else if (var4 > var6) {
                arg0.field1889 = 256;
            } else {
                arg0.field1889 = 512;
            }
        } else if (var6 > var4) {
            arg0.field1889 = 1024;
        } else if (var6 < var4) {
            arg0.field1889 = 0;
        }
        int var7 = arg0.field1889 - arg0.field1863 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        boolean var8 = true;
        int var9 = arg0.field1895;
        int var10 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var9 = arg0.field1873;
        } else if (var7 >= 256 && var7 < 768) {
            var9 = arg0.field1861;
        } else if (var7 >= -768 && var7 <= -256) {
            var9 = arg0.field1886;
        }
        if (var9 == -1) {
            var9 = arg0.field1873;
        }
        arg0.field1896 = var9;
        if (arg0 instanceof class232) {
            var8 = ((class232) arg0).field3911.field103;
        }
        if (var8) {
            if (arg0.field1889 != arg0.field1863 && arg0.field1912 == -1 && arg0.field1887 != 0) {
                var10 = 2;
            }
            if (arg0.field1862 > 2) {
                var10 = 6;
            }
            if (arg0.field1862 > 3) {
                var10 = 8;
            }
            if (arg0.field1890 > 0 && arg0.field1862 > 1) {
                var10 = 8;
                arg0.field1890--;
            }
        } else {
            if (arg0.field1862 > 1) {
                var10 = 6;
            }
            if (arg0.field1862 > 2) {
                var10 = 8;
            }
            if (arg0.field1890 > 0 && arg0.field1862 > 1) {
                var10 = 8;
                arg0.field1890--;
            }
        }
        if (arg0.field1893[arg0.field1862 - 1]) {
            var10 <<= 0x1;
        }
        if (var4 < var6) {
            arg0.field1865 += var10;
            if (var6 < arg0.field1865) {
                arg0.field1865 = var6;
            }
        } else if (var6 < var4) {
            arg0.field1865 -= var10;
            if (arg0.field1865 < var6) {
                arg0.field1865 = var6;
            }
        }
        if (arg1 <= var10 && arg0.field1896 == arg0.field1873 && arg0.field1883 != -1) {
            arg0.field1896 = arg0.field1883;
        }
        if (var3 < var5) {
            arg0.field1859 += var10;
            if (arg0.field1859 > var5) {
                arg0.field1859 = var5;
            }
        } else if (var3 > var5) {
            arg0.field1859 -= var10;
            if (arg0.field1859 < var5) {
                arg0.field1859 = var5;
            }
        }
        if (arg0.field1859 == var5 && arg0.field1865 == var6) {
            arg0.field1862--;
            if (arg0.field1858 > 0) {
                arg0.field1858--;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfj;", line = 545)
    public static final class229 method1437(Throwable arg0, String arg1) {
        field3514++;
        class229 var2;
        if (arg0 instanceof class229) {
            var2 = (class229) arg0;
            var2.field3888 = var2.field3888 + ' ' + arg1;
        } else {
            var2 = new class229(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 564)
    public static void method1438(int arg0) {
        if (arg0 == -8043) {
            field3511 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/util/Random;BI)I", line = 584)
    public static final int method1439(Random arg0, byte arg1, int arg2) {
        field3513++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        }
        if (arg1 < 121) {
            method1439((Random) null, (byte) 106, -103);
        }
        if (class155.method1119((byte) -78, arg2)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        }
        int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
        int var4;
        do {
            var4 = arg0.nextInt();
        } while (var3 <= var4);
        return class146.method1043(var4, arg2, 706516447);
    }
}
