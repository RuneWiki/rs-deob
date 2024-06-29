import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class650 extends class271 {

    @OriginalMember(owner = "client!us", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field9245 = new String[] { method4735(method4734("Rm,sc")), method4735(method4734("Rm,rc")), method4735(method4734("Rm,uc")), method4735(method4734("Rm,qc")), method4735(method4734("Rm,vc")), method4735(method4734("Rm,tc")) };

    @OriginalMember(owner = "client!us", name = "r", descriptor = "I")
    public static int field9233 = 0;

    @OriginalMember(owner = "client!us", name = "A", descriptor = "[I")
    public static int[] field9231 = new int[1000];

    @OriginalMember(owner = "client!us", name = "s", descriptor = "Llc;")
    public static class608 field9234 = new class608();

    @OriginalMember(owner = "client!us", name = "z", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!us", name = "B", descriptor = "I")
    public static int field9235;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!us", name = "t", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!us", name = "x", descriptor = "Ltb;")
    private class392 field9232;

    @OriginalMember(owner = "client!us", name = "w", descriptor = "Ltb;")
    private class392 field9236;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "Ltb;")
    private class392 field9238;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "Ltb;")
    private class392 field9239;

    @OriginalMember(owner = "client!us", name = "v", descriptor = "Ltb;")
    public class392 field9242;

    @OriginalMember(owner = "client!us", name = "y", descriptor = "Ltb;")
    private class392 field9244;

    @OriginalMember(owner = "client!us", name = "u", descriptor = "[Lf;")
    public static class19[] field9243;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BIZI)V", line = 12)
    public final void method549(byte arg0, int arg1, boolean arg2, int arg3) {
        try {
            ++field9235;
            int var5 = arg3 - -this.field9244.method1378();
            int var6 = arg3 - -super.field3830.field10543 + -this.field9238.method1378();
            int var7 = this.field9232.method1380() + arg1;
            int var8 = super.field3830.field10541 + arg1 + -this.field9236.method1380();
            if (arg0 > 60) {
                int var9 = var6 - var5;
                int var10 = -var7 + var8;
                int var11 = this.method2217(false) * var9 / 10000;
                int[] var12 = new int[4];
                class236.field3418.method229(var12);
                class236.field3418.method208(var5, var7, var5 + var11, var8);
                this.method2491(1, var10, var7, var9, var5);
                class236.field3418.method208(var5 + var11, var7, var6, var8);
                this.field9239.method3075(var5, var7, var9, var10);
                class236.field3418.method208(var12[0], var12[1], var12[2], var12[3]);
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field9245[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)Z", line = 45)
    public final boolean method800(byte arg0) {
        try {
            ++field9240;
            if (arg0 > -2) {
                return true;
            } else if (!super.method800((byte) -122)) {
                return false;
            } else {
                class427 var2 = (class427) super.field3830;
                if (!super.field3831.method530(false, var2.field6151)) {
                    return false;
                } else if (!super.field3831.method530(false, var2.field6147)) {
                    return false;
                } else if (!super.field3831.method530(false, var2.field6148)) {
                    return false;
                } else if (!super.field3831.method530(false, var2.field6144)) {
                    return false;
                } else if (!super.field3831.method530(false, var2.field6143)) {
                    return false;
                } else {
                    return super.field3831.method530(false, var2.field6142);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9245[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Llga;Llga;Lno;)V", line = 89)
    public class650(class47 arg0, class47 arg1, class427 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIBZ)V", line = 94)
    public final void method550(int arg0, int arg1, byte arg2, boolean arg3) {
        try {
            if (arg2 != -35) {
                this.field9242 = null;
            }
            if (arg3) {
                int[] var5 = new int[4];
                class236.field3418.method229(var5);
                class236.field3418.method208(arg0, arg1, super.field3830.field10543 + arg0, arg1 - -super.field3830.field10541);
                int var6 = this.field9244.method1378();
                int var7 = this.field9244.method1380();
                int var8 = this.field9238.method1378();
                int var9 = this.field9238.method1380();
                this.field9244.method3074(arg0, (-var7 + super.field3830.field10541) / 2 + arg1);
                this.field9238.method3074(super.field3830.field10543 + arg0 + -var8, arg1 - -((-var9 + super.field3830.field10541) / 2));
                class236.field3418.method208(arg0, arg1, super.field3830.field10543 + arg0, this.field9232.method1380() + arg1);
                this.field9232.method3075(arg0 + var6, arg1, -var6 + super.field3830.field10543 + -var8, super.field3830.field10541);
                int var10 = this.field9236.method1380();
                class236.field3418.method208(arg0, arg1 - var10 + super.field3830.field10541, super.field3830.field10543 + arg0, super.field3830.field10541 + arg1);
                this.field9236.method3075(arg0 + var6, super.field3830.field10541 + arg1 - var10, -var8 + super.field3830.field10543 - var6, super.field3830.field10541);
                class236.field3418.method208(var5[0], var5[1], var5[2], var5[3]);
            }
            ++field9230;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field9245[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(I)V", line = 132)
    public static void method4733(int arg0) {
        try {
            field9234 = null;
            if (arg0 != 4) {
                field9231 = null;
            }
            field9231 = null;
            field9243 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9245[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIII)V", line = 149)
    public void method2491(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field9241;
            if (arg0 != 1) {
                method4733(-98);
            }
            this.field9242.method3075(arg4, arg2, arg3, arg1);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9245[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 161)
    public final void method802(int arg0) {
        try {
            super.method802(-18);
            ++field9237;
            class427 var2 = (class427) super.field3830;
            this.field9242 = class304.method2443(true, super.field3831, var2.field6151);
            this.field9239 = class304.method2443(true, super.field3831, var2.field6147);
            int var3 = -79 / ((arg0 - 38) / 41);
            this.field9244 = class304.method2443(true, super.field3831, var2.field6148);
            this.field9238 = class304.method2443(true, super.field3831, var2.field6144);
            this.field9232 = class304.method2443(true, super.field3831, var2.field6143);
            this.field9236 = class304.method2443(true, super.field3831, var2.field6142);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9245[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!us", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4734(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 75);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!us", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4735(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 30;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 75;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
