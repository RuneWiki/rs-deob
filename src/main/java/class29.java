import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class29 {

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Z")
    public static boolean field587 = false;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
    public static int[] field582 = new int[25];

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lpj;")
    public static class237 field576 = class33.method353("::noclip", 76);

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "[Lmb;")
    public static class157[] field592 = new class157[4];

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Lpj;")
    public static class237 field596 = class33.method353(" steht bereits auf Ihrer Freunde)2Liste(Q", 124);

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lpj;")
    private static class237 field585 = class33.method353("You can(Wt add yourself to your own friend list)3", 117);

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Lpj;")
    public static class237 field590 = field585;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "J")
    private long field597;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "J")
    private long field602;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Z")
    public boolean field579;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "[I")
    private int[] field586;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "[I")
    public static int[] field595;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "[I")
    private int[] field601;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method265(byte arg0) {
        field585 = null;
        if (arg0 != -49) {
            return;
        }
        field592 = null;
        field576 = null;
        field582 = null;
        field595 = null;
        field590 = null;
        field596 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZ)V")
    public final void method266(boolean arg0, boolean arg1) {
        this.field579 = arg1;
        field600++;
        if (!arg0) {
            field582 = null;
        }
        this.method271(12);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
    public final void method267(int arg0, int arg1, int arg2) {
        field580++;
        int var4 = class213.field3635[arg1];
        if (this.field601[var4] != 0 && class212.method1422(arg0, arg2 + 2147483568) != null) {
            this.field601[var4] = class34.method362(arg0, arg2);
            this.method271(12);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljb;ILjb;II)Lqk;")
    public final class201 method268(class256 arg0, int arg1, class256 arg2, int arg3, int arg4) {
        field588++;
        if (this.field575 != -1) {
            return class271.method1805(this.field575, 90).method1533(arg0, (byte) 83, arg4, arg3, arg2);
        }
        long var6 = this.field602;
        int[] var8 = this.field601;
        if (arg0 != null && (arg0.field4389 >= 0 || arg0.field4410 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field601[var9];
            }
            if (arg0.field4389 >= 0) {
                if (arg0.field4389 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class34.method362(arg0.field4389, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg0.field4410 >= 0) {
                if (arg0.field4410 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class34.method362(arg0.field4410, 1073741824);
                    var6 ^= (long) var8[3];
                }
            }
        }
        if (arg1 != -9799) {
            return null;
        }
        class201 var10 = (class201) class114.field1997.method940(var6, 32);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((var30 & Integer.MIN_VALUE) != 0 && !class212.method1422(var30 & 0x3FFFFFFF, arg1 ^ 0x2627).method1193(true)) {
                        var11 = true;
                    }
                } else if (!class112.method829((byte) -82, var30 & 0x3FFFFFFF).method97((byte) 104, this.field579)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field597 != -1L) {
                    var10 = (class201) class114.field1997.method940(this.field597, arg1 ^ 0xFFFFD9E7);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var13 = 0;
                class157[] var14 = new class157[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class157 var28 = class112.method829((byte) -82, var27 & 0x3FFFFFFF).method103(arg1 ^ 0x365B, this.field579);
                        if (var28 != null) {
                            var14[var13++] = var28;
                        }
                    } else if ((Integer.MIN_VALUE & var27) != 0) {
                        class157 var29 = class212.method1422(var27 & 0x3FFFFFFF, -95).method1191(2);
                        if (var29 != null) {
                            var14[var13++] = var29;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class8 var17 = class112.method829((byte) -82, var16 & 0x3FFFFFFF);
                    if (var17.field149 != null) {
                        for (int var18 = 0; var18 < var17.field149.length; var18++) {
                            if (var17.field149[var18] != null && var14[var18 + 1] != null) {
                                int var19 = var17.field149[var18][1];
                                int var20 = var17.field149[var18][0];
                                int var21 = var17.field149[var18][3];
                                int var22 = var17.field149[var18][5];
                                int var23 = var17.field149[var18][2];
                                int var24 = var17.field149[var18][4];
                                var14[var18 + 1].method1103(var20, var19, var23);
                                var14[var18 + 1].method1097(var21, var24, var22);
                            }
                        }
                    }
                }
                class157 var25 = new class157(var14, var13);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field586[var26] < class11.field203[var26].length) {
                        var25.method1092(class46.field1003[var26], class11.field203[var26][this.field586[var26]]);
                    }
                    if (this.field586[var26] < class196.field3413[var26].length) {
                        var25.method1092(class207.field3516[var26], class196.field3413[var26][this.field586[var26]]);
                    }
                }
                var10 = var25.method1110(64, 850, -30, -50, -30);
                class114.field1997.method937(arg1 + 9720, var10, var6);
                this.field597 = var6;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var10;
        }
        class201 var31;
        if (arg0 != null && arg2 != null) {
            var31 = arg0.method1726(1, arg4, var10, arg3, arg2);
        } else if (arg0 == null) {
            var31 = arg2.method1733((byte) -9, arg4, var10);
        } else {
            var31 = arg0.method1733((byte) 126, arg3, var10);
        }
        return var31;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILjb;II)Lqk;")
    public final class201 method269(int arg0, int arg1, class256 arg2, int arg3, int arg4) {
        field581++;
        long var6 = (long) arg3 << 32 | (long) (arg4 << 16) | (long) arg3;
        if (arg0 != -22581) {
            field576 = null;
        }
        class201 var8 = (class201) class90.field1640.method940(var6, 119);
        if (var8 == null) {
            class157[] var9 = new class157[2];
            int var10 = 0;
            if (!class212.method1422(arg3, -47).method1196(0) || !class212.method1422(arg4, -91).method1196(arg0 + 22581)) {
                return null;
            }
            class157 var11 = class212.method1422(arg3, -89).method1198(25771);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class157 var12 = class212.method1422(arg4, arg0 + 22520).method1198(25771);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class157 var13 = new class157(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field586[var14] < class11.field203[var14].length) {
                    var13.method1092(class46.field1003[var14], class11.field203[var14][this.field586[var14]]);
                }
                if (class196.field3413[var14].length > this.field586[var14]) {
                    var13.method1092(class207.field3516[var14], class196.field3413[var14][this.field586[var14]]);
                }
            }
            var8 = var13.method1110(64, 768, -50, -10, -50);
            class90.field1640.method937(-41, var8, var6);
        }
        if (arg2 != null) {
            var8 = arg2.method1735(arg1, var8, arg0 + 88116);
        }
        return var8;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(III)J")
    public static final long method270(int arg0, int arg1, int arg2) {
        class35 var3 = class274.field4775[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field759; var4++) {
            class191 var5 = var3.field755[var4];
            if ((var5.field3314 >> 29 & 0x3L) == 2L && var5.field3316 == arg1 && var5.field3315 == arg2) {
                return var5.field3314;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    private final void method271(int arg0) {
        field584++;
        if (arg0 != 12) {
            return;
        }
        long var2 = this.field602;
        this.field602 = -1L;
        long[] var4 = class197.field3425;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field602 = this.field602 >>> 8 ^ var4[(int) ((this.field602 ^ (long) (this.field601[var5] >> 24)) & 0xFFL)];
            this.field602 = this.field602 >>> 8 ^ var4[(int) (((long) (this.field601[var5] >> 16) ^ this.field602) & 0xFFL)];
            this.field602 = var4[(int) (((long) (this.field601[var5] >> 8) ^ this.field602) & 0xFFL)] ^ this.field602 >>> 8;
            this.field602 = this.field602 >>> 8 ^ var4[(int) (((long) this.field601[var5] ^ this.field602) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field602 = this.field602 >>> 8 ^ var4[(int) ((this.field602 ^ (long) this.field586[var6]) & 0xFFL)];
        }
        this.field602 = this.field602 >>> 8 ^ var4[(int) (((long) (this.field579 ? 1 : 0) ^ this.field602) & 0xFFL)];
        if (var2 != 0L && this.field602 != var2) {
            class114.field1997.method943(30801, var2);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lpj;ZILpj;)V")
    public static final void method272(class237 arg0, boolean arg1, int arg2, class237 arg3) {
        class239.field4201 = arg0;
        class239.field4187 = arg3;
        class22.field403 = arg2;
        field593++;
        if (class239.field4201.method1585((byte) 112, class239.field4202) || class239.field4187.method1585((byte) 26, class239.field4202)) {
            class259.field4450 = 3;
        } else if (class126.field2205 == -1) {
            class89.field1630 = 0;
            class63.field1255 = 1;
            class259.field4450 = -3;
            class32 var4 = new class32(128);
            var4.method293((byte) 125, 10);
            var4.method350((byte) 19, (int) (Math.random() * 99999.0D));
            var4.method350((byte) 19, 515);
            var4.method292(97, class239.field4201.method1616(0));
            var4.method290((byte) -20, (int) (Math.random() * 9.9999999E7D));
            var4.method334(-125, class239.field4187);
            var4.method290((byte) -20, (int) (Math.random() * 9.9999999E7D));
            var4.method327(-10248, class177.field3116, class104.field1829);
            class223.field3830.field647 = 0;
            class223.field3830.method293((byte) 125, 178);
            class223.field3830.method293((byte) 125, var4.field647);
            if (arg1) {
                class223.field3830.method320(0, var4.field644, var4.field647, 16);
            }
        } else {
            class260.method1752(-93);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZI[I[I)V")
    public final void method273(int arg0, boolean arg1, int arg2, int[] arg3, int[] arg4) {
        field578++;
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class202.field3462; var7++) {
                    class172 var8 = class212.method1422(var7, arg0 ^ 0xB2C);
                    if (var8 != null && !var8.field3010 && (arg1 ? 7 : 0) + var6 == var8.field3006) {
                        arg4[class213.field3635[var6]] = class34.method362(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field586 = arg3;
        this.field601 = arg4;
        if (arg0 != -2844) {
            field595 = null;
        }
        this.field575 = arg2;
        this.field579 = arg1;
        this.method271(12);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljb;II)Lqk;")
    public final class201 method274(class256 arg0, int arg1, int arg2) {
        field583++;
        if (this.field575 != -1) {
            return class271.method1805(this.field575, arg1 ^ 0x270E).method1528(arg2, false, arg0);
        }
        class201 var4 = (class201) class90.field1640.method940(this.field602, 19);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field601[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class212.method1422(var15 & 0x3FFFFFFF, -43).method1196(0)) {
                        var5 = true;
                    }
                } else if (!class112.method829((byte) -82, var15 & 0x3FFFFFFF).method102(this.field579, -116)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class157[] var7 = new class157[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field601[var9];
                if ((var12 & 0x40000000) != 0) {
                    class157 var13 = class112.method829((byte) -82, var12 & 0x3FFFFFFF).method106(92, this.field579);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class157 var14 = class212.method1422(var12 & 0x3FFFFFFF, -109).method1198(25771);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class157 var10 = new class157(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field586[var11] < class11.field203[var11].length) {
                    var10.method1092(class46.field1003[var11], class11.field203[var11][this.field586[var11]]);
                }
                if (class196.field3413[var11].length > this.field586[var11]) {
                    var10.method1092(class207.field3516[var11], class196.field3413[var11][this.field586[var11]]);
                }
            }
            var4 = var10.method1110(64, 768, -50, -10, -50);
            class90.field1640.method937(arg1 - 10223, var4, this.field602);
        }
        if (arg0 != null) {
            var4 = arg0.method1735(arg2, var4, 65535);
        }
        return arg1 == 10098 ? var4 : null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)I")
    public final int method275(int arg0) {
        field599++;
        if (arg0 != 0) {
            field576 = null;
        }
        return this.field575 == -1 ? (this.field601[0] << 15) + (this.field586[4] << 20) + (this.field586[0] << 25) + this.field601[1] - (-(this.field601[8] << 10) + -(this.field601[11] << 5)) : class271.method1805(this.field575, -73).field3970 + 305419896;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public static final void method276(int arg0) {
        field577++;
        for (int var1 = 0; var1 < class264.field4517; var1++) {
            int var10002 = class147.field2619[var1]--;
            if (class147.field2619[var1] >= -10) {
                class60 var3 = class166.field2942[var1];
                if (var3 == null) {
                    var3 = class60.method515(class108.field1928, class230.field3935[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class147.field2619[var1] += var3.method518();
                    class166.field2942[var1] = var3;
                }
                if (class147.field2619[var1] < 0) {
                    int var4;
                    if (class19.field371[var1] == 0) {
                        var4 = class78.field1459;
                    } else {
                        int var5 = (class19.field371[var1] & 0xFF) * 128;
                        int var6 = (class19.field371[var1] & 0xFF700B) >> 16;
                        int var7 = var6 * 128 + 64 - class229.field3911.field3710;
                        int var8 = (class19.field371[var1] & 0xFF3A) >> 8;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var9 = var8 * 128 + 64 - class229.field3911.field3700;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var5 < var10) {
                            class147.field2619[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class204.field3497 / var5;
                    }
                    if (var4 > 0) {
                        class266 var11 = var3.method517().method1771(class105.field1846);
                        class2 var12 = class2.method14(var11, 100, var4);
                        var12.method39(class52.field1102[var1] - 1);
                        class74.field1424.method586(var12);
                    }
                    class147.field2619[var1] = -100;
                }
            } else {
                class264.field4517--;
                for (int var2 = var1; var2 < class264.field4517; var2++) {
                    class230.field3935[var2] = class230.field3935[var2 + 1];
                    class166.field2942[var2] = class166.field2942[var2 + 1];
                    class52.field1102[var2] = class52.field1102[var2 + 1];
                    class147.field2619[var2] = class147.field2619[var2 + 1];
                    class19.field371[var2] = class19.field371[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != 128) {
            method265((byte) -123);
        }
        if (class140.field2406 && !class3.method56(-1026652120)) {
            if (class113.field1983 != 0 && class190.field3311 != -1) {
                class144.method991(0, false, class190.field3311, class113.field1983, class151.field2685, -81);
            }
            class140.field2406 = false;
        } else if (class113.field1983 != 0 && class190.field3311 != -1 && !class3.method56(-1026652120)) {
            class223.field3830.method368(-97, 173);
            class13.field229++;
            class223.field3830.method290((byte) -20, class190.field3311);
            class190.field3311 = -1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
    public static final void method277(int arg0) {
        if (arg0 < 2) {
            field596 = null;
        }
        field598++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class271.field4664 - 1); var2++) {
                if (class235.field4090[var2] < 1000 && class235.field4090[var2 + 1] > 1000) {
                    var1 = false;
                    class237 var3 = class215.field3747[var2];
                    class215.field3747[var2] = class215.field3747[var2 + 1];
                    class215.field3747[var2 + 1] = var3;
                    class237 var4 = class180.field3168[var2];
                    class180.field3168[var2] = class180.field3168[var2 + 1];
                    class180.field3168[var2 + 1] = var4;
                    int var5 = class119.field2089[var2];
                    class119.field2089[var2] = class119.field2089[var2 + 1];
                    class119.field2089[var2 + 1] = var5;
                    int var6 = class135.field2358[var2];
                    class135.field2358[var2] = class135.field2358[var2 + 1];
                    class135.field2358[var2 + 1] = var6;
                    short var7 = class235.field4090[var2];
                    class235.field4090[var2] = class235.field4090[var2 + 1];
                    class235.field4090[var2 + 1] = var7;
                    long var8 = class35.field760[var2];
                    class35.field760[var2] = class35.field760[var2 + 1];
                    class35.field760[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(III)V")
    public final void method278(int arg0, int arg1, int arg2) {
        field591++;
        this.field586[arg2] = arg0;
        int var4 = -103 / ((arg1 - 17) / 44);
        this.method271(12);
    }
}
