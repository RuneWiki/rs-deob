import java.awt.Component;
import java.io.InputStream;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class62 extends InputStream {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "[I")
    public static int[] field1129 = new int[4096];

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Lqk;")
    public static class207 field1128 = class24.method212(255, "::replacecanvas");

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
    public static boolean field1127 = true;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1134 = Calendar.getInstance();

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "[I")
    public static int[] field1135 = new int[25];

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static volatile int field1136 = 0;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field1137 = -1;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg0 >= class124.field2158 && arg0 <= class88.field1599 && class124.field2158 <= arg3 && arg3 <= class88.field1599 && class124.field2158 <= arg2 && arg2 <= class88.field1599 && class124.field2158 <= arg7 && class88.field1599 >= arg7 && class204.field3580 <= arg6 && class204.field3602 >= arg6 && arg4 >= class204.field3580 && arg4 <= class204.field3602 && arg1 >= class204.field3580 && class204.field3602 >= arg1 && class204.field3580 <= arg5 && arg5 <= class204.field3602) {
            class279.method1894(arg6, arg4, -118, arg9, arg3, arg1, arg5, arg2, arg7, arg0);
        } else {
            class115.method816(arg2, arg6, arg4, arg1, arg7, arg3, arg0, arg9, 3, arg5);
        }
        field1130++;
        int var10 = 117 / ((arg8 + 5) / 46);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIII)V")
    public static final void method455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        field1132++;
        int var7 = arg0 * arg0;
        int var8 = arg5;
        int var9 = arg5 * arg5;
        int var10 = var7 << 1;
        int var11 = var9 << 1;
        int var12 = arg5 << 1;
        int var13 = (arg3 - var12) * var7 + var11;
        int var14 = var9 - ((var12 - 1) * var10);
        int var15 = var7 << 2;
        int var16 = ((var6 << 1) + 3) * var11;
        int var17 = var9 << 2;
        int var18 = ((arg5 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var17;
        if (arg2 >= class204.field3580 && arg2 <= class204.field3602) {
            int var20 = class21.method123(arg0 + arg4, -15466, class124.field2158, class88.field1599);
            int var21 = class21.method123(arg4 - arg0, arg3 + -15467, class124.field2158, class88.field1599);
            class215.method1544(var21, var20, class15.field238[arg2], arg1, -127);
        }
        int var22 = (arg5 - 1) * var15;
        while (var8 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var16;
                    var16 += var17;
                    var6++;
                    var19 += var17;
                }
            }
            if (var14 < 0) {
                var6++;
                var14 += var19;
                var19 += var17;
                var13 += var16;
                var16 += var17;
            }
            var13 += -var22;
            var14 += -var18;
            var8--;
            var22 -= var15;
            int var23 = arg2 - var8;
            int var24 = arg2 + var8;
            var18 -= var15;
            if (var24 >= class204.field3580 && class204.field3602 >= var23) {
                int var25 = class21.method123(arg4 + var6, -15466, class124.field2158, class88.field1599);
                int var26 = class21.method123(arg4 - var6, -15466, class124.field2158, class88.field1599);
                if (var23 >= class204.field3580) {
                    class215.method1544(var26, var25, class15.field238[var23], arg1, 115);
                }
                if (class204.field3602 >= var24) {
                    class215.method1544(var26, var25, class15.field238[var24], arg1, -13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "read", descriptor = "()I")
    public final int read() {
        class153.method1098((byte) 76, 30000L);
        field1133++;
        return -1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjava/awt/Component;II)Lcj;")
    public static final class116 method456(int arg0, Component arg1, int arg2, int arg3) {
        field1131++;
        try {
            if (arg3 != 0) {
                method456(26, (Component) null, 99, 18);
            }
            Class var4 = Class.forName("lf");
            class116 var5 = (class116) var4.getDeclaredConstructor().newInstance();
            var5.method799(arg0, arg1, -257, arg2);
            return var5;
        } catch (Throwable var7) {
            class112 var6 = new class112();
            var6.method799(arg0, arg1, -257, arg2);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method457(byte arg0) {
        field1128 = null;
        if (arg0 <= -73) {
            field1135 = null;
            field1134 = null;
            field1129 = null;
        }
    }
}
