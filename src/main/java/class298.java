import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class298 extends class147 {

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "Z")
    public boolean field4449;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "[Laa;")
    public class298[] field4441;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "Z")
    public static boolean field4444 = false;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "Lve;")
    public static class331 field4455 = new class331(5000);

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "Lsd;")
    public static class74 field4456 = new class74(42, 14);

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "Lsd;")
    public static class74 field4458 = new class74(58, -1);

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public int field4447;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "Lbj;")
    public class273 field4454;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Lms;")
    public class487 field4443;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "[I")
    public static int[] field4460;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "[Lrg;")
    public static class395[] field4459;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)I")
    public int method1877(byte arg0) {
        if (arg0 >= -96) {
            return 53;
        } else {
            field4450++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)[I")
    public int[] method13(int arg0, boolean arg1) {
        if (arg1) {
            field4448++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I")
    public int[][] method157(int arg0, int arg1) {
        field4452++;
        if (arg0 != -24032) {
            this.method545((byte) -50);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)[[I")
    public final int[][] method1878(int arg0, int arg1, int arg2) {
        if (arg2 <= 59) {
            method1879(false);
        }
        field4453++;
        if (this.field4441[arg0].field4449) {
            int[] var4 = this.field4441[arg0].method13(arg1, true);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4441[arg0].method157(-24032, arg1);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
    public static void method1879(boolean arg0) {
        if (!arg0) {
            return;
        }
        field4456 = null;
        field4460 = null;
        field4458 = null;
        field4455 = null;
        field4459 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILhg;IILab;IBILoj;)V")
    public static final void method1880(int arg0, class313 arg1, int arg2, int arg3, class256 arg4, int arg5, byte arg6, int arg7, class280 arg8) {
        field4457++;
        int var9 = -125 / ((75 - arg6) / 33);
        class334 var10 = class47.field611.method1898(36, arg3);
        if (var10 == null || !var10.field4819 || !var10.method2026(2, class75.field909)) {
            return;
        }
        if (var10.field4782 != null) {
            int[] var11 = new int[var10.field4782.length];
            for (int var12 = 0; var12 < (var11.length / 2); var12++) {
                int var14;
                if (class358.field5167 == 4) {
                    var14 = (int) class349.field5021 & 0x3FFF;
                } else {
                    var14 = (int) class349.field5021 + class367.field5251 & 0x3FFF;
                }
                int var15 = class16.field212[var14];
                int var16 = class16.field214[var14];
                if (class358.field5167 != 4) {
                    var15 = var15 * 256 / (class415.field6000 + 256);
                    var16 = var16 * 256 / (class415.field6000 + 256);
                }
                var11[var12 * 2] = arg4.field3597 / 2 + ((var10.field4782[var12 * 2 + 1] * 4 + arg0) * var15 + ((var10.field4782[var12 * 2] * 4 + arg5) * var16) >> 15) + arg7;
                var11[var12 * 2 + 1] = arg4.field3707 / 2 + arg2 - ((var10.field4782[var12 * 2 + 1] * 4 + arg0) * var16 - (var10.field4782[var12 * 2] * 4 + arg5) * var15 >> 15);
            }
            class70.method357(arg8, var11, var10.field4785, arg4.field3573, arg4.field3634);
            for (int var13 = 0; var13 < (var11.length / 2 - 1); var13++) {
                arg8.method1447(var11[var13 * 2], var11[var13 * 2 + 1], var11[(var13 + 1) * 2], var11[(var13 + 1) * 2 + 1], var10.field4783, 1, arg1, arg7, arg2);
            }
            arg8.method1447(var11[var11.length - 2], var11[var11.length - 1], var11[0], var11[1], var10.field4783, 1, arg1, arg7, arg2);
        }
        class395 var17 = null;
        if (var10.field4809 != -1) {
            var17 = var10.method2025(arg8, 29784, false);
            if (var17 != null) {
                class18.method120(arg5, arg1, arg0, (byte) -63, arg7, var17, arg2, arg4);
            }
        }
        if (var10.field4822 == null) {
            return;
        }
        int var18 = 0;
        if (var17 != null) {
            var18 = var17.method223();
        }
        class206 var19 = class304.field4500;
        class406 var20 = class56.field715;
        if (var10.field4808 == 1) {
            var19 = class273.field3875;
            var20 = class451.field6384;
        }
        if (var10.field4808 == 2) {
            var19 = class101.field1230;
            var20 = class453.field6394;
        }
        class247.method1503(var18, arg4, arg0, var19, var10.field4822, arg7, var10.field4778, (byte) 21, arg1, arg2, var20, arg5);
        return;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILvt;)V")
    public void method10(int arg0, int arg1, class179 arg2) {
        if (arg0 <= -44) {
            field4439++;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(Z)V")
    public void method548(boolean arg0) {
        field4451++;
        if (this.field4449) {
            this.field4443.method2879((byte) 78);
            this.field4443 = null;
        } else {
            this.field4454.method1640((byte) 121);
            this.field4454 = null;
        }
        if (!arg0) {
            field4460 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)I")
    public int method545(byte arg0) {
        field4440++;
        int var2 = -102 % ((62 - arg0) / 32);
        return -1;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IZ)V")
    public class298(int arg0, boolean arg1) {
        this.field4449 = arg1;
        this.field4441 = new class298[arg0];
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public void method15(int arg0) {
        if (arg0 <= -41) {
            field4442++;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)V")
    public void method1881(int arg0, int arg1, int arg2) {
        field4445++;
        int var4 = this.field4447 == 255 ? arg1 : this.field4447;
        int var5 = -48 / ((arg0 + 22) / 40);
        if (this.field4449) {
            this.field4443 = new class487(var4, arg1, arg2);
        } else {
            this.field4454 = new class273(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(III)[I")
    public final int[] method1882(int arg0, int arg1, int arg2) {
        if (arg1 != -2594) {
            field4460 = null;
        }
        field4446++;
        return this.field4441[arg0].field4449 ? this.field4441[arg0].method13(arg2, true) : this.field4441[arg0].method157(-24032, arg2)[0];
    }
}
