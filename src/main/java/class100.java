import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class100 extends class130 {

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "[I")
    public int[] field1532 = new int[] { -1 };

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "[I")
    public int[] field1534 = new int[1];

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field1537 = -1;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lpn;")
    public static class49 field1531 = new class49(76, 4);

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "[I")
    public static int[] field1533;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[IZZ[I)J", line = 3)
    private final long method815(int arg0, int[] arg1, boolean arg2, boolean arg3, int[] arg4) {
        field1539++;
        long[] var6 = class472.field6936;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg0 >> 8) ^ var7) & 0xFFL)];
        if (arg3) {
            return -49L;
        }
        long var11 = var6[(int) (((long) arg0 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg1[var13] >> 24)) & 0xFFL)];
            long var19 = var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) (((long) arg1[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg4[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg2 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lwl;B)V", line = 46)
    public static final void method816(class521 arg0, byte arg1) {
        int var2 = -108 % ((47 - arg1) / 52);
        field1535++;
        boolean var3 = false;
        if (class446.field6625 == arg0.field7585 || arg0.field7644 == -1 || arg0.field7588 != 0) {
            var3 = true;
        } else {
            class61 var4 = class393.field5735.method1538(-4031, arg0.field7644);
            if (var4.field968 || arg0.field7584 + 1 > var4.field962[arg0.field7551]) {
                var3 = true;
            }
        }
        if (var3) {
            int var5 = arg0.field7585 - arg0.field7589;
            int var6 = class446.field6625 - arg0.field7589;
            int var7 = arg0.field7565 * 128 + (arg0.method3045(0) * 64);
            int var8 = arg0.field7616 * 128 + arg0.method3045(0) * 64;
            int var9 = arg0.field7627 * 128 + (arg0.method3045(0) * 64);
            int var10 = arg0.field7614 * 128 + (arg0.method3045(0) * 64);
            arg0.field1279 = ((var5 - var6) * var8 + var6 * var10) / var5;
            arg0.field1275 = ((var5 - var6) * var7 + var6 * var9) / var5;
        }
        arg0.field7655 = 0;
        if (arg0.field7620 == 0) {
            arg0.method3100(0, 8192, false);
        }
        if (arg0.field7620 == 1) {
            arg0.method3100(0, 12288, false);
        }
        if (arg0.field7620 == 2) {
            arg0.method3100(0, 0, false);
        }
        if (arg0.field7620 == 3) {
            arg0.method3100(0, 4096, false);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZILwq;Lkt;Lza;IIIII)Le;", line = 104)
    public final class289 method817(boolean arg0, int arg1, class286 arg2, class61 arg3, class299 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1536++;
        class289 var11 = null;
        int var12 = arg1;
        class477 var13 = null;
        if (arg7 != -1) {
            var13 = class315.field4808.method154((byte) 21, arg7);
        }
        int[] var14 = this.field1532;
        if (var13 != null && var13.field7005 != null) {
            var14 = new int[var13.field7005.length];
            for (int var15 = 0; var15 < var13.field7005.length; var15++) {
                int var16 = var13.field7005[var15];
                if (var16 >= 0 && this.field1532.length > var16) {
                    var14[var15] = this.field1532[var16];
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
        class313 var24 = null;
        class313 var25 = null;
        if (arg3 != null) {
            int var26 = arg3.field976[arg9];
            var12 = arg1 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class393.field5735.method1542(0, var27);
            if (var24 != null) {
                var18 |= var24.method2077(var21, (byte) -65);
                var17 |= var24.method2075(var21, -115);
                var20 |= var24.method2074(255, var21);
                var19 |= arg3.field948;
            }
            if ((arg3.field968 || class29.field324) && arg6 != -1 && arg3.field976.length > arg6) {
                var23 = arg3.field962[arg9];
                int var28 = arg3.field976[arg6];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class393.field5735.method1542(0, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method2077(var22, (byte) 63);
                    var17 |= var25.method2075(var22, -127);
                    var20 |= var25.method2074(arg8 ^ 0xAF9, var22);
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
        long var30 = this.method815(arg7, var14, arg0, false, arg2 == null ? null : arg2.field4452);
        if (class317.field4831 != null) {
            var11 = (class289) class317.field4831.method1634(var30, arg8 ^ 0xA46);
        }
        if (var11 == null || arg4.method589(var11.method679(), var12) != 0) {
            if (var11 != null) {
                var12 = arg4.method557(var12, var11.method679());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class300.field4608.method2088(var14[var34], 106).method1526(0, arg0)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class153[] var35 = new class153[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class300.field4608.method2088(var14[var36], 127).method1529(-1, arg0);
                }
            }
            if (var13 != null && var13.field6995 != null) {
                for (int var37 = 0; var37 < var13.field6995.length; var37++) {
                    if (var13.field6995[var37] != null && var35[var37] != null) {
                        int var38 = var13.field6995[var37][0];
                        int var39 = var13.field6995[var37][1];
                        int var40 = var13.field6995[var37][2];
                        int var41 = var13.field6995[var37][3];
                        int var42 = var13.field6995[var37][4];
                        int var43 = var13.field6995[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method1103(arg8 - 2452, var41, var42, var43);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method1110(var40, var39, var38, 103);
                        }
                    }
                }
            }
            if (arg2 != null) {
                var32 = var12 | 0x4000;
            }
            class153 var44 = new class153(var35, var35.length);
            var11 = arg4.method554(var44, var32, class87.field1428, 64, 850);
            if (arg2 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class61.field960[var45].length > arg2.field4452[var45]) {
                        var11.method632(class43.field683[var45], class61.field960[var45][arg2.field4452[var45]]);
                    }
                    if (class306.field4689[var45].length > arg2.field4452[var45]) {
                        var11.method632(class115.field1769[var45], class306.field4689[var45][arg2.field4452[var45]]);
                    }
                }
            }
            if (class317.field4831 != null) {
                var11.method662(var12);
                class317.field4831.method1623(var30, 17621, var11);
            }
        }
        if (arg3 == null || var24 == null) {
            return var11;
        }
        if (arg8 != 2566) {
            method818((byte) 35);
        }
        class289 var46 = var11.method669((byte) 1, var12, true);
        var46.method1937(var25, arg3.field948, var24, arg5 - 1, var23, var22, var21, (byte) -80, 0);
        return var46;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 353)
    public static void method818(byte arg0) {
        int var1 = 22 / ((arg0 + 38) / 60);
        field1531 = null;
        field1533 = null;
    }
}
