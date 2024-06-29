import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 {

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Z")
    public boolean field628 = true;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Laf;")
    public static class7 field629 = class48.method406(40, "null");

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field622 = 0;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Laf;")
    private static class7 field623 = class48.method406(40, "Choose Option");

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Laf;")
    public static class7 field625 = field623;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field632 = -1;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "J")
    public static volatile long field626 = 0L;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Z")
    public static boolean field637 = false;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method222(int arg0) {
        field623 = null;
        if (arg0 != 0) {
            method223(-66L, 22);
        }
        field625 = null;
        field629 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(JI)V")
    public static final void method223(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 != 0) {
            field625 = null;
        }
        field630++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lof;I)Lof;")
    public static final class103 method224(class103 arg0, int arg1) {
        field636++;
        if (arg1 != -1413) {
            method222(-107);
        }
        int var2 = class153.method1202(class7.method98(26454, arg0), 124);
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0 = class37.method328(arg1 + 1413, arg0.field2516);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field631 = arg5;
        this.field624 = arg3;
        this.field628 = arg6;
        this.field633 = arg4;
        this.field634 = arg1;
        this.field627 = arg2;
        this.field635 = arg0;
    }
}
