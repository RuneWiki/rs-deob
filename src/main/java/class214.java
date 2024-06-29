import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class214 extends class58 {

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "[I")
    public static int[] field2943 = new int[3];

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "Lap;")
    public static class312 field2946 = new class312(14, 1);

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "Lap;")
    public static class312 field2948 = new class312(15, 4);

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "Lap;")
    public static class312 field2949 = new class312(16, -2);

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "Lap;")
    public static class312 field2950 = new class312(17, 0);

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "Lap;")
    public static class312 field2951 = new class312(18, -2);

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "Lap;")
    public static class312 field2952 = new class312(20, 6);

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "Lap;")
    public static class312 field2953 = new class312(21, 8);

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "Lap;")
    public static class312 field2954 = new class312(22, -2);

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "Lap;")
    public static class312 field2955 = new class312(23, 4);

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "Lap;")
    public static class312 field2956 = new class312(24, -1);

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "[Lap;")
    private static class312[] field2957 = new class312[32];

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "Lec;")
    public static class40 field2958;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field2947;

    static {
        class312[] var0 = class322.method1964(78);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field2957[var0[var1].field4563] = var0[var1];
        }
        field2958 = new class40("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V", line = 10)
    public static void method1200(int arg0) {
        field2948 = null;
        field2951 = null;
        if (arg0 != -28827) {
            method1200(55);
        }
        field2943 = null;
        field2958 = null;
        field2954 = null;
        field2956 = null;
        field2952 = null;
        field2946 = null;
        field2957 = null;
        field2950 = null;
        field2953 = null;
        field2949 = null;
        field2955 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIILil;)V", line = 35)
    public static final void method1201(int arg0, int arg1, int arg2, int arg3, class287 arg4) {
        class263 var5 = class88.method444(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field4302 = (arg1 << class482.field6812) + class137.field1663;
        arg4.field4306 = arg3;
        arg4.field4303 = (arg2 << class482.field6812) + class137.field1663;
        for (class248 var7 = var5.field3801; var7 != null; var7 = var7.field3490) {
            if (var7.field3487.field1000) {
                int var8 = var7.field3487.method17(-8960);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field4306 += var6;
            arg4.field4299 = true;
        }
        var5.field3787 = arg4;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIIIIII)V", line = 73)
    public static final void method1202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2944++;
        if (arg1 < ~arg5 || arg2 < 1 || class159.field1895 - 2 < arg5 || class289.field4316 - 2 < arg2) {
            return;
        }
        if (!class420.method2503((byte) -78) && !class216.method1212(arg2, arg5, arg3, class346.field4942, 0)) {
            return;
        }
        if (class293.field4356 == null) {
            return;
        }
        class422.field6097.method270(arg6, false, class174.field2093[arg3], arg3, arg2, class231.field3205, arg5);
        if (arg4 < 0) {
            return;
        }
        boolean var9 = class119.field1484;
        class119.field1484 = true;
        int var10 = arg3;
        if (arg3 < 3 && class292.method1840(arg5, (byte) 120, arg2)) {
            var10 = arg3 + 1;
        }
        class422.field6097.method276((byte) 56, arg4, arg7, arg5, class231.field3205, var10, arg2, arg0, arg3, arg8, class174.field2093[arg3]);
        class119.field1484 = var9;
        return;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II[SB[Ljava/lang/String;)V", line = 121)
    public static final void method1203(int arg0, int arg1, short[] arg2, byte arg3, String[] arg4) {
        if (arg3 <= 12) {
            field2951 = null;
        }
        field2947++;
        if (arg0 <= arg1) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg1;
        String var7 = arg4[var5];
        arg4[var5] = arg4[arg0];
        arg4[arg0] = var7;
        short var8 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var8;
        for (int var9 = arg1; var9 < arg0; var9++) {
            if (var7 == null || arg4[var9] != null && arg4[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6] = var10;
                short var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg4[arg0] = arg4[var6];
        arg4[var6] = var7;
        arg2[arg0] = arg2[var6];
        arg2[var6] = var8;
        method1203(var6 - 1, arg1, arg2, (byte) 65, arg4);
        method1203(arg0, var6 + 1, arg2, (byte) 122, arg4);
    }
}
