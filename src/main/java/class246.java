import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class246 extends class154 {

    @OriginalMember(owner = "client!jk", name = "cb", descriptor = "I")
    public static int field4420 = 0;

    @OriginalMember(owner = "client!jk", name = "ab", descriptor = "Leg;")
    private static class37 field4418 = class174.method1167("green:", 94);

    @OriginalMember(owner = "client!jk", name = "bb", descriptor = "Leg;")
    public static class37 field4419 = field4418;

    @OriginalMember(owner = "client!jk", name = "Z", descriptor = "Leg;")
    public static class37 field4417 = field4418;

    @OriginalMember(owner = "client!jk", name = "ib", descriptor = "Leg;")
    public static class37 field4426 = class174.method1167("_", 99);

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!jk", name = "Y", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!jk", name = "db", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!jk", name = "eb", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!jk", name = "fb", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!jk", name = "gb", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!jk", name = "hb", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class246() {
        super(3, false);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZIIII)V")
    public static final void method1692(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4425;
        int var6 = class139.method975(class286.field5050, true, arg4, class96.field1507);
        if (arg1) {
            field4420 = 24;
        }
        int var7 = class139.method975(class286.field5050, true, arg3, class96.field1507);
        int var8 = class139.method975(class178.field2972, true, arg2, class217.field3741);
        int var9 = class139.method975(class178.field2972, true, arg0, class217.field3741);
        for (int var10 = var6; var7 >= var10; ++var10) {
            class145.method1010(var9, var8, -25086, arg5, class210.field3617[var10]);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            super.field2579 = arg0.method1268(255) == 1;
        }
        ++field4415;
        if (arg1 != -14015) {
            field4419 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILge;)V")
    public static final void method1693(int arg0, class279 arg1) {
        ++field4416;
        class68.field1074 = arg1;
        if (arg0 != 219823489) {
            method1692(77, false, -50, -93, 55, 118);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        ++field4422;
        int[][] var3 = super.field2585.method1532(arg1, arg0 + -237);
        if (super.field2585.field3761) {
            int[] var4 = this.method1052(2, arg1, (byte) -70);
            int[][] var5 = this.method1054(0, 0, arg1);
            int[][] var6 = this.method1054(0, 1, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var5[0];
            int[] var11 = var6[0];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var5[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class227.field3898; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var9[var16] = var14[var16];
                    var8[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var11[var16] * var18 >> 12;
                    var9[var16] = var13[var16] * var18 + var14[var16] * var17 >> 12;
                    var8[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                } else {
                    var7[var16] = var11[var16];
                    var9[var16] = var13[var16];
                    var8[var16] = var15[var16];
                }
            }
        }
        if (arg0 != 115) {
            method1696(115, -59, 56, -122, -65);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V")
    public static void method1694(int arg0) {
        field4417 = null;
        field4418 = null;
        field4426 = null;
        int var1 = -32 / ((47 - arg0) / 59);
        field4419 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZII)Lod;")
    public static final class190 method1695(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            field4426 = null;
        }
        class190 var4 = new class190();
        ++field4424;
        var4.field3259 = arg2;
        var4.field3270 = arg3;
        class120.field2022.method986(var4, (long) arg0, -1);
        class214.method1521(arg2, true);
        class237 var5 = class156.method1066(-73, arg0);
        if (var5 != null) {
            class121.method856(24665, var5);
        }
        if (class224.field3840 != null) {
            class121.method856(24665, class224.field3840);
            class224.field3840 = null;
        }
        int var6 = class159.field2661;
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            if (class191.method1321(class264.field4642[var7], -7129)) {
                class27.method157(var7, (byte) -30);
            }
        }
        if (~class159.field2661 != -2) {
            class171.method1151(class62.field1011, class137.field2348, class160.field2676, -30822, class146.field2482);
            int var8 = class180.field3002.method1211(class131.field2192);
            for (int var9 = 0; ~class159.field2661 < ~var9; ++var9) {
                int var10 = class180.field3002.method1211(class132.method945(var9, 122));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class137.field2348 = var8 + 8;
            class146.field2482 = class159.field2661 * 15 + 22;
        } else {
            class152.field2556 = false;
            class171.method1151(class62.field1011, class137.field2348, class160.field2676, -30822, class146.field2482);
        }
        if (var5 != null) {
            class272.method1823(116, false, var5);
        }
        class202.method1405(13046, arg2);
        if (~class234.field4044 != 0) {
            class175.method1175(-499336730, class234.field4044, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V")
    public static final void method1696(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 94) {
            field4418 = null;
        }
        int var5 = -arg3;
        ++field4423;
        class145.method1010(arg4 - -arg3, -arg3 + arg4, -25086, arg0, class210.field3617[arg1]);
        int var6 = -1;
        int var7 = 0;
        int var8 = arg3;
        while (~var8 < ~var7) {
            var6 += 2;
            var5 += var6;
            ++var7;
            if (~var5 <= -1) {
                --var8;
                int[] var9 = class210.field3617[arg1 + var8];
                var5 -= var8 << 1;
                int var10 = arg4 - var7;
                int[] var11 = class210.field3617[-var8 + arg1];
                int var12 = arg4 + var7;
                class145.method1010(var12, var10, -25086, arg0, var9);
                class145.method1010(var12, var10, -25086, arg0, var11);
            }
            int var13 = arg4 - -var8;
            int[] var14 = class210.field3617[arg1 - -var7];
            int[] var15 = class210.field3617[-var7 + arg1];
            int var16 = -var8 + arg4;
            class145.method1010(var13, var16, -25086, arg0, var14);
            class145.method1010(var13, var16, -25086, arg0, var15);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        int[] var3 = super.field2574.method206(arg0, arg1 + -1075952500);
        if (super.field2574.field536) {
            int[] var4 = this.method1052(0, arg0, (byte) -37);
            int[] var5 = this.method1052(1, arg0, (byte) -33);
            int[] var6 = this.method1052(2, arg0, (byte) -126);
            for (int var7 = 0; class227.field3898 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        ++field4421;
        if (arg1 != 1075962732) {
            this.method142((class187) null, 101, 20);
        }
        return var3;
    }
}
