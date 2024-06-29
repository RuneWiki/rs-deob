import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class147 extends class346 {

    @OriginalMember(owner = "client!wq", name = "N", descriptor = "I")
    private int field1881 = 4096;

    @OriginalMember(owner = "client!wq", name = "H", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!wq", name = "I", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!wq", name = "J", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!wq", name = "K", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!wq", name = "L", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!wq", name = "M", descriptor = "Ll;")
    public static class315 field1880;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)Lks;")
    public static final class289 method1013(byte arg0, int arg1) {
        ++field1877;
        class289 var2 = (class289) class269.field3978.method378((byte) 28, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class338.field4988.method1235(33, false, arg1);
            class289 var4 = new class289();
            if (var3 != null) {
                var4.method1967(new class341(var3), arg1, arg0 + -9631);
            }
            if (arg0 != 92) {
                return null;
            } else {
                class269.field3978.method367((long) arg1, var4, true);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[B)Lqg;")
    public static final class335 method1014(int arg0, byte[] arg1) {
        ++field1875;
        class335 var2 = new class335();
        if (arg0 != 21) {
            return null;
        } else {
            class341 var3 = new class341(arg1);
            var3.field5049 = var3.field5042.length + -2;
            int var4 = var3.method2239(arg0 + -1076227981);
            int var5 = -var4 + -2 + var3.field5042.length - 12;
            var3.field5049 = var5;
            int var6 = var3.method2232(97);
            var2.field4963 = var3.method2239(-1076227960);
            var2.field4966 = var3.method2239(-1076227960);
            var2.field4967 = var3.method2239(arg0 + -1076227981);
            var2.field4970 = var3.method2239(-1076227960);
            int var7 = var3.method2233((byte) 104);
            if (~var7 < -1) {
                var2.field4974 = new class453[var7];
                for (int var8 = 0; ~var8 > ~var7; ++var8) {
                    int var9 = var3.method2239(arg0 ^ -1076227939);
                    class453 var10 = new class453(class41.method299(2, var9));
                    var2.field4974[var8] = var10;
                    while (~(var9--) < -1) {
                        int var11 = var3.method2232(-84);
                        int var12 = var3.method2232(118);
                        var10.method2815(-1, (long) var11, new class17(var12));
                    }
                }
            }
            var3.field5049 = 0;
            var2.field4961 = var3.method2221((byte) -36);
            var2.field4969 = new int[var6];
            var2.field4960 = new String[var6];
            var2.field4964 = new int[var6];
            int var13 = 0;
            while (var3.field5049 < var5) {
                int var14 = var3.method2239(arg0 ^ -1076227939);
                if (~var14 == -4) {
                    var2.field4960[var13] = var3.method2261((byte) 72).intern();
                } else if (var14 < 100 && var14 != 21 && var14 != 38 && var14 != 39) {
                    var2.field4964[var13] = var3.method2232(103);
                } else {
                    var2.field4964[var13] = var3.method2233((byte) 104);
                }
                var2.field4969[var13++] = var14;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "(B)V")
    public static final void method1015(byte arg0) {
        ++field1879;
        class440 var1 = class186.method1241(0, 15, (byte) 56);
        if (arg0 != -75) {
            method1017(-122, 108);
        }
        var1.method2749(arg0 ^ -13828171);
    }

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "(B)V")
    public static void method1016(byte arg0) {
        field1880 = null;
        if (arg0 != -91) {
            field1880 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            if (arg2 == 0) {
                this.field1881 = arg0.method2239(-1076227960);
            }
            ++field1876;
        }
    }

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "(II)V")
    public static final void method1017(int arg0, int arg1) {
        class77 var2 = class106.field1405[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class77 var4 = class106.field1405[var3][arg0][arg1] = class106.field1405[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field1065;
                for (class356 var5 = var4.field1064; var5 != null; var5 = var5.field5275) {
                    class407 var6 = var5.field5274;
                    if (var6.field5917 == arg0 && var6.field5918 == arg1) {
                        --var6.field5922;
                    }
                }
            }
        }
        if (class106.field1405[0][arg0][arg1] == null) {
            class106.field1405[0][arg0][arg1] = new class77(0, arg0, arg1);
            class106.field1405[0][arg0][arg1].field1073 = 1;
        }
        class106.field1405[0][arg0][arg1].field1061 = var2;
        class106.field1405[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
    public class147() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field1878;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            int[] var4 = this.method2294((byte) 54, arg0 - 1 & class215.field3000, 0);
            int[] var5 = this.method2294((byte) 54, arg0, 0);
            int[] var6 = this.method2294((byte) 54, class215.field3000 & arg0 - -1, 0);
            for (int var7 = 0; ~var7 > ~class134.field1753; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1881;
                int var9 = (var5[class188.field2572 & var7 - -1] + -var5[var7 + -1 & class188.field2572]) * this.field1881;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = 4096 - var15;
            }
        }
        if (arg1 != 3) {
            this.field1881 = -29;
        }
        return var3;
    }
}
