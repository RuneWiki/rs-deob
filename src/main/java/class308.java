import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class308 extends class197 {

    @OriginalMember(owner = "client!io", name = "z", descriptor = "Lpu;")
    private class402 field4560;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "S")
    private short field4563;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "S")
    private short field4557;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "S")
    private short field4559;

    @OriginalMember(owner = "client!io", name = "B", descriptor = "S")
    private short field4562;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "S")
    private short field4561;

    @OriginalMember(owner = "client!io", name = "D", descriptor = "I")
    private int field4564;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "I")
    private int field4558;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "S")
    private short field4565;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lpu;IIIIIIIIIIIZZ)V", line = 3)
    public final void method1962(class402 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4560 = arg0;
        super.field2874 = arg1 << 12;
        super.field2882 = arg2 << 12;
        super.field2876 = arg3 << 12;
        super.field2875 = arg9;
        this.field4557 = this.field4563 = (short) arg8;
        super.field2878 = arg10;
        super.field2879 = arg11;
        super.field2877 = arg13;
        this.field4559 = (short) arg4;
        this.field4562 = (short) arg5;
        this.field4561 = (short) arg6;
        this.field4564 = arg7;
        super.field2873 = this.field4560.field5721.field3704;
        this.method1963();
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "()V", line = 24)
    private final void method1963() {
        int var1 = this.field4560.field5709.field1707;
        if (this.field4560.field5709.field1708[var1] != null) {
            this.field4560.field5709.field1708[var1].method1964();
        }
        this.field4560.field5709.field1708[var1] = this;
        this.field4565 = (short) this.field4560.field5709.field1707;
        this.field4560.field5709.field1707 = var1 + 1 & 8191;
        this.field4560.field5701.method905(this, 0);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "()V", line = 36)
    public final void method1964() {
        this.field4560.field5709.field1708[this.field4565] = null;
        class4.field21[class540.field7951] = this;
        class540.field7951 = class540.field7951 + 1 & 1023;
        this.method2429(124);
        this.method2870(80);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(JI)V", line = 43)
    public final void method1965(long arg0, int arg1) {
        this.field4563 = (short) (this.field4563 - arg1);
        if (this.field4563 <= 0) {
            this.method1964();
        } else {
            int var4 = super.field2874 >> 12;
            int var5 = super.field2882 >> 12;
            int var6 = super.field2876 >> 12;
            class115 var7 = this.field4560.field5709;
            class529 var8 = this.field4560.field5720;
            if (var8.field7747 != 0) {
                if (this.field4557 - this.field4563 <= var8.field7729) {
                    int var9 = var8.field7732 * arg1 + (this.field4558 >> 16 & 255) + (super.field2875 >> 8 & 65280);
                    int var10 = var8.field7759 * arg1 + (this.field4558 >> 8 & 255) + (super.field2875 & 65280);
                    int var11 = var8.field7760 * arg1 + (super.field2875 << 8 & 65280) + (this.field4558 & 255);
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 65535) {
                        var9 = 65535;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 65535) {
                        var10 = 65535;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 65535) {
                        var11 = 65535;
                    }
                    super.field2875 &= -16777216;
                    super.field2875 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field4558 &= -16777216;
                    this.field4558 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field4557 - this.field4563 <= var8.field7750) {
                    int var12 = var8.field7757 * arg1 + (this.field4558 >> 24 & 255) + (super.field2875 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field2875 &= 16777215;
                    super.field2875 |= (var12 & 65280) << 16;
                    this.field4558 &= 16777215;
                    this.field4558 |= (var12 & 255) << 24;
                }
            }
            if (var8.field7786 != -1 && this.field4557 - this.field4563 <= var8.field7735) {
                this.field4564 += var8.field7725 * arg1;
            }
            if (var8.field7742 != -1 && this.field4557 - this.field4563 <= var8.field7790) {
                super.field2878 += var8.field7781 * arg1;
            }
            int var13 = this.field4559;
            int var14 = this.field4562;
            int var15 = this.field4561;
            boolean var16 = false;
            if (var8.field7770 == 1) {
                int var17 = var4 - this.field4560.field5691;
                int var18 = var5 - this.field4560.field5697;
                int var19 = var6 - this.field4560.field5692;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field7779 * var20 * arg1);
                this.field4564 = (int) ((long) this.field4564 - ((long) this.field4564 * var21 >> 18));
            } else if (var8.field7770 == 2) {
                int var23 = var4 - this.field4560.field5691;
                int var24 = var5 - this.field4560.field5697;
                int var25 = var6 - this.field4560.field5692;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field7779 * var26 * arg1);
                this.field4564 = (int) ((long) this.field4564 - ((long) this.field4564 * var27 >> 28));
            }
            if (var8.field7767 != null) {
                class42 var29 = var7.field1711.field1835;
                for (class42 var30 = var29.field857; var29 != var30; var30 = var30.field857) {
                    class142 var31 = (class142) var30;
                    class539 var32 = var31.field2191;
                    if (var32.field7921 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field7767.length; ++var34) {
                            if (var8.field7767[var34] == var32.field7940) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field2190;
                            int var36 = var5 - var31.field2189;
                            int var37 = var6 - var31.field2187;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field7927) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field2185 * var37 + var31.field2194 * var35 + var32.field7924 * var36) * 65535L / (long) (var32.field7919 * var40);
                                if (var41 >= (long) var32.field7926) {
                                    int var43 = 0;
                                    if (var32.field7920 == 1) {
                                        var43 = (var40 >> 4) * var32.field7933;
                                    } else if (var32.field7920 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field7933;
                                    }
                                    if (var32.field7935 == 0) {
                                        if (var32.field7925 == 0) {
                                            var13 += (var31.field2194 - var43) * arg1;
                                            var14 += (var32.field7924 - var43) * arg1;
                                            var15 += (var31.field2185 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field2874 += (var31.field2194 - var43) * arg1;
                                            super.field2882 += (var32.field7924 - var43) * arg1;
                                            super.field2876 += (var31.field2185 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field7919;
                                        int var45 = (var36 << 15) / var40 * var32.field7919;
                                        int var46 = (var37 << 15) / var40 * var32.field7919;
                                        if (var32.field7925 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field2874 += arg1 * var44 >> 15;
                                            super.field2882 += arg1 * var45 >> 15;
                                            super.field2876 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field7778 != null) {
                for (int var47 = 0; var47 < var8.field7778.length; ++var47) {
                    class142 var48 = (class142) class455.field6612.method2759(-68, (long) var8.field7778[var47]);
                    while (var48 != null) {
                        class539 var49 = var48.field2191;
                        int var50 = var4 - var48.field2190;
                        int var51 = var5 - var48.field2189;
                        int var52 = var6 - var48.field2187;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field7927) {
                            var48 = (class142) class455.field6612.method2758((byte) -124);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field2185 * var52 + var48.field2194 * var50 + var49.field7924 * var51) * 65535L / (long) (var49.field7919 * var55);
                            if (var56 < (long) var49.field7926) {
                                var48 = (class142) class455.field6612.method2758((byte) -114);
                            } else {
                                int var58 = 0;
                                if (var49.field7920 == 1) {
                                    var58 = (var55 >> 4) * var49.field7933;
                                } else if (var49.field7920 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field7933;
                                }
                                if (var49.field7935 == 0) {
                                    if (var49.field7925 == 0) {
                                        var13 += (var48.field2194 - var58) * arg1;
                                        var14 += (var49.field7924 - var58) * arg1;
                                        var15 += (var48.field2185 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field2874 += (var48.field2194 - var58) * arg1;
                                        super.field2882 += (var49.field7924 - var58) * arg1;
                                        super.field2876 += (var48.field2185 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field7919;
                                    int var60 = (var51 << 15) / var55 * var49.field7919;
                                    int var61 = (var52 << 15) / var55 * var49.field7919;
                                    if (var49.field7925 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field2874 += arg1 * var59 >> 15;
                                        super.field2882 += arg1 * var60 >> 15;
                                        super.field2876 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class142) class455.field6612.method2758((byte) 117);
                            }
                        }
                    }
                }
            }
            if (var8.field7791 != null) {
                if (var8.field7731 == null) {
                    var8.field7731 = new int[var8.field7791.length];
                    for (int var62 = 0; var62 < var8.field7791.length; ++var62) {
                        class28.method167((byte) -127, var8.field7791[var62]);
                        var8.field7731[var62] = ((class175) client.field3116.method2284(true, (long) var8.field7791[var62])).field2612;
                    }
                }
                for (int var63 = 0; var63 < var8.field7731.length; ++var63) {
                    class539 var64 = class517.field7490[var8.field7731[var63]];
                    if (var64.field7925 == 0) {
                        var13 += var64.field7923 * arg1;
                        var14 += var64.field7924 * arg1;
                        var15 += var64.field7934 * arg1;
                        var16 = true;
                    } else {
                        super.field2874 += var64.field7923 * arg1;
                        super.field2882 += var64.field7924 * arg1;
                        super.field2876 += var64.field7934 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field4559 = (short) var13;
                        this.field4562 = (short) var14;
                        this.field4561 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field4564 <<= 1;
                }
            }
            super.field2874 = (int) ((long) super.field2874 + ((long) this.field4559 * (long) this.field4564 >> 23) * (long) arg1);
            super.field2882 = (int) ((long) super.field2882 + ((long) this.field4562 * (long) this.field4564 >> 23) * (long) arg1);
            super.field2876 = (int) ((long) super.field2876 + ((long) this.field4561 * (long) this.field4564 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lqa;J)V", line = 438)
    public final void method1966(class167 arg0, long arg1) {
        int var4 = super.field2874 >> class322.field4795 + 12;
        int var5 = super.field2876 >> class322.field4795 + 12;
        int var6 = super.field2882 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class394.field5608 && var5 >= 0 && var5 < class337.field5000) {
            class115 var7 = this.field4560.field5709;
            class529 var8 = this.field4560.field5720;
            class24[] var9 = class146.field2262;
            int var10 = var7.field1719;
            class188 var11 = class461.field6675[var7.field1719][var4][var5];
            if (var11 != null) {
                var10 = var11.field2763;
            }
            int var12 = var9[var10].method156(var4, var5);
            int var13;
            if (var10 < class251.field3740 - 1) {
                var13 = var9[var10 + 1].method156(var4, var5);
            } else {
                var13 = var12 - (8 << class322.field4795);
            }
            if (var8.field7754) {
                if (var8.field7788 == -1 && var6 > var12) {
                    this.method1964();
                    return;
                }
                if (var8.field7788 >= 0 && var6 > var9[var8.field7788].method156(var4, var5)) {
                    this.method1964();
                    return;
                }
                if (var8.field7773 == -1 && var6 < var13) {
                    this.method1964();
                    return;
                }
                if (var8.field7773 >= 0 && var6 < var9[var8.field7773 + 1].method156(var4, var5)) {
                    this.method1964();
                    return;
                }
            }
            if (var4 >= var7.field1717 && var4 <= var7.field1718 && var5 >= var7.field1715 && var5 <= var7.field1713 && var6 <= var12 && var6 >= var13) {
                var7.field1714.field4470.method22(1, this);
            } else {
                int var14;
                for (var14 = class251.field3740 - 1; var14 > 0 && var6 > var9[var14].method156(var4, var5); --var14) {
                }
                if (var14 == 0 && var6 > var9[0].method156(var4, var5)) {
                    this.method1964();
                } else if (class251.field3740 - 1 == var14 && var9[var14].method156(var4, var5) - var6 > 8 << class322.field4795) {
                    this.method1964();
                } else {
                    class188 var15 = class461.field6675[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class461.field6675[0][var4][var5] == null) {
                            var15 = class461.field6675[0][var4][var5] = new class188(0, var4, var5);
                        }
                        boolean var16 = class461.field6675[0][var4][var5].field2772 != null;
                        if (var14 == 3 && var16) {
                            this.method1964();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class461.field6675[var17][var4][var5] == null) {
                                var15 = class461.field6675[var17][var4][var5] = new class188(var17, var4, var5);
                                if (var16) {
                                    ++var15.field2763;
                                }
                            }
                        }
                    }
                    if (var8.field7792) {
                        int var18 = super.field2874 >> 12;
                        int var19 = super.field2876 >> 12;
                        if (var15.field2764 != null) {
                            class154 var20 = var15.field2764.method562(arg0, (byte) -127);
                            if (var20 != null && var20.method1085(var6, (byte) 94, var18, var19)) {
                                this.method1964();
                                return;
                            }
                        }
                        if (var15.field2751 != null) {
                            class154 var21 = var15.field2751.method562(arg0, (byte) -127);
                            if (var21 != null && var21.method1085(var6, (byte) 62, var18, var19)) {
                                this.method1964();
                                return;
                            }
                        }
                        if (var15.field2756 != null) {
                            class154 var22 = var15.field2756.method562(arg0, (byte) -121);
                            if (var22 != null && var22.method1085(var6, (byte) -34, var18, var19)) {
                                this.method1964();
                                return;
                            }
                        }
                        for (class317 var23 = var15.field2773; var23 != null; var23 = var23.field4709) {
                            class154 var24 = var23.field4711.method562(arg0, (byte) -122);
                            if (var24 != null && var24.method1085(var6, (byte) 59, var18, var19)) {
                                this.method1964();
                                return;
                            }
                        }
                    }
                    if (var15.field2767 == null) {
                        var15.field2767 = new class300();
                        var15.field2761 = (byte) ((int) (arg1 & 255L));
                    } else if ((byte) ((int) (arg1 & 255L)) != var15.field2761) {
                        var15.field2767.field4470.method24((byte) -35);
                        var15.field2767.field4473 = false;
                        var15.field2761 = (byte) ((int) (arg1 & 255L));
                    }
                    var15.field2767.field4470.method22(1, this);
                }
            }
        } else {
            this.method1964();
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lpu;IIIIIIIIIIIZZ)V", line = 636)
    public class308(class402 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4560 = arg0;
        super.field2874 = arg1 << 12;
        super.field2882 = arg2 << 12;
        super.field2876 = arg3 << 12;
        super.field2875 = arg9;
        this.field4557 = this.field4563 = (short) arg8;
        super.field2878 = arg10;
        super.field2879 = arg11;
        super.field2877 = arg13;
        this.field4559 = (short) arg4;
        this.field4562 = (short) arg5;
        this.field4561 = (short) arg6;
        this.field4564 = arg7;
        super.field2873 = this.field4560.field5721.field3704;
        this.method1963();
    }
}
