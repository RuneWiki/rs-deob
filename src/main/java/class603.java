import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class603 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public int field8227 = 8;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public int field8233 = 16777215;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "[I")
    public static int[] field8238 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "Lcb;")
    public static class318 field8228 = new class318(3, 9);

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
    public static int field8245 = 0;

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "Lnl;")
    public static class50 field8244 = new class50(2);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field8226;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public int field8231;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public int field8232;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public int field8234;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public int field8235;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public static int field8237;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
    public int field8241;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "Liba;")
    public static class512 field8243;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "Z")
    public boolean field8240;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field8242;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BIIIII)V")
    public static final void method3332(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8226++;
        if (arg5 >= class398.field5676 && class298.field3995 >= arg1 && arg2 >= class609.field8313 && arg3 <= class19.field169) {
            class395.method2348(arg4, arg5, arg2, 36864, arg1, arg3);
        } else {
            class581.method3265(arg1, arg3, arg4, -63, arg5, arg2);
        }
        int var6 = 5 % ((arg0 - 32) / 52);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method3333(byte arg0, int arg1) {
        field8239++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg0 != 105) {
            method3333((byte) -17, -62);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class243.field3244.method1491(class350.field5121, (byte) 126) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class243.field3246.method1491(class350.field5121, (byte) 126) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)I")
    public static final int method3334(int arg0, int arg1) {
        if (arg0 != 0) {
            field8228 = null;
        }
        field8236++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public static void method3335(byte arg0) {
        if (arg0 != 93) {
            method3332((byte) 42, 22, 77, 62, 29, 2);
        }
        field8228 = null;
        field8243 = null;
        field8242 = null;
        field8238 = null;
        field8244 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBLdga;)V")
    private final void method3336(int arg0, byte arg1, class138 arg2) {
        if (arg0 == 1) {
            this.field8227 = arg2.method922((byte) -120);
        } else if (arg0 == 2) {
            this.field8240 = true;
        } else if (arg0 == 3) {
            this.field8232 = arg2.method924(2);
            this.field8234 = arg2.method924(2);
            this.field8235 = arg2.method924(2);
        } else if (arg0 == 4) {
            this.field8241 = arg2.method957((byte) -69);
        } else if (arg0 == 5) {
            this.field8231 = arg2.method922((byte) -120);
        } else if (arg0 == 6) {
            this.field8233 = arg2.method904(126);
        }
        field8230++;
        if (arg1 != -78) {
            field8242 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLdga;)V")
    public final void method3337(byte arg0, class138 arg1) {
        while (true) {
            int var3 = arg1.method957((byte) -98);
            if (var3 == 0) {
                if (arg0 != 115) {
                    return;
                }
                field8237++;
                return;
            }
            this.method3336(var3, (byte) -78, arg1);
        }
    }
}
