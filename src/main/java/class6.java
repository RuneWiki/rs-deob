import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class6 {

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "Lj;")
    public static class235 field70;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "[F")
    public static float[] field75;

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "Z")
    public static boolean field76;

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "Lbi;")
    public static class104 field74;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "Ldk;")
    public static class483 field72;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
    public static void method52(int arg0) {
        field72 = null;
        field74 = null;
        field75 = null;
        field70 = null;
        int var1 = 75 % ((16 - arg0) / 56);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Lj;")
    public static final class235 method53(int arg0, int arg1) {
        field68++;
        class235[] var2 = class318.method2133(-32245);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class235 var4 = var2[var3];
            if (var4.field3868 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method54(int arg0, String arg1) {
        field69++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var6 = arg1.charAt(var4);
            if (var6 > '\u0000' && var6 < '\u0080' || var6 >= ' ' && var6 <= 'ÿ') {
                var3[var4] = (byte) var6;
            } else if (var6 == '€') {
                var3[var4] = -128;
            } else if (var6 == '‚') {
                var3[var4] = -126;
            } else if (var6 == 'ƒ') {
                var3[var4] = -125;
            } else if (var6 == '„') {
                var3[var4] = -124;
            } else if (var6 == '…') {
                var3[var4] = -123;
            } else if (var6 == '†') {
                var3[var4] = -122;
            } else if (var6 == '‡') {
                var3[var4] = -121;
            } else if (var6 == 'ˆ') {
                var3[var4] = -120;
            } else if (var6 == '‰') {
                var3[var4] = -119;
            } else if (var6 == 'Š') {
                var3[var4] = -118;
            } else if (var6 == '‹') {
                var3[var4] = -117;
            } else if (var6 == 'Œ') {
                var3[var4] = -116;
            } else if (var6 == 'Ž') {
                var3[var4] = -114;
            } else if (var6 == '‘') {
                var3[var4] = -111;
            } else if (var6 == '’') {
                var3[var4] = -110;
            } else if (var6 == '“') {
                var3[var4] = -109;
            } else if (var6 == '”') {
                var3[var4] = -108;
            } else if (var6 == '•') {
                var3[var4] = -107;
            } else if (var6 == '–') {
                var3[var4] = -106;
            } else if (var6 == '—') {
                var3[var4] = -105;
            } else if (var6 == '˜') {
                var3[var4] = -104;
            } else if (var6 == '™') {
                var3[var4] = -103;
            } else if (var6 == 'š') {
                var3[var4] = -102;
            } else if (var6 == '›') {
                var3[var4] = -101;
            } else if (var6 == 'œ') {
                var3[var4] = -100;
            } else if (var6 == 'ž') {
                var3[var4] = -98;
            } else if (var6 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        int var5 = -12 / ((19 - arg0) / 48);
        return var3;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Z)V")
    public static final void method55(boolean arg0) {
        if (class164.field2374 != null) {
            class164.field2374.method3039(12755);
            class376.field5791 = null;
            class164.field2374 = null;
        }
        if (arg0) {
            method53(-19, 46);
        }
        field66++;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZIZ)V")
    public static final void method56(boolean arg0, int arg1, boolean arg2) {
        field67++;
        class339 var3 = class154.method940(arg1, arg2, (byte) 119);
        if (var3 == null) {
            return;
        }
        if (!arg0) {
            method55(true);
        }
        for (int var4 = 0; var4 < var3.field5287.length; var4++) {
            var3.field5287[var4] = -1;
            var3.field5290[var4] = 0;
        }
    }

    static {
        new class213("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field70 = new class235("LIVE", 0);
        field71 = -1;
        field73 = 0;
        field75 = new float[4];
        field76 = false;
        field74 = new class104(64, 1);
    }
}
