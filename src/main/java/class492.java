import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class492 extends class329 {

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "[I")
    public int[] field6495 = new int[1];

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "[I")
    public int[] field6496 = new int[] { -1 };

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "[B")
    public static byte[] field6494 = new byte[2048];

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field6497 = 0;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2648(boolean arg0) {
        field6498++;
        int var1 = class400.field5020 * 512 + 256;
        int var2 = class277.field3471 * 512 + 256;
        int var3 = class467.method2469(var1, class476.field6039, -20214, var2) - class500.field6600;
        if (!arg0) {
            method2649(-53);
        }
        if (class620.field8670 >= 100) {
            class276.field3464 = class277.field3471 * 512 + 256;
            class20.field292 = class400.field5020 * 512 + 256;
            class571.field7982 = class467.method2469(class20.field292, class476.field6039, -20214, class276.field3464) - class500.field6600;
        } else {
            if (var1 > class20.field292) {
                class20.field292 += class289.field3596 + ((var1 - class20.field292) * class620.field8670 / 1000);
                if (class20.field292 > var1) {
                    class20.field292 = var1;
                }
            }
            if (class571.field7982 < var3) {
                class571.field7982 += class289.field3596 + ((var3 - class571.field7982) * class620.field8670 / 1000);
                if (var3 < class571.field7982) {
                    class571.field7982 = var3;
                }
            }
            if (class20.field292 > var1) {
                class20.field292 -= class289.field3596 + ((class20.field292 - var1) * class620.field8670 / 1000);
                if (var1 > class20.field292) {
                    class20.field292 = var1;
                }
            }
            if (class571.field7982 > var3) {
                class571.field7982 -= class289.field3596 + ((class571.field7982 - var3) * class620.field8670 / 1000);
                if (class571.field7982 < var3) {
                    class571.field7982 = var3;
                }
            }
            if (class276.field3464 < var2) {
                class276.field3464 += (var2 - class276.field3464) * class620.field8670 / 1000 + class289.field3596;
                if (var2 < class276.field3464) {
                    class276.field3464 = var2;
                }
            }
            if (class276.field3464 > var2) {
                class276.field3464 -= (class276.field3464 - var2) * class620.field8670 / 1000 + class289.field3596;
                if (var2 > class276.field3464) {
                    class276.field3464 = var2;
                }
            }
        }
        int var4 = class72.field971 * 512 + 256;
        int var5 = class257.field3130 * 512 + 256;
        int var6 = class467.method2469(var5, class476.field6039, -20214, var4) - class133.field1726;
        int var7 = var5 - class20.field292;
        int var8 = var6 - class571.field7982;
        int var9 = var4 - class276.field3464;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class215.field2673 < var11) {
            class215.field2673 += class389.field4906 + ((var11 - class215.field2673 >> 3) * class510.field6934 / 1000) << 3;
            if (var11 < class215.field2673) {
                class215.field2673 = var11;
            }
        }
        if (var11 < class215.field2673) {
            class215.field2673 -= (class215.field2673 - var11 >> 3) * class510.field6934 / 1000 + class389.field4906 << 3;
            if (class215.field2673 < var11) {
                class215.field2673 = var11;
            }
        }
        int var13 = var12 - class693.field9826;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class693.field9826 += class510.field6934 * var14 / 1000 + class389.field4906 << 3;
            class693.field9826 &= 0x3FFF;
        }
        if (var14 < 0) {
            class693.field9826 -= class389.field4906 + (-var14 * class510.field6934 / 1000) << 3;
            class693.field9826 &= 0x3FFF;
        }
        int var15 = var12 - class693.field9826;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class654.field9226 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class693.field9826 = var12;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 163)
    public static void method2649(int arg0) {
        field6494 = null;
        if (arg0 > -51) {
            method2648(true);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIZLr;Lkn;IILdr;)Lda;", line = 175)
    public final class474 method2650(int arg0, int arg1, int arg2, int arg3, boolean arg4, class566 arg5, class498 arg6, int arg7, int arg8, class395 arg9) {
        field6492++;
        class474 var11 = null;
        int var12 = arg2;
        class601 var13 = null;
        if (arg0 != arg8) {
            var13 = class591.field8297.method1900(arg8, (byte) 126);
        }
        int[] var14 = this.field6496;
        if (var13 != null && var13.field8437 != null) {
            var14 = new int[var13.field8437.length];
            for (int var15 = 0; var15 < var13.field8437.length; var15++) {
                int var16 = var13.field8437[var15];
                if (var16 >= 0 && var16 < this.field6496.length) {
                    var14[var15] = this.field6496[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class662 var24 = null;
        class662 var25 = null;
        if (arg9 != null) {
            var12 = arg2 | 0x20;
            int var26 = arg9.field4979[arg7];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class583.field8149.method1843(var27, 61);
            if (var24 != null) {
                var18 |= var24.method3731(var21, ~arg0);
                var17 |= var24.method3729(var21, (byte) -35);
                var20 |= var24.method3732((byte) -101, var21);
                var19 |= arg9.field4977;
            }
            if ((arg9.field4989 || class426.field5349) && arg1 != -1 && arg1 < arg9.field4979.length) {
                int var28 = arg9.field4979[arg1];
                var23 = arg9.field4991[arg7];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class583.field8149.method1843(var22 >>> 16, arg0 ^ 0xFFFFFFC9);
                }
                if (var25 != null) {
                    var18 |= var25.method3731(var22, 0);
                    var17 |= var25.method3729(var22, (byte) -50);
                    var20 |= var25.method3732((byte) -101, var22);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method2651(arg8, arg4, var14, (byte) -4, arg6 == null ? null : arg6.field6566);
        if (class323.field4144 != null) {
            var11 = (class474) class323.field4144.method2418(var30, (byte) 100);
        }
        if (var11 == null || arg5.method998(var11.method764(), var12) != 0) {
            if (var11 != null) {
                var12 = arg5.method1018(var12, var11.method764());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class633.field8881.method434(12388, var14[var34]).method30((byte) 89, arg4)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class47[] var35 = new class47[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class633.field8881.method434(12388, var14[var36]).method15(arg4, arg0);
                }
            }
            if (var13 != null && var13.field8443 != null) {
                for (int var37 = 0; var37 < var13.field8443.length; var37++) {
                    if (var13.field8443[var37] != null && var35[var37] != null) {
                        int var38 = var13.field8443[var37][0];
                        int var39 = var13.field8443[var37][1];
                        int var40 = var13.field8443[var37][2];
                        int var41 = var13.field8443[var37][3];
                        int var42 = var13.field8443[var37][4];
                        int var43 = var13.field8443[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method295(var41, 19068, var43, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method285(var40, (byte) 101, var38, var39);
                        }
                    }
                }
            }
            class47 var44 = new class47(var35, var35.length);
            if (arg6 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg5.method1019(var44, var32, class358.field4567, 64, 850);
            if (arg6 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class8.field161.length; var46++) {
                        if (arg6.field6566[var45] < class8.field161[var46][var45].length) {
                            var11.method694(class205.field2615[var46][var45], class8.field161[var46][var45][arg6.field6566[var45]]);
                        }
                    }
                }
            }
            if (class323.field4144 != null) {
                var11.method761(var12);
                class323.field4144.method2409(var30, var11, 1);
            }
        }
        if (arg9 == null || var24 == null) {
            return var11;
        } else {
            class474 var47 = var11.method711((byte) 1, var12, true);
            var47.method2506(arg9.field4977, (byte) -11, var24, var22, var21, var25, arg3 - 1, 0, var23);
            return var47;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ[IB[I)J", line = 429)
    private final long method2651(int arg0, boolean arg1, int[] arg2, byte arg3, int[] arg4) {
        field6493++;
        long[] var6 = class36.field488;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg0 >> 8)) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg0) & 0xFFL)];
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg2[var13] >> 24)) & 0xFFL)];
            long var19 = var6[(int) ((var17 ^ (long) (arg2[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) (((long) (arg2[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) (((long) arg2[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg3 != -4) {
            this.method2650(-79, -117, -20, -23, true, null, null, 61, -115, null);
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg4[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg1 ? 1 : 0) ^ var11) & 0xFFL)];
    }
}
