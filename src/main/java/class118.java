import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mf")
public class class118 extends class97 {

    @OriginalMember(owner = "mf", name = "w", descriptor = "Ltf;")
    public class181 field2324 = new class181();

    @OriginalMember(owner = "mf", name = "H", descriptor = "Lt;")
    public class175 field2335 = new class175();

    @OriginalMember(owner = "mf", name = "r", descriptor = "Lsh;")
    private class174 field2319;

    @OriginalMember(owner = "mf", name = "t", descriptor = "[Lkf;")
    public static class100[] field2321 = new class100[1000];

    @OriginalMember(owner = "mf", name = "y", descriptor = "J")
    public static long field2326 = 0L;

    @OriginalMember(owner = "mf", name = "s", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "mf", name = "u", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "mf", name = "v", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "mf", name = "x", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "mf", name = "z", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "mf", name = "B", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "mf", name = "C", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "mf", name = "D", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "mf", name = "E", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "mf", name = "G", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "mf", name = "F", descriptor = "Lib;")
    public static class80 field2333;

    @OriginalMember(owner = "mf", name = "A", descriptor = "Lja;")
    public static class86 field2328;

    @OriginalMember(owner = "mf", name = "d", descriptor = "()I")
    public final int method650() {
        field2320++;
        return 0;
    }

    @OriginalMember(owner = "mf", name = "a", descriptor = "(BILvf;)V")
    private final void method860(byte arg0, int arg1, class199 arg2) {
        field2332++;
        if ((this.field2319.field3285[arg2.field3808] & 0x4) != 0 && arg2.field3782 < 0) {
            int var4 = this.field2319.field3266[arg2.field3808] / class23.field519;
            int var5 = (var4 + 1048575 - arg2.field3802) / var4;
            arg2.field3802 = arg1 * var4 + arg2.field3802 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field2319.field3240[arg2.field3808] == 0) {
                    arg2.field3792 = class87.method625(arg2.field3799, arg2.field3792.method607(), arg2.field3792.method635(), arg2.field3792.method631());
                } else {
                    arg2.field3792 = class87.method625(arg2.field3799, arg2.field3792.method607(), 0, arg2.field3792.method631());
                    this.field2319.method1173(arg2, arg2.field3805.field2254[arg2.field3813] < 0, -4123);
                }
                if (arg2.field3805.field2254[arg2.field3813] < 0) {
                    arg2.field3792.method609(-1);
                }
                arg1 = arg2.field3802 / var4;
            }
        }
        if (arg0 <= 56) {
            this.field2335 = null;
        }
        arg2.field3792.method622(arg1);
    }

    @OriginalMember(owner = "mf", name = "c", descriptor = "()Lkc;")
    public final class97 method630() {
        field2325++;
        class199 var1;
        do {
            var1 = (class199) this.field2324.method1234(-1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3792 == null);
        return var1.field3792;
    }

    @OriginalMember(owner = "mf", name = "a", descriptor = "(I[ILvf;III)V")
    private final void method861(int arg0, int[] arg1, class199 arg2, int arg3, int arg4, int arg5) {
        if ((this.field2319.field3285[arg2.field3808] & 0x4) != 0 && arg2.field3782 < 0) {
            int var7 = this.field2319.field3266[arg2.field3808] / class23.field519;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field3802) / var7;
                if (var8 > arg0) {
                    arg2.field3802 += arg0 * var7;
                    break;
                }
                arg2.field3792.method620(arg1, arg3, var8);
                int var9 = class23.field519 / 100;
                arg0 -= var8;
                class87 var10 = arg2.field3792;
                arg2.field3802 += var7 * var8 - 1048576;
                int var11 = 262144 / var7;
                arg3 += var8;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field2319.field3240[arg2.field3808] == 0) {
                    arg2.field3792 = class87.method625(arg2.field3799, var10.method607(), var10.method635(), var10.method631());
                } else {
                    arg2.field3792 = class87.method625(arg2.field3799, var10.method607(), 0, var10.method631());
                    this.field2319.method1173(arg2, arg2.field3805.field2254[arg2.field3813] < 0, -4123);
                    arg2.field3792.method616(var9, var10.method635());
                }
                if (arg2.field3805.field2254[arg2.field3813] < 0) {
                    arg2.field3792.method609(-1);
                }
                var10.method647(var9);
                var10.method620(arg1, arg3, arg5 - arg3);
                if (var10.method624()) {
                    this.field2335.method1196(var10);
                }
            }
        }
        field2329++;
        arg2.field3792.method620(arg1, arg3, arg0);
        if (arg4 != 813) {
            this.field2335 = null;
        }
    }

    @OriginalMember(owner = "mf", name = "b", descriptor = "(I)V")
    public static void method862(int arg0) {
        if (arg0 != -1) {
            field2330 = 77;
        }
        field2328 = null;
        field2333 = null;
        field2321 = null;
    }

    @OriginalMember(owner = "mf", name = "b", descriptor = "()Lkc;")
    public final class97 method613() {
        field2334++;
        class199 var1 = (class199) this.field2324.method1230(51);
        if (var1 == null) {
            return null;
        } else if (var1.field3792 == null) {
            return this.method630();
        } else {
            return var1.field3792;
        }
    }

    @OriginalMember(owner = "mf", name = "a", descriptor = "(I)V")
    public final void method622(int arg0) {
        this.field2335.method622(arg0);
        field2331++;
        for (class199 var2 = (class199) this.field2324.method1230(126); var2 != null; var2 = (class199) this.field2324.method1234(-1)) {
            if (!this.field2319.method1194((byte) 117, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3810) {
                        this.method860((byte) 81, var3, var2);
                        var2.field3810 -= var3;
                        break;
                    }
                    this.method860((byte) 108, var2.field3810, var2);
                    var3 -= var2.field3810;
                } while (!this.field2319.method1178(0, null, var3, var2, 103));
            }
        }
    }

    @OriginalMember(owner = "mf", name = "a", descriptor = "(III)I")
    public static final int method863(int arg0, int arg1, int arg2) {
        field2327++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg1 == -14538 ? (arg2 & 0xFF80) + var3 : -76;
    }

    @OriginalMember(owner = "mf", name = "a", descriptor = "([III)V")
    public final void method620(int[] arg0, int arg1, int arg2) {
        this.field2335.method620(arg0, arg1, arg2);
        for (class199 var4 = (class199) this.field2324.method1230(42); var4 != null; var4 = (class199) this.field2324.method1234(-1)) {
            if (!this.field2319.method1194((byte) 127, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field3810 >= var5) {
                        this.method861(var5, arg0, var4, var6, 813, var5 + var6);
                        var4.field3810 -= var5;
                        break;
                    }
                    this.method861(var4.field3810, arg0, var4, var6, 813, var6 + var5);
                    var5 -= var4.field3810;
                    var6 += var4.field3810;
                } while (!this.field2319.method1178(var6, arg0, var5, var4, 103));
            }
        }
        field2323++;
    }

    @OriginalMember(owner = "mf", name = "<init>", descriptor = "(Lsh;)V")
    public class118(class174 arg0) {
        this.field2319 = arg0;
    }
}
