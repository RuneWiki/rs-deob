import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class23 extends class304 {

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "Z")
    private boolean field258 = true;

    @OriginalMember(owner = "client!dm", name = "X", descriptor = "I")
    private int field263 = 4096;

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "[I")
    public static int[] field256 = new int[32];

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
    public static int field261 = 0;

    @OriginalMember(owner = "client!dm", name = "U", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!dm", name = "W", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!dm", name = "Y", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "[S")
    public static short[] field257;

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 18)
    public class23() {
        super(1, false);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field256[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V", line = 22)
    public static void method189(int arg0) {
        field256 = null;
        if (arg0 == 24801) {
            field257 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)[[I", line = 59)
    public final int[][] method75(int arg0, int arg1) {
        field262++;
        if (arg1 != 0) {
            field261 = 65;
        }
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (this.field4663.field1820) {
            int[] var4 = this.method2086(arg0 - 1 & class65.field941, 0, (byte) 112);
            int[] var5 = this.method2086(arg0, 0, (byte) 112);
            int[] var6 = this.method2086(arg0 + 1 & class65.field941, 0, (byte) 112);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class218.field3333; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field263;
                int var12 = (var5[var10 + 1 & class54.field721] - var5[var10 - 1 & class54.field721]) * this.field263;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = 16777216 / var17;
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                }
                if (this.field258) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lwm;II)V", line = 146)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg2 != -2828) {
            return;
        }
        field264++;
        if (arg1 == 0) {
            this.field263 = arg0.method1755(false);
        } else if (arg1 == 1) {
            this.field258 = arg0.method1774((byte) -112) == 1;
        }
    }
}
