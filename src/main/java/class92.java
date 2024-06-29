import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class92 extends class585 {

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "[I")
    private int[] field1431 = new int[512];

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "Ldv;")
    public static class566 field1426 = new class566(79, 7);

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field1430 = 1405;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
    public static void method677(byte arg0) {
        field1426 = null;
        if (arg0 != 60) {
            field1426 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)I")
    public static final int method678(int arg0, int arg1) {
        field1428++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else if (arg0 == -24501) {
            throw new IllegalArgumentException("");
        } else {
            return 23;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
    public static final void method679(int arg0) {
        for (class421 var1 = (class421) class41.field806.method456((byte) -119); var1 != null; var1 = (class421) class41.field806.method460((byte) 75)) {
            if (var1.field5912) {
                var1.method2516(0);
            }
        }
        field1429++;
        int var2 = -62 % ((arg0 + 35) / 49);
        for (class421 var3 = (class421) class495.field6924.method456((byte) -56); var3 != null; var3 = (class421) class495.field6924.method460((byte) 65)) {
            if (var3.field5912) {
                var3.method2516(0);
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZIF[FFFIFI)V")
    public final void method680(int arg0, int arg1, boolean arg2, int arg3, float arg4, float[] arg5, float arg6, float arg7, int arg8, float arg9, int arg10) {
        field1427++;
        int var12 = (int) ((float) arg10 * arg7 - 1.0F);
        int var13 = var12 & 0xFF;
        if (!arg2) {
            field1426 = null;
        }
        int var14 = (int) ((float) arg3 * arg4 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg1 * arg6 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg8 * arg6;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        float var24 = class283.method1818(9, var21);
        int var25 = var19 & var17;
        int var26 = this.field1431[var25];
        int var27 = this.field1431[var23];
        for (int var28 = 0; var28 < arg3; var28++) {
            float var29 = (float) var28 * arg4;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            float var35 = class283.method1818(9, var32);
            int var36 = var30 & var15;
            int var37 = this.field1431[var26 + var36];
            int var38 = this.field1431[var26 + var34];
            int var39 = this.field1431[var36 + var27];
            int var40 = this.field1431[var27 + var34];
            for (int var41 = 0; var41 < arg10; var41++) {
                float var42 = (float) var41 * arg7;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                float var47 = class283.method1818(9, var45);
                int var48 = var44 & var13;
                int var49 = var43 & var13;
                arg5[arg0++] = arg9 * class561.method3196(-124, class561.method3196(115, class561.method3196(-65, class567.method3226(var46, class589.method3454(this.field1431[var49 + var37], 7), var22, var33, (byte) -128), var47, class567.method3226(var45, class589.method3454(7, this.field1431[var48 + var37]), var22, var33, (byte) 83)), var35, class561.method3196(119, class567.method3226(var46, class589.method3454(7, this.field1431[var38 + var49]), var22, var32, (byte) 44), var47, class567.method3226(var45, class589.method3454(this.field1431[var48 + var38], 7), var22, var32, (byte) -128))), var24, class561.method3196(120, class561.method3196(23, class567.method3226(var46, class589.method3454(7, this.field1431[var49 + var39]), var21, var33, (byte) 89), var47, class567.method3226(var45, class589.method3454(this.field1431[var39 + var48], 7), var21, var33, (byte) 22)), var35, class561.method3196(26, class567.method3226(var46, class589.method3454(7, this.field1431[var40 + var49]), var21, var32, (byte) 72), var47, class567.method3226(var45, class589.method3454(7, this.field1431[var48 + var40]), var21, var32, (byte) -126))));
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(I)V")
    public class92(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field1431[var3] = this.field1431[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field1431[var5];
            this.field1431[var5] = this.field1431[var5 + 256] = this.field1431[var4];
            this.field1431[var4] = this.field1431[var4 + 256] = var6;
        }
    }
}
