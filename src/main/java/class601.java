import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public abstract class class601 {

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "I")
    private int field8125 = 0;

    @OriginalMember(owner = "client!bha", name = "i", descriptor = "I")
    private int field8133 = 4;

    @OriginalMember(owner = "client!bha", name = "g", descriptor = "I")
    private int field8131 = 4;

    @OriginalMember(owner = "client!bha", name = "h", descriptor = "I")
    private int field8132 = 4;

    @OriginalMember(owner = "client!bha", name = "e", descriptor = "[S")
    private short[] field8129 = new short[512];

    @OriginalMember(owner = "client!bha", name = "f", descriptor = "I")
    public int field8130 = 4;

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!bha", name = "d", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!bha", name = "j", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "[S")
    private short[] field8126;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(BIII)V", line = 6)
    public final void method3433(byte arg0, int arg1, int arg2, int arg3) {
        field8128++;
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg1];
        int var8 = 0;
        if (arg0 != 18) {
            this.field8125 = 61;
        }
        while (arg3 > var8) {
            var5[var8] = (var8 << 12) / arg3;
            var8++;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method1753((byte) 126);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field8130; var14++) {
                        int var15 = this.field8126[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = this.field8133 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = this.field8131 * var15 >> 12;
                        int var21 = this.field8132 * var15 >> 12;
                        int var22 = this.field8131 * var16;
                        int var23 = this.field8132 * var19;
                        int var24 = this.field8133 * var17;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var22 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var29 >= var20) {
                            var33 = 0;
                        } else {
                            var33 = var29 & 0xFF;
                        }
                        int var34 = var22 & 0xFFF;
                        int var35 = var31 & 0xFF;
                        int var36;
                        if (var21 <= var26) {
                            var36 = 0;
                        } else {
                            var36 = var26 & 0xFF;
                        }
                        int var37 = var23 & 0xFFF;
                        int var38;
                        if (var32 < var18) {
                            var38 = var32 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var24 & 0xFFF;
                        int var40 = var37 - 4096;
                        int var41 = class326.field4038[var34];
                        short var42 = this.field8129[var38];
                        short var43 = this.field8129[var35];
                        int var44 = var39 - 4096;
                        int var45 = class326.field4038[var37];
                        int var46 = var34 - 4096;
                        int var47 = class326.field4038[var39];
                        short var48 = this.field8129[var30 + var42];
                        short var49 = this.field8129[var33 + var42];
                        short var50 = this.field8129[var30 + var43];
                        short var51 = this.field8129[var33 + var43];
                        int var52 = class116.method912((byte) -126, this.field8129[var28 + var50], var39, var37, var34);
                        int var53 = class116.method912((byte) -127, this.field8129[var36 + var50], var39, var40, var34);
                        int var54 = var52 + ((var53 - var52) * var45 >> 12);
                        int var55 = class116.method912((byte) -126, this.field8129[var28 + var51], var39, var37, var46);
                        int var56 = class116.method912((byte) -127, this.field8129[var36 + var51], var39, var40, var46);
                        int var57 = ((var56 - var55) * var45 >> 12) + var55;
                        int var58 = class116.method912((byte) -128, this.field8129[var28 + var48], var44, var37, var34);
                        int var59 = ((var57 - var54) * var41 >> 12) + var54;
                        int var60 = class116.method912((byte) -127, this.field8129[var36 + var48], var44, var40, var34);
                        int var61 = ((var60 - var58) * var45 >> 12) + var58;
                        int var62 = class116.method912((byte) -128, this.field8129[var28 + var49], var44, var37, var46);
                        int var63 = class116.method912((byte) -127, this.field8129[var36 + var49], var44, var40, var46);
                        int var64 = var62 + ((var63 - var62) * var45 >> 12);
                        int var65 = ((var64 - var61) * var41 >> 12) + var61;
                        this.method1751(345741388, var14, var59 + ((var65 - var59) * var47 >> 12));
                    }
                    this.method1752((byte) -71);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(IIIII)V", line = 262)
    public class601(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8132 = arg2;
        this.field8133 = arg4;
        this.field8130 = arg1;
        this.field8125 = arg0;
        this.field8131 = arg3;
        this.method3435(2);
        this.method3434(false);
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Z)V", line = 184)
    private final void method3434(boolean arg0) {
        field8134++;
        Random var2 = new Random((long) this.field8125);
        if (arg0) {
            return;
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field8129[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class93.method822(var2, -1, var5);
            short var7 = this.field8129[var6];
            this.field8129[var6] = this.field8129[var5];
            this.field8129[var5] = this.field8129[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V", line = 222)
    private final void method3435(int arg0) {
        field8127++;
        this.field8126 = new short[this.field8130];
        int var2 = 0;
        if (arg0 != 2) {
            this.method1753((byte) -88);
        }
        while (var2 < this.field8130) {
            this.field8126[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            var2++;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)V")
    public abstract void method1752(byte arg0);

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(III)V")
    public abstract void method1751(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(B)V")
    public abstract void method1753(byte arg0);
}
