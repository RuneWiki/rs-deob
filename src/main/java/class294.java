import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class294 extends class24 {

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public int field4986;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public int field4984;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Z")
    public static boolean field4985 = false;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "S")
    public static short field4983 = 256;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "[Lkk;")
    public static class63[] field4990 = new class63[27];

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Z")
    public static boolean field4982 = false;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "J")
    public static long field4989;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Ldk;")
    public static class241 field4981;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 20)
    public static void method2020(int arg0) {
        field4990 = null;
        if (arg0 != -1) {
            field4990 = (class63[]) null;
        }
        field4981 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Lgl;", line = 35)
    public static final class279 method2021(int arg0, int arg1) {
        field4988++;
        class279 var2 = (class279) class22.field263.method185(arg1 + 2827, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -2828) {
            method2022(76, -18, -13, 49, -11, 63);
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class200.field3300.method1647(1, (byte) 127, arg0);
        } else {
            var3 = class165.field2637.method1647(1, (byte) 119, arg0 & 0x7FFF);
        }
        class279 var4 = new class279();
        if (var3 != null) {
            var4.method1935(120, new class153(var3));
        }
        if (arg0 >= 32768) {
            var4.method1930(arg1 + 2828);
        }
        class22.field263.method187(var4, (long) arg0, (byte) 10);
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(II)V", line = 74)
    public class294(int arg0, int arg1) {
        this.field4986 = arg0;
        this.field4984 = arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V", line = 94)
    public static final void method2022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 <= (arg1 + arg4); var6++) {
            for (int var7 = arg5; var7 <= arg2 + arg5; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class168.field2749[arg0][var7][var6] = 127;
                }
            }
        }
        field4980++;
        int var8 = arg4;
        if (arg3 != 23229) {
            return;
        }
        while ((arg1 + arg4) > var8) {
            for (int var9 = arg5; var9 < (arg2 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class227.field3686[arg0][var9][var8] = arg0 > 0 ? class227.field3686[arg0 - 1][var9][var8] : 0;
                }
            }
            var8++;
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var10 = arg4 + 1; var10 < (arg1 + arg4); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class227.field3686[arg0][arg5][var10] = class227.field3686[arg0][arg5 - 1][var10];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var11 = arg5 + 1; var11 < arg2 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class227.field3686[arg0][var11][arg4] = class227.field3686[arg0][var11][arg4 - 1];
                }
            }
        }
        if (arg5 < 0 || arg4 < 0 || arg5 >= 104 || arg4 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 > 0 && class227.field3686[arg0][arg5 - 1][arg4] != 0) {
                class227.field3686[arg0][arg5][arg4] = class227.field3686[arg0][arg5 - 1][arg4];
            } else if (arg4 > 0 && class227.field3686[arg0][arg5][arg4 - 1] != 0) {
                class227.field3686[arg0][arg5][arg4] = class227.field3686[arg0][arg5][arg4 - 1];
            } else if (arg5 > 0 && arg4 > 0 && class227.field3686[arg0][arg5 - 1][arg4 - 1] != 0) {
                class227.field3686[arg0][arg5][arg4] = class227.field3686[arg0][arg5 - 1][arg4 - 1];
            }
        } else if (arg5 > 0 && class227.field3686[arg0 - 1][arg5 - 1][arg4] != class227.field3686[arg0][arg5 - 1][arg4]) {
            class227.field3686[arg0][arg5][arg4] = class227.field3686[arg0][arg5 - 1][arg4];
        } else if (arg4 > 0 && class227.field3686[arg0 - 1][arg5][arg4 - 1] != class227.field3686[arg0][arg5][arg4 - 1]) {
            class227.field3686[arg0][arg5][arg4] = class227.field3686[arg0][arg5][arg4 - 1];
        } else if (arg5 > 0 && arg4 > 0 && class227.field3686[arg0 - 1][arg5 - 1][arg4 - 1] != class227.field3686[arg0][arg5 - 1][arg4 - 1]) {
            class227.field3686[arg0][arg5][arg4] = class227.field3686[arg0][arg5 - 1][arg4 - 1];
        }
    }
}
