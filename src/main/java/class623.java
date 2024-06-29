import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class623 extends class189 {

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
    private int[] field8245 = new int[512];

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lql;")
    public static class689 field8248 = null;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field8247 = -2;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lgt;")
    public static class425 field8246 = new class425();

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lsa;")
    public static class192 field8244;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(FFIB[FIIFFII)V")
    public final void method1238(float arg0, float arg1, int arg2, byte arg3, float[] arg4, int arg5, int arg6, float arg7, float arg8, int arg9, int arg10) {
        field8249++;
        int var12 = (int) ((float) arg10 * arg0 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg2 * arg1 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg9 * arg8 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg6 * arg8;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        float var23 = class688.method3821(var21, (byte) 105);
        int var24 = var19 & var17;
        int var25 = var20 & var17;
        int var26 = this.field8245[var24];
        int var27 = this.field8245[var25];
        if (arg3 < 33) {
            this.method1238(-0.20985313F, 0.7558156F, -58, (byte) 39, null, 52, 35, -1.0774374F, 0.49689212F, 74, -113);
        }
        for (int var28 = 0; var28 < arg2; var28++) {
            float var29 = (float) var28 * arg1;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            float var35 = class688.method3821(var32, (byte) 80);
            int var36 = var31 & var15;
            int var37 = this.field8245[var34 + var26];
            int var38 = this.field8245[var26 + var36];
            int var39 = this.field8245[var27 + var34];
            int var40 = this.field8245[var27 + var36];
            for (int var41 = 0; var41 < arg10; var41++) {
                float var42 = (float) var41 * arg0;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                float var48 = class688.method3821(var45, (byte) 127);
                int var49 = var44 & var13;
                arg4[arg5++] = arg7 * class511.method2835(var23, -6997, class511.method2835(var35, -6997, class511.method2835(var48, -6997, class673.method3766(var45, class571.method3139(this.field8245[var49 + var40], 7), (byte) 22, var21, var32), class673.method3766(var46, class571.method3139(7, this.field8245[var47 + var40]), (byte) 22, var21, var32)), class511.method2835(var48, -6997, class673.method3766(var45, class571.method3139(7, this.field8245[var39 + var49]), (byte) 22, var21, var33), class673.method3766(var46, class571.method3139(this.field8245[var39 + var47], 7), (byte) 22, var21, var33))), class511.method2835(var35, -6997, class511.method2835(var48, -6997, class673.method3766(var45, class571.method3139(7, this.field8245[var38 + var49]), (byte) 22, var22, var32), class673.method3766(var46, class571.method3139(this.field8245[var38 + var47], 7), (byte) 22, var22, var32)), class511.method2835(var48, -6997, class673.method3766(var45, class571.method3139(7, this.field8245[var37 + var49]), (byte) 22, var22, var33), class673.method3766(var46, class571.method3139(7, this.field8245[var37 + var47]), (byte) 22, var22, var33))));
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static void method3403(byte arg0) {
        field8244 = null;
        field8246 = null;
        field8248 = null;
        int var1 = 40 / ((55 - arg0) / 49);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lbi;I)V")
    public static final void method3404(class449 arg0, int arg1) {
        class429.field5891 = arg0.method2523("hitmarks", (byte) 49);
        field8242++;
        class483.field6539 = arg0.method2523("hitbar_default", (byte) 70);
        class142.field2291 = arg0.method2523("timerbar_default", (byte) 123);
        class308.field4261 = arg0.method2523("headicons_pk", (byte) 86);
        class371.field5008 = arg0.method2523("headicons_prayer", (byte) 125);
        class364.field4925 = arg0.method2523("hint_headicons", (byte) 60);
        class330.field4532 = arg0.method2523("hint_mapmarkers", (byte) 108);
        class254.field3518 = arg0.method2523("mapflag", (byte) 124);
        if (arg1 != 26592) {
            method3403((byte) 19);
        }
        class54.field740 = arg0.method2523("cross", (byte) 93);
        class646.field8661 = arg0.method2523("mapdots", (byte) 116);
        class670.field9503 = arg0.method2523("scrollbar", (byte) 99);
        class64.field983 = arg0.method2523("name_icons", (byte) 112);
        class308.field4257 = arg0.method2523("floorshadows", (byte) 78);
        class671.field9505 = arg0.method2523("compass", (byte) 86);
        class146.field2337 = arg0.method2523("otherlevel", (byte) 57);
        class624.field8253 = arg0.method2523("hint_mapedge", (byte) 126);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Z")
    public static final boolean method3405(int arg0, int arg1, int arg2) {
        if (arg1 != 2048) {
            field8248 = null;
        }
        field8243++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
    public class623(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field8245[var3] = this.field8245[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field8245[var5];
            this.field8245[var5] = this.field8245[var5 + 256] = this.field8245[var4];
            this.field8245[var4] = this.field8245[var4 + 256] = var6;
        }
    }
}
