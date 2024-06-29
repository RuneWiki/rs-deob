import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class407 {

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "[I")
    public static int[] field5952 = new int[2];

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Ldg;")
    public static class376 field5950 = new class376(64, -1);

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field5954 = 0;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field5955 = 0;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIZIIII)V")
    public static final void method2464(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg2) {
            field5952 = null;
        }
        if (arg6 != 8 && arg6 != 16) {
            class40 var7 = class153.field2210[arg5][arg0][arg1];
            if (var7 == null) {
                var7 = new class40(arg5);
            }
            if (arg6 == 1) {
                var7.field660 = (short) arg4;
                var7.field666 = (short) arg3;
            } else if (arg6 == 2) {
                var7.field667 = (short) arg3;
                var7.field670 = (short) arg4;
            }
            if (class375.field5342) {
                class127.method959(79);
            }
        } else if (arg6 == 8) {
            int var14 = arg0 << class310.field4593;
            int var15 = class437.field6392 + var14;
            int var16 = arg1 << class310.field4593;
            int var17 = class437.field6392 + var16;
            int var18 = class420.field6108[arg5].method432(arg0, false, arg1);
            int var19 = class420.field6108[arg5].method432(arg0 + 1, false, arg1 + 1);
            class7.field67[class586.field8205++] = new class327(arg6, arg5, var14, var15, var15, var14, var18, var19, var19 - arg4, -arg4 + var18, var16, var17, var17, var16);
        } else {
            int var8 = (arg0 << class310.field4593) + class437.field6392;
            int var9 = var8 - class437.field6392;
            int var10 = arg1 << class310.field4593;
            int var11 = class437.field6392 + var10;
            int var12 = class420.field6108[arg5].method432(arg0 + 1, false, arg1);
            int var13 = class420.field6108[arg5].method432(arg0, !arg2, arg1 + 1);
            class7.field67[class586.field8205++] = new class327(arg6, arg5, var8, var9, var9, var8, var12, var13, var13 - arg4, -arg4 + var12, var10, var11, var11, var10);
        }
        field5949++;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public static final void method2465(byte arg0) {
        field5953++;
        class553.method3134((long) class564.field7962, 0, class282.field4228);
        if (class100.field1556 != -1) {
            class493.method2859(class100.field1556, 63);
        }
        for (int var1 = 0; var1 < class28.field407; var1++) {
            if (class508.field7177[var1]) {
                class380.field5381[var1] = true;
            }
            class312.field4620[var1] = class508.field7177[var1];
            class508.field7177[var1] = false;
        }
        class125.field1873 = class564.field7962;
        if (arg0 != -3) {
            return;
        }
        if (class100.field1556 != -1) {
            class28.field407 = 0;
            class578.method3286((byte) 126);
        }
        class282.field4228.method152();
        class552.method3125(class282.field4228, 59);
        int var2 = class686.method3788(4192);
        if (var2 == -1) {
            var2 = class190.field2750;
        }
        if (var2 == -1) {
            var2 = class200.field2826;
        }
        class410.method2478((byte) 90, var2);
        class312.field4621 = 0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
    public static void method2466(boolean arg0) {
        field5952 = null;
        field5950 = null;
        if (!arg0) {
            field5955 = 3;
        }
    }
}
