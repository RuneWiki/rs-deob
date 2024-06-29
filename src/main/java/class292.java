import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class292 extends class261 {

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    private int field5016 = -1;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "Lve;")
    public static class255 field5014 = class87.method607(88, "::replacecanvas");

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "Lve;")
    public static class255 field5010 = class87.method607(122, "blaugr-Un:");

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public int field5015;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public int field5017;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "Lnd;")
    public static class303 field5020;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "[I")
    public int[] field5018;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)[[I", line = 12)
    public int[][] method13(boolean arg0, int arg1) {
        int[][] var3 = this.field4418.method35(arg1, 104);
        if (this.field4418.field94 && this.method2065((byte) -77)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field5015 * (class210.field3590 == this.field5017 ? arg1 : this.field5017 * arg1 / class210.field3590);
            if (class92.field1576 == this.field5015) {
                for (int var8 = 0; var8 < class92.field1576; var8++) {
                    int var9 = this.field5018[var7++];
                    var6[var8] = class154.method1134(var9 << 4, 4080);
                    var5[var8] = class154.method1134(4080, var9 >> 4);
                    var4[var8] = class154.method1134(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class92.field1576; var10++) {
                    int var11 = this.field5015 * var10 / class92.field1576;
                    int var12 = this.field5018[var7 + var11];
                    var6[var10] = class154.method1134(var12, 255) << 4;
                    var5[var10] = class154.method1134(4080, var12 >> 4);
                    var4[var10] = class154.method1134(16711680, var12) >> 12;
                }
            }
        }
        field5012++;
        return arg0 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)I", line = 75)
    public final int method1823(boolean arg0) {
        field5011++;
        if (arg0) {
            this.field5016 = -108;
        }
        return this.field5016;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V", line = 86)
    public final void method832(boolean arg0) {
        field5021++;
        super.method832(arg0);
        if (!arg0) {
            this.field5017 = -47;
        }
        this.field5018 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIII)Z", line = 98)
    public static final boolean method2064(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class38.field585[arg0][var8][var9] == -class54.field857) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class106.field1783[arg0][arg1][arg3] + arg5;
            if (!class222.method1557(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class222.method1557(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class222.method1557(var10, var12, var14)) {
                return false;
            } else if (class222.method1557(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class97.method768(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class222.method1557(var6 + 1, class106.field1783[arg0][arg1][arg3] + arg5, var7 + 1) && class222.method1557(var6 + 128 - 1, class106.field1783[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class222.method1557(var6 + 128 - 1, class106.field1783[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class222.method1557(var6 + 1, class106.field1783[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(B)Z", line = 159)
    public final boolean method2065(byte arg0) {
        field5022++;
        if (this.field5018 != null) {
            return true;
        } else if (this.field5016 < 0) {
            if (arg0 >= -55) {
                method2068(-2);
            }
            return false;
        } else {
            class83 var2 = class101.method784(class240.field4000, -2838, this.field5016);
            var2.method583();
            this.field5018 = var2.field1344;
            this.field5017 = var2.field4628;
            this.field5015 = var2.field4619;
            return true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 184)
    public class292() {
        super(0, false);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(III)Lfi;", line = 194)
    public static final class250 method2066(int arg0, int arg1, int arg2) {
        class249 var3 = class118.field1984[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4188; var4++) {
            class250 var5 = var3.field4182[var4];
            if ((var5.field4206 >> 29 & 0x3L) == 2L && var5.field4212 == arg1 && var5.field4216 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lpb;BI)V", line = 224)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 > -115) {
            this.method13(false, -26);
        }
        field5019++;
        if (arg2 == 0) {
            this.field5016 = arg0.method423(255);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(ZI)[F", line = 240)
    public static final float[] method2067(boolean arg0, int arg1) {
        field5013++;
        float var2 = class272.method1898() + class272.method1901();
        int var3 = class272.method1902();
        class203.field3510[3] = 1.0F;
        float var4 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        if (arg0) {
            method2067(true, -90);
        }
        float var5 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class203.field3510[0] = (float) (class154.method1134(16736901, arg1) >> 16) / 255.0F * var5 * var7 * var2;
        class203.field3510[2] = var2 * var6 * ((float) class154.method1134(arg1, 255) / 255.0F) * var7;
        class203.field3510[1] = var7 * var4 * ((float) class154.method1134(arg1 >> 8, 255) / 255.0F) * var2;
        return class203.field3510;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V", line = 267)
    public static void method2068(int arg0) {
        field5010 = null;
        int var1 = 29 % ((-arg0 - 56) / 47);
        field5020 = null;
        field5014 = null;
    }
}
