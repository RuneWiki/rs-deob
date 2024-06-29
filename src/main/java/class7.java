import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class7 extends class304 {

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "Z")
    public static boolean field112 = false;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "Z")
    public static boolean field110 = false;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "[I")
    public static int[] field113 = new int[14];

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "Laf;")
    public static class195 field115;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V", line = 7)
    public static final void method68(int arg0) {
        class142.field2185 = null;
        if (arg0 != -1777) {
            return;
        }
        class217.field3325 = (byte[][][]) null;
        class189.field2970 = (byte[][][]) null;
        class43.field615 = null;
        class13.field165 = null;
        class231.field3516 = null;
        field108++;
        class333.field5199 = (byte[][][]) null;
        class183.field2900 = (byte[][][]) null;
        class283.field4396 = (int[][][]) null;
        class291.field4474 = null;
        class181.field2870 = null;
        class13.field179 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lwm;II)V", line = 29)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field114++;
        if (arg2 == -2828 && arg1 == 0) {
            this.field4652 = arg0.method1774((byte) -120) == 1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V", line = 47)
    public static void method70(int arg0) {
        int var1 = 17 % ((-arg0 - 58) / 60);
        field113 = null;
        field115 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I", line = 57)
    public final int[] method71(int arg0, int arg1) {
        if (arg0 != 7) {
            field113 = (int[]) null;
        }
        field105++;
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int[] var4 = this.method2086(arg1, 0, (byte) 112);
            int[] var5 = this.method2086(arg1, 1, (byte) 112);
            int[] var6 = this.method2086(arg1, 2, (byte) 112);
            for (int var7 = 0; var7 < class218.field3333; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III[II)V", line = 109)
    public static final void method72(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field106++;
        int var6 = arg0 - 1;
        int var5 = var6 + arg1;
        arg2--;
        while (arg2 < var5) {
            int var7 = arg2 + 1;
            arg3[var7] = arg4;
            int var8 = var7 + 1;
            arg3[var8] = arg4;
            int var9 = var8 + 1;
            arg3[var9] = arg4;
            int var10 = var9 + 1;
            arg3[var10] = arg4;
            int var11 = var10 + 1;
            arg3[var11] = arg4;
            int var12 = var11 + 1;
            arg3[var12] = arg4;
            int var13 = var12 + 1;
            arg3[var13] = arg4;
            arg2 = var13 + 1;
            arg3[arg2] = arg4;
        }
        while (var6 > arg2) {
            arg2++;
            arg3[arg2] = arg4;
        }
    }

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V", line = 143)
    public static final void method73(int arg0) {
        if (class8.field119 < 0) {
            class78.field1145 = -1;
            class114.field1799 = -1;
            class8.field119 = 0;
        }
        if (class243.field3691 < class8.field119) {
            class78.field1145 = -1;
            class8.field119 = class243.field3691;
            class114.field1799 = -1;
        }
        field116++;
        if (class49.field680 < 0) {
            class78.field1145 = -1;
            class49.field680 = 0;
            class114.field1799 = -1;
        }
        if (class49.field680 > class229.field3494) {
            class49.field680 = class229.field3494;
            class114.field1799 = -1;
            class78.field1145 = -1;
        }
        if (arg0 != -13969) {
            field110 = true;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)Z", line = 181)
    public static final boolean method74(int arg0, boolean arg1) {
        if (!arg1) {
            field113 = (int[]) null;
        }
        field107++;
        return arg0 == 4 || arg0 == 8;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 202)
    public class7() {
        super(3, false);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[[I", line = 210)
    public final int[][] method75(int arg0, int arg1) {
        field109++;
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (arg1 != 0) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field4663.field1820) {
            int[] var4 = this.method2086(arg0, 2, (byte) 112);
            int[][] var5 = this.method2082(0, (byte) -127, arg0);
            int[][] var6 = this.method2082(1, (byte) -88, arg0);
            int[] var7 = var5[1];
            int[] var8 = var3[2];
            int[] var9 = var5[0];
            int[] var10 = var5[2];
            int[] var11 = var3[1];
            int[] var12 = var6[1];
            int[] var13 = var3[0];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class218.field3333; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var13[var16] = var9[var16];
                    var11[var16] = var7[var16];
                    var8[var16] = var10[var16];
                } else if (var17 == 0) {
                    var13[var16] = var14[var16];
                    var11[var16] = var12[var16];
                    var8[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var13[var16] = var9[var16] * var17 + (var14[var16] * var18) >> 12;
                    var11[var16] = var7[var16] * var17 + var12[var16] * var18 >> 12;
                    var8[var16] = var10[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }
}
