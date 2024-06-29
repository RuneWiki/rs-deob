import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class242 {

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Lub;")
    public static class227 field4199 = class257.method1749("<col=ff3000>", 17263);

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field4202 = 0;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lub;")
    public static class227 field4204 = class257.method1749(":assist:", 17263);

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lub;")
    public static class227 field4203 = class257.method1749(" loggt sich aus)3", 17263);

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lub;")
    public static class227 field4207 = class257.method1749("weiss:", 17263);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Ln;")
    public static class138 field4206;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILfh;Lfh;IIJ)V")
    public static final void method1610(int arg0, int arg1, int arg2, int arg3, class180 arg4, class180 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class50 var10 = new class50();
        var10.field879 = arg8;
        var10.field877 = arg1 * 128 + 64;
        var10.field875 = arg2 * 128 + 64;
        var10.field881 = arg3;
        var10.field886 = arg4;
        var10.field880 = arg5;
        var10.field878 = arg6;
        var10.field883 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class261.field4539[var11][arg1][arg2] == null) {
                class261.field4539[var11][arg1][arg2] = new class108(var11, arg1, arg2);
            }
        }
        class261.field4539[arg0][arg1][arg2].field2024 = var10;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method1611(int arg0) {
        field4199 = null;
        field4207 = null;
        if (arg0 != 64) {
            field4204 = null;
        }
        field4204 = null;
        field4206 = null;
        field4203 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
    public static final int method1612(int arg0, int arg1) {
        if (arg1 != 580782183) {
            field4199 = null;
        }
        field4200++;
        return arg0 >>> 7;
    }
}
