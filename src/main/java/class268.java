import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class268 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field3945 = 4;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    private int field3948 = 4;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    private int field3954 = 0;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    private int field3956 = 4;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "[S")
    private short[] field3952 = new short[512];

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    private int field3957 = 4;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field3949 = 0;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Ljw;")
    public static class581 field3950 = new class581(13, -2);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "D")
    public static double field3943;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lgw;")
    public static class182 field3953;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "[Lcj;")
    public static class723[] field3958;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "[S")
    private short[] field3944;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1747(String arg0, int arg1) {
        field3947++;
        int var2 = arg0.length();
        long var3 = 0L;
        int var5 = 0;
        if (arg1 != 1009120652) {
            field3953 = null;
        }
        while (var5 < var2) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    private final void method1748(int arg0) {
        field3955++;
        Random var2 = new Random((long) this.field3954);
        if (arg0 != 25585) {
            field3943 = -0.4693745956794794D;
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3952[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class739.method4090(var2, 5, var5);
            short var7 = this.field3952[var6];
            this.field3952[var6] = this.field3952[var5];
            this.field3952[var5] = this.field3952[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
    public abstract void method816(int arg0);

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
    public static void method1749(int arg0) {
        field3958 = null;
        field3950 = null;
        if (arg0 == -21116) {
            field3953 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
    public abstract void method820(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    private final void method1750(byte arg0) {
        this.field3944 = new short[this.field3945];
        field3951++;
        for (int var2 = 0; var2 < this.field3945; var2++) {
            this.field3944[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 10) {
            this.field3945 = 20;
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
    public abstract void method817(int arg0);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIII)V")
    public final void method1751(byte arg0, int arg1, int arg2, int arg3) {
        field3946++;
        int var5 = 95 % ((arg0 - 13) / 63);
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg3; var8++) {
            var6[var8] = (var8 << 12) / arg3;
        }
        int[] var9 = new int[arg1];
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            var9[var11] = (var11 << 12) / arg1;
        }
        this.method817(29373);
        for (int var12 = 0; var12 < arg1; var12++) {
            for (int var13 = 0; var13 < arg2; var13++) {
                for (int var14 = 0; var14 < arg3; var14++) {
                    for (int var15 = 0; var15 < this.field3945; var15++) {
                        int var16 = this.field3944[var15] << 12;
                        int var17 = this.field3948 * var16 >> 12;
                        int var18 = var6[var14] * var16 >> 12;
                        int var19 = this.field3956 * var16 >> 12;
                        int var20 = var9[var12] * var16 >> 12;
                        int var21 = var7[var13] * var16 >> 12;
                        int var22 = this.field3957 * var16 >> 12;
                        int var23 = this.field3956 * var18;
                        int var24 = this.field3948 * var20;
                        int var25 = this.field3957 * var21;
                        int var26 = var23 >> 12;
                        int var27 = var26 + 1;
                        int var28 = var25 >> 12;
                        int var29 = var26 & 0xFF;
                        int var30 = var28 + 1;
                        int var31 = var24 >> 12;
                        int var32 = var28 & 0xFF;
                        int var33 = var31 + 1;
                        int var34;
                        if (var19 <= var27) {
                            var34 = 0;
                        } else {
                            var34 = var27 & 0xFF;
                        }
                        int var35;
                        if (var30 >= var22) {
                            var35 = 0;
                        } else {
                            var35 = var30 & 0xFF;
                        }
                        int var36 = var23 & 0xFFF;
                        int var37 = var25 & 0xFFF;
                        int var38 = var24 & 0xFFF;
                        int var39 = var31 & 0xFF;
                        int var40;
                        if (var17 > var33) {
                            var40 = var33 & 0xFF;
                        } else {
                            var40 = 0;
                        }
                        int var41 = var36 - 4096;
                        short var42 = this.field3952[var39];
                        int var43 = class449.field6269[var38];
                        int var44 = var38 - 4096;
                        short var45 = this.field3952[var40];
                        int var46 = var37 - 4096;
                        int var47 = class449.field6269[var37];
                        int var48 = class449.field6269[var36];
                        short var49 = this.field3952[var32 + var45];
                        short var50 = this.field3952[var32 + var42];
                        short var51 = this.field3952[var35 + var45];
                        short var52 = this.field3952[var35 + var42];
                        int var53 = class259.method1719(var38, this.field3952[var29 + var50], var37, (byte) -61, var36);
                        int var54 = class259.method1719(var38, this.field3952[var34 + var50], var37, (byte) -61, var41);
                        int var55 = ((var54 - var53) * var48 >> 12) + var53;
                        int var56 = class259.method1719(var38, this.field3952[var29 + var52], var46, (byte) -61, var36);
                        int var57 = class259.method1719(var38, this.field3952[var34 + var52], var46, (byte) -61, var41);
                        int var58 = ((var57 - var56) * var48 >> 12) + var56;
                        int var59 = class259.method1719(var44, this.field3952[var29 + var49], var37, (byte) -61, var36);
                        int var60 = ((var58 - var55) * var47 >> 12) + var55;
                        int var61 = class259.method1719(var44, this.field3952[var34 + var49], var37, (byte) -61, var41);
                        int var62 = var59 + ((var61 - var59) * var48 >> 12);
                        int var63 = class259.method1719(var44, this.field3952[var29 + var51], var46, (byte) -61, var36);
                        int var64 = class259.method1719(var44, this.field3952[var34 + var51], var46, (byte) -61, var41);
                        int var65 = ((var64 - var63) * var48 >> 12) + var63;
                        int var66 = ((var65 - var62) * var47 >> 12) + var62;
                        this.method820(0, ((var66 - var60) * var43 >> 12) + var60, var15);
                    }
                    this.method816(1029024876);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(IIIII)V")
    public class268(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3954 = arg0;
        this.field3948 = arg4;
        this.field3956 = arg2;
        this.field3957 = arg3;
        this.field3945 = arg1;
        this.method1750((byte) 10);
        this.method1748(25585);
    }
}
