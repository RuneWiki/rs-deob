import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class50 extends class499 {

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "[I")
    private int[] field552 = new int[512];

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[I")
    public static int[] field550 = new int[14];

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field551 = 0;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Z")
    public static boolean field555 = false;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)V")
    public static void method501(boolean arg0) {
        field550 = null;
        if (arg0) {
            method501(true);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBLuu;I)V")
    public static final void method502(int arg0, byte arg1, class188 arg2, int arg3) {
        if (arg1 == -82) {
            class221.field3176 = arg3;
            class412.field6113 = arg2;
            field553++;
            class208.field3015 = arg0;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IFIIFIFFII[F)V")
    public final void method503(int arg0, float arg1, int arg2, int arg3, float arg4, int arg5, float arg6, float arg7, int arg8, int arg9, float[] arg10) {
        field549++;
        int var12 = (int) ((float) arg2 * arg6 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg3 * arg1 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg5 * arg4 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg9 * arg4;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        int var24 = var19 & var17;
        if (arg8 != 7) {
            method504(78, -75, 13, null, 77, 94);
        }
        float var25 = class335.method2045((byte) 126, var21);
        int var26 = this.field552[var24];
        int var27 = this.field552[var23];
        for (int var28 = 0; var28 < arg3; var28++) {
            float var29 = (float) var28 * arg1;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            float var34 = class335.method2045((byte) 126, var32);
            int var35 = var31 & var15;
            int var36 = var30 & var15;
            int var37 = this.field552[var26 + var36];
            int var38 = this.field552[var26 + var35];
            int var39 = this.field552[var27 + var36];
            int var40 = this.field552[var35 + var27];
            for (int var41 = 0; var41 < arg2; var41++) {
                float var42 = (float) var41 * arg6;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                float var47 = class335.method2045((byte) 126, var45);
                int var48 = var44 & var13;
                int var49 = var43 & var13;
                arg10[arg0++] = arg7 * class294.method1860(var25, 4449, class294.method1860(var34, 4449, class294.method1860(var47, 4449, class90.method801(var46, var33, -129, class345.method2089(7, this.field552[var37 + var49]), var22), class90.method801(var45, var33, -129, class345.method2089(7, this.field552[var37 + var48]), var22)), class294.method1860(var47, 4449, class90.method801(var46, var32, -129, class345.method2089(this.field552[var38 + var49], 7), var22), class90.method801(var45, var32, arg8 - 136, class345.method2089(7, this.field552[var38 + var48]), var22))), class294.method1860(var34, 4449, class294.method1860(var47, 4449, class90.method801(var46, var33, -129, class345.method2089(this.field552[var39 + var49], 7), var21), class90.method801(var45, var33, -129, class345.method2089(this.field552[var39 + var48], 7), var21)), class294.method1860(var47, 4449, class90.method801(var46, var32, -129, class345.method2089(7, this.field552[var40 + var49]), var21), class90.method801(var45, var32, class429.method2613(arg8, -136), class345.method2089(this.field552[var40 + var48], 7), var21))));
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III[BII)Z")
    public static final boolean method504(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field556++;
        boolean var6 = true;
        class65 var7 = new class65(arg3);
        int var8 = -1;
        label58: while (true) {
            int var9 = var7.method586(55);
            if (var9 == 0) {
                if (arg5 != 255) {
                    return true;
                }
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method593((byte) 77);
                    if (var13 == 0) {
                        continue label58;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = (var10 & 0xFF1) >> 6;
                    int var16 = var7.method577(arg5) >> 2;
                    int var17 = arg1 + var15;
                    int var18 = arg4 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < (arg0 - 1) && arg2 - 1 > var18) {
                        class222 var19 = class384.field5645.method786(var8, 0);
                        if (var16 != 22 || class478.field7044.field3354 || var19.field3200 != 0 || var19.field3267 == 1 || var19.field3260) {
                            var11 = true;
                            if (!var19.method1517(-95)) {
                                class287.field4145++;
                                var6 = false;
                            }
                        }
                    }
                }
                int var12 = var7.method593((byte) 80);
                if (var12 == 0) {
                    break;
                }
                var7.method577(arg5);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V")
    public class50(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field552[var3] = this.field552[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field552[var5];
            this.field552[var5] = this.field552[var5 + 256] = this.field552[var4];
            this.field552[var4] = this.field552[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static final void method505(int arg0) {
        class32.method258(-72, class351.field4863);
        class250.field3686++;
        field554++;
        class472.field6970.method638(255, arg0);
    }
}
