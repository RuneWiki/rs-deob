import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 {

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "[I")
    private int[] field727;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[I")
    private int[] field717;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[B")
    private byte[] field714;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "[B")
    public static byte[] field721 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lv;")
    private static class146 field718 = class159.method1226((byte) -37, "Please use a different world)3");

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Lv;")
    public static class146 field724 = field718;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lv;")
    public static class146 field715 = class159.method1226((byte) -37, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lv;")
    private static class146 field716 = class159.method1226((byte) -37, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lv;")
    public static class146 field730 = field718;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field723 = 0;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lv;")
    public static class146 field719 = field716;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Lua;")
    public static class140 field732 = new class140(260);

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "[Lfb;")
    public static class38[] field735 = new class38[32768];

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Lla;")
    public static class77 field737;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "[[Ldd;")
    public static class26[][] field736;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "[[[I")
    public static int[][][] field725;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static final void method225(boolean arg0) {
        if (class51.field1150[98]) {
            class72.field1691 += (12 - class72.field1691) / 2;
        } else if (class51.field1150[99]) {
            class72.field1691 += (-class72.field1691 - 12) / 2;
        } else {
            class72.field1691 /= 2;
        }
        class5.field103 += class72.field1691 / 2;
        if (class51.field1150[96]) {
            class59.field1332 += (-class59.field1332 - 24) / 2;
        } else if (class51.field1150[97]) {
            class59.field1332 += (24 - class59.field1332) / 2;
        } else {
            class59.field1332 /= 2;
        }
        if (class5.field103 < 128) {
            class5.field103 = 128;
        }
        int var1 = class33.field692 + class116.field2696.field757;
        if (class5.field103 > 383) {
            class5.field103 = 383;
        }
        int var2 = class54.field1232 + class116.field2696.field790;
        field722++;
        class72.field1692 = class59.field1332 / 2 + class72.field1692 & 0x7FF;
        if (class121.field2819 - var1 < -500 || class121.field2819 - var1 > 500 || class105.field2523 - var2 < -500 || class105.field2523 - var2 > 500) {
            class121.field2819 = var1;
            class105.field2523 = var2;
        }
        if (class121.field2819 != var1) {
            class121.field2819 += (var1 - class121.field2819) / 16;
        }
        if (class105.field2523 != var2) {
            class105.field2523 += (var2 - class105.field2523) / 16;
        }
        int var3 = class121.field2819 >> 7;
        int var4 = 0;
        int var5 = class105.field2523 >> 7;
        int var6 = class79.method612(class148.field3428, class121.field2819, class105.field2523, arg0);
        if (var3 > 3 && var5 > 3 && var3 < 100 && var5 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class148.field3428;
                    if (var9 < 3 && (class74.field1772[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class78.field1891[var9][var7][var8];
                    if (var10 > var4) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class100.field2436 < var11) {
            class100.field2436 += (var11 - class100.field2436) / 24;
        } else if (class100.field2436 > var11) {
            class100.field2436 += (var11 - class100.field2436) / 80;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
    public static void method226(boolean arg0) {
        if (arg0) {
            method227((byte) -97);
        }
        field725 = null;
        field718 = null;
        field732 = null;
        field716 = null;
        field724 = null;
        field719 = null;
        field730 = null;
        field737 = null;
        field735 = null;
        field721 = null;
        field736 = null;
        field715 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static final void method227(byte arg0) {
        field725 = null;
        class37.field839 = null;
        class148.field3435 = null;
        class59.field1349 = null;
        class146.field3376 = null;
        class29.field611 = null;
        if (arg0 != -128) {
            field737 = null;
        }
        class100.field2423 = null;
        class115.field2681 = null;
        class79.field1938 = null;
        class147.field3411 = null;
        field726++;
        class37.field835 = null;
        class154.field3527 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
    public static final void method228(int arg0, int arg1, int arg2, int arg3) {
        field734++;
        if (arg1 < 128 || arg0 < 128 || arg1 > 13056 || arg0 > 13056) {
            class108.field2577 = -1;
            class146.field3380 = -1;
            return;
        }
        int var4 = class79.method612(class148.field3428, arg1, arg0, false) - arg2;
        int var5 = arg1 - class126.field2920;
        int var6 = arg0 - class143.field3266;
        int var7 = var4 - class116.field2698;
        int var8 = class45.field1030[class123.field2854];
        int var9 = class45.field1032[class89.field2109];
        int var10 = class45.field1030[class89.field2109];
        if (arg3 != 1990945680) {
            method225(true);
        }
        int var11 = class45.field1032[class123.field2854];
        int var12 = var5 * var11 + var6 * var8 >> 16;
        int var13 = var6 * var11 - var5 * var8 >> 16;
        int var15 = var7 * var9 - var10 * var13 >> 16;
        int var16 = var7 * var10 + var9 * var13 >> 16;
        if (var16 >= 50) {
            class108.field2577 = (var15 << 9) / var16 + 167;
            class146.field3380 = (var12 << 9) / var16 + 256;
        } else {
            class108.field2577 = -1;
            class146.field3380 = -1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BBI[B)I")
    public final int method229(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, byte[] arg5) {
        field728++;
        int var7 = arg1 + arg4;
        int var8 = 0;
        int var9 = arg0 << 3;
        while (arg4 < var7) {
            int var10 = arg2[arg4] & 0xFF;
            int var11 = this.field717[var10];
            byte var12 = this.field714[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = (var14 + var12 - 1 >> 3) + var13;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var8 = class127.method943(var16, var11 >>> var17));
            if (var13 < var15) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var14 -= 8;
                    var13++;
                    arg5[var13] = (byte) (var8 = var11 >>> var14);
                    if (var13 < var15) {
                        var13++;
                        var14 -= 8;
                        arg5[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var15) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg4++;
        }
        if (arg3 <= 33) {
            this.method230(null, (byte) -82, -111, null, 4, -93);
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BBI[BII)I")
    public final int method230(byte[] arg0, byte arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field731++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg2 + arg4;
        if (arg1 != 51) {
            field730 = null;
        }
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 < 0) {
                var8 = this.field727[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field727[var8]) < 0) {
                arg0[arg2++] = (byte) ~var11;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field727[var8];
            }
            int var12;
            if ((var12 = this.field727[var8]) < 0) {
                arg0[arg2++] = (byte) ~var12;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field727[var8];
            }
            int var13;
            if ((var13 = this.field727[var8]) < 0) {
                arg0[arg2++] = (byte) ~var13;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field727[var8];
            }
            int var14;
            if ((var14 = this.field727[var8]) < 0) {
                arg0[arg2++] = (byte) ~var14;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field727[var8];
            }
            int var15;
            if ((var15 = this.field727[var8]) < 0) {
                arg0[arg2++] = (byte) ~var15;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field727[var8];
            }
            int var16;
            if ((var16 = this.field727[var8]) < 0) {
                arg0[arg2++] = (byte) ~var16;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field727[var8];
            }
            int var17;
            if ((var17 = this.field727[var8]) < 0) {
                arg0[arg2++] = (byte) ~var17;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field727[var8];
            }
            int var18;
            if ((var18 = this.field727[var8]) < 0) {
                arg0[arg2++] = (byte) ~var18;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V")
    public class34(byte[] arg0) {
        int var2 = arg0.length;
        this.field727 = new int[8];
        this.field717 = new int[var2];
        this.field714 = arg0;
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field717[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class127.method943(var12, var11);
                    }
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field727[var14] == 0) {
                            this.field727[var14] = var3;
                        }
                        var14 = this.field727[var14];
                    }
                    if (this.field727.length <= var14) {
                        int[] var17 = new int[this.field727.length * 2];
                        for (int var18 = 0; var18 < this.field727.length; var18++) {
                            var17[var18] = this.field727[var18];
                        }
                        this.field727 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field727[var14] = ~var5;
            }
        }
    }
}
