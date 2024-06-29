import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class170 extends class117 {

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    private int field3100 = -1;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "Lhh;")
    public static class163 field3106 = class137.method1065("welle2:", 17);

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "Lhh;")
    public static class163 field3110 = class137.method1065("Spielwelt erstellt)3", 17);

    @OriginalMember(owner = "client!af", name = "kb", descriptor = "Z")
    public static boolean field3118 = false;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "[[[I")
    public static int[][][] field3108 = new int[4][13][13];

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "Lhh;")
    public static class163 field3107 = class137.method1065("Hidden)2", 17);

    @OriginalMember(owner = "client!af", name = "mb", descriptor = "Lhh;")
    public static class163 field3120 = class137.method1065("", 17);

    @OriginalMember(owner = "client!af", name = "lb", descriptor = "Lhh;")
    public static class163 field3119 = field3120;

    @OriginalMember(owner = "client!af", name = "hb", descriptor = "Lhh;")
    public static class163 field3115 = field3120;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!af", name = "db", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "I")
    private int field3113;

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!af", name = "ib", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!af", name = "jb", descriptor = "I")
    private int field3117;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "[I")
    public static int[] field3104;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "[I")
    private int[] field3105;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        ++field3114;
        int[][] var3 = super.field2228.method1304(arg0, (byte) 97);
        if (!arg1) {
            return null;
        } else {
            if (super.field2228.field3221 && this.method1262((byte) -96)) {
                int[] var4 = var3[0];
                int var5 = (~class1.field26 == ~this.field3117 ? arg0 : this.field3117 * arg0 / class1.field26) * this.field3113;
                int[] var6 = var3[2];
                int[] var7 = var3[1];
                if (class143.field2702 == this.field3113) {
                    for (int var8 = 0; ~class143.field2702 < ~var8; ++var8) {
                        int var9 = this.field3105[var5++];
                        var6[var8] = class7.method50(var9, 255) << 4;
                        var7[var8] = class7.method50(var9, 65280) >> 4;
                        var4[var8] = class7.method50(var9, 16711680) >> 12;
                    }
                } else {
                    for (int var10 = 0; ~var10 > ~class143.field2702; ++var10) {
                        int var11 = this.field3113 * var10 / class143.field2702;
                        int var12 = this.field3105[var5 - -var11];
                        var6[var10] = class7.method50(var12, 255) << 4;
                        var7[var10] = class7.method50(var12 >> 4, 4080);
                        var4[var10] = class7.method50(4080, var12 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(B)Z")
    private final boolean method1262(byte arg0) {
        ++field3099;
        if (this.field3105 != null) {
            return true;
        } else if (~this.field3100 <= -1) {
            int var2 = class143.field2702;
            int var3 = class1.field26;
            int var4 = class235.field4207.method670(this.field3100, 0) ? 64 : 128;
            this.field3105 = class235.field4207.method667(this.field3100, 124);
            this.field3117 = var4;
            this.field3113 = var4;
            class19.method136((byte) -49, var3, var2);
            return this.field3105 != null;
        } else {
            return arg0 >= -87 ? false : false;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class170() {
        super(0, false);
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(B)V")
    public static void method1263(byte arg0) {
        field3106 = null;
        field3119 = null;
        if (arg0 != -35) {
            field3107 = null;
        }
        field3110 = null;
        field3108 = null;
        field3115 = null;
        field3107 = null;
        field3104 = null;
        field3120 = null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)Z")
    public static final boolean method1264(int arg0, int arg1) {
        ++field3103;
        if (arg0 < 0) {
            return false;
        } else {
            int var2 = class4.field76[arg0];
            if (~var2 <= -2001) {
                var2 -= 2000;
            }
            if (var2 == 1007) {
                return true;
            } else {
                if (arg1 <= 81) {
                    method1265(-13, (class69) null, -126, -28);
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        ++field3116;
        if (~arg1 == -1) {
            this.field3100 = arg2.method658(92);
        }
        if (arg0 != 0) {
            this.field3113 = 123;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILqh;II)V")
    public static final void method1265(int arg0, class69 arg1, int arg2, int arg3) {
        ++field3109;
        if (~class22.field351 == -1 || class22.field351 == 3) {
            if (arg1.method492((byte) -74)) {
                int var4 = arg1.field1262[arg0];
                if (var4 <= arg2 && arg1.field1306[arg0] + var4 >= arg2) {
                    int var5 = arg0 - arg1.field1220 / 2;
                    int var6 = arg2 - arg1.field1183 / 2;
                    int var7 = 2047 & class93.field1750 + class40.field667;
                    int var8 = class98.field1843[var7];
                    int var9 = class98.field1839[var7];
                    int var10 = (class26.field410 + 256) * var8 >> 8;
                    int var11 = (class26.field410 + 256) * var9 >> 8;
                    if (arg3 == 81) {
                        int var12 = var5 * var10 + -(var6 * var11) >> 11;
                        int var13 = var5 * var11 + var6 * var10 >> 11;
                        int var14 = class235.field4203.field3633 + var13 >> 7;
                        int var15 = -var12 + class235.field4203.field3615 >> 7;
                        if (~class99.field1920 < -1 && class217.field3942[82] && class217.field3942[81]) {
                            class120.method943(class257.field4500 + var15, class20.field323, 29862, class62.field1035 + var14);
                        } else {
                            boolean var16 = class239.method1652(var14, 1, 0, 0, 0, arg3 ^ 44, var15, true, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                            if (var16) {
                                class191.field3499.method655(0, var6);
                                class191.field3499.method655(0, var5);
                                class191.field3499.method631(class93.field1750, -1);
                                class191.field3499.method655(0, 57);
                                class191.field3499.method655(0, class40.field667);
                                class191.field3499.method655(arg3 ^ 81, class26.field410);
                                class191.field3499.method655(0, 89);
                                class191.field3499.method631(class235.field4203.field3633, -1);
                                class191.field3499.method631(class235.field4203.field3615, -1);
                                class191.field3499.method655(0, class260.field4551);
                                class191.field3499.method655(0, 63);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
    public final void method86(int arg0) {
        ++field3102;
        super.method86(arg0);
        this.field3105 = null;
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
    public static final void method1266(int arg0) {
        class100.field1930.method120((byte) -112);
        ++field3101;
        class18.field278.method120((byte) -112);
        class29.field466.method120((byte) -116);
        if (arg0 >= -2) {
            field3104 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)I")
    public final int method934(int arg0) {
        ++field3111;
        if (arg0 != -24687) {
            method1265(125, (class69) null, -43, 79);
        }
        return this.field3100;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1267(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class94.field1771 * arg0 + class231.field4135 * arg3 >> 16;
        int var6 = class94.field1771 * arg3 - class231.field4135 * arg0 >> 16;
        int var7 = class29.field445 * var6 + class168.field3084 * arg1 >> 16;
        int var8 = class29.field445 * arg1 - class168.field3084 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class29.field445 * var6 + class168.field3084 * arg2 >> 16;
        int var12 = class29.field445 * arg2 - class168.field3084 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class120.field2264 && var13 < class120.field2264) {
            return false;
        } else if (var9 > class89.field1644 && var13 > class89.field1644) {
            return false;
        } else if (var10 < class164.field3035 && var14 < class164.field3035) {
            return false;
        } else {
            return var10 <= class97.field1820 || var14 <= class97.field1820;
        }
    }
}
