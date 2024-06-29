import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class283 extends class164 {

    @OriginalMember(owner = "client!ns", name = "Db", descriptor = "I")
    public static int field4158 = 0;

    @OriginalMember(owner = "client!ns", name = "Cb", descriptor = "[I")
    public static int[] field4157 = new int[32];

    @OriginalMember(owner = "client!ns", name = "Ib", descriptor = "I")
    public static int field4163 = 0;

    @OriginalMember(owner = "client!ns", name = "Fb", descriptor = "Lwi;")
    public static class330 field4160 = new class330(4);

    @OriginalMember(owner = "client!ns", name = "Kb", descriptor = "S")
    public static short field4165 = 32767;

    @OriginalMember(owner = "client!ns", name = "Eb", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!ns", name = "Gb", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!ns", name = "Hb", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ns", name = "Jb", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "(I)V")
    public static final void method1819(int arg0) {
        if (arg0 != 32767) {
            field4158 = -69;
        }
        ++field4164;
        if (class84.field1227) {
            while (true) {
                while (~class4.field22.length < ~class367.field5619) {
                    class412 var1 = class4.field22[class367.field5619];
                    if (var1 != null && var1.field6261 == -1) {
                        if (class139.field1849 == null) {
                            class139.field1849 = class150.field1972.method2632((byte) -38, var1.field6257);
                        }
                        int var2 = class139.field1849.field5598;
                        if (~var2 == 0) {
                            return;
                        }
                        class139.field1849 = null;
                        var1.field6261 = var2;
                        ++class367.field5619;
                    } else {
                        ++class367.field5619;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "A", descriptor = "(I)V")
    public static void method1820(int arg0) {
        int var1 = -73 % ((arg0 - -35) / 56);
        field4160 = null;
        field4157 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IF)V")
    public final void method1821(int arg0, float arg1) {
        ++field4162;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field2219[super.field2185++] = (byte) (var3 >> 24);
        super.field2219[super.field2185++] = (byte) (var3 >> 16);
        super.field2219[super.field2185++] = (byte) (var3 >> 8);
        super.field2219[super.field2185++] = (byte) var3;
        if (arg0 != -8443) {
            field4158 = -41;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method1822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (~arg9 <= ~class377.field5760 && ~class49.field701 <= ~arg9 && ~class377.field5760 >= ~arg2 && ~arg2 >= ~class49.field701 && class377.field5760 <= arg6 && class49.field701 >= arg6 && ~arg5 <= ~class377.field5760 && ~class49.field701 <= ~arg5 && arg1 >= class463.field6924 && ~class369.field5628 <= ~arg1 && arg4 >= class463.field6924 && class369.field5628 >= arg4 && ~class463.field6924 >= ~arg7 && class369.field5628 >= arg7 && ~arg0 <= ~class463.field6924 && class369.field5628 >= arg0) {
            class2.method4(arg5, arg0, arg6, arg2, arg1, false, arg9, arg3, arg4, arg7);
        } else {
            class137.method925(arg0, arg3, arg2, arg9, arg5, arg1, arg7, -73, arg6, arg4);
        }
        ++field4159;
        if (arg8 > -70) {
            method1820(79);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(IF)V")
    public final void method1823(int arg0, float arg1) {
        ++field4161;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field2219[super.field2185++] = (byte) var3;
        super.field2219[super.field2185++] = (byte) (var3 >> 8);
        super.field2219[super.field2185++] = (byte) (var3 >> 16);
        if (arg0 == 32) {
            super.field2219[super.field2185++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
    public class283(int arg0) {
        super(arg0);
    }
}
