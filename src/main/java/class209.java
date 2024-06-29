import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class209 extends class306 {

    @OriginalMember(owner = "client!ce", name = "Ob", descriptor = "I")
    public int field3440 = 0;

    @OriginalMember(owner = "client!ce", name = "Kb", descriptor = "I")
    public int field3436 = -1;

    @OriginalMember(owner = "client!ce", name = "Vb", descriptor = "I")
    public int field3447 = 0;

    @OriginalMember(owner = "client!ce", name = "Pb", descriptor = "S")
    private short field3441 = 0;

    @OriginalMember(owner = "client!ce", name = "jc", descriptor = "I")
    public int field3461 = 0;

    @OriginalMember(owner = "client!ce", name = "cc", descriptor = "I")
    public int field3454 = 0;

    @OriginalMember(owner = "client!ce", name = "gc", descriptor = "I")
    public int field3458 = -1;

    @OriginalMember(owner = "client!ce", name = "tc", descriptor = "I")
    public int field3471 = -1;

    @OriginalMember(owner = "client!ce", name = "mc", descriptor = "I")
    public int field3464 = -1;

    @OriginalMember(owner = "client!ce", name = "sc", descriptor = "I")
    public int field3470 = -1;

    @OriginalMember(owner = "client!ce", name = "xc", descriptor = "I")
    public int field3475 = -1;

    @OriginalMember(owner = "client!ce", name = "qc", descriptor = "I")
    public int field3468 = 0;

    @OriginalMember(owner = "client!ce", name = "Mb", descriptor = "I")
    public int field3438 = 0;

    @OriginalMember(owner = "client!ce", name = "uc", descriptor = "Z")
    public boolean field3472 = false;

    @OriginalMember(owner = "client!ce", name = "Rb", descriptor = "S")
    private short field3443 = 0;

    @OriginalMember(owner = "client!ce", name = "Ac", descriptor = "I")
    public int field3478 = 0;

    @OriginalMember(owner = "client!ce", name = "kc", descriptor = "I")
    private int field3462 = 0;

    @OriginalMember(owner = "client!ce", name = "Sb", descriptor = "Lph;")
    public static class229 field3444 = class266.method1858("null", 0);

    @OriginalMember(owner = "client!ce", name = "fc", descriptor = "I")
    public static int field3457 = -1;

    @OriginalMember(owner = "client!ce", name = "hc", descriptor = "I")
    public static int field3459 = 0;

    @OriginalMember(owner = "client!ce", name = "yc", descriptor = "Lph;")
    public static class229 field3476 = class266.method1858("M", 0);

    @OriginalMember(owner = "client!ce", name = "Lb", descriptor = "I")
    public int field3437;

    @OriginalMember(owner = "client!ce", name = "Nb", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ce", name = "Tb", descriptor = "I")
    public int field3445;

    @OriginalMember(owner = "client!ce", name = "Wb", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ce", name = "Yb", descriptor = "I")
    public int field3450;

    @OriginalMember(owner = "client!ce", name = "Zb", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!ce", name = "ac", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ce", name = "bc", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!ce", name = "dc", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!ce", name = "ec", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ce", name = "ic", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ce", name = "nc", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ce", name = "oc", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!ce", name = "pc", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!ce", name = "rc", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ce", name = "vc", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ce", name = "wc", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!ce", name = "zc", descriptor = "I")
    public int field3477;

    @OriginalMember(owner = "client!ce", name = "Ub", descriptor = "Lmd;")
    public class136 field3446;

    @OriginalMember(owner = "client!ce", name = "lc", descriptor = "Lph;")
    public class229 field3463;

    @OriginalMember(owner = "client!ce", name = "Xb", descriptor = "Lv;")
    public class286 field3449;

    @OriginalMember(owner = "client!ce", name = "Qb", descriptor = "Lsi;")
    public static class66 field3442;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Lph;", line = 7)
    public final class229 method1453(byte arg0) {
        if (arg0 >= -19) {
            this.method182();
        }
        field3455++;
        class229 var2 = this.field3463;
        if (class230.field3827 != null) {
            var2 = class248.method1746(8528, new class229[] { class230.field3827[this.field3462], var2 });
        }
        if (class89.field1511 != null) {
            var2 = class248.method1746(8528, new class229[] { var2, class89.field1511[this.field3462] });
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()I", line = 27)
    public final int method182() {
        field3439++;
        return this.field5126;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBZI)V", line = 63)
    public final void method1454(int arg0, byte arg1, boolean arg2, int arg3) {
        if (arg1 <= -13) {
            super.method2066(arg0, arg3, this.method1457(0), (byte) -40, arg2);
            field3466++;
        }
    }

    @OriginalMember(owner = "client!ce", name = "finalize", descriptor = "()V", line = 84)
    protected final void finalize() {
        field3473++;
        if (this.field5125 != null) {
            this.field5125.method1375();
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLhb;)V", line = 103)
    public final void method1455(byte arg0, class164 arg1) {
        arg1.field2670 = 0;
        field3465++;
        int var3 = arg1.method1178(8);
        if ((var3 & 0x2) == 2) {
            this.field3441 = (short) (arg1.method1178(8) << 2);
            this.field3443 = (short) (arg1.method1178(arg0 - 107) << 2);
        } else {
            this.field3443 = 0;
            this.field3441 = 0;
        }
        int var4 = var3 & 0x1;
        int var5 = super.method1457(arg0 ^ 0x73);
        int[] var6 = new int[12];
        int var7 = -1;
        boolean var8 = (var3 & 0x4) != 0;
        this.method2058((byte) -90, ((var3 & 0x38) >> 3) + 1);
        this.field3462 = (var3 & 0xF6) >> 6;
        this.field5147 += (this.method1457(0) - var5) * 64;
        this.field5168 += (this.method1457(arg0 ^ 0x73) - var5) * 64;
        this.field3458 = arg1.method1163(864348104);
        this.field3475 = arg1.method1163(arg0 + 864347989);
        this.field3438 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg1.method1178(8);
            if (var10 == 0) {
                var6[var9] = 0;
            } else {
                int var11 = arg1.method1178(8);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg1.method1161(true);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class314.field5347[var12 - 32768];
                    var6[var9] = class201.method1410(var13, 1073741824);
                    int var14 = class124.method920(-84, var13).field3169;
                    if (var14 != 0) {
                        this.field3438 = var14;
                    }
                } else {
                    var6[var9] = class201.method1410(Integer.MIN_VALUE, var12 - 256);
                }
            }
        }
        int[] var15 = new int[5];
        if (arg0 != 115) {
            return;
        }
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg1.method1178(8);
            if (var17 < 0 || class102.field1746[var16].length <= var17) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field5153 = arg1.method1161(true);
        if (this.field5153 == 65535) {
            this.field5153 = -1;
        }
        this.field5114 = arg1.method1161(true);
        if (this.field5114 == 65535) {
            this.field5114 = -1;
        }
        this.field5131 = this.field5114;
        this.field5142 = arg1.method1161(true);
        if (this.field5142 == 65535) {
            this.field5142 = -1;
        }
        this.field5146 = arg1.method1161(true);
        if (this.field5146 == 65535) {
            this.field5146 = -1;
        }
        this.field5161 = arg1.method1161(true);
        if (this.field5161 == 65535) {
            this.field5161 = -1;
        }
        this.field5160 = arg1.method1161(true);
        if (this.field5160 == 65535) {
            this.field5160 = -1;
        }
        this.field5101 = arg1.method1161(true);
        if (this.field5101 == 65535) {
            this.field5101 = -1;
        }
        long var18 = arg1.method1174(arg0 - 11100);
        this.field3463 = class100.method767((byte) 121, var18).method1628(-32);
        this.field3468 = arg1.method1178(8);
        if (var8) {
            this.field3478 = arg1.method1161(true);
            this.field3454 = this.field3468;
            this.field3470 = -1;
        } else {
            this.field3478 = 0;
            this.field3454 = arg1.method1178(8);
            this.field3470 = arg1.method1178(8);
            if (this.field3470 == 255) {
                this.field3470 = -1;
            }
        }
        int var20 = this.field3447;
        this.field3447 = arg1.method1178(8);
        if (this.field3447 == 0) {
            class97.method720(this, (byte) -21);
        } else {
            int var21 = this.field3464;
            int var22 = this.field3436;
            int var23 = this.field3471;
            this.field3464 = arg1.method1161(true);
            this.field3436 = arg1.method1161(true);
            this.field3471 = arg1.method1161(true);
            if (this.field3447 != var20 || this.field3464 != var21 || this.field3436 != var22 || this.field3471 != var23) {
                class19.method115(true, this);
            }
        }
        if (this.field3446 == null) {
            this.field3446 = new class136();
        }
        int var24 = this.field3446.field2208;
        this.field3446.method966(var7, var6, var15, var4 == 1, arg0 ^ 0xFFFFFFAC);
        if (var7 != var24) {
            this.field5147 = this.field5104[0] * 128 + (this.method1457(0) * 64);
            this.field5168 = this.field5159[0] * 128 + this.method1457(0) * 64;
        }
        if (this.field5125 != null) {
            this.field5125.method1360();
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIJILbn;)V", line = 314)
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class194 arg10) {
        field3456++;
        if (this.field3446 == null) {
            return;
        }
        class312 var13 = this.field5136 != -1 && this.field5135 == 0 ? class53.method362((byte) 107, this.field5136) : null;
        class312 var14 = this.field5115 == -1 || this.field3472 || this.field5153 == this.field5115 && var13 != null ? null : class53.method362((byte) 109, this.field5115);
        class286 var15 = this.field3446.method965(true, this.field5116, this.field5175, 16711680, var13, var14);
        int var16 = class98.method727((byte) 32);
        if (class99.field1675 && class241.field3982 < 96 && var16 > 50) {
            class306.method2060(true);
        }
        if (class218.field3586 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class139.field2252) {
                class233.field3849[class139.field2252] = new byte[102400];
                class139.field2252++;
            }
            while (class139.field2252 > var17) {
                class139.field2252--;
                class233.field3849[class139.field2252] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field5126 = var15.method182();
        if (class45.field687 && (this.field3446.field2208 == -1 || class25.method155(this.field3446.field2208, -103).field5277)) {
            class286 var18 = class241.method1693(arg0, this.field5147, this.field5169, 240, this.field5133, 160, (byte) -46, this.field5168, var14 == null ? var13 : var14, var14 == null ? this.field5116 : this.field5175, var15, 0, 1, 0);
            if (class99.field1675) {
                float var19 = class99.method733();
                float var20 = class99.method759();
                class99.method743();
                class99.method739(var19, var20 - 150.0F);
                var18.method185(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class194) null);
                class99.method755();
                class99.method739(var19, var20);
            } else {
                var18.method185(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class194) null);
            }
        }
        if (class230.field3820 == this) {
            for (int var21 = class162.field2606.length - 1; var21 >= 0; var21--) {
                class240 var22 = class162.field2606[var21];
                if (var22 != null && var22.field3968 != -1) {
                    if (var22.field3977 == 1 && var22.field3979 >= 0 && class187.field3035.length > var22.field3979) {
                        class217 var23 = class187.field3035[var22.field3979];
                        if (var23 != null) {
                            int var24 = var23.field5147 / 32 - class230.field3820.field5147 / 32;
                            int var25 = var23.field5168 / 32 - (class230.field3820.field5168 / 32);
                            this.method1456((class194) null, arg3, var15, arg2, arg6, arg0, var24, arg5, arg4, var25, var22.field3968, arg9, (byte) 44, arg1, arg7);
                        }
                    }
                    if (var22.field3977 == 2) {
                        int var26 = (var22.field3978 - class1.field9) * 4 + 2 - (class230.field3820.field5147 / 32);
                        int var27 = (var22.field3964 - class1.field1) * 4 + 2 - (class230.field3820.field5168 / 32);
                        this.method1456((class194) null, arg3, var15, arg2, arg6, arg0, var26, arg5, arg4, var27, var22.field3968, arg9, (byte) 48, arg1, arg7);
                    }
                    if (var22.field3977 == 10 && var22.field3979 >= 0 && var22.field3979 < class114.field1931.length) {
                        class209 var28 = class114.field1931[var22.field3979];
                        if (var28 != null) {
                            int var29 = var28.field5147 / 32 - (class230.field3820.field5147 / 32);
                            int var30 = var28.field5168 / 32 - (class230.field3820.field5168 / 32);
                            this.method1456((class194) null, arg3, var15, arg2, arg6, arg0, var29, arg5, arg4, var30, var22.field3968, arg9, (byte) -73, arg1, arg7);
                        }
                    }
                }
            }
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        if (this.field3441 != 0 && this.field3443 != 0) {
            int var34 = class310.field5199[arg0];
            int var35 = class310.field5197[arg0];
            short var36 = this.field3441;
            int var37 = -var36 / 2;
            short var38 = this.field3443;
            int var39 = -var38 / 2;
            int var40 = var34 * var39 + var35 * var37 >> 16;
            int var41 = var35 * var39 - var34 * var37 >> 16;
            int var42 = var36 / 2;
            int var43 = class259.method1801(this.field5168 + var41, -20428, class298.field4849, this.field5147 + var40);
            int var44 = -var38 / 2;
            int var45 = var34 * var44 + var35 * var42 >> 16;
            int var46 = var35 * var44 - (var34 * var42) >> 16;
            int var47 = -var36 / 2;
            int var48 = var38 / 2;
            int var49 = var35 * var48 - var34 * var47 >> 16;
            int var50 = var36 / 2;
            int var51 = var34 * var48 + var35 * var47 >> 16;
            int var52 = var38 / 2;
            int var53 = class259.method1801(this.field5168 + var46, -20428, class298.field4849, this.field5147 + var45);
            int var54 = class259.method1801(this.field5168 + var49, -20428, class298.field4849, this.field5147 + var51);
            int var55 = var34 * var52 + var35 * var50 >> 16;
            int var56 = var35 * var52 - (var34 * var50) >> 16;
            int var57 = var43 < var53 ? var43 : var53;
            int var58 = class259.method1801(this.field5168 + var56, -20428, class298.field4849, this.field5147 + var55);
            int var59 = var54 >= var58 ? var58 : var54;
            int var60 = var43 + var58;
            int var61 = var43 < var54 ? var43 : var54;
            var31 = (int) (Math.atan2((double) (var57 - var59), (double) var38) * 325.95D) & 0x7FF;
            int var62 = var58 > var53 ? var53 : var58;
            if (var31 != 0) {
                var15.method1721(var31);
            }
            var32 = (int) (Math.atan2((double) (var61 - var62), (double) var36) * 325.95D) & 0x7FF;
            if (var60 > var53 + var54) {
                var60 = var53 + var54;
            }
            if (var32 != 0) {
                var15.method1739(var32);
            }
            var33 = (var60 >> 1) - this.field5133;
            if (var33 != 0) {
                var15.method1734(0, var33, 0);
            }
        }
        class286 var63 = null;
        if (!this.field3472 && this.field5112 != -1 && this.field5119 != -1) {
            class269 var64 = class259.method1799(20527, this.field5112);
            var63 = var64.method1868(this.field5119, (byte) -116);
            if (var63 != null) {
                var63.method1734(0, -this.field5137, 0);
                if (var64.field4502) {
                    if (var31 != 0) {
                        var63.method1721(var31);
                    }
                    if (var32 != 0) {
                        var63.method1739(var32);
                    }
                    if (var33 != 0) {
                        var63.method1734(0, var33, 0);
                    }
                }
            }
        }
        class286 var65 = null;
        if (!this.field3472 && this.field3449 != null) {
            if (class319.field5393 >= this.field3440) {
                this.field3449 = null;
            }
            if (class319.field5393 >= this.field3461 && this.field3440 > class319.field5393) {
                var65 = this.field3449;
                var65.method1734(this.field3450 - this.field5147, -this.field5133 + this.field3474, this.field3445 - this.field5168);
                if (this.field5163 == 512) {
                    var65.method1710();
                } else if (this.field5163 == 1024) {
                    var65.method1730();
                } else if (this.field5163 == 1536) {
                    var65.method1733();
                }
            }
        }
        if (class99.field1675) {
            this.method2059(var15, 0);
            var15.field4708 = true;
            var15.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5125);
            if (var63 != null) {
                if (this.field5125 != null) {
                    class322 var66 = (class322) var63;
                    this.field5125.method1372(var66.field5464, var66.field5476, true, var66.field5448, var66.field5461, var66.field5459);
                }
                var63.field4708 = true;
                var63.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5125);
            }
        } else {
            if (var63 != null) {
                var15 = ((class246) var15).method1707(var63);
            }
            if (var65 != null) {
                var15 = ((class246) var15).method1707(var65);
            }
            this.method2059(var15, 0);
            var15.field4708 = true;
            var15.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5125);
        }
        if (var65 == null) {
            return;
        }
        if (this.field5163 == 512) {
            var65.method1733();
        } else if (this.field5163 == 1024) {
            var65.method1730();
        } else if (this.field5163 == 1536) {
            var65.method1710();
        }
        var65.method1734(this.field5147 - this.field3450, -this.field3474 + this.field5133, this.field5168 - this.field3445);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lbn;ILv;IIIIIIIIIBII)V", line = 647)
    private final void method1456(class194 arg0, int arg1, class286 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte arg12, int arg13, int arg14) {
        field3452++;
        int var16 = 110 % ((-arg12 - 21) / 36);
        int var17 = arg6 * arg6 + arg9 * arg9;
        if (var17 < 16 || var17 > 360000) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg6, (double) arg9) * 325.949D) & 0x7FF;
        class286 var19 = class112.method856(this.field5133, this.field5147, var18, arg10, arg2, this.field5168, -108);
        if (var19 == null) {
            return;
        }
        if (!class99.field1675) {
            var19.method185(0, arg13, arg3, arg1, arg8, arg7, arg4, arg14, -1L, arg11, arg0);
            return;
        }
        float var20 = class99.method733();
        float var21 = class99.method759();
        class99.method743();
        class99.method739(var20, var21 - 150.0F);
        var19.method185(0, arg13, arg3, arg1, arg8, arg7, arg4, arg14, -1L, arg11, arg0);
        class99.method755();
        class99.method739(var20, var21);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I", line = 685)
    public final int method1457(int arg0) {
        field3469++;
        if (arg0 != 0) {
            this.method1454(-22, (byte) 97, true, 4);
        }
        return this.field3446 == null || this.field3446.field2208 == -1 ? super.method1457(0) : class25.method155(this.field3446.field2208, arg0 ^ 0xFFFFFF91).field5304;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V", line = 713)
    public static void method1458(int arg0) {
        if (arg0 != Integer.MIN_VALUE) {
            method1458(-111);
        }
        field3442 = null;
        field3444 = null;
        field3476 = null;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Z", line = 734)
    public final boolean method1459(int arg0) {
        if (arg0 != 0) {
            this.field3441 = -96;
        }
        field3448++;
        return this.field3446 != null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V", line = 749)
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3460++;
        if (!this.field5121) {
            if (this.field3446 == null) {
                return;
            }
            class312 var6 = this.field5136 != -1 && this.field5135 == 0 ? class53.method362((byte) -36, this.field5136) : null;
            class312 var7 = this.field5115 == -1 || this.field3472 || this.field5153 == this.field5115 && var6 != null ? null : class53.method362((byte) -73, this.field5115);
            class286 var8 = this.field3446.method965(false, this.field5116, this.field5175, 16711680, var6, var7);
            if (var8 == null) {
                return;
            }
            this.method2059(var8, 0);
        }
        if (this.field5125 != null) {
            this.field5125.method1370(arg0, arg1, arg3, arg2, arg4);
        }
    }
}
