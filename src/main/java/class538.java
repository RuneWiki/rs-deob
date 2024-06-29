import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class538 extends class529 {

    @OriginalMember(owner = "client!mp", name = "J", descriptor = "I")
    private int field7555 = 4096;

    @OriginalMember(owner = "client!mp", name = "M", descriptor = "Z")
    private boolean field7558 = true;

    @OriginalMember(owner = "client!mp", name = "D", descriptor = "[I")
    public static int[] field7550 = new int[256];

    @OriginalMember(owner = "client!mp", name = "E", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!mp", name = "F", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!mp", name = "H", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!mp", name = "I", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!mp", name = "K", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!mp", name = "L", descriptor = "I")
    public static int field7557;

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if (~(1 & var1) != -2) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -306674912;
                }
            }
            field7550[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)[[I", line = 5)
    public final int[][] method592(int arg0, int arg1) {
        ++field7552;
        int[][] var3 = super.field7450.method2241(-1, arg0);
        if (arg1 != 2) {
            method3065(9, (String[]) null);
        }
        if (super.field7450.field5165) {
            int[] var4 = this.method3028((byte) 112, arg0 + -1 & class33.field516, 0);
            int[] var5 = this.method3028((byte) 126, arg0, 0);
            int[] var6 = this.method3028((byte) 104, class33.field516 & arg0 + 1, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class304.field3909 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field7555;
                int var12 = (var5[class404.field5700 & var10 - -1] - var5[class404.field5700 & var10 + -1]) * this.field7555;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                    var18 = var12 / var17;
                }
                if (this.field7558) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIB)I", line = 88)
    public static final int method3062(int arg0, int arg1, byte arg2) {
        ++field7551;
        if (arg2 != 104) {
            field7556 = 112;
        }
        int var3 = class625.method3418(arg1 + -1, true, arg0 + -1) - -class625.method3418(arg1 - 1, true, arg0 + 1) + (class625.method3418(arg1 - -1, true, arg0 - 1) - -class625.method3418(arg1 - -1, true, arg0 - -1));
        int var4 = class625.method3418(arg1, true, arg0 - 1) + class625.method3418(arg1, true, arg0 + 1) - -class625.method3418(arg1 - 1, true, arg0) + class625.method3418(arg1 + 1, true, arg0);
        int var5 = class625.method3418(arg1, true, arg0);
        return var4 / 8 + (var3 / 16 - -(var5 / 4));
    }

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "(I)V", line = 106)
    public static void method3063(int arg0) {
        field7550 = null;
        if (arg0 != 0) {
            field7556 = -78;
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V", line = 116)
    public class538() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(III)Z", line = 124)
    public static final boolean method3064(int arg0, int arg1, int arg2) {
        ++field7557;
        boolean var3 = ~(arg1 & 55) != arg2 ? class646.method3499(arg1, true, arg0) : class34.method315(arg1, arg0, (byte) -74);
        return (65536 & arg0) != 0 | class327.method1934(arg0, arg1, -89) | var3;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 135)
    public static final String[] method3065(int arg0, String[] arg1) {
        ++field7553;
        if (arg0 != -7932) {
            method3064(-67, 36, -53);
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBLtn;)V", line = 163)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field7554;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field7558 = arg2.method1094(255) == 1;
            }
        } else {
            this.field7555 = arg2.method1107(false);
        }
        if (arg1 <= 45) {
            field7556 = 66;
        }
    }
}
