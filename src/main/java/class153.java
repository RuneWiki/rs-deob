import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class153 extends class117 {

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    private int field2386 = 0;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "[S")
    private short[] field2390 = new short[257];

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "[I")
    public static int[] field2376 = new int[5];

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    public static int field2385 = 0;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "[I")
    private int[] field2377;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "[I")
    private int[] field2388;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "[[I")
    private int[][] field2381;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "[[I")
    public static int[][] field2382;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)[I")
    private final int[] method1044(int arg0, byte arg1) {
        if (arg1 > -86) {
            return null;
        } else {
            ++field2378;
            if (~arg0 > -1) {
                return this.field2388;
            } else {
                return ~arg0 <= ~this.field2381.length ? this.field2377 : this.field2381[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class153() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)V")
    public static final void method1045(boolean arg0) {
        if (arg0) {
            ++field2379;
            class78.field1297.method1257(-120);
            class130.field2039.method1257(-111);
            class53.field896.method1257(74);
            class90.field1471.method1257(-108);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (arg1 != 255) {
            this.method1044(-69, (byte) -58);
        }
        ++field2389;
        if (arg2 == 0) {
            this.field2386 = arg0.method1133((byte) 53);
            this.field2381 = new int[arg0.method1133((byte) 53)][2];
            for (int var4 = 0; ~this.field2381.length < ~var4; ++var4) {
                this.field2381[var4][0] = arg0.method1142(-18970);
                this.field2381[var4][1] = arg0.method1142(arg1 + -19225);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(Z)V")
    private final void method1046(boolean arg0) {
        ++field2374;
        int[] var2 = this.field2381[0];
        int[] var3 = this.field2381[1];
        int[] var4 = this.field2381[this.field2381.length + -2];
        int[] var5 = this.field2381[this.field2381.length - 1];
        if (!arg0) {
            this.field2377 = new int[] { var4[0] - var5[0] - -var4[0], var4[1] + -var5[1] + var4[1] };
            this.field2388 = new int[] { var2[0] - var3[0] - -var2[0], var2[1] + var2[1] + -var3[1] };
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field2375;
        if (this.field2381 == null) {
            this.field2381 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field2381.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field2386 == -3) {
                this.method1046(false);
            }
            if (arg0 != 1) {
                this.method1047(-45);
            }
            class11.method53(-16416);
            this.method1047(-6);
        }
    }

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "(I)V")
    private final void method1047(int arg0) {
        ++field2384;
        int var2 = -93 % ((-51 - arg0) / 43);
        int var3 = this.field2386;
        if (~var3 != -3) {
            if (var3 == 1) {
                for (int var4 = 0; ~var4 > -258; ++var4) {
                    int var5 = var4 << 4;
                    int var6;
                    for (var6 = 1; this.field2381.length + -1 > var6 && var5 >= this.field2381[var6][0]; ++var6) {
                    }
                    int[] var7 = this.field2381[var6 + -1];
                    int[] var8 = this.field2381[var6];
                    int var9 = (-var7[0] + var5 << 12) / (var8[0] + -var7[0]);
                    int var10 = -class2.field32[(var9 & 8171) >> 5] + 4096 >> 1;
                    int var11 = -var10 + 4096;
                    int var12 = var7[1] * var11 + var8[1] * var10 >> 12;
                    if (var12 <= -32768) {
                        var12 = -32767;
                    }
                    if (var12 >= 32768) {
                        var12 = 32767;
                    }
                    this.field2390[var4] = (short) var12;
                }
            } else {
                for (int var13 = 0; var13 < 257; ++var13) {
                    int var14 = var13 << 4;
                    int var15;
                    for (var15 = 1; ~var15 > ~(this.field2381.length + -1) && ~var14 <= ~this.field2381[var15][0]; ++var15) {
                    }
                    int[] var16 = this.field2381[var15 + -1];
                    int[] var17 = this.field2381[var15];
                    int var18 = (-var16[0] + var14 << 12) / (var17[0] + -var16[0]);
                    int var19 = -var18 + 4096;
                    int var20 = var16[1] * var19 - -(var17[1] * var18) >> 12;
                    if (~var20 >= 32767) {
                        var20 = -32767;
                    }
                    if (~var20 <= -32769) {
                        var20 = 32767;
                    }
                    this.field2390[var13] = (short) var20;
                }
            }
        } else {
            for (int var21 = 0; var21 < 257; ++var21) {
                int var22 = var21 << 4;
                int var23;
                for (var23 = 1; ~var23 > ~(this.field2381.length + -1) && ~this.field2381[var23][0] >= ~var22; ++var23) {
                }
                int[] var24 = this.field2381[var23 + -1];
                int[] var25 = this.field2381[var23];
                int var26 = this.method1044(var23 + -2, (byte) -113)[1];
                int var27 = var24[1];
                int var28 = var25[1];
                int var29 = this.method1044(var23 + 1, (byte) -89)[1];
                int var30 = (-var24[0] + var22 << 12) / (var25[0] + -var24[0]);
                int var31 = var30 * var30 >> 12;
                int var32 = -var26 - -var27 + (var29 - var28);
                int var33 = -var32 + var26 + -var27;
                int var34 = -var26 + var28;
                int var36 = (var30 * var32 >> 12) * var31 >> 12;
                int var37 = var31 * var33 >> 12;
                int var38 = var30 * var34 >> 12;
                int var39 = var36 + var38 + var37 + var27;
                if (~var39 >= 32767) {
                    var39 = -32767;
                }
                if (var39 >= 32768) {
                    var39 = 32767;
                }
                this.field2390[var21] = (short) var39;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field2380;
        int[] var3 = super.field1883.method531(arg1, (byte) 115);
        if (super.field1883.field1313) {
            int[] var4 = this.method837(0, 0, arg1);
            for (int var5 = 0; class168.field2737 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field2390[var6];
            }
        }
        if (arg0 != 2) {
            this.field2381 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "(I)V")
    public static void method1048(int arg0) {
        field2376 = null;
        field2382 = null;
        if (arg0 != 4545) {
            method1045(false);
        }
    }
}
