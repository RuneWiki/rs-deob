import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class27 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[I")
    private int[] field320;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lbg;")
    public static class324 field322 = new class324(109, 0);

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lgk;")
    public static class331 field323 = new class331("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lbg;")
    public static class324 field324 = new class324(60, -1);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)Z", line = 5)
    public static final boolean method223(int arg0, int arg1, byte arg2) {
        field321++;
        if (arg2 != -32) {
            field322 = null;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 17)
    public static void method224(int arg0) {
        field324 = null;
        if (arg0 == 20253) {
            field323 = null;
            field322 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I", line = 32)
    public final int method225(int arg0, int arg1) {
        field319++;
        if (arg0 != 109) {
            method223(-21, -23, (byte) 112);
        }
        int var3 = (this.field320.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field320[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field320[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "([I)V", line = 64)
    public class27(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field320 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field320[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field320[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field320[var5 + var5] = arg0[var4];
            this.field320[var5 + var5 + 1] = var4++;
        }
    }
}
