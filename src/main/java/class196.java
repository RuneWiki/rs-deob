import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class196 extends class644 {

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "Liga;")
    public class459 field2674;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "Lmda;")
    public static class267 field2676;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIII)V")
    public static final void method1301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2677++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        class636.method3569(arg0 + arg4, arg3, arg0 - arg4, 347845800, class432.field5765[arg1]);
        if (arg2 >= -74) {
            return;
        }
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class432.field5765[arg1 + var6];
                int[] var10 = class432.field5765[arg1 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class636.method3569(var11, arg3, var12, 347845800, var9);
                class636.method3569(var11, arg3, var12, 347845800, var10);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class432.field5765[arg1 + var5];
            int[] var16 = class432.field5765[arg1 - var5];
            class636.method3569(var13, arg3, var14, 347845800, var15);
            class636.method3569(var13, arg3, var14, 347845800, var16);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
    public static void method1302(int arg0) {
        field2676 = null;
        if (arg0 > -11) {
            field2676 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1303(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2675++;
        int var8 = arg6 - arg4;
        int var9 = arg3 + arg4;
        for (int var10 = arg3; var10 < var9; var10++) {
            class636.method3569(arg5, arg7, arg0, 347845800, class432.field5765[var10]);
        }
        int var11 = arg5 - arg4;
        int var12 = arg0 + arg4;
        for (int var13 = arg6; var13 > var8; var13--) {
            class636.method3569(arg5, arg7, arg0, 347845800, class432.field5765[var13]);
        }
        if (arg1 < 39) {
            method1302(-68);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class432.field5765[var14];
            class636.method3569(var12, arg7, arg0, 347845800, var15);
            class636.method3569(var11, arg2, var12, 347845800, var15);
            class636.method3569(arg5, arg7, var11, 347845800, var15);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZJ)V")
    public static final void method1304(boolean arg0, long arg1) {
        field2678++;
        int var3 = class380.field4847.field5801 + class277.field3485;
        if (arg0) {
            field2676 = null;
        }
        int var4 = class403.field5104 + class380.field4847.field5797;
        if ((class758.field10586 - var3) < -2000 || (class758.field10586 - var3) > 2000 || class347.field4454 - var4 < -2000 || class347.field4454 - var4 > 2000) {
            class347.field4454 = var4;
            class758.field10586 = var3;
        }
        if (class758.field10586 != var3) {
            int var5 = var3 - class758.field10586;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class758.field10586 += var6;
        }
        class101.field1404 += (float) arg1 * class631.field8710 / 6.0F;
        class521.field7309 += (float) arg1 * class749.field10471 / 6.0F;
        if (class347.field4454 != var4) {
            int var7 = var4 - class347.field4454;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class347.field4454 += var8;
        }
        class176.method1208(15030);
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Liga;)V")
    public class196(class459 arg0) {
        this.field2674 = arg0;
    }
}
