import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class191 extends class107 {

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    private int field3104 = 0;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "Z")
    private boolean field3116 = true;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    private int field3108 = 4;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    private int field3103 = 4;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
    private int field3114 = 4;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    private int field3121 = 1638;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "[B")
    private byte[] field3125 = new byte[512];

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field3112 = 100;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public static int field3120 = -2;

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    public static int field3124 = 0;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
    public static int field3127 = 0;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "[Lfj;")
    public static class274[] field3113 = new class274[2048];

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "[[B")
    public static byte[][] field3128 = new byte[1000][];

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "Lgi;")
    public static class164 field3105;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "[S")
    private short[] field3117;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "[S")
    private short[] field3118;

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class191() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([IBI)V")
    private final void method1337(int[] arg0, byte arg1, int arg2) {
        int var4 = -120 / ((-10 - arg1) / 34);
        ++field3123;
        int var5 = class259.field4254[arg2] * this.field3103;
        if (this.field3114 == 1) {
            int var6 = this.field3118[0] << 12;
            short var7 = this.field3117[0];
            int var8 = this.field3103 * var6 >> 12;
            int var9 = var5 * var6 >> 12;
            int var10 = this.field3108 * var6 >> 12;
            int var11 = var9 >> 12;
            int var12 = var11 - -1;
            if (~var12 <= ~var8) {
                var12 = 0;
            }
            int var13 = this.field3125[var11 & 255] & 255;
            int var14 = var9 & 4095;
            int var15 = 255 & this.field3125[var12 & 255];
            int var16 = class82.field1324[var14];
            if (!this.field3116) {
                for (int var17 = 0; class24.field443 > var17; ++var17) {
                    int var18 = class221.field3486[var17] * this.field3108;
                    int var19 = this.method1340(-73, var16, var13, var15, var14, var10, var6 * var18 >> 12);
                    arg0[var17] = var7 * var19 >> 12;
                }
            } else {
                for (int var20 = 0; ~var20 > ~class24.field443; ++var20) {
                    int var21 = class221.field3486[var20] * this.field3108;
                    int var22 = this.method1340(-123, var16, var13, var15, var14, var10, var6 * var21 >> 12);
                    int var23 = var7 * var22 >> 12;
                    arg0[var20] = (var23 >> 1) + 2048;
                }
            }
        } else {
            short var24 = this.field3117[0];
            if (~var24 < -9 || var24 < -8) {
                int var25 = this.field3118[0] << 12;
                int var26 = this.field3108 * var25 >> 12;
                int var27 = var5 * var25 >> 12;
                int var28 = var27 >> 12;
                int var29 = var27 & 4095;
                int var30 = class82.field1324[var29];
                int var31 = var28 - -1;
                int var32 = this.field3103 * var25 >> 12;
                int var33 = this.field3125[255 & var28] & 255;
                if (var31 >= var32) {
                    var31 = 0;
                }
                int var34 = this.field3125[var31 & 255] & 255;
                for (int var35 = 0; ~var35 > ~class24.field443; ++var35) {
                    int var55 = class221.field3486[var35] * this.field3108;
                    int var56 = this.method1340(-82, var30, var33, var34, var29, var26, var25 * var55 >> 12);
                    arg0[var35] = var24 * var56 >> 12;
                }
            }
            for (int var36 = 1; ~this.field3114 < ~var36; ++var36) {
                short var37 = this.field3117[var36];
                if (var37 > 8 || ~var37 > 7) {
                    int var38 = this.field3118[var36] << 12;
                    int var39 = this.field3108 * var38 >> 12;
                    int var40 = var5 * var38 >> 12;
                    int var41 = var40 >> 12;
                    int var42 = var40 & 4095;
                    int var43 = var41 + 1;
                    int var44 = class82.field1324[var42];
                    int var45 = 255 & this.field3125[var41 & 255];
                    int var46 = this.field3103 * var38 >> 12;
                    if (~var46 >= ~var43) {
                        var43 = 0;
                    }
                    int var47 = this.field3125[var43 & 255] & 255;
                    if (this.field3116 && ~(this.field3114 + -1) == ~var36) {
                        for (int var48 = 0; class24.field443 > var48; ++var48) {
                            int var49 = class221.field3486[var48] * this.field3108;
                            int var50 = this.method1340(-78, var44, var45, var47, var42, var39, var38 * var49 >> 12);
                            int var51 = (var37 * var50 >> 12) + arg0[var48];
                            arg0[var48] = (var51 >> 1) + 2048;
                        }
                    } else {
                        for (int var52 = 0; var52 < class24.field443; ++var52) {
                            int var53 = class221.field3486[var52] * this.field3108;
                            int var54 = this.method1340(-112, var44, var45, var47, var42, var39, var38 * var53 >> 12);
                            arg0[var52] += var37 * var54 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field3115;
        int var3 = 112 % ((arg0 - -34) / 49);
        int[] var4 = super.field1661.method894(-13, arg1);
        if (super.field1661.field2115) {
            this.method1337(var4, (byte) -112, arg1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
    private final void method1338(int arg0) {
        if (~this.field3121 >= -1) {
            if (this.field3117 != null && ~this.field3117.length == ~this.field3114) {
                this.field3118 = new short[this.field3114];
                for (int var2 = 0; this.field3114 > var2; ++var2) {
                    this.field3118[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field3117 = new short[this.field3114];
            this.field3118 = new short[this.field3114];
            for (int var3 = 0; this.field3114 > var3; ++var3) {
                this.field3117[var3] = (short) ((int) (Math.pow((double) ((float) this.field3121 / 4096.0F), (double) var3) * 4096.0D));
                this.field3118[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 < 100) {
            field3124 = 80;
        }
        ++field3107;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BZ)V")
    public static final void method1339(byte arg0, boolean arg1) {
        ++field3110;
        int var2 = -86 % ((-33 - arg0) / 58);
        class24.field442 = arg1;
        class230.field3608 = !class143.method981(22351);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIII)I")
    private final int method1340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3126;
        int var8 = arg4 - 4096;
        int var9 = arg6 >> 12;
        int var10 = var9 + 1;
        int var11 = arg6 & 4095;
        if (~arg5 >= ~var10) {
            var10 = 0;
        }
        int var12 = var9 & 255;
        int var13 = class82.field1324[var11];
        int var14 = 3 & this.field3125[arg2 + var12];
        int var15;
        if (var14 > 1) {
            var15 = ~var14 == -3 ? -arg4 + var11 : -var11 - arg4;
        } else {
            var15 = ~var14 != -1 ? -var11 + arg4 : arg4 + var11;
        }
        int var16 = var10 & 255;
        int var17 = var11 - 4096;
        int var18 = 3 & this.field3125[arg2 + var16];
        int var19;
        if (~var18 < -2) {
            var19 = ~var18 == -3 ? -arg4 + var17 : -var17 - arg4;
        } else {
            var19 = ~var18 == -1 ? arg4 + var17 : -var17 + arg4;
        }
        int var20 = ((var19 - var15) * var13 >> 12) + var15;
        int var21 = 3 & this.field3125[arg3 + var12];
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? -var8 + var11 : -var8 + -var11;
        } else {
            var22 = ~var21 != -1 ? -var11 + var8 : var8 + var11;
        }
        int var23 = 3 & this.field3125[var16 - -arg3];
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var17 - var8 : -var17 - var8;
        } else {
            var24 = var23 != 0 ? -var17 + var8 : var8 + var17;
        }
        int var25 = ((-var22 + var24) * var13 >> 12) + var22;
        return arg0 > -71 ? -81 : ((-var20 + var25) * arg1 >> 12) + var20;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method1341(int arg0, int arg1, boolean arg2) {
        if (arg0 <= 40) {
            method1342(-33);
        }
        ++field3109;
        return arg2 && ~arg1 <= -1 ? class170.method1205(arg2, (byte) -121, 10, arg1) : Integer.toString(arg1);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field3119;
        if (arg2 == 28) {
            if (arg0 != 0) {
                if (arg0 == 1) {
                    this.field3114 = arg1.method1849(255);
                } else {
                    if (~arg0 != -3) {
                        if (~arg0 == -4) {
                            this.field3108 = this.field3103 = arg1.method1849(arg2 + 227);
                            return;
                        }
                        if (arg0 == 4) {
                            this.field3104 = arg1.method1849(arg2 + 227);
                            return;
                        }
                        if (arg0 == 5) {
                            this.field3108 = arg1.method1849(255);
                            return;
                        }
                        if (arg0 == 6) {
                            this.field3103 = arg1.method1849(255);
                            return;
                        }
                    } else {
                        this.field3121 = arg1.method1847(-404);
                        if (~this.field3121 > -1) {
                            this.field3117 = new short[this.field3114];
                            for (int var5 = 0; this.field3114 > var5; ++var5) {
                                this.field3117[var5] = (short) arg1.method1847(-404);
                            }
                            return;
                        }
                    }
                }
            } else {
                this.field3116 = ~arg1.method1849(arg2 + 227) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
    public static void method1342(int arg0) {
        field3128 = null;
        if (arg0 == -3) {
            field3105 = null;
            field3113 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        this.field3125 = class169.method1202((byte) 60, this.field3104);
        this.method1338(123);
        ++field3122;
        if (arg0 != 35) {
            this.method300((byte) -108);
        }
        for (int var2 = this.field3114 + -1; var2 >= 1; --var2) {
            short var3 = this.field3117[var2];
            if (var3 > 8 || ~var3 > 7) {
                return;
            }
            --this.field3114;
        }
    }
}
