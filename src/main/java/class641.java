import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class641 extends class62 {

    @OriginalMember(owner = "client!nca", name = "H", descriptor = "I")
    private int field9322 = 204;

    @OriginalMember(owner = "client!nca", name = "L", descriptor = "I")
    private int field9326 = 8;

    @OriginalMember(owner = "client!nca", name = "P", descriptor = "I")
    private int field9330 = 409;

    @OriginalMember(owner = "client!nca", name = "N", descriptor = "I")
    private int field9328 = 1024;

    @OriginalMember(owner = "client!nca", name = "C", descriptor = "I")
    private int field9317 = 4;

    @OriginalMember(owner = "client!nca", name = "W", descriptor = "I")
    private int field9337 = 1024;

    @OriginalMember(owner = "client!nca", name = "bb", descriptor = "I")
    private int field9342 = 0;

    @OriginalMember(owner = "client!nca", name = "D", descriptor = "I")
    private int field9318 = 81;

    @OriginalMember(owner = "client!nca", name = "S", descriptor = "Lada;")
    public static class144 field9333 = new class144(85, 6);

    @OriginalMember(owner = "client!nca", name = "U", descriptor = "[Lvk;")
    public static class310[] field9335 = new class310[6];

    @OriginalMember(owner = "client!nca", name = "ab", descriptor = "Z")
    public static volatile boolean field9341 = false;

    @OriginalMember(owner = "client!nca", name = "Z", descriptor = "[I")
    public static int[] field9340 = new int[1];

    @OriginalMember(owner = "client!nca", name = "E", descriptor = "I")
    public static int field9319;

    @OriginalMember(owner = "client!nca", name = "F", descriptor = "I")
    private int field9320;

    @OriginalMember(owner = "client!nca", name = "I", descriptor = "I")
    public static int field9323;

    @OriginalMember(owner = "client!nca", name = "J", descriptor = "I")
    private int field9324;

    @OriginalMember(owner = "client!nca", name = "M", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!nca", name = "O", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!nca", name = "Q", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!nca", name = "R", descriptor = "I")
    public static int field9332;

    @OriginalMember(owner = "client!nca", name = "T", descriptor = "I")
    private int field9334;

    @OriginalMember(owner = "client!nca", name = "X", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!nca", name = "Y", descriptor = "Lqo;")
    public static class21 field9339;

    @OriginalMember(owner = "client!nca", name = "G", descriptor = "[I")
    private int[] field9321;

    @OriginalMember(owner = "client!nca", name = "K", descriptor = "[[I")
    private int[][] field9325;

    @OriginalMember(owner = "client!nca", name = "V", descriptor = "[[I")
    private int[][] field9336;

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "(I)V", line = 3)
    public static final void method3704(int arg0) {
        ++field9323;
        if (class472.field6670 == 6) {
            class120.method861(false, -55);
        } else {
            class494.field7033 = class296.field4075;
            class296.field4075 = null;
            class18.method117((byte) -85, arg0);
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(BLjava/lang/String;)[B", line = 21)
    public static final byte[] method3705(byte arg0, String arg1) {
        ++field9331;
        int var2 = arg1.length();
        if (var2 == 0) {
            return new byte[0];
        } else {
            int var3 = -4 & var2 + 3;
            if (arg0 != -115) {
                return null;
            } else {
                int var4 = var3 / 4 * 3;
                if (var2 > var3 - 2 && class601.method3547(-1449, arg1.charAt(var3 + -2)) != -1) {
                    if (~(var3 + -1) <= ~var2 || class601.method3547(-1449, arg1.charAt(var3 - 1)) == -1) {
                        --var4;
                    }
                } else {
                    var4 -= 2;
                }
                byte[] var5 = new byte[var4];
                class245.method1554(var5, 0, true, arg1);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "(I)V", line = 56)
    private final void method3706(int arg0) {
        if (arg0 <= 46) {
            this.field9326 = -49;
        }
        ++field9327;
        Random var2 = new Random((long) this.field9326);
        this.field9324 = 4096 / this.field9326;
        this.field9334 = this.field9318 / 2;
        this.field9320 = 4096 / this.field9317;
        int var3 = this.field9320 / 2;
        this.field9325 = new int[this.field9326][this.field9317];
        this.field9321 = new int[this.field9326 - -1];
        this.field9336 = new int[this.field9326][this.field9317 + 1];
        int var4 = this.field9324 / 2;
        this.field9321[0] = 0;
        for (int var5 = 0; var5 < this.field9326; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field9324;
                int var7 = (-2048 + class240.method1534(false, 4096, var2)) * this.field9322 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field9321[var5] = this.field9321[var5 + -1] + var8;
            }
            this.field9336[var5][0] = 0;
            for (int var9 = 0; ~this.field9317 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field9320;
                    int var11 = (class240.method1534(false, 4096, var2) + -2048) * this.field9330 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field9336[var5][var9] = this.field9336[var5][var9 + -1] + var12;
                }
                this.field9325[var5][var9] = ~this.field9337 >= -1 ? 4096 : -class240.method1534(false, this.field9337, var2) + 4096;
            }
            this.field9336[var5][this.field9317] = 4096;
        }
        this.field9321[this.field9326] = 4096;
    }

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "(I)V", line = 119)
    public final void method395(int arg0) {
        this.method3706(86);
        if (arg0 >= -37) {
            method3707(96);
        }
        ++field9319;
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "()V", line = 385)
    public class641() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(II)[I", line = 136)
    public final int[] method13(int arg0, int arg1) {
        ++field9338;
        int[] var3 = super.field774.method3086(arg0, -2);
        if (arg1 != 656024161) {
            method3708((byte) -30, -45);
        }
        if (super.field774.field7499) {
            int var4 = 0;
            int var5;
            for (var5 = class309.field4265[arg0] + this.field9342; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field9326 && var5 >= this.field9321[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field9321[var4];
            int var9 = this.field9321[var4 + -1];
            if (this.field9334 + var9 < var5 && ~(var8 - this.field9334) < ~var5) {
                for (int var10 = 0; ~class438.field5847 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field9328 : -this.field9328;
                    int var13;
                    for (var13 = (this.field9320 * var12 >> 12) + class200.field2965[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field9317 && ~this.field9336[var6][var11] >= ~var13) {
                        ++var11;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field9336[var6][var14];
                    int var16 = this.field9336[var6][var11];
                    if (var13 > var15 - -this.field9334 && ~(-this.field9334 + var16) < ~var13) {
                        var3[var10] = this.field9325[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class648.method3739(var3, 0, class438.field5847, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "(I)V", line = 252)
    public static void method3707(int arg0) {
        field9335 = null;
        if (arg0 == -8) {
            field9333 = null;
            field9339 = null;
            field9340 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lgw;II)V", line = 271)
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field9329;
        if (arg1 != -1) {
            field9335 = null;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field9337 = arg0.method1045(true);
                                    }
                                } else {
                                    this.field9318 = arg0.method1045(true);
                                }
                            } else {
                                this.field9342 = arg0.method1045(true);
                            }
                        } else {
                            this.field9328 = arg0.method1045(true);
                        }
                    } else {
                        this.field9322 = arg0.method1045(true);
                    }
                } else {
                    this.field9330 = arg0.method1045(true);
                }
            } else {
                this.field9326 = arg0.method1032((byte) -33);
            }
        } else {
            this.field9317 = arg0.method1032((byte) -33);
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(BI)I", line = 368)
    public static final int method3708(byte arg0, int arg1) {
        ++field9332;
        if (arg0 != -51) {
            return -66;
        } else {
            return ~arg1 == -16711936 ? -1 : class338.method2059(arg1, 117);
        }
    }
}
