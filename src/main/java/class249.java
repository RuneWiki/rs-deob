import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class249 extends class260 {

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "F")
    public static float field3687;

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!kea", name = "o", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "Lwia;")
    public static class791 field3679;

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lgn;)V")
    public class249(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Z[Ljava/lang/Object;[III)V")
    public static final void method1640(boolean arg0, Object[] arg1, int[] arg2, int arg3, int arg4) {
        if (~arg4 > ~arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var8;
            int var9 = var7 != Integer.MAX_VALUE ? 1 : 0;
            for (int var10 = arg4; ~arg3 < ~var10; ++var10) {
                if (~(var7 - -(var10 & var9)) < ~arg2[var10]) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var8;
            method1640(true, arg1, arg2, var6 + -1, arg4);
            method1640(arg0, arg1, arg2, arg3, var6 - -1);
        }
        ++field3683;
        if (!arg0) {
            method1640(true, (Object[]) null, (int[]) null, -109, -112);
        }
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)I")
    public final int method123(int arg0) {
        ++field3686;
        if (arg0 != 4377) {
            method1640(false, (Object[]) null, (int[]) null, -89, -92);
        }
        return super.field3829.method4081(arg0 + -4353) == class422.field5780 && super.field3829.method4076(-5569) ? 0 : 1;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V")
    public final void method126(int arg0) {
        super.field3828 = this.method123(4377);
        if (arg0 <= 102) {
            field3687 = 1.1734037F;
        }
        ++field3681;
    }

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)V")
    public static final void method1641(int arg0) {
        class104.field1206 = arg0;
        ++field3678;
        class55.field709 = -1;
        class642.method3660(11084, class459.field6419.equals(""), true, "", class459.field6419);
    }

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "(I)I")
    public final int method1642(int arg0) {
        ++field3684;
        return arg0 > -14 ? -114 : super.field3828;
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(ILgn;)V")
    public class249(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "(I)V")
    public static void method1643(int arg0) {
        if (arg0 != 3) {
            method1640(false, (Object[]) null, (int[]) null, -114, 78);
        }
        field3679 = null;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILjava/awt/Canvas;ILd;)Lha;")
    public static final class65 method1644(int arg0, Canvas arg1, int arg2, class160 arg3) {
        if (arg2 != 11549) {
            method1644(-35, (Canvas) null, 95, (class160) null);
        }
        ++field3680;
        return new class106(arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(II)I")
    public final int method129(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method129(-120, 102);
        }
        ++field3685;
        return 3;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IB)V")
    public final void method128(int arg0, byte arg1) {
        ++field3682;
        if (arg1 == 122) {
            super.field3828 = arg0;
        }
    }
}
