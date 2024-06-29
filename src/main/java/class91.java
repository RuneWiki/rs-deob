import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class91 {

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1385 = "Loading textures - ";

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lag;")
    public static class97 field1382 = new class97();

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Ljl;")
    public static class231 field1389 = new class231(64);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[I")
    public static int[] field1386;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZBLjava/lang/String;)V")
    public static final void method614(boolean arg0, byte arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field1388++;
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class31.field460; var6++) {
            class273 var9 = class259.method1735(var6, -14667);
            if ((!arg0 || var9.field4386) && var9.field4348 == -1 && var9.field4368 == -1 && var9.field4392 == 0 && var9.field4375.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class124.field1803 = -1;
                    class24.field322 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class154.field2252 = 0;
        class124.field1803 = var5;
        if (arg1 != 63) {
            method618(21, 74);
        }
        class24.field322 = var4;
        String[] var7 = new String[class124.field1803];
        for (int var8 = 0; var8 < class124.field1803; var8++) {
            var7[var8] = class259.method1735(var4[var8], -14667).field4375;
        }
        class222.method1447(class24.field322, var7, -4);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Lrc;")
    public static final class288 method615(int arg0, int arg1, int arg2) {
        class131 var3 = class16.field233[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1923;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)[Lij;")
    public static final class69[] method616(int arg0) {
        field1379++;
        class69[] var1 = new class69[class160.field2321];
        int var2 = 0;
        if (arg0 < 92) {
            return null;
        }
        while (class160.field2321 > var2) {
            int var3 = class282.field4500[var2] * class246.field3682[var2];
            byte[] var4 = class263.field3965[var2];
            if (class141.field2039[var2]) {
                byte[] var5 = class152.field2199[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; var7++) {
                    var6[var7] = class163.method1093(class128.field1883[class184.method1188(var4[var7], 255)], class184.method1188(255, var5[var7]) << 24);
                }
                var1[var2] = new class201(class68.field1056, class141.field2041, field1386[var2], class211.field3035[var2], class246.field3682[var2], class282.field4500[var2], var6);
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class128.field1883[class184.method1188(255, var4[var9])];
                }
                var1[var2] = new class244(class68.field1056, class141.field2041, field1386[var2], class211.field3035[var2], class246.field3682[var2], class282.field4500[var2], var8);
            }
            var2++;
        }
        class290.method1935(0);
        return var1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V")
    public static final void method617(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1384++;
        int var5 = arg3;
        int var6 = 0;
        int var7 = -arg3;
        if (arg2 != 7472) {
            method615(-127, -86, 117);
        }
        int var8 = class177.method1152(class93.field1412, class142.field2061, arg1 + arg3, 126);
        int var9 = -1;
        int var10 = class177.method1152(class93.field1412, class142.field2061, arg1 - arg3, 110);
        class183.method1181(arg4, (byte) -69, var8, class163.field2370[arg0], var10);
        while (var6 < var5) {
            var9 += 2;
            var7 += var9;
            if (var7 > 0) {
                var5--;
                int var11 = arg0 - var5;
                int var12 = arg0 + var5;
                var7 -= var5 << 1;
                if (var12 >= class93.field1418 && var11 <= class254.field3857) {
                    int var13 = class177.method1152(class93.field1412, class142.field2061, arg1 + var6, arg2 + -7364);
                    int var14 = class177.method1152(class93.field1412, class142.field2061, arg1 - var6, 124);
                    if (var12 <= class254.field3857) {
                        class183.method1181(arg4, (byte) -69, var13, class163.field2370[var12], var14);
                    }
                    if (class93.field1418 <= var11) {
                        class183.method1181(arg4, (byte) -69, var13, class163.field2370[var11], var14);
                    }
                }
            }
            var6++;
            int var15 = arg0 + var6;
            int var16 = arg0 - var6;
            if (class93.field1418 <= var15 && class254.field3857 >= var16) {
                int var17 = class177.method1152(class93.field1412, class142.field2061, arg1 + var5, arg2 + -7351);
                int var18 = class177.method1152(class93.field1412, class142.field2061, arg1 - var5, arg2 ^ 0xFFFFE287);
                if (class254.field3857 >= var15) {
                    class183.method1181(arg4, (byte) -69, var17, class163.field2370[var15], var18);
                }
                if (var16 >= class93.field1418) {
                    class183.method1181(arg4, (byte) -69, var17, class163.field2370[var16], var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Lj;")
    public static final class250 method618(int arg0, int arg1) {
        field1381++;
        class250 var2 = (class250) class27.field384.method263((byte) 115, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class170.field2451.method1538(class195.method1247(arg1, 0), class254.method1704(arg1, -21261), (byte) 99);
        class250 var4 = new class250();
        var4.field3783 = arg1;
        if (var3 != null) {
            var4.method1644(new class114(var3), 4783);
        }
        var4.method1640(0);
        if (var4.field3806) {
            var4.field3754 = false;
            var4.field3820 = 0;
        }
        if (!class240.field3610 && var4.field3804) {
            var4.field3796 = null;
        }
        if (arg0 <= 105) {
            field1386 = null;
        }
        class27.field384.method255((long) arg1, var4, (byte) -125);
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public static final void method619(int arg0) {
        field1380++;
        if (class70.field1099 == null) {
            return;
        }
        if (class280.field4470 < 10) {
            if (!class53.field798.method1533(class70.field1099.field3381, 0)) {
                class280.field4470 = class132.field1936.method1532(class70.field1099.field3381, 1) / 10;
                return;
            }
            class148.method988(-10629);
            class280.field4470 = 10;
        }
        if (class280.field4470 == 10) {
            class54.field828 = class70.field1099.field3363 >> 6 << 6;
            class63.field1009 = (class70.field1099.field3378 >> 6 << 6) + 64 - class54.field828;
            if (class70.field1099.field3379 == 37) {
                class276.field4428 = 3.0F;
                class9.field166 = 3.0F;
            } else if (class70.field1099.field3379 == 50) {
                class276.field4428 = 4.0F;
                class9.field166 = 4.0F;
            } else if (class70.field1099.field3379 == 75) {
                class276.field4428 = 6.0F;
                class9.field166 = 6.0F;
            } else if (class70.field1099.field3379 == 100) {
                class276.field4428 = 8.0F;
                class9.field166 = 8.0F;
            } else if (class70.field1099.field3379 == 200) {
                class276.field4428 = 16.0F;
                class9.field166 = 16.0F;
            } else {
                class276.field4428 = 8.0F;
                class9.field166 = 8.0F;
            }
            int var1 = class54.field828 - (class95.field1445 + (class55.field847.field94 >> 7) + 1 - class63.field1009);
            int var2 = var1 + ((int) (Math.random() * 10.0D) - 5);
            class212.field3040 = class70.field1099.field3386 >> 6 << 6;
            class99.field1482 = (class70.field1099.field3371 >> 6 << 6) + 64 - class212.field3040;
            int var3 = class113.field1615 - (class212.field3040 - (class55.field847.field45 >> 7));
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var4 >= 0 && class99.field1482 > var4 && var2 >= 0 && class63.field1009 > var2) {
                class286.field4544 = var2;
                class136.field1967 = var4;
            } else {
                class136.field1967 = class70.field1099.field3364 * 64 - class212.field3040;
                class286.field4544 = class63.field1009 + class54.field828 - (class70.field1099.field3369 * 64) - 1;
            }
            class81.method544(100);
            int var5 = class32.field477 >> 2 << 10;
            int var6 = class99.field1482 >> 6;
            int var7 = class163.field2379 >> 1;
            class152.field2193 = new int[class248.field3726 + 1];
            int var8 = class63.field1009 >> 6;
            class236.field3560 = new byte[var6][var8][];
            class193.field2759 = new byte[var6][var8][];
            class76.field1175 = new byte[var6][var8][];
            class234.field3525 = new int[var6][var8][];
            class228.field3421 = new int[var6][var8][];
            class225.field3387 = new byte[var6][var8][];
            class120.field1757 = new int[var6][var8][];
            class63.field1014 = new byte[var6][var8][];
            class234.method1544(arg0 ^ 0x382, var7, var5);
            class280.field4470 = 20;
        } else if (class280.field4470 == 20) {
            class84.method564(new class114(class53.field798.method1511(arg0 ^ 0xFFFFAB3C, class70.field1099.field3381, "underlay")), (byte) -122);
            class280.field4470 = 30;
            class242.method1576(0, true);
            class32.method231((byte) -123);
        } else if (class280.field4470 == 30) {
            class257.method1725((byte) 116, new class114(class53.field798.method1511(-21698, class70.field1099.field3381, "overlay")));
            class280.field4470 = 40;
            class32.method231((byte) -104);
        } else if (class280.field4470 == 40) {
            class271.method1814(false, new class114(class53.field798.method1511(-21698, class70.field1099.field3381, "overlay2")));
            class280.field4470 = 50;
            class32.method231((byte) 104);
        } else if (class280.field4470 == 50) {
            class70.method481(true, new class114(class53.field798.method1511(arg0 - 21700, class70.field1099.field3381, "loc")));
            class280.field4470 = 60;
            class242.method1576(0, true);
            class32.method231((byte) -117);
        } else if (class280.field4470 == 60) {
            if (class53.field798.method1517(76, class70.field1099.field3381 + "_labels")) {
                if (!class53.field798.method1533(class70.field1099.field3381 + "_labels", 0)) {
                    return;
                }
                class168.field2440 = class226.method1474(class70.field1099.field3381 + "_labels", class53.field798, 0);
            } else {
                class168.field2440 = new class78(0);
            }
            class280.field4470 = 70;
            class32.method231((byte) 10);
        } else if (class280.field4470 == 70) {
            class118.field1742 = new class11(11, true, class80.field1247);
            class280.field4470 = 73;
            class242.method1576(0, true);
            class32.method231((byte) 7);
        } else if (class280.field4470 == 73) {
            class224.field3355 = new class11(12, true, class80.field1247);
            class280.field4470 = 76;
            class242.method1576(0, true);
            class32.method231((byte) -119);
        } else if (class280.field4470 == 76) {
            class212.field3045 = new class11(14, true, class80.field1247);
            class280.field4470 = 79;
            class242.method1576(0, true);
            class32.method231((byte) -112);
        } else if (class280.field4470 == 79) {
            class155.field2271 = new class11(17, true, class80.field1247);
            class280.field4470 = 82;
            class242.method1576(0, true);
            class32.method231((byte) -113);
        } else if (class280.field4470 == 82) {
            class288.field4563 = new class11(19, true, class80.field1247);
            class280.field4470 = 85;
            class242.method1576(0, true);
            class32.method231((byte) -109);
        } else if (class280.field4470 == 85) {
            class93.field1425 = new class11(22, true, class80.field1247);
            class280.field4470 = 88;
            class242.method1576(arg0 - 2, true);
            class32.method231((byte) 113);
        } else if (class280.field4470 == 88) {
            class162.field2338 = new class11(26, true, class80.field1247);
            class280.field4470 = 91;
            class242.method1576(0, true);
            class32.method231((byte) -110);
        } else {
            if (arg0 != 2) {
                field1387 = -115;
            }
            class94.field1427 = new class11(30, true, class80.field1247);
            class280.field4470 = 100;
            class242.method1576(0, true);
            class32.method231((byte) 79);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method620(byte arg0) {
        field1382 = null;
        field1385 = null;
        field1389 = null;
        field1386 = null;
        int var1 = -122 / ((arg0 - 37) / 58);
    }
}
