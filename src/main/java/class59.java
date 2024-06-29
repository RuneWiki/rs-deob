import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class59 {

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    private int field1409 = 0;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "[Laa;")
    private class2[] field1396;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lkc;")
    public static class67 field1389 = class19.method144("Wen m-Ochten Sie von der Liste entfernen?", 88);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1387 = -1;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lkc;")
    public static class67 field1392 = class19.method144("Weiter", 69);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lkc;")
    private static class67 field1397 = class19.method144("scroll:", 76);

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lkc;")
    public static class67 field1395 = field1397;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Z")
    public static boolean field1386 = false;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "[Lkc;")
    public static class67[] field1398 = new class67[1000];

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lkc;")
    public static class67 field1400 = class19.method144("", 113);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "J")
    private long field1394;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "Laa;")
    private class2 field1403;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Laa;")
    private class2 field1408;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "Lac;")
    public static class4 field1406;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lac;Ljava/awt/Component;B)V", line = 7)
    public static final void method460(class4 arg0, Component arg1, byte arg2) {
        field1404++;
        if (class125.field2912) {
            return;
        }
        class67.field1609 = class19.method150(arg0, class25.field528, class73.field1741, (byte) 18);
        client.field464 = class19.method150(arg0, class25.field528, class129.field3009, (byte) 18);
        class80.field1887 = class19.method150(arg0, class25.field528, class135.field3249, (byte) 18);
        class12.field261 = class19.method150(arg0, class25.field528, class77.field1837, (byte) 18);
        class64.field1513 = class19.method150(arg0, class25.field528, class138.field3305, (byte) 18);
        class109.field2473 = class19.method150(arg0, class25.field528, class129.field3010, (byte) 18);
        class135.field3228 = class49.method401((byte) -16, 479, 96, arg1);
        client.field464.method20(0, 0);
        class114.field2687 = class49.method401((byte) -16, 172, 156, arg1);
        class68.method565();
        class80.field1887.method20(0, 0);
        class116.field2744 = class49.method401((byte) -16, 190, 261, arg1);
        class67.field1609.method20(0, 0);
        class24.field511 = class49.method401((byte) -16, 512, 334, arg1);
        class68.method565();
        class25.field548 = class49.method401((byte) -16, 496, 50, arg1);
        class141.field3405 = class49.method401((byte) -16, 269, 37, arg1);
        class133.field3165 = class49.method401((byte) -16, 249, 45, arg1);
        class86 var3 = class78.method627(class25.field528, class83.field1974, arg0, 104);
        class94.field2149 = class49.method401((byte) -16, var3.field2017, var3.field2014, arg1);
        var3.method668(0, 0);
        class86 var4 = class78.method627(class25.field528, class108.field2439, arg0, 34);
        class4.field74 = class49.method401((byte) -16, var4.field2017, var4.field2014, arg1);
        var4.method668(0, 0);
        class86 var5 = class78.method627(class25.field528, class12.field258, arg0, -113);
        client.field461 = class49.method401((byte) -16, var5.field2017, var5.field2014, arg1);
        var5.method668(0, 0);
        class86 var6 = class78.method627(class25.field528, class99.field2232, arg0, -111);
        class55.field1339 = class49.method401((byte) -16, var6.field2017, var6.field2014, arg1);
        var6.method668(0, 0);
        class86 var7 = class78.method627(class25.field528, class69.field1645, arg0, -119);
        class78.field1847 = class49.method401((byte) -16, var7.field2017, var7.field2014, arg1);
        var7.method668(0, 0);
        class86 var8 = class78.method627(class25.field528, class75.field1797, arg0, -116);
        class4.field69 = class49.method401((byte) -16, var8.field2017, var8.field2014, arg1);
        var8.method668(0, 0);
        class86 var9 = class78.method627(class25.field528, class90.field2074, arg0, -102);
        class44.field1071 = class49.method401((byte) -16, var9.field2017, var9.field2014, arg1);
        var9.method668(0, 0);
        class86 var10 = class78.method627(class25.field528, class132.field3140, arg0, -104);
        class66.field1561 = class49.method401((byte) -16, var10.field2017, var10.field2014, arg1);
        var10.method668(0, 0);
        class86 var11 = class78.method627(class25.field528, class7.field171, arg0, 48);
        class11.field244 = class49.method401((byte) -16, var11.field2017, var11.field2014, arg1);
        var11.method668(0, 0);
        class4.field47 = class19.method150(arg0, class25.field528, class111.field2544, (byte) 18);
        class18.field356 = class19.method150(arg0, class25.field528, class80.field1902, (byte) 18);
        class70.field1657 = class19.method150(arg0, class25.field528, class98.field2214, (byte) 18);
        class96.field2175 = class4.field47.method18();
        class96.field2175.method16();
        class132.field3149 = class18.field356.method18();
        class132.field3149.method16();
        class4.field71 = class4.field47.method18();
        class4.field71.method15();
        class138.field3309 = class18.field356.method18();
        class138.field3309.method15();
        if (arg2 <= 89) {
            return;
        }
        class112.field2552 = class70.field1657.method18();
        class112.field2552.method15();
        class126.field2928 = class4.field47.method18();
        class126.field2928.method16();
        class126.field2928.method15();
        class22.field496 = class18.field356.method18();
        class22.field496.method16();
        class22.field496.method15();
        class76.field1816 = class108.method823(class125.field2917, class25.field528, (byte) -107, arg0);
        class34.field831 = new int[33];
        class96.field2167 = new int[151];
        class134.field3217 = new int[151];
        class114.field2698 = new int[33];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 999;
            int var18 = 0;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class80.field1887.field35[class80.field1887.field36 * var12 + var19] == 0) {
                    if (var17 == 999) {
                        var17 = var19;
                    }
                } else if (var17 != 999) {
                    var18 = var19;
                    break;
                }
            }
            class34.field831[var12] = var17;
            class114.field2698[var12] = var18 - var17;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 999;
            int var15 = 0;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class80.field1887.field35[class80.field1887.field36 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var14 == 999) {
                        var14 = var16;
                    }
                } else if (var14 != 999) {
                    var15 = var16;
                    break;
                }
            }
            class134.field3217[var13 - 5] = var14 - 25;
            class96.field2167[var13 - 5] = var15 - var14;
        }
        class125.field2912 = true;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILnd;I)V", line = 168)
    public static final void method461(int arg0, int arg1, class86 arg2, int arg3) {
        field1399++;
        int var4 = arg0 * arg0 + arg1 * arg1;
        if (arg3 != 999) {
            field1406 = null;
        }
        if (var4 <= 4225 || var4 >= 90000) {
            class80.method633((byte) 112, arg0, arg2, arg1);
            return;
        }
        int var5 = class81.field1920 + class19.field376 & 0x7FF;
        int var6 = class39.field951[var5];
        int var7 = var6 * 256 / (class9.field197 + 256);
        int var8 = class39.field941[var5];
        int var9 = var8 * 256 / (class9.field197 + 256);
        int var10 = arg0 * var9 - arg1 * var7 >> 16;
        int var11 = arg0 * var7 + arg1 * var9 >> 16;
        double var12 = Math.atan2((double) var11, (double) var10);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class97.field2205.method670(var14 + 4 + 94 - 10, -var15 + 83 + -20, 20, 20, 15, 15, var12, 256);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZJ)Laa;", line = 205)
    public final class2 method462(boolean arg0, long arg1) {
        this.field1394 = arg1;
        class2 var4 = this.field1396[(int) (arg1 & (long) (this.field1390 - 1))];
        field1405++;
        for (this.field1403 = var4.field27; this.field1403 != var4; this.field1403 = this.field1403.field27) {
            if (this.field1403.field22 == arg1) {
                class2 var5 = this.field1403;
                this.field1403 = this.field1403.field27;
                return var5;
            }
        }
        if (arg0) {
            field1392 = null;
        }
        this.field1403 = null;
        return null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)Z", line = 247)
    public static final boolean method463(byte arg0) {
        field1391++;
        long var1 = class82.method644(0);
        if (arg0 != 6) {
            return true;
        }
        int var3 = (int) (var1 - class30.field644);
        class30.field644 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class94.field2161 += var3;
        if (class77.field1836 == 0 && class55.field1333 == 0 && class52.field1276 == 0 && class93.field2132 == 0) {
            return true;
        } else if (class98.field2213 == null) {
            return false;
        } else {
            try {
                if (class94.field2161 > 30000) {
                    throw new IOException();
                }
                while (class55.field1333 < 20 && class93.field2132 > 0) {
                    class11 var4 = (class11) class108.field2446.method467(arg0 - 6);
                    class140 var5 = new class140(4);
                    var5.method1115((byte) 49, 1);
                    var5.method1096((int) var4.field22, (byte) 107);
                    class98.field2213.method754(4, 32741, 0, var5.field3325);
                    class111.field2535.method469(arg0 ^ 0xFFFFFFF9, var4.field22, var4);
                    class55.field1333++;
                    class93.field2132--;
                }
                while (class77.field1836 < 20 && class52.field1276 > 0) {
                    class11 var6 = (class11) class42.field1029.method3(0);
                    class140 var7 = new class140(4);
                    var7.method1115((byte) 49, 0);
                    var7.method1096((int) var6.field22, (byte) 104);
                    class98.field2213.method754(4, 32741, 0, var7.field3325);
                    var6.method152(-128);
                    class90.field2050.method469(-1, var6.field22, var6);
                    class52.field1276--;
                    class77.field1836++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class98.field2213.method752((byte) -115);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    byte var10 = 0;
                    class94.field2161 = 0;
                    if (class100.field2254 == null) {
                        var10 = 8;
                    } else if (class66.field1558 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class20.field400.field3325.length - class100.field2254.field241;
                        int var12 = 512 - class66.field1558;
                        if (var12 > var11 - class20.field400.field3347) {
                            var12 = var11 - class20.field400.field3347;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class98.field2213.method749(class20.field400.field3347, var12, 84, class20.field400.field3325);
                        if (class100.field2249 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class20.field400.field3325[class20.field400.field3347 + var13] = (byte) class63.method487(class20.field400.field3325[class20.field400.field3347 + var13], class100.field2249);
                            }
                        }
                        class66.field1558 += var12;
                        class20.field400.field3347 += var12;
                        if (class20.field400.field3347 == var11) {
                            if (class100.field2254.field22 == 16711935L) {
                                class97.field2206 = class20.field400;
                                for (int var15 = 0; var15 < 256; var15++) {
                                    class63 var16 = class115.field2715[var15];
                                    if (var16 != null) {
                                        class97.field2206.field3347 = var15 * 4 + 5;
                                        int var17 = class97.field2206.method1118(4);
                                        var16.method484((byte) 82, var17);
                                    }
                                }
                            } else {
                                class55.field1318.reset();
                                class55.field1318.update(class20.field400.field3325, 0, var11);
                                int var14 = (int) class55.field1318.getValue();
                                if (class100.field2254.field235 != var14) {
                                    try {
                                        class98.field2213.method751(-2);
                                    } catch (Exception var29) {
                                    }
                                    class102.field2292++;
                                    class100.field2249 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class98.field2213 = null;
                                    return false;
                                }
                                class29.field618 = 0;
                                class102.field2292 = 0;
                                class100.field2254.field237.method485(class44.field1068, (int) (class100.field2254.field22 & 0xFFFFL), class20.field400.field3325, (class100.field2254.field22 & 0xFF0000L) == 16711680L, -1);
                            }
                            class100.field2254.method13(103);
                            if (class44.field1068) {
                                class55.field1333--;
                            } else {
                                class77.field1836--;
                            }
                            class66.field1558 = 0;
                            class20.field400 = null;
                            class100.field2254 = null;
                        } else {
                            if (class66.field1558 != 512) {
                                break;
                            }
                            class66.field1558 = 0;
                        }
                    } else {
                        int var18 = var10 - class67.field1585.field3347;
                        if (var9 < var18) {
                            var18 = var9;
                        }
                        class98.field2213.method749(class67.field1585.field3347, var18, 74, class67.field1585.field3325);
                        if (class100.field2249 != 0) {
                            for (int var19 = 0; var19 < var18; var19++) {
                                class67.field1585.field3325[class67.field1585.field3347 + var19] = (byte) class63.method487(class67.field1585.field3325[class67.field1585.field3347 + var19], class100.field2249);
                            }
                        }
                        class67.field1585.field3347 += var18;
                        if (class67.field1585.field3347 < var10) {
                            break;
                        }
                        if (class100.field2254 == null) {
                            class67.field1585.field3347 = 0;
                            int var20 = class67.field1585.method1105(arg0 ^ 0xF9);
                            int var21 = class67.field1585.method1072(91);
                            int var22 = class67.field1585.method1105(255);
                            int var23 = class67.field1585.method1118(4);
                            long var24 = (long) ((var20 << 16) + var21);
                            class11 var26 = (class11) class111.field2535.method462(false, var24);
                            class44.field1068 = true;
                            if (var26 == null) {
                                var26 = (class11) class90.field2050.method462(false, var24);
                                class44.field1068 = false;
                            }
                            if (var26 == null) {
                                throw new IOException();
                            }
                            int var27 = var22 == 0 ? 5 : 9;
                            class100.field2254 = var26;
                            class20.field400 = new class140(class100.field2254.field241 + var27 + var23);
                            class20.field400.method1115((byte) 49, var22);
                            class20.field400.method1100(var23, (byte) -58);
                            class66.field1558 = 8;
                            class67.field1585.field3347 = 0;
                        } else if (class66.field1558 == 0) {
                            if (class67.field1585.field3325[0] == -1) {
                                class67.field1585.field3347 = 0;
                                class66.field1558 = 1;
                            } else {
                                class100.field2254 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var30) {
                try {
                    class98.field2213.method751(-2);
                } catch (Exception var28) {
                }
                class29.field618++;
                class98.field2213 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)Laa;", line = 549)
    public final class2 method464(byte arg0) {
        field1407++;
        if (this.field1403 == null) {
            return null;
        }
        class2 var2 = this.field1396[(int) ((long) (this.field1390 - 1) & this.field1394)];
        while (this.field1403 != var2) {
            if (this.field1403.field22 == this.field1394) {
                class2 var3 = this.field1403;
                this.field1403 = this.field1403.field27;
                return var3;
            }
            this.field1403 = this.field1403.field27;
        }
        if (arg0 != -63) {
            this.field1403 = null;
        }
        this.field1403 = null;
        return null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 585)
    public static final String method465(byte arg0, Throwable arg1) throws IOException {
        field1388++;
        String var2;
        if (arg1 instanceof class32) {
            class32 var3 = (class32) arg1;
            var2 = var3.field676 + " | ";
            arg1 = var3.field675;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg0 != -60) {
            field1389 = null;
        }
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 658)
    public static void method466(int arg0) {
        field1392 = null;
        field1406 = null;
        if (arg0 != 999) {
            method463((byte) -108);
        }
        field1398 = null;
        field1400 = null;
        field1397 = null;
        field1389 = null;
        field1395 = null;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)Laa;", line = 682)
    public final class2 method467(int arg0) {
        this.field1409 = arg0;
        field1393++;
        return this.method468((byte) -106);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)Laa;", line = 692)
    public final class2 method468(byte arg0) {
        if (arg0 != -106) {
            field1389 = null;
        }
        field1401++;
        if (this.field1409 > 0 && this.field1396[this.field1409 - 1] != this.field1408) {
            class2 var2 = this.field1408;
            this.field1408 = var2.field27;
            return var2;
        }
        while (this.field1390 > this.field1409) {
            class2 var3 = this.field1396[this.field1409++].field27;
            if (this.field1396[this.field1409 - 1] != var3) {
                this.field1408 = var3.field27;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V", line = 729)
    public class59(int arg0) {
        this.field1396 = new class2[arg0];
        this.field1390 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class2 var3 = this.field1396[var2] = new class2();
            var3.field26 = var3;
            var3.field27 = var3;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IJLaa;)V", line = 765)
    public final void method469(int arg0, long arg1, class2 arg2) {
        if (arg2.field26 != null) {
            arg2.method13(105);
        }
        field1385++;
        class2 var5 = this.field1396[(int) (arg1 & (long) (this.field1390 + arg0))];
        arg2.field22 = arg1;
        arg2.field27 = var5;
        arg2.field26 = var5.field26;
        arg2.field26.field27 = arg2;
        arg2.field27.field26 = arg2;
    }
}
