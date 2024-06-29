import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class224 extends class240 {

    @OriginalMember(owner = "client!k", name = "T", descriptor = "[I")
    private int[] field3817 = new int[3];

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    private int field3818 = 409;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    private int field3824 = 4096;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    private int field3820 = 4096;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    private int field3816 = 4096;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "Z")
    public static boolean field3814 = false;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "Lcd;")
    private static class64 field3819 = class44.method335((byte) 71, "scroll:");

    @OriginalMember(owner = "client!k", name = "O", descriptor = "Lcd;")
    public static class64 field3812 = field3819;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "Lcd;")
    public static class64 field3823 = field3819;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "F")
    public static float field3815;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "[Lic;")
    public static class110[] field3813;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)[[I", line = 17)
    public final int[][] method286(byte arg0, int arg1) {
        field3822++;
        if (arg0 <= 34) {
            this.field3824 = 98;
        }
        int[][] var3 = this.field4095.method1797(arg1, -98);
        if (this.field4095.field4355) {
            int[][] var4 = this.method1746(-111, arg1, 0);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class169.field2936; var11++) {
                int var12 = var6[var11];
                int var13 = var12 - this.field3817[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field3818 < var13) {
                    var7[var11] = var12;
                    var10[var11] = var8[var11];
                    var9[var11] = var5[var11];
                } else {
                    int var14 = var8[var11];
                    int var15 = var14 - this.field3817[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field3818 < var15) {
                        var7[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var5[var11];
                    } else {
                        int var16 = var5[var11];
                        int var17 = var16 - this.field3817[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field3818 < var17) {
                            var7[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var7[var11] = this.field3820 * var12 >> 12;
                            var10[var11] = this.field3816 * var14 >> 12;
                            var9[var11] = this.field3824 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)I", line = 113)
    public static int method1614(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(B)V", line = 121)
    public static void method1615(byte arg0) {
        field3819 = null;
        if (arg0 <= -90) {
            field3813 = null;
            field3823 = null;
            field3812 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V", line = 162)
    public class224() {
        super(1, false);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILkh;)V", line = 166)
    public final void method16(int arg0, int arg1, class13 arg2) {
        field3821++;
        if (arg0 != 2) {
            field3815 = -0.5001295F;
        }
        if (arg1 == 0) {
            this.field3818 = arg2.method112((byte) 92);
        } else if (arg1 == 1) {
            this.field3824 = arg2.method112((byte) 92);
        } else if (arg1 == 2) {
            this.field3816 = arg2.method112((byte) 92);
        } else if (arg1 == 3) {
            this.field3820 = arg2.method112((byte) 92);
        } else if (arg1 == 4) {
            int var5 = arg2.method111(1263702152);
            this.field3817[2] = method1614(var5, 255) >> 12;
            this.field3817[1] = method1614(4080, var5 >> 4);
            this.field3817[0] = method1614(16711680, var5) << 4;
        }
    }
}
