import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class396 extends class214 {

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field5559 = new String[200];

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "J")
    public static long field5557 = 0L;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Lll;")
    public static class248 field5558 = new class248("LIVE", 0);

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIJI)V")
    public static final void method2366(int arg0, int arg1, long arg2, int arg3) {
        if (arg0 != 0) {
            method2366(-103, -66, 25L, -100);
        }
        ++field5562;
        int var5 = (int) arg2 >> 14 & 31;
        int var6 = (3626579 & (int) arg2) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var5 != 10 && var5 != 11 && ~var5 != -23) {
            class425.method2469(0, true, 0, 12914, class2.field21.field1140[0], arg3, 0, class2.field21.field1144[0], arg1, var5, var6);
        } else {
            class475 var8 = class304.field4160.method2075(var7, false);
            int var9;
            int var10;
            if (var6 != 0 && ~var6 != -3) {
                var9 = var8.field6714;
                var10 = var8.field6708;
            } else {
                var9 = var8.field6708;
                var10 = var8.field6714;
            }
            int var11 = var8.field6687;
            if (~var6 != -1) {
                var11 = (var11 << var6 & 15) - -(var11 >> -var6 + 4);
            }
            class425.method2469(var10, true, var11, arg0 + 12914, class2.field21.field1140[0], arg3, var9, class2.field21.field1144[0], arg1, 0, 0);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Luq;B[[B)V")
    public static final void method2367(class115 arg0, byte arg1, byte[][] arg2) {
        ++field5563;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; arg0.field345 > var4; ++var4) {
            class172.method1155(15547);
            for (int var6 = 0; ~(class200.field2875 >> 3) < ~var6; ++var6) {
                for (int var7 = 0; var7 < class422.field5811 >> 3; ++var7) {
                    boolean var8 = false;
                    int var9 = class109.field1544[var4][var6][var7];
                    if (~var9 != 0) {
                        int var10 = 3 & var9 >> 24;
                        if (!arg0.field352 || ~var10 == -1) {
                            int var11 = 3 & var9 >> 1;
                            int var12 = (16760973 & var9) >> 14;
                            int var13 = (16381 & var9) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; ~class490.field6908.length < ~var15; ++var15) {
                                if (class490.field6908[var15] == var14 && arg2[var15] != null) {
                                    class425 var16 = new class425(arg2[var15]);
                                    arg0.method169(var11, var10, var4, var12, var13, var7 * 8, (byte) 114, var16, class308.field4209, var6 * 8);
                                    arg0.method727(var13, ~var3[0] == 0 ? var3 : null, var11, true, var10, class338.field4636, var7 * 8, var6 * 8, var12, var16, var4);
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        arg0.method165(var7 * 8, var6 * 8, var4, 8, 8, (byte) -89);
                    }
                }
            }
        }
        if (~var3[0] != 0) {
            class444.field6124 = class487.field6864.method2535(class191.field2725, var3[0], var3[1], var3[2], (byte) 9, var3[3]);
            class78.field1182 = var3[4];
        } else {
            class444.field6124 = null;
        }
        int var5 = -68 % ((arg1 - -60) / 61);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class396() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
    public static void method2368(byte arg0) {
        field5559 = null;
        field5558 = null;
        if (arg0 < 47) {
            field5560 = 20;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        ++field5561;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (arg0 != 123) {
            method2367((class115) null, (byte) 75, (byte[][]) null);
        }
        if (super.field3024.field6135) {
            class415.method2422(var3, 0, class399.field5585, class56.field909[arg1]);
        }
        return var3;
    }
}
