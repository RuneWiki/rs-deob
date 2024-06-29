import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class74 extends class96 {

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    private int field931 = 4;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    private int field932 = 4;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "Ltu;")
    public static class7 field930 = new class7();

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "[I")
    public static int[] field933;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(B)V", line = 4)
    public static void method422(byte arg0) {
        field933 = null;
        field930 = null;
        if (arg0 > -20) {
            field927 = 113;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(II)I", line = 17)
    public static final int method423(int arg0, int arg1) {
        ++field937;
        if (class286.field3643 != null) {
            class286.field3643.method1003(1);
            class286.field3643 = null;
        }
        ++class218.field2805;
        if (~class218.field2805 < -5) {
            class504.field7406 = 0;
            class218.field2805 = 0;
            return arg1;
        } else {
            class504.field7406 = arg0;
            if (class474.field6929 == class440.field6122) {
                class474.field6929 = class25.field440;
            } else {
                class474.field6929 = class440.field6122;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZII)I", line = 55)
    public static final int method424(boolean arg0, int arg1, int arg2) {
        ++field929;
        if (arg0) {
            return 0;
        } else {
            class378 var3 = class188.method1235(arg0, (byte) -128, arg2);
            if (var3 == null) {
                return class31.field516.method3108(arg2, -105).field1539;
            } else {
                int var4 = 0;
                for (int var5 = arg1; var3.field4901.length > var5; ++var5) {
                    if (~var3.field4901[var5] == 0) {
                        ++var4;
                    }
                }
                return var4 + (class31.field516.method3108(arg2, -120).field1539 - var3.field4901.length);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 86)
    public class74() {
        super(1, false);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)V", line = 91)
    public static final void method425(int arg0, byte arg1) {
        ++field936;
        class436 var2 = class459.method2712(1, arg0, arg1 ^ 1759243760);
        var2.method2567(16013);
        if (arg1 != -112) {
            method422((byte) -91);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[[I", line = 104)
    public final int[][] method36(int arg0, int arg1) {
        ++field935;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int var4 = class269.field3403 / this.field931;
            int var5 = class477.field6965 / this.field932;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method659(0, -26, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method659(0, -103, class477.field6965 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class269.field3403 > var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class269.field3403 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILbt;)V", line = 172)
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field934;
        if (arg1 != -1) {
            field930 = null;
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field932 = arg2.method617(2);
            }
        } else {
            this.field931 = arg2.method617(2);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[I", line = 213)
    public final int[] method37(int arg0, int arg1) {
        ++field928;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (arg1 != 255) {
            this.method36(-5, -107);
        }
        if (super.field1331.field863) {
            int var4 = class269.field3403 / this.field931;
            int var5 = class477.field6965 / this.field932;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method657(0, 0, -1);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method657(0, class477.field6965 * var7 / var5, arg1 ^ -256);
            }
            for (int var8 = 0; ~var8 > ~class269.field3403; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class269.field3403 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }
}
