import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class373 {

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "[I")
    private int[] field4763 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "Ldh;")
    public static class320 field4769 = new class320(89, 6);

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "Ldh;")
    public static class320 field4771 = new class320(62, -2);

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "Lea;")
    public class544 field4760;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "[I")
    private int[] field4756;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "[S")
    private short[] field4755;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "[S")
    private short[] field4758;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "[S")
    private short[] field4762;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "[S")
    private short[] field4766;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZI)V", line = 3)
    public static final void method2165(boolean arg0, int arg1) {
        if (arg1 != 1735429097) {
            return;
        }
        field4759++;
        if (arg0) {
            if (class327.field4245 != -1) {
                class451.method2777(class327.field4245, (byte) -56);
            }
            for (class424 var2 = (class424) class153.field1688.method1753(arg1 - 1735429097); var2 != null; var2 = (class424) class153.field1688.method1755(-46)) {
                if (!var2.method863(99)) {
                    var2 = (class424) class153.field1688.method1753(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class441.method2749(0, true, var2, false);
            }
            class327.field4245 = -1;
            class153.field1688 = new class295(8);
            class507.method3009(true);
            class327.field4245 = class417.field5795;
            class296.method1762(110, false);
            class486.method2933(true);
            class133.method852(class327.field4245);
        }
        class80.field835 = "";
        class411.field5619 = "";
        class329.field4261 = false;
        class203.method1226(-11394);
        class61.field627 = -1;
        class521.method3060(class627.field9012, -1);
        class90.field937 = new class183();
        class90.field937.field4629 = class153.field1677 * 512 / 2;
        class90.field937.field4635 = class489.field6976 * 512 / 2;
        class90.field937.field7187[0] = class489.field6976 / 2;
        class590.field8319 = 0;
        class167.field1855 = 0;
        class90.field937.field7193[0] = class153.field1677 / 2;
        if (class496.field7014 == 2) {
            class167.field1855 = class163.field1827 << 9;
            class590.field8319 = class398.field5452 << 9;
        } else {
            class19.method86(false);
        }
        class341.method2026(arg1 ^ 0x6770AF6C);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)Z", line = 67)
    public final boolean method2166(int arg0) {
        field4757++;
        if (this.field4756 == null) {
            return true;
        }
        boolean var2 = true;
        class404 var3 = this.field4760.field7829;
        synchronized (this.field4760.field7829) {
            for (int var4 = 0; var4 < this.field4756.length; var4++) {
                if (!this.field4760.field7829.method2493(this.field4756[var4], 0, (byte) -80)) {
                    var2 = false;
                }
            }
            if (arg0 >= -15) {
                this.method2171(66);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILig;)V", line = 97)
    public final void method2167(int arg0, class244 arg1) {
        while (true) {
            int var3 = arg1.method1423(-93);
            if (var3 == 0) {
                if (arg0 != -1) {
                    return;
                }
                field4767++;
                return;
            }
            this.method2169(arg1, 3593, var3);
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)Luk;", line = 125)
    public final class260 method2168(int arg0) {
        field4768++;
        class260[] var2 = new class260[5];
        int var3 = 0;
        class404 var4 = this.field4760.field7829;
        synchronized (this.field4760.field7829) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field4763[var5] != -1) {
                    var2[var3++] = class359.method2109(class555.method3251(arg0, 8381), 0, this.field4760.field7829, this.field4763[var5]);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field3182 < 13) {
                var2[var6].method1568(2, (byte) -17);
            }
        }
        if (arg0 != 12838) {
            method2165(true, 15);
        }
        class260 var7 = new class260(var2, var3);
        if (this.field4758 != null) {
            for (int var8 = 0; var8 < this.field4758.length; var8++) {
                var7.method1551(this.field4758[var8], this.field4755[var8], 0);
            }
        }
        if (this.field4766 != null) {
            for (int var9 = 0; var9 < this.field4766.length; var9++) {
                var7.method1569(this.field4762[var9], -7899, this.field4766[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lig;II)V", line = 194)
    private final void method2169(class244 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            arg0.method1423(-17);
        } else if (arg2 == 2) {
            int var4 = arg0.method1423(arg1 ^ 0xFFFFF1D3);
            this.field4756 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4756[var5] = arg0.method1476(arg1 - 3512);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var8 = arg0.method1423(-24);
                this.field4758 = new short[var8];
                this.field4755 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field4758[var9] = (short) arg0.method1476(class555.method3251(arg1, 3699));
                    this.field4755[var9] = (short) arg0.method1476(87);
                }
            } else if (arg2 == 41) {
                int var6 = arg0.method1423(-84);
                this.field4766 = new short[var6];
                this.field4762 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4766[var7] = (short) arg0.method1476(122);
                    this.field4762[var7] = (short) arg0.method1476(8);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field4763[arg2 - 60] = arg0.method1476(-85);
            }
        }
        field4761++;
        if (arg1 != 3593) {
            field4771 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)V", line = 296)
    public static void method2170(int arg0) {
        field4769 = null;
        field4771 = null;
        if (arg0 != 2) {
            method2165(false, -62);
        }
    }

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)Z", line = 312)
    public final boolean method2171(int arg0) {
        field4765++;
        boolean var2 = true;
        class404 var3 = this.field4760.field7829;
        synchronized (this.field4760.field7829) {
            int var4 = 0;
            while (true) {
                if (var4 >= 5) {
                    break;
                }
                if (this.field4763[var4] != -1 && !this.field4760.field7829.method2493(this.field4763[var4], 0, (byte) -86)) {
                    var2 = false;
                }
                var4++;
            }
        }
        if (arg0 >= -56) {
            this.method2167(-65, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "(I)Luk;", line = 345)
    public final class260 method2172(int arg0) {
        field4764++;
        if (this.field4756 == null) {
            return null;
        }
        class260[] var2 = new class260[this.field4756.length];
        class404 var3 = this.field4760.field7829;
        synchronized (this.field4760.field7829) {
            int var4 = 0;
            while (true) {
                if (this.field4756.length <= var4) {
                    int var5 = -102 / ((64 - arg0) / 32);
                    break;
                }
                var2[var4] = class359.method2109(4763, 0, this.field4760.field7829, this.field4756[var4]);
                var4++;
            }
        }
        for (int var6 = 0; var6 < this.field4756.length; var6++) {
            if (var2[var6].field3182 < 13) {
                var2[var6].method1568(2, (byte) -17);
            }
        }
        class260 var7;
        if (var2.length == 1) {
            var7 = var2[0];
        } else {
            var7 = new class260(var2, var2.length);
        }
        if (var7 == null) {
            return null;
        }
        if (this.field4758 != null) {
            for (int var8 = 0; var8 < this.field4758.length; var8++) {
                var7.method1551(this.field4758[var8], this.field4755[var8], 0);
            }
        }
        if (this.field4766 != null) {
            for (int var9 = 0; var9 < this.field4766.length; var9++) {
                var7.method1569(this.field4762[var9], -7899, this.field4766[var9]);
            }
        }
        return var7;
    }
}
