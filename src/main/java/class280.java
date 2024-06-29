import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class class280 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3931 = 0;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
    public static int[] field3933 = new int[1];

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "[Z")
    public static boolean[] field3932 = new boolean[100];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public abstract void method150(int arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method1830(byte arg0) {
        field3933 = null;
        if (arg0 == 32) {
            field3932 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
    public abstract void method149(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lkd;)V")
    public abstract void method160(class280 arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIIB)I")
    public static final int method1831(boolean arg0, int arg1, int arg2, byte arg3) {
        field3930++;
        class380 var4 = class105.method908(arg3 - 82, arg0, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            int var6 = 0;
            if (arg3 != 82) {
                method1835(11, -119);
            }
            while (var4.field5298.length > var6) {
                if (var4.field5295[var6] == arg2) {
                    var5 += var4.field5298[var6];
                }
                var6++;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static final void method1832(int arg0) {
        int var1 = 88 % ((arg0 + 17) / 60);
        field3936++;
        for (class296 var2 = (class296) class684.field9653.method4157((byte) 40); var2 != null; var2 = (class296) class684.field9653.method4157((byte) 40)) {
            class377.method2364(var2, true);
        }
        int var3;
        int var4;
        if (class471.field6781.field6704.method2015(27669) == 1) {
            var3 = 3;
            var4 = 0;
        } else {
            var3 = class569.field8104;
            var4 = class569.field8104;
        }
        client.method1942();
        for (int var5 = var4; var5 <= var3; var5++) {
            client.method1944();
            client.method1936(var5);
            client.method1940(var5);
        }
        client.method1930();
        client.method1937();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public abstract void method172(int arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III[I)V")
    public abstract void method162(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)V")
    public abstract void method157(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(III[I)V")
    public abstract void method155(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lgs;II)V")
    public static final void method1833(class43[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class43 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field647;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field647 < (var7 & 0x1) + var6) {
                class43 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1833(arg0, arg1, var4 - 1);
        method1833(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III[FB[FIIIFI)V")
    public static final void method1834(int arg0, int arg1, int arg2, float[] arg3, byte arg4, float[] arg5, int arg6, int arg7, int arg8, float arg9, int arg10) {
        field3935++;
        if (arg4 != -37) {
            return;
        }
        int var11 = arg0 - arg10;
        int var12 = arg7 - arg1;
        int var13 = arg2 - arg8;
        float var14 = arg5[2] * (float) var12 + arg5[1] * (float) var11 + arg5[0] * (float) var13;
        float var15 = arg5[5] * (float) var12 + arg5[3] * (float) var13 + arg5[4] * (float) var11;
        float var16 = arg5[8] * (float) var12 + arg5[7] * (float) var11 + arg5[6] * (float) var13;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = (float) Math.asin((double) (var15 / var17)) / 3.1415927F + arg9 + 0.5F;
        if (arg6 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg6 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg6 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg3[0] = var18;
        arg3[1] = var19;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    public abstract void method188(int arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V")
    public abstract void method181();

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
    public static final void method1835(int arg0, int arg1) {
        field3934++;
        if (arg1 < 19) {
            field3931 = -71;
        }
        class354 var2 = class501.method3012(arg0, 8, 2145997216);
        var2.method2216(0);
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
    public abstract void method182(int arg0);

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()Lkd;")
    public abstract class280 method174();

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
    public abstract void method190(int arg0);

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
    public abstract void method156(int arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([I)V")
    public abstract void method187(int[] arg0);

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(III[I)V")
    public abstract void method151(int arg0, int arg1, int arg2, int[] arg3);
}
