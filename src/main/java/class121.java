import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class121 extends class64 {

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    private int field2502 = 1;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    private int field2511 = 0;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    private int field2518 = 0;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "[I")
    public static int[] field2504 = new int[100];

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field2503 = 0;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "Lcd;")
    public static class23 field2510 = class54.method414("(U0a )2 non)2existant gosub script)2num: ", -1);

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field2505 = 0;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field2517 = 0;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "[Lnf;")
    public static class122[] field2516 = new class122[50];

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public static int field2515 = 0;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
    public static final void method751(int arg0) {
        ++field2513;
        int var1 = class189.field3723 * 128 - -64;
        int var2 = class154.field3082 * 128 + 64;
        int var3 = class203.method1330((byte) -88, var2, var1, class59.field1385) - class134.field2776;
        if (var3 > class122.field2530) {
            class122.field2530 += (-class122.field2530 + var3) * class132.field2732 / 1000 + class80.field1736;
            if (class122.field2530 > var3) {
                class122.field2530 = var3;
            }
        }
        if (class119.field2452 < var1) {
            class119.field2452 += (-class119.field2452 + var1) * class132.field2732 / 1000 + class80.field1736;
            if (~var1 > ~class119.field2452) {
                class119.field2452 = var1;
            }
        }
        if (~class115.field2404 > ~var2) {
            class115.field2404 += (-class115.field2404 + var2) * class132.field2732 / 1000 + class80.field1736;
            if (~var2 > ~class115.field2404) {
                class115.field2404 = var2;
            }
        }
        if (~var1 > ~class119.field2452) {
            class119.field2452 -= (-var1 + class119.field2452) * class132.field2732 / 1000 + class80.field1736;
            if (var1 > class119.field2452) {
                class119.field2452 = var1;
            }
        }
        if (~var2 > ~class115.field2404) {
            class115.field2404 -= class80.field1736 - -((-var2 + class115.field2404) * class132.field2732 / 1000);
            if (~var2 < ~class115.field2404) {
                class115.field2404 = var2;
            }
        }
        if (~class122.field2530 < ~var3) {
            class122.field2530 -= (-var3 + class122.field2530) * class132.field2732 / 1000 + class80.field1736;
            if (~class122.field2530 > ~var3) {
                class122.field2530 = var3;
            }
        }
        int var4 = class49.field1183 * 128 + 64;
        int var5 = class49.field1172 * 128 + 64;
        int var6 = class203.method1330((byte) -88, var4, var5, class59.field1385) + -class29.field639;
        int var7 = -class115.field2404 + var4;
        int var8 = -class122.field2530 + var6;
        int var9 = -class119.field2452 + var5;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 2047;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = arg0 & (int) (Math.atan2((double) var9, (double) var7) * -325.949D);
        if (~var11 < -384) {
            var11 = 383;
        }
        if (~class105.field2266 > ~var11) {
            class105.field2266 += class201.field3970 - -((-class105.field2266 + var11) * class25.field534 / 1000);
            if (class105.field2266 > var11) {
                class105.field2266 = var11;
            }
        }
        int var13 = var12 - class181.field3574;
        if (~var11 > ~class105.field2266) {
            class105.field2266 -= (-var11 + class105.field2266) * class25.field534 / 1000 + class201.field3970;
            if (~var11 < ~class105.field2266) {
                class105.field2266 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (~var13 > 1023) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class181.field3574 += class25.field534 * var13 / 1000 + class201.field3970;
            class181.field3574 &= 2047;
        }
        if (var13 < 0) {
            class181.field3574 -= class201.field3970 - -(-var13 * class25.field534 / 1000);
            class181.field3574 &= 2047;
        }
        int var14 = var12 - class181.field3574;
        if (~var14 < -1025) {
            var14 -= 2048;
        }
        if (~var14 > 1023) {
            var14 += 2048;
        }
        if (~var14 > -1 && var13 > 0 || var14 > 0 && ~var13 > -1) {
            class181.field3574 = var12;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILbb;)V")
    public static final void method752(int arg0, class12 arg1) {
        if (~arg1.field225 == -1) {
            arg1.field227 = 1024;
        }
        ++field2508;
        arg1.field284 = 0;
        int var2 = arg1.field223 - class15.field339;
        if (~arg1.field225 == -2) {
            arg1.field227 = 1536;
        }
        if (~arg1.field225 == -3) {
            arg1.field227 = 0;
        }
        if (arg0 != 1536) {
            field2515 = 45;
        }
        int var3 = arg1.field231 * 64 + arg1.field214 * 128;
        if (arg1.field225 == 3) {
            arg1.field227 = 512;
        }
        arg1.field215 += (-arg1.field215 + var3) / var2;
        int var4 = arg1.field267 * 128 - -(arg1.field231 * 64);
        arg1.field277 += (-arg1.field277 + var4) / var2;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public final void method44(byte arg0) {
        ++field2512;
        if (arg0 != -22) {
            method756(-32);
        }
        class111.method715(4096);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field2520;
        int[] var3 = super.field1513.method1033(-95, arg0);
        if (super.field1513.field3368) {
            int var4 = class95.field1995[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~var6 > ~class168.field3367; ++var6) {
                int var7 = class174.field3475[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field2511 == -1) {
                    var9 = (-var4 + var7) * this.field2502;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) (var10 / 4096)));
                    var9 = (int) ((double) (this.field2502 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field2518 == 0) {
                    var12 = class21.field429[(var12 & 4085) >> 4] + 4096 >> 1;
                } else if (this.field2518 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return arg1 != -9421 ? null : var3;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class121() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
    public static void method753(int arg0) {
        field2510 = null;
        if (arg0 != -28177) {
            field2517 = 83;
        }
        field2504 = null;
        field2516 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        ++field2506;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field2502 = arg2.method1202(117);
                }
            } else {
                this.field2518 = arg2.method1202(-23);
            }
        } else {
            this.field2511 = arg2.method1202(126);
        }
        int var5 = 69 / ((7 - arg0) / 43);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)V")
    public static final void method754(int arg0, byte arg1) {
        int var2 = 75 / ((38 - arg1) / 36);
        class91.field1951 = -1;
        class190.field3775 = 1;
        class124.field2540 = null;
        class102.field2185 = false;
        class58.field1371 = -1;
        class74.field1683 = 0;
        class138.field2854 = arg0;
        ++field2519;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V")
    public static final void method755(boolean arg0, int arg1) {
        if (~(class134.field2790.field215 >> 7) == ~field2517 && ~(class134.field2790.field277 >> 7) == ~class43.field915) {
            field2517 = 0;
        }
        if (arg1 != 1) {
            field2515 = 53;
        }
        ++field2509;
        int var2 = class57.field1348;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; ~var2 < ~var3; ++var3) {
            class57 var4;
            int var5;
            if (arg0) {
                var4 = class134.field2790;
                var5 = 33538048;
            } else {
                var5 = class69.field1622[var3] << 14;
                var4 = class95.field2007[class69.field1622[var3]];
            }
            if (var4 != null && var4.method69(true)) {
                int var6 = var4.field215 >> 7;
                var4.field1321 = false;
                if ((class193.field3810 && ~class57.field1348 < -51 || class57.field1348 > 200) && !arg0 && var4.field262 == var4.field250) {
                    var4.field1321 = true;
                }
                int var7 = var4.field277 >> 7;
                if (~var6 <= -1 && ~var6 > -105 && var7 >= 0 && var7 < 104) {
                    if (var4.field1339 != null && class15.field339 >= var4.field1334 && class15.field339 < var4.field1316) {
                        var4.field1321 = false;
                        var4.field1319 = class203.method1330((byte) -88, var4.field277, var4.field215, class59.field1385);
                        class205.field4041.method816(class59.field1385, var4.field215, var4.field277, var4.field1319, 60, var4, var4.field264, var5, var4.field1340, var4.field1317, var4.field1331, var4.field1332);
                    } else {
                        if (~(127 & var4.field215) == -65 && (var4.field277 & 127) == 64) {
                            if (~class10.field203[var6][var7] == ~class129.field2691) {
                                continue;
                            }
                            class10.field203[var6][var7] = class129.field2691;
                        }
                        var4.field1319 = class203.method1330((byte) -88, var4.field277, var4.field215, class59.field1385);
                        class205.field4041.method811(class59.field1385, var4.field215, var4.field277, var4.field1319, 60, var4, var4.field264, var5, var4.field276);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "(I)V")
    public static final void method756(int arg0) {
        Object var1 = class60.field1396;
        synchronized (class60.field1396) {
            if (~class144.field2936 != -1) {
                class144.field2936 = 1;
                try {
                    class60.field1396.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        if (arg0 != 3) {
            method754(-119, (byte) -37);
        }
        ++field2514;
    }
}
