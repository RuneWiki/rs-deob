import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class102 {

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "[[I")
    private int[][] field1941;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    private int field1944;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    private int field1950;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Loh;")
    public static class263 field1945 = class253.method1681(-128, "");

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "Llb;")
    public static class127 field1946 = new class127(4);

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "Loh;")
    public static class263 field1947 = class253.method1681(-120, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "J")
    public static volatile long field1949 = 0L;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "[Lge;")
    public static class68[] field1948;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([BB)[B")
    public final byte[] method686(byte[] arg0, byte arg1) {
        field1940++;
        if (arg1 <= 60) {
            this.method686((byte[]) null, (byte) 104);
        }
        if (this.field1941 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1950 / (long) this.field1944) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1941[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1950 + var6;
                int var14 = var13 / this.field1944;
                var5 += var14;
                var6 = var13 - this.field1944 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static final void method687(int arg0) {
        if (arg0 != 1839) {
            method687(66);
        }
        for (int var1 = 0; var1 < class249.field4355; var1++) {
            int var2 = class21.field627[var1];
            class90 var3 = class31.field774[var2];
            int var4 = class189.field3394.method1301(-8317);
            if ((var4 & 0x10) != 0) {
                var3.field4689 = class189.field3394.method1294((byte) 3);
                int var5 = class189.field3394.method1266(4);
                var3.field4685 = 0;
                var3.field4653 = class228.field4012 + (var5 & 0xFFFF);
                var3.field4699 = var5 >> 16;
                if (var3.field4689 == 65535) {
                    var3.field4689 = -1;
                }
                if (var3.field4653 > class228.field4012) {
                    var3.field4685 = -1;
                }
                var3.field4709 = 0;
                if (var3.field4689 != -1 && class228.field4012 == var3.field4653) {
                    int var6 = class46.method296(-71, var3.field4689).field987;
                    if (var6 != -1) {
                        class240 var7 = class186.method1226(arg0 ^ 0x3533, var6);
                        if (var7 != null && var7.field4211 != null) {
                            class219.method1490(false, var3.field4705, 0, -64, var7, var3.field4688);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field4682 = class189.field3394.method1326(arg0 - 23576);
                var3.field4655 = class189.field3394.method1294((byte) 3);
            }
            if ((var4 & 0x80) != 0) {
                int var8 = class189.field3394.method1295(-1);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class189.field3394.method1269(-13208);
                class168.method1114(var3, -111, var8, var9);
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field1787.method1414((byte) -116)) {
                    class148.method974(var3, arg0 ^ 0x756);
                }
                var3.field1787 = class219.method1492(class189.field3394.method1294((byte) 3), arg0 ^ 0x727);
                var3.method1807(var3.field1787.field3694, 100);
                var3.field4649 = var3.field1787.field3661;
                var3.field4651 = var3.field1787.field3700;
                var3.field4710 = var3.field1787.field3660;
                var3.field4676 = var3.field1787.field3696;
                var3.field4661 = var3.field1787.field3692;
                var3.field4690 = var3.field1787.field3688;
                var3.field4687 = var3.field1787.field3706;
                var3.field4675 = var3.field1787.field3679;
                if (var3.field1787.method1414((byte) -116)) {
                    class128.method835(var3, var3.field4714[0], (class12) null, (class137) null, var3.field4713[0], class12.field321, 0, -87);
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field4693 = class189.field3394.method1294((byte) 3);
                if (var3.field4693 == 65535) {
                    var3.field4693 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var10 = class189.field3394.method1279(false);
                int var11 = class189.field3394.method1301(-8317);
                var3.method1804(class228.field4012, var10, var11, arg0 - 1948);
            }
            if ((var4 & 0x40) != 0) {
                var3.field4650 = class189.field3394.method1320(false);
                var3.field4679 = 100;
            }
            if ((var4 & 0x4) != 0) {
                int var12 = class189.field3394.method1279(false);
                int var13 = class189.field3394.method1301(-8317);
                var3.method1804(class228.field4012, var12, var13, -80);
                var3.field4672 = class228.field4012 + 300;
                var3.field4692 = class189.field3394.method1301(-8317);
            }
        }
        field1939++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)I")
    public final int method688(byte arg0, int arg1) {
        int var3 = -13 % ((arg0 + 30) / 63);
        field1943++;
        if (this.field1941 != null) {
            arg1 = (int) ((long) this.field1950 * (long) arg1 / (long) this.field1944) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public final int method689(int arg0, int arg1) {
        field1938++;
        if (this.field1941 != null) {
            arg0 = (int) ((long) this.field1950 * (long) arg0 / (long) this.field1944);
        }
        if (arg1 >= -17) {
            field1945 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static void method690(int arg0) {
        field1945 = null;
        field1946 = null;
        field1947 = null;
        if (arg0 != -6456) {
            method687(-84);
        }
        field1948 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(II)V")
    public class102(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class63.method386(arg1, arg0, (byte) -63);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1941 = new int[var5][14];
            this.field1944 = var5;
            this.field1950 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1941[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var12 < 0) {
                    var12 = 0;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[Lpc;)V")
    public static final void method691(int arg0, int arg1, class21[] arg2) {
        field1942++;
        if (arg0 != 6025) {
            method690(17);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class21 var4 = arg2[var3];
            if (var4 != null && var4.field536 == arg1 && (!var4.field573 || !client.method1004(var4))) {
                if (var4.field519 == 0) {
                    if (!var4.field573 && client.method1004(var4) && class222.field3929 != var4) {
                        continue;
                    }
                    method691(arg0, var4.field537, arg2);
                    if (var4.field589 != null) {
                        method691(6025, var4.field537, var4.field589);
                    }
                    class266 var5 = (class266) class212.field3797.method31(-32665, (long) var4.field537);
                    if (var5 != null) {
                        class51.method330(arg0 + 1334333823, var5.field4641);
                    }
                }
                if (var4.field519 == 6) {
                    if (var4.field623 != -1 || var4.field601 != -1) {
                        boolean var6 = class240.method1608(var4, (byte) -127);
                        int var7;
                        if (var6) {
                            var7 = var4.field601;
                        } else {
                            var7 = var4.field623;
                        }
                        if (var7 != -1) {
                            class240 var8 = class186.method1226(12828, var7);
                            if (var8 != null) {
                                var4.field535 += class187.field3369;
                                while (var8.field4219[var4.field614] < var4.field535) {
                                    var4.field535 -= var8.field4219[var4.field614];
                                    var4.field614++;
                                    if (var4.field614 >= var8.field4211.length) {
                                        var4.field614 -= var8.field4223;
                                        if (var4.field614 < 0 || var8.field4211.length <= var4.field614) {
                                            var4.field614 = 0;
                                        }
                                    }
                                    class220.method1508(var4, (byte) -55);
                                }
                            }
                        }
                    }
                    if (var4.field625 != 0 && !var4.field573) {
                        int var9 = var4.field625 >> 16;
                        int var10 = class187.field3369 * var9;
                        var4.field495 = var4.field495 + var10 & 0x7FF;
                        int var11 = var4.field625 << 16 >> 16;
                        int var12 = class187.field3369 * var11;
                        var4.field588 = var4.field588 + var12 & 0x7FF;
                        class220.method1508(var4, (byte) -105);
                    }
                }
            }
        }
    }
}
