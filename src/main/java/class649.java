import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class649 extends class573 {

    @OriginalMember(owner = "client!sea", name = "R", descriptor = "I")
    private int field9353 = 204;

    @OriginalMember(owner = "client!sea", name = "L", descriptor = "I")
    private int field9349 = 8;

    @OriginalMember(owner = "client!sea", name = "W", descriptor = "I")
    private int field9358 = 4;

    @OriginalMember(owner = "client!sea", name = "O", descriptor = "I")
    private int field9351 = 409;

    @OriginalMember(owner = "client!sea", name = "S", descriptor = "I")
    private int field9354 = 81;

    @OriginalMember(owner = "client!sea", name = "cb", descriptor = "I")
    private int field9364 = 1024;

    @OriginalMember(owner = "client!sea", name = "ib", descriptor = "I")
    private int field9370 = 1024;

    @OriginalMember(owner = "client!sea", name = "kb", descriptor = "I")
    private int field9372 = 0;

    @OriginalMember(owner = "client!sea", name = "X", descriptor = "S")
    public static short field9359 = 256;

    @OriginalMember(owner = "client!sea", name = "I", descriptor = "I")
    public static int field9346 = 1400;

    @OriginalMember(owner = "client!sea", name = "ab", descriptor = "I")
    public static int field9362 = 0;

    @OriginalMember(owner = "client!sea", name = "U", descriptor = "[I")
    public static int[] field9356 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!sea", name = "hb", descriptor = "[[B")
    public static byte[][] field9369 = new byte[1000][];

    @OriginalMember(owner = "client!sea", name = "J", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!sea", name = "N", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!sea", name = "Q", descriptor = "I")
    private int field9352;

    @OriginalMember(owner = "client!sea", name = "T", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!sea", name = "V", descriptor = "I")
    private int field9357;

    @OriginalMember(owner = "client!sea", name = "Z", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!sea", name = "eb", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!sea", name = "fb", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!sea", name = "gb", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!sea", name = "jb", descriptor = "I")
    private int field9371;

    @OriginalMember(owner = "client!sea", name = "lb", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!sea", name = "Y", descriptor = "[I")
    private int[] field9360;

    @OriginalMember(owner = "client!sea", name = "db", descriptor = "[Loe;")
    public static class185[] field9365;

    @OriginalMember(owner = "client!sea", name = "K", descriptor = "[[I")
    private int[][] field9348;

    @OriginalMember(owner = "client!sea", name = "bb", descriptor = "[[I")
    private int[][] field9363;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(BII)I")
    public static final int method3702(byte arg0, int arg1, int arg2) {
        int var3 = (127 & arg1) * arg2 >> 7;
        if (arg0 != -84) {
            method3704(-7, -105, 29, -24, -8);
        }
        ++field9368;
        if (~var3 <= -3) {
            if (var3 > 126) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        return (arg1 & 65408) - -var3;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field9350;
        int[] var3 = super.field8321.method3164(arg0, arg1 ^ -122);
        if (super.field8321.field7825) {
            int var4 = 0;
            int var5;
            for (var5 = class230.field3460[arg0] - -this.field9372; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field9349 < ~var4 && ~this.field9360[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field9360[var4];
            int var9 = this.field9360[var4 + -1];
            if (~(this.field9352 + var9) > ~var5 && -this.field9352 + var8 > var5) {
                for (int var10 = 0; class540.field7555 > var10; ++var10) {
                    int var11 = !var7 ? -this.field9370 : this.field9370;
                    int var12 = 0;
                    int var13;
                    for (var13 = class51.field1194[var10] - -(this.field9357 * var11 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (var12 < this.field9358 && ~this.field9348[var6][var12] >= ~var13) {
                        ++var12;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field9348[var6][var14];
                    int var16 = this.field9348[var6][var12];
                    if (var13 > var15 - -this.field9352 && var13 < var16 - this.field9352) {
                        var3[var10] = this.field9363[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class692.method3878(var3, 0, class540.field7555, 0);
            }
        }
        if (arg1 != 1) {
            this.field9349 = 64;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "(I)V")
    public static void method3703(int arg0) {
        if (arg0 != -1) {
            field9362 = -73;
        }
        field9356 = null;
        field9365 = null;
        field9369 = null;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIII)V")
    public static final void method3704(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -2360) {
            method3702((byte) 116, -57, 79);
        }
        if (~class137.field2426 == -2) {
            class288.field4300[class469.field6641 / 100].method3914(class247.field3719 - 8, class174.field2876 + -8);
        }
        ++field9347;
        if (~class137.field2426 == -3) {
            class288.field4300[4 - -(class469.field6641 / 100)].method3914(class247.field3719 - 8, class174.field2876 + -8);
        }
        class494.method2959(9535);
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "()V")
    public class649() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.field9360 = null;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field9364 = arg0.method723((byte) -25);
                                    }
                                } else {
                                    this.field9354 = arg0.method723((byte) -25);
                                }
                            } else {
                                this.field9372 = arg0.method723((byte) -25);
                            }
                        } else {
                            this.field9370 = arg0.method723((byte) -25);
                        }
                    } else {
                        this.field9353 = arg0.method723((byte) -25);
                    }
                } else {
                    this.field9351 = arg0.method723((byte) -25);
                }
            } else {
                this.field9349 = arg0.method732(-559537960);
            }
        } else {
            this.field9358 = arg0.method732(-559537960);
        }
        ++field9366;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZZ)Z")
    public static boolean method3705(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sea", name = "i", descriptor = "(I)V")
    public static final void method3706(int arg0) {
        ++field9355;
        if (class625.field9027 != class281.field4177) {
            try {
                class31.method507(13009, "tbrefresh", class486.field6963);
            } catch (Throwable var1) {
            }
            if (arg0 != 16495) {
                method3703(-48);
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        ++field9367;
        if (arg0 == 4095) {
            this.method3707((byte) -78);
        }
    }

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "(B)V")
    private final void method3707(byte arg0) {
        int var2 = -118 % ((arg0 - 5) / 62);
        ++field9361;
        Random var3 = new Random((long) this.field9349);
        this.field9357 = 4096 / this.field9358;
        this.field9352 = this.field9354 / 2;
        this.field9371 = 4096 / this.field9349;
        int var4 = this.field9357 / 2;
        this.field9363 = new int[this.field9349][this.field9358];
        this.field9348 = new int[this.field9349][this.field9358 + 1];
        this.field9360 = new int[this.field9349 + 1];
        int var5 = this.field9371 / 2;
        this.field9360[0] = 0;
        for (int var6 = 0; ~var6 > ~this.field9349; ++var6) {
            if (~var6 < -1) {
                int var7 = this.field9371;
                int var8 = (class468.method2795(var3, 4096, (byte) -121) + -2048) * this.field9353 >> 12;
                int var9 = (var5 * var8 >> 12) + var7;
                this.field9360[var6] = this.field9360[var6 + -1] + var9;
            }
            this.field9348[var6][0] = 0;
            for (int var10 = 0; ~var10 > ~this.field9358; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field9357;
                    int var12 = (-2048 + class468.method2795(var3, 4096, (byte) -105)) * this.field9351 >> 12;
                    int var13 = (var4 * var12 >> 12) + var11;
                    this.field9348[var6][var10] = this.field9348[var6][var10 + -1] + var13;
                }
                this.field9363[var6][var10] = this.field9364 <= 0 ? 4096 : 4096 - class468.method2795(var3, this.field9364, (byte) -122);
            }
            this.field9348[var6][this.field9358] = 4096;
        }
        this.field9360[this.field9349] = 4096;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIII)Z")
    public static final boolean method3708(int arg0, int arg1, int arg2, int arg3) {
        ++field9373;
        if (!class337.field5036) {
            return false;
        } else if (~class481.field6911 > -101) {
            return false;
        } else {
            int var4 = class85.field1610[arg2][arg0][arg3];
            if (-class574.field8339 == var4) {
                return false;
            } else if (~class574.field8339 == ~var4) {
                return true;
            } else if (class697.field9813 == class485.field6947) {
                return false;
            } else {
                int var5 = arg0 << class30.field940;
                int var6 = arg3 << class30.field940;
                if (arg1 >= -125) {
                    method3702((byte) 103, 38, 18);
                }
                if (class589.method3361(var6 + 1, var5 + 1, class485.field6947[arg2].method551(arg0, arg3 + 1, (byte) -99), var6 - -class576.field8369 + -1, class576.field8369 + var6 + -1, -124, class485.field6947[arg2].method551(arg0, arg3, (byte) -101), var5 + 1, var5 - (-class576.field8369 - -1), class485.field6947[arg2].method551(arg0 + 1, arg3 + 1, (byte) -97)) && class589.method3361(var6 - -1, var5 + -1 + class576.field8369, class485.field6947[arg2].method551(arg0 - -1, arg3 + 1, (byte) -97), var6 + 1, class576.field8369 - 1 + var6, -128, class485.field6947[arg2].method551(arg0, arg3, (byte) -121), var5 + 1, class576.field8369 + var5 - 1, class485.field6947[arg2].method551(arg0 + 1, arg3, (byte) -104))) {
                    ++class363.field5390;
                    class85.field1610[arg2][arg0][arg3] = class574.field8339;
                    return true;
                } else {
                    class85.field1610[arg2][arg0][arg3] = -class574.field8339;
                    return false;
                }
            }
        }
    }
}
