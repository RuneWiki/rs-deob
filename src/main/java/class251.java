import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class251 extends class160 {

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Lfr;")
    public class497 field3421 = new class497();

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "Lhw;")
    public class395 field3431 = new class395();

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Lrl;")
    private class524 field3420;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "Ldp;")
    public static class347 field3426 = new class347("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field3429 = new String[8];

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "Lkr;")
    public static class262 field3433 = null;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "Lgo;")
    public static class310 field3435 = null;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "Laa;")
    public static class76 field3434 = new class76(63, 16);

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILcj;[II)V", line = 11)
    private final void method1503(int arg0, int arg1, int arg2, class132 arg3, int[] arg4, int arg5) {
        if (arg5 != 25679) {
            return;
        }
        field3425++;
        if ((this.field3420.field7704[arg3.field1959] & 0x4) != 0 && arg3.field1957 < 0) {
            int var7 = this.field3420.field7697[arg3.field1959] / class208.field3009;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field1960) / var7;
                if (arg0 < var8) {
                    arg3.field1960 += arg0 * var7;
                    break;
                }
                arg3.field1961.method1136(arg4, arg1, var8);
                arg0 -= var8;
                arg1 += var8;
                arg3.field1960 += var7 * var8 - 1048576;
                int var9 = class208.field3009 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class380 var11 = arg3.field1961;
                if (this.field3420.field7735[arg3.field1959] == 0) {
                    arg3.field1961 = class380.method2250(arg3.field1967, var11.method2264(), var11.method2273(), var11.method2245());
                } else {
                    arg3.field1961 = class380.method2250(arg3.field1967, var11.method2264(), 0, var11.method2245());
                    this.field3420.method3125(arg3.field1973.field5427[arg3.field1970] < 0, (byte) -114, arg3);
                    arg3.field1961.method2276(var9, var11.method2273());
                }
                if (arg3.field1973.field5427[arg3.field1970] < 0) {
                    arg3.field1961.method2251(-1);
                }
                var11.method2253(var9);
                var11.method1136(arg4, arg1, arg2 - arg1);
                if (var11.method2280()) {
                    this.field3431.method2376(var11);
                }
            }
        }
        arg3.field1961.method1136(arg4, arg1, arg0);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lrl;)V", line = 262)
    public class251(class524 arg0) {
        this.field3420 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "([III)V", line = 76)
    public final void method1136(int[] arg0, int arg1, int arg2) {
        field3424++;
        this.field3431.method1136(arg0, arg1, arg2);
        for (class132 var4 = (class132) this.field3421.method2957(-57); var4 != null; var4 = (class132) this.field3421.method2947(-115)) {
            if (!this.field3420.method3126(var4, (byte) 34)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field1983 >= var5) {
                        this.method1503(var5, var6, var6 + var5, var4, arg0, 25679);
                        var4.field1983 -= var5;
                        break;
                    }
                    this.method1503(var4.field1983, var6, var6 + var5, var4, arg0, 25679);
                    var5 -= var4.field1983;
                    var6 += var4.field1983;
                } while (!this.field3420.method3124(var5, 2, var6, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "()I", line = 114)
    public final int method1134() {
        field3427++;
        return 0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()Lbs;", line = 123)
    public final class160 method1131() {
        field3430++;
        class132 var1 = (class132) this.field3421.method2957(121);
        if (var1 == null) {
            return null;
        } else if (var1.field1961 == null) {
            return this.method1137();
        } else {
            return var1.field1961;
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "()Lbs;", line = 144)
    public final class160 method1137() {
        field3428++;
        class132 var1;
        do {
            var1 = (class132) this.field3421.method2947(-92);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1961 == null);
        return var1.field1961;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)V", line = 163)
    public static void method1504(byte arg0) {
        field3435 = null;
        field3426 = null;
        if (arg0 <= 17) {
            field3429 = null;
        }
        field3434 = null;
        field3429 = null;
        field3433 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lcj;II)V", line = 177)
    private final void method1505(class132 arg0, int arg1, int arg2) {
        if ((this.field3420.field7704[arg0.field1959] & 0x4) != arg2 && arg0.field1957 < 0) {
            int var4 = this.field3420.field7697[arg0.field1959] / class208.field3009;
            int var5 = (var4 + 1048575 - arg0.field1960) / var4;
            arg0.field1960 = arg0.field1960 + (arg1 * var4) & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field3420.field7735[arg0.field1959] == 0) {
                    arg0.field1961 = class380.method2250(arg0.field1967, arg0.field1961.method2264(), arg0.field1961.method2273(), arg0.field1961.method2245());
                } else {
                    arg0.field1961 = class380.method2250(arg0.field1967, arg0.field1961.method2264(), 0, arg0.field1961.method2245());
                    this.field3420.method3125(arg0.field1973.field5427[arg0.field1970] < 0, (byte) 87, arg0);
                }
                if (arg0.field1973.field5427[arg0.field1970] < 0) {
                    arg0.field1961.method2251(-1);
                }
                arg1 = arg0.field1960 / var4;
            }
        }
        field3423++;
        arg0.field1961.method1135(arg1);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 217)
    public final void method1135(int arg0) {
        field3422++;
        this.field3431.method1135(arg0);
        for (class132 var2 = (class132) this.field3421.method2957(116); var2 != null; var2 = (class132) this.field3421.method2947(68)) {
            if (!this.field3420.method3126(var2, (byte) 59)) {
                int var3 = arg0;
                do {
                    if (var2.field1983 >= var3) {
                        this.method1505(var2, var3, 0);
                        var2.field1983 -= var3;
                        break;
                    }
                    this.method1505(var2, var2.field1983, 0);
                    var3 -= var2.field1983;
                } while (!this.field3420.method3124(var3, 2, 0, null, var2));
            }
        }
    }
}
