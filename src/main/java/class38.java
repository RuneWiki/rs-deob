import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class38 {

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field906 = 0;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lmc;")
    public static class75 field910 = class30.method234(true, "invback");

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "[I")
    public static int[] field914 = new int[500];

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Lmc;")
    public static class75 field917 = class30.method234(true, "Duell akzeptieren");

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Lmc;")
    private static class75 field919 = class30.method234(true, "Loaded config");

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "Lmc;")
    private static class75 field915 = class30.method234(true, "Loaded sprites");

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Lmc;")
    public static class75 field901 = class30.method234(true, "gr-Un:");

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Lmc;")
    public static class75 field911 = field919;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Lmc;")
    public static class75 field913 = class30.method234(true, "@gr3@");

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "Lmc;")
    public static class75 field921 = field915;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lge;")
    public static class41 field903;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lpb;")
    public static class92 field897;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Lpb;")
    public static class92 field904;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method290(boolean arg0) {
        if (!arg0) {
            method301(40);
        }
        field912++;
        class55.field1394.method767(!arg0);
        class75.field1899.method687(0, 0);
        class99.field2559 = class49.method379(class99.field2559);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V", line = 19)
    public class38(int arg0) {
        class10.field221 = arg0;
        class31.field701 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V", line = 28)
    public void method291() {
        field905++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Loe;I)V", line = 35)
    public static final synchronized void method292(class89 arg0, int arg1) {
        class64.field1699 = arg0;
        if (arg1 < -10) {
            field907++;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V", line = 51)
    public static void method293(boolean arg0) {
        field910 = null;
        field913 = null;
        if (arg0) {
            method294(-5);
        }
        field903 = null;
        field921 = null;
        field901 = null;
        field914 = null;
        field917 = null;
        field904 = null;
        field897 = null;
        field919 = null;
        field911 = null;
        field915 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Z", line = 73)
    public static final boolean method294(int arg0) {
        long var1 = System.currentTimeMillis();
        field902++;
        int var3 = (int) (var1 - class58.field1459);
        class58.field1459 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class12.field227 += var3;
        if (class79.field1994 == 0 && class44.field1047 == 0 && class16.field322 == 0 && class13.field256 == 0) {
            return true;
        } else if (class117.field2909 == null) {
            return false;
        } else {
            try {
                if (class12.field227 > 30000) {
                    throw new IOException();
                }
                while (class44.field1047 < 20 && class13.field256 > 0) {
                    class101 var4 = (class101) class100.field2581.method618((byte) -22);
                    class61 var5 = new class61(4);
                    var5.method493((byte) 88, 1);
                    var5.method533((byte) -28, (int) var4.field1765);
                    class117.field2909.method761(4, 0, var5.field1577, 0);
                    class32.field714.method613(~arg0, var4.field1765, var4);
                    class13.field256--;
                    class44.field1047++;
                }
                while (class79.field1994 < 20 && class16.field322 > 0) {
                    class101 var6 = (class101) client.field361.method32((byte) -55);
                    class61 var7 = new class61(4);
                    var7.method493((byte) 88, 0);
                    var7.method533((byte) -28, (int) var6.field1765);
                    class117.field2909.method761(4, 0, var7.field1577, 0);
                    var6.method1010(-22056);
                    class26.field515.method613(-1, var6.field1765, var6);
                    class16.field322--;
                    class79.field1994++;
                }
                for (int var8 = arg0; var8 < 100; var8++) {
                    int var9 = class117.field2909.method753(0);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class12.field227 = 0;
                    byte var10 = 0;
                    if (class7.field112 == null) {
                        var10 = 8;
                    } else if (class34.field788 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class109.field2764.field1577.length - class7.field112.field2611;
                        int var12 = 512 - class34.field788;
                        if (var12 > var11 - class109.field2764.field1556) {
                            var12 = var11 - class109.field2764.field1556;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class117.field2909.method760(class109.field2764.field1556, class109.field2764.field1577, var12, 5000);
                        if (class41.field993 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class109.field2764.field1577[class109.field2764.field1556 + var13] = (byte) class118.method944(class109.field2764.field1577[class109.field2764.field1556 + var13], class41.field993);
                            }
                        }
                        class109.field2764.field1556 += var12;
                        class34.field788 += var12;
                        if (class109.field2764.field1556 == var11) {
                            if (class7.field112.field1765 == 16711935L) {
                                class82.field2042 = class109.field2764;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class90 var15 = class21.field416[var14];
                                    if (var15 != null) {
                                        class82.field2042.field1556 = var14 * 4 + 5;
                                        int var16 = class82.field2042.method496((byte) 122);
                                        var15.method745(arg0, var16);
                                    }
                                }
                            } else {
                                class79.field1990.reset();
                                class79.field1990.update(class109.field2764.field1577, 0, var11);
                                int var17 = (int) class79.field1990.getValue();
                                if (class7.field112.field2600 != var17) {
                                    try {
                                        class117.field2909.method756(-112);
                                    } catch (Exception var29) {
                                    }
                                    class41.field993 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class7.field100++;
                                    class117.field2909 = null;
                                    return false;
                                }
                                class7.field100 = 0;
                                class70.field1791 = 0;
                                class7.field112.field2602.method751((class7.field112.field1765 & 0xFF0000L) == 16711680L, class109.field2764.field1577, (int) (class7.field112.field1765 & 0xFFFFL), class76.field1926, false);
                            }
                            class7.field112.method589(true);
                            class109.field2764 = null;
                            class7.field112 = null;
                            class34.field788 = 0;
                            if (class76.field1926) {
                                class44.field1047--;
                            } else {
                                class79.field1994--;
                            }
                        } else {
                            if (class34.field788 != 512) {
                                break;
                            }
                            class34.field788 = 0;
                        }
                    } else {
                        int var18 = var10 - class104.field2630.field1556;
                        if (var18 > var9) {
                            var18 = var9;
                        }
                        class117.field2909.method760(class104.field2630.field1556, class104.field2630.field1577, var18, 5000);
                        if (class41.field993 != 0) {
                            for (int var19 = 0; var19 < var18; var19++) {
                                class104.field2630.field1577[class104.field2630.field1556 + var19] = (byte) class118.method944(class104.field2630.field1577[class104.field2630.field1556 + var19], class41.field993);
                            }
                        }
                        class104.field2630.field1556 += var18;
                        if (class104.field2630.field1556 < var10) {
                            break;
                        }
                        if (class7.field112 == null) {
                            class104.field2630.field1556 = 0;
                            int var20 = class104.field2630.method494(20471);
                            int var21 = class104.field2630.method507((byte) -97);
                            long var22 = (long) ((var20 << 16) + var21);
                            int var24 = class104.field2630.method494(20471);
                            int var25 = class104.field2630.method496((byte) 122);
                            class101 var26 = (class101) class32.field714.method614(arg0 ^ 0xFFFFFF9A, var22);
                            class76.field1926 = true;
                            if (var26 == null) {
                                var26 = (class101) class26.field515.method614(arg0 - 100, var22);
                                class76.field1926 = false;
                            }
                            if (var26 == null) {
                                throw new IOException();
                            }
                            class7.field112 = var26;
                            int var27 = var24 == 0 ? 5 : 9;
                            class109.field2764 = new class61(class7.field112.field2611 + var27 + var25);
                            class109.field2764.method493((byte) 88, var24);
                            class109.field2764.method526(var25, (byte) 7);
                            class34.field788 = 8;
                            class104.field2630.field1556 = 0;
                        } else if (class34.field788 == 0) {
                            if (class104.field2630.field1577[0] == -1) {
                                class34.field788 = 1;
                                class104.field2630.field1556 = 0;
                            } else {
                                class7.field112 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var30) {
                try {
                    class117.field2909.method756(arg0 ^ 0xFFFFFFDE);
                } catch (Exception var28) {
                }
                class70.field1791++;
                class117.field2909 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLka;)Lmc;", line = 366)
    public static final class75 method295(boolean arg0, class61 arg1) {
        field920++;
        if (!arg0) {
            method292(null, -63);
        }
        return class10.method77(arg1, 32767, (byte) 115);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(J)V", line = 402)
    public void method296(long arg0) {
        field899++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V", line = 409)
    public static final synchronized void method297(int arg0, int arg1) {
        if (arg0 != 31311) {
            return;
        }
        field909++;
        if (class64.field1699 != null) {
            class64.field1699.method738(arg1);
        }
        class15.method94(arg1, 3);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 424)
    public static final void method298(int arg0) {
        if (arg0 != 7) {
            method297(69, 77);
        }
        field898++;
        int var1 = class97.field2448.method709(arg0 ^ 0xFFFFFF85, 8);
        if (class34.field783 > var1) {
            for (int var2 = var1; var2 < class34.field783; var2++) {
                class78.field1955[class112.field2843++] = class84.field2081[var2];
            }
        }
        if (class34.field783 < var1) {
            throw new RuntimeException("gppov1");
        }
        class34.field783 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class84.field2081[var3];
            class122 var5 = class40.field957[var4];
            int var6 = class97.field2448.method709(arg0 ^ 0xFFFFFF87, 1);
            if (var6 == 0) {
                class84.field2081[class34.field783++] = var4;
                var5.field1215 = class34.field781;
            } else {
                int var7 = class97.field2448.method709(-127, 2);
                if (var7 == 0) {
                    class84.field2081[class34.field783++] = var4;
                    var5.field1215 = class34.field781;
                    class94.field2369[class76.field1921++] = var4;
                } else if (var7 == 1) {
                    class84.field2081[class34.field783++] = var4;
                    var5.field1215 = class34.field781;
                    int var8 = class97.field2448.method709(-128, 3);
                    var5.method390(111, var8, false);
                    int var9 = class97.field2448.method709(-128, 1);
                    if (var9 == 1) {
                        class94.field2369[class76.field1921++] = var4;
                    }
                } else if (var7 == 2) {
                    class84.field2081[class34.field783++] = var4;
                    var5.field1215 = class34.field781;
                    int var10 = class97.field2448.method709(-128, 3);
                    var5.method390(arg0 + 110, var10, true);
                    int var11 = class97.field2448.method709(-126, 3);
                    var5.method390(127, var11, true);
                    int var12 = class97.field2448.method709(-127, 1);
                    if (var12 == 1) {
                        class94.field2369[class76.field1921++] = var4;
                    }
                } else if (var7 == 3) {
                    class78.field1955[class112.field2843++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([II)V", line = 530)
    public static final synchronized void method299(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class64.field1699 != null) {
            class64.field1699.method739(arg0, 0, var3);
        }
        class15.method94(var3, 3);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)V", line = 571)
    public static final void method300(byte arg0, int arg1) {
        int[] var2 = class108.field2740.field32;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class74.field1836[arg1][var21][var5] & 0x18) == 0) {
                    class107.field2679.method201(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class74.field1836[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class107.field2679.method201(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        field908++;
        class108.field2740.method17();
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        if (arg0 <= 83) {
            return;
        }
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class74.field1836[arg1][var19][var8] & 0x18) == 0) {
                    class37.method285(var7, arg1, var19, var8, var6, -30744);
                }
                if (arg1 < 3 && (class74.field1836[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class37.method285(var7, arg1 + 1, var19, var8, var6, -30744);
                }
            }
        }
        class110.field2782 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class107.field2679.method214(class99.field2510, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class50.method387(-26274, var12).field1517;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var9;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class110.field2783[class99.field2510].field121;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var15 > 0 && var9 - 3 < var15 && (var16[var15 - 1][var14] & 0x1280108) == 0) {
                                    var15--;
                                }
                                if (var18 == 1 && var15 < 103 && var15 < var9 + 3 && (var16[var15 + 1][var14] & 0x1280180) == 0) {
                                    var15++;
                                }
                                if (var18 == 2 && var14 > 0 && var14 > var10 - 3 && (var16[var15][var14 - 1] & 0x1280102) == 0) {
                                    var14--;
                                }
                                if (var18 == 3 && var14 < 103 && var14 < var10 + 3 && (var16[var15][var14 + 1] & 0x1280120) == 0) {
                                    var14++;
                                }
                            }
                        }
                        class21.field412[class110.field2782] = class130.field3171[var13];
                        class69.field1761[class110.field2782] = var15;
                        class34.field812[class110.field2782] = var14;
                        class110.field2782++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)Ljc;", line = 741)
    public static final class57 method301(int arg0) {
        if (arg0 != 200) {
            method297(-82, -19);
        }
        field918++;
        try {
            return (class57) Class.forName("bd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class109();
        }
    }
}
