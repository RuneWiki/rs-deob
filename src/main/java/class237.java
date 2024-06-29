import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public abstract class class237 {

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field3314;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V", line = 5)
    public static void method1457(byte arg0) {
        field3314 = null;
        if (arg0 < 6) {
            method1459(null, null, null, -123, -13, null, 29, -123, null, 39, 110, 83);
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V", line = 18)
    public static final void method1458(int arg0) {
        field3315++;
        if (class411.field6213 == 2) {
            class526.method3137(3, 2270);
        } else if (class411.field6213 == 6) {
            class526.method3137(7, 2270);
        } else if (class411.field6213 == 9) {
            class526.method3137(10, 2270);
        }
        if (arg0 > -88) {
            field3314 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;Lgo;Lma;IILdu;IILla;III)V", line = 44)
    public static final void method1459(String arg0, class310 arg1, class249 arg2, int arg3, int arg4, class443 arg5, int arg6, int arg7, class307 arg8, int arg9, int arg10, int arg11) {
        field3316++;
        int var12;
        if (class350.field5388 == 4) {
            var12 = (int) class311.field4836 & 0x3FFF;
        } else {
            var12 = (int) class311.field4836 + class469.field6881 & 0x3FFF;
        }
        int var13 = Math.max(arg1.field4661 / 2, arg1.field4736 / 2) + 10;
        int var14 = arg7 * arg7 + (arg6 * arg6);
        if ((var13 * var13) < var14 || arg10 != 9) {
            return;
        }
        int var15 = class445.field6545[var12];
        int var16 = class445.field6544[var12];
        if (class350.field5388 != 4) {
            var15 = var15 * 256 / (class230.field3230 + 256);
            var16 = var16 * 256 / (class230.field3230 + 256);
        }
        int var17 = arg6 * var15 + (arg7 * var16) >> 15;
        int var18 = arg6 * var16 - (arg7 * var15) >> 15;
        int var19 = arg5.method2602(100, -108, null, arg0);
        int var20 = arg5.method2598(null, arg0, -113, 100, 0);
        int var21 = var17 - var19 / 2;
        if ((-arg1.field4661) <= var21 && var21 <= arg1.field4661 && (-arg1.field4736) <= var18 && arg1.field4736 >= var18) {
            arg8.method1924(null, 0, arg11, 0, 50, 0, arg9, (byte) 115, arg4, arg11 + (arg1.field4736 / 2) - arg3 - var20 - var18, null, var19, 1, arg2, arg1.field4661 / 2 + arg4 + var21, arg0);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)I")
    public abstract int method1(int arg0, int arg1);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)J")
    public abstract long method2(boolean arg0);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public abstract void method4(int arg0);
}
