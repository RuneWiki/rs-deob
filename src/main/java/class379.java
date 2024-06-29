import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class379 {

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Z")
    public boolean field5728 = false;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    private int field5735 = 0;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Z")
    public boolean field5731 = false;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public int field5734 = -1;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    private int field5743 = 128;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    private int field5724 = 0;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
    private int field5744 = 0;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    private int field5745 = 128;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Lne;")
    public static class172 field5720 = null;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "[I")
    public static int[] field5723 = new int[4096];

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    private int field5726;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public int field5736;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "Lvd;")
    public static class26 field5747;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "Lap;")
    public static class279 field5742;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "[Lgl;")
    public static class356[] field5741;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "[S")
    private short[] field5722;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "[S")
    private short[] field5727;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "[S")
    private short[] field5729;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "[S")
    private short[] field5732;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLe;)V")
    public static final void method2413(byte arg0, class312 arg1) {
        field5739++;
        int var2 = class75.field949;
        int var3 = class27.field315;
        if (arg0 != -111) {
            return;
        }
        int var4 = class427.field6299;
        int var5 = class186.field3064;
        int var6 = -10660793;
        arg1.method2086(var4, var2, var5, var6, -765, var3);
        arg1.method2086(var4 - 2, var2 + 1, 16, -16777216, arg0 ^ 0x292, var3 + 1);
        arg1.method2083(112, var3 + 18, var5 + -19, var2 + 1, -16777216, var4 - 2);
        class11.field133.method2810(var2 + 3, -1, var6, var3 + 14, true, class343.field5291);
        int var7 = class414.field6125;
        int var8 = class287.field4604;
        int var9 = 0;
        for (class418 var10 = (class418) class86.field1089.method253((byte) -6); var10 != null; var10 = (class418) class86.field1089.method247((byte) 38)) {
            int var11 = (class144.field2267 - var9 - 1) * 16 + (var3 + 31);
            short var12 = -1;
            if (var2 < var7 && (var2 + var4) > var7 && var8 > (var11 - 13) && var8 < var11 + 3) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class222.method1590((byte) -21, var10.field6192)) {
                var13 = class155.method1092(true, (int) var10.field6194).field1361;
            } else if (class239.method1692(var10.field6192, 121)) {
                class50 var14 = class39.field499[(int) var10.field6194];
                if (var14 != null) {
                    var13 = var14.field615.field3797;
                }
            } else if (class104.method792(var10.field6192, arg0 ^ 0xFFFFB0C5)) {
                if (var10.field6192 == 1001) {
                    var13 = class137.method1003((int) var10.field6194, -30796).field1959;
                } else {
                    var13 = class137.method1003((int) (var10.field6194 >>> 32 & 0x7FFFFFFFL), -30796).field1959;
                }
            }
            String var15 = class30.method209(var10, (byte) -120);
            if (var13 != null) {
                var15 = var15 + class269.method1826(true, var13);
            }
            class11.field133.method2813(var11, var15, class297.field4725, 0, var12, var2 + 3, (byte) 21, class372.field5627);
            var9++;
        }
        class3.method66(class75.field949, -65, class186.field3064, class27.field315, class427.field6299);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLjg;)V")
    public final void method2414(byte arg0, class186 arg1) {
        while (true) {
            int var3 = arg1.method1322(false);
            if (var3 == 0) {
                if (arg0 <= 47) {
                    this.field5727 = null;
                }
                field5730++;
                return;
            }
            this.method2417(var3, 12288, arg1);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIILe;I)Lid;")
    public final class348 method2415(int arg0, int arg1, int arg2, int arg3, class312 arg4, int arg5) {
        field5740++;
        int var7 = arg2;
        class417 var8 = this.field5734 == -1 || arg1 == -1 ? null : class156.method1099(this.field5734, 72);
        if (var8 != null) {
            var7 = arg2 | var8.method2606(false, 100, arg0, arg1);
        }
        if (this.field5743 != 128) {
            var7 |= 0x2;
        }
        if (this.field5745 != 128 || this.field5744 != 0) {
            var7 |= 0x5;
        }
        class52 var9 = class130.field2044;
        class348 var10;
        synchronized (class130.field2044) {
            var10 = (class348) class130.field2044.method331((byte) 69, (long) (this.field5736 |= arg4.field4911 << 29));
        }
        if (var10 == null || arg4.method579(var10.method44(), var7) != 0) {
            if (var10 != null) {
                var7 = arg4.method720(var7, var10.method44());
            }
            int var11 = var7;
            if (this.field5729 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field5722 != null) {
                var11 |= 0x4000;
            }
            class86 var12 = class21.method154(this.field5726, class351.field5427, 0, (byte) 34);
            if (var12 == null) {
                return null;
            }
            var10 = arg4.method639(var12, var11, class354.field5446, this.field5735 + 64, this.field5724 - -850);
            if (this.field5729 != null) {
                for (int var13 = 0; var13 < this.field5729.length; var13++) {
                    var10.method38(this.field5729[var13], this.field5727[var13]);
                }
            }
            if (this.field5722 != null) {
                for (int var14 = 0; var14 < this.field5722.length; var14++) {
                    var10.method35(this.field5722[var14], this.field5732[var14]);
                }
            }
            var10.method9(var7);
            class52 var15 = class130.field2044;
            synchronized (class130.field2044) {
                class130.field2044.method341(57, (long) (this.field5736 |= arg4.field4911 << 29), var10);
            }
        }
        class348 var16 = var8 == null ? var10.method15((byte) 2, var7, true) : var8.method2612(arg5, (byte) 2, var7, arg0, arg1, var10, 0, 128);
        if (this.field5745 != 128 || this.field5743 != 128) {
            var16.method12(this.field5745, this.field5743, this.field5745);
        }
        if (arg3 > -40) {
            this.method2414((byte) -112, (class186) null);
        }
        if (this.field5744 != 0) {
            if (this.field5744 == 90) {
                var16.method41(4096);
            }
            if (this.field5744 == 180) {
                var16.method41(8192);
            }
            if (this.field5744 == 270) {
                var16.method41(12288);
            }
        }
        var16.method9(arg2);
        return var16;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static final void method2416(int arg0) {
        if (arg0 != 30609) {
            field5720 = null;
        }
        field5721++;
        class190 var1 = class312.field4907;
        synchronized (class312.field4907) {
            class271.field4346 = class203.field3260;
            class40.field505++;
            if (class441.field6459 >= 0) {
                while (class441.field6459 != class129.field2042) {
                    int var2 = class275.field4397[class129.field2042];
                    class129.field2042 = class129.field2042 + 1 & 0x7F;
                    if (var2 < 0) {
                        class232.field3856[~var2] = false;
                    } else {
                        class232.field3856[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class232.field3856[var3] = false;
                }
                class441.field6459 = class129.field2042;
            }
            class203.field3260 = class42.field528;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILjg;)V")
    private final void method2417(int arg0, int arg1, class186 arg2) {
        if (arg1 != 12288) {
            field5738 = 120;
        }
        if (arg0 == 1) {
            this.field5726 = arg2.method1272((byte) -87);
        } else if (arg0 == 2) {
            this.field5734 = arg2.method1272((byte) -121);
        } else if (arg0 == 4) {
            this.field5745 = arg2.method1272((byte) -73);
        } else if (arg0 == 5) {
            this.field5743 = arg2.method1272((byte) -90);
        } else if (arg0 == 6) {
            this.field5744 = arg2.method1272((byte) -118);
        } else if (arg0 == 7) {
            this.field5735 = arg2.method1322(false);
        } else if (arg0 == 8) {
            this.field5724 = arg2.method1322(false);
        } else if (arg0 == 9) {
            this.field5728 = true;
        } else if (arg0 == 10) {
            this.field5731 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method1322(false);
            this.field5727 = new short[var4];
            this.field5729 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5729[var5] = (short) arg2.method1272((byte) -110);
                this.field5727[var5] = (short) arg2.method1272((byte) -55);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method1322(false);
            this.field5732 = new short[var6];
            this.field5722 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5722[var7] = (short) arg2.method1272((byte) -59);
                this.field5732[var7] = (short) arg2.method1272((byte) -105);
            }
        }
        field5725++;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public static void method2418(int arg0) {
        field5720 = null;
        if (arg0 < -17) {
            field5747 = null;
            field5723 = null;
            field5741 = null;
            field5742 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field5723[var0] = class444.method2750(726390668, var0);
        }
    }
}
