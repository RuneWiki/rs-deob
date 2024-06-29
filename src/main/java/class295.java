import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class295 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Luf;")
    private static class168 field4992 = class148.method1019(-1720, "glow3:");

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Luf;")
    public static class168 field4991 = field4992;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Luf;")
    public static class168 field5001 = class148.method1019(-1720, " )2> ");

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Luf;")
    public static class168 field5002 = field4992;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "[I")
    public static int[] field4996 = new int[50];

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Luf;")
    public static class168 field5003 = class148.method1019(-1720, ":clanreq:");

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)I", line = 25)
    public static final int method2023(int arg0, int arg1) {
        field4999++;
        if (arg0 >= -111) {
            field5002 = (class168) null;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIII)V", line = 61)
    public static final void method2024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4993++;
        if (arg7 != 22645) {
            method2023(22, -48);
        }
        for (int var9 = 0; var9 < class201.field3315.field4146; var9++) {
            int var10 = class201.field3315.field4144[var9] - class40.field506;
            int var11 = class261.field4420 + class172.field2801 - class201.field3315.field4148[var9] - 1;
            int var12 = arg8 + ((var10 - arg3) * (arg0 - arg8) / (arg5 - arg3));
            int var13 = (var11 - arg2) * (arg1 - arg4) / (arg6 - arg2) + arg4;
            class35 var14 = null;
            int var15 = class201.field3315.method1683(var9, 2);
            if (var15 == 0) {
                if ((double) class15.field149 == 3.0D) {
                    var14 = class157.field2476;
                }
                if ((double) class15.field149 == 4.0D) {
                    var14 = class214.field3492;
                }
                if ((double) class15.field149 == 6.0D) {
                    var14 = class213.field3477;
                }
                if ((double) class15.field149 == 8.0D) {
                    var14 = class211.field3474;
                }
            }
            if (var15 == 1) {
                if ((double) class15.field149 == 3.0D) {
                    var14 = class213.field3477;
                }
                if ((double) class15.field149 == 4.0D) {
                    var14 = class211.field3474;
                }
                if ((double) class15.field149 == 6.0D) {
                    var14 = class247.field4237;
                }
                if ((double) class15.field149 == 8.0D) {
                    var14 = class136.field2115;
                }
            }
            int var16 = 16777215;
            if (var15 == 2) {
                var16 = 16755200;
                if ((double) class15.field149 == 3.0D) {
                    var14 = class247.field4237;
                }
                if ((double) class15.field149 == 4.0D) {
                    var14 = class136.field2115;
                }
                if ((double) class15.field149 == 6.0D) {
                    var14 = class187.field2963;
                }
                if ((double) class15.field149 == 8.0D) {
                    var14 = class118.field1842;
                }
            }
            if (class201.field3315.field4147[var9] != -1) {
                var16 = class201.field3315.field4147[var9];
            }
            if (var14 != null) {
                class168[] var17 = new class168[class201.field3315.field4158[var9].method1214(arg7 - 22645, 60) + 1];
                class245.field4170.method204(class201.field3315.field4158[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var13 - (var18 - 1) * var14.method172() / 2;
                int var20 = var19 + var14.method178() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class168 var22 = var18 - 1 == var21 ? var17[var21] : var17[var21].method1187(0, arg7 - 22645, var17[var21].method1167(false) + -4);
                    var14.method173(var22, var12, var20, var16, true);
                    var20 += var14.method172();
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 188)
    public static void method2025(byte arg0) {
        field5003 = null;
        field4992 = null;
        field4991 = null;
        if (arg0 != 56) {
            method2027(91, -113, -18, -118, 104);
        }
        field4996 = null;
        field5001 = null;
        field5002 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)J", line = 204)
    public static final long method2026(int arg0, int arg1, int arg2) {
        class127 var3 = class92.field1424[arg0][arg1][arg2];
        return var3 == null || var3.field1981 == null ? 0L : var3.field1981.field363;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V", line = 214)
    public static final void method2027(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -103) {
            field5002 = (class168) null;
        }
        if (arg2 <= arg1) {
            for (int var5 = arg2; var5 < arg1; var5++) {
                class284.field4810[var5][arg0] = arg4;
            }
        } else {
            for (int var6 = arg1; var6 < arg2; var6++) {
                class284.field4810[var6][arg0] = arg4;
            }
        }
        field5004++;
    }
}
