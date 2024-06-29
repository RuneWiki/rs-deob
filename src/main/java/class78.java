import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class78 extends class456 {

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    private int field1101 = 3072;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    private int field1102 = 2048;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    private int field1100 = 1024;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public static int field1091 = 1338;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field1095 = 0;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "Ljq;")
    public static class340 field1097 = null;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1099 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "[Z")
    public static boolean[] field1106 = new boolean[100];

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "[I")
    public static int[] field1107 = new int[50];

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "Lps;")
    public static class321 field1105;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "Z")
    public static boolean field1104;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "[Lnb;")
    public static class212[] field1108;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        ++field1092;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (arg0 != -1) {
            this.field1100 = 127;
        }
        if (super.field6466.field6153) {
            int[] var4 = this.method2707(arg1, -31797, 0);
            for (int var5 = 0; ~class156.field2169 < ~var5; ++var5) {
                var3[var5] = this.field1100 - -(var4[var5] * this.field1102 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class78() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
    public final void method653(boolean arg0) {
        ++field1103;
        this.field1102 = -this.field1100 + this.field1101;
        if (!arg0) {
            field1095 = -8;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILat;ILtq;)V")
    public static final void method654(int arg0, int arg1, class412 arg2, int arg3, class63 arg4) {
        class314.field4720.method2459(300);
        ++field1098;
        if (arg3 != 4) {
            field1104 = true;
        }
        if (!class479.field6742) {
            for (class290 var5 = (class290) arg2.method2456(32101); var5 != null; var5 = (class290) arg2.method2461(301)) {
                class94 var6 = class189.field2877.method1111(var5.field4401, arg3 + -13520);
                if (class88.method695(113, var6)) {
                    boolean var7 = class456.method2708(-1237, arg4, arg1, var5, var6, arg0);
                    if (var7) {
                        class307.method1911(var6, arg4, var5, (byte) -61);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        ++field1096;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field6486 = ~arg2.method2628(49152) == -2;
                }
            } else {
                this.field1101 = arg2.method2631(2530);
            }
        } else {
            this.field1100 = arg2.method2631(2530);
        }
        if (arg1 != 55) {
            this.method210(-49, (byte) 113, (class446) null);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)V")
    public static final void method655(boolean arg0) {
        ++field1093;
        if (~class337.field5038.method2213(102, class170.field2424) == -3) {
            if (arg0) {
                method654(-88, -53, (class412) null, -45, (class63) null);
            }
            byte var1 = (byte) (255 & class281.field4249 + -4);
            int var2 = class281.field4249 % class379.field5642;
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var16 = 0; class456.field6477 > var16; ++var16) {
                    class134.field1954[var3][var2][var16] = var1;
                }
            }
            if (~class486.field6836 != -4) {
                for (int var4 = 0; var4 < 2; ++var4) {
                    class145.field2050[var4] = -1000000;
                    class31.field412[var4] = 1000000;
                    class356.field5405[var4] = 0;
                    class225.field3262[var4] = 1000000;
                    class180.field2688[var4] = 0;
                }
                if (class469.field6596 == 1) {
                    if (~(4 & class246.field3532[class486.field6836][class472.field6622.field4543 >> 7][class472.field6622.field4538 >> 7]) != -1) {
                        class387.method2341(class170.field2427, false, class472.field6622.field4543 >> 7, class472.field6622.field4538 >> 7, 18524, 0);
                    }
                    if (class283.field4287 < 2560) {
                        int var5 = class68.field920 >> 7;
                        int var6 = class200.field3027 >> 7;
                        int var7 = class472.field6622.field4543 >> 7;
                        int var8 = class472.field6622.field4538 >> 7;
                        int var9;
                        if (~var5 <= ~var7) {
                            var9 = -var7 + var5;
                        } else {
                            var9 = -var5 + var7;
                        }
                        int var10;
                        if (~var8 >= ~var6) {
                            var10 = -var8 + var6;
                        } else {
                            var10 = -var6 + var8;
                        }
                        if ((~var9 != -1 || var10 != 0) && var9 > -class379.field5642 && class379.field5642 > var9 && ~(-class456.field6477) > ~var10 && ~class456.field6477 < ~var10) {
                            if (~var9 >= ~var10) {
                                int var11 = var9 * 65536 / var10;
                                int var12 = 32768;
                                while (~var6 != ~var8) {
                                    if (var6 >= var8) {
                                        if (~var6 < ~var8) {
                                            --var6;
                                        }
                                    } else {
                                        ++var6;
                                    }
                                    if ((4 & class246.field3532[class486.field6836][var5][var6]) != 0) {
                                        class387.method2341(class170.field2427, false, var5, var6, 18524, 1);
                                        return;
                                    }
                                    var12 += var11;
                                    if (var12 >= 65536) {
                                        var12 -= 65536;
                                        if (~var5 > ~var7) {
                                            ++var5;
                                        } else if (~var5 < ~var7) {
                                            --var5;
                                        }
                                        if ((class246.field3532[class486.field6836][var5][var6] & 4) != 0) {
                                            class387.method2341(class170.field2427, false, var5, var6, 18524, 1);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var13 = var10 * 65536 / var9;
                            int var14 = 32768;
                            while (~var5 != ~var7) {
                                if (~var7 >= ~var5) {
                                    if (~var7 > ~var5) {
                                        --var5;
                                    }
                                } else {
                                    ++var5;
                                }
                                if ((4 & class246.field3532[class486.field6836][var5][var6]) != 0) {
                                    class387.method2341(class170.field2427, false, var5, var6, 18524, 1);
                                    return;
                                }
                                var14 += var13;
                                if (~var14 <= -65537) {
                                    var14 -= 65536;
                                    if (var6 < var8) {
                                        ++var6;
                                    } else if (~var8 > ~var6) {
                                        --var6;
                                    }
                                    if ((4 & class246.field3532[class486.field6836][var5][var6]) != 0) {
                                        class387.method2341(class170.field2427, false, var5, var6, 18524, 1);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        class416.method2475(false, (Throwable) null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class68.field922 + "," + class468.field6588);
                        return;
                    }
                } else {
                    int var15 = class25.method219(48602855, class486.field6836, class200.field3027, class68.field920);
                    if (-class344.field5191 + var15 >= 800 || (class246.field3532[class486.field6836][class68.field920 >> 7][class200.field3027 >> 7] & 4) == 0) {
                        return;
                    }
                    class387.method2341(class170.field2427, false, class68.field920 >> 7, class200.field3027 >> 7, 18524, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "(I)V")
    public static void method656(int arg0) {
        field1108 = null;
        field1107 = null;
        field1097 = null;
        if (arg0 == 0) {
            field1106 = null;
            field1099 = null;
            field1105 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[[I")
    public final int[][] method212(int arg0, int arg1) {
        ++field1094;
        int[][] var3 = super.field6468.method1090(arg0 + -2, arg1);
        if (arg0 != 0) {
            this.field1102 = -46;
        }
        if (super.field6468.field2227) {
            int[][] var4 = this.method2709(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class156.field2169 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field1102 >> 12) + this.field1100;
                var9[var11] = this.field1100 - -(var6[var11] * this.field1102 >> 12);
                var10[var11] = (var7[var11] * this.field1102 >> 12) + this.field1100;
            }
        }
        return var3;
    }
}
