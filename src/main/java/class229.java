import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class229 extends class81 {

    @OriginalMember(owner = "client!s", name = "x", descriptor = "[S")
    public short[] field3909;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "[Lkc;")
    public class266[] field3901;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "[B")
    public byte[] field3904;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "[I")
    private int[] field3917;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "[Lve;")
    public class185[] field3902;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "[B")
    public byte[] field3903;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "[B")
    public byte[] field3918;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public int field3905;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "[I")
    public static int[] field3910 = new int[256];

    @OriginalMember(owner = "client!s", name = "E", descriptor = "Lpj;")
    public static class237 field3915 = class33.method353("Hidden)2", 71);

    @OriginalMember(owner = "client!s", name = "F", descriptor = "Lpj;")
    public static class237 field3916 = class33.method353("Bitte warten Sie)3)3)3", 53);

    @OriginalMember(owner = "client!s", name = "A", descriptor = "[I")
    public static int[] field3912 = new int[128];

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "Ljh;")
    public static class271 field3911;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method1514(byte arg0) {
        field3912 = null;
        field3916 = null;
        field3910 = null;
        int var1 = 95 / ((8 - arg0) / 35);
        field3911 = null;
        field3915 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
    public static final void method1515(byte arg0) {
        field3914++;
        class59.field1208.method934((byte) 62);
        int var1 = 53 / (arg0 / 46);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([BLsj;[II)Z")
    public final boolean method1516(byte[] arg0, class48 arg1, int[] arg2, int arg3) {
        field3913++;
        boolean var5 = true;
        int var6 = 0;
        if (arg3 != 3133) {
            method1518(-93);
        }
        class266 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field3917[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method446(arg2, (byte) 126, var9 >> 2);
                        } else {
                            var7 = arg1.method441((byte) -89, var9 >> 2, arg2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3901[var8] = var7;
                        this.field3917[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V")
    public final void method1517(boolean arg0) {
        this.field3917 = null;
        if (!arg0) {
            method1520(123, -1, -48);
        }
        field3906++;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
    public static final void method1518(int arg0) {
        field3907++;
        if (class63.field1255 == 0 || arg0 > -36) {
            return;
        }
        try {
            if (++class89.field1630 > 1500) {
                if (class127.field2219 != null) {
                    class127.field2219.method1431((byte) 49);
                    class127.field2219 = null;
                }
                if (class96.field1712 >= 1) {
                    class63.field1255 = 0;
                    class259.field4450 = -5;
                    return;
                }
                class96.field1712++;
                class63.field1255 = 1;
                class89.field1630 = 0;
                if (class245.field4291 == class221.field3803) {
                    class245.field4291 = class189.field3290;
                } else {
                    class245.field4291 = class221.field3803;
                }
            }
            if (class63.field1255 == 1) {
                class52.field1100 = class268.field4572.method543(class170.field2982, class245.field4291, (byte) -104);
                class63.field1255 = 2;
            }
            if (class63.field1255 == 2) {
                if (class52.field1100.field1823 == 2) {
                    throw new IOException();
                }
                if (class52.field1100.field1823 != 1) {
                    return;
                }
                class127.field2219 = new class214((Socket) class52.field1100.field1826, class268.field4572);
                class52.field1100 = null;
                class127.field2219.method1434(0, -26363, class223.field3830.field647, class223.field3830.field644);
                if (class79.field1485 != null) {
                    class79.field1485.method1079(122);
                }
                if (class131.field2312 != null) {
                    class131.field2312.method1079(111);
                }
                int var1 = class127.field2219.method1437((byte) 85);
                if (class79.field1485 != null) {
                    class79.field1485.method1079(-15);
                }
                if (class131.field2312 != null) {
                    class131.field2312.method1079(120);
                }
                if (var1 != 101) {
                    class63.field1255 = 0;
                    class259.field4450 = var1;
                    class127.field2219.method1431((byte) 49);
                    class127.field2219 = null;
                    return;
                }
                class63.field1255 = 3;
            }
            if (class63.field1255 == 3 && class127.field2219.method1438(12) >= 2) {
                int var2 = class127.field2219.method1437((byte) 85) << 8 | class127.field2219.method1437((byte) 85);
                class59.method511(var2, (byte) 107);
                if (class126.field2205 == -1) {
                    class126.field2205 = class11.field198;
                }
                class63.field1255 = 0;
                class127.field2219.method1431((byte) 49);
                class127.field2219 = null;
                class260.method1752(-113);
            }
        } catch (IOException var3) {
            if (class127.field2219 != null) {
                class127.field2219.method1431((byte) 49);
                class127.field2219 = null;
            }
            if (class96.field1712 < 1) {
                class96.field1712++;
                if (class245.field4291 == class221.field3803) {
                    class245.field4291 = class189.field3290;
                } else {
                    class245.field4291 = class221.field3803;
                }
                class63.field1255 = 1;
                class89.field1630 = 0;
            } else {
                class259.field4450 = -4;
                class63.field1255 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILu;)V")
    public static final void method1519(int arg0, class117 arg1) {
        class50.method458(arg1, 2, 200000);
        field3908++;
        if (arg0 > -84) {
            method1515((byte) -87);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lmd;")
    public static final class212 method1520(int arg0, int arg1, int arg2) {
        class35 var3 = class274.field4775[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class212 var4 = var3.field749;
            var3.field749 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class229() {
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "([B)V")
    public class229(byte[] arg0) {
        this.field3909 = new short[128];
        this.field3901 = new class266[128];
        this.field3904 = new byte[128];
        int var2 = 0;
        this.field3917 = new int[128];
        this.field3902 = new class185[128];
        this.field3903 = new byte[128];
        this.field3918 = new byte[128];
        class32 var3 = new class32(arg0);
        while (var3.field644[var3.field647 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method325(-97);
        }
        var2++;
        int var6 = 0;
        var3.field647++;
        int var7 = var3.field647;
        var3.field647 += var2;
        while (var3.field644[var3.field647 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method325(-102);
        }
        var3.field647++;
        int var10 = var3.field647;
        int var11 = 0;
        var6++;
        var3.field647 += var6;
        while (var3.field644[var3.field647 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method325(-98);
        }
        var11++;
        var3.field647++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            int var16 = 1;
            var14[1] = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method316((byte) -119);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class185[] var18 = new class185[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class185 var102 = var18[var19] = new class185();
            int var103 = var3.method316((byte) 96);
            if (var103 > 0) {
                var102.field3234 = new byte[var103 * 2];
            }
            int var104 = var3.method316((byte) 126);
            if (var104 > 0) {
                var102.field3248 = new byte[var104 * 2 + 2];
                var102.field3248[1] = 64;
            }
        }
        int var20 = var3.method316((byte) 97);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var3.method316((byte) 97);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var3.field644[var3.field647 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method325(59);
        }
        var24++;
        var3.field647++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method316((byte) -79);
            this.field3909[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method316((byte) -59);
            this.field3909[var30] = (short) (this.field3909[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length <= var33) {
                    var31 = -1;
                } else {
                    var31 = var25[var33++];
                }
                var32 = var3.method301((byte) 72);
            }
            var31--;
            this.field3909[var34] = (short) (this.field3909[var34] + (class272.method1817(2, var32 - 1) << 14));
            this.field3917[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3917[var38] != 0) {
                if (var36 == 0) {
                    var37 = var3.field644[var7++] - 1;
                    if (var4.length > var35) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field3903[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3917[var42] != 0) {
                if (var41 == 0) {
                    var40 = var3.field644[var10++] + 16 << 2;
                    if (var39 >= var8.length) {
                        var41 = -1;
                    } else {
                        var41 = var8[var39++];
                    }
                }
                var41--;
                this.field3918[var42] = (byte) var40;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class185 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3917[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                var43--;
                this.field3902[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var48 >= var25.length) {
                    var47 = -1;
                } else {
                    var47 = var25[var48++];
                }
                if (this.field3917[var50] > 0) {
                    var49 = var3.method316((byte) -12) + 1;
                }
            }
            var47--;
            this.field3904[var50] = (byte) var49;
        }
        this.field3905 = var3.method316((byte) -83) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class185 var99 = var18[var51];
            if (var99.field3234 != null) {
                for (int var100 = 1; var100 < var99.field3234.length; var100 += 2) {
                    var99.field3234[var100] = var3.method325(-120);
                }
            }
            if (var99.field3248 != null) {
                for (int var101 = 3; var101 < var99.field3248.length - 2; var101 += 2) {
                    var99.field3248[var101] = var3.method325(73);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method325(117);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method325(-111);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class185 var96 = var18[var54];
            if (var96.field3248 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field3248.length; var98 += 2) {
                    var97 = var3.method316((byte) -103) + var97 + 1;
                    var96.field3248[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class185 var93 = var18[var55];
            if (var93.field3234 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field3234.length; var95 += 2) {
                    var94 = var94 + var3.method316((byte) 100) + 1;
                    var93.field3234[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method316((byte) 127);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var3.method316((byte) 96) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field3904[var60] = (byte) (this.field3904[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var59) * var58 + ((var64 - var59) / 2);
                var61 += 2;
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class82.method638((byte) 124, var64 - var59, var66);
                    this.field3904[var67] = (byte) (this.field3904[var67] * var68 + 32 >> 6);
                    var66 += var65 - var58;
                }
                var59 = var64;
                var58 = var65;
            }
            for (int var62 = var59; var62 < 128; var62++) {
                this.field3904[var62] = (byte) (this.field3904[var62] * var58 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var3.method316((byte) 104);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var3.method316((byte) 125) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3918[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3918[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class82.method638((byte) 119, var78 - var71, var80);
                    int var83 = (this.field3918[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    var80 += var79 - var72;
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3918[var81] = (byte) var83;
                }
                var71 = var78;
                var74 += 2;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field3918[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3918[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field3236 = var3.method316((byte) -102);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class185 var92 = var18[var86];
            if (var92.field3234 != null) {
                var92.field3247 = var3.method316((byte) -52);
            }
            if (var92.field3248 != null) {
                var92.field3231 = var3.method316((byte) 112);
            }
            if (var92.field3236 > 0) {
                var92.field3252 = var3.method316((byte) -32);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field3235 = var3.method316((byte) -86);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class185 var91 = var18[var88];
            if (var91.field3235 > 0) {
                var91.field3254 = var3.method316((byte) 8);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class185 var90 = var18[var89];
            if (var90.field3254 > 0) {
                var90.field3246 = var3.method316((byte) -76);
            }
        }
    }
}
