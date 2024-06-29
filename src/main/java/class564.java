import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class564 extends class588 {

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "[I")
    private int[] field7619 = new int[512];

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "Lfc;")
    public static class235 field7618 = new class235("WTQA", 2);

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "Lou;")
    public static class562 field7621 = new class562();

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "Lje;")
    public static class367 field7622 = new class367();

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "Lf;")
    public static class702 field7623;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)V")
    public static void method3157(byte arg0) {
        field7618 = null;
        field7623 = null;
        field7621 = null;
        field7622 = null;
        int var1 = -46 % ((61 - arg0) / 62);
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(II)I")
    public static final int method3158(int arg0, int arg1) {
        return class437.field6073 == null ? 0 : class437.field6073[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(FI[FFFIIIIIF)V")
    public final void method3159(float arg0, int arg1, float[] arg2, float arg3, float arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float arg10) {
        field7620++;
        if (arg7 >= -30) {
            field7622 = null;
        }
        int var12 = (int) ((float) arg1 * arg3 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg5 * arg10 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg8 * arg4 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg6 * arg4;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        float var23 = class402.method2343(true, var21);
        int var24 = var19 & var17;
        int var25 = var20 & var17;
        int var26 = this.field7619[var24];
        int var27 = this.field7619[var25];
        for (int var28 = 0; var28 < arg5; var28++) {
            float var29 = (float) var28 * arg10;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            int var35 = var31 & var15;
            float var36 = class402.method2343(true, var32);
            int var37 = this.field7619[var26 + var34];
            int var38 = this.field7619[var26 + var35];
            int var39 = this.field7619[var27 + var34];
            int var40 = this.field7619[var27 + var35];
            for (int var41 = 0; var41 < arg1; var41++) {
                float var42 = (float) var41 * arg3;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                float var47 = class402.method2343(true, var45);
                int var48 = var43 & var13;
                int var49 = var44 & var13;
                arg2[arg9++] = class450.method2561(19416, class450.method2561(19416, class450.method2561(19416, class58.method483((byte) -106, var45, class136.method950(7, this.field7619[var49 + var40]), var21, var32), class58.method483((byte) -111, var46, class136.method950(this.field7619[var48 + var40], 7), var21, var32), var47), class450.method2561(19416, class58.method483((byte) -115, var45, class136.method950(7, this.field7619[var49 + var39]), var21, var33), class58.method483((byte) -89, var46, class136.method950(7, this.field7619[var48 + var39]), var21, var33), var47), var36), class450.method2561(19416, class450.method2561(19416, class58.method483((byte) -99, var45, class136.method950(this.field7619[var38 + var49], 7), var22, var32), class58.method483((byte) -49, var46, class136.method950(this.field7619[var38 + var48], 7), var22, var32), var47), class450.method2561(19416, class58.method483((byte) -48, var45, class136.method950(this.field7619[var37 + var49], 7), var22, var33), class58.method483((byte) -99, var46, class136.method950(7, this.field7619[var37 + var48]), var22, var33), var47), var36), var23) * arg0;
            }
        }
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(I)V")
    public class564(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field7619[var3] = this.field7619[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field7619[var5];
            this.field7619[var5] = this.field7619[var5 + 256] = this.field7619[var4];
            this.field7619[var4] = this.field7619[var4 + 256] = var6;
        }
    }
}
