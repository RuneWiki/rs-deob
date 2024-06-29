import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class36 implements class396 {

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "Ldv;")
    private class684 field385;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "Luq;")
    private class172 field378;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "Luq;")
    private class172 field383;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "Lda;")
    private class67 field380;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZI)V")
    public final void method209(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = this.field385.field9145.method3710(0, class67.field933, this.field385.field9146) + this.field385.field9149;
            int var4 = this.field385.field9137.method3920(this.field385.field9129, class187.field2450, arg1 ^ 0xFFFFE221) + this.field385.field9128;
            this.field380.method557(var4, var3, null, null, this.field385.field9140, (byte) -103, this.field385.field9136, this.field385.field9146, this.field385.field9132, this.field385.field9131, null, 0, 0, this.field385.field9139, this.field385.field9144, this.field385.field9129);
        }
        if (arg1 == 7582) {
            field379++;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)Z")
    public final boolean method210(int arg0) {
        field381++;
        boolean var2 = true;
        if (!this.field383.method1185(this.field385.field9138, 9330)) {
            var2 = false;
        }
        if (arg0 == 16125) {
            if (!this.field378.method1185(this.field385.field9138, 9330)) {
                var2 = false;
            }
            return var2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)V")
    public final void method211(byte arg0) {
        field384++;
        if (arg0 >= -107) {
            field382 = 119;
        }
        class651 var2 = class588.method3309(true, this.field385.field9138, this.field378);
        this.field380 = class375.field5490.method502(var2, class162.method1124(this.field383, this.field385.field9138), true);
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Luq;Luq;Ldv;)V")
    public class36(class172 arg0, class172 arg1, class684 arg2) {
        this.field385 = arg2;
        this.field378 = arg1;
        this.field383 = arg0;
    }
}
