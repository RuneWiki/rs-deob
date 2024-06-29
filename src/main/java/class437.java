import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class437 {

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "[S")
    public static short[] field6381 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public int field6361;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public int field6363;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public int field6364;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public int field6365;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public int field6366;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public int field6368;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public int field6369;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public int field6371;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public int field6375;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public int field6376;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public int field6377;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public int field6378;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public int field6379;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public int field6380;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public int field6382;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public int field6383;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public int field6386;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    public int field6387;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Ljj;")
    public static class75 field6374;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "[I")
    public static int[] field6373;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2607(boolean arg0) {
        field6367++;
        int var1 = (int) ((double) class442.field6435 * 34.46D);
        int var2 = var1 << 0;
        if (class418.field6109.method470()) {
            var2 += 128;
        }
        if (!arg0) {
            class418.field6109.method458(50, var2);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)V", line = 27)
    public static void method2608(boolean arg0) {
        field6374 = null;
        field6373 = null;
        if (arg0) {
            field6381 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 40)
    public static final void method2609(int arg0) {
        field6362++;
        class219 var1 = null;
        try {
            class409 var2 = class282.field3804.method2292((byte) 60, "2");
            while (var2.field5652 == 0) {
                class496.method2931((byte) 122, 1L);
            }
            if (var2.field5652 == 1) {
                var1 = (class219) var2.field5654;
                byte[] var3 = new byte[(int) var1.method1296(arg0 - 16408)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1298(false, var3, var3.length - var4, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class401.method2328(new class365(var3), 118);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1297((byte) -114);
            }
            if (arg0 != 16409) {
                method2609(-19);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILss;I)V", line = 91)
    public static final void method2610(int arg0, int arg1, class295 arg2, int arg3) {
        field6370++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field4059 != null) {
            class44 var4 = new class44();
            var4.field612 = arg2.field4059;
            var4.field613 = arg2;
            class475.method2798(var4);
        }
        class455.field6651 = arg2.field3936;
        if (arg1 != 19) {
            return;
        }
        class20.field202 = arg2.field4072;
        class401.field5585 = arg2.field4073;
        class450.field6497 = arg0;
        class327.field4483 = arg2.field3990;
        class297.field4101 = true;
        class287.field3858 = arg2.field3983;
        class352.field4810 = arg3;
        class150.method952((byte) 113, arg2);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIZIFIII)[[I", line = 130)
    public static final int[][] method2611(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5, int arg6, int arg7, int arg8) {
        field6372++;
        int[][] var9 = new int[arg6][arg1];
        class510 var10 = new class510();
        var10.field7490 = arg8;
        var10.field7487 = arg4;
        var10.field7485 = (int) (arg5 * 4096.0F);
        var10.field7484 = arg3;
        var10.field7486 = arg0;
        var10.method207(2);
        class520.method3060(arg6, arg1, 57);
        int var11 = 48 / ((arg7 + 12) / 41);
        for (int var12 = 0; var12 < arg6; var12++) {
            var10.method2998(var12, var9[var12], 3746);
        }
        return var9;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILpk;BI)V", line = 178)
    public static final void method2612(int arg0, int arg1, class132 arg2, byte arg3, int arg4) {
        field6384++;
        if (arg3 < 104) {
            method2607(false);
        }
        for (class129 var5 = (class129) class184.field2573.method3072((byte) 75); var5 != null; var5 = (class129) class184.field2573.method3066(2)) {
            if (var5.field1759 == arg0 && arg4 << 7 == var5.field1768 && arg1 << 7 == var5.field1769 && var5.field1773.field1866 == arg2.field1866) {
                if (var5.field1766 != null) {
                    class189.field2623.method942(var5.field1766);
                    var5.field1766 = null;
                }
                if (var5.field1758 != null) {
                    class189.field2623.method942(var5.field1758);
                    var5.field1758 = null;
                }
                var5.method2946(-118);
                return;
            }
        }
    }
}
