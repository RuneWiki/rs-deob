import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class88 {

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "[[I")
    private int[][] field1316;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    private int field1311;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1306 = "Loaded wordpack";

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1305 = new String[1000];

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[I")
    public static int[] field1308 = new int[1000];

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field1307 = 0;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
    public final int method664(int arg0, int arg1) {
        int var3 = -76 % ((-arg0 - 84) / 41);
        if (this.field1316 != null) {
            arg1 = (int) ((long) this.field1318 * (long) arg1 / (long) this.field1311);
        }
        field1315++;
        return arg1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static final void method665(int arg0) {
        field1310++;
        if (arg0 != 32768) {
            method668(-87);
        }
        class141.field2271.method1558(-103);
        class96.field1414.method1558(-86);
        class189.field3055.method1558(arg0 ^ 0xFFFF7FE0);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[B)[B")
    public final byte[] method666(int arg0, byte[] arg1) {
        if (this.field1316 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1318 / (long) this.field1311) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1316[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1318 + var6;
                int var14 = var13 / this.field1311;
                var6 = var13 - this.field1311 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        if (arg0 == 0) {
            field1317++;
            return arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public static final void method667(boolean arg0) {
        int var1 = 0;
        if (!arg0) {
            return;
        }
        while (var1 < class75.field1075) {
            class189 var2 = class184.method1366(16, var1);
            if (var2 != null && var2.field3051 == 0) {
                class252.field4160[var1] = 0;
                class243.field3904[var1] = 0;
            }
            var1++;
        }
        field1314++;
        class262.field4266 = new class144(16);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static void method668(int arg0) {
        field1306 = null;
        field1308 = null;
        if (arg0 != 0) {
            method668(85);
        }
        field1305 = null;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)I")
    public final int method669(int arg0, int arg1) {
        field1309++;
        if (this.field1316 != null) {
            arg1 = (int) ((long) this.field1318 * (long) arg1 / (long) this.field1311) + 6;
        }
        return arg0 == 6 ? arg1 : -9;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(II)V")
    public class88(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class67.method476(arg0, -6, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1316 = new int[var5][14];
            this.field1311 = var5;
            this.field1318 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1316[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var4 / (double) var5;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
