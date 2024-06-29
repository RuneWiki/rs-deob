import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class180 {

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public int field3262 = -1;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[I")
    public static int[] field3259 = new int[99];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Lud;")
    public class223 field3264;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lch;")
    public static class31 field3256;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "[I")
    public static int[] field3260;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[I")
    public int[] field3261;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "[Lkh;")
    public class117[] field3265;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BJ)V")
    public static final void method1243(byte arg0, long arg1) {
        field3253++;
        if (arg1 == 0L) {
            return;
        }
        if (class85.field1613 >= 100) {
            class14.method129(class169.field3042, class14.field440, 0, 0);
            return;
        }
        class117 var3 = class162.method1156(arg1, (byte) -61).method796((byte) -40);
        if (arg0 <= 89) {
            field3260 = null;
        }
        for (int var4 = 0; var4 < class85.field1613; var4++) {
            if (class158.field2873[var4] == arg1) {
                class14.method129(class169.field3042, class36.method316((byte) -34, new class117[] { var3, class95.field1748 }), 0, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class151.field2744; var5++) {
            if (class32.field751[var5] == arg1) {
                class14.method129(class169.field3042, class36.method316((byte) -34, new class117[] { class186.field3346, var3, class18.field524 }), 0, 0);
                return;
            }
        }
        if (var3.method810((byte) -50, class93.field1712.field1141)) {
            class14.method129(class169.field3042, class217.field3946, 0, 0);
            return;
        }
        class158.field2873[class85.field1613] = arg1;
        class9.field230[class85.field1613++] = class162.method1156(arg1, (byte) 120);
        class21.field563++;
        class204.field3688 = class194.field3470;
        class105.field1911.method400(28, 8);
        class105.field1911.method1000((byte) 111, arg1);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1244(byte arg0, String arg1) throws ClassNotFoundException {
        field3263++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg0 <= 94) {
                field3260 = null;
            }
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLah;)Lah;")
    public static final class9 method1245(byte arg0, class9 arg1) {
        field3255++;
        if (arg0 != -58) {
            field3259 = null;
        }
        int var2 = class181.method1250(130500, class187.method1269(arg1, (byte) 16));
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class119.method837((byte) 123, arg1.field175);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1246(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field3257++;
        if (!arg4) {
            field3259 = null;
        }
        if (arg3 == arg5) {
            class200.method1336(arg2, arg0, -1254, arg1, arg5);
        } else if (class240.field4355 <= arg1 - arg5 && class146.field2678 >= arg1 + arg5 && class159.field2910 <= arg0 - arg3 && arg0 + arg3 <= class224.field4040) {
            class119.method842(arg1, arg0, arg3, -96, arg5, arg2);
        } else {
            class3.method19((byte) 95, arg5, arg3, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method1247(byte arg0) {
        field3256 = null;
        int var1 = 120 % ((-arg0 - 31) / 51);
        field3260 = null;
        field3259 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lai;II)Lr;")
    public static final class186 method1248(class10 arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            field3256 = null;
        }
        field3258++;
        return class71.method502(arg0, arg1, (byte) 26) ? class98.method667((byte) 58) : null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILmc;Ljava/awt/Component;)Lcb;")
    public static final class25 method1249(int arg0, int arg1, int arg2, class134 arg3, Component arg4) {
        field3252++;
        if (class214.field3883 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class25 var5 = (class25) Class.forName("ea").getDeclaredConstructor().newInstance();
                int var6 = 48 % ((arg0 + 31) / 62);
                var5.field636 = new int[(class66.field1271 ? 2 : 1) * 256];
                var5.field644 = arg2;
                var5.method223(arg4);
                var5.field640 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field640 > 16384) {
                    var5.field640 = 16384;
                }
                var5.method228(var5.field640);
                if (class233.field4204 > 0 && class187.field3350 == null) {
                    class187.field3350 = new class216();
                    class187.field3350.field3919 = arg3;
                    arg3.method890((byte) 51, class233.field4204, class187.field3350);
                }
                if (class187.field3350 != null) {
                    if (class187.field3350.field3921[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class187.field3350.field3921[arg1] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class132 var7 = new class132(arg3, arg1);
                    var7.field644 = arg2;
                    var7.field636 = new int[(class66.field1271 ? 2 : 1) * 256];
                    var7.method223(arg4);
                    var7.field640 = 16384;
                    var7.method228(var7.field640);
                    if (class233.field4204 > 0 && class187.field3350 == null) {
                        class187.field3350 = new class216();
                        class187.field3350.field3919 = arg3;
                        arg3.method890((byte) 51, class233.field4204, class187.field3350);
                    }
                    if (class187.field3350 != null) {
                        if (class187.field3350.field3921[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class187.field3350.field3921[arg1] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class25();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3259[var1] = var0 / 4;
        }
    }
}
