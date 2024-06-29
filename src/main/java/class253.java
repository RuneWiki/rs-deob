import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class253 extends class27 {

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public int field3771 = 0;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
    public int field3776 = 4;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "Z")
    public boolean field3772 = true;

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
    public int field3780 = 4;

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "[B")
    private byte[] field3784 = new byte[512];

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "I")
    public int field3783 = 1638;

    @OriginalMember(owner = "client!ti", name = "eb", descriptor = "I")
    public int field3786 = 4;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    public static int field3768 = 0;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ti", name = "db", descriptor = "Lph;")
    public static class361 field3785;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "[S")
    private short[] field3777;

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "[S")
    private short[] field3782;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "[[Lnk;")
    public static class224[][] field3781;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI[I)V", line = 7)
    public final void method1854(boolean arg0, int arg1, int[] arg2) {
        field3775++;
        int var4 = class215.field3175[arg1] * this.field3780;
        if (!arg0) {
            this.method1857(3, -53, -55, -91, -80, -23, -88);
        }
        if (this.field3776 == 1) {
            int var5 = this.field3777[0] << 12;
            int var6 = this.field3780 * var5 >> 12;
            short var7 = this.field3782[0];
            int var8 = var4 * var5 >> 12;
            int var9 = this.field3786 * var5 >> 12;
            int var10 = var8 >> 12;
            int var11 = var8 & 0xFFF;
            int var12 = var10 + 1;
            int var13 = class131.field1909[var11];
            if (var6 <= var12) {
                var12 = 0;
            }
            int var14 = this.field3784[var12 & 0xFF] & 0xFF;
            int var15 = this.field3784[var10 & 0xFF] & 0xFF;
            if (this.field3772) {
                for (int var19 = 0; var19 < class209.field3053; var19++) {
                    int var20 = class251.field3721[var19] * this.field3786;
                    int var21 = this.method1857(var5 * var20 >> 12, 4, var11, var9, var13, var15, var14);
                    int var22 = var7 * var21 >> 12;
                    arg2[var19] = (var22 >> 1) + 2048;
                }
            } else {
                for (int var16 = 0; var16 < class209.field3053; var16++) {
                    int var17 = class251.field3721[var16] * this.field3786;
                    int var18 = this.method1857(var5 * var17 >> 12, 4, var11, var9, var13, var15, var14);
                    arg2[var16] = var7 * var18 >> 12;
                }
            }
            return;
        }
        short var23 = this.field3782[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field3777[0] << 12;
            int var25 = this.field3786 * var24 >> 12;
            int var26 = this.field3780 * var24 >> 12;
            int var27 = var4 * var24 >> 12;
            int var28 = var27 >> 12;
            int var29 = this.field3784[var28 & 0xFF] & 0xFF;
            int var30 = var28 + 1;
            int var31 = var27 & 0xFFF;
            if (var26 <= var30) {
                var30 = 0;
            }
            int var32 = class131.field1909[var31];
            int var33 = this.field3784[var30 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class209.field3053; var34++) {
                int var35 = class251.field3721[var34] * this.field3786;
                int var36 = this.method1857(var24 * var35 >> 12, 4, var31, var25, var32, var29, var33);
                arg2[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field3776; var37++) {
            short var38 = this.field3782[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field3777[var37] << 12;
                int var40 = var4 * var39 >> 12;
                int var41 = var40 >> 12;
                int var42 = this.field3784[var41 & 0xFF] & 0xFF;
                int var43 = this.field3786 * var39 >> 12;
                int var44 = var40 & 0xFFF;
                int var45 = this.field3780 * var39 >> 12;
                int var46 = var41 + 1;
                if (var46 >= var45) {
                    var46 = 0;
                }
                int var47 = class131.field1909[var44];
                int var48 = this.field3784[var46 & 0xFF] & 0xFF;
                if (this.field3772 && (this.field3776 - 1) == var37) {
                    for (int var49 = 0; var49 < class209.field3053; var49++) {
                        int var50 = class251.field3721[var49] * this.field3786;
                        int var51 = this.method1857(var39 * var50 >> 12, 4, var44, var43, var47, var42, var48);
                        int var52 = (var38 * var51 >> 12) + arg2[var49];
                        arg2[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class209.field3053; var53++) {
                        int var54 = class251.field3721[var53] * this.field3786;
                        int var55 = this.method1857(var39 * var54 >> 12, 4, var44, var43, var47, var42, var48);
                        arg2[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 162)
    public static final void method1855(String arg0, int arg1, int arg2) {
        field3767++;
        if (arg2 >= -38) {
            field3768 = 96;
        }
        class95 var3 = class227.method1699(2, -1855723168, arg1);
        var3.method738((byte) -5);
        var3.field1332 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)V", line = 175)
    public static void method1856(int arg0) {
        field3785 = null;
        field3781 = (class224[][]) null;
        if (arg0 <= 95) {
            field3785 = (class361) null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V", line = 193)
    public final void method22(int arg0) {
        field3779++;
        if (arg0 >= -63) {
            this.method23(64, (class190) null, 40);
        }
        this.field3784 = class96.method753((byte) -24, this.field3771);
        this.method1858((byte) -95);
        for (int var2 = this.field3776 - 1; var2 >= 1; var2--) {
            short var3 = this.field3782[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field3776--;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V", line = 227)
    public class253() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)[I", line = 235)
    public final int[] method18(int arg0, byte arg1) {
        field3778++;
        if (arg1 != -62) {
            this.method23(-78, (class190) null, -50);
        }
        int[] var3 = this.field375.method2087(-127, arg0);
        if (this.field375.field4382) {
            this.method1854(true, arg0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)I", line = 259)
    private final int method1857(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3774++;
        if (arg1 != 4) {
            return 65;
        }
        int var8 = arg2 - 4096;
        int var9 = arg0 >> 12;
        int var10 = var9 + 1;
        int var11 = arg0 & 0xFFF;
        int var12 = var11 - 4096;
        int var13 = class131.field1909[var11];
        if (arg3 <= var10) {
            var10 = 0;
        }
        int var14 = var10 & 0xFF;
        int var15 = var9 & 0xFF;
        int var16 = this.field3784[arg5 + var15] & 0x3;
        int var17;
        if (var16 > 1) {
            var17 = var16 == 2 ? var11 - arg2 : -var11 - arg2;
        } else {
            var17 = var16 == 0 ? arg2 + var11 : -var11 + arg2;
        }
        int var18 = this.field3784[arg5 + var14] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg2 + var12 : -var12 + arg2;
        } else {
            var19 = var18 == 2 ? var12 - arg2 : -var12 - arg2;
        }
        int var20 = ((var19 - var17) * var13 >> 12) + var17;
        int var21 = this.field3784[var15 + arg6] & 0x3;
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? var11 - var8 : -var8 + -var11;
        } else {
            var22 = var21 == 0 ? var11 + var8 : -var11 + var8;
        }
        int var23 = this.field3784[arg6 + var14] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var12 + var8 : -var12 + var8;
        } else {
            var24 = var23 == 2 ? var12 - var8 : -var8 + -var12;
        }
        int var25 = ((var24 - var22) * var13 >> 12) + var22;
        return ((var25 - var20) * arg4 >> 12) + var20;
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(B)V", line = 336)
    private final void method1858(byte arg0) {
        if (this.field3783 > 0) {
            this.field3782 = new short[this.field3776];
            this.field3777 = new short[this.field3776];
            for (int var3 = 0; var3 < this.field3776; var3++) {
                this.field3782[var3] = (short) ((int) (Math.pow((double) ((float) this.field3783 / 4096.0F), (double) var3) * 4096.0D));
                this.field3777[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field3782 != null && this.field3782.length == this.field3776) {
            this.field3777 = new short[this.field3776];
            for (int var2 = 0; var2 < this.field3776; var2++) {
                this.field3777[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        if (arg0 != -95) {
            method1855((String) null, -128, -63);
        }
        field3769++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILsb;I)V", line = 393)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3772 = arg1.method1319(255) == 1;
        } else if (arg2 == 1) {
            this.field3776 = arg1.method1319(255);
        } else if (arg2 == 2) {
            this.field3783 = arg1.method1347((byte) 61);
            if (this.field3783 < 0) {
                this.field3782 = new short[this.field3776];
                for (int var5 = 0; var5 < this.field3776; var5++) {
                    this.field3782[var5] = (short) arg1.method1347((byte) 61);
                }
            }
        } else if (arg2 == 3) {
            this.field3786 = this.field3780 = arg1.method1319(255);
        } else if (arg2 == 4) {
            this.field3771 = arg1.method1319(255);
        } else if (arg2 == 5) {
            this.field3786 = arg1.method1319(arg0 ^ 0xFFFFE9CB);
        } else if (arg2 == 6) {
            this.field3780 = arg1.method1319(255);
        }
        field3773++;
        if (arg0 != -5836) {
            this.field3786 = 83;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIII)V", line = 470)
    public static final void method1859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        field3766++;
        int var7 = arg5;
        int var8 = arg4 * arg4;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = -7 % ((arg3 - 11) / 60);
        int var12 = var8 << 1;
        int var13 = arg5 << 1;
        int var14 = var8 << 2;
        int var15 = (1 - var13) * var8 + var10;
        int var16 = var9 << 2;
        int var17 = var9 - ((var13 - 1) * var12);
        int var18 = ((var6 << 1) + 3) * var10;
        int var19 = (var6 + 1) * var16;
        int var20 = ((arg5 << 1) - 3) * var12;
        if (class326.field4901 <= arg0 && class261.field3911 >= arg0) {
            int var21 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg2 + arg4);
            int var22 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg2 - arg4);
            class329.method2285(var22, class274.field4158[arg0], (byte) -100, var21, arg1);
        }
        int var23 = (arg5 - 1) * var14;
        while (var7 > 0) {
            var7--;
            if (var15 < 0) {
                while (var15 < 0) {
                    var15 += var18;
                    var18 += var16;
                    var6++;
                    var17 += var19;
                    var19 += var16;
                }
            }
            if (var17 < 0) {
                var15 += var18;
                var6++;
                var17 += var19;
                var18 += var16;
                var19 += var16;
            }
            int var24 = arg0 - var7;
            int var25 = arg0 + var7;
            var17 += -var20;
            var15 += -var23;
            var23 -= var14;
            var20 -= var14;
            if (class326.field4901 <= var25 && var24 <= class261.field3911) {
                int var26 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg2 + var6);
                int var27 = class251.method1840((byte) 107, class348.field5378, class355.field5452, arg2 - var6);
                if (class326.field4901 <= var24) {
                    class329.method2285(var27, class274.field4158[var24], (byte) 121, var26, arg1);
                }
                if (var25 <= class261.field3911) {
                    class329.method2285(var27, class274.field4158[var25], (byte) -98, var26, arg1);
                }
            }
        }
    }
}
