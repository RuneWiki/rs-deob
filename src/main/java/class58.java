import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class class58 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "[S")
    private short[] field935 = new short[512];

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    private int field943 = 0;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    private int field947 = 4;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    private int field946 = 4;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    private int field952 = 4;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public int field954 = 4;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Lna;")
    public static class26 field942 = class69.method505("Update)2Liste geladen)3", (byte) -118);

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "[Lgb;")
    public static class169[] field949 = new class169[4];

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Lna;")
    public static class26 field953 = class69.method505("Forced tweening disabled)3", (byte) -125);

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lve;")
    public static class266 field941;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lbe;")
    public static class297 field944;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[I")
    public static int[] field936;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[S")
    private short[] field937;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)V", line = 5)
    public final void method419(int arg0, int arg1, int arg2, int arg3) {
        field945++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg1; var8++) {
            var5[var8] = (var8 << 12) / arg1;
        }
        if (arg0 > -68) {
            this.method423(64);
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        this.method378(-949697716);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field954; var14++) {
                        int var15 = this.field937[var14] << 12;
                        int var16 = this.field947 * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = this.field946 * var15 >> 12;
                        int var19 = this.field952 * var17;
                        int var20 = this.field952 * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field947 * var21;
                        int var23 = var22 >> 12;
                        int var24 = var22 & 0xFFF;
                        int var25 = var19 >> 12;
                        int var26 = var24 - 4096;
                        int var27 = var23 + 1;
                        int var28 = var25 + 1;
                        int var29 = var6[var12] * var15 >> 12;
                        int var30 = class273.field4566[var24];
                        int var31 = this.field946 * var29;
                        int var32 = var25 & 0xFF;
                        int var33 = var23 & 0xFF;
                        int var34;
                        if (var20 <= var28) {
                            var34 = 0;
                        } else {
                            var34 = var28 & 0xFF;
                        }
                        int var35 = var31 >> 12;
                        short var36 = this.field935[var32];
                        short var37 = this.field935[var34];
                        int var38 = var35 + 1;
                        int var39;
                        if (var18 > var38) {
                            var39 = var38 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = var31 & 0xFFF;
                        short var41 = this.field935[var39 + var37];
                        int var42 = var19 & 0xFFF;
                        int var43 = var35 & 0xFF;
                        int var44 = class273.field4566[var42];
                        short var45 = this.field935[var37 + var43];
                        short var46 = this.field935[var36 + var43];
                        int var47;
                        if (var16 <= var27) {
                            var47 = 0;
                        } else {
                            var47 = var27 & 0xFF;
                        }
                        int var48 = var40 - 4096;
                        int var49 = class273.field4566[var40];
                        int var50 = var42 - 4096;
                        short var51 = this.field935[var36 + var39];
                        int var52 = class12.method75(var24, var42, var40, this.field935[var33 + var46], true);
                        int var53 = class12.method75(var26, var42, var40, this.field935[var47 + var46], true);
                        int var54 = var52 + ((var53 - var52) * var30 >> 12);
                        int var55 = class12.method75(var24, var42, var48, this.field935[var33 + var51], true);
                        int var56 = class12.method75(var26, var42, var48, this.field935[var47 + var51], true);
                        int var57 = ((var56 - var55) * var30 >> 12) + var55;
                        int var58 = ((var57 - var54) * var49 >> 12) + var54;
                        int var59 = class12.method75(var24, var50, var40, this.field935[var33 + var45], true);
                        int var60 = class12.method75(var26, var50, var40, this.field935[var45 + var47], true);
                        int var61 = ((var60 - var59) * var30 >> 12) + var59;
                        int var62 = class12.method75(var24, var50, var48, this.field935[var33 + var41], true);
                        int var63 = class12.method75(var26, var50, var48, this.field935[var41 + var47], true);
                        int var64 = ((var63 - var62) * var30 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var49 >> 12);
                        this.method377(((var65 - var58) * var44 >> 12) + var58, var14, -20975);
                    }
                    this.method371((byte) -92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V", line = 185)
    private final void method420(byte arg0) {
        field939++;
        this.field937 = new short[this.field954];
        int var2 = 0;
        if (arg0 != -60) {
            method421(-92, 105);
        }
        while (this.field954 > var2) {
            this.field937[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            var2++;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIIII)V", line = 333)
    public class58(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field946 = arg3;
        this.field954 = arg1;
        this.field943 = arg0;
        this.field952 = arg4;
        this.field947 = arg2;
        this.method420((byte) -60);
        this.method423(-190126388);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I", line = 222)
    public static final int method421(int arg0, int arg1) {
        int var2 = -27 / ((arg1 + 87) / 39);
        field950++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 248)
    public static void method422(int arg0) {
        field936 = null;
        field941 = null;
        if (arg0 == 4) {
            field942 = null;
            field949 = null;
            field953 = null;
            field944 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V", line = 291)
    private final void method423(int arg0) {
        field948++;
        Random var2 = new Random((long) this.field943);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field935[var3] = (short) var3;
        }
        if (arg0 != -190126388) {
            field940 = -58;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class24.method151((byte) -120, var5, var2);
            short var7 = this.field935[var6];
            this.field935[var6] = this.field935[var5];
            this.field935[var5] = this.field935[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public abstract void method371(byte arg0);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public abstract void method378(int arg0);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
    public abstract void method377(int arg0, int arg1, int arg2);
}
