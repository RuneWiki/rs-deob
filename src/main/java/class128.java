import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class128 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lok;")
    public static class41 field1895 = class137.method956("Verbindung zum Update)2Server hergestellt)3", 45);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lok;")
    private static class41 field1896 = class137.method956("Created gameworld", 45);

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Lok;")
    public static class41 field1898 = class137.method956("M", 45);

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Z")
    public static boolean field1901 = false;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lok;")
    public static class41 field1900 = class137.method956("Konfig geladen)3", 45);

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field1904 = 0;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lok;")
    public static class41 field1902 = field1896;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Lok;")
    public static class41 field1906 = class137.method956("unzap", 45);

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 30)
    public static void method894(int arg0) {
        int var1 = 78 / ((arg0 + 30) / 55);
        field1906 = null;
        field1895 = null;
        field1896 = null;
        field1898 = null;
        field1902 = null;
        field1900 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIII)V", line = 62)
    public static final void method895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1897++;
        if (arg1 == arg2) {
            class161.method1139(arg7, arg5, arg4, arg0, 64, arg6, arg1);
            return;
        }
        if (arg7 - arg1 >= class273.field4449 && class153.field2439 >= arg7 + arg1 && class15.field192 <= arg6 - arg2 && (arg2 + arg6) <= class237.field3801) {
            class310.method2148(arg0, arg5, arg6, arg4, arg1, (byte) 43, arg2, arg7);
        } else {
            class194.method1394(arg5, (byte) -61, arg2, arg7, arg0, arg1, arg4, arg6);
        }
        if (arg3 != 0) {
            method895(58, -9, 103, -9, 25, -19, 13, 90);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lmh;BLmh;)V", line = 85)
    public static final void method896(class65 arg0, byte arg1, class65 arg2) {
        class48.field749 = class33.method226(class48.field740, 0, arg0, arg2, (byte) -97);
        if (class166.field2625) {
            class88.field1296 = class162.method1144(arg2, class48.field740, (byte) 117, arg0, 0);
        } else {
            class88.field1296 = (class82) class48.field749;
        }
        field1899++;
        if (arg1 >= -111) {
            method895(-46, 60, 52, -117, -118, 14, 13, -43);
        }
        class244.field3898 = class33.method226(class9.field118, 0, arg0, arg2, (byte) -97);
        class140.field2165 = class33.method226(class256.field4117, 0, arg0, arg2, (byte) -97);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)Lqi;", line = 103)
    public static final class232 method897(int arg0, int arg1, int arg2) {
        class308 var3 = class205.field3312[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field5193; var4++) {
            class232 var5 = var3.field5201[var4];
            if ((var5.field3672 >> 29 & 0x3L) == 2L && var5.field3668 == arg1 && var5.field3665 == arg2) {
                return var5;
            }
        }
        return null;
    }
}
