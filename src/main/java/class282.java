import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class282 extends class182 {

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    private int field4663 = -1;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "[I")
    public static int[] field4666 = new int[256];

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field4670;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    private int field4668;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    private int field4671;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "[I")
    private int[] field4667;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILaj;)V")
    public static final void method1962(int arg0, class151 arg1) {
        class169.field2738 = class222.method1573(class108.field1762, arg1, -64, 0);
        ++field4673;
        class313.field5032 = class222.method1573(class180.field2873, arg1, -93, 0);
        class115.field1954 = class222.method1573(class119.field1999, arg1, 80, 0);
        class64.field1080 = class222.method1573(class136.field2245, arg1, arg0 + 28244, 0);
        class248.field4149 = class222.method1573(class67.field1117, arg1, arg0 + 28260, 0);
        class152.field2539 = class222.method1573(class113.field1932, arg1, -74, 0);
        class95.field1552 = class58.method374(0, 0, arg1, class133.field2192);
        class205.field3299 = class58.method374(arg0 + 28335, 0, arg1, class202.field3245);
        class160.field2614 = class58.method374(arg0 ^ -28335, 0, arg1, class312.field5027);
        class312.field5028 = client.method722(class100.field1584, 102, arg1, 0);
        class57.field1000 = client.method722(class170.field2752, 111, arg1, 0);
        class25.field450.method1231(class57.field1000, (int[]) null);
        class169.field2732.method1231(class57.field1000, (int[]) null);
        class183.field2930.method1231(class57.field1000, (int[]) null);
        class92 var2 = class263.method1864(32767, arg1, class249.field4207, 0);
        var2.method646();
        class62.field1058 = var2;
        class92[] var3 = class289.method2008(arg1, class101.field1610, 0, -936);
        if (arg0 == -28335) {
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                var3[var4].method646();
            }
            class226.field3839 = var3;
        }
    }

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "(I)V")
    public final void method462(int arg0) {
        super.method462(77);
        ++field4659;
        this.field4667 = null;
        if (arg0 < 34) {
            this.field4663 = -30;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)Z")
    private final boolean method1963(byte arg0) {
        ++field4665;
        if (this.field4667 != null) {
            return true;
        } else if (~this.field4663 <= -1) {
            int var2 = class4.field116;
            int var3 = class16.field318;
            int var4 = class195.field3155.method799(this.field4663, (byte) -75).field2840 ? 64 : 128;
            this.field4667 = class195.field3155.method795(false, var4, this.field4663, true, 1.0F, var4);
            this.field4668 = var4;
            this.field4671 = var4;
            class145.method1074(var3, var2, (byte) 92);
            return this.field4667 != null;
        } else {
            if (arg0 != 17) {
                field4670 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        ++field4664;
        int var3 = 112 / ((arg0 - -64) / 49);
        int[][] var4 = super.field2905.method50(arg1, (byte) 118);
        if (super.field2905.field158 && this.method1963((byte) 17)) {
            int var5 = this.field4671 * (~class16.field318 == ~this.field4668 ? arg1 : this.field4668 * arg1 / class16.field318);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            if (class4.field116 != this.field4671) {
                for (int var9 = 0; var9 < class4.field116; ++var9) {
                    int var10 = this.field4671 * var9 / class4.field116;
                    int var11 = this.field4667[var5 + var10];
                    var8[var9] = class15.method84(var11 << 4, 4080);
                    var7[var9] = class15.method84(var11 >> 4, 4080);
                    var6[var9] = class15.method84(4080, var11 >> 12);
                }
            } else {
                for (int var12 = 0; var12 < class4.field116; ++var12) {
                    int var13 = this.field4667[var5++];
                    var8[var12] = class15.method84(var13, 255) << 4;
                    var7[var12] = class15.method84(65280, var13) >> 4;
                    var6[var12] = class15.method84(var13, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
    public static void method1964(byte arg0) {
        field4670 = null;
        field4666 = null;
        int var1 = 115 % ((arg0 - -52) / 63);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4663 = arg1.method1821((byte) 51);
        }
        ++field4660;
        if (arg0) {
            field4666 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class282() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 == 23329) {
            if (~arg1 <= ~class23.field423 && ~arg1 >= ~class272.field4552 && ~class23.field423 >= ~arg0 && arg0 <= class272.field4552 && arg9 >= class23.field423 && class272.field4552 >= arg9 && ~arg6 <= ~class23.field423 && ~arg6 >= ~class272.field4552 && ~class55.field972 >= ~arg3 && ~arg3 >= ~class240.field4053 && ~class55.field972 >= ~arg7 && class240.field4053 >= arg7 && arg4 >= class55.field972 && class240.field4053 >= arg4 && class55.field972 <= arg5 && arg5 <= class240.field4053) {
                class103.method745((byte) 77, arg6, arg9, arg2, arg7, arg1, arg3, arg0, arg4, arg5);
            } else {
                class249.method1808(arg7, arg6, arg9, arg4, arg2, 7901, arg1, arg5, arg3, arg0);
            }
            ++field4669;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4672;
        int var7 = class243.method1742(class55.field972, 0, class240.field4053, arg6);
        int var8 = class243.method1742(class55.field972, arg0 ^ arg0, class240.field4053, arg4);
        int var9 = class243.method1742(class23.field423, 0, class272.field4552, arg5);
        int var10 = class243.method1742(class23.field423, 0, class272.field4552, arg3);
        int var11 = class243.method1742(class55.field972, 0, class240.field4053, arg1 + arg6);
        int var12 = class243.method1742(class55.field972, 0, class240.field4053, arg4 - arg1);
        for (int var13 = var7; var13 < var11; ++var13) {
            class134.method996(0, var10, var9, arg2, class41.field630[var13]);
        }
        for (int var14 = var8; ~var14 < ~var12; --var14) {
            class134.method996(0, var10, var9, arg2, class41.field630[var14]);
        }
        int var15 = class243.method1742(class23.field423, 0, class272.field4552, arg1 + arg5);
        int var16 = class243.method1742(class23.field423, 0, class272.field4552, -arg1 + arg3);
        for (int var17 = var11; ~var12 <= ~var17; ++var17) {
            int[] var18 = class41.field630[var17];
            class134.method996(0, var15, var9, arg2, var18);
            class134.method996(0, var10, var16, arg2, var18);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZIB[B[Llb;)V")
    public static final void method1967(int arg0, boolean arg1, int arg2, byte arg3, byte[] arg4, class311[] arg5) {
        ++field4661;
        if (arg3 == -6) {
            class249 var6 = new class249(arg4);
            int var7 = -1;
            while (true) {
                int var8 = var6.method1777(-11);
                if (~var8 == -1) {
                    return;
                }
                int var9 = 0;
                var7 += var8;
                while (true) {
                    int var10 = var6.method1819(-1741461848);
                    if (var10 == 0) {
                        break;
                    }
                    var9 += var10 + -1;
                    int var11 = (4083 & var9) >> 6;
                    int var12 = var9 >> 12;
                    int var13 = var9 & 63;
                    int var14 = var6.method1802((byte) 45);
                    int var15 = arg2 + var11;
                    int var16 = var14 & 3;
                    int var17 = var13 - -arg0;
                    int var18 = var14 >> 2;
                    if (~var15 < -1 && var17 > 0 && var15 < 103 && ~var17 > -104) {
                        class311 var19 = null;
                        if (!arg1) {
                            int var20 = var12;
                            if (~(class67.field1132[1][var15][var17] & 2) == -3) {
                                var20 = var12 - 1;
                            }
                            if (~var20 <= -1) {
                                var19 = arg5[var20];
                            }
                        }
                        class72.method510(var17, -104, arg1, var12, var15, !arg1, var19, var16, var7, var12, var18);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)I")
    public final int method1321(int arg0) {
        ++field4662;
        if (arg0 != -1) {
            field4670 = null;
        }
        return this.field4663;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if ((1 & var1) == 1) {
                    var1 = var1 >>> 1 ^ -306674912;
                } else {
                    var1 >>>= 1;
                }
            }
            field4666[var0] = var1;
        }
        field4670 = "Loaded textures";
    }
}
