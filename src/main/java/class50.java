import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class50 extends class303 {

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    private int field809 = 585;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field807 = 0;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "Ljava/lang/String;")
    public static String field811 = "M";

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "[I")
    public static int[] field812 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)[I", line = 9)
    public final int[] method67(int arg0, int arg1) {
        field808++;
        int[] var3 = this.field4763.method394(0, arg1);
        if (arg0 != -3) {
            method380(12);
        }
        if (this.field4763.field863) {
            int var4 = class36.field591[arg1];
            for (int var5 = 0; var5 < class70.field1108; var5++) {
                int var6 = class291.field4427[var5];
                if (this.field809 < var6 && 4096 - this.field809 > var6 && var4 > (2048 - this.field809) && this.field809 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field809);
                    var3[var5] = 4096 - var10;
                } else if (var6 > 2048 - this.field809 && var6 < (this.field809 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field809;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field809);
                } else if (var4 < this.field809 || var4 > 4096 - this.field809) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field809;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field809);
                } else if (this.field809 <= var6 && var6 <= (4096 - this.field809)) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field809);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V", line = 84)
    public static void method380(int arg0) {
        field811 = null;
        if (arg0 != 0) {
            field812 = (int[]) null;
        }
        field812 = null;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 97)
    public class50() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILpe;I)V", line = 103)
    public final void method65(int arg0, class101 arg1, int arg2) {
        field810++;
        if (arg2 == 0) {
            this.field809 = arg1.method731(false);
        }
        if (arg0 != -4004) {
            this.method67(91, -88);
        }
    }
}
