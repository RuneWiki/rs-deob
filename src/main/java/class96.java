import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class96 extends class194 {

    @OriginalMember(owner = "client!wc", name = "Kb", descriptor = "I")
    public int field1552 = -1;

    @OriginalMember(owner = "client!wc", name = "fc", descriptor = "I")
    public int field1573 = 0;

    @OriginalMember(owner = "client!wc", name = "Yb", descriptor = "I")
    public int field1566 = -1;

    @OriginalMember(owner = "client!wc", name = "Sb", descriptor = "I")
    public int field1560 = 0;

    @OriginalMember(owner = "client!wc", name = "bc", descriptor = "I")
    private int field1569 = 0;

    @OriginalMember(owner = "client!wc", name = "gc", descriptor = "S")
    private short field1574 = 0;

    @OriginalMember(owner = "client!wc", name = "Pb", descriptor = "I")
    public int field1557 = -1;

    @OriginalMember(owner = "client!wc", name = "Mb", descriptor = "I")
    public int field1554 = -1;

    @OriginalMember(owner = "client!wc", name = "hc", descriptor = "S")
    private short field1575 = 0;

    @OriginalMember(owner = "client!wc", name = "ac", descriptor = "I")
    public int field1568 = 0;

    @OriginalMember(owner = "client!wc", name = "ic", descriptor = "I")
    public int field1576 = 0;

    @OriginalMember(owner = "client!wc", name = "oc", descriptor = "I")
    public int field1582 = 0;

    @OriginalMember(owner = "client!wc", name = "jc", descriptor = "Z")
    public boolean field1577 = false;

    @OriginalMember(owner = "client!wc", name = "pc", descriptor = "I")
    public int field1583 = 0;

    @OriginalMember(owner = "client!wc", name = "sc", descriptor = "I")
    public int field1586 = -1;

    @OriginalMember(owner = "client!wc", name = "Hb", descriptor = "Lwa;")
    public static class75 field1549 = class66.method560("W-=hlen Sie eine Welt", false);

    @OriginalMember(owner = "client!wc", name = "rc", descriptor = "I")
    public static int field1585 = 0;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!wc", name = "Ib", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!wc", name = "Jb", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client!wc", name = "Lb", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!wc", name = "Nb", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client!wc", name = "Ob", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!wc", name = "Qb", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!wc", name = "Rb", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!wc", name = "Ub", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!wc", name = "Vb", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!wc", name = "Xb", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!wc", name = "Zb", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!wc", name = "cc", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!wc", name = "kc", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "client!wc", name = "lc", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!wc", name = "mc", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!wc", name = "nc", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!wc", name = "qc", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!wc", name = "Wb", descriptor = "Ljm;")
    public class223 field1564;

    @OriginalMember(owner = "client!wc", name = "dc", descriptor = "Lcc;")
    public class234 field1571;

    @OriginalMember(owner = "client!wc", name = "Tb", descriptor = "Lwa;")
    public class75 field1561;

    @OriginalMember(owner = "client!wc", name = "ec", descriptor = "Lbi;")
    public static class77 field1572;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lja;B)V", line = 10)
    public final void method737(class60 arg0, byte arg1) {
        arg0.field1012 = 0;
        field1559++;
        int var3 = arg0.method501(0);
        if ((var3 & 0x2) == 2) {
            this.field1574 = (short) (arg0.method501(0) << 2);
            this.field1575 = (short) (arg0.method501(0) << 2);
        } else {
            this.field1575 = 0;
            this.field1574 = 0;
        }
        boolean var4 = (var3 & 0x4) != 0;
        int var5 = super.method739(0);
        this.method1454(((var3 & 0x3F) >> 3) + 1, (byte) 104);
        int var6 = var3 & 0x1;
        this.field1569 = var3 >> 6 & 0x3;
        int var7 = -1;
        this.field3259 += (this.method739(0) - var5) * 64;
        this.field3218 += (this.method739(0) - var5) * 64;
        this.field1586 = arg0.method511(-116);
        int[] var8 = new int[12];
        this.field1552 = arg0.method511(-118);
        this.field1560 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method501(0);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method501(0);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg0.method485((byte) -2);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class11.field140[var12 - 32768];
                    var8[var9] = class102.method799(var13, 1073741824);
                    int var14 = class199.method1475(var13, (byte) 109).field4806;
                    if (var14 != 0) {
                        this.field1560 = var14;
                    }
                } else {
                    var8[var9] = class102.method799(Integer.MIN_VALUE, var12 - 256);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method501(0);
            if (var17 < 0 || var17 >= class69.field1184[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field3228 = arg0.method485((byte) -2);
        if (this.field3228 == 65535) {
            this.field3228 = -1;
        }
        this.field3229 = arg0.method485((byte) -2);
        if (this.field3229 == 65535) {
            this.field3229 = -1;
        }
        this.field3227 = this.field3229;
        this.field3269 = arg0.method485((byte) -2);
        if (this.field3269 == 65535) {
            this.field3269 = -1;
        }
        this.field3209 = arg0.method485((byte) -2);
        if (this.field3209 == 65535) {
            this.field3209 = -1;
        }
        this.field3257 = arg0.method485((byte) -2);
        if (this.field3257 == 65535) {
            this.field3257 = -1;
        }
        this.field3232 = arg0.method485((byte) -2);
        if (this.field3232 == 65535) {
            this.field3232 = -1;
        }
        int var18 = -23 % ((-arg1 - 61) / 32);
        this.field3244 = arg0.method485((byte) -2);
        if (this.field3244 == 65535) {
            this.field3244 = -1;
        }
        this.field1561 = class260.method1855(arg0.method499((byte) -54), false).method613(122);
        this.field1576 = arg0.method501(0);
        if (var4) {
            this.field1583 = arg0.method485((byte) -2);
        } else {
            this.field1583 = 0;
        }
        int var19 = this.field1582;
        this.field1582 = arg0.method501(0);
        if (this.field1582 == 0) {
            class34.method228(this, true);
        } else {
            int var20 = this.field1566;
            int var21 = this.field1554;
            int var22 = this.field1557;
            this.field1566 = arg0.method485((byte) -2);
            this.field1554 = arg0.method485((byte) -2);
            this.field1557 = arg0.method485((byte) -2);
            if (this.field1582 != var19 || this.field1566 != var20 || this.field1554 != var21 || this.field1557 != var22) {
                class40.method275(this, (byte) -34);
            }
        }
        if (this.field1564 == null) {
            this.field1564 = new class223();
        }
        int var23 = this.field1564.field3790;
        this.field1564.method1651(-31656, var8, var6 == 1, var7, var15);
        if (var7 != var23) {
            this.field3259 = this.field3236[0] * 128 + (this.method739(0) * 64);
            this.field3218 = this.field3205[0] * 128 + (this.method739(0) * 64);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()I", line = 182)
    public final int method443() {
        field1570++;
        return this.field3221;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)Lwa;", line = 199)
    public final class75 method738(byte arg0) {
        field1562++;
        if (arg0 > -127) {
            return (class75) null;
        }
        class75 var2 = this.field1561;
        if (class175.field2949 != null) {
            var2 = class66.method562((byte) -75, new class75[] { class175.field2949[this.field1569], var2 });
        }
        if (class195.field3284 != null) {
            var2 = class66.method562((byte) 121, new class75[] { var2, class195.field3284[this.field1569] });
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I", line = 220)
    public final int method739(int arg0) {
        field1580++;
        if (this.field1564 == null || this.field1564.field3790 == -1) {
            if (arg0 != 0) {
                this.field1569 = -82;
            }
            return super.method739(0);
        } else {
            return class182.method1343(this.field1564.field3790, (byte) 62).field3854;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIILcc;IIBII)V", line = 234)
    private final void method740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class234 arg7, int arg8, int arg9, byte arg10, int arg11, int arg12) {
        field1563++;
        int var14 = arg4 * arg4 + arg9 * arg9;
        if (var14 < 16 || var14 > 360000) {
            return;
        }
        if (arg10 <= 56) {
            this.method740(-93, -27, 0, 38, 121, 68, 74, (class234) null, -88, -61, (byte) -43, -111, -120);
        }
        int var15 = (int) (Math.atan2((double) arg4, (double) arg9) * 325.949D) & 0x7FF;
        class234 var16 = class90.method711(this.field3259, 0, arg2, arg7, this.field3238, var15, this.field3218);
        if (var16 == null) {
            return;
        }
        float var17 = class47.method340();
        float var18 = class47.method329();
        class47.method345();
        class47.method332(var17, var18 - 150.0F);
        var16.method409(0, arg5, arg0, arg3, arg11, arg6, arg8, arg12, -1L);
        class47.method325();
        class47.method332(var17, var18);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZZ)V", line = 297)
    public final void method741(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            this.field1555 = 81;
        }
        super.method1457(this.method739(0), arg1, -107, arg0, arg3);
        field1584++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)V", line = 323)
    public static final void method742(byte arg0, int arg1) {
        int var2 = 39 % ((-arg0 - 59) / 36);
        field1567++;
        class97.field1590.method1199(arg1, 127);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V", line = 335)
    public static final void method743(boolean arg0) {
        class173.field2913.method1200(false);
        field1558++;
        class178.field3003.method1200(false);
        class130.field2243.method1200(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)Z", line = 349)
    public final boolean method744(byte arg0) {
        if (arg0 >= -77) {
            field1585 = -34;
        }
        field1579++;
        return this.field1564 != null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIIJ)V", line = 377)
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1548++;
        if (this.field1564 == null) {
            return;
        }
        class28 var11 = this.field3204 != -1 && this.field3268 == 0 ? class302.method2082(this.field3204, 35) : null;
        class28 var12 = this.field3215 == -1 || this.field1577 || this.field3228 == this.field3215 && var11 != null ? null : class302.method2082(this.field3215, 58);
        class234 var13 = this.field1564.method1642(this.field3234, var11, this.field3248, var12, Integer.MIN_VALUE);
        if (var13 == null) {
            return;
        }
        this.field3221 = var13.method443();
        if (class75.field1286 && (this.field1564.field3790 == -1 || class182.method1343(this.field1564.field3790, (byte) 62).field3844)) {
            class234 var14 = class286.method2015(this.field3238, 0, this.field3218, arg0, this.field3220, -86, var13, 240, this.field3259, 1, var12 == null ? var11 : var12, var12 == null ? this.field3234 : this.field3248, 0, 160);
            float var15 = class47.method340();
            float var16 = class47.method329();
            class47.method345();
            class47.method332(var15, var16 - 150.0F);
            var14.method409(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            class47.method325();
            class47.method332(var15, var16);
        }
        if (class279.field4831 == this) {
            for (int var17 = class219.field3747.length - 1; var17 >= 0; var17--) {
                class51 var18 = class219.field3747[var17];
                if (var18 != null && var18.field845 != -1) {
                    if (var18.field839 == 1 && var18.field851 >= 0 && class35.field521.length > var18.field851) {
                        class295 var19 = class35.field521[var18.field851];
                        if (var19 != null) {
                            int var20 = var19.field3259 / 32 - (class279.field4831.field3259 / 32);
                            int var21 = var19.field3218 / 32 - (class279.field4831.field3218 / 32);
                            this.method740(arg2, arg0, var18.field845, arg3, var20, arg1, arg5, var13, arg6, var21, (byte) 106, arg4, arg7);
                        }
                    }
                    if (var18.field839 == 2) {
                        int var22 = (var18.field835 - class275.field4737) * 4 + 2 - (class279.field4831.field3259 / 32);
                        int var23 = (var18.field831 - class175.field2939) * 4 + 2 - (class279.field4831.field3218 / 32);
                        this.method740(arg2, arg0, var18.field845, arg3, var22, arg1, arg5, var13, arg6, var23, (byte) 127, arg4, arg7);
                    }
                    if (var18.field839 == 10 && var18.field851 >= 0 && class169.field2842.length > var18.field851) {
                        class96 var24 = class169.field2842[var18.field851];
                        if (var24 != null) {
                            int var25 = var24.field3259 / 32 - (class279.field4831.field3259 / 32);
                            int var26 = var24.field3218 / 32 - (class279.field4831.field3218 / 32);
                            this.method740(arg2, arg0, var18.field845, arg3, var25, arg1, arg5, var13, arg6, var26, (byte) 66, arg4, arg7);
                        }
                    }
                }
            }
        }
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        if (this.field1574 != 0 && this.field1575 != 0) {
            int var30 = class21.field288[arg0];
            int var31 = class21.field286[arg0];
            short var32 = this.field1574;
            short var33 = this.field1575;
            int var34 = -var33 / 2;
            int var35 = -var32 / 2;
            int var36 = var30 * var34 + (var31 * var35) >> 16;
            int var37 = var31 * var34 - var30 * var35 >> 16;
            int var38 = class32.method217(this.field3259 + var36, this.field3218 + var37, true, class67.field1174);
            int var39 = var32 / 2;
            int var40 = -var33 / 2;
            int var41 = var31 * var40 - var30 * var39 >> 16;
            int var42 = var30 * var40 + var31 * var39 >> 16;
            int var43 = class32.method217(this.field3259 + var42, this.field3218 + var41, true, class67.field1174);
            int var44 = -var32 / 2;
            int var45 = var33 / 2;
            int var46 = var30 * var45 + var31 * var44 >> 16;
            int var47 = var31 * var45 - (var30 * var44) >> 16;
            int var48 = class32.method217(this.field3259 + var46, this.field3218 + var47, true, class67.field1174);
            int var49 = var32 / 2;
            int var50 = var33 / 2;
            int var51 = var30 * var50 + (var31 * var49) >> 16;
            int var52 = var31 * var50 - var30 * var49 >> 16;
            int var53 = var43 > var38 ? var38 : var43;
            int var54 = var38 < var48 ? var38 : var48;
            int var55 = class32.method217(this.field3259 + var51, this.field3218 - -var52, true, class67.field1174);
            int var56 = var38 + var55;
            int var57 = var48 >= var55 ? var55 : var48;
            int var58 = var55 <= var43 ? var55 : var43;
            var27 = (int) (Math.atan2((double) (var53 - var57), (double) var33) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                var13.method407(var27);
            }
            var28 = (int) (Math.atan2((double) (var54 - var58), (double) var32) * 325.95D) & 0x7FF;
            if (var56 > (var43 + var48)) {
                var56 = var43 + var48;
            }
            if (var28 != 0) {
                var13.method445(var28);
            }
            var29 = (var56 >> 1) - this.field3238;
            if (var29 != 0) {
                var13.method410(0, var29, 0);
            }
        }
        class234 var59 = null;
        if (!this.field1577 && this.field3261 != -1 && this.field3255 != -1) {
            class263 var60 = class65.method556(this.field3261, -95);
            var59 = var60.method1881(this.field3255, (byte) -56);
            if (var59 != null) {
                var59.method410(0, -this.field3247, 0);
                if (var60.field4563) {
                    if (var27 != 0) {
                        var59.method407(var27);
                    }
                    if (var28 != 0) {
                        var59.method445(var28);
                    }
                    if (var29 != 0) {
                        var59.method410(0, var29, 0);
                    }
                }
            }
        }
        class234 var61 = null;
        if (!this.field1577 && this.field1571 != null) {
            if (class143.field2463 >= this.field1568) {
                this.field1571 = null;
            }
            if (this.field1573 <= class143.field2463 && class143.field2463 < this.field1568) {
                var61 = this.field1571;
                var61.method410(this.field1555 - this.field3259, -this.field3238 + this.field1553, this.field1551 - this.field3218);
                if (this.field3206 == 512) {
                    var61.method454();
                } else if (this.field3206 == 1024) {
                    var61.method413();
                } else if (this.field3206 == 1536) {
                    var61.method442();
                }
            }
        }
        var13.field3956 = true;
        var13.method409(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var59 != null) {
            var59.field3956 = true;
            var59.method409(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
        if (var61 == null) {
            return;
        }
        if (this.field3206 == 512) {
            var61.method442();
        } else if (this.field3206 == 1024) {
            var61.method413();
        } else if (this.field3206 == 1536) {
            var61.method454();
        }
        var61.method410(this.field3259 - this.field1555, -this.field1553 + this.field3238, this.field3218 - this.field1551);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(Z)V", line = 688)
    public static void method745(boolean arg0) {
        field1572 = null;
        if (arg0) {
            field1549 = null;
        }
    }
}
