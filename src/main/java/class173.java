import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sg")
public class class173 {

    @OriginalMember(owner = "sg", name = "b", descriptor = "[I")
    public static int[] field3230 = new int[] { 7, 0, 0, -1, 0, 2, 0, 0, 0, 0, 6, 3, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 3, 1, 0, -2, 0, -1, -2, 0, 0, -2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 24, 0, 7, 6, 4, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 11, 6, 0, 0, 0, 0, 3, 0, 0, 0, -1, 6, 6, 10, 0, 6, 0, 0, 5, 0, 0, 7, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 6, 0, 6, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 4, 2, 0, 0, 0, 0, 0, 6, 0, 5, 10, 0, 0, 0, 0, 6, 0, 15, 0, 0, 0, 0, -2, 5, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, -2, 2, 0, 0, 0, 12, 2, 0, 0, 0, 0, 4, 0, -2, -1, 1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 3, -2, 0, 0, 2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, -2, 0, 0, 6, 0, 0, 0, 0, 8, 0, 0, 0, 5, 11, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 1, 0, 0, 0, 0, 0, 4, 0, -1, 0, 0, 0 };

    @OriginalMember(owner = "sg", name = "a", descriptor = "I")
    public static int field3229 = 0;

    @OriginalMember(owner = "sg", name = "f", descriptor = "Z")
    public static volatile boolean field3234 = false;

    @OriginalMember(owner = "sg", name = "j", descriptor = "[I")
    public static int[] field3238 = new int[2000];

    @OriginalMember(owner = "sg", name = "c", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "sg", name = "e", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "sg", name = "g", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "sg", name = "h", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "sg", name = "i", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "sg", name = "k", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "sg", name = "d", descriptor = "J")
    public static long field3232;

    @OriginalMember(owner = "sg", name = "a", descriptor = "(I)V")
    public static void method1155(int arg0) {
        if (arg0 != -21365) {
            field3232 = 8L;
        }
        field3230 = null;
        field3238 = null;
    }

    @OriginalMember(owner = "sg", name = "b", descriptor = "(I)V")
    public static final void method1156(int arg0) {
        class98.field1967 = 0;
        field3239++;
        class184.field3479 = 0;
        class161.method1093(16636);
        class59.method388(false);
        class143.method1010(4);
        for (int var1 = 0; var1 < class184.field3479; var1++) {
            int var3 = class126.field2437[var1];
            if (class143.field2754 != class183.field3444[var3].field3613) {
                class183.field3444[var3].field2691 = null;
                class183.field3444[var3] = null;
            }
        }
        if (arg0 < 30) {
            return;
        }
        if (class204.field4006 != class95.field1934.field1773) {
            throw new RuntimeException("gnp1 pos:" + class95.field1934.field1773 + " psize:" + class204.field4006);
        }
        for (int var2 = 0; var2 < class1.field10; var2++) {
            if (class183.field3444[class1.field8[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class1.field10);
            }
        }
    }

    @OriginalMember(owner = "sg", name = "c", descriptor = "(I)V")
    public static final void method1157(int arg0) {
        if (arg0 != 13238) {
            return;
        }
        field3233++;
        while (true) {
            class181 var1 = class51.field1037;
            class136 var2;
            synchronized (class51.field1037) {
                var2 = (class136) class72.field1395.method1229((byte) 108);
            }
            if (var2 == null) {
                return;
            }
            var2.field2636.method988(var2.field2635, var2.field2624, false, false, (int) var2.field1381);
        }
    }

    @OriginalMember(owner = "sg", name = "a", descriptor = "(IIIB)I")
    public static final int method1158(int arg0, int arg1, int arg2, byte arg3) {
        field3237++;
        if (arg3 < 97) {
            method1160(19);
        }
        int var4 = 256 - arg1;
        return ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg1 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >> 8;
    }

    @OriginalMember(owner = "sg", name = "a", descriptor = "(Z)Lsc;")
    public static final class169 method1159(boolean arg0) {
        if (class29.field619 == null) {
            class29.field619 = new class169();
        }
        if (arg0) {
            field3236++;
            return class29.field619;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "sg", name = "d", descriptor = "(I)Z")
    public static final boolean method1160(int arg0) {
        long var1 = class123.method880(false);
        field3231++;
        int var3 = (int) (var1 - field3232);
        field3232 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        client.field681 += var3;
        if (class5.field79 == 0 && class163.field3044 == 0 && class26.field550 == 0 && class150.field2889 == 0) {
            return true;
        } else if (class199.field3800 == null) {
            return false;
        } else {
            try {
                if (client.field681 > 30000) {
                    throw new IOException();
                }
                while (class163.field3044 < 20 && class150.field2889 > 0) {
                    class180 var4 = (class180) class149.field2880.method338((byte) 91);
                    class86 var5 = new class86(4);
                    var5.method568(-13488, 1);
                    var5.method549((int) var4.field1381, -2140);
                    class199.field3800.method908(-120, 0, 4, var5.field1808);
                    class134.field2571.method339(var4.field1381, false, var4);
                    class150.field2889--;
                    class163.field3044++;
                }
                while (class5.field79 < 20 && class26.field550 > 0) {
                    class180 var6 = (class180) class5.field66.method743(false);
                    class86 var7 = new class86(4);
                    var7.method568(-13488, 0);
                    var7.method549((int) var6.field1381, -2140);
                    class199.field3800.method908(-88, 0, 4, var7.field1808);
                    var6.method1031((byte) 3);
                    class13.field211.method339(var6.field1381, false, var6);
                    class5.field79++;
                    class26.field550--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class199.field3800.method907(-87);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    client.field681 = 0;
                    byte var10 = 0;
                    if (class103.field2031 == null) {
                        var10 = 8;
                    } else if (class79.field1568 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class150.field2895.field1808.length - class103.field2031.field3394;
                        int var12 = 512 - class79.field1568;
                        if (var11 - class150.field2895.field1773 < var12) {
                            var12 = var11 - class150.field2895.field1773;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class199.field3800.method906(arg0 ^ 0x68FA, var12, class150.field2895.field1808, class150.field2895.field1773);
                        if (class75.field1453 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class150.field2895.field1808[class150.field2895.field1773 + var13] = (byte) class24.method217(class150.field2895.field1808[class150.field2895.field1773 + var13], class75.field1453);
                            }
                        }
                        class150.field2895.field1773 += var12;
                        class79.field1568 += var12;
                        if (class150.field2895.field1773 == var11) {
                            if (class103.field2031.field1381 == 16711935L) {
                                class118.field2328 = class150.field2895;
                                for (int var15 = 0; var15 < 256; var15++) {
                                    class138 var16 = class51.field1035[var15];
                                    if (var16 != null) {
                                        class118.field2328.field1773 = var15 * 8 + 5;
                                        int var17 = class118.field2328.method582(15);
                                        int var18 = class118.field2328.method582(15);
                                        var16.method985(arg0 ^ 0x68FE, var17, var18);
                                    }
                                }
                            } else {
                                class149.field2878.reset();
                                class149.field2878.update(class150.field2895.field1808, 0, var11);
                                int var14 = (int) class149.field2878.getValue();
                                if (class103.field2031.field3403 != var14) {
                                    try {
                                        class199.field3800.method915((byte) -100);
                                    } catch (Exception var30) {
                                    }
                                    class75.field1453 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class192.field3676++;
                                    class199.field3800 = null;
                                    return false;
                                }
                                class75.field1428 = 0;
                                class192.field3676 = 0;
                                class103.field2031.field3393.method987(class150.field2895.field1808, -50, (class103.field2031.field1381 & 0xFF0000L) == 16711680L, class129.field2494, (int) (class103.field2031.field1381 & 0xFFFFL));
                            }
                            class103.field2031.method452(true);
                            class79.field1568 = 0;
                            class150.field2895 = null;
                            class103.field2031 = null;
                            if (class129.field2494) {
                                class163.field3044--;
                            } else {
                                class5.field79--;
                            }
                        } else {
                            if (class79.field1568 != 512) {
                                break;
                            }
                            class79.field1568 = 0;
                        }
                    } else {
                        int var19 = var10 - class105.field2092.field1773;
                        if (var9 < var19) {
                            var19 = var9;
                        }
                        class199.field3800.method906(-66, var19, class105.field2092.field1808, class105.field2092.field1773);
                        if (class75.field1453 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class105.field2092.field1808[class105.field2092.field1773 + var20] = (byte) class24.method217(class105.field2092.field1808[class105.field2092.field1773 + var20], class75.field1453);
                            }
                        }
                        class105.field2092.field1773 += var19;
                        if (class105.field2092.field1773 < var10) {
                            break;
                        }
                        if (class103.field2031 == null) {
                            class105.field2092.field1773 = 0;
                            int var21 = class105.field2092.method598((byte) 78);
                            int var22 = class105.field2092.method569(true);
                            long var23 = (long) ((var21 << 16) + var22);
                            int var25 = class105.field2092.method598((byte) 99);
                            int var26 = class105.field2092.method582(arg0 - 26746);
                            class180 var27 = (class180) class134.field2571.method337(var23, (byte) -117);
                            class129.field2494 = true;
                            if (var27 == null) {
                                var27 = (class180) class13.field211.method337(var23, (byte) -80);
                                class129.field2494 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class103.field2031 = var27;
                            int var28 = var25 == 0 ? 5 : 9;
                            class150.field2895 = new class86(class103.field2031.field3394 + var28 + var26);
                            class150.field2895.method568(arg0 - 40249, var25);
                            class150.field2895.method588((byte) 114, var26);
                            class79.field1568 = 8;
                            class105.field2092.field1773 = 0;
                        } else if (class79.field1568 == 0) {
                            if (class105.field2092.field1808[0] == -1) {
                                class79.field1568 = 1;
                                class105.field2092.field1773 = 0;
                            } else {
                                class103.field2031 = null;
                            }
                        }
                    }
                }
                if (arg0 != 26761) {
                    field3234 = false;
                }
                return true;
            } catch (IOException var31) {
                try {
                    class199.field3800.method915((byte) -128);
                } catch (Exception var29) {
                }
                class199.field3800 = null;
                class75.field1428++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "sg", name = "e", descriptor = "(I)V")
    public static final void method1161(int arg0) {
        field3235++;
        class98.field1967 = 0;
        class184.field3479 = 0;
        class88.method654(1);
        class117.method857(14099);
        class106.method765(5);
        class73.method462(116);
        for (int var1 = 0; var1 < class184.field3479; var1++) {
            int var3 = class126.field2437[var1];
            if (class143.field2754 != class202.field3975[var3].field3613) {
                class202.field3975[var3] = null;
            }
        }
        if (class204.field4006 != class95.field1934.field1773) {
            throw new RuntimeException("gpp1 pos:" + class95.field1934.field1773 + " psize:" + class204.field4006);
        }
        if (arg0 < 101) {
            field3229 = 110;
        }
        for (int var2 = 0; var2 < class157.field2956; var2++) {
            if (class202.field3975[class125.field2405[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class157.field2956);
            }
        }
    }
}
