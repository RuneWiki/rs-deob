import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class177 {

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Lib;")
    public class162 field2759 = new class162();

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "[I")
    public static int[] field2757 = new int[25];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Lib;")
    private class162 field2762;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)Ll;")
    public static final class169 method1184(int arg0, int arg1, int arg2) {
        class154 var3 = class27.field346[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2411;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lib;")
    public final class162 method1185(int arg0) {
        field2755++;
        class162 var2 = this.field2759.field2551;
        if (this.field2759 == var2) {
            return null;
        }
        var2.method1075(7596);
        if (arg0 != -8241) {
            field2757 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)Lib;")
    public final class162 method1186(boolean arg0) {
        field2751++;
        class162 var2 = this.field2762;
        if (this.field2759 == var2) {
            this.field2762 = null;
            return null;
        } else if (arg0) {
            this.field2762 = var2.field2551;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Lib;")
    public final class162 method1187(byte arg0) {
        field2754++;
        class162 var2 = this.field2759.field2551;
        if (this.field2759 == var2) {
            this.field2762 = null;
            return null;
        }
        this.field2762 = var2.field2551;
        if (arg0 != 127) {
            field2757 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method1188(int arg0, String arg1) {
        field2758++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        if (arg0 != 14303) {
            field2757 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
    public final int method1189(int arg0) {
        int var2 = arg0;
        field2753++;
        for (class162 var3 = this.field2759.field2551; var3 != this.field2759; var3 = var3.field2551) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILib;)V")
    public final void method1190(int arg0, class162 arg1) {
        if (arg1.field2547 != null) {
            arg1.method1075(arg0 - 621);
        }
        arg1.field2551 = this.field2759;
        if (arg0 == 8217) {
            field2761++;
            arg1.field2547 = this.field2759.field2547;
            arg1.field2547.field2551 = arg1;
            arg1.field2551.field2547 = arg1;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    public static final void method1191(byte arg0) {
        if (arg0 == 29) {
            field2756++;
            class82.field1298.method145(arg0 - 156);
            class98.field1463.method145(-70);
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V")
    public final void method1192(byte arg0) {
        field2752++;
        while (true) {
            class162 var2 = this.field2759.field2551;
            if (this.field2759 == var2) {
                this.field2762 = null;
                if (arg0 == 0) {
                    return;
                } else {
                    method1184(-96, 60, -111);
                    return;
                }
            }
            var2.method1075(7596);
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)V")
    public static void method1193(byte arg0) {
        if (arg0 != 82) {
            field2757 = null;
        }
        field2757 = null;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class177() {
        this.field2759.field2547 = this.field2759;
        this.field2759.field2551 = this.field2759;
    }
}
