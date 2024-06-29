import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class183 extends class170 {

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    private int field3255 = 0;

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "I")
    private int field3261 = 0;

    @OriginalMember(owner = "client!ag", name = "nb", descriptor = "I")
    private int field3268 = 0;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "[Z")
    public static boolean[] field3251 = new boolean[8];

    @OriginalMember(owner = "client!ag", name = "kb", descriptor = "Lqk;")
    public static class207 field3265 = class24.method212(255, "k");

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3253 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ag", name = "ob", descriptor = "Lqk;")
    public static class207 field3269 = class24.method212(255, "Abbrechen");

    @OriginalMember(owner = "client!ag", name = "pb", descriptor = "Lqk;")
    public static class207 field3270 = class24.method212(255, "::clientjs5drop");

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    private int field3254;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    private int field3258;

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "I")
    private int field3259;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ag", name = "hb", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!ag", name = "ib", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ag", name = "jb", descriptor = "I")
    private int field3264;

    @OriginalMember(owner = "client!ag", name = "lb", descriptor = "I")
    private int field3266;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "Lpk;")
    public static class99 field3256;

    @OriginalMember(owner = "client!ag", name = "mb", descriptor = "Lpk;")
    public static class99 field3267;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        int[][] var3 = super.field3002.method427(arg0, 239);
        if (arg1) {
            method1292(-119, 47);
        }
        ++field3262;
        if (super.field3002.field1077) {
            int[][] var4 = this.method1223(0, -108, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            for (int var11 = 0; ~class88.field1595 < ~var11; ++var11) {
                this.method1290(var6[var11], var7[var11], var5[var11], 13504);
                this.field3252 += this.field3261;
                this.field3258 += this.field3255;
                while (~this.field3252 > -1) {
                    this.field3252 += 4096;
                }
                this.field3254 += this.field3268;
                while (this.field3252 > 4096) {
                    this.field3252 -= 4096;
                }
                if (this.field3258 < 0) {
                    this.field3258 = 0;
                }
                if (this.field3254 < 0) {
                    this.field3254 = 0;
                }
                if (this.field3254 > 4096) {
                    this.field3254 = 4096;
                }
                if (this.field3258 > 4096) {
                    this.field3258 = 4096;
                }
                this.method1293(this.field3252, this.field3254, this.field3258, (byte) -112);
                var10[var11] = this.field3266;
                var9[var11] = this.field3259;
                var8[var11] = this.field3264;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class183() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
    private final void method1290(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 13504) {
            method1292(20, 75);
        }
        ++field3263;
        int var5 = arg2 > arg1 ? arg2 : arg1;
        int var6 = ~arg2 > ~arg1 ? arg2 : arg1;
        int var7 = ~var6 >= ~arg0 ? var6 : arg0;
        int var8 = var5 < arg0 ? arg0 : var5;
        this.field3258 = (var7 + var8) / 2;
        int var9 = -var7 + var8;
        if (~this.field3258 < -1 && ~this.field3258 > -4097) {
            this.field3254 = (var9 << 12) / (this.field3258 <= 2048 ? this.field3258 * 2 : 8192 - this.field3258 * 2);
        } else {
            this.field3254 = 0;
        }
        if (~var9 >= -1) {
            this.field3252 = 0;
        } else {
            int var10 = (var8 - arg2 << 12) / var9;
            int var11 = (-arg0 + var8 << 12) / var9;
            int var12 = (var8 - arg1 << 12) / var9;
            if (~arg2 == ~var8) {
                this.field3252 = arg1 != var7 ? -var12 + 4096 : var11 + 20480;
            } else if (arg1 != var8) {
                this.field3252 = ~arg2 != ~var7 ? 20480 - var10 : var12 + 12288;
            } else {
                this.field3252 = arg0 == var7 ? var10 + 4096 : -var11 + 12288;
            }
            this.field3252 /= 6;
        }
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V")
    public static void method1291(int arg0) {
        field3251 = null;
        if (arg0 != 2) {
            method1292(49, 98);
        }
        field3270 = null;
        field3267 = null;
        field3265 = null;
        field3269 = null;
        field3253 = null;
        field3256 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 != 5877) {
            this.method1290(-13, -128, 40, -75);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3255 = (arg0.method1084((byte) 49) << 12) / 100;
                }
            } else {
                this.field3268 = (arg0.method1084((byte) 49) << 12) / 100;
            }
        } else {
            this.field3261 = arg0.method1075(arg1 + 59659);
        }
        ++field3260;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
    public static final int method1292(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIB)V")
    private final void method1293(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = -11 % ((arg3 - -65) / 41);
        ++field3257;
        int var6 = ~arg2 >= -2049 ? (arg1 + 4096) * arg2 >> 12 : arg1 + arg2 + -(arg1 * arg2 >> 12);
        if (var6 > 0) {
            int var7 = arg0 * 6;
            int var8 = arg2 + arg2 + -var6;
            int var9 = (-var8 + var6 << 12) / var6;
            int var10 = var7 >> 12;
            int var11 = var7 - (var10 << 12);
            int var13 = var9 * var6 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = -var14 + var6;
            int var16 = var8 + var14;
            if (~var10 == -1) {
                this.field3259 = var16;
                this.field3266 = var6;
                this.field3264 = var8;
                return;
            }
            if (var10 == 1) {
                this.field3259 = var6;
                this.field3266 = var15;
                this.field3264 = var8;
                return;
            }
            if (~var10 == -3) {
                this.field3266 = var8;
                this.field3264 = var16;
                this.field3259 = var6;
                return;
            }
            if (~var10 == -4) {
                this.field3266 = var8;
                this.field3259 = var15;
                this.field3264 = var6;
                return;
            }
            if (~var10 == -5) {
                this.field3259 = var8;
                this.field3266 = var16;
                this.field3264 = var6;
                return;
            }
            if (var10 == 5) {
                this.field3266 = var6;
                this.field3259 = var8;
                this.field3264 = var15;
                return;
            }
        } else {
            this.field3266 = this.field3259 = this.field3264 = arg2;
        }
    }
}
