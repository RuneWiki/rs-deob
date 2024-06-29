import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class189 extends class273 {

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "[S")
    private short[] field3341 = new short[257];

    @OriginalMember(owner = "client!ij", name = "fb", descriptor = "I")
    private int field3352 = 0;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "S")
    public static short field3342 = 1;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field3340 = 0;

    @OriginalMember(owner = "client!ij", name = "db", descriptor = "[I")
    public static int[] field3350 = new int[32768];

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "[I")
    public static int[] field3346 = new int[100];

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "Ljd;")
    public static class86 field3347 = class122.method868("loginscreen", true);

    @OriginalMember(owner = "client!ij", name = "ib", descriptor = "Ljd;")
    public static class86 field3355 = class122.method868("Update)2Liste geladen)3", true);

    @OriginalMember(owner = "client!ij", name = "pb", descriptor = "Ljd;")
    public static class86 field3362 = class122.method868("", true);

    @OriginalMember(owner = "client!ij", name = "qb", descriptor = "Ljd;")
    public static class86 field3363 = class122.method868("Spielwelt erstellt)3", true);

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ij", name = "cb", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!ij", name = "gb", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!ij", name = "hb", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ij", name = "jb", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ij", name = "kb", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ij", name = "lb", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!ij", name = "mb", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!ij", name = "ob", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "Lbj;")
    public static class151 field3345;

    @OriginalMember(owner = "client!ij", name = "bb", descriptor = "Lbj;")
    public static class151 field3348;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "[I")
    private int[] field3343;

    @OriginalMember(owner = "client!ij", name = "nb", descriptor = "[I")
    private int[] field3360;

    @OriginalMember(owner = "client!ij", name = "eb", descriptor = "[[I")
    private int[][] field3351;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V")
    public static final void method1297(int arg0) {
        ++field3358;
        int var1 = 15 % ((-19 - arg0) / 52);
        for (class162 var2 = (class162) class229.field4158.method1737((byte) 74); var2 != null; var2 = (class162) class229.field4158.method1740(-8843)) {
            if (~var2.field3036 < -1) {
                --var2.field3036;
            }
            if (~var2.field3036 == -1) {
                if (var2.field3034 < 0 || class77.method547((byte) -86, var2.field3034, var2.field3050)) {
                    class200.method1430(var2.field3032, var2.field3041, var2.field3050, var2.field3034, var2.field3055, 102, var2.field3052, var2.field3033);
                    var2.method1477(1);
                }
            } else {
                if (var2.field3044 > 0) {
                    --var2.field3044;
                }
                if (~var2.field3044 == -1 && ~var2.field3055 <= -2 && ~var2.field3041 <= -2 && ~var2.field3055 >= -103 && var2.field3041 <= 102 && (~var2.field3043 > -1 || class77.method547((byte) -113, var2.field3043, var2.field3046))) {
                    class200.method1430(var2.field3049, var2.field3041, var2.field3046, var2.field3043, var2.field3055, 102, var2.field3052, var2.field3033);
                    var2.field3044 = -1;
                    if (var2.field3043 == var2.field3034 && ~var2.field3034 == 0) {
                        var2.method1477(1);
                    } else if (var2.field3043 == var2.field3034 && var2.field3049 == var2.field3032 && var2.field3050 == var2.field3046) {
                        var2.method1477(1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)I")
    public static final int method1298(int arg0, int arg1) {
        if (arg0 != 9651) {
            return 83;
        } else {
            ++field3349;
            return arg1 & 255;
        }
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(B)V")
    private final void method1299(byte arg0) {
        ++field3359;
        int[] var2 = this.field3351[1];
        int[] var3 = this.field3351[this.field3351.length + -2];
        int[] var4 = this.field3351[0];
        int[] var5 = this.field3351[this.field3351.length + -1];
        this.field3343 = new int[] { var4[0] - -var4[0] + -var2[0], var4[1] + var4[1] - var2[1] };
        if (arg0 > 0) {
            this.field3352 = -60;
        }
        this.field3360 = new int[] { var3[0] - var5[0] + var3[0], var3[1] - (var5[1] + -var3[1]) };
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)[I")
    private final int[] method1300(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field3356;
            if (~arg0 > -1) {
                return this.field3343;
            } else {
                return ~arg0 <= ~this.field3351.length ? this.field3360 : this.field3351[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field3357;
        if (arg0 != -7420) {
            return null;
        } else {
            int[] var3 = super.field4800.method1224(arg1, 0);
            if (super.field4800.field3160) {
                int[] var4 = this.method1863(-125, 0, arg1);
                for (int var5 = 0; ~var5 > ~class176.field3200; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (var6 > 256) {
                        var6 = 256;
                    }
                    var3[var5] = this.field3341[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class189() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field3352 = arg1.method1408((byte) -65);
            this.field3351 = new int[arg1.method1408((byte) -85)][2];
            for (int var4 = 0; var4 < this.field3351.length; ++var4) {
                this.field3351[var4][0] = arg1.method1410(-117);
                this.field3351[var4][1] = arg1.method1410(-64);
            }
        }
        ++field3353;
        if (arg2 > -16) {
            field3345 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        if (arg0 == 4095) {
            ++field3344;
            if (this.field3351 == null) {
                this.field3351 = new int[][] { new int[2], { 4096, 4096 } };
            }
            if (this.field3351.length < 2) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (this.field3352 == 2) {
                    this.method1299((byte) -109);
                }
                class144.method1022((byte) -124);
                this.method1301(arg0 + 218534989);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V")
    private final void method1301(int arg0) {
        int var2 = this.field3352;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field3351.length + -1) < ~var5 && this.field3351[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field3351[var5 - 1];
                    int[] var7 = this.field3351[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                    int var9 = -class237.field4277[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field3341[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field3351.length + -1) && this.field3351[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field3351[var14];
                    int[] var16 = this.field3351[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field3341[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field3351.length + -1) < ~var22 && ~this.field3351[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field3351[var22 + -1];
                int[] var24 = this.field3351[var22];
                int var25 = this.method1300(var22 + -2, true)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method1300(var22 + 1, true)[1];
                int var29 = -var25 + var27 + var28 + -var26;
                int var30 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var31 = -var27 + var25 - var29;
                int var32 = var26 - var25;
                int var34 = var30 * var32 >> 12;
                int var35 = var30 * var30 >> 12;
                int var36 = (var29 * var30 >> 12) * var35 >> 12;
                int var37 = var31 * var35 >> 12;
                int var38 = var34 - -var27 + var36 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3341[var20] = (short) var38;
            }
        }
        if (arg0 != 218539084) {
            this.method1301(13);
        }
        ++field3361;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static void method1302(boolean arg0) {
        field3345 = null;
        field3346 = null;
        field3363 = null;
        field3347 = null;
        if (!arg0) {
            field3362 = null;
        }
        field3348 = null;
        field3355 = null;
        field3362 = null;
        field3350 = null;
    }
}
