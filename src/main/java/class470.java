import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class470 extends class519 {

    @OriginalMember(owner = "client!dv", name = "A", descriptor = "S")
    public static short field6819 = 320;

    @OriginalMember(owner = "client!dv", name = "x", descriptor = "I")
    public static int field6816 = -1;

    @OriginalMember(owner = "client!dv", name = "F", descriptor = "Lap;")
    public static class335 field6824 = new class335("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!dv", name = "N", descriptor = "[Lcm;")
    public static class513[] field6831 = new class513[14];

    @OriginalMember(owner = "client!dv", name = "I", descriptor = "I")
    public static int field6826 = 765;

    @OriginalMember(owner = "client!dv", name = "C", descriptor = "B")
    public byte field6821;

    @OriginalMember(owner = "client!dv", name = "w", descriptor = "I")
    public int field6815;

    @OriginalMember(owner = "client!dv", name = "y", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!dv", name = "B", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!dv", name = "D", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!dv", name = "G", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!dv", name = "J", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!dv", name = "L", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!dv", name = "E", descriptor = "Lfh;")
    public class463 field6823;

    @OriginalMember(owner = "client!dv", name = "M", descriptor = "Lqn;")
    public static class47 field6830;

    @OriginalMember(owner = "client!dv", name = "K", descriptor = "[[[J")
    public static long[][][] field6828;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "(I)V", line = 3)
    public static void method2838(int arg0) {
        field6824 = null;
        field6831 = null;
        if (arg0 != 765) {
            field6825 = -56;
        }
        field6828 = null;
        field6830 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)[B", line = 17)
    public final byte[] method1951(int arg0) {
        ++field6817;
        if (!super.field7502 && ~(this.field6823.field6618.length + -this.field6821) >= ~this.field6823.field6631) {
            if (arg0 != 8) {
                method2838(-83);
            }
            return this.field6823.field6618;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I[I[ILrd;[I)V", line = 36)
    public static final void method2839(int arg0, int[] arg1, int[] arg2, class223 arg3, int[] arg4) {
        ++field6818;
        for (int var5 = 0; ~arg1.length < ~var5; ++var5) {
            int var6 = arg1[var5];
            int var7 = arg2[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (~var7 != -1 && ~arg3.field4909.length < ~var9) {
                if (~(var7 & 1) != -1) {
                    if (~var6 == 0) {
                        arg3.field4909[var9] = null;
                    } else {
                        class415 var10 = class404.field5756.method557(var6, 15);
                        int var11 = var10.field5931;
                        class203 var12 = arg3.field4909[var9];
                        if (var12 != null) {
                            if (~var12.field2638 != ~var6) {
                                if (var10.field5913 >= class404.field5756.method557(var12.field2638, 15).field5913) {
                                    var12 = arg3.field4909[var9] = null;
                                }
                            } else if (~var11 == -1) {
                                var12 = arg3.field4909[var9] = null;
                            } else if (~var11 != -2) {
                                if (var11 == 2) {
                                    var12.field2635 = 0;
                                }
                            } else {
                                var12.field2635 = 0;
                                var12.field2637 = var8;
                                var12.field2645 = 1;
                                var12.field2640 = 0;
                                var12.field2642 = 0;
                                class334.method1931(arg3.field2666, (byte) 89, var10, arg3.field2676, class23.field336 == arg3, 0, arg3.field2677);
                            }
                        }
                        if (var12 == null) {
                            class203 var13 = arg3.field4909[var9] = new class203();
                            var13.field2635 = 0;
                            var13.field2638 = var6;
                            var13.field2637 = var8;
                            var13.field2645 = 1;
                            var13.field2640 = 0;
                            var13.field2642 = 0;
                            class334.method1931(arg3.field2666, (byte) 120, var10, arg3.field2676, class23.field336 == arg3, 0, arg3.field2677);
                        }
                    }
                }
                ++var9;
                var7 >>>= 1;
            }
        }
        if (arg0 > -26) {
            method2840(77, -42, -124, -107, 50, 39, -36);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIIII)V", line = 132)
    public static final void method2840(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6822;
        int var7 = arg0 + arg3;
        int var8 = -arg3 + arg5;
        for (int var9 = arg0; ~var9 > ~var7; ++var9) {
            class184.method1160(class387.field5088[var9], -7, arg6, arg4, arg2);
        }
        for (int var10 = arg5; ~var10 < ~var8; --var10) {
            class184.method1160(class387.field5088[var10], -7, arg6, arg4, arg2);
        }
        int var11 = arg2 + arg3;
        int var12 = arg4 - arg3;
        if (arg1 != 0) {
            method2838(-120);
        }
        for (int var13 = var7; ~var13 >= ~var8; ++var13) {
            int[] var14 = class387.field5088[var13];
            class184.method1160(var14, arg1 ^ -7, arg6, var11, arg2);
            class184.method1160(var14, -7, arg6, arg4, var12);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZIII)I", line = 196)
    public static final int method2841(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 3;
        if (arg0) {
            method2841(true, -26, 0, 65);
        }
        ++field6829;
        if (~var4 == -1) {
            return arg1;
        } else if (~var4 == -2) {
            return arg3;
        } else {
            return var4 == 2 ? 7 - arg1 : -arg3 + 7;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)I", line = 230)
    public final int method1952(byte arg0) {
        ++field6820;
        if (arg0 > -60) {
            field6825 = -33;
        }
        return this.field6823 == null ? 0 : this.field6823.field6631 * 100 / (this.field6823.field6618.length + -this.field6821);
    }
}
