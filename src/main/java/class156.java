import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class class156 {

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field2211 = 0;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field2214 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "[Lsm;")
    public static class156[] field2213;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V", line = 12)
    public static final void method1047(boolean arg0) {
        field2210++;
        if (!arg0) {
            method1050('=', -80, -93);
        }
        class308.field4230.method1787(class262.field3577, class72.field1114 ? class250.field3462 + 256 : -1);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Lne;", line = 26)
    public static final class173 method1048(int arg0) {
        if (arg0 != 121) {
            field2211 = -13;
        }
        field2216++;
        if (class42.field622 == null || class300.field4148 == null) {
            return null;
        }
        for (class173 var1 = (class173) class300.field4148.method227((byte) -85); var1 != null; var1 = (class173) class300.field4148.method227((byte) -85)) {
            class46 var2 = class368.method2358(var1.field2464, 36);
            if (var2 != null && var2.field720 && var2.method330((byte) 123)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 61)
    public static void method1049(int arg0) {
        field2213 = null;
        field2214 = null;
        int var1 = -91 % ((-arg0 - 42) / 60);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(CII)C", line = 78)
    public static final char method1050(char arg0, int arg1, int arg2) {
        field2212++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        }
        if (arg1 != -31348) {
            method1050('\b', -42, -105);
        }
        if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[IJ)Ljava/lang/String;", line = 169)
    public static final String method1051(int arg0, int arg1, int[] arg2, long arg3) {
        field2208++;
        if (class20.field255 != null) {
            String var5 = class20.field255.method1925(arg3, -8259, arg1, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg0 != 7608) {
            method1048(-65);
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Leb;B)V", line = 191)
    public static final void method1052(class371 arg0, byte arg1) {
        if (arg1 != 127) {
            field2214 = null;
        }
        field2209++;
        for (int var2 = 0; var2 < class184.field2578; var2++) {
            int var3 = arg0.method2433(arg1 ^ 0xFFFFFFC2);
            int var4 = arg0.method2403((byte) 67);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class296.field4119[var3] != null) {
                class296.field4119[var3].field2522 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(II)V", line = 225)
    public class156(int arg0, int arg1) {
        this.field2215 = arg1;
        this.field2207 = arg0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method279(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method274(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lek;IIIIZ)V")
    public abstract void method273(class294 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(Lek;IIIIZ)Z")
    public abstract boolean method276(class294 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method270(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "()V")
    public abstract void method280();

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lvb;[I)V")
    public abstract void method272(class107 arg0, int[] arg1);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
    public abstract void method267(int arg0, int arg1);

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(Lek;IIIIZ)V")
    public abstract void method269(class294 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V")
    public abstract void method268(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILek;)Lek;")
    public abstract class294 method277(int arg0, int arg1, class294 arg2);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)I")
    public abstract int method278(int arg0, int arg1);

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(II)I")
    public abstract int method275(int arg0, int arg1);
}
