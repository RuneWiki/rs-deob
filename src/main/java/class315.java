import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class315 extends class228 {

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Ldg;")
    public class317 field5548 = new class317();

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "Lae;")
    public class277 field5556 = new class277();

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "Lue;")
    private class15 field5546;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Lok;")
    public static class149 field5549;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V", line = 7)
    public static final void method2226(int arg0, int arg1, int arg2) {
        if (arg1 != -1068) {
            field5549 = (class149) null;
        }
        if (class113.field2073 != 0 && arg2 != -1) {
            class87.method758(false, (byte) -118, 0, arg2, class113.field2073, class78.field1497);
            class204.field3634 = true;
        }
        field5552++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 23)
    public final void method131(int arg0) {
        this.field5556.method131(arg0);
        for (class165 var2 = (class165) this.field5548.method2248(100); var2 != null; var2 = (class165) this.field5548.method2240(1138)) {
            if (!this.field5546.method123((byte) -122, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field2962 >= var3) {
                        this.method2227(var2, (byte) 86, var3);
                        var2.field2962 -= var3;
                        break;
                    }
                    this.method2227(var2, (byte) 98, var2.field2962);
                    var3 -= var2.field2962;
                } while (!this.field5546.method119((int[]) null, var2, var3, (byte) -22, 0));
            }
        }
        field5547++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Leh;BI)V", line = 59)
    private final void method2227(class165 arg0, byte arg1, int arg2) {
        int var4 = -42 % ((9 - arg1) / 48);
        if ((this.field5546.field445[arg0.field2983] & 0x4) != 0 && arg0.field2978 < 0) {
            int var5 = this.field5546.field441[arg0.field2983] / class312.field5524;
            int var6 = (var5 + 1048575 - arg0.field2965) / var5;
            arg0.field2965 = arg0.field2965 + (arg2 * var5) & 0xFFFFF;
            if (var6 <= arg2) {
                if (this.field5546.field502[arg0.field2983] == 0) {
                    arg0.field2968 = class82.method693(arg0.field2973, arg0.field2968.method717(), arg0.field2968.method705(), arg0.field2968.method721());
                } else {
                    arg0.field2968 = class82.method693(arg0.field2973, arg0.field2968.method717(), 0, arg0.field2968.method721());
                    this.field5546.method132(arg0, (byte) -124, arg0.field2964.field1338[arg0.field2975] < 0);
                }
                if (arg0.field2964.field1338[arg0.field2975] < 0) {
                    arg0.field2968.method715(-1);
                }
                arg2 = arg0.field2965 / var5;
            }
        }
        field5558++;
        arg0.field2968.method131(arg2);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIIZIII)Z", line = 98)
    public static final boolean method2228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        if (arg3 != -22495) {
            field5549 = (class149) null;
        }
        field5544++;
        if (class72.field1420.method3((byte) -109) == 2) {
            return class235.method1692(arg1, arg5, true, arg4, arg10, arg0, arg9, arg7, arg6, arg8, arg11, arg2);
        } else if (class72.field1420.method3((byte) -97) > 2) {
            return class169.method1319(arg8, arg1, arg6, arg4, arg5, arg11, arg3 ^ 0xFFFF9174, arg9, arg0, arg10, arg2, arg7, class72.field1420.method3((byte) -122));
        } else {
            return class269.method1916(arg2, arg11, arg10, arg6, arg0, -8847, arg5, arg7, arg4, arg1, arg8, arg9);
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V", line = 117)
    public static void method2229(byte arg0) {
        if (arg0 <= 80) {
            field5545 = 103;
        }
        field5549 = null;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "([III)V", line = 129)
    public final void method117(int[] arg0, int arg1, int arg2) {
        field5554++;
        this.field5556.method117(arg0, arg1, arg2);
        for (class165 var4 = (class165) this.field5548.method2248(106); var4 != null; var4 = (class165) this.field5548.method2240(1138)) {
            if (!this.field5546.method123((byte) -113, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field2962) {
                        this.method2230(true, var6, var4, var5 + var6, var5, arg0);
                        var4.field2962 -= var5;
                        break;
                    }
                    this.method2230(true, var6, var4, var5 + var6, var4.field2962, arg0);
                    var5 -= var4.field2962;
                    var6 += var4.field2962;
                } while (!this.field5546.method119(arg0, var4, var5, (byte) -22, var6));
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZILeh;II[I)V", line = 179)
    private final void method2230(boolean arg0, int arg1, class165 arg2, int arg3, int arg4, int[] arg5) {
        if ((this.field5546.field445[arg2.field2983] & 0x4) != 0 && arg2.field2978 < 0) {
            int var7 = this.field5546.field441[arg2.field2983] / class312.field5524;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field2965) / var7;
                if (var8 > arg4) {
                    arg2.field2965 += arg4 * var7;
                    break;
                }
                arg2.field2968.method117(arg5, arg1, var8);
                int var9 = class312.field5524 / 100;
                arg4 -= var8;
                arg2.field2965 += var7 * var8 - 1048576;
                int var10 = 262144 / var7;
                arg1 += var8;
                class82 var11 = arg2.field2968;
                if (var9 > var10) {
                    var9 = var10;
                }
                if (this.field5546.field502[arg2.field2983] == 0) {
                    arg2.field2968 = class82.method693(arg2.field2973, var11.method717(), var11.method705(), var11.method721());
                } else {
                    arg2.field2968 = class82.method693(arg2.field2973, var11.method717(), 0, var11.method721());
                    this.field5546.method132(arg2, (byte) -127, arg2.field2964.field1338[arg2.field2975] < 0);
                    arg2.field2968.method690(var9, var11.method705());
                }
                if (arg2.field2964.field1338[arg2.field2975] < 0) {
                    arg2.field2968.method715(-1);
                }
                var11.method716(var9);
                var11.method117(arg5, arg1, arg3 - arg1);
                if (var11.method720()) {
                    this.field5556.method1960(var11);
                }
            }
        }
        if (!arg0) {
            this.method133();
        }
        arg2.field2968.method117(arg5, arg1, arg4);
        field5551++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IJ)V", line = 241)
    public static final void method2231(int arg0, long arg1) {
        field5555++;
        if (arg0 <= 7 || arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class167.field3011; var3++) {
            if (class287.field5123[var3] == arg1) {
                class167.field3011--;
                for (int var4 = var3; var4 < class167.field3011; var4++) {
                    class100.field1861[var4] = class100.field1861[var4 + 1];
                    class247.field4383[var4] = class247.field4383[var4 + 1];
                    class179.field3250[var4] = class179.field3250[var4 + 1];
                    class287.field5123[var4] = class287.field5123[var4 + 1];
                    class26.field624[var4] = class26.field624[var4 + 1];
                    class87.field1677[var4] = class87.field1677[var4 + 1];
                }
                class161.field2916++;
                class162.field2923 = class249.field4443;
                class314.field5534.method1634(25, 0);
                class314.field5534.method490(arg1, 14886);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(Z)V", line = 287)
    public static final void method2232(boolean arg0) {
        if (arg0) {
            class24.field619 = class295.field5263;
            class165.field2970 = class14.field432;
            class174.field3136 = class101.field1897;
        } else {
            class24.field619 = class251.field4491;
            class165.field2970 = class255.field4550;
            class174.field3136 = class215.field3786;
        }
        class69.field1363 = class24.field619.length;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "()Lgj;", line = 308)
    public final class228 method140() {
        field5550++;
        class165 var1 = (class165) this.field5548.method2248(105);
        if (var1 == null) {
            return null;
        } else if (var1.field2968 == null) {
            return this.method133();
        } else {
            return var1.field2968;
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "()I", line = 331)
    public final int method102() {
        field5542++;
        return 0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IJZI)Lud;", line = 340)
    public static final class279 method2233(int arg0, long arg1, boolean arg2, int arg3) {
        field5553++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var5 = arg3;
        for (long var6 = arg1 / (long) arg0; var6 != 0L; var6 /= (long) arg0) {
            var5++;
        }
        int var8 = var5;
        if (arg1 < 0L || arg2) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg1 < 0L) {
            var9[0] = 45;
        } else if (arg2) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg1 % (long) arg0);
            arg1 /= (long) arg0;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class279 var12 = new class279();
        var12.field4967 = var8;
        var12.field4935 = var9;
        return var12;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lue;)V", line = 431)
    public class315(class15 arg0) {
        this.field5546 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "()Lgj;", line = 412)
    public final class228 method133() {
        field5557++;
        class165 var1;
        do {
            var1 = (class165) this.field5548.method2240(1138);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2968 == null);
        return var1.field2968;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)I", line = 440)
    public static final int method2234(int arg0, byte arg1) {
        field5543++;
        if (arg1 != 106) {
            field5549 = (class149) null;
        }
        return arg0 >>> 8;
    }
}
