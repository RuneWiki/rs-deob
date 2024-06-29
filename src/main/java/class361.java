import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class361 extends OutputStream {

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "Lnea;")
    public static class664 field5175 = new class664(40, 2);

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "Lwr;")
    public static class421 field5176;

    @OriginalMember(owner = "client!mt", name = "write", descriptor = "(I)V", line = 3)
    public final void write(int arg0) throws IOException {
        field5179++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V", line = 24)
    public static void method2200(byte arg0) {
        field5176 = null;
        field5175 = null;
        if (arg0 >= -84) {
            method2201(-33, -68, (byte) -93, null, 49, 74, null);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIBLfa;IILr;)V", line = 35)
    public static final void method2201(int arg0, int arg1, byte arg2, class209 arg3, int arg4, int arg5, class166 arg6) {
        if (class658.field9235 < 100) {
            class256.method1708(arg6, arg3, (byte) -46);
        }
        field5177++;
        arg6.method168(arg1, arg4, arg1 + arg5, arg0 + arg4);
        if (class658.field9235 < 100) {
            byte var7 = 20;
            int var8 = arg5 / 2 + arg1;
            int var9 = arg0 / 2 + arg4 - var7 - 18;
            arg6.method114(arg1, arg4, arg5, arg0, -16777216, 0);
            arg6.method219(var8 - 152, var9, 304, 34, class327.field4844[class340.field5001].getRGB(), 0);
            arg6.method114(var8 - 150, var9 + 2, class658.field9235 * 3, 30, class64.field1209[class340.field5001].getRGB(), 0);
            class26.field391.method2494(-1, class36.field619[class340.field5001].getRGB(), var8, class274.field4134.method1804(arg2 + 7294, class512.field7203), -127, var7 + var9);
            return;
        }
        int var10 = class199.field2808 - (int) ((float) arg5 / class25.field343);
        int var11 = (int) ((float) arg0 / class25.field343) + class671.field9481;
        int var12 = (int) ((float) arg5 / class25.field343) + class199.field2808;
        class232.field3616 = class199.field2808 - ((int) ((float) arg5 / class25.field343));
        int var13 = class671.field9481 - (int) ((float) arg0 / class25.field343);
        class47.field728 = (int) ((float) (arg0 * 2) / class25.field343);
        if (arg2 != -119) {
            method2200((byte) 54);
        }
        class199.field2820 = class671.field9481 - (int) ((float) arg0 / class25.field343);
        class540.field7557 = (int) ((float) (arg5 * 2) / class25.field343);
        class25.method302(class25.field365 + var10, class25.field366 + var11, class25.field365 + var12, class25.field366 + var13, arg1, arg4, arg1 + arg5, arg4 - (-arg0 + -1));
        class25.method307(arg6);
        class46 var14 = class25.method305(arg6);
        class549.method3104(arg6, var14, 0, 0, -1);
        if (class14.field132 > 0) {
            class394.field5835--;
            if (class394.field5835 == 0) {
                class14.field132--;
                class394.field5835 = 20;
            }
        }
        if (!class122.field1830) {
            return;
        }
        int var15 = arg1 + arg5 - 5;
        int var16 = arg0 + arg4 - 8;
        class563.field7931.method2507(var16, "Fps:" + class697.field9864, -1, var15, -128, 16776960);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class563.field7931.method2507(var20, "Mem:" + var18 + "k", -1, var15, -125, var19);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIB)I", line = 116)
    public static final int method2202(int arg0, int arg1, byte arg2) {
        field5178++;
        int var3 = 13 / ((-arg2 - 78) / 42);
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var4 = (arg1 & 0x7F) * arg0 >> 7;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg1 & 0xFF80) + var4;
        }
    }
}
