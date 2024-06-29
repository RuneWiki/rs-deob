import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class126 extends class108 {

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "[I")
    private int[] field2060 = new int[512];

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "Lfn;")
    public static class617 field2064 = new class617(0, 0);

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "[I")
    public static int[] field2065 = new int[1];

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "Lkq;")
    public static class696 field2066 = new class696(5, 1);

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2061;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "[Leb;")
    public static class8[] field2067;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V", line = 5)
    public static final void method1000(int arg0) {
        field2062++;
        if (class490.method2871(true, class515.field7636) || class352.method2135(class515.field7636, (byte) -122)) {
            class679.method3841(class551.field8078 >> 12, arg0 + 6747, class322.field4478 >> 12, 5000);
        } else {
            int var1 = class103.field1708.field2454[0] >> 3;
            int var2 = class103.field1708.field2459[0] >> 3;
            if (var1 >= 0 && var1 < (class430.field6136 >> 3) && var2 >= 0 && var2 < (class580.field8504 >> 3)) {
                class679.method3841(var1, 122, var2, 5000);
            } else {
                class679.method3841(class430.field6136 >> 4, 60, class580.field8504 >> 4, 0);
            }
        }
        if (arg0 != -6648) {
            field2067 = null;
        }
        class535.method3138((byte) 120);
        class295.method1834(true);
        class336.method1995(Integer.MAX_VALUE);
        class276.method1724(256);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(FFIIF[FBIIIF)V", line = 34)
    public final void method892(float arg0, float arg1, int arg2, int arg3, float arg4, float[] arg5, byte arg6, int arg7, int arg8, int arg9, float arg10) {
        if (arg6 < 30) {
            field2061 = null;
        }
        field2063++;
        int var12 = (int) ((float) arg8 * arg10 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg9 * arg1 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg7 * arg4 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg2 * arg4;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        float var24 = class150.method1148(0, var21);
        int var25 = var19 & var17;
        int var26 = this.field2060[var25];
        int var27 = this.field2060[var23];
        for (int var28 = 0; var28 < arg9; var28++) {
            float var29 = (float) var28 * arg1;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            float var35 = class150.method1148(0, var32);
            int var36 = var30 & var15;
            int var37 = this.field2060[var26 + var36];
            int var38 = this.field2060[var26 + var34];
            int var39 = this.field2060[var27 + var36];
            int var40 = this.field2060[var27 + var34];
            for (int var41 = 0; var41 < arg8; var41++) {
                float var42 = (float) var41 * arg10;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                float var48 = class150.method1148(0, var45);
                int var49 = var44 & var13;
                arg5[arg3++] = arg0 * class65.method536(111, var24, class65.method536(121, var35, class65.method536(125, var48, class8.method37(var46, (byte) -16, class248.method1593(this.field2060[var47 + var37], 7), var33, var22), class8.method37(var45, (byte) -117, class248.method1593(7, this.field2060[var49 + var37]), var33, var22)), class65.method536(121, var48, class8.method37(var46, (byte) -20, class248.method1593(7, this.field2060[var38 + var47]), var32, var22), class8.method37(var45, (byte) -125, class248.method1593(7, this.field2060[var38 + var49]), var32, var22))), class65.method536(108, var35, class65.method536(114, var48, class8.method37(var46, (byte) -47, class248.method1593(7, this.field2060[var47 + var39]), var33, var21), class8.method37(var45, (byte) -115, class248.method1593(7, this.field2060[var49 + var39]), var33, var21)), class65.method536(115, var48, class8.method37(var46, (byte) -97, class248.method1593(this.field2060[var47 + var40], 7), var32, var21), class8.method37(var45, (byte) -114, class248.method1593(7, this.field2060[var40 + var49]), var32, var21))));
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(I)V", line = 128)
    public class126(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field2060[var3] = this.field2060[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field2060[var5];
            this.field2060[var5] = this.field2060[var5 + 256] = this.field2060[var4];
            this.field2060[var4] = this.field2060[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V", line = 163)
    public static void method1001(int arg0) {
        if (arg0 != 5822) {
            method1001(-51);
        }
        field2061 = null;
        field2064 = null;
        field2067 = null;
        field2066 = null;
        field2065 = null;
    }
}
