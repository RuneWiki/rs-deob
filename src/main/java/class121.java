import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class121 extends class211 {

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    private int field2148 = -32768;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    private int field2139 = 0;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    private int field2157 = 0;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    private int field2179 = -1;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "Z")
    private boolean field2182 = false;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
    public int field2180;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    private int field2153;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public int field2154;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    private int field2142;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    private int field2176;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    private int field2144;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    private int field2175;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    private int field2163;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "Lna;")
    private class31 field2172;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Lcf;")
    public static class93 field2140 = class147.method1066("settings", -48);

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field2173 = 0;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "Lcf;")
    public static class93 field2177 = class147.method1066(" de votre liste d(Wamis)3", -48);

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "D")
    public double field2145;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "D")
    private double field2147;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "D")
    private double field2151;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "D")
    public double field2160;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "D")
    public double field2165;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "D")
    private double field2169;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "D")
    private double field2170;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "D")
    private double field2171;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public int field2156;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "I")
    private int field2181;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Ltg;")
    public static class181 field2141;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Lod;")
    private class91 field2152;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "[Lsj;")
    public static class49[] field2162;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)V")
    public final void method894(int arg0, byte arg1) {
        this.field2182 = true;
        if (this.field2144 == -1) {
            this.field2160 += (double) arg0 * this.field2147;
        } else {
            this.field2160 += this.field2171 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2147;
            this.field2147 += (double) arg0 * this.field2171;
        }
        this.field2165 += (double) arg0 * this.field2170;
        this.field2145 += (double) arg0 * this.field2151;
        field2166++;
        this.field2156 = (int) (Math.atan2(this.field2151, this.field2170) * 325.949D) + 1024 & 0x7FF;
        this.field2181 = (int) (Math.atan2(this.field2147, this.field2169) * 325.949D) & 0x7FF;
        int var3 = -48 % ((arg1 - 38) / 57);
        if (this.field2172 == null) {
            return;
        }
        this.field2139 += arg0;
        while (true) {
            do {
                do {
                    if (this.field2172.field486[this.field2157] >= this.field2139) {
                        return;
                    }
                    this.field2139 -= this.field2172.field486[this.field2157];
                    this.field2157++;
                    if (this.field2172.field479.length <= this.field2157) {
                        this.field2157 -= this.field2172.field489;
                        if (this.field2157 < 0 || this.field2172.field479.length <= this.field2157) {
                            this.field2157 = 0;
                        }
                    }
                    this.field2179 = this.field2157 + 1;
                } while (this.field2179 < this.field2172.field479.length);
                this.field2179 -= this.field2172.field489;
            } while (this.field2179 >= 0 && this.field2179 < this.field2172.field479.length);
            this.field2179 = -1;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static final void method895(int arg0) {
        if (class92.field1625 != null) {
            class92.field1625.method947((byte) 52);
            class92.field1625 = null;
        }
        field2143++;
        class90.method626(119);
        class267.method1788();
        for (int var1 = 0; var1 < 4; var1++) {
            class148.field2605[var1].method748(false);
        }
        class131.method960((byte) -28, false);
        System.gc();
        class92.method634(59, 2);
        if (arg0 <= 66) {
            field2140 = null;
        }
        class164.field2894 = -1;
        class254.field4599 = false;
        class94.method696(0, true);
        class229.field4111 = 0;
        class141.field2453 = false;
        class15.field188 = 0;
        class4.field52 = 0;
        class212.field3894 = 0;
        for (int var2 = 0; var2 < class44.field707.length; var2++) {
            class44.field707[var2] = null;
        }
        class252.field4543 = 0;
        class72.field1299 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class224.field4031[var3] = null;
            class72.field1301[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class155.field2709[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class109.field1858[var5][var6][var7] = null;
                }
            }
        }
        class15.method71(0);
        class180.field3177 = 0;
        class19.method86((byte) -128);
        class222.method1542((byte) -60, true);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Lcf;")
    public static final class93 method896(int arg0) {
        field2158++;
        class93 var1 = class80.field1483;
        if (class106.field1843 != 0) {
            var1 = class193.field3537;
        }
        int var2 = -59 % ((-arg0 - 13) / 58);
        class93 var3 = class178.field3144;
        if (class123.field2197 != null) {
            var3 = class130.method949((byte) -77, new class93[] { class106.field1842, class123.field2197 });
        }
        return class130.method949((byte) -77, new class93[] { class52.field848, var1, class1.field3, class148.method1067(-7015, class104.field1802), class210.field3827, class148.method1067(-7015, class276.field4943), var3, class94.field1708 });
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)I")
    public static final int method897(int arg0, int arg1, int arg2, int arg3) {
        field2159++;
        int var4 = arg3 / arg1;
        int var5 = arg2 / arg1;
        if (arg0 < 72) {
            method895(9);
        }
        int var6 = class150.method1082(var4, 109, var5);
        int var7 = arg2 & arg1 - 1;
        int var8 = class150.method1082(var4, 119, var5 + 1);
        int var9 = arg3 & arg1 - 1;
        int var10 = class150.method1082(var4 + 1, 100, var5);
        int var11 = class150.method1082(var4 + 1, 119, var5 + 1);
        int var12 = class72.method479(0, arg1, var7, var8, var6);
        int var13 = class72.method479(0, arg1, var7, var11, var10);
        return class72.method479(0, arg1, var9, var13, var12);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIBII)V")
    public final void method898(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2174++;
        if (!this.field2182) {
            double var6 = (double) (arg4 - this.field2175);
            double var8 = (double) (arg3 - this.field2176);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2145 = (double) this.field2153 * var6 / var10 + (double) this.field2175;
            this.field2165 = (double) this.field2153 * var8 / var10 + (double) this.field2176;
            this.field2160 = (double) this.field2142;
        }
        double var12 = (double) (this.field2154 + 1 - arg0);
        int var14 = -15 % ((arg2 - 41) / 43);
        this.field2170 = ((double) arg3 - this.field2165) / var12;
        this.field2151 = ((double) arg4 - this.field2145) / var12;
        this.field2169 = Math.sqrt(this.field2170 * this.field2170 + this.field2151 * this.field2151);
        if (this.field2144 == -1) {
            this.field2147 = ((double) arg1 - this.field2160) / var12;
        } else {
            if (!this.field2182) {
                this.field2147 = -this.field2169 * Math.tan((double) this.field2144 * 0.02454369D);
            }
            this.field2171 = ((double) arg1 - this.field2160 - (this.field2147 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIJILod;)V")
    public final void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class91 arg10) {
        field2178++;
        class20 var13 = this.method901(false);
        if (var13 != null) {
            var13.method106(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2152);
            this.field2148 = var13.method93();
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
    public static final void method899(int arg0) {
        if (arg0 < 100) {
            field2177 = null;
        }
        class144.field2490++;
        field2167++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2168++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()I")
    public final int method93() {
        field2146++;
        return this.field2148;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public static void method900(boolean arg0) {
        field2162 = null;
        field2177 = null;
        field2140 = null;
        if (arg0) {
            field2141 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)Lbk;")
    private final class20 method901(boolean arg0) {
        class135 var2 = class188.method1359(this.field2163, -103);
        field2161++;
        class20 var3 = var2.method984(this.field2179, (byte) 124, this.field2157, this.field2139);
        if (var3 == null) {
            return null;
        }
        if (arg0) {
            this.field2152 = null;
        }
        var3.method107(this.field2181);
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)V")
    public static final void method902(int arg0, byte arg1, int arg2) {
        if (class176.field3060 != arg0) {
            class144.field2497 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class144.field2497[var3] = (var3 << 12) / arg0;
            }
            class55.field910 = arg0 - 1;
            class176.field3060 = arg0;
            class150.field2635 = arg0 == 64 ? 2048 : 4096;
        }
        field2155++;
        if (class67.field1231 != arg2) {
            if (class176.field3060 == arg2) {
                class67.field1220 = class144.field2497;
            } else {
                class67.field1220 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class67.field1220[var4] = (var4 << 12) / arg2;
                }
            }
            class67.field1231 = arg2;
            class53.field881 = arg2 - 1;
        }
        if (arg1 != -119) {
            method896(101);
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2180 = arg5;
        this.field2182 = false;
        this.field2153 = arg8;
        this.field2150 = arg10;
        this.field2154 = arg6;
        this.field2142 = arg4;
        this.field2176 = arg3;
        this.field2164 = arg1;
        this.field2144 = arg7;
        this.field2149 = arg9;
        this.field2175 = arg2;
        this.field2163 = arg0;
        int var12 = class188.method1359(this.field2163, -106).field2352;
        if (var12 == -1) {
            this.field2172 = null;
        } else {
            this.field2172 = class131.method964(var12, true);
        }
    }
}
