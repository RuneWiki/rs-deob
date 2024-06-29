import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class335 extends class443 {

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field4959 = 500;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "[I")
    public static int[] field4968 = new int[14];

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field4962 = new String[100];

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public int field4963;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public int field4966;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public int field4967;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    public int field4970;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "I")
    public int field4973;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "Ljava/lang/String;")
    public String field4961;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "[I")
    public int[] field4964;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "[I")
    public int[] field4969;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "[Lbo;")
    public class453[] field4974;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "[Ljava/lang/String;")
    public String[] field4960;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)Z", line = 5)
    public static final boolean method2186(int arg0) {
        field4972++;
        class117 var1 = class254.field3706;
        synchronized (class254.field3706) {
            if (class296.field4459 == class255.field3722) {
                return false;
            } else {
                class27.field475 = class242.field3392[class255.field3722];
                class114.field1493 = class190.field2647[class255.field3722];
                class255.field3722 = arg0 & class255.field3722 + 1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(Z)V", line = 25)
    public static void method2187(boolean arg0) {
        field4968 = null;
        field4962 = null;
        if (arg0) {
            method2189(42, -124);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)I", line = 58)
    public static final int method2188(byte arg0, int arg1) {
        field4971++;
        double var2 = (double) ((arg1 & 0xFF853F) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF25) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        if (arg0 != -95) {
            method2188((byte) 30, -22);
        }
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + ((var20 >> 2 & 0x3F) << 10) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V", line = 167)
    public static final void method2189(int arg0, int arg1) {
        field4965++;
        class51 var2 = class185.field2526;
        synchronized (class185.field2526) {
            class185.field2526.method379(arg1, false);
            if (arg0 <= 61) {
                field4959 = 87;
            }
        }
    }
}
