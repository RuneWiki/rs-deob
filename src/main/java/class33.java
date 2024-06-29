import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class33 extends class199 {

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    private int field409 = 0;

    @OriginalMember(owner = "client!cf", name = "fb", descriptor = "I")
    private int field419 = 4096;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "[[I")
    public static int[][] field411 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "F")
    public static float field408 = 0.0F;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "Lwf;")
    public static class333 field410 = null;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!cf", name = "bb", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!cf", name = "cb", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!cf", name = "db", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!cf", name = "eb", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!cf", name = "ab", descriptor = "J")
    public static long field414;

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 5)
    public class33() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIIZI)V", line = 12)
    public static final void method209(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        int var5 = -6 % ((arg1 + 4) / 51);
        field417++;
        class172.method1269(arg0, arg4, arg2, class217.field3063.length - 1, arg3, 0, 1);
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V", line = 22)
    public static void method210(int arg0) {
        field410 = null;
        field411 = (int[][]) null;
        if (arg0 != 128) {
            field408 = -0.33160633F;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([ILp;[II[I)V", line = 40)
    public static final void method211(int[] arg0, class169 arg1, int[] arg2, int arg3, int[] arg4) {
        field413++;
        for (int var5 = arg3; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg2[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg1.field4859.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field4859[var9] = null;
                    } else {
                        class314 var10 = class207.method1516(var6, 120);
                        int var11 = var10.field4626;
                        class274 var12 = arg1.field4859[var9];
                        if (var12 != null) {
                            if (var12.field3920 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field4859[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3931 = 0;
                                    var12.field3929 = 1;
                                    var12.field3924 = 0;
                                    var12.field3925 = var8;
                                    var12.field3927 = 0;
                                    class296.method2025(var10, arg1.field4893, arg1.field4855, 0, false, false);
                                } else if (var11 == 2) {
                                    var12.field3931 = 0;
                                }
                            } else if (var10.field4638 >= class207.method1516(var12.field3920, arg3 ^ 0x77).field4638) {
                                var12 = arg1.field4859[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class274 var13 = arg1.field4859[var9] = new class274();
                            var13.field3920 = var6;
                            var13.field3927 = 0;
                            var13.field3924 = 0;
                            var13.field3929 = 1;
                            var13.field3931 = 0;
                            var13.field3925 = var8;
                            class296.method2025(var10, arg1.field4893, arg1.field4855, 0, false, false);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(B)V", line = 135)
    public static final void method212(byte arg0) {
        class240.field3488.method2262(false);
        field406++;
        if (arg0 != 99) {
            field414 = -25L;
        }
        class293.field4260.method2262(false);
        class347.field5393.method2262(false);
    }

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)I", line = 148)
    public static final int method213(int arg0) {
        field416++;
        if (class117.field1519 != null) {
            return 3;
        } else if (class47.field623 && class212.field2996) {
            return 2;
        } else {
            int var1 = -82 % ((arg0 + 81) / 41);
            return class47.field623 && !class212.field2996 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lfh;I)I", line = 169)
    public static final int method214(class140 arg0, int arg1) {
        field418++;
        int var2 = 0;
        if (arg0.method1076(class96.field1262, 125)) {
            var2++;
        }
        if (arg0.method1076(class194.field2679, 72)) {
            var2++;
        }
        if (arg0.method1076(class137.field1873, 73)) {
            var2++;
        }
        if (arg0.method1076(class229.field3288, 80)) {
            var2++;
        }
        if (arg0.method1076(class115.field1481, 105)) {
            var2++;
        }
        if (arg0.method1076(class56.field722, 76)) {
            var2++;
        }
        int var3 = 79 % ((-arg1 - 22) / 61);
        if (arg0.method1076(class35.field426, 110)) {
            var2++;
        }
        if (arg0.method1076(class205.field2859, 111)) {
            var2++;
        }
        if (arg0.method1076(class287.field4156, 103)) {
            var2++;
        }
        if (arg0.method1076(class48.field639, 114)) {
            var2++;
        }
        if (arg0.method1076(class319.field4696, 94)) {
            var2++;
        }
        if (arg0.method1076(class95.field1241, 82)) {
            var2++;
        }
        if (arg0.method1076(class306.field4481, 114)) {
            var2++;
        }
        if (arg0.method1076(class125.field1654, 62)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLfd;I)V", line = 246)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field409 = arg1.method2083((byte) -84);
        } else if (arg2 == 1) {
            this.field419 = arg1.method2083((byte) -49);
        } else if (arg2 == 2) {
            this.field2795 = arg1.method2096((byte) -122) == 1;
        }
        if (arg0 != -43) {
            field410 = (class333) null;
        }
        field415++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I", line = 287)
    public final int[] method190(int arg0, int arg1) {
        field412++;
        if (arg0 != -1735) {
            field410 = (class333) null;
        }
        int[] var3 = this.field2802.method2502(arg1, arg0 ^ 0xFFFFF95C);
        if (this.field2802.field5637) {
            int[] var4 = this.method1467(-7764, arg1, 0);
            for (int var5 = 0; var5 < class95.field1235; var5++) {
                int var6 = var4[var5];
                if (this.field409 > var6) {
                    var3[var5] = this.field409;
                } else if (var6 > this.field419) {
                    var3[var5] = this.field419;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)[[I", line = 339)
    public final int[][] method215(int arg0, int arg1) {
        int[][] var3 = this.field2796.method2187(arg0, -59);
        field407++;
        if (this.field2796.field4667) {
            int[][] var4 = this.method1459(0, arg0, (byte) -51);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class95.field1235; var11++) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var8[var11];
                if (var13 < this.field409) {
                    var7[var11] = this.field409;
                } else if (var13 <= this.field419) {
                    var7[var11] = var13;
                } else {
                    var7[var11] = this.field419;
                }
                if (this.field409 > var12) {
                    var9[var11] = this.field409;
                } else if (this.field419 < var12) {
                    var9[var11] = this.field419;
                } else {
                    var9[var11] = var12;
                }
                if (this.field409 > var14) {
                    var10[var11] = this.field409;
                } else if (var14 <= this.field419) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field419;
                }
            }
        }
        return arg1 == -29869 ? var3 : (int[][]) ((int[][]) null);
    }
}
