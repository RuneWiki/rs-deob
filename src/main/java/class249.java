import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class249 extends class116 {

    @OriginalMember(owner = "client!he", name = "E", descriptor = "Lko;")
    public class348 field3596 = new class348();

    @OriginalMember(owner = "client!he", name = "F", descriptor = "Lbh;")
    public class28 field3597 = new class28();

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lqe;")
    private class326 field3583;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "S")
    public static short field3586 = 1;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "F")
    public static float field3585;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()Lei;", line = 3)
    public final class116 method222() {
        field3591++;
        class283 var1;
        do {
            var1 = (class283) this.field3596.method2256(-63);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4105 == null);
        return var1.field4105;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "([III)V", line = 24)
    public final void method231(int[] arg0, int arg1, int arg2) {
        field3592++;
        this.field3597.method231(arg0, arg1, arg2);
        for (class283 var4 = (class283) this.field3596.method2257((byte) 103); var4 != null; var4 = (class283) this.field3596.method2256(-90)) {
            if (!this.field3583.method2110(16043, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field4117 >= var6) {
                        this.method1588(var5 + var6, var4, arg0, 69, var5, var6);
                        var4.field4117 -= var6;
                        break;
                    }
                    this.method1588(var5 + var6, var4, arg0, 111, var5, var4.field4117);
                    var5 += var4.field4117;
                    var6 -= var4.field4117;
                } while (!this.field3583.method2103(true, arg0, var4, var6, var5));
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()Lei;", line = 64)
    public final class116 method228() {
        field3589++;
        class283 var1 = (class283) this.field3596.method2257((byte) 107);
        if (var1 == null) {
            return null;
        } else if (var1.field4105 == null) {
            return this.method222();
        } else {
            return var1.field4105;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;IIIIIIB)V", line = 83)
    public static final void method1585(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3590++;
        if (arg7 > -119) {
            field3585 = 0.03136967F;
        }
        class400 var8 = new class400();
        var8.field5867 = class180.field2734 + arg1;
        var8.field5875 = arg4;
        var8.field5876 = arg3;
        var8.field5868 = arg5;
        var8.field5874 = arg0;
        var8.field5866 = arg2;
        var8.field5872 = arg6;
        class389.field5758.method1637((byte) -81, var8);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()I", line = 103)
    public final int method223() {
        field3587++;
        return 0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBLdg;)V", line = 111)
    private final void method1586(int arg0, byte arg1, class283 arg2) {
        if ((this.field3583.field4991[arg2.field4114] & 0x4) != 0 && arg2.field4112 < 0) {
            int var4 = this.field3583.field5022[arg2.field4114] / class471.field6941;
            int var5 = (var4 + 1048575 - arg2.field4109) / var4;
            arg2.field4109 = arg0 * var4 + arg2.field4109 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field3583.field5027[arg2.field4114] == 0) {
                    arg2.field4105 = class330.method2187(arg2.field4121, arg2.field4105.method2178(), arg2.field4105.method2163(), arg2.field4105.method2167());
                } else {
                    arg2.field4105 = class330.method2187(arg2.field4121, arg2.field4105.method2178(), 0, arg2.field4105.method2167());
                    this.field3583.method2109(arg2.field4124.field6533[arg2.field4126] < 0, arg2, 3323);
                }
                if (arg2.field4124.field6533[arg2.field4126] < 0) {
                    arg2.field4105.method2154(-1);
                }
                arg0 = arg2.field4109 / var4;
            }
        }
        if (arg1 > -50) {
            this.method222();
        }
        field3595++;
        arg2.field4105.method224(arg0);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V", line = 150)
    public static final void method1587(int arg0, int arg1) {
        if (arg1 != 697893576) {
            field3585 = 0.9611515F;
        }
        field3584++;
        int var2 = class180.field2734 - class97.field1568;
        if (var2 >= 100) {
            class403.field5944 = 1;
            return;
        }
        int var3 = (int) class382.field5684;
        if (class520.field7639 >> 8 > var3) {
            var3 = class520.field7639 >> 8;
        }
        if (class205.field2962[4] && class57.field823[4] + 128 > var3) {
            var3 = class57.field823[4] + 128;
        }
        int var4 = (int) class66.field1161 + class392.field5801 & 0x3FFF;
        class83.method655(class510.field7532, true, var4, var3, class87.field1460, arg0, class259.method1646(class95.field1558.field5539, class95.field1558.field5529, arg1 + 153807455, class434.field6317) - 50, (var3 >> 3) * 3 + 600 << 0);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class310.field4446 = (int) ((float) (class310.field4446 - class337.field5140) * var5 + (float) class337.field5140);
        class430.field6262 = (int) ((float) (class430.field6262 - class76.field1273) * var5 + (float) class76.field1273);
        class207.field2983 = (int) ((float) (class207.field2983 - class227.field3339) * var5 + (float) class227.field3339);
        class291.field4175 = (int) ((float) (class291.field4175 - class63.field1118) * var5 + (float) class63.field1118);
        int var6 = class320.field4578 - class101.field1620;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class320.field4578 = (int) ((float) var6 * var5 + (float) class101.field1620);
        class320.field4578 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILdg;[IIII)V", line = 199)
    private final void method1588(int arg0, class283 arg1, int[] arg2, int arg3, int arg4, int arg5) {
        if ((this.field3583.field4991[arg1.field4114] & 0x4) != 0 && arg1.field4112 < 0) {
            int var7 = this.field3583.field5022[arg1.field4114] / class471.field6941;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field4109) / var7;
                if (var8 > arg5) {
                    arg1.field4109 += arg5 * var7;
                    break;
                }
                arg1.field4105.method231(arg2, arg4, var8);
                arg1.field4109 += var7 * var8 - 1048576;
                arg5 -= var8;
                arg4 += var8;
                int var9 = class471.field6941 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class330 var11 = arg1.field4105;
                if (this.field3583.field5027[arg1.field4114] == 0) {
                    arg1.field4105 = class330.method2187(arg1.field4121, var11.method2178(), var11.method2163(), var11.method2167());
                } else {
                    arg1.field4105 = class330.method2187(arg1.field4121, var11.method2178(), 0, var11.method2167());
                    this.field3583.method2109(arg1.field4124.field6533[arg1.field4126] < 0, arg1, 3323);
                    arg1.field4105.method2169(var9, var11.method2163());
                }
                if (arg1.field4124.field6533[arg1.field4126] < 0) {
                    arg1.field4105.method2154(-1);
                }
                var11.method2150(var9);
                var11.method231(arg2, arg4, arg0 - arg4);
                if (var11.method2171()) {
                    this.field3597.method230(var11);
                }
            }
        }
        if (arg3 <= 45) {
            this.field3583 = null;
        }
        field3593++;
        arg1.field4105.method231(arg2, arg4, arg5);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 269)
    public final void method224(int arg0) {
        field3588++;
        this.field3597.method224(arg0);
        for (class283 var2 = (class283) this.field3596.method2257((byte) 101); var2 != null; var2 = (class283) this.field3596.method2256(-68)) {
            if (!this.field3583.method2110(16043, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field4117 >= var3) {
                        this.method1586(var3, (byte) -90, var2);
                        var2.field4117 -= var3;
                        break;
                    }
                    this.method1586(var2.field4117, (byte) -127, var2);
                    var3 -= var2.field4117;
                } while (!this.field3583.method2103(true, null, var2, var3, 0));
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lqe;)V", line = 318)
    public class249(class326 arg0) {
        this.field3583 = arg0;
    }
}
