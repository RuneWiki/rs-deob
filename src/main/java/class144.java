import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class144 extends class215 {

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "[I")
    private int[] field1848 = new int[512];

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lkg;")
    public static class179 field1847 = new class179(75, -1);

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lub;")
    public static class18 field1850 = new class18();

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Lqn;")
    public static class47 field1851;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 3)
    public static void method965(int arg0) {
        field1851 = null;
        field1850 = null;
        if (arg0 != 0) {
            method968(-102L, -119, 127, true, true);
        }
        field1847 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V", line = 15)
    public static final void method966(int arg0) {
        field1846++;
        class210 var1 = null;
        try {
            class121 var2 = class219.field2794.method2882("2", true, (byte) -74);
            while (var2.field1628 == 0) {
                class199.method1251(1L, (byte) 25);
            }
            if (var2.field1628 == 1) {
                var1 = (class210) var2.field1627;
                class463 var3 = new class463(class289.field3695 * 6 + 3);
                var3.method2729(1, false);
                var3.method2759((byte) -46, class289.field3695);
                for (int var4 = 0; var4 < class372.field4824.length; var4++) {
                    if (class341.field4300[var4]) {
                        var3.method2759((byte) -19, var4);
                        var3.method2777(class372.field4824[var4], -11);
                    }
                }
                var1.method1301(1, var3.field6618, var3.field6631, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method1303((byte) -66);
            }
        } catch (Exception var5) {
        }
        class53.field710 = class504.method3034((byte) -116);
        if (arg0 < 109) {
            field1850 = null;
        }
        class40.field514 = false;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IFIIIFB[FFIF)V", line = 72)
    public final void method967(int arg0, float arg1, int arg2, int arg3, int arg4, float arg5, byte arg6, float[] arg7, float arg8, int arg9, float arg10) {
        field1845++;
        int var12 = (int) ((float) arg3 * arg1 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg0 * arg10 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg4 * arg8 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg9 * arg8;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        float var24 = class436.method2560(-107, var21);
        int var25 = var19 & var17;
        int var26 = this.field1848[var25];
        int var27 = this.field1848[var23];
        int var28 = 0;
        int var29 = -105 / ((arg6 + 40) / 47);
        while (var28 < arg0) {
            float var30 = (float) var28 * arg10;
            int var31 = (int) var30;
            int var32 = var31 + 1;
            float var33 = var30 - (float) var31;
            float var34 = 1.0F - var33;
            int var35 = var32 & var15;
            float var36 = class436.method2560(-54, var33);
            int var37 = var31 & var15;
            int var38 = this.field1848[var26 + var37];
            int var39 = this.field1848[var26 + var35];
            int var40 = this.field1848[var27 + var37];
            int var41 = this.field1848[var27 + var35];
            for (int var42 = 0; var42 < arg3; var42++) {
                float var43 = (float) var42 * arg1;
                int var44 = (int) var43;
                int var45 = var44 + 1;
                float var46 = var43 - (float) var44;
                float var47 = 1.0F - var46;
                int var48 = var44 & var13;
                int var49 = var45 & var13;
                float var50 = class436.method2560(-103, var46);
                arg7[arg2++] = arg5 * class428.method2508(124, class428.method2508(119, class428.method2508(127, class503.method3033((byte) -116, var21, var33, var46, class378.method2145(7, this.field1848[var49 + var41])), var50, class503.method3033((byte) -113, var21, var33, var47, class378.method2145(7, this.field1848[var41 + var48]))), var36, class428.method2508(121, class503.method3033((byte) -109, var21, var34, var46, class378.method2145(this.field1848[var40 + var49], 7)), var50, class503.method3033((byte) -118, var21, var34, var47, class378.method2145(7, this.field1848[var48 + var40])))), var24, class428.method2508(121, class428.method2508(120, class503.method3033((byte) -94, var22, var33, var46, class378.method2145(this.field1848[var39 + var49], 7)), var50, class503.method3033((byte) -121, var22, var33, var47, class378.method2145(this.field1848[var39 + var48], 7))), var36, class428.method2508(124, class503.method3033((byte) -124, var22, var34, var46, class378.method2145(7, this.field1848[var38 + var49])), var50, class503.method3033((byte) -122, var22, var34, var47, class378.method2145(7, this.field1848[var38 + var48])))));
            }
            var28++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(JIIZZ)Ljava/lang/String;", line = 163)
    public static final String method968(long arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field1849++;
        char var6 = ',';
        char var7 = '.';
        if (arg1 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg1 == 2) {
            var7 = ' ';
        }
        boolean var8 = arg4;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg0 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V", line = 252)
    public class144(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field1848[var3] = this.field1848[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field1848[var5];
            this.field1848[var5] = this.field1848[var5 + 256] = this.field1848[var4];
            this.field1848[var4] = this.field1848[var4 + 256] = var6;
        }
    }
}
