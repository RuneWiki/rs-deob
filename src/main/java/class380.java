import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class380 extends class198 {

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field5497 = 0;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Lao;")
    public static class191 field5504 = new class191(87, 16);

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field5506 = new String[200];

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "[I")
    public static int[] field5505 = new int[5];

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "J")
    public static long field5507 = 0L;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "[I")
    public static int[] field5510 = new int[1];

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Lsr;")
    public static class167 field5509 = new class167();

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field5511 = new String[100];

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "Lo;")
    public static class24 field5512;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Lac;")
    public class380 field5500;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Lac;")
    public class380 field5501;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([ILur;IIZI)Lal;", line = 6)
    public static final class67 method2318(int[] arg0, class377 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field5502++;
        if (arg5 != 3553) {
            method2321(false, null, 111, 66, 22);
        }
        if (!arg1.field5397 && (!class119.method713(arg3, 65) || !class119.method713(arg2, arg5 - 3530))) {
            return arg1.field5374 ? new class67(arg1, 34037, arg3, arg2, arg4, arg0) : new class67(arg1, arg3, arg2, class111.method682(arg5 - 3678, arg3), class111.method682(-128, arg2), arg0);
        } else {
            return new class67(arg1, 3553, arg3, arg2, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[B)[B", line = 25)
    public static final byte[] method2319(int arg0, byte[] arg1) {
        field5495++;
        if (arg0 == 1) {
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class438.method2687(arg1, 0, var3, 0, var2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V", line = 43)
    public static final void method2320(int arg0) {
        if (arg0 != 100) {
            method2324(-98);
        }
        field5503++;
        class105.field1417 = new class167();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLjk;III)V", line = 54)
    public static final void method2321(boolean arg0, class450 arg1, int arg2, int arg3, int arg4) {
        field5494++;
        int var5 = arg1.field6612;
        int var6 = arg1.field6573;
        if (arg1.field6671 == 0) {
            arg1.field6612 = arg1.field6613;
        } else if (arg1.field6671 == 1) {
            arg1.field6612 = arg4 - arg1.field6613;
        } else if (arg1.field6671 == 2) {
            arg1.field6612 = arg1.field6613 * arg4 >> 14;
        }
        if (arg1.field6553 == arg3) {
            arg1.field6573 = arg1.field6555;
        } else if (arg1.field6553 == 1) {
            arg1.field6573 = arg2 - arg1.field6555;
        } else if (arg1.field6553 == 2) {
            arg1.field6573 = arg1.field6555 * arg2 >> 14;
        }
        if (arg1.field6671 == 4) {
            arg1.field6612 = arg1.field6605 * arg1.field6573 / arg1.field6586;
        }
        if (arg1.field6553 == 4) {
            arg1.field6573 = arg1.field6612 * arg1.field6586 / arg1.field6605;
        }
        if (class94.field1134 && (client.method1253(arg1).field2979 != 0 || arg1.field6686 == 0)) {
            if (arg1.field6573 < 5 && arg1.field6612 < 5) {
                arg1.field6612 = 5;
                arg1.field6573 = 5;
            } else {
                if (arg1.field6573 <= 0) {
                    arg1.field6573 = 5;
                }
                if (arg1.field6612 <= 0) {
                    arg1.field6612 = 5;
                }
            }
        }
        if (class294.field3897 == arg1.field6679) {
            class502.field7324 = arg1;
        }
        if (arg0 && arg1.field6544 != null && arg1.field6612 != var5 || arg1.field6573 != var6) {
            class293 var7 = new class293();
            var7.field3866 = arg1.field6544;
            var7.field3877 = arg1;
            class354.field4735.method975(0, var7);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 134)
    public static final void method2322(byte arg0) {
        field5498++;
        for (int var1 = 0; var1 < 5; var1++) {
            class462.field6896[var1] = false;
        }
        class352.field4700 = -1;
        class316.field4230 = 0;
        class47.field491 = 1;
        if (arg0 < 32) {
            field5512 = null;
        }
        class275.field3655 = 0;
        class117.field1530 = -1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLkh;)V", line = 169)
    public static final void method2323(byte arg0, class13 arg1) {
        field5496++;
        int var2 = 0;
        arg1.method73(62);
        for (int var3 = 0; var3 < class461.field6877; var3++) {
            int var15 = class342.field4589[var3];
            if ((class424.field6169[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class424.field6169[var15] = (byte) class219.method1381(class424.field6169[var15], 2);
                } else {
                    int var16 = arg1.method80(1, 255);
                    if (var16 == 0) {
                        var2 = class216.method1376(12706, arg1);
                        class424.field6169[var15] = (byte) class219.method1381(class424.field6169[var15], 2);
                    } else {
                        class241.method1502(arg1, arg0 ^ 0xFFFF958F, var15);
                    }
                }
            }
        }
        arg1.method79(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method73(98);
        for (int var4 = 0; var4 < class461.field6877; var4++) {
            int var13 = class342.field4589[var4];
            if ((class424.field6169[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class424.field6169[var13] = (byte) class219.method1381(class424.field6169[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method80(1, 255);
                    if (var14 == 0) {
                        var2 = class216.method1376(12706, arg1);
                        class424.field6169[var13] = (byte) class219.method1381(class424.field6169[var13], 2);
                    } else {
                        class241.method1502(arg1, 27160, var13);
                    }
                }
            }
        }
        arg1.method79(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method73(66);
        for (int var5 = 0; var5 < class95.field1146; var5++) {
            int var11 = class100.field1376[var5];
            if ((class424.field6169[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class424.field6169[var11] = (byte) class219.method1381(class424.field6169[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method80(1, 255);
                    if (var12 == 0) {
                        var2 = class216.method1376(12706, arg1);
                        class424.field6169[var11] = (byte) class219.method1381(class424.field6169[var11], 2);
                    } else if (class252.method1565(arg0 ^ 0x32C2, var11, arg1)) {
                        class424.field6169[var11] = (byte) class219.method1381(class424.field6169[var11], 2);
                    }
                }
            }
        }
        arg1.method79(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method73(arg0 + 151);
        for (int var6 = 0; var6 < class95.field1146; var6++) {
            int var9 = class100.field1376[var6];
            if ((class424.field6169[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class424.field6169[var9] = (byte) class219.method1381(class424.field6169[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method80(1, 255);
                    if (var10 == 0) {
                        var2 = class216.method1376(12706, arg1);
                        class424.field6169[var9] = (byte) class219.method1381(class424.field6169[var9], 2);
                    } else if (class252.method1565(-12971, var9, arg1)) {
                        class424.field6169[var9] = (byte) class219.method1381(class424.field6169[var9], 2);
                    }
                }
            }
        }
        arg1.method79(false);
        if (arg0 != -105) {
            return;
        }
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class461.field6877 = 0;
        class95.field1146 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class424.field6169[var7] = (byte) (class424.field6169[var7] >> 1);
            class531 var8 = class29.field272[var7];
            if (var8 == null) {
                class100.field1376[class95.field1146++] = var7;
            } else {
                class342.field4589[class461.field6877++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V", line = 372)
    public static void method2324(int arg0) {
        field5504 = null;
        field5506 = null;
        field5505 = null;
        if (arg0 >= 69) {
            field5511 = null;
            field5509 = null;
            field5512 = null;
            field5510 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 396)
    public final void method2325(boolean arg0) {
        field5499++;
        if (this.field5501 == null) {
            return;
        }
        this.field5501.field5500 = this.field5500;
        this.field5500.field5501 = this.field5501;
        if (!arg0) {
            method2319(44, null);
        }
        this.field5501 = null;
        this.field5500 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lwk;I)V", line = 425)
    public static final void method2326(class96 arg0, int arg1) {
        field5493++;
        int var2 = arg0.field1213 - class532.field7836;
        int var3 = arg0.field1215 * 128 + arg0.method546(24273) * 64;
        int var4 = arg0.field1209 * 128 + (arg0.method546(24273) * 64);
        if (arg1 != -1867) {
            return;
        }
        arg0.field3704 += (var3 - arg0.field3704) / var2;
        arg0.field3694 += (var4 - arg0.field3694) / var2;
        arg0.field1256 = 0;
        if (arg0.field1199 == 0) {
            arg0.method536(16383, 8192);
        }
        if (arg0.field1199 == 1) {
            arg0.method536(16383, 12288);
        }
        if (arg0.field1199 == 2) {
            arg0.method536(16383, 0);
        }
        if (arg0.field1199 == 3) {
            arg0.method536(arg1 + 18250, 4096);
        }
    }
}
