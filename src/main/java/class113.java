import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class113 extends class93 {

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    private int field2277 = 16;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
    private int field2285 = 0;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    private int field2284 = 0;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
    private int field2283 = 4096;

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "I")
    private int field2287 = 2000;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "Ljd;")
    public static class92 field2274 = class202.method1325((byte) 90, " <col=ffffff>");

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "Ljd;")
    public static class92 field2278 = class202.method1325((byte) 90, "(U");

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "Ljd;")
    public static class92 field2279 = null;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field2276 = 0;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "Ljd;")
    public static class92 field2273 = class202.method1325((byte) 90, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!lf", name = "ib", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!lf", name = "jb", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "[[I")
    public static int[][] field2275;

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class113() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static void method761(int arg0) {
        field2273 = null;
        if (arg0 > 119) {
            field2278 = null;
            field2274 = null;
            field2275 = null;
            field2279 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIILtg;IJZ)Z")
    public static final boolean method762(int arg0, int arg1, int arg2, int arg3, int arg4, class186 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class118.method807(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BILnh;)Lsc;")
    public static final class173 method763(byte arg0, int arg1, class133 arg2) {
        if (arg0 <= 62) {
            field2276 = -40;
        }
        ++field2280;
        return !class204.method1332(arg1, arg2, 122) ? null : class63.method382(14700);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JB)Ljd;")
    public static final class92 method764(long arg0, byte arg1) {
        int var3 = -8 / ((70 - arg1) / 41);
        ++field2290;
        return class21.method134(arg0, 10, false, true);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        ++field2286;
        if (arg2 != 0) {
            field2276 = -61;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field2283 = arg1.method442(-21351);
                        }
                    } else {
                        this.field2284 = arg1.method442(-21351);
                    }
                } else {
                    this.field2277 = arg1.method443(255);
                }
            } else {
                this.field2287 = arg1.method442(arg2 ^ -21351);
            }
        } else {
            this.field2285 = arg1.method443(arg2 ^ 255);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int var3 = -102 / ((67 - arg1) / 42);
        int[] var4 = super.field1887.method916(arg0, -95);
        ++field2281;
        if (super.field1887.field2757) {
            int var5 = this.field2283 >> 1;
            int[][] var6 = super.field1887.method913(0);
            Random var7 = new Random((long) this.field2285);
            for (int var8 = 0; var8 < this.field2287; ++var8) {
                int var9 = this.field2283 > 0 ? this.field2284 - (-class42.method265(-1, this.field2283, var7) + var5) : this.field2284;
                int var10 = class42.method265(-1, class150.field2985, var7);
                int var11 = (4086 & var9) >> 4;
                int var12 = class42.method265(-1, class68.field1385, var7);
                int var13 = (class54.field1128[var11] * this.field2277 >> 12) + var12;
                int var14 = -var12 + var13;
                int var15 = (class26.field598[var11] * this.field2277 >> 12) + var10;
                int var16 = var15 - var10;
                if (var16 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    boolean var17 = ~var16 > ~var14;
                    if (var17) {
                        int var18 = var10;
                        int var19 = var15;
                        var10 = var12;
                        var15 = var13;
                        var13 = var19;
                        var12 = var18;
                    }
                    if (~var15 > ~var10) {
                        int var20 = var12;
                        int var21 = var10;
                        var10 = var15;
                        var12 = var13;
                        var15 = var21;
                        var13 = var20;
                    }
                    int var22 = -var10 + var15;
                    int var23 = var12;
                    int var24 = -var12 + var13;
                    if (~var24 > -1) {
                        var24 = -var24;
                    }
                    int var25 = 1024 + -(class42.method265(-1, 4096, var7) >> 2);
                    int var26 = -var22 / 2;
                    int var27 = ~var13 >= ~var12 ? -1 : 1;
                    int var28 = 2048 / var22;
                    for (int var29 = var10; ~var29 > ~var15; ++var29) {
                        var26 += var24;
                        int var30 = (-var10 + var29) * var28 + var25 + 1024;
                        int var31 = class5.field279 & var23;
                        if (~var26 < -1) {
                            var26 += -var22;
                            var23 -= -var27;
                        }
                        int var32 = class2.field163 & var29;
                        if (!var17) {
                            var6[var32][var31] = var30;
                        } else {
                            var6[var31][var32] = var30;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        class107.method738((byte) -20);
        if (arg0 != -85) {
            method761(26);
        }
        ++field2288;
    }
}
