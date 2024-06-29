import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class66 extends class64 {

    @OriginalMember(owner = "client!hb", name = "qb", descriptor = "I")
    private int field1243 = -1;

    @OriginalMember(owner = "client!hb", name = "gb", descriptor = "Lsg;")
    public static class169 field1233 = class165.method1060("Unerwartete Antwort vom Anmelde)2Server", 1536);

    @OriginalMember(owner = "client!hb", name = "jb", descriptor = "[Z")
    public static boolean[] field1236 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!hb", name = "nb", descriptor = "Lsg;")
    public static class169 field1240 = class165.method1060("und loggen sich dann erneut ein)3", 1536);

    @OriginalMember(owner = "client!hb", name = "mb", descriptor = "Lsg;")
    public static class169 field1239 = class165.method1060("m-Ochte sich mit Ihnen duellieren)3", 1536);

    @OriginalMember(owner = "client!hb", name = "sb", descriptor = "[I")
    public static int[] field1245 = new int[50];

    @OriginalMember(owner = "client!hb", name = "rb", descriptor = "I")
    public static int field1244 = 0;

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!hb", name = "eb", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!hb", name = "fb", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client!hb", name = "ib", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!hb", name = "kb", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!hb", name = "lb", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!hb", name = "ob", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!hb", name = "pb", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!hb", name = "tb", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!hb", name = "ub", descriptor = "I")
    private int field1247;

    @OriginalMember(owner = "client!hb", name = "vb", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!hb", name = "wb", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!hb", name = "hb", descriptor = "[I")
    private int[] field1234;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "(I)V")
    public static final void method415(int arg0) {
        class92.field1729.method1205(true);
        if (arg0 != 2048) {
            method417(-83);
        }
        class128.field2388.method1205(true);
        ++field1238;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILvg;IB)V")
    public static final void method416(int arg0, class196 arg1, int arg2, byte arg3) {
        if (arg3 == 75) {
            if (arg1.field3697 == arg0 && arg0 != -1) {
                int var4 = class159.method1021((byte) 21, arg0).field3355;
                if (var4 == 1) {
                    arg1.field3710 = 0;
                    arg1.field3688 = 0;
                    arg1.field3706 = 0;
                    arg1.field3668 = arg2;
                }
                if (var4 == 2) {
                    arg1.field3710 = 0;
                }
            } else if (arg0 == -1 || ~arg1.field3697 == 0 || ~class159.method1021((byte) 91, arg0).field3364 <= ~class159.method1021((byte) 118, arg1.field3697).field3364) {
                arg1.field3697 = arg0;
                arg1.field3668 = arg2;
                arg1.field3706 = 0;
                arg1.field3710 = 0;
                arg1.field3688 = 0;
                arg1.field3725 = arg1.field3702;
            }
            ++field1242;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        ++field1230;
        int var4 = 102 / ((-60 - arg0) / 36);
        if (~arg2 == -1) {
            this.field1243 = arg1.method785(true);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)I")
    public final int method393(boolean arg0) {
        if (!arg0) {
            return 87;
        } else {
            ++field1249;
            return this.field1243;
        }
    }

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "(I)V")
    public static void method417(int arg0) {
        field1233 = null;
        if (arg0 != 0) {
            method415(125);
        }
        field1240 = null;
        field1236 = null;
        field1239 = null;
        field1245 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lsg;IZ)V")
    public static final void method418(class169 arg0, int arg1, boolean arg2) {
        ++class89.field1617;
        ++field1231;
        class141.field2621.method1024(237, (byte) -94);
        class141.field2621.method825((byte) -9, arg0.method1133(false));
        class141.field2621.method820(arg2, arg1);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static final void method419(byte arg0) {
        class205.field4013.method1205(true);
        ++field1235;
        if (arg0 <= 108) {
            method420(false, -29);
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class66() {
        super(0, false);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)V")
    public static final void method420(boolean arg0, int arg1) {
        if (arg1 == -30054) {
            ++field1229;
            for (int var2 = 0; class164.field3149 > var2; ++var2) {
                class197 var3 = class54.field992[class182.field3547[var2]];
                int var4 = (class182.field3547[var2] << 14) + 536870912;
                if (var3 != null && var3.method1249(-5701) && var3.field3872.field3431 != !arg0 && var3.field3872.method1171(-113)) {
                    int var5 = var3.field3679 >> 7;
                    int var6 = var3.field3698 >> 7;
                    if (~var6 <= -1 && ~var6 > -105 && ~var5 <= -1 && var5 < 104) {
                        if (var3.field3711 == 1 && ~(var3.field3698 & 127) == -65 && (127 & var3.field3679) == 64) {
                            if (~class121.field2238[var6][var5] == ~class145.field2701) {
                                continue;
                            }
                            class121.field2238[var6][var5] = class145.field2701;
                        }
                        if (!var3.field3872.field3427) {
                            var4 += Integer.MIN_VALUE;
                        }
                        class196.field3840.method910(class61.field1132, var3.field3698, var3.field3679, class183.method1215(var3.field3711 * 64 + -64 + var3.field3698, class61.field1132, (var3.field3711 - 1) * 64 + var3.field3679, 0), (var3.field3711 + -1) * 64 + 60, var3, var3.field3719, var4, var3.field3705);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)Z")
    private final boolean method421(byte arg0) {
        ++field1241;
        if (this.field1234 != null) {
            return true;
        } else {
            if (arg0 < 17) {
                this.field1243 = 26;
            }
            if (~this.field1243 <= -1) {
                int var2 = class193.field3804.method598(24370, this.field1243) ? 64 : 128;
                this.field1234 = class193.field3804.method608(this.field1243, -29835);
                this.field1232 = var2;
                this.field1247 = var2;
                return this.field1234 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        ++field1248;
        int[][] var3 = super.field1195.method177(1193, arg1);
        if (arg0 != -40) {
            this.field1232 = 86;
        }
        if (super.field1195.field532 && this.method421((byte) 84)) {
            int var4 = this.field1247 * (~class103.field1895 != ~this.field1232 ? this.field1232 * arg1 / class103.field1895 : arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class147.field2715 == this.field1247) {
                for (int var8 = 0; var8 < class147.field2715; ++var8) {
                    int var9 = this.field1234[var4++];
                    var7[var8] = class150.method984(var9, 255) << 4;
                    var6[var8] = class150.method984(var9 >> 4, 4080);
                    var5[var8] = class150.method984(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; class147.field2715 > var10; ++var10) {
                    int var11 = this.field1247 * var10 / class147.field2715;
                    int var12 = this.field1234[var4 + var11];
                    var7[var10] = class150.method984(4080, var12 << 4);
                    var6[var10] = class150.method984(var12, 65280) >> 4;
                    var5[var10] = class150.method984(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1228;
        int var7 = 0;
        int var8 = 0;
        int var9 = 2047 & -arg0 + 2048;
        if (arg4 == -21789) {
            int var10 = arg5;
            int var11 = 2047 & -arg3 + 2048;
            if (~var11 != -1) {
                int var12 = class12.field279[var11];
                int var13 = class12.field283[var11];
                int var14 = var7 * var13 + -(arg5 * var12) >> 16;
                var10 = var7 * var12 + arg5 * var13 >> 16;
                var7 = var14;
            }
            if (var9 != 0) {
                int var15 = class12.field279[var9];
                int var16 = class12.field283[var9];
                int var17 = var10 * var15 - -(var8 * var16) >> 16;
                var10 = var10 * var16 + -(var8 * var15) >> 16;
                var8 = var17;
            }
            class177.field3468 = arg0;
            class182.field3559 = arg1 - var7;
            class7.field159 = -var8 + arg2;
            class138.field2569 = -var10 + arg6;
            class148.field2743 = arg3;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILke;Lke;)Lhg;")
    public static final class71 method423(int arg0, int arg1, int arg2, class95 arg3, class95 arg4) {
        if (arg0 >= -91) {
            return null;
        } else {
            ++field1246;
            return !class174.method1166(arg2, arg1, false, arg4) ? null : class11.method64(2, arg3.method552(arg1, arg2, 0));
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
    public static final void method424(byte arg0) {
        class193.field3814 = null;
        class203.field3976 = null;
        class41.field770 = null;
        class182.field3544 = null;
        int var1 = 111 / ((arg0 - 27) / 55);
        class197.field3873 = null;
        ++field1237;
        class2.field43 = null;
    }
}
