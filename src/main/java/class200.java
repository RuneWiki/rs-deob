import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class200 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field3932 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field3940 = 1;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Led;")
    private static class43 field3931 = class191.method1219("Use", false);

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Z")
    public static boolean field3938 = false;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field3933 = -1;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Led;")
    public static class43 field3930 = field3931;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Led;")
    public static class43 field3935 = class191.method1219("Das ist eine Mitglieder)2Welt(Q", false);

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lga;")
    public static class58 field3934;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static final void method1305(int arg0) {
        class107 var1 = class102.field1942;
        synchronized (class102.field1942) {
            class21.field357 = class156.field3157;
            if (arg0 != -16) {
                method1306(83, 126, -71, -102, -124);
            }
            class185.field3654 = class193.field3755;
            class105.field1998 = class12.field178;
            class185.field3649 = class43.field840;
            class41.field814 = class116.field2276;
            class187.field3673 = class95.field1852;
            class103.field1959 = class16.field264;
            class43.field840 = 0;
        }
        field3941++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)V")
    public static final void method1306(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3939++;
        for (int var5 = arg4; var5 < class125.field2476; var5++) {
            if (arg0 < class96.field1872[var5] + class27.field480[var5] && arg0 + arg3 > class96.field1872[var5] && arg2 < class21.field364[var5] + class114.field2214[var5] && arg2 + arg1 > class114.field2214[var5]) {
                class107.field2056[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
    public static void method1307(boolean arg0) {
        field3931 = null;
        field3930 = null;
        if (!arg0) {
            field3938 = true;
        }
        field3935 = null;
        field3934 = null;
    }
}
