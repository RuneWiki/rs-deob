import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class359 extends class667 {

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    private int field5032 = 3072;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    private int field5039 = 1024;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    private int field5041 = 2048;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "Lhda;")
    public static class747 field5043 = new class747();

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "Lqaa;")
    public static class27 field5047 = new class27(22, 8);

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "I")
    public static int field5048 = 0;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "Lha;")
    public static class58 field5046;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "[I")
    public static int[] field5045;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "[[Lg;")
    public static class154[][] field5033;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        ++field5036;
        this.field5041 = this.field5032 - this.field5039;
        if (arg0) {
            method2238(64, -57, (class452) null);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field5044;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (arg0 >= -87) {
            method2241(-80, (byte) -3, -46);
        }
        if (super.field9355.field3728) {
            int[] var4 = this.method3744(arg1, (byte) 122, 0);
            for (int var5 = 0; ~class77.field1455 < ~var5; ++var5) {
                var3[var5] = this.field5039 - -(var4[var5] * this.field5041 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILrca;)Z")
    public static final boolean method2238(int arg0, int arg1, class452 arg2) {
        ++field5037;
        int var3 = arg2.method2686(-9380, 2);
        if (arg1 != -6154) {
            field5047 = null;
        }
        if (var3 == 0) {
            if (~arg2.method2686(-9380, 1) != -1) {
                method2238(arg0, arg1, arg2);
            }
            int var4 = arg2.method2686(-9380, 6);
            int var5 = arg2.method2686(-9380, 6);
            boolean var6 = arg2.method2686(-9380, 1) == 1;
            if (var6) {
                class498.field7097[class401.field5603++] = arg0;
            }
            if (class165.field2442[arg0] != null) {
                throw new RuntimeException("hr:lr");
            } else {
                class702 var7 = class722.field10086[arg0];
                class349 var8 = class165.field2442[arg0] = new class349();
                var8.field931 = arg0;
                if (class196.field2807[arg0] != null) {
                    var8.method2200(-5061, class196.field2807[arg0]);
                }
                var8.method462(var7.field9858, true, arg1 + 6153);
                var8.field967 = var7.field9852;
                int var9 = var7.field9855;
                int var10 = var9 >> 28;
                int var11 = var9 >> 14 & 255;
                int var12 = 255 & var9;
                int var13 = (var11 << 6) - -var4 + -class115.field1845;
                int var14 = (var12 << 6) + -class64.field1160 + var5;
                var8.field4926 = var7.field9851;
                var8.field986[0] = class50.field735[arg0];
                var8.field649 = var8.field659 = (byte) var10;
                if (class634.method3647(-123, var14, var13)) {
                    ++var8.field659;
                }
                var8.method2195(false, var14, var13);
                var8.field4893 = false;
                class722.field10086[arg0] = null;
                return true;
            }
        } else if (~var3 == -2) {
            int var15 = arg2.method2686(-9380, 2);
            int var16 = class722.field10086[arg0].field9855;
            class722.field10086[arg0].field9855 = ((3 & (var16 >> 28) + var15) << 28) - -(268435455 & var16);
            return false;
        } else if (~var3 == -3) {
            int var17 = arg2.method2686(-9380, 5);
            int var18 = var17 >> 3;
            int var19 = 7 & var17;
            int var20 = class722.field10086[arg0].field9855;
            int var21 = (var20 >> 28) + var18 & 3;
            int var22 = (4185002 & var20) >> 14;
            int var23 = 255 & var20;
            if (var19 == 0) {
                --var22;
                --var23;
            }
            if (~var19 == -2) {
                --var23;
            }
            if (~var19 == -3) {
                --var23;
                ++var22;
            }
            if (var19 == 3) {
                --var22;
            }
            if (~var19 == -5) {
                ++var22;
            }
            if (~var19 == -6) {
                ++var23;
                --var22;
            }
            if (var19 == 6) {
                ++var23;
            }
            if (var19 == 7) {
                ++var22;
                ++var23;
            }
            class722.field10086[arg0].field9855 = (var21 << 28) - (-(var22 << 14) - var23);
            return false;
        } else {
            int var24 = arg2.method2686(arg1 + -3226, 18);
            int var25 = var24 >> 16;
            int var26 = (var24 & 65361) >> 8;
            int var27 = var24 & 255;
            int var28 = class722.field10086[arg0].field9855;
            int var29 = 3 & (var28 >> 28) + var25;
            int var30 = (var28 >> 14) + var26 & 255;
            int var31 = var27 + var28 & 255;
            class722.field10086[arg0].field9855 = (var29 << 28) + (var30 << 14) - -var31;
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZB)Lvw;")
    public static final class304 method2239(int arg0, boolean arg1, byte arg2) {
        ++field5034;
        if (arg2 < 119) {
            field5045 = null;
        }
        class747[] var3 = class42.field638;
        synchronized (class42.field638) {
            class304 var4;
            if (~class42.field638.length < ~arg0 && !class42.field638[arg0].method4154(7)) {
                var4 = (class304) class42.field638[arg0].method4155(3);
                var4.method909(-101);
                int var10002 = class248.field3476[arg0]--;
            } else {
                var4 = new class304();
                var4.field4298 = new class243[arg0];
                for (int var5 = 0; ~var5 > ~arg0; ++var5) {
                    var4.field4298[var5] = new class243();
                }
            }
            var4.field4296 = arg1;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(Z)V")
    public static void method2240(boolean arg0) {
        field5046 = null;
        field5043 = null;
        field5047 = null;
        field5033 = null;
        if (!arg0) {
            field5045 = null;
        }
        field5045 = null;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IBI)Z")
    public static final boolean method2241(int arg0, byte arg1, int arg2) {
        if (arg1 < 53) {
            return false;
        } else {
            ++field5038;
            return class154.method1180((byte) -67, arg2, arg0) || class102.method892(arg2, arg0, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 == 3) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        super.field9344 = ~arg0.method273(255) == -2;
                    }
                } else {
                    this.field5032 = arg0.method253(-13900);
                }
            } else {
                this.field5039 = arg0.method253(-13900);
            }
            ++field5035;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method777(boolean arg0, int arg1) {
        ++field5040;
        if (arg0) {
            method2241(-100, (byte) 116, -61);
        }
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (super.field9357.field5178) {
            int[][] var4 = this.method3748(arg1, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class77.field1455 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field5041 >> 12) + this.field5039;
                var9[var11] = (var6[var11] * this.field5041 >> 12) + this.field5039;
                var10[var11] = this.field5039 - -(var7[var11] * this.field5041 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class359() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[Ldm;I)V")
    public static final void method2242(int arg0, class50[] arg1, int arg2) {
        for (int var3 = arg0; var3 < arg1.length; ++var3) {
            class50 var4 = arg1[var3];
            if (var4 != null) {
                if (~var4.field765 == -1) {
                    if (var4.field863 != null) {
                        method2242(arg0, var4.field863, arg2);
                    }
                    class548 var5 = (class548) class310.field4383.method4203(true, (long) var4.field792);
                    if (var5 != null) {
                        class425.method2588(arg2, arg0 ^ -2, var5.field7723);
                    }
                }
                if (arg2 == 0 && var4.field788 != null) {
                    class604 var6 = new class604();
                    var6.field8773 = var4.field788;
                    var6.field8782 = var4;
                    class357.method2223(var6);
                }
                if (~arg2 == -2 && var4.field752 != null) {
                    if (var4.field807 >= 0) {
                        class50 var7 = class545.method3220(65535, var4.field792);
                        if (var7 == null || var7.field863 == null || var7.field863.length <= var4.field807 || var7.field863[var4.field807] != var4) {
                            continue;
                        }
                    }
                    class604 var8 = new class604();
                    var8.field8782 = var4;
                    var8.field8773 = var4.field752;
                    class357.method2223(var8);
                }
            }
        }
        ++field5042;
    }
}
