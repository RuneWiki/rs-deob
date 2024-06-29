import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class84 extends class154 {

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    private int field1316 = 585;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field1314 = -1;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "Leg;")
    public static class37 field1317 = class174.method1167("hint_mapedge", -45);

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "[Leg;")
    public static class37[] field1320 = new class37[100];

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "[S")
    public static short[] field1325 = new short[256];

    @OriginalMember(owner = "client!fa", name = "kb", descriptor = "Lpa;")
    public static class140 field1327 = new class140(16);

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!fa", name = "jb", descriptor = "Luf;")
    public static class169 field1326;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        if (arg1 != 1075962732) {
            field1320 = null;
        }
        int[] var3 = super.field2574.method206(arg0, arg1 + -1075952500);
        ++field1318;
        if (super.field2574.field536) {
            int var4 = class62.field1029[arg0];
            for (int var5 = 0; ~class227.field3898 < ~var5; ++var5) {
                int var6 = class239.field4263[var5];
                if (~this.field1316 > ~var6 && 4096 - this.field1316 > var6 && var4 > -this.field1316 + 2048 && ~(2048 - -this.field1316) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1316 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field1316 + 2048 && 2048 - -this.field1316 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field1316;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1316 + 2048);
                } else if (~this.field1316 >= ~var4 && ~(-this.field1316 + 4096) <= ~var4) {
                    if (~var6 <= ~this.field1316 && var6 <= -this.field1316 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1316 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field1316;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1316 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class84() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V")
    public static final void method558(int arg0, byte arg1) {
        if (arg1 != 121) {
            method559((byte) 95);
        }
        ++field1324;
        class274 var2 = class166.method1116(12, arg0, true);
        var2.method1840(10000);
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
    public static void method559(byte arg0) {
        if (arg0 != 25) {
            method562(-110, 26, 5, -20, true, false, -17);
        }
        field1317 = null;
        field1320 = null;
        field1327 = null;
        field1325 = null;
        field1326 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lrk;B)V")
    public static final void method560(class14 arg0, byte arg1) {
        ++field1315;
        int var2 = 0;
        if (arg1 != 92) {
            field1321 = -109;
        }
        while (~class123.field2059.length < ~var2) {
            class123.field2059[var2] = 0;
            ++var2;
        }
        short var3 = 256;
        for (int var4 = 0; ~var4 > -5001; ++var4) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class123.field2059[var16] = (int) (284.0D * Math.random());
        }
        for (int var5 = 0; var5 < 20; ++var5) {
            for (int var12 = 1; ~var12 > ~(var3 + -1); ++var12) {
                for (int var14 = 1; ~var14 > -128; ++var14) {
                    int var15 = (var12 << 7) + var14;
                    class274.field4819[var15] = (class123.field2059[var15 - 128] + class123.field2059[var15 + 1] + class123.field2059[var15 + -1] + class123.field2059[var15 + 128]) / 4;
                }
            }
            int[] var13 = class123.field2059;
            class123.field2059 = class274.field4819;
            class274.field4819 = var13;
        }
        if (arg0 != null) {
            int var6 = 0;
            for (int var7 = 0; ~arg0.field3529 < ~var7; ++var7) {
                for (int var8 = 0; var8 < arg0.field3527; ++var8) {
                    if (arg0.field216[var6++] != 0) {
                        int var9 = var8 + 16 + arg0.field3526;
                        int var10 = var7 + 16 + arg0.field3520;
                        int var11 = var9 - -(var10 << 7);
                        class123.field2059[var11] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 == -14015) {
            if (~arg2 == -1) {
                this.field1316 = arg0.method1244(false);
            }
            ++field1319;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V")
    public static final void method561() {
        for (int var0 = 0; var0 < class224.field3839; ++var0) {
            class27 var1 = class134.field2320[var0];
            class173.method1160(var1);
            class134.field2320[var0] = null;
        }
        class224.field3839 = 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIZZI)V")
    public static final void method562(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        int var7 = -18 % ((-36 - arg2) / 45);
        if (~arg0 > ~arg1) {
            int var8 = (arg0 + arg1) / 2;
            int var9 = arg0;
            class17 var10 = class69.field1103[var8];
            class69.field1103[var8] = class69.field1103[arg1];
            class69.field1103[arg1] = var10;
            for (int var11 = arg0; var11 < arg1; ++var11) {
                if (class216.method1526(arg6, (byte) 111, var10, arg4, class69.field1103[var11], arg5, arg3) <= 0) {
                    class17 var12 = class69.field1103[var11];
                    class69.field1103[var11] = class69.field1103[var9];
                    class69.field1103[var9++] = var12;
                }
            }
            class69.field1103[arg1] = class69.field1103[var9];
            class69.field1103[var9] = var10;
            method562(arg0, var9 + -1, -98, arg3, arg4, arg5, arg6);
            method562(var9 + 1, arg1, -104, arg3, arg4, arg5, arg6);
        }
        ++field1322;
    }
}
