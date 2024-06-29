import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class242 extends class3 {

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    private int field3809 = 2048;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    private int field3814 = 10;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    private int field3824 = 0;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "Lsi;")
    public static class264 field3813 = null;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static int field3818 = 3353893;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3821 = "Choose Option";

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "Z")
    public static boolean field3816 = true;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3811;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "[I")
    private int[] field3810;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "[I")
    private int[] field3825;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "[Loh;")
    public static class187[] field3812;

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V", line = 317)
    public class242() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)[I", line = 20)
    public final int[] method25(byte arg0, int arg1) {
        field3819++;
        if (arg0 <= 57) {
            this.field3810 = (int[]) null;
        }
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int var4 = class159.field2546[arg1];
            if (this.field3824 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field3814; var6++) {
                    if (var4 >= this.field3825[var6] && var4 < this.field3825[var6 + 1]) {
                        if (var4 < this.field3810[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class298.method2106(var3, 0, class326.field5342, var5);
            } else {
                for (int var7 = 0; var7 < class326.field5342; var7++) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class163.field2591[var7];
                    int var11 = this.field3824;
                    if (var11 == 1) {
                        var8 = var10;
                    } else if (var11 == 2) {
                        var8 = (var4 + var10 - 4096 >> 1) + 2048;
                    } else if (var11 == 3) {
                        var8 = (var10 - var4 >> 1) + 2048;
                    }
                    for (int var12 = 0; var12 < this.field3814; var12++) {
                        if (this.field3825[var12] <= var8 && var8 < this.field3825[var12 + 1]) {
                            if (this.field3810[var12] > var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lfh;IZ)V", line = 138)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field3815++;
        if (arg1 == 0) {
            this.field3814 = arg0.method2224(-121);
        } else if (arg1 == 1) {
            this.field3809 = arg0.method2250(-1613178296);
        } else if (arg1 == 2) {
            this.field3824 = arg0.method2224(-127);
        }
        if (arg2) {
            this.method25((byte) 53, 61);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIBZ)Ljava/lang/String;", line = 186)
    public static final String method1691(int arg0, int arg1, byte arg2, boolean arg3) {
        field3822++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg3 && arg0 >= 0) {
            int var4 = 2;
            int var5 = arg0 / arg1;
            while (var5 != 0) {
                var5 /= arg1;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg2 != -75) {
                method1691(-43, 3, (byte) -14, true);
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg1;
                int var9 = var8 - (arg0 * arg1);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V", line = 237)
    public static final void method1692(int arg0) {
        field3820++;
        if (arg0 != 1) {
            return;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class117.field1701 - 1); var2++) {
                if (class300.field4949[var2] < 1000 && class300.field4949[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class190.field2938[var2];
                    class190.field2938[var2] = class190.field2938[var2 + 1];
                    class190.field2938[var2 + 1] = var3;
                    String var4 = class39.field570[var2];
                    class39.field570[var2] = class39.field570[var2 + 1];
                    class39.field570[var2 + 1] = var4;
                    int var5 = class100.field1450[var2];
                    class100.field1450[var2] = class100.field1450[var2 + 1];
                    class100.field1450[var2 + 1] = var5;
                    int var6 = class86.field1243[var2];
                    class86.field1243[var2] = class86.field1243[var2 + 1];
                    class86.field1243[var2 + 1] = var6;
                    int var7 = class109.field1622[var2];
                    class109.field1622[var2] = class109.field1622[var2 + 1];
                    class109.field1622[var2 + 1] = var7;
                    short var8 = class300.field4949[var2];
                    class300.field4949[var2] = class300.field4949[var2 + 1];
                    class300.field4949[var2 + 1] = var8;
                    long var9 = class258.field4095[var2];
                    class258.field4095[var2] = class258.field4095[var2 + 1];
                    class258.field4095[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V", line = 292)
    public static void method1693(int arg0) {
        field3813 = null;
        field3811 = null;
        field3812 = null;
        int var1 = 59 / ((arg0 + 50) / 57);
        field3821 = null;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V", line = 324)
    public final void method20(byte arg0) {
        this.method1694(4096);
        field3823++;
        int var2 = 30 / ((-arg0 - 20) / 58);
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V", line = 347)
    private final void method1694(int arg0) {
        field3817++;
        this.field3825 = new int[this.field3814 + 1];
        int var2 = 0;
        this.field3810 = new int[this.field3814 + 1];
        int var3 = 4096 / this.field3814;
        int var4 = this.field3809 * var3 >> 12;
        for (int var5 = 0; var5 < this.field3814; var5++) {
            this.field3825[var5] = var2;
            this.field3810[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3825[this.field3814] = arg0;
        this.field3810[this.field3814] = this.field3810[0] + 4096;
    }
}
