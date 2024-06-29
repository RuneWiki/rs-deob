import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class294 extends class276 {

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field4682 = 0;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "Ljava/lang/String;")
    public static String field4687 = "Select";

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ldl;BI)I")
    public static final int method1978(class46 arg0, byte arg1, int arg2) {
        ++field4684;
        if (!client.method1922(arg0).method1256(arg2, (byte) -48) && arg0.field771 == null) {
            return -1;
        } else {
            if (arg1 != -109) {
                field4687 = null;
            }
            return arg0.field723 != null && arg2 < arg0.field723.length ? arg0.field723[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILvh;)V")
    public static final void method1979(int arg0, class108 arg1) {
        ++field4685;
        class178.field2928 = arg1;
        class165.field2705 = class178.field2928.method754(122, 4);
        if (arg0 != 0) {
            method1983(118, -95, -37, (byte) 108, -75);
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V")
    public static final void method1980(byte arg0) {
        ++field4688;
        try {
            if (arg0 != 32) {
                method1979(-88, (class108) null);
            }
            if (class146.field2484 == 1) {
                int var1 = class248.field4083.method481((byte) -104);
                if (var1 > 0 && class248.field4083.method509((byte) 65)) {
                    int var2 = var1 - class268.field4330;
                    if (~var2 > -1) {
                        var2 = 0;
                    }
                    class248.field4083.method498(var2, -93);
                } else {
                    class248.field4083.method473(arg0);
                    class248.field4083.method490(arg0 + 20683);
                    class165.field2703 = null;
                    class88.field1571 = null;
                    if (class169.field2791 == null) {
                        class146.field2484 = 0;
                    } else {
                        class146.field2484 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class248.field4083.method473(32);
            class169.field2791 = null;
            class165.field2703 = null;
            class88.field1571 = null;
            class146.field2484 = 0;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class294() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)I")
    private final int method1981(int arg0, int arg1, int arg2) {
        ++field4689;
        int var4 = arg1 - -(arg2 * 57);
        int var5 = var4 ^ var4 << 1;
        return arg0 <= 37 ? 56 : 4096 - (Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 - -1376312589) / 262144;
    }

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)V")
    public static final void method1982(int arg0) {
        class2.field16.method58(arg0 ^ arg0);
        ++field4683;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        if (arg0 <= 39) {
            method1984(-45);
        }
        ++field4686;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int var4 = class206.field3389[arg1];
            for (int var5 = 0; ~class53.field929 < ~var5; ++var5) {
                var3[var5] = this.method1981(70, class175.field2883[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIBI)V")
    public static final void method1983(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field4690;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = class160.method1090(arg0 + arg4, (byte) 16, class118.field2098, class126.field2222);
        int var9 = class160.method1090(-arg4 + arg0, (byte) 16, class118.field2098, class126.field2222);
        if (arg3 != 43) {
            method1980((byte) 2);
        }
        class93.method598(arg3 ^ -46, var8, var9, class167.field2735[arg2], arg1);
        int var10 = -1;
        while (var5 < var6) {
            var10 += 2;
            var7 += var10;
            if (var7 > 0) {
                --var6;
                var7 -= var6 << 1;
                int var11 = -var6 + arg2;
                int var12 = arg2 + var6;
                if (~var12 <= ~class118.field2094 && var11 <= class89.field1582) {
                    int var13 = class160.method1090(arg0 + var5, (byte) 16, class118.field2098, class126.field2222);
                    int var14 = class160.method1090(-var5 + arg0, (byte) 16, class118.field2098, class126.field2222);
                    if (~class89.field1582 <= ~var12) {
                        class93.method598(-7, var13, var14, class167.field2735[var12], arg1);
                    }
                    if (~var11 <= ~class118.field2094) {
                        class93.method598(-7, var13, var14, class167.field2735[var11], arg1);
                    }
                }
            }
            ++var5;
            int var15 = -var5 + arg2;
            int var16 = arg2 + var5;
            if (~var16 <= ~class118.field2094 && ~var15 >= ~class89.field1582) {
                int var17 = class160.method1090(arg0 - -var6, (byte) 16, class118.field2098, class126.field2222);
                int var18 = class160.method1090(-var6 + arg0, (byte) 16, class118.field2098, class126.field2222);
                if (var16 <= class89.field1582) {
                    class93.method598(-7, var17, var18, class167.field2735[var16], arg1);
                }
                if (class118.field2094 <= var15) {
                    class93.method598(-7, var17, var18, class167.field2735[var15], arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)V")
    public static void method1984(int arg0) {
        if (arg0 != 4096) {
            field4681 = -111;
        }
        field4687 = null;
    }
}
