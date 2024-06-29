import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class410 extends class514 {

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Lrk;")
    public class419 field5850 = new class419();

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "Lei;")
    public class332 field5852 = new class332();

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Lcc;")
    private class427 field5845;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "Lrb;")
    public static class352 field5855 = new class352(0, 2, 2, 1);

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(JJ)J", line = 3)
    public static long method2438(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V", line = 11)
    public static void method2439(boolean arg0) {
        field5855 = null;
        if (!arg0) {
            field5855 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[ILgt;II)V", line = 21)
    private final void method2440(int arg0, int arg1, int[] arg2, class87 arg3, int arg4, int arg5) {
        field5846++;
        if ((this.field5845.field6096[arg3.field1100] & 0x4) != 0 && arg3.field1102 < 0) {
            int var7 = this.field5845.field6128[arg3.field1100] / class36.field419;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field1111) / var7;
                if (var8 > arg4) {
                    arg3.field1111 += arg4 * var7;
                    break;
                }
                arg3.field1123.method1425(arg2, arg0, var8);
                arg0 += var8;
                arg3.field1111 += var7 * var8 - 1048576;
                arg4 -= var8;
                int var9 = class36.field419 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class217 var11 = arg3.field1123;
                if (this.field5845.field6084[arg3.field1100] == 0) {
                    arg3.field1123 = class217.method1420(arg3.field1109, var11.method1405(), var11.method1428(), var11.method1401());
                } else {
                    arg3.field1123 = class217.method1420(arg3.field1109, var11.method1405(), 0, var11.method1401());
                    this.field5845.method2531(arg3.field1110.field908[arg3.field1113] < 0, -27, arg3);
                    arg3.field1123.method1411(var9, var11.method1428());
                }
                if (arg3.field1110.field908[arg3.field1113] < 0) {
                    arg3.field1123.method1417(-1);
                }
                var11.method1438(var9);
                var11.method1425(arg2, arg0, arg5 - arg0);
                if (var11.method1413()) {
                    this.field5852.method2083(var11);
                }
            }
        }
        arg3.field1123.method1425(arg2, arg0, arg4);
        if (arg1 != 0) {
            this.method1425(null, 102, 67);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "()I", line = 84)
    public final int method1419() {
        field5854++;
        return 0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 92)
    public final void method1434(int arg0) {
        field5851++;
        this.field5852.method1434(arg0);
        for (class87 var2 = (class87) this.field5850.method2496((byte) -105); var2 != null; var2 = (class87) this.field5850.method2494(21)) {
            if (!this.field5845.method2542(1569430726, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field1116 >= var3) {
                        this.method2441(var2, (byte) 13, var3);
                        var2.field1116 -= var3;
                        break;
                    }
                    this.method2441(var2, (byte) 13, var2.field1116);
                    var3 -= var2.field1116;
                } while (!this.field5845.method2521(var3, 117, var2, 0, null));
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "()Lft;", line = 127)
    public final class514 method1397() {
        field5847++;
        class87 var1;
        do {
            var1 = (class87) this.field5850.method2494(24);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1123 == null);
        return var1.field1123;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lgt;BI)V", line = 148)
    private final void method2441(class87 arg0, byte arg1, int arg2) {
        field5848++;
        if (arg1 != 13) {
            this.field5845 = null;
        }
        if ((this.field5845.field6096[arg0.field1100] & 0x4) != 0 && arg0.field1102 < 0) {
            int var4 = this.field5845.field6128[arg0.field1100] / class36.field419;
            int var5 = (var4 + 1048575 - arg0.field1111) / var4;
            arg0.field1111 = arg2 * var4 + arg0.field1111 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field5845.field6084[arg0.field1100] == 0) {
                    arg0.field1123 = class217.method1420(arg0.field1109, arg0.field1123.method1405(), arg0.field1123.method1428(), arg0.field1123.method1401());
                } else {
                    arg0.field1123 = class217.method1420(arg0.field1109, arg0.field1123.method1405(), 0, arg0.field1123.method1401());
                    this.field5845.method2531(arg0.field1110.field908[arg0.field1113] < 0, -26, arg0);
                }
                if (arg0.field1110.field908[arg0.field1113] < 0) {
                    arg0.field1123.method1417(-1);
                }
                arg2 = arg0.field1111 / var4;
            }
        }
        arg0.field1123.method1434(arg2);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lcc;)V", line = 255)
    public class410(class427 arg0) {
        this.field5845 = arg0;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "()Lft;", line = 194)
    public final class514 method1437() {
        field5849++;
        class87 var1 = (class87) this.field5850.method2496((byte) -104);
        if (var1 == null) {
            return null;
        } else if (var1.field1123 == null) {
            return this.method1397();
        } else {
            return var1.field1123;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([III)V", line = 213)
    public final void method1425(int[] arg0, int arg1, int arg2) {
        field5853++;
        this.field5852.method1425(arg0, arg1, arg2);
        for (class87 var4 = (class87) this.field5850.method2496((byte) 95); var4 != null; var4 = (class87) this.field5850.method2494(33)) {
            if (!this.field5845.method2542(1569430726, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field1116 >= var6) {
                        this.method2440(var5, 0, arg0, var4, var6, var5 + var6);
                        var4.field1116 -= var6;
                        break;
                    }
                    this.method2440(var5, 0, arg0, var4, var4.field1116, var5 + var6);
                    var5 += var4.field1116;
                    var6 -= var4.field1116;
                } while (!this.field5845.method2521(var6, 103, var4, var5, arg0));
            }
        }
    }
}
