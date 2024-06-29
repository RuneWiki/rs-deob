import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class class170 {

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    private int field2592 = 4;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public int field2590 = 4;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    private int field2582 = 4;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    private int field2588 = 0;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    private int field2596 = 4;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "[S")
    private short[] field2597 = new short[512];

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field2591 = 50;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2584 = "";

    @OriginalMember(owner = "client!em", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2589 = "wave2:";

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[S")
    private short[] field2587;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1147(int arg0) {
        if (class275.field4238 != null) {
            class199 var1 = class275.field4238;
            synchronized (class275.field4238) {
                class275.field4238 = null;
            }
        }
        field2595++;
        if (arg0 != -1096940916) {
            method1148(true, 99, (String) null);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZILjava/lang/String;)I", line = 25)
    public static final int method1148(boolean arg0, int arg1, String arg2) {
        if (arg0) {
            field2593++;
            return class288.method1873((byte) 80, arg1, arg2, true);
        } else {
            return -40;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IILwf;I)[Lng;", line = 43)
    public static final class245[] method1150(int arg0, int arg1, class306 arg2, int arg3) {
        if (arg3 == 708774124) {
            field2586++;
            return class156.method1093(true, arg0, arg1, arg2) ? class204.method1375(arg3 ^ 0x2A3F0813) : null;
        } else {
            return (class245[]) null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIII)V", line = 59)
    public final void method1151(int arg0, int arg1, int arg2, int arg3) {
        field2594++;
        int[] var5 = new int[arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            var5[var6] = (var6 << 12) / arg3;
        }
        int[] var7 = new int[arg0];
        for (int var8 = 0; var8 < arg0; var8++) {
            var7[var8] = (var8 << 12) / arg0;
        }
        if (arg1 != -57653844) {
            method1148(true, 26, (String) null);
        }
        int[] var9 = new int[arg2];
        for (int var10 = 0; var10 < arg2; var10++) {
            var9[var10] = (var10 << 12) / arg2;
        }
        this.method1152(arg1 ^ 0xFC9055AC);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field2590; var14++) {
                        int var15 = this.field2587[var14] << 12;
                        int var16 = this.field2592 * var15 >> 12;
                        int var17 = this.field2582 * var15 >> 12;
                        int var18 = var9[var11] * var15 >> 12;
                        int var19 = var7[var12] * var15 >> 12;
                        int var20 = this.field2596 * var19;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field2582 * var21;
                        int var23 = this.field2592 * var18;
                        int var24 = this.field2596 * var15 >> 12;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27;
                        if (var16 <= var26) {
                            var27 = 0;
                        } else {
                            var27 = var26 & 0xFF;
                        }
                        int var28 = var25 & 0xFF;
                        int var29 = var22 >> 12;
                        int var30 = var20 >> 12;
                        int var31 = var29 + 1;
                        int var32 = var30 + 1;
                        int var33;
                        if (var24 > var32) {
                            var33 = var32 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        short var34 = this.field2597[var27];
                        int var35;
                        if (var31 < var17) {
                            var35 = var31 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var20 & 0xFFF;
                        int var37 = var29 & 0xFF;
                        short var38 = this.field2597[var28];
                        int var39 = var22 & 0xFFF;
                        int var40 = var23 & 0xFFF;
                        short var41 = this.field2597[var33 + var34];
                        int var42 = class146.field2298[var39];
                        int var43 = class146.field2298[var40];
                        int var44 = var39 - 4096;
                        int var45 = var30 & 0xFF;
                        short var46 = this.field2597[var34 + var45];
                        int var47 = var36 - 4096;
                        int var48 = class146.field2298[var36];
                        short var49 = this.field2597[var33 + var38];
                        short var50 = this.field2597[var45 + var38];
                        int var51 = class187.method1285(this.field2597[var37 + var50], -128, var36, var40, var39);
                        int var52 = class187.method1285(this.field2597[var35 + var50], -128, var36, var40, var44);
                        int var53 = var40 - 4096;
                        int var54 = ((var52 - var51) * var42 >> 12) + var51;
                        int var55 = class187.method1285(this.field2597[var37 + var49], -118, var47, var40, var39);
                        int var56 = class187.method1285(this.field2597[var35 + var49], -122, var47, var40, var44);
                        int var57 = ((var56 - var55) * var42 >> 12) + var55;
                        int var58 = ((var57 - var54) * var48 >> 12) + var54;
                        int var59 = class187.method1285(this.field2597[var37 + var46], arg1 + 57653728, var36, var53, var39);
                        int var60 = class187.method1285(this.field2597[var35 + var46], -116, var36, var53, var44);
                        int var61 = ((var60 - var59) * var42 >> 12) + var59;
                        int var62 = class187.method1285(this.field2597[var37 + var41], -114, var47, var53, var39);
                        int var63 = class187.method1285(this.field2597[var35 + var41], -117, var47, var53, var44);
                        int var64 = ((var63 - var62) * var42 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var48 >> 12);
                        this.method1149(true, var14, ((var65 - var58) * var43 >> 12) + var58);
                    }
                    this.method1154(255);
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)V", line = 231)
    private final void method1153(int arg0) {
        Random var2 = new Random((long) this.field2588);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field2597[var3] = (short) var3;
        }
        field2583++;
        if (arg0 != 4095) {
            method1147(-123);
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class7.method39((byte) 57, var2, var5);
            short var7 = this.field2597[var6];
            this.field2597[var6] = this.field2597[var5];
            this.field2597[var5] = this.field2597[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 268)
    public static void method1155(byte arg0) {
        field2584 = null;
        field2589 = null;
        if (arg0 > -111) {
            method1147(-113);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIJ)Z", line = 279)
    public static final boolean method1156(int arg0, int arg1, int arg2, long arg3) {
        class174 var5 = class90.field1375[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2672 != null && var5.field2672.field2457 == arg3) {
            return true;
        } else if (var5.field2650 != null && var5.field2650.field2392 == arg3) {
            return true;
        } else if (var5.field2667 != null && var5.field2667.field289 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2655; var6++) {
                if (var5.field2671[var6].field4183 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIII)V", line = 362)
    public class170(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2588 = arg0;
        this.field2592 = arg4;
        this.field2596 = arg3;
        this.field2582 = arg2;
        this.field2590 = arg1;
        this.method1157((byte) 57);
        this.method1153(4095);
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(B)V", line = 322)
    private final void method1157(byte arg0) {
        int var2 = 30 % ((-arg0 - 44) / 50);
        field2598++;
        this.field2587 = new short[this.field2590];
        for (int var3 = 0; var3 < this.field2590; var3++) {
            this.field2587[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZII)V")
    public abstract void method1149(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
    public abstract void method1152(int arg0);

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(I)V")
    public abstract void method1154(int arg0);
}
