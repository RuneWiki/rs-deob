import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class12 {

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    private int field122 = 0;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lvd;")
    private class4 field118;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field117 = 0;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field124 = 0;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Ljg;")
    private class171 field116;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Ljg;")
    public final class171 method72(byte arg0) {
        this.field122 = 0;
        field123++;
        if (arg0 > -46) {
            this.field118 = null;
        }
        return this.method75(-1);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static final void method73(int arg0) {
        field120++;
        if (arg0 >= -11) {
            field124 = 97;
        }
        for (class199 var1 = (class199) class256.field3914.method990(-92); var1 != null; var1 = (class199) class256.field3914.method993(-75)) {
            class246 var2 = var1.field2777;
            if (class295.field4642 != var2.field3755 || var2.field3753) {
                var1.method1115(-124);
            } else if (var2.field3759 <= class52.field740) {
                var2.method1655(class225.field3409, (byte) 109);
                if (var2.field3753) {
                    var1.method1115(15);
                } else {
                    class254.method1694(var2.field3755, var2.field3771, var2.field3770, var2.field3777, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field119++;
        int var8 = arg1 + arg2;
        for (int var9 = arg2; var9 < var8; var9++) {
            class154.method1028(-353, class216.field3264[var9], arg0, arg7, arg4);
        }
        if (arg6) {
            method73(-127);
        }
        int var10 = arg4 - arg1;
        int var11 = arg5 - arg1;
        for (int var12 = arg5; var12 > var11; var12--) {
            class154.method1028(-353, class216.field3264[var12], arg0, arg7, arg4);
        }
        int var13 = arg7 + arg1;
        for (int var14 = var8; var14 <= var11; var14++) {
            int[] var15 = class216.field3264[var14];
            class154.method1028(-353, var15, arg0, arg7, var13);
            class154.method1028(-353, var15, arg3, var13, var10);
            class154.method1028(-353, var15, arg0, var10, arg4);
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lvd;)V")
    public class12(class4 arg0) {
        this.field118 = arg0;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)Ljg;")
    public final class171 method75(int arg0) {
        if (arg0 != -1) {
            method74(-90, 88, -6, 69, -111, 97, true, 87);
        }
        field115++;
        if (this.field122 > 0 && this.field118.field20[this.field122 - 1] != this.field116) {
            class171 var2 = this.field116;
            this.field116 = var2.field2378;
            return var2;
        }
        while (this.field118.field29 > this.field122) {
            class171 var3 = this.field118.field20[this.field122++].field2378;
            if (this.field118.field20[this.field122 - 1] != var3) {
                this.field116 = var3.field2378;
                return var3;
            }
        }
        return null;
    }
}
