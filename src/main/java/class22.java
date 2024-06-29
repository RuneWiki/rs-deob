import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class22 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "[[B")
    public byte[][] field297 = new byte[6][258];

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public int field310 = 0;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "[I")
    public int[] field294 = new int[6];

    @OriginalMember(owner = "client!a", name = "x", descriptor = "[B")
    public byte[] field317 = new byte[18002];

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
    public int[] field299 = new int[257];

    @OriginalMember(owner = "client!a", name = "j", descriptor = "[B")
    public byte[] field303 = new byte[18002];

    @OriginalMember(owner = "client!a", name = "m", descriptor = "[[I")
    public int[][] field306 = new int[6][258];

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public int field318 = 0;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[B")
    public byte[] field295 = new byte[256];

    @OriginalMember(owner = "client!a", name = "o", descriptor = "[[I")
    public int[][] field308 = new int[6][258];

    @OriginalMember(owner = "client!a", name = "H", descriptor = "[B")
    public byte[] field327 = new byte[4096];

    @OriginalMember(owner = "client!a", name = "z", descriptor = "[I")
    public int[] field319 = new int[16];

    @OriginalMember(owner = "client!a", name = "F", descriptor = "[Z")
    public boolean[] field325 = new boolean[16];

    @OriginalMember(owner = "client!a", name = "M", descriptor = "[Z")
    public boolean[] field332 = new boolean[256];

    @OriginalMember(owner = "client!a", name = "L", descriptor = "[I")
    public int[] field331 = new int[256];

    @OriginalMember(owner = "client!a", name = "I", descriptor = "[[I")
    public int[][] field328 = new int[6][258];

    @OriginalMember(owner = "client!a", name = "e", descriptor = "[I")
    public static int[] field298 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lck;")
    public static class119 field296 = class298.method1987((byte) 36, " )2> ");

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field304 = 0;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
    public static int[] field312 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!a", name = "N", descriptor = "Ljc;")
    public static class147 field333 = new class147(5000);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "B")
    public byte field324;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public int field301;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[B")
    public byte[] field316;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "[B")
    public byte[] field326;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Lck;", line = 16)
    public static final class119 method169(byte arg0, int arg1) {
        field320++;
        if (arg1 >= 100000) {
            int var2 = -55 % ((-arg0 - 72) / 53);
            return arg1 < 10000000 ? class170.method1074(new class119[] { class292.field4872, class234.method1506(arg1 / 1000, (byte) -79), class229.field3717, class242.field3894 }, -113) : class170.method1074(new class119[] { class237.field3805, class234.method1506(arg1 / 1000000, (byte) -79), class20.field265, class242.field3894 }, -77);
        } else {
            return class170.method1074(new class119[] { class260.field4171, class234.method1506(arg1, (byte) -79), class242.field3894 }, -86);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Z", line = 88)
    public static final boolean method170(byte arg0) {
        field322++;
        long var1 = class110.method707((byte) 126);
        int var3 = (int) (var1 - class204.field3236);
        class204.field3236 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class207.field3297 += var3;
        if (class230.field3727 == 0 && class156.field2483 == 0 && class46.field666 == 0 && class196.field3139 == 0) {
            return true;
        } else if (class233.field3760 == null) {
            return false;
        } else {
            if (arg0 >= -73) {
                field298 = (int[]) null;
            }
            try {
                if (class207.field3297 > 30000) {
                    throw new IOException();
                }
                while (class156.field2483 < 20 && class196.field3139 > 0) {
                    class117 var4 = (class117) class209.field3332.method1325(-60);
                    class3 var5 = new class3(4);
                    var5.method32(1, (byte) -99);
                    var5.method21((int) var4.field1218, 1535561064);
                    class233.field3760.method1630(0, 4, (byte) -70, var5.field101);
                    class93.field1431.method1326(var4.field1218, (byte) -100, var4);
                    class196.field3139--;
                    class156.field2483++;
                }
                while (class230.field3727 < 20 && class46.field666 > 0) {
                    class117 var6 = (class117) class265.field4328.method583((byte) 105);
                    class3 var7 = new class3(4);
                    var7.method32(0, (byte) -99);
                    var7.method21((int) var6.field1218, 1535561064);
                    class233.field3760.method1630(0, 4, (byte) -70, var7.field101);
                    var6.method911((byte) 79);
                    class260.field4153.method1326(var6.field1218, (byte) -100, var6);
                    class230.field3727++;
                    class46.field666--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class233.field3760.method1633(83);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    byte var10 = 0;
                    class207.field3297 = 0;
                    if (class207.field3305 == null) {
                        var10 = 8;
                    } else if (class261.field4173 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class96.field1477.field101.length - class207.field3305.field1766;
                        int var12 = 512 - class261.field4173;
                        if (var11 - class96.field1477.field44 < var12) {
                            var12 = var11 - class96.field1477.field44;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class233.field3760.method1627(class96.field1477.field44, (byte) 82, var12, class96.field1477.field101);
                        if (class241.field3871 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class96.field1477.field101[class96.field1477.field44 + var13] = (byte) class81.method558(class96.field1477.field101[class96.field1477.field44 + var13], class241.field3871);
                            }
                        }
                        class96.field1477.field44 += var12;
                        class261.field4173 += var12;
                        if (class96.field1477.field44 == var11) {
                            if (class207.field3305.field1218 == 16711935L) {
                                class102.field1557 = class96.field1477;
                                for (int var16 = 0; var16 < 256; var16++) {
                                    class23 var17 = class129.field1976[var16];
                                    if (var17 != null) {
                                        class102.field1557.field44 = var16 * 8 + 5;
                                        int var18 = class102.field1557.method71(-668527048);
                                        int var19 = class102.field1557.method71(-668527048);
                                        var17.method178(var18, var19, -2210);
                                    }
                                }
                            } else {
                                class74.field1162.reset();
                                class74.field1162.update(class96.field1477.field101, 0, var11);
                                int var14 = (int) class74.field1162.getValue();
                                if (class207.field3305.field1761 != var14) {
                                    try {
                                        class233.field3760.method1629(-100);
                                    } catch (Exception var33) {
                                    }
                                    class241.field3871 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    class233.field3760 = null;
                                    class19.field239++;
                                    return false;
                                }
                                class215.field3426 = 0;
                                class19.field239 = 0;
                                class207.field3305.field1762.method183(class56.field899, (int) (class207.field3305.field1218 & 0xFFFFL), class96.field1477.field101, 124, (class207.field3305.field1218 & 0xFF0000L) == 16711680L);
                            }
                            class207.field3305.method552((byte) -112);
                            class207.field3305 = null;
                            class261.field4173 = 0;
                            if (class56.field899) {
                                class156.field2483--;
                            } else {
                                class230.field3727--;
                            }
                            class96.field1477 = null;
                        } else {
                            if (class261.field4173 != 512) {
                                break;
                            }
                            class261.field4173 = 0;
                        }
                    } else {
                        int var20 = var10 - class139.field2227.field44;
                        if (var20 > var9) {
                            var20 = var9;
                        }
                        class233.field3760.method1627(class139.field2227.field44, (byte) 108, var20, class139.field2227.field101);
                        if (class241.field3871 != 0) {
                            for (int var21 = 0; var21 < var20; var21++) {
                                class139.field2227.field101[class139.field2227.field44 + var21] = (byte) class81.method558(class139.field2227.field101[class139.field2227.field44 + var21], class241.field3871);
                            }
                        }
                        class139.field2227.field44 += var20;
                        if (class139.field2227.field44 < var10) {
                            break;
                        }
                        if (class207.field3305 == null) {
                            class139.field2227.field44 = 0;
                            int var22 = class139.field2227.method64((byte) 23);
                            int var23 = class139.field2227.method63((byte) 1);
                            int var24 = class139.field2227.method64((byte) -102);
                            int var25 = class139.field2227.method71(-668527048);
                            long var26 = (long) ((var22 << 16) + var23);
                            class117 var28 = (class117) class93.field1431.method1329((byte) 90, var26);
                            class56.field899 = true;
                            if (var28 == null) {
                                var28 = (class117) class260.field4153.method1329((byte) 90, var26);
                                class56.field899 = false;
                            }
                            if (var28 == null) {
                                throw new IOException();
                            }
                            class207.field3305 = var28;
                            int var29 = var24 == 0 ? 5 : 9;
                            class96.field1477 = new class3(var25 + var29 + class207.field3305.field1766);
                            class96.field1477.method32(var24, (byte) -99);
                            class96.field1477.method26(var25, 97);
                            class139.field2227.field44 = 0;
                            class261.field4173 = 8;
                        } else if (class261.field4173 == 0) {
                            if (class139.field2227.field101[0] == -1) {
                                class139.field2227.field44 = 0;
                                class261.field4173 = 1;
                            } else {
                                class207.field3305 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var34) {
                try {
                    class233.field3760.method1629(-109);
                } catch (Exception var32) {
                }
                class233.field3760 = null;
                class215.field3426++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 413)
    public static void method171(int arg0) {
        field333 = null;
        field296 = null;
        field298 = null;
        field312 = null;
        int var1 = -123 / ((18 - arg0) / 32);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(BI)I", line = 450)
    public static final int method172(byte arg0, int arg1) {
        field309++;
        return arg0 >= -8 ? 89 : (arg1 & 0xE9969) >> 17;
    }
}
