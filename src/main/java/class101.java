import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class101 extends class5 {

    @OriginalMember(owner = "client!la", name = "I", descriptor = "[Lqa;")
    public class146[] field1925;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "Led;")
    public static class43 field1928 = class191.method1219(" (X", false);

    @OriginalMember(owner = "client!la", name = "N", descriptor = "Z")
    public static boolean field1930 = false;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "Led;")
    public static class43 field1924 = class191.method1219("titlebox", false);

    @OriginalMember(owner = "client!la", name = "S", descriptor = "[Z")
    public static boolean[] field1935 = new boolean[112];

    @OriginalMember(owner = "client!la", name = "W", descriptor = "Led;")
    public static class43 field1939 = class191.method1219("Bitte entfernen Sie ", false);

    @OriginalMember(owner = "client!la", name = "R", descriptor = "Led;")
    public static class43 field1934 = class191.method1219(" )2> ", false);

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Ltg;")
    public static final class179 method623(byte arg0) {
        class179 var1 = new class179();
        var1.field3576 = class52.field1055[0];
        var1.field3573 = class114.field2220[0];
        if (arg0 < 34) {
            return null;
        }
        var1.field3578 = class69.field1382;
        var1.field3574 = class30.field573[0];
        var1.field3575 = class66.field1328[0];
        var1.field3571 = class17.field274;
        var1.field3577 = class1.field1[0];
        var1.field3572 = class79.field1567;
        field1936++;
        class60.method382((byte) -117);
        return var1;
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "(I)Z")
    public static final boolean method624(int arg0) {
        field1926++;
        long var1 = class52.method315((byte) -128);
        int var3 = (int) (var1 - class182.field3611);
        if (var3 > 200) {
            var3 = 200;
        }
        class182.field3603 += var3;
        class182.field3611 = var1;
        if (class76.field1502 == 0 && class206.field4039 == 0 && class39.field750 == 0 && class185.field3653 == 0) {
            return true;
        } else if (client.field542 == null) {
            return false;
        } else {
            try {
                if (class182.field3603 > 30000) {
                    throw new IOException();
                }
                while (class206.field4039 < 20 && class185.field3653 > 0) {
                    class143 var4 = (class143) class50.field1012.method76(-128);
                    class89 var5 = new class89(4);
                    var5.method539(1, 27678);
                    var5.method549((int) var4.field1353, (byte) 108);
                    client.field542.method524(var5.field1769, 4, (byte) -127, 0);
                    class207.field4044.method82(-100, var4, var4.field1353);
                    class185.field3653--;
                    class206.field4039++;
                }
                while (class76.field1502 < 20 && class39.field750 > 0) {
                    class143 var6 = (class143) class167.field3320.method680(554);
                    class89 var7 = new class89(4);
                    var7.method539(0, 27678);
                    var7.method549((int) var6.field1353, (byte) 126);
                    client.field542.method524(var7.field1769, 4, (byte) -80, 0);
                    var6.method30(arg0 ^ 0xFFFFCF93);
                    class137.field2839.method82(arg0 ^ 0xFFFFCFE6, var6, var6.field1353);
                    class39.field750--;
                    class76.field1502++;
                }
                if (arg0 != -12386) {
                    method628(-16);
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = client.field542.method523(127);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class182.field3603 = 0;
                    byte var10 = 0;
                    if (class69.field1377 == null) {
                        var10 = 8;
                    } else if (class128.field2560 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class147.field3000.field1727;
                        if (var9 < var11) {
                            var11 = var9;
                        }
                        client.field542.method526(var11, (byte) 103, class147.field3000.field1727, class147.field3000.field1769);
                        if (class136.field2831 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class147.field3000.field1769[class147.field3000.field1727 + var12] = (byte) class127.method818(class147.field3000.field1769[class147.field3000.field1727 + var12], class136.field2831);
                            }
                        }
                        class147.field3000.field1727 += var11;
                        if (class147.field3000.field1727 < var10) {
                            break;
                        }
                        if (class69.field1377 == null) {
                            class147.field3000.field1727 = 0;
                            int var13 = class147.field3000.method538((byte) 122);
                            int var14 = class147.field3000.method555(arg0 ^ 0x4260A9B6);
                            int var15 = class147.field3000.method538((byte) 88);
                            long var16 = (long) ((var13 << 16) + var14);
                            int var18 = class147.field3000.method545(-7436);
                            class143 var19 = (class143) class207.field4044.method75(var16, -74);
                            class73.field1434 = true;
                            if (var19 == null) {
                                var19 = (class143) class137.field2839.method75(var16, 43);
                                class73.field1434 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class69.field1377 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class68.field1359 = new class89(class69.field1377.field2953 + var20 + var18);
                            class68.field1359.method539(var15, 27678);
                            class68.field1359.method581(var18, -268435456);
                            class147.field3000.field1727 = 0;
                            class128.field2560 = 8;
                        } else if (class128.field2560 == 0) {
                            if (class147.field3000.field1769[0] == -1) {
                                class128.field2560 = 1;
                                class147.field3000.field1727 = 0;
                            } else {
                                class69.field1377 = null;
                            }
                        }
                    } else {
                        int var21 = 512 - class128.field2560;
                        int var22 = class68.field1359.field1769.length - class69.field1377.field2953;
                        if (var21 > var22 - class68.field1359.field1727) {
                            var21 = var22 - class68.field1359.field1727;
                        }
                        if (var21 > var9) {
                            var21 = var9;
                        }
                        client.field542.method526(var21, (byte) 103, class68.field1359.field1727, class68.field1359.field1769);
                        if (class136.field2831 != 0) {
                            for (int var23 = 0; var23 < var21; var23++) {
                                class68.field1359.field1769[class68.field1359.field1727 + var23] = (byte) class127.method818(class68.field1359.field1769[class68.field1359.field1727 + var23], class136.field2831);
                            }
                        }
                        class128.field2560 += var21;
                        class68.field1359.field1727 += var21;
                        if (class68.field1359.field1727 == var22) {
                            if (class69.field1377.field1353 == 16711935L) {
                                class104.field1979 = class68.field1359;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class80 var25 = class150.field3035[var24];
                                    if (var25 != null) {
                                        class104.field1979.field1727 = var24 * 8 + 5;
                                        int var26 = class104.field1979.method545(arg0 ^ 0x2D6A);
                                        int var27 = class104.field1979.method545(arg0 ^ 0x2D6A);
                                        var25.method494(var27, var26, false);
                                    }
                                }
                            } else {
                                class59.field1214.reset();
                                class59.field1214.update(class68.field1359.field1769, 0, var22);
                                int var28 = (int) class59.field1214.getValue();
                                if (class69.field1377.field2954 != var28) {
                                    try {
                                        client.field542.method522(-23002);
                                    } catch (Exception var30) {
                                    }
                                    class136.field2831 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class153.field3103++;
                                    client.field542 = null;
                                    return false;
                                }
                                class153.field3103 = 0;
                                class51.field1024 = 0;
                                class69.field1377.field2956.method487(class68.field1359.field1769, (int) (class69.field1377.field1353 & 0xFFFFL), (class69.field1377.field1353 & 0xFF0000L) == 16711680L, -1, class73.field1434);
                            }
                            class69.field1377.method417(113);
                            class128.field2560 = 0;
                            class69.field1377 = null;
                            class68.field1359 = null;
                            if (class73.field1434) {
                                class206.field4039--;
                            } else {
                                class76.field1502--;
                            }
                        } else {
                            if (class128.field2560 != 512) {
                                break;
                            }
                            class128.field2560 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    client.field542.method522(arg0 - 10616);
                } catch (Exception var29) {
                }
                class51.field1024++;
                client.field542 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
    public static final boolean method625(int arg0, int arg1) {
        field1933++;
        int var2 = -116 % ((-arg0 - 26) / 61);
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[B)V")
    public static final void method626(int arg0, byte[] arg1) {
        field1938++;
        class89 var2 = new class89(arg1);
        var2.field1727 = arg1.length - 2;
        class122.field2452 = var2.method555(-1113627096);
        class30.field573 = new int[class122.field2452];
        class66.field1328 = new int[class122.field2452];
        class52.field1055 = new int[class122.field2452];
        class1.field1 = new byte[class122.field2452][];
        class114.field2220 = new int[class122.field2452];
        var2.field1727 = arg1.length - class122.field2452 * 8 - 7;
        class69.field1382 = var2.method555(-1113627096);
        class79.field1567 = var2.method555(-1113627096);
        int var3 = (var2.method538((byte) 94) & 0xFF) + 1;
        for (int var4 = 0; var4 < class122.field2452; var4++) {
            class114.field2220[var4] = var2.method555(-1113627096);
        }
        for (int var5 = 0; var5 < class122.field2452; var5++) {
            class66.field1328[var5] = var2.method555(-1113627096);
        }
        for (int var6 = 0; var6 < class122.field2452; var6++) {
            class30.field573[var6] = var2.method555(-1113627096);
        }
        for (int var7 = 0; var7 < class122.field2452; var7++) {
            class52.field1055[var7] = var2.method555(-1113627096);
        }
        var2.field1727 = arg1.length - (var3 + -1) * 3 - class122.field2452 * 8 - 7;
        if (arg0 >= -11) {
            return;
        }
        class17.field274 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class17.field274[var8] = var2.method565(3);
            if (class17.field274[var8] == 0) {
                class17.field274[var8] = 1;
            }
        }
        var2.field1727 = 0;
        for (int var9 = 0; var9 < class122.field2452; var9++) {
            int var10 = class30.field573[var9];
            int var11 = class52.field1055[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class1.field1[var9] = var13;
            int var14 = var2.method538((byte) -54);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method577((byte) 30);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method577((byte) 30);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "h", descriptor = "(I)V")
    public static final void method627(int arg0) {
        field1929++;
        if (arg0 != -10542) {
            field1928 = null;
        }
        for (int var1 = -1; var1 < class170.field3399; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class125.field2472[var1];
            }
            class1 var6 = class12.field183[var5];
            if (var6 != null && var6.field2353 > 0) {
                var6.field2353--;
                if (var6.field2353 == 0) {
                    var6.field2340 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class95.field1864; var2++) {
            int var3 = class158.field3202[var2];
            class77 var4 = class172.field3433[var3];
            if (var4 != null && var4.field2353 > 0) {
                var4.field2353--;
                if (var4.field2353 == 0) {
                    var4.field2340 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "i", descriptor = "(I)V")
    public static void method628(int arg0) {
        field1934 = null;
        field1928 = null;
        field1939 = null;
        field1935 = null;
        field1924 = null;
        if (arg0 <= 16) {
            method629(112, null, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[S[Led;)V")
    public static final void method629(int arg0, short[] arg1, class43[] arg2) {
        class17.method74(arg2.length - 1, arg2, 0, arg1, (byte) 124);
        field1931++;
        int var3 = -90 % ((-arg0 - 67) / 55);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lga;Lga;IZ)V")
    public class101(class58 arg0, class58 arg1, int arg2, boolean arg3) {
        class118 var5 = new class118();
        int var6 = arg0.method344(arg2, 1);
        this.field1925 = new class146[var6];
        int[] var7 = arg0.method356(16816, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class145 var9 = null;
            byte[] var10 = arg0.method367(arg2, var7[var8], (byte) -34);
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            for (class145 var12 = (class145) var5.method753(-26703); var12 != null; var12 = (class145) var5.method755((byte) 122)) {
                if (var12.field2976 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method346(0, -1, var11);
                } else {
                    var13 = arg1.method346(var11, -1, 0);
                }
                var9 = new class145(var11, var13);
                var5.method756(25541, var9);
            }
            this.field1925[var7[var8]] = new class146(var10, var9);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)Z")
    public final boolean method630(int arg0, byte arg1) {
        field1927++;
        if (arg1 <= 107) {
            field1937 = -7;
        }
        return this.field1925[arg0].field2994;
    }
}
