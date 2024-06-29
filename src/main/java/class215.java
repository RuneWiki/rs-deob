import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class215 {

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field2727 = 1;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "[[[B")
    public static byte[][][] field2728;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ltn;I)Lpi;", line = 6)
    public static final class322 method1303(class179 arg0, int arg1) {
        if (arg1 != -4008) {
            field2726 = 26;
        }
        field2725++;
        return new class322(arg0.method1137((byte) -126), arg0.method1137((byte) -110), arg0.method1137((byte) -92), arg0.method1137((byte) -101), arg0.method1114(arg1 ^ 0xFFFFF022), arg0.method1114(arg1 ^ 0xFFFFF02A), arg0.method1094(255));
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V", line = 19)
    public static void method1304(byte arg0) {
        field2728 = null;
        if (arg0 > -38) {
            field2726 = -103;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBIIII)V", line = 36)
    public static final void method1305(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2724++;
        if (arg4 == arg5) {
            class244.method1513(arg2, (byte) -122, arg3, arg4, arg0);
            return;
        }
        if (arg2 - arg4 >= class108.field1334 && arg2 + arg4 <= class592.field8242 && arg0 - arg5 >= class112.field1386 && class328.field4190 >= arg0 + arg5) {
            class471.method2774(arg4, (byte) 67, arg2, arg5, arg0, arg3);
        } else {
            class282.method1698(arg5, arg0, arg3, arg4, (byte) -75, arg2);
        }
        if (arg1 != -46) {
            method1304((byte) -4);
        }
    }
}
