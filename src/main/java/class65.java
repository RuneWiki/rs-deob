import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class65 {

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Z")
    private boolean field1027 = false;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    private int field1026 = 32;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "J")
    private long field1014 = class263.method1754(124);

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "Z")
    private boolean field1039 = true;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "[Lai;")
    private class88[] field1040 = new class88[8];

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    private int field1041 = 0;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "J")
    private long field1038 = 0L;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "[Lai;")
    private class88[] field1043 = new class88[8];

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    private int field1045 = 0;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
    private int field1046 = 0;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "J")
    private long field1047 = 0L;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "I")
    private int field1048 = 0;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "[S")
    public static short[] field1034 = new short[256];

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    private int field1036;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "Lai;")
    private class88 field1035;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "[I")
    public int[] field1029;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "[I")
    public static int[] field1030;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "[Lsb;")
    public static class230[] field1024;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
    public void method18() {
        field1018++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILai;I)V")
    private final void method433(int arg0, class88 arg1, int arg2) {
        if (arg2 != -31574) {
            this.method434((int[]) null, 116);
        }
        field1022++;
        int var4 = arg0 >> 5;
        class88 var5 = this.field1043[var4];
        if (var5 == null) {
            this.field1040[var4] = arg1;
        } else {
            var5.field1397 = arg1;
        }
        this.field1043[var4] = arg1;
        arg1.field1396 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()V")
    public void method20() throws Exception {
        field1016++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([II)V")
    private final void method434(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class275.field4153) {
            var3 = arg1 << 1;
        }
        class193.method1205(arg0, 0, var3);
        this.field1045 -= arg1;
        if (this.field1035 != null && this.field1045 <= 0) {
            this.field1045 += class248.field3764 >> 4;
            class231.method1470(this.field1035, -256);
            this.method433(this.field1035.method572(), this.field1035, -31574);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class88 var10 = null;
                        class88 var11 = this.field1040[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class28 var12 = var11.field1398;
                                if (var12 == null || var12.field344 <= var8) {
                                    var11.field1399 = true;
                                    int var13 = var11.method273();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field344 += var13;
                                    }
                                    if (var4 >= this.field1026) {
                                        break label107;
                                    }
                                    class88 var14 = var11.method257();
                                    if (var14 != null) {
                                        int var15 = var11.field1396;
                                        while (var14 != null) {
                                            this.method433(var15 * var14.method572() >> 8, var14, -31574);
                                            var14 = var11.method270();
                                        }
                                    }
                                    class88 var16 = var11.field1397;
                                    var11.field1397 = null;
                                    if (var10 == null) {
                                        this.field1040[var7] = var16;
                                    } else {
                                        var10.field1397 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1043[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1397;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class88 var18 = this.field1040[var17];
                this.field1040[var17] = this.field1043[var17] = null;
                while (var18 != null) {
                    class88 var19 = var18.field1397;
                    var18.field1397 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1045 < 0) {
            this.field1045 = 0;
        }
        if (this.field1035 != null) {
            this.field1035.method265(arg0, 0, arg1);
        }
        this.field1014 = class263.method1754(-23);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
    private final void method435(int arg0, boolean arg1) {
        this.field1045 -= arg0;
        if (arg1) {
            return;
        }
        if (this.field1045 < 0) {
            this.field1045 = 0;
        }
        if (this.field1035 != null) {
            this.field1035.method249(arg0);
        }
        field1017++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public final synchronized void method436(byte arg0) {
        if (class48.field772 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class48.field772.field4574[var3] == this) {
                    class48.field772.field4574[var3] = null;
                }
                if (class48.field772.field4574[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class48.field772.field4580 = true;
                while (class48.field772.field4576) {
                    class250.method1643(arg0 ^ 0xFFFFFFA5, 50L);
                }
                class48.field772 = null;
            }
        }
        field1020++;
        this.method18();
        this.field1029 = null;
        if (arg0 != -92) {
            method444(-114, -121, (class31) null, -12, 89, 7, -17, true, false, -121, -17);
        }
        this.field1027 = true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method437(int arg0) {
        field1012++;
        if (arg0 != 32414) {
            return;
        }
        if (class12.field157.toLowerCase().indexOf("microsoft") != -1) {
            class52.field845[189] = 26;
            class52.field845[186] = 57;
            class52.field845[188] = 71;
            class52.field845[192] = 58;
            class52.field845[187] = 27;
            class52.field845[220] = 74;
            class52.field845[221] = 43;
            class52.field845[219] = 42;
            class52.field845[191] = 73;
            class52.field845[190] = 72;
            class52.field845[223] = 28;
            class52.field845[222] = 59;
            return;
        }
        class52.field845[61] = 27;
        if (class12.field169 == null) {
            class52.field845[222] = 59;
            class52.field845[192] = 58;
        } else {
            class52.field845[192] = 28;
            class52.field845[222] = 58;
            class52.field845[520] = 59;
        }
        class52.field845[93] = 43;
        class52.field845[92] = 74;
        class52.field845[59] = 57;
        class52.field845[44] = 71;
        class52.field845[45] = 26;
        class52.field845[47] = 73;
        class52.field845[46] = 72;
        class52.field845[91] = 42;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public final synchronized void method438(int arg0) {
        field1028++;
        if (this.field1027) {
            return;
        }
        long var2 = class263.method1754(-25);
        try {
            if (var2 > (this.field1014 + 500000L)) {
                this.field1014 = var2 - 500000L;
            }
            while (var2 > (this.field1014 + 5000L)) {
                this.method435(256, false);
                this.field1014 += (long) (256000 / class248.field3764);
            }
        } catch (Exception var7) {
            this.field1014 = var2;
        }
        if (this.field1029 == null) {
            return;
        }
        try {
            if (this.field1038 != 0L) {
                if (this.field1038 > var2) {
                    return;
                }
                this.method23(this.field1044);
                this.field1039 = true;
                this.field1038 = 0L;
            }
            int var4 = this.method19();
            if (arg0 == 2000) {
                if (this.field1048 < this.field1046 - var4) {
                    this.field1048 = this.field1046 - var4;
                }
                int var5 = this.field1037 + this.field1036;
                if (var5 + 256 > 16384) {
                    var5 = 16128;
                }
                if (this.field1044 < (var5 + 256)) {
                    this.field1044 += 1024;
                    if (this.field1044 > 16384) {
                        this.field1044 = 16384;
                    }
                    this.method18();
                    var4 = 0;
                    this.method23(this.field1044);
                    this.field1039 = true;
                    if (this.field1044 < var5 + 256) {
                        var5 = this.field1044 - 256;
                        this.field1036 = var5 - this.field1037;
                    }
                }
                while (var5 > var4) {
                    var4 += 256;
                    this.method434(this.field1029, 256);
                    this.method24();
                }
                if (var2 > this.field1047) {
                    if (this.field1039) {
                        this.field1039 = false;
                    } else if (this.field1048 == 0 && this.field1041 == 0) {
                        this.method18();
                        this.field1038 = var2 + 2000L;
                        return;
                    } else {
                        this.field1036 = Math.min(this.field1041, this.field1048);
                        this.field1041 = this.field1048;
                    }
                    this.field1048 = 0;
                    this.field1047 = var2 + 2000L;
                }
                this.field1046 = var4;
            }
        } catch (Exception var6) {
            this.method18();
            this.field1038 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()I")
    public int method19() throws Exception {
        field1031++;
        return this.field1044;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public final synchronized void method439(int arg0) {
        this.field1039 = true;
        try {
            this.method20();
        } catch (Exception var2) {
            this.method18();
            this.field1038 = class263.method1754(124) + 2000L;
        }
        if (arg0 != 18387) {
            method440(-37);
        }
        field1015++;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public void method23(int arg0) throws Exception {
        field1013++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method21(Component arg0) throws Exception {
        field1021++;
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
    public static final void method440(int arg0) {
        class244.field3653.method1782(0);
        field1033++;
        if (arg0 != 256) {
            field1024 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V")
    public static void method441(int arg0) {
        field1030 = null;
        if (arg0 >= 28) {
            field1024 = null;
            field1034 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lai;B)V")
    public final synchronized void method442(class88 arg0, byte arg1) {
        this.field1035 = arg0;
        field1019++;
        if (arg1 < 62) {
            this.method435(-91, true);
        }
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
    public static final void method443(int arg0) {
        class196.field2979.method1106(99, false);
        class198.field3012++;
        class196.field2979.method1610(791715792, (long) arg0);
        field1032++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILha;IIIIZZII)V")
    public static final void method444(int arg0, int arg1, class31 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8, int arg9, int arg10) {
        field1042++;
        if (arg7 && !class266.method1772(104) && (class221.field3333[0][arg3][arg10] & 0x2) == 0) {
            if ((class221.field3333[arg0][arg3][arg10] & 0x10) != 0) {
                return;
            }
            if (class251.method1649((byte) 45, arg3, arg10, arg0) != class79.field1273) {
                return;
            }
        }
        if (class276.field4160 > arg0) {
            class276.field4160 = arg0;
        }
        class288 var11 = class274.method1816(86, arg4);
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var12 = var11.field4383;
            var13 = var11.field4307;
        } else {
            var12 = var11.field4307;
            var13 = var11.field4383;
        }
        int[][] var14 = class67.field1072[arg6];
        int var15;
        int var16;
        if ((arg10 + var12) > 104) {
            var15 = arg10 + 1;
            var16 = arg10;
        } else {
            var16 = arg10 + (var12 >> 1);
            var15 = arg10 + (var12 + 1 >> 1);
        }
        int var17 = (arg3 << 7) + (var13 << 6);
        int var18;
        int var19;
        if (arg3 + var13 > 104) {
            var18 = arg3;
            var19 = arg3 + 1;
        } else {
            var18 = (var13 >> 1) + arg3;
            var19 = arg3 + (var13 + 1 >> 1);
        }
        long var20 = (long) (arg1 | 0x400 << 20 | arg5 << 14 | arg3 | arg10 << 7);
        int var22 = (arg10 << 7) + (var12 << 6);
        int var23 = var14[var18][var16] + var14[var19][var16] + var14[var18][var15] + var14[var19][var15] >> 2;
        int[][] var24 = null;
        if (var11.field4346 == 0 || arg8) {
            var20 |= Long.MIN_VALUE;
        }
        if (arg8) {
            var24 = class297.field4695[0];
        } else if (arg6 < 3) {
            var24 = class67.field1072[arg6 + 1];
        }
        if (var11.field4366 == 1) {
            var20 |= 0x400000L;
        }
        if (var11.field4318) {
            var20 |= 0x80000000L;
        }
        if (var11.method1908(arg9 + 74)) {
            class89.method573(arg3, (class107) null, arg0, arg1, (class61) null, arg10, arg9 ^ 0x7B, var11);
        }
        boolean var25 = var11.field4309 & !arg8;
        long var26 = var20 | (long) arg4 << 32;
        if (arg5 == 22) {
            if (class213.field3188 || var11.field4346 != 0 || var11.field4375 == 1 || var11.field4370) {
                class114 var29;
                if (var11.field4357 == -1 && var11.field4345 == null && var11.field4336 == null && !var11.field4339) {
                    class165 var28 = var11.method1905(arg9 ^ 0x300, var22, (class179) null, 22, var23, arg1, var17, var14, var25, arg7, var24);
                    var29 = var28.field2542;
                } else {
                    var29 = new class59(arg4, 22, arg1, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
                }
                class66.method447(arg0, arg3, arg10, var23, var29, var26, var11.field4386);
                if (var11.field4375 == 1 && arg2 != null) {
                    arg2.method206(arg10, arg3, 262144);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class114 var69;
            if (var11.field4357 == -1 && var11.field4345 == null && var11.field4336 == null && !var11.field4339) {
                class165 var68 = var11.method1905(768, var22, (class179) null, 10, var23, arg5 == 11 ? arg1 + 4 : arg1, var17, var14, var25, arg7, var24);
                var69 = var68.field2542;
            } else {
                var69 = new class59(arg4, 10, arg5 == 11 ? arg1 + 4 : arg1, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
            }
            if (var69 != null) {
                boolean var70 = class82.method541(arg0, arg3, arg10, var23, var13, var12, var69, 0, var26);
                if (var11.field4314 && var70 && arg7) {
                    int var71 = 15;
                    if (var69 instanceof class14) {
                        var71 = ((class14) var69).method100() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (class118.field1784[arg0][arg3 + var72][arg10 + var73] < var71) {
                                class118.field1784[arg0][arg3 + var72][arg10 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field4375 != 0 && arg2 != null) {
                arg2.method195(arg3, 3445, !var11.field4365, var11.field4333, var12, arg10, var13);
            }
        } else if (arg5 >= 12) {
            class114 var31;
            if (var11.field4357 == -1 && var11.field4345 == null && var11.field4336 == null && !var11.field4339) {
                class165 var30 = var11.method1905(768, var22, (class179) null, arg5, var23, arg1, var17, var14, var25, arg7, var24);
                var31 = var30.field2542;
            } else {
                var31 = new class59(arg4, arg5, arg1, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
            }
            class82.method541(arg0, arg3, arg10, var23, 1, 1, var31, 0, var26);
            if (arg7 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0 && var11.field4330 != 0) {
                class143.field2102[arg0][arg3][arg10] = class63.method428(class143.field2102[arg0][arg3][arg10], 4);
            }
            if (var11.field4375 != 0 && arg2 != null) {
                arg2.method195(arg3, 3445, !var11.field4365, var11.field4333, var12, arg10, var13);
            }
        } else if (arg5 == arg9) {
            class114 var33;
            if (var11.field4357 == -1 && var11.field4345 == null && var11.field4336 == null && !var11.field4339) {
                class165 var32 = var11.method1905(768, var22, (class179) null, 0, var23, arg1, var17, var14, var25, arg7, var24);
                var33 = var32.field2542;
            } else {
                var33 = new class59(arg4, 0, arg1, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
            }
            class294.method1959(arg0, arg3, arg10, var23, var33, (class114) null, class221.field3332[arg1], 0, var26);
            if (arg7) {
                if (arg1 == 0) {
                    if (var11.field4314) {
                        class118.field1784[arg0][arg3][arg10] = 50;
                        class118.field1784[arg0][arg3][arg10 + 1] = 50;
                    }
                    if (var11.field4330 == 1) {
                        class143.field2102[arg0][arg3][arg10] = class63.method428(class143.field2102[arg0][arg3][arg10], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field4314) {
                        class118.field1784[arg0][arg3][arg10 + 1] = 50;
                        class118.field1784[arg0][arg3 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field4330 == 1) {
                        class143.field2102[arg0][arg3][arg10 + 1] = class63.method428(class143.field2102[arg0][arg3][arg10 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field4314) {
                        class118.field1784[arg0][arg3 + 1][arg10] = 50;
                        class118.field1784[arg0][arg3 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field4330 == 1) {
                        class143.field2102[arg0][arg3 + 1][arg10] = class63.method428(class143.field2102[arg0][arg3 + 1][arg10], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field4314) {
                        class118.field1784[arg0][arg3][arg10] = 50;
                        class118.field1784[arg0][arg3 + 1][arg10] = 50;
                    }
                    if (var11.field4330 == 1) {
                        class143.field2102[arg0][arg3][arg10] = class63.method428(class143.field2102[arg0][arg3][arg10], 2);
                    }
                }
            }
            if (var11.field4375 != 0 && arg2 != null) {
                arg2.method203(arg5, var11.field4333, arg9 ^ 0x8, !var11.field4365, arg10, arg3, arg1);
            }
            if (var11.field4341 != 16) {
                class31.method202(arg0, arg3, arg10, var11.field4341);
            }
        } else if (arg5 == 1) {
            class114 var35;
            if (var11.field4357 == -1 && var11.field4345 == null && var11.field4336 == null && !var11.field4339) {
                class165 var34 = var11.method1905(768, var22, (class179) null, 1, var23, arg1, var17, var14, var25, arg7, var24);
                var35 = var34.field2542;
            } else {
                var35 = new class59(arg4, 1, arg1, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
            }
            class294.method1959(arg0, arg3, arg10, var23, var35, (class114) null, class178.field2730[arg1], 0, var26);
            if (var11.field4314 && arg7) {
                if (arg1 == 0) {
                    class118.field1784[arg0][arg3][arg10 + 1] = 50;
                } else if (arg1 == 1) {
                    class118.field1784[arg0][arg3 + 1][arg10 + 1] = 50;
                } else if (arg1 == 2) {
                    class118.field1784[arg0][arg3 + 1][arg10] = 50;
                } else if (arg1 == 3) {
                    class118.field1784[arg0][arg3][arg10] = 50;
                }
            }
            if (var11.field4375 != 0 && arg2 != null) {
                arg2.method203(arg5, var11.field4333, 8, !var11.field4365, arg10, arg3, arg1);
            }
        } else if (arg5 == 2) {
            int var36 = arg1 + 1 & 0x3;
            class114 var38;
            class114 var40;
            if (var11.field4357 == -1 && var11.field4345 == null && var11.field4336 == null && !var11.field4339) {
                class165 var37 = var11.method1905(arg9 + 768, var22, (class179) null, 2, var23, arg1 + 4, var17, var14, var25, arg7, var24);
                var38 = var37.field2542;
                class165 var39 = var11.method1905(768, var22, (class179) null, 2, var23, var36, var17, var14, var25, arg7, var24);
                var40 = var39.field2542;
            } else {
                var38 = new class59(arg4, 2, arg1 + 4, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
                var40 = new class59(arg4, 2, var36, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
            }
            class294.method1959(arg0, arg3, arg10, var23, var38, var40, class221.field3332[arg1], class221.field3332[var36], var26);
            if (var11.field4330 == 1 && arg7) {
                if (arg1 == 0) {
                    class143.field2102[arg0][arg3][arg10] = class63.method428(class143.field2102[arg0][arg3][arg10], 1);
                    class143.field2102[arg0][arg3][arg10 + 1] = class63.method428(class143.field2102[arg0][arg3][arg10 + 1], 2);
                } else if (arg1 == 1) {
                    class143.field2102[arg0][arg3][arg10 + 1] = class63.method428(class143.field2102[arg0][arg3][arg10 + 1], 2);
                    class143.field2102[arg0][arg3 + 1][arg10] = class63.method428(class143.field2102[arg0][arg3 + 1][arg10], 1);
                } else if (arg1 == 2) {
                    class143.field2102[arg0][arg3 + 1][arg10] = class63.method428(class143.field2102[arg0][arg3 + 1][arg10], 1);
                    class143.field2102[arg0][arg3][arg10] = class63.method428(class143.field2102[arg0][arg3][arg10], 2);
                } else if (arg1 == 3) {
                    class143.field2102[arg0][arg3][arg10] = class63.method428(class143.field2102[arg0][arg3][arg10], 2);
                    class143.field2102[arg0][arg3][arg10] = class63.method428(class143.field2102[arg0][arg3][arg10], 1);
                }
            }
            if (var11.field4375 != 0 && arg2 != null) {
                arg2.method203(arg5, var11.field4333, 8, !var11.field4365, arg10, arg3, arg1);
            }
            if (var11.field4341 != 16) {
                class31.method202(arg0, arg3, arg10, var11.field4341);
            }
        } else if (arg5 == 3) {
            class114 var42;
            if (var11.field4357 == -1 && var11.field4345 == null && var11.field4336 == null && !var11.field4339) {
                class165 var41 = var11.method1905(arg9 + 768, var22, (class179) null, 3, var23, arg1, var17, var14, var25, arg7, var24);
                var42 = var41.field2542;
            } else {
                var42 = new class59(arg4, 3, arg1, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
            }
            class294.method1959(arg0, arg3, arg10, var23, var42, (class114) null, class178.field2730[arg1], 0, var26);
            if (var11.field4314 && arg7) {
                if (arg1 == 0) {
                    class118.field1784[arg0][arg3][arg10 + 1] = 50;
                } else if (arg1 == 1) {
                    class118.field1784[arg0][arg3 + 1][arg10 + 1] = 50;
                } else if (arg1 == 2) {
                    class118.field1784[arg0][arg3 + 1][arg10] = 50;
                } else if (arg1 == 3) {
                    class118.field1784[arg0][arg3][arg10] = 50;
                }
            }
            if (var11.field4375 != 0 && arg2 != null) {
                arg2.method203(arg5, var11.field4333, arg9 + 8, !var11.field4365, arg10, arg3, arg1);
            }
        } else if (arg5 == 9) {
            class114 var44;
            if (var11.field4357 == -1 && var11.field4345 == null && var11.field4336 == null && !var11.field4339) {
                class165 var43 = var11.method1905(768, var22, (class179) null, arg5, var23, arg1, var17, var14, var25, arg7, var24);
                var44 = var43.field2542;
            } else {
                var44 = new class59(arg4, arg5, arg1, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
            }
            class82.method541(arg0, arg3, arg10, var23, 1, 1, var44, 0, var26);
            if (var11.field4375 != 0 && arg2 != null) {
                arg2.method195(arg3, 3445, !var11.field4365, var11.field4333, var12, arg10, var13);
            }
            if (var11.field4341 != 16) {
                class31.method202(arg0, arg3, arg10, var11.field4341);
            }
        } else if (arg5 == 4) {
            class114 var46;
            if (var11.field4357 == -1 && var11.field4345 == null && var11.field4336 == null && !var11.field4339) {
                class165 var45 = var11.method1905(arg9 ^ 0x300, var22, (class179) null, 4, var23, arg1, var17, var14, var25, arg7, var24);
                var46 = var45.field2542;
            } else {
                var46 = new class59(arg4, 4, arg1, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
            }
            class199.method1253(arg0, arg3, arg10, var23, var46, (class114) null, class221.field3332[arg1], 0, 0, 0, var26);
        } else if (arg5 == 5) {
            long var47 = class154.method939(arg0, arg3, arg10);
            int var49 = 16;
            if (var47 != 0L) {
                var49 = class274.method1816(39, (int) (var47 >>> 32) & Integer.MAX_VALUE).field4341;
            }
            class114 var51;
            if (var11.field4357 == -1 && var11.field4345 == null && var11.field4336 == null && !var11.field4339) {
                class165 var50 = var11.method1905(768, var22, (class179) null, 4, var23, arg1, var17, var14, var25, arg7, var24);
                var51 = var50.field2542;
            } else {
                var51 = new class59(arg4, 4, arg1, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
            }
            class199.method1253(arg0, arg3, arg10, var23, var51, (class114) null, class221.field3332[arg1], 0, class6.field102[arg1] * var49, class293.field4619[arg1] * var49, var26);
        } else if (arg5 == 6) {
            long var52 = class154.method939(arg0, arg3, arg10);
            int var54 = 8;
            if (var52 != 0L) {
                var54 = class274.method1816(116, (int) (var52 >>> 32) & Integer.MAX_VALUE).field4341 / 2;
            }
            class114 var56;
            if (var11.field4357 == -1 && var11.field4345 == null && var11.field4336 == null && !var11.field4339) {
                class165 var55 = var11.method1905(768, var22, (class179) null, 4, var23, arg1 + 4, var17, var14, var25, arg7, var24);
                var56 = var55.field2542;
            } else {
                var56 = new class59(arg4, 4, arg1 + 4, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
            }
            class199.method1253(arg0, arg3, arg10, var23, var56, (class114) null, 256, arg1, class94.field1492[arg1] * var54, class22.field269[arg1] * var54, var26);
        } else if (arg5 == 7) {
            int var57 = arg1 + 2 & 0x3;
            class114 var59;
            if (var11.field4357 == -1 && var11.field4345 == null && var11.field4336 == null && !var11.field4339) {
                class165 var58 = var11.method1905(768, var22, (class179) null, 4, var23, var57 + 4, var17, var14, var25, arg7, var24);
                var59 = var58.field2542;
            } else {
                var59 = new class59(arg4, 4, var57 + 4, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
            }
            class199.method1253(arg0, arg3, arg10, var23, var59, (class114) null, 256, var57, 0, 0, var26);
        } else if (arg5 == 8) {
            int var60 = 8;
            long var61 = class154.method939(arg0, arg3, arg10);
            int var63 = arg1 + 2 & 0x3;
            if (var61 != 0L) {
                var60 = class274.method1816(103, (int) (var61 >>> 32) & Integer.MAX_VALUE).field4341 / 2;
            }
            class114 var65;
            class114 var67;
            if (var11.field4357 == -1 && var11.field4345 == null && var11.field4336 == null && !var11.field4339) {
                class165 var64 = var11.method1905(768, var22, (class179) null, 4, var23, arg1 + 4, var17, var14, var25, arg7, var24);
                var65 = var64.field2542;
                class165 var66 = var11.method1905(arg9 ^ 0x300, var22, (class179) null, 4, var23, var63 + 4, var17, var14, var25, arg7, var24);
                var67 = var66.field2542;
            } else {
                var65 = new class59(arg4, 4, arg1 + 4, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
                var67 = new class59(arg4, 4, var63 + 4, arg6, arg3, arg10, -1, var11.field4343, (class114) null);
            }
            class199.method1253(arg0, arg3, arg10, var23, var65, var67, 256, arg1, class94.field1492[arg1] * var60, class22.field269[arg1] * var60, var26);
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "()V")
    public void method24() throws Exception {
        field1025++;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public final void method445(byte arg0) {
        field1023++;
        this.field1039 = true;
        if (arg0 != 122) {
            this.field1040 = null;
        }
    }
}
