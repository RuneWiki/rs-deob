import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class540 implements class236 {

    @OriginalMember(owner = "client!fda", name = "n", descriptor = "Lfn;")
    public class286 field7406;

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "I")
    public int field7400;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public int field7397;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "Z")
    public boolean field7403;

    @OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
    public int field7408;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public int field7396;

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "Ltl;")
    public class566 field7404;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
    public int field7398;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
    public int field7399;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public int field7394;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public int field7395;

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "Leba;")
    public static class550 field7402 = new class550(52, 2);

    @OriginalMember(owner = "client!fda", name = "r", descriptor = "Z")
    public static boolean field7410 = false;

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "[Lio;")
    public static class157[] field7405 = new class157[2048];

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!fda", name = "q", descriptor = "Ljm;")
    public static class285 field7409;

    @OriginalMember(owner = "client!fda", name = "o", descriptor = "Lpp;")
    public static class504 field7407;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)Ltca;")
    public final class141 method421(int arg0) {
        field7393++;
        if (arg0 != 4) {
            method3032(105, 125, 91);
        }
        return class484.field6729;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
    public static void method3031(byte arg0) {
        if (arg0 == -83) {
            field7405 = null;
            field7409 = null;
            field7407 = null;
            field7402 = null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(III)Z")
    public static final boolean method3032(int arg0, int arg1, int arg2) {
        field7401++;
        if (arg2 != 21637) {
            method3032(-55, -114, -10);
        }
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(ILtl;Lfn;IIIIIIIZ)V")
    public class540(int arg0, class566 arg1, class286 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field7406 = arg2;
        this.field7400 = arg6;
        this.field7397 = arg5;
        this.field7403 = arg10;
        this.field7408 = arg9;
        this.field7396 = arg7;
        this.field7404 = arg1;
        this.field7398 = arg3;
        this.field7399 = arg0;
        this.field7394 = arg4;
        this.field7395 = arg8;
    }
}
