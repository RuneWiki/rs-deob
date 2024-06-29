import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class130 extends class229 {

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
    private int[] field1560 = new int[512];

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field1564 = 0;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Z")
    public static boolean field1563 = false;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lmq;")
    public static class78 field1559 = new class78(114, 28);

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Lcha;")
    public static class174 field1565;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FIIFFII[FIFI)V", line = 7)
    public final void method832(float arg0, int arg1, int arg2, float arg3, float arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, int arg10) {
        field1561++;
        int var12 = (int) ((float) arg6 * arg3 - 1.0F);
        if (arg5 != 512) {
            method833((byte) -6);
        }
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg2 * arg9 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg1 * arg0 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg8 * arg0;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        int var24 = var19 & var17;
        float var25 = class760.method4232(var21, arg5 + 7252);
        int var26 = this.field1560[var24];
        int var27 = this.field1560[var23];
        for (int var28 = 0; var28 < arg2; var28++) {
            float var29 = (float) var28 * arg9;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            float var35 = class760.method4232(var32, 7764);
            int var36 = var31 & var15;
            int var37 = this.field1560[var34 + var26];
            int var38 = this.field1560[var36 + var26];
            int var39 = this.field1560[var34 + var27];
            int var40 = this.field1560[var27 + var36];
            for (int var41 = 0; var41 < arg6; var41++) {
                float var42 = (float) var41 * arg3;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                float var48 = class760.method4232(var45, 7764);
                int var49 = var44 & var13;
                arg7[arg10++] = class645.method3497(class645.method3497(class645.method3497(class389.method2321((byte) -60, var21, class272.method1629(this.field1560[var49 + var40], 7), var32, var45), var48, class389.method2321((byte) -60, var21, class272.method1629(7, this.field1560[var40 + var47]), var32, var46), true), var35, class645.method3497(class389.method2321((byte) -60, var21, class272.method1629(7, this.field1560[var39 + var49]), var33, var45), var48, class389.method2321((byte) -60, var21, class272.method1629(7, this.field1560[var39 + var47]), var33, var46), true), true), var25, class645.method3497(class645.method3497(class389.method2321((byte) -60, var22, class272.method1629(7, this.field1560[var38 + var49]), var32, var45), var48, class389.method2321((byte) -60, var22, class272.method1629(7, this.field1560[var47 + var38]), var32, var46), true), var35, class645.method3497(class389.method2321((byte) -60, var22, class272.method1629(7, this.field1560[var37 + var49]), var33, var45), var48, class389.method2321((byte) -60, var22, class272.method1629(this.field1560[var37 + var47], 7), var33, var46), true), true), true) * arg4;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 98)
    public static void method833(byte arg0) {
        if (arg0 < 32) {
            method835(102, -48, 101, -126, null);
        }
        field1565 = null;
        field1559 = null;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V", line = 113)
    public class130(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field1560[var3] = this.field1560[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field1560[var5];
            this.field1560[var5] = this.field1560[var5 + 256] = this.field1560[var4];
            this.field1560[var4] = this.field1560[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(JJ)J", line = 145)
    public static long method834(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIILmaa;)V", line = 154)
    public static final void method835(int arg0, int arg1, int arg2, int arg3, class440 arg4) {
        class73 var5 = class663.method3590(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field5790 = (arg1 << class455.field6383) + class5.field54;
        arg4.field5791 = arg3;
        arg4.field5784 = (arg2 << class455.field6383) + class5.field54;
        var5.field965 = arg4;
        int var6 = class517.field7282 == class109.field1341 ? 1 : 0;
        if (arg4.method265((byte) -39)) {
            if (arg4.method256((byte) 42)) {
                arg4.field5793 = class466.field6722[var6];
                class466.field6722[var6] = arg4;
                return;
            }
            arg4.field5793 = class684.field9445[var6];
            class684.field9445[var6] = arg4;
            class571.field7967 = true;
            return;
        }
        arg4.field5793 = class293.field3797[var6];
        class293.field3797[var6] = arg4;
    }
}
