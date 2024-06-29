import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class26 {

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field376 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "[I")
    public static int[] field381 = new int[100];

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "F")
    public static float field380;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "Z")
    public boolean field378;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BIIII)V", line = 15)
    public static final void method209(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field374++;
        class153 var5 = class75.method656(4, 255, arg4);
        var5.method1003((byte) -101);
        var5.field1933 = arg3;
        var5.field1928 = arg2;
        if (arg0 < 125) {
            method211(false);
        }
        var5.field1930 = arg1;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)V", line = 31)
    public static final void method210(int arg0, int arg1) {
        if (arg0 != 27030) {
            return;
        }
        class180.field2387 = arg1;
        field379++;
        class449 var2 = class363.field4723;
        synchronized (class363.field4723) {
            class363.field4723.method2642(0);
        }
        class449 var3 = class512.field7423;
        synchronized (class512.field7423) {
            class512.field7423.method2642(0);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V", line = 51)
    public static void method211(boolean arg0) {
        if (arg0) {
            field376 = null;
        }
        field381 = null;
        field376 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIIII)V", line = 63)
    public static final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field373++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg3 - arg2;
        int var12 = arg7 - arg2;
        int var13 = arg3 * arg3;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class387.field5088[arg0];
        class184.method1160(var39, -7, arg5, arg1 - var11, -arg3 + arg1);
        class184.method1160(var39, -7, arg4, arg1 + var11, -var11 + arg1);
        class184.method1160(var39, -7, arg5, arg1 + arg3, arg1 + var11);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var41 = arg0 - var9;
            int var42 = arg0 + var9;
            int var43 = arg1 + var8;
            int var44 = arg1 - var8;
            if (var40) {
                int var45 = arg1 + var10;
                int var46 = arg1 - var10;
                class184.method1160(class387.field5088[var41], -7, arg5, var46, var44);
                class184.method1160(class387.field5088[var41], -7, arg4, var45, var46);
                class184.method1160(class387.field5088[var41], -7, arg5, var43, var45);
                class184.method1160(class387.field5088[var42], -7, arg5, var46, var44);
                class184.method1160(class387.field5088[var42], -7, arg4, var45, var46);
                class184.method1160(class387.field5088[var42], -7, arg5, var43, var45);
            } else {
                class184.method1160(class387.field5088[var41], -7, arg5, var43, var44);
                class184.method1160(class387.field5088[var42], -7, arg5, var43, var44);
            }
        }
        if (arg6 > -127) {
            method210(-113, 14);
        }
    }
}
