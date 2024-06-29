import java.awt.Canvas;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class258 implements Runnable {

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "Z")
    private boolean field3519 = false;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "I")
    private int field3533 = 0;

    @OriginalMember(owner = "client!pr", name = "E", descriptor = "I")
    private int field3544 = 0;

    @OriginalMember(owner = "client!pr", name = "D", descriptor = "Z")
    private boolean field3543 = false;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "Ljava/net/Socket;")
    private Socket field3534;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "Lkq;")
    private class351 field3526;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field3514;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3524;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3532 = "purple:";

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!pr", name = "A", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!pr", name = "B", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!pr", name = "C", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "Lci;")
    public static class261 field3539;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "Lmq;")
    private class295 field3531;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "[B")
    private byte[] field3535;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II[BI)V")
    public final void method1579(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3542++;
        if (this.field3543) {
            return;
        }
        if (this.field3519) {
            this.field3519 = false;
            throw new IOException();
        }
        if (this.field3535 == null) {
            this.field3535 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 0;
            if (arg1 != 5000) {
                method1586(-60);
            }
            while (var6 < arg3) {
                this.field3535[this.field3533] = arg2[arg0 + var6];
                this.field3533 = (this.field3533 + 1) % 5000;
                if ((this.field3544 + 4900) % 5000 == this.field3533) {
                    throw new IOException();
                }
                var6++;
            }
            if (this.field3531 == null) {
                this.field3531 = this.field3526.method2261(3, 29171, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)I")
    public final int method1580(int arg0) throws IOException {
        field3521++;
        if (this.field3543) {
            return 0;
        } else {
            if (arg0 != 1031) {
                this.method1590(77);
            }
            return this.field3514.available();
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIIILie;BIII)Z")
    public static final boolean method1581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class4 arg7, byte arg8, int arg9, int arg10, int arg11) {
        field3522++;
        int var12 = arg0;
        int var13 = arg9;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg0 - var14;
        class395.field5777[var14][var15] = 99;
        int var17 = arg9 - var15;
        class137.field1949[var14][var15] = 0;
        byte var18 = 0;
        if (arg8 <= 68) {
            return false;
        }
        class170.field2425[var18] = arg0;
        int var19 = 0;
        int var35 = var18 + 1;
        class189.field2626[var18] = arg9;
        int[][] var20 = arg7.field53;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class396.field5784 = var13;
                                    class318.field4372 = var12;
                                    return false;
                                }
                                var13 = class189.field2626[var19];
                                var12 = class170.field2425[var19];
                                var21 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var13 - var17;
                                var23 = var12 - arg7.field62;
                                var24 = var13 - arg7.field55;
                                if (arg10 == -4) {
                                    if (arg4 == var12 && arg1 == var13) {
                                        class396.field5784 = var13;
                                        class318.field4372 = var12;
                                        return true;
                                    }
                                } else if (arg10 == -3) {
                                    if (class414.method2652(arg6, -67, var12, arg1, arg5, arg3, arg4, var13, arg5)) {
                                        class396.field5784 = var13;
                                        class318.field4372 = var12;
                                        return true;
                                    }
                                } else if (arg10 == -2) {
                                    if (arg7.method26(var12, arg4, arg5, arg3, var13, arg5, arg11, arg6, arg1, true)) {
                                        class318.field4372 = var12;
                                        class396.field5784 = var13;
                                        return true;
                                    }
                                } else if (arg10 == -1) {
                                    if (arg7.method25(var12, arg3, var13, 91, arg6, arg11, arg5, arg4, arg1)) {
                                        class318.field4372 = var12;
                                        class396.field5784 = var13;
                                        return true;
                                    }
                                } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                                    if (arg7.method37(var13, arg10, arg1, var12, arg2, true, arg5, arg4)) {
                                        class318.field4372 = var12;
                                        class396.field5784 = var13;
                                        return true;
                                    }
                                } else if (arg7.method34(arg5, var13, arg10, arg4, arg1, arg2, 92, var12)) {
                                    class318.field4372 = var12;
                                    class396.field5784 = var13;
                                    return true;
                                }
                                var26 = class137.field1949[var21][var22] + 1;
                                if (var21 > 0 && class395.field5777[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg5 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg5 - 1) <= var27) {
                                            class170.field2425[var35] = var12 - 1;
                                            class189.field2626[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class395.field5777[var21 - 1][var22] = 2;
                                            class137.field1949[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg5) > var21 && class395.field5777[var21 + 1][var22] == 0 && (var20[arg5 + var23][var24] & 0x60E40000) == 0 && (var20[arg5 + var23][arg5 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg5 - 1 <= var28) {
                                            class170.field2425[var35] = var12 + 1;
                                            class189.field2626[var35] = var13;
                                            class395.field5777[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class137.field1949[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg5 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class395.field5777[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg5 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg5 - 1 <= var29) {
                                            class170.field2425[var35] = var12;
                                            class189.field2626[var35] = var13 - 1;
                                            class395.field5777[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class137.field1949[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < (128 - arg5) && class395.field5777[var21][var22 + 1] == 0 && (var20[var23][arg5 + var24] & 0x4E240000) == 0 && (var20[arg5 + var23 - 1][arg5 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg5 - 1) {
                                            class170.field2425[var35] = var12;
                                            class189.field2626[var35] = var13 + 1;
                                            class395.field5777[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class137.field1949[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg5 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class395.field5777[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg5) {
                                            class170.field2425[var35] = var12 - 1;
                                            class189.field2626[var35] = var13 - 1;
                                            class395.field5777[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class137.field1949[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg5) > var21 && var22 > 0 && class395.field5777[var21 + 1][var22 - 1] == 0 && (var20[arg5 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg5) {
                                            class170.field2425[var35] = var12 + 1;
                                            class189.field2626[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class395.field5777[var21 + 1][var22 - 1] = 9;
                                            class137.field1949[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg5 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && (128 - arg5) > var22 && class395.field5777[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg5 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg5; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg5 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class170.field2425[var35] = var12 - 1;
                                    class189.field2626[var35] = var13 + 1;
                                    class395.field5777[var21 - 1][var22 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class137.field1949[var21 - 1][var22 + 1] = var26;
                                }
                            } while ((128 - arg5) <= var21);
                        } while ((128 - arg5) <= var22);
                    } while (class395.field5777[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg5 + var23][var24 + arg5] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg5; var34++) {
                    if ((var20[var23 + var34][arg5 + var24] & 0x7E240000) != 0 || (var20[arg5 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class170.field2425[var35] = var12 + 1;
                class189.field2626[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class395.field5777[var21 + 1][var22 + 1] = 12;
                class137.field1949[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3517++;
        this.method1593(3);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)I")
    public static final int method1582(int arg0, int arg1) {
        return class270.field3683 == null ? 0 : class270.field3683[arg0][arg1] >>> 21 & 0x7F8;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
    public static void method1583(int arg0) {
        field3539 = null;
        if (arg0 != 8126) {
            method1586(60);
        }
        field3532 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I[BII)V")
    public final void method1584(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3523++;
        if (this.field3543) {
            return;
        }
        if (arg2 < 79) {
            this.method1593(-2);
        }
        while (arg0 > 0) {
            int var5 = this.field3514.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
    public static final void method1585(int arg0) {
        field3530++;
        if (class6.field91 == -1 || class299.field4142 == -1) {
            return;
        }
        int var1 = ((class312.field4310 - class126.field1773) * class319.field4384 >> 16) + class126.field1773;
        class319.field4384 += var1;
        if (class319.field4384 >= 65535) {
            class319.field4384 = 65535;
            if (class432.field6221) {
                class8.field120 = false;
            } else {
                class8.field120 = true;
            }
            class432.field6221 = true;
        } else {
            class8.field120 = false;
            class432.field6221 = false;
        }
        float var2 = (float) class319.field4384 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class89.field1351 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class86.field1325[class6.field91][var4][var5] * 3;
            int var22 = class86.field1325[class6.field91][var4 + 1][var5] * 3;
            int var23 = (class86.field1325[class6.field91][var4 + 2][var5] + class86.field1325[class6.field91][var4 + 2][var5] - class86.field1325[class6.field91][var4 + 3][var5]) * 3;
            int var24 = class86.field1325[class6.field91][var4][var5];
            int var25 = var22 - var21;
            int var26 = var23 + var21 - (var22 * 2);
            int var27 = class86.field1325[class6.field91][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class336.field4561 = (int) var3[2] - (class354.field4981 * 128);
        class34.field528 = (int) var3[1] * arg0;
        class368.field5158 = (int) var3[0] - (class449.field6509 * 128);
        float[] var6 = new float[3];
        int var7 = client.field2341 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class86.field1325[class299.field4142][var7][var8] * 3;
            int var15 = class86.field1325[class299.field4142][var7 + 1][var8] * 3;
            int var16 = (class86.field1325[class299.field4142][var7 + 2][var8] + class86.field1325[class299.field4142][var7 - -2][var8] - class86.field1325[class299.field4142][var7 + 3][var8]) * 3;
            int var17 = class86.field1325[class299.field4142][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class86.field1325[class299.field4142][var7 + 2][var8] - (var17 - var15) - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class356.field5020 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class244.field3377 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class189.field2623 = ((class86.field1325[class6.field91][var4 + 2][3] - class86.field1325[class6.field91][var4][3]) * class319.field4384 >> 16) + class86.field1325[class6.field91][var4][3];
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
    public static final void method1586(int arg0) {
        field3540++;
        if (class383.method2501(1448) != 2) {
            return;
        }
        byte var1 = (byte) (class64.field991 - 4 & 0xFF);
        int var2 = class64.field991 % class432.field6220;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class267.field3646; var16++) {
                class8.field123[var3][var2][var16] = var1;
            }
        }
        if (arg0 != -3058) {
            field3539 = null;
        }
        if (class265.field3617 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class434.field6233[var4] = -1000000;
            class431.field6199[var4] = 1000000;
            class326.field4457[var4] = 0;
            class163.field2281[var4] = 1000000;
            class333.field4506[var4] = 0;
        }
        if (class123.field1731 != 1) {
            int var5 = class279.method1698(class368.field5158, class336.field4561, class265.field3617, (byte) 3);
            if (var5 - class34.field528 < 800 && (class221.field2910[class265.field3617][class368.field5158 >> 7][class336.field4561 >> 7] & 0x4) != 0) {
                class247.method1542(class336.field4561 >> 7, false, 1, class368.field5158 >> 7, class5.field79, 1);
                return;
            }
            return;
        }
        if ((class221.field2910[class265.field3617][class307.field4211.field6197 >> 7][class307.field4211.field6192 >> 7] & 0x4) != 0) {
            class247.method1542(class307.field4211.field6192 >> 7, false, 0, class307.field4211.field6197 >> 7, class5.field79, 1);
        }
        if (class356.field5020 >= 2560) {
            return;
        }
        int var6 = class368.field5158 >> 7;
        int var7 = class336.field4561 >> 7;
        int var8 = class307.field4211.field6197 >> 7;
        int var9 = class307.field4211.field6192 >> 7;
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var9 <= var7) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        if (var10 == 0 && var11 == 0 || var10 <= -class432.field6220 || var10 >= class432.field6220 || (-class267.field3646) >= var11 || class267.field3646 <= var11) {
            class184.method1214(-120, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class449.field6509 + "," + class354.field4981, (Throwable) null);
            return;
        }
        if (var10 <= var11) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class221.field2910[class265.field3617][var6][var7] & 0x4) != 0) {
                    class247.method1542(var7, false, 1, var6, class5.field79, arg0 ^ 0xFFFFF40F);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class221.field2910[class265.field3617][var6][var7] & 0x4) != 0) {
                        class247.method1542(var7, false, 1, var6, class5.field79, arg0 ^ 0xFFFFF40F);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var10;
        int var15 = 32768;
        while (var6 != var8) {
            if (var6 < var8) {
                var6++;
            } else if (var6 > var8) {
                var6--;
            }
            if ((class221.field2910[class265.field3617][var6][var7] & 0x4) != 0) {
                class247.method1542(var7, false, 1, var6, class5.field79, arg0 ^ 0xFFFFF40F);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var7 < var9) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class221.field2910[class265.field3617][var6][var7] & 0x4) != 0) {
                    class247.method1542(var7, false, 1, var6, class5.field79, 1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)V")
    public static final void method1587(int arg0, int arg1) {
        field3529++;
        class247.field3431 = 3;
        class84.field1293 = arg0;
        class270.field3687 = arg1;
        class79.field1230 = -1;
    }

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)V")
    public final void method1588(int arg0) throws IOException {
        if (arg0 != 1) {
            return;
        }
        field3518++;
        if (!this.field3543 && this.field3519) {
            this.field3519 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(CI)Z")
    public static final boolean method1589(char arg0, int arg1) {
        field3528++;
        if (arg1 != -58) {
            method1587(21, 11);
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "(I)V")
    public final void method1590(int arg0) {
        field3515++;
        if (this.field3543) {
            return;
        }
        this.field3514 = new class209();
        this.field3524 = new class234();
        if (arg0 >= -58) {
            method1581(103, 16, -114, -105, -37, -96, -84, (class4) null, (byte) 9, 52, -118, 63);
        }
    }

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)I")
    public final int method1591(int arg0) throws IOException {
        field3525++;
        if (this.field3543) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.finalize();
            }
            return this.field3514.read();
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIILaa;Lhc;IIIII)Lhc;")
    public static final class75 method1592(int arg0, int arg1, int arg2, int arg3, class281 arg4, class75 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg8 != -21687) {
            field3532 = null;
        }
        field3536++;
        long var11 = (long) arg2;
        class75 var13 = (class75) class20.field259.method1246((byte) -124, var11);
        short var14 = 1031;
        if (var13 == null) {
            class279 var15 = class33.method247(class387.field5645, arg2, 0, 104);
            if (var15 == null) {
                return null;
            }
            var13 = arg4.method1736(var15, var14, class229.field3057, 64, 768);
            class20.field259.method1247(var11, (byte) 43, var13);
        }
        class75 var16 = var13.method529((byte) 2, var14, true);
        if (arg3 != 0) {
            var16.method507(arg3);
        }
        if (arg1 != 0) {
            var16.method504(arg1);
        }
        if (arg10 != 0) {
            var16.method524(arg10);
        }
        if (arg7 != 0) {
            var16.method534(0, arg7, 0);
        }
        return var16;
    }

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "(I)V")
    public final void method1593(int arg0) {
        field3527++;
        if (this.field3543) {
            return;
        }
        synchronized (this) {
            this.field3543 = true;
            if (arg0 != 3) {
                return;
            }
            this.notifyAll();
        }
        if (this.field3531 != null) {
            while (this.field3531.field4068 == 0) {
                class4.method28(1L, arg0 ^ 0x46);
            }
            if (this.field3531.field4068 == 1) {
                try {
                    ((Thread) this.field3531.field4070).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field3531 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)Z")
    public static final boolean method1594(byte arg0) {
        field3516++;
        class225 var1 = class237.field3228;
        synchronized (class237.field3228) {
            if (class73.field1142 == class55.field803) {
                return false;
            }
            int var3 = -31 / ((arg0 + 6) / 47);
            class243.field3356 = class197.field2738[class73.field1142];
            class215.field2859 = class6.field95[class73.field1142];
            class73.field1142 = class73.field1142 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ljava/awt/Canvas;ILsr;I)Laa;")
    public static final class281 method1595(Canvas arg0, int arg1, class136 arg2, int arg3) {
        if (arg3 == 8) {
            field3541++;
            return new class283(arg0, arg2, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "run", descriptor = "()V")
    public final void run() {
        field3520++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field3544 == this.field3533) {
                        if (this.field3543) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field3544;
                    if (this.field3533 >= this.field3544) {
                        var3 = this.field3533 - this.field3544;
                    } else {
                        var3 = 5000 - this.field3544;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field3524.write(this.field3535, var2, var3);
                    } catch (IOException var9) {
                        this.field3519 = true;
                    }
                    this.field3544 = (this.field3544 + var3) % 5000;
                    try {
                        if (this.field3544 == this.field3533) {
                            this.field3524.flush();
                        }
                    } catch (IOException var8) {
                        this.field3519 = true;
                    }
                }
            }
            try {
                if (this.field3514 != null) {
                    this.field3514.close();
                }
                if (this.field3524 != null) {
                    this.field3524.close();
                }
                if (this.field3534 != null) {
                    this.field3534.close();
                }
            } catch (IOException var7) {
            }
            this.field3535 = null;
        } catch (Exception var12) {
            class184.method1214(107, (String) null, var12);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Laa;Z)V")
    public static final void method1596(class281 arg0, boolean arg1) {
        field3537++;
        int var2 = class377.field5380;
        int var3 = class156.field2206;
        int var4 = class340.field4753;
        int var5 = class396.field5781 - 3;
        byte var6 = 20;
        if (class167.field2394 == null || class412.field5986 == null) {
            if (class353.field4943.method1898(class79.field1222, 124) && class353.field4943.method1898(class257.field3503, 123)) {
                class167.field2394 = arg0.method1807(class18.method119(class353.field4943, class79.field1222, 0), true);
                class18 var7 = class18.method119(class353.field4943, class257.field3503, 0);
                class412.field5986 = arg0.method1807(var7, true);
                var7.method115();
                class181.field2539 = arg0.method1807(var7, true);
            } else {
                arg0.method1785(var2, var3, var4, var6, class434.field6234 | 255 - class323.field4423 << 24, 1);
            }
        }
        if (class167.field2394 != null && class412.field5986 != null) {
            int var8 = (var4 - class412.field5986.method880() * 2) / class167.field2394.method880();
            for (int var9 = 0; var9 < var8; var9++) {
                class167.field2394.method867(class412.field5986.method880() + (var2 + (class167.field2394.method880() * var9)), var3);
            }
            class412.field5986.method867(var2, var3);
            class181.field2539.method867(var4 + var2 - class181.field2539.method880(), var3);
        }
        class220.field2899.method2278(class279.field3776 | 0xFF000000, var3 + 14, -1, class344.field4815, (byte) -125, var2 + 3);
        arg0.method1785(var2, var3 + var6, var4, var5 - var6, class434.field6234 | 255 - class323.field4423 << 24, 1);
        int var10 = class349.field4883;
        int var11 = class162.field2269;
        for (int var12 = 0; var12 < class390.field5740; var12++) {
            int var26 = (class390.field5740 - var12 - 1) * 16 + var3 + var6 + 13;
            if (var2 < var10 && var10 < var2 + var4 && var11 > (var26 - 13) && (var26 + 4) > var11) {
                arg0.method1785(var2, var26 - 12, var4, 16, 255 - class168.field2395 << 24 | class12.field155, 1);
            }
        }
        if ((class240.field3337 == null || class141.field2017 == null || class58.field826 == null) && class353.field4943.method1898(class217.field2875, 127) && class353.field4943.method1898(class448.field6460, 127) && class353.field4943.method1898(class410.field5955, 126)) {
            class18 var13 = class18.method119(class353.field4943, class448.field6460, 0);
            class141.field2017 = arg0.method1807(var13, true);
            var13.method115();
            class62.field973 = arg0.method1807(var13, true);
            class240.field3337 = arg0.method1807(class18.method119(class353.field4943, class217.field2875, 0), true);
            class18 var14 = class18.method119(class353.field4943, class410.field5955, 0);
            class58.field826 = arg0.method1807(var14, true);
            var14.method115();
            class374.field5345 = arg0.method1807(var14, true);
        }
        if (class240.field3337 != null && class141.field2017 != null && class58.field826 != null) {
            int var15 = (var4 - (class58.field826.method880() * 2)) / class240.field3337.method880();
            for (int var16 = 0; var16 < var15; var16++) {
                class240.field3337.method867(class58.field826.method880() + var2 + var16 * class240.field3337.method880(), -class240.field3337.method876() + var3 + var5);
            }
            int var17 = (var5 - class58.field826.method876() - var6) / class141.field2017.method876();
            for (int var18 = 0; var18 < var17; var18++) {
                class141.field2017.method867(var2, class141.field2017.method876() * var18 + var3 + var6);
                class62.field973.method867(var2 + var4 - class62.field973.method880(), var18 * class141.field2017.method876() + (var3 - -var6));
            }
            class58.field826.method867(var2, var3 + var5 - class58.field826.method876());
            class374.field5345.method867(var2 + var4 - class58.field826.method880(), -class58.field826.method876() + var5 + var3);
        }
        int var19 = 0;
        for (class207 var20 = (class207) class167.field2393.method1312((byte) 25); var20 != null; var20 = (class207) class167.field2393.method1304(-76)) {
            int var21 = var3 + var6 + ((class390.field5740 - (1 - -var19)) * 16) + 13;
            int var22 = class279.field3776 | 0xFF000000;
            if (var2 < var10 && var10 < (var2 + var4) && var21 - 13 < var11 && var11 < var21 + 4) {
                var22 = class189.field2627 | 0xFF000000;
            }
            int[] var23 = null;
            if (class162.method1071(var20.field2797, -38)) {
                var23 = class347.method2222((int) var20.field2807, 18682).field5728;
            } else if (class14.method77((byte) 111, var20.field2797)) {
                class437 var24 = class445.field6422[(int) var20.field2807];
                if (var24 != null) {
                    var23 = var24.field6290.field2974;
                }
            } else if (class326.method2052(false, var20.field2797)) {
                if (var20.field2797 == 1008) {
                    var23 = class310.method1961((int) var20.field2807, (byte) 35).field5181;
                } else {
                    var23 = class310.method1961((int) (var20.field2807 >>> 32 & 0x7FFFFFFFL), (byte) 35).field5181;
                }
            }
            String var25 = class115.method757(var20, -18357);
            if (var23 != null) {
                var25 = var25 + class153.method1035(false, var23);
            }
            var19++;
            class220.field2899.method2273(0, var2 + 3, var25, var22, 0, var21, class28.field444, class135.field1926);
        }
        if (arg1) {
            field3532 = null;
        }
        class303.method1941(class156.field2206, class396.field5781, class377.field5380, 1372, class340.field4753);
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Ljava/net/Socket;Lkq;)V")
    public class258(Socket arg0, class351 arg1) throws IOException {
        this.field3534 = arg0;
        this.field3526 = arg1;
        this.field3534.setSoTimeout(30000);
        this.field3534.setTcpNoDelay(true);
        this.field3514 = this.field3534.getInputStream();
        this.field3524 = this.field3534.getOutputStream();
    }
}
