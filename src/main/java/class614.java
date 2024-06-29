import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public abstract class class614 extends class168 {

    @OriginalMember(owner = "client!cia", name = "p", descriptor = "[I")
    public static int[] field8485 = null;

    @OriginalMember(owner = "client!cia", name = "j", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!cia", name = "k", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!cia", name = "l", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!cia", name = "m", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!cia", name = "n", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!cia", name = "o", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)V")
    public static void method3435(byte arg0) {
        if (arg0 == -93) {
            field8485 = null;
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "([BZI)V")
    public static final void method3436(byte[] arg0, boolean arg1, int arg2) {
        if (arg2 < 5) {
            method3435((byte) 3);
        }
        if (class163.field2244 == null) {
            class163.field2244 = new class461(20000);
        }
        field8480++;
        class163.field2244.method2614(3, 0, arg0, arg0.length);
        if (!arg1) {
            return;
        }
        class419.method2342(false, class163.field2244.field6180);
        class411.field5232 = new class138[class163.field2243];
        int var3 = 0;
        for (int var4 = class227.field3004; var4 <= class461.field6215; var4++) {
            class138 var5 = class760.method4226(-42, var4);
            if (var5 != null) {
                class411.field5232[var3++] = var5;
            }
        }
        class644.field8922 = false;
        class76.field1066 = class446.method2525(500);
        class163.field2244 = null;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)J")
    public abstract long method1427(int arg0);

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)I")
    public abstract int method1426(int arg0);

    @OriginalMember(owner = "client!cia", name = "c", descriptor = "(I)I")
    public abstract int method1424(int arg0);

    @OriginalMember(owner = "client!cia", name = "e", descriptor = "(I)I")
    public abstract int method1428(int arg0);

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "(B)V")
    public static final void method3437(byte arg0) {
        field8482++;
        class748.field10451.method4150(class748.field10451.field10421, 1, -5);
        class748.field10451.method4150(class748.field10451.field10412, 1, -5);
        class748.field10451.method4150(class748.field10451.field10426, 1, -5);
        class748.field10451.method4150(class748.field10451.field10393, 1, -5);
        class748.field10451.method4150(class748.field10451.field10386, 1, -5);
        class748.field10451.method4150(class748.field10451.field10405, 1, -5);
        class748.field10451.method4150(class748.field10451.field10392, 0, -5);
        int var1 = 116 % ((arg0 + 9) / 48);
        class748.field10451.method4150(class748.field10451.field10390, 0, -5);
        class748.field10451.method4150(class748.field10451.field10406, 0, -5);
        class748.field10451.method4150(class748.field10451.field10410, 0, -5);
        class748.field10451.method4150(class748.field10451.field10420, 0, -5);
        class748.field10451.method4150(class748.field10451.field10427, 0, -5);
        class748.field10451.method4150(class748.field10451.field10414, 0, -5);
        class748.field10451.method4150(class748.field10451.field10418, 0, -5);
        class748.field10451.method4150(class748.field10451.field10389, 0, -5);
        class748.field10451.method4150(class748.field10451.field10409, 0, -5);
        class748.field10451.method4150(class748.field10451.field10436, 0, -5);
        class748.field10451.method4150(class748.field10451.field10422, 0, -5);
        class748.field10451.method4150(class748.field10451.field10416, 0, -5);
        class533.method3060(2);
        class748.field10451.method4150(class748.field10451.field10425, 2, -5);
        class748.field10451.method4150(class748.field10451.field10430, 2, -5);
        class421.method2346(true);
        class421.method2347((byte) -47);
        class508.field7164 = true;
    }

    @OriginalMember(owner = "client!cia", name = "e", descriptor = "(B)I")
    public abstract int method1425(byte arg0);

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IIIILhe;)Z")
    public static final boolean method3438(int arg0, int arg1, int arg2, int arg3, class374 arg4) {
        field8483++;
        int var5 = -78 % ((arg3 + 5) / 51);
        if (!client.field3984 || !class15.field304) {
            return false;
        } else if (class700.field9738 < 100) {
            return false;
        } else if (class571.method3277(arg2, arg0, 1, arg1)) {
            int var6 = arg0 << class480.field6531;
            int var7 = arg1 << class480.field6531;
            int var8 = class195.field2669[arg2].method1677(arg1, (byte) 69, arg0) - 1;
            int var9 = var8 + arg4.method87((byte) 121);
            if (arg4.field4794 == 1) {
                if (!class116.method907(var6, class699.field9729 + var7, var9, var6, var6, var7, var9, var7, (byte) 94, var8)) {
                    return false;
                } else if (class116.method907(var6, class699.field9729 + var7, var9, var6, var6, class699.field9729 + var7, var8, var7, (byte) 111, var8)) {
                    class684.field9530++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4794 == 2) {
                if (!class116.method907(var6 + class699.field9729, var7 - -class699.field9729, var9, var6, var6, class699.field9729 + var7, var9, class699.field9729 + var7, (byte) 98, var8)) {
                    return false;
                } else if (class116.method907(class699.field9729 + var6, class699.field9729 + var7, var8, var6, class699.field9729 + var6, class699.field9729 + var7, var9, class699.field9729 + var7, (byte) 46, var8)) {
                    class684.field9530++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4794 == 4) {
                if (!class116.method907(class699.field9729 + var6, var7 - -class699.field9729, var9, var6 + class699.field9729, class699.field9729 + var6, var7, var9, var7, (byte) 40, var8)) {
                    return false;
                } else if (class116.method907(var6 + class699.field9729, var7 - -class699.field9729, var9, class699.field9729 + var6, class699.field9729 + var6, var7 + class699.field9729, var8, var7, (byte) 120, var8)) {
                    class684.field9530++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4794 == 8) {
                if (!class116.method907(var6 + class699.field9729, var7, var9, var6, var6, var7, var9, var7, (byte) 78, var8)) {
                    return false;
                } else if (class116.method907(class699.field9729 + var6, var7, var8, var6, class699.field9729 + var6, var7, var9, var7, (byte) 74, var8)) {
                    class684.field9530++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4794 == 16) {
                if (class25.method170(-123, var8, class139.field1991 + var7, var6, class139.field1991, var9, class139.field1991)) {
                    class684.field9530++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4794 == 32) {
                if (class25.method170(-125, var8, class139.field1991 + var7, class139.field1991 + var6, class139.field1991, var9, class139.field1991)) {
                    class684.field9530++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4794 == 64) {
                if (class25.method170(-125, var8, var7, class139.field1991 + var6, class139.field1991, var9, class139.field1991)) {
                    class684.field9530++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field4794 != 128) {
                return true;
            } else if (class25.method170(-122, var8, var7, var6, class139.field1991, var9, class139.field1991)) {
                class684.field9530++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(BIILria;)V")
    public static final void method3439(byte arg0, int arg1, int arg2, class288 arg3) {
        field8479++;
        if (class617.field8508 != null || class14.field276 || arg3 == null || class588.method3337(arg3, 1) == null || arg0 >= -7) {
            return;
        }
        class617.field8508 = arg3;
        class302.field3957 = class588.method3337(arg3, 1);
        class698.field9721 = arg1;
        class147.field2050 = arg2;
        class363.field4685 = false;
        class564.field7933 = 0;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method3440(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != -106) {
            return;
        }
        field8484++;
        if (arg3 == arg8 && arg4 == arg9 && arg5 == arg7 && arg1 == arg6) {
            class61.method570(arg6, (byte) -66, arg3, arg5, arg2, arg4);
            return;
        }
        int var10 = arg3;
        int var11 = arg4;
        int var12 = arg3 * 3;
        int var13 = arg4 * 3;
        int var14 = arg8 * 3;
        int var15 = arg9 * 3;
        int var16 = arg7 * 3;
        int var17 = arg1 * 3;
        int var18 = arg5 + var14 - (var16 - -arg3);
        int var19 = var15 + arg6 - arg4 - var17;
        int var20 = var12 + var16 - var14 - var14;
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg3;
            int var34 = (var30 + var32 + var28 >> 12) + arg4;
            class61.method570(var34, (byte) -108, var10, var33, arg2, var11);
            var10 = var33;
            var11 = var34;
        }
    }
}
