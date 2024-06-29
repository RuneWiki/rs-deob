import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class490 extends class405 {

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "Ldh;")
    public class254 field7305;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "Lki;")
    public class232 field7302;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "[Lfv;")
    public static class525[] field7297 = new class525[2048];

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public int field7293;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public int field7295;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public int field7296;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public int field7300;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public int field7304;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(FII[FIIIIII)V")
    public static final void method2921(float arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7303++;
        int var10 = arg2 - arg6;
        int var11 = arg5 - arg1;
        int var12 = arg9 - arg4;
        float var13 = arg3[2] * (float) var11 + arg3[1] * (float) var10 + arg3[0] * (float) var12;
        float var14 = arg3[5] * (float) var11 + arg3[4] * (float) var10 + arg3[3] * (float) var12;
        float var15 = arg3[8] * (float) var11 + arg3[7] * (float) var10 + arg3[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        if (arg7 != 28266) {
            field7297 = null;
        }
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg0 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg8 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg8 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg8 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class509.field7484 = var18;
        class505.field7433 = var17;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public final void method2922(int arg0) {
        this.field7293 = this.field7305.field3449;
        this.field7304 = this.field7305.field3442;
        this.field7296 = this.field7305.field3447;
        field7298++;
        if (this.field7305.field3445 != null) {
            this.field7305.field3445.method1306(this.field7302.field3265, this.field7302.field3254, this.field7302.field3260, class238.field3335);
        }
        this.field7300 = class238.field3335[2];
        if (arg0 != 1445) {
            method2924(-88, 72, -1, 27, -84);
        }
        this.field7295 = class238.field3335[0];
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V")
    public static void method2923(int arg0) {
        if (arg0 == 2) {
            field7297 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
    public static final void method2924(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= 89) {
            return;
        }
        for (int var5 = 0; var5 < class81.field1139; var5++) {
            Rectangle var6 = class276.field4112[var5];
            if (var6.x + var6.width > arg3 && var6.x < (arg2 + arg3) && var6.y + var6.height > arg1 && var6.y < (arg0 + arg1)) {
                class147.field2223[var5] = true;
            }
        }
        field7301++;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ldh;Lli;)V")
    public class490(class254 arg0, class387 arg1) {
        this.field7305 = arg0;
        this.field7302 = this.field7305.method1512(1024);
        this.method2922(1445);
    }
}
