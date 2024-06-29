import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class635 extends class681 {

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Lrba;")
    public class435 field8757;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "Z")
    public boolean field8759;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "[Lwt;")
    public class314[] field8760;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static final void method3556(byte arg0) {
        int var1 = -48 / ((74 - arg0) / 41);
        class373.field4792.method3064(false);
        field8758++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)V")
    public static final void method3557(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1011) {
            class188.method1273(class334.field4252, arg0, arg3);
        } else if (arg1 == 1012) {
            class188.method1273(class445.field5921, arg0, arg3);
        } else if (arg1 == 1006) {
            class188.method1273(class227.field3009, arg0, arg3);
        } else if (arg1 == 1010) {
            class188.method1273(class59.field825, arg0, arg3);
        } else if (arg1 == 1004) {
            class188.method1273(class378.field4832, arg0, arg3);
        }
        field8761++;
        if (arg2 == 7774) {
            ;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method3558(int arg0, int arg1, int arg2, class60 arg3) {
        field8756++;
        int var5 = this.field8757.method2066((byte) -118);
        int var6 = 66 / ((arg2 - 32) / 61);
        if (this.field8760 != null) {
            for (int var7 = 0; var7 < this.field8760.length; var7++) {
                this.field8760[var7].field4103 <<= var5;
                if (this.field8760[var7].method1868(arg0, arg1) && this.field8757.method752((byte) -82, arg0, arg3, arg1)) {
                    this.field8760[var7].field4103 >>= var5;
                    return true;
                }
                this.field8760[var7].field4103 >>= var5;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILria;)Ljava/lang/String;")
    public static final String method3559(int arg0, class288 arg1) {
        field8753++;
        int var2 = 110 / ((-arg0 - 46) / 36);
        if (client.method1833(arg1).method1571(false) == 0) {
            return null;
        } else if (arg1.field3633 == null || arg1.field3633.trim().length() == 0) {
            return class711.field9869 ? "Hidden-use" : null;
        } else {
            return arg1.field3633;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
    public static final int method3560(int arg0, int arg1) {
        field8754++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return arg1 == -1 ? var2 * var4 >> 12 : -67;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lcs;ILup;Lcv;ILha;IIZ)V")
    public static final void method3561(class344 arg0, int arg1, class278 arg2, class570 arg3, int arg4, class60 arg5, int arg6, int arg7, boolean arg8) {
        field8762++;
        if (arg8) {
            return;
        }
        int var9 = arg1 - (arg4 / 2) - 5;
        int var10 = arg6 + 2;
        if (arg2.field3516 != 0) {
            arg5.method544(arg2.field3516, arg7 * arg3.method3270() + arg6 - (var10 - 1), var9, 18553, arg4 + 10, var10);
        }
        if (arg2.field3525 != 0) {
            arg5.method532(arg6 + (arg7 * arg3.method3270() + 1) - var10, arg4 - -10, var9, var10, true, arg2.field3525);
        }
        int var11 = arg2.field3534;
        if (arg0.field4344 && arg2.field3532 != -1) {
            var11 = arg2.field3532;
        }
        for (int var12 = 0; var12 < arg7; var12++) {
            String var13 = class689.field9587[var12];
            if (arg7 - 1 > var12) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg3.method3271(arg5, var13, arg1, arg6, var11, true);
            arg6 += arg3.method3270();
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)I")
    public static final int method3562(byte arg0, int arg1) {
        field8755++;
        return arg0 == 70 ? arg1 & 0xFF : -9;
    }
}
