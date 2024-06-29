import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class140 extends class74 {

    @OriginalMember(owner = "client!pi", name = "gb", descriptor = "I")
    private int field2164 = 1024;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    private int field2148 = 0;

    @OriginalMember(owner = "client!pi", name = "db", descriptor = "I")
    private int field2161 = 409;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "I")
    private int field2146 = 81;

    @OriginalMember(owner = "client!pi", name = "pb", descriptor = "I")
    private int field2173 = 1024;

    @OriginalMember(owner = "client!pi", name = "nb", descriptor = "I")
    private int field2171 = 204;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    private int field2151 = 8;

    @OriginalMember(owner = "client!pi", name = "ob", descriptor = "I")
    private int field2172 = 4;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public static int field2153 = 0;

    @OriginalMember(owner = "client!pi", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field2162 = "Loading wordpack - ";

    @OriginalMember(owner = "client!pi", name = "cb", descriptor = "I")
    public static int field2160 = 0;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    private int field2145;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!pi", name = "bb", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!pi", name = "fb", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!pi", name = "hb", descriptor = "I")
    private int field2165;

    @OriginalMember(owner = "client!pi", name = "kb", descriptor = "I")
    private int field2168;

    @OriginalMember(owner = "client!pi", name = "mb", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!pi", name = "qb", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "Lmf;")
    public static class10 field2156;

    @OriginalMember(owner = "client!pi", name = "lb", descriptor = "Lne;")
    public static class52 field2169;

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "Z")
    public static boolean field2154;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "[I")
    private int[] field2149;

    @OriginalMember(owner = "client!pi", name = "ib", descriptor = "[[I")
    private int[][] field2166;

    @OriginalMember(owner = "client!pi", name = "jb", descriptor = "[[I")
    private int[][] field2167;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "[[[B")
    public static byte[][][] field2150;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(Z)V")
    public static void method966(boolean arg0) {
        if (arg0) {
            field2154 = false;
        }
        field2169 = null;
        field2162 = null;
        field2150 = null;
        field2156 = null;
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V")
    private final void method967(int arg0) {
        Random var2 = new Random((long) this.field2151);
        this.field2167 = new int[this.field2151][this.field2172 + 1];
        ++field2163;
        this.field2168 = 4096 / this.field2172;
        this.field2149 = new int[this.field2151 + 1];
        this.field2145 = this.field2146 / 2;
        int var3 = this.field2168 / 2;
        this.field2165 = 4096 / this.field2151;
        this.field2149[0] = arg0;
        int var4 = this.field2165 / 2;
        this.field2166 = new int[this.field2151][this.field2172];
        for (int var5 = 0; this.field2151 > var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field2165;
                int var7 = (class167.method1104(4096, (byte) -83, var2) - 2048) * this.field2171 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2149[var5] = this.field2149[var5 + -1] - -var8;
            }
            this.field2167[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field2172; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field2168;
                    int var11 = (-2048 + class167.method1104(4096, (byte) -114, var2)) * this.field2161 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2167[var5][var9] = this.field2167[var5][var9 + -1] - -var12;
                }
                this.field2166[var5][var9] = ~this.field2164 >= -1 ? 4096 : -class167.method1104(this.field2164, (byte) -119, var2) + 4096;
            }
            this.field2167[var5][this.field2172] = 4096;
        }
        this.field2149[this.field2151] = 4096;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class140() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method968(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -27 / ((arg2 - -82) / 35);
        ++field2157;
        if (class103.method784(-1, arg7)) {
            client.method1054(class261.field4006[arg7], -1, arg3, arg0, arg4, arg5, arg1, arg6);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field2174;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (super.field1254.field3118) {
            int var4 = 0;
            int var5;
            for (var5 = class207.field3212[arg1] + this.field2148; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field2151 > var4 && ~var5 <= ~this.field2149[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field2149[var4 + -1];
            int var9 = this.field2149[var4];
            if (~(this.field2145 + var8) > ~var5 && ~(-this.field2145 + var9) < ~var5) {
                for (int var10 = 0; ~class178.field2662 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field2173 : -this.field2173;
                    int var13;
                    for (var13 = (this.field2168 * var12 >> 12) + class224.field3522[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~this.field2172 < ~var11 && ~var13 <= ~this.field2167[var6][var11]) {
                        ++var11;
                    }
                    int var14 = this.field2167[var6][var11];
                    int var15 = var11 + -1;
                    int var16 = this.field2167[var6][var15];
                    if (this.field2145 + var16 < var13 && ~(-this.field2145 + var14) < ~var13) {
                        var3[var10] = this.field2166[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class236.method1587(var3, 0, class178.field2662, 0);
            }
        }
        if (arg0 != 4) {
            this.method80((byte) -115, (class37) null, -99);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        ++field2158;
        if (!arg0) {
            this.method967(0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZZ)V")
    public static final void method969(boolean arg0, boolean arg1) {
        ++field2159;
        byte var2 = 4;
        byte[][] var3 = class259.field3987;
        if (arg1) {
            method968(72, -85, (byte) 86, 66, -57, -97, 126, 121);
        }
        int var4 = var3.length;
        for (int var5 = 0; var4 > var5; ++var5) {
            byte[] var11 = var3[var5];
            int[] var12 = null;
            int var13 = class221.field3454[var5] & 255;
            int var14 = class221.field3454[var5] >> 8;
            int var15 = var14 * 64 - class118.field1828;
            int var16 = var13 * 64 + -class129.field2008;
            if (var11 != null) {
                class130.method916(-128);
                var12 = class45.method373(var16, class118.field1828, class129.field2008, class72.field1142, var11, 24624, var15, arg0);
            }
            if (!arg0 && ~(class147.field2279 / 8) == ~var14 && class272.field4298 / 8 == var13) {
                if (var12 == null) {
                    class69.field1097 = -1;
                } else {
                    class69.field1097 = var12[0];
                    class177.field2651 = var12[4];
                    class167.field2528 = var12[2];
                    class224.field3523 = var12[3];
                    class188.field3013 = var12[1];
                }
            }
        }
        for (int var6 = 0; ~var6 > ~var4; ++var6) {
            int var7 = (class221.field3454[var6] >> 8) * 64 + -class118.field1828;
            int var8 = (255 & class221.field3454[var6]) * 64 + -class129.field2008;
            byte[] var9 = var3[var6];
            if (var9 == null && class272.field4298 < 800) {
                class130.method916(-109);
                for (int var10 = 0; ~var10 > ~var2; ++var10) {
                    class130.method918(var10, 64, -73, 64, var8, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        ++field2147;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field2164 = arg1.method293(-43);
                                    }
                                } else {
                                    this.field2146 = arg1.method293(arg0 ^ 23);
                                }
                            } else {
                                this.field2148 = arg1.method293(4);
                            }
                        } else {
                            this.field2173 = arg1.method293(111);
                        }
                    } else {
                        this.field2171 = arg1.method293(arg0 ^ 60);
                    }
                } else {
                    this.field2161 = arg1.method293(-62);
                }
            } else {
                this.field2151 = arg1.method333((byte) -59);
            }
        } else {
            this.field2172 = arg1.method333((byte) -59);
        }
        if (arg0 != -79) {
            field2153 = 44;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lf;B)Lvg;")
    public static final class74 method970(class37 arg0, byte arg1) {
        ++field2152;
        arg0.method333((byte) -59);
        int var2 = 53 / ((-26 - arg1) / 50);
        int var3 = arg0.method333((byte) -59);
        class74 var4 = class275.method1847(var3, 9);
        var4.field1237 = arg0.method333((byte) -59);
        int var5 = arg0.method333((byte) -59);
        for (int var6 = 0; ~var6 > ~var5; ++var6) {
            int var7 = arg0.method333((byte) -59);
            var4.method80((byte) -79, arg0, var7);
        }
        var4.method493(false);
        return var4;
    }
}
