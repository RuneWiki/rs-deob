import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class249 {

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    private int field3618 = 4;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    private int field3624 = 4;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    private int field3623 = 0;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "[S")
    private short[] field3622 = new short[512];

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    private int field3621 = 4;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public int field3629 = 4;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "[I")
    public static int[] field3625 = new int[32];

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field3628 = 0;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "[S")
    private short[] field3617;

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIII)V", line = 279)
    public class249(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3624 = arg3;
        this.field3629 = arg1;
        this.field3623 = arg0;
        this.field3621 = arg4;
        this.field3618 = arg2;
        this.method1684(0);
        this.method1683((byte) -79);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 22)
    private final void method1683(byte arg0) {
        field3620++;
        Random var2 = new Random((long) this.field3623);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3622[var3] = (short) var3;
        }
        int var4 = 0;
        if (arg0 != -79) {
            return;
        }
        while (var4 < 255) {
            int var5 = 255 - var4;
            int var6 = class151.method1094(var2, arg0 + 83, var5);
            short var7 = this.field3622[var6];
            this.field3622[var6] = this.field3622[var5];
            this.field3622[var5] = this.field3622[var5 + 256] = var7;
            var4++;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 59)
    private final void method1684(int arg0) {
        this.field3617 = new short[this.field3629];
        field3627++;
        for (int var2 = arg0; var2 < this.field3629; var2++) {
            this.field3617[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V", line = 80)
    public static void method1685(int arg0) {
        field3625 = null;
        if (arg0 != -28584) {
            method1685(47);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII)V", line = 111)
    public final void method1686(int arg0, int arg1, int arg2, int arg3) {
        field3626++;
        if (arg1 >= -102) {
            return;
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg3];
        for (int var7 = 0; var7 < arg2; var7++) {
            var5[var7] = (var7 << 12) / arg2;
        }
        int[] var8 = new int[arg0];
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var8[var10] = (var10 << 12) / arg0;
        }
        this.method1492(17168);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field3629; var14++) {
                        int var15 = this.field3617[var14] << 12;
                        int var16 = this.field3618 * var15 >> 12;
                        int var17 = var8[var11] * var15 >> 12;
                        int var18 = this.field3624 * var15 >> 12;
                        int var19 = this.field3621 * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field3624 * var20;
                        int var23 = this.field3618 * var21;
                        int var24 = this.field3621 * var17;
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
                        if (var16 > var26) {
                            var34 = var26 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35;
                        if (var29 < var18) {
                            var35 = var29 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36;
                        if (var32 >= var19) {
                            var36 = 0;
                        } else {
                            var36 = var32 & 0xFF;
                        }
                        int var37 = var31 & 0xFF;
                        int var38 = var22 & 0xFFF;
                        int var39 = var23 & 0xFFF;
                        int var40 = var33 - 4096;
                        short var41 = this.field3622[var36];
                        int var42 = class152.field2223[var39];
                        int var43 = var39 - 4096;
                        int var44 = var38 - 4096;
                        short var45 = this.field3622[var37];
                        int var46 = class152.field2223[var38];
                        int var47 = class152.field2223[var33];
                        short var48 = this.field3622[var35 + var41];
                        short var49 = this.field3622[var35 + var45];
                        short var50 = this.field3622[var30 + var45];
                        short var51 = this.field3622[var30 + var41];
                        int var52 = class94.method728((byte) -90, var33, var39, this.field3622[var28 + var50], var38);
                        int var53 = class94.method728((byte) -45, var33, var43, this.field3622[var34 + var50], var38);
                        int var54 = ((var53 - var52) * var42 >> 12) + var52;
                        int var55 = class94.method728((byte) -83, var33, var39, this.field3622[var28 + var49], var44);
                        int var56 = class94.method728((byte) -21, var33, var43, this.field3622[var34 + var49], var44);
                        int var57 = ((var56 - var55) * var42 >> 12) + var55;
                        int var58 = ((var57 - var54) * var46 >> 12) + var54;
                        int var59 = class94.method728((byte) -102, var40, var39, this.field3622[var28 + var51], var38);
                        int var60 = class94.method728((byte) -123, var40, var43, this.field3622[var34 + var51], var38);
                        int var61 = ((var60 - var59) * var42 >> 12) + var59;
                        int var62 = class94.method728((byte) -70, var40, var39, this.field3622[var28 + var48], var44);
                        int var63 = class94.method728((byte) -34, var40, var43, this.field3622[var34 + var48], var44);
                        int var64 = ((var63 - var62) * var42 >> 12) + var62;
                        int var65 = ((var64 - var61) * var46 >> 12) + var61;
                        this.method1488(((var65 - var58) * var47 >> 12) + var58, 776104748, var14);
                    }
                    this.method1487(1983798060);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public abstract void method1487(int arg0);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
    public abstract void method1488(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
    public abstract void method1492(int arg0);
}
