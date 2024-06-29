import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class219 extends class385 {

    @OriginalMember(owner = "client!al", name = "h", descriptor = "[I")
    private int[] field2815 = new int[512];

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field2814 = -1;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field2816 = Boolean.FALSE;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static final void method1397(int arg0) {
        class11 var1 = class65.field826;
        synchronized (class65.field826) {
            class65.field826.method84(-56);
            if (arg0 <= 93) {
                field2814 = -88;
            }
        }
        field2817++;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
    public static void method1398(int arg0) {
        field2816 = null;
        if (arg0 != 28036) {
            field2814 = 106;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(FIFIF[FIIFII)V")
    public final void method1399(float arg0, int arg1, float arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, float arg8, int arg9, int arg10) {
        field2818++;
        int var12 = (int) ((float) arg10 * arg0 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg3 * arg2 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg6 * arg8 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg1 * arg8;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        float var23 = class388.method2313((byte) 80, var21);
        int var24 = var19 & var17;
        int var25 = var20 & var17;
        if (arg7 != 7) {
            return;
        }
        int var26 = this.field2815[var24];
        int var27 = this.field2815[var25];
        for (int var28 = 0; var28 < arg3; var28++) {
            float var29 = (float) var28 * arg2;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            int var35 = var31 & var15;
            float var36 = class388.method2313((byte) 86, var32);
            int var37 = this.field2815[var26 + var34];
            int var38 = this.field2815[var35 + var26];
            int var39 = this.field2815[var27 + var34];
            int var40 = this.field2815[var27 + var35];
            for (int var41 = 0; var41 < arg10; var41++) {
                float var42 = (float) var41 * arg0;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                int var48 = var44 & var13;
                float var49 = class388.method2313((byte) 115, var45);
                arg5[arg9++] = arg4 * class39.method247(class10.method73(arg7, -520), class39.method247(-513, class39.method247(-513, class311.method1854(class60.method339(7, this.field2815[var37 + var47]), var22, 2, var33, var46), class311.method1854(class60.method339(7, this.field2815[var48 + var37]), var22, 2, var33, var45), var49), class39.method247(-513, class311.method1854(class60.method339(this.field2815[var47 + var38], 7), var22, 2, var32, var46), class311.method1854(class60.method339(7, this.field2815[var38 + var48]), var22, arg7 - 5, var32, var45), var49), var36), class39.method247(-513, class39.method247(-513, class311.method1854(class60.method339(this.field2815[var47 + var39], 7), var21, 2, var33, var46), class311.method1854(class60.method339(this.field2815[var39 + var48], 7), var21, 2, var33, var45), var49), class39.method247(-513, class311.method1854(class60.method339(this.field2815[var47 + var40], 7), var21, 2, var32, var46), class311.method1854(class60.method339(7, this.field2815[var40 + var48]), var21, 2, var32, var45), var49), var36), var23);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V")
    public class219(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field2815[var3] = this.field2815[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field2815[var5];
            this.field2815[var5] = this.field2815[var5 + 256] = this.field2815[var4];
            this.field2815[var4] = this.field2815[var4 + 256] = var6;
        }
    }
}
