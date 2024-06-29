import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class332 {

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "[I")
    private int[] field4726;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "[Laba;")
    public static class177[] field4730;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)I", line = 5)
    public final int method2000(byte arg0, int arg1) {
        if (arg0 <= 104) {
            return 45;
        }
        field4725++;
        int var3 = (this.field4726.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field4726[var4 - (-var4 - 1)];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4726[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BC)C", line = 34)
    public static final char method2001(byte arg0, char arg1) {
        if (arg0 <= 96) {
            method2001((byte) -85, 'c');
        }
        field4727++;
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "([I)V", line = 436)
    public class332(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field4726 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4726[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4726[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field4726[var5 + var5] = arg0[var4];
            this.field4726[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 471)
    public static void method2002(int arg0) {
        if (arg0 < 1) {
            method2001((byte) 4, (char) 65444);
        }
        field4730 = null;
    }
}
