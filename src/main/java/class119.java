import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class119 extends class175 {

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    private int field2210 = 0;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    private int field2208 = 20;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    private int field2207 = 0;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    private int field2206 = 1365;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "Z")
    public static volatile boolean field2203 = true;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "Luc;")
    public static class11 field2211 = new class11(50);

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    public static int field2212 = 10;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "Z")
    public static boolean field2213 = false;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "Lmb;")
    public static class96 field2216 = class243.method1708("::", (byte) 108);

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "Lff;")
    public static class3 field2215;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field2210 = arg2.method1663((byte) -113);
                    }
                } else {
                    this.field2207 = arg2.method1663((byte) -46);
                }
            } else {
                this.field2208 = arg2.method1663((byte) 75);
            }
        } else {
            this.field2206 = arg2.method1663((byte) 71);
        }
        int var5 = -93 % ((arg0 - -22) / 58);
        ++field2209;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(BI)Lpc;")
    public static final class253 method920(byte arg0, int arg1) {
        ++field2202;
        class253 var2 = (class253) class229.field3921.method158((long) arg1, (byte) -118);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class61.field1045.method23(arg1, 103, 11);
            class253 var4 = new class253();
            if (arg0 != -52) {
                field2216 = null;
            }
            if (var3 != null) {
                var4.method1763(new class239(var3), (byte) 49);
            }
            class229.field3921.method155((long) arg1, var4, (byte) 67);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(BI)I")
    public static final int method921(byte arg0, int arg1) {
        ++field2214;
        int var2 = (arg1 >>> 1 & 1431655765) + (arg1 & 1431655765);
        int var3 = 53 % ((arg0 - -6) / 59);
        int var4 = (858993459 & var2) - -(-1288490189 & var2 >>> 2);
        int var5 = 252645135 & (var4 >>> 4) + var4;
        int var6 = (var5 >>> 8) + var5;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 255;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class119() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBIIIII)V")
    public static final void method922(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -arg3 + arg4;
        ++field2204;
        int var8 = arg0 - -arg3;
        int var9 = -arg3 + arg5;
        int var10 = arg3 + arg6;
        for (int var11 = arg0; var11 < var8; ++var11) {
            class36.method283(arg6, class229.field3939[var11], arg5, (byte) -101, arg2);
        }
        for (int var12 = arg4; var7 < var12; --var12) {
            class36.method283(arg6, class229.field3939[var12], arg5, (byte) -106, arg2);
        }
        if (arg1 != 106) {
            method920((byte) -20, 85);
        }
        for (int var13 = var8; ~var7 <= ~var13; ++var13) {
            int[] var14 = class229.field3939[var13];
            class36.method283(arg6, var14, var10, (byte) -124, arg2);
            class36.method283(var9, var14, arg5, (byte) -128, arg2);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
    public static void method923(boolean arg0) {
        field2215 = null;
        field2211 = null;
        if (!arg0) {
            field2216 = null;
        }
        field2216 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int var3 = 44 / ((62 - arg0) / 54);
        ++field2205;
        int[] var4 = super.field3044.method904((byte) 83, arg1);
        if (super.field3044.field2150) {
            for (int var5 = 0; ~var5 > ~class1.field11; ++var5) {
                int var6 = (class244.field4240[var5] << 12) / this.field2206 + this.field2207;
                int var7 = (class23.field395[arg1] << 12) / this.field2206 - -this.field2210;
                int var8 = var6;
                int var9 = var7;
                int var10 = var7;
                int var11 = var6;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                int var14 = var7 * var7 >> 12;
                while (~(var12 + var14) > -16385 && ~var13 > ~this.field2208) {
                    var10 = (var10 * var11 >> 12) * 2 - -var9;
                    ++var13;
                    var11 = var8 + var12 - var14;
                    var14 = var10 * var10 >> 12;
                    var12 = var11 * var11 >> 12;
                }
                var4[var5] = var13 < this.field2208 + -1 ? (var13 << 12) / this.field2208 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method924(int arg0, int arg1, int arg2, long arg3) {
        class187 var5 = class259.field4487[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3281 != null && var5.field3281.field309 == arg3) {
            return true;
        } else if (var5.field3269 != null && var5.field3269.field1766 == arg3) {
            return true;
        } else if (var5.field3279 != null && var5.field3279.field111 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3282; ++var6) {
                if (var5.field3274[var6].field1197 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
