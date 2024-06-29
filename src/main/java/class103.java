import java.io.IOException;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class103 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lr;")
    public static class66 field2004 = null;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lnj;")
    public static class230 field2016 = new class230(128);

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lwb;")
    public static class174 field2003;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "La;")
    public class20 field2007;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)V")
    public static final void method708(byte arg0, int arg1) {
        if (arg0 > 6) {
            field2006++;
            class156.field2768.method1611(-18767, arg1);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static final void method709(int arg0) {
        field2010++;
        if (arg0 != -1) {
            field2004 = null;
        }
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        class25.method110(-68, class131.field2452);
        class102.method706(class131.field2452, true);
        if (class66.field1276 != null) {
            class66.field1276.method46(arg0 + 101, class131.field2452);
        }
        class7.method27(-125);
        class190.method1247(class131.field2452, 1611550343);
        class27.method114(arg0 - 88, class131.field2452);
        if (class66.field1276 != null) {
            class66.field1276.method50(class131.field2452, true);
        }
        class145.method994(0);
        class3.field40 = 0L;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lr;B)V")
    public static final void method710(class66 arg0, byte arg1) {
        field2013++;
        if (class130.field2430 >= 2) {
            if (arg0.method470(false, class95.field1827)) {
                class196.method1279(0);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class234.method1533((class66) null, 14, class212.method1372(2, new class66[] { class15.field201, class144.method989(var4, 0), class51.field899 }), 0);
            }
            if (arg0.method470(false, class49.field871)) {
                class27.method119((byte) -21);
            }
            if (arg0.method470(false, class188.field3269)) {
                class112.method755(25, (byte) -98);
            }
            if (arg0.method470(false, class47.field847)) {
                class15.field185 = true;
            }
            if (arg0.method470(false, class163.field2917)) {
                class15.field185 = false;
            }
            if (arg0.method470(false, class194.field3355)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class193.field3346[var5].field2976[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method459(class91.field1759, 95) && class81.field1585 != 0) {
                class132.method915(arg0.method485(6, true).method489((byte) 16), -47);
            }
            if (arg0.method470(false, class2.field34) && class81.field1585 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method459(class97.field1893, 96)) {
                class26.field335 = arg0.method485(12, true).method455(true).method489((byte) -41);
                class234.method1533((class66) null, 126, class212.method1372(2, new class66[] { class150.field2693, class144.method989(class26.field335, 0) }), 0);
            }
            if (arg0.method470(false, class57.field976)) {
                class102.field1999 = true;
            }
        }
        if (arg1 == 1) {
            class26.field330++;
            class28.field412.method578(-64, 107);
            class28.field412.method1638(32, arg0.method460((byte) -96) - 1);
            class28.field412.method1641((byte) -9, arg0.method485(2, true));
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIBIII)V")
    public static final void method711(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2011++;
        int var6 = arg1 - arg5;
        int var7 = arg3 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class196.method1278(-6, arg0, arg1, arg4, arg5);
            }
        } else if (var6 == 0) {
            class109.method740(1, arg3, arg0, arg4, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            if (arg2 > 29) {
                boolean var8 = var6 > var7;
                if (var8) {
                    int var9 = arg0;
                    arg0 = arg5;
                    int var10 = arg3;
                    arg5 = var9;
                    arg3 = arg1;
                    arg1 = var10;
                }
                if (arg0 > arg3) {
                    int var11 = arg0;
                    int var12 = arg5;
                    arg5 = arg1;
                    arg0 = arg3;
                    arg3 = var11;
                    arg1 = var12;
                }
                int var13 = arg3 - arg0;
                int var14 = arg5;
                int var15 = arg1 - arg5;
                int var16 = -(var13 >> 1);
                int var17 = arg1 > arg5 ? 1 : -1;
                if (var15 < 0) {
                    var15 = -var15;
                }
                if (var8) {
                    for (int var19 = arg0; var19 <= arg3; var19++) {
                        class15.field183[var19][var14] = arg4;
                        var16 += var15;
                        if (var16 > 0) {
                            var14 += var17;
                            var16 -= var13;
                        }
                    }
                } else {
                    for (int var18 = arg0; var18 <= arg3; var18++) {
                        class15.field183[var14][var18] = arg4;
                        var16 += var15;
                        if (var16 > 0) {
                            var16 -= var13;
                            var14 += var17;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Z")
    public static final boolean method712(int arg0) {
        field2015++;
        if (arg0 >= -86) {
            return true;
        }
        long var1 = class3.method13(17161);
        int var3 = (int) (var1 - class64.field1273);
        if (var3 > 200) {
            var3 = 200;
        }
        class125.field2363 += var3;
        class64.field1273 = var1;
        if (class110.field2123 == 0 && class175.field3076 == 0 && class167.field3008 == 0 && class87.field1707 == 0) {
            return true;
        } else if (class147.field2674 == null) {
            return false;
        } else {
            try {
                if (class125.field2363 > 30000) {
                    throw new IOException();
                }
                while (class175.field3076 < 20 && class87.field1707 > 0) {
                    class54 var4 = (class54) class252.field4427.method1382(-32642);
                    class249 var5 = new class249(4);
                    var5.method1638(32, 1);
                    var5.method1645((int) var4.field1560, false);
                    class147.field2674.method1273(0, (byte) 34, 4, var5.field4350);
                    class156.field2775.method1380((byte) -21, var4, var4.field1560);
                    class175.field3076++;
                    class87.field1707--;
                }
                while (class110.field2123 < 20 && class167.field3008 > 0) {
                    class54 var6 = (class54) class207.field3589.method1132(1742);
                    class249 var7 = new class249(4);
                    var7.method1638(32, 0);
                    var7.method1645((int) var6.field1560, false);
                    class147.field2674.method1273(0, (byte) 88, 4, var7.field4350);
                    var6.method704((byte) 73);
                    class257.field4519.method1380((byte) -82, var6, var6.field1560);
                    class167.field3008--;
                    class110.field2123++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class147.field2674.method1280((byte) 102);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    byte var10 = 0;
                    class125.field2363 = 0;
                    if (class24.field313 == null) {
                        var10 = 8;
                    } else if (class90.field1745 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class250.field4407.field4335;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class147.field2674.method1274(-122, var11, class250.field4407.field4335, class250.field4407.field4350);
                        if (class86.field1684 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class250.field4407.field4350[class250.field4407.field4335 + var12] = (byte) class109.method741(class250.field4407.field4350[class250.field4407.field4335 + var12], class86.field1684);
                            }
                        }
                        class250.field4407.field4335 += var11;
                        if (var10 > class250.field4407.field4335) {
                            break;
                        }
                        if (class24.field313 == null) {
                            class250.field4407.field4335 = 0;
                            int var13 = class250.field4407.method1677(-6677);
                            int var14 = class250.field4407.method1674(1355769544);
                            int var15 = class250.field4407.method1677(-6677);
                            int var16 = class250.field4407.method1652(-5528);
                            long var17 = (long) ((var13 << 16) + var14);
                            class54 var19 = (class54) class156.field2775.method1381(var17, 84);
                            class193.field3341 = true;
                            if (var19 == null) {
                                var19 = (class54) class257.field4519.method1381(var17, 101);
                                class193.field3341 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class24.field313 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class252.field4432 = new class249(class24.field313.field936 + var20 + var16);
                            class252.field4432.method1638(32, var15);
                            class252.field4432.method1666(544537784, var16);
                            class250.field4407.field4335 = 0;
                            class90.field1745 = 8;
                        } else if (class90.field1745 == 0) {
                            if (class250.field4407.field4350[0] == -1) {
                                class90.field1745 = 1;
                                class250.field4407.field4335 = 0;
                            } else {
                                class24.field313 = null;
                            }
                        }
                    } else {
                        int var21 = class252.field4432.field4350.length - class24.field313.field936;
                        int var22 = 512 - class90.field1745;
                        if ((var21 - class252.field4432.field4335) < var22) {
                            var22 = var21 - class252.field4432.field4335;
                        }
                        if (var9 < var22) {
                            var22 = var9;
                        }
                        class147.field2674.method1274(-60, var22, class252.field4432.field4335, class252.field4432.field4350);
                        if (class86.field1684 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class252.field4432.field4350[class252.field4432.field4335 + var23] = (byte) class109.method741(class252.field4432.field4350[class252.field4432.field4335 + var23], class86.field1684);
                            }
                        }
                        class252.field4432.field4335 += var22;
                        class90.field1745 += var22;
                        if (class252.field4432.field4335 == var21) {
                            if (class24.field313.field1560 == 16711935L) {
                                class91.field1749 = class252.field4432;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class247 var26 = class102.field1986[var25];
                                    if (var26 != null) {
                                        class91.field1749.field4335 = var25 * 8 + 5;
                                        int var27 = class91.field1749.method1652(-5528);
                                        int var28 = class91.field1749.method1652(-5528);
                                        var26.method1626(var28, (byte) 102, var27);
                                    }
                                }
                            } else {
                                class93.field1789.reset();
                                class93.field1789.update(class252.field4432.field4350, 0, var21);
                                int var24 = (int) class93.field1789.getValue();
                                if (class24.field313.field937 != var24) {
                                    try {
                                        class147.field2674.method1277(-105);
                                    } catch (Exception var30) {
                                    }
                                    class95.field1831++;
                                    class147.field2674 = null;
                                    class86.field1684 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                class95.field1831 = 0;
                                class49.field880 = 0;
                                class24.field313.field939.method1629(class193.field3341, (class24.field313.field1560 & 0xFF0000L) == 16711680L, (int) (class24.field313.field1560 & 0xFFFFL), 125, class252.field4432.field4350);
                            }
                            class24.field313.method560(-17554);
                            class90.field1745 = 0;
                            class24.field313 = null;
                            class252.field4432 = null;
                            if (class193.field3341) {
                                class175.field3076--;
                            } else {
                                class110.field2123--;
                            }
                        } else {
                            if (class90.field1745 != 512) {
                                break;
                            }
                            class90.field1745 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class147.field2674.method1277(-89);
                } catch (Exception var29) {
                }
                class147.field2674 = null;
                class49.field880++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZIILuc;ZI)V")
    public static final void method713(boolean arg0, int arg1, int arg2, class224 arg3, boolean arg4, int arg5) {
        field2012++;
        if (class7.field64 >= 50 || arg3.field3810 == null || arg3.field3810.length <= arg1 || arg3.field3810[arg1] == null) {
            return;
        }
        if (arg0) {
            method712(105);
        }
        int var6 = arg3.field3810[arg1][0];
        int var7 = var6 >> 8;
        if (arg3.field3810[arg1].length > 1) {
            int var8 = (int) (Math.random() * (double) arg3.field3810[arg1].length);
            if (var8 > 0) {
                var7 = arg3.field3810[arg1][var8];
            }
        }
        int var9 = var6 & 0xF;
        int var10 = var6 >> 4 & 0x7;
        if (var9 == 0) {
            if (arg4) {
                class140.method969((byte) -124, 0, var10, var7);
            }
        } else if (class54.field944 != 0) {
            class230.field3984[class7.field64] = var7;
            class257.field4521[class7.field64] = var10;
            class194.field3356[class7.field64] = 0;
            int var11 = (arg2 - 64) / 128;
            class214.field3679[class7.field64] = null;
            int var12 = (arg5 - 64) / 128;
            class178.field3123[class7.field64] = (var11 << 16) + (var12 << 8) + var9;
            class7.field64++;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZBI)Lr;")
    public static final class66 method714(boolean arg0, byte arg1, int arg2) {
        field2009++;
        if (arg1 != 42) {
            method718(126);
        }
        return class138.method947(10, arg0, (byte) 125, arg2);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZIIZ)Ljb;")
    public static final class256 method715(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        field2005++;
        int var7 = (arg0 << 17) + arg3 + (arg5 ? 65536 : 0) + (arg4 << 19);
        long var8 = (long) arg1 * 3147483667L + (long) var7 * 3849834839L;
        class256 var10 = (class256) class63.field1241.method1617(14366, var8);
        if (var10 != null) {
            return var10;
        }
        class123.field2311 = false;
        class256 var11 = class130.method904(arg2, arg4, -126, arg3, arg5, arg0, false, arg1);
        if (var11 != null && !class123.field2311) {
            class63.field1241.method1615(var11, 121, var8);
        }
        return var11;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public static final void method716(int arg0) {
        field2008++;
        int[] var1 = new int[class133.field2480];
        if (arg0 != 4) {
            return;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class133.field2480; var3++) {
            class157 var5 = class40.method242(-25672, var3);
            if (var5.field2841 >= 0 || var5.field2838 >= 0) {
                var1[var2++] = var3;
            }
        }
        class156.field2776 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class156.field2776[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static final void method717(byte arg0) {
        field2014++;
        class205.field3511.method1613((byte) 94);
        class95.field1823.method1613((byte) 94);
        if (arg0 > -56) {
            field2003 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public static void method718(int arg0) {
        field2003 = null;
        field2004 = null;
        if (arg0 == 8412) {
            field2016 = null;
        }
    }
}
