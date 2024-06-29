import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class496 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
    private int[] field6949 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Luaa;")
    public static class395 field6946 = new class395(5);

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Lnk;")
    public class376 field6960;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Lfa;")
    public static class482 field6956;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
    private int[] field6947;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "[S")
    private short[] field6945;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[S")
    private short[] field6950;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "[S")
    private short[] field6951;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "[S")
    private short[] field6955;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Lld;", line = 7)
    public final class560 method2823(byte arg0) {
        field6962++;
        if (this.field6947 == null) {
            return null;
        } else if (arg0 < 97) {
            return null;
        } else {
            class560[] var2 = new class560[this.field6947.length];
            class561 var3 = this.field6960.field5524;
            synchronized (this.field6960.field5524) {
                int var4 = 0;
                while (true) {
                    if (this.field6947.length <= var4) {
                        break;
                    }
                    var2[var4] = class307.method1903((byte) 70, this.field6947[var4], 0, this.field6960.field5524);
                    var4++;
                }
            }
            for (int var5 = 0; var5 < this.field6947.length; var5++) {
                if (var2[var5].field7981 < 13) {
                    var2[var5].method3147(0, 48);
                }
            }
            class560 var6;
            if (var2.length == 1) {
                var6 = var2[0];
            } else {
                var6 = new class560(var2, var2.length);
            }
            if (var6 == null) {
                return null;
            }
            if (this.field6951 != null) {
                for (int var7 = 0; var7 < this.field6951.length; var7++) {
                    var6.method3153(this.field6955[var7], this.field6951[var7], -85);
                }
            }
            if (this.field6945 != null) {
                for (int var8 = 0; var8 < this.field6945.length; var8++) {
                    var6.method3146(this.field6945[var8], this.field6950[var8], (byte) 53);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)Z", line = 82)
    public final boolean method2824(byte arg0) {
        field6958++;
        if (this.field6947 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = -72 / ((44 - arg0) / 62);
        class561 var4 = this.field6960.field5524;
        synchronized (this.field6960.field5524) {
            for (int var5 = 0; var5 < this.field6947.length; var5++) {
                if (!this.field6960.field5524.method3187(0, (byte) 91, this.field6947[var5])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([[II)V", line = 111)
    public static final void method2825(int[][] arg0, int arg1) {
        field6957++;
        if (arg1 != 0) {
            field6956 = null;
        }
        class495.field6944 = arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lco;B)V", line = 122)
    public final void method2826(class268 arg0, byte arg1) {
        int var3 = -123 % ((39 - arg1) / 60);
        field6961++;
        while (true) {
            int var4 = arg0.method1738(255);
            if (var4 == 0) {
                return;
            }
            this.method2832(arg0, (byte) -107, var4);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIZI[Loh;I)V", line = 156)
    public static final void method2827(boolean arg0, int arg1, boolean arg2, int arg3, class549[] arg4, int arg5) {
        field6953++;
        if (!arg0) {
            method2827(false, -18, false, -120, null, -3);
        }
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class549 var7 = arg4[var6];
            if (var7 != null && var7.field7637 == arg1) {
                class194.method1281(var7, 9625, arg2, arg3, arg5);
                class179.method1214(var7, arg3, true, arg5);
                if (var7.field7676 > var7.field7694 - var7.field7678) {
                    var7.field7676 = var7.field7694 - var7.field7678;
                }
                if ((var7.field7750 - var7.field7776) < var7.field7643) {
                    var7.field7643 = var7.field7750 - var7.field7776;
                }
                if (var7.field7676 < 0) {
                    var7.field7676 = 0;
                }
                if (var7.field7643 < 0) {
                    var7.field7643 = 0;
                }
                if (var7.field7749 == 0) {
                    class633.method3657(var7, arg2, (byte) 104);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 206)
    public static void method2828(int arg0) {
        field6946 = null;
        if (arg0 != 70) {
            field6956 = null;
        }
        field6956 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)Lld;", line = 220)
    public final class560 method2829(boolean arg0) {
        field6952++;
        class560[] var2 = new class560[5];
        int var3 = 0;
        if (!arg0) {
            field6946 = null;
        }
        class561 var4 = this.field6960.field5524;
        synchronized (this.field6960.field5524) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field6949[var5] != -1) {
                    var2[var3++] = class307.method1903((byte) 106, this.field6949[var5], 0, this.field6960.field5524);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field7981 < 13) {
                var2[var6].method3147(0, 82);
            }
        }
        class560 var7 = new class560(var2, var3);
        if (this.field6951 != null) {
            for (int var8 = 0; var8 < this.field6951.length; var8++) {
                var7.method3153(this.field6955[var8], this.field6951[var8], -121);
            }
        }
        if (this.field6945 != null) {
            for (int var9 = 0; var9 < this.field6945.length; var9++) {
                var7.method3146(this.field6945[var9], this.field6950[var9], (byte) 53);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)Z", line = 288)
    public final boolean method2830(int arg0) {
        field6959++;
        boolean var2 = true;
        class561 var3 = this.field6960.field5524;
        synchronized (this.field6960.field5524) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field6949[var4] != -1 && !this.field6960.field5524.method3187(0, (byte) 70, this.field6949[var4])) {
                    var2 = false;
                }
            }
            if (arg0 > -95) {
                this.field6960 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZIZ)Lgp;", line = 319)
    public static final class561 method2831(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field6948++;
        if (arg0 != 0) {
            method2831(120, 31, true, -60, true);
        }
        class270 var5 = null;
        if (class247.field3558 != null) {
            var5 = new class270(arg3, class247.field3558, class528.field7352[arg3], 1000000);
        }
        class509.field7069[arg3] = class584.field8322.method20(1, arg3, var5, class561.field8016);
        if (arg4) {
            class509.field7069[arg3].method2983(arg0 ^ 0xFFFFFFB0);
        }
        return new class561(class509.field7069[arg3], arg2, arg1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lco;BI)V", line = 343)
    private final void method2832(class268 arg0, byte arg1, int arg2) {
        int var4 = -126 % ((8 - arg1) / 46);
        field6954++;
        if (arg2 == 1) {
            arg0.method1738(255);
        } else if (arg2 == 2) {
            int var9 = arg0.method1738(255);
            this.field6947 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field6947[var10] = arg0.method1745(32132);
            }
        } else if (arg2 != 3) {
            if (arg2 != 40) {
                if (arg2 == 41) {
                    int var5 = arg0.method1738(255);
                    this.field6945 = new short[var5];
                    this.field6950 = new short[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field6945[var6] = (short) arg0.method1745(32132);
                        this.field6950[var6] = (short) arg0.method1745(32132);
                    }
                } else if (arg2 >= 60 && arg2 < 70) {
                    this.field6949[arg2 - 60] = arg0.method1745(32132);
                    return;
                }
                return;
            }
            int var7 = arg0.method1738(255);
            this.field6955 = new short[var7];
            this.field6951 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field6951[var8] = (short) arg0.method1745(32132);
                this.field6955[var8] = (short) arg0.method1745(32132);
            }
            return;
        }
    }
}
