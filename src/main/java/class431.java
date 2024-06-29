import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class431 extends class59 {

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public int field6346;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public int field6339;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public int field6337;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public int field6345;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public int field6336;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public int field6344;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public int field6342;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "Ljg;")
    public static class215 field6347 = new class215();

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "Lsk;")
    public static class423 field6350 = new class423("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "Z")
    public static boolean field6351 = false;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)Z")
    public final boolean method164(int arg0) {
        field6338++;
        if (arg0 != 0) {
            method2528(51);
        }
        return false;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILqq;Lps;ZZII)V")
    public final void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field6341++;
        if (!arg4) {
            this.method168(6);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "(I)V")
    public static void method2527(int arg0) {
        field6350 = null;
        if (arg0 <= 61) {
            method2527(-117);
        }
        field6347 = null;
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
    public final void method168(int arg0) {
        int var2 = -59 % ((-arg0 - 53) / 62);
        field6340++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)I")
    public abstract int method1099(byte arg0);

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "(I)Lhn;")
    public static final class486 method2528(int arg0) {
        field6343++;
        class486 var1 = (class486) field6347.method1318((byte) 86);
        if (arg0 != -6016) {
            field6348 = -61;
        }
        if (var1 == null) {
            return new class486();
        } else {
            class449.field6918--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIIIIII)V")
    public class431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6346 = arg0;
        this.field6339 = arg2;
        this.field6337 = arg6;
        this.field6345 = arg3;
        this.field6336 = arg1;
        this.field6344 = arg4;
        this.field6342 = arg5;
    }
}
