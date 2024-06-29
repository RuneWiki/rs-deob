import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class141 extends class175 {

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    private int field2529 = 2048;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    private int field2522 = 1024;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "I")
    private int field2531 = 3072;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    public static int field2519 = -1;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    public static int field2524 = -1;

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "Lmb;")
    public static class96 field2528 = class243.method1708("Schlie-8en", (byte) 118);

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "Lmj;")
    public static class246 field2526;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        if (arg1 != 64) {
            this.method77(-61, 113);
        }
        int[][] var3 = super.field3035.method637(arg0, false);
        ++field2518;
        if (super.field3035.field1493) {
            int[][] var4 = this.method1253(arg0, -2880, 0);
            int[] var5 = var3[0];
            int[] var6 = var4[0];
            int[] var7 = var3[1];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            for (int var11 = 0; ~class1.field11 < ~var11; ++var11) {
                var5[var11] = (var6[var11] * this.field2529 >> 12) + this.field2522;
                var7[var11] = (var10[var11] * this.field2529 >> 12) + this.field2522;
                var9[var11] = (var8[var11] * this.field2529 >> 12) + this.field2522;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int[] var3 = super.field3044.method904((byte) -117, arg1);
        ++field2527;
        if (super.field3044.field2150) {
            int[] var4 = this.method1255(0, arg1, 128);
            for (int var5 = 0; ~class1.field11 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field2529 >> 12) + this.field2522;
            }
        }
        int var6 = 31 / ((62 - arg0) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        this.field2529 = -this.field2522 + this.field2531;
        ++field2521;
        if (arg0 != 2) {
            this.method1((byte) -99, -78);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lw;I)V")
    public static final void method1043(class107 arg0, int arg1) {
        if (arg1 != 24258) {
            field2525 = -59;
        }
        ++field2517;
        int var2 = arg0.field1869;
        if (var2 == 324) {
            if (~class39.field679 == 0) {
                class54.field938 = arg0.field1968;
                class39.field679 = arg0.field1882;
            }
            if (!class19.field316.field3243) {
                arg0.field1882 = class54.field938;
            } else {
                arg0.field1882 = class39.field679;
            }
        } else if (~var2 == -326) {
            if (class39.field679 == -1) {
                class39.field679 = arg0.field1882;
                class54.field938 = arg0.field1968;
            }
            if (class19.field316.field3243) {
                arg0.field1882 = class54.field938;
            } else {
                arg0.field1882 = class39.field679;
            }
        } else if (var2 == 327) {
            arg0.field1969 = 150;
            arg0.field1840 = (int) (Math.sin((double) class236.field4053 / 40.0D) * 256.0D) & 2047;
            arg0.field1947 = 5;
            arg0.field1847 = -1;
        } else if (~var2 == -329) {
            if (class236.field4047.field828 == null) {
                arg0.field1847 = 0;
            } else {
                arg0.field1969 = 150;
                arg0.field1840 = 2047 & (int) (256.0D * Math.sin((double) class236.field4053 / 40.0D));
                arg0.field1947 = 5;
                arg0.field1847 = 2047 + ((int) class236.field4047.field828.method685((byte) 118) << 11);
                arg0.field1888 = class236.field4047.field4573;
                arg0.field1952 = class236.field4047.field4536;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ldh;B)V")
    public static final void method1044(class116 arg0, byte arg1) {
        ++field2515;
        class187.method1322((byte) 92, 200000, arg0);
        if (arg1 != 76) {
            method1047(false);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)I")
    public static final int method1045(int arg0, int arg1) {
        if (arg0 != 27935) {
            method1046((class96) null, -81, 53);
        }
        ++field2516;
        return 7 & arg1 >> 18;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class141() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lmb;II)V")
    public static final void method1046(class96 arg0, int arg1, int arg2) {
        ++field2520;
        class43 var3 = class270.method1847(arg2, -10277, 2);
        if (arg1 != 8392) {
            method1044((class116) null, (byte) 18);
        }
        var3.method333(-128);
        var3.field745 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V")
    public static void method1047(boolean arg0) {
        field2528 = null;
        field2526 = null;
        if (arg0) {
            field2519 = 8;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field2523;
        int var4 = -90 % ((-22 - arg0) / 58);
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field3034 = arg2.method1651(4139) == 1;
                }
            } else {
                this.field2531 = arg2.method1663((byte) -110);
            }
        } else {
            this.field2522 = arg2.method1663((byte) -91);
        }
    }
}
