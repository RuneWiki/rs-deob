import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class138 extends class130 {

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public int field2967 = 0;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public static int field2952 = 0;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "Lgg;")
    public static class63 field2957 = class116.method911(43, "au");

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field2956 = -1;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "Lgg;")
    private static class63 field2959 = class116.method911(43, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "[I")
    public static int[] field2961 = new int[32];

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "Lgg;")
    public static class63 field2963 = field2959;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "Lgg;")
    public static class63 field2962 = class116.method911(43, "(Y");

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "Lgg;")
    public static class63 field2970 = class116.method911(43, ")3");

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field2964 = 0;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "Lgg;")
    private static class63 field2968 = class116.method911(43, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "Lgg;")
    public static class63 field2972 = class116.method911(43, "mn");

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "Lgg;")
    public static class63 field2975 = class116.method911(43, "Einloggen");

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "Lgg;")
    public static class63 field2960 = field2968;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "[Lwb;")
    public static class200[] field2969;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "[[B")
    public static byte[][] field2953;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lab;I)V")
    public final void method997(class3 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method64(arg1 + 31790);
            if (var3 == 0) {
                field2955++;
                return;
            }
            this.method1000(var3, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lfb;")
    public static final class50 method998(int arg0, int arg1) {
        field2954++;
        class50 var2 = (class50) class162.field3339.method289((long) arg0, -130079263);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class203.field4047.method745(4, arg0, arg1 - 15230);
        class50 var4 = new class50();
        if (var3 != null) {
            var4.method489(arg0, arg1 + 619, new class3(var3));
        }
        class162.field3339.method293(false, (long) arg0, var4);
        if (arg1 != 15230) {
            method998(120, 66);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBII)I")
    public static final int method999(int arg0, byte arg1, int arg2, int arg3) {
        field2973++;
        if (arg1 != -105) {
            method1001(-46);
        }
        int var4 = 256 - arg0;
        return ((arg2 & 0xFF00FF) * arg0 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg0 + (arg3 & 0xFF00) * var4 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILab;)V")
    private final void method1000(int arg0, int arg1, class3 arg2) {
        if (arg1 != 0) {
            this.method1000(-52, 60, null);
        }
        field2965++;
        if (arg0 == 5) {
            this.field2967 = arg2.method46((byte) 65);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static void method1001(int arg0) {
        field2953 = null;
        field2968 = null;
        field2957 = null;
        field2963 = null;
        field2960 = null;
        field2969 = null;
        field2962 = null;
        if (arg0 != 32454) {
            method1001(14);
        }
        field2961 = null;
        field2972 = null;
        field2959 = null;
        field2970 = null;
        field2975 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1002(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = (arg4 - 32) * arg4 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        class193.field3907[0].method1083(arg5, arg2);
        field2966++;
        int var7 = (arg4 - var6 - 32) * arg1 / (arg3 - arg4);
        class193.field3907[1].method1083(arg5, arg2 + arg4 - 16);
        class178.method1191(arg5, arg2 + 16, 16, arg4 - 32, class37.field875);
        class178.method1191(arg5, arg2 + var7 + 16, 16, var6, class125.field2769);
        class178.method1175(arg5, arg2 + var7 + 16, var6, class13.field310);
        class178.method1175(arg5 + 1, arg2 - (-16 - var7), var6, class13.field310);
        class178.method1179(arg5, arg2 + var7 + 16, 16, class13.field310);
        class178.method1179(arg5, arg2 + var7 + 17, 16, class13.field310);
        class178.method1175(arg5 + 15, var7 + 16 + arg2, var6, class114.field2555);
        class178.method1175(arg5 + 14, arg2 + 17 + var7, var6 - 1, class114.field2555);
        class178.method1179(arg5, arg2 + var6 + var7 + 15, 16, class114.field2555);
        int var8 = 2 % ((arg0 + 58) / 35);
        class178.method1179(arg5 + 1, arg2 + 14 + var7 + var6, 15, class114.field2555);
    }
}
