import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class310 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[Lpa;")
    public static class2[] field4872;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V", line = 6)
    public static final void method2192(int arg0, int arg1) {
        field4871++;
        class151.field2392.method387(arg0, false);
        if (arg1 == -11598) {
            class119.field1659.method387(arg0, false);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 18)
    public static void method2193(byte arg0) {
        if (arg0 > -46) {
            method2195(-32, 68, false, (class323) null);
        }
        field4872 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZILhi;)V", line = 32)
    public static final void method2194(boolean arg0, int arg1, class323 arg2) {
        int var3 = arg2.field5186 == 0 ? arg2.field5169 : arg2.field5186;
        if (arg1 != 24206) {
            method2193((byte) 44);
        }
        int var4 = arg2.field5187 == 0 ? arg2.field5174 : arg2.field5187;
        field4876++;
        class213.method1489(var4, var3, class232.field3512[arg2.field5073 >> 16], (byte) -64, arg0, arg2.field5073);
        if (arg2.field5036 != null) {
            class213.method1489(var4, var3, arg2.field5036, (byte) -99, arg0, arg2.field5073);
        }
        class238 var5 = (class238) class88.field1166.method770((long) arg2.field5073, 101);
        if (var5 != null) {
            class293.method2089(-1, var4, var5.field3658, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZLhi;)V", line = 54)
    public static final void method2195(int arg0, int arg1, boolean arg2, class323 arg3) {
        field4875++;
        if (class147.field2341 != null || class38.field437 || arg3 == null || class276.method1976(arg3, 111) == null) {
            return;
        }
        class147.field2341 = arg3;
        class67.field838 = class276.method1976(arg3, 105);
        class214.field3245 = arg2;
        class85.field1120 = arg0;
        class247.field3928 = arg1;
        class253.field4003 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)I", line = 85)
    public static final int method2196(byte arg0, int arg1) {
        field4870++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 & 0xFF) / 256.0D;
        double var6 = (double) ((arg1 & 0xFFA7) >> 8) / 256.0D;
        double var8 = var2;
        if (var2 > var6) {
            var8 = var6;
        }
        if (var8 > var4) {
            var8 = var4;
        }
        double var10 = 0.0D;
        double var12 = var2;
        double var14 = 0.0D;
        if (arg0 != 13) {
            return 78;
        }
        if (var2 < var6) {
            var12 = var6;
        }
        if (var12 < var4) {
            var12 = var4;
        }
        double var16 = (var8 + var12) / 2.0D;
        if (var8 != var12) {
            if (var16 < 0.5D) {
                var14 = (var12 - var8) / (var8 + var12);
            }
            if (var16 >= 0.5D) {
                var14 = (var12 - var8) / (2.0D - var12 - var8);
            }
            if (var2 == var12) {
                var10 = (var6 - var4) / (var12 - var8);
            } else if (var6 == var12) {
                var10 = (var4 - var2) / (var12 - var8) + 2.0D;
            } else if (var4 == var12) {
                var10 = (var2 - var6) / (var12 - var8) + 4.0D;
            }
        }
        int var18 = (int) (var14 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var19 = (int) (var16 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var19 > 243) {
            var18 >>= 0x4;
        } else if (var19 > 217) {
            var18 >>= 0x3;
        } else if (var19 > 192) {
            var18 >>= 0x2;
        } else if (var19 > 179) {
            var18 >>= 0x1;
        }
        double var20 = var10 / 6.0D;
        int var22 = (int) (var20 * 256.0D);
        return (var22 >> 2 << 10) + (var19 >> 1) + (var18 >> 5 << 7);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([IBIJ)Ljava/lang/String;", line = 184)
    public static final String method2197(int[] arg0, byte arg1, int arg2, long arg3) {
        field4873++;
        if (arg1 < 123) {
            field4872 = (class2[]) null;
        }
        if (class96.field1316 != null) {
            String var5 = class96.field1316.method79(17525, arg2, arg3, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg3);
    }
}
