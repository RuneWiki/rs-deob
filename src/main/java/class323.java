import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class323 extends class297 {

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    private int field5062 = 4096;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    private int field5063 = 4096;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    private int field5052 = 4096;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "[B")
    public static byte[] field5053 = new byte[32896];

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "[I")
    public static int[] field5055;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "Lpk;")
    public static class120 field5058;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "[I")
    public static int[] field5065;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[III)V", line = 6)
    public static final void method2273(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        arg0--;
        field5057++;
        if (arg4 < 29) {
            return;
        }
        int var13 = arg3 - 1;
        int var5 = var13 - 7;
        while (var5 > arg0) {
            int var6 = arg0 + 1;
            arg2[var6] = arg1;
            int var7 = var6 + 1;
            arg2[var7] = arg1;
            int var8 = var7 + 1;
            arg2[var8] = arg1;
            int var9 = var8 + 1;
            arg2[var9] = arg1;
            int var10 = var9 + 1;
            arg2[var10] = arg1;
            int var11 = var10 + 1;
            arg2[var11] = arg1;
            int var12 = var11 + 1;
            arg2[var12] = arg1;
            arg0 = var12 + 1;
            arg2[arg0] = arg1;
        }
        while (var13 > arg0) {
            arg0++;
            arg2[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 35)
    public static final String method2274(int arg0, String arg1) {
        String var2 = class150.method1134(arg0 - 96, class106.method851(arg1, -119));
        field5056++;
        if (var2 == null) {
            var2 = "";
        }
        if (arg0 != 5) {
            method2276(-121, -113);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([BI)Ljj;", line = 50)
    public static final class159 method2275(byte[] arg0, int arg1) {
        field5051++;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = -30 % ((-arg1 - 62) / 51);
            class159 var3 = new class159(arg0, class61.field892, class183.field2902, class309.field4887, class83.field1288, class207.field3277);
            class260.method1796(1952227009);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 69)
    public class323() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V", line = 73)
    public static final void method2276(int arg0, int arg1) {
        field5061++;
        if (arg0 >= -5) {
            field5065 = (int[]) null;
        }
        class170 var2 = class221.method1613(12, arg1, -8410);
        var2.method1267(-105);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILaj;)V", line = 86)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field5054++;
        if (arg1 != 255) {
            this.field5052 = -71;
        }
        if (arg0 == 0) {
            this.field5052 = arg2.method56(19612);
        } else if (arg0 == 1) {
            this.field5062 = arg2.method56(19612);
        } else if (arg0 == 2) {
            this.field5063 = arg2.method56(19612);
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(Z)V", line = 131)
    public static void method2277(boolean arg0) {
        if (arg0) {
            field5055 = null;
            field5058 = null;
            field5065 = null;
            field5053 = null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field5053[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field5055 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[[I", line = 170)
    public final int[][] method172(int arg0, byte arg1) {
        field5060++;
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (arg1 != 63) {
            this.method169(-29, -95, (class1) null);
        }
        if (this.field4767.field2480) {
            int[][] var4 = this.method2105(arg0, 2, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class31.field491; var11++) {
                int var12 = var5[var11];
                int var13 = var9[var11];
                int var14 = var10[var11];
                if (var12 == var14 && var13 == var14) {
                    var7[var11] = this.field5052 * var12 >> 12;
                    var6[var11] = this.field5062 * var14 >> 12;
                    var8[var11] = this.field5063 * var13 >> 12;
                } else {
                    var7[var11] = this.field5052;
                    var6[var11] = this.field5062;
                    var8[var11] = this.field5063;
                }
            }
        }
        return var3;
    }
}
