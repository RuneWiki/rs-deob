import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class22 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field301 = 0;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "[I")
    public static int[] field300 = new int[2];

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[I")
    public static int[] field307 = new int[200];

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lhj;")
    public static class69 field305 = class181.method1318("<col=ff0000>", (byte) -127);

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Lhj;")
    public static class69 field309 = class181.method1318("Angreifen", (byte) -127);

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lhj;")
    public static class69 field304 = class181.method1318("Texturen geladen)3", (byte) -112);

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBLtk;I)V")
    public static final void method123(int arg0, byte arg1, class50 arg2, int arg3) {
        if (arg2.field878 == 0) {
            arg2.field740 = arg2.field867;
        } else if (arg2.field878 == 1) {
            arg2.field740 = (arg3 - arg2.field727) / 2 + arg2.field867;
        } else if (arg2.field878 == 2) {
            arg2.field740 = arg3 - arg2.field867 - arg2.field727;
        } else if (arg2.field878 == 3) {
            arg2.field740 = arg2.field867 * arg3 >> 14;
        } else if (arg2.field878 == 4) {
            arg2.field740 = (arg2.field867 * arg3 >> 14) + (arg3 - arg2.field727) / 2;
        } else {
            arg2.field740 = arg3 - (arg2.field867 * arg3 >> 14) - arg2.field727;
        }
        field310++;
        if (arg2.field780 == 0) {
            arg2.field771 = arg2.field782;
        } else if (arg2.field780 == 1) {
            arg2.field771 = (arg0 - arg2.field798) / 2 + arg2.field782;
        } else if (arg2.field780 == 2) {
            arg2.field771 = arg0 - arg2.field782 - arg2.field798;
        } else if (arg2.field780 == 3) {
            arg2.field771 = arg2.field782 * arg0 >> 14;
        } else if (arg2.field780 == 4) {
            arg2.field771 = (arg2.field782 * arg0 >> 14) + (arg0 - arg2.field798) / 2;
        } else {
            arg2.field771 = arg0 - arg2.field798 - (arg2.field782 * arg0 >> 14);
        }
        if (class88.field1684 && (client.method1141(arg2) != 0 || arg2.field884 == 0)) {
            if (arg2.field740 < 0) {
                arg2.field740 = 0;
            } else if (arg3 < arg2.field740 + arg2.field727) {
                arg2.field740 = arg3 - arg2.field727;
            }
            if (arg2.field771 < 0) {
                arg2.field771 = 0;
            } else if (arg0 < (arg2.field771 + arg2.field798)) {
                arg2.field771 = arg0 - arg2.field798;
            }
        }
        int var4 = -47 % ((arg1 + 84) / 42);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Led;III)V")
    public static final void method124(class177 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class109.field2091) {
            class217 var4 = class158.field2935[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3949 != null && var4.field3949.field1288.method512()) {
                arg0.method522(var4.field3949.field1288, 128, 0, 0, true);
            }
        }
        if (arg3 < class109.field2091) {
            class217 var5 = class158.field2935[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3949 != null && var5.field3949.field1288.method512()) {
                arg0.method522(var5.field3949.field1288, 0, 0, 128, true);
            }
        }
        if (arg2 < class109.field2091 && arg3 < class146.field2694) {
            class217 var6 = class158.field2935[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3949 != null && var6.field3949.field1288.method512()) {
                arg0.method522(var6.field3949.field1288, 128, 0, 128, true);
            }
        }
        if (arg2 < class109.field2091 && arg3 > 0) {
            class217 var7 = class158.field2935[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3949 != null && var7.field3949.field1288.method512()) {
                arg0.method522(var7.field3949.field1288, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field308++;
        if (class131.method971(arg3, (byte) -95)) {
            client.method1150(class116.field2222[arg3], -1, arg6, arg2, arg5, arg1, arg4, arg0);
            if (arg7 != -5) {
                field305 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)Lsc;")
    public static final class235 method126(int arg0, byte arg1) {
        class235 var2 = (class235) class58.field1056.method1448((long) arg0, (byte) -40);
        field302++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -38) {
            method123(63, (byte) 91, (class50) null, 81);
        }
        byte[] var3 = class83.field1594.method590(class265.method1833(arg0, false), class216.method1551(37, arg0), arg1 ^ 0xFFFFFFDA);
        class235 var4 = new class235();
        if (var3 != null) {
            var4.method1659(-43, new class128(var3));
        }
        class58.field1056.method1453(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method127(int arg0) {
        field300 = null;
        field305 = null;
        field304 = null;
        field309 = null;
        if (arg0 != -29315) {
            field305 = null;
        }
        field307 = null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static final void method128(int arg0) {
        int var1 = 69 / ((arg0 + 52) / 47);
        class104.field1952.method1713(119);
        class98.field1826.method1713(-128);
        field303++;
        class193.field3497.method1713(97);
    }
}
