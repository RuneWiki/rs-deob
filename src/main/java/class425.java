import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class425 {

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    private int field6329;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    private int field6323;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    private int field6322;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    private int field6331;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    private int field6325;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
    private int field6332;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
    private int field6328;

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
    private int field6334;

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "I")
    private int field6335;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
    private int field6330;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "[Lxa;")
    public static class433[] field6327;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public static void method2660(int arg0) {
        if (arg0 != -2324) {
            method2660(-76);
        }
        field6327 = null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIIIIIIIBI)V")
    public final void method2661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        this.field6322 = arg7;
        this.field6331 = arg2;
        int var12 = 11 / ((46 - arg9) / 37);
        this.field6323 = arg3;
        field6333++;
        this.field6329 = arg4 * arg4;
        this.field6332 = this.field6322 + arg5;
        this.field6330 = this.field6323 + arg6;
        this.field6328 = this.field6322 + arg10;
        this.field6335 = this.field6331 + arg8;
        this.field6334 = this.field6331 + arg0;
        this.field6325 = this.field6323 + arg1;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIBI)Z")
    public final boolean method2662(int arg0, int arg1, byte arg2, int arg3) {
        field6324++;
        if (this.field6332 > arg0 || this.field6328 < arg0) {
            return false;
        } else if (this.field6330 > arg3 || arg3 > this.field6325) {
            return false;
        } else if (arg1 >= this.field6335 && arg1 <= this.field6334) {
            if (arg2 >= -94) {
                this.method2661(6, -106, -84, -23, -28, -49, 20, 86, 57, (byte) -96, -42);
            }
            int var5 = arg0 - this.field6322;
            int var6 = arg1 - this.field6331;
            return var5 * var5 + var6 * var6 < this.field6329;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field6329 = arg3 * arg3;
        this.field6323 = arg1;
        this.field6322 = arg0;
        this.field6331 = arg2;
        this.field6325 = this.field6323 + arg7;
        this.field6332 = this.field6322 + arg4;
        this.field6328 = this.field6322 + arg5;
        this.field6334 = this.field6331 + arg9;
        this.field6335 = this.field6331 + arg8;
        this.field6330 = this.field6323 + arg6;
    }

    static {
        new class474("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }
}
