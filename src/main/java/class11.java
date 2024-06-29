import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class11 extends class189 {

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    private int field252 = 0;

    @OriginalMember(owner = "client!b", name = "rb", descriptor = "I")
    private int field260 = 12288;

    @OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
    private int field258 = 0;

    @OriginalMember(owner = "client!b", name = "Bb", descriptor = "I")
    private int field270 = 8192;

    @OriginalMember(owner = "client!b", name = "Cb", descriptor = "I")
    private int field271 = 4096;

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "I")
    private int field256 = 2048;

    @OriginalMember(owner = "client!b", name = "Db", descriptor = "I")
    private int field272 = 2048;

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "Lgg;")
    private static class63 field253 = class116.method911(43, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!b", name = "ub", descriptor = "Lgg;")
    public static class63 field263 = class116.method911(43, "m");

    @OriginalMember(owner = "client!b", name = "yb", descriptor = "Lgg;")
    public static class63 field267 = field253;

    @OriginalMember(owner = "client!b", name = "mb", descriptor = "[Lgg;")
    public static class63[] field255 = new class63[1000];

    @OriginalMember(owner = "client!b", name = "xb", descriptor = "I")
    public static int field266 = 0;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "[Z")
    public static boolean[] field254 = new boolean[100];

    @OriginalMember(owner = "client!b", name = "tb", descriptor = "I")
    public static int field262 = 0;

    @OriginalMember(owner = "client!b", name = "qb", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!b", name = "vb", descriptor = "[J")
    public static long[] field264 = new long[100];

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "Lgg;")
    public static class63 field249 = class116.method911(43, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!b", name = "sb", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!b", name = "wb", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!b", name = "zb", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!b", name = "Ab", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!b", name = "Eb", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!b", name = "Fb", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!b", name = "Gb", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!b", name = "Hb", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!b", name = "Ib", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!b", name = "ob", descriptor = "Lff;")
    public static class54 field257;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILdg;III)V")
    public static final void method140(int arg0, int arg1, class37 arg2, int arg3, int arg4, int arg5) {
        ++field269;
        class15 var6 = new class15();
        var6.field354 = arg5 * 128;
        var6.field368 = arg2.field870;
        var6.field374 = arg2.field894;
        int var7 = arg2.field914;
        var6.field362 = arg2.field865;
        var6.field365 = arg1 * 128;
        var6.field357 = arg2.field901 * 128;
        var6.field364 = arg4;
        var6.field363 = arg2.field890;
        int var8 = arg2.field893;
        if (~arg0 == -2 || ~arg0 == -4) {
            var8 = arg2.field914;
            var7 = arg2.field893;
        }
        var6.field360 = (arg5 - -var8) * 128;
        if (arg3 <= -89) {
            var6.field358 = (arg1 + var7) * 128;
            if (arg2.field897 != null) {
                var6.field355 = arg2;
                var6.method168((byte) 26);
            }
            class84.field1993.method1034(0, var6);
            if (var6.field368 != null) {
                var6.field371 = (int) (Math.random() * (double) (var6.field374 - var6.field363)) + var6.field363;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        int[] var3 = super.field3825.method681(arg1, (byte) -114);
        if (arg0 != 0) {
            return null;
        } else {
            ++field265;
            if (super.field3825.field1840) {
                int var4 = class21.field496[arg1] + -2048;
                for (int var5 = 0; ~class54.field1430 < ~var5; ++var5) {
                    int var6 = class35.field825[var5] - 2048;
                    int var7 = this.field256 + var6;
                    int var8 = var7 < -2048 ? var7 + 4096 : var7;
                    int var9 = this.field258 + var4;
                    int var10 = var8 <= 2048 ? var8 : var8 - 4096;
                    int var11 = ~var9 <= 2047 ? var9 : var9 + 4096;
                    int var12 = var11 > 2048 ? var11 + -4096 : var11;
                    int var13 = this.field272 + var4;
                    int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                    int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                    int var16 = this.field252 + var6;
                    int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                    int var18 = ~var17 >= -2049 ? var17 : var17 - 4096;
                    var3[var5] = !this.method142(var12, 1437032524, var10) && !this.method146((byte) 78, var15, var18) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        class166.method1123(100);
        if (arg0) {
            ++field277;
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(B)V")
    public static void method141(byte arg0) {
        field264 = null;
        field255 = null;
        field263 = null;
        field249 = null;
        field254 = null;
        field257 = null;
        field253 = null;
        field267 = null;
        int var1 = 108 % ((-9 - arg0) / 42);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 > 32) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (arg0 == 6) {
                                        this.field270 = arg2.method46((byte) 65);
                                    }
                                } else {
                                    this.field271 = arg2.method46((byte) 65);
                                }
                            } else {
                                this.field260 = arg2.method46((byte) 65);
                            }
                        } else {
                            this.field272 = arg2.method46((byte) 65);
                        }
                    } else {
                        this.field252 = arg2.method46((byte) 65);
                    }
                } else {
                    this.field258 = arg2.method46((byte) 65);
                }
            } else {
                this.field256 = arg2.method46((byte) 65);
            }
            ++field274;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(III)Z")
    private final boolean method142(int arg0, int arg1, int arg2) {
        if (arg1 != 1437032524) {
            this.method84(true);
        }
        int var4 = (arg0 - arg2) * this.field260 >> 12;
        int var5 = class30.field773[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field260;
        int var7 = (var6 << 12) / this.field270;
        int var8 = this.field271 * var7 >> 12;
        ++field273;
        return ~var8 < ~(arg2 - -arg0) && arg0 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBI)I")
    public static final int method143(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg3 & 3;
        ++field268;
        if (arg2 > -21) {
            return -97;
        } else if (~var4 == -1) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else {
            return ~var4 == -3 ? -arg1 + 7 : 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljc;IILjc;B)Lth;")
    public static final class179 method144(class85 arg0, int arg1, int arg2, class85 arg3, byte arg4) {
        ++field251;
        if (arg4 != 36) {
            field264 = null;
        }
        return !class117.method917(arg0, arg2, arg1, -20878) ? null : class142.method1021(arg3.method745(arg2, arg1, 0), arg4 + 44);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static final void method145(int arg0) {
        class90.field2108 = arg0;
        ++field261;
        class89.field2092 = 0;
        class109.method879(true);
        class181.method1204(arg0 + 15);
        class135.method982(true);
        for (int var1 = 0; ~var1 > ~class90.field2108; ++var1) {
            int var3 = class126.field2784[var1];
            if (class173.field3571 != class55.field1458[var3].field1163) {
                class55.field1458[var3].field150 = null;
                class55.field1458[var3] = null;
            }
        }
        if (~class112.field2531 != ~class167.field3437.field54) {
            throw new RuntimeException("gnp1 pos:" + class167.field3437.field54 + " psize:" + class112.field2531);
        } else {
            for (int var2 = 0; ~var2 > ~class29.field695; ++var2) {
                if (class55.field1458[class142.field3045[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class29.field695);
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(BII)Z")
    private final boolean method146(byte arg0, int arg1, int arg2) {
        int var4 = (arg1 + arg2) * this.field260 >> 12;
        ++field250;
        int var5 = class30.field773[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field260;
        int var7 = (var6 << 12) / this.field270;
        if (arg0 < 62) {
            return false;
        } else {
            int var8 = this.field271 * var7 >> 12;
            return var8 > -arg2 + arg1 && ~(-var8) > ~(-arg2 + arg1);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class11() {
        super(0, true);
    }
}
