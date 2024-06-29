import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class60 extends class386 {

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "Llu;")
    private class35 field798;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "S")
    private short field796;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "S")
    private short field795;

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "S")
    private short field799;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "S")
    private short field797;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "S")
    private short field800;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
    private int field794;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
    private int field792;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "S")
    private short field793;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Llu;IIIIIIIIIIIZZ)V")
    public final void method400(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field798 = arg0;
        super.field5887 = arg1 << class335.field5178;
        super.field5874 = arg2 << class335.field5178;
        super.field5875 = arg3 << class335.field5178;
        super.field5883 = arg9;
        this.field795 = this.field796 = (short) arg8;
        super.field5881 = arg10;
        super.field5885 = arg11;
        super.field5878 = arg13;
        this.field799 = (short) arg4;
        this.field797 = (short) arg5;
        this.field800 = (short) arg6;
        this.field794 = arg7;
        super.field5886 = this.field798.field550.field7751;
        this.method403();
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(J)V")
    public final void method401(long arg0) {
        int var3 = super.field5887 >> class386.field5882 + 12;
        int var4 = super.field5875 >> class386.field5882 + 12;
        int var5 = super.field5874 >> class335.field5178;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class492.field7186 && var4 >= 0 && var4 < class285.field4248) {
            class134 var6 = this.field798.field566;
            class485 var7 = this.field798.field574;
            class206[] var8 = class455.field6683;
            int var9 = var8[var6.field1945].method849(var3, var4);
            int var10;
            if (var6.field1945 < class222.field3107 - 1) {
                var10 = var8[var6.field1945 + 1].method849(var3, var4);
            } else {
                var10 = var9 - (8 << class386.field5882);
            }
            if (var7.field7055) {
                if (var7.field7120 == -1 && var5 > var9) {
                    this.method404();
                    return;
                }
                if (var7.field7120 >= 0 && var5 > var8[var7.field7120].method849(var3, var4)) {
                    this.method404();
                    return;
                }
                if (var7.field7070 == -1 && var5 < var10) {
                    this.method404();
                    return;
                }
                if (var7.field7070 >= 0 && var5 < var8[var7.field7070 + 1].method849(var3, var4)) {
                    this.method404();
                    return;
                }
            }
            if (var3 >= var6.field1943 && var3 <= var6.field1946 && var4 >= var6.field1941 && var4 <= var6.field1947 && var5 <= var9 && var5 >= var10) {
                var6.field1948.field3603.method2572((byte) -97, this);
            } else {
                int var11;
                for (var11 = class222.field3107 - 1; var11 > 0 && var5 > var8[var11].method849(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method849(var3, var4)) {
                    this.method404();
                } else if (class222.field3107 - 1 == var11 && var8[var11].method849(var3, var4) - var5 > 8 << class386.field5882) {
                    this.method404();
                } else {
                    class420 var12 = class380.field5802[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class380.field5802[0][var3][var4] = new class420(0, var3, var4);
                        }
                        boolean var13 = class380.field5802[0][var3][var4].field6275 != null;
                        if (var11 == 3 && var13) {
                            this.method404();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class380.field5802[var14][var3][var4] == null) {
                                var12 = class380.field5802[var14][var3][var4] = new class420(var14, var3, var4);
                                if (var13) {
                                    ++var12.field6274;
                                }
                            }
                        }
                    }
                    if (var12.field6263 == null) {
                        var12.field6263 = new class258();
                        var12.field6278 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field6278) {
                        var12.field6263.field3603.method2575(-7870);
                        var12.field6263.field3607 = false;
                        var12.field6278 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field6263.field3603.method2572((byte) -97, this);
                }
            }
        } else {
            this.method404();
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(JI)V")
    public final void method402(long arg0, int arg1) {
        this.field796 = (short) (this.field796 - arg1);
        if (this.field796 <= 0) {
            this.method404();
        } else {
            int var4 = super.field5887 >> class335.field5178;
            int var5 = super.field5874 >> class335.field5178;
            int var6 = super.field5875 >> class335.field5178;
            class134 var7 = this.field798.field566;
            class485 var8 = this.field798.field574;
            if (var8.field7121 != 0) {
                if (this.field795 - this.field796 <= var8.field7114) {
                    int var9 = var8.field7063 * arg1 + (this.field792 >> 16 & 255) + (super.field5883 >> 8 & 65280);
                    int var10 = var8.field7061 * arg1 + (this.field792 >> 8 & 255) + (super.field5883 & 65280);
                    int var11 = var8.field7053 * arg1 + (super.field5883 << 8 & 65280) + (this.field792 & 255);
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
                    super.field5883 &= -16777216;
                    super.field5883 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field792 &= -16777216;
                    this.field792 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field795 - this.field796 <= var8.field7117) {
                    int var12 = var8.field7101 * arg1 + (this.field792 >> 24 & 255) + (super.field5883 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field5883 &= 16777215;
                    super.field5883 |= (var12 & 65280) << 16;
                    this.field792 &= 16777215;
                    this.field792 |= (var12 & 255) << 24;
                }
            }
            if (var8.field7108 != -1 && this.field795 - this.field796 <= var8.field7088) {
                this.field794 += var8.field7087 * arg1;
            }
            if (var8.field7071 != -1 && this.field795 - this.field796 <= var8.field7059) {
                super.field5881 += var8.field7062 * arg1;
            }
            int var13 = this.field799;
            int var14 = this.field797;
            int var15 = this.field800;
            boolean var16 = false;
            if (var8.field7111 == 1) {
                int var17 = var4 - this.field798.field544;
                int var18 = var5 - this.field798.field553;
                int var19 = var6 - this.field798.field563;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field7069 * var20 * arg1);
                this.field794 = (int) ((long) this.field794 - ((long) this.field794 * var21 >> 18));
            } else if (var8.field7111 == 2) {
                int var23 = var4 - this.field798.field544;
                int var24 = var5 - this.field798.field553;
                int var25 = var6 - this.field798.field563;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field7069 * var26 * arg1);
                this.field794 = (int) ((long) this.field794 - ((long) this.field794 * var27 >> 28));
            }
            if (var8.field7093 != null) {
                class467 var29 = var7.field1940.field4498;
                for (class467 var30 = var29.field6797; var29 != var30; var30 = var30.field6797) {
                    class180 var31 = (class180) var30;
                    class285 var32 = var31.field2563;
                    if (var32.field4236 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field7093.length; ++var34) {
                            if (var8.field7093[var34] == var32.field4246) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field2561;
                            int var36 = var5 - var31.field2558;
                            int var37 = var6 - var31.field2559;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field4239) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field2562 * var37 + var31.field2567 * var35 + var32.field4242 * var36) * 65535L / (long) (var32.field4233 * var40);
                                if (var41 >= (long) var32.field4232) {
                                    int var43 = 0;
                                    if (var32.field4243 == 1) {
                                        var43 = (var40 >> 4) * var32.field4244;
                                    } else if (var32.field4243 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field4244;
                                    }
                                    if (var32.field4240 == 0) {
                                        if (var32.field4229 == 0) {
                                            var13 += (var31.field2567 - var43) * arg1;
                                            var14 += (var32.field4242 - var43) * arg1;
                                            var15 += (var31.field2562 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field5887 += (var31.field2567 - var43) * arg1;
                                            super.field5874 += (var32.field4242 - var43) * arg1;
                                            super.field5875 += (var31.field2562 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field4233;
                                        int var45 = (var36 << 15) / var40 * var32.field4233;
                                        int var46 = (var37 << 15) / var40 * var32.field4233;
                                        if (var32.field4229 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field5887 += arg1 * var44 >> 15;
                                            super.field5874 += arg1 * var45 >> 15;
                                            super.field5875 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field7058 != null) {
                for (int var47 = 0; var47 < var8.field7058.length; ++var47) {
                    class180 var48 = (class180) class123.field1752.method1438((byte) 33, (long) var8.field7058[var47]);
                    while (var48 != null) {
                        class285 var49 = var48.field2563;
                        int var50 = var4 - var48.field2561;
                        int var51 = var5 - var48.field2558;
                        int var52 = var6 - var48.field2559;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field4239) {
                            var48 = (class180) class123.field1752.method1436(9975);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field2562 * var52 + var48.field2567 * var50 + var49.field4242 * var51) * 65535L / (long) (var49.field4233 * var55);
                            if (var56 < (long) var49.field4232) {
                                var48 = (class180) class123.field1752.method1436(9975);
                            } else {
                                int var58 = 0;
                                if (var49.field4243 == 1) {
                                    var58 = (var55 >> 4) * var49.field4244;
                                } else if (var49.field4243 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field4244;
                                }
                                if (var49.field4240 == 0) {
                                    if (var49.field4229 == 0) {
                                        var13 += (var48.field2567 - var58) * arg1;
                                        var14 += (var49.field4242 - var58) * arg1;
                                        var15 += (var48.field2562 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field5887 += (var48.field2567 - var58) * arg1;
                                        super.field5874 += (var49.field4242 - var58) * arg1;
                                        super.field5875 += (var48.field2562 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field4233;
                                    int var60 = (var51 << 15) / var55 * var49.field4233;
                                    int var61 = (var52 << 15) / var55 * var49.field4233;
                                    if (var49.field4229 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field5887 += arg1 * var59 >> 15;
                                        super.field5874 += arg1 * var60 >> 15;
                                        super.field5875 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class180) class123.field1752.method1436(9975);
                            }
                        }
                    }
                }
            }
            if (var8.field7066 != null) {
                if (var8.field7073 == null) {
                    var8.field7073 = new int[var8.field7066.length];
                    for (int var62 = 0; var62 < var8.field7066.length; ++var62) {
                        class512.method3051(113, var8.field7066[var62]);
                        var8.field7073[var62] = ((class74) class480.field7010.method943((long) var8.field7066[var62], -1)).field998;
                    }
                }
                for (int var63 = 0; var63 < var8.field7073.length; ++var63) {
                    class285 var64 = class119.field1663[var8.field7073[var63]];
                    if (var64.field4229 == 0) {
                        var13 += var64.field4234 * arg1;
                        var14 += var64.field4242 * arg1;
                        var15 += var64.field4247 * arg1;
                        var16 = true;
                    } else {
                        super.field5887 += var64.field4234 * arg1;
                        super.field5874 += var64.field4242 * arg1;
                        super.field5875 += var64.field4247 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field799 = (short) var13;
                        this.field797 = (short) var14;
                        this.field800 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field794 <<= 1;
                }
            }
            super.field5887 = (int) ((long) super.field5887 + ((long) this.field799 * (long) this.field794 >> 23) * (long) arg1);
            super.field5874 = (int) ((long) super.field5874 + ((long) this.field797 * (long) this.field794 >> 23) * (long) arg1);
            super.field5875 = (int) ((long) super.field5875 + ((long) this.field800 * (long) this.field794 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "()V")
    private final void method403() {
        int var1 = this.field798.field566.field1937;
        if (this.field798.field566.field1931[var1] != null) {
            this.field798.field566.field1931[var1].method404();
        }
        this.field798.field566.field1931[var1] = this;
        this.field793 = (short) this.field798.field566.field1937;
        this.field798.field566.field1937 = var1 + 1 & 8191;
        this.field798.field545.method2353(this, -9798);
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "()V")
    private final void method404() {
        this.field798.field566.field1931[this.field793] = null;
        class433.field6419[class331.field5126] = this;
        class331.field5126 = class331.field5126 + 1 & 1023;
        this.method142(0);
        this.method2509((byte) -19);
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Llu;IIIIIIIIIIIZZ)V")
    public class60(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field798 = arg0;
        super.field5887 = arg1 << class335.field5178;
        super.field5874 = arg2 << class335.field5178;
        super.field5875 = arg3 << class335.field5178;
        super.field5883 = arg9;
        this.field795 = this.field796 = (short) arg8;
        super.field5881 = arg10;
        super.field5885 = arg11;
        super.field5878 = arg13;
        this.field799 = (short) arg4;
        this.field797 = (short) arg5;
        this.field800 = (short) arg6;
        this.field794 = arg7;
        super.field5886 = this.field798.field550.field7751;
        this.method403();
    }
}
