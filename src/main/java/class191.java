import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class191 extends class154 {

    @OriginalMember(owner = "client!ek", name = "ab", descriptor = "I")
    private int field3276 = 0;

    @OriginalMember(owner = "client!ek", name = "kb", descriptor = "[S")
    private short[] field3286 = new short[257];

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!ek", name = "bb", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ek", name = "cb", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ek", name = "db", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ek", name = "eb", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!ek", name = "fb", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ek", name = "gb", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ek", name = "hb", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ek", name = "ib", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ek", name = "jb", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ek", name = "Z", descriptor = "[I")
    private int[] field3275;

    @OriginalMember(owner = "client!ek", name = "lb", descriptor = "[I")
    public static int[] field3287;

    @OriginalMember(owner = "client!ek", name = "mb", descriptor = "[I")
    private int[] field3288;

    @OriginalMember(owner = "client!ek", name = "Y", descriptor = "[[I")
    private int[][] field3274;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        if (arg1 != 1075962732) {
            return null;
        } else {
            int[] var3 = super.field2574.method206(arg0, arg1 ^ 1075954836);
            if (super.field2574.field536) {
                int[] var4 = this.method1052(0, arg0, (byte) -58);
                for (int var5 = 0; var5 < class227.field3898; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field3286[var6];
                }
            }
            ++field3278;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)V")
    public static final void method1317(byte arg0) {
        if (arg0 != 73) {
            field3287 = null;
        }
        ++field3285;
        for (class190 var1 = (class190) class120.field2022.method993(-15322); var1 != null; var1 = (class190) class120.field2022.method988(4586)) {
            int var2 = var1.field3259;
            if (class262.method1772(0, var2)) {
                boolean var3 = true;
                class237[] var4 = class232.field4000[var2];
                for (int var5 = 0; var5 < var4.length; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4129;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1027;
                    class237 var7 = class156.method1066(-104, var6);
                    if (var7 != null) {
                        class121.method856(24665, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)[I")
    private final int[] method1318(int arg0, boolean arg1) {
        ++field3284;
        if (~arg0 > -1) {
            return this.field3275;
        } else if (arg0 >= this.field3274.length) {
            return this.field3288;
        } else {
            if (!arg1) {
                this.field3274 = null;
            }
            return this.field3274[arg0];
        }
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
    private final void method1319(int arg0) {
        ++field3280;
        int[] var2 = this.field3274[0];
        int[] var3 = this.field3274[this.field3274.length + -2];
        int[] var4 = this.field3274[this.field3274.length + -1];
        if (arg0 == -832522900) {
            int[] var5 = this.field3274[1];
            this.field3275 = new int[] { var2[0] - var5[0] - -var2[0], -var5[1] - -var2[1] + var2[1] };
            this.field3288 = new int[] { var3[0] - (var4[0] + -var3[0]), var3[1] + -var4[1] + var3[1] };
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)Leg;")
    public static final class37 method1320(boolean arg0, int arg1) {
        ++field3273;
        if (~arg1 < -1 && ~arg1 >= -256) {
            class37 var2 = new class37();
            if (!arg0) {
                return null;
            } else {
                var2.field599 = new byte[1];
                var2.field576 = 1;
                var2.field599[0] = (byte) arg1;
                return var2;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(SI)Z")
    public static final boolean method1321(short arg0, int arg1) {
        if (arg1 != -7129) {
            field3287 = null;
        }
        ++field3281;
        if (arg0 != 31 && ~arg0 != -7 && ~arg0 != -52 && arg0 != 32 && arg0 != 57 && ~arg0 != -46 && arg0 != 43 && ~arg0 != -21) {
            if (~arg0 != -13 && arg0 != 3 && ~arg0 != -1005 && ~arg0 != -1003) {
                if (~arg0 != -11 && ~arg0 != -16 && arg0 != 9 && arg0 != 59 && ~arg0 != -38) {
                    return arg0 == 40 || arg0 == 5 || arg0 == 41 || ~arg0 == -49 || arg0 == 19 || arg0 == 35;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (this.field3274 == null) {
            this.field3274 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3277;
        if (this.field3274.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3276 == -3) {
                this.method1319(arg0 + -832522891);
            }
            if (arg0 != -9) {
                this.method144(-14);
            }
            class77.method527((byte) 100);
            this.method1322(arg0 ^ -17600);
        }
    }

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)V")
    private final void method1322(int arg0) {
        if (arg0 != 17591) {
            this.field3274 = null;
        }
        int var2 = this.field3276;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field3274.length - 1) < ~var5 && var4 >= this.field3274[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field3274[var5];
                    int[] var7 = this.field3274[var5 + -1];
                    int var8 = (var4 - var7[0] << 12) / (var6[0] + -var7[0]);
                    int var9 = -class43.field676[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field3286[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field3274.length + -1 && var13 >= this.field3274[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3274[var14];
                    int[] var16 = this.field3274[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var16[1] * var18 - -(var15[1] * var17) >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field3286[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field3274.length + -1 > var22 && var21 >= this.field3274[var22][0]; ++var22) {
                }
                int[] var23 = this.field3274[var22];
                int[] var24 = this.field3274[var22 + -1];
                int var25 = this.method1318(var22 + -2, true)[1];
                int var26 = var23[1];
                int var27 = -var25 + var26;
                int var28 = var24[1];
                int var29 = this.method1318(var22 + 1, true)[1];
                int var30 = -var26 + var29 + -var25 + var28;
                int var31 = -var28 + var25 + -var30;
                int var32 = (var21 - var24[0] << 12) / (var23[0] - var24[0]);
                int var33 = var32 * var32 >> 12;
                int var34 = (var30 * var32 >> 12) * var33 >> 12;
                int var36 = var27 * var32 >> 12;
                int var37 = var31 * var33 >> 12;
                int var38 = var34 - (-var28 + -var36) + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field3286[var20] = (short) var38;
            }
        }
        ++field3283;
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)V")
    public static void method1323(byte arg0) {
        field3287 = null;
        if (arg0 >= -4) {
            field3287 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class191() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        ++field3279;
        if (arg2 == 0) {
            this.field3276 = arg0.method1268(255);
            this.field3274 = new int[arg0.method1268(255)][2];
            for (int var4 = 0; var4 < this.field3274.length; ++var4) {
                this.field3274[var4][0] = arg0.method1244(false);
                this.field3274[var4][1] = arg0.method1244(false);
            }
        }
        if (arg1 != -14015) {
            this.method143(79, -38);
        }
    }
}
