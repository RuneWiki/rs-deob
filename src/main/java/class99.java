import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class99 extends class297 {

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    private int field1573 = 409;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    private int field1569 = 1024;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    private int field1574 = 0;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    private int field1577 = 1024;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    private int field1582 = 1024;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    private int field1579 = 819;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "I")
    private int field1588 = 1024;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    private int field1571 = 0;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "I")
    private int field1589 = 2048;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    public static int field1580 = 0;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "[I")
    public static int[] field1581 = new int[14];

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "Lvj;")
    public static class115 field1590 = null;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "Ljava/util/Random;")
    public static Random field1587 = new Random();

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)I", line = 5)
    public static final int method798(byte arg0) {
        field1585++;
        try {
            if (class152.field2495 == 0) {
                if ((class212.method1543(22326) - 5000L) < class209.field3302) {
                    return 0;
                }
                class334.field5192 = class92.field1484.method549(class322.field5050, class264.field3913, (byte) 79);
                class328.field5127 = class212.method1543(22326);
                class152.field2495 = 1;
            }
            if (arg0 >= -44) {
                method801(false, (String) null);
            }
            if (class212.method1543(22326) > class328.field5127 + 30000L) {
                return class325.method2287(1000, 0);
            }
            if (class152.field2495 == 1) {
                if (class334.field5192.field405 == 2) {
                    return class325.method2287(1001, 0);
                }
                if (class334.field5192.field405 != 1) {
                    return -1;
                }
                class319.field5005 = new class41((Socket) class334.field5192.field409, class92.field1484);
                class209.field3305.field48 = 0;
                class334.field5192 = null;
                int var1 = 0;
                if (class53.field812) {
                    var1 = class84.field1336;
                }
                class209.field3305.method21(70, 23);
                class209.field3305.method11(var1, 31932);
                class319.field5005.method373(1, 0, class209.field3305.field34, class209.field3305.field48);
                if (class55.field837 != null) {
                    class55.field837.method2326((byte) 80);
                }
                if (class255.field3765 != null) {
                    class255.field3765.method2326((byte) 85);
                }
                int var2 = class319.field5005.method372(0);
                if (class55.field837 != null) {
                    class55.field837.method2326((byte) 120);
                }
                if (class255.field3765 != null) {
                    class255.field3765.method2326((byte) 122);
                }
                if (var2 != 0) {
                    return class325.method2287(var2, 0);
                }
                class152.field2495 = 2;
            }
            if (class152.field2495 == 2) {
                if (class319.field5005.method370((byte) 124) < 2) {
                    return -1;
                }
                class37.field555 = class319.field5005.method372(0);
                class37.field555 <<= 0x8;
                class37.field555 += class319.field5005.method372(0);
                class31.field490 = 0;
                class81.field1263 = new byte[class37.field555];
                class152.field2495 = 3;
            }
            if (class152.field2495 != 3) {
                return -1;
            }
            int var3 = class319.field5005.method370((byte) 126);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class37.field555 - class31.field490) {
                var3 = class37.field555 - class31.field490;
            }
            class319.field5005.method377(10647, class31.field490, var3, class81.field1263);
            class31.field490 += var3;
            if (class37.field555 > class31.field490) {
                return -1;
            } else if (class322.method2271(-121, class81.field1263)) {
                class175.field2802 = new class44[class233.field3547];
                int var4 = 0;
                for (int var5 = class151.field2470; var5 <= class135.field2140; var5++) {
                    class44 var6 = class334.method2337(false, var5);
                    if (var6 != null) {
                        class175.field2802[var4++] = var6;
                    }
                }
                class319.field5005.method371(-2);
                class89.field1431 = 0;
                class319.field5005 = null;
                class81.field1263 = null;
                class152.field2495 = 0;
                class209.field3302 = class212.method1543(22326);
                return 0;
            } else {
                return class325.method2287(1002, 0);
            }
        } catch (IOException var8) {
            return class325.method2287(1003, 0);
        }
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V", line = 147)
    public static final void method799(int arg0) {
        field1578++;
        if (arg0 <= 100) {
            return;
        }
        int var1 = class85.method678(121);
        if (var1 == 0) {
            class242.field3621 = (byte[][][]) null;
            class220.method1604(0, (byte) 117);
        } else if (var1 == 1) {
            class100.method808((byte) -116, (byte) 0);
            class220.method1604(512, (byte) 114);
            if (class332.field5184 != null) {
                class6.method99((byte) 99);
            }
        } else {
            class100.method808((byte) -116, (byte) (class208.field3284 - 4 & 0xFF));
            class220.method1604(2, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V", line = 181)
    public static final void method800(int arg0) {
        if (arg0 == 27451) {
            field1570++;
            if (class107.field1758 == 5) {
                class107.field1758 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)[I", line = 197)
    public final int[] method173(int arg0, boolean arg1) {
        field1567++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (!arg1) {
            this.method173(-110, true);
        }
        if (!this.field4760.field388) {
            return var3;
        }
        int[][] var4 = this.field4760.method212((byte) 90);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        boolean var11 = true;
        int var12 = 0;
        int var13 = class31.field491 * this.field1582 >> 12;
        int var14 = class31.field491 * this.field1589 >> 12;
        int var15 = 0;
        int var16 = class164.field2670 * this.field1573 >> 12;
        int var17 = class164.field2670 * this.field1579 >> 12;
        if (var17 <= 1) {
            return var4[arg0];
        }
        this.field1568 = class31.field491 / 8 * this.field1569 >> 12;
        int var18 = (class31.field491 / var13) + 1;
        int[][] var19 = new int[var18][3];
        Random var20 = new Random((long) this.field1574);
        int[][] var21 = new int[var18][3];
        while (true) {
            while (true) {
                int var22 = class64.method509(var14 - var13, var20, 54) + var13;
                int var23 = class64.method509(var17 - var16, var20, 64) + var16;
                int var24 = var8 + var22;
                if (var24 > class31.field491) {
                    var22 = class31.field491 - var8;
                    var24 = class31.field491;
                }
                int var10000;
                int var27;
                if (var10) {
                    var27 = 0;
                } else {
                    int var25 = var9;
                    int[] var26 = var21[var9];
                    var27 = var26[2];
                    int var28 = var5 + var24;
                    int var29 = 0;
                    if (var28 < 0) {
                        var28 += class31.field491;
                    }
                    if (var28 > class31.field491) {
                        var28 -= class31.field491;
                    }
                    while (true) {
                        int[] var30 = var21[var25];
                        if (var30[0] <= var28 && var30[1] >= var28) {
                            if (var9 != var25) {
                                int var31 = var5 + var8;
                                if (var31 < 0) {
                                    var31 += class31.field491;
                                }
                                if (var31 > class31.field491) {
                                    var31 -= class31.field491;
                                }
                                for (int var32 = 1; var32 <= var29; var32++) {
                                    int[] var33 = var21[(var9 + var32) % var15];
                                    var27 = Math.max(var27, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var29; var34++) {
                                    int[] var35 = var21[(var9 + var34) % var15];
                                    int var36 = var35[2];
                                    if (var27 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var31 < var28) {
                                            var39 = Math.max(var31, var37);
                                            var40 = Math.min(var28, var38);
                                        } else if (var37 == 0) {
                                            var39 = 0;
                                            var40 = Math.min(var28, var38);
                                        } else {
                                            var39 = Math.max(var31, var37);
                                            var40 = class31.field491;
                                        }
                                        this.method804(var7 + var39, var36, -30426, var20, var4, var27 - var36, -var39 + var40);
                                    }
                                }
                            }
                            var9 = var25;
                            break;
                        }
                        var29++;
                        var10000 = ~var15;
                        var25++;
                        if (var10000 >= ~var25) {
                            var25 = 0;
                        }
                    }
                }
                if ((var23 + var27) > class164.field2670) {
                    var23 = class164.field2670 - var27;
                } else {
                    var11 = false;
                }
                if (class31.field491 == var24) {
                    this.method804(var8 + var6, var27, -30426, var20, var4, var23, var22);
                    if (var11) {
                        return var3;
                    }
                    var10 = false;
                    var9 = 0;
                    var7 = var6;
                    var11 = true;
                    int[] var41 = var19[var12++];
                    var41[0] = var8;
                    int[][] var42 = var21;
                    var41[1] = var24;
                    var15 = var12;
                    var12 = 0;
                    var41[2] = var23 + var27;
                    var6 = class64.method509(class31.field491, var20, 97);
                    var21 = var19;
                    var8 = 0;
                    var19 = var42;
                    var5 = var6 - var7;
                    int var43 = var5;
                    if (var5 < 0) {
                        var43 = class31.field491 + var5;
                    }
                    if (class31.field491 < var43) {
                        var43 -= class31.field491;
                    }
                    while (true) {
                        int[] var44 = var21[var9];
                        if (var44[0] <= var43 && var43 <= var44[1]) {
                            break;
                        }
                        var10000 = ~var15;
                        var9++;
                        if (var10000 >= ~var9) {
                            var9 = 0;
                        }
                    }
                } else {
                    int[] var45 = var19[var12++];
                    var45[0] = var8;
                    var45[1] = var24;
                    var45[2] = var23 + var27;
                    this.method804(var8 + var6, var27, -30426, var20, var4, var23, var22);
                    var8 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V", line = 445)
    public final void method247(byte arg0) {
        if (arg0 != 68) {
            this.method247((byte) 63);
        }
        field1566++;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 635)
    public class99() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLjava/lang/String;)J", line = 475)
    public static final long method801(boolean arg0, String arg1) {
        field1583++;
        long var2 = 0L;
        if (!arg0) {
            method799(-108);
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 = (var2 << 5) - (var2 - ((long) arg1.charAt(var5)));
        }
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(Z)V", line = 497)
    public static void method802(boolean arg0) {
        field1581 = null;
        field1587 = null;
        if (arg0) {
            field1580 = 81;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)I", line = 508)
    public static final int method803(int arg0, int arg1, int arg2, int arg3) {
        field1576++;
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        return arg2 == 217 ? (arg1 >> 2 << 10) + (arg0 >> 5 << 7) + (arg3 >> 1) : -128;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILaj;)V", line = 561)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg0 == 0) {
            this.field1574 = arg2.method15((byte) 117);
        } else if (arg0 == 1) {
            this.field1582 = arg2.method56(arg1 + 19357);
        } else if (arg0 == 2) {
            this.field1589 = arg2.method56(19612);
        } else if (arg0 == 3) {
            this.field1573 = arg2.method56(19612);
        } else if (arg0 == 4) {
            this.field1579 = arg2.method56(19612);
        } else if (arg0 == 5) {
            this.field1569 = arg2.method56(19612);
        } else if (arg0 == 6) {
            this.field1571 = arg2.method15((byte) 61);
        } else if (arg0 == 7) {
            this.field1577 = arg2.method56(19612);
        } else if (arg0 == 8) {
            this.field1588 = arg2.method56(19612);
        }
        if (arg1 != 255) {
            method803(30, -1, -71, -102);
        }
        field1586++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIILjava/util/Random;[[III)V", line = 643)
    private final void method804(int arg0, int arg1, int arg2, Random arg3, int[][] arg4, int arg5, int arg6) {
        int var8 = this.field1588 > 0 ? 4096 - class64.method509(this.field1588, arg3, 91) : 4096;
        if (arg2 != -30426) {
            return;
        }
        field1584++;
        int var9 = this.field1577 * this.field1568 >> 12;
        int var10 = this.field1568 - (var9 > 0 ? class64.method509(var9, arg3, 75) : 0);
        if (class31.field491 <= arg0) {
            arg0 -= class31.field491;
        }
        if (var10 > 0) {
            if (arg5 <= 0 || arg6 <= 0) {
                return;
            }
            int var15 = arg6 / 2;
            int var16 = arg5 / 2;
            int var17 = var15 >= var10 ? var10 : var15;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg0 + var17;
            int var20 = arg6 - (var17 * 2);
            for (int var21 = 0; var21 < arg5; var21++) {
                int[] var22 = arg4[var21 + arg1];
                if (var21 >= var18) {
                    int var23 = arg5 - var21 - 1;
                    if (var18 > var23) {
                        int var24 = var8 * var23 / var18;
                        if (this.field1571 == 0) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                int var28 = var8 * var27 / var17;
                                var22[class164.method1234(arg0 + var27, class257.field3813)] = var22[class164.method1234(class257.field3813, arg0 + arg6 - var27 - 1)] = var24 * var28 >> 12;
                            }
                        } else {
                            for (int var25 = 0; var25 < var17; var25++) {
                                int var26 = var8 * var25 / var17;
                                var22[class164.method1234(arg0 + var25, class257.field3813)] = var22[class164.method1234(class257.field3813, arg6 + arg0 - var25 - 1)] = var24 <= var26 ? var24 : var26;
                            }
                        }
                        if (var19 + var20 > class31.field491) {
                            int var29 = class31.field491 - var19;
                            class330.method2313(var22, var19, var29, var24);
                            class330.method2313(var22, 0, var20 - var29, var24);
                        } else {
                            class330.method2313(var22, var19, var20, var24);
                        }
                    } else {
                        for (int var30 = 0; var30 < var17; var30++) {
                            var22[class164.method1234(arg0 + var30, class257.field3813)] = var22[class164.method1234(class257.field3813, arg6 + arg0 - var30 - 1)] = var8 * var30 / var17;
                        }
                        if (var19 + var20 > class31.field491) {
                            int var31 = class31.field491 - var19;
                            class330.method2313(var22, var19, var31, var8);
                            class330.method2313(var22, 0, var20 - var31, var8);
                        } else {
                            class330.method2313(var22, var19, var20, var8);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var18;
                    if (this.field1571 == 0) {
                        for (int var33 = 0; var33 < var17; var33++) {
                            int var34 = var8 * var33 / var17;
                            var22[class164.method1234(arg0 + var33, class257.field3813)] = var22[class164.method1234(arg0 + arg6 - (var33 - -1), class257.field3813)] = var32 * var34 >> 12;
                        }
                    } else {
                        for (int var35 = 0; var35 < var17; var35++) {
                            int var36 = var8 * var35 / var17;
                            var22[class164.method1234(class257.field3813, arg0 + var35)] = var22[class164.method1234(class257.field3813, arg0 + arg6 - var35 - 1)] = var32 > var36 ? var36 : var32;
                        }
                    }
                    if (var19 + var20 > class31.field491) {
                        int var37 = class31.field491 - var19;
                        class330.method2313(var22, var19, var37, var32);
                        class330.method2313(var22, 0, var20 - var37, var32);
                    } else {
                        class330.method2313(var22, var19, var20, var32);
                    }
                }
            }
        } else if ((arg0 + arg6) <= class31.field491) {
            for (int var11 = 0; var11 < arg5; var11++) {
                class330.method2313(arg4[arg1 + var11], arg0, arg6, var8);
            }
        } else {
            int var12 = class31.field491 - arg0;
            for (int var13 = 0; var13 < arg5; var13++) {
                int[] var14 = arg4[arg1 + var13];
                class330.method2313(var14, arg0, var12, var8);
                class330.method2313(var14, 0, arg6 - var12, var8);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIB)V", line = 867)
    public static final void method805(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg4 >= 0 && arg0 >= 0 && arg4 < 103 && arg0 < 103) {
            if (arg6 == 0) {
                class105 var8 = class155.method1157(arg3, arg4, arg0);
                if (var8 != null) {
                    int var9 = (int) (var8.field1721 >>> 32) & Integer.MAX_VALUE;
                    if (arg1 == 2) {
                        var8.field1723 = new class155(var9, 2, arg2 + 4, arg3, arg4, arg0, arg5, false, var8.field1723);
                        var8.field1724 = new class155(var9, 2, arg2 + 1 & 0x3, arg3, arg4, arg0, arg5, false, var8.field1724);
                    } else {
                        var8.field1723 = new class155(var9, arg1, arg2, arg3, arg4, arg0, arg5, false, var8.field1723);
                    }
                }
            }
            if (arg6 == 1) {
                class293 var10 = class1.method38(arg3, arg4, arg0);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field4596 >>> 32);
                    if (arg1 == 4 || arg1 == 5) {
                        var10.field4593 = new class155(var11, 4, arg2, arg3, arg4, arg0, arg5, false, var10.field4593);
                    } else if (arg1 == 6) {
                        var10.field4593 = new class155(var11, 4, arg2 + 4, arg3, arg4, arg0, arg5, false, var10.field4593);
                    } else if (arg1 == 7) {
                        var10.field4593 = new class155(var11, 4, (arg2 + 2 & 0x3) + 4, arg3, arg4, arg0, arg5, false, var10.field4593);
                    } else if (arg1 == 8) {
                        var10.field4593 = new class155(var11, 4, arg2 + 4, arg3, arg4, arg0, arg5, false, var10.field4593);
                        var10.field4595 = new class155(var11, 4, (arg2 + 2 & 0x3) + 4, arg3, arg4, arg0, arg5, false, var10.field4595);
                    }
                }
            }
            if (arg6 == 2) {
                if (arg1 == 11) {
                    arg1 = 10;
                }
                class144 var12 = class36.method321(arg3, arg4, arg0);
                if (var12 != null) {
                    var12.field2346 = new class155(Integer.MAX_VALUE & (int) (var12.field2344 >>> 32), arg1, arg2, arg3, arg4, arg0, arg5, false, var12.field2346);
                }
            }
            if (arg6 == 3) {
                class241 var13 = class241.method1705(arg3, arg4, arg0);
                if (var13 != null) {
                    var13.field3609 = new class155(Integer.MAX_VALUE & (int) (var13.field3605 >>> 32), 22, arg2, arg3, arg4, arg0, arg5, false, var13.field3609);
                }
            }
        }
        field1572++;
        int var14 = -34 % ((arg7 + 68) / 47);
    }
}
