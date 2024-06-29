import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class234 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Z")
    public static boolean field4202 = false;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lli;")
    private static class185 field4206 = class245.method1649("Loading fonts )2 ", -44);

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lli;")
    public static class185 field4205 = field4206;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lmh;")
    public static class114 field4203;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Lp;")
    public static class82 field4204;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1597(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        int var8 = -82 / ((arg4 + 20) / 45);
        field4209++;
        int var9 = class42.method260(class113.field2040, class216.field3964, (byte) 98, arg5);
        int var10 = class42.method260(class113.field2040, class216.field3964, (byte) 98, arg0);
        int var11 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg1);
        int var12 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg6);
        int var13 = class42.method260(class113.field2040, class216.field3964, (byte) 98, arg2 + arg5);
        int var14 = class42.method260(class113.field2040, class216.field3964, (byte) 98, arg0 - arg2);
        for (int var15 = var9; var15 < var13; var15++) {
            class157.method1116(arg7, var11, var12, class145.field2757[var15], -113);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class157.method1116(arg7, var11, var12, class145.field2757[var16], -118);
        }
        int var17 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg1 + arg2);
        int var18 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg6 - arg2);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class145.field2757[var19];
            class157.method1116(arg7, var11, var17, var20, -26);
            class157.method1116(arg3, var17, var18, var20, -101);
            class157.method1116(arg7, var18, var12, var20, -59);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
    public static final void method1598(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4208++;
        class174 var5 = class249.method1671(8, arg2, (byte) -88);
        var5.method1233(0);
        var5.field3186 = arg0;
        var5.field3190 = arg3;
        if (arg4 != 9463) {
            method1599(-37);
        }
        var5.field3196 = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method1599(int arg0) {
        field4203 = null;
        field4205 = null;
        if (arg0 == 8) {
            field4204 = null;
            field4206 = null;
        }
    }
}
