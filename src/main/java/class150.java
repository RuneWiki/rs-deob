import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class150 {

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[S")
    private short[] field2070 = new short[512];

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public int field2069 = 4;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    private int field2072 = 4;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    private int field2077 = 0;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    private int field2073 = 4;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    private int field2076 = 4;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "[I")
    public static int[] field2079 = new int[64];

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "[S")
    private short[] field2071;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    private final void method1054(int arg0) {
        field2078++;
        Random var2 = new Random((long) this.field2077);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field2070[var3] = (short) var3;
        }
        for (int var4 = arg0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class596.method3377(var5, var2, -108);
            short var7 = this.field2070[var6];
            this.field2070[var6] = this.field2070[var5];
            this.field2070[var5] = this.field2070[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
    public abstract void method1055(int arg0);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method1056(byte arg0) {
        int var1 = -108 % ((27 - arg0) / 40);
        field2079 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILwg;BII)Z")
    public static final boolean method1057(int arg0, int arg1, int arg2, class428 arg3, byte arg4, int arg5, int arg6) {
        field2075++;
        if (!client.field3984 || !class15.field304) {
            return false;
        } else if (class700.field9738 < 100) {
            return false;
        } else {
            if (arg4 != 82) {
                method1057(22, 39, -76, null, (byte) 101, -100, -112);
            }
            if (arg1 != arg5 || arg2 != arg6) {
                for (int var7 = arg1; var7 <= arg5; var7++) {
                    for (int var8 = arg6; var8 <= arg2; var8++) {
                        if (class141.field2008[arg0][var7][var8] == (-class700.field9734)) {
                            return false;
                        }
                    }
                }
                if (class523.method3036(127, arg3)) {
                    class61.field861++;
                    return true;
                } else {
                    return false;
                }
            } else if (!class571.method3277(arg0, arg1, arg4 ^ 0x53, arg6)) {
                return false;
            } else if (class523.method3036(118, arg3)) {
                class61.field861++;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIB)V")
    public final void method1058(int arg0, int arg1, int arg2, byte arg3) {
        field2080++;
        if (arg3 >= -115) {
            this.method1060(100, -39, 94);
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg0];
        for (int var8 = 0; var8 < arg2; var8++) {
            var5[var8] = (var8 << 12) / arg2;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var7[var10] = (var10 << 12) / arg0;
        }
        this.method1062(255);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field2069; var14++) {
                        int var15 = this.field2071[var14] << 12;
                        int var16 = var7[var11] * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = this.field2076 * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field2073 * var15 >> 12;
                        int var21 = this.field2072 * var15 >> 12;
                        int var22 = this.field2073 * var16;
                        int var23 = this.field2076 * var19;
                        int var24 = this.field2072 * var17;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var24 & 0xFFF;
                        int var34;
                        if (var20 <= var32) {
                            var34 = 0;
                        } else {
                            var34 = var32 & 0xFF;
                        }
                        int var35 = var22 & 0xFFF;
                        int var36;
                        if (var26 >= var21) {
                            var36 = 0;
                        } else {
                            var36 = var26 & 0xFF;
                        }
                        int var37;
                        if (var29 < var18) {
                            var37 = var29 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var23 & 0xFFF;
                        int var39 = var30 & 0xFF;
                        int var40 = class562.field7914[var35];
                        int var41 = var38 - 4096;
                        int var42 = var35 - 4096;
                        short var43 = this.field2070[var39];
                        short var44 = this.field2070[var34];
                        int var45 = class562.field7914[var38];
                        int var46 = var33 - 4096;
                        int var47 = class562.field7914[var33];
                        short var48 = this.field2070[var31 + var43];
                        short var49 = this.field2070[var37 + var43];
                        short var50 = this.field2070[var31 + var44];
                        short var51 = this.field2070[var37 + var44];
                        int var52 = class139.method1017(var33, var38, this.field2070[var27 + var48], var35, 2);
                        int var53 = class139.method1017(var46, var38, this.field2070[var36 + var48], var35, 2);
                        int var54 = var52 + ((var53 - var52) * var47 >> 12);
                        int var55 = class139.method1017(var33, var41, this.field2070[var27 + var49], var35, 2);
                        int var56 = class139.method1017(var46, var41, this.field2070[var36 + var49], var35, 2);
                        int var57 = ((var56 - var55) * var47 >> 12) + var55;
                        int var58 = class139.method1017(var33, var38, this.field2070[var27 + var50], var42, 2);
                        int var59 = ((var57 - var54) * var45 >> 12) + var54;
                        int var60 = class139.method1017(var46, var38, this.field2070[var36 + var50], var42, 2);
                        int var61 = ((var60 - var58) * var47 >> 12) + var58;
                        int var62 = class139.method1017(var33, var41, this.field2070[var27 + var51], var42, 2);
                        int var63 = class139.method1017(var46, var41, this.field2070[var36 + var51], var42, 2);
                        int var64 = ((var63 - var62) * var47 >> 12) + var62;
                        int var65 = ((var64 - var61) * var45 >> 12) + var61;
                        this.method1060(-805372180, var14, ((var65 - var59) * var40 >> 12) + var59);
                    }
                    this.method1055(-25494);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    private final void method1059(byte arg0) {
        field2074++;
        this.field2071 = new short[this.field2069];
        for (int var2 = 0; var2 < this.field2069; var2++) {
            this.field2071[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != -44) {
            this.field2070 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
    public abstract void method1060(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
    public static final void method1061(int arg0) {
        field2068++;
        if (arg0 != 1) {
            field2079 = null;
        }
        class614 var1 = (class614) class235.field3065.method3672(-1);
        boolean var2 = class617.field8508 != null || class721.field10038 > 0;
        int var3 = var1.method1428(1212);
        int var4 = var1.method1425((byte) 124);
        if (var2) {
            class15.field299 = 1;
        }
        if (var2) {
            class547.field7656 = class438.field5836;
        } else {
            class86.method715(class438.field5836, false, var4, var3);
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
    public abstract void method1062(int arg0);

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIII)V")
    public class150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2072 = arg2;
        this.field2076 = arg3;
        this.field2073 = arg4;
        this.field2069 = arg1;
        this.field2077 = arg0;
        this.method1059((byte) -44);
        this.method1054(0);
    }
}
