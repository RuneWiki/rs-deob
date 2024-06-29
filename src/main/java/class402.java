import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class402 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "J")
    public static long field5523 = 0L;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Z")
    public static boolean field5525 = false;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Lro;")
    public static class2 field5526;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method2434(int arg0) {
        if (arg0 != -1) {
            method2438((class296) null, -32);
        }
        field5526 = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static final void method2435(int arg0) {
        field5520++;
        int var1 = class91.field1343.length;
        int var2 = 0;
        if (arg0 >= -62) {
            field5523 = 77L;
        }
        while (var2 < var1) {
            if (class91.field1343[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class300.field4007; var4++) {
                    if (class398.field5497[var4] == class306.field4050[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class398.field5497[class300.field4007] = class306.field4050[var2];
                    var3 = class300.field4007++;
                }
                class32 var5 = new class32(class91.field1343[var2]);
                int var6 = 0;
                while (class91.field1343[var2].length > var5.field456 && var6 < 511 && class202.field2734 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method215((byte) 127);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class306.field4050[var2] >> 8) * 64 + var10 - class162.field2260;
                    int var13 = (class306.field4050[var2] & 0xFF) * 64 + var11 - class266.field3511;
                    class429 var14 = class150.field2121.method782(var5.method215((byte) 113), 1);
                    if (class221.field2941[var7] == null && (var14.field5815 & 0x1) > 0 && class160.field2220 == var9 && var12 >= 0 && var12 + var14.field5857 < class295.field3947 && var13 >= 0 && (var14.field5857 + var13) < class39.field567) {
                        class221.field2941[var7] = new class121();
                        class221.field2941[var7].field1163 = var7;
                        class121 var15 = class221.field2941[var7];
                        class412.field5638[class202.field2734++] = var7;
                        var15.field1153 = class70.field968;
                        var15.method757(var14, 21748);
                        var15.method539(false, var15.field1780.field5857);
                        var15.field1147 = var15.field1780.field5861 << 3;
                        if (var15.field1147 == 0) {
                            var15.method547(0, 120);
                        } else {
                            var15.method547(var15.field1780.field5821 + 4 << 11 & 0x3863, 123);
                        }
                        var15.method754(-20002, var15.method545(false), var9, var12, true, var13);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZIZBLjava/lang/String;IILjava/lang/String;IJ)V")
    public static final void method2436(int arg0, boolean arg1, int arg2, boolean arg3, byte arg4, String arg5, int arg6, int arg7, String arg8, int arg9, long arg10) {
        field5524++;
        if (class385.field5334 || class475.field6540 >= 500) {
            return;
        }
        int var12 = arg9 == -1 ? class97.field1417 : arg9;
        class395 var13 = new class395(arg5, arg8, var12, arg7, arg0, arg10, arg6, arg2, arg1, arg3);
        class450.field6121.method641(var13, (byte) -93);
        class475.field6540++;
        if (arg4 <= 88) {
            method2435(-66);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lnb;ZIIIII)V")
    public static final void method2437(class181 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5522++;
        if (class134.field1963 >= 50 || arg0 == null || arg0.field2464 == null || arg0.field2464.length <= arg6 || arg0.field2464[arg6] == null) {
            return;
        }
        int var7 = arg0.field2464[arg6][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xF6) >> 5;
        if (arg0.field2464[arg6].length > 1) {
            int var10 = (int) ((double) arg0.field2464[arg6].length * Math.random());
            if (var10 > 0) {
                var8 = arg0.field2464[arg6][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg1) {
                class66.method439(var9, false, 255, 0, var8);
            }
        } else if (class488.field6789.field6671 != 0) {
            class230.field3030[class134.field1963] = var8;
            class214.field2878[class134.field1963] = var9;
            class356.field4912[class134.field1963] = 0;
            class336.field4536[class134.field1963] = null;
            int var12 = 112 / ((-arg3 - 48) / 48);
            class249.field3323[class134.field1963] = 255;
            int var13 = (arg4 - 64) / 128;
            int var14 = (arg5 - 64) / 128;
            class100.field1460[class134.field1963] = (var14 << 8) + ((arg2 << 24) + (var13 << 16)) + var11;
            class134.field1963++;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lqg;I)V")
    public static final void method2438(class296 arg0, int arg1) {
        field5521++;
        int var2 = 0;
        arg0.method1665(arg1 - 1);
        for (int var3 = 0; var3 < class239.field3187; var3++) {
            int var15 = class265.field3502[var3];
            if ((class111.field1689[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class111.field1689[var15] = (byte) class21.method133(class111.field1689[var15], 2);
                    var2--;
                } else {
                    int var16 = arg0.method1664((byte) -13, 1);
                    if (var16 == 0) {
                        var2 = class82.method529(arg0, (byte) 34);
                        class111.field1689[var15] = (byte) class21.method133(class111.field1689[var15], 2);
                    } else {
                        class445.method2610(arg0, arg1 + 2, var15);
                    }
                }
            }
        }
        arg0.method1661((byte) -95);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method1665(arg1 - 1);
        for (int var4 = 0; var4 < class239.field3187; var4++) {
            int var13 = class265.field3502[var4];
            if ((class111.field1689[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class111.field1689[var13] = (byte) class21.method133(class111.field1689[var13], 2);
                } else {
                    int var14 = arg0.method1664((byte) -13, 1);
                    if (var14 == 0) {
                        var2 = class82.method529(arg0, (byte) 34);
                        class111.field1689[var13] = (byte) class21.method133(class111.field1689[var13], 2);
                    } else {
                        class445.method2610(arg0, 1, var13);
                    }
                }
            }
        }
        arg0.method1661((byte) -32);
        if (~var2 != arg1) {
            throw new RuntimeException("nsn1");
        }
        arg0.method1665(-2);
        for (int var5 = 0; var5 < class16.field230; var5++) {
            int var11 = class263.field3483[var5];
            if ((class111.field1689[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class111.field1689[var11] = (byte) class21.method133(class111.field1689[var11], 2);
                } else {
                    int var12 = arg0.method1664((byte) -13, 1);
                    if (var12 == 0) {
                        var2 = class82.method529(arg0, (byte) 34);
                        class111.field1689[var11] = (byte) class21.method133(class111.field1689[var11], 2);
                    } else if (class247.method1386(arg0, true, var11)) {
                        class111.field1689[var11] = (byte) class21.method133(class111.field1689[var11], 2);
                    }
                }
            }
        }
        arg0.method1661((byte) -111);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method1665(-2);
        for (int var6 = 0; var6 < class16.field230; var6++) {
            int var9 = class263.field3483[var6];
            if ((class111.field1689[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class111.field1689[var9] = (byte) class21.method133(class111.field1689[var9], 2);
                    var2--;
                } else {
                    int var10 = arg0.method1664((byte) -13, 1);
                    if (var10 == 0) {
                        var2 = class82.method529(arg0, (byte) 34);
                        class111.field1689[var9] = (byte) class21.method133(class111.field1689[var9], 2);
                    } else if (class247.method1386(arg0, true, var9)) {
                        class111.field1689[var9] = (byte) class21.method133(class111.field1689[var9], 2);
                    }
                }
            }
        }
        arg0.method1661((byte) -119);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class239.field3187 = 0;
        class16.field230 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class111.field1689[var7] = (byte) (class111.field1689[var7] >> 1);
            class487 var8 = class413.field5644[var7];
            if (var8 == null) {
                class263.field3483[class16.field230++] = var7;
            } else {
                class265.field3502[class239.field3187++] = var7;
            }
        }
    }
}
