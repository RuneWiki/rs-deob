import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class303 extends class478 {

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    private int field4523;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    private int field4518;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    private int field4509;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    private int field4514;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    private int field4510;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    private int field4512;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    private int field4513;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    private int field4520;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field4516 = new String[200];

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "Luc;")
    public static class27 field4522 = new class27("", 11);

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "Lml;")
    public static class352 field4517;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "Lq;")
    public static class391 field4524;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V")
    public static final void method1939(int arg0, int arg1, int arg2, Object[] arg3, int[] arg4) {
        if (arg2 < arg1) {
            int var5 = (arg2 - -arg1) / 2;
            int var6 = arg2;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg2; arg1 > var10; ++var10) {
                if (arg4[var10] < (var9 & var10) + var7) {
                    int var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var12 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var12;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method1939(-704, var6 + -1, arg2, arg3, arg4);
            method1939(arg0, arg1, var6 + 1, arg3, arg4);
        }
        if (arg0 != -704) {
            field4516 = null;
        }
        ++field4515;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4523 = arg7;
        this.field4518 = arg6;
        this.field4509 = arg2;
        this.field4514 = arg4;
        this.field4510 = arg0;
        this.field4512 = arg5;
        this.field4513 = arg3;
        this.field4520 = arg1;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)V")
    public final void method1339(int arg0, int arg1, int arg2) {
        ++field4519;
        if (arg1 != 0) {
            method1940(52);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
    public final void method1340(int arg0, int arg1, int arg2) {
        ++field4511;
        if (arg1 == 0) {
            int var4 = this.field4510 * arg2 >> 12;
            int var5 = this.field4520 * arg0 >> 12;
            int var6 = this.field4509 * arg2 >> 12;
            int var7 = this.field4513 * arg0 >> 12;
            int var8 = this.field4514 * arg2 >> 12;
            int var9 = this.field4512 * arg0 >> 12;
            int var10 = this.field4518 * arg2 >> 12;
            int var11 = this.field4523 * arg0 >> 12;
            class326.method2058(var6, -119, var5, var8, var4, var7, super.field6795, var11, var10, var9);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IBI)V")
    public final void method1343(int arg0, byte arg1, int arg2) {
        ++field4521;
        if (arg1 != 56) {
            this.field4523 = -70;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    public static void method1940(int arg0) {
        field4522 = null;
        if (arg0 > -45) {
            method1940(84);
        }
        field4517 = null;
        field4516 = null;
        field4524 = null;
    }
}
