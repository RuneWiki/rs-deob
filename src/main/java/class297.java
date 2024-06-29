import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public abstract class class297 {

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    private int field4264 = 4;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public int field4261 = 4;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "[S")
    private short[] field4262 = new short[512];

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    private int field4270 = 0;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    private int field4265 = 4;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    private int field4272 = 4;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "F")
    public static float field4268 = 0.25F;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "[S")
    private short[] field4267;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 3)
    public static final int method1861(String arg0, int arg1) {
        field4263++;
        if (arg1 != -295347412) {
            field4268 = -0.25434685F;
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 > '߿') {
                var3 += 3;
            } else {
                var3 += 2;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIII)V", line = 41)
    public static final void method1862(int arg0, int arg1, int arg2, int arg3) {
        field4271++;
        int var4 = arg1 + class382.field5687;
        if (arg2 != 4694638) {
            return;
        }
        int var5 = class597.field8500 + arg0;
        if (class277.field4051 == null || arg1 < 0 || arg0 < 0 || arg1 >= class146.field2247 || arg0 >= class66.field990) {
            return;
        }
        long var6 = (long) (var4 | var5 << 14 | arg3 << 28);
        class51 var8 = (class51) class573.field8163.method740(0, var6);
        if (var8 == null) {
            class229.method1510(arg3, arg1, arg0);
            return;
        }
        class38 var9 = (class38) var8.field755.method427(true);
        if (var9 == null) {
            class229.method1510(arg3, arg1, arg0);
            return;
        }
        class82 var10 = (class82) class229.method1510(arg3, arg1, arg0);
        if (var10 == null) {
            var10 = new class82();
        } else {
            var10.field1447 = var10.field1455 = -1;
        }
        var10.field1451 = var9.field515;
        var10.field1457 = var9.field513;
        label50: while (true) {
            class38 var11 = (class38) var8.field755.method420(false);
            if (var11 == null) {
                break;
            }
            if (var10.field1451 != var11.field515) {
                var10.field1449 = var11.field513;
                var10.field1447 = var11.field515;
                while (true) {
                    class38 var12 = (class38) var8.field755.method420(false);
                    if (var12 == null) {
                        break label50;
                    }
                    if (var10.field1451 != var12.field515 && var10.field1447 != var12.field515) {
                        var10.field1458 = var12.field513;
                        var10.field1455 = var12.field515;
                    }
                }
            }
        }
        int var13 = class355.method2160((arg1 << 7) + 64, (arg0 << 7) + 64, arg3, (byte) 103);
        class530.method2979(arg3, arg1, arg0, var13, var10);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V", line = 123)
    private final void method1863(byte arg0) {
        field4266++;
        Random var2 = new Random((long) this.field4270);
        int var3 = 0;
        int var4 = 20 / ((-arg0 - 63) / 50);
        while (var3 < 255) {
            this.field4262[var3] = (short) var3;
            var3++;
        }
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class407.method2472(45, var2, var6);
            short var8 = this.field4262[var7];
            this.field4262[var7] = this.field4262[var6];
            this.field4262[var6] = this.field4262[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIII)V", line = 384)
    public class297(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4264 = arg4;
        this.field4261 = arg1;
        this.field4272 = arg3;
        this.field4270 = arg0;
        this.field4265 = arg2;
        this.method1865((byte) 12);
        this.method1863((byte) -116);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IBII)V", line = 163)
    public final void method1864(int arg0, byte arg1, int arg2, int arg3) {
        field4269++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg0; var8++) {
            var5[var8] = (var8 << 12) / arg0;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        if (arg1 != 15) {
            this.field4267 = null;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var7[var10] = (var10 << 12) / arg3;
        }
        this.method703(4095);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field4261; var14++) {
                        int var15 = this.field4267[var14] << 12;
                        int var16 = this.field4265 * var15 >> 12;
                        int var17 = this.field4264 * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field4272 * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field4272 * var19;
                        int var23 = this.field4265 * var18;
                        int var24 = this.field4264 * var21;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var22 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var24 & 0xFFF;
                        int var34;
                        if (var32 >= var17) {
                            var34 = 0;
                        } else {
                            var34 = var32 & 0xFF;
                        }
                        int var35 = var23 & 0xFFF;
                        int var36;
                        if (var26 < var16) {
                            var36 = var26 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var22 & 0xFFF;
                        int var38 = var31 & 0xFF;
                        int var39;
                        if (var20 <= var29) {
                            var39 = 0;
                        } else {
                            var39 = var29 & 0xFF;
                        }
                        int var40 = var33 - 4096;
                        int var41 = var35 - 4096;
                        short var42 = this.field4262[var34];
                        int var43 = class186.field2693[var37];
                        int var44 = class186.field2693[var33];
                        short var45 = this.field4262[var38];
                        int var46 = var37 - 4096;
                        int var47 = class186.field2693[var35];
                        short var48 = this.field4262[var39 + var45];
                        short var49 = this.field4262[var30 + var45];
                        short var50 = this.field4262[var30 + var42];
                        short var51 = this.field4262[var39 + var42];
                        int var52 = class393.method2381(var35, this.field4262[var28 + var49], 0, var37, var33);
                        int var53 = class393.method2381(var41, this.field4262[var36 + var49], 0, var37, var33);
                        int var54 = var52 + ((var53 - var52) * var47 >> 12);
                        int var55 = class393.method2381(var35, this.field4262[var28 + var48], 0, var46, var33);
                        int var56 = class393.method2381(var41, this.field4262[var36 + var48], 0, var46, var33);
                        int var57 = ((var56 - var55) * var47 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var43 >> 12);
                        int var59 = class393.method2381(var35, this.field4262[var28 + var50], 0, var37, var40);
                        int var60 = class393.method2381(var41, this.field4262[var36 + var50], 0, var37, var40);
                        int var61 = ((var60 - var59) * var47 >> 12) + var59;
                        int var62 = class393.method2381(var35, this.field4262[var28 + var51], 0, var46, var40);
                        int var63 = class393.method2381(var41, this.field4262[var36 + var51], 0, var46, var40);
                        int var64 = var62 + ((var63 - var62) * var47 >> 12);
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method706(((var65 - var58) * var44 >> 12) + var58, var14, arg1 + 25);
                    }
                    this.method707(arg1 ^ 0xF);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V", line = 338)
    private final void method1865(byte arg0) {
        this.field4267 = new short[this.field4261];
        field4260++;
        if (arg0 != 12) {
            this.field4264 = 46;
        }
        for (int var2 = 0; var2 < this.field4261; var2++) {
            this.field4267[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public abstract void method707(int arg0);

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
    public abstract void method703(int arg0);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)V")
    public abstract void method706(int arg0, int arg1, int arg2);
}
