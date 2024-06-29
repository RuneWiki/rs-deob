import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class581 {

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "I")
    private int field7766;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public int field7765;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "Ljw;")
    public static class581 field7769 = new class581(3, 1);

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "[Lhr;")
    public static class553[] field7771 = new class553[8];

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "[I")
    public static int[] field7772 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "Ljw;")
    public static class581 field7773 = new class581(9, 0);

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "[[B")
    public static byte[][] field7768;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)I", line = 3)
    public final int method3232(byte arg0) {
        if (arg0 >= -116) {
            this.field7766 = 25;
        }
        field7767++;
        return this.field7766;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IILka;ILvq;IILha;IIZIII)Lka;", line = 16)
    public static final class500 method3233(int arg0, int arg1, class500 arg2, int arg3, class489 arg4, int arg5, int arg6, class65 arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12, int arg13) {
        field7763++;
        if (arg2 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg4 != null) {
            int var15 = var14 | arg4.method2843(false, -1, 27123, arg6);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg5 << 48) + (long) ((arg12 << 24) + (arg13 + (arg8 << 16))) + ((long) arg11 << 32);
        class239 var18 = class593.field8007;
        class500 var20;
        synchronized (class593.field8007) {
            if (!arg10) {
                return null;
            }
            var20 = (class500) class593.field8007.method1541(-10, var16);
        }
        if (var20 == null || arg7.method517(var20.method325(), var14) != 0) {
            if (var20 != null) {
                var14 = arg7.method498(var14, var20.method325());
            }
            byte var21;
            if (arg13 == 1) {
                var21 = 9;
            } else if (arg13 == 2) {
                var21 = 12;
            } else if (arg13 == 3) {
                var21 = 15;
            } else if (arg13 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class782 var24 = new class782(var21 * var22 + 1, var21 * 2 * var22 - var21, 0);
            int var25 = var24.method4334(0, 0, 0, (byte) 101);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class749.field10324[var31] * var28 >> 14;
                    int var33 = class749.field10316[var31] * var29 >> 14;
                    var26[var27][var30] = var24.method4334(0, var32, var33, (byte) 101);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg8 * var36 + arg12 * var35 >> 8);
                short var38 = (short) (((arg5 & 0x380) * var35 + (arg11 & 0x380) * var36 & 0x38000) + ((arg5 & 0x7F) * var35 + (arg11 & 0x7F) * var36 & 0x7F00) + ((arg5 & 0xFC00) * var35 + (arg11 & 0xFC00) * var36 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method4329(0, (byte) -1, var26[0][(var39 + 1) % var21], var38, var26[0][var39], var37, (short) -1, var25, (byte) 1);
                    } else {
                        var24.method4329(0, (byte) -1, var26[var34 - 1][(var39 + 1) % var21], var38, var26[var34][(var39 + 1) % var21], var37, (short) -1, var26[var34 - 1][var39], (byte) 1);
                        var24.method4329(0, (byte) -1, var26[var34][(var39 + 1) % var21], var38, var26[var34][var39], var37, (short) -1, var26[var34 - 1][var39], (byte) 1);
                    }
                }
            }
            var20 = arg7.method510(var24, var14, class86.field1193, 64, 768);
            class239 var40 = class593.field8007;
            synchronized (class593.field8007) {
                class593.field8007.method1544(true, var20, var16);
            }
        }
        int var41 = arg2.method327();
        int var42 = arg2.method316();
        int var43 = arg2.method294();
        int var44 = arg2.method330();
        class717 var45 = null;
        if (arg4 != null) {
            int var46 = arg4.field6775[arg6];
            var45 = class6.field65.method1030(-4849, var46 >> 16);
            arg6 = var46 & 0xFFFF;
        }
        class500 var47;
        if (var45 == null) {
            var47 = var20.method298((byte) 3, var14, true);
            var47.method318(var42 - var41 >> 1, 128, var44 - var43 >> 1);
            var47.method313(var41 + var42 >> 1, 0, var43 + var44 >> 1);
        } else {
            var47 = var20.method298((byte) 3, var14, true);
            var47.method318(var42 - var41 >> 1, 128, var44 - var43 >> 1);
            var47.method313(var41 + var42 >> 1, 0, var43 + var44 >> 1);
            var47.method2883(arg6, var45, 0);
        }
        if (arg1 != 0) {
            var47.method331(arg1);
        }
        if (arg9 != 0) {
            var47.method336(arg9);
        }
        if (arg3 != 0) {
            var47.method313(0, arg3, 0);
        }
        return var47;
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V", line = 191)
    public static void method3234(byte arg0) {
        field7773 = null;
        field7769 = null;
        field7771 = null;
        field7768 = null;
        field7772 = null;
        if (arg0 <= 35) {
            field7768 = null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "toString", descriptor = "()Ljava/lang/String;", line = 207)
    public final String toString() {
        field7764++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(II)V", line = 222)
    public class581(int arg0, int arg1) {
        this.field7766 = arg0;
        this.field7765 = arg1;
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(B)I", line = 231)
    public static final int method3235(byte arg0) {
        field7770++;
        if (class437.field6161 == null) {
            if (!class526.field7216 && class788.field10852 != null) {
                return class788.field10852.field4083;
            }
            int var1 = class304.field4371.method778(0);
            int var2 = class304.field4371.method777((byte) -16);
            if (class668.field9373) {
                if (class245.field3317 < var1 && var1 < class442.field6220 + class245.field3317) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class491.field6811; var4++) {
                        if (class38.field591) {
                            int var8 = var4 * 16 + class356.field5213 + 33;
                            if (var2 > var8 - 13 && var8 + 3 >= var2) {
                                var3 = var4;
                            }
                        } else {
                            int var9 = var4 * 16 + class356.field5213 + 31;
                            if (var2 > (var9 - 13) && var2 <= (var9 + 3)) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var5 = 0;
                        class533 var6 = new class533(class57.field805);
                        for (class81 var7 = (class81) var6.method3051((byte) 126); var7 != null; var7 = (class81) var6.method3053(7782)) {
                            if (var3 == (var5++)) {
                                return ((class275) var7.field1155.field1176.field4146).field4083;
                            }
                        }
                    }
                } else if (class314.field4522 != null && class271.field4010 < var1 && (class271.field4010 + class152.field2100) > var1) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class314.field4522.field1151; var11++) {
                        if (class38.field591) {
                            int var15 = class270.field3986 + (var11 * 16) + 33;
                            if (var2 > (var15 - 13) && var2 <= var15 + 3) {
                                var10 = var11;
                            }
                        } else {
                            int var16 = var11 * 16 + class270.field3986 + 31;
                            if (var16 - 13 < var2 && (var16 + 3) >= var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class533 var13 = new class533(class314.field4522.field1155);
                        for (class275 var14 = (class275) var13.method3051((byte) 80); var14 != null; var14 = (class275) var13.method3053(7782)) {
                            if (var10 == (var12++)) {
                                return var14.field4083;
                            }
                        }
                    }
                }
            } else if (var1 > class245.field3317 && (class442.field6220 + class245.field3317) > var1) {
                int var17 = -1;
                for (int var18 = 0; var18 < class746.field10297; var18++) {
                    if (class38.field591) {
                        int var22 = class356.field5213 + ((-var18 + -1 + class746.field10297) * 16) + 33;
                        if ((var22 - 13) < var2 && var22 + 3 >= var2) {
                            var17 = var18;
                        }
                    } else {
                        int var23 = (class746.field10297 - var18 - 1) * 16 + class356.field5213 + 31;
                        if (var23 - 13 < var2 && (var23 + 3) >= var2) {
                            var17 = var18;
                        }
                    }
                }
                if (var17 != -1) {
                    int var19 = 0;
                    class359 var20 = new class359(class280.field4138);
                    for (class275 var21 = (class275) var20.method2253(3530); var21 != null; var21 = (class275) var20.method2255((byte) 17)) {
                        if (var17 == (var19++)) {
                            return var21.field4083;
                        }
                    }
                }
            }
        }
        if (arg0 != 1) {
            method3233(113, 80, null, 101, null, -39, -111, null, 123, 103, true, 52, -121, -88);
        }
        return -1;
    }
}
