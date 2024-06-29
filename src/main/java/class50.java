import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class50 extends class292 {

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "Lce;")
    public class222 field803;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "Ljava/lang/String;")
    public static String field802 = "Discard";

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "[[[B")
    public static byte[][][] field799;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)I")
    public static final int method416(int arg0) {
        field800++;
        if (class293.field4615 == null) {
            return -1;
        }
        while (class293.field4615.field4535 > class31.field505) {
            if (class293.field4615.method1941(class31.field505, (byte) 100)) {
                return class31.field505++;
            }
            class31.field505++;
        }
        if (arg0 != -26921) {
            method421(3, true, (class264) null, 126, -128, -88, 75);
        }
        return -1;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
    public static void method417(byte arg0) {
        int var1 = -111 / ((arg0 + 33) / 53);
        field799 = null;
        field802 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([Ljava/lang/String;[SI)V")
    public static final void method418(String[] arg0, short[] arg1, int arg2) {
        class158.method1071(arg0, arg0.length - 1, arg1, 0, false);
        if (arg2 < -63) {
            field798++;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(JB)V")
    public static final void method419(long arg0, byte arg1) {
        field804++;
        class292.field4607.field588 = 0;
        class292.field4607.method287(440742616, 21);
        if (arg1 != -17) {
            field799 = null;
        }
        class292.field4607.method337(2103219728, arg0);
        class259.field3978 = -3;
        class137.field2132 = 1;
        class255.field3911 = 0;
        class6.field102 = 0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILag;IIII)V")
    public static final void method420(int arg0, int arg1, int arg2, class188 arg3, int arg4, int arg5, int arg6, int arg7) {
        field797++;
        if (class178.field2668) {
            class216.field3339 = 32;
        } else {
            class216.field3339 = 0;
        }
        class178.field2668 = false;
        if (class3.field50 != 0) {
            if (arg6 <= arg0 && arg6 + 16 > arg0 && arg2 >= arg1 && arg2 < (arg1 + 16)) {
                arg3.field2887 -= 4;
                class246.method1663(255, arg3);
            } else if (arg0 >= arg6 && arg0 < arg6 + 16 && arg2 >= (arg1 + arg4 - 16) && arg2 < arg1 + arg4) {
                arg3.field2887 += 4;
                class246.method1663(255, arg3);
            } else if (arg6 - class216.field3339 <= arg0 && arg6 + class216.field3339 + 16 > arg0 && arg1 + 16 <= arg2 && arg2 < (arg1 + arg4 - 16)) {
                int var8 = (arg4 - 32) * arg4 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - arg1 - (var8 / 2) - 16;
                int var10 = arg4 - var8 - 32;
                arg3.field2887 = (arg7 - arg4) * var9 / var10;
                class246.method1663(255, arg3);
                class178.field2668 = true;
            }
        }
        if (class77.field1307 == arg5) {
            return;
        }
        int var11 = arg3.field2922;
        if (arg6 - var11 <= arg0 && arg1 <= arg2 && arg0 < arg6 + 16 && arg1 + arg4 >= arg2) {
            arg3.field2887 += class77.field1307 * 45;
            class246.method1663(arg5 + 255, arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZLka;IIII)V")
    public static final void method421(int arg0, boolean arg1, class264 arg2, int arg3, int arg4, int arg5, int arg6) {
        field801++;
        class25.method201(arg1, arg4, arg5, arg2.field4123, arg2.field4176, arg3, arg6, arg0);
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lce;)V")
    public class50(class222 arg0) {
        this.field803 = arg0;
    }
}
