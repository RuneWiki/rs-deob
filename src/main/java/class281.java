import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public abstract class class281 {

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "[S")
    private short[] field4499 = new short[512];

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    private int field4500 = 4;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    private int field4498 = 0;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
    private int field4501 = 4;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
    public int field4507 = 4;

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
    private int field4506 = 4;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "F")
    public static float field4508;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "Lmu;")
    public static class275 field4505;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "Lf;")
    public static class702 field4497;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "[S")
    private short[] field4504;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(III)V", line = 5)
    public static final void method1994(int arg0, int arg1, int arg2) {
        if (arg0 <= 45) {
            field4505 = null;
        }
        field4495++;
        if (class107.method1016(arg2, (byte) 118)) {
            class581.method3412(arg1, (byte) -114, class564.field8105[arg2]);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V", line = 23)
    private final void method1995(boolean arg0) {
        field4496++;
        Random var2 = new Random((long) this.field4498);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4499[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class93.method902(8047, var2, var5);
            short var7 = this.field4499[var6];
            this.field4499[var6] = this.field4499[var5];
            this.field4499[var5] = this.field4499[var5 + 256] = var7;
        }
        if (arg0) {
            this.method1998(-9, -22, -12, -51);
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIIII)V", line = 293)
    public class281(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4507 = arg1;
        this.field4506 = arg3;
        this.field4498 = arg0;
        this.field4500 = arg2;
        this.field4501 = arg4;
        this.method1997((byte) -100);
        this.method1995(false);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V", line = 70)
    private final void method1997(byte arg0) {
        this.field4504 = new short[this.field4507];
        field4503++;
        int var2 = 0;
        if (arg0 > -58) {
            this.field4504 = null;
        }
        while (var2 < this.field4507) {
            this.field4504[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            var2++;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIII)V", line = 91)
    public final void method1998(int arg0, int arg1, int arg2, int arg3) {
        field4502++;
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg0];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        if (arg1 != 4095) {
            this.method1998(-62, 33, 105, -49);
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var7[var10] = (var10 << 12) / arg0;
        }
        this.method1999(true);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field4507; var14++) {
                        int var15 = this.field4504[var14] << 12;
                        int var16 = var6[var12] * var15 >> 12;
                        int var17 = this.field4501 * var15 >> 12;
                        int var18 = this.field4506 * var15 >> 12;
                        int var19 = var7[var11] * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = this.field4500 * var15 >> 12;
                        int var22 = this.field4501 * var19;
                        int var23 = this.field4500 * var20;
                        int var24 = this.field4506 * var16;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var29 < var18) {
                            var33 = var29 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34;
                        if (var32 < var17) {
                            var34 = var32 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35;
                        if (var21 <= var26) {
                            var35 = 0;
                        } else {
                            var35 = var26 & 0xFF;
                        }
                        int var36 = var31 & 0xFF;
                        int var37 = var23 & 0xFFF;
                        int var38 = var24 & 0xFFF;
                        int var39 = var22 & 0xFFF;
                        int var40 = var39 - 4096;
                        int var41 = var37 - 4096;
                        int var42 = class439.field6696[var39];
                        short var43 = this.field4499[var36];
                        short var44 = this.field4499[var34];
                        int var45 = class439.field6696[var37];
                        int var46 = class439.field6696[var38];
                        int var47 = var38 - 4096;
                        short var48 = this.field4499[var33 + var43];
                        short var49 = this.field4499[var30 + var44];
                        short var50 = this.field4499[var33 + var44];
                        short var51 = this.field4499[var30 + var43];
                        int var52 = class122.method1095(var38, this.field4499[var28 + var51], arg1 ^ 0xFF0, var37, var39);
                        int var53 = class122.method1095(var38, this.field4499[var35 + var51], 15, var41, var39);
                        int var54 = ((var53 - var52) * var45 >> 12) + var52;
                        int var55 = class122.method1095(var47, this.field4499[var28 + var48], 15, var37, var39);
                        int var56 = class122.method1095(var47, this.field4499[var35 + var48], 15, var41, var39);
                        int var57 = ((var56 - var55) * var45 >> 12) + var55;
                        int var58 = class122.method1095(var38, this.field4499[var28 + var49], 15, var37, var40);
                        int var59 = ((var57 - var54) * var46 >> 12) + var54;
                        int var60 = class122.method1095(var38, this.field4499[var35 + var49], 15, var41, var40);
                        int var61 = ((var60 - var58) * var45 >> 12) + var58;
                        int var62 = class122.method1095(var47, this.field4499[var28 + var50], 15, var37, var40);
                        int var63 = class122.method1095(var47, this.field4499[var35 + var50], 15, var41, var40);
                        int var64 = ((var63 - var62) * var45 >> 12) + var62;
                        int var65 = ((var64 - var61) * var46 >> 12) + var61;
                        this.method1996(var59 + ((var65 - var59) * var42 >> 12), var14, 255);
                    }
                    this.method1993(arg1 - 3994);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)V", line = 272)
    public static void method2000(byte arg0) {
        field4497 = null;
        field4505 = null;
        if (arg0 != 8) {
            field4497 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
    public abstract void method1993(int arg0);

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(III)V")
    public abstract void method1996(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(Z)V")
    public abstract void method1999(boolean arg0);
}
