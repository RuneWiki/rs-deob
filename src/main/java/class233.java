import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class233 {

    @OriginalMember(owner = "client!li", name = "n", descriptor = "B")
    private byte field3408;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public int field3400;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public int field3406;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public int field3404;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "[J")
    public static long[] field3398 = new long[200];

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3395 = 0;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3403 = "flash3:";

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 9)
    public static void method1641(int arg0) {
        field3398 = null;
        if (arg0 != -166125016) {
            method1641(117);
        }
        field3403 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 29)
    public static final byte[] method1642(String arg0, int arg1) {
        field3409++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (arg1 > -54) {
            field3395 = 74;
        }
        while (var4 < var2) {
            char var5 = arg0.charAt(var4);
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

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZIIIII)V", line = 167)
    public static final void method1643(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3405++;
        int var10 = arg4 + 1;
        class279.method1997(arg2, -824384948, arg5, arg3, class206.field2886[arg4]);
        int var9 = arg1 - 1;
        class279.method1997(arg2, -824384948, arg5, arg3, class206.field2886[arg1]);
        if (!arg0) {
            method1643(true, -88, 90, 116, -103, 113);
        }
        for (int var6 = var10; var6 <= var9; var6++) {
            int[] var7 = class206.field2886[var6];
            var7[arg5] = var7[arg2] = arg3;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)I", line = 191)
    public final int method1644(boolean arg0) {
        field3399++;
        if (!arg0) {
            this.method1644(false);
        }
        return (this.field3408 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)I", line = 203)
    public static final int method1645(int arg0, int arg1, int arg2, int arg3) {
        field3397++;
        if (arg2 >= -60) {
            return -42;
        }
        int var4 = class215.field3023[class333.method2301(arg0, arg3)];
        if (arg1 > 0) {
            int var5 = class215.field3020.method379((byte) -113, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg3 < 0) {
                    var6 = 0;
                } else if (arg3 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg3 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var6 & 0xFF00) * var5 + ((var4 & 0xFF00) * var8) & 0xFF0000) + ((var6 & 0xFF00FF) * var5 + ((var4 & 0xFF00FF) * var8) & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class215.field3020.method369(arg1 & 0xFFFF, 0);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 & 0xFF) * var9;
                int var11 = (var4 >> 8 & 0xFF) * var9;
                int var12 = (var4 >> 16 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var12 > 65535) {
                    var12 = 65535;
                }
                if (var11 > 65535) {
                    var11 = 65535;
                }
                var4 = (var10 >> 8) + ((var12 & 0x6B00FF00) << 8) + (var11 & 0xFF00);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I", line = 296)
    public final int method1646(byte arg0) {
        field3407++;
        return arg0 == -13 ? this.field3408 & 0x7 : -70;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIII)V", line = 311)
    public static final void method1647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4 - arg5;
        field3396++;
        int var7 = arg1 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class214.method1459(arg0, 72, arg5, arg4, arg2);
            }
        } else if (var6 == 0) {
            class235.method1661((byte) 41, arg0, arg2, arg5, arg1);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            if (arg3 <= 68) {
                method1641(-109);
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                int var10 = arg2;
                arg2 = arg5;
                arg5 = var10;
                arg1 = arg4;
                arg4 = var9;
            }
            if (arg1 < arg2) {
                int var11 = arg5;
                int var12 = arg2;
                arg2 = arg1;
                arg1 = var12;
                arg5 = arg4;
                arg4 = var11;
            }
            int var13 = arg5;
            int var14 = arg4 - arg5;
            if (var14 < 0) {
                var14 = -var14;
            }
            int var15 = arg1 - arg2;
            int var16 = -(var15 >> 1);
            int var17 = arg4 <= arg5 ? -1 : 1;
            if (var8) {
                for (int var18 = arg2; var18 <= arg1; var18++) {
                    var16 += var14;
                    class206.field2886[var18][var13] = arg0;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            } else {
                for (int var19 = arg2; var19 <= arg1; var19++) {
                    class206.field2886[var13][var19] = arg0;
                    var16 += var14;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 425)
    public class233() {
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lp;)V", line = 427)
    public class233(class107 arg0) {
        this.field3408 = arg0.method679(-3);
        this.field3402 = arg0.method624(14612);
        this.field3400 = arg0.method676(true);
        this.field3406 = arg0.method676(true);
        this.field3404 = arg0.method676(true);
        this.field3401 = arg0.method676(true);
    }
}
