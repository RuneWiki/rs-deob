import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class238 extends class117 {

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "Lmi;")
    public static class128 field4237 = new class128();

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "[I")
    public static int[] field4242 = new int[64];

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "[Lrh;")
    public static class242[] field4243;

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "[Lne;")
    public static class94[] field4244;

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class238() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BIIIIII)V")
    public static final void method1646(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4235;
        int var7 = class221.method1561(class182.field3344, (byte) -42, arg1, class201.field3593);
        int var8 = class221.method1561(class182.field3344, (byte) -42, arg2, class201.field3593);
        int var9 = class221.method1561(class127.field2465, (byte) -42, arg3, class252.field4407);
        int var10 = class221.method1561(class127.field2465, (byte) -42, arg5, class252.field4407);
        int var11 = class221.method1561(class182.field3344, (byte) -42, arg1 + arg6, class201.field3593);
        int var12 = class221.method1561(class182.field3344, (byte) -42, -arg6 + arg2, class201.field3593);
        for (int var13 = var7; var13 < var11; ++var13) {
            class227.method1585(var9, (byte) -66, arg4, class85.field1605[var13], var10);
        }
        for (int var14 = var8; var14 > var12; --var14) {
            class227.method1585(var9, (byte) -66, arg4, class85.field1605[var14], var10);
        }
        int var15 = class221.method1561(class127.field2465, (byte) -42, arg3 + arg6, class252.field4407);
        int var16 = class221.method1561(class127.field2465, (byte) -42, -arg6 + arg5, class252.field4407);
        int var17 = var11;
        int var18 = -82 % ((14 - arg0) / 55);
        while (~var12 <= ~var17) {
            int[] var19 = class85.field1605[var17];
            class227.method1585(var9, (byte) -66, arg4, var19, var15);
            class227.method1585(var16, (byte) -66, arg4, var19, var10);
            ++var17;
        }
    }

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
    public static final void method1647(int arg0) {
        if (arg0 != 8) {
            field4243 = null;
        }
        class95.field1789 = 0;
        class222.field4040 = 0;
        class262.method1774(-61);
        class50.method355(arg0 + 100);
        class168.method1259((byte) -114);
        for (int var1 = 0; ~var1 > ~class95.field1789; ++var1) {
            int var3 = class257.field4494[var1];
            if (class227.field4092 != class111.field2098[var3].field3628) {
                if (class111.field2098[var3].field41.method1324(true)) {
                    class54.method368(class111.field2098[var3], arg0 ^ 30762);
                }
                class111.field2098[var3].field41 = null;
                class111.field2098[var3] = null;
            }
        }
        ++field4236;
        if (class125.field2415 != class33.field502.field1541) {
            throw new RuntimeException("gnp1 pos:" + class33.field502.field1541 + " psize:" + class125.field2415);
        } else {
            for (int var2 = 0; var2 < class199.field3573; ++var2) {
                if (class111.field2098[class155.field2887[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class199.field3573);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)V")
    public static final void method1648(boolean arg0, int arg1) {
        ++field4233;
        byte var2 = 4;
        byte[][] var3 = class219.field3984;
        if (arg1 != -25241) {
            field4243 = null;
        }
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            class229.method1593(-104);
            for (int var5 = 0; var5 < 13; ++var5) {
                for (int var6 = 0; var6 < 13; ++var6) {
                    int var7 = class170.field3108[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 3;
                        if (!arg0 || ~var8 == -1) {
                            int var9 = (var7 & 6) >> 1;
                            int var10 = 1023 & var7 >> 14;
                            int var11 = 2047 & var7 >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; ~var13 > ~class199.field3572.length; ++var13) {
                                if (~class199.field3572[var13] == ~var12 && var3[var13] != null) {
                                    class94.method750(var8, (var10 & 7) * 8, var5 * 8, var3[var13], var9, class140.field2670, var4, (var11 & 7) * 8, arg0, var6 * 8, (byte) 119);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field4239;
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (arg0 != -21393) {
            method1648(false, 27);
        }
        if (super.field2218.field2587) {
            class241.method1665(var3, 0, class143.field2702, class214.field3911[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static final void method1649(boolean arg0) {
        if (arg0) {
            class228.field4107 = class172.field3157;
            class259.field4542 = class178.field3247;
        } else {
            class228.field4107 = class161.field2958;
            class259.field4542 = class157.field2909;
        }
        class7.field126 = class259.field4542.length;
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(B)V")
    public static void method1650(byte arg0) {
        field4237 = null;
        field4242 = null;
        field4243 = null;
        if (arg0 >= -108) {
            method1648(false, 24);
        }
        field4244 = null;
    }
}
