import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class88 {

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Z")
    public boolean field1968 = true;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field1961;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public int field1955;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public int field1959;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lrd;")
    public static class114 field1951 = class84.method656("RuneScape wird geladen )2 bitte warten)3)3)3", (byte) 117);

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lrd;")
    private static class114 field1953 = class84.method656("Remove", (byte) 126);

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lrd;")
    public static class114 field1957 = class84.method656("@yel@*V", (byte) 119);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lrd;")
    public static class114 field1952 = field1953;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Lrd;")
    public static class114 field1965 = class84.method656("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3", (byte) 123);

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field1963 = 128;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field1964 = 0;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lid;")
    public static class60 field1969;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method665(int arg0) {
        field1951 = null;
        field1969 = null;
        field1953 = null;
        if (arg0 == 9380) {
            field1952 = null;
            field1965 = null;
            field1957 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)V")
    public static final void method666(int arg0, byte arg1) {
        field1962++;
        class103.field2400 += arg0;
        if (arg1 <= 87) {
            method666(52, (byte) -64);
        }
        while (class103.field2400 >= class52.field1106) {
            class103.field2400 -= class52.field1106;
            class135.field3299 -= class135.field3299 >> 2;
        }
        class135.field3299 -= arg0 * 1000;
        if (class135.field3299 < 0) {
            class135.field3299 = 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)I")
    public static final int method667(byte arg0) {
        field1956++;
        int var1 = 94 % ((arg0 - 12) / 36);
        return class61.field1306++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIILnd;I)V")
    public static final void method668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class90 arg7, int arg8) {
        if (class96.field2209) {
            class7.field104 = 32;
        } else {
            class7.field104 = 0;
        }
        class96.field2209 = false;
        if (arg5 > -69) {
            return;
        }
        field1958++;
        if (arg6 >= arg8 && arg8 + 16 > arg6 && arg2 <= arg3 && arg2 + 16 > arg3) {
            arg7.field2013 -= class62.field1320 * 4;
            if (arg4 == 1) {
                class24.field460 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                class140.field3335 = true;
            }
        } else if (arg8 <= arg6 && arg8 + 16 > arg6 && arg3 >= arg1 + arg2 - 16 && arg1 + arg2 > arg3) {
            arg7.field2013 += class62.field1320 * 4;
            if (arg4 == 1) {
                class24.field460 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                class140.field3335 = true;
            }
        } else if (arg8 - class7.field104 <= arg6 && arg8 + class7.field104 + 16 > arg6 && arg2 + 16 <= arg3 && arg1 + arg2 - 16 > arg3 && class62.field1320 > 0) {
            class96.field2209 = true;
            int var9 = (arg1 - 32) * arg1 / arg0;
            if (arg4 == 1) {
                class24.field460 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                class140.field3335 = true;
            }
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg3 - var9 / 2 - arg2 - 16;
            int var11 = arg1 - var9 - 32;
            arg7.field2013 = (arg0 - arg1) * var10 / var11;
        }
        if (class144.field3416 == 0) {
            return;
        }
        int var12 = arg7.field2032;
        if (arg4 == -1) {
            var12 = 479;
        }
        if (arg6 < arg8 - var12 || arg2 > arg3 || arg6 >= arg8 + 16 || arg1 + arg2 < arg3) {
            return;
        }
        if (arg4 == 1) {
            class24.field460 = true;
        }
        arg7.field2013 += class144.field3416 * 45;
        if (arg4 == 2 || arg4 == 3) {
            class140.field3335 = true;
        }
        return;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1960 = arg0;
        this.field1961 = arg3;
        this.field1967 = arg5;
        this.field1955 = arg4;
        this.field1970 = arg1;
        this.field1968 = arg6;
        this.field1959 = arg2;
    }
}
