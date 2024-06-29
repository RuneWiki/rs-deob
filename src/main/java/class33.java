import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class33 extends class259 {

    @OriginalMember(owner = "client!tc", name = "hb", descriptor = "Lsg;")
    private static class30 field836 = class167.method1221((byte) 33, " has logged in)3");

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "Lsg;")
    public static class30 field822 = field836;

    @OriginalMember(owner = "client!tc", name = "fb", descriptor = "Lsg;")
    public static class30 field834 = class167.method1221((byte) 33, ")4");

    @OriginalMember(owner = "client!tc", name = "ib", descriptor = "Z")
    public static boolean field837 = false;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!tc", name = "gb", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "Lmc;")
    public static class151 field826;

    @OriginalMember(owner = "client!tc", name = "eb", descriptor = "Ldl;")
    public static class31 field833;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "[Lwk;")
    private class145[] field824;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field835;
        if (arg1) {
            field834 = null;
        }
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            this.method330((byte) 63, super.field4581.method1836(0));
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "(I)V")
    public static final void method327(int arg0) {
        ++field825;
        if (class160.field3017) {
            class160.field3017 = false;
            class172.field3218 = null;
            class75.field1669 = null;
            if (arg0 > -120) {
                method327(-68);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class33() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        ++field829;
        int[][] var3 = super.field4568.method241(-122, arg1);
        int var4 = 31 % ((-48 - arg0) / 42);
        if (super.field4568.field564) {
            int var5 = class223.field3999;
            int var6 = class94.field1911;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field4568.method247((byte) 19);
            this.method330((byte) 63, var7);
            for (int var9 = 0; var9 < class94.field1911; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[2];
                int[] var14 = var11[1];
                for (int var15 = 0; ~var15 > ~class223.field3999; ++var15) {
                    int var16 = var10[var15];
                    var13[var15] = class68.method612(255, var16) << 4;
                    var14[var15] = class68.method612(4080, var16 >> 4);
                    var12[var15] = class68.method612(var16, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)V")
    public static final void method328(int arg0, int arg1) {
        ++field823;
        class68 var2 = class103.method830(arg0, arg1 + 5, 10);
        if (arg1 != -1) {
            method329(false, (byte) 126);
        }
        var2.method610(2141640544);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZB)V")
    public static final void method329(boolean arg0, byte arg1) {
        ++field827;
        for (int var2 = 0; ~var2 > ~class221.field3985; ++var2) {
            class275 var3 = class125.field2443[class4.field55[var2]];
            long var4 = 536870912L | (long) class4.field55[var2] << 32;
            if (var3 != null && var3.method568((byte) 97) && !arg0 == !var3.field4805.field4264 && var3.field4805.method1703(0)) {
                int var6 = var3.field1360 >> 7;
                int var7 = var3.field1336 >> 7;
                if (~var6 <= -1 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (~var3.method574(true) == -2 && ~(var3.field1360 & 127) == -65 && ~(var3.field1336 & 127) == -65) {
                        if (class193.field3482[var6][var7] == class116.field2290) {
                            continue;
                        }
                        class193.field3482[var6][var7] = class116.field2290;
                    }
                    if (!var3.field4805.field4291) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field1379 = class31.method303(var3.field1360, var3.field1336, class159.field2998, -4);
                    class22.method206(class159.field2998, var3.field1360, var3.field1336, var3.field1379, var3.method574(true) * 64 + -4, var3, var3.field1389, var4, var3.field1343);
                }
            }
        }
        if (arg1 < 86) {
            method327(-26);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B[[I)V")
    private final void method330(byte arg0, int[][] arg1) {
        ++field830;
        int var3 = class223.field3999;
        int var4 = class94.field1911;
        class44.method451(arg1, 0);
        if (arg0 != 63) {
            method327(85);
        }
        class99.method807(0, 0, class52.field1174, class263.field4649, 0);
        if (this.field824 != null) {
            for (int var5 = 0; var5 < this.field824.length; ++var5) {
                class145 var6 = this.field824[var5];
                int var7 = var6.field2787;
                int var8 = var6.field2779;
                if (var7 < 0) {
                    if (~var8 <= -1) {
                        var6.method788(var4, 125, var3);
                    }
                } else if (~var8 > -1) {
                    var6.method792(false, var3, var4);
                } else {
                    var6.method790(false, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 == -1586849108) {
            if (arg0 != 0) {
                if (arg0 == 1) {
                    super.field4588 = ~arg2.method63((byte) 61) == -2;
                }
            } else {
                this.field824 = new class145[arg2.method63((byte) 122)];
                for (int var4 = 0; this.field824.length > var4; ++var4) {
                    int var5 = arg2.method63((byte) 53);
                    if (~var5 != -1) {
                        if (~var5 != -2) {
                            if (~var5 != -3) {
                                if (var5 == 3) {
                                    this.field824[var4] = class143.method1063(0, arg2);
                                }
                            } else {
                                this.field824[var4] = class47.method470(4096, arg2);
                            }
                        } else {
                            this.field824[var4] = class79.method693(arg2, (byte) 10);
                        }
                    } else {
                        this.field824[var4] = class134.method1012(-20477, arg2);
                    }
                }
            }
            ++field832;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
    public static void method331(boolean arg0) {
        field822 = null;
        field836 = null;
        field834 = null;
        field833 = null;
        field826 = null;
        if (arg0) {
            method331(true);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZIII)V")
    public static final void method332(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            ++field831;
            if (~class169.field3184 != -1 && arg1 != 0 && ~class233.field4153 > -51 && ~arg3 != 0) {
                class277.field4826[class233.field4153] = arg3;
                class25.field483[class233.field4153] = arg1;
                class272.field4765[class233.field4153] = arg2;
                class193.field3494[class233.field4153] = null;
                class22.field419[class233.field4153] = 0;
                ++class233.field4153;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(BI)V")
    public static final void method333(byte arg0, int arg1) {
        ++field828;
        if (arg0 != 10) {
            field834 = null;
        }
        class69.field1525.method1642(arg1, 119);
    }
}
