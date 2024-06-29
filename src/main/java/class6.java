import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 extends class416 {

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    private int field60;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    private int field58;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    private int field54;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Lmi;")
    private class315 field56;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    private int field57;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    private int field63;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    private int field62;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[[I")
    private static int[][] field55 = new int[6][];

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "[I")
    private static int[] field61 = new int[6];

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lnq;")
    private class294 field59;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Lnq;")
    public final class294 method24(int arg0) {
        if (this.field59 == null) {
            field61[2] = this.field60;
            field61[1] = this.field63;
            field61[3] = this.field58;
            field61[4] = this.field62;
            class109 var2 = this.field56.field4432;
            field61[0] = this.field57;
            field61[5] = this.field54;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method702(field61[var5], 100)) {
                    return null;
                }
                class279 var6 = var2.method703(arg0 ^ 0x28C7, field61[var5]);
                int var7 = var6.field4114 ? 64 : 128;
                if (var7 > var4) {
                    var4 = var7;
                }
                if (var6.field4096 > 0) {
                    var3 = true;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field55[var8] = var2.method705(var4, 1.0F, false, var4, field61[var8], class125.method786(arg0, -28926));
            }
            this.field59 = new class294(this.field56, 6407, var4, var3, field55);
        }
        return arg0 == 2040 ? this.field59 : (class294) null;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lmi;IIIIII)V")
    public class6(class315 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field60 = arg3;
        this.field58 = arg4;
        this.field54 = arg6;
        this.field56 = arg0;
        this.field57 = arg1;
        this.field63 = arg2;
        this.field62 = arg5;
    }
}
