import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class568 extends class540 {

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Lwk;")
    private class151 field8044;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Ljw;")
    private class578 field8034;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "Lmg;")
    private class157 field8051;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    private int field8031;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    private int field8048;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    private int field8040;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    private int field8046;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "[[F")
    private float[][] field8038;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "[[F")
    private float[][] field8039;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "[[F")
    private float[][] field8054;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    private int field8033;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Lfka;")
    private class741 field8036;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "Lmq;")
    private class532 field8052;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Ltga;")
    private class64 field8043;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8042;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8050;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    private int field8037;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[I")
    public static int[] field8030 = new int[2];

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "[I")
    public static int[] field8045 = new int[2048];

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field8047 = 0;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "F")
    public static float field8032;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 7)
    public static void method3299(int arg0) {
        field8030 = null;
        field8045 = null;
        if (arg0 != 32107) {
            method3300(null, -84);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lcb;I)V", line = 30)
    public static final void method3300(class544 arg0, int arg1) {
        class455.field6536 = arg0.method3134(0, "p11_full");
        field8049++;
        class190.field2838 = arg0.method3134(0, "p12_full");
        int var2 = 49 / ((arg1 - 1) / 49);
        class444.field6313 = arg0.method3134(0, "b12_full");
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZS)V", line = 42)
    private final void method3301(boolean arg0, short arg1) {
        if (Stream.method3956()) {
            this.field8050.method3950(arg1);
        } else {
            this.field8050.method3962(arg1);
        }
        if (arg0) {
            this.field8052 = null;
        }
        field8053++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[[ZIBI)V", line = 61)
    public final void method3302(int arg0, boolean[][] arg1, int arg2, byte arg3, int arg4) {
        field8035++;
        if (this.field8052 == null || (arg0 + arg4) < this.field8031 || arg0 - arg4 > this.field8048 || (arg2 + arg4) < this.field8040) {
            return;
        }
        int var6 = 87 / ((61 - arg3) / 51);
        if (this.field8046 < arg2 - arg4) {
            return;
        }
        for (int var7 = this.field8040; var7 <= this.field8046; var7++) {
            for (int var8 = this.field8031; var8 <= this.field8048; var8++) {
                int var9 = var8 - arg0;
                int var10 = var7 - arg2;
                if (var9 > -arg4 && arg4 > var9 && var10 > (-arg4) && arg4 > var10 && arg1[arg4 + var9][var10 + arg4]) {
                    this.field8044.method1072((byte) ((int) (this.field8034.method3356((byte) 121) * 255.0F)), false);
                    this.field8044.method1091((byte) 84, 0, this.field8036);
                    this.field8044.method1099(89, this.field8044.field2230);
                    this.field8044.method1133(class415.field5856, 0, this.field8052, 0, this.field8037, this.field8033 / 3, 6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIII)V", line = 121)
    private final void method3303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8041++;
        if (arg6 > -91) {
            this.field8051 = null;
        }
        long var8 = -1L;
        int var10 = arg2 + (arg4 << this.field8051.field4428);
        int var11 = arg3 + (arg0 << this.field8051.field4428);
        int var12 = this.field8051.method1977((byte) -19, var10, var11);
        if ((arg2 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class540 var13 = this.field8043.method380((byte) -3, var8);
            if (var13 != null) {
                this.method3301(false, ((class13) var13).field253);
                return;
            }
        }
        short var14 = (short) (this.field8037++);
        if (var8 != -1L) {
            this.field8043.method384(var8, new class13(var14), false);
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg3 == 0) {
            var15 = this.field8039[arg5][arg1];
            var16 = this.field8054[arg5][arg1];
            var17 = this.field8038[arg5][arg1];
        } else if (this.field8051.field4419 == arg2 && arg3 == 0) {
            var16 = this.field8054[arg5 + 1][arg1];
            var15 = this.field8039[arg5 + 1][arg1];
            var17 = this.field8038[arg5 + 1][arg1];
        } else if (this.field8051.field4419 == arg2 && this.field8051.field4419 == arg3) {
            var17 = this.field8038[arg5 + 1][arg1 + 1];
            var16 = this.field8054[arg5 + 1][arg1 + 1];
            var15 = this.field8039[arg5 + 1][arg1 + 1];
        } else if (arg2 == 0 && this.field8051.field4419 == arg3) {
            var15 = this.field8039[arg5][arg1 + 1];
            var16 = this.field8054[arg5][arg1 + 1];
            var17 = this.field8038[arg5][arg1 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field8051.field4419;
            float var19 = (float) arg3 / (float) this.field8051.field4419;
            float var20 = this.field8054[arg5][arg1];
            float var21 = this.field8038[arg5][arg1];
            float var22 = this.field8039[arg5][arg1];
            float var23 = this.field8054[arg5 + 1][arg1];
            float var24 = this.field8038[arg5 + 1][arg1];
            float var25 = (this.field8054[arg5 + 1][arg1 + 1] - var23) * var18 + var23;
            float var26 = (this.field8038[arg5][arg1 + 1] - var21) * var18 + var21;
            float var27 = (this.field8039[arg5][arg1 + 1] - var22) * var18 + var22;
            float var28 = this.field8039[arg5 + 1][arg1];
            float var29 = (this.field8054[arg5][arg1 + 1] - var20) * var18 + var20;
            float var30 = (this.field8038[arg5 + 1][arg1 + 1] - var24) * var18 + var24;
            var17 = (var30 - var26) * var19 + var26;
            var16 = (var25 - var29) * var19 + var29;
            float var31 = (this.field8039[arg5 + 1][arg1 + 1] - var28) * var18 + var28;
            var15 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field8034.method3358((byte) 22) - var10);
        float var33 = (float) (this.field8034.method3355(0) - var12);
        float var34 = (float) (this.field8034.method3363(-1) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field8034.method3360(-31770);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var39 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field8034.method3362(0);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3956()) {
            this.field8042.method3955((float) var10);
            this.field8042.method3955((float) var12);
            this.field8042.method3955((float) var11);
        } else {
            this.field8042.method3949((float) var10);
            this.field8042.method3949((float) var12);
            this.field8042.method3949((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field8044.field2134 == 0) {
            this.field8042.method3951(var47);
            this.field8042.method3951(var46);
            this.field8042.method3951(var45);
        } else {
            this.field8042.method3951(var45);
            this.field8042.method3951(var46);
            this.field8042.method3951(var47);
        }
        this.field8042.method3951(255);
        this.method3301(false, var14);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lvfa;)V", line = 311)
    public static final void method3304(class698 arg0) {
        if (class540.field7582 >= 65535) {
            return;
        }
        class578 var1 = arg0.field9855;
        class238.field3437[class540.field7582] = arg0;
        class431.field6149[class540.field7582] = false;
        class540.field7582++;
        int var2 = arg0.field9869;
        if (arg0.field9853) {
            var2 = 0;
        }
        int var3 = arg0.field9869;
        if (arg0.field9856) {
            var3 = class456.field6545 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method3363(-1) + class503.field7200 - var1.method3360(-31770) >> class310.field4616;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method3363(-1) + var1.method3360(-31770) - class503.field7200 >> class310.field4616;
            if (var7 >= class12.field249) {
                var7 = class12.field249 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field9867[var5++];
                int var10 = (var1.method3358((byte) 22) + class503.field7200 - var1.method3360(-31770) >> class310.field4616) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class151.field2074) {
                    var11 = class151.field2074 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class555.field7896[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class555.field7896[var4][var12][var8] = var13 | (long) class540.field7582;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class555.field7896[var4][var12][var8] = var13 | (long) class540.field7582 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class555.field7896[var4][var12][var8] = var13 | (long) class540.field7582 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class555.field7896[var4][var12][var8] = var13 | (long) class540.field7582 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lwk;Lmg;Ljw;[I)V", line = 403)
    public class568(class151 arg0, class157 arg1, class578 arg2, int[] arg3) {
        this.field8044 = arg0;
        this.field8034 = arg2;
        this.field8051 = arg1;
        int var5 = this.field8034.method3360(-31770) - (arg1.field4419 >> 1);
        this.field8031 = this.field8034.method3358((byte) 22) - var5 >> arg1.field4428;
        this.field8048 = this.field8034.method3358((byte) 22) + var5 >> arg1.field4428;
        this.field8040 = this.field8034.method3363(-1) - var5 >> arg1.field4428;
        this.field8046 = var5 + this.field8034.method3363(-1) >> arg1.field4428;
        int var6 = this.field8048 + 1 - this.field8031;
        int var7 = this.field8046 + 1 - this.field8040;
        this.field8038 = new float[var6 + 1][var7 + 1];
        this.field8039 = new float[var6 + 1][var7 + 1];
        this.field8054 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field8040 + var8;
            if (var27 > 0 && var27 < this.field8051.field4425 - 1) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = var28 + this.field8031;
                    if (var29 > 0 && (this.field8051.field4420 - 1) > var29) {
                        int var30 = arg1.method1976(var29 + 1, -1, var27) - arg1.method1976(var29 - 1, -1, var27);
                        int var31 = arg1.method1976(var29, -1, var27 + 1) - arg1.method1976(var29, -1, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + var31 * var31 + 65536)));
                        this.field8054[var28][var8] = (float) var30 * var32;
                        this.field8038[var28][var8] = var32 * -256.0F;
                        this.field8039[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field8040; var10 <= this.field8046; var10++) {
            if (var10 >= 0 && arg1.field4425 > var10) {
                for (int var23 = this.field8031; var23 <= this.field8048; var23++) {
                    if (var23 >= 0 && arg1.field4420 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field2320[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field8033 += 3;
                                    }
                                }
                            } else {
                                this.field8033 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field8048 - this.field8031;
            }
        }
        if (this.field8033 <= 0) {
            this.field8036 = null;
            this.field8052 = null;
        } else {
            this.field8043 = new class64(class89.method631((byte) -60, this.field8033));
            this.field8052 = this.field8044.method1045(false, (byte) 117);
            this.field8052.method50(false, this.field8033);
            NativeHeapBuffer var11 = this.field8044.method1109(1, false, this.field8033 * 16);
            this.field8042 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field8052.method48((byte) -31, true);
                } while (var12 == null);
                this.field8050 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field8040; var15 <= this.field8046; var15++) {
                    if (var15 >= 0 && arg1.field4425 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field8031; var17 <= this.field8048; var17++) {
                            if (var17 >= 0 && arg1.field4420 > var17) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field2320[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field2325[var17][var15];
                                        int[] var21 = arg1.field2326[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3303(var15, var14, var20[var22], var21[var22], var17, var16, -97);
                                                    var22++;
                                                    this.method3303(var15, var14, var20[var22], var21[var22], var17, var16, -122);
                                                    var22++;
                                                    this.method3303(var15, var14, var20[var22], var21[var22], var17, var16, -100);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3303(var15, var14, 0, 0, var17, var16, -116);
                                        this.method3303(var15, var14, arg1.field4419, 0, var17, var16, -109);
                                        this.method3303(var15, var14, 0, arg1.field4419, var17, var16, -128);
                                    } else if (var18 == 2) {
                                        this.method3303(var15, var14, arg1.field4419, 0, var17, var16, -110);
                                        this.method3303(var15, var14, arg1.field4419, arg1.field4419, var17, var16, -108);
                                        this.method3303(var15, var14, 0, 0, var17, var16, -99);
                                    } else if (var18 == 5) {
                                        this.method3303(var15, var14, arg1.field4419, arg1.field4419, var17, var16, -94);
                                        this.method3303(var15, var14, 0, arg1.field4419, var17, var16, -112);
                                        this.method3303(var15, var14, arg1.field4419, 0, var17, var16, -128);
                                    } else if (var18 == 4) {
                                        this.method3303(var15, var14, 0, arg1.field4419, var17, var16, -128);
                                        this.method3303(var15, var14, 0, 0, var17, var16, -96);
                                        this.method3303(var15, var14, arg1.field4419, arg1.field4419, var17, var16, -107);
                                    }
                                }
                            }
                            var13++;
                            var16++;
                        }
                    } else {
                        var13 += this.field8048 - this.field8031;
                    }
                    var14++;
                }
                this.field8050.method3959();
                if (this.field8052.method49(-11488)) {
                    this.field8042.method3959();
                    this.field8036 = this.field8044.method1139(6, false);
                    this.field8036.method3455(16, 6838, this.field8037 * 16, var11);
                    break;
                }
                this.field8042.method3954(0);
                this.field8043.method387(-21125);
            }
        }
        this.field8042 = null;
        this.field8050 = null;
        this.field8054 = this.field8038 = this.field8039 = null;
        this.field8043 = null;
    }
}
