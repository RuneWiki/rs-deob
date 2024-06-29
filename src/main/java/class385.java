import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class385 extends class678 {

    @OriginalMember(owner = "client!bp", name = "P", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!bp", name = "Q", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!bp", name = "R", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIB)V")
    public static final void method2436(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class461.field6495 = arg1;
        class549.field7665 = arg0;
        class143.field2050 = arg2;
        if (arg4 == 37) {
            class71.field960 = arg3;
            field5477++;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)V")
    public static final void method2437(int arg0, byte arg1) {
        if (class557.field7812.field6535.method2177(false) == 0) {
            arg0 = -1;
        }
        int var2 = 106 % ((arg1 - 50) / 62);
        field5478++;
        if (class649.field8922 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class208 var3 = class30.field404.method3844(arg0, true);
            class204 var4 = var3.method1273(1757380419);
            if (var4 == null) {
                arg0 = -1;
            } else {
                class202.field2644.method2038(var4.method1241(), (byte) 56, var4.method1244(), new Point(var3.field2731, var3.field2728), class366.field5196, var4.method1242());
                class649.field8922 = arg0;
            }
        }
        if (arg0 == -1 && class649.field8922 != -1) {
            class202.field2644.method2038(-1, (byte) 56, null, new Point(), class366.field5196, -1);
            class649.field8922 = -1;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
    public static final void method2438(byte arg0) {
        if (arg0 > -10) {
            method2436(-104, -27, 125, -89, (byte) 52);
        }
        field5476++;
        class565.field8027.method4023((byte) 96);
    }
}
