import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class226 {

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    private int field3453 = -1;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
    public boolean field3461 = true;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lwaa;")
    private class730 field3451;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    private int field3459;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    private int field3450;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lkd;")
    private class296 field3465;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    private int field3457;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    private int field3454;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Lje;")
    private class421 field3460;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public int field3462;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lwp;")
    private class191 field3456;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3468 = new String[] { method1960(method1959("z\u0000V%\u0003")), method1960(method1959("fLVHV")), method1960(method1959("s\u0017\u0014\n")), method1960(method1959("z\u0000V$\u0003")), method1960(method1959("z\u0000V#\u0003")), method1960(method1959("z\u0000V'\u0003")), method1960(method1959("z\u0000V\"\u0003")), method1960(method1959("z\u0000VZBs\u000b\fX\u0003")) };

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lwia;")
    public static class790 field3452 = new class790(60, 2);

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "[I")
    public static int[] field3466 = null;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Lhp;")
    public static class346 field3467;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method1954(int arg0) {
        try {
            if (arg0 != 128) {
                method1954(115);
            }
            field3466 = null;
            field3452 = null;
            field3467 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3468[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public final void method1955(int arg0) {
        try {
            int var2 = -30 % ((arg0 - 37) / 47);
            field3463++;
            this.method1957(this.field3462, (byte) -126, this.field3460);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3468[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    private final void method1956(int arg0) {
        try {
            if (arg0 != -8425) {
                this.field3462 = -27;
            }
            field3458++;
            if (this.field3461) {
                this.field3461 = false;
                byte[] var2 = this.field3451.field10613;
                int var3 = 0;
                int var4 = this.field3451.field10612;
                int var5 = this.field3459 + (this.field3451.field10612 * this.field3450);
                for (int var6 = -128; var6 < 0; var6++) {
                    var3 = (var3 << 8) - var3;
                    for (int var7 = -128; var7 < 0; var7++) {
                        if (var2[var5++] != 0) {
                            var3++;
                        }
                    }
                    var5 += var4 - 128;
                }
                if (this.field3456 != null && this.field3453 == var3) {
                    this.field3461 = false;
                } else {
                    this.field3453 = var3;
                    int var8 = this.field3450 * var4 + this.field3459;
                    int var9 = 0;
                    if (this.field3465.method855(class157.field1952, class667.field9691, -331365768)) {
                        if (class81.field912 == null) {
                            class81.field912 = new byte[16384];
                        }
                        byte[] var10 = class81.field912;
                        for (int var11 = -128; var11 < 0; var11++) {
                            for (int var12 = -128; var12 < 0; var12++) {
                                if (var2[var8] == 0) {
                                    int var13 = 0;
                                    if (var2[var8 - 1] != 0) {
                                        var13++;
                                    }
                                    if (var2[var8 + 1] != 0) {
                                        var13++;
                                    }
                                    if (var2[var8 - var4] != 0) {
                                        var13++;
                                    }
                                    if (var2[var8 + var4] != 0) {
                                        var13++;
                                    }
                                    var10[var9++] = (byte) (var13 * 17);
                                } else {
                                    var10[var9++] = 68;
                                }
                                var8++;
                            }
                            var8 += this.field3451.field10612 - 128;
                        }
                        if (this.field3456 == null) {
                            this.field3456 = this.field3465.method2448(false, true, class667.field9691, 128, class81.field912, 128);
                            this.field3456.method751(false, 127, false);
                        } else {
                            this.field3456.method742(128, class81.field912, 128, 128, 0, 0, arg0 + 18013, class667.field9691, 0);
                        }
                    } else {
                        if (class295.field4343 == null) {
                            class295.field4343 = new int[16384];
                        }
                        int[] var14 = class295.field4343;
                        for (int var15 = -128; var15 < 0; var15++) {
                            for (int var16 = -128; var16 < 0; var16++) {
                                if (var2[var8] == 0) {
                                    int var17 = 0;
                                    if (var2[var8 - 1] != 0) {
                                        var17++;
                                    }
                                    if (var2[var8 + 1] != 0) {
                                        var17++;
                                    }
                                    if (var2[var8 - var4] != 0) {
                                        var17++;
                                    }
                                    if (var2[var8 + var4] != 0) {
                                        var17++;
                                    }
                                    var14[var9++] = var17 * 17 << 24;
                                } else {
                                    var14[var9++] = 1140850688;
                                }
                                var8++;
                            }
                            var8 += this.field3451.field10612 - 128;
                        }
                        if (this.field3456 == null) {
                            this.field3456 = this.field3465.method2447(class295.field4343, 128, 128, false, 26236);
                            this.field3456.method751(false, arg0 ^ 0xFFFFDF3E, false);
                        } else {
                            this.field3456.method746(class295.field4343, 0, (byte) -110, 128, 0, 0, 128, 128);
                        }
                    }
                }
            }
        } catch (RuntimeException var19) {
            throw class759.method5498(var19, field3468[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLje;)V")
    public final void method1957(int arg0, byte arg1, class421 arg2) {
        try {
            field3455++;
            int var4 = -84 / ((arg1 - 39) / 35);
            if (arg0 > 0) {
                this.method1956(-8425);
                this.field3465.method2467(12, this.field3456);
                this.field3465.method877(this.field3457 + 1 - this.field3454, arg2, this.field3454, 0, class769.field11134, arg0, (byte) -128);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3468[0] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3468[2] : field3468[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILla;I)Lwfa;")
    public static final class210 method1958(int arg0, class476 arg1, int arg2) {
        try {
            field3464++;
            byte[] var3 = arg1.method3638(arg0 ^ 0x5D, arg2);
            if (arg0 != 0) {
                field3452 = null;
            }
            return var3 == null ? null : new class210(var3);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3468[4] + arg0 + ',' + (arg1 == null ? field3468[2] : field3468[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lkd;Lwaa;Lim;IIIII)V")
    public class226(class296 arg0, class730 arg1, class597 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.field3451 = arg1;
            this.field3459 = arg6;
            this.field3450 = arg7;
            this.field3465 = arg0;
            int var9 = 0x1 << arg5;
            int var10 = 0;
            int var11 = arg3 << arg5;
            int var12 = arg4 << arg5;
            for (int var13 = 0; var13 < var9; var13++) {
                int var14 = (var12 + var13) * arg2.field4337 + var11;
                for (int var15 = 0; var15 < var9; var15++) {
                    short[] var16 = arg2.field8756[var14++];
                    if (var16 != null) {
                        var10 += var16.length;
                    }
                }
            }
            if (var10 <= 0) {
                this.field3456 = null;
                this.field3462 = 0;
            } else {
                this.field3457 = Integer.MIN_VALUE;
                this.field3454 = Integer.MAX_VALUE;
                this.field3460 = this.field3465.method899(13, false);
                this.field3460.method24(var10, -10749);
                for (int var17 = 0; var17 < 4; var17++) {
                    Buffer var18 = this.field3460.method3256(true, (byte) -116);
                    if (var18 != null) {
                        Stream var19 = this.field3465.method2476(var18, (byte) -3);
                        if (Stream.method5102()) {
                            for (int var26 = 0; var26 < var9; var26++) {
                                int var27 = (var12 + var26) * arg2.field4337 + var11;
                                for (int var28 = 0; var28 < var9; var28++) {
                                    short[] var29 = arg2.field8756[var27++];
                                    if (var29 != null) {
                                        for (int var30 = 0; var30 < var29.length; var30++) {
                                            int var31 = var29[var30] & 0xFFFF;
                                            if (var31 > this.field3457) {
                                                this.field3457 = var31;
                                            }
                                            if (var31 < this.field3454) {
                                                this.field3454 = var31;
                                            }
                                            var19.method5100(var31);
                                        }
                                    }
                                }
                            }
                        } else {
                            for (int var20 = 0; var20 < var9; var20++) {
                                int var21 = (var12 + var20) * arg2.field4337 + var11;
                                for (int var22 = 0; var22 < var9; var22++) {
                                    short[] var23 = arg2.field8756[var21++];
                                    if (var23 != null) {
                                        for (int var24 = 0; var24 < var23.length; var24++) {
                                            int var25 = var23[var24] & 0xFFFF;
                                            if (this.field3457 < var25) {
                                                this.field3457 = var25;
                                            }
                                            if (this.field3454 > var25) {
                                                this.field3454 = var25;
                                            }
                                            var19.method5108(var25);
                                        }
                                    }
                                }
                            }
                        }
                        var19.method5103();
                        if (this.field3460.method3257(-3841)) {
                            break;
                        }
                    }
                }
                this.field3462 = var10 / 3;
            }
        } catch (RuntimeException var33) {
            throw class759.method5498(var33, field3468[7] + (arg0 == null ? field3468[2] : field3468[1]) + ',' + (arg1 == null ? field3468[2] : field3468[1]) + ',' + (arg2 == null ? field3468[2] : field3468[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1959(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1960(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 98;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 43;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
