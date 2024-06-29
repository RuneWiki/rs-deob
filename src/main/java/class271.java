import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public abstract class class271 {

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    private int field3573 = 4;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "[S")
    private short[] field3575 = new short[512];

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public int field3572 = 4;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    private int field3581 = 4;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    private int field3578 = 0;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    private int field3582 = 4;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "Lbfa;")
    public static class372 field3586;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "Ljava/awt/Frame;")
    public static Frame field3587;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "[S")
    private short[] field3579;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public abstract void method1617(int arg0);

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V")
    public static void method1618(int arg0) {
        field3587 = null;
        field3586 = null;
        if (arg0 != 15029) {
            method1622(-38);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)V")
    public abstract void method1619(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
    private final void method1620(byte arg0) {
        field3584++;
        Random var2 = new Random((long) this.field3578);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3575[var3] = (short) var3;
        }
        int var4 = 0;
        if (arg0 != 116) {
            this.method1621(-94);
        }
        while (var4 < 255) {
            int var5 = 255 - var4;
            int var6 = class676.method3842(-28737, var5, var2);
            short var7 = this.field3575[var6];
            this.field3575[var6] = this.field3575[var5];
            this.field3575[var5] = this.field3575[var5 + 256] = var7;
            var4++;
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)V")
    public abstract void method1621(int arg0);

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V")
    public static final void method1622(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class587.field8213[var1] = false;
        }
        field3583++;
        if (arg0 != 9268) {
            field3586 = null;
        }
        class372.field5192 = 0;
        class106.field1414 = 0;
        class8.field57 = 1;
        class409.field5778 = -1;
        class39.field404 = -1;
        class520.field6999 = -1;
        class695.field9715 = -1;
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V")
    private final void method1623(int arg0) {
        this.field3579 = new short[this.field3572];
        field3580++;
        if (arg0 == 10567) {
            for (int var2 = 0; var2 < this.field3572; var2++) {
                this.field3579[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BIII)V")
    public final void method1624(byte arg0, int arg1, int arg2, int arg3) {
        field3577++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg2];
        for (int var7 = 0; var7 < arg1; var7++) {
            var5[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg3];
        if (arg0 >= 0) {
            field3587 = null;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method1617(751943489);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field3572; var14++) {
                        int var15 = this.field3579[var14] << 12;
                        int var16 = this.field3581 * var15 >> 12;
                        int var17 = this.field3573 * var15 >> 12;
                        int var18 = this.field3582 * var15 >> 12;
                        int var19 = var8[var11] * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field3582 * var19;
                        int var23 = this.field3581 * var21;
                        int var24 = this.field3573 * var20;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var24 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var31 & 0xFF;
                        int var34 = var23 & 0xFFF;
                        int var35;
                        if (var29 < var17) {
                            var35 = var29 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36;
                        if (var18 <= var32) {
                            var36 = 0;
                        } else {
                            var36 = var32 & 0xFF;
                        }
                        int var37 = var22 & 0xFFF;
                        int var38 = var24 & 0xFFF;
                        int var39;
                        if (var16 <= var26) {
                            var39 = 0;
                        } else {
                            var39 = var26 & 0xFF;
                        }
                        short var40 = this.field3575[var36];
                        short var41 = this.field3575[var33];
                        int var42 = class443.field6171[var37];
                        int var43 = class443.field6171[var38];
                        int var44 = var34 - 4096;
                        int var45 = var38 - 4096;
                        int var46 = var37 - 4096;
                        int var47 = class443.field6171[var34];
                        short var48 = this.field3575[var30 + var40];
                        short var49 = this.field3575[var30 + var41];
                        short var50 = this.field3575[var35 + var41];
                        short var51 = this.field3575[var35 + var40];
                        int var52 = class125.method805(var37, var38, var34, this.field3575[var27 + var49], -5);
                        int var53 = class125.method805(var37, var38, var44, this.field3575[var39 + var49], -5);
                        int var54 = ((var53 - var52) * var47 >> 12) + var52;
                        int var55 = class125.method805(var37, var45, var34, this.field3575[var27 + var50], -5);
                        int var56 = class125.method805(var37, var45, var44, this.field3575[var39 + var50], -5);
                        int var57 = ((var56 - var55) * var47 >> 12) + var55;
                        int var58 = class125.method805(var46, var38, var34, this.field3575[var27 + var48], -5);
                        int var59 = var54 + ((var57 - var54) * var43 >> 12);
                        int var60 = class125.method805(var46, var38, var44, this.field3575[var39 + var48], -5);
                        int var61 = ((var60 - var58) * var47 >> 12) + var58;
                        int var62 = class125.method805(var46, var45, var34, this.field3575[var27 + var51], -5);
                        int var63 = class125.method805(var46, var45, var44, this.field3575[var39 + var51], -5);
                        int var64 = ((var63 - var62) * var47 >> 12) + var62;
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method1619(var14, var59 + ((var65 - var59) * var42 >> 12), 255);
                    }
                    this.method1621(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIBII)V")
    public static final void method1625(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3585++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg1 * arg1;
        int var9 = arg5 * arg5;
        int var10 = -81 / ((arg3 - 4) / 45);
        int var11 = var9 << 1;
        int var12 = var8 << 1;
        int var13 = arg5 << 1;
        int var14 = (1 - var13) * var8 + var11;
        int var15 = var9 - ((var13 - 1) * var12);
        int var16 = var8 << 2;
        int var17 = var9 << 2;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = ((arg5 << 1) - 3) * var12;
        int var20 = (var6 + 1) * var17;
        class168.method980(arg2, class300.field4036[arg0], arg4 - arg1, arg1 + arg4, (byte) 99);
        int var21 = (arg5 - 1) * var16;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var18;
                    var15 += var20;
                    var6++;
                    var20 += var17;
                    var18 += var17;
                }
            }
            if (var15 < 0) {
                var15 += var20;
                var14 += var18;
                var18 += var17;
                var6++;
                var20 += var17;
            }
            var14 += -var21;
            var15 += -var19;
            var19 -= var16;
            var7--;
            var21 -= var16;
            int var22 = arg0 - var7;
            int var23 = arg0 + var7;
            int var24 = arg4 + var6;
            int var25 = arg4 - var6;
            class168.method980(arg2, class300.field4036[var22], var25, var24, (byte) -127);
            class168.method980(arg2, class300.field4036[var23], var25, var24, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(IIIII)V")
    public class271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3573 = arg3;
        this.field3582 = arg4;
        this.field3581 = arg2;
        this.field3572 = arg1;
        this.field3578 = arg0;
        this.method1623(10567);
        this.method1620((byte) 116);
    }
}
