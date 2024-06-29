import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class263 extends class1 {

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "Lub;")
    public class88 field4494 = new class88();

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "Lng;")
    public class75 field4504 = new class75();

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "Llh;")
    private class274 field4497;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "[I")
    public static int[] field4498 = new int[32768];

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Lw;")
    public static class141 field4492;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)V")
    public final void method6(int arg0) {
        field4502++;
        this.field4504.method6(arg0);
        for (class269 var2 = (class269) this.field4494.method673(false); var2 != null; var2 = (class269) this.field4494.method680(45)) {
            if (!this.field4497.method1850(var2, -1)) {
                int var3 = arg0;
                do {
                    if (var2.field4587 >= var3) {
                        this.method1762(var3, false, var2);
                        var2.field4587 -= var3;
                        break;
                    }
                    this.method1762(var2.field4587, false, var2);
                    var3 -= var2.field4587;
                } while (!this.field4497.method1845((int[]) null, var2, var3, 128, 0));
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "()Lwf;")
    public final class1 method5() {
        field4499++;
        class269 var1;
        do {
            var1 = (class269) this.field4494.method680(114);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4604 == null);
        return var1.field4604;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZLrf;)V")
    private final void method1762(int arg0, boolean arg1, class269 arg2) {
        if ((this.field4497.field4759[arg2.field4595] & 0x4) != 0 && arg2.field4588 < 0) {
            int var4 = this.field4497.field4781[arg2.field4595] / class255.field4372;
            int var5 = (var4 + 1048575 - arg2.field4598) / var4;
            arg2.field4598 = arg0 * var4 + arg2.field4598 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field4497.field4800[arg2.field4595] == 0) {
                    arg2.field4604 = class2.method43(arg2.field4584, arg2.field4604.method22(), arg2.field4604.method13(), arg2.field4604.method30());
                } else {
                    arg2.field4604 = class2.method43(arg2.field4584, arg2.field4604.method22(), 0, arg2.field4604.method30());
                    this.field4497.method1849(arg2.field4612.field3909[arg2.field4603] < 0, arg2, 0);
                }
                if (arg2.field4612.field3909[arg2.field4603] < 0) {
                    arg2.field4604.method39(-1);
                }
                arg0 = arg2.field4598 / var4;
            }
        }
        arg2.field4604.method6(arg0);
        if (!arg1) {
            field4501++;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static void method1763(byte arg0) {
        if (arg0 <= 100) {
            field4498 = null;
        }
        field4498 = null;
        field4492 = null;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "([III)V")
    public final void method7(int[] arg0, int arg1, int arg2) {
        field4503++;
        this.field4504.method7(arg0, arg1, arg2);
        for (class269 var4 = (class269) this.field4494.method673(false); var4 != null; var4 = (class269) this.field4494.method680(100)) {
            if (!this.field4497.method1850(var4, -1)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field4587) {
                        this.method1764(var5, var5 + var6, var6, var4, -9504, arg0);
                        var4.field4587 -= var5;
                        break;
                    }
                    this.method1764(var4.field4587, var5 + var6, var6, var4, -9504, arg0);
                    var6 += var4.field4587;
                    var5 -= var4.field4587;
                } while (!this.field4497.method1845(arg0, var4, var5, 128, var6));
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "()I")
    public final int method2() {
        field4500++;
        return 0;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "()Lwf;")
    public final class1 method3() {
        field4496++;
        class269 var1 = (class269) this.field4494.method673(false);
        if (var1 == null) {
            return null;
        } else if (var1.field4604 == null) {
            return this.method5();
        } else {
            return var1.field4604;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Llh;)V")
    public class263(class274 arg0) {
        this.field4497 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIILrf;I[I)V")
    private final void method1764(int arg0, int arg1, int arg2, class269 arg3, int arg4, int[] arg5) {
        if ((this.field4497.field4759[arg3.field4595] & 0x4) != 0 && arg3.field4588 < 0) {
            int var7 = this.field4497.field4781[arg3.field4595] / class255.field4372;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field4598) / var7;
                if (arg0 < var8) {
                    arg3.field4598 += arg0 * var7;
                    break;
                }
                arg3.field4604.method7(arg5, arg2, var8);
                arg0 -= var8;
                arg2 += var8;
                int var9 = 262144 / var7;
                int var10 = class255.field4372 / 100;
                if (var10 > var9) {
                    var10 = var9;
                }
                arg3.field4598 += var7 * var8 - 1048576;
                class2 var11 = arg3.field4604;
                if (this.field4497.field4800[arg3.field4595] == 0) {
                    arg3.field4604 = class2.method43(arg3.field4584, var11.method22(), var11.method13(), var11.method30());
                } else {
                    arg3.field4604 = class2.method43(arg3.field4584, var11.method22(), 0, var11.method30());
                    this.field4497.method1849(arg3.field4612.field3909[arg3.field4603] < 0, arg3, 0);
                    arg3.field4604.method25(var10, var11.method13());
                }
                if (arg3.field4612.field3909[arg3.field4603] < 0) {
                    arg3.field4604.method39(-1);
                }
                var11.method41(var10);
                var11.method7(arg5, arg2, arg1 - arg2);
                if (var11.method32()) {
                    this.field4504.method586(var11);
                }
            }
        }
        field4493++;
        arg3.field4604.method7(arg5, arg2, arg0);
        if (arg4 != -9504) {
            this.method7((int[]) null, -72, -1);
        }
    }
}
