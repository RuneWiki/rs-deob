import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class194 extends class76 {

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "Lia;")
    public static class257 field3290 = null;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "Lia;")
    public static class257 field3293 = class28.method234(119, "Schlie-8en");

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "Z")
    public static boolean field3298 = false;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "Z")
    public static boolean field3296 = false;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    private int field3289;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    private int field3291;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    private int field3295;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
    private class194(int arg0) {
        super(0, false);
        this.method1305(arg0, 4080);
    }

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "(I)V")
    public static void method1304(int arg0) {
        if (arg0 > 25) {
            field3290 = null;
            field3293 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg1 < -86) {
            ++field3294;
            if (~arg2 == -1) {
                this.method1305(arg0.method1064((byte) -101), 4080);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)V")
    private final void method1305(int arg0, int arg1) {
        ++field3297;
        this.field3295 = 4080 & arg0 >> 4;
        this.field3291 = arg1 & arg0 >> 12;
        this.field3289 = arg0 << 4 & 4080;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lmb;III)Lfe;")
    public static final class155 method1306(class178 arg0, int arg1, int arg2, int arg3) {
        ++field3292;
        if (!class156.method1093(arg3, arg1 + 25598, arg2, arg0)) {
            return null;
        } else {
            return arg1 != -25709 ? null : class175.method1189(false);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class194() {
        this(0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        ++field3288;
        int[][] var3 = super.field1485.method649(arg0, true);
        if (arg1 <= 2) {
            method1306((class178) null, -40, 41, -20);
        }
        if (super.field1485.field1692) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class96.field1807 > var7; ++var7) {
                var4[var7] = this.field3291;
                var5[var7] = this.field3295;
                var6[var7] = this.field3289;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "(I)Z")
    public static final boolean method1307(int arg0) {
        ++field3299;
        long var1 = class80.method600(-106);
        int var3 = (int) (-class121.field2178 + var1);
        if (~var3 < -201) {
            var3 = 200;
        }
        class121.field2178 = var1;
        class27.field523 += var3;
        if (~class115.field2067 == -1 && ~class32.field619 == -1 && class138.field2459 == 0 && class80.field1566 == 0) {
            return true;
        } else if (class17.field380 == null) {
            return false;
        } else if (arg0 < 103) {
            return false;
        } else {
            try {
                if (class27.field523 > 30000) {
                    throw new IOException();
                } else {
                    while (~class32.field619 > -21 && ~class80.field1566 < -1) {
                        class137 var4 = (class137) class203.field3494.method427((byte) 58);
                        class152 var5 = new class152(4);
                        var5.method1023(13195, 1);
                        var5.method1019((byte) 73, (int) var4.field573);
                        class17.field380.method1419(4, 0, var5.field2638, 39);
                        class185.field3210.method424(var4, (byte) -40, var4.field573);
                        --class80.field1566;
                        ++class32.field619;
                    }
                    while (~class115.field2067 > -21 && ~class138.field2459 < -1) {
                        class137 var6 = (class137) class85.field1658.method984(-7553);
                        class152 var7 = new class152(4);
                        var7.method1023(13195, 0);
                        var7.method1019((byte) 118, (int) var6.field573);
                        class17.field380.method1419(4, 0, var7.field2638, -90);
                        var6.method815((byte) 125);
                        class158.field2774.method424(var6, (byte) -40, var6.field573);
                        ++class115.field2067;
                        --class138.field2459;
                    }
                    for (int var8 = 0; ~var8 > -101; ++var8) {
                        int var9 = class17.field380.method1423((byte) 87);
                        if (~var9 > -1) {
                            throw new IOException();
                        }
                        if (~var9 == -1) {
                            break;
                        }
                        class27.field523 = 0;
                        byte var10 = 0;
                        if (class132.field2358 != null) {
                            if (~class44.field1034 == -1) {
                                var10 = 1;
                            }
                        } else {
                            var10 = 8;
                        }
                        if (~var10 >= -1) {
                            int var11 = 512 - class44.field1034;
                            int var12 = class125.field2232.field2638.length + -class132.field2358.field2450;
                            if (var11 > -class125.field2232.field2677 + var12) {
                                var11 = -class125.field2232.field2677 + var12;
                            }
                            if (~var9 > ~var11) {
                                var11 = var9;
                            }
                            class17.field380.method1424(class125.field2232.field2638, class125.field2232.field2677, var11, (byte) -127);
                            if (~class145.field2537 != -1) {
                                for (int var13 = 0; ~var13 > ~var11; ++var13) {
                                    class125.field2232.field2638[class125.field2232.field2677 - -var13] = (byte) class238.method1553(class125.field2232.field2638[class125.field2232.field2677 + var13], class145.field2537);
                                }
                            }
                            class125.field2232.field2677 += var11;
                            class44.field1034 += var11;
                            if (~class125.field2232.field2677 == ~var12) {
                                if (~class132.field2358.field573 == -16711936L) {
                                    class50.field1112 = class125.field2232;
                                    for (int var14 = 0; var14 < 256; ++var14) {
                                        class226 var15 = class80.field1563[var14];
                                        if (var15 != null) {
                                            class50.field1112.field2677 = var14 * 8 + 5;
                                            int var16 = class50.field1112.method1042(119);
                                            int var17 = class50.field1112.method1042(115);
                                            var15.method1481(var17, -74, var16);
                                        }
                                    }
                                } else {
                                    class140.field2485.reset();
                                    class140.field2485.update(class125.field2232.field2638, 0, var12);
                                    int var18 = (int) class140.field2485.getValue();
                                    if (class132.field2358.field2447 != var18) {
                                        try {
                                            class17.field380.method1421((byte) 115);
                                        } catch (Exception var30) {
                                        }
                                        class17.field380 = null;
                                        ++class96.field1810;
                                        class145.field2537 = (byte) ((int) (1.0D + 255.0D * Math.random()));
                                        return false;
                                    }
                                    class96.field1810 = 0;
                                    class94.field1778 = 0;
                                    class132.field2358.field2451.method1478(26864, class199.field3401, (int) (class132.field2358.field573 & 65535L), (class132.field2358.field573 & 16711680L) == 16711680L, class125.field2232.field2638);
                                }
                                class132.field2358.method254(1);
                                if (!class199.field3401) {
                                    --class115.field2067;
                                } else {
                                    --class32.field619;
                                }
                                class132.field2358 = null;
                                class44.field1034 = 0;
                                class125.field2232 = null;
                            } else {
                                if (~class44.field1034 != -513) {
                                    break;
                                }
                                class44.field1034 = 0;
                            }
                        } else {
                            int var19 = -class236.field4047.field2677 + var10;
                            if (~var19 < ~var9) {
                                var19 = var9;
                            }
                            class17.field380.method1424(class236.field4047.field2638, class236.field4047.field2677, var19, (byte) -75);
                            if (class145.field2537 != 0) {
                                for (int var20 = 0; ~var20 > ~var19; ++var20) {
                                    class236.field4047.field2638[class236.field4047.field2677 - -var20] = (byte) class238.method1553(class236.field4047.field2638[class236.field4047.field2677 + var20], class145.field2537);
                                }
                            }
                            class236.field4047.field2677 += var19;
                            if (class236.field4047.field2677 < var10) {
                                break;
                            }
                            if (class132.field2358 == null) {
                                class236.field4047.field2677 = 0;
                                int var21 = class236.field4047.method1051((byte) 108);
                                int var22 = class236.field4047.method1063(-17162);
                                int var23 = class236.field4047.method1051((byte) 91);
                                int var24 = class236.field4047.method1042(113);
                                long var25 = (long) ((var21 << 16) - -var22);
                                class137 var27 = (class137) class185.field3210.method434((byte) -93, var25);
                                class199.field3401 = true;
                                if (var27 == null) {
                                    var27 = (class137) class158.field2774.method434((byte) -93, var25);
                                    class199.field3401 = false;
                                }
                                if (var27 == null) {
                                    throw new IOException();
                                }
                                int var28 = ~var23 == -1 ? 5 : 9;
                                class132.field2358 = var27;
                                class125.field2232 = new class152(var24 + var28 + class132.field2358.field2450);
                                class125.field2232.method1023(13195, var23);
                                class125.field2232.method1066(-1687589720, var24);
                                class44.field1034 = 8;
                                class236.field4047.field2677 = 0;
                            } else if (~class44.field1034 == -1) {
                                if (class236.field4047.field2638[0] != -1) {
                                    class132.field2358 = null;
                                } else {
                                    class44.field1034 = 1;
                                    class236.field4047.field2677 = 0;
                                }
                            }
                        }
                    }
                    return true;
                }
            } catch (IOException var31) {
                try {
                    class17.field380.method1421((byte) 83);
                } catch (Exception var29) {
                }
                ++class94.field1778;
                class17.field380 = null;
                return false;
            }
        }
    }
}
