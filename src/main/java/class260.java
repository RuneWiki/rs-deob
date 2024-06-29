import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class260 extends class85 {

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "Lli;")
    public class18 field4338 = new class18();

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "Lcd;")
    public class65 field4346 = new class65();

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "Lhb;")
    private class280 field4325;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "[I")
    public static int[] field4337 = new int[200];

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "Lbd;")
    public static class162 field4341 = class17.method142(0, ":clan:");

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "Lbd;")
    private static class162 field4343 = class17.method142(0, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field4344 = 0;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "Z")
    public static boolean field4345 = false;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "Lbd;")
    public static class162 field4329 = field4343;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "Lvi;")
    public static class237 field4332;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "[I")
    public static int[] field4333;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "[Lad;")
    public static class171[] field4330;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 23)
    public static void method1793(int arg0) {
        field4343 = null;
        field4332 = null;
        field4329 = null;
        if (arg0 == -1) {
            field4333 = null;
            field4341 = null;
            field4337 = null;
            field4330 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()Lcb;", line = 39)
    public final class85 method452() {
        field4324++;
        class233 var1;
        do {
            var1 = (class233) this.field4338.method165((byte) -101);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3870 == null);
        return var1.field3870;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII[ILa;)V", line = 60)
    private final void method1794(int arg0, int arg1, int arg2, int arg3, int[] arg4, class233 arg5) {
        field4335++;
        if (~(this.field4325.field4733[arg5.field3890] & 0x4) != arg3 && arg5.field3892 < 0) {
            int var7 = this.field4325.field4775[arg5.field3890] / class306.field5146;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field3868) / var7;
                if (var8 > arg0) {
                    arg5.field3868 += arg0 * var7;
                    break;
                }
                arg0 -= var8;
                int var9 = 262144 / var7;
                arg5.field3870.method445(arg4, arg1, var8);
                class76 var10 = arg5.field3870;
                arg1 += var8;
                arg5.field3868 += var7 * var8 - 1048576;
                int var11 = class306.field5146 / 100;
                if (var9 < var11) {
                    var11 = var9;
                }
                if (this.field4325.field4758[arg5.field3890] == 0) {
                    arg5.field3870 = class76.method576(arg5.field3880, var10.method551(), var10.method558(), var10.method572());
                } else {
                    arg5.field3870 = class76.method576(arg5.field3880, var10.method551(), 0, var10.method572());
                    this.field4325.method1932(arg5.field3869.field5111[arg5.field3889] < 0, -128, arg5);
                    arg5.field3870.method549(var11, var10.method558());
                }
                if (arg5.field3869.field5111[arg5.field3889] < 0) {
                    arg5.field3870.method566(-1);
                }
                var10.method541(var11);
                var10.method445(arg4, arg1, arg2 - arg1);
                if (var10.method538()) {
                    this.field4346.method454(var10);
                }
            }
        }
        arg5.field3870.method445(arg4, arg1, arg0);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V", line = 136)
    public static final void method1795(int arg0, int arg1, int arg2) {
        if (class128.field2326 != arg1) {
            class280.field4762 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class280.field4762[var3] = (var3 << 12) / arg1;
            }
            class252.field4208 = arg1 - 1;
            class122.field2211 = arg1 == 64 ? 2048 : 4096;
            class128.field2326 = arg1;
        }
        if (class47.field749 != arg2) {
            if (class128.field2326 == arg2) {
                class53.field842 = class280.field4762;
            } else {
                class53.field842 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class53.field842[var4] = (var4 << 12) / arg2;
                }
            }
            class47.field749 = arg2;
            class60.field927 = arg2 - 1;
        }
        field4327++;
        if (arg0 != 8827) {
            method1793(-88);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V", line = 182)
    public static final void method1796(int arg0, int arg1) {
        field4342++;
        int var2 = -78 / ((arg0 + 64) / 40);
        if (class248.field4108 == null || class248.field4108.length < arg1) {
            class248.field4108 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "()Lcb;", line = 207)
    public final class85 method453() {
        class233 var1 = (class233) this.field4338.method169(-126);
        field4322++;
        if (var1 == null) {
            return null;
        } else if (var1.field3870 == null) {
            return this.method452();
        } else {
            return var1.field3870;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 223)
    public final void method455(int arg0) {
        this.field4346.method455(arg0);
        field4339++;
        for (class233 var2 = (class233) this.field4338.method169(-126); var2 != null; var2 = (class233) this.field4338.method165((byte) -101)) {
            if (!this.field4325.method1933(var2, -26)) {
                int var3 = arg0;
                do {
                    if (var2.field3885 >= var3) {
                        this.method1797(var3, 1048575, var2);
                        var2.field3885 -= var3;
                        break;
                    }
                    this.method1797(var2.field3885, 1048575, var2);
                    var3 -= var2.field3885;
                } while (!this.field4325.method1938(0, var3, (int[]) null, var2, 0));
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lhb;)V", line = 377)
    public class260(class280 arg0) {
        this.field4325 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([III)V", line = 278)
    public final void method445(int[] arg0, int arg1, int arg2) {
        field4336++;
        this.field4346.method445(arg0, arg1, arg2);
        for (class233 var4 = (class233) this.field4338.method169(12); var4 != null; var4 = (class233) this.field4338.method165((byte) -101)) {
            if (!this.field4325.method1933(var4, -77)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3885) {
                        this.method1794(var6, var5, var5 + var6, -1, arg0, var4);
                        var4.field3885 -= var6;
                        break;
                    }
                    this.method1794(var4.field3885, var5, var5 + var6, -1, arg0, var4);
                    var6 -= var4.field3885;
                    var5 += var4.field3885;
                } while (!this.field4325.method1938(var5, var6, arg0, var4, 0));
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILa;)V", line = 319)
    private final void method1797(int arg0, int arg1, class233 arg2) {
        if ((this.field4325.field4733[arg2.field3890] & 0x4) != 0 && arg2.field3892 < 0) {
            int var4 = this.field4325.field4775[arg2.field3890] / class306.field5146;
            int var5 = (var4 + 1048575 - arg2.field3868) / var4;
            arg2.field3868 = arg2.field3868 + (arg0 * var4) & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field4325.field4758[arg2.field3890] == 0) {
                    arg2.field3870 = class76.method576(arg2.field3880, arg2.field3870.method551(), arg2.field3870.method558(), arg2.field3870.method572());
                } else {
                    arg2.field3870 = class76.method576(arg2.field3880, arg2.field3870.method551(), 0, arg2.field3870.method572());
                    this.field4325.method1932(arg2.field3869.field5111[arg2.field3889] < 0, 47, arg2);
                }
                if (arg2.field3869.field5111[arg2.field3889] < 0) {
                    arg2.field3870.method566(-1);
                }
                arg0 = arg2.field3868 / var4;
            }
        }
        arg2.field3870.method455(arg0);
        field4331++;
        if (arg1 != 1048575) {
            this.method453();
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "()I", line = 358)
    public final int method447() {
        field4334++;
        return 0;
    }
}
