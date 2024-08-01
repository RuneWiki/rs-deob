import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("m")
public class class112 extends class85 {

    @OriginalMember(owner = "m", name = "T", descriptor = "I")
    private int field2216 = 0;

    @OriginalMember(owner = "m", name = "bb", descriptor = "I")
    private int field2224 = 0;

    @OriginalMember(owner = "m", name = "gb", descriptor = "I")
    private int field2229 = 0;

    @OriginalMember(owner = "m", name = "V", descriptor = "Z")
    public static boolean field2218 = true;

    @OriginalMember(owner = "m", name = "ab", descriptor = "Llf;")
    private static class109 field2223 = class35.method275(" seconds)3", 2);

    @OriginalMember(owner = "m", name = "S", descriptor = "Llf;")
    public static class109 field2215 = field2223;

    @OriginalMember(owner = "m", name = "Y", descriptor = "Llf;")
    public static class109 field2221 = class35.method275("RuneScape wurde aktualisiert(Q", 2);

    @OriginalMember(owner = "m", name = "Z", descriptor = "Llf;")
    public static class109 field2222 = class35.method275("sl_stars", 2);

    @OriginalMember(owner = "m", name = "Q", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "m", name = "R", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "m", name = "U", descriptor = "I")
    private int field2217;

    @OriginalMember(owner = "m", name = "W", descriptor = "I")
    private int field2219;

    @OriginalMember(owner = "m", name = "X", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "m", name = "cb", descriptor = "I")
    private int field2225;

    @OriginalMember(owner = "m", name = "db", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "m", name = "eb", descriptor = "I")
    private int field2227;

    @OriginalMember(owner = "m", name = "fb", descriptor = "I")
    private int field2228;

    @OriginalMember(owner = "m", name = "hb", descriptor = "I")
    private int field2230;

    @OriginalMember(owner = "m", name = "ib", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "m", name = "a", descriptor = "(BI)I")
    public static final int method829(byte arg0, int arg1) {
        if (arg0 != -33) {
            field2223 = null;
        }
        ++field2220;
        return (1034149 & arg1) >> 17;
    }

    @OriginalMember(owner = "m", name = "<init>", descriptor = "()V")
    public class112() {
        super(1, false);
    }

    @OriginalMember(owner = "m", name = "e", descriptor = "(I)V")
    public static void method830(int arg0) {
        field2221 = null;
        int var1 = -96 % ((-74 - arg0) / 39);
        field2222 = null;
        field2223 = null;
        field2215 = null;
    }

    @OriginalMember(owner = "m", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field2213;
        if (arg1 != 2177) {
            this.field2219 = -51;
        }
        int[][] var3 = super.field1719.method673((byte) -127, arg0);
        if (super.field1719.field1926) {
            int[][] var4 = this.method544(false, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class57.field1152 < ~var11; ++var11) {
                this.method832(var8[var11], true, var6[var11], var5[var11]);
                for (this.field2217 += this.field2224; ~this.field2217 > -1; this.field2217 += 4096) {
                }
                this.field2228 += this.field2216;
                this.field2219 += this.field2229;
                if (this.field2219 < 0) {
                    this.field2219 = 0;
                }
                if (~this.field2228 > -1) {
                    this.field2228 = 0;
                }
                while (~this.field2217 < -4097) {
                    this.field2217 -= 4096;
                }
                if (this.field2219 > 4096) {
                    this.field2219 = 4096;
                }
                if (~this.field2228 < -4097) {
                    this.field2228 = 4096;
                }
                this.method831(this.field2219, this.field2228, (byte) 120, this.field2217);
                var7[var11] = this.field2230;
                var10[var11] = this.field2225;
                var9[var11] = this.field2227;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "m", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        ++field2214;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field2229 = (arg2.method584(3) << 12) / 100;
                }
            } else {
                this.field2216 = (arg2.method584(3) << 12) / 100;
            }
        } else {
            this.field2224 = arg2.method577(true);
        }
        if (arg0 > -120) {
            this.method31((byte) 65, -7, (class86) null);
        }
    }

    @OriginalMember(owner = "m", name = "a", descriptor = "(IIBI)V")
    private final void method831(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= 76) {
            this.field2225 = 10;
        }
        ++field2231;
        int var5 = ~arg0 >= -2049 ? (4096 - -arg1) * arg0 >> 12 : arg0 + arg1 + -(arg0 * arg1 >> 12);
        if (~var5 < -1) {
            int var6 = -var5 + arg0 + arg0;
            int var7 = (-var6 + var5 << 12) / var5;
            int var8 = arg3 * 6;
            int var9 = var8 >> 12;
            int var11 = -(var9 << 12) + var8;
            int var12 = var7 * var5 >> 12;
            int var13 = var11 * var12 >> 12;
            int var14 = var6 - -var13;
            int var15 = -var13 + var5;
            if (~var9 == -1) {
                this.field2227 = var6;
                this.field2230 = var5;
                this.field2225 = var14;
                return;
            }
            if (~var9 == -2) {
                this.field2230 = var15;
                this.field2227 = var6;
                this.field2225 = var5;
                return;
            }
            if (~var9 == -3) {
                this.field2227 = var14;
                this.field2225 = var5;
                this.field2230 = var6;
                return;
            }
            if (var9 == 3) {
                this.field2230 = var6;
                this.field2227 = var5;
                this.field2225 = var15;
                return;
            }
            if (~var9 == -5) {
                this.field2225 = var6;
                this.field2230 = var14;
                this.field2227 = var5;
                return;
            }
            if (var9 == 5) {
                this.field2230 = var5;
                this.field2225 = var6;
                this.field2227 = var15;
                return;
            }
        } else {
            this.field2230 = this.field2225 = this.field2227 = arg0;
        }
    }

    @OriginalMember(owner = "m", name = "a", descriptor = "(IZII)V")
    private final void method832(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            method829((byte) -117, 41);
        }
        ++field2226;
        int var5 = ~arg2 > ~arg3 ? arg3 : arg2;
        int var6 = ~arg0 >= ~var5 ? var5 : arg0;
        int var7 = arg2 <= arg3 ? arg2 : arg3;
        int var8 = ~var7 >= ~arg0 ? var7 : arg0;
        int var9 = -var8 + var6;
        this.field2219 = (var6 + var8) / 2;
        if (var9 > 0) {
            if (~this.field2219 < -1 && this.field2219 < 4096) {
                this.field2228 = (var9 << 12) / (~this.field2219 >= -2049 ? this.field2219 * 2 : -(this.field2219 * 2) + 8192);
            }
            int var10 = (var6 - arg3 << 12) / var9;
            int var11 = (-arg2 + var6 << 12) / var9;
            int var12 = (-arg0 + var6 << 12) / var9;
            if (~arg3 == ~var6) {
                this.field2217 = arg2 == var8 ? 20480 - -var12 : -var11 + 4096;
            } else if (arg2 == var6) {
                this.field2217 = arg0 != var8 ? 12288 - var12 : var10 + 4096;
            } else {
                this.field2217 = ~arg3 == ~var8 ? 12288 - -var11 : -var10 + 20480;
            }
            this.field2217 /= 6;
        }
    }
}
