import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class211 extends class214 {

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    private int field2971 = 4096;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "Z")
    private boolean field2976 = true;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "[I")
    public static int[] field2975 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field2977 = 0;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "[[Z")
    public static boolean[][] field2980;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2982;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "Loj;")
    public static class485 field2981;

    static {
        new class112("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field2980 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };
        field2982 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 4)
    public class211() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)[[I", line = 9)
    public final int[][] method11(int arg0, byte arg1) {
        ++field2973;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (arg1 != 92) {
            method1326(-69);
        }
        if (super.field3030.field6644) {
            int[] var4 = this.method1352(arg0 + -1 & class183.field2659, 0, -74);
            int[] var5 = this.method1352(arg0, 0, -94);
            int[] var6 = this.method1352(arg0 - -1 & class183.field2659, 0, arg1 + -149);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class399.field5585 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2971;
                int var12 = (var5[var10 + 1 & class467.field6551] - var5[var10 + -1 & class467.field6551]) * this.field2971;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                }
                if (this.field2976) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Llk;II)V", line = 94)
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field2976 = ~arg0.method2503(true) == -2;
            }
        } else {
            this.field2971 = arg0.method2508(true);
        }
        if (arg1 < -114) {
            ++field2974;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(III)V", line = 130)
    public static final void method1325(int arg0, int arg1, int arg2) {
        class406 var3 = class455.field6293[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field5617 != null) {
                var3.field5617 = null;
            }
            if (var3.field5624 != null) {
                var3.field5624 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V", line = 155)
    public static void method1326(int arg0) {
        field2975 = null;
        if (arg0 != -22984) {
            method1327(57, -28);
        }
        field2981 = null;
        field2980 = null;
        field2982 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I", line = 171)
    public static final int method1327(int arg0, int arg1) {
        ++field2972;
        return arg0 != 23111 ? 28 : arg1 & 255;
    }
}
