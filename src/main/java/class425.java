import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class425 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[I")
    public static int[] field6182 = new int[4];

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field6183;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIII)V", line = 6)
    public static final void method2665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6185++;
        if (arg7 < 128 || arg4 < 128 || arg7 > (class183.field2703 * 128 - 256) || arg4 > (class66.field1056 * 128 - 256)) {
            class435.field6340[0] = class435.field6340[1] = -1;
            return;
        }
        if (arg5 != 4227) {
            method2665(-77, 111, 87, 52, -108, -8, -3, 31, 2);
        }
        int var9 = class109.method957(arg4, arg7, class367.field5213, 20663) - arg8;
        class293.field4355.method1528(arg1, 0, 0);
        class73.field1235.method673(class293.field4355);
        class73.field1235.method746(arg7, var9, arg4, class435.field6340);
        class293.field4355.method1528(-arg1, 0, 0);
        class73.field1235.method673(class293.field4355);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([IZII[Ljava/lang/Object;)V", line = 30)
    public static final void method2666(int[] arg0, boolean arg1, int arg2, int arg3, Object[] arg4) {
        if (arg2 > arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg3;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if (arg0[var9] < ((var9 & 0x1) + var7)) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var8;
            method2666(arg0, true, var6 - 1, arg3, arg4);
            method2666(arg0, true, arg2, var6 + 1, arg4);
        }
        field6184++;
        if (!arg1) {
            field6183 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 89)
    public static void method2667(int arg0) {
        field6183 = null;
        if (arg0 != 0) {
            field6183 = null;
        }
        field6182 = null;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIIIIIIII)V", line = 112)
    public static final void method2668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg5 != -6384) {
            return;
        }
        field6180++;
        if (arg2 < 1 || arg0 < 1 || (class183.field2703 - 2) < arg2 || arg0 > class66.field1056 - 2) {
            return;
        }
        if (!class122.method1034(24037) && !class202.method1538(arg2, arg0, class140.field2216, 582, arg1)) {
            return;
        }
        if (class443.field6447 == null) {
            return;
        }
        int var9 = arg1;
        if (arg1 < 3 && class93.method783(arg2, false, arg0)) {
            var9 = arg1 + 1;
        }
        class211.method1619(arg4, class73.field1235, arg0, var9, arg2, arg1, class322.field4646[arg1], (byte) 18);
        if (arg8 < 0) {
            return;
        }
        boolean var10 = class310.field4525;
        class310.field4525 = true;
        class111.method966(arg8, arg2, arg1, false, arg0, var9, arg6, (byte) 26, false, arg7, arg3, class73.field1235, class322.field4646[arg1]);
        class310.field4525 = var10;
        return;
    }
}
