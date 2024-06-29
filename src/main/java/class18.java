import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class18 extends class375 {

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Lat;")
    public class412 field240 = new class412();

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "Lqn;")
    public class404 field245 = new class404();

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Ldi;")
    private class166 field233;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "[I")
    public static int[] field242 = new int[32];

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "[Lh;")
    public static class349[] field241 = new class349[32768];

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB[IILar;I)V")
    private final void method182(int arg0, byte arg1, int[] arg2, int arg3, class2 arg4, int arg5) {
        field237++;
        if (arg1 >= -102) {
            method183(4, (byte) -31);
        }
        if ((this.field233.field2354[arg4.field22] & 0x4) != 0 && arg4.field35 < 0) {
            int var7 = this.field233.field2385[arg4.field22] / class144.field2047;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field38) / var7;
                if (arg3 < var8) {
                    arg4.field38 += arg3 * var7;
                    break;
                }
                arg4.field29.method48(arg2, arg5, var8);
                arg5 += var8;
                arg3 -= var8;
                arg4.field38 += var7 * var8 - 1048576;
                int var9 = class144.field2047 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class7 var11 = arg4.field29;
                if (this.field233.field2345[arg4.field22] == 0) {
                    arg4.field29 = class7.method64(arg4.field33, var11.method67(), var11.method84(), var11.method60());
                } else {
                    arg4.field29 = class7.method64(arg4.field33, var11.method67(), 0, var11.method60());
                    this.field233.method1150(123, arg4, arg4.field47.field3006[arg4.field21] < 0);
                    arg4.field29.method69(var9, var11.method84());
                }
                if (arg4.field47.field3006[arg4.field21] < 0) {
                    arg4.field29.method59(-1);
                }
                var11.method72(var9);
                var11.method48(arg2, arg5, arg0 - arg5);
                if (var11.method45()) {
                    this.field245.method2418(var11);
                }
            }
        }
        arg4.field29.method48(arg2, arg5, arg3);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)I")
    public static final int method183(int arg0, byte arg1) {
        if (arg1 == 72) {
            field244++;
            return arg0 & 0xFF;
        } else {
            return 91;
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
    public static void method184(int arg0) {
        if (arg0 != 0) {
            method184(-43);
        }
        field241 = null;
        field242 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()Luh;")
    public final class375 method86() {
        field243++;
        class2 var1 = (class2) this.field240.method2456(32101);
        if (var1 == null) {
            return null;
        } else if (var1.field29 == null) {
            return this.method85();
        } else {
            return var1.field29;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lar;ZI)V")
    private final void method185(class2 arg0, boolean arg1, int arg2) {
        if ((this.field233.field2354[arg0.field22] & 0x4) != 0 && arg0.field35 < 0) {
            int var4 = this.field233.field2385[arg0.field22] / class144.field2047;
            int var5 = (var4 + 1048575 - arg0.field38) / var4;
            arg0.field38 = arg2 * var4 + arg0.field38 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field233.field2345[arg0.field22] == 0) {
                    arg0.field29 = class7.method64(arg0.field33, arg0.field29.method67(), arg0.field29.method84(), arg0.field29.method60());
                } else {
                    arg0.field29 = class7.method64(arg0.field33, arg0.field29.method67(), 0, arg0.field29.method60());
                    this.field233.method1150(123, arg0, arg0.field47.field3006[arg0.field21] < 0);
                }
                if (arg0.field47.field3006[arg0.field21] < 0) {
                    arg0.field29.method59(-1);
                }
                arg2 = arg0.field38 / var4;
            }
        }
        field238++;
        arg0.field29.method58(arg2);
        if (arg1) {
            this.method48((int[]) null, 99, -41);
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()Luh;")
    public final class375 method85() {
        field234++;
        class2 var1;
        do {
            var1 = (class2) this.field240.method2461(301);
            if (var1 == null) {
                return null;
            }
        } while (var1.field29 == null);
        return var1.field29;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "([III)V")
    public final void method48(int[] arg0, int arg1, int arg2) {
        field235++;
        this.field245.method48(arg0, arg1, arg2);
        for (class2 var4 = (class2) this.field240.method2456(32101); var4 != null; var4 = (class2) this.field240.method2461(301)) {
            if (!this.field233.method1159(var4, (byte) -96)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field44 >= var5) {
                        this.method182(var5 + var6, (byte) -126, arg0, var5, var4, var6);
                        var4.field44 -= var5;
                        break;
                    }
                    this.method182(var6 + var5, (byte) -108, arg0, var4.field44, var4, var6);
                    var6 += var4.field44;
                    var5 -= var4.field44;
                } while (!this.field233.method1164(127, arg0, var5, var6, var4));
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public final void method58(int arg0) {
        field239++;
        this.field245.method58(arg0);
        for (class2 var2 = (class2) this.field240.method2456(32101); var2 != null; var2 = (class2) this.field240.method2461(301)) {
            if (!this.field233.method1159(var2, (byte) -96)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field44) {
                        this.method185(var2, false, var3);
                        var2.field44 -= var3;
                        break;
                    }
                    this.method185(var2, false, var2.field44);
                    var3 -= var2.field44;
                } while (!this.field233.method1164(127, (int[]) null, var3, 0, var2));
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ldi;)V")
    public class18(class166 arg0) {
        this.field233 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "()I")
    public final int method49() {
        field236++;
        return 0;
    }
}
