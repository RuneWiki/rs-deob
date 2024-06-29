import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public abstract class class294 {

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    private int field4609 = 4;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    private int field4618 = 4;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    private int field4617 = 0;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "[S")
    private short[] field4625 = new short[512];

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public int field4615 = 4;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    private int field4616 = 4;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "[I")
    public static int[] field4622 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "Lad;")
    public static class128 field4621 = new class128();

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "[S")
    private short[] field4620;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIBI)V", line = 8)
    public final void method2070(int arg0, int arg1, byte arg2, int arg3) {
        field4624++;
        if (arg2 != 100) {
            method2076((short[]) null, (String[]) null, (byte) 5);
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
        this.method742((byte) 66);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field4615; var14++) {
                        int var15 = this.field4620[var14] << 12;
                        int var16 = var7[var11] * var15 >> 12;
                        int var17 = var6[var12] * var15 >> 12;
                        int var18 = this.field4616 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = this.field4618 * var15 >> 12;
                        int var21 = this.field4618 * var19;
                        int var22 = this.field4609 * var16;
                        int var23 = var21 >> 12;
                        int var24 = var21 & 0xFFF;
                        int var25 = var23 + 1;
                        int var26 = this.field4616 * var17;
                        int var27 = var23 & 0xFF;
                        int var28 = var24 - 4096;
                        int var29 = this.field4609 * var15 >> 12;
                        int var30 = class321.field4992[var24];
                        int var31 = var22 >> 12;
                        int var32;
                        if (var25 >= var20) {
                            var32 = 0;
                        } else {
                            var32 = var25 & 0xFF;
                        }
                        int var33 = var22 & 0xFFF;
                        int var34 = var31 + 1;
                        int var35 = var26 >> 12;
                        int var36 = var33 - 4096;
                        int var37 = var26 & 0xFFF;
                        int var38 = var37 - 4096;
                        int var39 = class321.field4992[var37];
                        int var40 = var35 + 1;
                        int var41 = var35 & 0xFF;
                        int var42;
                        if (var18 <= var40) {
                            var42 = 0;
                        } else {
                            var42 = var40 & 0xFF;
                        }
                        int var43;
                        if (var29 > var34) {
                            var43 = var34 & 0xFF;
                        } else {
                            var43 = 0;
                        }
                        int var44 = var31 & 0xFF;
                        int var45 = class321.field4992[var33];
                        short var46 = this.field4625[var43];
                        short var47 = this.field4625[var44];
                        short var48 = this.field4625[var41 + var47];
                        short var49 = this.field4625[var42 + var46];
                        short var50 = this.field4625[var41 + var46];
                        short var51 = this.field4625[var42 + var47];
                        int var52 = class57.method512(this.field4625[var27 + var48], var24, var37, -14993, var33);
                        int var53 = class57.method512(this.field4625[var32 + var48], var28, var37, arg2 - 15093, var33);
                        int var54 = var52 + ((var53 - var52) * var30 >> 12);
                        int var55 = class57.method512(this.field4625[var27 + var51], var24, var38, arg2 - 15093, var33);
                        int var56 = class57.method512(this.field4625[var32 + var51], var28, var38, -14993, var33);
                        int var57 = ((var56 - var55) * var30 >> 12) + var55;
                        int var58 = class57.method512(this.field4625[var27 + var50], var24, var37, -14993, var36);
                        int var59 = ((var57 - var54) * var39 >> 12) + var54;
                        int var60 = class57.method512(this.field4625[var32 + var50], var28, var37, arg2 ^ 0xFFFFC50B, var36);
                        int var61 = ((var60 - var58) * var30 >> 12) + var58;
                        int var62 = class57.method512(this.field4625[var27 + var49], var24, var38, arg2 - 15093, var36);
                        int var63 = class57.method512(this.field4625[var32 + var49], var28, var38, -14993, var36);
                        int var64 = ((var63 - var62) * var30 >> 12) + var62;
                        int var65 = ((var64 - var61) * var39 >> 12) + var61;
                        this.method739(var14, var59 + ((var65 - var59) * var45 >> 12), arg2 ^ 0x6EC086A8);
                    }
                    this.method745((byte) 107);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V", line = 175)
    private final void method2071(boolean arg0) {
        field4608++;
        Random var2 = new Random((long) this.field4617);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4625[var3] = (short) var3;
        }
        if (!arg0) {
            this.field4615 = -33;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class66.method561(arg0, var2, var5);
            short var7 = this.field4625[var6];
            this.field4625[var6] = this.field4625[var5];
            this.field4625[var5] = this.field4625[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLhb;)Ljava/lang/String;", line = 211)
    public static final String method2072(byte arg0, class35 arg1) {
        field4626++;
        if (arg0 != 81) {
            field4621 = (class128) null;
        }
        return class86.method712(arg1, 32767, -19293);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(III)V", line = 222)
    public static final void method2073(int arg0, int arg1, int arg2) {
        field4607++;
        if (arg2 != 1) {
            method2072((byte) 124, (class35) null);
        }
        class147 var3 = class92.method731(arg2 ^ 0xFFFF8E3A, arg1, 12);
        var3.method1095(95);
        var3.field2240 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)I", line = 236)
    public static final int method2074(int arg0) {
        field4610++;
        try {
            if (class21.field228 == 0) {
                if (class124.field1963 > class234.method1650((byte) -105) - 5000L) {
                    return 0;
                }
                class183.field2747 = class301.field4715.method162(class31.field398, (byte) -105, class193.field3088);
                class211.field3347 = class234.method1650((byte) 7);
                class21.field228 = 1;
            }
            if ((class211.field3347 + 30000L) < class234.method1650((byte) -102)) {
                return class27.method180(1000, (byte) 101);
            }
            if (class21.field228 == 1) {
                if (class183.field2747.field3585 == 2) {
                    return class27.method180(1001, (byte) 101);
                }
                if (class183.field2747.field3585 != 1) {
                    return -1;
                }
                class297.field4661 = new class118((Socket) class183.field2747.field3590, class301.field4715);
                class159.field2372.field455 = 0;
                int var1 = 0;
                if (class10.field105) {
                    var1 = class21.field231;
                }
                class183.field2747 = null;
                class159.field2372.method262((byte) 81, 23);
                class159.field2372.method259(-15195, var1);
                class297.field4661.method920((byte) -76, class159.field2372.field437, 0, class159.field2372.field455);
                if (class256.field3818 != null) {
                    class256.field3818.method1858((byte) 59);
                }
                if (class261.field3861 != null) {
                    class261.field3861.method1858((byte) 22);
                }
                int var2 = class297.field4661.method918(0);
                if (class256.field3818 != null) {
                    class256.field3818.method1858((byte) 45);
                }
                if (class261.field3861 != null) {
                    class261.field3861.method1858((byte) 89);
                }
                if (var2 != 0) {
                    return class27.method180(var2, (byte) 101);
                }
                class21.field228 = 2;
            }
            if (arg0 > -105) {
                return 74;
            }
            if (class21.field228 == 2) {
                if (class297.field4661.method915(0) < 2) {
                    return -1;
                }
                class153.field2299 = class297.field4661.method918(0);
                class153.field2299 <<= 0x8;
                class153.field2299 += class297.field4661.method918(0);
                class81.field1133 = new byte[class153.field2299];
                class21.field228 = 3;
                class33.field409 = 0;
            }
            if (class21.field228 != 3) {
                return -1;
            }
            int var3 = class297.field4661.method915(0);
            if (var3 < 1) {
                return -1;
            }
            if (class153.field2299 - class33.field409 < var3) {
                var3 = class153.field2299 - class33.field409;
            }
            class297.field4661.method919(var3, class81.field1133, 10224, class33.field409);
            class33.field409 += var3;
            if (class153.field2299 > class33.field409) {
                return -1;
            } else if (class106.method821(class81.field1133, -5)) {
                class246.field3709 = new class220[class227.field3516];
                int var4 = 0;
                for (int var5 = class289.field4547; var5 <= class154.field2319; var5++) {
                    class220 var6 = class35.method254(var5, true);
                    if (var6 != null) {
                        class246.field3709[var4++] = var6;
                    }
                }
                class297.field4661.method916(-25224);
                class78.field1103 = 0;
                class81.field1133 = null;
                class297.field4661 = null;
                class21.field228 = 0;
                class124.field1963 = class234.method1650((byte) -105);
                return 0;
            } else {
                return class27.method180(1002, (byte) 101);
            }
        } catch (IOException var8) {
            return class27.method180(1003, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(Z)V", line = 368)
    private final void method2075(boolean arg0) {
        this.field4620 = new short[this.field4615];
        field4613++;
        for (int var2 = 0; var2 < this.field4615; var2++) {
            this.field4620[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (!arg0) {
            this.field4616 = -77;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([S[Ljava/lang/String;B)V", line = 396)
    public static final void method2076(short[] arg0, String[] arg1, byte arg2) {
        int var3 = -44 % ((-arg2 - 76) / 35);
        field4619++;
        class119.method923((byte) 117, arg1, 0, arg1.length - 1, arg0);
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(IIIII)V", line = 557)
    public class294(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4609 = arg4;
        this.field4616 = arg3;
        this.field4615 = arg1;
        this.field4617 = arg0;
        this.field4618 = arg2;
        this.method2075(true);
        this.method2071(true);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)[Lvd;", line = 425)
    public static final class134[] method2077(int arg0) {
        field4623++;
        if (arg0 < 104) {
            field4628 = -44;
        }
        class134[] var1 = new class134[class173.field2566];
        for (int var2 = 0; var2 < class173.field2566; var2++) {
            int var3 = class323.field5027[var2] * class111.field1756[var2];
            byte[] var4 = class274.field4162[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class57.field843[class142.method1078(var4[var6], 255)];
            }
            var1[var2] = new class134(class150.field2273, class98.field1453, class271.field4096[var2], class101.field1541[var2], class111.field1756[var2], class323.field5027[var2], var5);
        }
        class265.method1835(10);
        return var1;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 461)
    public static void method2078(byte arg0) {
        field4621 = null;
        field4622 = null;
        if (arg0 <= 76) {
            method2080(82, 77, -21, -3);
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V", line = 477)
    public static final void method2079(int arg0) {
        if (arg0 != 3) {
            return;
        }
        field4614++;
        int var1 = class281.method1978((byte) 75);
        if (var1 == 0) {
            class183.field2773 = (byte[][][]) null;
            class232.method1649((byte) -114, 0);
        } else if (var1 == 1) {
            class59.method526((byte) 0, 13226);
            class232.method1649((byte) -81, 512);
            class133.method1010((byte) 121);
        } else {
            class59.method526((byte) (class255.field3812 - 4 & 0xFF), arg0 ^ 0x33A9);
            class232.method1649((byte) -89, 2);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIII)I", line = 508)
    public static final int method2080(int arg0, int arg1, int arg2, int arg3) {
        field4612++;
        if (class41.field612 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class208.field3272[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg2 & 0x7F;
        int var8 = arg1 & 0x7F;
        int var9 = (128 - var7) * class41.field612[var6][var4][var5] + class41.field612[var6][var4 + 1][var5] * var7 >> 7;
        if (arg0 != 899) {
            method2076((short[]) null, (String[]) null, (byte) -112);
        }
        int var10 = (128 - var7) * class41.field612[var6][var4][var5 + 1] + class41.field612[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
    public abstract void method739(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)V")
    public abstract void method745(byte arg0);

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)V")
    public abstract void method742(byte arg0);
}
