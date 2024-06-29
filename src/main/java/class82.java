import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class82 extends class224 {

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    private int field1017;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    private int field1019;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    private int field1015;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    private int field1014;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    private int field1020;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field1011 = 13156520;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field1012 = -1;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Z")
    public static boolean field1021 = false;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "Lpb;")
    public static class393 field1025;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Lmo;")
    public static class447 field1028;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "Lmo;")
    public static class447 field1029;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IC)Z")
    public static final boolean method507(int arg0, char arg1) {
        ++field1027;
        if (arg0 <= 122) {
            return true;
        } else {
            return arg1 == 160 || ~arg1 == -33 || ~arg1 == -96 || arg1 == '-';
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
    public final void method299(int arg0, int arg1, int arg2) {
        if (arg2 == -1011) {
            ++field1022;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V")
    public static final void method508(int arg0, byte arg1) {
        ++field1024;
        int var2 = 76 % ((arg1 - -80) / 43);
        for (class161 var3 = class372.field5628.method1776(true); var3 != null; var3 = class372.field5628.method1773(-1)) {
            if (~((long) arg0) == ~(var3.field2539 >> 48 & 65535L)) {
                var3.method1120(-121);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIZ)V")
    public final void method298(int arg0, int arg1, boolean arg2) {
        ++field1026;
        if (!arg2) {
            this.field1018 = -26;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static void method509(int arg0) {
        field1028 = null;
        if (arg0 >= -14) {
            method509(-89);
        }
        field1025 = null;
        field1029 = null;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V")
    public final void method302(int arg0, int arg1, int arg2) {
        ++field1030;
        int var4 = this.field1020 * arg1 >> 12;
        int var5 = this.field1018 * arg2 >> 12;
        if (arg0 != -1011) {
            this.field1019 = 49;
        }
        int var6 = this.field1016 * arg1 >> 12;
        int var7 = this.field1013 * arg2 >> 12;
        int var8 = this.field1017 * arg1 >> 12;
        int var9 = this.field1014 * arg2 >> 12;
        int var10 = this.field1019 * arg1 >> 12;
        int var11 = this.field1015 * arg2 >> 12;
        class86.method529(var4, (byte) -48, super.field3730, var8, var9, var5, var11, var7, var6, var10);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method510(int arg0, String arg1) {
        if (arg0 != -7931) {
            return 47;
        } else {
            ++field1023;
            for (int var2 = 0; var2 < class12.field165.length; ++var2) {
                if (class12.field165[var2].equalsIgnoreCase(arg1)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1017 = arg4;
        this.field1018 = arg1;
        this.field1016 = arg2;
        this.field1019 = arg6;
        this.field1015 = arg7;
        this.field1014 = arg5;
        this.field1013 = arg3;
        this.field1020 = arg0;
    }
}
