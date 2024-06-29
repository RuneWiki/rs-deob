import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class608 extends class145 {

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
    private int field8877 = 32768;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "[B")
    public static byte[] field8881;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "F")
    public static float field8880;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "Lcm;")
    public static class631 field8879;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)[[I")
    public final int[][] method75(byte arg0, int arg1) {
        ++field8874;
        if (arg0 > -28) {
            return null;
        } else {
            int[][] var3 = super.field1792.method1826(arg1, -16486);
            if (super.field1792.field3917) {
                int[] var4 = this.method865(1, arg1, (byte) -75);
                int[] var5 = this.method865(2, arg1, (byte) -47);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; var9 < class647.field9368; ++var9) {
                    int var10 = 255 & var4[var9] * 255 >> 12;
                    int var11 = var5[var9] * this.field8877 >> 12;
                    int var12 = class215.field2959[var10] * var11 >> 12;
                    int var13 = class101.field1202[var10] * var11 >> 12;
                    int var14 = class619.field8980 & (var12 >> 12) + var9;
                    int var15 = class444.field6649 & (var13 >> 12) + arg1;
                    int[][] var16 = this.method866(0, var15, (byte) -119);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field1790 = ~arg2.method1177(255) == -2;
            }
        } else {
            this.field8877 = arg2.method1220(116) << 4;
        }
        if (arg1 >= -67) {
            this.method28(-19, 98, (class194) null);
        }
        ++field8873;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Luj;Luj;B)V")
    public static final void method3531(class324 arg0, class324 arg1, byte arg2) {
        ++field8875;
        if (arg1.field4677 != null) {
            arg1.method2108(true);
        }
        arg1.field4677 = arg0.field4677;
        arg1.field4681 = arg0;
        arg1.field4677.field4681 = arg1;
        if (arg2 == 69) {
            arg1.field4681.field4677 = arg1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field8876;
        if (arg0) {
            return null;
        } else {
            int[] var3 = super.field1779.method2069(-2, arg1);
            if (super.field1779.field4602) {
                int[] var4 = this.method865(1, arg1, (byte) 51);
                int[] var5 = this.method865(2, arg1, (byte) 90);
                for (int var6 = 0; class647.field9368 > var6; ++var6) {
                    int var7 = var4[var6] >> 4 & 255;
                    int var8 = var5[var6] * this.field8877 >> 12;
                    int var9 = class215.field2959[var7] * var8 >> 12;
                    int var10 = class101.field1202[var7] * var8 >> 12;
                    int var11 = var6 - -(var9 >> 12) & class619.field8980;
                    int var12 = class444.field6649 & arg1 - -(var10 >> 12);
                    int[] var13 = this.method865(0, var12, (byte) -49);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method3532(byte arg0) {
        if (arg0 == 54) {
            field8881 = null;
            field8879 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        int var2 = 49 / ((arg0 - -46) / 45);
        class315.method2072((byte) -12);
        ++field8872;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class608() {
        super(3, false);
    }

    static {
        new class474("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field8881 = new byte[32896];
        int var0 = 0;
        for (int var1 = 0; ~var1 > -257; ++var1) {
            for (int var2 = 0; var1 >= var2; ++var2) {
                field8881[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
