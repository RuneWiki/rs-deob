import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class148 extends class477 {

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "[I")
    private int[] field1919 = new int[512];

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Z")
    public static boolean field1917 = false;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field1918 = 0;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field1922 = 2;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)V", line = 9)
    public static final void method914(byte arg0, int arg1) {
        class5 var2 = class381.field5675;
        synchronized (class381.field5675) {
            if (arg0 > -83) {
                method914((byte) 86, -26);
            }
            class381.field5675.method39(false, arg1);
        }
        field1926++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)I", line = 24)
    public static final int method915(int arg0, byte arg1) {
        field1925++;
        if (arg1 < 39) {
            field1918 = -35;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Leq;)V", line = 41)
    public static final void method916(class134 arg0) {
        for (int var1 = class206.field2864; var1 < class399.field5881; var1++) {
            for (int var2 = 0; var2 < class282.field4031; var2++) {
                for (int var3 = 0; var3 < class98.field1339; var3++) {
                    class468 var4 = class358.field5312[var1][var2][var3];
                    if (var4 != null) {
                        class403 var5 = var4.field6778;
                        class403 var6 = var4.field6766;
                        if (var5 != null && var5.method723(17774)) {
                            class37.method295(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method723(17774)) {
                                class37.method295(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method719(0, 0, -1, var5, 0, false, arg0);
                                var6.method722(0);
                            }
                            var5.method722(0);
                        }
                        for (class323 var7 = var4.field6769; var7 != null; var7 = var7.field4727) {
                            class210 var9 = var7.field4726;
                            if (var9 != null && var9.method723(17774)) {
                                class37.method295(arg0, var9, var1, var2, var3, var9.field2962 + 1 - var9.field2972, var9.field2957 - var9.field2975 + 1);
                                var9.method722(0);
                            }
                        }
                        class79 var8 = var4.field6761;
                        if (var8 != null && var8.method723(17774)) {
                            class157.method1000(arg0, var8, var1, var2, var3);
                            var8.method722(0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V", line = 121)
    public class148(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field1919[var3] = this.field1919[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field1919[var5];
            this.field1919[var5] = this.field1919[var5 + 256] = this.field1919[var4];
            this.field1919[var4] = this.field1919[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIFBIIFI[FFF)V", line = 160)
    public final void method917(int arg0, int arg1, float arg2, byte arg3, int arg4, int arg5, float arg6, int arg7, float[] arg8, float arg9, float arg10) {
        field1921++;
        int var12 = (int) ((float) arg4 * arg9 - 1.0F);
        int var13 = -32 / ((-arg3 - 50) / 54);
        int var14 = var12 & 0xFF;
        int var15 = (int) ((float) arg7 * arg2 - 1.0F);
        int var16 = var15 & 0xFF;
        int var17 = (int) ((float) arg5 * arg6 - 1.0F);
        int var18 = var17 & 0xFF;
        float var19 = (float) arg0 * arg6;
        int var20 = (int) var19;
        int var21 = var20 + 1;
        float var22 = var19 - (float) var20;
        float var23 = 1.0F - var22;
        int var24 = var21 & var18;
        int var25 = var20 & var18;
        float var26 = class15.method111(var22, false);
        int var27 = this.field1919[var25];
        int var28 = this.field1919[var24];
        for (int var29 = 0; var29 < arg7; var29++) {
            float var30 = (float) var29 * arg2;
            int var31 = (int) var30;
            int var32 = var31 + 1;
            float var33 = var30 - (float) var31;
            float var34 = 1.0F - var33;
            int var35 = var31 & var16;
            float var36 = class15.method111(var33, false);
            int var37 = var32 & var16;
            int var38 = this.field1919[var35 + var27];
            int var39 = this.field1919[var37 + var27];
            int var40 = this.field1919[var28 + var35];
            int var41 = this.field1919[var28 + var37];
            for (int var42 = 0; var42 < arg4; var42++) {
                float var43 = (float) var42 * arg9;
                int var44 = (int) var43;
                int var45 = var44 + 1;
                float var46 = (float) (-var44) + var43;
                float var47 = 1.0F - var46;
                int var48 = var45 & var14;
                int var49 = var44 & var14;
                float var50 = class15.method111(var46, false);
                arg8[arg1++] = arg10 * class477.method2788(class477.method2788(class477.method2788(class72.method488(var46, class500.method3013(7, this.field1919[var48 + var41]), var22, 2, var33), var50, -11001, class72.method488(var47, class500.method3013(this.field1919[var49 + var41], 7), var22, 2, var33)), var36, -11001, class477.method2788(class72.method488(var46, class500.method3013(this.field1919[var40 + var48], 7), var22, 2, var34), var50, -11001, class72.method488(var47, class500.method3013(this.field1919[var49 + var40], 7), var22, 2, var34))), var26, -11001, class477.method2788(class477.method2788(class72.method488(var46, class500.method3013(7, this.field1919[var39 + var48]), var23, 2, var33), var50, -11001, class72.method488(var47, class500.method3013(this.field1919[var39 + var49], 7), var23, 2, var33)), var36, -11001, class477.method2788(class72.method488(var46, class500.method3013(this.field1919[var38 + var48], 7), var23, 2, var34), var50, -11001, class72.method488(var47, class500.method3013(this.field1919[var49 + var38], 7), var23, 2, var34))));
            }
        }
    }
}
