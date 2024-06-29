import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class677 extends Exception {

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field9288 = -50;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Lpe;")
    public static class636 field9284 = new class636(1);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field9285;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field9287;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field9290;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Lqh;")
    public static class75 field9289;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "Lnh;")
    public static class778 field9286;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "[[S")
    public static short[][] field9293;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIZ)V", line = 3)
    public static final void method3810(boolean arg0, int arg1, boolean arg2) {
        class462.method2784(arg2, class637.field8687.method3584(class770.field10592, arg0), arg1, (byte) -10);
        if (!arg0) {
            field9288 = 58;
        }
        field9285++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IFILfba;IF[BFIIIFF)V", line = 24)
    public static final void method3811(int arg0, float arg1, int arg2, class27 arg3, int arg4, float arg5, byte[] arg6, float arg7, int arg8, int arg9, int arg10, float arg11, float arg12) {
        field9291++;
        for (int var13 = arg10; var13 < arg4; var13++) {
            class47.method420(arg4, arg2, arg1, arg5, arg7, arg11, arg3, var13, 99, arg9, arg0, arg6, arg8, arg12);
            arg0 += arg8 * arg9;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[Ljava/lang/String;[I)V", line = 41)
    public static final void method3812(int arg0, String[] arg1, int[] arg2) {
        field9287++;
        class365.method2130(arg1, 0, -13, arg1.length - 1, arg2);
        if (arg0 != -50) {
            method3814((byte) -18);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V", line = 55)
    public static final void method3813(int arg0, int arg1, int arg2) {
        int var3 = 3 % ((47 - arg1) / 35);
        field9290++;
        class714 var4 = class350.method2072((long) arg0, 13, (byte) 121);
        var4.method4043(6380);
        var4.field10021 = arg2;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 73)
    public static void method3814(byte arg0) {
        if (arg0 >= -36) {
            field9288 = -89;
        }
        field9284 = null;
        field9293 = null;
        field9286 = null;
        field9289 = null;
    }
}
