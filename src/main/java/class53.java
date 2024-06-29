import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class53 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Z")
    public static boolean field1106 = false;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lpj;")
    private static class237 field1111 = class33.method353("Take", 105);

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Lpj;")
    public static class237 field1108 = class33.method353("_labels", 34);

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field1113 = 0;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Lpj;")
    public static class237 field1109 = field1111;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static final void method470(byte arg0) {
        class11 var1 = (class11) class47.field1017.method673(false);
        if (arg0 >= -18) {
            field1108 = null;
        }
        field1114++;
        while (var1 != null) {
            class39 var2 = var1.field202;
            if (class274.field4798 != var2.field900 || var2.field899) {
                var1.method629(0);
            } else if (class241.field4246 >= var2.field906) {
                var2.method405(class59.field1204, 10);
                if (var2.field899) {
                    var1.method629(0);
                } else {
                    class185.method1269(var2.field900, var2.field889, var2.field901, var2.field911, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class11) class47.field1017.method680(104);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lm;")
    public static final class114 method471(int arg0, int arg1, int arg2) {
        class35 var3 = class274.field4775[arg0][arg1][arg2];
        return var3 == null ? null : var3.field763;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Lpj;")
    public static final class237 method472(int arg0, int arg1) {
        field1107++;
        return ~arg1 > arg0 ? class14.method130(arg1, (byte) 117) : class113.field1988;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
    public static final void method473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -7936) {
            field1108 = null;
        }
        for (int var6 = arg4; var6 <= arg3 + arg4; var6++) {
            for (int var11 = arg2; var11 <= (arg2 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class148.field2639[arg1][var11][var6] = 127;
                }
            }
        }
        field1110++;
        for (int var7 = arg4; var7 < arg3 + arg4; var7++) {
            for (int var10 = arg2; var10 < (arg2 + arg5); var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class99.field1773[arg1][var10][var7] = arg1 > 0 ? class99.field1773[arg1 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var8 = arg4 + 1; var8 < arg3 + arg4; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class99.field1773[arg1][arg2][var8] = class99.field1773[arg1][arg2 - 1][var8];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var9 = arg2 + 1; var9 < (arg2 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class99.field1773[arg1][var9][arg4] = class99.field1773[arg1][var9][arg4 - 1];
                }
            }
        }
        if (arg2 < 0 || arg4 < 0 || arg2 >= 104 || arg4 >= 104) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 > 0 && class99.field1773[arg1][arg2 - 1][arg4] != 0) {
                class99.field1773[arg1][arg2][arg4] = class99.field1773[arg1][arg2 - 1][arg4];
                return;
            }
            if (arg4 > 0 && class99.field1773[arg1][arg2][arg4 - 1] != 0) {
                class99.field1773[arg1][arg2][arg4] = class99.field1773[arg1][arg2][arg4 - 1];
                return;
            }
            if (arg2 > 0 && arg4 > 0 && class99.field1773[arg1][arg2 - 1][arg4 - 1] != 0) {
                class99.field1773[arg1][arg2][arg4] = class99.field1773[arg1][arg2 - 1][arg4 - 1];
                return;
            }
            return;
        }
        if (arg2 > 0 && class99.field1773[arg1][arg2 - 1][arg4] != class99.field1773[arg1 - 1][arg2 - 1][arg4]) {
            class99.field1773[arg1][arg2][arg4] = class99.field1773[arg1][arg2 - 1][arg4];
            return;
        }
        if (arg4 > 0 && class99.field1773[arg1 - 1][arg2][arg4 - 1] != class99.field1773[arg1][arg2][arg4 - 1]) {
            class99.field1773[arg1][arg2][arg4] = class99.field1773[arg1][arg2][arg4 - 1];
            return;
        }
        if (arg2 > 0 && arg4 > 0 && class99.field1773[arg1 - 1][arg2 - 1][arg4 - 1] != class99.field1773[arg1][arg2 - 1][arg4 - 1]) {
            class99.field1773[arg1][arg2][arg4] = class99.field1773[arg1][arg2 - 1][arg4 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method474(int arg0) {
        if (arg0 == 104) {
            field1109 = null;
            field1111 = null;
            field1108 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lpj;I)I")
    public static final int method475(class237 arg0, int arg1) {
        field1112++;
        if (arg0 == null) {
            return -1;
        } else if (arg1 <= 76) {
            return 71;
        } else {
            for (int var2 = 0; var2 < class221.field3810; var2++) {
                if (arg0.method1580(class152.field2694[var2], (byte) 27)) {
                    return var2;
                }
            }
            return -1;
        }
    }
}
