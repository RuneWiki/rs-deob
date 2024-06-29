import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class463 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "[I")
    private int[] field6471;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Lkn;")
    public static class530 field6472 = new class530("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Lo;")
    public static class24 field6476;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BII)I")
    public static final int method2691(byte arg0, int arg1, int arg2) {
        if (arg0 < 11) {
            return 40;
        }
        field6474++;
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg2--;
            arg1 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)I")
    public final int method2692(int arg0, byte arg1) {
        field6475++;
        int var3 = (this.field6471.length >> 1) - 1;
        if (arg1 != -36) {
            return -66;
        }
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field6471[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field6471[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method2693(byte arg0) {
        field6472 = null;
        int var1 = -50 % ((20 - arg0) / 57);
        field6476 = null;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "([I)V")
    public class463(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field6471 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field6471[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field6471[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field6471[var5 + var5] = arg0[var4];
            this.field6471[var5 + var5 + 1] = var4++;
        }
    }
}
