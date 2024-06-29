import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class157 extends class23 {

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "Z")
    private boolean field2983 = true;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "Z")
    private boolean field2985 = true;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field2981 = 0;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "Ldc;")
    public static class37 field2979 = class185.method1233((byte) 86, "Fertigkeit)2");

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "I")
    public static int field2984 = 7759444;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    public static int field2986 = 0;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "Ldc;")
    public static class37 field2989 = class185.method1233((byte) 86, "::autoshadow on");

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "Ldj;")
    public static class44 field2977;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        ++field2982;
        if (arg2 != 1000) {
            field2989 = null;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field407 = ~arg0.method215(-1797813752) == -2;
                }
            } else {
                this.field2983 = arg0.method215(-1797813752) == 1;
            }
        } else {
            this.field2985 = arg0.method215(arg2 + -1797814752) == 1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field2987;
        int[] var3 = super.field405.method1461(arg1, (byte) -126);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field405.field4114) {
                int[] var4 = this.method162(!this.field2983 ? arg1 : class5.field44 - arg1, 0, (byte) 18);
                if (this.field2985) {
                    for (int var5 = 0; ~class199.field3705 < ~var5; ++var5) {
                        var3[var5] = var4[class215.field4008 - var5];
                    }
                } else {
                    class4.method34(var4, 0, var3, 0, class199.field3705);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        ++field2980;
        if (arg1 != 9) {
            method1062((class238) null, -37);
        }
        int[][] var3 = super.field398.method1522(-29659, arg0);
        if (super.field398.field4303) {
            int[][] var4 = this.method159(0, (byte) -120, !this.field2983 ? arg0 : -arg0 + class5.field44);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            if (!this.field2985) {
                for (int var11 = 0; ~var11 > ~class199.field3705; ++var11) {
                    var9[var11] = var7[var11];
                    var8[var11] = var5[var11];
                    var10[var11] = var6[var11];
                }
            } else {
                for (int var12 = 0; class199.field3705 > var12; ++var12) {
                    var9[var12] = var7[-var12 + class215.field4008];
                    var8[var12] = var5[-var12 + class215.field4008];
                    var10[var12] = var6[-var12 + class215.field4008];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class157() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lwa;I)V")
    public static final void method1062(class238 arg0, int arg1) {
        if (arg1 < -115) {
            class39.field817 = arg0;
            class112.field1978 = class39.field817.method1559(26143, 16);
            ++field2988;
        }
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V")
    public static void method1063(int arg0) {
        field2989 = null;
        field2977 = null;
        field2979 = null;
        if (arg0 != -2) {
            method1064(119, 66, -34);
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(III)V")
    public static final void method1064(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class95.field1674; ++var3) {
            for (int var4 = 0; var4 < class238.field4372; ++var4) {
                for (int var5 = 0; var5 < client.field682; ++var5) {
                    class18 var6 = class180.field3354[var3][var4][var5];
                    if (var6 != null) {
                        class184 var7 = var6.field292;
                        if (var7 != null && var7.field3399.method590()) {
                            class193.method1284(var7.field3399, var3, var4, var5, 1, 1);
                            if (var7.field3404 != null && var7.field3404.method590()) {
                                class193.method1284(var7.field3404, var3, var4, var5, 1, 1);
                                var7.field3399.method585(var7.field3404, 0, 0, 0, false);
                                var7.field3404 = var7.field3404.method587(arg0, arg1, arg2);
                            }
                            var7.field3399 = var7.field3399.method587(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field290; ++var8) {
                            class94 var10 = var6.field289[var8];
                            if (var10 != null && var10.field1653.method590()) {
                                class193.method1284(var10.field1653, var3, var4, var5, var10.field1651 - var10.field1639 + 1, var10.field1637 - var10.field1645 + 1);
                                var10.field1653 = var10.field1653.method587(arg0, arg1, arg2);
                            }
                        }
                        class149 var9 = var6.field295;
                        if (var9 != null && var9.field2829.method590()) {
                            class18.method125(var9.field2829, var3, var4, var5);
                            var9.field2829 = var9.field2829.method587(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)I")
    public static final int method1065(int arg0, int arg1) {
        ++field2978;
        if (arg1 != 4) {
            field2981 = -106;
        }
        double var2 = (double) (arg0 & 255) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 255) / 256.0D;
        double var6 = (double) ((arg0 & 16757738) >> 16) / 256.0D;
        double var8 = var6;
        double var10 = var6;
        if (var6 < var4) {
            var8 = var4;
        }
        double var12 = 0.0D;
        if (var8 < var2) {
            var8 = var2;
        }
        double var14 = 0.0D;
        if (var4 < var6) {
            var10 = var4;
        }
        if (var2 < var10) {
            var10 = var2;
        }
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var8 - var10) / (var8 + var10);
            }
            if (var6 == var8) {
                var12 = (-var2 + var4) / (var8 - var10);
            } else if (var4 != var8) {
                if (var2 == var8) {
                    var12 = (-var4 + var6) / (var8 - var10) + 4.0D;
                }
            } else {
                var12 = (-var6 + var2) / (var8 - var10) + 2.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (-var10 + var8) / (-var8 + 2.0D - var10);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var16 * 256.0D);
        if (~var21 > -1) {
            var21 = 0;
        } else if (~var21 < -256) {
            var21 = 255;
        }
        int var22 = (int) (var14 * 256.0D);
        if (~var22 <= -1) {
            if (var22 > 255) {
                var22 = 255;
            }
        } else {
            var22 = 0;
        }
        if (var21 <= 243) {
            if (var21 <= 217) {
                if (~var21 >= -193) {
                    if (var21 > 179) {
                        var22 >>= 1;
                    }
                } else {
                    var22 >>= 2;
                }
            } else {
                var22 >>= 3;
            }
        } else {
            var22 >>= 4;
        }
        return (var20 >> 2 << 10) + (var22 >> 5 << 7) + (var21 >> 1);
    }
}
