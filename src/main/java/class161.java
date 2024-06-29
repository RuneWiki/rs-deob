import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class161 extends class398 {

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    private int field2156 = 4096;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Z")
    private boolean field2154 = true;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "[[I")
    public static int[][] field2159 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field2155 = 1;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "[I")
    public static int[] field2160 = new int[50];

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2161 = "Loading config - ";

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "Llm;")
    public static class347 field2157;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V", line = 6)
    public static void method992(int arg0) {
        field2161 = null;
        field2160 = null;
        field2159 = null;
        if (arg0 > -41) {
            field2159 = null;
        }
        field2157 = null;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 19)
    public class161() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lnj;II)V", line = 38)
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg2 != -13132) {
            field2155 = 16;
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field2154 = ~arg0.method1348(-105) == -2;
            }
        } else {
            this.field2156 = arg0.method1343(arg2 ^ -13237);
        }
        ++field2153;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(III)Le;", line = 74)
    public static final class97 method993(int arg0, int arg1, int arg2) {
        class254 var3 = class213.field2852[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3512;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[[I", line = 83)
    public final int[][] method99(int arg0, int arg1) {
        ++field2162;
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (arg1 != 2) {
            this.method99(83, -63);
        }
        if (super.field5933.field4847) {
            int[] var4 = this.method2558(0, 29295, arg0 - 1 & class411.field6070);
            int[] var5 = this.method2558(0, 29295, arg0);
            int[] var6 = this.method2558(0, arg1 + 29293, class411.field6070 & arg0 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class140.field1922 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2156;
                int var12 = (var5[class242.field3233 & var10 + 1] + -var5[class242.field3233 & var10 + -1]) * this.field2156;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var19 = 0;
                    var18 = 0;
                    var20 = 0;
                }
                if (this.field2154) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZZ)V", line = 169)
    public static final void method994(boolean arg0, boolean arg1) {
        ++field2158;
        if (!arg0) {
            method995((class98) null, -117, -37, -4, (boolean[]) null);
        }
        byte[][] var2;
        if (arg1) {
            var2 = class94.field1346;
        } else {
            var2 = class146.field2006;
        }
        int var3 = class379.field5503.length;
        for (int var4 = 0; var4 < var3; ++var4) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class147.field2015[var4] >> 8) * 64 - class7.field138;
                int var7 = (class147.field2015[var4] & 255) * 64 - class200.field2660;
                class281.method1935(121);
                class226.method1311(class365.field5294, var7, var6, var5, class61.field807, 6554, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lri;III[Z)Z", line = 212)
    public static final boolean method995(class98 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class191.field2557 != class12.field205) {
            int var6 = class265.field3846[arg1].method745(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class351 var8 = class265.field3846[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method745(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method743(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method739(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }
}
