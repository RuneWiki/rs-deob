import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class298 extends class71 {

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "Z")
    private boolean field5285 = true;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    private int field5290 = 4096;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "Lud;")
    public static class279 field5281 = class130.method1024("showingVideoAd", 255);

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field5284 = -1;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "Lud;")
    public static class279 field5287 = class130.method1024("<br>(X", 255);

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "[I")
    public static int[] field5286;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[[I", line = 16)
    public final int[][] method86(int arg0, int arg1) {
        int var3 = 77 / ((-arg1 - 70) / 54);
        field5289++;
        int[][] var4 = this.field1400.method1746((byte) -116, arg0);
        if (this.field1400.field4363) {
            int[] var5 = this.method624(arg0 - 1 & class262.field4688, -3, 0);
            int[] var6 = this.method624(arg0, -3, 0);
            int[] var7 = this.method624(arg0 + 1 & class262.field4688, -3, 0);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class215.field3787; var11++) {
                int var12 = (var7[var11] - var5[var11]) * this.field5290;
                int var13 = (var6[var11 + 1 & class309.field5478] - var6[class309.field5478 & var11 - 1]) * this.field5290;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = var14 * var14 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var16 + var17 + 4096) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (var18 == 0) {
                    var20 = 0;
                    var19 = 0;
                    var21 = 0;
                } else {
                    var19 = 16777216 / var18;
                    var20 = var12 / var18;
                    var21 = var13 / var18;
                }
                if (this.field5285) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var21 = (var21 >> 1) + 2048;
                }
                var8[var11] = var21;
                var9[var11] = var20;
                var10[var11] = var19;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 90)
    public class298() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZLvh;)V", line = 105)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            return;
        }
        field5288++;
        if (arg0 == 0) {
            this.field5290 = arg2.method468(28214);
        } else if (arg0 == 1) {
            this.field5285 = arg2.method483(-118) == 1;
        }
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)V", line = 169)
    public static void method2104(int arg0) {
        field5287 = null;
        field5281 = null;
        if (arg0 < -40) {
            field5286 = null;
        }
    }
}
