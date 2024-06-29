import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class658 {

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    private int field9275 = 4;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[S")
    private short[] field9270 = new short[512];

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    private int field9279 = 4;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    private int field9276 = 0;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public int field9281 = 4;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    private int field9280 = 4;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Ljj;")
    public static class398 field9273 = new class398(1, -1);

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "[Lkh;")
    public static class578[] field9278 = new class578[50];

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field9271;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field9282;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[S")
    private short[] field9272;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method3641(byte arg0) {
        field9278 = null;
        field9273 = null;
        if (arg0 != 37) {
            method3643((byte) 74);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public abstract void method2985(byte arg0);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    private final void method3642(int arg0) {
        field9271++;
        Random var2 = new Random((long) this.field9276);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field9270[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class571.method3224((byte) -120, var5, var2);
            short var7 = this.field9270[var6];
            this.field9270[var6] = this.field9270[var5];
            this.field9270[var5] = this.field9270[var5 + 256] = var7;
        }
        if (arg0 >= -82) {
            this.method2984((byte) -24, 76, -12);
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
    public static final void method3643(byte arg0) {
        field9277++;
        class151.field1899.method3142(false);
        class645.field9137.method3142(false);
        class506.field6852.method3142(false);
        class48.field655.method3142(false);
        class620.field8434.method3142(false);
        if (arg0 != -106) {
            field9273 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)V")
    public abstract void method2984(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V")
    private final void method3644(byte arg0) {
        field9274++;
        this.field9272 = new short[this.field9281];
        for (int var2 = 0; var2 < this.field9281; var2++) {
            this.field9272[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != -89) {
            this.method3645(-107, -26, -35, -9);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V")
    public final void method3645(int arg0, int arg1, int arg2, int arg3) {
        field9269++;
        if (arg3 != -23747) {
            this.field9275 = -113;
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg2; var7++) {
            var5[var7] = (var7 << 12) / arg2;
        }
        int[] var8 = new int[arg0];
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var8[var10] = (var10 << 12) / arg0;
        }
        this.method2986((byte) -74);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field9281; var14++) {
                        int var15 = this.field9272[var14] << 12;
                        int var16 = var8[var11] * var15 >> 12;
                        int var17 = this.field9280 * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field9279 * var15 >> 12;
                        int var21 = this.field9275 * var15 >> 12;
                        int var22 = this.field9275 * var16;
                        int var23 = this.field9280 * var19;
                        int var24 = this.field9279 * var18;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var22 & 0xFFF;
                        int var34;
                        if (var32 < var21) {
                            var34 = var32 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35;
                        if (var17 <= var29) {
                            var35 = 0;
                        } else {
                            var35 = var29 & 0xFF;
                        }
                        int var36 = var30 & 0xFF;
                        int var37;
                        if (var20 <= var26) {
                            var37 = 0;
                        } else {
                            var37 = var26 & 0xFF;
                        }
                        int var38 = var24 & 0xFFF;
                        int var39 = var23 & 0xFFF;
                        short var40 = this.field9270[var34];
                        int var41 = class121.field1565[var39];
                        int var42 = var39 - 4096;
                        int var43 = var38 - 4096;
                        int var44 = class121.field1565[var38];
                        short var45 = this.field9270[var36];
                        int var46 = var33 - 4096;
                        int var47 = class121.field1565[var33];
                        short var48 = this.field9270[var35 + var40];
                        short var49 = this.field9270[var35 + var45];
                        short var50 = this.field9270[var31 + var45];
                        short var51 = this.field9270[var31 + var40];
                        int var52 = class194.method1237(var39, var33, var38, this.field9270[var27 + var50], (byte) -98);
                        int var53 = class194.method1237(var39, var33, var43, this.field9270[var37 + var50], (byte) 116);
                        int var54 = ((var53 - var52) * var44 >> 12) + var52;
                        int var55 = class194.method1237(var42, var33, var38, this.field9270[var27 + var49], (byte) 64);
                        int var56 = class194.method1237(var42, var33, var43, this.field9270[var37 + var49], (byte) -67);
                        int var57 = ((var56 - var55) * var44 >> 12) + var55;
                        int var58 = class194.method1237(var39, var46, var38, this.field9270[var27 + var51], (byte) -115);
                        int var59 = ((var57 - var54) * var41 >> 12) + var54;
                        int var60 = class194.method1237(var39, var46, var43, this.field9270[var37 + var51], (byte) 106);
                        int var61 = ((var60 - var58) * var44 >> 12) + var58;
                        int var62 = class194.method1237(var42, var46, var38, this.field9270[var27 + var48], (byte) -66);
                        int var63 = class194.method1237(var42, var46, var43, this.field9270[var37 + var48], (byte) -56);
                        int var64 = ((var63 - var62) * var44 >> 12) + var62;
                        int var65 = ((var64 - var61) * var41 >> 12) + var61;
                        this.method2984((byte) -116, var14, ((var65 - var59) * var47 >> 12) + var59);
                    }
                    this.method2985((byte) 92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V")
    public abstract void method2986(byte arg0);

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(IIIII)V")
    public class658(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9275 = arg4;
        this.field9281 = arg1;
        this.field9276 = arg0;
        this.field9279 = arg2;
        this.field9280 = arg3;
        this.method3644((byte) -89);
        this.method3642(-91);
    }
}
