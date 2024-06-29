import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class187 extends class128 {

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Ljava/lang/String;")
    public String field3045;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "[[B")
    public static byte[][] field3044;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
    public static final void method1336(byte arg0, int arg1) {
        class155.field2420 = new int[arg1];
        class56.field927 = new int[arg1];
        class92.field1480 = new int[arg1];
        class96.field1550 = new int[arg1];
        class25.field307 = new int[arg1];
        if (arg0 == -116) {
            field3041++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3046++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg4 - arg0;
        int var12 = arg1 - arg0;
        int var13 = arg1 * arg1;
        int var14 = arg4 * arg4;
        int var15 = var12 * var12;
        int var16 = var15 << 1;
        int var17 = var11 * var11;
        int var18 = var13 << 1;
        int var19 = var17 << 1;
        int var20 = var14 << 1;
        int var21 = arg1 << 1;
        int var22 = (1 - var21) * var14 + var18;
        int var23 = var12 << 1;
        int var24 = var13 - ((var21 - 1) * var20);
        int var25 = (1 - var23) * var17 + var16;
        int var26 = var15 - ((var23 - 1) * var19);
        int var27 = var14 << 2;
        if (arg2 < 108) {
            field3044 = null;
        }
        int var28 = var13 << 2;
        int var29 = var17 << 2;
        int var30 = var15 << 2;
        int var31 = var18 * 3;
        int var32 = (var21 - 3) * var20;
        int var33 = var28;
        int[] var34 = class204.field3253[arg6];
        int var35 = (arg1 - 1) * var27;
        int var36 = (var23 - 3) * var19;
        class73.method494(arg5, var34, 4028, arg7 - var11, arg7 - arg4);
        int var37 = var16 * 3;
        int var38 = (var12 - 1) * var29;
        class73.method494(arg3, var34, 4028, arg7 + var11, arg7 - var11);
        int var39 = var30;
        class73.method494(arg5, var34, 4028, arg4 + arg7, arg7 + var11);
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var8++;
                    var24 += var33;
                    var33 += var28;
                    var22 += var31;
                    var31 += var28;
                }
            }
            boolean var40 = var9 <= var12;
            if (var24 < 0) {
                var22 += var31;
                var31 += var28;
                var24 += var33;
                var33 += var28;
                var8++;
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var37;
                        var10++;
                        var37 += var30;
                        var26 += var39;
                        var39 += var30;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var39;
                    var39 += var30;
                    var25 += var37;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var36;
                var38 -= var29;
                var36 -= var29;
            }
            var24 += -var32;
            var22 += -var35;
            var35 -= var27;
            var32 -= var27;
            var9--;
            int var41 = arg6 - var9;
            int var42 = arg7 + var8;
            int var43 = arg6 + var9;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class73.method494(arg5, class204.field3253[var41], 4028, var46, var44);
                class73.method494(arg3, class204.field3253[var41], 4028, var45, var46);
                class73.method494(arg5, class204.field3253[var41], 4028, var42, var45);
                class73.method494(arg5, class204.field3253[var43], 4028, var46, var44);
                class73.method494(arg3, class204.field3253[var43], 4028, var45, var46);
                class73.method494(arg5, class204.field3253[var43], 4028, var42, var45);
            } else {
                class73.method494(arg5, class204.field3253[var41], 4028, var42, var44);
                class73.method494(arg5, class204.field3253[var43], 4028, var42, var44);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZ)V")
    public static final void method1338(int arg0, int arg1, boolean arg2) {
        class26 var3 = class67.method470(0, arg1);
        field3042++;
        int var4 = var3.field322;
        int var5 = var3.field326;
        int var6 = var3.field332;
        int var7 = class10.field101[var6 - var5];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class11.method55(class195.field3160[var4] & ~var8 | arg0 << var5 & var8, arg2, var4);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILdk;B)Z")
    public static final boolean method1339(int arg0, class251 arg1, byte arg2) {
        field3047++;
        if (arg2 != 60) {
            return false;
        }
        byte[] var3 = arg1.method1689(arg0, -94);
        if (var3 == null) {
            return false;
        } else {
            class241.method1621((byte) -77, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method1340(byte arg0) {
        field3044 = null;
        if (arg0 != -128) {
            field3044 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class187() {
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method1341(int arg0, String arg1) {
        field3048++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (arg0 != 382) {
            return null;
        }
        while (var2 > var4) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class187(String arg0, int arg1) {
        this.field3045 = arg0;
    }
}
