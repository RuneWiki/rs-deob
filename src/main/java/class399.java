import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public abstract class class399 {

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "Ldc;")
    public static class5 field5876 = new class5(4);

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "Liu;")
    public static class390 field5878 = new class390(2, 3);

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "Liu;")
    public static class390 field5879 = new class390(48, 3);

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "[[I")
    public static int[][] field5880 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "Leo;")
    public static class185 field5882;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLbn;I)V")
    public static final void method2381(byte arg0, class294 arg1, int arg2) {
        field5877++;
        int var3 = -1;
        int var4 = 0;
        if (class263.field3748 < arg1.field4225) {
            class70.method474(11377, arg1);
        } else if (class263.field3748 <= arg1.field4254) {
            class138.method870(arg1, -14625);
        } else {
            class454.method2640(false, 1, arg1);
            var3 = class45.field688;
            var4 = class428.field6299;
        }
        if (arg1.field2959 < 128 || arg1.field2966 < 128 || (class362.field5442 * 128 - 128) <= arg1.field2959 || ((class203.field2813 - 1) * 128) <= arg1.field2966) {
            arg1.field4269 = -1;
            arg1.field4263 = -1;
            var4 = 0;
            arg1.field4225 = 0;
            arg1.field4254 = 0;
            var3 = -1;
            arg1.field4215 = -1;
            arg1.field2959 = arg1.field4279[0] * 128 + arg1.method1773(-106) * 64;
            arg1.field2966 = arg1.field4282[0] * 128 + (arg1.method1773(-67) * 64);
            arg1.method1770((byte) 97);
        }
        if (class415.field6145 == arg1 && (arg1.field2959 < 1536 || arg1.field2966 < 1536 || arg1.field2959 >= ((class362.field5442 - 12) * 128) || arg1.field2966 >= (class203.field2813 * 128 - 1536))) {
            var4 = 0;
            arg1.field4225 = 0;
            arg1.field4215 = -1;
            arg1.field4263 = -1;
            arg1.field4269 = -1;
            arg1.field4254 = 0;
            var3 = -1;
            arg1.field2959 = arg1.field4279[0] * 128 + arg1.method1773(-84) * 64;
            arg1.field2966 = arg1.field4282[0] * 128 + (arg1.method1773(-81) * 64);
            arg1.method1770((byte) 114);
        }
        int var5 = class437.method2570(arg1, (byte) 11);
        class62.method438(var4, -111, arg1, var5, var3);
        class69.method472(true, arg1);
        int var6 = 59 % ((arg0 - 50) / 53);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5875++;
        if (arg0 >= 1 && arg4 >= 1 && (class362.field5442 - 2) >= arg0 && arg4 <= class203.field2813 - 2) {
            int var9 = arg8;
            if (arg8 < 3 && class352.method2137(arg4, 66, arg0)) {
                var9 = arg8 + 1;
            }
            if (!class118.field1533.method2961(class293.field4174, 29) && !class195.method1222(class234.field3290, arg0, var9, false, arg4)) {
                return;
            }
            if (class358.field5312 == null) {
                return;
            }
            class453.field6588.method2337(class169.field2234[arg8], arg0, arg8, (byte) 58, class481.field6937, arg3, arg4);
            if (arg6 >= 0) {
                boolean var10 = class118.field1533.field6892;
                class118.field1533.field6892 = true;
                class453.field6588.method2327(arg8, arg7, class481.field6937, arg5, 3, arg4, class169.field2234[arg8], var9, arg0, arg6, arg2);
                class118.field1533.field6892 = var10;
            }
        }
        int var11 = -10 % ((39 - arg1) / 43);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Z")
    public abstract boolean method1877(int arg0, int arg1);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
    public abstract void method1872(int arg0);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
    public abstract void method1868(byte arg0);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)Lct;")
    public abstract class93 method1876(boolean arg0);

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)V")
    public static void method2383(byte arg0) {
        field5879 = null;
        if (arg0 > -51) {
            method2382(113, -96, 27, 57, 29, -88, 48, 24, -44);
        }
        field5880 = null;
        field5876 = null;
        field5878 = null;
        field5882 = null;
    }
}
