import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class284 {

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    private int field4917 = 0;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    private int field4912 = 4;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "[S")
    private short[] field4920 = new short[512];

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public int field4926 = 4;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    private int field4927 = 4;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    private int field4933 = 4;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field4924 = -1;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "Lke;")
    public static class256 field4930 = class316.method2202("::rect_debug", 27626);

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field4925 = 0;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Lng;")
    public static class138 field4928;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "[Lvj;")
    public static class183[] field4914;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "[S")
    private short[] field4919;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "[[S")
    public static short[][] field4915;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 13)
    public static final void method1983(int arg0) {
        field4922++;
        if (!class119.field2121) {
            return;
        }
        class172.field3058 = null;
        if (arg0 == -15559) {
            class10.field157 = null;
            class119.field2121 = false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 30)
    private final void method1984(int arg0) {
        field4923++;
        this.field4919 = new short[this.field4926];
        if (arg0 <= 15) {
            this.field4920 = (short[]) null;
        }
        for (int var2 = 0; var2 < this.field4926; var2++) {
            this.field4919[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 64)
    public static final void method1985(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class129.field2264 * 128) {
            arg0 = class129.field2264 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class57.field1051 * 128) {
            arg2 = class57.field1051 * 128 - 1;
        }
        class93.field1680 = class136.field2366[arg3];
        class255.field4374 = class136.field2372[arg3];
        class119.field2113 = class136.field2366[arg4];
        class135.field2355 = class136.field2372[arg4];
        class310.field5346 = arg0;
        class59.field1079 = arg1;
        class271.field4623 = arg2;
        class91.field1661 = arg0 / 128;
        class93.field1683 = arg2 / 128;
        field4935 = class91.field1661 - class195.field3553;
        if (field4935 < 0) {
            field4935 = 0;
        }
        class36.field599 = class93.field1683 - class195.field3553;
        if (class36.field599 < 0) {
            class36.field599 = 0;
        }
        class173.field3069 = class91.field1661 + class195.field3553;
        if (class173.field3069 > class129.field2264) {
            class173.field3069 = class129.field2264;
        }
        class186.field3273 = class93.field1683 + class195.field3553;
        if (class186.field3273 > class57.field1051) {
            class186.field3273 = class57.field1051;
        }
        short var15;
        if (class253.field4323) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class195.field3553 + class195.field3553 + 2; var16++) {
            for (int var17 = 0; var17 < class195.field3553 + class195.field3553 + 2; var17++) {
                int var18 = (var16 - class195.field3553 << 7) - (class310.field5346 & 0x7F);
                int var19 = (var17 - class195.field3553 << 7) - (class271.field4623 & 0x7F);
                int var20 = class91.field1661 + var16 - class195.field3553;
                int var21 = class93.field1683 + var17 - class195.field3553;
                if (var20 >= 0 && var21 >= 0 && var20 < class129.field2264 && var21 < class57.field1051) {
                    int var22;
                    if (class222.field3884 == null) {
                        var22 = class72.field1329[0][var20][var21] + 128 - class59.field1079;
                    } else {
                        var22 = class222.field3884[0][var20][var21] + 128 - class59.field1079;
                    }
                    int var23 = class72.field1329[3][var20][var21] - class59.field1079 - 1000;
                    class25.field326[var16][var17] = class130.method889(var18, var23, var22, var19, var15);
                } else {
                    class25.field326[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class195.field3553 + class195.field3553 + 1; var24++) {
            for (int var25 = 0; var25 < class195.field3553 + class195.field3553 + 1; var25++) {
                class53.field978[var24][var25] = class25.field326[var24][var25] || class25.field326[var24 + 1][var25] || class25.field326[var24][var25 + 1] || class25.field326[var24 + 1][var25 + 1];
            }
        }
        class300.field5169 = arg6;
        class200.field3645 = arg7;
        class189.field3485 = arg8;
        class182.field3227 = arg9;
        class225.field3917 = arg10;
        class317.method2205();
        if (class1.field4 != null) {
            class49.method394(true);
            class254.method1750(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class253.field4323) {
                class77.field1451 = false;
                class277.method1910(0, 0, -19856);
                class169.method1236((float[]) null);
                class245.method1656();
            }
            class49.method394(false);
        }
        class254.method1750(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)V", line = 199)
    public final void method1986(int arg0, int arg1, int arg2, int arg3) {
        field4931++;
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg0];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg2; var8++) {
            var5[var8] = (var8 << 12) / arg2;
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var7[var10] = (var10 << 12) / arg3;
        }
        this.method244(true);
        for (int var11 = arg1; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field4926; var14++) {
                        int var15 = this.field4919[var14] << 12;
                        int var16 = var7[var11] * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = this.field4927 * var15 >> 12;
                        int var20 = this.field4912 * var18;
                        int var21 = this.field4912 * var15 >> 12;
                        int var22 = var20 >> 12;
                        int var23 = this.field4933 * var16;
                        int var24 = this.field4933 * var15 >> 12;
                        int var25 = this.field4927 * var17;
                        int var26 = var20 & 0xFFF;
                        int var27 = class49.field876[var26];
                        int var28 = var25 >> 12;
                        int var29 = var22 + 1;
                        int var30 = var23 >> 12;
                        int var31 = var23 & 0xFFF;
                        int var32 = var28 + 1;
                        int var33 = var25 & 0xFFF;
                        int var34 = var28 & 0xFF;
                        int var35 = class49.field876[var31];
                        int var36;
                        if (var29 < var21) {
                            var36 = var29 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var26 - 4096;
                        int var38 = var30 + 1;
                        int var39;
                        if (var38 >= var24) {
                            var39 = 0;
                        } else {
                            var39 = var38 & 0xFF;
                        }
                        int var40 = var31 - 4096;
                        int var41 = var30 & 0xFF;
                        int var42 = class49.field876[var33];
                        int var43 = var33 - 4096;
                        short var44 = this.field4920[var41];
                        int var45 = var22 & 0xFF;
                        short var46 = this.field4920[var36 + var44];
                        short var47 = this.field4920[var39];
                        short var48 = this.field4920[var45 + var44];
                        short var49 = this.field4920[var45 + var47];
                        short var50 = this.field4920[var36 + var47];
                        int var51 = class74.method552(var33, -29, this.field4920[var34 + var48], var26, var31);
                        int var52;
                        if (var32 < var19) {
                            var52 = var32 & 0xFF;
                        } else {
                            var52 = 0;
                        }
                        int var53 = class74.method552(var43, -39, this.field4920[var48 + var52], var26, var31);
                        int var54 = var51 + ((var53 - var51) * var42 >> 12);
                        int var55 = class74.method552(var33, -55, this.field4920[var34 + var46], var37, var31);
                        int var56 = class74.method552(var43, -48, this.field4920[var46 + var52], var37, var31);
                        int var57 = ((var56 - var55) * var42 >> 12) + var55;
                        int var58 = ((var57 - var54) * var27 >> 12) + var54;
                        int var59 = class74.method552(var33, -85, this.field4920[var34 + var49], var26, var40);
                        int var60 = class74.method552(var43, arg1 - 116, this.field4920[var49 + var52], var26, var40);
                        int var61 = ((var60 - var59) * var42 >> 12) + var59;
                        int var62 = class74.method552(var33, -10, this.field4920[var34 + var50], var37, var40);
                        int var63 = class74.method552(var43, arg1 ^ 0xFFFFFFEA, this.field4920[var50 + var52], var37, var40);
                        int var64 = ((var63 - var62) * var42 >> 12) + var62;
                        int var65 = ((var64 - var61) * var27 >> 12) + var61;
                        this.method246(var14, ((var65 - var58) * var35 >> 12) + var58, arg1 + 123);
                    }
                    this.method245(-1994931796);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIII)V", line = 617)
    public class284(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4927 = arg2;
        this.field4917 = arg0;
        this.field4926 = arg1;
        this.field4912 = arg3;
        this.field4933 = arg4;
        this.method1984(73);
        this.method1988(true);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(FI[[III[[F[[FB[[FIZ[[IILgf;IIII)I", line = 381)
    public static final int method1987(float arg0, int arg1, int[][] arg2, int arg3, int arg4, float[][] arg5, float[][] arg6, byte arg7, float[][] arg8, int arg9, boolean arg10, int[][] arg11, int arg12, class113 arg13, int arg14, int arg15, int arg16, int arg17) {
        if (arg4 == 1) {
            int var18 = arg16;
            arg16 = arg15;
            arg15 = 128 - var18;
        } else if (arg4 == 2) {
            arg16 = 128 - arg16;
            arg15 = 128 - arg15;
        } else if (arg4 == 3) {
            int var19 = arg16;
            arg16 = 128 - arg15;
            arg15 = var19;
        }
        field4916++;
        float var20;
        float var21;
        int var22;
        float var23;
        if (arg16 == 0 && arg15 == 0) {
            var20 = arg6[arg14][arg12];
            var21 = arg8[arg14][arg12];
            var22 = arg9;
            var23 = arg5[arg14][arg12];
        } else if (arg16 == 128 && arg15 == 0) {
            var22 = arg17;
            var23 = arg5[arg14 + 1][arg12];
            var20 = arg6[arg14 + 1][arg12];
            var21 = arg8[arg14 + 1][arg12];
        } else if (arg16 == 128 && arg15 == 128) {
            var23 = arg5[arg14 + 1][arg12 + 1];
            var20 = arg6[arg14 + 1][arg12 + 1];
            var21 = arg8[arg14 + 1][arg12 + 1];
            var22 = arg3;
        } else if (arg16 == 0 && arg15 == 128) {
            var20 = arg6[arg14][arg12 + 1];
            var23 = arg5[arg14][arg12 + 1];
            var22 = arg1;
            var21 = arg8[arg14][arg12 + 1];
        } else {
            float var24 = arg5[arg14][arg12];
            float var25 = arg6[arg14][arg12];
            float var26 = arg8[arg14][arg12];
            float var27 = (float) arg16 / 128.0F;
            float var28 = (arg6[arg14 + 1][arg12] - var25) * var27 + var25;
            float var29 = (arg5[arg14 + 1][arg12] - var24) * var27 + var24;
            float var30 = (arg8[arg14 + 1][arg12] - var26) * var27 + var26;
            float var31 = arg5[arg14][arg12 + 1];
            float var32 = (arg5[arg14 + 1][arg12 + 1] - var31) * var27 + var31;
            float var33 = (float) arg15 / 128.0F;
            var23 = (var32 - var29) * var33 + var29;
            float var34 = arg6[arg14][arg12 + 1];
            float var35 = (arg6[arg14 + 1][arg12 + 1] - var34) * var27 + var34;
            float var36 = arg8[arg14][arg12 + 1];
            float var37 = (arg8[arg14 + 1][arg12 + 1] - var36) * var27 + var36;
            var20 = (var35 - var28) * var33 + var28;
            var21 = (var37 - var30) * var33 + var30;
            int var38 = class207.method1465(arg16, arg9, arg17, 111);
            int var39 = class207.method1465(arg16, arg1, arg3, -91);
            var22 = class207.method1465(arg15, var38, var39, -91);
        }
        int var40 = -124 / ((arg7 + 50) / 63);
        int var41 = class36.method253((byte) -126, arg12, arg16, arg2, arg15, arg14);
        int var42 = (arg12 << 7) + arg15;
        int var43 = (arg14 << 7) + arg16;
        return arg13.method780(var43, var41, var42, var23, var20, var21, arg10 ? var22 & 0xFFFFFF00 : var22, arg11 == null ? 0.0F : (float) (var41 - class36.method253((byte) -128, arg12, arg16, arg11, arg15, arg14)) / arg0);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)V", line = 500)
    private final void method1988(boolean arg0) {
        field4936++;
        if (!arg0) {
            return;
        }
        Random var2 = new Random((long) this.field4917);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4920[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class64.method494(var5, 0, var2);
            short var7 = this.field4920[var6];
            this.field4920[var6] = this.field4920[var5];
            this.field4920[var5] = this.field4920[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V", line = 542)
    public static void method1989(int arg0) {
        field4915 = (short[][]) null;
        field4914 = null;
        if (arg0 != -1) {
            field4925 = 72;
        }
        field4930 = null;
        field4928 = null;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V", line = 561)
    public static final void method1990(int arg0) {
        field4921++;
        class296.method2069();
        class72.field1316 = new class217[7];
        class72.field1316[1] = new class291();
        class72.field1316[2] = new class304();
        class72.field1316[3] = new class263();
        class72.field1316[4] = new class16();
        class72.field1316[5] = new class180();
        class72.field1316[6] = new class131();
        if (arg0 != -965557044) {
            method1992(123);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(Z)Lqa;", line = 579)
    public static final class99 method1991(boolean arg0) {
        field4932++;
        try {
            return arg0 ? (class99) null : (class99) Class.forName("pg").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class170();
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V", line = 595)
    public static final void method1992(int arg0) {
        class76.field1443.method2076(104);
        field4913++;
        if (arg0 > -70) {
            method1990(-95);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
    public abstract void method244(boolean arg0);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public abstract void method246(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public abstract void method245(int arg0);
}
