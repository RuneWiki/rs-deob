import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class71 extends class238 {

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "Lus;")
    public static class1 field889;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "[I")
    public static int[] field888;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field886;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
    public static void method416(int arg0) {
        field889 = null;
        field888 = null;
        field886 = null;
        int var1 = -37 % ((arg0 + 19) / 48);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Le;IIIII)V")
    public static final void method417(class342 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field890++;
        if (arg0.field4965 == -1 && arg0.field4980 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 > arg0.field4987) {
            var6 += arg1 - arg0.field4987;
        } else if (arg0.field4988 > arg1) {
            var6 += arg0.field4988 - arg1;
        }
        if (arg3 != -30716) {
            return;
        }
        int var7 = class314.field4438.field5771 * arg0.field4985 >> 8;
        if (arg0.field4973 < arg4) {
            var6 += arg4 - arg0.field4973;
        } else if (arg4 < arg0.field4977) {
            var6 += arg0.field4977 - arg4;
        }
        if (arg0.field4972 == 0 || (var6 - 64) > arg0.field4972 || class314.field4438.field5771 == 0 || arg0.field4971 != arg5) {
            if (arg0.field4984 != null) {
                class59.field796.method2561(arg0.field4984);
                arg0.field4984 = null;
            }
            if (arg0.field4974 != null) {
                class59.field796.method2561(arg0.field4974);
                arg0.field4974 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg0.field4972 - var6) * var7 / arg0.field4972;
        if (arg0.field4984 != null) {
            arg0.field4984.method49(var8);
        } else if (arg0.field4965 >= 0) {
            class192 var9 = class192.method1187(class258.field3769, arg0.field4965, 0);
            if (var9 != null) {
                class352 var10 = var9.method1190().method2199(class220.field3282);
                class12 var11 = class12.method54(var10, 100, var8);
                var11.method57(-1);
                class59.field796.method2559(var11);
                arg0.field4984 = var11;
            }
        }
        if (arg0.field4974 != null) {
            arg0.field4974.method49(var8);
            if (!arg0.field4974.method1512((byte) -25)) {
                arg0.field4974 = null;
            }
        } else if (arg0.field4980 != null && (arg0.field4978 -= arg2) <= 0) {
            int var12 = (int) ((double) arg0.field4980.length * Math.random());
            class192 var13 = class192.method1187(class258.field3769, arg0.field4980[var12], 0);
            if (var13 != null) {
                class352 var14 = var13.method1190().method2199(class220.field3282);
                class12 var15 = class12.method54(var14, 100, var8);
                var15.method57(0);
                class59.field796.method2559(var15);
                arg0.field4978 = arg0.field4983 + ((int) ((double) (arg0.field4968 - arg0.field4983) * Math.random()));
                arg0.field4974 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(II)V")
    public class71(int arg0, int arg1) {
        this.field887 = arg1;
        this.field885 = arg0;
    }
}
