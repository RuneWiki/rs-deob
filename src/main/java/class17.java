import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public abstract class class17 {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public int field308 = 4;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    private int field307 = 0;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    private int field313 = 4;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    private int field306 = 4;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    private int field315 = 4;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[S")
    private short[] field310 = new short[512];

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lfba;")
    public static class27 field311 = new class27(85, 12);

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field314 = 0;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "Lch;")
    public static class487 field319;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "[S")
    private short[] field318;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public abstract void method157(byte arg0);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)V")
    public final void method158(int arg0, int arg1, int arg2, int arg3) {
        field317++;
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg3];
        for (int var7 = 0; var7 < arg2; var7++) {
            var5[var7] = (var7 << 12) / arg2;
        }
        int[] var8 = new int[arg0];
        if (arg1 <= 84) {
            this.method164(true);
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var8[var10] = (var10 << 12) / arg0;
        }
        this.method157((byte) -100);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field308; var14++) {
                        int var15 = this.field318[var14] << 12;
                        int var16 = this.field315 * var15 >> 12;
                        int var17 = this.field306 * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field313 * var15 >> 12;
                        int var20 = var8[var11] * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field306 * var21;
                        int var23 = this.field313 * var18;
                        int var24 = this.field315 * var20;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var24 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var16 <= var32) {
                            var33 = 0;
                        } else {
                            var33 = var32 & 0xFF;
                        }
                        int var34 = var22 & 0xFFF;
                        int var35 = var24 & 0xFFF;
                        int var36;
                        if (var19 <= var26) {
                            var36 = 0;
                        } else {
                            var36 = var26 & 0xFF;
                        }
                        int var37 = var30 & 0xFF;
                        int var38 = var23 & 0xFFF;
                        int var39;
                        if (var29 < var17) {
                            var39 = var29 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        short var40 = this.field310[var33];
                        int var41 = var38 - 4096;
                        int var42 = var35 - 4096;
                        int var43 = class202.field3143[var35];
                        int var44 = class202.field3143[var34];
                        int var45 = var34 - 4096;
                        int var46 = class202.field3143[var38];
                        short var47 = this.field310[var37];
                        short var48 = this.field310[var39 + var47];
                        short var49 = this.field310[var39 + var40];
                        short var50 = this.field310[var31 + var40];
                        short var51 = this.field310[var31 + var47];
                        int var52 = class128.method959(var35, var38, this.field310[var27 + var51], -100, var34);
                        int var53 = class128.method959(var35, var41, this.field310[var36 + var51], -126, var34);
                        int var54 = var52 + ((var53 - var52) * var46 >> 12);
                        int var55 = class128.method959(var35, var38, this.field310[var27 + var48], -111, var45);
                        int var56 = class128.method959(var35, var41, this.field310[var36 + var48], -125, var45);
                        int var57 = ((var56 - var55) * var46 >> 12) + var55;
                        int var58 = ((var57 - var54) * var44 >> 12) + var54;
                        int var59 = class128.method959(var42, var38, this.field310[var27 + var50], -68, var34);
                        int var60 = class128.method959(var42, var41, this.field310[var36 + var50], -83, var34);
                        int var61 = ((var60 - var59) * var46 >> 12) + var59;
                        int var62 = class128.method959(var42, var38, this.field310[var27 + var49], -105, var45);
                        int var63 = class128.method959(var42, var41, this.field310[var36 + var49], -93, var45);
                        int var64 = ((var63 - var62) * var46 >> 12) + var62;
                        int var65 = ((var64 - var61) * var44 >> 12) + var61;
                        this.method159(var14, false, ((var65 - var58) * var43 >> 12) + var58);
                    }
                    this.method162(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZI)V")
    public abstract void method159(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Leo;B)[I")
    public static final int[] method160(class312 arg0, byte arg1) {
        field312++;
        class494 var2 = new class494(518);
        int[] var3 = new int[4];
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method2952(0, 10);
        var2.method2959(var3[0], (byte) 85);
        var2.method2959(var3[1], (byte) 111);
        var2.method2959(var3[2], (byte) -82);
        var2.method2959(var3[3], (byte) -77);
        for (int var5 = 0; var5 < 10; var5++) {
            var2.method2959((int) (Math.random() * 9.9999999E7D), (byte) -128);
        }
        var2.method2957((int) (Math.random() * 9.9999999E7D), 1267307848);
        if (arg1 != 89) {
            field319 = null;
        }
        var2.method2949(class255.field3750, class167.field2638, 1866000624);
        arg0.field4445.method2936(arg1 ^ 0x2467, 0, var2.field7050, var2.field7042);
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public static void method161(byte arg0) {
        field319 = null;
        if (arg0 >= -38) {
            method161((byte) 18);
        }
        field311 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public abstract void method162(int arg0);

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
    private final void method163(byte arg0) {
        field309++;
        int var2 = -39 % ((-arg0 - 81) / 32);
        this.field318 = new short[this.field308];
        for (int var3 = 0; var3 < this.field308; var3++) {
            this.field318[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    private final void method164(boolean arg0) {
        field316++;
        Random var2 = new Random((long) this.field307);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field310[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class7.method51(10, var2, var5);
            short var7 = this.field310[var6];
            this.field310[var6] = this.field310[var5];
            this.field310[var5] = this.field310[var5 + 256] = var7;
        }
        if (arg0) {
            this.field313 = 91;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIII)V")
    public class17(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field306 = arg3;
        this.field307 = arg0;
        this.field308 = arg1;
        this.field315 = arg4;
        this.field313 = arg2;
        this.method163((byte) -43);
        this.method164(false);
    }
}
