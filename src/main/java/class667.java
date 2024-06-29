import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class667 extends class184 {

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "Lki;")
    public class364 field9252 = new class364();

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "Lfg;")
    public class393 field9258 = new class393();

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "Luga;")
    private class552 field9247;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[I")
    public static int[] field9246 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Z")
    public static boolean field9254 = false;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field9248;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field9249;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field9250;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "Lxa;")
    public static class511 field9255;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILiga;)V", line = 3)
    private final void method3646(int arg0, int arg1, class78 arg2) {
        if (arg1 != 1048575) {
            this.field9252 = null;
        }
        if ((this.field9247.field7212[arg2.field1060] & 0x4) != 0 && arg2.field1067 < 0) {
            int var4 = this.field9247.field7171[arg2.field1060] / class66.field901;
            int var5 = (var4 + 1048575 - arg2.field1069) / var4;
            arg2.field1069 = arg0 * var4 + arg2.field1069 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field9247.field7166[arg2.field1060] == 0) {
                    arg2.field1056 = class137.method995(arg2.field1072, arg2.field1056.method1021(), arg2.field1056.method1029(), arg2.field1056.method1009());
                } else {
                    arg2.field1056 = class137.method995(arg2.field1072, arg2.field1056.method1021(), 0, arg2.field1056.method1009());
                    this.field9247.method2928(arg2.field1061.field166[arg2.field1070] < 0, arg1 - 1048575, arg2);
                }
                if (arg2.field1061.field166[arg2.field1070] < 0) {
                    arg2.field1056.method1012(-1);
                }
                arg0 = arg2.field1069 / var4;
            }
        }
        field9248++;
        arg2.field1056.method1020(arg0);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()Lega;", line = 42)
    public final class184 method1005() {
        field9251++;
        class78 var1;
        do {
            var1 = (class78) this.field9252.method2088(-152);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1056 == null);
        return var1.field1056;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()Lega;", line = 62)
    public final class184 method997() {
        field9249++;
        class78 var1 = (class78) this.field9252.method2090(true);
        if (var1 == null) {
            return null;
        } else if (var1.field1056 == null) {
            return this.method1005();
        } else {
            return var1.field1056;
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()I", line = 84)
    public final int method1022() {
        field9250++;
        return 0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 97)
    public static void method3647(byte arg0) {
        field9246 = null;
        if (arg0 == 60) {
            field9255 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 108)
    public final void method1020(int arg0) {
        field9257++;
        this.field9258.method1020(arg0);
        for (class78 var2 = (class78) this.field9252.method2090(true); var2 != null; var2 = (class78) this.field9252.method2088(-152)) {
            if (!this.field9247.method2944(var2, -21870)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1053) {
                        this.method3646(var3, 1048575, var2);
                        var2.field1053 -= var3;
                        break;
                    }
                    this.method3646(var2.field1053, 1048575, var2);
                    var3 -= var2.field1053;
                } while (!this.field9247.method2925(0, var2, null, (byte) -86, var3));
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([III)V", line = 143)
    public final void method1010(int[] arg0, int arg1, int arg2) {
        field9245++;
        this.field9258.method1010(arg0, arg1, arg2);
        for (class78 var4 = (class78) this.field9252.method2090(true); var4 != null; var4 = (class78) this.field9252.method2088(-152)) {
            if (!this.field9247.method2944(var4, -21870)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field1053 >= var6) {
                        this.method3648(var5 + var6, var4, var6, arg0, var5, 66);
                        var4.field1053 -= var6;
                        break;
                    }
                    this.method3648(var5 + var6, var4, var4.field1053, arg0, var5, 83);
                    var6 -= var4.field1053;
                    var5 += var4.field1053;
                } while (!this.field9247.method2925(var5, var4, arg0, (byte) -86, var6));
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILiga;I[III)V", line = 185)
    private final void method3648(int arg0, class78 arg1, int arg2, int[] arg3, int arg4, int arg5) {
        field9253++;
        if ((this.field9247.field7212[arg1.field1060] & 0x4) != 0 && arg1.field1067 < 0) {
            int var7 = this.field9247.field7171[arg1.field1060] / class66.field901;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field1069) / var7;
                if (var8 > arg2) {
                    arg1.field1069 += arg2 * var7;
                    break;
                }
                arg1.field1056.method1010(arg3, arg4, var8);
                arg1.field1069 += var7 * var8 - 1048576;
                arg4 += var8;
                arg2 -= var8;
                int var9 = class66.field901 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class137 var11 = arg1.field1056;
                if (this.field9247.field7166[arg1.field1060] == 0) {
                    arg1.field1056 = class137.method995(arg1.field1072, var11.method1021(), var11.method1029(), var11.method1009());
                } else {
                    arg1.field1056 = class137.method995(arg1.field1072, var11.method1021(), 0, var11.method1009());
                    this.field9247.method2928(arg1.field1061.field166[arg1.field1070] < 0, 0, arg1);
                    arg1.field1056.method996(var9, var11.method1029());
                }
                if (arg1.field1061.field166[arg1.field1070] < 0) {
                    arg1.field1056.method1012(-1);
                }
                var11.method1027(var9);
                var11.method1010(arg3, arg4, arg0 - arg4);
                if (var11.method1018()) {
                    this.field9258.method2240(var11);
                }
            }
        }
        arg1.field1056.method1010(arg3, arg4, arg2);
        if (arg5 <= 2) {
            this.method1005();
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Luga;)V", line = 260)
    public class667(class552 arg0) {
        this.field9247 = arg0;
    }
}
