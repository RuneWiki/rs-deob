import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class417 extends class149 {

    @OriginalMember(owner = "client!cn", name = "J", descriptor = "I")
    private int field6232 = 2;

    @OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
    private int field6236 = 5;

    @OriginalMember(owner = "client!cn", name = "S", descriptor = "I")
    private int field6241 = 5;

    @OriginalMember(owner = "client!cn", name = "W", descriptor = "I")
    private int field6245 = 0;

    @OriginalMember(owner = "client!cn", name = "T", descriptor = "I")
    private int field6242 = 1;

    @OriginalMember(owner = "client!cn", name = "X", descriptor = "[S")
    private short[] field6246 = new short[512];

    @OriginalMember(owner = "client!cn", name = "Q", descriptor = "[B")
    private byte[] field6239 = new byte[512];

    @OriginalMember(owner = "client!cn", name = "cb", descriptor = "I")
    private int field6251 = 2048;

    @OriginalMember(owner = "client!cn", name = "K", descriptor = "[J")
    public static long[] field6233 = new long[100];

    @OriginalMember(owner = "client!cn", name = "L", descriptor = "[I")
    public static int[] field6234 = new int[1];

    @OriginalMember(owner = "client!cn", name = "Z", descriptor = "Lpg;")
    public static class492 field6248 = new class492(96, 8);

    @OriginalMember(owner = "client!cn", name = "ab", descriptor = "[I")
    public static int[] field6249 = new int[14];

    @OriginalMember(owner = "client!cn", name = "db", descriptor = "Lui;")
    public static class375 field6252 = new class375("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!cn", name = "I", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!cn", name = "M", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!cn", name = "O", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!cn", name = "P", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!cn", name = "R", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!cn", name = "U", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!cn", name = "V", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!cn", name = "Y", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!cn", name = "bb", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "(I)V")
    public static void method2520(int arg0) {
        field6248 = null;
        field6234 = null;
        field6233 = null;
        field6252 = null;
        field6249 = null;
        if (arg0 != 0) {
            field6248 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        if (arg0 != -10835) {
            this.method2522(32);
        }
        ++field6235;
        int[] var3 = super.field2152.method2891(arg1, (byte) 113);
        if (super.field2152.field7051) {
            int var4 = class185.field2613[arg1] * this.field6236 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class316.field4838 > var7; ++var7) {
                class168.field2442 = Integer.MAX_VALUE;
                class354.field5498 = Integer.MAX_VALUE;
                class461.field6764 = Integer.MAX_VALUE;
                class271.field3779 = Integer.MAX_VALUE;
                int var8 = class197.field2791[var7] * this.field6241 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = 255 & this.field6239[255 & (~this.field6236 >= ~var11 ? var11 - this.field6236 : var11)];
                    for (int var14 = var9 - 1; ~var10 <= ~var14; ++var14) {
                        int var15 = (this.field6239[var13 - -(var14 < this.field6241 ? var14 : -this.field6241 + var14) & 255] & 255) * 2;
                        int var27 = var15 + 1;
                        int var16 = -this.field6246[var15] - (var14 << 12) + var8;
                        int var17 = -this.field6246[var27] - (var11 << 12) + var4;
                        int var18 = this.field6242;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var17 < 0 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = ~var26 > ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class271.field3779 > var19) {
                            class168.field2442 = class354.field5498;
                            class354.field5498 = class461.field6764;
                            class461.field6764 = class271.field3779;
                            class271.field3779 = var19;
                        } else if (var19 >= class461.field6764) {
                            if (~var19 <= ~class354.field5498) {
                                if (~var19 > ~class168.field2442) {
                                    class168.field2442 = var19;
                                }
                            } else {
                                class168.field2442 = class354.field5498;
                                class354.field5498 = var19;
                            }
                        } else {
                            class168.field2442 = class354.field5498;
                            class354.field5498 = class461.field6764;
                            class461.field6764 = var19;
                        }
                    }
                }
                int var12 = this.field6232;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class271.field3779 + class461.field6764;
                                }
                            } else {
                                var3[var7] = class168.field2442;
                            }
                        } else {
                            var3[var7] = class354.field5498;
                        }
                    } else {
                        var3[var7] = class461.field6764;
                    }
                } else {
                    var3[var7] = class271.field3779;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
    public class417() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2521(int arg0, int arg1, String arg2) {
        ++class517.field7675;
        ++field6240;
        class179.method1287(false, class255.field3536);
        class75.field1006.method625(arg0 + class142.method951(-107, arg2), false);
        class75.field1006.method603(28, arg2);
        class75.field1006.method635((byte) 68, arg1);
    }

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "(I)V")
    private final void method2522(int arg0) {
        ++field6238;
        if (arg0 >= -110) {
            method2521(48, 115, (String) null);
        }
        Random var2 = new Random((long) this.field6245);
        this.field6246 = new short[512];
        if (~this.field6251 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field6246[var3] = (short) class455.method2740(-8, var2, this.field6251);
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)[Lss;")
    public static final class208[] method2523(int arg0) {
        ++field6247;
        if (arg0 != -101) {
            method2526(0.19709657F, (byte) 10, 0.44399172F, 1.417707F);
        }
        return new class208[] { class442.field6576, class442.field6577, class442.field6578, class442.field6579, class442.field6580, class442.field6581, class442.field6582, class442.field6583, class442.field6584, class442.field6585 };
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg1 != 35) {
            this.field6236 = 54;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field6236 = arg2.method618((byte) 100);
                                }
                            } else {
                                this.field6241 = arg2.method618((byte) 100);
                            }
                        } else {
                            this.field6242 = arg2.method618((byte) 100);
                        }
                    } else {
                        this.field6232 = arg2.method618((byte) 100);
                    }
                } else {
                    this.field6251 = arg2.method631(10494);
                }
            } else {
                this.field6245 = arg2.method618((byte) 100);
            }
        } else {
            this.field6241 = this.field6236 = arg2.method618((byte) 100);
        }
        ++field6244;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method2524(int arg0, boolean arg1, String arg2) {
        ++field6231;
        if (arg2 != null) {
            if (~class204.field2873 <= -101) {
                class219.method1485((byte) 95, class322.field4939.method2335((byte) -100, class288.field4292));
            } else {
                String var3 = class414.method2512(arg2, (byte) -102);
                if (var3 != null) {
                    for (int var4 = 0; ~class204.field2873 < ~var4; ++var4) {
                        String var8 = class414.method2512(class279.field3853[var4], (byte) -11);
                        if (var8 != null && var8.equals(var3)) {
                            class219.method1485((byte) 47, arg2 + class323.field4982.method2335((byte) -100, class288.field4292));
                            return;
                        }
                        if (class296.field4382[var4] != null) {
                            String var9 = class414.method2512(class296.field4382[var4], (byte) -78);
                            if (var9 != null && var9.equals(var3)) {
                                class219.method1485((byte) -84, arg2 + class323.field4982.method2335((byte) -100, class288.field4292));
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; class189.field2653 > var5; ++var5) {
                        String var6 = class414.method2512(class397.field6033[var5], (byte) 92);
                        if (var6 != null && var6.equals(var3)) {
                            class219.method1485((byte) 108, class73.field986.method2335((byte) -100, class288.field4292) + arg2 + class98.field1419.method2335((byte) -100, class288.field4292));
                            return;
                        }
                        if (class442.field6573[var5] != null) {
                            String var7 = class414.method2512(class442.field6573[var5], (byte) 83);
                            if (var7 != null && var7.equals(var3)) {
                                class219.method1485((byte) 116, class73.field986.method2335((byte) -100, class288.field4292) + arg2 + class98.field1419.method2335((byte) -100, class288.field4292));
                                return;
                            }
                        }
                    }
                    if (arg0 == -5616) {
                        if (class414.method2512(class339.field5365.field4947, (byte) 114).equals(var3)) {
                            class219.method1485((byte) 44, class480.field7014.method2335((byte) -100, class288.field4292));
                        } else {
                            ++class518.field7678;
                            class179.method1287(false, class336.field5206);
                            class75.field1006.method625(1 + class142.method951(-80, arg2), false);
                            class75.field1006.method603(arg0 + 5510, arg2);
                            class75.field1006.method625(!arg1 ? 0 : 1, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(B)Z")
    public static final boolean method2525(byte arg0) {
        ++field6243;
        try {
            if (arg0 != 52) {
                field6248 = null;
            }
            return class244.method1624(true);
        } catch (IOException var4) {
            class496.method2955(40);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class339.field5361 != null ? class339.field5361.method2920(2) : -1) + "," + (class338.field5357 != null ? class338.field5357.method2920(2) : -1) + "," + (class329.field5109 != null ? class329.field5109.method2920(2) : -1) + " - " + class461.field6755 + "," + (class82.field1105 - -class339.field5365.field5339[0]) + "," + (class339.field5365.field5344[0] + class437.field6477) + " - ";
            for (int var3 = 0; ~var3 > ~class461.field6755 && var3 < 50; ++var3) {
                var2 = var2 + class486.field7134.field1277[var3] + ",";
            }
            class438.method2644(var2, -1, var5);
            class19.method146(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (arg0 > -86) {
            method2523(-11);
        }
        ++field6237;
        this.field6239 = class275.method1744(-118, this.field6245);
        this.method2522(-118);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(FBFF)I")
    public static final int method2526(float arg0, byte arg1, float arg2, float arg3) {
        ++field6250;
        if (arg1 != 60) {
            return -100;
        } else {
            float var4 = arg0 < 0.0F ? -arg0 : arg0;
            float var5 = !(arg3 < 0.0F) ? arg3 : -arg3;
            float var6 = arg2 < 0.0F ? -arg2 : arg2;
            if (var5 > var4 && var6 < var5) {
                return !(arg3 > 0.0F) ? 1 : 0;
            } else if (var6 > var4 && var5 < var6) {
                return !(arg2 > 0.0F) ? 3 : 2;
            } else {
                return !(arg0 > 0.0F) ? 5 : 4;
            }
        }
    }
}
