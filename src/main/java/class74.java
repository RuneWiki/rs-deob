import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class74 {

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1396 = 0;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lcc;")
    public static class209 field1395 = class95.method669(91, "Sprites charg-Bs");

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lcc;")
    public static class209 field1394;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILji;IIII)V")
    public static final void method525(int arg0, int arg1, class42 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 >= -39) {
            method527((byte) -116, 127);
        }
        int var7 = arg3 * arg3 + arg4 * arg4;
        field1397++;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg2.field789 / 2, arg2.field758 / 2);
        if (var8 * var8 >= var7) {
            class279.method1887(class261.field4697[arg6], arg1, (byte) 115, arg3, arg0, arg4, arg2);
            return;
        }
        int var9 = class253.field4565 + class54.field1066 & 0x7FF;
        int var10 = class15.field280[var9];
        int var11 = var10 * 256 / (class132.field2523 + 256);
        int var12 = class15.field278[var9];
        int var13 = var12 * 256 / (class132.field2523 + 256);
        int var14 = arg3 * var13 + arg4 * var11 >> 16;
        var8 -= 10;
        int var15 = arg3 * var11 - (arg4 * var13) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class269) class209.field3765[arg6]).method223(arg2.field789 / 2 + arg0 + var18 - 10, arg2.field758 / 2 + arg1 - var19 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method526(int arg0) {
        field1395 = null;
        field1394 = null;
        if (arg0 > -3) {
            field1395 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)V")
    public static final void method527(byte arg0, int arg1) {
        field1398++;
        class195 var2 = class178.method1229(arg1, 2, -117);
        int var3 = 62 / ((arg0 + 3) / 42);
        var2.method1340(true);
    }
}
