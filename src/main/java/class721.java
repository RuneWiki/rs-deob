import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class721 extends class293 {

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "F")
    private float field10560 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "F")
    private float field10589 = -3.4028235E38F;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lat;")
    private class398 field10586 = new class398();

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    private int field10555;

    @OriginalMember(owner = "client!kb", name = "mb", descriptor = "Lgca;")
    public class261 field10569;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "[[[I")
    private int[][][] field10556;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "[[[I")
    public int[][][] field10546;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "[[[I")
    public int[][][] field10584;

    @OriginalMember(owner = "client!kb", name = "qb", descriptor = "[[F")
    private float[][] field10599;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    private int field10565;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "[[[Lbs;")
    private class718[][][] field10558;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "[[[I")
    private int[][][] field10548;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "[[B")
    private byte[][] field10580;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "[[F")
    private float[][] field10592;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "[[S")
    public short[][] field10553;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "[[F")
    private float[][] field10597;

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "[[B")
    private byte[][] field10600;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "[[[I")
    public int[][][] field10550;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public int field10562;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "Lqr;")
    private class69 field10596;

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "Lvo;")
    private class44 field10572;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field10601 = new String[] { method5241(method5240("\tK^'JJ")), method5241(method5240("\f\\\u001c\u0012")), method5241(method5240("\tK^Bb\f@\u0004@#")), method5241(method5240("\u0019\u0007^Pv")), method5241(method5240("\tK^5#")), method5241(method5240("\tK^\u0015jJ")), method5241(method5240("\tK^\tjJ")), method5241(method5240("\tK^8#")), method5241(method5240("\tK^2#")), method5241(method5240("\tK^=JJ")), method5241(method5240("\tK^\u0018jJ")), method5241(method5240("\tK^+#")), method5241(method5240("\tK^:#")), method5241(method5240("\tK^9#")), method5241(method5240("\tK^=#")), method5241(method5240("\tK^0#")), method5241(method5240("\tK^3#")), method5241(method5240("\tK^<#")), method5241(method5240("\tK^;#")), method5241(method5240("\tK^6#")), method5241(method5240("\tK^7#")), method5241(method5240("\tK^?#")), method5241(method5240("\tK^4#")) };

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "Lpe;")
    public static class636 field10574 = new class636(15, 0, 1, 0);

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field10585 = -1;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
    public static int field10588 = 0;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "Lhl;")
    public static class556 field10583 = new class556(122, 7);

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!kb", name = "pb", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public static int field10554;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field10557;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
    public static int field10559;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field10561;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field10563;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field10564;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field10566;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public static int field10568;

    @OriginalMember(owner = "client!kb", name = "ob", descriptor = "I")
    public static int field10570;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field10571;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    public static int field10573;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    private int field10575;

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
    public static int field10576;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field10577;

    @OriginalMember(owner = "client!kb", name = "nb", descriptor = "I")
    private int field10579;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field10581;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field10582;

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "I")
    public static int field10587;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    private int field10594;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    private int field10598;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "Luh;")
    public static class174 field10567;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "Lgaa;")
    public class313 field10593;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "Lfk;")
    private class682 field10591;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "Lfk;")
    private class682 field10595;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "[I")
    public static int[] field10578;

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "[Lbs;")
    private class718[] field10590;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "[[[I")
    private int[][][] field10549;

    @OriginalMember(owner = "client!kb", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method701(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field10554;
            if (this.field10572 != null && arg0 != null) {
                int var7 = -(this.field10569.field4204 * arg2 >> 8) + arg1 >> this.field10569.field4210;
                int var8 = -(this.field10569.field4175 * arg2 >> 8) + arg3 >> this.field10569.field4210;
                this.field10572.method453((byte) -46, var7, arg0, var8);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field10601[6] + (arg0 != null ? field10601[3] : field10601[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V")
    public static final void method5233(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field10551;
            if (arg3 != -13870) {
                field10578 = null;
            }
            class551 var5 = class380.method3113(43, (long) arg1, 8);
            var5.method4086(83);
            var5.field8081 = arg4;
            var5.field8073 = arg2;
            var5.field8076 = arg0;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field10601[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[[ZZI)V")
    public final void method711(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        try {
            ++field10568;
            this.method5238(arg0, arg4, arg5, 9216, arg3, -1, arg2, arg1);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10601[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10601[3] : field10601[1]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
    public final void method700(int arg0, int arg1) {
        try {
            ++field10561;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10601[17] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "fa", descriptor = "(IILr;)Lr;")
    public final class192 method712(int arg0, int arg1, class192 arg2) {
        try {
            ++field10547;
            if ((this.field10580[arg0][arg1] & 1) == 0) {
                return null;
            } else {
                int var4 = super.field4702 >> this.field10569.field4210;
                class254 var5 = (class254) arg2;
                class254 var6;
                if (var5 != null && var5.method2149((byte) -109, var4, var4)) {
                    var6 = var5;
                    var5.method2150((byte) 31);
                } else {
                    var6 = new class254(this.field10569, var4, var4);
                }
                var6.method2148(0, var4, -1959768272, 0, var4);
                this.method5234(var6, (byte) 63, arg0, arg1);
                return var6;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10601[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10601[3] : field10601[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        try {
            ++field10570;
            if (~this.field10594 < -1) {
                class414 var9 = this.field10569.method2276(-114, this.field10575);
                int var10 = 0;
                int var11 = 32767;
                int var12 = -32768;
                for (int var13 = 0; ~var13 > -5; ++var13) {
                    var10 = 0;
                    Buffer var14 = var9.method3305(43, true);
                    if (var14 != null) {
                        Stream var15 = this.field10569.method2227(var14, (byte) 85);
                        if (!Stream.method5108()) {
                            for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                                int var17 = super.field4704 * var16 - -arg3;
                                for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                                    if (arg7[-arg3 + var18][-arg4 + var16]) {
                                        short[] var19 = this.field10553[var17];
                                        if (var19 != null) {
                                            for (int var20 = 0; var19.length > var20; ++var20) {
                                                int var21 = var19[var20] & 65535;
                                                if (var21 > var12) {
                                                    var12 = var21;
                                                }
                                                if (var11 > var21) {
                                                    var11 = var21;
                                                }
                                                var15.method5101(var21);
                                                ++var10;
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else {
                            for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                                int var23 = super.field4704 * var22 + arg3;
                                for (int var24 = arg3; ~var24 > ~arg5; ++var24) {
                                    if (arg7[-arg3 + var24][-arg4 + var22]) {
                                        short[] var25 = this.field10553[var23];
                                        if (var25 != null) {
                                            for (int var26 = 0; ~var25.length < ~var26; ++var26) {
                                                int var27 = var25[var26] & 65535;
                                                ++var10;
                                                if (var27 < var11) {
                                                    var11 = var27;
                                                }
                                                if (~var27 < ~var12) {
                                                    var12 = var27;
                                                }
                                                var15.method5104(var27);
                                            }
                                        }
                                    }
                                    ++var23;
                                }
                            }
                        }
                        var15.method5097();
                        if (var9.method3307(114)) {
                            break;
                        }
                    }
                }
                if (~var10 < -1) {
                    this.field10569.method2222(false);
                    this.field10569.method2209(false, -32);
                    this.field10569.method2241((byte) -30, false);
                    this.field10569.method2250(false, (byte) -31);
                    this.field10569.method2230((byte) 120, false);
                    this.field10569.method2254(0, 108);
                    this.field10569.method2263(false, -2, (byte) 93, false);
                    this.field10569.method2233((byte) -108, (class399) null);
                    class615 var28 = this.field10569.method2253(-29405);
                    float[] var29 = this.field10569.method2278((byte) -52);
                    var29[15] = 1.0F;
                    var29[2] = 0.0F;
                    var29[9] = 0.0F;
                    var29[10] = 1.0F / (-this.field10560 + this.field10589);
                    var29[11] = 0.0F;
                    var29[3] = 0.0F;
                    var29[1] = 0.0F;
                    var29[5] = (float) arg2 / ((float) super.field4702 * 128.0F * (float) this.field10569.field3947);
                    var29[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field10569.field3947) + 1.0F;
                    var29[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field10569.field4015) + -1.0F;
                    var29[8] = 0.0F;
                    var29[4] = 0.0F;
                    var29[0] = (float) arg2 / ((float) super.field4702 * 128.0F * (float) this.field10569.field4015);
                    var29[6] = 0.0F;
                    var29[7] = 0.0F;
                    var29[14] = -this.field10560 / (this.field10589 - this.field10560);
                    var28.method4485(1.0F, 1.0F, 79, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
                    this.field10569.method2221(-15031);
                    this.field10569.method2277(12587);
                    if (~(this.field10562 & 7) == -1) {
                        this.field10569.method2241((byte) -30, false);
                    } else {
                        this.field10569.method2241((byte) -30, true);
                        this.field10569.method1028((byte) -128);
                    }
                    this.field10569.method1075(false, (byte) 110);
                    this.field10569.method1036(this.field10595, 0, 2);
                    this.field10569.method1036(this.field10591, 1, 2);
                    this.field10569.method1042((byte) 123, this.field10593);
                    this.field10569.method1064(-var11 + var12 + 1, var11, (byte) -33, 0, class356.field5727, var9, var10 / 3);
                    this.field10569.method1075(true, (byte) 100);
                }
            }
        } catch (RuntimeException var31) {
            throw class590.method4333(var31, field10601[22] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field10601[3] : field10601[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Luha;BII)V")
    private final void method5234(class254 arg0, byte arg1, int arg2, int arg3) {
        try {
            ++field10552;
            int var5 = -23 / ((arg1 - -24) / 54);
            int[] var6 = this.field10550[arg2][arg3];
            int[] var7 = this.field10546[arg2][arg3];
            int var8 = var6.length;
            if (~var8 < ~class176.field2810.length) {
                class687.field9929 = new int[var8];
                class176.field2810 = new int[var8];
            }
            for (int var9 = 0; var9 < var8; ++var9) {
                class176.field2810[var9] = var6[var9] >> this.field10569.field4210;
                class687.field9929[var9] = var7[var9] >> this.field10569.field4210;
            }
            int var10 = 0;
            while (~var8 < ~var10) {
                int var11 = class176.field2810[var10];
                int var12 = class687.field9929[var10++];
                int var13 = class176.field2810[var10];
                int var14 = class687.field9929[var10++];
                int var15 = class176.field2810[var10];
                int var16 = class687.field9929[var10++];
                if (~((var11 - var13) * (-var16 + var14) + -((var15 - var13) * (-var12 + var14))) < -1) {
                    arg0.method2151(0, var16, var13, var14, var12, var11, var15);
                }
            }
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field10601[19] + (arg0 != null ? field10601[3] : field10601[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
    public static void method5235(boolean arg0) {
        try {
            field10578 = null;
            if (!arg0) {
                method5233(-46, -120, -52, 52, -58);
            }
            field10583 = null;
            field10567 = null;
            field10574 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10601[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lfg;B)I")
    public static final int method5236(class136 arg0, byte arg1) {
        try {
            if (arg1 > -120) {
                method5235(false);
            }
            ++field10587;
            if (class636.field9125 == arg0) {
                return 9216;
            } else if (class235.field3624 == arg0) {
                return 34065;
            } else if (class62.field835 == arg0) {
                return 34066;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10601[7] + (arg0 != null ? field10601[3] : field10601[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[[ZZII)V")
    public final void method703(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        try {
            ++field10557;
            this.method5238(arg0, arg4, arg6, 9216, arg3, arg5, arg2, arg1);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field10601[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10601[3] : field10601[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method716(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field10566;
            if (this.field10572 != null && arg0 != null) {
                int var7 = -(this.field10569.field4204 * arg2 >> 8) + arg1 >> this.field10569.field4210;
                int var8 = -(this.field10569.field4175 * arg2 >> 8) + arg3 >> this.field10569.field4210;
                return this.field10572.method449(var7, -109, var8, arg0);
            } else {
                return false;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field10601[12] + (arg0 != null ? field10601[3] : field10601[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method5237(String arg0, int arg1) {
        try {
            ++field10559;
            if (arg0 != null) {
                String var2 = class788.method5662((byte) 118, arg0);
                if (var2 != null) {
                    for (int var3 = 0; ~var3 > ~class223.field3504; ++var3) {
                        String var4 = class140.field1959[var3];
                        String var5 = class788.method5662((byte) 104, var4);
                        if (class334.method2818(true, arg0, var4, var5, var2)) {
                            --class223.field3504;
                            for (int var6 = var3; ~class223.field3504 < ~var6; ++var6) {
                                class140.field1959[var6] = class140.field1959[var6 + 1];
                                class15.field175[var6] = class15.field175[var6 - -1];
                                class794.field11607[var6] = class794.field11607[var6 + 1];
                                class242.field3741[var6] = class242.field3741[var6 + 1];
                                class230.field3573[var6] = class230.field3573[var6 - -1];
                            }
                            ++class498.field7477;
                            class361.field5817 = class318.field5182;
                            class164 var7 = class193.method1785(false);
                            class487 var8 = class618.method4519(110, class617.field8915, var7.field2659);
                            var8.field7362.method1678(class126.method1216(-105, arg0), 65280);
                            var8.field7362.method1681(arg0, 23137);
                            var7.method1546(var8, 1);
                            break;
                        }
                    }
                    if (arg1 != 1) {
                        method5235(true);
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field10601[21] + (arg0 != null ? field10601[3] : field10601[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "YA", descriptor = "()V")
    public final void method702() {
        try {
            if (this.field10594 <= 0) {
                this.field10572 = null;
            } else {
                byte[][] var1 = new byte[super.field4704 - -1][super.field4697 - -1];
                for (int var2 = 1; ~var2 > ~super.field4704; ++var2) {
                    for (int var3 = 1; ~super.field4697 < ~var3; ++var3) {
                        var1[var2][var3] = (byte) ((this.field10600[var2][var3] >> 1) + (this.field10600[var2][var3 + -1] >> 2) + (this.field10600[var2 - -1][var3] >> 3) + (this.field10600[var2][var3 + 1] >> 3) + (this.field10600[var2 + -1][var3] >> 2));
                    }
                }
                class718[] var4 = new class718[this.field10596.method733((byte) 38)];
                this.field10596.method732(-14248, var4);
                for (int var5 = 0; var4.length > var5; ++var5) {
                    var4[var5].method5212((byte) 102, this.field10594);
                }
                int var6 = 20;
                if (this.field10549 != null) {
                    var6 += 4;
                }
                if (~(this.field10562 & 7) != -1) {
                    var6 += 12;
                }
                NativeHeapBuffer var7 = this.field10569.field4091.method5095(this.field10594 * 4, false);
                NativeHeapBuffer var8 = this.field10569.field4091.method5095(this.field10594 * var6, false);
                Stream var9 = new Stream(var8);
                Stream var10 = new Stream(var7);
                class718[] var11 = new class718[this.field10594];
                int var12 = class663.method4812(false, this.field10594 / 4);
                if (~var12 > -2) {
                    var12 = 1;
                }
                class69 var13 = new class69(var12);
                class718[] var14 = new class718[this.field10598];
                for (int var15 = 0; ~var15 > ~super.field4704; ++var15) {
                    for (int var16 = 0; super.field4697 > var16; ++var16) {
                        if (this.field10584[var15][var16] != null) {
                            class718[] var17 = this.field10558[var15][var16];
                            int[] var18 = this.field10550[var15][var16];
                            int[] var19 = this.field10546[var15][var16];
                            int[] var20 = this.field10548[var15][var16];
                            int[] var21 = this.field10584[var15][var16];
                            int[] var22 = this.field10556 == null ? null : this.field10556[var15][var16];
                            int[] var23 = this.field10549 != null ? this.field10549[var15][var16] : null;
                            if (var20 == null) {
                                var20 = var21;
                            }
                            float var24 = this.field10597[var15][var16];
                            float var25 = this.field10599[var15][var16];
                            float var26 = this.field10592[var15][var16];
                            float var27 = this.field10597[var15][var16 + 1];
                            float var28 = this.field10599[var15][var16 + 1];
                            float var29 = this.field10592[var15][var16 + 1];
                            float var30 = this.field10597[var15 - -1][var16 - -1];
                            float var31 = this.field10599[var15 + 1][var16 + 1];
                            float var32 = this.field10592[var15 + 1][var16 + 1];
                            float var33 = this.field10597[var15 - -1][var16];
                            float var34 = this.field10599[var15 - -1][var16];
                            float var35 = this.field10592[var15 + 1][var16];
                            int var36 = var1[var15][var16] & 255;
                            int var37 = var1[var15][var16 - -1] & 255;
                            int var38 = var1[var15 + 1][var16 + 1] & 255;
                            int var39 = 255 & var1[var15 + 1][var16];
                            int var40 = 0;
                            label406: for (int var41 = 0; var21.length > var41; ++var41) {
                                class718 var42 = var17[var41];
                                for (int var43 = 0; ~var43 > ~var40; ++var43) {
                                    if (var14[var43] == var42) {
                                        continue label406;
                                    }
                                }
                                var14[var40++] = var42;
                            }
                            short[] var44 = this.field10553[super.field4704 * var16 + var15] = new short[var21.length];
                            for (int var45 = 0; var45 < var21.length; ++var45) {
                                int var46 = (var15 << super.field4706) + var18[var45];
                                int var47 = (var16 << super.field4706) + var19[var45];
                                int var48 = var46 >> this.field10555;
                                int var49 = var47 >> this.field10555;
                                int var50 = var21[var45];
                                int var51 = var20[var45];
                                int var52 = var22 == null ? 0 : var22[var45];
                                long var53 = (long) var49 | (long) var50 << 32 | (long) var51 << 48 | (long) (var48 << 16);
                                int var55 = var18[var45];
                                int var56 = var19[var45];
                                byte var57 = 74;
                                int var58 = 0;
                                float var59 = 1.0F;
                                float var60;
                                float var61;
                                float var62;
                                int var63;
                                if (var55 == 0 && var56 == 0) {
                                    var60 = var26;
                                    var61 = var24;
                                    var62 = var25;
                                    var63 = var57 - var36;
                                } else if (var55 == 0 && ~super.field4702 == ~var56) {
                                    var61 = var27;
                                    var63 = var57 - var37;
                                    var62 = var28;
                                    var60 = var29;
                                } else if (super.field4702 == var55 && super.field4702 == var56) {
                                    var61 = var30;
                                    var63 = var57 - var38;
                                    var60 = var32;
                                    var62 = var31;
                                } else if (~super.field4702 == ~var55 && var56 == 0) {
                                    var60 = var35;
                                    var61 = var33;
                                    var63 = var57 - var39;
                                    var62 = var34;
                                } else {
                                    float var64 = (float) var55 / (float) super.field4702;
                                    float var65 = (float) var56 / (float) super.field4702;
                                    float var66 = (var33 - var24) * var64 + var24;
                                    float var67 = (-var25 + var34) * var64 + var25;
                                    float var68 = (var35 - var26) * var64 + var26;
                                    float var69 = (var30 - var27) * var64 + var27;
                                    float var70 = (-var28 + var31) * var64 + var28;
                                    var61 = (var69 - var66) * var65 + var66;
                                    float var71 = (var32 - var29) * var64 + var29;
                                    var62 = (var70 - var67) * var65 + var67;
                                    var60 = (-var68 + var71) * var65 + var68;
                                    int var72 = ((-var36 + var39) * var55 >> super.field4706) + var36;
                                    int var73 = ((-var37 + var38) * var55 >> super.field4706) + var37;
                                    var63 = var57 - (((-var72 + var73) * var56 >> super.field4706) + var72);
                                }
                                if (var50 != -1) {
                                    int var74 = (127 & var50) * var63 >> 7;
                                    if (~var74 > -3) {
                                        var74 = 2;
                                    } else if (var74 > 126) {
                                        var74 = 126;
                                    }
                                    var58 = class613.field8810[var50 & 65408 | var74];
                                    if (~(7 & this.field10562) == -1) {
                                        float var75 = this.field10569.field4185[2] * var60 + this.field10569.field4185[0] * var61 + this.field10569.field4185[1] * var62;
                                        var59 = this.field10569.field4192 + var75 * (var75 > 0.0F ? this.field10569.field4139 : this.field10569.field4163);
                                    }
                                }
                                class568 var76 = null;
                                if ((var46 & this.field10565 - 1) == 0 && (this.field10565 + -1 & var47) == 0) {
                                    var76 = var13.method737((byte) -39, var53);
                                }
                                int var87;
                                if (var76 == null) {
                                    int var77;
                                    if (~var50 == ~var51) {
                                        var77 = var58;
                                    } else {
                                        int var78 = (var51 & 127) * var63 >> 7;
                                        if (var78 < 2) {
                                            var78 = 2;
                                        } else if (~var78 < -127) {
                                            var78 = 126;
                                        }
                                        var77 = class613.field8810[var78 | var51 & 65408];
                                        if (~(7 & this.field10562) == -1) {
                                            float var79 = this.field10569.field4185[2] * var60 + this.field10569.field4185[0] * var61 + this.field10569.field4185[1] * var62;
                                            float var80 = this.field10569.field4192 + var59 * (!(var59 > 0.0F) ? this.field10569.field4163 : this.field10569.field4139);
                                            int var81 = (var77 & 16737137) >> 16;
                                            int var82 = (65299 & var77) >> 8;
                                            int var83 = var77 & 255;
                                            int var84 = (int) ((float) var81 * var80);
                                            if (~var84 <= -1) {
                                                if (var84 > 255) {
                                                    var84 = 255;
                                                }
                                            } else {
                                                var84 = 0;
                                            }
                                            int var85 = (int) ((float) var82 * var80);
                                            int var86 = (int) ((float) var83 * var80);
                                            if (var85 < 0) {
                                                var85 = 0;
                                            } else if (var85 > 255) {
                                                var85 = 255;
                                            }
                                            if (var86 >= 0) {
                                                if (~var86 < -256) {
                                                    var86 = 255;
                                                }
                                            } else {
                                                var86 = 0;
                                            }
                                            var77 = var86 | var84 << 16 | var85 << 8;
                                        }
                                    }
                                    if (!Stream.method5108()) {
                                        var9.method5106((float) var46);
                                        var9.method5106((float) (var52 + this.method2497((byte) -85, var46, var47)));
                                        var9.method5106((float) var47);
                                        var9.method5106((float) var46);
                                        var9.method5106((float) var47);
                                        if (this.field10549 != null) {
                                            var9.method5106((float) (var23 == null ? 0 : var23[var45] + -1));
                                        }
                                        if (~(this.field10562 & 7) != -1) {
                                            var9.method5106(var61);
                                            var9.method5106(var62);
                                            var9.method5106(var60);
                                        }
                                    } else {
                                        var9.method5109((float) var46);
                                        var9.method5109((float) (var52 + this.method2497((byte) -89, var46, var47)));
                                        var9.method5109((float) var47);
                                        var9.method5109((float) var46);
                                        var9.method5109((float) var47);
                                        if (this.field10549 != null) {
                                            var9.method5109((float) (var23 != null ? var23[var45] + -1 : 0));
                                        }
                                        if (~(7 & this.field10562) != -1) {
                                            var9.method5109(var61);
                                            var9.method5109(var62);
                                            var9.method5109(var60);
                                        }
                                    }
                                    if (~this.field10569.field4138 != -1) {
                                        var10.method5098(var77 | -16777216);
                                    } else {
                                        var10.method5099(var77 | -16777216);
                                    }
                                    var87 = this.field10579++;
                                    var44[var45] = (short) var87;
                                    if (~var50 != 0) {
                                        var11[var87] = var17[var45];
                                    }
                                    var13.method738(new class794(var44[var45]), var53, -12002);
                                } else {
                                    var44[var45] = ((class794) var76).field11605;
                                    var87 = 65535 & var44[var45];
                                    if (~var50 != 0 && ~var17[var45].field8252 > ~var11[var87].field8252) {
                                        var11[var87] = var17[var45];
                                    }
                                }
                                for (int var88 = 0; ~var40 < ~var88; ++var88) {
                                    var14[var88].method5216(-256, var58, var87, var59, var63);
                                }
                                ++this.field10575;
                            }
                        }
                    }
                }
                for (int var89 = 0; ~this.field10579 < ~var89; ++var89) {
                    class718 var90 = var11[var89];
                    if (var90 != null) {
                        var90.method5218(var89, (byte) -19);
                    }
                }
                for (int var91 = 0; super.field4704 > var91; ++var91) {
                    for (int var92 = 0; super.field4697 > var92; ++var92) {
                        short[] var93 = this.field10553[super.field4704 * var92 - -var91];
                        if (var93 != null) {
                            int var94 = 0;
                            int var95 = 0;
                            while (var95 < var93.length) {
                                int var96 = 65535 & var93[var95++];
                                int var97 = 65535 & var93[var95++];
                                int var98 = var93[var95++] & 65535;
                                class718 var99 = var11[var96];
                                class718 var100 = var11[var97];
                                class718 var101 = var11[var98];
                                class718 var102 = null;
                                if (var99 != null) {
                                    var102 = var99;
                                    var99.method5219(var91, 1, var92, var94);
                                }
                                if (var100 != null) {
                                    var100.method5219(var91, 1, var92, var94);
                                    if (var102 == null || ~var100.field8252 > ~var102.field8252) {
                                        var102 = var100;
                                    }
                                }
                                if (var101 != null) {
                                    var101.method5219(var91, 1, var92, var94);
                                    if (var102 == null || ~var102.field8252 < ~var101.field8252) {
                                        var102 = var101;
                                    }
                                }
                                if (var102 != null) {
                                    if (var99 != null) {
                                        var102.method5218(var96, (byte) -36);
                                    }
                                    if (var100 != null) {
                                        var102.method5218(var97, (byte) -85);
                                    }
                                    if (var101 != null) {
                                        var102.method5218(var98, (byte) -22);
                                    }
                                    var102.method5219(var91, 1, var92, var94);
                                }
                                ++var94;
                            }
                        }
                    }
                }
                var9.method5097();
                var10.method5097();
                this.field10591 = this.field10569.method1030(false, false);
                this.field10591.method3931(4, 123, this.field10579 * 4, var7);
                this.field10595 = this.field10569.method1030(false, false);
                this.field10595.method3931(var6, 51, this.field10579 * var6, var8);
                if ((this.field10562 & 7) != 0) {
                    if (this.field10549 != null) {
                        this.field10593 = this.field10569.method1051(14, new class482[] { new class482(new class771[] { class771.field11297, class771.field11304, class771.field11303, class771.field11298 }), new class482(class771.field11300) });
                    } else {
                        this.field10593 = this.field10569.method1051(14, new class482[] { new class482(new class771[] { class771.field11297, class771.field11304, class771.field11298 }), new class482(class771.field11300) });
                    }
                } else if (this.field10549 == null) {
                    this.field10593 = this.field10569.method1051(14, new class482[] { new class482(new class771[] { class771.field11297, class771.field11304 }), new class482(class771.field11300) });
                } else {
                    this.field10593 = this.field10569.method1051(14, new class482[] { new class482(new class771[] { class771.field11297, class771.field11304, class771.field11303 }), new class482(class771.field11300) });
                }
                int var103 = 0;
                for (int var104 = 0; var104 < var4.length; ++var104) {
                    if (~var4[var104].field10500 < -1) {
                        var4[var103++] = var4[var104];
                    }
                }
                this.field10590 = new class718[var103];
                long[] var105 = new long[var103];
                for (int var106 = 0; var106 < var103; ++var106) {
                    class718 var107 = var4[var106];
                    var105[var106] = var107.field8252;
                    this.field10590[var106] = var107;
                    var107.method5214((byte) 72, this.field10579);
                }
                class447.method3490(var105, -91, this.field10590);
                if (this.field10572 != null) {
                    this.field10572.method447(-102);
                }
            }
            ++field10564;
            this.field10597 = this.field10599 = this.field10592 = null;
            this.field10550 = this.field10546 = null;
            this.field10556 = null;
            this.field10596 = null;
            this.field10600 = null;
            this.field10558 = null;
            this.field10548 = null;
            this.field10549 = null;
            this.field10584 = null;
        } catch (RuntimeException var109) {
            throw class590.method4333(var109, field10601[0] + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZII[[ZIII)V")
    private final void method5238(int arg0, boolean arg1, int arg2, int arg3, boolean[][] arg4, int arg5, int arg6, int arg7) {
        try {
            ++field10573;
            if (arg3 != 9216) {
                this.field10555 = -105;
            }
            if (this.field10590 != null) {
                int var9 = arg6 + 1 - -arg6;
                int var10 = var9 * var9;
                if (class12.field138.length < var10) {
                    class12.field138 = new int[var10];
                }
                int var11 = -arg6 + arg0;
                int var12 = var11;
                if (var11 < 0) {
                    var11 = 0;
                }
                int var13 = -arg6 + arg7;
                int var14 = var13;
                if (var13 < 0) {
                    var13 = 0;
                }
                int var15 = arg0 + arg6;
                if (super.field4704 - 1 < var15) {
                    var15 = super.field4704 + -1;
                }
                int var16 = arg7 - -arg6;
                class128.field1843 = 0;
                if (~(super.field4697 + -1) > ~var16) {
                    var16 = super.field4697 - 1;
                }
                for (int var17 = var11; ~var15 <= ~var17; ++var17) {
                    boolean[] var18 = arg4[-var12 + var17];
                    for (int var19 = var13; ~var19 >= ~var16; ++var19) {
                        if (var18[var19 - var14]) {
                            class12.field138[class128.field1843++] = super.field4704 * var19 + var17;
                        }
                    }
                }
                if (arg5 == -1) {
                    this.field10569.method2220((byte) -87);
                } else {
                    this.field10569.method2259((byte) -64, (float) arg5);
                    this.field10569.method2251(1);
                }
                this.field10569.method2239(-19527);
                this.field10569.method2241((byte) -30, (this.field10562 & 7) != 0);
                this.field10569.method2263(false, -1, (byte) 93, false);
                this.field10569.method1036(this.field10595, 0, arg3 + -9214);
                for (int var20 = 0; var20 < this.field10590.length; ++var20) {
                    this.field10590[var20].method5211(arg3 ^ -13903, class12.field138, class128.field1843);
                }
                class615 var21 = this.field10569.method2253(-29405);
                var21.method2465(0, -1, 0);
                this.field10569.method2277(12587);
                if (!this.field10586.method3217((byte) -113)) {
                    int var22 = this.field10569.field4170;
                    int var23 = this.field10569.field4205;
                    this.field10569.method237(0, var23, this.field10569.field4232);
                    this.field10569.method2241((byte) -30, false);
                    this.field10569.method2230((byte) 66, false);
                    this.field10569.method2254(128, 122);
                    this.field10569.method2263(false, -2, (byte) 93, false);
                    this.field10569.method2233((byte) -98, this.field10569.field4149);
                    this.field10569.method2223(class434.field6809, class734.field10762, (byte) 114);
                    this.field10569.method2262((byte) -68, class119.field1723, 0);
                    this.field10569.method2248((byte) -109, class186.field2964, 0);
                    for (class568 var24 = this.field10586.method3228(11); var24 != null; var24 = this.field10586.method3216(true)) {
                        class504 var25 = (class504) var24;
                        var25.method3799(arg7, arg4, arg0, (byte) -106, arg6);
                    }
                    this.field10569.method2262((byte) 111, class339.field5532, 0);
                    this.field10569.method2248((byte) -109, class339.field5532, 0);
                    this.field10569.method2233((byte) -71, (class399) null);
                    this.field10569.method237(var22, var23, this.field10569.field4232);
                }
                if (this.field10572 != null) {
                    this.field10569.method1036(this.field10595, 0, 2);
                    this.field10569.method1036(this.field10591, 1, arg3 + -9214);
                    this.field10569.method1042((byte) 123, this.field10593);
                    this.field10572.method454(arg1, 1, arg0, arg6, arg7, arg4);
                    return;
                }
            }
        } catch (RuntimeException var27) {
            throw class590.method4333(var27, field10601[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10601[3] : field10601[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method705(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        try {
            ++field10563;
            class158 var15 = this.field10569.field864;
            if (arg3 != null && this.field10556 == null) {
                this.field10556 = new int[super.field4704][super.field4697][];
            }
            if (arg5 != null && this.field10549 == null) {
                this.field10549 = new int[super.field4704][super.field4697][];
            }
            this.field10550[arg0][arg1] = arg2;
            this.field10546[arg0][arg1] = arg4;
            this.field10584[arg0][arg1] = arg6;
            this.field10548[arg0][arg1] = arg7;
            if (this.field10549 != null) {
                this.field10549[arg0][arg1] = arg5;
            }
            if (this.field10556 != null) {
                this.field10556[arg0][arg1] = arg3;
            }
            class718[] var16 = this.field10558[arg0][arg1] = new class718[arg6.length];
            for (int var17 = 0; ~arg6.length < ~var17; ++var17) {
                int var18 = arg8[var17];
                int var19 = arg9[var17];
                if ((32 & this.field10562) != 0 && ~var18 != 0 && var15.method1419(var18, -86).field4890) {
                    var19 = 128;
                    var18 = -1;
                }
                long var20 = (long) var18 | (long) (var19 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
                class568 var22;
                for (var22 = this.field10596.method737((byte) -39, var20); var22 != null; var22 = this.field10596.method739(true)) {
                    class718 var23 = (class718) var22;
                    if (~var23.field10495 == ~var18 && (float) var19 == var23.field10510 && var23.field10503 == arg10 && ~var23.field10506 == ~arg11 && var23.field10507 == arg12) {
                        break;
                    }
                }
                if (var22 == null) {
                    var16[var17] = new class718(this, var18, var19, arg10, arg11, arg12);
                    this.field10596.method738(var16[var17], var20, -12002);
                } else {
                    var16[var17] = (class718) var22;
                }
            }
            if (arg13) {
                this.field10580[arg0][arg1] = (byte) class553.method4099(this.field10580[arg0][arg1], 1);
            }
            if (arg6.length > this.field10598) {
                this.field10598 = arg6.length;
            }
            this.field10594 += arg6.length;
        } catch (RuntimeException var25) {
            throw class590.method4333(var25, field10601[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10601[3] : field10601[1]) + ',' + (arg3 != null ? field10601[3] : field10601[1]) + ',' + (arg4 != null ? field10601[3] : field10601[1]) + ',' + (arg5 != null ? field10601[3] : field10601[1]) + ',' + (arg6 != null ? field10601[3] : field10601[1]) + ',' + (arg7 != null ? field10601[3] : field10601[1]) + ',' + (arg8 != null ? field10601[3] : field10601[1]) + ',' + (arg9 != null ? field10601[3] : field10601[1]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lgca;IIII[[I[[II)V")
    public class721(class261 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        try {
            this.field10555 = super.field4706 + -2;
            this.field10569 = arg0;
            this.field10556 = new int[arg3][arg4][];
            this.field10546 = new int[arg3][arg4][];
            this.field10584 = new int[arg3][arg4][];
            this.field10599 = new float[super.field4704 + 1][super.field4697 + 1];
            this.field10565 = 1 << this.field10555;
            this.field10558 = new class718[arg3][arg4][];
            this.field10548 = new int[arg3][arg4][];
            this.field10580 = new byte[arg3][arg4];
            this.field10592 = new float[super.field4704 + 1][super.field4697 + 1];
            this.field10553 = new short[arg3 * arg4][];
            this.field10597 = new float[super.field4704 + 1][super.field4697 + 1];
            this.field10600 = new byte[arg3 + 1][arg4 + 1];
            this.field10550 = new int[arg3][arg4][];
            this.field10562 = arg2;
            for (int var9 = 0; var9 <= super.field4697; ++var9) {
                for (int var10 = 0; ~var10 >= ~super.field4704; ++var10) {
                    int var11 = super.field4700[var10][var9];
                    if ((float) var11 > this.field10589) {
                        this.field10589 = (float) var11;
                    }
                    if (this.field10560 > (float) var11) {
                        this.field10560 = (float) var11;
                    }
                    if (var10 > 0 && ~var9 < -1 && var10 < super.field4704 && super.field4697 > var9) {
                        int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                        int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 - (-(arg7 * arg7 * 4) - var13 * var13))));
                        this.field10597[var10][var9] = (float) var12 * var14;
                        this.field10599[var10][var9] = (float) (-arg7 * 2) * var14;
                        this.field10592[var10][var9] = (float) var13 * var14;
                    }
                }
            }
            ++this.field10589;
            --this.field10560;
            this.field10596 = new class69(128);
            if (~(this.field10562 & 16) != -1) {
                this.field10572 = new class44(this.field10569, this);
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field10601[2] + (arg0 != null ? field10601[3] : field10601[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10601[3] : field10601[1]) + ',' + (arg6 != null ? field10601[3] : field10601[1]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)[Lmm;")
    public static final class292[] method5239(byte arg0) {
        try {
            if (arg0 >= -73) {
                field10578 = null;
            }
            ++field10576;
            return new class292[] { class209.field3267, class678.field9642, class262.field4272 };
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10601[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lih;[I)V")
    public final void method713(class731 arg0, int[] arg1) {
        try {
            ++field10582;
            this.field10586.method3220(new class504(this.field10569, this, arg0, arg1), 0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10601[15] + (arg0 != null ? field10601[3] : field10601[1]) + ',' + (arg1 != null ? field10601[3] : field10601[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method715(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        try {
            ++field10571;
            int var18 = arg9.length;
            int[] var19 = new int[var18 * 3];
            int[] var20 = new int[var18 * 3];
            int[] var21 = new int[var18 * 3];
            int[] var22 = new int[var18 * 3];
            int[] var23 = new int[var18 * 3];
            int[] var24 = new int[var18 * 3];
            int[] var25 = arg3 != null ? new int[var18 * 3] : null;
            int[] var26 = arg5 != null ? new int[var18 * 3] : null;
            int var27 = 0;
            for (int var28 = 0; ~var18 < ~var28; ++var28) {
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
                var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
                if (arg3 != null) {
                    var25[var27] = arg3[var31];
                }
                if (arg5 != null) {
                    var26[var27] = arg5[var31];
                }
                ++var27;
            }
            this.method705(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
        } catch (RuntimeException var33) {
            throw class590.method4333(var33, field10601[18] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10601[3] : field10601[1]) + ',' + (arg3 != null ? field10601[3] : field10601[1]) + ',' + (arg4 != null ? field10601[3] : field10601[1]) + ',' + (arg5 != null ? field10601[3] : field10601[1]) + ',' + (arg6 != null ? field10601[3] : field10601[1]) + ',' + (arg7 != null ? field10601[3] : field10601[1]) + ',' + (arg8 != null ? field10601[3] : field10601[1]) + ',' + (arg9 != null ? field10601[3] : field10601[1]) + ',' + (arg10 != null ? field10601[3] : field10601[1]) + ',' + (arg11 != null ? field10601[3] : field10601[1]) + ',' + (arg12 != null ? field10601[3] : field10601[1]) + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + arg16 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method714(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field10581;
            if (this.field10572 != null && arg0 != null) {
                int var7 = -(this.field10569.field4204 * arg2 >> 8) + arg1 >> this.field10569.field4210;
                int var8 = -(this.field10569.field4175 * arg2 >> 8) + arg3 >> this.field10569.field4210;
                this.field10572.method450(var8, arg0, true, var7);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field10601[9] + (arg0 != null ? field10601[3] : field10601[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "ka", descriptor = "(III)V")
    public final void method706(int arg0, int arg1, int arg2) {
        try {
            if ((this.field10600[arg0][arg1] & 255) < arg2) {
                this.field10600[arg0][arg1] = (byte) arg2;
            }
            ++field10577;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10601[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5240(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5241(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 112;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
