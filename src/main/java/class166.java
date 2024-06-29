import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class166 extends class89 {

    @OriginalMember(owner = "client!qi", name = "V", descriptor = "Z")
    private boolean field2882 = true;

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "Z")
    private boolean field2879 = true;

    @OriginalMember(owner = "client!qi", name = "U", descriptor = "I")
    public static int field2881 = -1;

    @OriginalMember(owner = "client!qi", name = "X", descriptor = "[B")
    public static byte[] field2884 = new byte[32896];

    @OriginalMember(owner = "client!qi", name = "cb", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!qi", name = "Y", descriptor = "Lda;")
    public static class275 field2885;

    @OriginalMember(owner = "client!qi", name = "Z", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!qi", name = "ab", descriptor = "Lda;")
    public static class275 field2887;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!qi", name = "T", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!qi", name = "W", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!qi", name = "bb", descriptor = "Lma;")
    public static class105 field2888;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field2877;
        if (arg1) {
            field2889 = -69;
        }
        int[] var3 = super.field1503.method229(arg0, (byte) -58);
        if (super.field1503.field664) {
            int[] var4 = this.method645(-128, 0, !this.field2882 ? arg0 : class277.field4837 - arg0);
            if (this.field2879) {
                for (int var5 = 0; class65.field1070 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class1.field11];
                }
            } else {
                class154.method1086(var4, 0, var3, 0, class65.field1070);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V")
    public static void method1142(byte arg0) {
        field2885 = null;
        field2884 = null;
        field2888 = null;
        field2887 = null;
        if (arg0 > -76) {
            method1142((byte) 58);
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class166() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (arg0 != -20503) {
            this.method239(-58, true);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1508 = ~arg1.method564((byte) 51) == -2;
                }
            } else {
                this.field2882 = ~arg1.method564((byte) 117) == -2;
            }
        } else {
            this.field2879 = ~arg1.method564((byte) 87) == -2;
        }
        ++field2880;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field2878;
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (!arg0) {
            field2881 = -80;
        }
        if (super.field1512.field2007) {
            int[][] var4 = this.method648(true, 0, !this.field2882 ? arg1 : -arg1 + class277.field4837);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            if (!this.field2879) {
                for (int var11 = 0; var11 < class65.field1070; ++var11) {
                    var6[var11] = var5[var11];
                    var8[var11] = var7[var11];
                    var10[var11] = var9[var11];
                }
            } else {
                for (int var12 = 0; var12 < class65.field1070; ++var12) {
                    var6[var12] = var5[-var12 + class1.field11];
                    var8[var12] = var7[-var12 + class1.field11];
                    var10[var12] = var9[-var12 + class1.field11];
                }
            }
        }
        return var3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; var2 <= var1; ++var2) {
                field2884[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 - -65535) / 65535.0F))));
            }
        }
        field2889 = 0;
        field2885 = class255.method1672(103, ")4a=");
        field2886 = 0;
        field2887 = class255.method1672(114, "(U0a )2 in: ");
    }
}
