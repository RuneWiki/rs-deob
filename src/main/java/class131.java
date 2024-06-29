import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class131 extends class240 {

    @OriginalMember(owner = "client!la", name = "R", descriptor = "Z")
    public boolean field2321 = true;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "I")
    public int field2325 = 1638;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public int field2323 = 0;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public int field2326 = 4;

    @OriginalMember(owner = "client!la", name = "rb", descriptor = "[B")
    private byte[] field2347 = new byte[512];

    @OriginalMember(owner = "client!la", name = "qb", descriptor = "I")
    public int field2346 = 4;

    @OriginalMember(owner = "client!la", name = "pb", descriptor = "I")
    public int field2345 = 4;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "I")
    public static int field2328 = 50;

    @OriginalMember(owner = "client!la", name = "hb", descriptor = "[I")
    public static int[] field2337 = new int[128];

    @OriginalMember(owner = "client!la", name = "db", descriptor = "I")
    public static int field2333 = 0;

    @OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!la", name = "jb", descriptor = "[[[I")
    public static int[][][] field2339 = new int[4][13][13];

    @OriginalMember(owner = "client!la", name = "lb", descriptor = "Lcd;")
    private static class64 field2341 = class44.method335((byte) 71, "Loaded input handler");

    @OriginalMember(owner = "client!la", name = "P", descriptor = "Lcd;")
    public static class64 field2319 = field2341;

    @OriginalMember(owner = "client!la", name = "ob", descriptor = "I")
    public static int field2344 = 2;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!la", name = "gb", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!la", name = "ib", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!la", name = "kb", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!la", name = "mb", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!la", name = "nb", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "Lg;")
    public static class151 field2324;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "[I")
    public static int[] field2318;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "[Ldb;")
    public static class175[] field2332;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "[S")
    private short[] field2329;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "[S")
    private short[] field2331;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(I)V", line = 7)
    public final void method288(int arg0) {
        this.field2347 = class252.method1806(this.field2323, arg0 ^ 0x4593);
        field2338++;
        if (arg0 != 17772) {
            return;
        }
        this.method940(false);
        for (int var2 = this.field2326 - 1; var2 >= 1; var2--) {
            short var3 = this.field2329[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field2326--;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILkh;)V", line = 38)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg0 != 2) {
            this.method944(-91, (int[]) null, (byte) 36);
        }
        field2342++;
        if (arg1 == 0) {
            this.field2321 = arg2.method152((byte) -128) == 1;
        } else if (arg1 == 1) {
            this.field2326 = arg2.method152((byte) -82);
        } else if (arg1 == 2) {
            this.field2325 = arg2.method153(-73);
            if (this.field2325 < 0) {
                this.field2329 = new short[this.field2326];
                for (int var5 = 0; var5 < this.field2326; var5++) {
                    this.field2329[var5] = (short) arg2.method153(-117);
                }
            }
        } else if (arg1 == 3) {
            this.field2346 = this.field2345 = arg2.method152((byte) -123);
        } else if (arg1 == 4) {
            this.field2323 = arg2.method152((byte) -113);
        } else if (arg1 == 5) {
            this.field2346 = arg2.method152((byte) -126);
        } else if (arg1 == 6) {
            this.field2345 = arg2.method152((byte) -69);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 135)
    private final void method940(boolean arg0) {
        if (arg0) {
            return;
        }
        field2334++;
        if (this.field2325 > 0) {
            this.field2331 = new short[this.field2326];
            this.field2329 = new short[this.field2326];
            for (int var3 = 0; var3 < this.field2326; var3++) {
                this.field2329[var3] = (short) ((int) (Math.pow((double) ((float) this.field2325 / 4096.0F), (double) var3) * 4096.0D));
                this.field2331[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field2329 != null && this.field2329.length == this.field2326) {
            this.field2331 = new short[this.field2326];
            for (int var2 = 0; var2 < this.field2326; var2++) {
                this.field2331[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V", line = 298)
    public class131() {
        super(0, true);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)[I", line = 219)
    public final int[] method12(int arg0, int arg1) {
        field2340++;
        int[] var3 = this.field4094.method179(arg1, true);
        if (arg0 != 64) {
            method942(-74);
        }
        if (this.field4094.field344) {
            this.method944(arg1, var3, (byte) 121);
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILa;La;IIJ)V", line = 245)
    public static final void method941(int arg0, int arg1, int arg2, int arg3, class262 arg4, class262 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class162 var10 = new class162();
        var10.field2848 = arg8;
        var10.field2854 = arg1 * 128 + 64;
        var10.field2849 = arg2 * 128 + 64;
        var10.field2846 = arg3;
        var10.field2852 = arg4;
        var10.field2842 = arg5;
        var10.field2851 = arg6;
        var10.field2840 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class304.field5203[var11][arg1][arg2] == null) {
                class304.field5203[var11][arg1][arg2] = new class295(var11, arg1, arg2);
            }
        }
        class304.field5203[arg0][arg1][arg2].field5092 = var10;
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)V", line = 281)
    public static void method942(int arg0) {
        int var1 = 127 % ((59 - arg0) / 57);
        field2341 = null;
        field2337 = null;
        field2332 = null;
        field2324 = null;
        field2319 = null;
        field2339 = (int[][][]) null;
        field2318 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIBII)I", line = 302)
    private final int method943(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field2330++;
        int var8 = arg2 - 4096;
        int var9 = arg3 >> 12;
        int var10 = var9 + 1;
        int var11 = var9 & 0xFF;
        int var12 = arg3 & 0xFFF;
        int var13 = var12 - 4096;
        if (arg4 < 11) {
            return -67;
        }
        int var14 = class162.field2844[var12];
        int var15 = this.field2347[arg5 + var11] & 0x3;
        if (arg0 <= var10) {
            var10 = 0;
        }
        int var16 = var10 & 0xFF;
        int var17;
        if (var15 > 1) {
            var17 = var15 == 2 ? var12 - arg2 : -arg2 + -var12;
        } else {
            var17 = var15 == 0 ? arg2 + var12 : -var12 + arg2;
        }
        int var18 = this.field2347[arg5 + var16] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var13 - arg2 : -arg2 + -var13;
        } else {
            var19 = var18 == 0 ? arg2 + var13 : -var13 + arg2;
        }
        int var20 = this.field2347[var11 + arg6] & 0x3;
        int var21 = ((var19 - var17) * var14 >> 12) + var17;
        int var22;
        if (var20 <= 1) {
            var22 = var20 == 0 ? var8 + var12 : -var12 + var8;
        } else {
            var22 = var20 == 2 ? var12 - var8 : -var8 + -var12;
        }
        int var23 = this.field2347[arg6 + var16] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var13 - var8 : -var8 + -var13;
        } else {
            var24 = var23 == 0 ? var8 + var13 : -var13 + var8;
        }
        int var25 = ((var24 - var22) * var14 >> 12) + var22;
        return ((var25 - var21) * arg1 >> 12) + var21;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[IB)V", line = 377)
    public final void method944(int arg0, int[] arg1, byte arg2) {
        field2343++;
        int var4 = class268.field4615[arg0] * this.field2345;
        if (arg2 <= 97) {
            this.method16(-123, 103, (class13) null);
        }
        if (this.field2326 == 1) {
            short var5 = this.field2329[0];
            int var6 = this.field2331[0] << 12;
            int var7 = this.field2345 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = var8 >> 12;
            int var10 = this.field2346 * var6 >> 12;
            int var11 = this.field2347[var9 & 0xFF] & 0xFF;
            int var12 = var8 & 0xFFF;
            int var13 = var9 + 1;
            if (var13 >= var7) {
                var13 = 0;
            }
            int var14 = this.field2347[var13 & 0xFF] & 0xFF;
            int var15 = class162.field2844[var12];
            if (this.field2321) {
                for (int var16 = 0; var16 < class169.field2936; var16++) {
                    int var17 = class74.field1408[var16] * this.field2346;
                    int var18 = this.method943(var10, var15, var12, var6 * var17 >> 12, (byte) 29, var11, var14);
                    int var19 = var5 * var18 >> 12;
                    arg1[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; var20 < class169.field2936; var20++) {
                    int var21 = class74.field1408[var20] * this.field2346;
                    int var22 = this.method943(var10, var15, var12, var6 * var21 >> 12, (byte) 84, var11, var14);
                    arg1[var20] = var5 * var22 >> 12;
                }
            }
            return;
        }
        short var23 = this.field2329[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field2331[0] << 12;
            int var25 = this.field2345 * var24 >> 12;
            int var26 = var4 * var24 >> 12;
            int var27 = this.field2346 * var24 >> 12;
            int var28 = var26 >> 12;
            int var29 = var26 & 0xFFF;
            int var30 = this.field2347[var28 & 0xFF] & 0xFF;
            int var31 = var28 + 1;
            if (var31 >= var25) {
                var31 = 0;
            }
            int var32 = this.field2347[var31 & 0xFF] & 0xFF;
            int var33 = class162.field2844[var29];
            for (int var34 = 0; var34 < class169.field2936; var34++) {
                int var35 = class74.field1408[var34] * this.field2346;
                int var36 = this.method943(var27, var33, var29, var24 * var35 >> 12, (byte) 117, var30, var32);
                arg1[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field2326; var37++) {
            short var38 = this.field2329[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field2331[var37] << 12;
                int var40 = this.field2345 * var39 >> 12;
                int var41 = var4 * var39 >> 12;
                int var42 = this.field2346 * var39 >> 12;
                int var43 = var41 >> 12;
                int var44 = var41 & 0xFFF;
                int var45 = class162.field2844[var44];
                int var46 = var43 + 1;
                if (var40 <= var46) {
                    var46 = 0;
                }
                int var47 = this.field2347[var43 & 0xFF] & 0xFF;
                int var48 = this.field2347[var46 & 0xFF] & 0xFF;
                if (this.field2321 && this.field2326 - 1 == var37) {
                    for (int var49 = 0; var49 < class169.field2936; var49++) {
                        int var50 = class74.field1408[var49] * this.field2346;
                        int var51 = this.method943(var42, var45, var44, var39 * var50 >> 12, (byte) 119, var47, var48);
                        int var52 = (var38 * var51 >> 12) + arg1[var49];
                        arg1[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class169.field2936; var53++) {
                        int var54 = class74.field1408[var53] * this.field2346;
                        int var55 = this.method943(var42, var45, var44, var39 * var54 >> 12, (byte) 46, var47, var48);
                        arg1[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IBI)I", line = 551)
    public static final int method945(int arg0, byte arg1, int arg2) {
        field2327++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg0 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 <= 90) {
            field2318 = (int[]) null;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }
}
