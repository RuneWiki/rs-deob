import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class235 {

    @OriginalMember(owner = "client!to", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3533 = new String[100];

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BZIIII)V", line = 10)
    public static final void method1606(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        field3532++;
        if (arg4 < 1) {
            arg4 = 1;
        }
        int var6 = arg4 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class13.field76 + ((class640.field9003 - class13.field76) * var6 / 100);
        if (var7 < class309.field4456) {
            var7 = class309.field4456;
        } else if (class559.field7863 < var7) {
            var7 = class559.field7863;
        }
        int var8 = var7 * 512 * arg4 / (arg2 * 334);
        if (class146.field1885 > var8) {
            short var12 = class146.field1885;
            var7 = arg2 * var12 * 334 / (arg4 * 512);
            if (class559.field7863 < var7) {
                var7 = class559.field7863;
                int var13 = var7 * 512 * arg4 / (var12 * 334);
                int var14 = (arg2 - var13) / 2;
                if (arg1) {
                    class111.field1332.method208();
                    class111.field1332.method2822(arg4, var14, arg5, 1, arg3, -16777216);
                    class111.field1332.method2822(arg4, var14, arg2 + arg5 - var14, 1, arg3, -16777216);
                }
                arg2 -= var14 * 2;
                arg5 += var14;
            }
        } else if (var8 > class357.field5144) {
            short var9 = class357.field5144;
            var7 = arg2 * var9 * 334 / (arg4 * 512);
            if (class309.field4456 > var7) {
                var7 = class309.field4456;
                int var10 = arg2 * var9 * 334 / (var7 * 512);
                int var11 = (arg4 - var10) / 2;
                if (arg1) {
                    class111.field1332.method208();
                    class111.field1332.method2822(var11, arg2, arg5, 1, arg3, -16777216);
                    class111.field1332.method2822(var11, arg2, arg5, 1, arg3 + arg4 - var11, -16777216);
                }
                arg4 -= var11 * 2;
                arg3 += var11;
            }
        }
        class140.field1789 = arg4 * var7 / 334;
        class492.field6786 = (short) arg2;
        class472.field6538 = arg3;
        if (arg0 >= -70) {
            field3533 = null;
        }
        class576.field8099 = (short) arg4;
        class367.field5274 = arg5;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 109)
    public static void method1607(int arg0) {
        field3533 = null;
        if (arg0 != 1) {
            field3533 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILha;Lro;BII)V", line = 119)
    public static final void method1608(int arg0, class473 arg1, class286 arg2, byte arg3, int arg4, int arg5) {
        field3531++;
        class408 var6 = class35.field354.method2914(arg2.field4199, 127);
        if (var6.field5744 == -1) {
            return;
        }
        int var8;
        if (arg2.field4167) {
            int var7 = arg2.field4169 + arg4;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class318 var9 = var6.method2498(var8, (byte) -41, arg2.field4191, arg1);
        if (arg3 > -46 || var9 == null) {
            return;
        }
        int var10 = arg2.field4146;
        int var11 = arg2.field4148;
        if ((var8 & 0x1) == 1) {
            var11 = arg2.field4146;
            var10 = arg2.field4148;
        }
        int var12 = var9.method749();
        int var13 = var9.method736();
        if (var6.field5741) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field5739 == 0) {
            var9.method2033(arg0, arg5 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method2028(arg0, 4 - (var11 * 4 - arg5), var12, var13, 0, var6.field5739 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Llm;ILlm;)V", line = 176)
    public static final void method1609(class49 arg0, int arg1, class49 arg2) {
        field3530++;
        if (arg0.field586 != null) {
            arg0.method416(9867);
        }
        arg0.field591 = arg2.field591;
        int var3 = 124 / ((54 - arg1) / 43);
        arg0.field586 = arg2;
        arg0.field586.field591 = arg0;
        arg0.field591.field586 = arg0;
    }
}
