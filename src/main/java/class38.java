import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class38 {

    @OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
    public static int[] field627 = new int[100];

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field630 = 0;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lda;")
    private static class275 field632 = class255.method1672(118, "Allocating memory");

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lda;")
    public static class275 field629 = field632;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lda;")
    public static class275 field626 = class255.method1672(111, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!m", name = "k", descriptor = "[I")
    public static int[] field636 = new int[128];

    @OriginalMember(owner = "client!m", name = "h", descriptor = "[I")
    public static int[] field633 = new int[1000];

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Lda;")
    public static class275 field637 = class255.method1672(102, "Benutzen");

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Lda;")
    public static class275 field635 = class255.method1672(98, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lda;")
    public static class275 field634 = class255.method1672(105, " loggt sich ein)3");

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lwa;")
    public class131 field631;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "[I")
    public int[] field640;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIILak;Lak;IIJ)V")
    public static final void method223(int arg0, int arg1, int arg2, int arg3, class234 arg4, class234 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class139 var10 = new class139();
        var10.field2426 = arg8;
        var10.field2436 = arg1 * 128 + 64;
        var10.field2434 = arg2 * 128 + 64;
        var10.field2445 = arg3;
        var10.field2444 = arg4;
        var10.field2446 = arg5;
        var10.field2439 = arg6;
        var10.field2441 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class235.field4101[var11][arg1][arg2] == null) {
                class235.field4101[var11][arg1][arg2] = new class3(var11, arg1, arg2);
            }
        }
        class235.field4101[arg0][arg1][arg2].field50 = var10;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lma;Lma;Lma;I)V")
    public static final void method224(class105 arg0, class105 arg1, class105 arg2, int arg3) {
        if (arg3 != 6289) {
            method223(118, 29, 11, 62, (class234) null, (class234) null, 100, -115, 47L);
        }
        field628++;
        class180.field3088 = arg2;
        class5.field68 = arg1;
        class11.field163 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static void method225(boolean arg0) {
        field626 = null;
        field636 = null;
        field635 = null;
        field633 = null;
        if (!arg0) {
            return;
        }
        field637 = null;
        field629 = null;
        field627 = null;
        field632 = null;
        field634 = null;
    }
}
