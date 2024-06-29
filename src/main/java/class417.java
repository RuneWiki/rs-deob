import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class417 extends class712 {

    @OriginalMember(owner = "client!et", name = "s", descriptor = "Lmba;")
    public static class646 field5895 = new class646();

    @OriginalMember(owner = "client!et", name = "r", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!et", name = "w", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!et", name = "A", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!et", name = "B", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "[[Z")
    public static boolean[][] field5900;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)[B")
    public static final byte[] method2593(int arg0, int arg1) {
        if (arg0 != -20709) {
            method2595(105, (String) null);
        }
        ++field5896;
        class323 var2 = (class323) class32.field434.method1945((byte) -52, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class434.method2677(var7, var4, (byte) -119);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class323(var3);
            class32.field434.method1940(var2, (byte) -27, (long) arg1);
        }
        return var2.field4474;
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(Z)Z")
    public final boolean method396(boolean arg0) {
        ++field5903;
        if (arg0) {
            method2596(true, (byte) 40, 127, 89, -84, -17, -108, 1.4326123F);
        }
        return false;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BZ)V")
    public final void method394(byte arg0, boolean arg1) {
        if (arg0 > 39) {
            ++field5894;
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(III)V")
    public final void method393(int arg0, int arg1, int arg2) {
        if (arg2 < 96) {
            field5895 = null;
        }
        ++field5904;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZB)V")
    public final void method399(boolean arg0, byte arg1) {
        ++field5897;
        if (arg1 < 44) {
            field5900 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(B)V")
    public static void method2594(byte arg0) {
        field5895 = null;
        if (arg0 != -21) {
            method2596(true, (byte) 19, 51, -56, 91, 22, -76, 0.9420763F);
        }
        field5900 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2595(int arg0, String arg1) {
        ++field5899;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class673.method3805(arg0 + -3862, arg1);
            if (arg0 == 3863) {
                if (var2 != null) {
                    for (int var3 = 0; ~var3 > ~class239.field3558; ++var3) {
                        String var4 = class193.field2627[var3];
                        if (var4.startsWith("*")) {
                            var4 = var4.substring(1);
                        }
                        String var5 = class673.method3805(1, var4);
                        if (var5 != null && var5.equals(var2)) {
                            --class239.field3558;
                            for (int var6 = var3; class239.field3558 > var6; ++var6) {
                                class193.field2627[var6] = class193.field2627[var6 + 1];
                                class342.field4854[var6] = class342.field4854[var6 + 1];
                                class88.field1246[var6] = class88.field1246[var6 - -1];
                                class573.field7908[var6] = class573.field7908[var6 + 1];
                                class473.field6553[var6] = class473.field6553[var6 + 1];
                                class580.field7945[var6] = class580.field7945[var6 + 1];
                            }
                            ++class250.field3661;
                            class557.field7747 = class320.field4449;
                            class583 var7 = class54.method400(class213.field2800, (byte) -72, class539.field7505);
                            var7.field7963.method444(class712.method4007(arg1, 4927), arg0 ^ 3991);
                            var7.field7963.method510(arg1, (byte) 61);
                            class463.method2838(var7, (byte) 124);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILhba;)V")
    public final void method391(int arg0, int arg1, class190 arg2) {
        if (arg1 == 0) {
            ++field5902;
            super.field9945.method1458(arg1 ^ 399403340, arg2);
            super.field9945.method1503(arg0, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZBIIIIIF)[I")
    public static final int[] method2596(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7) {
        ++field5898;
        int[] var8 = new int[arg4];
        class218 var9 = new class218();
        var9.field2847 = arg2;
        var9.field2842 = arg5;
        var9.field2844 = arg3;
        var9.field2843 = arg0;
        var9.field2849 = (int) (arg7 * 4096.0F);
        var9.field2853 = arg6;
        var9.method184(-2);
        class495.method2999((byte) 51, arg4, 1);
        if (arg1 <= 110) {
            field5900 = null;
        }
        var9.method1280(-128, var8, 0);
        return var8;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lrl;)V")
    public class417(class232 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)V")
    public final void method389(boolean arg0) {
        if (!arg0) {
            ++field5901;
        }
    }
}
