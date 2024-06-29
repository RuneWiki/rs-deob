import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class570 extends class159 {

    @OriginalMember(owner = "client!paa", name = "u", descriptor = "I")
    private int field7660;

    @OriginalMember(owner = "client!paa", name = "w", descriptor = "I")
    private int field7662;

    @OriginalMember(owner = "client!paa", name = "s", descriptor = "I")
    private int field7658;

    @OriginalMember(owner = "client!paa", name = "t", descriptor = "I")
    private int field7659;

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "Len;")
    private class289 field7654;

    @OriginalMember(owner = "client!paa", name = "x", descriptor = "I")
    private int field7663;

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "I")
    private int field7655;

    @OriginalMember(owner = "client!paa", name = "y", descriptor = "I")
    public static int field7664 = 0;

    @OriginalMember(owner = "client!paa", name = "r", descriptor = "Lkda;")
    public static class354 field7657 = new class354();

    @OriginalMember(owner = "client!paa", name = "q", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!paa", name = "v", descriptor = "Lwg;")
    private class389 field7661;

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "Le;")
    public static class489 field7665;

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(B)Lwg;")
    public final class389 method1099(byte arg0) {
        if (arg0 <= 60) {
            return null;
        }
        field7656++;
        if (this.field7661 == null) {
            class352.field5057[5] = this.field7660;
            class352.field5057[3] = this.field7659;
            class352.field5057[1] = this.field7655;
            class352.field5057[2] = this.field7663;
            class489 var2 = this.field7654.field9050;
            class352.field5057[4] = this.field7662;
            class352.field5057[0] = this.field7658;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method590(class352.field5057[var5], (byte) -50)) {
                    return null;
                }
                class269 var7 = var2.method588(-26679, class352.field5057[var5]);
                int var8 = var7.field3823 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field3809 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class102.field1381[var6] = var2.method586(class352.field5057[var6], var4, 1.0F, var4, false, 123);
            }
            this.field7661 = new class389(this.field7654, 6407, var4, var3 != 0, class102.field1381);
        }
        return this.field7661;
    }

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "(B)V")
    public static void method3137(byte arg0) {
        if (arg0 <= 28) {
            field7664 = 111;
        }
        field7657 = null;
        field7665 = null;
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Len;IIIIII)V")
    public class570(class289 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7660 = arg6;
        this.field7662 = arg5;
        this.field7658 = arg1;
        this.field7659 = arg4;
        this.field7654 = arg0;
        this.field7663 = arg3;
        this.field7655 = arg2;
    }
}
