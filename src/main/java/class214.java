import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class214 extends class105 {

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "Lgk;")
    public class157 field3785 = new class157();

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "Lcj;")
    public class117 field3799 = new class117();

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "Lng;")
    private class76 field3796;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Lid;")
    public static class149 field3795 = class60.method382(")4p=", (byte) 108);

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public static int field3792 = 0;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field3797 = 0;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "Lal;")
    public static class230 field3798;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "([III)V")
    public final void method569(int[] arg0, int arg1, int arg2) {
        this.field3799.method569(arg0, arg1, arg2);
        field3783++;
        for (class197 var4 = (class197) this.field3785.method1140(0); var4 != null; var4 = (class197) this.field3785.method1127(0)) {
            if (!this.field3796.method568(-71, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field3574) {
                        this.method1451(var4, var6 + var5, var5, arg0, (byte) 117, var6);
                        var4.field3574 -= var5;
                        break;
                    }
                    this.method1451(var4, var5 + var6, var4.field3574, arg0, (byte) 105, var6);
                    var5 -= var4.field3574;
                    var6 += var4.field3574;
                } while (!this.field3796.method578(arg0, var4, var5, (byte) 120, var6));
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "()I")
    public final int method565() {
        field3790++;
        return 0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lal;B)V")
    public static final void method1448(class230 arg0, byte arg1) {
        field3786++;
        if (class136.field2503 || arg1 != -62) {
            return;
        }
        class72.method448();
        class86.field1574 = class49.method317(class182.field3278, (byte) 113, arg0);
        int var2 = class240.field4197;
        int var3 = var2 * 956 / 503;
        class86.field1574.method280((class218.field3851 - var3) / 2, 0, var3, var2);
        class251.field4408 = class119.method820(class185.field3338, arg0, 106);
        class251.field4408.method1353(class218.field3851 / 2 - (class251.field4408.field3598 / 2), 18);
        class136.field2503 = true;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()Ljj;")
    public final class105 method573() {
        field3787++;
        class197 var1;
        do {
            var1 = (class197) this.field3785.method1127(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3560 == null);
        return var1.field3560;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILt;I)V")
    private final void method1449(int arg0, class197 arg1, int arg2) {
        if (arg2 != 19695) {
            field3798 = null;
        }
        if ((this.field3796.field1414[arg1.field3575] & 0x4) != 0 && arg1.field3569 < 0) {
            int var4 = this.field3796.field1384[arg1.field3575] / class113.field1937;
            int var5 = (var4 + 1048575 - arg1.field3554) / var4;
            arg1.field3554 = arg0 * var4 + arg1.field3554 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field3796.field1423[arg1.field3575] == 0) {
                    arg1.field3560 = class238.method1636(arg1.field3582, arg1.field3560.method1645(), arg1.field3560.method1634(), arg1.field3560.method1643());
                } else {
                    arg1.field3560 = class238.method1636(arg1.field3582, arg1.field3560.method1645(), 0, arg1.field3560.method1643());
                    this.field3796.method564(arg1.field3572.field3275[arg1.field3579] < 0, arg1, arg2 ^ 0xFFFFB310);
                }
                if (arg1.field3572.field3275[arg1.field3579] < 0) {
                    arg1.field3560.method1606(-1);
                }
                arg0 = arg1.field3554 / var4;
            }
        }
        arg1.field3560.method561(arg0);
        field3782++;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
    public static void method1450(byte arg0) {
        field3798 = null;
        field3795 = null;
        if (arg0 > -102) {
            field3792 = 109;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public final void method561(int arg0) {
        field3794++;
        this.field3799.method561(arg0);
        for (class197 var2 = (class197) this.field3785.method1140(0); var2 != null; var2 = (class197) this.field3785.method1127(0)) {
            if (!this.field3796.method568(-15, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3574) {
                        this.method1449(var3, var2, 19695);
                        var2.field3574 -= var3;
                        break;
                    }
                    this.method1449(var2.field3574, var2, 19695);
                    var3 -= var2.field3574;
                } while (!this.field3796.method578((int[]) null, var2, var3, (byte) 9, 0));
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lt;II[IBI)V")
    private final void method1451(class197 arg0, int arg1, int arg2, int[] arg3, byte arg4, int arg5) {
        if (arg4 <= 90) {
            return;
        }
        field3793++;
        if ((this.field3796.field1414[arg0.field3575] & 0x4) != 0 && arg0.field3569 < 0) {
            int var7 = this.field3796.field1384[arg0.field3575] / class113.field1937;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field3554) / var7;
                if (arg2 < var8) {
                    arg0.field3554 += arg2 * var7;
                    break;
                }
                arg0.field3560.method569(arg3, arg5, var8);
                int var9 = class113.field1937 / 100;
                int var10 = 262144 / var7;
                arg5 += var8;
                arg2 -= var8;
                class238 var11 = arg0.field3560;
                arg0.field3554 += var7 * var8 - 1048576;
                if (var10 < var9) {
                    var9 = var10;
                }
                if (this.field3796.field1423[arg0.field3575] == 0) {
                    arg0.field3560 = class238.method1636(arg0.field3582, var11.method1645(), var11.method1634(), var11.method1643());
                } else {
                    arg0.field3560 = class238.method1636(arg0.field3582, var11.method1645(), 0, var11.method1643());
                    this.field3796.method564(arg0.field3572.field3275[arg0.field3579] < 0, arg0, -1);
                    arg0.field3560.method1617(var9, var11.method1634());
                }
                if (arg0.field3572.field3275[arg0.field3579] < 0) {
                    arg0.field3560.method1606(-1);
                }
                var11.method1612(var9);
                var11.method569(arg3, arg5, arg1 - arg5);
                if (var11.method1633()) {
                    this.field3799.method813(var11);
                }
            }
        }
        arg0.field3560.method569(arg3, arg5, arg2);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIII)V")
    public static final void method1452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3791++;
        int var6 = 0;
        int var7 = arg5 * arg5;
        int var8 = arg0 * arg0;
        int var9 = arg0;
        int var10 = var8 << 1;
        int var11 = arg0 << 1;
        int var12 = (1 - var11) * var7 + var10;
        int var13 = var7 << 1;
        int var14 = var8 - (var11 - 1) * var13;
        int var15 = var8 << 2;
        int var16 = var7 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        if (arg4 >= -36) {
            method1453((byte) -56, (String) null);
        }
        int var18 = (arg0 - 1) * var16;
        if (class224.field3940 <= arg1 && class94.field1655 >= arg1) {
            int var19 = class47.method303(arg2 + arg5, class192.field3449, class257.field4496, 65535);
            int var20 = class47.method303(arg2 - arg5, class192.field3449, class257.field4496, 65535);
            class141.method987(2, var20, class15.field220[arg1], var19, arg3);
        }
        int var21 = ((arg0 << 1) - 3) * var13;
        int var22 = (var6 + 1) * var15;
        while (var9 > 0) {
            if (var12 < 0) {
                while (var12 < 0) {
                    var6++;
                    var14 += var22;
                    var12 += var17;
                    var22 += var15;
                    var17 += var15;
                }
            }
            if (var14 < 0) {
                var12 += var17;
                var14 += var22;
                var6++;
                var17 += var15;
                var22 += var15;
            }
            var9--;
            var14 += -var21;
            var21 -= var16;
            int var23 = arg1 + var9;
            var12 += -var18;
            int var24 = arg1 - var9;
            if (class224.field3940 <= var23 && class94.field1655 >= var24) {
                int var25 = class47.method303(arg2 + var6, class192.field3449, class257.field4496, 65535);
                int var26 = class47.method303(arg2 - var6, class192.field3449, class257.field4496, 65535);
                if (class224.field3940 <= var24) {
                    class141.method987(2, var26, class15.field220[var24], var25, arg3);
                }
                if (var23 <= class94.field1655) {
                    class141.method987(2, var26, class15.field220[var23], var25, arg3);
                }
            }
            var18 -= var16;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1453(byte arg0, String arg1) {
        field3800++;
        if (arg0 != 79) {
            field3792 = 77;
        }
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()Ljj;")
    public final class105 method556() {
        field3789++;
        class197 var1 = (class197) this.field3785.method1140(0);
        if (var1 == null) {
            return null;
        } else if (var1.field3560 == null) {
            return this.method573();
        } else {
            return var1.field3560;
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lng;)V")
    public class214(class76 arg0) {
        this.field3796 = arg0;
    }
}
