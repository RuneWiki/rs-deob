import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class680 extends class339 {

    @OriginalMember(owner = "client!ru", name = "E", descriptor = "Ltg;")
    private class605 field9591 = new class605();

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "Lrs;")
    public class166 field9575;

    @OriginalMember(owner = "client!ru", name = "H", descriptor = "I")
    private int field9594;

    @OriginalMember(owner = "client!ru", name = "A", descriptor = "[[B")
    private byte[][] field9587;

    @OriginalMember(owner = "client!ru", name = "qb", descriptor = "[[F")
    private float[][] field9629;

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "[[[I")
    public int[][][] field9583;

    @OriginalMember(owner = "client!ru", name = "jb", descriptor = "[[F")
    private float[][] field9622;

    @OriginalMember(owner = "client!ru", name = "I", descriptor = "[[[I")
    private int[][][] field9595;

    @OriginalMember(owner = "client!ru", name = "db", descriptor = "[[S")
    public short[][] field9616;

    @OriginalMember(owner = "client!ru", name = "B", descriptor = "[[[Lnea;")
    private class151[][][] field9588;

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "[[[I")
    public int[][][] field9581;

    @OriginalMember(owner = "client!ru", name = "R", descriptor = "[[[I")
    public int[][][] field9604;

    @OriginalMember(owner = "client!ru", name = "pb", descriptor = "[[F")
    private float[][] field9628;

    @OriginalMember(owner = "client!ru", name = "V", descriptor = "[[[I")
    private int[][][] field9608;

    @OriginalMember(owner = "client!ru", name = "C", descriptor = "I")
    public int field9589;

    @OriginalMember(owner = "client!ru", name = "mb", descriptor = "[[B")
    private byte[][] field9625;

    @OriginalMember(owner = "client!ru", name = "cb", descriptor = "I")
    private int field9615;

    @OriginalMember(owner = "client!ru", name = "eb", descriptor = "Lpl;")
    private class616 field9617;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "Ltv;")
    private class76 field9580;

    @OriginalMember(owner = "client!ru", name = "W", descriptor = "Lcb;")
    public static class631 field9609 = new class631(49, 3);

    @OriginalMember(owner = "client!ru", name = "Z", descriptor = "Ltg;")
    public static class605 field9612 = new class605();

    @OriginalMember(owner = "client!ru", name = "ab", descriptor = "D")
    public static double field9613;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public static int field9573;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "I")
    public static int field9574;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
    public static int field9576;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "I")
    public static int field9577;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "I")
    public static int field9579;

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "I")
    public static int field9582;

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!ru", name = "F", descriptor = "I")
    public static int field9592;

    @OriginalMember(owner = "client!ru", name = "G", descriptor = "I")
    public static int field9593;

    @OriginalMember(owner = "client!ru", name = "J", descriptor = "I")
    public static int field9596;

    @OriginalMember(owner = "client!ru", name = "K", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!ru", name = "L", descriptor = "I")
    public static int field9598;

    @OriginalMember(owner = "client!ru", name = "M", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!ru", name = "O", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!ru", name = "P", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!ru", name = "Q", descriptor = "I")
    public static int field9603;

    @OriginalMember(owner = "client!ru", name = "S", descriptor = "I")
    private int field9605;

    @OriginalMember(owner = "client!ru", name = "T", descriptor = "I")
    public static int field9606;

    @OriginalMember(owner = "client!ru", name = "U", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!ru", name = "X", descriptor = "I")
    private int field9610;

    @OriginalMember(owner = "client!ru", name = "Y", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!ru", name = "bb", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!ru", name = "hb", descriptor = "I")
    private int field9620;

    @OriginalMember(owner = "client!ru", name = "kb", descriptor = "I")
    private int field9623;

    @OriginalMember(owner = "client!ru", name = "nb", descriptor = "Ljs;")
    private class170 field9626;

    @OriginalMember(owner = "client!ru", name = "fb", descriptor = "Lak;")
    private class497 field9618;

    @OriginalMember(owner = "client!ru", name = "ib", descriptor = "Lak;")
    public class497 field9621;

    @OriginalMember(owner = "client!ru", name = "lb", descriptor = "Lak;")
    public class497 field9624;

    @OriginalMember(owner = "client!ru", name = "ob", descriptor = "Lak;")
    public class497 field9627;

    @OriginalMember(owner = "client!ru", name = "gb", descriptor = "[Lnea;")
    private class151[] field9619;

    @OriginalMember(owner = "client!ru", name = "N", descriptor = "[[[I")
    private int[][][] field9600;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIIII[[Z)V", line = 3)
    public final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field9584;
        if (~this.field9623 < -1) {
            this.field9575.method1311(-68);
            this.field9575.method1238(31, false);
            this.field9575.method1284(false, 5890);
            this.field9575.method1318((byte) -127, false);
            this.field9575.method1263((byte) 104, false);
            this.field9575.method1320(0, false);
            this.field9575.method1327(-64, -2);
            this.field9575.method1306((class487) null, 111);
            class282.field4369[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field9575.field2697) + 1.0F;
            class282.field4369[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field9575.field2726;
            class282.field4369[10] = 0.0F;
            class282.field4369[6] = 0.0F;
            class282.field4369[3] = 0.0F;
            class282.field4369[0] = (float) arg2 / ((float) super.field4958 * 128.0F * (float) this.field9575.field2726);
            class282.field4369[7] = 0.0F;
            class282.field4369[8] = 0.0F;
            class282.field4369[15] = 1.0F;
            class282.field4369[2] = 0.0F;
            class282.field4369[5] = (float) arg2 / ((float) super.field4958 * 128.0F * (float) this.field9575.field2697);
            class282.field4369[11] = 0.0F;
            class282.field4369[9] = 0.0F;
            class282.field4369[1] = 0.0F;
            class282.field4369[14] = 0.0F;
            class282.field4369[4] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class282.field4369, 0);
            class282.field4369[6] = 1.0F;
            class282.field4369[10] = 0.0F;
            class282.field4369[4] = 0.0F;
            class282.field4369[11] = 0.0F;
            class282.field4369[14] = 0.0F;
            class282.field4369[3] = 0.0F;
            class282.field4369[13] = 0.0F;
            class282.field4369[9] = 1.0F;
            class282.field4369[15] = 1.0F;
            class282.field4369[7] = 0.0F;
            class282.field4369[1] = 0.0F;
            class282.field4369[12] = 0.0F;
            class282.field4369[0] = 1.0F;
            class282.field4369[5] = 0.0F;
            class282.field4369[2] = 0.0F;
            class282.field4369[8] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class282.field4369, 0);
            if (~(this.field9589 & 7) != -1) {
                this.field9575.method1284(true, 5890);
                this.field9575.method1325(16385);
            } else {
                this.field9575.method1284(false, 5890);
            }
            this.field9575.method1329(this.field9621, this.field9618, this.field9627, this.field9624, 22);
            if (~this.field9575.field2870.field4543.length > ~(this.field9610 * 2)) {
                this.field9575.field2870 = new class547(this.field9610 * 2);
            } else {
                this.field9575.field2870.field4534 = 0;
            }
            int var9 = 0;
            class547 var10 = this.field9575.field2870;
            if (!this.field9575.field2796) {
                for (int var11 = arg4; var11 < arg6; ++var11) {
                    int var12 = super.field4956 * var11 + arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[var13 - arg3][-arg4 + var11]) {
                            short[] var14 = this.field9616[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    ++var9;
                                    var10.method1969(65535 & var14[var15], (byte) -100);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field4956 * var16 + arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field9616[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var21 > ~var20.length; ++var21) {
                                    ++var9;
                                    var10.method1939(65535 & var20[var21], 1134947720);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class510 var17 = new class510(this.field9575, 5123, var10.field4543, var10.field4534);
                this.field9575.method1315(0, true, 4, var9, var17);
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(III)Z", line = 174)
    public static final boolean method3787(int arg0, int arg1, int arg2) {
        if (arg1 != 18936) {
            return false;
        } else {
            ++field9606;
            return class237.method1630((byte) -63, arg2, arg0) || class515.method3082(arg0, arg2, 117);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lvt;[I)V", line = 186)
    public final void method617(class759 arg0, int[] arg1) {
        this.field9591.method3472(110, new class454(this.field9575, this, arg0, arg1));
        ++field9602;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V", line = 196)
    public static final void method3788(int arg0) {
        ++class165.field2538;
        ++field9578;
        class49.field808 = 0;
        class302.field4606 = 0;
        class261.method1744(arg0 ^ 12497);
        class353.method2261(false);
        class478.method2908(arg0 + -12528);
        boolean var1 = false;
        for (int var2 = 0; class302.field4606 > var2; ++var2) {
            int var5 = class217.field3568[var2];
            class53 var6 = (class53) class332.field4881.method3512(true, (long) var5);
            class461 var7 = var6.field847;
            if (class32.field304 && class218.method1562((byte) 26, var5)) {
                class25.method146((byte) 113);
            }
            if (class165.field2538 != var7.field1635) {
                if (var7.field6688.method3041(arg0 + 53082)) {
                    class4.method13(353, var7);
                }
                var7.method2829(arg0 ^ -7908, (class504) null);
                var1 = true;
                var6.method636((byte) 97);
            }
        }
        if (var1) {
            class271.field4162 = class332.field4881.method3511(0);
            class332.field4881.method3515(class501.field7280, 121);
        }
        if (~class495.field7166 != ~class624.field8742.field4534) {
            throw new RuntimeException("gnp1 pos:" + class624.field8742.field4534 + " psize:" + class495.field7166);
        } else {
            for (int var3 = 0; var3 < class356.field5394; ++var3) {
                if (class332.field4881.method3512(true, (long) class45.field758[var3]) == null) {
                    throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class356.field5394);
                }
            }
            if (~(-class356.field5394 + class271.field4162) != -1) {
                throw new RuntimeException("gnp3 mis:" + (-class356.field5394 + class271.field4162));
            } else {
                for (int var4 = 0; class271.field4162 > var4; ++var4) {
                    if (class165.field2538 != class501.field7280[var4].field847.field1635) {
                        throw new RuntimeException("gnp4 uk:" + class501.field7280[var4].field847.field1628);
                    }
                }
                if (arg0 != 12453) {
                    method3795((byte) 82, 106, (class353[]) null);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V", line = 279)
    public static final void method3789(int arg0) {
        ++field9601;
        int var1 = class618.field8709 * 512 + 256;
        int var2 = class64.field1035 * 512 + 256;
        int var3 = class232.method1611(var2, var1, class582.field8234, (byte) 33) - class197.field3388;
        if (class524.field7552 >= 100) {
            class497.field7212 = class618.field8709 * 512 + 256;
            class329.field4857 = class64.field1035 * 512 + 256;
            class101.field1507 = class232.method1611(class329.field4857, class497.field7212, class582.field8234, (byte) 52) + -class197.field3388;
        } else {
            if (~var1 < ~class497.field7212) {
                class497.field7212 += (var1 - class497.field7212) * class524.field7552 / 1000 + class666.field9459;
                if (~class497.field7212 < ~var1) {
                    class497.field7212 = var1;
                }
            }
            if (~var3 < ~class101.field1507) {
                class101.field1507 += (-class101.field1507 + var3) * class524.field7552 / 1000 + class666.field9459;
                if (var3 < class101.field1507) {
                    class101.field1507 = var3;
                }
            }
            if (var1 < class497.field7212) {
                class497.field7212 -= (-var1 + class497.field7212) * class524.field7552 / 1000 + class666.field9459;
                if (var1 > class497.field7212) {
                    class497.field7212 = var1;
                }
            }
            if (~class329.field4857 > ~var2) {
                class329.field4857 += (-class329.field4857 + var2) * class524.field7552 / 1000 + class666.field9459;
                if (~var2 > ~class329.field4857) {
                    class329.field4857 = var2;
                }
            }
            if (var3 < class101.field1507) {
                class101.field1507 -= (class101.field1507 - var3) * class524.field7552 / 1000 + class666.field9459;
                if (class101.field1507 < var3) {
                    class101.field1507 = var3;
                }
            }
            if (~class329.field4857 < ~var2) {
                class329.field4857 -= (-var2 + class329.field4857) * class524.field7552 / 1000 + class666.field9459;
                if (class329.field4857 < var2) {
                    class329.field4857 = var2;
                }
            }
        }
        int var4 = class379.field5702 * 512 - -256;
        int var5 = class168.field2922 * 512 + 256;
        int var6 = class232.method1611(var5, var4, class582.field8234, (byte) 77) + -class632.field8875;
        int var7 = -class497.field7212 + var4;
        int var8 = -class101.field1507 + var6;
        int var9 = -class329.field4857 + var5;
        int var10 = (int) Math.sqrt((double) (var7 * var7 - -(var9 * var9)));
        if (arg0 >= -38) {
            field9609 = null;
        }
        int var11 = (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var10)) & 16383;
        int var12 = 16383 & (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9));
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (~var11 < -3073) {
            var11 = 3072;
        }
        if (var11 > class81.field1167) {
            class81.field1167 += (var11 - class81.field1167 >> 3) * class188.field3134 / 1000 + class366.field5581 << 3;
            if (class81.field1167 > var11) {
                class81.field1167 = var11;
            }
        }
        if (var11 < class81.field1167) {
            class81.field1167 -= (-var11 + class81.field1167 >> 3) * class188.field3134 / 1000 + class366.field5581 << 3;
            if (var11 > class81.field1167) {
                class81.field1167 = var11;
            }
        }
        int var13 = -class608.field8587 + var12;
        if (~var13 < -8193) {
            var13 -= 16384;
        }
        if (~var13 > 8191) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (~var14 < -1) {
            class608.field8587 += class366.field5581 - -(class188.field3134 * var14 / 1000) << 3;
            class608.field8587 &= 16383;
        }
        if (var14 < 0) {
            class608.field8587 -= -var14 * class188.field3134 / 1000 + class366.field5581 << 3;
            class608.field8587 &= 16383;
        }
        int var15 = var12 - class608.field8587;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class40.field714 = 0;
        if (var15 < 0 && ~var14 < -1 || ~var15 < -1 && var14 < 0) {
            class608.field8587 = var12;
        }
    }

    @OriginalMember(owner = "client!ru", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 436)
    public final void method623(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field9574;
        class267 var15 = this.field9575.field7764;
        if (arg3 != null && this.field9595 == null) {
            this.field9595 = new int[super.field4956][super.field4960][];
        }
        if (arg5 != null && this.field9600 == null) {
            this.field9600 = new int[super.field4956][super.field4960][];
        }
        this.field9604[arg0][arg1] = arg2;
        this.field9583[arg0][arg1] = arg4;
        this.field9581[arg0][arg1] = arg6;
        this.field9608[arg0][arg1] = arg7;
        if (this.field9600 != null) {
            this.field9600[arg0][arg1] = arg5;
        }
        if (this.field9595 != null) {
            this.field9595[arg0][arg1] = arg3;
        }
        class151[] var16 = this.field9588[arg0][arg1] = new class151[arg6.length];
        for (int var17 = 0; var17 < arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((32 & this.field9589) != 0 && ~var18 != 0 && var15.method1774(58, var18).field8062) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) (var19 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) var18;
            class65 var22;
            for (var22 = this.field9617.method3512(true, var20); var22 != null; var22 = this.field9617.method3513(-1)) {
                class151 var23 = (class151) var22;
                if (var23.field2365 == var18 && (float) var19 == var23.field2364 && ~var23.field2354 == ~arg10 && ~var23.field2363 == ~arg11 && ~var23.field2371 == ~arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class151(this, var18, var19, arg10, arg11, arg12);
                this.field9617.method3516(255, var20, var16[var17]);
            } else {
                var16[var17] = (class151) var22;
            }
        }
        if (arg13) {
            this.field9587[arg0][arg1] = (byte) class112.method903(this.field9587[arg0][arg1], 1);
        }
        if (~this.field9620 > ~arg6.length) {
            this.field9620 = arg6.length;
        }
        this.field9623 += arg6.length;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(II)Lbu;", line = 517)
    public static final class147 method3790(int arg0, int arg1) {
        ++field9611;
        if (arg0 != -12624) {
            field9613 = 0.5920875181458447D;
        }
        class147[] var2 = class552.method3217(57);
        for (int var3 = 0; var2.length > var3; ++var3) {
            class147 var4 = var2[var3];
            if (var4.field2303 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ru", name = "YA", descriptor = "()V", line = 543)
    public final void method615() {
        if (this.field9623 <= 0) {
            this.field9580 = null;
        } else {
            byte[][] var1 = new byte[super.field4956 + 1][super.field4960 - -1];
            for (int var2 = 1; ~var2 > ~super.field4956; ++var2) {
                for (int var103 = 1; ~super.field4960 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field9625[var2][var103 + -1] >> 2) + (this.field9625[var2][var103 + 1] >> 3) + (this.field9625[var2][var103] >> 1) + (this.field9625[var2 + -1][var103] >> 2) + (this.field9625[var2 + 1][var103] >> 3));
                }
            }
            this.field9619 = new class151[this.field9617.method3511(0)];
            this.field9617.method3515(this.field9619, -107);
            for (int var3 = 0; var3 < this.field9619.length; ++var3) {
                this.field9619[var3].method1149(this.field9623, 4);
            }
            int var4 = 24;
            if (this.field9600 != null) {
                var4 += 4;
            }
            if ((this.field9589 & 7) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field9575.field2754.method2591(this.field9623 * var4, false);
            Stream var6 = new Stream(var5);
            class151[] var7 = new class151[this.field9623];
            int var8 = class602.method3455(this.field9623 / 4, false);
            if (~var8 > -2) {
                var8 = 1;
            }
            class616 var9 = new class616(var8);
            class151[] var10 = new class151[this.field9620];
            for (int var11 = 0; ~super.field4956 < ~var11; ++var11) {
                for (int var30 = 0; var30 < super.field4960; ++var30) {
                    if (this.field9581[var11][var30] != null) {
                        class151[] var31 = this.field9588[var11][var30];
                        int[] var32 = this.field9604[var11][var30];
                        int[] var33 = this.field9583[var11][var30];
                        int[] var34 = this.field9608[var11][var30];
                        int[] var35 = this.field9581[var11][var30];
                        int[] var36 = this.field9595 == null ? null : this.field9595[var11][var30];
                        int[] var37 = this.field9600 != null ? this.field9600[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field9622[var11][var30];
                        float var39 = this.field9628[var11][var30];
                        float var40 = this.field9629[var11][var30];
                        float var41 = this.field9622[var11][var30 - -1];
                        float var42 = this.field9628[var11][var30 + 1];
                        float var43 = this.field9629[var11][var30 + 1];
                        float var44 = this.field9622[var11 + 1][var30 + 1];
                        float var45 = this.field9628[var11 + 1][var30 + 1];
                        float var46 = this.field9629[var11 - -1][var30 + 1];
                        float var47 = this.field9622[var11 + 1][var30];
                        float var48 = this.field9628[var11 + 1][var30];
                        float var49 = this.field9629[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = var1[var11 - -1][var30 + 1] & 255;
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label339: for (int var55 = 0; ~var35.length < ~var55; ++var55) {
                            class151 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field9616[super.field4956 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; var57 < var35.length; ++var57) {
                            int var58 = (var11 << super.field4962) - -var32[var57];
                            int var59 = (var30 << super.field4962) + var33[var57];
                            int var60 = var58 >> this.field9594;
                            int var61 = var59 >> this.field9594;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16);
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            int var72;
                            float var73;
                            float var74;
                            float var75;
                            if (~var67 == -1 && var68 == 0) {
                                var72 = var69 - var50;
                                var73 = var38;
                                var74 = var40;
                                var75 = var39;
                            } else if (var67 == 0 && ~super.field4958 == ~var68) {
                                var75 = var42;
                                var72 = var69 - var51;
                                var74 = var43;
                                var73 = var41;
                            } else if (super.field4958 == var67 && super.field4958 == var68) {
                                var73 = var44;
                                var75 = var45;
                                var72 = var69 - var52;
                                var74 = var46;
                            } else if (super.field4958 == var67 && var68 == 0) {
                                var73 = var47;
                                var75 = var48;
                                var74 = var49;
                                var72 = var69 - var53;
                            } else {
                                float var76 = (float) var67 / (float) super.field4958;
                                float var77 = (float) var68 / (float) super.field4958;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                float var83 = (var46 - var43) * var76 + var43;
                                var73 = (var81 - var78) * var77 + var78;
                                var75 = (-var79 + var82) * var77 + var79;
                                var74 = (-var80 + var83) * var77 + var80;
                                int var84 = ((var53 - var50) * var67 >> super.field4962) + var50;
                                int var85 = var51 - -((-var51 + var52) * var67 >> super.field4962);
                                var72 = var69 - (((-var84 + var85) * var68 >> super.field4962) + var84);
                            }
                            if (~var62 != 0) {
                                int var86 = (127 & var62) * var72 >> 7;
                                if (var86 >= 2) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class510.field7397[65408 & var62 | var86];
                                if ((7 & this.field9589) == 0) {
                                    float var87 = this.field9575.field2868[2] * var74 + this.field9575.field2868[0] * var73 + this.field9575.field2868[1] * var75;
                                    var71 = (var87 > 0.0F ? this.field9575.field2792 : this.field9575.field2855) * var87 + this.field9575.field2795;
                                }
                            }
                            class65 var88 = null;
                            if ((var58 & this.field9615 + -1) == 0 && (this.field9615 - 1 & var59) == 0) {
                                var88 = var9.method3512(true, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (~var62 == ~var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (127 & var63) * var72 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var89 = class510.field7397[var63 & 65408 | var90];
                                    if ((this.field9589 & 7) == 0) {
                                        float var91 = this.field9575.field2868[2] * var74 + this.field9575.field2868[0] * var73 + this.field9575.field2868[1] * var75;
                                        float var92 = (!(var71 > 0.0F) ? this.field9575.field2855 : this.field9575.field2792) * var71 + this.field9575.field2795;
                                        int var93 = 255 & var89 >> 16;
                                        int var94 = (65448 & var89) >> 8;
                                        int var95 = 255 & var89;
                                        int var96 = (int) ((float) var93 * var92);
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var96 < 0) {
                                            var96 = 0;
                                        } else if (var96 > 255) {
                                            var96 = 255;
                                        }
                                        if (~var97 <= -1) {
                                            if (~var97 < -256) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var95 * var92);
                                        if (var98 >= 0) {
                                            if (~var98 < -256) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var98 | var96 << 16 | var97 << 8;
                                    }
                                }
                                if (this.field9575.field2796) {
                                    var6.method2576((float) var58);
                                    var6.method2576((float) (this.method2162(var59, 1, var58) + var64));
                                    var6.method2576((float) var59);
                                    var6.method2574((byte) (var89 >> 16));
                                    var6.method2574((byte) (var89 >> 8));
                                    var6.method2574((byte) var89);
                                    var6.method2574(-1);
                                    var6.method2576((float) var58);
                                    var6.method2576((float) var59);
                                    if (this.field9600 != null) {
                                        var6.method2576((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field9589) != -1) {
                                        var6.method2576(var73);
                                        var6.method2576(var75);
                                        var6.method2576(var74);
                                    }
                                } else {
                                    var6.method2579((float) var58);
                                    var6.method2579((float) (var64 + this.method2162(var59, 1, var58)));
                                    var6.method2579((float) var59);
                                    var6.method2574((byte) (var89 >> 16));
                                    var6.method2574((byte) (var89 >> 8));
                                    var6.method2574((byte) var89);
                                    var6.method2574(-1);
                                    var6.method2579((float) var58);
                                    var6.method2579((float) var59);
                                    if (this.field9600 != null) {
                                        var6.method2579((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((7 & this.field9589) != 0) {
                                        var6.method2579(var73);
                                        var6.method2579(var75);
                                        var6.method2579(var74);
                                    }
                                }
                                var99 = this.field9605++;
                                var56[var57] = (short) var99;
                                if (var62 != -1) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method3516(255, var65, new class486(var56[var57]));
                            } else {
                                var56[var57] = ((class486) var88).field7028;
                                var99 = var56[var57] & 65535;
                                if (~var62 != 0 && var31[var57].field1039 < var7[var99].field1039) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method1152(69, var71, var99, var72, var70);
                            }
                            ++this.field9610;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field9605; ++var12) {
                class151 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1150((byte) -118, var12);
                }
            }
            for (int var13 = 0; var13 < super.field4956; ++var13) {
                for (int var18 = 0; super.field4960 > var18; ++var18) {
                    short[] var19 = this.field9616[super.field4956 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class151 var25 = var7[var22];
                            class151 var26 = var7[var23];
                            class151 var27 = var7[var24];
                            class151 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1147((byte) 100, var20, var13, var18);
                            }
                            if (var26 != null) {
                                var26.method1147((byte) 110, var20, var13, var18);
                                if (var28 == null || var26.field1039 < var28.field1039) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1147((byte) 107, var20, var13, var18);
                                if (var28 == null || ~var28.field1039 < ~var27.field1039) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1150((byte) -116, var22);
                                }
                                if (var26 != null) {
                                    var28.method1150((byte) -120, var23);
                                }
                                if (var27 != null) {
                                    var28.method1150((byte) -119, var24);
                                }
                                var28.method1147((byte) 81, var20, var13, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2573();
            this.field9626 = this.field9575.method1336(var4, var6.method2577(), 121, var5, false);
            this.field9624 = new class497(this.field9626, 5126, 3, 0);
            this.field9618 = new class497(this.field9626, 5121, 4, 12);
            byte var14;
            if (this.field9600 == null) {
                var14 = 24;
                this.field9627 = new class497(this.field9626, 5126, 2, 16);
            } else {
                this.field9627 = new class497(this.field9626, 5126, 3, 16);
                var14 = 28;
            }
            if (~(this.field9589 & 7) != -1) {
                this.field9621 = new class497(this.field9626, 5126, 3, var14);
            }
            long[] var15 = new long[this.field9619.length];
            for (int var16 = 0; ~this.field9619.length < ~var16; ++var16) {
                class151 var17 = this.field9619[var16];
                var15[var16] = var17.field1039;
                var17.method1151(this.field9605, (byte) -100);
            }
            class724.method3997(var15, this.field9619, (byte) 3);
            if (this.field9580 != null) {
                this.field9580.method685((byte) 99);
            }
        }
        ++field9576;
        this.field9595 = null;
        this.field9604 = this.field9583 = null;
        this.field9581 = null;
        this.field9622 = this.field9628 = this.field9629 = null;
        this.field9600 = null;
        this.field9617 = null;
        this.field9588 = null;
        this.field9608 = null;
        this.field9625 = null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILofa;)Lwda;", line = 1122)
    public static final class165 method3791(int arg0, class301 arg1) {
        ++field9579;
        class70 var2 = class425.method2652(arg1, (byte) -42);
        int var3 = arg1.method1934(-2);
        int var4 = arg1.method1934(-2);
        if (arg0 < 106) {
            field9613 = 0.3746159956371716D;
        }
        int var5 = arg1.method1989((byte) -77);
        return new class165(var2.field1081, var2.field1075, var2.field1082, var2.field1079, var2.field1076, var2.field1078, var2.field1071, var2.field1074, var2.field1073, var3, var4, var5);
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)V", line = 1143)
    public static void method3792(int arg0) {
        field9609 = null;
        if (arg0 != 0) {
            method3790(9, 1);
        }
        field9612 = null;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lnj;III)V", line = 1159)
    private final void method3793(class711 arg0, int arg1, int arg2, int arg3) {
        ++field9599;
        int[] var5 = this.field9604[arg2][arg1];
        int[] var6 = this.field9583[arg2][arg1];
        int var7 = var5.length;
        if (~var7 < ~this.field9575.field2908.length) {
            this.field9575.field2908 = new int[var7];
            this.field9575.field2904 = new int[var7];
        }
        int[] var8 = this.field9575.field2908;
        int[] var9 = this.field9575.field2904;
        for (int var10 = 0; ~var7 < ~var10; ++var10) {
            var8[var10] = var5[var10] >> this.field9575.field2756;
            var9[var10] = var6[var10] >> this.field9575.field2756;
        }
        int var11 = 0;
        while (~var7 < ~var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((var15 - var17) * (-var14 + var12) - (-var13 + var15) * (-var14 + var16) > 0) {
                arg0.method3936(var13, var17, var14, var16, var15, (byte) -98, var12);
            }
        }
        if (arg3 != -11480) {
            field9609 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lrs;IIII[[I[[II)V", line = 1221)
    public class680(class166 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field9575 = arg0;
        this.field9594 = super.field4962 + -2;
        this.field9587 = new byte[arg3][arg4];
        this.field9629 = new float[super.field4956 + 1][super.field4960 + 1];
        this.field9583 = new int[arg3][arg4][];
        this.field9622 = new float[super.field4956 + 1][super.field4960 - -1];
        this.field9595 = new int[arg3][arg4][];
        this.field9616 = new short[arg3 * arg4][];
        this.field9588 = new class151[arg3][arg4][];
        this.field9581 = new int[arg3][arg4][];
        this.field9604 = new int[arg3][arg4][];
        this.field9628 = new float[super.field4956 + 1][super.field4960 + 1];
        this.field9608 = new int[arg3][arg4][];
        this.field9589 = arg2;
        this.field9625 = new byte[arg3 + 1][arg4 + 1];
        this.field9615 = 1 << this.field9594;
        for (int var9 = 1; ~super.field4960 < ~var9; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field4956; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] + -arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var11 * var11 + var12 * var12)));
                this.field9622[var10][var9] = (float) var11 * var13;
                this.field9628[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field9629[var10][var9] = (float) var12 * var13;
            }
        }
        this.field9617 = new class616(128);
        if ((16 & this.field9589) != 0) {
            this.field9580 = new class76(this.field9575, this);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(III[[ZZI)V", line = 1279)
    public final void method628(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method3794(-1, arg5, arg1, arg0, arg4, arg2, arg3, (byte) -118);
        ++field9596;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIZI[[ZB)V", line = 1288)
    private final void method3794(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean[][] arg6, byte arg7) {
        if (this.field9619 != null) {
            int var9 = arg5 + 1 + arg5;
            int var10 = var9 * var9;
            if (~this.field9575.field2903.length > ~var10) {
                this.field9575.field2903 = new int[var10];
            }
            if (this.field9575.field2870.field4543.length < this.field9610 * 2) {
                this.field9575.field2870 = new class547(this.field9610 * 2);
            }
            int var11 = arg3 - arg5;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg5 + arg2;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg3 + arg5;
            if (var15 > super.field4956 - 1) {
                var15 = super.field4956 + -1;
            }
            int var16 = arg2 - -arg5;
            if (var16 > super.field4960 + -1) {
                var16 = super.field4960 + -1;
            }
            int var17 = 0;
            int[] var18 = this.field9575.field2903;
            for (int var19 = var11; var15 >= var19; ++var19) {
                boolean[] var25 = arg6[-var12 + var19];
                for (int var26 = var13; ~var16 <= ~var26; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field4956 * var26 - -var19;
                    }
                }
            }
            if (arg0 == -1) {
                this.field9575.method1331((byte) -70);
            } else {
                this.field9575.method1316((byte) -128, (float) arg0);
                this.field9575.method1309(25508);
            }
            this.field9575.method1284(~(7 & this.field9589) != -1, 5890);
            for (int var20 = 0; ~var20 > ~this.field9619.length; ++var20) {
                this.field9619[var20].method1153(0, var18, var17);
            }
            if (!this.field9591.method3473(false)) {
                int var21 = this.field9575.field2883;
                int var22 = this.field9575.field2893;
                this.field9575.method253(0, var22, this.field9575.field2794);
                this.field9575.method1284(false, 5890);
                this.field9575.method1263((byte) 104, false);
                this.field9575.method1320(128, false);
                this.field9575.method1327(100, -2);
                this.field9575.method1306(this.field9575.field2823, 46);
                this.field9575.method1256(7681, -4, 8448);
                this.field9575.method1239(0, 34166, 768, 770);
                this.field9575.method1264(34167, 2, 0, 770);
                for (class65 var23 = this.field9591.method3463((byte) -50); var23 != null; var23 = this.field9591.method3469((byte) 107)) {
                    class454 var24 = (class454) var23;
                    var24.method2786(arg3, arg5, arg2, arg6, false);
                }
                this.field9575.method1239(0, 5890, 768, 768);
                this.field9575.method1264(5890, 2, 0, 770);
                this.field9575.method1306((class487) null, 89);
                this.field9575.method253(var21, var22, this.field9575.field2794);
            }
            if (this.field9580 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field9575.method1329((class497) null, (class497) null, this.field9627, this.field9624, -108);
                this.field9580.method688(arg3, arg5, arg4, arg2, (byte) 103, arg6);
                OpenGL.glPopMatrix();
            }
        }
        ++field9582;
        if (arg7 >= -115) {
            field9614 = 29;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 1437)
    public final boolean method624(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9590;
        if (this.field9580 != null && arg0 != null) {
            int var7 = arg1 - (this.field9575.field2881 * arg2 >> 8) >> this.field9575.field2756;
            int var8 = -(this.field9575.field2829 * arg2 >> 8) + arg3 >> this.field9575.field2756;
            return this.field9580.method684(5123, var8, var7, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI[Lraa;)V", line = 1454)
    public static final void method3795(byte arg0, int arg1, class353[] arg2) {
        ++field9585;
        int var3 = 0;
        if (arg0 > -37) {
            method3791(96, (class301) null);
        }
        while (~var3 > ~arg2.length) {
            class353 var4 = arg2[var3];
            if (var4 != null && ~var4.field5202 == ~arg1 && !client.method2739(var4)) {
                if (~var4.field5306 == -1) {
                    method3795((byte) -97, var4.field5349, arg2);
                    if (var4.field5335 != null) {
                        method3795((byte) -102, var4.field5349, var4.field5335);
                    }
                    class520 var5 = (class520) class36.field340.method3512(true, (long) var4.field5349);
                    if (var5 != null) {
                        class292.method1900(1592, var5.field7511);
                    }
                }
                if (var4.field5306 == 6 && ~var4.field5290 != 0) {
                    class82 var6 = class83.field1219.method2358((byte) 58, var4.field5290);
                    if (var6 != null) {
                        var4.field5266 += class83.field1223;
                        int var7 = var4.field5242;
                        while (true) {
                            if (~var4.field5266 >= ~var6.field1211[var4.field5242]) {
                                if (var4.field5242 != var7) {
                                    class144.method1111(var4.field5242, var6, (byte) 117);
                                }
                                break;
                            }
                            var4.field5266 -= var6.field1211[var4.field5242];
                            ++var4.field5242;
                            if (~var4.field5242 <= ~var6.field1197.length) {
                                var4.field5242 -= var6.field1179;
                                if (var4.field5242 < 0 || ~var4.field5242 <= ~var6.field1197.length) {
                                    var4.field5242 = 0;
                                }
                            }
                            var4.field5245 = var4.field5242 + 1;
                            if (var4.field5245 >= var6.field1197.length) {
                                var4.field5245 -= var6.field1179;
                                if (var4.field5245 < 0 || ~var6.field1197.length >= ~var4.field5245) {
                                    var4.field5245 = -1;
                                }
                            }
                            class717.method3960(var4, (byte) 60);
                        }
                    }
                }
            }
            ++var3;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)V", line = 1556)
    public final void method622(int arg0, int arg1) {
        ++field9598;
    }

    @OriginalMember(owner = "client!ru", name = "ka", descriptor = "(III)V", line = 1564)
    public final void method625(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(this.field9625[arg0][arg1] & 255)) {
            this.field9625[arg0][arg1] = (byte) arg2;
        }
        ++field9573;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IILla;JIIZ)V", line = 1580)
    public static final void method3796(int arg0, int arg1, class422 arg2, long arg3, int arg4, int arg5, boolean arg6) {
        ++field9577;
        if (arg0 > -41) {
            method3787(12, -47, -112);
        }
        class494.method3005(arg3, arg6, 0, arg2, arg4, -124, arg5, arg1);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZLqg;)I", line = 1591)
    public static final int method3797(boolean arg0, class266 arg1) {
        if (!arg0) {
            method3790(-37, -44);
        }
        ++field9607;
        if (class527.field7583 != arg1) {
            if (class547.field7814 == arg1) {
                return 34065;
            } else if (class544.field7759 == arg1) {
                return 34066;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 9216;
        }
    }

    @OriginalMember(owner = "client!ru", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 1614)
    public final void method618(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9592;
        if (this.field9580 != null && arg0 != null) {
            int var7 = -(this.field9575.field2881 * arg2 >> 8) + arg1 >> this.field9575.field2756;
            int var8 = -(this.field9575.field2829 * arg2 >> 8) + arg3 >> this.field9575.field2756;
            this.field9580.method689(var8, arg0, var7, 88);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1635)
    public final void method632(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field9586;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
        int var27 = 0;
        for (int var28 = 0; var28 < var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method623(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ru", name = "fa", descriptor = "(IILr;)Lr;", line = 1721)
    public final class706 method626(int arg0, int arg1, class706 arg2) {
        ++field9593;
        if (~(1 & this.field9587[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field4958 >> this.field9575.field2756;
            class711 var5 = (class711) arg2;
            class711 var6;
            if (var5 != null && var5.method3941(-21017, var4, var4)) {
                var6 = var5;
                var5.method3937(-97);
            } else {
                var6 = new class711(this.field9575, var4, var4);
            }
            var6.method3939(0, var4, 0, 0, var4);
            this.method3793(var6, arg1, arg0, -11480);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ru", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 1756)
    public final void method621(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9597;
        if (this.field9580 != null && arg0 != null) {
            int var7 = -(this.field9575.field2881 * arg2 >> 8) + arg1 >> this.field9575.field2756;
            int var8 = -(this.field9575.field2829 * arg2 >> 8) + arg3 >> this.field9575.field2756;
            this.field9580.method690(var7, arg0, 0, var8);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(III[[ZZII)V", line = 1780)
    public final void method630(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field9603;
        this.method3794(arg5, arg6, arg1, arg0, arg4, arg2, arg3, (byte) -125);
    }
}
