import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class78 extends class233 {

    @OriginalMember(owner = "client!dha", name = "B", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!dha", name = "C", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!dha", name = "E", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!dha", name = "F", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!dha", name = "G", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!dha", name = "A", descriptor = "Lin;")
    public static class91 field1399;

    @OriginalMember(owner = "client!dha", name = "D", descriptor = "Lin;")
    public static class91 field1402;

    @OriginalMember(owner = "client!dha", name = "H", descriptor = "[B")
    private byte[] field1406;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IILbh;[I)Lew;", line = 4)
    public static final class493 method720(int arg0, int arg1, class37 arg2, int[] arg3) {
        field1405++;
        int[] var4 = null;
        if (arg0 != 255) {
            field1402 = null;
        }
        int[] var5 = null;
        int[] var6 = null;
        float[][] var7 = null;
        if (arg2.field887 != null) {
            int var8 = arg2.field885;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];
            for (int var15 = 0; var15 < var8; var15++) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }
            var7 = new float[var8][];
            var6 = new int[var8];
            var5 = new int[var8];
            for (int var16 = 0; var16 < arg1; var16++) {
                int var23 = arg3[var16];
                if (arg2.field887[var23] != -1) {
                    int var24 = arg2.field887[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg2.field930[var23];
                        } else if (var25 == 1) {
                            var26 = arg2.field902[var23];
                        } else {
                            var26 = arg2.field922[var23];
                        }
                        int var27 = arg2.field908[var26];
                        int var28 = arg2.field914[var26];
                        int var29 = arg2.field919[var26];
                        if (var9[var24] > var27) {
                            var9[var24] = var27;
                        }
                        if (var27 > var10[var24]) {
                            var10[var24] = var27;
                        }
                        if (var28 < var11[var24]) {
                            var11[var24] = var28;
                        }
                        if (var28 > var12[var24]) {
                            var12[var24] = var28;
                        }
                        if (var29 < var13[var24]) {
                            var13[var24] = var29;
                        }
                        if (var14[var24] < var29) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            var4 = new int[var8];
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg2.field890[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var20;
                    float var21;
                    float var22;
                    if (var18 == 1) {
                        int var19 = arg2.field926[var17];
                        if (var19 == 0) {
                            var20 = 1.0F;
                            var21 = 1.0F;
                        } else if (var19 <= 0) {
                            var20 = 1.0F;
                            var21 = (float) (-var19) / 1024.0F;
                        } else {
                            var21 = 1.0F;
                            var20 = (float) var19 / 1024.0F;
                        }
                        var22 = 64.0F / (float) arg2.field883[var17];
                    } else if (var18 == 2) {
                        var22 = 64.0F / (float) arg2.field883[var17];
                        var20 = 64.0F / (float) arg2.field911[var17];
                        var21 = 64.0F / (float) arg2.field926[var17];
                    } else {
                        var22 = (float) arg2.field883[var17] / 1024.0F;
                        var20 = (float) arg2.field911[var17] / 1024.0F;
                        var21 = (float) arg2.field926[var17] / 1024.0F;
                    }
                    var7[var17] = class195.method1395(arg2.field892[var17], arg2.field916[var17], var20, var21, 126, var22, arg2.field896[var17], class263.method1762(255, arg2.field900[var17]));
                }
            }
        }
        return new class493(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(ZZB)V", line = 184)
    public static final void method721(boolean arg0, boolean arg1, byte arg2) {
        field1403++;
        int var3 = -94 / ((-arg2 - 67) / 59);
        if (arg0) {
            class449.field6345++;
            class134.method1097(1415665776);
        }
        if (arg1) {
            class327.field4546++;
            class667.method3747(2);
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(BIB)V", line = 207)
    public final void method722(byte arg0, int arg1, byte arg2) {
        if (arg0 <= 79) {
            return;
        }
        field1401++;
        byte var4 = (byte) (((arg2 & 0xFF) >> 1) + 127);
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field1406[var10001] = var4;
        this.field1406[var6] = var4;
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "()V", line = 222)
    public class78() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IBII)[B", line = 226)
    public final byte[] method723(int arg0, byte arg1, int arg2, int arg3) {
        field1404++;
        this.field1406 = new byte[arg3 * 2 * arg0 * arg2];
        this.method2236(arg0, arg3, 0, arg2);
        int var5 = -61 % ((70 - arg1) / 37);
        return this.field1406;
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(Z)V", line = 242)
    public static void method724(boolean arg0) {
        field1402 = null;
        field1399 = null;
        if (!arg0) {
            field1402 = null;
        }
    }
}
