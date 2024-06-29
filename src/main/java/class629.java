import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public abstract class class629 {

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "I")
    private int field8477 = 4;

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
    private int field8478 = 4;

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "[S")
    private short[] field8485 = new short[512];

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
    public int field8483 = 4;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
    private int field8479 = 4;

    @OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
    private int field8487 = 0;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "[I")
    public static int[] field8482 = new int[50];

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!vfa", name = "k", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "[S")
    private short[] field8476;

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "[S")
    public static short[] field8484;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Z)V")
    public static void method3460(boolean arg0) {
        field8482 = null;
        if (arg0) {
            field8484 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V")
    private final void method3461(byte arg0) {
        field8480++;
        Random var2 = new Random((long) this.field8487);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field8485[var3] = (short) var3;
        }
        if (arg0 != 34) {
            this.method3463(15, true, -6, 63);
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class660.method3697(0, var5, var2);
            short var7 = this.field8485[var6];
            this.field8485[var6] = this.field8485[var5];
            this.field8485[var5] = this.field8485[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
    public abstract void method974(int arg0);

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V")
    private final void method3462(int arg0) {
        field8481++;
        this.field8476 = new short[this.field8483];
        for (int var2 = 0; var2 < this.field8483; var2++) {
            this.field8476[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 2) {
            this.method980(-89);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)V")
    public abstract void method980(int arg0);

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZI)V")
    public abstract void method978(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZII)V")
    public final void method3463(int arg0, boolean arg1, int arg2, int arg3) {
        field8486++;
        if (!arg1) {
            this.field8477 = -91;
        }
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg3];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg2];
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var8[var10] = (var10 << 12) / arg2;
        }
        this.method974(4);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field8483; var14++) {
                        int var15 = this.field8476[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = this.field8478 * var15 >> 12;
                        int var19 = var8[var11] * var15 >> 12;
                        int var20 = this.field8479 * var15 >> 12;
                        int var21 = this.field8477 * var15 >> 12;
                        int var22 = this.field8478 * var19;
                        int var23 = this.field8477 * var17;
                        int var24 = this.field8479 * var16;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var24 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var32 < var18) {
                            var33 = var32 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34;
                        if (var21 <= var26) {
                            var34 = 0;
                        } else {
                            var34 = var26 & 0xFF;
                        }
                        int var35 = var22 & 0xFFF;
                        int var36 = var23 & 0xFFF;
                        int var37 = var24 & 0xFFF;
                        int var38;
                        if (var29 < var20) {
                            var38 = var29 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var31 & 0xFF;
                        int var40 = class75.field1186[var37];
                        int var41 = class75.field1186[var36];
                        int var42 = var35 - 4096;
                        short var43 = this.field8485[var33];
                        int var44 = var37 - 4096;
                        short var45 = this.field8485[var39];
                        int var46 = class75.field1186[var35];
                        int var47 = var36 - 4096;
                        short var48 = this.field8485[var38 + var43];
                        short var49 = this.field8485[var30 + var45];
                        short var50 = this.field8485[var30 + var43];
                        short var51 = this.field8485[var38 + var45];
                        int var52 = class44.method312(var37, var35, var36, -19104, this.field8485[var27 + var49]);
                        int var53 = class44.method312(var37, var35, var47, -19104, this.field8485[var34 + var49]);
                        int var54 = var52 + ((var53 - var52) * var41 >> 12);
                        int var55 = class44.method312(var44, var35, var36, -19104, this.field8485[var27 + var51]);
                        int var56 = class44.method312(var44, var35, var47, -19104, this.field8485[var34 + var51]);
                        int var57 = var55 + ((var56 - var55) * var41 >> 12);
                        int var58 = ((var57 - var54) * var40 >> 12) + var54;
                        int var59 = class44.method312(var37, var42, var36, -19104, this.field8485[var27 + var50]);
                        int var60 = class44.method312(var37, var42, var47, -19104, this.field8485[var34 + var50]);
                        int var61 = var59 + ((var60 - var59) * var41 >> 12);
                        int var62 = class44.method312(var44, var42, var36, -19104, this.field8485[var27 + var48]);
                        int var63 = class44.method312(var44, var42, var47, -19104, this.field8485[var34 + var48]);
                        int var64 = ((var63 - var62) * var41 >> 12) + var62;
                        int var65 = ((var64 - var61) * var40 >> 12) + var61;
                        this.method978(var14, !arg1, ((var65 - var58) * var46 >> 12) + var58);
                    }
                    this.method980(92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(IIIII)V")
    public class629(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8487 = arg0;
        this.field8477 = arg2;
        this.field8479 = arg3;
        this.field8483 = arg1;
        this.field8478 = arg4;
        this.method3462(2);
        this.method3461((byte) 34);
    }
}
