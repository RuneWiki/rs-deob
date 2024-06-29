import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class467 {

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "Z")
    public static boolean field6423 = false;

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "I")
    public static int field6425 = -1;

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "Ltb;")
    public static class365 field6424 = new class365();

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "Ltg;")
    public class210 field6419;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "Lbda;")
    public class467 field6421;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "()V", line = 7)
    public static final void method2637() {
        byte var0 = 10;
        byte var1 = 30;
        if (class685.field9772 == 0 || class469.field6441 == null) {
            return;
        }
        class401.field5619.method174(class88.field1279);
        for (int var2 = 0; var2 < class645.field8917.length; var2++) {
            class401.field5619.method1171(class645.field8917[var2] + class479.field6610[var2], class88.field1279[3] - class88.field1279[1], true, class88.field1279[1], -256);
        }
        for (int var3 = 0; var3 < class547.field7414; var3++) {
            class209 var11 = class63.field713[var3];
            class401.field5619.method154(var11.field2947[0], var11.field2948[0], var11.field2944[0], class418.field5908);
            class401.field5619.method154(var11.field2947[1], var11.field2948[1], var11.field2944[1], class261.field3545);
            class401.field5619.method154(var11.field2947[2], var11.field2948[2], var11.field2944[2], class154.field2268);
            class401.field5619.method154(var11.field2947[3], var11.field2948[3], var11.field2944[3], class501.field6870);
            if (class418.field5908[2] != -1 && class261.field3545[2] != -1 && class154.field2268[2] != -1 && class501.field6870[2] != -1) {
                int var12 = -65536;
                if (var11.field2952 == 4) {
                    var12 = -16776961;
                }
                class401.field5619.method1175(class418.field5908[1], var12, class418.field5908[0], class261.field3545[0], class261.field3545[1], 25821);
                class401.field5619.method1175(class261.field3545[1], var12, class261.field3545[0], class154.field2268[0], class154.field2268[1], 25821);
                class401.field5619.method1175(class154.field2268[1], var12, class154.field2268[0], class501.field6870[0], class501.field6870[1], 25821);
                class401.field5619.method1175(class501.field6870[1], var12, class501.field6870[0], class418.field5908[0], class418.field5908[1], 25821);
                class401.field5619.method1175(class418.field5908[1], var12, class418.field5908[0], class154.field2268[0], class154.field2268[1], 25821);
            }
        }
        class469.field6441.method2423("Static Opaque: OW: " + class89.field1287[0] + "/" + class220.field3078[0] + " UW: " + class89.field1287[1] + "/" + class220.field3078[1], var0, false, -256, var1, -16777216);
        class469.field6441.method2423("Static Trans: OW: " + class582.field8197[0] + "/" + class167.field2441[0] + " UW: " + class582.field8197[1] + "/" + class167.field2441[1], var0, false, -256, var1 + 15, -16777216);
        class469.field6441.method2423("Static Anim: OW: " + class466.field6417[0] + "/" + class629.field8728[0] + " UW: " + class466.field6417[1] + "/" + class629.field8728[1], var0, false, -256, var1 + 30, -16777216);
        class469.field6441.method2423("Dynamic: " + class590.field8286 + "/" + 5000, var0, false, -256, var1 + 45, -16777216);
        class469.field6441.method2423("Total Opaque Onscreen: " + class333.field4494 + "/" + 10000, var0, false, -256, var1 + 60, -16777216);
        class469.field6441.method2423("Total Trans Onscreen: " + class419.field5917 + "/" + 5000, var0, false, -256, var1 + 75, -16777216);
        class469.field6441.method2423("Occluders: " + (class631.field8755 + class325.field4430) + " Active: " + class547.field7414, var0, false, -256, var1 + 90, -16777216);
        class469.field6441.method2423("Occluded: Ground:" + class607.field8445 + " Walls: " + class452.field6236 + " CPs: " + class77.field1010 + " Pixels: " + class676.field9648, var0, false, -256, var1 + 105, -16777216);
        class469.field6441.method2423("Occlude Calc Took: " + class355.field4713 / 1000L + "us", var0, false, -256, var1 + 120, -16777216);
        if (class685.field9772 != 2 || class129.field1838 == null) {
            return;
        }
        for (int var4 = 0; var4 < class129.field1838.length; var4++) {
            float var6 = (float) class129.field1838[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class129.field1838[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class702 var5 = class401.field5619.method175(class129.field1838, 0, class12.field125, class12.field125, class672.field9426);
        var5.method935(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V", line = 95)
    public final void method2638(byte arg0) {
        field6418++;
        if (class236.field3251 >= 500) {
            return;
        }
        this.field6419 = null;
        if (arg0 < 61) {
            field6425 = 84;
        }
        this.field6421 = class511.field7023;
        class236.field3251++;
        class511.field7023 = this;
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V", line = 118)
    public static final void method2639(byte arg0) {
        field6420++;
        if (arg0 != -95) {
            return;
        }
        class181 var1 = null;
        try {
            class70 var2 = class543.field7374.method763(false, (byte) 121, "3");
            while (var2.field948 == 0) {
                class519.method2960(122, 1L);
            }
            if (var2.field948 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class181) var2.field946;
            byte[] var3 = new byte[(int) var1.method1244(0)];
            if (var3.length == 0) {
                class83.field1243 = "";
                class659.field9152 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1245(arg0 ^ 0xFFFFFFEA, var3, var3.length - var4, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class501 var6 = new class501(var3);
                int var7 = var6.method2874((byte) -75);
                if (var7 > 120) {
                    throw new RuntimeException("Bad length");
                }
                var6.field6892 = var7 + 1;
                if (!var6.method2854(false)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field6892 = 1;
                int var8 = var6.method2874((byte) -75);
                if (var8 > 3) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class659.field9152 = var6.method2814((byte) -128);
                class83.field1243 = var6.method2814((byte) -128);
                if (var8 >= 1) {
                    class54.field615 = var6.method2845(arg0 ^ 0x5E);
                } else {
                    class54.field615 = class254.field3462;
                }
                if (var8 >= 2) {
                    class63.field725 = var6.method2849(arg0 + 93);
                } else {
                    class63.field725 = class365.field4859;
                }
                if (var8 < 3) {
                    class619.field8613 = class316.field4350;
                } else if (var6.method2874((byte) -75) == 1) {
                    class619.field8613 = var6.method2814((byte) -128);
                } else {
                    class619.field8613 = null;
                }
            }
        } catch (Exception var10) {
            class83.field1243 = "";
            class659.field9152 = "";
        }
        try {
            if (var1 != null) {
                var1.method1248(0);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIB)Z", line = 217)
    public static final boolean method2640(int arg0, int arg1, byte arg2) {
        field6422++;
        int var3 = 106 / ((51 - arg2) / 51);
        if (arg0 >= 0 && arg1 >= 0 && arg0 < class492.field6720[1].length && class492.field6720[1][arg0].length > arg1) {
            return (class492.field6720[1][arg0][arg1] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V", line = 234)
    public static void method2641(int arg0) {
        if (arg0 != 1) {
            method2637();
        }
        field6424 = null;
    }
}
