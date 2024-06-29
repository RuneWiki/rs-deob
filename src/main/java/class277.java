import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class277 extends class86 {

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "[C")
    public static char[] field4279 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "[I")
    public static int[] field4280 = new int[500];

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "Z")
    public static boolean field4282 = false;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "Ljava/lang/String;")
    public static String field4281 = "Loaded title screen";

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "Ljava/lang/String;")
    public static String field4285 = "slide:";

    @OriginalMember(owner = "client!sm", name = "U", descriptor = "Ll;")
    public static class66 field4288 = new class66(4);

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!sm", name = "T", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!sm", name = "V", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!sm", name = "W", descriptor = "[[[I")
    public static int[][][] field4290;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)[I", line = 14)
    public final int[] method158(int arg0, int arg1) {
        int[] var3 = this.field1225.method1914(arg0, -101);
        if (this.field1225.field3995) {
            int[][] var4 = this.method782(arg0, 0, 1);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            for (int var8 = 0; var8 < class93.field1424; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        if (arg1 <= 7) {
            method2031(87, -100);
        }
        field4278++;
        return var3;
    }

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "(I)V", line = 51)
    public static void method2030(int arg0) {
        field4290 = (int[][][]) null;
        field4288 = null;
        field4285 = null;
        field4281 = null;
        if (arg0 != 25787) {
            field4285 = (String) null;
        }
        field4280 = null;
        field4279 = null;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 78)
    public class277() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(II)I", line = 86)
    public static final int method2031(int arg0, int arg1) {
        field4289++;
        return arg1 == -10800 ? arg0 & 0x7F : 86;
    }

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "(I)V", line = 99)
    public static final void method2032(int arg0) {
        field4284++;
        if (arg0 != -27816) {
            field4286 = -89;
        }
        if (class20.field321) {
            return;
        }
        class20.field321 = true;
        if (class278.field4292) {
            class313.field4846 = (float) ((int) class313.field4846 + 191 & 0xFFFFFF80);
        } else {
            class101.field1531 += (24.0F - class101.field1531) / 2.0F;
        }
        class78.field1138 = true;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILjava/lang/String;IIILbi;ILrg;II)V", line = 135)
    public static final void method2033(int arg0, String arg1, int arg2, int arg3, int arg4, class145 arg5, int arg6, class342 arg7, int arg8, int arg9) {
        field4287++;
        int var10;
        if (class314.field4858 == 4) {
            var10 = (int) class313.field4846 & 0x7FF;
        } else {
            var10 = (int) class313.field4846 + class290.field4513 & 0x7FF;
        }
        int var11 = Math.max(arg7.field5374 / 2, arg7.field5339 / 2) + 10;
        int var12 = arg6 * arg6 + arg9 * arg9;
        if (var12 > var11 * var11) {
            return;
        }
        int var13 = class107.field1604[var10];
        int var14 = class107.field1605[var10];
        if (class314.field4858 != 4) {
            var13 = var13 * 256 / (class236.field3676 + 256);
            var14 = var14 * 256 / (class236.field3676 + 256);
        }
        int var15 = arg5.method1193(arg1, 100);
        int var16 = arg5.method1197(arg1, 100, 0);
        int var17 = arg6 * var13 + arg9 * var14 >> 16;
        int var18 = var17 - var15 / 2;
        int var19 = arg6 * var14 - (arg9 * var13) >> 16;
        if ((-arg7.field5374) > var18 || var18 > arg7.field5374 || var19 < -arg7.field5339 || var19 > arg7.field5339) {
            return;
        }
        if (class240.field3737) {
            class213.method1597((class2) arg7.method2399(false, 0));
        } else {
            class60.method605(arg7.field5272, arg7.field5428);
        }
        arg5.method1215(arg1, arg7.field5374 / 2 + arg3 + var18, arg7.field5339 / 2 + -arg2 + -var19 + -var16 + arg4, var15, 50, arg0, 0, arg8, 1, 0, 0);
        if (class240.field3737) {
            class213.method1587();
        } else {
            class60.method593();
        }
    }
}
