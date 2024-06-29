import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class469 {

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    private int field6552 = 0;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Lqi;")
    private class406 field6549;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "[I")
    public static int[] field6555 = new int[32];

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Lam;")
    public static class455 field6558;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Lev;")
    private class498 field6550;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "[I")
    public static int[] field6553;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Lev;")
    public final class498 method2720(int arg0) {
        if (arg0 <= 107) {
            method2721(-65);
        }
        field6551++;
        if (this.field6552 > 0 && this.field6549.field5747[this.field6552 - 1] != this.field6550) {
            class498 var2 = this.field6550;
            this.field6550 = var2.field7055;
            return var2;
        }
        while (this.field6549.field5745 > this.field6552) {
            class498 var3 = this.field6549.field5747[this.field6552++].field7055;
            if (this.field6549.field5747[this.field6552 - 1] != var3) {
                this.field6550 = var3.field7055;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
    public static void method2721(int arg0) {
        field6553 = null;
        if (arg0 != 0) {
            method2721(-113);
        }
        field6555 = null;
        field6558 = null;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)Lev;")
    public final class498 method2722(int arg0) {
        field6556++;
        this.field6552 = arg0;
        return this.method2720(126);
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lqi;)V")
    public class469(class406 arg0) {
        this.field6549 = arg0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field6555[var1] = var0 - 1;
            var0 += var0;
        }
        field6557 = -1;
        field6558 = new class455();
    }
}
