import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class75 extends class93 {

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    private int field1569 = 4096;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field1565 = 2301979;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "[I")
    public static int[] field1568 = new int[50];

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "Ljd;")
    public static class92 field1575 = class202.method1325((byte) 90, "");

    @OriginalMember(owner = "client!he", name = "db", descriptor = "Ljd;")
    public static class92 field1576 = class202.method1325((byte) 90, "swe");

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "Ljd;")
    private static class92 field1573 = class202.method1325((byte) 90, "Loaded wordpack");

    @OriginalMember(owner = "client!he", name = "T", descriptor = "Ljd;")
    public static class92 field1566 = field1573;

    @OriginalMember(owner = "client!he", name = "fb", descriptor = "Ljd;")
    private static class92 field1578 = class202.method1325((byte) 90, "Loading)3)3)3");

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "Ljd;")
    public static class92 field1572 = field1578;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!he", name = "eb", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "[I")
    public static int[] field1571;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "[I")
    public static int[] field1574;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILnh;)Lmh;")
    public static final class124 method519(int arg0, int arg1, class133 arg2) {
        ++field1577;
        byte[] var3 = arg2.method873(arg1, arg0);
        return var3 == null ? null : new class124(var3);
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "(B)V")
    public static void method520(byte arg0) {
        if (arg0 < 95) {
            method521((int[]) null, 40, 30, 27, 58, -76);
        }
        field1572 = null;
        field1573 = null;
        field1578 = null;
        field1576 = null;
        field1566 = null;
        field1568 = null;
        field1574 = null;
        field1575 = null;
        field1571 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([IIIIII)V")
    public static final void method521(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class43 var6 = class31.field698[arg3][arg4][arg5];
        if (var6 != null) {
            class59 var7 = var6.field960;
            if (var7 == null) {
                class82 var10 = var6.field961;
                if (var10 != null) {
                    int var11 = var10.field1670;
                    int var12 = var10.field1663;
                    int var13 = var10.field1666;
                    int var14 = var10.field1675;
                    int[] var15 = class90.field1775[var11];
                    int[] var16 = class31.field717[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 2] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 3] = var14;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var8 = var7.field1237;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        ++field1567;
        if (arg2 == 0) {
            if (~arg0 == -1) {
                this.field1569 = arg1.method442(-21351);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int var3 = 30 / ((67 - arg1) / 42);
        int[] var4 = super.field1887.method916(arg0, -92);
        ++field1570;
        if (super.field1887.field2757) {
            int[] var5 = this.method648((byte) 37, class5.field279 & arg0 + -1, 0);
            int[] var6 = this.method648((byte) 117, arg0, 0);
            int[] var7 = this.method648((byte) 89, class5.field279 & arg0 + 1, 0);
            for (int var8 = 0; ~var8 > ~class150.field2985; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field1569;
                int var10 = (var6[class2.field163 & var8 + 1] - var6[var8 + -1 & class2.field163]) * this.field1569;
                int var11 = var9 >> 12;
                int var12 = var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = (int) (4096.0D * Math.sqrt((double) ((var13 + var14 + 4096) / 4096)));
                int var16 = ~var15 != -1 ? 16777216 / var15 : 0;
                var4[var8] = -var16 + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class75() {
        super(1, true);
    }
}
