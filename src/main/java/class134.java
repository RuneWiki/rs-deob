import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class134 {

    @OriginalMember(owner = "client!st", name = "a", descriptor = "[I")
    public static int[] field1849 = new int[14];

    @OriginalMember(owner = "client!st", name = "c", descriptor = "Leba;")
    public static class550 field1851 = new class550(106, 6);

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIZIIII)Z")
    public static final boolean method776(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field1852++;
        int var9 = class408.field5369.field3088[0];
        int var10 = class408.field5369.field3086[0];
        if (var9 < 0 || var9 >= class703.field9886 || var10 < 0 || var10 >= class431.field5789) {
            return false;
        } else if (arg2 >= 0 && class703.field9886 > arg2 && arg7 >= 0 && class431.field5789 > arg7) {
            int var11 = class209.method1327(var9, arg6, class322.field4302[class408.field5369.field385], (byte) 125, arg0, arg2, arg8, arg5, class502.field6925, var10, arg7, arg4, arg1, class408.field5369.method1435((byte) 95), class10.field99);
            if (var11 < 1) {
                return false;
            }
            class387.field5165 = class10.field99[var11 - 1];
            class502.field6926 = class502.field6925[var11 - 1];
            if (arg3 >= -19) {
                method778(-58);
            }
            class508.field7011 = false;
            class326.method1896(-3379);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(JZ)V")
    public static final void method777(long arg0, boolean arg1) {
        field1850++;
        int var3 = class165.field2369;
        if (class470.field6552 != var3) {
            int var4 = var3 - class470.field6552;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var4 > var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var5 > var4) {
                var5 = var4;
            }
            class470.field6552 += var5;
        }
        int var6 = class622.field8621;
        if (arg1) {
            field1851 = null;
        }
        if (!class602.field8408.field4332) {
            class475.field6610 += (float) arg0 * class635.field8787 / 40.0F * 8.0F;
            class565.field7707 += (float) arg0 * class340.field4574 / 40.0F * 8.0F;
        }
        if (class424.field5715 != var6) {
            int var7 = var6 - class424.field5715;
            int var8 = (int) ((long) var7 * arg0 / 320L);
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
            class424.field5715 += var8;
        }
        class401.method2296((byte) 57);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
    public static void method778(int arg0) {
        field1851 = null;
        field1849 = null;
        if (arg0 != -1) {
            method778(80);
        }
    }
}
