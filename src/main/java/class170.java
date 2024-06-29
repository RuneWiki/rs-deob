import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class170 {

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "S")
    public static short field3139 = 32767;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field3142 = 2301979;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lid;")
    private static class149 field3143 = class60.method382(" more options", (byte) 81);

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "S")
    public static short field3147 = 1;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lid;")
    public static class149 field3146 = field3143;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Lfg;")
    public static class12 field3148;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lal;")
    public static class230 field3145;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[I")
    public static int[] field3140;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method1222(byte arg0) {
        if (arg0 >= -9) {
            return;
        }
        field3148 = null;
        field3146 = null;
        field3140 = null;
        field3145 = null;
        field3143 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
    public static final void method1223(int arg0, int arg1, int arg2) {
        field3144++;
        class115.field1953[arg1] = arg2;
        if (arg0 < 22) {
            field3147 = 22;
        }
        class227 var3 = (class227) class17.field250.method639((byte) -27, (long) arg1);
        if (var3 == null) {
            class227 var4 = new class227(class81.method608(19644) + 500L);
            class17.field250.method638((byte) -89, var4, (long) arg1);
        } else {
            var3.field3984 = class81.method608(19644) + 500L;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
    public static final void method1224(int arg0, int arg1) {
        field3138++;
        class216 var2 = class139.method972(arg0, false, 7);
        if (arg1 >= 78) {
            var2.method1457(0);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIILug;Lug;IIJ)V")
    public static final void method1225(int arg0, int arg1, int arg2, int arg3, class199 arg4, class199 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class125 var10 = new class125();
        var10.field2200 = arg8;
        var10.field2202 = arg1 * 128 + 64;
        var10.field2207 = arg2 * 128 + 64;
        var10.field2206 = arg3;
        var10.field2203 = arg4;
        var10.field2197 = arg5;
        var10.field2205 = arg6;
        var10.field2204 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class261.field4664[var11][arg1][arg2] == null) {
                class261.field4664[var11][arg1][arg2] = new class231(var11, arg1, arg2);
            }
        }
        class261.field4664[arg0][arg1][arg2].field4053 = var10;
    }
}
