import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class778 extends class476 {

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    public static int field10694 = 2;

    @OriginalMember(owner = "client!au", name = "G", descriptor = "Ljn;")
    public static class134 field10712 = new class134(8, -2);

    @OriginalMember(owner = "client!au", name = "q", descriptor = "I")
    public static int field10696;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field10697;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "I")
    public static int field10699;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "I")
    public static int field10701;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "I")
    public static int field10702;

    @OriginalMember(owner = "client!au", name = "x", descriptor = "I")
    public static int field10703;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "I")
    public static int field10706;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "I")
    public static int field10707;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "I")
    public static int field10708;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "I")
    public static int field10709;

    @OriginalMember(owner = "client!au", name = "F", descriptor = "I")
    public static int field10711;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "Lho;")
    private class318 field10695;

    @OriginalMember(owner = "client!au", name = "s", descriptor = "Lho;")
    private class318 field10698;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "Lho;")
    private class318 field10700;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "Lho;")
    public class318 field10704;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "Lho;")
    private class318 field10705;

    @OriginalMember(owner = "client!au", name = "E", descriptor = "Lho;")
    private class318 field10710;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZILha;B)Lqm;", line = 3)
    public static final class485 method4283(boolean arg0, int arg1, class473 arg2, byte arg3) {
        ++field10706;
        if (~arg1 == 0) {
            return null;
        } else {
            if (class75.field842 != null) {
                for (int var4 = 0; ~var4 > ~class75.field842.length; ++var4) {
                    if (~class75.field842[var4] == ~arg1) {
                        return class340.field4924[var4];
                    }
                }
            }
            class485 var5 = (class485) class571.field8023.method312(arg3 ^ 2, (long) arg1);
            if (var5 != null) {
                if (arg0 && var5.field6707 == null) {
                    class300 var6 = class397.method2445(class92.field1077, (byte) 114, arg1);
                    if (var6 == null) {
                        return null;
                    }
                    var5.field6707 = var6;
                }
                return var5;
            } else {
                class279[] var7 = class279.method1823(class83.field1001, arg1);
                if (var7 == null) {
                    return null;
                } else {
                    class300 var8 = class397.method2445(class92.field1077, (byte) 3, arg1);
                    if (arg3 != 2) {
                        return null;
                    } else if (var8 == null) {
                        return null;
                    } else {
                        class485 var9;
                        if (arg0) {
                            var9 = new class485(arg2.method179(var8, var7, true), var8);
                        } else {
                            var9 = new class485(arg2.method179(var8, var7, true));
                        }
                        class571.field8023.method305(var9, (long) arg1, 18320);
                        return var9;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(JJ)J", line = 69)
    public static long method4284(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V", line = 81)
    public final void method938(int arg0) {
        ++field10707;
        super.method938(79);
        class126 var2 = (class126) super.field6598;
        this.field10704 = class772.method4269(12, var2.field1638, super.field6603);
        this.field10695 = class772.method4269(12, var2.field1637, super.field6603);
        this.field10710 = class772.method4269(12, var2.field1639, super.field6603);
        this.field10700 = class772.method4269(12, var2.field1643, super.field6603);
        this.field10698 = class772.method4269(12, var2.field1640, super.field6603);
        if (arg0 > 61) {
            this.field10705 = class772.method4269(12, var2.field1635, super.field6603);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIII)V", line = 101)
    public void method493(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -200) {
            this.field10695 = null;
        }
        this.field10704.method2031(arg2, arg4, arg1, arg3);
        ++field10697;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V", line = 115)
    public static final void method4285(byte arg0) {
        ++field10701;
        client.field1307.method202((0.1F * (float) class688.field9602.field8543.method1947((byte) -98) + 0.7F) * 1.1523438F);
        client.field1307.method154(class5.field31, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        client.field1307.method255(class248.field3697, -1, 0);
        if (arg0 != 69) {
            field10712 = null;
        }
        client.field1307.method173(class194.field2513);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IBI)I", line = 131)
    public static final int method4286(int arg0, byte arg1, int arg2) {
        ++field10709;
        if (~class424.field5898 == 0) {
            return 1;
        } else {
            if (~arg2 != ~class688.field9602.field8517.method2604((byte) -98)) {
                class577.method3380(10, arg2, class712.field9866.method3999(class553.field7667, (byte) -45), true);
                if (~arg2 != ~class688.field9602.field8517.method2604((byte) -98)) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class749.field10341.getSize();
                class323.method2046(class582.field8243, class111.field1332, true, false, class559.field7865, class712.field9866.method3999(class553.field7667, (byte) -29));
                class534 var4 = class93.method674(class424.field5898, arg1 ^ 101, 0, class384.field5496);
                long var5 = class683.method3903((byte) 4);
                class111.field1332.method208();
                class732.field10111.method50(0, class760.field10442, 0);
                class111.field1332.method194(class732.field10111);
                class111.field1332.method242(var3.width / 2, var3.height / 2, 512, 512);
                class111.field1332.method202(1.0F);
                class111.field1332.method154(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class231 var7 = class111.field1332.method231(var4, 2048, 64, 64, 768);
                int var8 = 0;
                label45: for (int var9 = 0; ~var9 > -501; ++var9) {
                    class111.field1332.method230(0);
                    class111.field1332.method226();
                    for (int var10 = 15; ~var10 <= -1; --var10) {
                        for (int var11 = 0; var11 <= var10; ++var11) {
                            class49.field592.method50((int) (((float) var11 - (float) var10 / 2.0F) * (float) class179.field2263), 0, (var10 - -1) * class179.field2263);
                            ++var8;
                            var7.method1586(class49.field592, (class21) null, 0);
                            if (~((long) arg0) >= ~(-var5 + class683.method3903((byte) 4))) {
                                break label45;
                            }
                        }
                    }
                }
                class111.field1332.method210();
                long var12 = (long) (var8 * 1000) / (-var5 + class683.method3903((byte) 4));
                if (arg1 != 97) {
                    return -43;
                } else {
                    class111.field1332.method230(0);
                    class111.field1332.method226();
                    return (int) var12;
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIZ)V", line = 215)
    public final void method995(int arg0, int arg1, int arg2, boolean arg3) {
        ++field10696;
        if (arg0 == -29993) {
            if (arg3) {
                int[] var5 = new int[4];
                class111.field1332.method160(var5);
                class111.field1332.method225(arg1, arg2, super.field6598.field5723 + arg1, super.field6598.field5722 + arg2);
                int var6 = this.field10710.method749();
                int var7 = this.field10710.method736();
                int var8 = this.field10700.method749();
                int var9 = this.field10700.method736();
                this.field10710.method2025(arg1, (super.field6598.field5722 - var7) / 2 + arg2);
                this.field10700.method2025(super.field6598.field5723 + arg1 + -var8, (-var9 + super.field6598.field5722) / 2 + arg2);
                class111.field1332.method225(arg1, arg2, super.field6598.field5723 + arg1, this.field10698.method736() + arg2);
                this.field10698.method2031(arg1 + var6, arg2, super.field6598.field5723 - var8 + -var6, super.field6598.field5722);
                int var10 = this.field10705.method736();
                class111.field1332.method225(arg1, -var10 + arg2 - -super.field6598.field5722, super.field6598.field5723 + arg1, arg2 - -super.field6598.field5722);
                this.field10705.method2031(arg1 + var6, arg2 - var10 + super.field6598.field5722, -var6 + super.field6598.field5723 + -var8, super.field6598.field5722);
                class111.field1332.method225(var5[0], var5[1], var5[2], var5[3]);
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IZII)V", line = 250)
    public final void method997(int arg0, boolean arg1, int arg2, int arg3) {
        ++field10699;
        int var5 = this.field10710.method749() + arg0;
        int var6 = arg0 - (-super.field6598.field5723 - -this.field10700.method749());
        int var7 = arg2 - -this.field10698.method736();
        int var8 = 123 / ((-12 - arg3) / 34);
        int var9 = super.field6598.field5722 + (arg2 - this.field10705.method736());
        int var10 = var6 - var5;
        int var11 = -var7 + var9;
        int var12 = var10 * this.method2838(true) / 10000;
        int[] var13 = new int[4];
        class111.field1332.method160(var13);
        class111.field1332.method225(var5, var7, var5 + var12, var9);
        this.method493(-200, var10, var5, var11, var7);
        class111.field1332.method225(var5 + var12, var7, var6, var9);
        this.field10695.method2031(var5, var7, var10, var11);
        class111.field1332.method225(var13[0], var13[1], var13[2], var13[3]);
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)V", line = 282)
    public static void method4287(int arg0) {
        field10712 = null;
        if (arg0 != 15) {
            method4287(16);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Lld;", line = 292)
    public static final class127 method4288(int arg0, int arg1) {
        ++field10711;
        class127[] var2 = class350.method2207(3);
        for (int var3 = 0; var3 < var2.length; ++var3) {
            class127 var4 = var2[var3];
            if (var4.field1646 == arg1) {
                return var4;
            }
        }
        if (arg0 > -44) {
            field10712 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(Z)Lkj;", line = 319)
    public static final class85 method4289(boolean arg0) {
        if (!arg0) {
            return null;
        } else {
            ++field10708;
            try {
                return (class85) Class.forName("ej").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(IIIII)I", line = 342)
    public static final int method4290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field10702;
        int var5 = 15 & arg3;
        if (arg0 != 799) {
            method4288(-85, 40);
        }
        int var6 = ~var5 <= -9 ? arg4 : arg2;
        int var7 = var5 < 4 ? arg4 : (var5 != 12 && ~var5 != -15 ? arg1 : arg2);
        return ((var5 & 2) != 0 ? -var7 : var7) + ((var5 & 1) != 0 ? -var6 : var6);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)Z", line = 361)
    public final boolean method941(byte arg0) {
        ++field10703;
        if (!super.method941(arg0)) {
            return false;
        } else {
            class126 var2 = (class126) super.field6598;
            if (!super.field6603.method1860(var2.field1638, (byte) 124)) {
                return false;
            } else if (!super.field6603.method1860(var2.field1637, (byte) 124)) {
                return false;
            } else if (!super.field6603.method1860(var2.field1639, (byte) 124)) {
                return false;
            } else if (!super.field6603.method1860(var2.field1643, (byte) 124)) {
                return false;
            } else if (!super.field6603.method1860(var2.field1640, (byte) 124)) {
                return false;
            } else {
                return super.field6603.method1860(var2.field1635, (byte) 124);
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lae;Lae;Lht;)V", line = 397)
    public class778(class283 arg0, class283 arg1, class126 arg2) {
        super(arg0, arg1, arg2);
    }
}
