import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class519 extends class317 {

    @OriginalMember(owner = "client!th", name = "v", descriptor = "Leea;")
    public class114 field7552 = new class114();

    @OriginalMember(owner = "client!th", name = "z", descriptor = "Lov;")
    public class161 field7556 = new class161();

    @OriginalMember(owner = "client!th", name = "r", descriptor = "Lci;")
    private class386 field7548;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "[I")
    public static int[] field7553;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Z")
    public static final boolean method3071(int arg0, int arg1, int arg2) {
        field7555++;
        if (arg1 != -8926) {
            field7553 = null;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)V")
    public static void method3072(boolean arg0) {
        if (!arg0) {
            field7553 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()I")
    public final int method935() {
        field7550++;
        return 0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public final void method929(int arg0) {
        field7547++;
        this.field7556.method929(arg0);
        for (class229 var2 = (class229) this.field7552.method719(false); var2 != null; var2 = (class229) this.field7552.method716(14)) {
            if (!this.field7548.method2493((byte) -54, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field3213 >= var3) {
                        this.method3074(var3, var2, (byte) 86);
                        var2.field3213 -= var3;
                        break;
                    }
                    this.method3074(var2.field3213, var2, (byte) -96);
                    var3 -= var2.field3213;
                } while (!this.field7548.method2497(var3, 0, null, var2, (byte) 21));
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILkv;BI[II)V")
    private final void method3073(int arg0, class229 arg1, byte arg2, int arg3, int[] arg4, int arg5) {
        field7545++;
        int var7 = 27 % ((arg2 - 3) / 48);
        if ((this.field7548.field5887[arg1.field3224] & 0x4) != 0 && arg1.field3214 < 0) {
            int var8 = this.field7548.field5930[arg1.field3224] / class292.field4050;
            while (true) {
                int var9 = (var8 + 1048575 - arg1.field3216) / var8;
                if (arg3 < var9) {
                    arg1.field3216 += arg3 * var8;
                    break;
                }
                arg1.field3222.method930(arg4, arg5, var9);
                arg3 -= var9;
                arg5 += var9;
                arg1.field3216 += var8 * var9 - 1048576;
                int var10 = class292.field4050 / 100;
                int var11 = 262144 / var8;
                if (var10 > var11) {
                    var10 = var11;
                }
                class189 var12 = arg1.field3222;
                if (this.field7548.field5885[arg1.field3224] == 0) {
                    arg1.field3222 = class189.method1124(arg1.field3210, var12.method1102(), var12.method1115(), var12.method1109());
                } else {
                    arg1.field3222 = class189.method1124(arg1.field3210, var12.method1102(), 0, var12.method1109());
                    this.field7548.method2483(-1, arg1, arg1.field3232.field6488[arg1.field3223] < 0);
                    arg1.field3222.method1105(var10, var12.method1115());
                }
                if (arg1.field3232.field6488[arg1.field3223] < 0) {
                    arg1.field3222.method1112(-1);
                }
                var12.method1107(var10);
                var12.method930(arg4, arg5, arg0 - arg5);
                if (var12.method1113()) {
                    this.field7556.method936(var12);
                }
            }
        }
        arg1.field3222.method930(arg4, arg5, arg3);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "([III)V")
    public final void method930(int[] arg0, int arg1, int arg2) {
        field7549++;
        this.field7556.method930(arg0, arg1, arg2);
        for (class229 var4 = (class229) this.field7552.method719(false); var4 != null; var4 = (class229) this.field7552.method716(14)) {
            if (!this.field7548.method2493((byte) -81, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field3213 >= var5) {
                        this.method3073(var5 + var6, var4, (byte) 56, var5, arg0, var6);
                        var4.field3213 -= var5;
                        break;
                    }
                    this.method3073(var5 + var6, var4, (byte) -125, var4.field3213, arg0, var6);
                    var6 += var4.field3213;
                    var5 -= var4.field3213;
                } while (!this.field7548.method2497(var5, var6, arg0, var4, (byte) 64));
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILkv;B)V")
    private final void method3074(int arg0, class229 arg1, byte arg2) {
        int var4 = 61 / ((-arg2 - 41) / 33);
        if ((this.field7548.field5887[arg1.field3224] & 0x4) != 0 && arg1.field3214 < 0) {
            int var5 = this.field7548.field5930[arg1.field3224] / class292.field4050;
            int var6 = (var5 + 1048575 - arg1.field3216) / var5;
            arg1.field3216 = arg0 * var5 + arg1.field3216 & 0xFFFFF;
            if (var6 <= arg0) {
                if (this.field7548.field5885[arg1.field3224] == 0) {
                    arg1.field3222 = class189.method1124(arg1.field3210, arg1.field3222.method1102(), arg1.field3222.method1115(), arg1.field3222.method1109());
                } else {
                    arg1.field3222 = class189.method1124(arg1.field3210, arg1.field3222.method1102(), 0, arg1.field3222.method1109());
                    this.field7548.method2483(-1, arg1, arg1.field3232.field6488[arg1.field3223] < 0);
                }
                if (arg1.field3232.field6488[arg1.field3223] < 0) {
                    arg1.field3222.method1112(-1);
                }
                arg0 = arg1.field3216 / var5;
            }
        }
        field7546++;
        arg1.field3222.method929(arg0);
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
    public static final void method3075(int arg0) {
        field7544++;
        if (arg0 <= 78) {
            field7553 = null;
        }
        class29.method175();
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "()Lbk;")
    public final class317 method926() {
        field7554++;
        class229 var1 = (class229) this.field7552.method719(false);
        if (var1 == null) {
            return null;
        } else if (var1.field3222 == null) {
            return this.method925();
        } else {
            return var1.field3222;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "()Lbk;")
    public final class317 method925() {
        field7551++;
        class229 var1;
        do {
            var1 = (class229) this.field7552.method716(14);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3222 == null);
        return var1.field3222;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lci;)V")
    public class519(class386 arg0) {
        this.field7548 = arg0;
    }
}
