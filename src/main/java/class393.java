import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class393 extends class108 {

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public int field5885;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public int field5887;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "[Z")
    public boolean[] field5882;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "[I")
    public int[] field5889;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "[[I")
    public int[][] field5888;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "[I")
    public int[] field5883;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "[B")
    public static byte[] field5891 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "F")
    public static float field5890;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Liu;")
    public static class517 field5881;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "[Ltv;")
    public static class360[] field5892;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "[[I")
    public static int[][] field5893;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method2379(byte arg0) {
        field5880++;
        if (arg0 != 102) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class574.field8178[var1] = false;
        }
        class459.field6615 = -1;
        class112.field1866 = -1;
        class377.field5547 = 1;
        class378.field5560 = 0;
        class106.field1777 = 0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIFFLvo;IFII[BFF)V")
    public static final void method2380(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, class433 arg6, int arg7, float arg8, int arg9, int arg10, byte[] arg11, float arg12, float arg13) {
        field5879++;
        int var14 = arg2 * arg3;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg1; var16++) {
            int var19 = arg10;
            arg6.method2014((byte) 96, arg3, arg4 / (float) arg2, arg5 / (float) arg9, 0, arg7, arg9, arg2, arg8 / (float) arg3, var15, arg13 * 127.0F);
            arg8 *= 2.0F;
            arg5 *= 2.0F;
            arg4 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg11[var19] = (byte) ((int) ((float) arg11[var19] + var15[var20]));
                var19++;
            }
            arg13 = arg12 * arg13;
        }
        if (arg0 != -21576) {
            return;
        }
        int var17 = arg10;
        for (int var18 = 0; var18 < var14; var18++) {
            arg11[var17] = (byte) (arg11[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII)I")
    public static final int method2381(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5894++;
        int var5 = arg1 & 0xF;
        if (arg2 == 0) {
            int var6 = var5 < 8 ? arg0 : arg3;
            int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg0 : arg4) : arg3;
            return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
        } else {
            return -16;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I[B)V")
    public class393(int arg0, byte[] arg1) {
        this.field5885 = arg0;
        class268 var3 = new class268(arg1);
        this.field5887 = var3.method1738(255);
        this.field5882 = new boolean[this.field5887];
        this.field5889 = new int[this.field5887];
        this.field5888 = new int[this.field5887][];
        this.field5883 = new int[this.field5887];
        for (int var4 = 0; var4 < this.field5887; var4++) {
            this.field5889[var4] = var3.method1738(255);
        }
        for (int var5 = 0; var5 < this.field5887; var5++) {
            this.field5882[var5] = var3.method1738(255) == 1;
        }
        for (int var6 = 0; var6 < this.field5887; var6++) {
            this.field5883[var6] = var3.method1745(32132);
        }
        for (int var7 = 0; var7 < this.field5887; var7++) {
            this.field5888[var7] = new int[var3.method1738(255)];
        }
        for (int var8 = 0; var8 < this.field5887; var8++) {
            for (int var9 = 0; var9 < this.field5888[var8].length; var9++) {
                this.field5888[var8][var9] = var3.method1738(255);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method2382(int arg0) {
        field5881 = null;
        int var1 = 101 / ((-arg0 - 36) / 32);
        field5892 = null;
        field5893 = null;
        field5891 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Z")
    public static final boolean method2383(int arg0, int arg1) {
        field5884++;
        if (arg1 == 47 || arg1 == 49 || arg1 == 4 || arg1 == 17 || arg1 == 60) {
            return true;
        } else {
            if (arg0 != -23131) {
                field5893 = null;
            }
            return arg1 == 8 || arg1 == 1012;
        }
    }
}
