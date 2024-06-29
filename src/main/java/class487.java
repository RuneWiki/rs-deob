import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class487 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Llga;")
    public static class712 field6678 = new class712(46, 8);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lca;")
    public static class308 field6680;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public static void method2745(boolean arg0) {
        if (!arg0) {
            method2745(false);
        }
        field6680 = null;
        field6678 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method2746(int arg0, String arg1) {
        field6679++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = arg0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (!(var5 <= '\u0000' || var5 >= '\u0080') || !(var5 < ' ' || var5 > 'ÿ')) {
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
}
