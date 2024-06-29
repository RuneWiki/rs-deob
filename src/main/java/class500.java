import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class500 extends class529 {

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public int field7504;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Z")
    public boolean field7500;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public int field7507;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public int field7508;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public int field7503;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public int field7499;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field7509 = 0;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lng;")
    public static class274 field7501;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "[Lo;")
    public static class139[] field7506;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILnw;)V")
    public static final void method3050(int arg0, class473 arg1) {
        class502.field7530 = arg1;
        int var2 = 65 % ((-arg0 - 79) / 44);
        field7502++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method3051(int arg0) {
        field7501 = null;
        field7506 = null;
        if (arg0 >= -95) {
            field7501 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static final void method3052(int arg0) {
        if (class119.field1631 != null) {
            class119.field1631.method1799((byte) -102);
        }
        field7510++;
        if (arg0 != 0) {
            field7505 = -54;
        }
        if (class164.field2370 != null) {
            class164.field2370.method1799((byte) -102);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIIZ)V")
    public class500(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field7504 = arg2;
        this.field7500 = arg5;
        this.field7507 = arg4;
        this.field7508 = arg3;
        this.field7503 = arg0;
        this.field7499 = arg1;
    }
}
