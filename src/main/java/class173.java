import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class173 extends class197 {

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
    private int field3093 = 4096;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "Z")
    private boolean field3099 = true;

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "Z")
    public static boolean field3098 = false;

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "Lmb;")
    public static class172 field3095 = new class172(64);

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "Loh;")
    public static class258 field3100 = class153.method1046("http:)4)4", 86);

    @OriginalMember(owner = "client!ol", name = "W", descriptor = "I")
    public static int field3103 = 0;

    @OriginalMember(owner = "client!ol", name = "V", descriptor = "Loh;")
    public static class258 field3102 = class153.method1046("rot:", 123);

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "Z")
    public static boolean field3101 = true;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 4)
    public class173() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(IZ)V", line = 27)
    public static final void method1169(int arg0, boolean arg1) {
        field3094++;
        class52.method417(class218.field3773, -1, arg1, class42.field577, class170.field2901);
        int var2 = 92 / ((-arg0 - 69) / 41);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)[[I", line = 44)
    public final int[][] method101(int arg0, byte arg1) {
        int[][] var3 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765) {
            int[] var4 = this.method1327(0, -125, arg0 - 1 & class155.field2662);
            int[] var5 = this.method1327(0, -127, arg0);
            int[] var6 = this.method1327(0, -124, arg0 + 1 & class155.field2662);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class190.field3362; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field3093;
                int var12 = (var5[class48.field723 & var10 + 1] - var5[var10 - 1 & class48.field723]) * this.field3093;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                } else {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                }
                if (this.field3099) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        field3096++;
        int var21 = -15 / ((arg1 - 1) / 37);
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILva;I)V", line = 121)
    public final void method98(int arg0, class235 arg1, int arg2) {
        field3097++;
        if (arg2 == 0) {
            this.field3093 = arg1.method1615(-120);
        } else if (arg2 == 1) {
            this.field3099 = arg1.method1589(107) == 1;
        }
        if (arg0 != 7955) {
            field3102 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "(B)V", line = 157)
    public static void method1170(byte arg0) {
        field3100 = null;
        field3095 = null;
        if (arg0 <= 42) {
            method1170((byte) 88);
        }
        field3102 = null;
    }
}
