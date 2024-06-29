import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class54 {

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Lqh;")
    public static class201 field923;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "[I")
    public static int[] field928;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method405(int arg0) {
        field928 = null;
        field923 = null;
        int var1 = 58 % ((arg0 - 56) / 63);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public static final void method406(int arg0) {
        field927++;
        int var1 = -77 / ((56 - arg0) / 60);
        try {
            if (class220.field3599 == 1) {
                int var2 = class21.field357.method657(true);
                if (var2 > 0 && class21.field357.method664(18897)) {
                    int var3 = var2 - class99.field1623;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class21.field357.method662(false, var3);
                } else {
                    class21.field357.method668(15);
                    class21.field357.method663(true);
                    class270.field4254 = null;
                    if (class244.field3917 == null) {
                        class220.field3599 = 0;
                    } else {
                        class220.field3599 = 2;
                    }
                    class226.field3741 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class21.field357.method668(15);
            class270.field4254 = null;
            class244.field3917 = null;
            class220.field3599 = 0;
            class226.field3741 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Loi;IIIIII)Loi;")
    public static final class80 method407(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field924++;
        long var7 = (long) arg3;
        class80 var9 = (class80) class115.field1903.method480(var7, arg1 + 25927);
        if (var9 == null) {
            class150 var10 = class150.method1058(class95.field1556, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1034(64, 768, -50, -10, -50);
            class115.field1903.method474(var7, (byte) 24, var9);
        }
        int var11 = arg0.method563();
        int var12 = arg0.method580();
        int var13 = arg0.method582();
        int var14 = arg0.method567();
        class80 var15 = var9.method572(true, true, true);
        if (arg6 != 0) {
            var15.method562(arg6);
        }
        class187 var16 = (class187) var15;
        if (arg5 != class225.method1583(arg2 + var13, arg4 + var11, class250.field3980, arg1 ^ arg1) || class225.method1583(arg2 + var14, arg4 - -var12, class250.field3980, 0) != arg5) {
            for (int var17 = 0; var17 < var16.field2961; var17++) {
                var16.field2984[var17] += class225.method1583(var16.field2972[var17] + arg2, var16.field2975[var17] + arg4, class250.field3980, 0) - arg5;
            }
            var16.field2970 = false;
        }
        return var15;
    }
}
