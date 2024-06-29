import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class631 {

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Z")
    public static boolean field8782 = false;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Ljt;")
    public static class107 field8778;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[Lsba;I)V", line = 7)
    public static final void method3547(int arg0, class218[] arg1, int arg2) {
        for (int var3 = arg0; var3 < arg1.length; var3++) {
            class218 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field2832 == 0) {
                    if (var4.field2816 != null) {
                        method3547(arg0, var4.field2816, arg2);
                    }
                    class526 var5 = (class526) class520.field6994.method2552((long) var4.field2708, -1);
                    if (var5 != null) {
                        class522.method2904(arg2, var5.field7062, -105);
                    }
                }
                if (arg2 == 0 && var4.field2805 != null) {
                    class404 var6 = new class404();
                    var6.field5709 = var4.field2805;
                    var6.field5714 = var4;
                    class498.method2775(var6);
                }
                if (arg2 == 1 && var4.field2792 != null) {
                    if (var4.field2769 >= 0) {
                        class218 var7 = class357.method2056(var4.field2708, -9820);
                        if (var7 == null || var7.field2816 == null || var7.field2816.length <= var4.field2769 || var7.field2816[var4.field2769] != var4) {
                            continue;
                        }
                    }
                    class404 var8 = new class404();
                    var8.field5714 = var4;
                    var8.field5709 = var4.field2792;
                    class498.method2775(var8);
                }
            }
        }
        field8781++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 81)
    public static void method3548(int arg0) {
        if (arg0 >= 99) {
            field8778 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)Z", line = 91)
    public static final boolean method3549(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            return true;
        }
        field8783++;
        if ((class337.method1998(arg0, 544, arg1) | (arg0 & 0x10000) != 0) || class190.method1060(arg0, -12294, arg1)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && class90.method644(55, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[B[BIIII)V", line = 107)
    public static final void method3550(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field8780++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        if (arg5 != -18305) {
            method3547(8, null, 105);
        }
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg4[var10001] = (byte) (arg4[var10001] - arg3[arg2++]);
                int var14 = arg1++;
                arg4[var14] = (byte) (arg4[var14] - arg3[arg2++]);
                int var15 = arg1++;
                arg4[var15] = (byte) (arg4[var15] - arg3[arg2++]);
                int var16 = arg1++;
                arg4[var16] = (byte) (arg4[var16] - arg3[arg2++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg4[var10001] = (byte) (arg4[var10001] - arg3[arg2++]);
            }
            arg2 += arg6;
            arg1 += arg7;
        }
    }
}
