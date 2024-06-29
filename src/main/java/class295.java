import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public abstract class class295 {

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    private int field4815 = 4;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public int field4825 = 4;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    private int field4820 = 0;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    private int field4830 = 4;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    private int field4827 = 4;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "[S")
    private short[] field4831 = new short[512];

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "Z")
    public static boolean field4813 = true;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "Z")
    public static boolean field4812 = false;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4821 = new String[100];

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "Z")
    public static boolean field4818 = false;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "[S")
    private short[] field4826;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)I", line = 10)
    public static final int method2115(int arg0, boolean arg1) {
        field4828++;
        if (!arg1) {
            method2121(20, (class146) null, 25);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V", line = 28)
    private final void method2116(int arg0) {
        this.field4826 = new short[this.field4825];
        for (int var2 = 0; var2 < this.field4825; var2++) {
            this.field4826[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 255) {
            this.method2123(19, -98, -33, 17);
        }
        field4823++;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V", line = 52)
    public static final void method2117(boolean arg0) {
        if (!arg0) {
            field4821 = (String[]) null;
        }
        class18.field495 = 0;
        field4829++;
        int var1 = (class96.field1750.field213 >> 7) + class21.field543;
        int var2 = (class96.field1750.field199 >> 7) + class272.field4426;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class18.field495 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class18.field495 = 1;
        }
        if (class18.field495 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class18.field495 = 0;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIBI)V", line = 78)
    public static final void method2118(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        class28.field686[0].method34(arg1, arg0);
        class28.field686[1].method34(arg1, arg0 + arg3 - 16);
        if (arg4 > -126) {
            method2117(true);
        }
        int var6 = (arg3 - 32) * arg3 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg3 - var6 - 32) * arg5 / (arg2 - arg3);
        if (class241.field4016) {
            class337.method2378(arg1, arg0 + 16, 16, arg3 - 32, class22.field558);
            class337.method2378(arg1, arg0 + var7 + 16, 16, var6, class342.field5411);
            class337.method2384(arg1, arg0 - (-var7 - 16), var6, class77.field1377);
            class337.method2384(arg1 + 1, arg0 + 16 + var7, var6, class77.field1377);
            class337.method2371(arg1, arg0 + var7 + 16, 16, class77.field1377);
            class337.method2371(arg1, arg0 + var7 + 17, 16, class77.field1377);
            class337.method2384(arg1 + 15, arg0 - -var7 + 16, var6, class122.field2156);
            class337.method2384(arg1 + 14, arg0 + 17 + var7, var6 - 1, class122.field2156);
            class337.method2371(arg1, arg0 + var6 + var7 + 15, 16, class122.field2156);
            class337.method2371(arg1 + 1, arg0 + 14 + var6 + var7, 15, class122.field2156);
        } else {
            class270.method1894(arg1, arg0 + 16, 16, arg3 - 32, class22.field558);
            class270.method1894(arg1, arg0 + var7 + 16, 16, var6, class342.field5411);
            class270.method1885(arg1, arg0 + var7 + 16, var6, class77.field1377);
            class270.method1885(arg1 + 1, arg0 + var7 + 16, var6, class77.field1377);
            class270.method1897(arg1, arg0 + var7 + 16, 16, class77.field1377);
            class270.method1897(arg1, arg0 + var7 + 17, 16, class77.field1377);
            class270.method1885(arg1 + 15, arg0 + 16 + var7, var6, class122.field2156);
            class270.method1885(arg1 + 14, arg0 + var7 + 17, var6 - 1, class122.field2156);
            class270.method1897(arg1, var7 + arg0 + var6 + 15, 16, class122.field2156);
            class270.method1897(arg1 + 1, arg0 + 14 + var6 + var7, 15, class122.field2156);
        }
        field4816++;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIBI)V", line = 124)
    public static final void method2119(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field4824++;
        if (arg5 <= 52) {
            return;
        }
        class68[] var7 = class120.field2140;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class68 var9 = var7[var8];
            if (var9 != null && var9.field1253 == 2) {
                class299.method2142(arg4 >> 1, var9.field1265 * 2, arg0, arg6 >> 1, arg3, (var9.field1257 - class21.field543 << 7) + var9.field1273, 0, (var9.field1275 - class272.field4426 << 7) + var9.field1271);
                if (class104.field1907 > -1 && (class267.field4371 % 20) < 10) {
                    class138.field2351[var9.field1274].method568(class104.field1907 + arg2 - 12, class266.field4355 + arg1 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(IIIII)V", line = 429)
    public class295(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4827 = arg4;
        this.field4815 = arg2;
        this.field4830 = arg3;
        this.field4825 = arg1;
        this.field4820 = arg0;
        this.method2116(255);
        this.method2120(0);
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V", line = 164)
    private final void method2120(int arg0) {
        Random var2 = new Random((long) this.field4820);
        for (int var3 = arg0; var3 < 255; var3++) {
            this.field4831[var3] = (short) var3;
        }
        field4817++;
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class91.method696(var2, var5, 80);
            short var7 = this.field4831[var6];
            this.field4831[var6] = this.field4831[var5];
            this.field4831[var5] = this.field4831[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILoe;I)V", line = 198)
    public static final void method2121(int arg0, class146 arg1, int arg2) {
        if (class207.field3465 != null) {
            try {
                class207.field3465.method1802(0L, 26);
                class207.field3465.method1808(24, arg1.field2496, arg0, -74);
            } catch (Exception var4) {
            }
        }
        if (arg2 != 1008605068) {
            method2115(5, false);
        }
        field4814++;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V", line = 224)
    public static void method2122(byte arg0) {
        if (arg0 == -101) {
            field4821 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIII)V", line = 246)
    public final void method2123(int arg0, int arg1, int arg2, int arg3) {
        field4822++;
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg0];
        if (arg1 != -28) {
            this.method2120(34);
        }
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg0; var8++) {
            var6[var8] = (var8 << 12) / arg0;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var7[var10] = (var10 << 12) / arg3;
        }
        this.method134(0);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field4825; var14++) {
                        int var15 = this.field4826[var14] << 12;
                        int var16 = var5[var12] * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = this.field4830 * var16;
                        int var19 = var6[var13] * var15 >> 12;
                        int var20 = this.field4827 * var17;
                        int var21 = var18 >> 12;
                        int var22 = this.field4815 * var15 >> 12;
                        int var23 = this.field4815 * var19;
                        int var24 = var18 & 0xFFF;
                        int var25 = var20 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 - 4096;
                        int var28 = var23 >> 12;
                        int var29 = class105.field1922[var24];
                        int var30 = var28 + 1;
                        int var31 = var28 & 0xFF;
                        int var32 = this.field4827 * var15 >> 12;
                        int var33 = var20 & 0xFFF;
                        int var34 = var21 + 1;
                        int var35 = class105.field1922[var33];
                        int var36;
                        if (var30 >= var22) {
                            var36 = 0;
                        } else {
                            var36 = var30 & 0xFF;
                        }
                        int var37 = var33 - 4096;
                        int var38 = var23 & 0xFFF;
                        int var39 = var21 & 0xFF;
                        int var40 = var25 & 0xFF;
                        int var41 = class105.field1922[var38];
                        short var42 = this.field4831[var40];
                        int var43 = var38 - 4096;
                        int var44;
                        if (var32 <= var26) {
                            var44 = 0;
                        } else {
                            var44 = var26 & 0xFF;
                        }
                        int var45 = this.field4830 * var15 >> 12;
                        short var46 = this.field4831[var39 + var42];
                        short var47 = this.field4831[var44];
                        int var48;
                        if (var34 >= var45) {
                            var48 = 0;
                        } else {
                            var48 = var34 & 0xFF;
                        }
                        short var49 = this.field4831[var47 + var48];
                        short var50 = this.field4831[var42 + var48];
                        short var51 = this.field4831[var39 + var47];
                        int var52 = class346.method2465(var38, var33, this.field4831[var31 + var46], var24, arg1 + 25032);
                        int var53 = class346.method2465(var43, var33, this.field4831[var36 + var46], var24, 25004);
                        int var54 = var52 + ((var53 - var52) * var41 >> 12);
                        int var55 = class346.method2465(var38, var33, this.field4831[var31 + var50], var27, 25004);
                        int var56 = class346.method2465(var43, var33, this.field4831[var36 + var50], var27, 25004);
                        int var57 = var55 + ((var56 - var55) * var41 >> 12);
                        int var58 = ((var57 - var54) * var29 >> 12) + var54;
                        int var59 = class346.method2465(var38, var37, this.field4831[var31 + var51], var24, 25004);
                        int var60 = class346.method2465(var43, var37, this.field4831[var36 + var51], var24, 25004);
                        int var61 = ((var60 - var59) * var41 >> 12) + var59;
                        int var62 = class346.method2465(var38, var37, this.field4831[var31 + var49], var27, 25004);
                        int var63 = class346.method2465(var43, var37, this.field4831[var36 + var49], var27, 25004);
                        int var64 = ((var63 - var62) * var41 >> 12) + var62;
                        int var65 = ((var64 - var61) * var29 >> 12) + var61;
                        this.method129(((var65 - var58) * var35 >> 12) + var58, var14, arg1 + 154);
                    }
                    this.method128(49);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
    public abstract void method129(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public abstract void method128(int arg0);

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
    public abstract void method134(int arg0);
}
