import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public abstract class class46 {

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
    private int field774 = 0;

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
    private int field778 = 4;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
    private int field779 = 4;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
    private int field776 = 4;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
    public int field770 = 4;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "[S")
    private short[] field773 = new short[512];

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "Ltm;")
    public static class334 field775 = new class334(88, 2);

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "[S")
    private short[] field777;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)V")
    public abstract void method468(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)I")
    public static final int method469(int arg0) {
        if (arg0 != 0) {
            field775 = null;
        }
        field780++;
        return class99.field1468;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIZI)V")
    public final void method470(int arg0, int arg1, boolean arg2, int arg3) {
        field781++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg0; var8++) {
            var5[var8] = (var8 << 12) / arg0;
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method473(1861690668);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field770; var14++) {
                        int var15 = this.field777[var14] << 12;
                        int var16 = this.field779 * var15 >> 12;
                        int var17 = this.field778 * var15 >> 12;
                        int var18 = this.field776 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field778 * var21;
                        int var23 = this.field779 * var20;
                        int var24 = this.field776 * var19;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var31 & 0xFF;
                        int var34;
                        if (var29 >= var16) {
                            var34 = 0;
                        } else {
                            var34 = var29 & 0xFF;
                        }
                        int var35;
                        if (var18 <= var26) {
                            var35 = 0;
                        } else {
                            var35 = var26 & 0xFF;
                        }
                        int var36;
                        if (var32 >= var17) {
                            var36 = 0;
                        } else {
                            var36 = var32 & 0xFF;
                        }
                        int var37 = var24 & 0xFFF;
                        int var38 = var23 & 0xFFF;
                        int var39 = var22 & 0xFFF;
                        int var40 = var38 - 4096;
                        short var41 = this.field773[var36];
                        int var42 = class648.field9218[var39];
                        int var43 = class648.field9218[var38];
                        int var44 = var39 - 4096;
                        int var45 = class648.field9218[var37];
                        short var46 = this.field773[var33];
                        int var47 = var37 - 4096;
                        short var48 = this.field773[var34 + var41];
                        short var49 = this.field773[var30 + var46];
                        short var50 = this.field773[var30 + var41];
                        short var51 = this.field773[var34 + var46];
                        int var52 = class632.method3577((byte) -114, var39, var38, var37, this.field773[var28 + var49]);
                        int var53 = class632.method3577((byte) -101, var39, var38, var47, this.field773[var35 + var49]);
                        int var54 = ((var53 - var52) * var45 >> 12) + var52;
                        int var55 = class632.method3577((byte) -118, var39, var40, var37, this.field773[var28 + var51]);
                        int var56 = class632.method3577((byte) -108, var39, var40, var47, this.field773[var35 + var51]);
                        int var57 = ((var56 - var55) * var45 >> 12) + var55;
                        int var58 = class632.method3577((byte) -99, var44, var38, var37, this.field773[var28 + var50]);
                        int var59 = var54 + ((var57 - var54) * var43 >> 12);
                        int var60 = class632.method3577((byte) -115, var44, var38, var47, this.field773[var35 + var50]);
                        int var61 = ((var60 - var58) * var45 >> 12) + var58;
                        int var62 = class632.method3577((byte) -124, var44, var40, var37, this.field773[var28 + var48]);
                        int var63 = class632.method3577((byte) -113, var44, var40, var47, this.field773[var35 + var48]);
                        int var64 = ((var63 - var62) * var45 >> 12) + var62;
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method468(var14, var59 + ((var65 - var59) * var42 >> 12), 4095);
                    }
                    this.method474(4095);
                }
            }
        }
        if (!arg2) {
            this.field779 = -51;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)V")
    private final void method471(boolean arg0) {
        if (arg0) {
            this.field778 = -109;
        }
        this.field777 = new short[this.field770];
        field772++;
        for (int var2 = 0; var2 < this.field770; var2++) {
            this.field777[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)V")
    private final void method472(byte arg0) {
        field771++;
        Random var2 = new Random((long) this.field774);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field773[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class721.method3975(var5, var2, false);
            short var7 = this.field773[var6];
            this.field773[var6] = this.field773[var5];
            this.field773[var5] = this.field773[var5 + 256] = var7;
        }
        if (arg0 <= 70) {
            method469(-39);
        }
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V")
    public abstract void method473(int arg0);

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V")
    public abstract void method474(int arg0);

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "(I)V")
    public static void method475(int arg0) {
        field775 = null;
        if (arg0 != 4) {
            method475(65);
        }
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(IIIII)V")
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field776 = arg2;
        this.field774 = arg0;
        this.field778 = arg4;
        this.field770 = arg1;
        this.field779 = arg3;
        this.method471(false);
        this.method472((byte) 109);
    }
}
