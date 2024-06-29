import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class110 extends class114 {

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    private int field1566 = 0;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    private int field1569 = 5;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "[B")
    private byte[] field1572 = new byte[512];

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    private int field1561 = 2;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
    private int field1579 = 1;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    private int field1567 = 2048;

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "I")
    private int field1581 = 5;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "[S")
    private short[] field1574 = new short[512];

    @OriginalMember(owner = "client!p", name = "db", descriptor = "I")
    public static int field1578 = 2301979;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "Lsc;")
    public static class166 field1563 = new class166();

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "I")
    public static int field1584 = 0;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!p", name = "kb", descriptor = "Lca;")
    public static class138 field1585;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "Lnh;")
    public static class305 field1568;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "Lnh;")
    public static class305 field1573;

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "[[B")
    public static byte[][] field1583;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
    public static void method699(byte arg0) {
        field1563 = null;
        field1568 = null;
        if (arg0 >= 111) {
            field1585 = null;
            field1573 = null;
            field1583 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZB)V")
    public static final void method700(boolean arg0, byte arg1) {
        if (arg1 < -94) {
            ++field1570;
            if (arg0) {
                if (~class104.field1499 != 0) {
                    method705(class104.field1499, true);
                }
                for (class60 var2 = (class60) class186.field2821.method1458(0); var2 != null; var2 = (class60) class186.field2821.method1462(-10000001)) {
                    class166.method1067(4, var2, true);
                }
                class104.field1499 = -1;
                class186.field2821 = new class222(8);
                class103.method661(-1);
                class104.field1499 = class164.field2325;
                class241.method1587((byte) 124, false);
                class139.method887((byte) 121);
                class72.method477(class104.field1499, 0);
            }
            class43.field645 = -1;
            class85.method556(2, class75.field1054);
            class250.field3905 = new class314();
            class250.field3905.field4081 = 3000;
            class250.field3905.field4140 = 3000;
            if (class188.field2856 == 0) {
                class197.method1243(class311.field5009, -50);
                class82.method519(-112, 10);
            } else {
                if (class12.field203 == 2) {
                    class178.field2603 = class142.field1944 << 7;
                    class188.field2848 = class23.field370 << 7;
                } else {
                    class116.method743(84);
                }
                class184.method1173(0);
                class82.method519(-124, 28);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)V")
    public static final void method701(byte arg0, int arg1, int arg2) {
        if (arg0 != 23) {
            method700(true, (byte) 99);
        }
        ++class309.field4982;
        ++field1577;
        class231.field3614.method809(27, 0);
        class231.field3614.method1371(arg1, arg0 ^ -106);
        class231.field3614.method1393(-2032582224, arg2);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class110() {
        super(0, true);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
    private final void method702(byte arg0) {
        ++field1580;
        Random var2 = new Random((long) this.field1566);
        this.field1574 = new short[512];
        if (~this.field1567 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field1574[var3] = (short) class137.method863(var2, (byte) 110, this.field1567);
            }
        }
        if (arg0 != -74) {
            method703(97, -42);
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II)Z")
    public static final boolean method703(int arg0, int arg1) {
        byte var2 = 0;
        ++field1575;
        byte var3 = 0;
        if (class178.field2559 == null) {
            if (class200.field3039 == null) {
                class178.field2559 = new class203(512, 512);
            } else {
                class178.field2559 = (class203) class200.field3039;
            }
            int[] var4 = class178.field2559.field3058;
            int var5 = var4.length;
            for (int var6 = 0; var5 > var6; ++var6) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; -var3 + -1 + 104 > var7; ++var7) {
                int var23 = (var3 + 103 + -var7) * 512 * 4 + 24628;
                for (int var24 = var2 - -1; ~var24 > ~(-var2 + 104 + -1); ++var24) {
                    if ((class164.field2333[arg0][var24][var7] & 24) == 0) {
                        class31.method195(var4, var23, 512, arg0, var24, var7);
                    }
                    if (~arg0 > -4 && (8 & class164.field2333[arg0 + 1][var24][var7]) != 0) {
                        class31.method195(var4, var23, 512, arg0 - -1, var24, var7);
                    }
                    var23 += 4;
                }
            }
            class221.field3436 = 0;
            for (int var8 = 0; var8 < 104; ++var8) {
                for (int var9 = 0; ~var9 > -105; ++var9) {
                    long var10 = class169.method1079(arg0, var2 + var8, var9 - -var3);
                    if (var10 == 0L) {
                        var10 = class156.method970(arg0, var2 + var8, var3 + var9);
                    }
                    if (var10 == 0L) {
                        var10 = class51.method312(arg0, var8 - -var2, var3 + var9);
                    }
                    if (var10 == 0L) {
                        var10 = class5.method27(arg0, var8 - -var2, var3 + var9);
                    }
                    if (var10 != 0L) {
                        class240 var12 = class265.method1717(105, Integer.MAX_VALUE & (int) (var10 >>> 32));
                        if (!var12.field3726 || class252.field3939) {
                            int var13 = var12.field3758;
                            if (var12.field3766 != null) {
                                for (int var14 = 0; var12.field3766.length > var14; ++var14) {
                                    if (var12.field3766[var14] != -1) {
                                        class240 var15 = class265.method1717(-109, var12.field3766[var14]);
                                        if (var15.field3758 >= 0) {
                                            var13 = var15.field3758;
                                        }
                                    }
                                }
                            }
                            if (var13 >= 0) {
                                boolean var16 = false;
                                class149 var17 = class121.method784(-71, var13);
                                int var18 = var2 + var8;
                                if (var17 != null && var17.field2047) {
                                    var16 = true;
                                }
                                int var19 = var3 + var9;
                                if (var16) {
                                    int[][] var20 = class156.field2153[arg0].field3204;
                                    for (int var21 = 0; ~var21 > -11; ++var21) {
                                        int var22 = (int) (4.0D * Math.random());
                                        if (~var22 == -1 && var18 > 0 && var18 > var8 - 3 && (var20[var18 + -1][var19] & 2883848) == 0) {
                                            --var18;
                                        }
                                        if (~var22 == -2 && var18 < 103 && var8 + 3 > var18 && (2883968 & var20[var18 + 1][var19]) == 0) {
                                            ++var18;
                                        }
                                        if (~var22 == -3 && ~var19 < -1 && ~var19 < ~(var9 + -3) && (var20[var18][var19 + -1] & 2883842) == 0) {
                                            --var19;
                                        }
                                        if (var22 == 3 && ~var19 > -104 && ~var19 > ~(var9 + 3) && (2883872 & var20[var18][var19 + 1]) == 0) {
                                            ++var19;
                                        }
                                    }
                                }
                                class47.field678[class221.field3436] = var12.field3710;
                                class96.field1394[class221.field3436] = -var2 + var18;
                                class227.field3553[class221.field3436] = var19 - var3;
                                ++class221.field3436;
                            }
                        }
                    }
                }
            }
        }
        int var25 = 228 - -((int) (20.0D * Math.random())) + ((238 - -((int) (Math.random() * 20.0D)) + -10 << 16) - -(238 - (-((int) (Math.random() * 20.0D)) + 10) << 8));
        class178.field2559.method1262();
        int var26 = 238 - -((int) (Math.random() * 20.0D)) + -10 << 16;
        for (int var27 = 1; ~var27 > -104; ++var27) {
            for (int var28 = 1; var28 < 103; ++var28) {
                if ((24 & class164.field2333[arg0][var28 - -var2][var3 + var27]) == 0 && !class224.method1481(var27, var25, var2, arg0, var26, var3, 27586, var28)) {
                    class24.field382.method1586((byte) 115);
                    return false;
                }
                if (arg0 < 3 && (8 & class164.field2333[arg0 + 1][var2 + var28][var3 + var27]) != 0 && !class224.method1481(var27, var25, var2, arg0 - -1, var26, var3, arg1 + 2958, var28)) {
                    class24.field382.method1586((byte) 121);
                    return false;
                }
            }
        }
        if (arg1 != 24628) {
            field1573 = null;
        }
        class200.field3039 = class178.field2559;
        class24.field382.method1586((byte) 99);
        class178.field2559 = null;
        return true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        ++field1571;
        if (arg2 != 12953) {
            this.field1561 = -97;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field1581 = arg0.method1374((byte) -60);
                                }
                            } else {
                                this.field1569 = arg0.method1374((byte) -60);
                            }
                        } else {
                            this.field1579 = arg0.method1374((byte) -60);
                        }
                    } else {
                        this.field1561 = arg0.method1374((byte) -60);
                    }
                } else {
                    this.field1567 = arg0.method1379(arg2 ^ -12996);
                }
            } else {
                this.field1566 = arg0.method1374((byte) -60);
            }
        } else {
            this.field1569 = this.field1581 = arg0.method1374((byte) -60);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        if (arg0 > 101) {
            this.field1572 = class271.method1770(13080, this.field1566);
            this.method702((byte) -74);
            ++field1576;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)I")
    public static final int method704(int arg0, int arg1, int arg2, int arg3) {
        ++field1565;
        if (~(class164.field2333[arg1][arg3][arg0] & 8) != -1) {
            return 0;
        } else {
            return arg2 > ~arg1 && ~(class164.field2333[1][arg3][arg0] & 2) != -1 ? arg1 + -1 : arg1;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(IZ)V")
    public static final void method705(int arg0, boolean arg1) {
        ++field1562;
        if (arg0 != -1) {
            if (class191.field2906[arg0]) {
                field1568.method2082(0, arg0);
                if (class262.field4214[arg0] != null) {
                    boolean var2 = arg1;
                    for (int var3 = 0; var3 < class262.field4214[arg0].length; ++var3) {
                        if (class262.field4214[arg0][var3] != null) {
                            if (class262.field4214[arg0][var3].field2608 != 2) {
                                class262.field4214[arg0][var3] = null;
                            } else {
                                var2 = false;
                            }
                        }
                    }
                    if (var2) {
                        class262.field4214[arg0] = null;
                    }
                    class191.field2906[arg0] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        if (arg1) {
            this.field1574 = null;
        }
        ++field1582;
        int[] var3 = super.field1630.method302(arg0, -109);
        if (super.field1630.field710) {
            int var4 = class159.field2209[arg0] * this.field1581 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~class145.field2009 < ~var7; ++var7) {
                class29.field451 = Integer.MAX_VALUE;
                class54.field770 = Integer.MAX_VALUE;
                class8.field93 = Integer.MAX_VALUE;
                class263.field4220 = Integer.MAX_VALUE;
                int var8 = class99.field1434[var7] * this.field1569 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field1572[255 & (~var11 <= ~this.field1581 ? -this.field1581 + var11 : var11)];
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (this.field1572[255 & var13 + (~this.field1569 >= ~var14 ? -this.field1569 + var14 : var14)] & 255);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field1574[var15] + var8;
                        int var17 = var4 - (var11 << 12) - this.field1574[var27];
                        int var18 = this.field1579;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var17 <= -1 ? var17 : -var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = var25 > var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class263.field4220 > var19) {
                            class29.field451 = class54.field770;
                            class54.field770 = class8.field93;
                            class8.field93 = class263.field4220;
                            class263.field4220 = var19;
                        } else if (class8.field93 <= var19) {
                            if (~class54.field770 >= ~var19) {
                                if (class29.field451 > var19) {
                                    class29.field451 = var19;
                                }
                            } else {
                                class29.field451 = class54.field770;
                                class54.field770 = var19;
                            }
                        } else {
                            class29.field451 = class54.field770;
                            class54.field770 = class8.field93;
                            class8.field93 = var19;
                        }
                    }
                }
                int var12 = this.field1561;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class263.field4220 + class8.field93;
                                }
                            } else {
                                var3[var7] = class29.field451;
                            }
                        } else {
                            var3[var7] = class54.field770;
                        }
                    } else {
                        var3[var7] = class8.field93;
                    }
                } else {
                    var3[var7] = class263.field4220;
                }
            }
        }
        return var3;
    }
}
