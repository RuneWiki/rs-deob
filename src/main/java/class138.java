import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class138 extends class232 {

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Lmf;")
    public class291 field2314 = new class291();

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "Lew;")
    public class343 field2318 = new class343();

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Lrv;")
    private class73 field2312;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Los;")
    public static class309 field2310 = new class309("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "Lph;")
    public static class459 field2322;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()Lsc;")
    public final class232 method641() {
        field2316++;
        class518 var1;
        do {
            var1 = (class518) this.field2314.method1893((byte) -2);
            if (var1 == null) {
                return null;
            }
        } while (var1.field7522 == null);
        return var1.field7522;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILpg;)V")
    private final void method1039(int arg0, int arg1, class518 arg2) {
        int var4 = -36 / ((arg0 - 38) / 49);
        field2311++;
        if ((this.field2312.field1476[arg2.field7508] & 0x4) != 0 && arg2.field7516 < 0) {
            int var5 = this.field2312.field1470[arg2.field7508] / class200.field3254;
            int var6 = (var5 + 1048575 - arg2.field7531) / var5;
            arg2.field7531 = arg1 * var5 + arg2.field7531 & 0xFFFFF;
            if (var6 <= arg1) {
                if (this.field2312.field1481[arg2.field7508] == 0) {
                    arg2.field7522 = class487.method2923(arg2.field7525, arg2.field7522.method2930(), arg2.field7522.method2920(), arg2.field7522.method2950());
                } else {
                    arg2.field7522 = class487.method2923(arg2.field7525, arg2.field7522.method2930(), 0, arg2.field7522.method2950());
                    this.field2312.method619((byte) 60, arg2.field7524.field6375[arg2.field7510] < 0, arg2);
                }
                if (arg2.field7524.field6375[arg2.field7510] < 0) {
                    arg2.field7522.method2955(-1);
                }
                arg1 = arg2.field7531 / var5;
            }
        }
        arg2.field7522.method648(arg1);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([III)V")
    public final void method618(int[] arg0, int arg1, int arg2) {
        field2315++;
        this.field2318.method618(arg0, arg1, arg2);
        for (class518 var4 = (class518) this.field2314.method1892(87); var4 != null; var4 = (class518) this.field2314.method1893((byte) -2)) {
            if (!this.field2312.method630(-1, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field7528 >= var5) {
                        this.method1042(var5 + var6, var6, var4, arg0, var5, 0);
                        var4.field7528 -= var5;
                        break;
                    }
                    this.method1042(var6 + var5, var6, var4, arg0, var4.field7528, 0);
                    var6 += var4.field7528;
                    var5 -= var4.field7528;
                } while (!this.field2312.method626(var5, var6, -60, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([Ljava/lang/Object;[IB)V")
    public static final void method1040(Object[] arg0, int[] arg1, byte arg2) {
        class120.method968(arg0, 0, arg1.length - 1, -27256, arg1);
        field2313++;
        if (arg2 < 9) {
            method1041(67);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public final void method648(int arg0) {
        field2319++;
        this.field2318.method648(arg0);
        for (class518 var2 = (class518) this.field2314.method1892(120); var2 != null; var2 = (class518) this.field2314.method1893((byte) -2)) {
            if (!this.field2312.method630(-1, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field7528) {
                        this.method1039(123, var3, var2);
                        var2.field7528 -= var3;
                        break;
                    }
                    this.method1039(-82, var2.field7528, var2);
                    var3 -= var2.field7528;
                } while (!this.field2312.method626(var3, 0, -60, null, var2));
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()Lsc;")
    public final class232 method627() {
        field2309++;
        class518 var1 = (class518) this.field2314.method1892(110);
        if (var1 == null) {
            return null;
        } else if (var1.field7522 == null) {
            return this.method641();
        } else {
            return var1.field7522;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public static void method1041(int arg0) {
        field2310 = null;
        field2322 = null;
        if (arg0 <= 97) {
            field2322 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILpg;[III)V")
    private final void method1042(int arg0, int arg1, class518 arg2, int[] arg3, int arg4, int arg5) {
        if ((this.field2312.field1476[arg2.field7508] & 0x4) != arg5 && arg2.field7516 < 0) {
            int var7 = this.field2312.field1470[arg2.field7508] / class200.field3254;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field7531) / var7;
                if (var8 > arg4) {
                    arg2.field7531 += arg4 * var7;
                    break;
                }
                arg2.field7522.method618(arg3, arg1, var8);
                arg4 -= var8;
                arg2.field7531 += var7 * var8 - 1048576;
                arg1 += var8;
                int var9 = class200.field3254 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class487 var11 = arg2.field7522;
                if (this.field2312.field1481[arg2.field7508] == 0) {
                    arg2.field7522 = class487.method2923(arg2.field7525, var11.method2930(), var11.method2920(), var11.method2950());
                } else {
                    arg2.field7522 = class487.method2923(arg2.field7525, var11.method2930(), 0, var11.method2950());
                    this.field2312.method619((byte) 60, arg2.field7524.field6375[arg2.field7510] < 0, arg2);
                    arg2.field7522.method2937(var9, var11.method2920());
                }
                if (arg2.field7524.field6375[arg2.field7510] < 0) {
                    arg2.field7522.method2955(-1);
                }
                var11.method2944(var9);
                var11.method618(arg3, arg1, arg0 - arg1);
                if (var11.method2926()) {
                    this.field2318.method2160(var11);
                }
            }
        }
        field2321++;
        arg2.field7522.method618(arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "()I")
    public final int method639() {
        field2317++;
        return 0;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lrv;)V")
    public class138(class73 arg0) {
        this.field2312 = arg0;
    }
}
