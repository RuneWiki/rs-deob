import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class360 extends class330 {

    @OriginalMember(owner = "client!oba", name = "H", descriptor = "[S")
    private short[] field5189 = new short[257];

    @OriginalMember(owner = "client!oba", name = "N", descriptor = "I")
    private int field5195 = 0;

    @OriginalMember(owner = "client!oba", name = "E", descriptor = "[I")
    public static int[] field5186 = new int[4];

    @OriginalMember(owner = "client!oba", name = "D", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!oba", name = "F", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!oba", name = "G", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!oba", name = "I", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!oba", name = "J", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!oba", name = "M", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!oba", name = "O", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!oba", name = "Q", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!oba", name = "L", descriptor = "[I")
    private int[] field5193;

    @OriginalMember(owner = "client!oba", name = "P", descriptor = "[I")
    private int[] field5197;

    @OriginalMember(owner = "client!oba", name = "K", descriptor = "[[I")
    private int[][] field5192;

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
    public class360() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
    private final void method2262(int arg0) {
        ++field5187;
        int[] var2 = this.field5192[0];
        int[] var3 = this.field5192[1];
        int[] var4 = this.field5192[this.field5192.length - 2];
        int[] var5 = this.field5192[this.field5192.length + -1];
        this.field5197 = new int[] { var4[0] + var4[0] + -var5[0], var4[arg0] + -var5[1] + var4[1] };
        this.field5193 = new int[] { var2[0] - var3[0] - -var2[0], var2[1] + var2[1] - var3[1] };
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)[I")
    private final int[] method2263(int arg0, byte arg1) {
        ++field5185;
        if (arg0 < 0) {
            return this.field5193;
        } else if (this.field5192.length <= arg0) {
            return this.field5197;
        } else {
            if (arg1 != 116) {
                method2264(true);
            }
            return this.field5192[arg0];
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        ++field5198;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (super.field4630.field5704) {
            int[] var4 = this.method2084(0, arg0, (byte) -106);
            for (int var5 = 0; ~var5 > ~class80.field901; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field5189[var6];
            }
        }
        if (arg1) {
            this.method653((byte) 120);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(Z)V")
    public static void method2264(boolean arg0) {
        field5186 = null;
        if (arg0) {
            field5186 = null;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZB)V")
    public static final void method2265(boolean arg0, byte arg1) {
        ++field5194;
        if (arg0) {
            if (~class610.field8597 != 0) {
                class131.method891(89, class610.field8597);
            }
            for (class610 var2 = (class610) class278.field3993.method3668(-126); var2 != null; var2 = (class610) class278.field3993.method3667((byte) 109)) {
                if (!var2.method529((byte) 46)) {
                    var2 = (class610) class278.field3993.method3668(37);
                    if (var2 == null) {
                        break;
                    }
                }
                class47.method387(true, (byte) 125, false, var2);
            }
            class610.field8597 = -1;
            class278.field3993 = new class638(8);
            class112.method812(-22476);
            class610.field8597 = class353.field5118;
            class513.method3056(false, (byte) -10);
            class23.method99(100);
            class700.method3952(class610.field8597);
        }
        class14.field80 = false;
        class266.field3866 = "";
        class671.field9423 = "";
        class326.method2062(96);
        class213.field2954 = -1;
        int var3 = -93 / ((-13 - arg1) / 59);
        class243.method1629(class574.field8082, 4592);
        class724.field10031 = new class723();
        class724.field10031.field3460 = class525.field7224 * 512 / 2;
        class724.field10031.field3470 = class741.field10208 * 512 / 2;
        class724.field10031.field9219[0] = class741.field10208 / 2;
        class724.field10031.field9214[0] = class525.field7224 / 2;
        class412.field5779 = 0;
        class497.field6818 = 0;
        if (class695.field9691 == 2) {
            class412.field5779 = class383.field5490 << 9;
            class497.field6818 = class350.field5094 << 9;
        } else {
            class668.method3817(-99);
        }
        class271.method1768((byte) -70);
    }

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "(B)V")
    private final void method2266(byte arg0) {
        if (arg0 != -103) {
            this.field5189 = null;
        }
        int var2 = this.field5195;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field5192.length - 1 && this.field5192[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field5192[var5 + -1];
                    int[] var7 = this.field5192[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class654.field9189[(var8 & 8181) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field5189[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field5192.length + -1 > var14 && ~this.field5192[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field5192[var14 - 1];
                    int[] var16 = this.field5192[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field5189[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field5192.length - 1) < ~var22 && var21 >= this.field5192[var22][0]; ++var22) {
                }
                int[] var23 = this.field5192[var22 + -1];
                int[] var24 = this.field5192[var22];
                int var25 = this.method2263(var22 + -2, (byte) 116)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2263(var22 + 1, (byte) 116)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + -var25 + var26;
                int var32 = -var31 + var25 + -var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var35 - -var36 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field5189[var20] = (short) var38;
            }
        }
        ++field5188;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        int var4 = -78 % ((arg2 - -41) / 42);
        if (~arg1 == -1) {
            this.field5195 = arg0.method3013(-117);
            this.field5192 = new int[arg0.method3013(-104)][2];
            for (int var5 = 0; ~var5 > ~this.field5192.length; ++var5) {
                this.field5192[var5][0] = arg0.method3002(-1);
                this.field5192[var5][1] = arg0.method3002(-1);
            }
        }
        ++field5190;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIII[BI)V")
    public static final void method2267(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        ++field5196;
        if (arg6 > 0 && !class65.method506(arg6, 30440)) {
            throw new IllegalArgumentException("");
        } else if (arg2 == 1) {
            if (arg1 > 0 && !class65.method506(arg1, 30440)) {
                throw new IllegalArgumentException("");
            } else {
                int var7 = class97.method698(arg2 + -29696, arg3);
                int var8 = 0;
                int var9 = arg6 >= arg1 ? arg1 : arg6;
                int var10 = arg6 >> 1;
                int var11 = arg1 >> 1;
                byte[] var12 = arg5;
                byte[] var13 = new byte[var10 * var11 * var7];
                while (true) {
                    OpenGL.glTexImage2Dub(arg0, var8, arg4, arg6, arg1, 0, arg3, 5121, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg6 * var7;
                    byte[] var15 = var13;
                    for (int var16 = 0; var7 > var16; ++var16) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var16 - -var14;
                        for (int var20 = 0; var20 < var11; ++var20) {
                            for (int var21 = 0; var21 < var10; ++var21) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                var18 = var7 + var23;
                                int var25 = var12[var19] + var24;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var13[var17] = (byte) (var27 >> 2);
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var18 += var14;
                            var19 += var14;
                        }
                    }
                    var13 = var12;
                    arg1 = var11;
                    arg6 = var10;
                    var12 = var15;
                    var10 >>= 1;
                    var11 >>= 1;
                    var9 >>= 1;
                    ++var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "(B)V")
    public final void method653(byte arg0) {
        ++field5191;
        if (this.field5192 == null) {
            this.field5192 = new int[][] { new int[2], { 4096, 4096 } };
        }
        int var2 = 35 / ((arg0 - 50) / 41);
        if (this.field5192.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field5195 == -3) {
                this.method2262(1);
            }
            class393.method2423(true);
            this.method2266((byte) -103);
        }
    }
}
