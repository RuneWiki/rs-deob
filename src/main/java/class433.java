import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class433 extends class325 {

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
    private int field6136;

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "I")
    private int field6137;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "I")
    private int field6140;

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "Laj;")
    public static class333 field6139;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)[[I", line = 4)
    public final int[][] method360(int arg0, byte arg1) {
        if (arg1 != -9) {
            return null;
        } else {
            ++field6135;
            int[][] var3 = super.field4733.method1251((byte) 84, arg0);
            if (super.field4733.field2369) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class261.field3874; ++var7) {
                    var4[var7] = this.field6137;
                    var5[var7] = this.field6140;
                    var6[var7] = this.field6136;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I)V", line = 45)
    private class433(int arg0) {
        super(0, false);
        this.method2629(0, arg0);
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V", line = 54)
    public class433() {
        this(0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILbba;)V", line = 57)
    public static final void method2625(int arg0, class124 arg1) {
        if (arg0 > -88) {
            method2625(15, (class124) null);
        }
        ++field6133;
        if (arg1.field1863 != null || arg1.field1877 != null) {
            boolean var2 = true;
            for (int var3 = 0; ~arg1.field1863.length < ~var3; ++var3) {
                int var4 = -1;
                if (arg1.field1863 != null) {
                    var4 = arg1.field1863[var3];
                }
                if (var4 == -1) {
                    if (!arg1.method1015(var3, (byte) 71, -1)) {
                        var2 = false;
                    }
                } else {
                    var2 = false;
                    boolean var5 = false;
                    boolean var6 = false;
                    int var10;
                    int var11;
                    if (~(-1073741824 & var4) == 1073741823) {
                        int var7 = var4 & 268435455;
                        int var8 = var7 >> 14;
                        int var9 = 16383 & var7;
                        var10 = arg1.field2257 - (-class121.field1765 + var8) * 512 + -256;
                        var11 = arg1.field2259 - ((-class230.field3147 + var9) * 512 + 256);
                    } else if (~(var4 & 32768) == -1) {
                        class174 var12 = (class174) class234.field3169.method3953((long) var4, 14);
                        if (var12 == null) {
                            arg1.method1015(var3, (byte) 71, -1);
                            continue;
                        }
                        class192 var13 = var12.field2336;
                        var11 = -var13.field2259 + arg1.field2259;
                        var10 = arg1.field2257 - var13.field2257;
                    } else {
                        int var14 = 32767 & var4;
                        class73 var15 = class599.field8149[var14];
                        if (var15 == null) {
                            arg1.method1015(var3, (byte) 71, -1);
                            continue;
                        }
                        var10 = -var15.field2257 + arg1.field2257;
                        var11 = arg1.field2259 - var15.field2259;
                    }
                    if (~var10 != -1 || ~var11 != -1) {
                        arg1.method1015(var3, (byte) 71, 16383 & (int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D));
                    }
                }
            }
            if (var2) {
                arg1.field1863 = null;
                arg1.field1877 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)V", line = 166)
    public static final void method2626(int arg0, byte arg1, int arg2) {
        ++field6134;
        class186.method1293(0, arg0, arg2);
        if (arg1 >= -105) {
            method2626(-20, (byte) 70, -58);
        }
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(B)V", line = 178)
    public static void method2627(byte arg0) {
        field6139 = null;
        int var1 = -119 / ((arg0 - -4) / 50);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljp;IB)V", line = 187)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.method2629(0, arg0.method2373(1223262424));
        }
        if (arg2 >= -41) {
            field6139 = null;
        }
        ++field6138;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIII[B)Z", line = 213)
    public static final boolean method2628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ++field6141;
        if (arg5 != 31292) {
            field6139 = null;
        }
        int var7 = arg0 % arg2;
        int var8;
        if (var7 != 0) {
            var8 = -var7 + arg2;
        } else {
            var8 = 0;
        }
        int var9 = -((arg1 - (-arg2 - -1)) / arg2);
        int var10 = -((arg2 - 1 + arg0) / arg2);
        for (int var11 = var9; var11 < 0; ++var11) {
            for (int var12 = var10; ~var12 > -1; ++var12) {
                if (arg6[arg4] == 0) {
                    return true;
                }
                arg4 += arg2;
            }
            int var13 = arg4 - var8;
            if (arg6[var13 + -1] == 0) {
                return true;
            }
            arg4 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V", line = 265)
    private final void method2629(int arg0, int arg1) {
        this.field6140 = 4080 & arg1 >> 4;
        ++field6142;
        this.field6137 = (16711680 & arg1) >> 12;
        this.field6136 = arg1 << 4 & 4080;
        if (arg0 != 0) {
            method2627((byte) 69);
        }
    }
}
