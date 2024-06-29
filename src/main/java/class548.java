import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class548 {

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public int field7422 = 128;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public int field7425 = 128;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public int field7423;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public int field7416;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public int field7424;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public int field7428;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lfaa;")
    public static class140 field7417 = null;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Z")
    public static boolean field7427 = false;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Luc;")
    public static class27 field7421 = new class27(33, -1);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lta;")
    public static class194 field7419;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLke;)V", line = 6)
    public final void method3010(boolean arg0, class548 arg1) {
        this.field7423 = arg1.field7423;
        this.field7425 = arg1.field7425;
        this.field7424 = arg1.field7424;
        if (arg0) {
            field7418++;
            this.field7422 = arg1.field7422;
            this.field7416 = arg1.field7416;
            this.field7428 = arg1.field7428;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V", line = 25)
    public static final void method3011(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7413++;
        if (class274.field3872.field896 != 0 && arg2 != 0 && class357.field5108 < 50 && arg1 != -1) {
            class604.field8394[class357.field5108++] = new class629((byte) 1, arg1, arg2, arg4, arg3, 0);
        }
        if (arg0 != -12114) {
            field7417 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBII[I)V", line = 48)
    public static final void method3012(int arg0, byte arg1, int arg2, int arg3, int[] arg4) {
        field7420++;
        if (arg1 != 23) {
            field7427 = false;
        }
        arg3--;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (arg3 < var5) {
            int var7 = arg3 + 1;
            arg4[var7] = arg2;
            int var8 = var7 + 1;
            arg4[var8] = arg2;
            int var9 = var8 + 1;
            arg4[var9] = arg2;
            int var10 = var9 + 1;
            arg4[var10] = arg2;
            int var11 = var10 + 1;
            arg4[var11] = arg2;
            int var12 = var11 + 1;
            arg4[var12] = arg2;
            int var13 = var12 + 1;
            arg4[var13] = arg2;
            arg3 = var13 + 1;
            arg4[arg3] = arg2;
        }
        while (arg3 < var6) {
            arg3++;
            arg4[arg3] = arg2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(CI)Z", line = 76)
    public static final boolean method3013(char arg0, int arg1) {
        field7426++;
        if (arg1 == 7684) {
            return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V", line = 121)
    public class548(int arg0) {
        this.field7423 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIII)V", line = 140)
    private class548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7425 = arg1;
        this.field7416 = arg4;
        this.field7423 = arg0;
        this.field7422 = arg2;
        this.field7424 = arg3;
        this.field7428 = arg5;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Lke;", line = 107)
    public final class548 method3014(int arg0) {
        field7415++;
        return arg0 == 0 ? new class548(this.field7423, this.field7425, this.field7422, this.field7424, this.field7416, this.field7428) : null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 129)
    public static void method3015(boolean arg0) {
        field7419 = null;
        field7421 = null;
        if (!arg0) {
            field7421 = null;
        }
        field7417 = null;
    }
}
