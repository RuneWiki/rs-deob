import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class164 extends class130 {

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public int field3369 = 0;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public static int field3367 = 0;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "[I")
    public static int[] field3368 = new int[500];

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "Lch;")
    public static class29 field3372 = new class29(64);

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "Lgg;")
    public static class63 field3375 = class116.method911(43, ":clan:");

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "Z")
    public static boolean field3377 = false;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "Lgg;")
    public static class63 field3374 = class116.method911(43, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public static int field3381 = 0;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "Lgg;")
    public static class63 field3380 = class116.method911(43, "leuchten1:");

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    public static int field3384 = 0;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "Lgg;")
    private static class63 field3383 = class116.method911(43, "purple:");

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "Lgg;")
    public static class63 field3376 = field3383;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "Lgg;")
    public static class63 field3382 = class116.method911(43, "<img=1>");

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "Lgg;")
    public static class63 field3378 = field3383;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljc;I)V")
    public static final void method1114(class85 arg0, int arg1) {
        int var2 = -90 / ((arg1 + 23) / 61);
        class21.field495 = arg0;
        field3370++;
        class69.field1735 = class21.field495.method759(16, false);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZLab;)V")
    private final void method1115(int arg0, boolean arg1, class3 arg2) {
        if (arg0 == 2) {
            this.field3369 = arg2.method46((byte) 65);
        }
        if (arg1) {
            field3367 = 27;
        }
        field3373++;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(Z)V")
    public static void method1116(boolean arg0) {
        field3376 = null;
        field3374 = null;
        if (arg0) {
            method1116(false);
        }
        field3380 = null;
        field3383 = null;
        field3378 = null;
        field3372 = null;
        field3368 = null;
        field3382 = null;
        field3375 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lab;I)V")
    public final void method1117(class3 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method64(31790);
            if (var3 == 0) {
                field3371++;
                if (arg1 != 1051) {
                    this.field3369 = 24;
                    return;
                }
                return;
            }
            this.method1115(var3, false, arg0);
        }
    }
}
