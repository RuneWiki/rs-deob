import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class class292 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    private int field3898 = 4;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    private int field3904 = 4;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "[S")
    private short[] field3905 = new short[512];

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    private int field3909 = 4;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public int field3911 = 4;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    private int field3913 = 0;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "[I")
    public static int[] field3910 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "[I")
    public static int[] field3912 = new int[32];

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Lss;")
    public static class295 field3914 = null;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Lbj;")
    public static class159 field3907 = new class159(8);

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field3915 = 0;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "[I")
    public static int[] field3916;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "[S")
    private short[] field3906;

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIII)V", line = 396)
    public class292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3909 = arg4;
        this.field3911 = arg1;
        this.field3898 = arg2;
        this.field3904 = arg3;
        this.field3913 = arg0;
        this.method1675(2);
        this.method1677(-1553682580);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 13)
    public static void method1668(int arg0) {
        field3910 = null;
        field3907 = null;
        field3914 = null;
        field3916 = null;
        field3912 = null;
        if (arg0 > -72) {
            field3910 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)B", line = 35)
    public static final byte method1672(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field3914 = null;
        }
        field3901++;
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 61)
    public static final void method1673(boolean arg0) {
        class504.field7413.method67(-128);
        field3899++;
        if (arg0) {
            field3907 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBII)V", line = 72)
    public final void method1674(int arg0, byte arg1, int arg2, int arg3) {
        field3908++;
        if (arg1 < 14) {
            this.method1675(52);
        }
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg0; var8++) {
            var5[var8] = (var8 << 12) / arg0;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var7[var10] = (var10 << 12) / arg3;
        }
        this.method1671(-118);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field3911; var14++) {
                        int var15 = this.field3906[var14] << 12;
                        int var16 = var7[var11] * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = this.field3898 * var15 >> 12;
                        int var19 = this.field3904 * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = this.field3909 * var15 >> 12;
                        int var22 = this.field3909 * var16;
                        int var23 = this.field3898 * var17;
                        int var24 = this.field3904 * var20;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var24 & 0xFFF;
                        int var34 = var23 & 0xFFF;
                        int var35;
                        if (var26 >= var18) {
                            var35 = 0;
                        } else {
                            var35 = var26 & 0xFF;
                        }
                        int var36 = var30 & 0xFF;
                        int var37;
                        if (var32 >= var21) {
                            var37 = 0;
                        } else {
                            var37 = var32 & 0xFF;
                        }
                        int var38;
                        if (var19 > var29) {
                            var38 = var29 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var22 & 0xFFF;
                        int var40 = class176.field2504[var33];
                        int var41 = var33 - 4096;
                        short var42 = this.field3905[var37];
                        int var43 = var34 - 4096;
                        short var44 = this.field3905[var36];
                        int var45 = class176.field2504[var39];
                        int var46 = class176.field2504[var34];
                        int var47 = var39 - 4096;
                        short var48 = this.field3905[var38 + var42];
                        short var49 = this.field3905[var38 + var44];
                        short var50 = this.field3905[var31 + var42];
                        short var51 = this.field3905[var31 + var44];
                        int var52 = class254.method1495(var34, var39, this.field3905[var28 + var51], -13, var33);
                        int var53 = class254.method1495(var43, var39, this.field3905[var35 + var51], -13, var33);
                        int var54 = var52 + ((var53 - var52) * var46 >> 12);
                        int var55 = class254.method1495(var34, var39, this.field3905[var28 + var49], -13, var41);
                        int var56 = class254.method1495(var43, var39, this.field3905[var35 + var49], -13, var41);
                        int var57 = ((var56 - var55) * var46 >> 12) + var55;
                        int var58 = ((var57 - var54) * var40 >> 12) + var54;
                        int var59 = class254.method1495(var34, var47, this.field3905[var28 + var50], -13, var33);
                        int var60 = class254.method1495(var43, var47, this.field3905[var35 + var50], -13, var33);
                        int var61 = ((var60 - var59) * var46 >> 12) + var59;
                        int var62 = class254.method1495(var34, var47, this.field3905[var28 + var48], -13, var41);
                        int var63 = class254.method1495(var43, var47, this.field3905[var35 + var48], -13, var41);
                        int var64 = ((var63 - var62) * var46 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var40 >> 12);
                        this.method1670((byte) 114, var14, ((var65 - var58) * var45 >> 12) + var58);
                    }
                    this.method1669(-28971);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V", line = 251)
    private final void method1675(int arg0) {
        this.field3906 = new short[this.field3911];
        field3900++;
        if (arg0 == 2) {
            for (int var2 = 0; var2 < this.field3911; var2++) {
                this.field3906[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V", line = 272)
    public static final void method1676(int arg0) {
        field3903++;
        class65.field897 = 0;
        int var1 = class387.field5435.method2064(121);
        int var2 = class387.field5435.method2087(-123);
        int var3 = class387.field5435.method2064(116);
        boolean var4 = class387.field5435.method2087(-128) == 1;
        class506.method2978(var2, (byte) 54);
        int var5 = (class438.field6394 - class387.field5435.field5069) / 16;
        class514.field7546 = new int[var5][4];
        int var6 = 0;
        if (arg0 != 22362) {
            field3914 = null;
        }
        while (var6 < var5) {
            for (int var10 = 0; var10 < 4; var10++) {
                class514.field7546[var6][var10] = class387.field5435.method2056((byte) -55);
            }
            var6++;
        }
        class477.field6982 = new int[var5];
        class414.field6080 = new int[var5];
        class234.field3249 = new int[var5];
        class245.field3417 = null;
        class499.field7346 = new byte[var5][];
        field3916 = new int[var5];
        class274.field3721 = new byte[var5][];
        class13.field159 = null;
        class101.field1378 = new int[var5];
        class207.field2938 = new byte[var5][];
        class20.field215 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var3 - (class442.field6435 >> 4)) / 8; var8 <= (var3 + (class442.field6435 >> 4)) / 8; var8++) {
            for (int var9 = (var1 - (class232.field3217 >> 4)) / 8; var9 <= (((class232.field3217 >> 4) + var1) / 8); var9++) {
                class101.field1378[var7] = (var8 << 8) + var9;
                class477.field6982[var7] = class241.field3334.method1396("m" + var8 + "_" + var9, (byte) 71);
                class234.field3249[var7] = class241.field3334.method1396("l" + var8 + "_" + var9, (byte) 71);
                class414.field6080[var7] = class241.field3334.method1396("um" + var8 + "_" + var9, (byte) 71);
                field3916[var7] = class241.field3334.method1396("ul" + var8 + "_" + var9, (byte) 71);
                var7++;
            }
        }
        class487.method2866(false, var4, 28, var3, var1);
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V", line = 347)
    private final void method1677(int arg0) {
        field3902++;
        Random var2 = new Random((long) this.field3913);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3905[var3] = (short) var3;
        }
        if (arg0 != -1553682580) {
            this.method1671(82);
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class432.method2579((byte) -123, var5, var2);
            short var7 = this.field3905[var6];
            this.field3905[var6] = this.field3905[var5];
            this.field3905[var5] = this.field3905[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public abstract void method1669(int arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BII)V")
    public abstract void method1670(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    public abstract void method1671(int arg0);
}
