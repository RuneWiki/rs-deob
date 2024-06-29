import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class270 {

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Lvd;")
    private class4 field4258 = new class4();

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "Lc;")
    private class106 field4263 = new class106();

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    private int field4265;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    private int field4264;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "Lkd;")
    private class204 field4266;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field4251 = 0;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field4259 = 0;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field4260 = 0;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[I")
    public static int[] field4253 = new int[32];

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4256 = "M";

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Lpf;")
    public static class287 field4254;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZI)V")
    public static final void method1823(boolean arg0, int arg1) {
        byte[][] var2 = class207.field3402;
        int var3 = class27.field426.length;
        int var4 = 0;
        if (arg1 >= -41) {
            method1830(53, (char) 65518);
        }
        while (var3 > var4) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class99.field1620[var4] & 0xFF) * 64 - class214.field3501;
                int var7 = (class99.field1620[var4] >> 8) * 64 - class50.field884;
                class254.method1730(-98);
                class274.method1851(var6, var5, class167.field2657, arg0, var7, true);
            }
            var4++;
        }
        field4248++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIILik;IJZ)Z")
    public static final boolean method1824(int arg0, int arg1, int arg2, int arg3, int arg4, class260 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class221.method1511(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)Lel;")
    public final class202 method1825(byte arg0) {
        field4255++;
        if (arg0 != -49) {
            method1823(false, 107);
        }
        return this.field4266.method1404(arg0 + 149);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)Lel;")
    public final class202 method1826(boolean arg0) {
        field4261++;
        return arg0 ? this.field4266.method1412(-125) : null;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V")
    public final void method1827(byte arg0) {
        field4262++;
        this.field4263.method770((byte) 121);
        this.field4266.method1398(0);
        if (arg0 <= 112) {
            this.method1831(-33L, (class4) null, -2);
        }
        this.field4258 = new class4();
        this.field4264 = this.field4265;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(Z)V")
    public static void method1828(boolean arg0) {
        field4253 = null;
        field4254 = null;
        if (arg0) {
            field4256 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lf;I)V")
    public static final void method1829(class36 arg0, int arg1) {
        field4249++;
        class36 var2 = class280.method1887(1, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class279.field4423;
            var4 = class84.field1326;
        } else {
            var4 = var2.field642;
            var3 = var2.field676;
        }
        int var5 = 32 % ((-arg1 - 74) / 45);
        class8.method57(false, (byte) 92, var3, arg0, var4);
        class22.method217(var4, var3, arg0, (byte) 108);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IC)Z")
    public static final boolean method1830(int arg0, char arg1) {
        if (arg0 != 128) {
            method1830(30, (char) 65512);
        }
        field4250++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class40.field748;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(JLvd;I)V")
    public final void method1831(long arg0, class4 arg1, int arg2) {
        field4257++;
        if (this.field4264 == 0) {
            class4 var5 = this.field4263.method771(-120);
            var5.method1388(54);
            var5.method40(0);
            if (this.field4258 == var5) {
                class4 var6 = this.field4263.method771(arg2 - 201);
                var6.method1388(80);
                var6.method40(0);
            }
        } else {
            this.field4264--;
        }
        this.field4266.method1399(7292, arg1, arg0);
        this.field4263.method774(0, arg1);
        if (arg2 != 128) {
            this.method1826(false);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(JB)Lvd;")
    public final class4 method1832(long arg0, byte arg1) {
        field4252++;
        int var4 = 87 / ((arg1 - 68) / 33);
        class4 var5 = (class4) this.field4266.method1400(arg0, true);
        if (var5 != null) {
            this.field4263.method774(0, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(I)V")
    public class270(int arg0) {
        this.field4265 = arg0;
        this.field4264 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4266 = new class204(var2);
    }
}
