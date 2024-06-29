import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class42 extends class214 {

    @OriginalMember(owner = "client!ts", name = "M", descriptor = "I")
    private int field712 = 1024;

    @OriginalMember(owner = "client!ts", name = "O", descriptor = "I")
    private int field714 = 2048;

    @OriginalMember(owner = "client!ts", name = "J", descriptor = "I")
    private int field709 = 3072;

    @OriginalMember(owner = "client!ts", name = "T", descriptor = "Z")
    public static boolean field719 = false;

    @OriginalMember(owner = "client!ts", name = "S", descriptor = "[I")
    public static int[] field718 = new int[1024];

    @OriginalMember(owner = "client!ts", name = "R", descriptor = "I")
    public static int field717 = 0;

    @OriginalMember(owner = "client!ts", name = "Y", descriptor = "[I")
    public static int[] field724 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ts", name = "U", descriptor = "I")
    public static int field720 = -50;

    @OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!ts", name = "L", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!ts", name = "N", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!ts", name = "P", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!ts", name = "Q", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!ts", name = "V", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!ts", name = "W", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!ts", name = "X", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!ts", name = "Z", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V", line = 342)
    public class42() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BI)[I", line = 19)
    public final int[] method14(byte arg0, int arg1) {
        ++field715;
        if (arg0 != 123) {
            return null;
        } else {
            int[] var3 = super.field3024.method2585(arg1, arg0 + -123);
            if (super.field3024.field6135) {
                int[] var4 = this.method1352(arg1, 0, -115);
                for (int var5 = 0; ~var5 > ~class399.field5585; ++var5) {
                    var3[var5] = (var4[var5] * this.field714 >> 12) + this.field712;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(Z)V", line = 51)
    public static void method348(boolean arg0) {
        field724 = null;
        field718 = null;
        if (!arg0) {
            method353(63, (class187) null, -44, (class487) null, -38, -4, 93);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 64)
    public static final int method349(String arg0, int arg1) {
        ++field716;
        if (arg1 != 1) {
            field718 = null;
        }
        return 1 + arg0.length();
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZLjava/lang/String;Llk;)I", line = 76)
    public static final int method350(boolean arg0, String arg1, class425 arg2) {
        ++field711;
        int var3 = arg2.field5830;
        if (arg0) {
            method348(false);
        }
        byte[] var4 = class309.method1868(arg1, (byte) -108);
        arg2.method2482(var4.length, (byte) 65);
        arg2.field5830 += class349.field4779.method2605(var4, 0, arg2.field5886, arg2.field5830, var4.length, (byte) 108);
        return -var3 + arg2.field5830;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IB)[[I", line = 95)
    public final int[][] method11(int arg0, byte arg1) {
        ++field723;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (super.field3030.field6644) {
            int[][] var4 = this.method1354(0, arg0, (byte) 23);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class399.field5585 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field714 >> 12) + this.field712;
                var9[var11] = (var6[var11] * this.field714 >> 12) + this.field712;
                var10[var11] = (var7[var11] * this.field714 >> 12) + this.field712;
            }
        }
        if (arg1 != 92) {
            this.method12(-95);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(IB)V", line = 141)
    public static final void method351(int arg0, byte arg1) {
        ++field710;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        int var2 = -12 % ((arg1 - -43) / 36);
        class478.field6757 = arg0;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)V", line = 165)
    public static final void method352(byte arg0) {
        ++field722;
        if (~class168.field2494 >= -1) {
            class228.field3232 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; class345.field4714.length > var2; ++var2) {
                if (class345.field4714[var2].startsWith("--> ")) {
                    ++var1;
                    if (~class168.field2494 == ~var1) {
                        class228.field3232 = class345.field4714[var2].substring(4);
                        break;
                    }
                }
            }
        }
        if (arg0 != -75) {
            field719 = false;
        }
    }

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)V", line = 197)
    public final void method12(int arg0) {
        this.field714 = this.field709 - this.field712;
        if (arg0 != 27108) {
            method349((String) null, -92);
        }
        ++field725;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILbc;ILkm;III)V", line = 208)
    public static final void method353(int arg0, class187 arg1, int arg2, class487 arg3, int arg4, int arg5, int arg6) {
        ++field721;
        if (class430.field5926 < 100) {
            class373.method2236((byte) 104, arg3, arg1);
        }
        arg3.method1094(arg4, arg6, arg2 + arg4, arg5 + arg6);
        if (class430.field5926 < 100) {
            byte var7 = 20;
            int var8 = arg4 - -(arg2 / 2);
            int var9 = arg6 - var7 + arg5 / 2 + -18;
            arg3.method1107(arg4, arg6, arg2, arg5, -16777216, 0);
            arg3.method1076(var8 + -152, var9, 304, 34, class18.field292[class376.field5320].getRGB(), 0);
            arg3.method1107(var8 + -150, var9 + 2, class430.field5926 * 3, 30, class410.field5688[class376.field5320].getRGB(), 0);
            class211.field2981.method2849((byte) -42, var8, class327.field4522[class376.field5320].getRGB(), -1, class460.field6477.method695(arg0 + 65416, class487.field6867), var7 + var9);
        } else {
            int var10 = class192.field2753 - (int) ((float) arg2 / class379.field5372);
            if (arg0 != -65537) {
                method353(111, (class187) null, -20, (class487) null, -18, -122, -37);
            }
            int var11 = class417.field5743 - -((int) ((float) arg5 / class379.field5372));
            int var12 = (int) ((float) arg2 / class379.field5372) + class192.field2753;
            class445.field6150 = (int) ((float) (arg2 * 2) / class379.field5372);
            int var13 = class417.field5743 - (int) ((float) arg5 / class379.field5372);
            class90.field1340 = -((int) ((float) arg2 / class379.field5372)) + class192.field2753;
            class75.field1135 = -((int) ((float) arg5 / class379.field5372)) + class417.field5743;
            class343.field4665 = (int) ((float) (arg5 * 2) / class379.field5372);
            class379.method2263(class379.field5393 + var10, var11 - -class379.field5379, class379.field5393 + var12, var13 - -class379.field5379, arg4, arg6, arg2 + arg4, arg5 + arg6 + 1);
            class379.method2266(arg3);
            class249 var14 = class379.method2269(arg3);
            class294.method1815(var14, 0, 0, -60, arg3);
            if (~class175.field2588 < -1) {
                --class3.field29;
                if (~class3.field29 == -1) {
                    class3.field29 = 20;
                    --class175.field2588;
                }
            }
            if (class321.field4385) {
                int var15 = arg4 + -5 - -arg2;
                int var16 = arg5 + -8 + arg6;
                class262.field3662.method2838("Fps:" + class126.field1735, -1, var15, 0, var16, 16776960);
                int var20 = var16 - 15;
                Runtime var17 = Runtime.getRuntime();
                int var18 = (int) ((var17.totalMemory() + -var17.freeMemory()) / 1024L);
                int var19 = 16776960;
                if (~var18 < -65537) {
                    var19 = 16711680;
                }
                class262.field3662.method2838("Mem:" + var18 + "k", -1, var15, 0, var20, var19);
                var16 = var20 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Llk;II)V", line = 295)
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field713;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3032 = ~arg0.method2503(true) == -2;
                }
            } else {
                this.field709 = arg0.method2508(true);
            }
        } else {
            this.field712 = arg0.method2508(true);
        }
        if (arg1 >= -114) {
            field720 = 7;
        }
    }
}
