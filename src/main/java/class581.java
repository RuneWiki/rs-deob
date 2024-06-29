import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class581 {

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public int field8184;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public int field8183;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public int field8187;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public int field8185;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public static int field8188 = -1;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!go", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field8189++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lvda;Lr;ILwp;)V", line = 11)
    public static final void method3313(class165 arg0, class166 arg1, int arg2, class163 arg3) {
        field8186++;
        class702 var4 = arg0.method1155(88, arg1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1658();
        if (var5 < var4.method1653()) {
            var5 = var4.method1653();
        }
        byte var6 = 10;
        int var7 = arg3.field2339;
        int var8 = arg3.field2341;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field2406 != null) {
            var9 = class166.field2419.method1739(null, null, class442.field6114, arg0.field2406, false);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class442.field6114[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class363.field4779.method1381(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class363.field4779.method1384() * var9 + class363.field4779.method1382() / 2;
        }
        int var15 = arg3.field2339 + (var5 / arg2);
        if (var7 < (class510.field6996 + var5)) {
            var7 = class510.field6996;
            var15 = var5 / 2 + var6 + var10 / 2 + class510.field6996 + 5;
        } else if (var7 > class510.field6994 - var5) {
            var7 = class510.field6994 - var5;
            var15 = class510.field6994 - (var5 / 2) - (var6 - -(var10 / 2)) - 5;
        }
        int var16 = arg3.field2341;
        if ((class510.field6999 + var5) > var8) {
            var8 = class510.field6999;
            var16 = var5 / 2 + class510.field6999 + var6;
        } else if (class510.field7014 - var5 < var8) {
            var8 = class510.field7014 - var5;
            var16 = class510.field7014 - (var5 / 2) - var6 - var11;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg3.field2339), (double) (var8 - arg3.field2341)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method3929((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0.field2406 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2 + 5);
            var21 = var9 * class363.field4779.method1384() + var16 + 3;
            var20 = var10 + var18 + 10;
            if (arg0.field2371 != 0) {
                arg1.method1170(arg0.field2371, var21 - var16, var18, var20 - var18, var16, -28207);
            }
            if (arg0.field2402 != 0) {
                arg1.method1166(var16, arg2 - 1, arg0.field2402, var18, var20 - var18, -var16 + var21);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class442.field6114[var22];
                if (var9 - 1 > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class363.field4779.method1385(arg1, var23, var15, var16, arg0.field2373, true);
                var16 += class363.field4779.method1384();
            }
        }
        if (arg0.field2405 == -1 && arg0.field2406 == null) {
            return;
        }
        class69 var24 = new class69(arg3);
        int var25 = var5 >> 1;
        var24.field935 = var21;
        var24.field936 = var7 - var25;
        var24.field941 = var20;
        var24.field934 = var7 + var25;
        var24.field930 = var18;
        var24.field939 = var8 + var25;
        var24.field937 = var19;
        var24.field931 = var8 - var25;
        class40.field470.method1441(var24, arg2 - 2);
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIII)V", line = 163)
    public class581(int arg0, int arg1, int arg2, int arg3) {
        this.field8184 = arg0;
        this.field8183 = arg2;
        this.field8187 = arg1;
        this.field8185 = arg3;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZZI)V", line = 174)
    public static final void method3314(boolean arg0, boolean arg1, int arg2) {
        field8181++;
        if (arg2 <= 111) {
            field8188 = -64;
        }
        if (arg1) {
            class457.field6344++;
            class539.method3049(1);
        }
        if (arg0) {
            class392.field5548++;
            class698.method3913(91);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V", line = 197)
    public static final void method3315(byte arg0) {
        field8182++;
        int var1 = -54 / ((-arg0 - 34) / 49);
        int var2 = class528.field7160;
        int[] var3 = class439.field6091;
        for (int var4 = 0; var4 < var2; var4++) {
            class677 var5 = class671.field9407[var3[var4]];
            if (var5 != null) {
                class500.method2809(var5.method881(-127), (byte) -98, var5);
            }
        }
    }
}
