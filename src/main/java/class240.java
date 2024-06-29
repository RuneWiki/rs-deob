import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class240 {

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public int field3985 = -1;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lsi;")
    public static class223 field3982 = null;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "[I")
    public static int[] field3989 = new int[500];

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Lma;")
    private static class5 field3986 = class12.method119("World", (byte) 113);

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Lma;")
    public static class5 field3981 = class12.method119(" )2> <col=ff9040>", (byte) 108);

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "Lma;")
    public static class5 field3992 = field3986;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field3988 = 0;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "Lnk;")
    public class290 field3991;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[I")
    public int[] field3980;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[Lma;")
    public class5[] field3983;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIII)V", line = 16)
    public static final void method1695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3993++;
        int var6 = arg0 - arg3;
        int var7 = arg5 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class272.method1863(0, arg1, arg5, arg4, arg3);
            }
        } else if (var7 == 0) {
            class175.method1147(arg0, -113, arg4, arg3, arg1);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 > var6;
            if (var8) {
                int var9 = arg3;
                int var10 = arg0;
                arg3 = arg4;
                arg0 = arg5;
                arg4 = var9;
                arg5 = var10;
            }
            if (arg3 > arg0) {
                int var11 = arg3;
                arg3 = arg0;
                int var12 = arg4;
                arg4 = arg5;
                arg0 = var11;
                arg5 = var12;
            }
            int var13 = arg0 - arg3;
            int var14 = -(var13 >> 1);
            int var15 = arg4 < arg5 ? 1 : -1;
            int var16 = arg4;
            int var17 = arg5 - arg4;
            if (var17 < 0) {
                var17 = -var17;
            }
            if (var8) {
                for (int var18 = arg3; var18 <= arg0; var18++) {
                    var14 += var17;
                    class137.field2032[var18][var16] = arg1;
                    if (var14 > 0) {
                        var14 -= var13;
                        var16 += var15;
                    }
                }
            } else {
                for (int var19 = arg3; var19 <= arg0; var19++) {
                    var14 += var17;
                    class137.field2032[var16][var19] = arg1;
                    if (var14 > 0) {
                        var16 += var15;
                        var14 -= var13;
                    }
                }
            }
            if (arg2 != -28633) {
                method1696((byte) -104);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)I", line = 142)
    public static final int method1696(byte arg0) {
        field3990++;
        if (arg0 != 122) {
            field3986 = (class5) null;
        }
        return class153.field2255;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V", line = 163)
    public static void method1697(boolean arg0) {
        field3981 = null;
        if (arg0) {
            field3992 = null;
            field3986 = null;
            field3989 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)Lma;", line = 184)
    public static final class5 method1698(byte arg0) {
        if (arg0 < 21) {
            field3986 = (class5) null;
        }
        field3987++;
        class5 var1 = class242.field4025;
        if (class90.field1350 != 0) {
            var1 = class33.field505;
        }
        return class288.method1940((byte) 57, new class5[] { class158.field2382, var1, class57.field903, class175.method1148(class211.field3361, false), class211.field3370, class175.method1148(class249.field4119, false), class274.field4673 });
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V", line = 219)
    public static final void method1699(int arg0, int arg1, int arg2) {
        class135.field2000++;
        if (arg1 != 0) {
            method1696((byte) -113);
        }
        class147.field2127.method1389((byte) -60, 43);
        field3978++;
        class147.field2127.method1513(arg2, false);
        class147.field2127.method1502(126, arg0);
    }
}
