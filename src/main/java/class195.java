import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class195 extends class82 {

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    private int field2356 = 0;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    private int field2362 = 0;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    private int field2357 = 4096;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    private int field2363 = 2000;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
    private int field2367 = 16;

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "Lcu;")
    public static class185 field2366 = new class185(3, 17);

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "Let;")
    public static class509 field2369 = null;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "Lcea;")
    public static class180 field2368 = new class180("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field2370 = new String[200];

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "Lcea;")
    public static class180 field2371 = new class180("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method1060(byte arg0) {
        field2370 = null;
        field2368 = null;
        if (arg0 <= -28) {
            field2366 = null;
            field2369 = null;
            field2371 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field2365;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (arg1 != 12218) {
            return null;
        } else {
            if (super.field990.field3641) {
                int var4 = this.field2357 >> 1;
                int[][] var5 = super.field990.method1568(false);
                Random var6 = new Random((long) this.field2356);
                for (int var7 = 0; ~this.field2363 < ~var7; ++var7) {
                    int var8 = ~this.field2357 >= -1 ? this.field2362 : this.field2362 + class242.method1375(this.field2357, false, var6) + -var4;
                    int var9 = var8 >> 4 & 255;
                    int var10 = class242.method1375(class629.field9033, false, var6);
                    int var11 = class242.method1375(class347.field4469, false, var6);
                    int var12 = (class326.field4164[var9] * this.field2367 >> 12) + var10;
                    int var13 = var11 - -(class445.field6135[var9] * this.field2367 >> 12);
                    int var14 = var13 - var11;
                    int var15 = -var10 + var12;
                    if (~var15 != -1 || var14 != 0) {
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~var14 > -1) {
                            var14 = -var14;
                        }
                        boolean var16 = var14 > var15;
                        if (var16) {
                            int var17 = var10;
                            int var18 = var12;
                            var10 = var11;
                            var11 = var17;
                            var12 = var13;
                            var13 = var18;
                        }
                        if (var10 > var12) {
                            int var19 = var10;
                            int var20 = var11;
                            var10 = var12;
                            var12 = var19;
                            var11 = var13;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var10 + var12;
                        int var23 = -var11 + var13;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = 1024 - (class242.method1375(4096, false, var6) >> 2);
                        if (var23 < 0) {
                            var23 = -var23;
                        }
                        int var27 = ~var11 > ~var13 ? 1 : -1;
                        for (int var28 = var10; ~var28 > ~var12; ++var28) {
                            int var29 = (var28 - var10) * var25 + 1024 + var26;
                            int var30 = class129.field1590 & var28;
                            int var31 = class466.field6523 & var21;
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            var24 += var23;
                            if (~var24 < -1) {
                                var21 += var27;
                                var24 -= var22;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[I[ILbda;II)Ldea;")
    public static final class204 method1061(int arg0, int[] arg1, int[] arg2, class428 arg3, int arg4, int arg5) {
        ++field2360;
        if (arg5 < 74) {
            method1060((byte) 24);
        }
        if (!arg3.method1805(-100, class160.field1932, class37.field293)) {
            int[] var6 = new int[arg0 * arg4];
            for (int var7 = 0; var7 < arg0; ++var7) {
                int var8 = arg4 * var7 + arg2[var7];
                for (int var9 = 0; ~arg1[var7] < ~var9; ++var9) {
                    var6[var8++] = -16777216;
                }
            }
            return new class204(arg3, arg4, arg0, var6);
        } else {
            byte[] var10 = new byte[arg0 * arg4];
            for (int var11 = 0; ~var11 > ~arg0; ++var11) {
                int var12 = arg4 * var11 + arg2[var11];
                for (int var13 = 0; arg1[var11] > var13; ++var13) {
                    var10[var12++] = -1;
                }
            }
            return new class204(arg3, arg4, arg0, var10);
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)Z")
    public static final boolean method1062(byte arg0) {
        ++field2358;
        try {
            return arg0 < 44 ? false : class551.method3223(false);
        } catch (IOException var4) {
            class276.method1567((byte) -29);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class323.field4098 == null ? -1 : class323.field4098.method2082(105)) + "," + (class160.field1937 != null ? class160.field1937.method2082(111) : -1) + "," + (class378.field5033 != null ? class378.field5033.method2082(116) : -1) + " - " + class445.field6138 + "," + (class103.field1265.field6483[0] + class632.field9113) + "," + (class103.field1265.field6491[0] + class119.field1504) + " - ";
            for (int var3 = 0; var3 < class445.field6138 && var3 < 50; ++var3) {
                var2 = var2 + class532.field7483.field4929[var3] + ",";
            }
            class443.method2597(var5, var2, (byte) 107);
            class542.method3152(false, -14485);
            return true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field2357 = arg2.method2136(false);
                        }
                    } else {
                        this.field2362 = arg2.method2136(false);
                    }
                } else {
                    this.field2367 = arg2.method2129(-81);
                }
            } else {
                this.field2363 = arg2.method2136(false);
            }
        } else {
            this.field2356 = arg2.method2129(-79);
        }
        ++field2361;
        int var5 = 4 / ((arg1 - -69) / 42);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
    public final void method438(int arg0) {
        if (arg0 == -2) {
            ++field2359;
            class623.method3571(-113);
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class195() {
        super(0, true);
    }
}
