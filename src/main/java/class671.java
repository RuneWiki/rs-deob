import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public abstract class class671 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public int field9476 = 4;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    private int field9478 = 0;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    private int field9477 = 4;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "[S")
    private short[] field9480 = new short[512];

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    private int field9484 = 4;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    private int field9487 = 4;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Z")
    public static boolean field9479 = false;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "Lnea;")
    public static class664 field9488 = new class664(114, 7);

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "J")
    public static long field9493 = -1L;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field9481;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field9485;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field9486;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field9489;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field9490;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field9491;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "[S")
    private short[] field9482;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "[[I")
    public static int[][] field9492;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 8)
    private final void method3719(byte arg0) {
        if (arg0 != -66) {
            this.field9487 = -40;
        }
        field9485++;
        this.field9482 = new short[this.field9476];
        for (int var2 = 0; var2 < this.field9476; var2++) {
            this.field9482[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(IIB)Z", line = 31)
    public static final boolean method3720(int arg0, int arg1, byte arg2) {
        field9483++;
        if (!class623.field8731) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        int var5 = -81 / ((-arg2 - 42) / 45);
        if (class181.field2558[var3] == null || class181.field2558[var3][var4] == null) {
            return false;
        }
        class49 var6 = class181.field2558[var3][var4];
        if (arg0 == -1 && var6.field980 == 0) {
            for (class279 var7 = (class279) class663.field9367.method472((byte) -30); var7 != null; var7 = (class279) class663.field9367.method482(120)) {
                if (var7.field4213 == 21 || var7.field4213 == 1010 || var7.field4213 == 23 || var7.field4213 == 9 || var7.field4213 == 50) {
                    for (class49 var8 = class534.method3038(-101, var7.field4218); var8 != null; var8 = class224.method1483(var8, 21964)) {
                        if (var6.field977 == var8.field977) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class279 var9 = (class279) class663.field9367.method472((byte) -84); var9 != null; var9 = (class279) class663.field9367.method482(31)) {
                if (var9.field4219 == arg0 && var6.field977 == var9.field4218 && (var9.field4213 == 21 || var9.field4213 == 1010 || var9.field4213 == 23 || var9.field4213 == 9 || var9.field4213 == 50)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(IIIII)V", line = 361)
    public class671(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9478 = arg0;
        this.field9476 = arg1;
        this.field9484 = arg3;
        this.field9487 = arg2;
        this.field9477 = arg4;
        this.method3719((byte) -66);
        this.method3722(255);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 109)
    public static void method3721(int arg0) {
        field9488 = null;
        if (arg0 > -6) {
            field9481 = -5;
        }
        field9492 = null;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 124)
    private final void method3722(int arg0) {
        field9491++;
        Random var2 = new Random((long) this.field9478);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field9480[var3] = (short) var3;
        }
        if (arg0 != 255) {
            this.method3719((byte) -124);
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class311.method1976(-1, var5, var2);
            short var7 = this.field9480[var6];
            this.field9480[var6] = this.field9480[var5];
            this.field9480[var5] = this.field9480[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)V", line = 165)
    public static final void method3723(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -7725) {
            return;
        }
        field9489++;
        class129.field1913 = arg3;
        class436.field6381 = arg1;
        class271.field4087 = arg2;
        class621.field8660 = arg4;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIII)V", line = 180)
    public final void method3724(int arg0, int arg1, int arg2, int arg3) {
        field9486++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg0; var7++) {
            var5[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg2];
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var8[var10] = (var10 << 12) / arg2;
        }
        this.method904(90);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field9476; var14++) {
                        int var15 = this.field9482[var14] << 12;
                        int var16 = this.field9477 * var15 >> 12;
                        int var17 = var8[var11] * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field9484 * var15 >> 12;
                        int var21 = this.field9487 * var15 >> 12;
                        int var22 = this.field9477 * var17;
                        int var23 = this.field9484 * var19;
                        int var24 = this.field9487 * var18;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var21 > var26) {
                            var33 = var26 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var22 & 0xFFF;
                        int var35 = var24 & 0xFFF;
                        int var36;
                        if (var29 >= var20) {
                            var36 = 0;
                        } else {
                            var36 = var29 & 0xFF;
                        }
                        int var37 = var30 & 0xFF;
                        int var38 = var23 & 0xFFF;
                        int var39;
                        if (var32 >= var16) {
                            var39 = 0;
                        } else {
                            var39 = var32 & 0xFF;
                        }
                        int var40 = class339.field4993[var34];
                        int var41 = class339.field4993[var35];
                        int var42 = var35 - 4096;
                        short var43 = this.field9480[var39];
                        int var44 = var34 - 4096;
                        int var45 = var38 - 4096;
                        short var46 = this.field9480[var37];
                        int var47 = class339.field4993[var38];
                        short var48 = this.field9480[var36 + var43];
                        short var49 = this.field9480[var36 + var46];
                        short var50 = this.field9480[var31 + var46];
                        short var51 = this.field9480[var31 + var43];
                        int var52 = class498.method2882(var35, var34, this.field9480[var27 + var50], arg3 ^ 0x3D62C273, var38);
                        int var53 = class498.method2882(var42, var34, this.field9480[var33 + var50], -1, var38);
                        int var54 = ((var53 - var52) * var41 >> 12) + var52;
                        int var55 = class498.method2882(var35, var34, this.field9480[var27 + var49], -1, var45);
                        int var56 = class498.method2882(var42, var34, this.field9480[var33 + var49], arg3 ^ 0x3D62C273, var45);
                        int var57 = ((var56 - var55) * var41 >> 12) + var55;
                        int var58 = class498.method2882(var35, var44, this.field9480[var27 + var51], -1, var38);
                        int var59 = ((var57 - var54) * var47 >> 12) + var54;
                        int var60 = class498.method2882(var42, var44, this.field9480[var33 + var51], -1, var38);
                        int var61 = ((var60 - var58) * var41 >> 12) + var58;
                        int var62 = class498.method2882(var35, var44, this.field9480[var27 + var48], -1, var45);
                        int var63 = class498.method2882(var42, var44, this.field9480[var33 + var48], -1, var45);
                        int var64 = ((var63 - var62) * var41 >> 12) + var62;
                        int var65 = ((var64 - var61) * var47 >> 12) + var61;
                        this.method907(var14, ((var65 - var59) * var40 >> 12) + var59, (byte) 44);
                    }
                    this.method902(true);
                }
            }
        }
        if (arg3 != -1029882484) {
            method3723(-21, 28, -26, -25, 53);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public abstract void method904(int arg0);

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIB)V")
    public abstract void method907(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
    public abstract void method902(boolean arg0);
}
