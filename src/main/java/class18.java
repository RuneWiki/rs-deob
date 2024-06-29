import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class18 extends class175 {

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "[S")
    private short[] field178 = new short[257];

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    private int field185 = 0;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "[I")
    public static int[] field184 = new int[2];

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "Ltq;")
    public static class654 field182 = new class654("", 19);

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "[I")
    private int[] field177;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "[I")
    private int[] field188;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "[[I")
    private int[][] field190;

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 6)
    public class18() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "(I)V", line = 18)
    private final void method97(int arg0) {
        ++field183;
        int[] var2 = this.field190[0];
        int[] var3 = this.field190[1];
        int[] var4 = this.field190[this.field190.length - 2];
        if (arg0 != 16818) {
            method99(120);
        }
        int[] var5 = this.field190[this.field190.length + -1];
        this.field177 = new int[] { var2[0] - -var2[0] + -var3[0], var2[1] + -var3[1] + var2[1] };
        this.field188 = new int[] { var4[0] - var5[0] - -var4[0], var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 39)
    public static final String method98(boolean arg0, String arg1) {
        ++field176;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 0;
        if (arg0) {
            return null;
        } else {
            while (var4 < var2) {
                char var8 = arg1.charAt(var4);
                if (~var8 == -61 || var8 == '>') {
                    var3 += 3;
                }
                ++var4;
            }
            StringBuffer var5 = new StringBuffer(var2 + var3);
            for (int var6 = 0; var2 > var6; ++var6) {
                char var7 = arg1.charAt(var6);
                if (~var7 != -61) {
                    if (~var7 == -63) {
                        var5.append("<gt>");
                    } else {
                        var5.append(var7);
                    }
                } else {
                    var5.append("<lt>");
                }
            }
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)V", line = 88)
    public static final void method99(int arg0) {
        ++field180;
        int var1 = class125.field1721.field5172.method2553(43);
        if (var1 == 0) {
            class641.field8644 = null;
            class551.method3169(0, 58);
        } else if (var1 == 1) {
            class671.method3701((byte) -79, (byte) 0);
            class551.method3169(512, 58);
            if (class328.field4667 != null) {
                class750.method4098(0);
            }
        } else {
            class671.method3701((byte) -81, (byte) (class327.field4642 + -4 & 255));
            class551.method3169(2, 58);
        }
        if (arg0 <= -85) {
            class220.field2859 = class184.field2420;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 123)
    public final void method46(int arg0) {
        ++field175;
        if (arg0 != -8) {
            this.field185 = -89;
        }
        if (this.field190 == null) {
            this.field190 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field190.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field185 == 2) {
                this.method97(16818);
            }
            class647.method3595((byte) -91);
            this.method102(-82);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I", line = 145)
    private final int[] method100(int arg0, int arg1) {
        ++field179;
        if (arg1 != -5290) {
            this.method46(80);
        }
        if (arg0 < 0) {
            return this.field177;
        } else {
            return arg0 >= this.field190.length ? this.field188 : this.field190[arg0];
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILdt;Z)V", line = 163)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (arg2) {
            this.field188 = null;
        }
        ++field181;
        if (arg0 == 0) {
            this.field185 = arg1.method1731((byte) 64);
            this.field190 = new int[arg1.method1731((byte) 64)][2];
            for (int var4 = 0; var4 < this.field190.length; ++var4) {
                this.field190[var4][0] = arg1.method1728((byte) 20);
                this.field190[var4][1] = arg1.method1728((byte) 111);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "(I)V", line = 193)
    public static void method101(int arg0) {
        if (arg0 != 1) {
            field182 = null;
        }
        field184 = null;
        field182 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)[I", line = 205)
    public final int[] method47(boolean arg0, int arg1) {
        ++field187;
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            int[] var4 = this.method1202(arg1, -1150480797, 0);
            for (int var5 = 0; ~var5 > ~class598.field8136; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field178[var6];
            }
        }
        return !arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "(I)V", line = 254)
    private final void method102(int arg0) {
        if (arg0 >= -27) {
            this.field188 = null;
        }
        int var2 = this.field185;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field190.length + -1) && var4 >= this.field190[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field190[var5 + -1];
                    int[] var7 = this.field190[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class10.field123[(var8 & 8166) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field178[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field190.length + -1) < ~var14 && this.field190[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field190[var14 - 1];
                    int[] var16 = this.field190[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field178[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field190.length + -1) && ~var21 <= ~this.field190[var22][0]; ++var22) {
                }
                int[] var23 = this.field190[var22 + -1];
                int[] var24 = this.field190[var22];
                int var25 = this.method100(var22 + -2, -5290)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method100(var22 + 1, -5290)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - -var26 + -var25 + -var27;
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - -var36 + var37 - -var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field178[var20] = (short) var38;
            }
        }
        ++field189;
    }
}
