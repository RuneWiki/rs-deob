import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class40 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lna;")
    public static class26 field660 = class69.method505(" de votre liste d(Wamis)3", (byte) -124);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lna;")
    public static class26 field659 = class69.method505("Prendre", (byte) -121);

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Z")
    public static boolean field663 = false;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)I", line = 10)
    public static final int method323(byte arg0) {
        if (arg0 != 70) {
            method324(true);
        }
        field661++;
        if (class233.field3694) {
            return 0;
        } else if (class324.method2250(arg0 ^ 0x1C)) {
            return class8.field95 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V", line = 29)
    public static void method324(boolean arg0) {
        field659 = null;
        if (arg0) {
            field660 = (class26) null;
        }
        field660 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILbe;BIIII)V", line = 52)
    public static final void method325(int arg0, int arg1, class297 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 >= -89) {
            method324(true);
        }
        field662++;
        if (class151.field2372) {
            class164.field2554 = 32;
        } else {
            class164.field2554 = 0;
        }
        class151.field2372 = false;
        if (class310.field5325 != 0) {
            if (arg5 <= arg4 && (arg5 + 16) > arg4 && arg0 >= arg6 && arg6 + 16 > arg0) {
                arg2.field5012 -= 4;
                class318.method2209(113, arg2);
            } else if (arg4 >= arg5 && arg4 < (arg5 + 16) && arg0 >= (arg6 + arg1 - 16) && (arg1 + arg6) > arg0) {
                arg2.field5012 += 4;
                class318.method2209(112, arg2);
            } else if (arg4 >= (arg5 - class164.field2554) && arg4 < class164.field2554 + arg5 + 16 && arg0 >= arg6 + 16 && arg1 + arg6 - 16 > arg0) {
                int var8 = (arg1 - 32) * arg1 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg1 - var8 - 32;
                int var10 = arg0 - (var8 / 2) - arg6 - 16;
                arg2.field5012 = (arg7 - arg1) * var10 / var9;
                class318.method2209(-48, arg2);
                class151.field2372 = true;
            }
        }
        if (class167.field2591 == 0) {
            return;
        }
        int var11 = arg2.field4967;
        if ((arg5 - var11) <= arg4 && arg6 <= arg0 && arg4 < arg5 + 16 && arg1 + arg6 >= arg0) {
            arg2.field5012 += class167.field2591 * 45;
            class318.method2209(-116, arg2);
        }
    }
}
