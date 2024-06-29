import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class64 {

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "[I")
    public static int[] field111 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "Lcd;")
    private static class23 field112 = class54.method414("Create a free account", -1);

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "Lcd;")
    public static class23 field114 = field112;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field116 = -1;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
    public static void method32(byte arg0) {
        if (arg0 == -30) {
            field114 = null;
            field111 = null;
            field112 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIB)I")
    public static final int method33(int arg0, int arg1, byte arg2) {
        ++field117;
        int var3 = arg1 - -(arg0 * 57);
        int var4 = var3 ^ var3 << 13;
        if (arg2 < 15) {
            return 51;
        } else {
            int var5 = (var4 * var4 * 15731 - -789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return var5 >> 19 & 255;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class6() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V")
    public static final void method34(byte arg0) {
        ++field109;
        if (arg0 == 60) {
            if (!class134.field2786) {
                class88.field1876[0] = class153.field3061;
                class81.field1771[0] = class66.field1566;
                class49.field1171 = 1;
                class103.field2201[0] = 1003;
            }
            if (~class119.field2450 != 0) {
                class74.method525((byte) -117, class119.field2450);
            }
            for (int var1 = 0; var1 < class5.field92; ++var1) {
                if (class172.field3412[var1]) {
                    class193.field3821[var1] = true;
                }
                class204.field4024[var1] = class172.field3412[var1];
                class172.field3412[var1] = false;
            }
            class160.field3208 = class15.field339;
            class174.field3472 = -1;
            class98.field2087 = -1;
            class30.field647 = null;
            if (class119.field2450 != -1) {
                class5.field92 = 0;
                class112.method718(0, 0, 0, 765, -1, 0, 503, false, class119.field2450);
            }
            class196.method1277();
            class25.method193((byte) 78);
            if (class134.field2786) {
                class161.method989((byte) -85);
            } else if (~class98.field2087 != 0) {
                class74.method528(8, class174.field3472, class98.field2087);
            }
            if (class25.field547 == 3) {
                for (int var2 = 0; ~var2 > ~class5.field92; ++var2) {
                    if (class204.field4024[var2]) {
                        class196.method1271(class78.field1718[var2], class121.field2504[var2], class112.field2372[var2], class179.field3558[var2], 16711935, 128);
                    } else if (class193.field3821[var2]) {
                        class196.method1271(class78.field1718[var2], class121.field2504[var2], class112.field2372[var2], class179.field3558[var2], 16711680, 128);
                    }
                }
            }
            class134.method858(class134.field2790.field277, class134.field2790.field215, class138.field2850, class59.field1385, 0);
            class138.field2850 = 0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field110;
        int[] var3 = super.field1513.method1033(-112, arg0);
        if (arg1 != -9421) {
            return null;
        } else {
            if (super.field1513.field3368) {
                int[] var4 = this.method479(-1, arg0, 0);
                int[] var5 = this.method479(-1, arg0, 1);
                int[] var6 = this.method479(-1, arg0, 2);
                for (int var7 = 0; class168.field3367 > var7; ++var7) {
                    int var8 = var6[var7];
                    if (var8 != 4096) {
                        if (var8 == 0) {
                            var3[var7] = var5[var7];
                        } else {
                            var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            int[][] var3 = super.field1508.method846(7287, arg0);
            if (super.field1508.field2757) {
                int[] var4 = this.method479(-1, arg0, 2);
                int[][] var5 = this.method482(0, arg0, (byte) -128);
                int[][] var6 = this.method482(1, arg0, (byte) -128);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var5[0];
                int[] var10 = var5[1];
                int[] var11 = var3[2];
                int[] var12 = var6[0];
                int[] var13 = var6[2];
                int[] var14 = var5[2];
                int[] var15 = var6[1];
                for (int var16 = 0; ~class168.field3367 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (var17 == 4096) {
                        var7[var16] = var9[var16];
                        var8[var16] = var10[var16];
                        var11[var16] = var14[var16];
                    } else if (~var17 != -1) {
                        int var18 = 4096 - var17;
                        var7[var16] = var9[var16] * var17 - -(var12[var16] * var18) >> 12;
                        var8[var16] = var10[var16] * var17 + var15[var16] * var18 >> 12;
                        var11[var16] = var13[var16] * var18 + var14[var16] * var17 >> 12;
                    } else {
                        var7[var16] = var12[var16];
                        var8[var16] = var15[var16];
                        var11[var16] = var13[var16];
                    }
                }
            }
            ++field115;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        int var4 = 21 / ((arg0 - 7) / 43);
        if (arg1 == 0) {
            super.field1510 = arg2.method1202(127) == 1;
        }
        ++field113;
    }
}
