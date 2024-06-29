import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class344 extends class325 {

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
    private int field5064;

    @OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
    public static int field5063 = 0;

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "F")
    public static float field5066;

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!fp", name = "N", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!fp", name = "O", descriptor = "Laj;")
    public static class333 field5072;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
    public static final void method2182(int arg0) {
        for (int var1 = 0; var1 < 100; ++var1) {
            class384.field5621[var1] = null;
        }
        int var2 = 101 % ((4 - arg0) / 45);
        ++field5071;
        class218.field2907 = 0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BI)[I")
    public final int[] method100(byte arg0, int arg1) {
        ++field5062;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (arg0 < 21) {
            field5061 = -112;
        }
        if (super.field4727.field6067) {
            class278.method1802(var3, 0, class261.field3874, this.field5064);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(BI)Lhs;")
    public static final class346 method2183(byte arg0, int arg1) {
        ++field5068;
        class346 var2 = (class346) class209.field2775.method1541(-10, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 != 113) {
            return null;
        } else {
            byte[] var3 = class482.field6665.method2095(arg1, 0, 1);
            class346 var4 = new class346();
            if (var3 != null) {
                var4.method2190(arg0 + -107, new class376(var3), arg1);
            }
            class209.field2775.method1544(true, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)V")
    public static void method2184(int arg0) {
        field5072 = null;
        if (arg0 != -15969) {
            method2183((byte) 117, 7);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;IZI)V")
    public static final void method2185(String arg0, boolean arg1, int arg2, String arg3, int arg4, boolean arg5, int arg6) {
        ++field5070;
        class262.field3891.field4844 = 1;
        String var7 = arg3.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg4 != -1) {
            class486 var11 = class206.field2703.method3905(true, arg4);
            if (var11 == null || !arg5 != !var11.method2825(0)) {
                return;
            }
            if (!var11.method2825(arg2)) {
                var9 = var11.field6728;
            } else {
                var10 = var11.field6727;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class770.field10602.field5656; ++var13) {
            class322 var16 = class770.field10602.method2467(-13, var13);
            if ((!arg1 || var16.field4692) && var16.field4639 == -1 && var16.field4657 == -1 && var16.field4665 == -1 && ~var16.field4701 == -1 && ~var16.field4668.toLowerCase().indexOf(var7) != 0) {
                if (~arg4 != 0) {
                    if (!arg5) {
                        if (~var16.method2045(var9, arg4, -1) != ~arg6) {
                            continue;
                        }
                    } else if (!arg0.equals(var16.method2044(arg4, var10, (byte) -83))) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class774.field10661 = -1;
                    class356.field5214 = null;
                    return;
                }
                if (var12 >= var8.length) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; ~var18 > ~var12; ++var18) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class356.field5214 = var8;
        class774.field10661 = var12;
        class537.field7313 = arg2;
        String[] var14 = new String[class774.field10661];
        for (int var15 = 0; ~class774.field10661 < ~var15; ++var15) {
            var14[var15] = class770.field10602.method2467(127, var8[var15]).field4668;
        }
        class196.method1346(var14, 69, class356.field5214);
        class262.field3891.method2119(false);
        class262.field3891.field4844 = 2;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I)V")
    public class344(int arg0) {
        super(0, true);
        this.field5064 = 4096;
        this.field5064 = arg0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2186(String arg0, byte arg1) {
        ++field5065;
        if (class39.field598 != null) {
            ++class732.field10148;
            class267 var2 = class545.method3099((byte) 106, class269.field3966, class712.field9957);
            var2.field3938.method2380(arg1 + 65168, class469.method2769(arg0, (byte) 79));
            var2.field3938.method2349(arg1 ^ 77, arg0);
            class617.method3392(var2, true);
            if (arg1 != 112) {
                field5072 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljp;IB)V")
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg2 >= -41) {
            field5067 = -29;
        }
        if (~arg1 == -1) {
            this.field5064 = (arg0.method2398(-1372747256) << 12) / 255;
        }
        ++field5069;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
    public class344() {
        this(4096);
    }
}
