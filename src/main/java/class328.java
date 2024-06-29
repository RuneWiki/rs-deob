import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class328 implements class221 {

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public int field4139;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "Ldq;")
    public static class493 field4141 = new class493(45, -1);

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field4143 = 0;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!cq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4140++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(JIBI)V")
    public static final void method1910(long arg0, int arg1, byte arg2, int arg3) {
        field4136++;
        if (arg2 != 94) {
            field4143 = 33;
        }
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = ((int) arg0 & 0x3D9509) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class456.method2708(var5, true, arg3, 0, arg1, 0, 0, arg2 ^ 0x7811, var6);
            return;
        }
        class102 var8 = class315.field4017.method1958(arg2 - 10185, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field1282;
            var9 = var8.field1272;
        } else {
            var9 = var8.field1282;
            var10 = var8.field1272;
        }
        int var11 = var8.field1302;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class456.method2708(0, true, arg3, var10, arg1, var11, var9, arg2 ^ 0x7811, 0);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIII)Lbf;")
    public static final class375 method1911(int arg0, int arg1, int arg2, int arg3) {
        field4138++;
        if (arg2 != 64) {
            field4143 = 31;
        }
        class490 var4 = class125.field1664[arg0][arg3][arg1];
        if (var4 == null) {
            return null;
        }
        class375 var5 = null;
        int var6 = -1;
        for (class376 var7 = var4.field7127; var7 != null; var7 = var7.field4952) {
            class205 var8 = var7.field4953;
            if (var8 instanceof class375) {
                class375 var9 = (class375) var8;
                int var10 = var9.method1366((byte) -92) * 64 - 4;
                int var11 = var9.field2666 - var10 >> 7;
                int var12 = var9.field2677 - var10 >> 7;
                int var13 = var9.field2666 + var10 >> 7;
                int var14 = var9.field2677 + var10 >> 7;
                if (var11 <= arg3 && arg1 >= var12 && arg3 <= var13 && arg1 <= var14) {
                    int var15 = (var13 + 1 - arg3) * (var14 + 1 - arg1);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZIIILma;ILhd;Lya;I)V")
    public static final void method1912(boolean arg0, int arg1, int arg2, int arg3, class10 arg4, int arg5, class523 arg6, class38 arg7, int arg8) {
        field4137++;
        class36 var9 = class505.field7281.method1620(arg1, 36);
        if (arg0) {
            field4143 = 40;
        }
        if (var9 == null || !var9.field457 || !var9.method265(class491.field7160, 17)) {
            return;
        }
        if (var9.field446 != null) {
            int[] var10 = new int[var9.field446.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var13;
                if (class142.field1835 == 4) {
                    var13 = (int) class463.field6626 & 0x3FFF;
                } else {
                    var13 = (int) class463.field6626 + class309.field3967 & 0x3FFF;
                }
                int var14 = class36.field443[var13];
                int var15 = class36.field478[var13];
                if (class142.field1835 != 4) {
                    var15 = var15 * 256 / (class317.field4050 + 256);
                    var14 = var14 * 256 / (class317.field4050 + 256);
                }
                var10[var11 * 2] = ((var9.field446[var11 * 2 + 1] * 4 + arg8) * var14 + ((var9.field446[var11 * 2] * 4 + arg2) * var15) >> 15) + arg6.field7617 / 2 + arg3;
                var10[var11 * 2 + 1] = arg5 + (arg6.field7574 / 2) - ((var9.field446[var11 * 2 + 1] * 4 + arg8) * var15 + -((var9.field446[var11 * 2] * 4 + arg2) * var14) >> 15);
            }
            class486.method2953(arg7, var10, var9.field441, arg6.field7663, arg6.field7642);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg7.method327(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field475, 1, arg4, arg3, arg5);
            }
            arg7.method327(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field475, 1, arg4, arg3, arg5);
        }
        class16 var16 = null;
        if (var9.field477 != -1) {
            var16 = var9.method256(120, false, arg7);
            if (var16 != null) {
                class284.method1678(arg5, (byte) 86, arg2, arg4, var16, arg3, arg8, arg6);
            }
        }
        if (var9.field451 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method137();
        }
        class316 var18 = class143.field1843;
        class297 var19 = class209.field2708;
        if (var9.field481 == 1) {
            var18 = class460.field6579;
            var19 = class159.field2030;
        }
        if (var9.field481 == 2) {
            var18 = class91.field1116;
            var19 = class274.field3437;
        }
        class422.method2478(arg2, arg4, var18, arg5, var19, arg3, var17, var9.field447, 16383, arg8, var9.field451, arg6);
        return;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static void method1913(int arg0) {
        field4141 = null;
        if (arg0 != 0) {
            method1911(24, -98, 73, 28);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V")
    public static final void method1914(int arg0, int arg1) {
        if (class176.field2324 == 0) {
            class155.field1965.method2664((byte) -78, arg0);
        } else {
            class1.field5 = arg0;
        }
        field4142++;
        if (arg1 != -19373) {
            field4141 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class328(String arg0, int arg1) {
        this.field4139 = arg1;
    }
}
