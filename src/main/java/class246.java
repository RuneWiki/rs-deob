import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class246 extends class53 {

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "Z")
    public boolean field4318 = false;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "Lhd;")
    private class11 field4319;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "Z")
    private boolean field4312;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "Z")
    private boolean field4321;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    private int field4333;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    private int field4330;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "Lp;")
    public static class280 field4316 = class18.method140((byte) -128, "M");

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "Lp;")
    public static class280 field4325 = class18.method140((byte) -119, "Konfig geladen)3");

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field4313 = 0;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field4315 = -1;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "Lp;")
    public static class280 field4329 = class18.method140((byte) -119, ":clanreq:");

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "Lp;")
    public static class280 field4326 = class18.method140((byte) -125, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "F")
    private float field4331;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "Ltg;")
    public static class180 field4335;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "[I")
    private int[] field4328;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
    public static final void method1667(byte arg0) {
        field4332++;
        if (class189.field3317 == 0) {
            return;
        }
        try {
            if (arg0 <= 27) {
                method1667((byte) 113);
            }
            if ((++class6.field130) > 1500) {
                if (class44.field727 != null) {
                    class44.field727.method1532(35);
                    class44.field727 = null;
                }
                if (class140.field2431 >= 1) {
                    class8.field148 = -5;
                    class189.field3317 = 0;
                    return;
                }
                class189.field3317 = 1;
                class6.field130 = 0;
                class140.field2431++;
                if (class86.field1426 == class106.field1764) {
                    class86.field1426 = class132.field2345;
                } else {
                    class86.field1426 = class106.field1764;
                }
            }
            if (class189.field3317 == 1) {
                class83.field1372 = class118.field2117.method1358(class86.field1426, -113, class208.field3592);
                class189.field3317 = 2;
            }
            if (class189.field3317 == 2) {
                if (class83.field1372.field3025 == 2) {
                    throw new IOException();
                }
                if (class83.field1372.field3025 != 1) {
                    return;
                }
                class44.field727 = new class227((Socket) class83.field1372.field3028, class118.field2117);
                class83.field1372 = null;
                class44.field727.method1526(class34.field627.field481, -124, 0, class34.field627.field475);
                if (class4.field118 != null) {
                    class4.field118.method85(7);
                }
                if (class250.field4391 != null) {
                    class250.field4391.method85(7);
                }
                int var1 = class44.field727.method1529(0);
                if (class4.field118 != null) {
                    class4.field118.method85(7);
                }
                if (class250.field4391 != null) {
                    class250.field4391.method85(7);
                }
                if (var1 != 101) {
                    class8.field148 = var1;
                    class189.field3317 = 0;
                    class44.field727.method1532(89);
                    class44.field727 = null;
                    return;
                }
                class189.field3317 = 3;
            }
            if (class189.field3317 == 3 && class44.field727.method1525(5000) >= 2) {
                int var2 = class44.field727.method1529(0) << 8 | class44.field727.method1529(0);
                class201.method1377((byte) -80, var2);
                if (class105.field1741 == -1) {
                    class189.field3317 = 0;
                    class8.field148 = 6;
                    class44.field727.method1532(65);
                    class44.field727 = null;
                } else {
                    class189.field3317 = 0;
                    class44.field727.method1532(64);
                    class44.field727 = null;
                    class90.method640(0);
                }
            }
        } catch (IOException var3) {
            if (class44.field727 != null) {
                class44.field727.method1532(39);
                class44.field727 = null;
            }
            if (class140.field2431 >= 1) {
                class8.field148 = -4;
                class189.field3317 = 0;
            } else {
                class189.field3317 = 1;
                class6.field130 = 0;
                class140.field2431++;
                if (class86.field1426 == class106.field1764) {
                    class86.field1426 = class132.field2345;
                } else {
                    class86.field1426 = class106.field1764;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ltg;ZILg;)[I")
    public final int[] method1668(class180 arg0, boolean arg1, int arg2, class272 arg3) {
        int var5 = 41 % ((48 - arg2) / 55);
        field4324++;
        if (this.field4319.method103(arg3, arg0, 0)) {
            int var6 = arg1 ? 64 : 128;
            return this.field4319.method107(1.0D, this.field4321, arg3, arg0, var6, -7611, false, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lg;ILtg;)Z")
    public final boolean method1669(class272 arg0, int arg1, class180 arg2) {
        field4320++;
        if (arg1 != 64) {
            method1673(false);
        }
        return this.field4319.method103(arg0, arg2, arg1 ^ 0x40);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)[Lde;")
    public static final class108[] method1670(boolean arg0) {
        class108[] var1 = new class108[class149.field2579];
        if (arg0) {
            field4335 = null;
        }
        for (int var2 = 0; var2 < class149.field2579; var2++) {
            int var3 = class97.field1562[var2] * class57.field915[var2];
            byte[] var4 = class182.field3178[var2];
            if (class261.field4615[var2]) {
                byte[] var5 = class262.field4637[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; var7++) {
                    var6[var7] = class160.method1143(class16.field309[class214.method1432(var4[var7], 255)], class214.method1432(var5[var7], 255) << 24);
                }
                var1[var2] = new class186(class93.field1512, class221.field3828, class243.field4263[var2], class124.field2172[var2], class97.field1562[var2], class57.field915[var2], var6);
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class16.field309[class214.method1432(var4[var9], 255)];
                }
                var1[var2] = new class223(class93.field1512, class221.field3828, class243.field4263[var2], class124.field2172[var2], class97.field1562[var2], class57.field915[var2], var8);
            }
        }
        class126.method868(-15434);
        field4334++;
        return var1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public final void method1671(int arg0, int arg1) {
        if (arg0 <= 90) {
            field4329 = null;
        }
        field4314++;
        if (this.field4328 == null || this.field4330 == 0 && this.field4333 == 0) {
            return;
        }
        if (class252.field4408 == null || this.field4328.length > class252.field4408.length) {
            class252.field4408 = new int[this.field4328.length];
        }
        int var3 = this.field4328.length;
        int var4 = this.field4328.length == 4096 ? 64 : 128;
        int var5 = this.field4333 * arg1;
        int var6 = var4 - 1;
        int var7 = arg1 * var4 * this.field4330;
        int var8 = var3 - 1;
        for (int var9 = 0; var9 < var3; var9 += var4) {
            int var11 = var8 & var7 + var9;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = var9 + var12;
                int var14 = (var6 & var5 + var12) + var11;
                class252.field4408[var13] = this.field4328[var14];
            }
        }
        int[] var10 = this.field4328;
        this.field4328 = class252.field4408;
        class252.field4408 = var10;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILg;ZFLtg;)[I")
    public final int[] method1672(int arg0, class272 arg1, boolean arg2, float arg3, class180 arg4) {
        field4323++;
        if (this.field4328 == null || this.field4331 != arg3) {
            if (!this.field4319.method103(arg1, arg4, 0)) {
                return null;
            }
            int var6 = arg2 ? 64 : 128;
            this.field4328 = this.field4319.method107((double) arg3, this.field4321, arg1, arg4, var6, arg0 + 3673, true, var6);
            this.field4331 = arg3;
            if (this.field4312) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var14 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var14; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field4328[var12];
                        var8[var34] += class214.method1432(16759083, var35) >> 16;
                        var7[var34] += class214.method1432(255, var35 >> 8);
                        var9[var34] += class214.method1432(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var24 += var8[var25];
                        var23 += var9[var25];
                        var22 += var7[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var14; var27 >= 0; var27--) {
                        int var31 = var22 / 9;
                        int var32 = var24 / 9;
                        var21--;
                        int var33 = var23 / 9;
                        var25--;
                        var19--;
                        var10[var19] = class160.method1143(var33, class160.method1143(var31 << 8, var32 << 16));
                        var22 += var7[var25] - var7[var21];
                        var23 += var9[var25] - var9[var21];
                        var24 += var8[var25] - var8[var21];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var28 = var14; var28 >= 0; var28--) {
                        var13--;
                        int var29 = this.field4328[var13];
                        var12--;
                        int var30 = this.field4328[var12];
                        var8[var28] += class214.method1432(255, var30 >> 16) - (class214.method1432(var29, 16768904) >> 16);
                        var7[var28] += -(class214.method1432(var29, 65405) >> 8) + (class214.method1432(var30, 65325) >> 8);
                        var9[var28] += -class214.method1432(var29, 255) + class214.method1432(255, var30);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field4328 = var10;
            }
        }
        if (arg0 != -11284) {
            field4322 = -20;
        }
        return this.field4328;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
    public static void method1673(boolean arg0) {
        field4326 = null;
        field4316 = null;
        if (!arg0) {
            field4325 = null;
            field4329 = null;
            field4335 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field4317++;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Llj;)V")
    public class246(class25 arg0) {
        this.field4319 = new class11(arg0);
        this.field4312 = arg0.method189((byte) -103) == 1;
        this.field4321 = arg0.method189((byte) -103) == 1;
        arg0.method189((byte) -103);
        arg0.method189((byte) -103);
        int var2 = arg0.method189((byte) -103) & 0x3;
        this.field4333 = arg0.method200(32768);
        this.field4330 = arg0.method200(32768);
        arg0.method189((byte) -103);
        arg0.method189((byte) -103);
    }
}
