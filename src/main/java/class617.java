import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class617 {

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    public int field8178;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "[B")
    private byte[] field8188;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "Z")
    public static volatile boolean field8185 = true;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "Ldb;")
    public static class298 field8191 = new class298(46, -2);

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
    public int field8182;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
    public int field8183;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
    public int field8186;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "Lna;")
    public class43 field8187;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "[I")
    public int[] field8172;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "[I")
    public int[] field8175;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "[I")
    public int[] field8176;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "[I")
    public int[] field8177;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "[I")
    public int[] field8181;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "[I")
    public int[] field8184;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "[Lna;")
    public class43[] field8179;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "[[B")
    public byte[][] field8189;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "[[I")
    public int[][] field8171;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "[[I")
    public int[][] field8190;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 11)
    public static void method3377(int arg0) {
        field8191 = null;
        if (arg0 != -2984) {
            field8191 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)Z", line = 23)
    public static final boolean method3378(int arg0, int arg1, int arg2) {
        if (arg1 <= 87) {
            method3378(-84, 100, -93);
        }
        field8174++;
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIIIBII)V", line = 44)
    public static final void method3379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field8180++;
        if (arg7 < 65) {
            field8185 = true;
        }
        if (arg2 == arg5 && arg0 == arg3 && arg6 == arg9 && arg1 == arg4) {
            class331.method1969(arg5, (byte) 113, arg8, arg1, arg9, arg3);
            return;
        }
        int var10 = arg5;
        int var11 = arg3;
        int var12 = arg5 * 3;
        int var13 = arg3 * 3;
        int var14 = arg2 * 3;
        int var15 = arg0 * 3;
        int var16 = arg6 * 3;
        int var17 = arg4 * 3;
        int var18 = var14 + arg9 - arg5 - var16;
        int var19 = arg1 + var15 - arg3 - var17;
        int var20 = var12 + var16 - var14 - var14;
        int var21 = var13 + var17 - (var15 + var15);
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg5;
            int var34 = (var28 + var30 + var32 >> 12) + arg3;
            class331.method1969(var10, (byte) 88, arg8, var34, var33, var11);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[B)V", line = 123)
    private final void method3380(int arg0, byte[] arg1) {
        field8173++;
        class335 var3 = new class335(class518.method2886(arg1, true));
        int var4 = var3.method2034(255);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field8183 = var3.method2045(-98);
        } else {
            this.field8183 = 0;
        }
        int var5 = var3.method2034(255);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field8182 = var3.method2001((byte) -83);
        int var8 = 0;
        this.field8176 = new int[this.field8182];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field8182; var10++) {
            this.field8176[var10] = var8 += var3.method2001((byte) -83);
            if (this.field8176[var10] > var9) {
                var9 = this.field8176[var10];
            }
        }
        this.field8186 = var9 + 1;
        this.field8190 = new int[this.field8186][];
        this.field8172 = new int[this.field8186];
        this.field8175 = new int[this.field8186];
        if (var7) {
            this.field8189 = new byte[this.field8186][];
        }
        this.field8177 = new int[this.field8186];
        this.field8181 = new int[this.field8186];
        if (var6) {
            this.field8184 = new int[this.field8186];
            for (int var11 = 0; var11 < this.field8186; var11++) {
                this.field8184[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field8182; var12++) {
                this.field8184[this.field8176[var12]] = var3.method2045(-98);
            }
            this.field8187 = new class43(this.field8184);
        }
        for (int var13 = 0; var13 < this.field8182; var13++) {
            this.field8172[this.field8176[var13]] = var3.method2045(-98);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field8182; var14++) {
                byte[] var15 = new byte[64];
                var3.method1985((byte) 0, 64, var15, 0);
                this.field8189[this.field8176[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field8182; var16++) {
            this.field8181[this.field8176[var16]] = var3.method2045(-98);
        }
        int var17 = 0;
        if (arg0 >= -14) {
            this.field8179 = null;
        }
        while (this.field8182 > var17) {
            this.field8177[this.field8176[var17]] = var3.method2001((byte) -83);
            var17++;
        }
        for (int var18 = 0; var18 < this.field8182; var18++) {
            int var25 = this.field8176[var18];
            int var26 = this.field8177[var25];
            int var27 = 0;
            int var28 = -1;
            this.field8190[var25] = new int[var26];
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field8190[var25][var29] = var27 += var3.method2001((byte) -83);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field8175[var25] = var28 + 1;
            if (var28 + 1 == var26) {
                this.field8190[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field8179 = new class43[var9 + 1];
        this.field8171 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field8182; var19++) {
            int var20 = this.field8176[var19];
            int var21 = this.field8177[var20];
            this.field8171[var20] = new int[this.field8175[var20]];
            for (int var22 = 0; var22 < this.field8175[var20]; var22++) {
                this.field8171[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field8190[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field8190[var20][var23];
                }
                this.field8171[var20][var24] = var3.method2045(-98);
            }
            this.field8179[var20] = new class43(this.field8171[var20]);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lkb;ILoa;)I", line = 319)
    public static final int method3381(class647 arg0, int arg1, class651 arg2) {
        field8192++;
        if (arg0.field8665 != -1) {
            return arg0.field8665;
        }
        if (arg0.field8677 != -1) {
            class364 var3 = arg2.field8808.method2760(arg2.method396() ? arg0.field8677 : arg0.field8673, arg1 ^ 0xFFFFAC98);
            if (!var3.field4930) {
                return var3.field4920;
            }
        }
        if (arg1 != -1) {
            method3379(-16, -106, 78, 56, 38, -58, 127, (byte) 65, -35, -74);
        }
        return arg0.field8675;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "([BI[B)V", line = 350)
    public class617(byte[] arg0, int arg1, byte[] arg2) {
        this.field8178 = class292.method1801((byte) -70, arg0.length, arg0);
        if (this.field8178 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field8188 = class701.method3883(0, arg0.length, true, arg0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field8188[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3380(-92, arg0);
    }
}
