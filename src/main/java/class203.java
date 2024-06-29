import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class203 extends class535 {

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "[I")
    private int[] field2655 = new int[512];

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Lgda;")
    public static class53 field2654 = new class53(2, 11);

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[FIIIFFFFII)V")
    public final void method1232(int arg0, float[] arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10) {
        field2652++;
        int var12 = (int) ((float) arg10 * arg7 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg9 * arg5 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg0 * arg8 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg3 * arg8;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        float var23 = class223.method1379(-7700, var21);
        int var24 = var19 & var17;
        int var25 = var20 & var17;
        int var26 = this.field2655[var24];
        int var27 = this.field2655[var25];
        if (arg4 < 43) {
            this.field2655 = null;
        }
        for (int var28 = 0; var28 < arg9; var28++) {
            float var29 = (float) var28 * arg5;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            float var35 = class223.method1379(-7700, var32);
            int var36 = var30 & var15;
            int var37 = this.field2655[var26 + var36];
            int var38 = this.field2655[var34 + var26];
            int var39 = this.field2655[var27 + var36];
            int var40 = this.field2655[var27 + var34];
            for (int var41 = 0; var41 < arg10; var41++) {
                float var42 = (float) var41 * arg7;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var44 & var13;
                int var48 = var43 & var13;
                float var49 = class223.method1379(-7700, var45);
                arg1[arg2++] = class704.method3961(1, class704.method3961(1, class704.method3961(1, class110.method783(var46, class286.method1877(7, this.field2655[var37 + var48]), var33, (byte) -126, var22), class110.method783(var45, class286.method1877(this.field2655[var37 + var47], 7), var33, (byte) -87, var22), var49), class704.method3961(1, class110.method783(var46, class286.method1877(this.field2655[var38 + var48], 7), var32, (byte) -53, var22), class110.method783(var45, class286.method1877(7, this.field2655[var38 + var47]), var32, (byte) -83, var22), var49), var35), class704.method3961(1, class704.method3961(1, class110.method783(var46, class286.method1877(this.field2655[var39 + var48], 7), var33, (byte) -107, var21), class110.method783(var45, class286.method1877(7, this.field2655[var39 + var47]), var33, (byte) -64, var21), var49), class704.method3961(1, class110.method783(var46, class286.method1877(this.field2655[var40 + var48], 7), var32, (byte) -121, var21), class110.method783(var45, class286.method1877(7, this.field2655[var40 + var47]), var32, (byte) -45, var21), var49), var35), var23) * arg6;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method1233(byte arg0) {
        if (arg0 > 41) {
            field2654 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static final void method1234(int arg0) {
        int var1 = -94 / ((arg0 + 37) / 38);
        field2653++;
        if (class312.field4331 > 1) {
            class557.field7812.method2755(249682952, 4, class557.field7812.field6540);
        } else {
            class557.field7812.method2755(249682952, 2, class557.field7812.field6540);
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I)V")
    public class203(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field2655[var3] = this.field2655[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field2655[var5];
            this.field2655[var5] = this.field2655[var5 + 256] = this.field2655[var4];
            this.field2655[var4] = this.field2655[var4 + 256] = var6;
        }
    }
}
