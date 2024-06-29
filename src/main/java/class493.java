import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class493 extends class401 {

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field6732 = 0;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLmw;)V")
    public static final void method2785(byte arg0, class455 arg1) {
        field6735++;
        arg1.method2594(true);
        int var2 = class409.field5813;
        class677 var3 = class143.field2063 = class671.field9407[var2] = new class677();
        var3.field1697 = var2;
        int var4 = arg1.method2592((byte) 105, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFC2B6) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field1807[0] = var6 - class498.field6774;
        if (arg0 <= 61) {
            field6732 = 106;
        }
        var3.field4042 = (var3.field1807[0] << 9) + (var3.method881(-114) << 8);
        var3.field1801[0] = var7 - class613.field8555;
        var3.field4047 = (var3.field1801[0] << 9) + (var3.method881(-116) << 8);
        class367.field4944 = var3.field4053 = var3.field4050 = var5;
        if (class467.method2640(var3.field1807[0], var3.field1801[0], (byte) -44)) {
            var3.field4050++;
        }
        if (class437.field6082[var2] != null) {
            var3.method3856(class437.field6082[var2], (byte) 117);
        }
        class528.field7160 = 0;
        class439.field6091[class528.field7160++] = var2;
        class518.field7055[var2] = 0;
        class33.field413 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method2592((byte) -127, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class671 var13 = class320.field4382[var8] = new class671();
                var13.field9413 = (var10 << 28) + (var11 << 14) + var12;
                var13.field9412 = 0;
                var13.field9414 = false;
                var13.field9411 = -1;
                class254.field3463[class33.field413++] = var8;
                class518.field7055[var8] = 0;
            }
        }
        arg1.method2595(0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2786(int arg0, int arg1, byte arg2) {
        field6733++;
        int var3 = 50 / ((arg2 + 11) / 61);
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILba;III)V")
    public static final void method2787(int arg0, class352 arg1, int arg2, int arg3, int arg4) {
        field6734++;
        arg1.field4686.method2836(arg3, arg4 - 22419);
        arg1.field4686.method2837(arg2, -2);
        arg1.field4686.method2812(48, arg0);
        if (arg4 != 255) {
            method2787(73, null, 63, 48, 29);
        }
    }
}
