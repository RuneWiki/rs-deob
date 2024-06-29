import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class348 extends class451 {

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "[I")
    private int[] field4769 = new int[512];

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "Lbj;")
    public static class159 field4771 = new class159(16);

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field4772 = -1;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "Z")
    public static boolean field4774 = true;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "[Z")
    public static boolean[] field4775 = new boolean[200];

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Lvh;")
    public static class240 field4773;

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(I)V", line = 141)
    public class348(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field4769[var3] = this.field4769[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field4769[var5];
            this.field4769[var5] = this.field4769[var5 + 256] = this.field4769[var4];
            this.field4769[var4] = this.field4769[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILir;)V", line = 11)
    public static final void method1928(int arg0, class22 arg1) {
        if (arg0 != 23458) {
            field4772 = -50;
        }
        field4768++;
        int var2 = arg1.field287 - class393.field5484;
        int var3 = arg1.field346 * 128 + (arg1.method167(-1) * 64);
        int var4 = arg1.field351 * 128 + arg1.method167(-1) * 64;
        arg1.field371 = 0;
        arg1.field461 += (var4 - arg1.field461) / var2;
        arg1.field466 += (var3 - arg1.field466) / var2;
        if (arg1.field293 == 0) {
            arg1.method158(8192, true);
        }
        if (arg1.field293 == 1) {
            arg1.method158(12288, true);
        }
        if (arg1.field293 == 2) {
            arg1.method158(0, true);
        }
        if (arg1.field293 == 3) {
            arg1.method158(4096, true);
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V", line = 44)
    public static final void method1929(byte arg0) {
        field4770++;
        if (arg0 == -14) {
            class408.field5647 = true;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(FIFIIFFII[FI)V", line = 55)
    public final void method1930(float arg0, int arg1, float arg2, int arg3, int arg4, float arg5, float arg6, int arg7, int arg8, float[] arg9, int arg10) {
        field4767++;
        int var12 = (int) ((float) arg4 * arg5 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg1 * arg0 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg8 * arg6 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg10 * arg6;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = (float) arg3 - var21;
        int var23 = var19 & var17;
        float var24 = class444.method2637((byte) 103, var21);
        int var25 = var20 & var17;
        int var26 = this.field4769[var23];
        int var27 = this.field4769[var25];
        for (int var28 = 0; var28 < arg1; var28++) {
            float var29 = (float) var28 * arg0;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            int var35 = var30 & var15;
            float var36 = class444.method2637((byte) 100, var32);
            int var37 = this.field4769[var26 + var35];
            int var38 = this.field4769[var34 + var26];
            int var39 = this.field4769[var27 + var35];
            int var40 = this.field4769[var27 + var34];
            for (int var41 = 0; var41 < arg4; var41++) {
                float var42 = (float) var41 * arg5;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                int var48 = var43 & var13;
                float var49 = class444.method2637((byte) 78, var45);
                arg9[arg7++] = class492.method2917(arg3 - 77, class492.method2917(45, class492.method2917(arg3 + 63, class53.method338(class63.method396(arg3, 1), var21, var45, class118.method750(7, this.field4769[var40 + var47]), var32), var49, class53.method338(0, var21, var46, class118.method750(7, this.field4769[var40 + var48]), var32)), var36, class492.method2917(53, class53.method338(class63.method396(arg3, 1), var21, var45, class118.method750(7, this.field4769[var39 + var47]), var33), var49, class53.method338(0, var21, var46, class118.method750(7, this.field4769[var39 + var48]), var33))), var24, class492.method2917(64, class492.method2917(class63.method396(arg3, -72), class53.method338(class63.method396(arg3, 1), var22, var45, class118.method750(7, this.field4769[var47 + var38]), var32), var49, class53.method338(0, var22, var46, class118.method750(this.field4769[var48 + var38], 7), var32)), var36, class492.method2917(-69, class53.method338(0, var22, var45, class118.method750(this.field4769[var47 + var37], 7), var33), var49, class53.method338(0, var22, var46, class118.method750(7, this.field4769[var37 + var48]), var33)))) * arg2;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 173)
    public static void method1931(int arg0) {
        field4775 = null;
        field4771 = null;
        field4773 = null;
        if (arg0 >= -96) {
            method1928(8, null);
        }
    }
}
