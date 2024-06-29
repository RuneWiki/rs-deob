import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class41 {

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "[I")
    private int[] field697;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Llc;")
    public static class435 field691 = new class435(89, 6);

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "[C")
    public static char[] field695 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Llc;")
    public static class435 field696 = new class435(76, 1);

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "[I")
    public static int[] field694;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method430(byte arg0) {
        field691 = null;
        field694 = null;
        field695 = null;
        int var1 = -32 % ((arg0 + 65) / 44);
        field696 = null;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "([I)V")
    public class41(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field697 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field697[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field697[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field697[var5 + var5] = arg0[var4];
            this.field697[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I")
    public final int method431(int arg0, int arg1) {
        field692++;
        int var3 = (this.field697.length >> 1) - 1;
        if (arg1 < 49) {
            method430((byte) 125);
        }
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field697[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field697[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
