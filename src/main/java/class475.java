import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public abstract class class475 {

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    private int field7016 = 4;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    private int field7014 = 4;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    private int field7015 = 4;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public int field7020 = 4;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "[S")
    private short[] field7023 = new short[512];

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    private int field7025 = 0;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "Lig;")
    public static class206 field7022 = new class206(56, -1);

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field7024 = 0;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lwh;")
    public static class129 field7013;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "[I")
    public static int[] field7018;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "[S")
    private short[] field7017;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIBI)V", line = 8)
    public final void method2905(int arg0, int arg1, byte arg2, int arg3) {
        field7012++;
        if (arg2 > -46) {
            this.field7017 = null;
        }
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method2804(4096);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field7020; var14++) {
                        int var15 = this.field7017[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = var6[var12] * var15 >> 12;
                        int var18 = var8[var11] * var15 >> 12;
                        int var19 = this.field7015 * var15 >> 12;
                        int var20 = this.field7014 * var15 >> 12;
                        int var21 = this.field7016 * var15 >> 12;
                        int var22 = this.field7014 * var18;
                        int var23 = this.field7016 * var17;
                        int var24 = this.field7015 * var16;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var30 & 0xFF;
                        int var34;
                        if (var21 <= var29) {
                            var34 = 0;
                        } else {
                            var34 = var29 & 0xFF;
                        }
                        int var35;
                        if (var26 < var19) {
                            var35 = var26 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36;
                        if (var32 < var20) {
                            var36 = var32 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var23 & 0xFFF;
                        int var38 = var22 & 0xFFF;
                        int var39 = var24 & 0xFFF;
                        int var40 = class455.field6808[var38];
                        int var41 = class455.field6808[var37];
                        short var42 = this.field7023[var36];
                        int var43 = class455.field6808[var39];
                        int var44 = var39 - 4096;
                        int var45 = var37 - 4096;
                        short var46 = this.field7023[var33];
                        int var47 = var38 - 4096;
                        short var48 = this.field7023[var31 + var46];
                        short var49 = this.field7023[var34 + var46];
                        short var50 = this.field7023[var31 + var42];
                        short var51 = this.field7023[var34 + var42];
                        int var52 = class315.method2070(var37, 12095, var38, this.field7023[var27 + var48], var39);
                        int var53 = class315.method2070(var37, 12095, var38, this.field7023[var35 + var48], var44);
                        int var54 = ((var53 - var52) * var43 >> 12) + var52;
                        int var55 = class315.method2070(var45, 12095, var38, this.field7023[var27 + var49], var39);
                        int var56 = class315.method2070(var45, 12095, var38, this.field7023[var35 + var49], var44);
                        int var57 = ((var56 - var55) * var43 >> 12) + var55;
                        int var58 = ((var57 - var54) * var41 >> 12) + var54;
                        int var59 = class315.method2070(var37, 12095, var47, this.field7023[var27 + var50], var39);
                        int var60 = class315.method2070(var37, 12095, var47, this.field7023[var35 + var50], var44);
                        int var61 = ((var60 - var59) * var43 >> 12) + var59;
                        int var62 = class315.method2070(var45, 12095, var47, this.field7023[var27 + var51], var39);
                        int var63 = class315.method2070(var45, 12095, var47, this.field7023[var35 + var51], var44);
                        int var64 = ((var63 - var62) * var43 >> 12) + var62;
                        int var65 = ((var64 - var61) * var41 >> 12) + var61;
                        this.method2807((byte) 82, var14, ((var65 - var58) * var40 >> 12) + var58);
                    }
                    this.method2806(4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 174)
    private final void method2906(byte arg0) {
        if (arg0 != 52) {
            this.method2907(82);
        }
        field7019++;
        Random var2 = new Random((long) this.field7025);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field7023[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class107.method659(var2, false, var5);
            short var7 = this.field7023[var6];
            this.field7023[var6] = this.field7023[var5];
            this.field7023[var5] = this.field7023[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V", line = 214)
    private final void method2907(int arg0) {
        this.field7017 = new short[this.field7020];
        field7021++;
        for (int var2 = 0; var2 < this.field7020; var2++) {
            this.field7017[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 < 25) {
            this.field7015 = -72;
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIII)V", line = 283)
    public class475(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7016 = arg3;
        this.field7015 = arg2;
        this.field7025 = arg0;
        this.field7020 = arg1;
        this.field7014 = arg4;
        this.method2907(71);
        this.method2906((byte) 52);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V", line = 265)
    public static void method2908(boolean arg0) {
        field7022 = null;
        field7013 = null;
        field7018 = null;
        if (arg0) {
            field7024 = -22;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public abstract void method2804(int arg0);

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
    public abstract void method2806(int arg0);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BII)V")
    public abstract void method2807(byte arg0, int arg1, int arg2);
}
