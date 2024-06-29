import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class277 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
    public static int[] field3925 = new int[1];

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field3924 = -1;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field3932 = new String[100];

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "F")
    public static float field3930;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Z")
    public static boolean field3927;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "[I")
    public static int[] field3928;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1725(int arg0) {
        class595.method3408((byte) 72, arg0);
        field3929++;
        class451.method2627((byte) -30);
        System.gc();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIILufa;IIIIILufa;)V", line = 40)
    public static final void method1726(int arg0, int arg1, int arg2, class141 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class141 arg9) {
        field3934++;
        int var10 = arg9.method657(true);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class257 var12 = (class257) class477.field6838.method941((long) var10, arg4 ^ 0xFF);
        if (var12 == null) {
            class628[] var13 = class628.method3544(class468.field6754, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class637.field9048.method772(var13[0], true);
            class477.field6838.method949((long) var10, true, var12);
        }
        class45.method362(arg4 ^ 0xFE, arg3.field3158, arg3.field3154, arg3.field3155, arg2, 0, arg5 >> 1, arg0 >> 1, arg6, arg3.method1108(121) * 256);
        int var14 = arg1 + class166.field2737[0] - 18;
        int var15 = class166.field2737[1] + arg8 - 16 - 54;
        int var16 = arg7 / 4 * 18 + var14;
        int var17 = arg7 % 4 * 18 + var15;
        var12.method1638(var16, var17);
        if (arg3 == arg9) {
            class637.field9048.method762(var17 - 1, 18, -256, 18, var16 - 1, (byte) -94);
        }
        class80 var18 = class304.method1859((byte) 59);
        var18.field1209 = var17 + 16;
        if (arg4 != 255) {
            field3928 = null;
        }
        var18.field1204 = var16;
        var18.field1206 = arg9;
        var18.field1205 = var17;
        var18.field1203 = var16 + 16;
        class135.field2178.method3307(0, var18);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V", line = 90)
    public static void method1727(int arg0) {
        field3928 = null;
        field3925 = null;
        if (arg0 != -16) {
            method1726(-89, -128, 120, null, 16, -121, -73, -39, -97, null);
        }
        field3932 = null;
    }
}
