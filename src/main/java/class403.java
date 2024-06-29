import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public abstract class class403 extends class200 {

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "I")
    public int field6058;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "Loq;")
    public static class239 field6054;

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "Z")
    public static boolean field6056;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "[Lvr;")
    public static class89[] field6057;

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!cr", name = "A", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "Ljava/lang/String;")
    public static String field6055;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method431(byte arg0);

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)Z")
    public abstract boolean method432(int arg0);

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)V")
    public static void method2469(int arg0) {
        field6054 = null;
        field6055 = null;
        int var1 = 93 / ((13 - arg0) / 36);
        field6057 = null;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(I)V")
    public class403(int arg0) {
        this.field6058 = arg0;
    }

    static {
        new class342("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field6054 = null;
        field6056 = false;
        field6057 = new class89[0];
    }
}
