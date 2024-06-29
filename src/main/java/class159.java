import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class159 extends class23 {

    @OriginalMember(owner = "client!og", name = "M", descriptor = "Ldc;")
    private static class37 field3004 = class185.method1233((byte) 86, "Free world");

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "Ldc;")
    public static class37 field3008 = field3004;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "[I")
    public static int[] field3011 = new int[2000];

    @OriginalMember(owner = "client!og", name = "V", descriptor = "[Z")
    public static boolean[] field3013 = new boolean[100];

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "Ldj;")
    public static class44 field3005;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
    public static void method1069(boolean arg0) {
        field3004 = null;
        if (arg0) {
            method1071(-34);
        }
        field3008 = null;
        field3013 = null;
        field3005 = null;
        field3011 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            field3011 = null;
        }
        ++field3009;
        int[] var3 = super.field405.method1461(arg1, (byte) -123);
        if (super.field405.field4114) {
            int[] var4 = this.method162(arg1, 0, (byte) 18);
            for (int var5 = 0; ~var5 > ~class199.field3705; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class159() {
        super(1, false);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BZ)V")
    public static final void method1070(byte arg0, boolean arg1) {
        if (~(class238.field4382.field3505 >> 7) == ~class191.field3577 && ~(class238.field4382.field3490 >> 7) == ~class194.field3610) {
            class191.field3577 = 0;
        }
        int var2 = class76.field1342;
        ++field3007;
        int var3 = 127 % ((-61 - arg0) / 56);
        if (arg1) {
            var2 = 1;
        }
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            class123 var5;
            long var6;
            if (arg1) {
                var5 = class238.field4382;
                var6 = 8791798054912L;
            } else {
                var6 = (long) class9.field122[var4] << 32;
                var5 = class8.field107[class9.field122[var4]];
            }
            if (var5 != null && var5.method482((byte) -108)) {
                int var8 = var5.field3505 >> 7;
                int var9 = var5.field3490 >> 7;
                var5.field2182 = false;
                if ((class16.field259 && ~class76.field1342 < -51 || ~class76.field1342 < -201) && !arg1 && var5.field3466 == var5.field3465) {
                    var5.field2182 = true;
                }
                if (var8 >= 0 && var8 < 104 && ~var9 <= -1 && var9 < 104) {
                    if (var5.field2200 != null && class203.field3758 >= var5.field2178 && ~var5.field2209 < ~class203.field3758) {
                        var5.field2182 = false;
                        var5.field3487 = class145.method1008(class125.field2246, var5.field3505, var5.field3490, (byte) -54);
                        class29.method241(class125.field2246, var5.field3505, var5.field3490, var5.field3487, var5, var5.field3511, var6, var5.field2185, var5.field2189, var5.field2188, var5.field2194);
                    } else {
                        if (~(var5.field3505 & 127) == -65 && (var5.field3490 & 127) == 64) {
                            if (class66.field1184[var8][var9] == class231.field4224) {
                                continue;
                            }
                            class66.field1184[var8][var9] = class231.field4224;
                        }
                        var5.field3487 = class145.method1008(class125.field2246, var5.field3505, var5.field3490, (byte) 85);
                        class88.method586(class125.field2246, var5.field3505, var5.field3490, var5.field3487, 60, var5, var5.field3511, var6, var5.field3476);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        if (arg1 != 9) {
            method1070((byte) 96, false);
        }
        ++field3003;
        int[][] var3 = super.field398.method1522(-29659, arg0);
        if (super.field398.field4303) {
            int[][] var4 = this.method159(0, (byte) -128, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; class199.field3705 > var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var10[var11] = 4096 - var6[var11];
                var9[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
    public static final void method1071(int arg0) {
        ++field3012;
        class12.field167.method1504(0);
        int var1 = class12.field167.method1506((byte) 126, 8);
        if (~var1 > ~class95.field1669) {
            for (int var2 = var1; ~var2 > ~class95.field1669; ++var2) {
                class119.field2131[class75.field1336++] = class92.field1579[var2];
            }
        }
        if (class95.field1669 < var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class95.field1669 = 0;
            int var3 = 0;
            if (arg0 == 7028) {
                while (~var1 < ~var3) {
                    int var4 = class92.field1579[var3];
                    class66 var5 = class70.field1262[var4];
                    int var6 = class12.field167.method1506((byte) 122, 1);
                    if (var6 == 0) {
                        class92.field1579[class95.field1669++] = var4;
                        var5.field3529 = class203.field3758;
                    } else {
                        int var7 = class12.field167.method1506((byte) 119, 2);
                        if (var7 == 0) {
                            class92.field1579[class95.field1669++] = var4;
                            var5.field3529 = class203.field3758;
                            class214.field4000[class19.field309++] = var4;
                        } else if (var7 == 1) {
                            class92.field1579[class95.field1669++] = var4;
                            var5.field3529 = class203.field3758;
                            int var8 = class12.field167.method1506((byte) 126, 3);
                            var5.method1263(var8, false, -30438);
                            int var9 = class12.field167.method1506((byte) 120, 1);
                            if (var9 == 1) {
                                class214.field4000[class19.field309++] = var4;
                            }
                        } else if (var7 == 2) {
                            class92.field1579[class95.field1669++] = var4;
                            var5.field3529 = class203.field3758;
                            int var10 = class12.field167.method1506((byte) 119, 3);
                            var5.method1263(var10, true, -30438);
                            int var11 = class12.field167.method1506((byte) 118, 3);
                            var5.method1263(var11, true, -30438);
                            int var12 = class12.field167.method1506((byte) 110, 1);
                            if (~var12 == -2) {
                                class214.field4000[class19.field309++] = var4;
                            }
                        } else if (~var7 == -4) {
                            class119.field2131[class75.field1336++] = var4;
                        }
                    }
                    ++var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg2 == 1000) {
            ++field3010;
            if (arg1 == 0) {
                super.field407 = ~arg0.method215(-1797813752) == -2;
            }
        }
    }
}
