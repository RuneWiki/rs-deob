import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class142 {

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "[I")
    public static int[] field2111 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Lpn;")
    public static class49 field2107 = new class49(63, 15);

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "Ljp;")
    public static class55 field2113 = new class55(79, -1);

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field2114 = 1406;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1020(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -3024) {
            method1022(69, 92, (byte) -113);
        }
        class114.method871(arg6, false);
        field2106++;
        int var7 = 0;
        int var8 = arg6 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg2 >= class487.field7124 && arg2 <= class232.field3493) {
            int[] var15 = class402.field5946[arg2];
            int var16 = class306.method2023(5, class232.field3492, arg3 - arg6, class36.field453);
            int var17 = class306.method2023(5, class232.field3492, arg3 + arg6, class36.field453);
            int var18 = class306.method2023(arg5 ^ 0xFFFFF435, class232.field3492, arg3 - var8, class36.field453);
            int var19 = class306.method2023(5, class232.field3492, arg3 + var8, class36.field453);
            class262.method1831(var18, var15, (byte) 43, arg1, var16);
            class262.method1831(var19, var15, (byte) 43, arg4, var18);
            class262.method1831(var17, var15, (byte) 43, arg1, var19);
        }
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class261.field4171[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg2 - var9;
                int var21 = arg2 + var9;
                if (class487.field7124 <= var21 && class232.field3493 >= var20) {
                    if (var8 > var9) {
                        int var22 = class261.field4171[var9];
                        int var23 = class306.method2023(5, class232.field3492, arg3 + var7, class36.field453);
                        int var24 = class306.method2023(5, class232.field3492, arg3 - var7, class36.field453);
                        int var25 = class306.method2023(5, class232.field3492, arg3 + var22, class36.field453);
                        int var26 = class306.method2023(5, class232.field3492, arg3 - var22, class36.field453);
                        if (class232.field3493 >= var21) {
                            int[] var27 = class402.field5946[var21];
                            class262.method1831(var26, var27, (byte) 43, arg1, var24);
                            class262.method1831(var25, var27, (byte) 43, arg4, var26);
                            class262.method1831(var23, var27, (byte) 43, arg1, var25);
                        }
                        if (var20 >= class487.field7124) {
                            int[] var28 = class402.field5946[var20];
                            class262.method1831(var26, var28, (byte) 43, arg1, var24);
                            class262.method1831(var25, var28, (byte) 43, arg4, var26);
                            class262.method1831(var23, var28, (byte) 43, arg1, var25);
                        }
                    } else {
                        int var29 = class306.method2023(arg5 ^ 0xFFFFF435, class232.field3492, arg3 + var7, class36.field453);
                        int var30 = class306.method2023(5, class232.field3492, arg3 - var7, class36.field453);
                        if (var21 <= class232.field3493) {
                            class262.method1831(var29, class402.field5946[var21], (byte) 43, arg1, var30);
                        }
                        if (var20 >= class487.field7124) {
                            class262.method1831(var29, class402.field5946[var20], (byte) 43, arg1, var30);
                        }
                    }
                }
            }
            int var31 = arg2 - var7;
            int var32 = arg2 + var7;
            if (var32 >= class487.field7124 && var31 <= class232.field3493) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (class232.field3492 <= var33 && var34 <= class36.field453) {
                    int var35 = class306.method2023(arg5 ^ 0xFFFFF435, class232.field3492, var33, class36.field453);
                    int var36 = class306.method2023(5, class232.field3492, var34, class36.field453);
                    if (var7 >= var8) {
                        if (var32 <= class232.field3493) {
                            class262.method1831(var35, class402.field5946[var32], (byte) 43, arg1, var36);
                        }
                        if (class487.field7124 <= var31) {
                            class262.method1831(var35, class402.field5946[var31], (byte) 43, arg1, var36);
                        }
                    } else {
                        int var37 = var11 < var7 ? class261.field4171[var7] : var11;
                        int var38 = class306.method2023(5, class232.field3492, arg3 + var37, class36.field453);
                        int var39 = class306.method2023(5, class232.field3492, arg3 - var37, class36.field453);
                        if (var32 <= class232.field3493) {
                            int[] var40 = class402.field5946[var32];
                            class262.method1831(var39, var40, (byte) 43, arg1, var36);
                            class262.method1831(var38, var40, (byte) 43, arg4, var39);
                            class262.method1831(var35, var40, (byte) 43, arg1, var38);
                        }
                        if (class487.field7124 <= var31) {
                            int[] var41 = class402.field5946[var31];
                            class262.method1831(var39, var41, (byte) 43, arg1, var36);
                            class262.method1831(var38, var41, (byte) 43, arg4, var39);
                            class262.method1831(var35, var41, (byte) 43, arg1, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZLae;)Z")
    public static final boolean method1021(boolean arg0, class30 arg1) {
        if (arg0) {
            return false;
        }
        field2110++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field355) {
            return false;
        } else if (!arg1.method184(71, class362.field5328)) {
            return false;
        } else if (class183.field2805.method358((byte) 23, (long) arg1.field373) == null) {
            return class456.field6781.method358((byte) 23, (long) arg1.field368) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIB)I")
    public static final int method1022(int arg0, int arg1, byte arg2) {
        if (arg2 < 48) {
            return 48;
        } else {
            field2112++;
            return arg1 == 1 || arg1 == 3 ? class467.field6885[arg0 & 0x3] : class7.field86[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lne;I)Z")
    public static final boolean method1023(class139 arg0, int arg1) {
        field2109++;
        if (arg1 != -27304) {
            method1025(73);
        }
        return class354.field5244 == arg0 || class238.field3584 == arg0 || class463.field6858 == arg0 || class372.field5519 == arg0;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "([BI)Ljava/lang/String;")
    public static final String method1024(byte[] arg0, int arg1) {
        field2108++;
        if (arg1 != 5037) {
            return null;
        }
        int var2 = arg0.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            int var6 = arg0[var5] & 0xFF;
            if (var6 < 128) {
                var3[var4++] = (char) var6;
            } else if (var6 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
            } else if (var6 >= 224) {
                if (var6 < 240) {
                    if (var5 + 2 >= var2) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var5++;
                    int var7 = arg0[var5] & 0xFF;
                    if (var7 >= 128 && var7 <= 191) {
                        var5++;
                        int var8 = arg0[var5] & 0xFF;
                        if (var8 >= 128 && var8 <= 191) {
                            var3[var4++] = (char) class19.method118(class19.method118(class307.method2028(var6 << 12, -921600), class307.method2028(-8256, var7 << 6)), class307.method2028(-129, var8));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                if (var6 >= 244) {
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                }
                throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
            } else if (var2 > var5 + 1) {
                var5++;
                int var9 = arg0[var5] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var3[var4++] = (char) class19.method118(class307.method2028(var9, -129), class307.method2028(-193, var6) << 6);
            } else {
                throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
            }
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public static void method1025(int arg0) {
        field2107 = null;
        if (arg0 != -129) {
            field2114 = -5;
        }
        field2113 = null;
        field2111 = null;
    }
}
