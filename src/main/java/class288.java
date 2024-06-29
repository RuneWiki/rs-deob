import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class288 {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Z")
    public static boolean field4478 = false;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lcr;")
    public static class369 field4476;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field4479;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "[Lya;")
    public static class11[] field4475;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([BIIILjava/lang/String;I)I", line = 7)
    public static final int method1933(byte[] arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field4477++;
        int var6 = arg2 - arg3;
        if (arg1 != -10653) {
            field4478 = false;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg5 + var7] = -97;
            } else {
                arg0[arg5 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 149)
    public static void method1934(int arg0) {
        field4475 = null;
        field4479 = null;
        if (arg0 < 61) {
            field4475 = null;
        }
        field4476 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Z", line = 166)
    public static final boolean method1935(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class18.field199; var3++) {
            class231 var4 = class49.field758[var3];
            if (var4.field3471 == 1) {
                int var5 = var4.field3468 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3465 * var5 >> 8) + var4.field3464;
                    int var7 = (var4.field3477 * var5 >> 8) + var4.field3480;
                    int var8 = (var4.field3466 * var5 >> 8) + var4.field3476;
                    int var9 = (var4.field3479 * var5 >> 8) + var4.field3469;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3471 == 2) {
                int var10 = arg0 - var4.field3468;
                if (var10 > 0) {
                    int var11 = (var4.field3465 * var10 >> 8) + var4.field3464;
                    int var12 = (var4.field3477 * var10 >> 8) + var4.field3480;
                    int var13 = (var4.field3466 * var10 >> 8) + var4.field3476;
                    int var14 = (var4.field3479 * var10 >> 8) + var4.field3469;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3471 == 3) {
                int var15 = var4.field3464 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3470 * var15 >> 8) + var4.field3468;
                    int var17 = (var4.field3473 * var15 >> 8) + var4.field3474;
                    int var18 = (var4.field3466 * var15 >> 8) + var4.field3476;
                    int var19 = (var4.field3479 * var15 >> 8) + var4.field3469;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3471 == 4) {
                int var20 = arg2 - var4.field3464;
                if (var20 > 0) {
                    int var21 = (var4.field3470 * var20 >> 8) + var4.field3468;
                    int var22 = (var4.field3473 * var20 >> 8) + var4.field3474;
                    int var23 = (var4.field3466 * var20 >> 8) + var4.field3476;
                    int var24 = (var4.field3479 * var20 >> 8) + var4.field3469;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3471 == 5) {
                int var25 = arg1 - var4.field3476;
                if (var25 > 0) {
                    int var26 = (var4.field3470 * var25 >> 8) + var4.field3468;
                    int var27 = (var4.field3473 * var25 >> 8) + var4.field3474;
                    int var28 = (var4.field3465 * var25 >> 8) + var4.field3464;
                    int var29 = (var4.field3477 * var25 >> 8) + var4.field3480;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
