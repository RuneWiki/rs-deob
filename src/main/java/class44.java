import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class44 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field659 = 0;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field660 = 0;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field664 = new String[100];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static final void method290(byte arg0) {
        class240.field3663.method546(-90762264);
        if (arg0 != 95) {
            method292((byte) -5);
        }
        field663++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I")
    public static final int method291(int arg0, int arg1, int arg2) {
        field666++;
        if (arg2 != 0) {
            field660 = -115;
        }
        class69 var3 = (class69) class75.field1051.method23(arg2 ^ 0xD8, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && var3.field942.length > arg0) {
            return var3.field942[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
    public static void method292(byte arg0) {
        if (arg0 != 68) {
            field659 = 20;
        }
        field664 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZC)Z")
    public static final boolean method293(boolean arg0, char arg1) {
        field665++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg0) {
            field660 = -89;
        }
        if (arg1 != '\u0000') {
            int var2 = 0;
            char[] var3 = class40.field599;
            while (var2 < var3.length) {
                char var4 = var3[var2];
                if (arg1 == var4) {
                    return true;
                }
                var2++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(III)I")
    public static final int method294(int arg0, int arg1, int arg2) {
        if (arg1 != -18888) {
            field659 = 24;
        }
        field661++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(III)I")
    public static final int method295(int arg0, int arg1, int arg2) {
        field658++;
        class69 var3 = (class69) class75.field1051.method23(216, (long) arg1);
        if (var3 == null) {
            return 0;
        }
        if (arg2 > -44) {
            method294(80, -69, 5);
        }
        if (arg0 == -1) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field942.length; var5++) {
            if (var3.field941[var5] == arg0) {
                var4 += var3.field942[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }
}
