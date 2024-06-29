import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class408 extends class352 {

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public int field5435;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public int field5430;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public int field5431;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public int field5432;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public int field5427;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public int field5428;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Lbca;")
    public static class604 field5433 = new class604("", 15);

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field5436 = 0;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Ljo;")
    public static class303 field5434;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Lqv;", line = 10)
    public final class406 method484(int arg0) {
        field5429++;
        if (arg0 != 16236) {
            this.field5427 = 83;
        }
        return class628.field8907;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V", line = 23)
    public static void method2215(byte arg0) {
        field5434 = null;
        int var1 = -77 % ((-arg0 - 79) / 44);
        field5433 = null;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lida;Lce;IIIIIIIIIII)V", line = 36)
    public class408(class215 arg0, class278 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        this.field5435 = arg8;
        this.field5430 = arg9;
        this.field5431 = arg7;
        this.field5432 = arg11;
        this.field5427 = arg12;
        this.field5428 = arg10;
    }
}
