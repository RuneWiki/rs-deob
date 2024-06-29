import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class303 extends class283 {

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    private int field5216 = 0;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    private int field5217 = 0;

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "I")
    private int field5220 = 0;

    @OriginalMember(owner = "client!hk", name = "db", descriptor = "Lna;")
    public static class26 field5226 = class69.method505("::wm3", (byte) -118);

    @OriginalMember(owner = "client!hk", name = "eb", descriptor = "Z")
    public static boolean field5227 = true;

    @OriginalMember(owner = "client!hk", name = "fb", descriptor = "[I")
    public static int[] field5228 = new int[25];

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "Lih;")
    public static class32 field5219 = new class32();

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    private int field5213;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!hk", name = "Z", descriptor = "I")
    private int field5222;

    @OriginalMember(owner = "client!hk", name = "ab", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
    private int field5225;

    @OriginalMember(owner = "client!hk", name = "gb", descriptor = "I")
    private int field5229;

    @OriginalMember(owner = "client!hk", name = "hb", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!hk", name = "ib", descriptor = "I")
    private int field5231;

    @OriginalMember(owner = "client!hk", name = "jb", descriptor = "I")
    private int field5232;

    @OriginalMember(owner = "client!hk", name = "bb", descriptor = "[I")
    public static int[] field5224;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILwa;Z)V", line = 19)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field5216 = arg1.method626((byte) 18);
        } else if (arg0 == 1) {
            this.field5220 = (arg1.method599(false) << 12) / 100;
        } else if (arg0 == 2) {
            this.field5217 = (arg1.method599(false) << 12) / 100;
        }
        field5223++;
        if (!arg2) {
            this.method2131((byte) -79, -114, 127, 95);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V", line = 56)
    private final void method2130(int arg0, int arg1, int arg2, int arg3) {
        field5214++;
        int var5 = 32 / ((15 - arg2) / 45);
        int var6 = arg0 <= 2048 ? (arg1 + 4096) * arg0 >> 12 : arg0 + arg1 - (arg0 * arg1 >> 12);
        if (var6 <= 0) {
            this.field5229 = this.field5213 = this.field5225 = arg0;
            return;
        }
        int var7 = arg3 * 6;
        int var8 = arg0 + arg0 - var6;
        int var9 = var7 >> 12;
        int var10 = (var6 - var8 << 12) / var6;
        int var11 = var7 - (var9 << 12);
        int var13 = var10 * var6 >> 12;
        int var14 = var11 * var13 >> 12;
        int var15 = var8 + var14;
        int var16 = var6 - var14;
        if (var9 == 0) {
            this.field5225 = var8;
            this.field5229 = var6;
            this.field5213 = var15;
        } else if (var9 == 1) {
            this.field5225 = var8;
            this.field5213 = var6;
            this.field5229 = var16;
        } else if (var9 == 2) {
            this.field5229 = var8;
            this.field5213 = var6;
            this.field5225 = var15;
        } else if (var9 == 3) {
            this.field5213 = var16;
            this.field5225 = var6;
            this.field5229 = var8;
        } else if (var9 == 4) {
            this.field5225 = var6;
            this.field5229 = var15;
            this.field5213 = var8;
        } else if (var9 == 5) {
            this.field5213 = var8;
            this.field5229 = var6;
            this.field5225 = var16;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 167)
    public class303() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BIII)V", line = 173)
    private final void method2131(byte arg0, int arg1, int arg2, int arg3) {
        field5215++;
        int var5 = arg1 > arg2 ? arg1 : arg2;
        if (arg0 >= -54) {
            this.method3(38, -39);
        }
        int var6 = arg3 <= var5 ? var5 : arg3;
        int var7 = arg2 > arg1 ? arg1 : arg2;
        int var8 = arg3 >= var7 ? var7 : arg3;
        int var9 = var6 - var8;
        if (var9 > 0) {
            int var10 = (var6 - arg2 << 12) / var9;
            int var11 = (var6 - arg1 << 12) / var9;
            int var12 = (var6 - arg3 << 12) / var9;
            if (arg1 == var6) {
                this.field5222 = arg2 == var8 ? var12 + 20480 : -var10 + 4096;
            } else if (arg2 == var6) {
                this.field5222 = arg3 == var8 ? var11 + 4096 : -var12 + 12288;
            } else {
                this.field5222 = arg1 == var8 ? var10 + 12288 : -var11 + 20480;
            }
            this.field5222 /= 6;
        } else {
            this.field5222 = 0;
        }
        this.field5231 = (var8 + var6) / 2;
        if (this.field5231 > 0 && this.field5231 < 4096) {
            this.field5232 = (var9 << 12) / (this.field5231 > 2048 ? 8192 - this.field5231 * 2 : this.field5231 * 2);
        } else {
            this.field5232 = 0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[[I", line = 251)
    public final int[][] method3(int arg0, int arg1) {
        field5218++;
        if (arg0 != -1) {
            field5226 = (class26) null;
        }
        int[][] var3 = this.field4719.method2182((byte) -118, arg1);
        if (this.field4719.field5381) {
            int[][] var4 = this.method1994(arg1, 0, (byte) -72);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class101.field1632; var11++) {
                this.method2131((byte) -91, var5[var11], var6[var11], var7[var11]);
                this.field5231 += this.field5217;
                if (this.field5231 < 0) {
                    this.field5231 = 0;
                }
                this.field5232 += this.field5220;
                if (this.field5231 > 4096) {
                    this.field5231 = 4096;
                }
                if (this.field5232 < 0) {
                    this.field5232 = 0;
                }
                if (this.field5232 > 4096) {
                    this.field5232 = 4096;
                }
                for (this.field5222 += this.field5216; this.field5222 < 0; this.field5222 += 4096) {
                }
                while (this.field5222 > 4096) {
                    this.field5222 -= 4096;
                }
                this.method2130(this.field5231, this.field5232, 107, this.field5222);
                var10[var11] = this.field5229;
                var8[var11] = this.field5213;
                var9[var11] = this.field5225;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(B)V", line = 327)
    public static void method2132(byte arg0) {
        field5224 = null;
        field5219 = null;
        if (arg0 <= 38) {
            field5224 = (int[]) null;
        }
        field5228 = null;
        field5226 = null;
    }
}
