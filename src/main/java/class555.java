import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class555 {

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    private int field7066 = 0;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "Lrda;")
    private class467 field7068;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "Lko;")
    private class337 field7065;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Lko;")
    public final class337 method3015(int arg0) {
        this.field7066 = 0;
        field7069++;
        int var2 = -2 % ((arg0 - 6) / 54);
        return this.method3017(-1);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
    public static final void method3016(byte arg0) {
        if (arg0 > -111) {
            return;
        }
        for (int var1 = 0; var1 < class449.field5867; var1++) {
            int var2 = class679.method3654(var1 + class235.field3224, class449.field5867, -4595) * class66.field867;
            for (int var3 = 0; var3 < class66.field867; var3++) {
                int var4 = var2 + class679.method3654(class5.field58 + var3, class66.field867, -4595);
                if (class212.field2921[var4] == class398.field5255) {
                    class465.field6034[var4].method3182(0, 0, class65.field852, class422.field5550, class65.field852 * var3, class422.field5550 * var1, true, true);
                }
            }
        }
        field7070++;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)Lko;")
    public final class337 method3017(int arg0) {
        if (arg0 != -1) {
            method3016((byte) 61);
        }
        field7067++;
        if (this.field7066 > 0 && this.field7068.field6048[this.field7066 - 1] != this.field7065) {
            class337 var2 = this.field7065;
            this.field7065 = var2.field4111;
            return var2;
        }
        while (this.field7066 < this.field7068.field6045) {
            class337 var3 = this.field7068.field6048[this.field7066++].field4111;
            if (this.field7068.field6048[this.field7066 - 1] != var3) {
                this.field7065 = var3.field4111;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
    public class555() {
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lrda;)V")
    public class555(class467 arg0) {
        this.field7068 = arg0;
    }
}
