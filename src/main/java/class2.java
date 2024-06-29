import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field17;

    static {
        new class151("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 4)
    public static final void method9(int arg0) {
        field15++;
        if (!class450.field6405) {
            return;
        }
        class172 var1 = class77.method678(class4.field29, -68, class124.field1679);
        if (var1 != null && var1.field2570 != null) {
            class472 var2 = new class472();
            var2.field6642 = var1;
            var2.field6649 = var1.field2570;
            class457.method2745(var2);
        }
        class128.field1750 = -1;
        if (arg0 != 149799361) {
            field17 = 126;
        }
        class450.field6405 = false;
        class377.field5197 = -1;
        if (var1 != null) {
            class184.method1314(var1, 127);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I", line = 47)
    public static final int method10(int arg0, int arg1) {
        field12++;
        if (arg0 != -1) {
            return -98;
        }
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)I", line = 67)
    public static final int method11(byte arg0, int arg1) {
        field14++;
        if (arg0 <= 123) {
            method9(-108);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIII)V", line = 78)
    public static final void method12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -26) {
            method11((byte) -73, -11);
        }
        field16++;
        if (arg5 > class151.field2091 || class444.field6338 > arg3) {
            return;
        }
        boolean var6;
        if (arg4 < class295.field4153) {
            arg4 = class295.field4153;
            var6 = false;
        } else if (arg4 > class103.field1457) {
            arg4 = class103.field1457;
            var6 = false;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg1 < class295.field4153) {
            var7 = false;
            arg1 = class295.field4153;
        } else if (class103.field1457 >= arg1) {
            var7 = true;
        } else {
            var7 = false;
            arg1 = class103.field1457;
        }
        if (arg5 < class444.field6338) {
            arg5 = class444.field6338;
        } else {
            class61.method558(arg1, -10647, class373.field5141[arg5++], arg4, arg0);
        }
        if (class151.field2091 < arg3) {
            arg3 = class151.field2091;
        } else {
            class61.method558(arg1, -10647, class373.field5141[arg3--], arg4, arg0);
        }
        if (var6 && var7) {
            for (int var8 = arg5; var8 <= arg3; var8++) {
                int[] var9 = class373.field5141[var8];
                var9[arg4] = var9[arg1] = arg0;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg5; var10 <= arg3; var10++) {
                class373.field5141[var10][arg4] = arg0;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg5; var11 <= arg3; var11++) {
                class373.field5141[var11][arg1] = arg0;
            }
            return;
        }
    }
}
