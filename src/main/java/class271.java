import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class271 extends class312 {

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "[I")
    private int[] field4084 = new int[512];

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[I")
    public static int[] field4079 = new int[5];

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Ldg;")
    public static class376 field4081 = new class376(33, 7);

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Z")
    public static boolean field4088 = true;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lft;")
    public static class4 field4077;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field4089;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "[I")
    public static int[] field4085;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "[[I")
    public static int[][] field4086;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static final void method1787(int arg0) {
        class210.field2948 = null;
        class70.field1252 = null;
        class307.field4549 = null;
        class44.field706 = null;
        class554.field7854 = null;
        class641.field9045 = null;
        class123.field1862 = null;
        field4080++;
        class296.field4352 = null;
        if (arg0 != 7) {
            field4087 = -115;
        }
        class7.field66 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1788(String arg0, int arg1) {
        field4082++;
        return arg1 > -41 ? true : class387.method2378(field4089 == null ? (field4089 = method1792("hq")) : field4089, true, arg0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IFIFI[FIIFFI)V")
    public final void method1789(int arg0, float arg1, int arg2, float arg3, int arg4, float[] arg5, int arg6, int arg7, float arg8, float arg9, int arg10) {
        field4078++;
        int var12 = (int) ((float) arg7 * arg9 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg6 * arg8 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg10 * arg3 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg4 * arg3;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        int var24 = var20 & var17;
        int var25 = -96 / ((arg0 - 39) / 37);
        float var26 = class618.method3431(var21, (byte) -95);
        int var27 = this.field4084[var23];
        int var28 = this.field4084[var24];
        for (int var29 = 0; var29 < arg6; var29++) {
            float var30 = (float) var29 * arg8;
            int var31 = (int) var30;
            int var32 = var31 + 1;
            float var33 = var30 - (float) var31;
            float var34 = 1.0F - var33;
            float var35 = class618.method3431(var33, (byte) -53);
            int var36 = var31 & var15;
            int var37 = var32 & var15;
            int var38 = this.field4084[var27 + var36];
            int var39 = this.field4084[var37 + var27];
            int var40 = this.field4084[var28 + var36];
            int var41 = this.field4084[var28 + var37];
            for (int var42 = 0; var42 < arg7; var42++) {
                float var43 = (float) var42 * arg9;
                int var44 = (int) var43;
                int var45 = var44 + 1;
                float var46 = var43 - (float) var44;
                float var47 = 1.0F - var46;
                float var48 = class618.method3431(var46, (byte) -118);
                int var49 = var44 & var13;
                int var50 = var45 & var13;
                arg5[arg2++] = arg1 * class97.method793(class97.method793(class97.method793(class195.method1319((byte) 93, var47, var22, class689.method3797(7, this.field4084[var49 + var38]), var34), false, class195.method1319((byte) 68, var46, var22, class689.method3797(this.field4084[var38 + var50], 7), var34), var48), false, class97.method793(class195.method1319((byte) 70, var47, var22, class689.method3797(7, this.field4084[var39 + var49]), var33), false, class195.method1319((byte) 107, var46, var22, class689.method3797(7, this.field4084[var39 + var50]), var33), var48), var35), false, class97.method793(class97.method793(class195.method1319((byte) 106, var47, var21, class689.method3797(this.field4084[var40 + var49], 7), var34), false, class195.method1319((byte) 85, var46, var21, class689.method3797(7, this.field4084[var40 + var50]), var34), var48), false, class97.method793(class195.method1319((byte) 120, var47, var21, class689.method3797(this.field4084[var41 + var49], 7), var33), false, class195.method1319((byte) 67, var46, var21, class689.method3797(this.field4084[var41 + var50], 7), var33), var48), var35), var26);
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method1790(int arg0) {
        field4079 = null;
        field4085 = null;
        field4081 = null;
        field4077 = null;
        if (arg0 != 255) {
            method1788(null, 112);
        }
        field4086 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BIZLvb;ZILvb;)I")
    public static final int method1791(byte arg0, int arg1, boolean arg2, class178 arg3, boolean arg4, int arg5, class178 arg6) {
        field4083++;
        int var7 = class309.method1963(0, arg2, arg5, arg3, arg6);
        if (arg0 <= 107) {
            return 82;
        } else if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var8 = class309.method1963(0, arg4, arg1, arg3, arg6);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
    public class271(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field4084[var3] = this.field4084[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field4084[var5];
            this.field4084[var5] = this.field4084[var5 + 256] = this.field4084[var4];
            this.field4084[var4] = this.field4084[var4 + 256] = var6;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1792(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
