import java.math.BigInteger;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class154 extends class108 {

    @OriginalMember(owner = "client!gca", name = "D", descriptor = "I")
    public int field2325 = 0;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2306 = new BigInteger("889d74e61f5ca63385b2d76ae0ed4b6fadda370c2bd644475c547ddff7e2d8a278eb8df7c7e9775b25ca4df40d720878315711ffe53f0fe28415783d2a6b05ab", 16);

    @OriginalMember(owner = "client!gca", name = "I", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2329 = new CRC32();

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
    public int field2308;

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
    public int field2313;

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "I")
    public int field2314;

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "I")
    public int field2315;

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!gca", name = "x", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!gca", name = "y", descriptor = "I")
    public int field2320;

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "I")
    public int field2321;

    @OriginalMember(owner = "client!gca", name = "B", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!gca", name = "C", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "I")
    public int field2326;

    @OriginalMember(owner = "client!gca", name = "G", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "Ljk;")
    public class170 field2317;

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "Lfc;")
    public class320 field2310;

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "Lfc;")
    public class320 field2312;

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "Ltk;")
    public class370 field2311;

    @OriginalMember(owner = "client!gca", name = "A", descriptor = "Lbda;")
    public class400 field2322;

    @OriginalMember(owner = "client!gca", name = "F", descriptor = "Z")
    public boolean field2327;

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "[I")
    public int[] field2316;

    static {
        new class567(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V", line = 7)
    public static void method1092(int arg0) {
        if (arg0 != 0) {
            method1092(-47);
        }
        field2329 = null;
        field2306 = null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIIII)V", line = 30)
    public static final void method1093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2309++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg1 - arg0;
        int var12 = arg3 - arg0;
        int var13 = arg1 * arg1;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        if (arg6 != 1793050754) {
            return;
        }
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (arg7 >= class222.field3350 && class409.field6071 >= arg7) {
            int[] var39 = class495.field6944[arg7];
            int var40 = class34.method306(class183.field2638, arg2 - arg1, class268.field3911, (byte) 118);
            int var41 = class34.method306(class183.field2638, arg2 + arg1, class268.field3911, (byte) 121);
            int var42 = class34.method306(class183.field2638, arg2 - var11, class268.field3911, (byte) 88);
            int var43 = class34.method306(class183.field2638, arg2 + var11, class268.field3911, (byte) 93);
            class614.method3490(arg5, var40, arg6 ^ 0x9520371F, var39, var42);
            class614.method3490(arg4, var42, -119, var39, var43);
            class614.method3490(arg5, var43, arg6 - 1793050871, var39, var41);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var37 += var30;
                    var33 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var45 = arg7 - var9;
            int var46 = arg7 + var9;
            if (class222.field3350 <= var46 && class409.field6071 >= var45) {
                int var47 = class34.method306(class183.field2638, arg2 + var8, class268.field3911, (byte) 84);
                int var48 = class34.method306(class183.field2638, arg2 - var8, class268.field3911, (byte) 115);
                if (var44) {
                    int var49 = class34.method306(class183.field2638, arg2 + var10, class268.field3911, (byte) 82);
                    int var50 = class34.method306(class183.field2638, arg2 - var10, class268.field3911, (byte) 99);
                    if (class222.field3350 <= var45) {
                        int[] var51 = class495.field6944[var45];
                        class614.method3490(arg5, var48, arg6 ^ 0x95203702, var51, var50);
                        class614.method3490(arg4, var50, -100, var51, var49);
                        class614.method3490(arg5, var49, -101, var51, var47);
                    }
                    if (class409.field6071 >= var46) {
                        int[] var52 = class495.field6944[var46];
                        class614.method3490(arg5, var48, arg6 ^ 0x95203714, var52, var50);
                        class614.method3490(arg4, var50, arg6 - 1793050860, var52, var49);
                        class614.method3490(arg5, var49, -110, var52, var47);
                    }
                } else {
                    if (var45 >= class222.field3350) {
                        class614.method3490(arg5, var48, -123, class495.field6944[var45], var47);
                    }
                    if (var46 <= class409.field6071) {
                        class614.method3490(arg5, var48, arg6 ^ 0x95203718, class495.field6944[var46], var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V", line = 234)
    public final void method1094(int arg0) {
        field2318++;
        int var2 = this.field2315;
        if (this.field2311 != null) {
            class370 var3 = this.field2311.method2238((byte) 113, class401.field6001);
            if (var3 == null) {
                this.field2324 = 0;
                this.field2321 = 0;
                this.field2313 = 0;
                this.field2316 = null;
                this.field2320 = 0;
                this.field2315 = -1;
            } else {
                this.field2313 = var3.field5313;
                this.field2324 = var3.field5345 << 7;
                this.field2316 = var3.field5331;
                this.field2321 = var3.field5298;
                this.field2315 = var3.field5344;
                this.field2320 = var3.field5308;
            }
        } else if (this.field2317 != null) {
            int var4 = class19.method217(-117, this.field2317);
            if (var2 != var4) {
                this.field2315 = var4;
                class432 var5 = this.field2317.field2492;
                if (var5.field6304 != null) {
                    var5 = var5.method2582(0, class401.field6001);
                }
                if (var5 == null) {
                    this.field2321 = this.field2324 = 0;
                } else {
                    this.field2321 = var5.field6330;
                    this.field2324 = var5.field6335 << 7;
                }
            }
        } else if (this.field2322 != null) {
            this.field2315 = class133.method1027(this.field2322, false);
            this.field2321 = this.field2322.field5962;
            this.field2324 = this.field2322.field5985 << 7;
        }
        if (this.field2315 != var2 && this.field2312 != null) {
            class35.field485.method44(this.field2312);
            this.field2312 = null;
        }
        if (arg0 <= 42) {
            this.field2315 = 63;
        }
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)V", line = 314)
    public static final void method1095(int arg0) {
        if (arg0 < 76) {
            method1095(55);
        }
        class48.method432(0);
        field2323++;
    }
}
