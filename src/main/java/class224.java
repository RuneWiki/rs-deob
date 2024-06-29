import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class224 extends class291 {

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field3567;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "Lmj;")
    public static class144 field3564 = new class144(16);

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field3571 = 0;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "Lic;")
    public static class160 field3572 = new class160(64);

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "Lf;")
    public static class227 field3574 = new class227(64);

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field3575 = 0;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field3576 = 0;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3577 = "yellow:";

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3578 = "Loading textures - ";

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III[II)V")
    public static final void method1504(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field3565++;
        arg2--;
        int var6 = arg1 - 1;
        int var5 = var6 - arg4;
        while (var5 > arg2) {
            int var7 = arg2 + 1;
            arg3[var7] = arg0;
            int var8 = var7 + 1;
            arg3[var8] = arg0;
            int var9 = var8 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var11 = var10 + 1;
            arg3[var11] = arg0;
            int var12 = var11 + 1;
            arg3[var12] = arg0;
            int var13 = var12 + 1;
            arg3[var13] = arg0;
            arg2 = var13 + 1;
            arg3[arg2] = arg0;
        }
        while (arg2 < var6) {
            arg2++;
            arg3[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(B)Z")
    public final boolean method954(byte arg0) {
        if (arg0 >= -14) {
            this.field3567 = null;
        }
        field3568++;
        return false;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public static void method1505(int arg0) {
        field3572 = null;
        int var1 = 79 % ((arg0 - 7) / 47);
        field3564 = null;
        field3577 = null;
        field3578 = null;
        field3574 = null;
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method953(byte arg0) {
        field3573++;
        int var2 = -117 % ((arg0 - 65) / 59);
        return this.field3567;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)J")
    public static final long method1506(int arg0, int arg1, int arg2) {
        class129 var3 = class26.field455[arg0][arg1][arg2];
        return var3 == null || var3.field2143 == null ? 0L : var3.field2143.field3190;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class224(Object arg0) {
        this.field3567 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(B)V")
    public static final void method1507(byte arg0) {
        if (arg0 != 0) {
            method1506(-52, 41, 35);
        }
        field3566++;
        class131.field2181++;
    }
}
