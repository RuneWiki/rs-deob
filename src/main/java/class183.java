import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class183 extends class115 {

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "Lph;")
    public class602 field2764;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "S")
    private short field2770;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "S")
    private short field2762;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "S")
    private short field2767;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "S")
    private short field2763;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "S")
    private short field2769;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    private int field2768;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    private int field2766;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "S")
    private short field2765;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
    private final void method1212() {
        int var1 = this.field2764.field7992.field6551;
        if (this.field2764.field7992.field6554[var1] != null) {
            this.field2764.field7992.field6554[var1].method1213();
        }
        this.field2764.field7992.field6554[var1] = this;
        this.field2765 = (short) this.field2764.field7992.field6551;
        this.field2764.field7992.field6551 = var1 + 1 & 8191;
        this.field2764.field7988.method327(this, true);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "()V")
    public final void method1213() {
        this.field2764.field7992.field6554[this.field2765] = null;
        class154.field2423[class331.field4537] = this;
        class331.field4537 = class331.field4537 + 1 & 1023;
        this.method2787(false);
        this.method2504(-29);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Loa;J)V")
    public final void method1214(class651 arg0, long arg1) {
        int var4 = super.field1973 >> class348.field4782 + 12;
        int var5 = super.field1972 >> class348.field4782 + 12;
        int var6 = super.field1976 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class657.field8966 && var5 >= 0 && var5 < class227.field3196) {
            class485 var7 = this.field2764.field7992;
            class656 var8 = this.field2764.field7996;
            class139[] var9 = class218.field3099;
            int var10 = var7.field6561;
            class24 var11 = class703.field9899[var7.field6561][var4][var5];
            if (var11 != null) {
                var10 = var11.field402;
            }
            int var12 = var9[var10].method195(var4, var5);
            int var13;
            if (var10 < class13.field218 - 1) {
                var13 = var9[var10 + 1].method195(var4, var5);
            } else {
                var13 = var12 - (8 << class348.field4782);
            }
            if (var8.field8938) {
                if (var8.field8931 == -1 && var6 > var12) {
                    this.method1213();
                    return;
                }
                if (var8.field8931 >= 0 && var6 > var9[var8.field8931].method195(var4, var5)) {
                    this.method1213();
                    return;
                }
                if (var8.field8921 == -1 && var6 < var13) {
                    this.method1213();
                    return;
                }
                if (var8.field8921 >= 0 && var6 < var9[var8.field8921 + 1].method195(var4, var5)) {
                    this.method1213();
                    return;
                }
            }
            if (var4 >= var7.field6565 && var4 <= var7.field6564 && var5 >= var7.field6563 && var5 <= var7.field6567 && var6 <= var12 && var6 >= var13) {
                var7.field6568.field2679.method2097(this, false);
            } else {
                int var14;
                for (var14 = class13.field218 - 1; var14 > 0 && var6 > var9[var14].method195(var4, var5); --var14) {
                }
                if (var8.field8896 && var14 == 0 && var6 > var9[0].method195(var4, var5)) {
                    this.method1213();
                } else if (class13.field218 - 1 == var14 && var9[var14].method195(var4, var5) - var6 > 8 << class348.field4782) {
                    this.method1213();
                } else {
                    class24 var15 = class703.field9899[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class703.field9899[0][var4][var5] == null) {
                            var15 = class703.field9899[0][var4][var5] = new class24(0, var4, var5);
                        }
                        boolean var16 = class703.field9899[0][var4][var5].field408 != null;
                        if (var14 == 3 && var16) {
                            this.method1213();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class703.field9899[var17][var4][var5] == null) {
                                var15 = class703.field9899[var17][var4][var5] = new class24(var17, var4, var5);
                                if (var16) {
                                    ++var15.field402;
                                }
                            }
                        }
                    }
                    if (var8.field8937) {
                        int var18 = super.field1973 >> 12;
                        int var19 = super.field1972 >> 12;
                        if (var15.field411 != null) {
                            class660 var20 = var15.field411.method143(31358, arg0);
                            if (var20 != null && var20.method3698(var6, 0, var18, var19)) {
                                this.method1213();
                                return;
                            }
                        }
                        if (var15.field406 != null) {
                            class660 var21 = var15.field406.method143(31358, arg0);
                            if (var21 != null && var21.method3698(var6, 0, var18, var19)) {
                                this.method1213();
                                return;
                            }
                        }
                        if (var15.field422 != null) {
                            class660 var22 = var15.field422.method143(31358, arg0);
                            if (var22 != null && var22.method3698(var6, 0, var18, var19)) {
                                this.method1213();
                                return;
                            }
                        }
                        for (class684 var23 = var15.field409; var23 != null; var23 = var23.field9618) {
                            class660 var24 = var23.field9619.method143(31358, arg0);
                            if (var24 != null && var24.method3698(var6, 0, var18, var19)) {
                                this.method1213();
                                return;
                            }
                        }
                    }
                    var7.field6568.field2679.method2097(this, false);
                }
            }
        } else {
            this.method1213();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(JI)V")
    public final void method1215(long arg0, int arg1) {
        this.field2770 = (short) (this.field2770 - arg1);
        if (this.field2770 <= 0) {
            this.method1213();
        } else {
            int var4 = super.field1973 >> 12;
            int var5 = super.field1976 >> 12;
            int var6 = super.field1972 >> 12;
            class485 var7 = this.field2764.field7992;
            class656 var8 = this.field2764.field7996;
            if (var8.field8925 != 0) {
                if (this.field2762 - this.field2770 <= var8.field8948) {
                    int var9 = var8.field8936 * arg1 + (this.field2766 >> 16 & 255) + (super.field1979 >> 8 & 65280);
                    int var10 = var8.field8920 * arg1 + (this.field2766 >> 8 & 255) + (super.field1979 & 65280);
                    int var11 = var8.field8907 * arg1 + (super.field1979 << 8 & 65280) + (this.field2766 & 255);
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
                    super.field1979 &= -16777216;
                    super.field1979 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field2766 &= -16777216;
                    this.field2766 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field2762 - this.field2770 <= var8.field8888) {
                    int var12 = var8.field8916 * arg1 + (this.field2766 >> 24 & 255) + (super.field1979 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field1979 &= 16777215;
                    super.field1979 |= (var12 & 65280) << 16;
                    this.field2766 &= 16777215;
                    this.field2766 |= (var12 & 255) << 24;
                }
            }
            if (var8.field8930 != -1 && this.field2762 - this.field2770 <= var8.field8945) {
                this.field2768 += var8.field8901 * arg1;
            }
            if (var8.field8897 != -1 && this.field2762 - this.field2770 <= var8.field8919) {
                super.field1983 += var8.field8910 * arg1;
            }
            int var13 = this.field2767;
            int var14 = this.field2763;
            int var15 = this.field2769;
            boolean var16 = false;
            if (var8.field8939 == 1) {
                int var17 = var4 - this.field2764.field7991.field5191;
                int var18 = var5 - this.field2764.field7991.field5192;
                int var19 = var6 - this.field2764.field7991.field5196;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18)) >> 2;
                long var21 = (long) (var8.field8889 * var20 * arg1);
                this.field2768 = (int) ((long) this.field2768 - ((long) this.field2768 * var21 >> 18));
            } else if (var8.field8939 == 2) {
                int var23 = var4 - this.field2764.field7991.field5191;
                int var24 = var5 - this.field2764.field7991.field5192;
                int var25 = var6 - this.field2764.field7991.field5196;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field8889 * var26 * arg1);
                this.field2768 = (int) ((long) this.field2768 - ((long) this.field2768 * var27 >> 28));
            }
            if (var8.field8953 != null) {
                class504 var29 = var7.field6559.field7850;
                for (class504 var30 = var29.field6722; var29 != var30; var30 = var30.field6722) {
                    class457 var31 = (class457) var30;
                    class87 var32 = var31.field6207;
                    if (var32.field1306 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field8953.length; ++var34) {
                            if (var8.field8953[var34] == var32.field1307) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field6211;
                            int var36 = var5 - var31.field6216;
                            int var37 = var6 - var31.field6208;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field1325) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field6214 * var37 + var31.field6213 * var35 + var32.field1316 * var36) * 65535L / (long) (var32.field1326 * var40);
                                if (var41 >= (long) var32.field1311) {
                                    int var43 = 0;
                                    if (var32.field1309 == 1) {
                                        var43 = (var40 >> 4) * var32.field1320;
                                    } else if (var32.field1309 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field1320;
                                    }
                                    if (var32.field1319 == 0) {
                                        if (var32.field1321 == 0) {
                                            var13 += (var31.field6213 - var43) * arg1;
                                            var14 += (var32.field1316 - var43) * arg1;
                                            var15 += (var31.field6214 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field1973 += (var31.field6213 - var43) * arg1;
                                            super.field1976 += (var32.field1316 - var43) * arg1;
                                            super.field1972 += (var31.field6214 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field1326;
                                        int var45 = (var36 << 15) / var40 * var32.field1326;
                                        int var46 = (var37 << 15) / var40 * var32.field1326;
                                        if (var32.field1321 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field1973 += arg1 * var44 >> 15;
                                            super.field1976 += arg1 * var45 >> 15;
                                            super.field1972 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field8902 != null) {
                for (int var47 = 0; var47 < var8.field8902.length; ++var47) {
                    class457 var48 = (class457) class247.field3441.method1629((long) var8.field8902[var47], 3);
                    while (var48 != null) {
                        class87 var49 = var48.field6207;
                        int var50 = var4 - var48.field6211;
                        int var51 = var5 - var48.field6216;
                        int var52 = var6 - var48.field6208;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field1325) {
                            var48 = (class457) class247.field3441.method1631(5166);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field6214 * var52 + var48.field6213 * var50 + var49.field1316 * var51) * 65535L / (long) (var49.field1326 * var55);
                            if (var56 < (long) var49.field1311) {
                                var48 = (class457) class247.field3441.method1631(5166);
                            } else {
                                int var58 = 0;
                                if (var49.field1309 == 1) {
                                    var58 = (var55 >> 4) * var49.field1320;
                                } else if (var49.field1309 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field1320;
                                }
                                if (var49.field1319 == 0) {
                                    if (var49.field1321 == 0) {
                                        var13 += (var48.field6213 - var58) * arg1;
                                        var14 += (var49.field1316 - var58) * arg1;
                                        var15 += (var48.field6214 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field1973 += (var48.field6213 - var58) * arg1;
                                        super.field1976 += (var49.field1316 - var58) * arg1;
                                        super.field1972 += (var48.field6214 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field1326;
                                    int var60 = (var51 << 15) / var55 * var49.field1326;
                                    int var61 = (var52 << 15) / var55 * var49.field1326;
                                    if (var49.field1321 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field1973 += arg1 * var59 >> 15;
                                        super.field1976 += arg1 * var60 >> 15;
                                        super.field1972 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class457) class247.field3441.method1631(5166);
                            }
                        }
                    }
                }
            }
            if (var8.field8905 != null) {
                if (var8.field8944 == null) {
                    var8.field8944 = new int[var8.field8905.length];
                    for (int var62 = 0; var62 < var8.field8905.length; ++var62) {
                        class43.method310(117, var8.field8905[var62]);
                        var8.field8944[var62] = ((class704) class102.field1524.method2918((long) var8.field8905[var62], (byte) -128)).field9905;
                    }
                }
                for (int var63 = 0; var63 < var8.field8944.length; ++var63) {
                    class87 var64 = class32.field524[var8.field8944[var63]];
                    if (var64.field1321 == 0) {
                        var13 += var64.field1312 * arg1;
                        var14 += var64.field1316 * arg1;
                        var15 += var64.field1315 * arg1;
                        var16 = true;
                    } else {
                        super.field1973 += var64.field1312 * arg1;
                        super.field1976 += var64.field1316 * arg1;
                        super.field1972 += var64.field1315 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field2767 = (short) var13;
                        this.field2763 = (short) var14;
                        this.field2769 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field2768 <<= 1;
                }
            }
            super.field1973 = (int) ((long) super.field1973 + ((long) (this.field2768 << 2) * (long) this.field2767 >> 23) * (long) arg1);
            super.field1976 = (int) ((long) super.field1976 + ((long) (this.field2768 << 2) * (long) this.field2763 >> 23) * (long) arg1);
            super.field1972 = (int) ((long) super.field1972 + ((long) (this.field2768 << 2) * (long) this.field2769 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lph;IIIIIIIIIIIZZ)V")
    public final void method1216(class602 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2764 = arg0;
        super.field1973 = arg1 << 12;
        super.field1976 = arg2 << 12;
        super.field1972 = arg3 << 12;
        super.field1979 = arg9;
        this.field2762 = this.field2770 = (short) arg8;
        super.field1983 = arg10;
        super.field1982 = arg11;
        super.field1978 = arg13;
        this.field2767 = (short) arg4;
        this.field2763 = (short) arg5;
        this.field2769 = (short) arg6;
        this.field2768 = arg7;
        super.field1984 = this.field2764.field7990.field1425;
        this.method1212();
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lph;IIIIIIIIIIIZZ)V")
    public class183(class602 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2764 = arg0;
        super.field1973 = arg1 << 12;
        super.field1976 = arg2 << 12;
        super.field1972 = arg3 << 12;
        super.field1979 = arg9;
        this.field2762 = this.field2770 = (short) arg8;
        super.field1983 = arg10;
        super.field1982 = arg11;
        super.field1978 = arg13;
        this.field2767 = (short) arg4;
        this.field2763 = (short) arg5;
        this.field2769 = (short) arg6;
        this.field2768 = arg7;
        super.field1984 = this.field2764.field7990.field1425;
        this.method1212();
    }
}
