import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class38 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field717 = 0;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Led;")
    public static class43 field718 = class191.method1219("VOLL", false);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field719 = 0;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Ltd;")
    public static class176 field720 = new class176(30);

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Lff;")
    public static class54 field723 = new class54(5000);

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "[J")
    public static long[] field727 = new long[100];

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Led;")
    public static class43 field728 = class191.method1219("k", false);

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "J")
    public static long field729 = 0L;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Lme;")
    public static class114 field725;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(JI)V")
    public static final void method209(long arg0, int arg1) {
        field721++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class44.method276(arg0 - 1L, 127);
            class44.method276(1L, arg1 ^ 0xFFFFE3F3);
        } else {
            class44.method276(arg0, 115);
        }
        if (arg1 != -7296) {
            method209(97L, -83);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method210(int arg0) {
        if (arg0 != 5000) {
            field727 = null;
        }
        field725 = null;
        field718 = null;
        field728 = null;
        field720 = null;
        field727 = null;
        field723 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)V")
    public static final void method211(boolean arg0, int arg1) {
        field722++;
        class174 var2 = (class174) class90.field1792.method75((long) arg1, -113);
        if (var2 == null) {
            return;
        }
        if (!arg0) {
            method211(true, -25);
        }
        for (int var3 = 0; var3 < var2.field3462.length; var3++) {
            var2.field3462[var3] = -1;
            var2.field3468[var3] = 0;
        }
    }
}
