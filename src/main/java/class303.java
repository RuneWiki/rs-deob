import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public abstract class class303 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lrg;")
    public static class88 field5190;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lme;IIIII)V", line = 13)
    public static final void method2111(class177 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class295.field5061 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class29.field449) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class315.field5347 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class249 var14 = class118.field1984[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class106.field1783[var11][var12 + 1][var13] + class106.field1783[var11][var12][var13] + class106.field1783[var11][var12][var13 + 1] + class106.field1783[var11][var12 + 1][var13 + 1]) / 4 - (class106.field1783[arg1][arg2 + 1][arg3] + class106.field1783[arg1][arg2][arg3] + class106.field1783[arg1][arg2][arg3 + 1] + class106.field1783[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class216 var16 = var14.field4192;
                                    if (var16 != null) {
                                        if (var16.field3663.method1264()) {
                                            arg0.method1261(var16.field3663, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3668 != null && var16.field3668.method1264()) {
                                            arg0.method1261(var16.field3668, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field4188; var17++) {
                                        class250 var18 = var14.field4182[var17];
                                        if (var18 != null && var18.field4215.method1264() && (var18.field4212 == var12 || var7 == var12) && (var18.field4216 == var13 || var9 == var13)) {
                                            int var19 = var18.field4207 + 1 - var18.field4212;
                                            int var20 = var18.field4208 + 1 - var18.field4216;
                                            arg0.method1261(var18.field4215, (var18.field4212 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4216 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Lwf;", line = 117)
    public static final class53 method2112(int arg0, int arg1, int arg2) {
        if (arg0 != -1155040160) {
            method2111((class177) null, 26, 60, -117, -25, 75);
        }
        field5193++;
        class53 var3 = (class53) class203.field3498.method280((long) arg1 | (long) arg2 << 32, arg0 ^ 0xBB270D81);
        if (var3 == null) {
            var3 = new class53(arg2, arg1);
            class203.field3498.method284(true, var3.field3568, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V", line = 139)
    public static final void method2113(int arg0, boolean arg1) {
        if (arg1) {
            method2114(-71);
        }
        class53 var2 = method2112(-1155040160, arg0, 8);
        field5192++;
        var2.method326(-115);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 157)
    public static void method2114(int arg0) {
        field5190 = null;
        if (arg0 != -1155040160) {
            field5190 = (class88) null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public abstract void method56(byte arg0);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)I")
    public abstract int method57(int arg0, int arg1, int arg2);
}
