import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class162 {

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "Llh;")
    public static class487 field2332 = new class487(40, 5);

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V", line = 9)
    public static void method1140(byte arg0) {
        if (arg0 >= 14) {
            field2332 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZIII)Lsea;", line = 19)
    public static final class648 method1141(boolean arg0, int arg1, int arg2, int arg3) {
        field2334++;
        if (arg3 != 0) {
            field2332 = null;
        }
        class589 var4 = null;
        if (class485.field6668 != null) {
            var4 = new class589(arg1, class485.field6668, class691.field9860[arg1], 1000000);
        }
        class372.field5017[arg1] = class315.field4347.method7(arg1, var4, 117, class656.field9123);
        class372.field5017[arg1].method850(arg3 - 29898);
        return new class648(class372.field5017[arg1], arg0, arg2);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([[BLwca;B)V", line = 38)
    public static final void method1142(byte[][] arg0, class630 arg1, byte arg2) {
        field2335++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        if (arg2 != -72) {
            field2332 = null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class501 var11 = new class501(var10);
                int var12 = class111.field1540[var5] >> 8;
                int var13 = class111.field1540[var5] & 0xFF;
                int var14 = var12 * 64 - class498.field6774;
                int var15 = var13 * 64 - class613.field8555;
                class466.method2634(arg2 ^ 0xFFFFFFBD);
                arg1.method1775(var11, var15, var14, class151.field2218, (byte) -32, class613.field8555, class498.field6774);
                arg1.method3530(var3, var14, -9649, var15, var11, class334.field4506);
                if (!arg1.field3981 && class452.field6238 / 8 == var12 && (class186.field2695 / 8) == var13 && var3[0] != -1) {
                    class261.field3549 = class433.field6033.method3773(var3[0], var3[1], (byte) -122, var3[3], var3[2], class444.field6147);
                    class14.field149 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class111.field1540[var6] >> 8) * 64 - class498.field6774;
            int var8 = (class111.field1540[var6] & 0xFF) * 64 - class613.field8555;
            byte[] var9 = arg0[var6];
            if (var9 == null && class186.field2695 < 800) {
                class466.method2634(5);
                arg1.method1783(var7, 1, 64, var8, 64);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BJ)V", line = 112)
    public static final void method1143(byte arg0, long arg1) {
        field2331++;
        int var3 = class143.field2063.field4042 + class166.field2416;
        int var4 = class607.field8447 + class143.field2063.field4047;
        if (class10.field93 - var3 < -2000 || class10.field93 - var3 > 2000 || class476.field6552 - var4 < -2000 || class476.field6552 - var4 > 2000) {
            class10.field93 = var3;
            class476.field6552 = var4;
        }
        if (class10.field93 != var3) {
            int var5 = var3 - class10.field93;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class10.field93 += var6;
        }
        if (class476.field6552 != var4) {
            int var7 = var4 - class476.field6552;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class476.field6552 += var8;
        }
        if (!class366.field4875.field9367) {
            class228.field3168 += (float) arg1 * class299.field4077 / 6.0F;
            class705.field9964 += (float) arg1 * class367.field4942 / 6.0F;
        }
        class221.method1402(-4);
        if (arg0 != -94) {
            field2332 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V", line = 204)
    public static final void method1144(int arg0) {
        field2333++;
        class181 var1 = null;
        try {
            class70 var2 = class543.field7374.method763(true, (byte) 121, "2");
            while (var2.field948 == 0) {
                class519.method2960(120, 1L);
            }
            if (var2.field948 == 1) {
                var1 = (class181) var2.field946;
                byte[] var3 = new byte[(int) var1.method1244(arg0 ^ 0xF4240)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1245(115, var3, var3.length - var4, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class423.method2447((byte) -17, new class501(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (arg0 != 1000000) {
                method1144(70);
            }
            if (var1 != null) {
                var1.method1248(arg0 - 1000000);
            }
        } catch (Exception var6) {
        }
    }
}
