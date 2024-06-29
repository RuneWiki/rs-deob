import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class63 extends class202 {

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    private int field991 = 409;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
    private int field992 = 4096;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    private int field996 = 4096;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "[I")
    private int[] field995 = new int[3];

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    private int field998 = 4096;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "Lqu;")
    public static class219 field999 = new class219(74, 12);

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "Lqu;")
    public static class219 field1001 = new class219(13, 8);

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "[C")
    public static char[] field1002 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "Lqc;")
    public static class140 field1000;

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
    public class63() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)V")
    public static void method468(int arg0) {
        field1002 = null;
        if (arg0 == 237) {
            field999 = null;
            field1000 = null;
            field1001 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        ++field993;
        int var4 = 109 / ((-46 - arg1) / 50);
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var6 = arg0.method1452(3);
                            this.field995[1] = class272.method1842(65280, var6) >> 4;
                            this.field995[0] = class272.method1842(var6 << 4, 267386880);
                            this.field995[2] = class272.method1842(var6 >> 12, 0);
                        }
                    } else {
                        this.field996 = arg0.method1455(-3387);
                    }
                } else {
                    this.field992 = arg0.method1455(-3387);
                }
            } else {
                this.field998 = arg0.method1455(-3387);
            }
        } else {
            this.field991 = arg0.method1455(-3387);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        ++field997;
        if (arg0 != -1) {
            return null;
        } else {
            int[][] var3 = super.field3081.method1050(arg1, arg0 + 79);
            if (super.field3081.field2432) {
                int[][] var4 = this.method1382(0, arg1, arg0 ^ -81);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class276.field4375; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field995[0] + var12;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (var13 > this.field991) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field995[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~var15 < ~this.field991) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = var16 - this.field995[2];
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (~var17 < ~this.field991) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field996 * var12 >> 12;
                                var9[var11] = this.field992 * var14 >> 12;
                                var10[var11] = this.field998 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }
}
