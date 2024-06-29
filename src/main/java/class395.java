import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class395 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    private int field5609 = 0;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[S")
    private short[] field5621 = new short[512];

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public int field5619 = 4;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    private int field5614 = 4;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    private int field5618 = 4;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    private int field5612 = 4;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5620 = "";

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[S")
    private short[] field5616;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method2365(int arg0, String arg1, int arg2, int arg3, String arg4, String arg5, int arg6, String arg7) {
        field5622++;
        class170 var8 = class11.field120[99];
        for (int var9 = 99; var9 > 0; var9--) {
            class11.field120[var9] = class11.field120[var9 - 1];
        }
        if (arg6 != -1) {
            field5620 = null;
        }
        if (var8 == null) {
            var8 = new class170(arg3, arg0, arg1, arg7, arg4, arg2, arg5);
        } else {
            var8.method1084(-53, arg0, arg3, arg1, arg7, arg5, arg4, arg2);
        }
        class142.field2195 = class81.field1324;
        class11.field120[0] = var8;
        class597.field8634++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BII)V")
    public abstract void method919(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public abstract void method917(int arg0);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    private final void method2366(int arg0) {
        field5611++;
        Random var2 = new Random((long) this.field5609);
        int var3 = 0;
        if (arg0 <= 108) {
            field5620 = null;
        }
        while (var3 < 255) {
            this.field5621[var3] = (short) var3;
            var3++;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class303.method1924((byte) -66, var2, var5);
            short var7 = this.field5621[var6];
            this.field5621[var6] = this.field5621[var5];
            this.field5621[var5] = this.field5621[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZI)V")
    public final void method2367(int arg0, int arg1, boolean arg2, int arg3) {
        field5613++;
        if (!arg2) {
            return;
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg0];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method917(-28503);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field5619; var14++) {
                        int var15 = this.field5616[var14] << 12;
                        int var16 = this.field5618 * var15 >> 12;
                        int var17 = this.field5614 * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = this.field5612 * var15 >> 12;
                        int var20 = var7[var11] * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field5614 * var20;
                        int var23 = this.field5618 * var18;
                        int var24 = this.field5612 * var21;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34 = var31 & 0xFF;
                        int var35;
                        if (var29 >= var16) {
                            var35 = 0;
                        } else {
                            var35 = var29 & 0xFF;
                        }
                        int var36 = var24 & 0xFFF;
                        int var37 = var22 & 0xFFF;
                        int var38;
                        if (var19 <= var26) {
                            var38 = 0;
                        } else {
                            var38 = var26 & 0xFF;
                        }
                        int var39;
                        if (var32 < var17) {
                            var39 = var32 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = class219.field3133[var33];
                        short var41 = this.field5621[var34];
                        int var42 = class219.field3133[var36];
                        short var43 = this.field5621[var39];
                        int var44 = var37 - 4096;
                        int var45 = class219.field3133[var37];
                        int var46 = var33 - 4096;
                        int var47 = var36 - 4096;
                        short var48 = this.field5621[var30 + var43];
                        short var49 = this.field5621[var35 + var43];
                        short var50 = this.field5621[var30 + var41];
                        short var51 = this.field5621[var35 + var41];
                        int var52 = class152.method994(var37, this.field5621[var28 + var50], var36, (byte) 64, var33);
                        int var53 = class152.method994(var37, this.field5621[var38 + var50], var47, (byte) 64, var33);
                        int var54 = var52 + ((var53 - var52) * var42 >> 12);
                        int var55 = class152.method994(var37, this.field5621[var28 + var51], var36, (byte) 64, var46);
                        int var56 = class152.method994(var37, this.field5621[var38 + var51], var47, (byte) 64, var46);
                        int var57 = ((var56 - var55) * var42 >> 12) + var55;
                        int var58 = ((var57 - var54) * var40 >> 12) + var54;
                        int var59 = class152.method994(var44, this.field5621[var28 + var48], var36, (byte) 64, var33);
                        int var60 = class152.method994(var44, this.field5621[var38 + var48], var47, (byte) 64, var33);
                        int var61 = ((var60 - var59) * var42 >> 12) + var59;
                        int var62 = class152.method994(var44, this.field5621[var28 + var49], var36, (byte) 64, var46);
                        int var63 = class152.method994(var44, this.field5621[var38 + var49], var47, (byte) 64, var46);
                        int var64 = ((var63 - var62) * var42 >> 12) + var62;
                        int var65 = ((var64 - var61) * var40 >> 12) + var61;
                        this.method919((byte) -104, var14, var58 + ((var65 - var58) * var45 >> 12));
                    }
                    this.method915((byte) 96);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    private final void method2368(boolean arg0) {
        this.field5616 = new short[this.field5619];
        field5615++;
        int var2 = 0;
        if (arg0) {
            this.method2366(91);
        }
        while (var2 < this.field5619) {
            this.field5616[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            var2++;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public abstract void method915(byte arg0);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
    public static final void method2369(byte arg0, String arg1, String arg2) {
        field5617++;
        class320.field4337 = -1;
        class40.field797 = 1;
        if (arg0 > -89) {
            field5620 = null;
        }
        class403.method2406(false, (byte) 83, arg1, arg2);
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static void method2370(int arg0) {
        int var1 = -104 / ((69 - arg0) / 35);
        field5620 = null;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIII)V")
    public class395(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5619 = arg1;
        this.field5614 = arg4;
        this.field5609 = arg0;
        this.field5618 = arg3;
        this.field5612 = arg2;
        this.method2368(false);
        this.method2366(122);
    }
}
