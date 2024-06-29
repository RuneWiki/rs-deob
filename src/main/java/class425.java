import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class425 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lus;")
    public static class328 field6050 = new class328(18, -1);

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "[Z")
    public static boolean[] field6051 = new boolean[100];

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;IZIJLjava/lang/String;JZIIZI)V", line = 3)
    public static final void method2528(int arg0, String arg1, int arg2, boolean arg3, int arg4, long arg5, String arg6, long arg7, boolean arg8, int arg9, int arg10, boolean arg11, int arg12) {
        field6049++;
        if (!class322.field4113 && class573.field8011 < 500) {
            int var15 = -31 / ((-arg4 - 59) / 34);
            int var16 = arg12 == -1 ? class105.field1289 : arg12;
            class718 var17 = new class718(arg6, arg1, var16, arg0, arg2, arg7, arg9, arg10, arg3, arg8, arg5, arg11);
            class716.method3981((byte) -118, var17);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V", line = 24)
    public static void method2529(boolean arg0) {
        field6051 = null;
        if (arg0) {
            method2528(31, null, -121, false, 120, 99L, null, -94L, true, 47, -84, false, 47);
        }
        field6050 = null;
    }
}
