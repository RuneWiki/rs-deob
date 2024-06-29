import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class245 extends class175 {

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
    private int field4266 = 10;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    private int field4261 = 0;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
    private int field4258 = 2048;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "Lij;")
    public static class50 field4262 = class78.method578(125, "b12_full");

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "Lij;")
    public static class50 field4271 = class78.method578(122, "");

    @OriginalMember(owner = "client!lh", name = "fb", descriptor = "Lij;")
    public static class50 field4275 = field4271;

    @OriginalMember(owner = "client!lh", name = "gb", descriptor = "Lij;")
    public static class50 field4276 = field4271;

    @OriginalMember(owner = "client!lh", name = "mb", descriptor = "Lij;")
    private static class50 field4282 = class78.method578(125, " is already on your friend list)3");

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "Lij;")
    public static class50 field4274 = field4282;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!lh", name = "hb", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!lh", name = "jb", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "Lqj;")
    public static class152 field4259;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "Lwi;")
    public static class21 field4265;

    @OriginalMember(owner = "client!lh", name = "lb", descriptor = "Lwi;")
    public static class21 field4281;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "Z")
    public static boolean field4254;

    @OriginalMember(owner = "client!lh", name = "ib", descriptor = "[I")
    private int[] field4278;

    @OriginalMember(owner = "client!lh", name = "kb", descriptor = "[I")
    private int[] field4280;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "[[[I")
    public static int[][][] field4257;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V")
    private final void method1668(byte arg0) {
        ++field4255;
        int var2 = 0;
        this.field4278 = new int[this.field4266 + 1];
        int var3 = 4096 / this.field4266;
        this.field4280 = new int[this.field4266 + 1];
        int var4 = this.field4258 * var3 >> 12;
        if (arg0 != -39) {
            method1669(14, 72, true, -26, -42, 44, -102);
        }
        for (int var5 = 0; var5 < this.field4266; ++var5) {
            this.field4278[var5] = var2;
            this.field4280[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4278[this.field4266] = 4096;
        this.field4280[this.field4266] = 4096 - -this.field4280[0];
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class245() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZIIII)V")
    public static final void method1669(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4268;
        if (class31.field619 != arg1 || class20.field422 != arg4 || ~class93.field1746 != ~arg0 && !class174.method1198(arg5 + 6748)) {
            class20.field422 = arg4;
            class93.field1746 = arg0;
            class31.field619 = arg1;
            if (class174.method1198(0)) {
                class93.field1746 = 0;
            }
            if (!arg2) {
                class120.method868(11, 25);
            } else {
                class120.method868(50, 28);
            }
            class75.method564(-9117, true, class188.field3115);
            int var7 = class61.field1124;
            int var8 = class254.field4394;
            class61.field1124 = arg1 * 8 + -48;
            class254.field4394 = arg4 * 8 + -48;
            int var9 = -var8 + class254.field4394;
            int var10 = class254.field4394;
            int var11 = -var7 + class61.field1124;
            int var12 = class61.field1124;
            if (!arg2) {
                for (int var13 = 0; ~var13 > -32769; ++var13) {
                    class53 var14 = class41.field764[var13];
                    if (var14 != null) {
                        for (int var15 = 0; var15 < 10; ++var15) {
                            var14.field3978[var15] -= var11;
                            var14.field3980[var15] -= var9;
                        }
                        var14.field3990 -= var11 * 128;
                        var14.field4027 -= var9 * 128;
                    }
                }
            } else {
                class6.field77 = 0;
                for (int var16 = 0; ~var16 > -32769; ++var16) {
                    class53 var32 = class41.field764[var16];
                    if (var32 != null) {
                        var32.field4027 -= var9 * 128;
                        var32.field3990 -= var11 * 128;
                        if (var32.field3990 >= 0 && ~var32.field3990 >= -13185 && var32.field4027 >= 0 && var32.field4027 <= 13184) {
                            for (int var33 = 0; ~var33 > -11; ++var33) {
                                var32.field3978[var33] -= var11;
                                var32.field3980[var33] -= var9;
                            }
                            class153.field2678[class6.field77++] = var16;
                        } else {
                            class41.field764[var16].field959 = null;
                            class41.field764[var16] = null;
                        }
                    }
                }
            }
            for (int var17 = 0; ~var17 > -2049; ++var17) {
                class187 var30 = class71.field1370[var17];
                if (var30 != null) {
                    for (int var31 = 0; var31 < 10; ++var31) {
                        var30.field3978[var31] -= var11;
                        var30.field3980[var31] -= var9;
                    }
                    var30.field4027 -= var9 * 128;
                    var30.field3990 -= var11 * 128;
                }
            }
            byte var18 = 0;
            byte var19 = 104;
            class201.field3312 = arg0;
            byte var20 = 1;
            if (~var11 > -1) {
                var20 = -1;
                var18 = 103;
                var19 = -1;
            }
            class239.field4067.method1609(false, -41, arg6, arg3);
            byte var21 = 1;
            byte var22 = 0;
            byte var23 = 104;
            if (arg5 == -6748) {
                if (var9 < 0) {
                    var22 = 103;
                    var21 = -1;
                    var23 = -1;
                }
                for (int var24 = var18; ~var19 != ~var24; var24 += var20) {
                    for (int var26 = var22; var23 != var26; var26 += var21) {
                        int var27 = var26 - -var9;
                        int var28 = var11 + var24;
                        for (int var29 = 0; var29 < 4; ++var29) {
                            if (var28 >= 0 && ~var27 <= -1 && ~var28 > -105 && var27 < 104) {
                                class184.field3022[var29][var24][var26] = class184.field3022[var29][var28][var27];
                            } else {
                                class184.field3022[var29][var24][var26] = null;
                            }
                        }
                    }
                }
                for (class203 var25 = (class203) class227.field3824.method689(1001); var25 != null; var25 = (class203) class227.field3824.method688(arg5 ^ 6773)) {
                    var25.field3373 -= var9;
                    var25.field3366 -= var11;
                    if (var25.field3366 < 0 || ~var25.field3373 > -1 || var25.field3366 >= 104 || var25.field3373 >= 104) {
                        var25.method267(15);
                    }
                }
                class6.field72 = 0;
                class177.field2957 = -1;
                if (!arg2) {
                    class130.field2291 = 1;
                } else {
                    class243.field4234 -= var11;
                    class109.field1963 -= var9;
                    class224.field3772 -= var9;
                    class174.field2914 -= var11;
                }
                if (class259.field4512 != 0) {
                    class102.field1872 -= var9;
                    class259.field4512 -= var11;
                }
                class47.field860.method680((byte) -68);
                class22.field508.method680((byte) -68);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4256;
        int var6 = 85 / ((arg5 - -30) / 47);
        int var7 = -arg0 + arg4;
        int var8 = -arg3 + arg1;
        if (var7 == 0) {
            if (~var8 != -1) {
                class255.method1724(arg3, arg0, arg1, -2537, arg2);
            }
        } else if (~var8 == -1) {
            class139.method971(arg4, arg0, arg3, 451, arg2);
        } else {
            int var9 = (var8 << 12) / var7;
            int var10 = -(arg0 * var9 >> 12) + arg3;
            int var11;
            int var12;
            if (~arg4 > ~class177.field2953) {
                var11 = class177.field2953;
                var12 = (class177.field2953 * var9 >> 12) + var10;
            } else if (class224.field3773 >= arg4) {
                var11 = arg4;
                var12 = arg1;
            } else {
                var12 = var10 - -(class224.field3773 * var9 >> 12);
                var11 = class224.field3773;
            }
            if (class100.field1855 <= var12) {
                if (class97.field1816 < var12) {
                    var11 = (-var10 + class97.field1816 << 12) / var9;
                    var12 = class97.field1816;
                }
            } else {
                var11 = (-var10 + class100.field1855 << 12) / var9;
                var12 = class100.field1855;
            }
            int var13;
            int var14;
            if (class177.field2953 > arg0) {
                var13 = class177.field2953;
                var14 = (class177.field2953 * var9 >> 12) + var10;
            } else if (~arg0 >= ~class224.field3773) {
                var13 = arg0;
                var14 = arg3;
            } else {
                var13 = class224.field3773;
                var14 = (class224.field3773 * var9 >> 12) + var10;
            }
            if (~var14 > ~class100.field1855) {
                var13 = (-var10 + class100.field1855 << 12) / var9;
                var14 = class100.field1855;
            } else if (~class97.field1816 > ~var14) {
                var13 = (class97.field1816 - var10 << 12) / var9;
                var14 = class97.field1816;
            }
            class151.method1056(var14, -12, var12, var13, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)V")
    public static final void method1671(int arg0, int arg1) {
        ++field4267;
        if (arg1 != 2048) {
            field4282 = null;
        }
        class45.field822.method770(true, arg0);
        class209.field3473.method770(true, arg0);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field4260;
        if (arg1 != -27746) {
            method1675(-49, 92);
        }
        int[] var3 = super.field2941.method1427(arg1 ^ 16193, arg0);
        if (super.field2941.field3565) {
            int var4 = class29.field616[arg0];
            if (~this.field4261 != -1) {
                for (int var5 = 0; ~var5 > ~class211.field3514; ++var5) {
                    int var6 = 0;
                    int var7 = class129.field2272[var5];
                    short var8 = 0;
                    int var9 = this.field4261;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (var9 == 3) {
                                var6 = (-var4 + var7 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 + -4096 + var7 >> 1) + 2048;
                        }
                    } else {
                        var6 = var7;
                    }
                    for (int var10 = 0; ~this.field4266 < ~var10; ++var10) {
                        if (this.field4278[var10] <= var6 && this.field4278[var10 + 1] > var6) {
                            if (~this.field4280[var10] < ~var6) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var8;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field4266 < ~var12; ++var12) {
                    if (var4 >= this.field4278[var12] && ~var4 > ~this.field4278[var12 + 1]) {
                        if (~this.field4280[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class105.method794(var3, 0, class211.field3514, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
    public final void method44(int arg0) {
        ++field4263;
        this.method1668((byte) -39);
        if (arg0 != 0) {
            field4274 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)V")
    public static final void method1672(byte arg0) {
        int var1 = -96 / ((7 - arg0) / 32);
        ++field4270;
        class109.field1945.method763(0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field4261 = arg2.method1487(255);
                }
            } else {
                this.field4258 = arg2.method1441(-103);
            }
        } else {
            this.field4266 = arg2.method1487(255);
        }
        ++field4264;
        if (!arg0) {
            this.field4280 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)V")
    public static final void method1673(boolean arg0) {
        ++field4279;
        int var1 = class129.field2267;
        int var2 = class231.field3864;
        int var3 = class70.field1339;
        int var4 = class244.field4247;
        int var5 = 6116423;
        class158.method1104(var1, var2, var4, var3, var5);
        if (!arg0) {
            field4254 = false;
        }
        class158.method1104(var1 + 1, var2 + 1, var4 + -2, 16, 0);
        class158.method1119(var1 + 1, var2 + 18, var4 + -2, var3 + -19, 0);
        class57.field1029.method1058(class45.field824, var1 + 3, var2 + 14, var5, -1);
        int var6 = class69.field1297;
        int var7 = class173.field2904;
        for (int var8 = 0; ~var8 > ~class136.field2368; ++var8) {
            int var9 = (class136.field2368 + -1 - var8) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var1 - -var4 > var6 && ~(var9 + -13) > ~var7 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class57.field1029.method1058(class79.method584(var8, -12022), var1 - -3, var9, var10, 0);
        }
        class141.method989(111, class129.field2267, class244.field4247, class231.field3864, class70.field1339);
    }

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
    public static void method1674(int arg0) {
        field4259 = null;
        if (arg0 == 12966) {
            field4274 = null;
            field4275 = null;
            field4262 = null;
            field4276 = null;
            field4265 = null;
            field4271 = null;
            field4282 = null;
            field4257 = null;
            field4281 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(II)V")
    public static final void method1675(int arg0, int arg1) {
        ++field4272;
        if (arg0 > -25) {
            field4262 = null;
        }
        class161.field2767.method770(true, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(II)I")
    public static final int method1676(int arg0, int arg1) {
        ++field4273;
        if (arg1 != 127) {
            field4259 = null;
        }
        return 127 & arg0;
    }
}
