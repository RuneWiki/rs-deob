import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class124 extends class252 {

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "[Ljd;")
    public static class85[] field2198 = new class85[500];

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "Lve;")
    public static class184 field2191 = new class184(64);

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "I")
    public static int field2199 = 1;

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "Ljd;")
    public static class85 field2200 = class221.method1499("welle:", (byte) -63);

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!nk", name = "gb", descriptor = "J")
    public static long field2201;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "[Lsh;")
    private class203[] field2194;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[[I)V")
    private final void method847(int arg0, int[][] arg1) {
        ++field2192;
        int var3 = class140.field2422;
        int var4 = class5.field63;
        class236.method1573(-94, arg1);
        class68.method458(-2, 0, 0, class25.field360, class67.field1233);
        if (this.field2194 != null) {
            for (int var5 = 0; this.field2194.length > var5; ++var5) {
                class203 var6 = this.field2194[var5];
                int var7 = var6.field3536;
                int var8 = var6.field3539;
                if (~var7 <= -1) {
                    if (~var8 > -1) {
                        var6.method742(var3, (byte) -53, var4);
                    } else {
                        var6.method744(true, var3, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method739(20241, var4, var3);
                }
            }
        }
        if (arg0 > -96) {
            this.method149(11, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field2193;
        if (arg1 != -55) {
            return null;
        } else {
            int[] var3 = super.field4356.method868(arg0, (byte) 120);
            if (super.field4356.field2258) {
                this.method847(-100, super.field4356.method864((byte) -98));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field2197;
        int[][] var3 = super.field4350.method155(arg0, false);
        if (super.field4350.field338) {
            int var4 = class5.field63;
            int var5 = class140.field2422;
            int[][][] var6 = super.field4350.method153(0);
            int[][] var7 = new int[var5][var4];
            this.method847(arg1 ^ 2, var7);
            for (int var8 = 0; ~var8 > ~class140.field2422; ++var8) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[0];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class5.field63; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class135.method899(4080, var15 << 4);
                    var11[var14] = class135.method899(65280, var15) >> 4;
                    var12[var14] = class135.method899(4080, var15 >> 12);
                }
            }
        }
        if (arg1 != -123) {
            method848((class255) null, (byte) 116);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljb;B)V")
    public static final void method848(class255 arg0, byte arg1) {
        ++field2188;
        if (arg1 > 13) {
            int var2 = arg0.field4519;
            if (~var2 == -325) {
                if (class100.field1791 == -1) {
                    class100.field1791 = arg0.field4521;
                    class206.field3602 = arg0.field4429;
                }
                if (!class161.field2771.field3079) {
                    arg0.field4521 = class206.field3602;
                } else {
                    arg0.field4521 = class100.field1791;
                }
            } else if (~var2 == -326) {
                if (class100.field1791 == -1) {
                    class206.field3602 = arg0.field4429;
                    class100.field1791 = arg0.field4521;
                }
                if (!class161.field2771.field3079) {
                    arg0.field4521 = class100.field1791;
                } else {
                    arg0.field4521 = class206.field3602;
                }
            } else if (~var2 == -328) {
                arg0.field4416 = 150;
                arg0.field4394 = (int) (256.0D * Math.sin((double) class151.field2555 / 40.0D)) & 2047;
                arg0.field4492 = 5;
                arg0.field4425 = -1;
            } else if (~var2 == -329) {
                if (class22.field308.field762 == null) {
                    arg0.field4425 = 0;
                } else {
                    arg0.field4416 = 150;
                    arg0.field4394 = (int) (256.0D * Math.sin((double) class151.field2555 / 40.0D)) & 2047;
                    arg0.field4492 = 5;
                    arg0.field4425 = 2047 + ((int) class22.field308.field762.method624(false) << 11);
                    arg0.field4497 = class22.field308.field1032;
                    arg0.field4426 = class22.field308.field1057;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method849(int arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        ++field2196;
        if (~var2 == -8365) {
            return 128;
        } else {
            if (arg0 < 111) {
                method851(false);
            }
            if (~var2 >= -1 || ~var2 <= -257) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field2195;
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field4338 = arg0.method1711((byte) -67) == 1;
            }
        } else {
            this.field2194 = new class203[arg0.method1711((byte) -67)];
            for (int var4 = 0; this.field2194.length > var4; ++var4) {
                int var5 = arg0.method1711((byte) -67);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field2194[var4] = class208.method1421(arg0, (byte) -115);
                            }
                        } else {
                            this.field2194[var4] = class92.method672(238, arg0);
                        }
                    } else {
                        this.field2194[var4] = class144.method947(126, arg0);
                    }
                } else {
                    this.field2194[var4] = class72.method509(arg0, -3703);
                }
            }
        }
        if (arg2 != -99) {
            this.field2194 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V")
    public static void method850(byte arg0) {
        field2198 = null;
        field2191 = null;
        if (arg0 == -100) {
            field2200 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class124() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V")
    public static final void method851(boolean arg0) {
        if (arg0) {
            field2191 = null;
        }
        ++field2189;
        int var1 = class226.method1526(52);
        if (var1 == 0) {
            class99.field1782 = null;
            class31.method211(0, 0);
        } else if (~var1 == -2) {
            class87.method646((byte) 0, -1);
            class31.method211(0, 512);
            class198.method1349(!arg0);
        } else {
            class87.method646((byte) (255 & class50.field873 + -4), -1);
            class31.method211(0, 2);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lrh;IIII)V")
    public static final void method852(class44 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2190;
        if (class22.field308 != arg0) {
            if (~class115.field2058 > -401) {
                class85 var5;
                if (arg0.field780 != 0) {
                    var5 = class172.method1150(new class85[] { arg0.method308(0), class220.field3867, class116.field2073, class68.method451(arg0.field780, arg2 + -12572), class222.field3892 }, 0);
                } else {
                    var5 = class172.method1150(new class85[] { arg0.method308(0), class273.method1862(class22.field308.field760, 39, arg0.field760), class220.field3867, class272.field4818, class68.method451(arg0.field760, -12572), class222.field3892 }, 0);
                }
                if (class70.field1303 != 1) {
                    if (!class12.field193) {
                        for (int var6 = 7; var6 >= 0; --var6) {
                            if (class247.field4256[var6] != null) {
                                short var7 = 0;
                                boolean var8 = false;
                                ++class99.field1785;
                                if (~class18.field267 == -1 && class247.field4256[var6].method582(class213.field3749, -49)) {
                                    if (arg0.field760 > class22.field308.field760) {
                                        var7 = 2000;
                                    }
                                    if (~class22.field308.field786 != -1 && arg0.field786 != 0) {
                                        if (~class22.field308.field786 != ~arg0.field786) {
                                            var7 = 0;
                                        } else {
                                            var7 = 2000;
                                        }
                                    }
                                } else if (class196.field3377[var6]) {
                                    var7 = 2000;
                                }
                                short var9 = class219.field3852[var6];
                                short var10 = (short) (var7 + var9);
                                class108.method747((long) arg3, (byte) -98, var10, arg1, arg4, class172.method1150(new class85[] { class212.field3716, var5 }, 0), class247.field4256[var6]);
                            }
                        }
                    } else if (~(class227.field3946 & 8) == -9) {
                        class108.method747((long) arg3, (byte) -88, (short) 8, arg1, arg4, class172.method1150(new class85[] { class30.field452, class129.field2261, var5 }, arg2), class150.field2542);
                        ++class54.field942;
                    }
                } else {
                    ++class116.field2087;
                    class108.method747((long) arg3, (byte) 13, (short) 11, arg1, arg4, class172.method1150(new class85[] { class144.field2472, class129.field2261, var5 }, 0), class77.field1425);
                }
                for (int var11 = arg2; var11 < class115.field2058; ++var11) {
                    if (class90.field1659[var11] == 35) {
                        class184.field3161[var11] = class172.method1150(new class85[] { class212.field3716, var5 }, class197.method1346(arg2, 0));
                        return;
                    }
                }
            }
        }
    }
}
