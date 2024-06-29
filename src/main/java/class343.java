import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class343 {

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field4813 = 0;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field4811 = -1;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lmi;")
    public static class496 field4817;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static void method2163(byte arg0) {
        int var1 = -38 % ((arg0 - 57) / 62);
        field4817 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)I")
    public static final int method2164(int arg0, boolean arg1) {
        field4812++;
        int var2 = class215.field3119;
        if (var2 == 0) {
            return arg1 ? 0 : class501.field7002;
        } else if (var2 == 1) {
            return class501.field7002;
        } else if (var2 == 2) {
            return 0;
        } else {
            int var3 = -103 / ((arg0 + 37) / 39);
            return 0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lha;IBIII)V")
    public static final void method2165(class59 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field4815++;
        class569.field7823 = arg0;
        class99.field1740 = class569.field7823.method290();
        class211.field3000 = class569.field7823.method290();
        class184.field2783 = class569.field7823.method290();
        class147.field2462 = arg4;
        class215.field3119 = 0;
        class2.field20 = arg1;
        class58.field1149 = null;
        class478.field6662 = null;
        class486.method2862((byte) 38, arg3, arg5);
        class581.field7961 = -1;
        class67.field1267 = -1;
        class15.field251 = -1;
        int var6 = 90 % ((70 - arg2) / 33);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method2166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4816++;
        int var7 = arg3 + arg1;
        int var8 = arg0 + arg4;
        int var9 = arg2 + arg5;
        if (!class87.method829(arg3, var7, arg2, arg3, var9, var8, var8, var8, var9, false)) {
            return false;
        }
        if (arg6 != 18507) {
            method2164(-107, false);
        }
        if (!class87.method829(arg3, var7, arg2, var7, var9, var8, var8, var8, arg2, false)) {
            return false;
        }
        if (class119.field2020 > arg3) {
            if (!class87.method829(arg3, arg3, var9, arg3, var9, var8, var8, arg4, arg2, false)) {
                return false;
            }
            if (!class87.method829(arg3, arg3, var9, arg3, arg2, var8, arg4, arg4, arg2, false)) {
                return false;
            }
        } else if (!class87.method829(var7, var7, var9, var7, var9, var8, var8, arg4, arg2, false)) {
            return false;
        } else if (!class87.method829(var7, var7, var9, var7, arg2, var8, arg4, arg4, arg2, false)) {
            return false;
        }
        if (arg2 >= class364.field5216) {
            if (!class87.method829(arg3, var7, var9, arg3, var9, var8, var8, arg4, var9, false)) {
                return false;
            }
            if (!class87.method829(arg3, var7, var9, var7, var9, var8, arg4, arg4, var9, false)) {
                return false;
            }
        } else if (!class87.method829(arg3, var7, arg2, arg3, arg2, var8, var8, arg4, arg2, false)) {
            return false;
        } else if (!class87.method829(arg3, var7, arg2, var7, arg2, var8, arg4, arg4, arg2, false)) {
            return false;
        }
        return true;
    }
}
