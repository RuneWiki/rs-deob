import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class353 {

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "[I")
    private int[] field5367;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "J")
    public static long field5370 = 0L;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "[Llo;")
    public static class338[] field5369;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    public static void method2175(int arg0) {
        field5369 = null;
        if (arg0 != -18919) {
            method2175(59);
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "([I)V")
    public class353(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field5367 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field5367[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field5367[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field5367[var5 + var5] = arg0[var4];
            this.field5367[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IB)I")
    public final int method2176(int arg0, byte arg1) {
        if (arg1 != 107) {
            field5369 = null;
        }
        field5366++;
        int var3 = (this.field5367.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field5367[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field5367[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    static {
        new class332("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }
}
