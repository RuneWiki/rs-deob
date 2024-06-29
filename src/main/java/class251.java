import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class251 extends class113 {

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "Lpl;")
    private class165 field4062;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "S")
    private short field4066;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "S")
    private short field4064;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "S")
    private short field4060;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "S")
    private short field4063;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "S")
    private short field4067;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    private int field4068;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    private int field4061;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "S")
    private short field4065;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()V")
    private final void method1731() {
        int var1 = this.field4062.field2397.field5519;
        if (this.field4062.field2397.field5524[var1] != null) {
            this.field4062.field2397.field5524[var1].method1734();
        }
        this.field4062.field2397.field5524[var1] = this;
        this.field4065 = (short) this.field4062.field2397.field5519;
        this.field4062.field2397.field5519 = var1 + 1 & 8191;
        this.field4062.field2415.method2625(this, 0);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lpl;IIIIIIIIIIIZZ)V")
    public final void method1732(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4062 = arg0;
        super.field1582 = arg1 << 12;
        super.field1588 = arg2 << 12;
        super.field1592 = arg3 << 12;
        super.field1584 = arg9;
        this.field4064 = this.field4066 = (short) arg8;
        super.field1594 = arg10;
        super.field1591 = arg11;
        super.field1590 = arg13;
        this.field4060 = (short) arg4;
        this.field4063 = (short) arg5;
        this.field4067 = (short) arg6;
        this.field4068 = arg7;
        super.field1587 = this.field4062.field2401.field4614;
        this.method1731();
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(JI)V")
    public final void method1733(long arg0, int arg1) {
        this.field4066 = (short) (this.field4066 - arg1);
        if (this.field4066 <= 0) {
            this.method1734();
        } else {
            int var4 = super.field1582 >> 12;
            int var5 = super.field1588 >> 12;
            int var6 = super.field1592 >> 12;
            class356 var7 = this.field4062.field2397;
            class323 var8 = this.field4062.field2411;
            if (var8.field5034 != 0) {
                if (this.field4064 - this.field4066 <= var8.field5035) {
                    int var9 = var8.field5070 * arg1 + (this.field4061 >> 16 & 255) + (super.field1584 >> 8 & 65280);
                    int var10 = var8.field5063 * arg1 + (this.field4061 >> 8 & 255) + (super.field1584 & 65280);
                    int var11 = var8.field5057 * arg1 + (super.field1584 << 8 & 65280) + (this.field4061 & 255);
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
                    super.field1584 &= -16777216;
                    super.field1584 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field4061 &= -16777216;
                    this.field4061 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field4064 - this.field4066 <= var8.field5069) {
                    int var12 = var8.field5086 * arg1 + (this.field4061 >> 24 & 255) + (super.field1584 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field1584 &= 16777215;
                    super.field1584 |= (var12 & 65280) << 16;
                    this.field4061 &= 16777215;
                    this.field4061 |= (var12 & 255) << 24;
                }
            }
            if (var8.field5043 != -1 && this.field4064 - this.field4066 <= var8.field5053) {
                this.field4068 += var8.field5067 * arg1;
            }
            if (var8.field5084 != -1 && this.field4064 - this.field4066 <= var8.field5103) {
                super.field1594 += var8.field5038 * arg1;
            }
            int var13 = this.field4060;
            int var14 = this.field4063;
            int var15 = this.field4067;
            boolean var16 = false;
            if (var8.field5050 == 1) {
                int var17 = var4 - this.field4062.field2410;
                int var18 = var5 - this.field4062.field2377;
                int var19 = var6 - this.field4062.field2396;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field5089 * var20 * arg1);
                this.field4068 = (int) ((long) this.field4068 - ((long) this.field4068 * var21 >> 18));
            } else if (var8.field5050 == 2) {
                int var23 = var4 - this.field4062.field2410;
                int var24 = var5 - this.field4062.field2377;
                int var25 = var6 - this.field4062.field2396;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field5089 * var26 * arg1);
                this.field4068 = (int) ((long) this.field4068 - ((long) this.field4068 * var27 >> 28));
            }
            if (var8.field5097 != null) {
                class529 var29 = var7.field5525.field4939;
                for (class529 var30 = var29.field7779; var29 != var30; var30 = var30.field7779) {
                    class220 var31 = (class220) var30;
                    class444 var32 = var31.field3720;
                    if (var32.field6888 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field5097.length; ++var34) {
                            if (var8.field5097[var34] == var32.field6889) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field3719;
                            int var36 = var5 - var31.field3727;
                            int var37 = var6 - var31.field3722;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field6897) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field3732 * var37 + var31.field3734 * var35 + var32.field6886 * var36) * 65535L / (long) (var32.field6905 * var40);
                                if (var41 >= (long) var32.field6894) {
                                    int var43 = 0;
                                    if (var32.field6896 == 1) {
                                        var43 = (var40 >> 4) * var32.field6891;
                                    } else if (var32.field6896 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field6891;
                                    }
                                    if (var32.field6899 == 0) {
                                        if (var32.field6892 == 0) {
                                            var13 += (var31.field3734 - var43) * arg1;
                                            var14 += (var32.field6886 - var43) * arg1;
                                            var15 += (var31.field3732 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field1582 += (var31.field3734 - var43) * arg1;
                                            super.field1588 += (var32.field6886 - var43) * arg1;
                                            super.field1592 += (var31.field3732 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field6905;
                                        int var45 = (var36 << 15) / var40 * var32.field6905;
                                        int var46 = (var37 << 15) / var40 * var32.field6905;
                                        if (var32.field6892 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field1582 += arg1 * var44 >> 15;
                                            super.field1588 += arg1 * var45 >> 15;
                                            super.field1592 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field5100 != null) {
                for (int var47 = 0; var47 < var8.field5100.length; ++var47) {
                    class220 var48 = (class220) class116.field1616.method1412((long) var8.field5100[var47], (byte) -112);
                    while (var48 != null) {
                        class444 var49 = var48.field3720;
                        int var50 = var4 - var48.field3719;
                        int var51 = var5 - var48.field3727;
                        int var52 = var6 - var48.field3722;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field6897) {
                            var48 = (class220) class116.field1616.method1411((byte) 106);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field3732 * var52 + var48.field3734 * var50 + var49.field6886 * var51) * 65535L / (long) (var49.field6905 * var55);
                            if (var56 < (long) var49.field6894) {
                                var48 = (class220) class116.field1616.method1411((byte) 108);
                            } else {
                                int var58 = 0;
                                if (var49.field6896 == 1) {
                                    var58 = (var55 >> 4) * var49.field6891;
                                } else if (var49.field6896 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field6891;
                                }
                                if (var49.field6899 == 0) {
                                    if (var49.field6892 == 0) {
                                        var13 += (var48.field3734 - var58) * arg1;
                                        var14 += (var49.field6886 - var58) * arg1;
                                        var15 += (var48.field3732 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field1582 += (var48.field3734 - var58) * arg1;
                                        super.field1588 += (var49.field6886 - var58) * arg1;
                                        super.field1592 += (var48.field3732 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field6905;
                                    int var60 = (var51 << 15) / var55 * var49.field6905;
                                    int var61 = (var52 << 15) / var55 * var49.field6905;
                                    if (var49.field6892 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field1582 += arg1 * var59 >> 15;
                                        super.field1588 += arg1 * var60 >> 15;
                                        super.field1592 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class220) class116.field1616.method1411((byte) 118);
                            }
                        }
                    }
                }
            }
            if (var8.field5059 != null) {
                if (var8.field5047 == null) {
                    var8.field5047 = new int[var8.field5059.length];
                    for (int var62 = 0; var62 < var8.field5059.length; ++var62) {
                        class414.method2643(true, var8.field5059[var62]);
                        var8.field5047[var62] = ((class330) class16.field167.method1122((byte) 59, (long) var8.field5059[var62])).field5185;
                    }
                }
                for (int var63 = 0; var63 < var8.field5047.length; ++var63) {
                    class444 var64 = class274.field4354[var8.field5047[var63]];
                    if (var64.field6892 == 0) {
                        var13 += var64.field6890 * arg1;
                        var14 += var64.field6886 * arg1;
                        var15 += var64.field6902 * arg1;
                        var16 = true;
                    } else {
                        super.field1582 += var64.field6890 * arg1;
                        super.field1588 += var64.field6886 * arg1;
                        super.field1592 += var64.field6902 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field4060 = (short) var13;
                        this.field4063 = (short) var14;
                        this.field4067 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field4068 <<= 1;
                }
            }
            super.field1582 = (int) ((long) super.field1582 + ((long) this.field4060 * (long) this.field4068 >> 23) * (long) arg1);
            super.field1588 = (int) ((long) super.field1588 + ((long) this.field4063 * (long) this.field4068 >> 23) * (long) arg1);
            super.field1592 = (int) ((long) super.field1592 + ((long) this.field4067 * (long) this.field4068 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "()V")
    private final void method1734() {
        this.field4062.field2397.field5524[this.field4065] = null;
        class64.field1006[class196.field3036] = this;
        class196.field3036 = class196.field3036 + 1 & 1023;
        this.method1613(1049391719);
        this.method1898(0);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(J)V")
    public final void method1735(long arg0) {
        int var3 = super.field1582 >> class56.field908 + 12;
        int var4 = super.field1592 >> class56.field908 + 12;
        int var5 = super.field1588 >> 12;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class252.field4075 && var4 >= 0 && var4 < class131.field1773) {
            class356 var6 = this.field4062.field2397;
            class323 var7 = this.field4062.field2411;
            class223[] var8 = class53.field732;
            int var9 = var8[var6.field5533].method688(var3, var4);
            int var10;
            if (var6.field5533 < class297.field4675 - 1) {
                var10 = var8[var6.field5533 + 1].method688(var3, var4);
            } else {
                var10 = var9 - (8 << class56.field908);
            }
            if (var7.field5045) {
                if (var7.field5046 == -1 && var5 > var9) {
                    this.method1734();
                    return;
                }
                if (var7.field5046 >= 0 && var5 > var8[var7.field5046].method688(var3, var4)) {
                    this.method1734();
                    return;
                }
                if (var7.field5101 == -1 && var5 < var10) {
                    this.method1734();
                    return;
                }
                if (var7.field5101 >= 0 && var5 < var8[var7.field5101 + 1].method688(var3, var4)) {
                    this.method1734();
                    return;
                }
            }
            if (var3 >= var6.field5532 && var3 <= var6.field5531 && var4 >= var6.field5530 && var4 <= var6.field5529 && var5 <= var9 && var5 >= var10) {
                var6.field5528.field7690.method2504(17299, this);
            } else {
                int var11;
                for (var11 = class297.field4675 - 1; var11 > 0 && var5 > var8[var11].method688(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method688(var3, var4)) {
                    this.method1734();
                } else if (class297.field4675 - 1 == var11 && var8[var11].method688(var3, var4) - var5 > 8 << class56.field908) {
                    this.method1734();
                } else {
                    class409 var12 = class217.field3699[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class217.field3699[0][var3][var4] = new class409(0, var3, var4);
                        }
                        boolean var13 = class217.field3699[0][var3][var4].field6195 != null;
                        if (var11 == 3 && var13) {
                            this.method1734();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class217.field3699[var14][var3][var4] == null) {
                                var12 = class217.field3699[var14][var3][var4] = new class409(var14, var3, var4);
                                if (var13) {
                                    ++var12.field6174;
                                }
                            }
                        }
                    }
                    if (var12.field6181 == null) {
                        var12.field6181 = new class519();
                        var12.field6184 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field6184) {
                        var12.field6181.field7690.method2505(-1928);
                        var12.field6181.field7693 = false;
                        var12.field6184 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field6181.field7690.method2504(17299, this);
                }
            }
        } else {
            this.method1734();
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lpl;IIIIIIIIIIIZZ)V")
    public class251(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4062 = arg0;
        super.field1582 = arg1 << 12;
        super.field1588 = arg2 << 12;
        super.field1592 = arg3 << 12;
        super.field1584 = arg9;
        this.field4064 = this.field4066 = (short) arg8;
        super.field1594 = arg10;
        super.field1591 = arg11;
        super.field1590 = arg13;
        this.field4060 = (short) arg4;
        this.field4063 = (short) arg5;
        this.field4067 = (short) arg6;
        this.field4068 = arg7;
        super.field1587 = this.field4062.field2401.field4614;
        this.method1731();
    }
}
