import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class274 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lpk;")
    public static class133 field4042;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Luu;")
    public static class188 field4041;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4040++;
        if (arg1 < 128 || arg2 < 128 || (class397.field5828 - 2) * 128 < arg1 || (class457.field6713 - 2) * 128 < arg2) {
            class522.field7676[0] = class522.field7676[1] = -1;
            return;
        }
        int var10 = class66.method643(arg1, -105, arg8, arg2) - arg6;
        class462.field6798.method251(arg4, 0, 0);
        class225.field3300.method308(class462.field6798);
        class225.field3300.method372(arg1, var10, arg2, class522.field7676);
        if (arg7 != 503) {
            field4041 = null;
        }
        class462.field6798.method251(-arg4, 0, 0);
        class225.field3300.method308(class462.field6798);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILfs;)V")
    public static final void method1763(int arg0, class387 arg1) {
        class62.field738 = 0;
        if (arg0 >= -105) {
            field4042 = null;
        }
        field4043++;
        class99.field1330 = 0;
        class229.field3359 = new class493();
        class203.field2943 = new class378[1024];
        class368.method2277(arg1, 1);
        class269.method1728(arg1, 3325);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method1764(boolean arg0) {
        if (arg0) {
            field4041 = null;
        }
        field4041 = null;
        field4042 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)Z")
    public static final boolean method1765(int arg0, int arg1, int arg2) {
        field4044++;
        if (arg1 != -29792) {
            method1767(-95, null, 56, null, -26, 117, 90, (byte) 127, 15);
        }
        return (class238.field3497[1][arg0][arg2] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)Luu;")
    public static final class188 method1766(int arg0, int arg1, byte arg2) {
        field4038++;
        int var3 = -113 / ((84 - arg2) / 42);
        class188 var4 = class371.method2286(0, arg0);
        if (arg1 == -1) {
            return var4;
        } else if (var4 == null || var4.field2758 == null || arg1 >= var4.field2758.length) {
            return null;
        } else {
            return var4.field2758[arg1];
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[BI[BIIIBI)V")
    public static final void method1767(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        int var9 = -32 % ((-arg7 - 38) / 47);
        field4037++;
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg8; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg3[var10001] = (byte) (arg3[var10001] - arg1[arg4++]);
                int var15 = arg0++;
                arg3[var15] = (byte) (arg3[var15] - arg1[arg4++]);
                int var16 = arg0++;
                arg3[var16] = (byte) (arg3[var16] - arg1[arg4++]);
                int var17 = arg0++;
                arg3[var17] = (byte) (arg3[var17] - arg1[arg4++]);
            }
            for (int var14 = var11; var14 < 0; var14++) {
                var10001 = arg0++;
                arg3[var10001] = (byte) (arg3[var10001] - arg1[arg4++]);
            }
            arg4 += arg6;
            arg0 += arg2;
        }
    }
}
