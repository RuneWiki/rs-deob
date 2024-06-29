import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public abstract class class290 {

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    private int field4371 = 4;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
    public int field4379 = 4;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    private int field4372 = 4;

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "[S")
    private short[] field4376 = new short[512];

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "I")
    private int field4380 = 4;

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
    private int field4377 = 0;

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "Luc;")
    public static class27 field4381 = new class27(19, 2);

    @OriginalMember(owner = "client!fda", name = "n", descriptor = "Lfc;")
    public static class235 field4382 = null;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "F")
    public static float field4370;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "[S")
    private short[] field4374;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V", line = 3)
    public static void method1823(byte arg0) {
        field4381 = null;
        int var1 = -34 / ((-arg0 - 49) / 36);
        field4382 = null;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIII)V", line = 17)
    public final void method1824(int arg0, int arg1, int arg2, int arg3) {
        field4369++;
        if (arg1 != 255) {
            this.method1826((byte) 14);
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg0];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        this.method897((byte) 62);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field4379; var14++) {
                        int var15 = this.field4374[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = this.field4372 * var15 >> 12;
                        int var19 = this.field4371 * var15 >> 12;
                        int var20 = this.field4380 * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field4372 * var16;
                        int var23 = this.field4380 * var21;
                        int var24 = this.field4371 * var17;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var24 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var30 & 0xFF;
                        int var34;
                        if (var26 >= var18) {
                            var34 = 0;
                        } else {
                            var34 = var26 & 0xFF;
                        }
                        int var35 = var24 & 0xFFF;
                        int var36;
                        if (var32 < var19) {
                            var36 = var32 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37;
                        if (var29 < var20) {
                            var37 = var29 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var22 & 0xFFF;
                        int var39 = var23 & 0xFFF;
                        int var40 = class528.field7228[var39];
                        int var41 = class528.field7228[var38];
                        short var42 = this.field4376[var33];
                        int var43 = var38 - 4096;
                        int var44 = class528.field7228[var35];
                        int var45 = var35 - 4096;
                        int var46 = var39 - 4096;
                        short var47 = this.field4376[var36];
                        short var48 = this.field4376[var31 + var42];
                        short var49 = this.field4376[var37 + var42];
                        short var50 = this.field4376[var31 + var47];
                        short var51 = this.field4376[var37 + var47];
                        int var52 = class249.method1542(false, var35, var38, var39, this.field4376[var27 + var48]);
                        int var53 = class249.method1542(false, var35, var43, var39, this.field4376[var34 + var48]);
                        int var54 = ((var53 - var52) * var41 >> 12) + var52;
                        int var55 = class249.method1542(false, var35, var38, var46, this.field4376[var27 + var49]);
                        int var56 = class249.method1542(false, var35, var43, var46, this.field4376[var34 + var49]);
                        int var57 = ((var56 - var55) * var41 >> 12) + var55;
                        int var58 = class249.method1542(false, var45, var38, var39, this.field4376[var27 + var50]);
                        int var59 = ((var57 - var54) * var40 >> 12) + var54;
                        int var60 = class249.method1542(false, var45, var43, var39, this.field4376[var34 + var50]);
                        int var61 = ((var60 - var58) * var41 >> 12) + var58;
                        int var62 = class249.method1542(false, var45, var38, var46, this.field4376[var27 + var51]);
                        int var63 = class249.method1542(false, var45, var43, var46, this.field4376[var34 + var51]);
                        int var64 = ((var63 - var62) * var41 >> 12) + var62;
                        int var65 = ((var64 - var61) * var40 >> 12) + var61;
                        this.method894(var59 + ((var65 - var59) * var44 >> 12), 630249516, var14);
                    }
                    this.method896((byte) -29);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(IIIII)V", line = 274)
    public class290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4380 = arg3;
        this.field4377 = arg0;
        this.field4371 = arg4;
        this.field4379 = arg1;
        this.field4372 = arg2;
        this.method1825((byte) -127);
        this.method1826((byte) -58);
    }

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "(B)V", line = 196)
    private final void method1825(byte arg0) {
        this.field4374 = new short[this.field4379];
        field4378++;
        if (arg0 > -112) {
            field4382 = null;
        }
        for (int var2 = 0; var2 < this.field4379; var2++) {
            this.field4374[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "(B)V", line = 229)
    private final void method1826(byte arg0) {
        if (arg0 != -58) {
            this.field4380 = -105;
        }
        field4375++;
        Random var2 = new Random((long) this.field4377);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4376[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class433.method2492((byte) 0, var2, var5);
            short var7 = this.field4376[var6];
            this.field4376[var6] = this.field4376[var5];
            this.field4376[var5] = this.field4376[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)V")
    public abstract void method897(byte arg0);

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(III)V")
    public abstract void method894(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "(B)V")
    public abstract void method896(byte arg0);
}
