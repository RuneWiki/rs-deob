import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class648 {

    @OriginalMember(owner = "client!it", name = "g", descriptor = "Lbi;")
    private class483 field8970;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "J")
    public long field8964;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "Lkg;")
    public static class275 field8971 = new class275(44, 2);

    @OriginalMember(owner = "client!it", name = "i", descriptor = "F")
    public static float field8972;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!it", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        field8965++;
        this.field8970.method2818((byte) -106, this.field8964);
        super.finalize();
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIILha;)V", line = 14)
    public static final void method3631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class60 arg6) {
        field8967++;
        if ((class450.field5958 == null || class744.field10371 == null || class209.field2764 == null) && class268.field3369.method3154(class353.field4542, (byte) 98) && class268.field3369.method3154(class711.field9864, (byte) 98) && class268.field3369.method3154(class29.field516, (byte) 98)) {
            class728 var7 = class728.method4059(class268.field3369, class711.field9864, 0);
            class744.field10371 = arg6.method508(var7, true);
            var7.method4063();
            class402.field5098 = arg6.method508(var7, true);
            class450.field5958 = arg6.method508(class728.method4059(class268.field3369, class353.field4542, 0), true);
            class728 var8 = class728.method4059(class268.field3369, class29.field516, 0);
            class209.field2764 = arg6.method508(var8, true);
            var8.method4063();
            class724.field10107 = arg6.method508(var8, true);
        }
        if (class450.field5958 != null && class744.field10371 != null && class209.field2764 != null) {
            int var9 = (arg2 - (class209.field2764.method143() * 2)) / class450.field5958.method143();
            for (int var10 = 0; var10 < var9; var10++) {
                class450.field5958.method2759(arg3 + class209.field2764.method143() + (class450.field5958.method143() * var10), -class450.field5958.method144() + arg0 + arg4);
            }
            int var11 = (arg0 - arg1 - class209.field2764.method144()) / class744.field10371.method144();
            for (int var12 = 0; var12 < var11; var12++) {
                class744.field10371.method2759(arg3, arg4 + (arg1 + (class744.field10371.method144() * var12)));
                class402.field5098.method2759(arg2 + arg3 - class402.field5098.method143(), var12 * class744.field10371.method144() + arg1 + arg4);
            }
            class209.field2764.method2759(arg3, arg0 + arg4 - class209.field2764.method144());
            class724.field10107.method2759(arg2 + arg3 - class209.field2764.method143(), arg4 - (-arg0 - -class209.field2764.method144()));
        }
        if (arg5 < 23) {
            method3633(20, -113, 2, 53, true, -7, 55, 86, 26);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V", line = 73)
    public static void method3632(boolean arg0) {
        if (arg0) {
            field8969 = -76;
        }
        field8971 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIZIIII)Z", line = 83)
    public static final boolean method3633(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field8966++;
        int var9 = class380.field4847.field264[0];
        int var10 = class380.field4847.field260[0];
        if (var9 < 0 || class409.field5183 <= var9 || var10 < 0 || class543.field7597 <= var10) {
            return false;
        } else if (arg5 >= 0 && class409.field5183 > arg5 && arg7 >= 0 && class543.field7597 > arg7) {
            int var11 = client.method1826(class164.field2280, arg7, arg1, arg2, class526.field7350[class380.field4847.field5796], -116, class59.field827, arg4, arg6, arg0, arg3, var9, class380.field4847.method82((byte) 49), arg5, var10);
            if (var11 < 1) {
                return false;
            }
            class755.field10539 = class59.field827[var11 - 1];
            class366.field4727 = class164.field2280[var11 - 1];
            class526.field7347 = false;
            if (arg8 == 17829) {
                class169.method1180((byte) -15);
                return true;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI)I", line = 117)
    public static final int method3634(int arg0, byte arg1, int arg2) {
        field8968++;
        int var3 = -46 / ((arg1 + 27) / 43);
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 << 13 ^ var4;
        int var6 = Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589;
        return (var6 & 0x7F999BA) >> 19;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lbi;J[Lpf;)V", line = 138)
    public class648(class483 arg0, long arg1, class584[] arg2) {
        this.field8970 = arg0;
        this.field8964 = arg1;
    }
}
