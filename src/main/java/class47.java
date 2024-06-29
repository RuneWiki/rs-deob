import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class47 extends class654 {

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    private int field698;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "Lgj;")
    private class580 field696;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    private int field703;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    private int field699;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    private int field702;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    private int field700;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Luj;")
    public static class349 field697 = new class349();

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "Ljs;")
    private class300 field704;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "Z")
    public static boolean field706;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
    public static void method264(int arg0) {
        if (arg0 == 1) {
            field697 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Ljs;")
    public final class300 method265(int arg0) {
        if (arg0 != 13) {
            this.field700 = 19;
        }
        field701++;
        if (this.field704 == null) {
            class489 var2 = this.field696.field9050;
            class22.field307[4] = this.field698;
            class22.field307[5] = this.field703;
            class22.field307[2] = this.field702;
            class22.field307[1] = this.field700;
            class22.field307[0] = this.field705;
            class22.field307[3] = this.field699;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method590(class22.field307[var5], (byte) -50)) {
                    return null;
                }
                class269 var7 = var2.method588(-26679, class22.field307[var5]);
                int var8 = var7.field3823 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field3809 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class568.field7645[var6] = var2.method586(class22.field307[var6], var4, 1.0F, var4, false, 116);
            }
            this.field704 = this.field696.method324(0, class568.field7645, var3, var4);
        }
        return this.field704;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lgj;IIIIII)V")
    public class47(class580 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field698 = arg5;
        this.field696 = arg0;
        this.field703 = arg6;
        this.field699 = arg4;
        this.field702 = arg3;
        this.field705 = arg1;
        this.field700 = arg2;
    }
}
