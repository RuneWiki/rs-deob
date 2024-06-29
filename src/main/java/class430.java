import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class430 extends class379 {

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "[I")
    public int[] field5667 = new int[1];

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "[I")
    public int[] field5670 = new int[] { -1 };

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "[I")
    public static int[] field5668 = new int[25];

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field5666 = 0;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "[Lgda;")
    public static class61[] field5671;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z[III[I)J", line = 6)
    private final long method2550(boolean arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        field5665++;
        long[] var6 = class784.field10825;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg2 >> 8)) & 0xFFL)];
        long var11 = var6[(int) ((var9 ^ (long) arg2) & 0xFFL)] ^ var9 >>> 8;
        int var13 = 0;
        if (arg3 != 1427926600) {
            return 64L;
        }
        while (arg4.length > var13) {
            long var17 = var6[(int) (((long) (arg4[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) (((long) (arg4[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) (((long) (arg4[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) ((var21 ^ (long) arg4[var13]) & 0xFFL)] ^ var21 >>> 8;
            var13++;
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg1[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZIILha;ILfs;ILnba;I)Lka;", line = 53)
    public final class498 method2551(int arg0, boolean arg1, int arg2, int arg3, class66 arg4, int arg5, class582 arg6, int arg7, class316 arg8, int arg9) {
        field5669++;
        class498 var11 = null;
        int var12 = arg9;
        class15 var13 = null;
        if (arg2 != -1) {
            var13 = class249.field2932.method1415((byte) -123, arg2);
        }
        int[] var14 = this.field5670;
        if (var13 != null && var13.field263 != null) {
            var14 = new int[var13.field263.length];
            for (int var15 = 0; var15 < var13.field263.length; var15++) {
                int var16 = var13.field263[var15];
                if (var16 >= 0 && var16 < this.field5670.length) {
                    var14[var15] = this.field5670[var16];
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
        class338 var24 = null;
        class338 var25 = null;
        if (arg6 != null) {
            int var26 = arg6.field7955[arg7];
            var12 = arg9 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class362.field4504.method3602(var27, (byte) -49);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method1998(var21, (byte) 17);
                var17 |= var24.method2001(var21, 7402);
                var20 |= var24.method1997(var21, true);
                var19 |= arg6.field7940;
            }
            if ((arg6.field7932 || class688.field9381) && arg3 != -1 && arg3 < arg6.field7955.length) {
                var23 = arg6.field7936[arg7];
                int var28 = arg6.field7955[arg3];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class362.field4504.method3602(var22 >>> 16, (byte) -36);
                }
                if (var25 != null) {
                    var18 |= var25.method1998(var22, (byte) 17);
                    var17 |= var25.method2001(var22, 7402);
                    var20 |= var25.method1997(var22, true);
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
        long var30 = this.method2550(arg1, arg8 == null ? null : arg8.field3890, arg2, arg5, var14);
        if (class520.field7342 != null) {
            var11 = (class498) class520.field7342.method1684(var30, -359);
        }
        if (var11 == null || arg4.method620(var11.method396(), var12) != 0) {
            if (var11 != null) {
                var12 = arg4.method632(var12, var11.method396());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class121.field1555.method2882(var14[var34], -22087).method2022((byte) 105, null, arg1)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class496[] var35 = new class496[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class121.field1555.method2882(var14[var36], -22087).method2010(null, arg1, (byte) -100);
                }
            }
            if (var13 != null && var13.field279 != null) {
                for (int var37 = 0; var37 < var13.field279.length; var37++) {
                    if (var13.field279[var37] != null && var35[var37] != null) {
                        int var38 = var13.field279[var37][0];
                        int var39 = var13.field279[var37][1];
                        int var40 = var13.field279[var37][2];
                        int var41 = var13.field279[var37][3];
                        int var42 = var13.field279[var37][4];
                        int var43 = var13.field279[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2918(arg5 ^ 0x551C6E48, var43, var42, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2926(var38, (byte) -39, var40, var39);
                        }
                    }
                }
            }
            if (arg8 != null) {
                var32 = var12 | 0x4000;
            }
            class496 var44 = new class496(var35, var35.length);
            var11 = arg4.method567(var44, var32, class515.field7256, 64, 850);
            if (arg8 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class400.field5239.length; var46++) {
                        if (arg8.field3890[var45] < class400.field5239[var46][var45].length) {
                            var11.method402(class677.field9293[var46][var45], class400.field5239[var46][var45][arg8.field3890[var45]]);
                        }
                    }
                }
            }
            if (class520.field7342 != null) {
                var11.method378(var12);
                class520.field7342.method1686(-25638, var30, var11);
            }
        }
        if (arg6 == null || var24 == null) {
            return var11;
        } else {
            class498 var47 = var11.method364((byte) 1, var12, true);
            var47.method2944(var21, var23, var25, arg6.field7940, -100, arg0 - 1, var24, 0, var22);
            return var47;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 307)
    public static void method2552(int arg0) {
        field5671 = null;
        if (arg0 == 1382040008) {
            field5668 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;Z)V", line = 319)
    public static final void method2553(String arg0, byte arg1, int arg2, String arg3, boolean arg4) {
        class551.method3228(arg4, -1, (byte) 109, true, arg3, arg0, arg2);
        int var5 = -16 / ((arg1 + 62) / 37);
        field5664++;
    }
}
