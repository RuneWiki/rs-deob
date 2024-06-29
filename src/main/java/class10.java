import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class10 {

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "Lkea;")
    public static class77 field92 = new class77(1);

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field93 = 0;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)V", line = 10)
    public static void method45(boolean arg0) {
        field92 = null;
        if (arg0) {
            method46(6, true, 15, 10, -91, -38, -78);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZIIIII)V", line = 24)
    public static final void method46(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field91++;
        int var7 = class325.method1901(arg0, class675.field9512, class395.field5484, true);
        int var8 = class325.method1901(arg4, class675.field9512, class395.field5484, arg1);
        int var9 = class325.method1901(arg2, class490.field6592, class116.field1628, arg1);
        int var10 = class325.method1901(arg5, class490.field6592, class116.field1628, arg1);
        int var11 = class325.method1901(arg0 + arg6, class675.field9512, class395.field5484, true);
        int var12 = class325.method1901(arg4 - arg6, class675.field9512, class395.field5484, true);
        for (int var13 = var7; var13 < var11; var13++) {
            class721.method4044(class591.field8480[var13], var9, (byte) -128, var10, arg3);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class721.method4044(class591.field8480[var14], var9, (byte) -122, var10, arg3);
        }
        int var15 = class325.method1901(arg2 + arg6, class490.field6592, class116.field1628, true);
        int var16 = class325.method1901(arg5 - arg6, class490.field6592, class116.field1628, true);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class591.field8480[var17];
            class721.method4044(var18, var9, (byte) -128, var15, arg3);
            class721.method4044(var18, var16, (byte) -120, var10, arg3);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IBI)Z", line = 73)
    public static final boolean method47(int arg0, byte arg1, int arg2) {
        field90++;
        if ((class721.method4051(arg2, (byte) -90, arg0) | (arg2 & 0x10000) != 0) || class570.method3410(arg2, arg0, (byte) 123)) {
            return true;
        } else {
            if (arg1 != 3) {
                method45(true);
            }
            return (arg0 & 0x37) == 0 && class164.method1020(-1, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)Z", line = 88)
    public static final boolean method48(int arg0) {
        if (arg0 != -9457) {
            method47(93, (byte) -40, 22);
        }
        field94++;
        return class389.method2365("jaclib", (byte) -123) ? class389.method2365("hw3d", (byte) -69) : false;
    }
}
