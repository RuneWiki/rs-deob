import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class544 {

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field7670 = -1;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Lqaa;")
    public static class27 field7667 = new class27(11, 8);

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field7679 = 0;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public int field7665;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public int field7666;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public int field7669;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public int field7671;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public int field7672;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public int field7673;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public int field7674;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public int field7675;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public int field7678;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public int field7680;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public int field7681;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public int field7682;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public static final void method3216(byte arg0) {
        field7668++;
        class709 var1 = (class709) class119.field1862.method1522(true);
        boolean var2 = class755.field10512 != null || class513.field7316 > 0;
        int var3 = var1.method2007(-24956);
        int var4 = 117 % ((arg0 - 22) / 52);
        int var5 = var1.method2002((byte) -77);
        if (var2) {
            class152.field2285 = 1;
        }
        if (var2) {
            class594.field8486 = class522.field7394;
        } else {
            class320.method2062(var3, class522.field7394, (byte) -72, var5);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLel;)Z")
    public final boolean method3217(boolean arg0, class544 arg1) {
        field7677++;
        if (!arg0) {
            this.field7675 = 45;
        }
        return this.field7669 == arg1.field7669 && this.field7674 == arg1.field7674 && this.field7681 == arg1.field7681;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([BFFFIILse;IIFFZI)V")
    public static final void method3218(byte[] arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class255 arg6, int arg7, int arg8, float arg9, float arg10, boolean arg11, int arg12) {
        for (int var13 = 0; var13 < arg7; var13++) {
            class4.method16(16529, var13, arg7, arg12, arg1, arg3, arg5, arg10, arg6, arg4, arg9, arg2, arg8, arg0);
            arg8 += arg4 * arg12;
        }
        if (!arg11) {
            method3216((byte) 112);
        }
        field7676++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method3219(int arg0) {
        field7667 = null;
        if (arg0 != 15660) {
            method3219(-62);
        }
    }
}
