import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class129 {

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    private int field2113 = 4;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    private int field2118 = 0;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    private int field2111 = 4;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public int field2116 = 4;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[S")
    private short[] field2121 = new short[512];

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    private int field2124 = 4;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "S")
    public static short field2115 = 256;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lmh;")
    private static class62 field2109 = class201.method1405(true, "red:");

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lmh;")
    public static class62 field2114 = field2109;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lmh;")
    public static class62 field2117 = field2109;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lhh;")
    public static class294 field2119;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "[S")
    private short[] field2126;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "[[[B")
    public static byte[][][] field2120;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 16)
    private final void method955(byte arg0) {
        field2122++;
        this.field2126 = new short[this.field2116];
        if (arg0 != -45) {
            this.field2121 = (short[]) null;
        }
        for (int var2 = 0; var2 < this.field2116; var2++) {
            this.field2126[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIB)V", line = 40)
    public final void method956(int arg0, int arg1, int arg2, byte arg3) {
        field2112++;
        if (arg3 != -86) {
            this.method955((byte) -33);
        }
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg0];
        for (int var7 = 0; var7 < arg0; var7++) {
            var6[var7] = (var7 << 12) / arg0;
        }
        for (int var8 = 0; var8 < arg1; var8++) {
            var5[var8] = (var8 << 12) / arg1;
        }
        int[] var9 = new int[arg2];
        for (int var10 = 0; var10 < arg2; var10++) {
            var9[var10] = (var10 << 12) / arg2;
        }
        this.method600(false);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field2116; var14++) {
                        int var15 = this.field2126[var14] << 12;
                        int var16 = var9[var11] * var15 >> 12;
                        int var17 = this.field2111 * var16;
                        int var18 = this.field2113 * var15 >> 12;
                        int var19 = var5[var12] * var15 >> 12;
                        int var20 = this.field2124 * var15 >> 12;
                        int var21 = this.field2111 * var15 >> 12;
                        int var22 = this.field2113 * var19;
                        int var23 = var6[var13] * var15 >> 12;
                        int var24 = this.field2124 * var23;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27;
                        if (var18 <= var26) {
                            var27 = 0;
                        } else {
                            var27 = var26 & 0xFF;
                        }
                        int var28 = var17 >> 12;
                        int var29 = var24 >> 12;
                        int var30 = var24 & 0xFFF;
                        int var31 = var30 - 4096;
                        int var32 = var17 & 0xFFF;
                        int var33 = class306.field5246[var30];
                        int var34 = var32 - 4096;
                        int var35 = var28 + 1;
                        int var36;
                        if (var21 <= var35) {
                            var36 = 0;
                        } else {
                            var36 = var35 & 0xFF;
                        }
                        int var37 = var25 & 0xFF;
                        int var38 = var22 & 0xFFF;
                        short var39 = this.field2121[var36];
                        int var40 = class306.field5246[var32];
                        int var41 = class306.field5246[var38];
                        int var42 = var29 + 1;
                        int var43;
                        if (var42 < var20) {
                            var43 = var42 & 0xFF;
                        } else {
                            var43 = 0;
                        }
                        int var44 = var29 & 0xFF;
                        short var45 = this.field2121[var37 + var39];
                        int var46 = var38 - 4096;
                        short var47 = this.field2121[var27 + var39];
                        int var48 = var28 & 0xFF;
                        short var49 = this.field2121[var48];
                        short var50 = this.field2121[var27 + var49];
                        short var51 = this.field2121[var37 + var49];
                        int var52 = class191.method1334(var30, this.field2121[var44 + var51], arg3 - 1904, var32, var38);
                        int var53 = class191.method1334(var31, this.field2121[var43 + var51], -1990, var32, var38);
                        int var54 = ((var53 - var52) * var33 >> 12) + var52;
                        int var55 = class191.method1334(var30, this.field2121[var44 + var50], -1990, var32, var46);
                        int var56 = class191.method1334(var31, this.field2121[var43 + var50], -1990, var32, var46);
                        int var57 = ((var56 - var55) * var33 >> 12) + var55;
                        int var58 = ((var57 - var54) * var41 >> 12) + var54;
                        int var59 = class191.method1334(var30, this.field2121[var44 + var45], -1990, var34, var38);
                        int var60 = class191.method1334(var31, this.field2121[var43 + var45], arg3 ^ 0x790, var34, var38);
                        int var61 = var59 + ((var60 - var59) * var33 >> 12);
                        int var62 = class191.method1334(var30, this.field2121[var44 + var47], arg3 - 1904, var34, var46);
                        int var63 = class191.method1334(var31, this.field2121[var43 + var47], -1990, var34, var46);
                        int var64 = var62 + ((var63 - var62) * var33 >> 12);
                        int var65 = ((var64 - var61) * var41 >> 12) + var61;
                        this.method599(-1816054708, var14, ((var65 - var58) * var40 >> 12) + var58);
                    }
                    this.method603((byte) -87);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILu;IZ)V", line = 206)
    public static final void method957(int arg0, class204 arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return;
        }
        field2123++;
        if (arg1.field3836 == arg0 && arg0 != -1) {
            class96 var4 = class151.method1085(arg0, (byte) 122);
            int var5 = var4.field1571;
            if (var5 == 1) {
                arg1.field3843 = arg2;
                arg1.field3872 = 0;
                arg1.field3826 = 0;
                arg1.field3849 = 0;
                class113.method881(var4, arg1.field3821, arg1.field3814, false, (byte) -80, arg1.field3872);
            }
            if (var5 == 2) {
                arg1.field3826 = 0;
            }
        } else if (arg0 == -1 || arg1.field3836 == -1 || class151.method1085(arg0, (byte) 115).field1562 >= class151.method1085(arg1.field3836, (byte) 114).field1562) {
            arg1.field3824 = arg1.field3808;
            arg1.field3826 = 0;
            arg1.field3836 = arg0;
            arg1.field3843 = arg2;
            arg1.field3872 = 0;
            arg1.field3849 = 0;
            if (arg1.field3836 != -1) {
                class113.method881(class151.method1085(arg1.field3836, (byte) 120), arg1.field3821, arg1.field3814, false, (byte) -82, arg1.field3872);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(IIIII)V", line = 366)
    public class129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2124 = arg2;
        this.field2118 = arg0;
        this.field2111 = arg4;
        this.field2113 = arg3;
        this.field2116 = arg1;
        this.method955((byte) -45);
        this.method959(256);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V", line = 297)
    public static void method958(byte arg0) {
        field2120 = (byte[][][]) null;
        if (arg0 > 100) {
            field2117 = null;
            field2109 = null;
            field2119 = null;
            field2114 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 314)
    private final void method959(int arg0) {
        if (arg0 != 256) {
            this.field2111 = -126;
        }
        Random var2 = new Random((long) this.field2118);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field2121[var3] = (short) var3;
        }
        field2125++;
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class73.method525(var5, var2, true);
            short var7 = this.field2121[var6];
            this.field2121[var6] = this.field2121[var5];
            this.field2121[var5] = this.field2121[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public abstract void method600(boolean arg0);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
    public abstract void method599(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
    public abstract void method603(byte arg0);
}
