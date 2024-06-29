import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class55 extends class154 {

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "[Lq;")
    public static class163[] field833 = new class163[32768];

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "Leg;")
    private static class37 field837 = class174.method1167(" ", 96);

    @OriginalMember(owner = "client!vf", name = "hb", descriptor = "Leg;")
    public static class37 field842 = class174.method1167("<col=00ffff>", -45);

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "Leg;")
    public static class37 field835 = field837;

    @OriginalMember(owner = "client!vf", name = "nb", descriptor = "Leg;")
    public static class37 field848 = class174.method1167("www", -93);

    @OriginalMember(owner = "client!vf", name = "gb", descriptor = "S")
    public static short field841 = 256;

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!vf", name = "db", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!vf", name = "eb", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "client!vf", name = "fb", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "client!vf", name = "jb", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!vf", name = "kb", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!vf", name = "lb", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!vf", name = "mb", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!vf", name = "ob", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "Ljl;")
    public static class101 field832;

    @OriginalMember(owner = "client!vf", name = "ib", descriptor = "Ljl;")
    public static class101 field843;

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class55() {
        this(0);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V")
    private class55(int arg0) {
        super(0, false);
        this.method359((byte) 37, arg0);
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V")
    public static final void method356(byte arg0) {
        if (arg0 != -118) {
            field841 = -69;
        }
        class187.field3184.method1403(45);
        ++field846;
        class273.field4790.method1403(45);
        class160.field2669.method1403(45);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILpi;IZ)V")
    public static final void method357(int arg0, class188 arg1, int arg2, boolean arg3) {
        ++field847;
        if ((arg2 & 512) != 0) {
            arg1.field1814 = class213.field3680.method1286(8);
            int var4 = class213.field3680.method1290((byte) 90);
            arg1.field1811 = var4 >> 16;
            arg1.field1821 = class72.field1146 - -(65535 & var4);
            arg1.field1769 = 0;
            if (arg1.field1814 == 65535) {
                arg1.field1814 = -1;
            }
            arg1.field1773 = 0;
            if (~class72.field1146 > ~arg1.field1821) {
                arg1.field1773 = -1;
            }
            if (arg1.field1814 != -1 && class72.field1146 == arg1.field1821) {
                int var5 = class79.method536(107, arg1.field1814).field3947;
                if (var5 != -1) {
                    class2 var6 = class186.method1242(0, var5);
                    if (var6 != null && var6.field24 != null) {
                        class182.method1201(arg1.field1799, var6, 255, arg1.field1793, class82.field1285 == arg1, 0);
                    }
                }
            }
        }
        if (~(arg2 & 2) != -1) {
            int var7 = class213.field3680.method1282(255);
            int var8 = class213.field3680.method1255(false);
            int var9 = class213.field3680.method1278(true);
            boolean var10 = ~(var7 & 32768) != -1;
            int var11 = class213.field3680.field3169;
            if (arg1.field3235 != null && arg1.field3217 != null) {
                long var12 = arg1.field3235.method217((byte) -102);
                boolean var14 = false;
                if (var8 <= 1) {
                    if (var10 || (!class96.field1505 || class203.field3474) && !class171.field2880) {
                        for (int var15 = 0; ~class62.field1028 < ~var15; ++var15) {
                            if (class68.field1068[var15] == var12) {
                                var14 = true;
                                break;
                            }
                        }
                    } else {
                        var14 = true;
                    }
                }
                if (!var14 && ~class77.field1205 == -1) {
                    class123.field2068.field3169 = 0;
                    class213.field3680.method1280(255, var9, 0, class123.field2068.field3175);
                    class123.field2068.field3169 = 0;
                    int var16 = -1;
                    class37 var18;
                    if (var10) {
                        var7 &= 32767;
                        class178 var17 = class87.method577(class123.field2068, (byte) 122);
                        var16 = var17.field2978;
                        var18 = var17.field2967.method175(class123.field2068, 1);
                    } else {
                        var18 = class183.method1225(class176.method1176(class123.field2068, 10310).method252(2));
                    }
                    arg1.field1832 = var18.method255(-157);
                    arg1.field1830 = var7 >> 8;
                    arg1.field1776 = 150;
                    arg1.field1802 = var7 & 255;
                    if (~var8 == -3) {
                        class102.method686(var16, class156.method1061((byte) -108, new class37[] { class257.field4574, arg1.method1306((byte) 88) }), (byte) 51, (class37) null, !var10 ? 1 : 17, var18);
                    } else if (~var8 == -2) {
                        class102.method686(var16, class156.method1061((byte) 74, new class37[] { class85.field1343, arg1.method1306((byte) 88) }), (byte) 51, (class37) null, var10 ? 17 : 1, var18);
                    } else {
                        class102.method686(var16, arg1.method1306((byte) 88), (byte) 51, (class37) null, !var10 ? 2 : 17, var18);
                    }
                }
            }
            class213.field3680.field3169 = var9 + var11;
        }
        if (!arg3) {
            if (~(arg2 & 16) != -1) {
                arg1.field1824 = class213.field3680.method1286(8);
                if (arg1.field1824 == 65535) {
                    arg1.field1824 = -1;
                }
            }
            if (~(arg2 & 4) != -1) {
                int var19 = class213.field3680.method1263(!arg3);
                if (~var19 == -65536) {
                    var19 = -1;
                }
                int var20 = class213.field3680.method1250(27);
                class112.method803(var20, arg1, 239, var19);
            }
            if (~(arg2 & 1) != -1) {
                int var21 = class213.field3680.method1246(!arg3);
                int var22 = class213.field3680.method1250(-127);
                arg1.method764(var21, class72.field1146, (byte) -114, var22);
                arg1.field1808 = class72.field1146 + 300;
                arg1.field1807 = class213.field3680.method1278(!arg3);
            }
            if (~(arg2 & 128) != -1) {
                arg1.field1832 = class213.field3680.method1253(16);
                if (arg1.field1832.method215((byte) -58, 0) == 126) {
                    arg1.field1832 = arg1.field1832.method263(1, false);
                    class274.method1839((byte) -98, 2, arg1.method1306((byte) 88), arg1.field1832);
                } else if (class82.field1285 == arg1) {
                    class274.method1839((byte) -120, 2, arg1.method1306((byte) 88), arg1.field1832);
                }
                arg1.field1830 = 0;
                arg1.field1776 = 150;
                arg1.field1802 = 0;
            }
            if ((arg2 & 1024) != 0) {
                int var23 = class213.field3680.method1246(true);
                int var24 = class213.field3680.method1268(255);
                arg1.method764(var23, class72.field1146, (byte) 100, var24);
            }
            if ((8 & arg2) != 0) {
                int var25 = class213.field3680.method1268(255);
                byte[] var26 = new byte[var25];
                class187 var27 = new class187(var26);
                class213.field3680.method1264(var26, 2, var25, 0);
                class201.field3429[arg0] = var27;
                arg1.method1303(arg3, var27);
            }
            if (~(256 & arg2) != -1) {
                arg1.field1788 = class213.field3680.method1250(-120);
                arg1.field1794 = class213.field3680.method1250(-124);
                arg1.field1791 = class213.field3680.method1278(true);
                arg1.field1817 = class213.field3680.method1250(-128);
                arg1.field1763 = class213.field3680.method1286(8) + class72.field1146;
                arg1.field1823 = class213.field3680.method1263(true) - -class72.field1146;
                arg1.field1781 = class213.field3680.method1255(false);
                arg1.field1834 = 1;
                arg1.field1766 = 0;
            }
            if (~(64 & arg2) != -1) {
                arg1.field1784 = class213.field3680.method1263(true);
                arg1.field1805 = class213.field3680.method1244(false);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        ++field836;
        if (arg1 != -14015) {
            method356((byte) 86);
        }
        if (arg2 == 0) {
            this.method359((byte) 37, arg0.method1248((byte) 122));
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
    public static final void method358(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field845;
        if (arg3 == -17071) {
            if (arg0 < arg1) {
                class145.method1010(arg1, arg0, arg3 + -8015, arg2, class210.field3617[arg4]);
            } else {
                class145.method1010(arg0, arg1, arg3 ^ 9043, arg2, class210.field3617[arg4]);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        if (arg0 != 115) {
            this.method359((byte) -66, 97);
        }
        ++field834;
        int[][] var3 = super.field2585.method1532(arg1, -61);
        if (super.field2585.field3761) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; ~class227.field3898 < ~var7; ++var7) {
                var4[var7] = this.field839;
                var6[var7] = this.field840;
                var5[var7] = this.field849;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(BI)V")
    private final void method359(byte arg0, int arg1) {
        this.field839 = 4080 & arg1 >> 12;
        this.field849 = arg1 << 4 & 4080;
        ++field844;
        if (arg0 != 37) {
            field843 = null;
        }
        this.field840 = arg1 >> 4 & 4080;
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
    public static void method360(int arg0) {
        field843 = null;
        field842 = null;
        if (arg0 != 65535) {
            field843 = null;
        }
        field832 = null;
        field835 = null;
        field848 = null;
        field833 = null;
        field837 = null;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(III)V")
    public static final void method361(int arg0, int arg1, int arg2) {
        ++field838;
        class274 var3 = class166.method1116(12, arg1, true);
        int var4 = -117 / ((-38 - arg2) / 59);
        var3.method1835(-62);
        var3.field4802 = arg0;
    }
}
