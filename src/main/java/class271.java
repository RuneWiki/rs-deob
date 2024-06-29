import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class271 {

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "S")
    public static short field4378 = 320;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4377;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "[I")
    public static int[] field4379;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II[B)[B", line = 3)
    public static final byte[] method1909(int arg0, int arg1, byte[] arg2) {
        field4376++;
        byte[] var3 = new byte[arg0];
        if (arg1 <= 80) {
            return null;
        } else {
            class398.method2566(arg2, 0, var3, 0, arg0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBI)V", line = 17)
    public static final void method1910(int arg0, byte arg1, int arg2) {
        field4375++;
        if (arg1 > 80) {
            class413 var3 = class674.method3852(1, arg0, 125);
            var3.method2633(16777215);
            var3.field6337 = arg2;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Lwo;", line = 31)
    public static final class691 method1911(int arg0) {
        if (arg0 != 27309) {
            method1909(-75, -119, null);
        }
        field4373++;
        try {
            return (class691) Class.forName("bda").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class608();
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "([[[Lup;B)V", line = 48)
    public static final void method1912(class252[][][] arg0, byte arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class252[][] var4 = arg0[var2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                for (int var6 = 0; var6 < var4[var5].length; var6++) {
                    class252 var7 = var4[var5][var6];
                    if (var7 != null) {
                        if (var7.field4025 instanceof class302) {
                            ((class302) var7.field4025).method409(-7728);
                        }
                        if (var7.field4028 instanceof class302) {
                            ((class302) var7.field4028).method409(-7728);
                        }
                        if (var7.field4023 instanceof class302) {
                            ((class302) var7.field4023).method409(-7728);
                        }
                        if (var7.field4029 instanceof class302) {
                            ((class302) var7.field4029).method409(-7728);
                        }
                        if (var7.field4019 instanceof class302) {
                            ((class302) var7.field4019).method409(-7728);
                        }
                        for (class531 var8 = var7.field4026; var8 != null; var8 = var8.field7736) {
                            class459 var9 = var8.field7739;
                            if (var9 instanceof class302) {
                                ((class302) var9).method409(-7728);
                            }
                        }
                    }
                }
            }
        }
        field4380++;
        int var3 = 52 / ((arg1 - 54) / 37);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 121)
    public static final void method1913(byte arg0) {
        field4374++;
        int var1 = 0;
        if (arg0 != 114) {
            method1918(-12, -15, null);
        }
        while (var1 < 100) {
            class353.field5618[var1] = null;
            var1++;
        }
        class529.field7715 = 0;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZI)I", line = 140)
    public static final int method1914(int arg0, boolean arg1, int arg2) {
        field4381++;
        int var3 = class685.method3893(arg2 - 1, arg0 + -1, (byte) 39) - (-class685.method3893(arg2 + 1, arg0 + -1, (byte) 39) - class685.method3893(arg2 - 1, arg0 + 1, (byte) 39) - class685.method3893(arg2 - -1, arg0 + 1, (byte) 39));
        int var4 = class685.method3893(arg2 - 1, arg0, (byte) 39) + (class685.method3893(arg2 + 1, arg0, (byte) 39) + class685.method3893(arg2, arg0 - 1, (byte) 39) + class685.method3893(arg2, arg0 + 1, (byte) 39));
        if (!arg1) {
            field4378 = -25;
        }
        int var5 = class685.method3893(arg2, arg0, (byte) 39);
        return var5 / 4 + (var3 / 16 + (var4 / 8));
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V", line = 160)
    public static void method1915(byte arg0) {
        field4379 = null;
        field4377 = null;
        if (arg0 != -87) {
            field4378 = 16;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V", line = 177)
    public static final void method1916(int arg0, int arg1) {
        class49 var2 = class376.field5862;
        synchronized (class376.field5862) {
            class376.field5862.method573((byte) 125, arg1);
        }
        if (arg0 != 98) {
            method1913((byte) -126);
        }
        field4382++;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lwba;BLrl;)Lcw;", line = 193)
    public static final class165 method1917(class46 arg0, byte arg1, class672 arg2) {
        field4372++;
        class165 var3 = class1.method1(-113);
        var3.field2771 = arg2.field9476;
        var3.field2777 = arg2;
        if (var3.field2771 == -1) {
            var3.field2776 = new class580(260);
        } else if (var3.field2771 == -2) {
            var3.field2776 = new class580(10000);
        } else if (var3.field2771 <= 18) {
            var3.field2776 = new class580(20);
        } else if (var3.field2771 > 98) {
            var3.field2776 = new class580(260);
        } else {
            var3.field2776 = new class580(100);
        }
        if (arg1 > -38) {
            field4379 = null;
        }
        var3.field2776.method3401(false, arg0);
        var3.field2776.method3409((byte) -73, var3.field2777.method3844(true));
        var3.field2767 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILol;)V", line = 228)
    public static final void method1918(int arg0, int arg1, class260 arg2) {
        field4383++;
        if (arg1 != -18546) {
            field4378 = -2;
        }
        if (arg2.field4174 == null) {
            return;
        }
        int var3 = arg2.field4174[arg0 + 1];
        if (arg2.field4215 == var3) {
            return;
        }
        arg2.field4194 = 1;
        arg2.field4259 = arg2.field4267;
        arg2.field4188 = 0;
        arg2.field4213 = 0;
        arg2.field4209 = 0;
        arg2.field4215 = var3;
        if (arg2.field4215 != -1) {
            class216.method1622(arg2.field4209, arg2, (byte) -41, class636.field8942.method2872((byte) 11, arg2.field4215));
            return;
        }
    }
}
