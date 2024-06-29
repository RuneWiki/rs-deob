import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class261 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Ldv;")
    public static class566 field3624 = new class566(40, -1);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[I")
    public static int[] field3629;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static void method1703(byte arg0) {
        field3629 = null;
        if (arg0 != -16) {
            method1706(null, (byte) 123);
        }
        field3624 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public static final void method1704(int arg0, int arg1) {
        if (arg0 != -2627) {
            field3624 = null;
        }
        field3625++;
        class640.field9317 = arg1;
        class365.field4961 = -1;
        class592.field8498 = 3;
        class314.field4237 = 100;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
    public static final void method1705(short[] arg0, int arg1, String[] arg2) {
        if (arg1 != -20809) {
            field3630 = -87;
        }
        field3627++;
        class213.method1393(0, 10588, arg2.length - 1, arg2, arg0);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lan;B)I")
    public static final int method1706(class21 arg0, byte arg1) {
        field3626++;
        if (arg1 >= -126) {
            method1704(-66, 19);
        }
        int var2 = 0;
        if (arg0.method221(class150.field2285, (byte) -85)) {
            var2++;
        }
        if (arg0.method221(class427.field6067, (byte) 80)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II[BIIZI)Z")
    public static final boolean method1707(int arg0, int arg1, byte[] arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3628++;
        int var7 = arg6 % arg3;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg3 + arg4 - 1) / arg3);
        int var10 = -((arg3 + arg6 - 1) / arg3);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg1] == 0) {
                    return true;
                }
                arg1 += arg3;
            }
            int var13 = arg1 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg0 + var13;
        }
        if (arg5) {
            field3630 = 17;
        }
        return false;
    }
}
