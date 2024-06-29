import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class170 extends class166 {

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Lcd;")
    public static class23 field3381 = class54.method414("::clientdrop", -1);

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Lcd;")
    public static class23 field3385 = class54.method414("Das ist eine Mitglieder)2Welt(Q", -1);

    @OriginalMember(owner = "client!t", name = "z", descriptor = "Lcd;")
    private static class23 field3391 = class54.method414("Use", -1);

    @OriginalMember(owner = "client!t", name = "y", descriptor = "Lcd;")
    public static class23 field3390 = field3391;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "[I")
    public static int[] field3392 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "Lea;")
    public static class38 field3389;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Lkh;")
    public static class97 field3383;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1038(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        field3393++;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg6;
            arg6 = var8;
        }
        if (arg0 > -59) {
            method1041(-60);
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg2;
        } else {
            return 7 + 1 - arg3 - arg6;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
    public static final void method1039(int arg0, int arg1, int arg2) {
        field3382++;
        if (class40.field848 != 0 && arg2 != -1) {
            class66.method489(0, class129.field2673, class40.field848, 78, arg2, false);
            class25.field531 = true;
        }
        if (arg0 >= -53) {
            field3383 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
    public class170(int arg0, int arg1) {
        this.field3386 = arg1;
        this.field3388 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIZ)V")
    public static final void method1040(int arg0, int arg1, int arg2, boolean arg3) {
        field3384++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        } else if (arg2 == 0) {
            class145.field2957 = arg1;
            class48.field1163 = arg0;
            class143.field2934 = arg3;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public static void method1041(int arg0) {
        field3385 = null;
        field3392 = null;
        field3383 = null;
        field3381 = null;
        if (arg0 < 67) {
            method1039(95, -37, 104);
        }
        field3389 = null;
        field3390 = null;
        field3391 = null;
    }
}
