import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class132 extends class3 {

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    private int field2021 = 4096;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    private int field2028 = 4096;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    private int field2027 = 4096;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2024 = " ";

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2022 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "Z")
    public static boolean field2030 = false;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "Lnm;")
    public static class221 field2031;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "[I")
    public static int[] field2023;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lfh;IZ)V", line = 24)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field2021 = arg0.method2250(-1613178296);
        } else if (arg1 == 1) {
            this.field2027 = arg0.method2250(-1613178296);
        } else if (arg1 == 2) {
            this.field2028 = arg0.method2250(-1613178296);
        }
        if (arg2) {
            this.method22(127, -37);
        }
        field2017++;
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V", line = 62)
    public static final void method858(int arg0) {
        field2020++;
        if (arg0 < 37) {
            method860(false, 123);
        }
        for (int var1 = 0; var1 < class222.field3433; var1++) {
            class113 var2 = class187.method1290(63, var1);
            if (var2 != null && var2.field1657 == 0) {
                class353.field5617[var1] = 0;
                class170.field2650[var1] = 0;
            }
        }
        class98.field1410 = new class4(16);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 89)
    public class132() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[F", line = 101)
    public static final float[] method859(int arg0, int arg1) {
        field2026++;
        float var2 = class234.method1611() + class234.method1612();
        int var3 = class234.method1613();
        class218.field3365[3] = 1.0F;
        float var4 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var5 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        if (arg0 != -22535) {
            field2024 = (String) null;
        }
        float var7 = 0.58823526F;
        class218.field3365[0] = var5 * ((float) (class235.method1623(arg1, 16767926) >> 16) / 255.0F) * var7 * var2;
        class218.field3365[1] = var7 * (float) class235.method1623(255, arg1 >> 8) / 255.0F * var4 * var2;
        class218.field3365[2] = var2 * (float) class235.method1623(arg1, 255) / 255.0F * var6 * var7;
        return class218.field3365;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[[I", line = 132)
    public final int[][] method22(int arg0, int arg1) {
        if (arg0 != -21194) {
            return (int[][]) ((int[][]) null);
        }
        field2018++;
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556) {
            int[][] var4 = this.method16(arg1, 0, (byte) 98);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class326.field5342; var11++) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var8[var11];
                if (var12 == var13 && var13 == var14) {
                    var7[var11] = this.field2021 * var12 >> 12;
                    var10[var11] = this.field2027 * var13 >> 12;
                    var9[var11] = this.field2028 * var14 >> 12;
                } else {
                    var7[var11] = this.field2021;
                    var10[var11] = this.field2027;
                    var9[var11] = this.field2028;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(ZI)V", line = 194)
    public static final void method860(boolean arg0, int arg1) {
        field2029++;
        if (class222.field3434 == arg0) {
            return;
        }
        class222.field3434 = arg0;
        if (arg1 <= 40) {
            field2022 = (BigInteger) null;
        }
        class148.method1052(128);
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V", line = 212)
    public static void method861(int arg0) {
        field2022 = null;
        field2023 = null;
        field2024 = null;
        field2031 = null;
        int var1 = -101 / ((arg0 - 24) / 62);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIB)V", line = 232)
    public static final void method862(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class220 var5 = (class220) class294.field4888.method29((long) arg0, arg4 ^ 0xFFFFFF8F);
        if (var5 == null) {
            var5 = new class220();
            class294.field4888.method37(false, var5, (long) arg0);
        }
        if (var5.field3377.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field3377.length; var8++) {
                var6[var8] = var5.field3377[var8];
                var7[var8] = var5.field3375[var8];
            }
            for (int var9 = var5.field3377.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3375 = var7;
            var5.field3377 = var6;
        }
        var5.field3377[arg2] = arg1;
        if (arg4 == -24) {
            var5.field3375[arg2] = arg3;
            field2025++;
        }
    }
}
