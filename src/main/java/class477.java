import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class477 extends class417 {

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "Lkba;")
    public class108 field6599 = new class108();

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "Lla;")
    public class454 field6601 = new class454();

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "Ljga;")
    private class716 field6592;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "Lms;")
    public static class760 field6598;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "()I")
    public final int method1979() {
        field6597++;
        return 0;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "([III)V")
    public final void method1985(int[] arg0, int arg1, int arg2) {
        field6600++;
        this.field6601.method1985(arg0, arg1, arg2);
        for (class426 var4 = (class426) this.field6599.method724(32); var4 != null; var4 = (class426) this.field6599.method723(111)) {
            if (!this.field6592.method4014(1816, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field6006 >= var6) {
                        this.method2682(var5 + var6, var6, var5, 1048575, arg0, var4);
                        var4.field6006 -= var6;
                        break;
                    }
                    this.method2682(var5 + var6, var4.field6006, var5, 1048575, arg0, var4);
                    var5 += var4.field6006;
                    var6 -= var4.field6006;
                } while (!this.field6592.method4009(var6, arg0, 2, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIII[ILhea;)V")
    private final void method2682(int arg0, int arg1, int arg2, int arg3, int[] arg4, class426 arg5) {
        if ((this.field6592.field10026[arg5.field6025] & 0x4) != 0 && arg5.field6014 < 0) {
            int var7 = this.field6592.field10030[arg5.field6025] / class478.field6609;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field6001) / var7;
                if (arg1 < var8) {
                    arg5.field6001 += arg1 * var7;
                    break;
                }
                arg5.field6024.method1985(arg4, arg2, var8);
                arg2 += var8;
                arg5.field6001 += var7 * var8 - 1048576;
                arg1 -= var8;
                int var9 = class478.field6609 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class466 var11 = arg5.field6024;
                if (this.field6592.field10028[arg5.field6025] == 0) {
                    arg5.field6024 = class466.method2601(arg5.field6018, var11.method2629(), var11.method2599(), var11.method2625());
                } else {
                    arg5.field6024 = class466.method2601(arg5.field6018, var11.method2629(), 0, var11.method2625());
                    this.field6592.method4030(1, arg5.field5999.field2060[arg5.field6021] < 0, arg5);
                    arg5.field6024.method2596(var9, var11.method2599());
                }
                if (arg5.field5999.field2060[arg5.field6021] < 0) {
                    arg5.field6024.method2621(-1);
                }
                var11.method2622(var9);
                var11.method1985(arg4, arg2, arg0 - arg2);
                if (var11.method2624()) {
                    this.field6601.method2539(var11);
                }
            }
        }
        field6593++;
        arg5.field6024.method1985(arg4, arg2, arg1);
        if (arg3 != 1048575) {
            this.method1974(-128);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
    public static void method2683(byte arg0) {
        if (arg0 >= -17) {
            field6598 = null;
        }
        field6598 = null;
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "()Lmha;")
    public final class417 method1991() {
        field6595++;
        class426 var1;
        do {
            var1 = (class426) this.field6599.method723(117);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6024 == null);
        return var1.field6024;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "()Lmha;")
    public final class417 method1989() {
        field6591++;
        class426 var1 = (class426) this.field6599.method724(32);
        if (var1 == null) {
            return null;
        } else if (var1.field6024 == null) {
            return this.method1991();
        } else {
            return var1.field6024;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
    public final void method1974(int arg0) {
        this.field6601.method1974(arg0);
        field6594++;
        for (class426 var2 = (class426) this.field6599.method724(32); var2 != null; var2 = (class426) this.field6599.method723(94)) {
            if (!this.field6592.method4014(1816, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field6006) {
                        this.method2684(var3, var2, -1);
                        var2.field6006 -= var3;
                        break;
                    }
                    this.method2684(var2.field6006, var2, -1);
                    var3 -= var2.field6006;
                } while (!this.field6592.method4009(var3, null, 2, 0, var2));
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILhea;I)V")
    private final void method2684(int arg0, class426 arg1, int arg2) {
        field6596++;
        if ((this.field6592.field10026[arg1.field6025] & 0x4) != 0 && arg1.field6014 < 0) {
            int var4 = this.field6592.field10030[arg1.field6025] / class478.field6609;
            int var5 = (1048575 - (arg1.field6001 - var4)) / var4;
            arg1.field6001 = arg0 * var4 + arg1.field6001 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field6592.field10028[arg1.field6025] == 0) {
                    arg1.field6024 = class466.method2601(arg1.field6018, arg1.field6024.method2629(), arg1.field6024.method2599(), arg1.field6024.method2625());
                } else {
                    arg1.field6024 = class466.method2601(arg1.field6018, arg1.field6024.method2629(), 0, arg1.field6024.method2625());
                    this.field6592.method4030(arg2 + 2, arg1.field5999.field2060[arg1.field6021] < 0, arg1);
                }
                if (arg1.field5999.field2060[arg1.field6021] < 0) {
                    arg1.field6024.method2621(-1);
                }
                arg0 = arg1.field6001 / var4;
            }
        }
        if (arg2 != -1) {
            this.method1991();
        }
        arg1.field6024.method1974(arg0);
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljga;)V")
    public class477(class716 arg0) {
        this.field6592 = arg0;
    }
}
