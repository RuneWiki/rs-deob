import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class170 {

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field2901 = -1;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Loh;")
    public static class258 field2895 = class153.method1046("Spielwelt erstellt)3", 91);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public int field2907;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "J")
    private long field2888;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "J")
    private long field2896;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Lgb;")
    public static class213 field2902;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Z")
    public boolean field2894;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "[I")
    private int[] field2899;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "[I")
    private int[] field2906;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lgb;Loh;Z)Lui;", line = 12)
    public static final class225 method1126(class213 arg0, class258 arg1, boolean arg2) {
        field2905++;
        int var3 = arg0.method1451(-127, arg1);
        if (var3 == -1) {
            return new class225(0);
        }
        if (arg2) {
            field2902 = (class213) null;
        }
        int[] var4 = arg0.method1431(var3, (byte) -72);
        class225 var5 = new class225(var4.length);
        for (int var6 = 0; var6 < var5.field3856; var6++) {
            class235 var7 = new class235(arg0.method1453(var3, (byte) -47, var4[var6]));
            var5.field3851[var6] = var7.method1620(95);
            var5.field3847[var6] = var7.method1617((byte) -117);
            var5.field3853[var6] = (short) var7.method1615(-124);
            var5.field3854[var6] = (short) var7.method1615(-122);
            var5.field3858[var6] = var7.method1611(-101);
        }
        return var5;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZI)V", line = 54)
    public static final void method1127(int arg0, boolean arg1, int arg2) {
        field2900++;
        class286 var3 = class48.method389(arg2, 5, 10738);
        if (arg1) {
            field2895 = (class258) null;
        }
        var3.method2017(-112);
        var3.field4932 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 69)
    public static final void method1128(int arg0) {
        field2889++;
        Container var1;
        if (class71.field1253 != null) {
            var1 = class71.field1253;
        } else if (class284.field4882 == null) {
            var1 = class297.field5086.field5061;
        } else {
            var1 = class284.field4882;
        }
        class276.field4762 = var1.getSize().width;
        class314.field5326 = var1.getSize().height;
        if (class284.field4882 == var1) {
            Insets var2 = class284.field4882.getInsets();
            class314.field5326 -= var2.top + var2.bottom;
            class276.field4762 -= var2.right + var2.left;
        }
        if (class185.method1253((byte) 86) >= 2) {
            class63.field1098 = 0;
            class42.field577 = class314.field5326;
            class115.field2052 = 0;
            class218.field3773 = class276.field4762;
        } else {
            class42.field577 = 503;
            class115.field2052 = (class276.field4762 - 765) / 2;
            class63.field1098 = 0;
            class218.field3773 = 765;
        }
        if (arg0 != 1073741823) {
            field2902 = (class213) null;
        }
        if (class257.field4390) {
            class257.method1748(class218.field3773, class42.field577);
        }
        class5.field67.setSize(class218.field3773, class42.field577);
        if (class284.field4882 == var1) {
            Insets var3 = class284.field4882.getInsets();
            class5.field67.setLocation(class115.field2052 + var3.left, var3.top - -class63.field1098);
        } else {
            class5.field67.setLocation(class115.field2052, class63.field1098);
        }
        if (field2901 != -1) {
            class173.method1169(83, true);
        }
        class27.method212(77);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIILpb;)Li;", line = 132)
    public final class305 method1129(int arg0, int arg1, int arg2, int arg3, class2 arg4) {
        if (arg0 != -1) {
            this.method1129(4, -51, -83, 50, (class2) null);
        }
        field2891++;
        long var6 = (long) arg2 | (long) arg2 << 32 | (long) (arg3 << 16);
        class305 var8 = (class305) class281.field4831.method1159((byte) 127, var6);
        if (var8 == null) {
            class97[] var9 = new class97[2];
            int var10 = 0;
            if (!class232.method1554(arg2, 3).method1474(-54) || !class232.method1554(arg3, arg0 + 4).method1474(-78)) {
                return null;
            }
            class97 var11 = class232.method1554(arg2, 3).method1482((byte) 78);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class97 var12 = class232.method1554(arg3, 3).method1482((byte) 78);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class97 var13 = new class97(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class271.field4701[var14].length > this.field2906[var14]) {
                    var13.method727(class167.field2838[var14], class271.field4701[var14][this.field2906[var14]]);
                }
                if (this.field2906[var14] < class169.field2884[var14].length) {
                    var13.method727(class225.field3865[var14], class169.field2884[var14][this.field2906[var14]]);
                }
            }
            var8 = var13.method713(64, 768, -50, -10, -50);
            class281.field4831.method1163(var8, -1, var6);
        }
        if (arg4 != null) {
            var8 = arg4.method14(var8, arg1, (byte) -108);
        }
        return var8;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 199)
    private final void method1130(byte arg0) {
        long var2 = this.field2896;
        long[] var4 = class299.field5119;
        field2903++;
        if (arg0 >= -62) {
            return;
        }
        this.field2896 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2896 = this.field2896 >>> 8 ^ var4[(int) (((long) (this.field2899[var5] >> 24) ^ this.field2896) & 0xFFL)];
            this.field2896 = var4[(int) ((this.field2896 ^ (long) (this.field2899[var5] >> 16)) & 0xFFL)] ^ this.field2896 >>> 8;
            this.field2896 = this.field2896 >>> 8 ^ var4[(int) (((long) (this.field2899[var5] >> 8) ^ this.field2896) & 0xFFL)];
            this.field2896 = var4[(int) (((long) this.field2899[var5] ^ this.field2896) & 0xFFL)] ^ this.field2896 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2896 = this.field2896 >>> 8 ^ var4[(int) ((this.field2896 ^ (long) this.field2906[var6]) & 0xFFL)];
        }
        this.field2896 = var4[(int) (((long) (this.field2894 ? 1 : 0) ^ this.field2896) & 0xFFL)] ^ this.field2896 >>> 8;
        if (var2 != 0L && this.field2896 != var2) {
            class153.field2631.method1162(58, var2);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)I", line = 240)
    public final int method1131(byte arg0) {
        if (arg0 >= -105) {
            return -26;
        } else {
            field2898++;
            return this.field2907 == -1 ? (this.field2906[0] << 25) + (this.field2906[4] << 20) + this.field2899[1] + (this.field2899[11] << 5) + (this.field2899[8] << 10) + (this.field2899[0] << 15) : class88.method632(64, this.field2907).field2596 + 305419896;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V", line = 255)
    public static final void method1132(int arg0, int arg1) {
        if (arg1 != 2) {
            field2895 = (class258) null;
        }
        if (arg0 == -1 && !class106.field1898) {
            class128.method927((byte) 123);
        } else if (arg0 != -1 && (class2.field36 != arg0 || !class11.method77(arg1 - 3)) && class244.field4233 != 0 && !class106.field1898) {
            class155.method1056(false, class95.field1667, 0, -121, 2, arg0, class244.field4233);
        }
        field2908++;
        class2.field36 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V", line = 287)
    public static void method1133(byte arg0) {
        field2902 = null;
        field2895 = null;
        if (arg0 > -25) {
            method1126((class213) null, (class258) null, false);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IZI)V", line = 302)
    public final void method1134(int arg0, boolean arg1, int arg2) {
        int var4 = class159.field2713[arg2];
        field2909++;
        if (this.field2899[var4] == 0 || class232.method1554(arg0, 3) == null) {
            return;
        }
        this.field2899[var4] = class307.method2139(arg0, Integer.MIN_VALUE);
        this.method1130((byte) -115);
        if (!arg1) {
            field2901 = -52;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V", line = 325)
    public static final void method1135(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class300.field5129; var3++) {
            for (int var4 = 0; var4 < class23.field277; var4++) {
                for (int var5 = 0; var5 < class290.field4995; var5++) {
                    class228 var6 = class178.field3180[var3][var4][var5];
                    if (var6 != null) {
                        class23 var7 = var6.field3923;
                        if (var7 != null && var7.field291.method709()) {
                            class80.method574(var7.field291, var3, var4, var5, 1, 1);
                            if (var7.field289 != null && var7.field289.method709()) {
                                class80.method574(var7.field289, var3, var4, var5, 1, 1);
                                var7.field291.method711(var7.field289, 0, 0, 0, false);
                                var7.field289 = var7.field289.method735(arg0, arg1, arg2);
                            }
                            var7.field291 = var7.field291.method735(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3950; var8++) {
                            class219 var9 = var6.field3932[var8];
                            if (var9 != null && var9.field3801.method709()) {
                                class80.method574(var9.field3801, var3, var4, var5, var9.field3785 + 1 - var9.field3793, var9.field3789 - var9.field3797 + 1);
                                var9.field3801 = var9.field3801.method735(arg0, arg1, arg2);
                            }
                        }
                        class250 var10 = var6.field3931;
                        if (var10 != null && var10.field4310.method709()) {
                            class30.method226(var10.field4310, var3, var4, var5);
                            var10.field4310 = var10.field4310.method735(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZ)V", line = 398)
    public final void method1136(int arg0, int arg1, boolean arg2) {
        this.field2906[arg0] = arg1;
        if (!arg2) {
            field2895 = (class258) null;
        }
        field2892++;
        this.method1130((byte) -73);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BZ)V", line = 411)
    public final void method1137(byte arg0, boolean arg1) {
        int var3 = 13 / ((arg0 + 16) / 62);
        this.field2894 = arg1;
        this.method1130((byte) -120);
        field2910++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lgb;II)Lja;", line = 426)
    public static final class265 method1138(class213 arg0, int arg1, int arg2) {
        field2897++;
        if (arg1 != 0) {
            method1133((byte) 94);
        }
        byte[] var3 = arg0.method1437(arg1 ^ 0xFFFFFFBC, arg2);
        return var3 == null ? null : new class265(var3);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BILpb;)Li;", line = 442)
    public final class305 method1139(byte arg0, int arg1, class2 arg2) {
        if (arg0 != -71) {
            return (class305) null;
        }
        field2904++;
        if (this.field2907 != -1) {
            return class88.method632(-67, this.field2907).method1036(arg1, 0, arg2);
        }
        class305 var4 = (class305) class281.field4831.method1159((byte) 126, this.field2896);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field2899[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var7) != 0 && !class232.method1554(var7 & 0x3FFFFFFF, arg0 ^ 0xFFFFFFBA).method1474(-115)) {
                        var5 = true;
                    }
                } else if (!class186.method1256((byte) 111, var7 & 0x3FFFFFFF).method479(this.field2894, true)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class97[] var8 = new class97[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field2899[var10];
                if ((var11 & 0x40000000) != 0) {
                    class97 var13 = class186.method1256((byte) 127, var11 & 0x3FFFFFFF).method475(this.field2894, arg0 ^ 0xFFFFFFE7);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                } else if ((var11 & Integer.MIN_VALUE) != 0) {
                    class97 var12 = class232.method1554(var11 & 0x3FFFFFFF, 3).method1482((byte) 78);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                }
            }
            class97 var14 = new class97(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (this.field2906[var15] < class271.field4701[var15].length) {
                    var14.method727(class167.field2838[var15], class271.field4701[var15][this.field2906[var15]]);
                }
                if (class169.field2884[var15].length > this.field2906[var15]) {
                    var14.method727(class225.field3865[var15], class169.field2884[var15][this.field2906[var15]]);
                }
            }
            var4 = var14.method713(64, 768, -50, -10, -50);
            class281.field4831.method1163(var4, -1, this.field2896);
        }
        if (arg2 != null) {
            var4 = arg2.method14(var4, arg1, (byte) -122);
        }
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([I[IZII)V", line = 557)
    public final void method1140(int[] arg0, int[] arg1, boolean arg2, int arg3, int arg4) {
        field2890++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class121.field2145; var7++) {
                    class218 var8 = class232.method1554(var7, 3);
                    if (var8 != null && !var8.field3769 && (var6 + (arg2 ? 7 : 0)) == var8.field3764) {
                        arg1[class159.field2713[var6]] = class307.method2139(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field2894 = arg2;
        if (arg3 == 9564) {
            this.field2906 = arg0;
            this.field2899 = arg1;
            this.field2907 = arg4;
            this.method1130((byte) -91);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILpb;IILpb;)Li;", line = 605)
    public final class305 method1141(int arg0, class2 arg1, int arg2, int arg3, class2 arg4) {
        field2893++;
        if (this.field2907 != -1) {
            return class88.method632(51, this.field2907).method1033(arg2, arg0, arg1, arg4, 0);
        }
        long var6 = this.field2896;
        int[] var8 = this.field2899;
        if (arg4 != null && (arg4.field13 >= 0 || arg4.field10 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field2899[var9];
            }
            if (arg4.field13 >= 0) {
                if (arg4.field13 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class307.method2139(1073741824, arg4.field13);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg4.field10 >= 0) {
                if (arg4.field10 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class307.method2139(arg4.field10, 1073741824);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class305 var10 = (class305) class153.field2631.method1159((byte) 121, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var8[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((var13 & Integer.MIN_VALUE) != 0 && !class232.method1554(var13 & 0x3FFFFFFF, arg3 + 20043).method1473(0)) {
                        var11 = true;
                    }
                } else if (!class186.method1256((byte) 113, var13 & 0x3FFFFFFF).method466(this.field2894, 118)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2888 != -1L) {
                    var10 = (class305) class153.field2631.method1159((byte) 125, this.field2888);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class97[] var14 = new class97[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var8[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class97 var19 = class186.method1256((byte) 122, var17 & 0x3FFFFFFF).method476(true, this.field2894);
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    } else if ((var17 & Integer.MIN_VALUE) != 0) {
                        class97 var18 = class232.method1554(var17 & 0x3FFFFFFF, 3).method1483(-9394);
                        if (var18 != null) {
                            var14[var15++] = var18;
                        }
                    }
                }
                int var20 = var8[0];
                if ((var20 & 0x40000000) != 0) {
                    class61 var21 = class186.method1256((byte) 112, var20 & 0x3FFFFFFF);
                    if (var21.field1071 != null) {
                        for (int var22 = 0; var22 < var21.field1071.length; var22++) {
                            if (var21.field1071[var22] != null && var14[var22 + 1] != null) {
                                int var23 = var21.field1071[var22][0];
                                int var24 = var21.field1071[var22][1];
                                int var25 = var21.field1071[var22][3];
                                int var26 = var21.field1071[var22][4];
                                int var27 = var21.field1071[var22][2];
                                int var28 = var21.field1071[var22][5];
                                var14[var22 + 1].method724(var23, var24, var27);
                                var14[var22 + 1].method714(var25, var26, var28);
                            }
                        }
                    }
                }
                class97 var29 = new class97(var14, var15);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (this.field2906[var30] < class271.field4701[var30].length) {
                        var29.method727(class167.field2838[var30], class271.field4701[var30][this.field2906[var30]]);
                    }
                    if (this.field2906[var30] < class169.field2884[var30].length) {
                        var29.method727(class225.field3865[var30], class169.field2884[var30][this.field2906[var30]]);
                    }
                }
                var10 = var29.method713(64, 850, -30, -50, -30);
                if (class257.field4390) {
                    ((class175) var10).method1197(false, false, true, true, false, false, true);
                }
                class153.field2631.method1163(var10, -1, var6);
                this.field2888 = var6;
            }
        }
        if (arg3 != -20040) {
            this.field2894 = true;
        }
        if (arg4 == null && arg1 == null) {
            return var10;
        }
        class305 var31;
        if (arg4 != null && arg1 != null) {
            var31 = arg4.method17(arg2, arg1, var10, arg0, -33);
        } else if (arg4 == null) {
            var31 = arg1.method16(13, arg0, var10);
        } else {
            var31 = arg4.method16(13, arg2, var10);
        }
        return var31;
    }
}
