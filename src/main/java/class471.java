import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class471 {

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "[I")
    private int[] field6579 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field6568 = 0;

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "Ltt;")
    public static class338 field6582 = new class338(54, -1);

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "Leu;")
    public class692 field6565;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "[I")
    private int[] field6577;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "[S")
    private short[] field6563;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "[S")
    private short[] field6566;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "[S")
    private short[] field6573;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "[S")
    private short[] field6575;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)Lcca;")
    public final class250 method2715(int arg0) {
        field6572++;
        class250[] var2 = new class250[5];
        int var3 = 0;
        class332 var4 = this.field6565.field9758;
        synchronized (this.field6565.field9758) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field6579[var5] != -1) {
                    var2[var3++] = class258.method1563(0, this.field6565.field9758, this.field6579[var5], 65535);
                }
                var5++;
            }
        }
        if (arg0 > -17) {
            this.method2717(null, (byte) 29, -111);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field3261 < 13) {
                var2[var6].method1513(2, (byte) -115);
            }
        }
        class250 var7 = new class250(var2, var3);
        if (this.field6566 != null) {
            for (int var8 = 0; var8 < this.field6566.length; var8++) {
                var7.method1518((byte) 59, this.field6566[var8], this.field6573[var8]);
            }
        }
        if (this.field6575 != null) {
            for (int var9 = 0; var9 < this.field6575.length; var9++) {
                var7.method1517(this.field6563[var9], -55, this.field6575[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
    public static final void method2716(int arg0) {
        field6564++;
        class5.method33((byte) 73, class602.field8408.field4317);
        int var1 = (class82.field946 >> 12) + (class125.field1745 >> 3);
        class298.field3942 = class408.field5369.field385 = 0;
        int var2 = (class147.field1980 >> 12) + (class4.field23 >> 3);
        class408.field5369.method3167(false, 8, 8);
        if (arg0 >= -72) {
            method2721(-49, (byte) -105);
        }
        byte var3 = 18;
        class229.field2972 = new int[var3];
        class361.field4785 = new byte[var3][];
        class126.field1760 = new int[var3];
        class611.field8486 = new byte[var3][];
        class552.field7545 = new int[var3];
        class245.field3207 = new int[var3];
        class297.field3929 = new byte[var3][];
        class311.field4201 = new int[var3];
        class191.field2645 = new byte[var3][];
        class581.field7947 = new int[var3][4];
        class37.field506 = new byte[var3][];
        class502.field6923 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class703.field9886 >> 4)) / 8; var5 <= (((class703.field9886 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class431.field5789 >> 4)) / 8; var8 <= ((class431.field5789 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class126.field1760[var4] = var9;
                class245.field3207[var4] = class543.field7433.method1959(5743, "m" + var5 + "_" + var8);
                class229.field2972[var4] = class543.field7433.method1959(5743, "l" + var5 + "_" + var8);
                class502.field6923[var4] = class543.field7433.method1959(5743, "n" + var5 + "_" + var8);
                class552.field7545[var4] = class543.field7433.method1959(5743, "um" + var5 + "_" + var8);
                class311.field4201[var4] = class543.field7433.method1959(5743, "ul" + var5 + "_" + var8);
                if (class502.field6923[var4] == -1) {
                    class245.field3207[var4] = -1;
                    class229.field2972[var4] = -1;
                    class552.field7545[var4] = -1;
                    class311.field4201[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class502.field6923.length; var6++) {
            class502.field6923[var6] = -1;
            class245.field3207[var6] = -1;
            class229.field2972[var6] = -1;
            class552.field7545[var6] = -1;
            class311.field4201[var6] = -1;
        }
        byte var7;
        if (class576.field7861 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class96.method545(var7, var1, (byte) 17, var2, false);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lio;BI)V")
    private final void method2717(class157 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            arg0.method930(255);
        } else if (arg2 == 2) {
            int var8 = arg0.method930(255);
            this.field6577 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field6577[var9] = arg0.method963(-121);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var4 = arg0.method930(255);
                this.field6573 = new short[var4];
                this.field6566 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field6566[var5] = (short) arg0.method963(-126);
                    this.field6573[var5] = (short) arg0.method963(-128);
                }
            } else if (arg2 == 41) {
                int var6 = arg0.method930(255);
                this.field6575 = new short[var6];
                this.field6563 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6575[var7] = (short) arg0.method963(-128);
                    this.field6563[var7] = (short) arg0.method963(-124);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field6579[arg2 - 60] = arg0.method963(-121);
            }
        }
        field6574++;
        int var10 = -10 / ((arg1 + 13) / 48);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)Lcca;")
    public final class250 method2718(byte arg0) {
        field6571++;
        if (this.field6577 == null) {
            return null;
        }
        class250[] var2 = new class250[this.field6577.length];
        class332 var3 = this.field6565.field9758;
        synchronized (this.field6565.field9758) {
            if (arg0 >= -45) {
                this.method2723(-88);
            }
            int var4 = 0;
            while (true) {
                if (this.field6577.length <= var4) {
                    break;
                }
                var2[var4] = class258.method1563(0, this.field6565.field9758, this.field6577[var4], 65535);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field6577.length; var5++) {
            if (var2[var5].field3261 < 13) {
                var2[var5].method1513(2, (byte) 50);
            }
        }
        class250 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class250(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field6566 != null) {
            for (int var7 = 0; var7 < this.field6566.length; var7++) {
                var6.method1518((byte) 59, this.field6566[var7], this.field6573[var7]);
            }
        }
        if (this.field6575 != null) {
            for (int var8 = 0; var8 < this.field6575.length; var8++) {
                var6.method1517(this.field6563[var8], -63, this.field6575[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)Z")
    public final boolean method2719(int arg0) {
        field6570++;
        boolean var2 = true;
        class332 var3 = this.field6565.field9758;
        synchronized (this.field6565.field9758) {
            int var4 = 0;
            if (arg0 >= -33) {
                this.field6579 = null;
            }
            while (var4 < 5) {
                if (this.field6579[var4] != -1 && !this.field6565.field9758.method1962(0, 108, this.field6579[var4])) {
                    var2 = false;
                }
                var4++;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2720(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 0) {
            return;
        }
        if (arg7 >= class281.field3703 && class255.field3350 >= arg1 && arg3 >= class6.field66 && arg6 <= class151.field2071) {
            class451.method2538(arg5, arg3, arg2, arg7, arg1, arg0, arg6, 0);
        } else {
            class626.method3474(arg2, arg6, arg3, false, arg1, arg0, arg5, arg7);
        }
        field6576++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)Z")
    public static final boolean method2721(int arg0, byte arg1) {
        field6578++;
        int var2 = -111 / ((8 - arg1) / 38);
        return arg0 == 50 || arg0 == 2 || arg0 == 1001 || arg0 == 60 || arg0 == 48;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lio;Z)V")
    public final void method2722(class157 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method930(255);
            if (var3 == 0) {
                field6580++;
                if (arg1) {
                    this.method2718((byte) 112);
                    return;
                }
                return;
            }
            this.method2717(arg0, (byte) -120, var3);
        }
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)Z")
    public final boolean method2723(int arg0) {
        field6567++;
        if (arg0 != 15613) {
            this.field6579 = null;
        }
        if (this.field6577 == null) {
            return true;
        }
        boolean var2 = true;
        class332 var3 = this.field6565.field9758;
        synchronized (this.field6565.field9758) {
            for (int var4 = 0; var4 < this.field6577.length; var4++) {
                if (!this.field6565.field9758.method1962(0, arg0 ^ 0x3C82, this.field6577[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)V")
    public static void method2724(int arg0) {
        if (arg0 <= -32) {
            field6582 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II[BB)[B")
    public static final byte[] method2725(int arg0, int arg1, byte[] arg2, byte arg3) {
        field6569++;
        if (arg3 != 81) {
            method2720(-121, 17, 17, 18, 57, 59, -82, -124);
        }
        byte[] var4 = new byte[arg0];
        class2.method9(arg2, arg1, var4, 0, arg0);
        return var4;
    }
}
