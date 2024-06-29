import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class69 {

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lwm;")
    public static class152 field1009 = class157.method1048("l", 123);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lwm;")
    public static class152 field1006 = class157.method1048("Polices charg-Bes", 119);

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "[I")
    public static int[] field1008 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lah;")
    public static class205 field1007;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "[[[B")
    public static byte[][][] field1005;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 11)
    public static void method441(int arg0) {
        field1009 = null;
        field1008 = null;
        field1006 = null;
        field1005 = (byte[][][]) null;
        field1007 = null;
        if (arg0 != -19908) {
            method442(-95, -94, 127, 64, -75, -91, true, (byte[]) null, (class22[]) null, -92, 39);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIZ[B[Luf;II)V", line = 56)
    public static final void method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, byte[] arg7, class22[] arg8, int arg9, int arg10) {
        field1010++;
        if (arg0 != 26944) {
            method442(-38, -123, -3, 111, -60, 30, true, (byte[]) null, (class22[]) null, -36, 52);
        }
        int var11 = -1;
        class291 var12 = new class291(arg7);
        while (true) {
            int var13 = var12.method1981(-125);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var11 += var13;
            while (true) {
                int var15 = var12.method2013((byte) -20);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = (var14 & 0xFDA) >> 6;
                int var17 = var14 >> 12;
                int var18 = var14 & 0x3F;
                int var19 = var12.method2011(-116);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg5 == var17 && var16 >= arg2 && var16 < arg2 + 8 && arg3 <= var18 && var18 < (arg3 + 8)) {
                    class270 var22 = class242.method1656(var11, true);
                    int var23 = class192.method1273(var22.field4618, var20, arg4, var22.field4562, var18 & 0x7, -16795, var16 & 0x7) + arg9;
                    int var24 = arg1 + class40.method286(arg0 ^ 0xFFFF96BE, var22.field4562, var18 & 0x7, var22.field4618, var16 & 0x7, arg4, var20);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class22 var25 = null;
                        if (!arg6) {
                            int var26 = arg10;
                            if ((class70.field1026[1][var23][var24] & 0x2) == 2) {
                                var26 = arg10 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg8[var26];
                            }
                        }
                        class169.method1113(var11, arg10, arg6, var21, arg4 + var20 & 0x3, var25, !arg6, arg10, var24, var23, 89);
                    }
                }
            }
        }
    }
}
