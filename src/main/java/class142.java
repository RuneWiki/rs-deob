import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class142 extends class110 {

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public int field2147 = 4;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "Z")
    public boolean field2146 = true;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public int field2142 = 4;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public int field2152 = 4;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
    public int field2159 = 0;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "[B")
    private byte[] field2153 = new byte[512];

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public int field2148 = 1638;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "Lea;")
    public static class235 field2156;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "Lclient;")
    public static client field2150;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "[S")
    private short[] field2151;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "[S")
    private short[] field2158;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "[[[B")
    public static byte[][][] field2157;

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 5)
    public class142() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)V", line = 16)
    public final void method47(int arg0) {
        if (arg0 != -9) {
            this.method47(-114);
        }
        this.field2153 = class321.method2204(this.field2159, 511);
        this.method1019((byte) -59);
        field2155++;
        for (int var2 = this.field2152 - 1; var2 >= 1; var2--) {
            short var3 = this.field2151[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field2152--;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBIIIII)I", line = 45)
    private final int method1018(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2145++;
        if (arg1 < 92) {
            this.field2152 = 88;
        }
        int var8 = arg4 - 4096;
        int var9 = arg2 >> 12;
        int var10 = arg2 & 0xFFF;
        int var11 = var10 - 4096;
        int var12 = var9 + 1;
        if (var12 >= arg3) {
            var12 = 0;
        }
        int var13 = var12 & 0xFF;
        int var14 = class261.field3949[var10];
        int var15 = var9 & 0xFF;
        int var16 = this.field2153[arg5 + var15] & 0x3;
        int var17;
        if (var16 <= 1) {
            var17 = var16 == 0 ? arg4 + var10 : arg4 - var10;
        } else {
            var17 = var16 == 2 ? var10 - arg4 : -arg4 + -var10;
        }
        int var18 = this.field2153[var13 + arg5] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var11 - arg4 : -arg4 + -var11;
        } else {
            var19 = var18 == 0 ? arg4 + var11 : -var11 + arg4;
        }
        int var20 = ((var19 - var17) * var14 >> 12) + var17;
        int var21 = this.field2153[var15 + arg0] & 0x3;
        int var22;
        if (var21 <= 1) {
            var22 = var21 == 0 ? var8 + var10 : var8 - var10;
        } else {
            var22 = var21 == 2 ? var10 - var8 : -var8 + -var10;
        }
        int var23 = this.field2153[arg0 + var13] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var11 - var8 : -var8 + -var11;
        } else {
            var24 = var23 == 0 ? var8 + var11 : -var11 + var8;
        }
        int var25 = ((var24 - var22) * var14 >> 12) + var22;
        return ((var25 - var20) * arg6 >> 12) + var20;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 122)
    private final void method1019(byte arg0) {
        if (this.field2148 > 0) {
            this.field2151 = new short[this.field2152];
            this.field2158 = new short[this.field2152];
            for (int var3 = 0; var3 < this.field2152; var3++) {
                this.field2151[var3] = (short) ((int) (Math.pow((double) ((float) this.field2148 / 4096.0F), (double) var3) * 4096.0D));
                this.field2158[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field2151 != null && this.field2151.length == this.field2152) {
            this.field2158 = new short[this.field2152];
            for (int var2 = 0; var2 < this.field2152; var2++) {
                this.field2158[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        field2140++;
        if (arg0 != -59) {
            this.method47(-112);
        }
    }

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)V", line = 166)
    public static void method1020(int arg0) {
        field2157 = (byte[][][]) null;
        field2156 = null;
        if (arg0 != 255) {
            field2150 = (client) null;
        }
        field2150 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILre;I)V", line = 198)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.field2146 = arg1.method1787(false) == 1;
        } else if (arg0 == 1) {
            this.field2152 = arg1.method1787(false);
        } else if (arg0 == 2) {
            this.field2148 = arg1.method1845((byte) -123);
            if (this.field2148 < 0) {
                this.field2151 = new short[this.field2152];
                for (int var5 = 0; var5 < this.field2152; var5++) {
                    this.field2151[var5] = (short) arg1.method1845((byte) -120);
                }
            }
        } else if (arg0 == 3) {
            this.field2147 = this.field2142 = arg1.method1787(false);
        } else if (arg0 == 4) {
            this.field2159 = arg1.method1787(false);
        } else if (arg0 == 5) {
            this.field2147 = arg1.method1787(false);
        } else if (arg0 == 6) {
            this.field2142 = arg1.method1787(false);
        }
        if (arg2 >= -37) {
            this.method1019((byte) 93);
        }
        field2149++;
    }

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "(I)V", line = 284)
    public static final void method1021(int arg0) {
        class189.field2818.method1360(-1);
        for (int var1 = 0; var1 < 32; var1++) {
            class58.field733[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class43.field521[var2] = 0L;
        }
        if (arg0 >= -2) {
            method1021(27);
        }
        class61.field804 = 0;
        field2154++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)[I", line = 313)
    public final int[] method46(int arg0, int arg1) {
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            this.method1022(var3, arg0 - 1, arg1);
        }
        field2144++;
        if (arg0 != 1) {
            method1021(35);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([III)V", line = 346)
    public final void method1022(int[] arg0, int arg1, int arg2) {
        field2143++;
        int var4 = class177.field2615[arg2] * this.field2142;
        if (arg1 != 0) {
            this.method46(108, -99);
        }
        if (this.field2152 == 1) {
            int var5 = this.field2158[0] << 12;
            int var6 = var4 * var5 >> 12;
            int var7 = this.field2147 * var5 >> 12;
            int var8 = var6 >> 12;
            int var9 = var6 & 0xFFF;
            int var10 = this.field2153[var8 & 0xFF] & 0xFF;
            short var11 = this.field2151[0];
            int var12 = var8 + 1;
            int var13 = class261.field3949[var9];
            int var14 = this.field2142 * var5 >> 12;
            if (var12 >= var14) {
                var12 = 0;
            }
            int var15 = this.field2153[var12 & 0xFF] & 0xFF;
            if (this.field2146) {
                for (int var16 = 0; var16 < class124.field1936; var16++) {
                    int var17 = class249.field3714[var16] * this.field2147;
                    int var18 = this.method1018(var15, (byte) 103, var5 * var17 >> 12, var7, var9, var10, var13);
                    int var19 = var11 * var18 >> 12;
                    arg0[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; var20 < class124.field1936; var20++) {
                    int var21 = class249.field3714[var20] * this.field2147;
                    int var22 = this.method1018(var15, (byte) 117, var5 * var21 >> 12, var7, var9, var10, var13);
                    arg0[var20] = var11 * var22 >> 12;
                }
            }
            return;
        }
        short var23 = this.field2151[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field2158[0] << 12;
            int var25 = this.field2147 * var24 >> 12;
            int var26 = var4 * var24 >> 12;
            int var27 = var26 >> 12;
            int var28 = var27 + 1;
            int var29 = var26 & 0xFFF;
            int var30 = this.field2142 * var24 >> 12;
            int var31 = this.field2153[var27 & 0xFF] & 0xFF;
            int var32 = class261.field3949[var29];
            if (var28 >= var30) {
                var28 = 0;
            }
            int var33 = this.field2153[var28 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class124.field1936; var34++) {
                int var35 = class249.field3714[var34] * this.field2147;
                int var36 = this.method1018(var33, (byte) 124, var24 * var35 >> 12, var25, var29, var31, var32);
                arg0[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field2152; var37++) {
            short var38 = this.field2151[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field2158[var37] << 12;
                int var40 = this.field2147 * var39 >> 12;
                int var41 = var4 * var39 >> 12;
                int var42 = var41 >> 12;
                int var43 = this.field2142 * var39 >> 12;
                int var44 = this.field2153[var42 & 0xFF] & 0xFF;
                int var45 = var42 + 1;
                if (var45 >= var43) {
                    var45 = 0;
                }
                int var46 = var41 & 0xFFF;
                int var47 = class261.field3949[var46];
                int var48 = this.field2153[var45 & 0xFF] & 0xFF;
                if (this.field2146 && this.field2152 - 1 == var37) {
                    for (int var49 = 0; var49 < class124.field1936; var49++) {
                        int var50 = class249.field3714[var49] * this.field2147;
                        int var51 = this.method1018(var48, (byte) 115, var39 * var50 >> 12, var40, var46, var44, var47);
                        int var52 = (var38 * var51 >> 12) + arg0[var49];
                        arg0[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class124.field1936; var53++) {
                        int var54 = class249.field3714[var53] * this.field2147;
                        int var55 = this.method1018(var48, (byte) 126, var39 * var54 >> 12, var40, var46, var44, var47);
                        arg0[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }
}
