import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class359 {

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    private int field5053 = 4;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    private int field5045 = 4;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    private int field5054 = 4;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public int field5055 = 4;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    private int field5059 = 0;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "[S")
    private short[] field5056 = new short[512];

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lrg;")
    public static class383 field5051 = null;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field5048 = -1;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "[[I")
    public static int[][] field5061 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "[I")
    public static int[] field5063 = new int[32];

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "Lqj;")
    public static class296 field5064;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lkq;")
    public static class351 field5058;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[S")
    private short[] field5052;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 7)
    private final void method2318(byte arg0) {
        field5060++;
        Random var2 = new Random((long) this.field5059);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field5056[var3] = (short) var3;
        }
        if (arg0 <= 85) {
            this.method2320(-40);
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class99.method704(var2, var5, (byte) -10);
            short var7 = this.field5056[var6];
            this.field5056[var6] = this.field5056[var5];
            this.field5056[var5] = this.field5056[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIIIZILeb;IIIII)V", line = 47)
    public static final void method2319(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class371 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg5 == 1) {
            arg2 = 1;
        } else if (arg5 == 2) {
            arg11 = 1;
            arg2 = 1;
        } else if (arg5 == 3) {
            arg11 = 1;
        }
        field5062++;
        if (arg3 < ~arg1 || arg1 >= class432.field6220 || arg9 < 0 || arg9 >= class267.field3646) {
            while (true) {
                int var14 = arg6.method2429(0);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg6.method2429(0);
                    return;
                }
                if (var14 <= 49) {
                    arg6.method2429(0);
                }
            }
        }
        if (!arg0 && !arg4) {
            class221.field2910[arg7][arg1][arg9] = 0;
        }
        while (true) {
            int var12 = arg6.method2429(arg3 + 1);
            if (var12 == 0) {
                if (arg0) {
                    class418.field6051[0][arg1 + arg11][arg2 + arg9] = class156.field2213[0].method275(arg1 + arg11, arg2 + arg9);
                    return;
                } else if (arg7 == 0) {
                    class418.field6051[0][arg1 + arg11][arg2 + arg9] = -class123.method823((byte) 101, arg10 + 932731, 556238 - -arg8) * 8;
                    return;
                } else {
                    class418.field6051[arg7][arg1 + arg11][arg2 + arg9] = class418.field6051[arg7 - 1][arg1 + arg11][arg9 + arg2] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg6.method2429(0);
                if (arg0) {
                    class418.field6051[0][arg1 + arg11][arg2 + arg9] = class156.field2213[0].method275(arg1 + arg11, arg2 + arg9) + (var13 * 8);
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg7 != 0) {
                    class418.field6051[arg7][arg1 + arg11][arg9 + arg2] = class418.field6051[arg7 - 1][arg1 + arg11][arg9 + arg2] - var13 * 8;
                    return;
                }
                class418.field6051[0][arg1 + arg11][arg2 + arg9] = -var13 * 8;
                return;
            }
            if (var12 <= 49) {
                if (arg4) {
                    arg6.method2429(arg3 + 1);
                } else {
                    class68.field1065[arg7][arg1][arg9] = arg6.method2418(-21337);
                    class361.field5069[arg7][arg1][arg9] = (byte) ((var12 - 2) / 4);
                    class140.field2006[arg7][arg1][arg9] = (byte) class318.method2028(var12 + arg5 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!arg0 && !arg4) {
                    class221.field2910[arg7][arg1][arg9] = (byte) (var12 - 49);
                }
            } else if (!arg4) {
                class399.field5841[arg7][arg1][arg9] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 173)
    private final void method2320(int arg0) {
        field5057++;
        this.field5052 = new short[this.field5055];
        for (int var2 = arg0; var2 < this.field5055; var2++) {
            this.field5052[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V", line = 197)
    public static void method2321(int arg0) {
        field5061 = null;
        field5064 = null;
        field5058 = null;
        field5051 = null;
        field5063 = null;
        if (arg0 != -1) {
            method2324(69, 107, -31, -66);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIII)V", line = 456)
    public class359(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5059 = arg0;
        this.field5045 = arg3;
        this.field5055 = arg1;
        this.field5054 = arg2;
        this.field5053 = arg4;
        this.method2320(0);
        this.method2318((byte) 87);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)V", line = 242)
    public final void method2322(int arg0, int arg1, int arg2, int arg3) {
        field5049++;
        if (arg0 != -6496) {
            return;
        }
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg3];
        for (int var7 = 0; var7 < arg1; var7++) {
            var5[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg2];
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var8[var10] = (var10 << 12) / arg2;
        }
        this.method570(-2);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field5055; var14++) {
                        int var15 = this.field5052[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = var8[var11] * var15 >> 12;
                        int var18 = this.field5045 * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field5053 * var15 >> 12;
                        int var21 = this.field5054 * var15 >> 12;
                        int var22 = this.field5045 * var19;
                        int var23 = this.field5053 * var17;
                        int var24 = this.field5054 * var16;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var23 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var24 & 0xFFF;
                        int var34 = var22 & 0xFFF;
                        int var35;
                        if (var21 <= var26) {
                            var35 = 0;
                        } else {
                            var35 = var26 & 0xFF;
                        }
                        int var36 = var30 & 0xFF;
                        int var37;
                        if (var29 >= var18) {
                            var37 = 0;
                        } else {
                            var37 = var29 & 0xFF;
                        }
                        int var38 = var23 & 0xFFF;
                        int var39;
                        if (var20 <= var32) {
                            var39 = 0;
                        } else {
                            var39 = var32 & 0xFF;
                        }
                        int var40 = class143.field2069[var33];
                        short var41 = this.field5056[var36];
                        int var42 = class143.field2069[var38];
                        short var43 = this.field5056[var39];
                        int var44 = class143.field2069[var34];
                        int var45 = var34 - 4096;
                        int var46 = var38 - 4096;
                        int var47 = var33 - 4096;
                        short var48 = this.field5056[var37 + var43];
                        short var49 = this.field5056[var31 + var43];
                        short var50 = this.field5056[var37 + var41];
                        short var51 = this.field5056[var31 + var41];
                        int var52 = class46.method323(arg0 + 6486, this.field5056[var27 + var51], var33, var38, var34);
                        int var53 = class46.method323(-10, this.field5056[var35 + var51], var47, var38, var34);
                        int var54 = ((var53 - var52) * var40 >> 12) + var52;
                        int var55 = class46.method323(-10, this.field5056[var27 + var50], var33, var38, var45);
                        int var56 = class46.method323(-10, this.field5056[var35 + var50], var47, var38, var45);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var44 >> 12);
                        int var59 = class46.method323(arg0 ^ 0x1956, this.field5056[var27 + var49], var33, var46, var34);
                        int var60 = class46.method323(arg0 + 6486, this.field5056[var35 - -var49], var47, var46, var34);
                        int var61 = ((var60 - var59) * var40 >> 12) + var59;
                        int var62 = class46.method323(-10, this.field5056[var27 + var48], var33, var46, var45);
                        int var63 = class46.method323(-10, this.field5056[var35 + var48], var47, var46, var45);
                        int var64 = var62 + ((var63 - var62) * var40 >> 12);
                        int var65 = ((var64 - var61) * var44 >> 12) + var61;
                        this.method569((byte) -127, var14, ((var65 - var58) * var42 >> 12) + var58);
                    }
                    this.method571(5215);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III[B)Ljava/lang/String;", line = 408)
    public static final String method2323(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 < 121) {
            method2321(65);
        }
        field5050++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg3[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class235.field3197[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIII)V", line = 470)
    public static final void method2324(int arg0, int arg1, int arg2, int arg3) {
        field5047++;
        class399 var4 = class269.method1655(11, arg0, arg3 ^ 0xFFFFD916);
        var4.method2583((byte) 71);
        var4.field5829 = arg2;
        var4.field5842 = arg1;
        if (arg3 != 9942) {
            method2323(105, -34, -12, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
    public abstract void method570(int arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BII)V")
    public abstract void method569(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
    public abstract void method571(int arg0);
}
