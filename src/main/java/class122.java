import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class122 extends class175 {

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    private int field2244 = 0;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
    private int field2252 = 4;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    private int field2246 = 4;

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
    private int field2257 = 1638;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "[B")
    private byte[] field2248 = new byte[512];

    @OriginalMember(owner = "client!jg", name = "hb", descriptor = "I")
    private int field2262 = 4;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "Z")
    private boolean field2258 = true;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "Lmb;")
    public static class96 field2249 = class243.method1708("Bitte warten Sie)3)3)3", (byte) 125);

    @OriginalMember(owner = "client!jg", name = "jb", descriptor = "[Z")
    public static boolean[] field2264 = new boolean[8];

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "Lha;")
    public static class22 field2250 = new class22(64);

    @OriginalMember(owner = "client!jg", name = "ob", descriptor = "J")
    public static long field2269 = 0L;

    @OriginalMember(owner = "client!jg", name = "nb", descriptor = "I")
    public static int field2268 = 0;

    @OriginalMember(owner = "client!jg", name = "qb", descriptor = "Lmb;")
    public static class96 field2271 = class243.method1708("(R", (byte) 94);

    @OriginalMember(owner = "client!jg", name = "rb", descriptor = "I")
    public static int field2272 = 0;

    @OriginalMember(owner = "client!jg", name = "lb", descriptor = "Lmb;")
    public static class96 field2266 = class243.method1708("Spielwelt erstellt)3", (byte) 91);

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!jg", name = "fb", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!jg", name = "gb", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!jg", name = "ib", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!jg", name = "mb", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!jg", name = "pb", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!jg", name = "kb", descriptor = "Lff;")
    public static class3 field2265;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "Lmb;")
    public static class96 field2247;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "[S")
    private short[] field2245;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "[S")
    private short[] field2254;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int var3 = 39 % ((62 - arg0) / 54);
        ++field2251;
        int[] var4 = super.field3044.method904((byte) -107, arg1);
        if (super.field3044.field2150) {
            this.method934(var4, arg1, 512);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)V")
    public static void method931(byte arg0) {
        field2249 = null;
        field2266 = null;
        field2250 = null;
        field2264 = null;
        field2247 = null;
        field2271 = null;
        field2265 = null;
        if (arg0 < 22) {
            method938(-103, -53);
        }
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(B)V")
    private final void method932(byte arg0) {
        ++field2263;
        if (~this.field2257 >= -1) {
            if (this.field2245 != null && ~this.field2245.length == ~this.field2252) {
                this.field2254 = new short[this.field2252];
                for (int var2 = 0; var2 < this.field2252; ++var2) {
                    this.field2254[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field2245 = new short[this.field2252];
            this.field2254 = new short[this.field2252];
            for (int var3 = 0; ~this.field2252 < ~var3; ++var3) {
                this.field2245[var3] = (short) ((int) (Math.pow((double) ((float) this.field2257 / 4096.0F), (double) var3) * 4096.0D));
                this.field2254[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        int var4 = 78 / ((arg0 - 51) / 49);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/awt/Color;ZIBLmb;)V")
    public static final void method933(Color arg0, boolean arg1, int arg2, byte arg3, class96 arg4) {
        ++field2261;
        try {
            Graphics var5 = class3.field28.getGraphics();
            if (class11.field199 == null) {
                class11.field199 = new Font("Helvetica", 1, 13);
                class274.field4790 = class3.field28.getFontMetrics(class11.field199);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class232.field3979, class168.field2954);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class245.field4259 == null) {
                    class245.field4259 = class3.field28.createImage(304, 34);
                }
                Graphics var6 = class245.field4259.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg2 * 3 + 2, 2, -(arg2 * 3) + 300, 30);
                var6.setFont(class11.field199);
                var6.setColor(Color.white);
                if (arg3 >= -9) {
                    method935(false, (class3) null, (class3) null, -25, -42);
                }
                arg4.method683(var6, (byte) 61, (304 + -arg4.method674(class274.field4790, 0)) / 2, 22);
                var5.drawImage(class245.field4259, class232.field3979 / 2 + -152, class168.field2954 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class232.field3979 / 2 + -152;
                int var8 = class168.field2954 / 2 + -18;
                var5.setColor(arg0);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg2 * 3 + 2 + var7, var8 + 2, -(arg2 * 3) + 300, 30);
                var5.setFont(class11.field199);
                var5.setColor(Color.white);
                arg4.method683(var5, (byte) 61, (304 - arg4.method674(class274.field4790, 0)) / 2 + var7, var8 + 22);
            }
            if (class98.field1668 != null) {
                var5.setFont(class11.field199);
                var5.setColor(Color.white);
                class98.field1668.method683(var5, (byte) 61, class232.field3979 / 2 - class98.field1668.method674(class274.field4790, 0) / 2, class168.field2954 / 2 - 26);
            }
        } catch (Exception var10) {
            class3.field28.repaint();
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        ++field2253;
        this.field2248 = class39.method307((byte) 69, this.field2244);
        this.method932((byte) 112);
        for (int var2 = this.field2252 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field2245[var2];
            if (~var3 < -9 || ~var3 > 7) {
                break;
            }
            --this.field2252;
        }
        if (arg0 != 2) {
            method933((Color) null, true, -28, (byte) 26, (class96) null);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field2256;
        int var4 = -127 / ((-22 - arg0) / 58);
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field2252 = arg2.method1651(4139);
            } else {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field2262 = this.field2246 = arg2.method1651(4139);
                        return;
                    }
                    if (arg1 == 4) {
                        this.field2244 = arg2.method1651(4139);
                        return;
                    }
                    if (arg1 == 5) {
                        this.field2262 = arg2.method1651(4139);
                        return;
                    }
                    if (~arg1 == -7) {
                        this.field2246 = arg2.method1651(4139);
                        return;
                    }
                } else {
                    this.field2257 = arg2.method1627(true);
                    if (this.field2257 < 0) {
                        this.field2245 = new short[this.field2252];
                        for (int var6 = 0; ~var6 > ~this.field2252; ++var6) {
                            this.field2245[var6] = (short) arg2.method1627(true);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field2258 = ~arg2.method1651(4139) == -2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([III)V")
    private final void method934(int[] arg0, int arg1, int arg2) {
        ++field2260;
        if (arg2 == 512) {
            int var4 = class23.field395[arg1] * this.field2246;
            if (~this.field2252 == -2) {
                int var5 = this.field2254[0] << 12;
                int var6 = var4 * var5 >> 12;
                short var7 = this.field2245[0];
                int var8 = this.field2262 * var5 >> 12;
                int var9 = var6 >> 12;
                int var10 = this.field2246 * var5 >> 12;
                int var11 = var6 & 4095;
                int var12 = class211.field3631[var11];
                int var13 = var9 - -1;
                int var14 = 255 & this.field2248[var9 & 255];
                if (var10 <= var13) {
                    var13 = 0;
                }
                int var15 = this.field2248[255 & var13] & 255;
                if (this.field2258) {
                    for (int var16 = 0; var16 < class1.field11; ++var16) {
                        int var17 = class244.field4240[var16] * this.field2262;
                        int var18 = this.method937(var12, var15, var8, var11, var5 * var17 >> 12, arg2 ^ -21024, var14);
                        int var19 = var7 * var18 >> 12;
                        arg0[var16] = 2048 - -(var19 >> 1);
                    }
                } else {
                    for (int var20 = 0; var20 < class1.field11; ++var20) {
                        int var21 = class244.field4240[var20] * this.field2262;
                        int var22 = this.method937(var12, var15, var8, var11, var5 * var21 >> 12, -20512, var14);
                        arg0[var20] = var7 * var22 >> 12;
                    }
                }
            } else {
                short var23 = this.field2245[0];
                if (~var23 < -9 || ~var23 > 7) {
                    int var24 = this.field2254[0] << 12;
                    int var25 = var4 * var24 >> 12;
                    int var26 = this.field2262 * var24 >> 12;
                    int var27 = this.field2246 * var24 >> 12;
                    int var28 = var25 >> 12;
                    int var29 = var25 & 4095;
                    int var30 = var28 + 1;
                    if (var27 <= var30) {
                        var30 = 0;
                    }
                    int var31 = 255 & this.field2248[var28 & 255];
                    int var32 = this.field2248[var30 & 255] & 255;
                    int var33 = class211.field3631[var29];
                    for (int var34 = 0; class1.field11 > var34; ++var34) {
                        int var54 = class244.field4240[var34] * this.field2262;
                        int var55 = this.method937(var33, var32, var26, var29, var24 * var54 >> 12, -20512, var31);
                        arg0[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; var35 < this.field2252; ++var35) {
                    short var36 = this.field2245[var35];
                    if (var36 > 8 || ~var36 > 7) {
                        int var37 = this.field2254[var35] << 12;
                        int var38 = var4 * var37 >> 12;
                        int var39 = this.field2262 * var37 >> 12;
                        int var40 = this.field2246 * var37 >> 12;
                        int var41 = var38 >> 12;
                        int var42 = var38 & 4095;
                        int var43 = class211.field3631[var42];
                        int var44 = this.field2248[var41 & 255] & 255;
                        int var45 = var41 + 1;
                        if (var40 <= var45) {
                            var45 = 0;
                        }
                        int var46 = this.field2248[var45 & 255] & 255;
                        if (this.field2258 && this.field2252 + -1 == var35) {
                            for (int var47 = 0; ~class1.field11 < ~var47; ++var47) {
                                int var48 = class244.field4240[var47] * this.field2262;
                                int var49 = this.method937(var43, var46, var39, var42, var37 * var48 >> 12, arg2 + -21024, var44);
                                int var50 = (var36 * var49 >> 12) + arg0[var47];
                                arg0[var47] = (var50 >> 1) + 2048;
                            }
                        } else {
                            for (int var51 = 0; class1.field11 > var51; ++var51) {
                                int var52 = class244.field4240[var51] * this.field2262;
                                int var53 = this.method937(var43, var46, var39, var42, var37 * var52 >> 12, -20512, var44);
                                arg0[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZLff;Lff;II)Lpb;")
    public static final class247 method935(boolean arg0, class3 arg1, class3 arg2, int arg3, int arg4) {
        if (arg3 != 1779) {
            return null;
        } else {
            ++field2259;
            boolean var5 = true;
            int[] var6 = arg1.method24(0, arg4);
            for (int var7 = 0; var7 < var6.length; ++var7) {
                byte[] var8 = arg1.method33(arg4, false, var6[var7]);
                if (var8 == null) {
                    var5 = false;
                } else {
                    int var9 = 65280 & var8[0] << 8 | 255 & var8[1];
                    byte[] var10;
                    if (arg0) {
                        var10 = arg2.method33(0, false, var9);
                    } else {
                        var10 = arg2.method33(var9, false, 0);
                    }
                    if (var10 == null) {
                        var5 = false;
                    }
                }
            }
            if (!var5) {
                return null;
            } else {
                try {
                    return new class247(arg1, arg2, arg4, arg0);
                } catch (Exception var11) {
                    return null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(III)Lkh;")
    public static final class5 method936(int arg0, int arg1, int arg2) {
        class187 var3 = class259.field4487[arg0][arg1][arg2];
        return var3 != null && var3.field3279 != null ? var3.field3279 : null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIII)I")
    private final int method937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2270;
        int var8 = arg3 + -4096;
        int var9 = arg4 >> 12;
        if (arg5 != -20512) {
            field2272 = -106;
        }
        int var10 = arg4 & 4095;
        int var11 = var10 + -4096;
        int var12 = var9 + 1;
        int var13 = var9 & 255;
        if (~arg2 >= ~var12) {
            var12 = 0;
        }
        int var14 = class211.field3631[var10];
        int var15 = var12 & 255;
        int var16 = this.field2248[arg6 + var13] & 3;
        int var17;
        if (var16 > 1) {
            var17 = ~var16 != -3 ? -arg3 + -var10 : -arg3 + var10;
        } else {
            var17 = var16 != 0 ? -var10 + arg3 : var10 - -arg3;
        }
        int var18 = this.field2248[arg6 + var15] & 3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 != 0 ? -var11 + arg3 : arg3 + var11;
        } else {
            var19 = var18 == 2 ? var11 - arg3 : -arg3 + -var11;
        }
        int var20 = 3 & this.field2248[arg1 + var13];
        int var21 = ((-var17 + var19) * var14 >> 12) + var17;
        int var22;
        if (var20 > 1) {
            var22 = ~var20 == -3 ? -var8 + var10 : -var8 + -var10;
        } else {
            var22 = ~var20 == -1 ? var8 + var10 : var8 - var10;
        }
        int var23 = this.field2248[var15 - -arg1] & 3;
        int var24;
        if (var23 > 1) {
            var24 = ~var23 == -3 ? -var8 + var11 : -var8 + -var11;
        } else {
            var24 = ~var23 == -1 ? var8 + var11 : -var11 + var8;
        }
        int var25 = ((-var22 + var24) * var14 >> 12) + var22;
        return ((-var21 + var25) * arg0 >> 12) + var21;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)I")
    public static final int method938(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class122() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(BI)V")
    public static final void method939(byte arg0, int arg1) {
        if (arg0 <= 92) {
            method936(-66, -86, 121);
        }
        if (~class249.field4308 == -1) {
            class254.field4385.method222((byte) 116, arg1);
        } else {
            class33.field551 = arg1;
        }
        ++field2255;
    }
}
