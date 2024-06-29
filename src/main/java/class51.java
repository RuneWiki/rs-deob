import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class51 extends class116 {

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "Lda;")
    public static class275 field838 = class255.method1672(98, "<col=40ff00>");

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field842 = -1;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "Lda;")
    private static class275 field843 = class255.method1672(92, "Connected to update server");

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "Lda;")
    public static class275 field852 = class255.method1672(126, " loggt sich aus)3");

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "Lda;")
    public static class275 field854 = class255.method1672(101, "::");

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "Lda;")
    public static class275 field844 = field843;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "Lma;")
    public static class105 field841;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "Lda;")
    public class275 field847;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "[[[I")
    public static int[][][] field839;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZIIILfd;III)V")
    public static final void method317(boolean arg0, int arg1, int arg2, int arg3, class229 arg4, int arg5, int arg6, int arg7) {
        field853++;
        if (class148.field2581) {
            class262.field4557 = 32;
        } else {
            class262.field4557 = 0;
        }
        class148.field2581 = false;
        if (!arg0) {
            field856 = -95;
        }
        if (class65.field1074 != 0) {
            if (arg1 >= arg5 && arg1 < arg5 + 16 && arg2 >= arg7 && arg2 < (arg7 + 16)) {
                arg4.field4016 -= 4;
                class40.method231(arg4, 0);
            } else if (arg1 >= arg5 && arg5 + 16 > arg1 && (arg7 + arg6 - 16) <= arg2 && arg2 < arg7 + arg6) {
                arg4.field4016 += 4;
                class40.method231(arg4, 0);
            } else if (arg1 >= (arg5 - class262.field4557) && arg5 + class262.field4557 + 16 > arg1 && arg7 + 16 <= arg2 && (arg6 + arg7 - 16) > arg2) {
                int var8 = (arg6 - 32) * arg6 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - (var8 / 2) - arg7 - 16;
                int var10 = arg6 - var8 - 32;
                arg4.field4016 = (arg3 - arg6) * var9 / var10;
                class40.method231(arg4, 0);
                class148.field2581 = true;
            }
        }
        if (class83.field1343 == 0) {
            return;
        }
        int var11 = arg4.field3885;
        if ((arg5 - var11) <= arg1 && arg7 <= arg2 && arg1 < (arg5 + 16) && arg2 <= (arg7 + arg6)) {
            arg4.field4016 += class83.field1343 * 45;
            class40.method231(arg4, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lij;B)V")
    public final void method318(class85 arg0, byte arg1) {
        if (arg1 < 53) {
            field844 = null;
        }
        field840++;
        while (true) {
            int var3 = arg0.method564((byte) 60);
            if (var3 == 0) {
                return;
            }
            this.method321(-8331792, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)Z")
    public final boolean method319(int arg0) {
        int var2 = 125 % ((arg0 - 33) / 32);
        field845++;
        return this.field849 == 115;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)Ldd;")
    public static final class79 method320(int arg0, int arg1) {
        class79 var2 = (class79) class141.field2482.method990((long) arg0, (byte) 94);
        field850++;
        if (var2 != null) {
            return var2;
        }
        int var3 = 7 % ((-arg1 - 47) / 55);
        class79 var4 = class169.method1159(class11.field163, arg0, true, class180.field3088, false);
        if (var4 != null) {
            class141.field2482.method986(0, (long) arg0, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILij;)V")
    private final void method321(int arg0, int arg1, class85 arg2) {
        if (arg0 != -8331792) {
            this.field849 = 89;
        }
        field851++;
        if (arg1 == 1) {
            this.field849 = arg2.method564((byte) 99);
        } else if (arg1 == 2) {
            this.field846 = arg2.method568(19845);
        } else if (arg1 == 5) {
            this.field847 = arg2.method599(-1);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)V")
    public static final void method322(int arg0, int arg1) {
        if (arg1 != -9) {
            method323(-45);
        }
        for (class216 var2 = (class216) class116.field2055.method1864((byte) -55); var2 != null; var2 = (class216) class116.field2055.method1869(arg1 ^ 0x8)) {
            if ((var2.field1707 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method741(3);
            }
        }
        field855++;
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)V")
    public static void method323(int arg0) {
        field843 = null;
        field839 = null;
        field844 = null;
        field854 = null;
        field841 = null;
        if (arg0 >= -110) {
            field856 = -56;
        }
        field852 = null;
        field838 = null;
    }
}
