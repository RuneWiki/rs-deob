import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class175 {

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "Lnt;")
    public static class220 field2544 = new class220();

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "Lsn;")
    public static class628 field2545 = new class628();

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "Lav;")
    public static class637 field2546;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BZII)I")
    public static final int method1274(byte arg0, boolean arg1, int arg2, int arg3) {
        field2541++;
        if (arg0 != 112) {
            return 55;
        }
        class380 var4 = class105.method908(arg0 - 112, arg1, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && var4.field5298.length > arg2) {
            return var4.field5298[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)V")
    public static final void method1275(int arg0, int arg1) {
        field2542++;
        class354 var2 = class501.method3012(arg0, arg1, arg1 + 2145997199);
        var2.method2216(arg1 - 17);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
    public static void method1276(byte arg0) {
        field2544 = null;
        field2546 = null;
        if (arg0 != 77) {
            field2544 = null;
        }
        field2545 = null;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIZIZBI)V")
    public static final void method1277(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        if (arg6 < arg3) {
            int var7 = (arg6 + arg3) / 2;
            int var8 = arg6;
            class483 var9 = class261.field3819[var7];
            class261.field3819[var7] = class261.field3819[arg3];
            class261.field3819[arg3] = var9;
            for (int var10 = arg6; var10 < arg3; var10++) {
                if (class24.method146(86, arg4, arg0, arg1, class261.field3819[var10], var9, arg2) <= 0) {
                    class483 var11 = class261.field3819[var10];
                    class261.field3819[var10] = class261.field3819[var8];
                    class261.field3819[var8++] = var11;
                }
            }
            class261.field3819[arg3] = class261.field3819[var8];
            class261.field3819[var8] = var9;
            method1277(arg0, arg1, arg2, var8 - 1, arg4, (byte) 126, arg6);
            method1277(arg0, arg1, arg2, arg3, arg4, (byte) 126, var8 + 1);
        }
        if (arg5 == 126) {
            field2543++;
        }
    }
}
