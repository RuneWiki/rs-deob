import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class617 extends class354 {

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "Lria;")
    public static class288 field8508 = null;

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
    public static int field8504;

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!mfa", name = "m", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!mfa", name = "o", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!mfa", name = "p", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!mfa", name = "q", descriptor = "I")
    public static int field8513;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II[Ljava/lang/Object;[II)V")
    public static final void method3446(int arg0, int arg1, Object[] arg2, int[] arg3, int arg4) {
        if (~arg0 < ~arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            int var9 = ~var7 != Integer.MIN_VALUE ? 1 : 0;
            for (int var10 = arg4; var10 < arg0; ++var10) {
                if (~arg3[var10] > ~((var10 & var9) + var7)) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method3446(var6 + -1, 14247, arg2, arg3, arg4);
            method3446(arg0, 14247, arg2, arg3, var6 + 1);
        }
        if (arg1 == 14247) {
            ++field8506;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)I")
    public final int method3447(byte arg0) {
        int var2 = -33 % ((arg0 - 7) / 45);
        ++field8512;
        return super.field4545;
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(ILwo;)V")
    public class617(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "(I)Z")
    public final boolean method3448(int arg0) {
        ++field8507;
        int var2 = 89 % ((arg0 - -34) / 41);
        if (super.field4544.method4149((byte) 33)) {
            return false;
        } else {
            return ~super.field4544.field10420.method1877((byte) 81) != -1;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "(B)V")
    public static void method3449(byte arg0) {
        field8508 = null;
        int var1 = 17 % ((arg0 - -44) / 55);
    }

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        ++field8510;
        if (arg0 != -1) {
            this.method391(3, 82);
        }
        super.field4545 = arg1;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field8513;
        if (arg0 != 3) {
            field8508 = null;
        }
        if (super.field4544.method4149((byte) 33)) {
            return 3;
        } else {
            return super.field4544.field10420.method1877((byte) -101) == 0 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lwo;)V")
    public class617(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(JIIIILnd;ZB)V")
    public static final void method3450(long arg0, int arg1, int arg2, int arg3, int arg4, class547 arg5, boolean arg6, byte arg7) {
        class174.field2415 = arg2;
        if (arg7 > 38) {
            class514.field7217 = 1;
            class230.field3028 = arg5;
            class709.field9849 = arg6;
            class272.field3416 = arg3;
            client.field3977 = null;
            class360.field4661 = 10000;
            ++field8505;
            class244.field3163 = arg1;
            class231.field3037 = arg0;
            class615.field8495 = arg4;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        ++field8509;
        int var2 = 61 % ((37 - arg0) / 63);
        return 2;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (arg0 == 6384) {
            ++field8511;
            if (super.field4544.method4149((byte) 33)) {
                super.field4545 = 0;
            }
            if (~super.field4544.field10420.method1877((byte) 104) == -1) {
                super.field4545 = 0;
            }
            if (~super.field4545 > -1 || super.field4545 > 2) {
                super.field4545 = this.method393((byte) -64);
            }
        }
    }
}
