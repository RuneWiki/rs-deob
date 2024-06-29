import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class251 extends class394 {

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "Llm;")
    private class347 field3630;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "S")
    private short field3631;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "S")
    private short field3626;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "S")
    private short field3625;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "S")
    private short field3623;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "S")
    private short field3628;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    private int field3627;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    private int field3624;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "S")
    private short field3629;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(JI)V")
    public final void method1802(long arg0, int arg1) {
        this.field3631 = (short) (this.field3631 - arg1);
        if (this.field3631 <= 0) {
            this.method1803();
        } else {
            int var4 = super.field5750 >> class339.field4826;
            int var5 = super.field5748 >> class339.field4826;
            int var6 = super.field5760 >> class339.field4826;
            class54 var7 = this.field3630.field4904;
            class66 var8 = this.field3630.field4898;
            if (var8.field1082 != 0) {
                if (this.field3626 - this.field3631 <= var8.field1100) {
                    int var9 = var8.field1053 * arg1 + (super.field5757 >> 8 & 65280) + (this.field3624 >> 16 & 255);
                    int var10 = var8.field1099 * arg1 + (this.field3624 >> 8 & 255) + (super.field5757 & 65280);
                    int var11 = var8.field1066 * arg1 + (super.field5757 << 8 & 65280) + (this.field3624 & 255);
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
                    super.field5757 &= -16777216;
                    super.field5757 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field3624 &= -16777216;
                    this.field3624 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field3626 - this.field3631 <= var8.field1116) {
                    int var12 = var8.field1052 * arg1 + (super.field5757 >> 16 & 65280) + (this.field3624 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field5757 &= 16777215;
                    super.field5757 |= (var12 & 65280) << 16;
                    this.field3624 &= 16777215;
                    this.field3624 |= (var12 & 255) << 24;
                }
            }
            if (var8.field1046 != -1 && this.field3626 - this.field3631 <= var8.field1096) {
                this.field3627 += var8.field1105 * arg1;
            }
            if (var8.field1083 != -1 && this.field3626 - this.field3631 <= var8.field1074) {
                super.field5752 += var8.field1115 * arg1;
            }
            int var13 = this.field3625;
            int var14 = this.field3623;
            int var15 = this.field3628;
            boolean var16 = false;
            if (var8.field1060 == 1) {
                int var17 = var4 - this.field3630.field4895;
                int var18 = var5 - this.field3630.field4918;
                int var19 = var6 - this.field3630.field4885;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field1112 * var20 * arg1);
                this.field3627 = (int) ((long) this.field3627 - ((long) this.field3627 * var21 >> 18));
            } else if (var8.field1060 == 2) {
                int var23 = var4 - this.field3630.field4895;
                int var24 = var5 - this.field3630.field4918;
                int var25 = var6 - this.field3630.field4885;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field1112 * var26 * arg1);
                this.field3627 = (int) ((long) this.field3627 - ((long) this.field3627 * var27 >> 28));
            }
            if (var8.field1057 != null) {
                class35 var29 = var7.field872.field322;
                for (class35 var30 = var29.field498; var29 != var30; var30 = var30.field498) {
                    class358 var31 = (class358) var30;
                    class238 var32 = var31.field5109;
                    if (var32.field3431 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field1057.length; ++var34) {
                            if (var8.field1057[var34] == var32.field3430) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field5099;
                            int var36 = var5 - var31.field5106;
                            int var37 = var6 - var31.field5102;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3422) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field5104 * var37 + var31.field5103 * var35 + var32.field3433 * var36) * 65535L / (long) (var32.field3426 * var40);
                                if (var41 >= (long) var32.field3421) {
                                    int var43 = 0;
                                    if (var32.field3437 == 1) {
                                        var43 = (var40 >> 4) * var32.field3424;
                                    } else if (var32.field3437 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3424;
                                    }
                                    if (var32.field3432 == 0) {
                                        if (var32.field3427 == 0) {
                                            var13 += (var31.field5103 - var43) * arg1;
                                            var14 += (var32.field3433 - var43) * arg1;
                                            var15 += (var31.field5104 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field5750 += (var31.field5103 - var43) * arg1;
                                            super.field5748 += (var32.field3433 - var43) * arg1;
                                            super.field5760 += (var31.field5104 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3426;
                                        int var45 = (var36 << 15) / var40 * var32.field3426;
                                        int var46 = (var37 << 15) / var40 * var32.field3426;
                                        if (var32.field3427 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field5750 += arg1 * var44 >> 15;
                                            super.field5748 += arg1 * var45 >> 15;
                                            super.field5760 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field1092 != null) {
                for (int var47 = 0; var47 < var8.field1092.length; ++var47) {
                    class358 var48 = (class358) class26.field389.method2167((long) var8.field1092[var47], -1);
                    while (var48 != null) {
                        class238 var49 = var48.field5109;
                        int var50 = var4 - var48.field5099;
                        int var51 = var5 - var48.field5106;
                        int var52 = var6 - var48.field5102;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3422) {
                            var48 = (class358) class26.field389.method2172(-1);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field5104 * var52 + var48.field5103 * var50 + var49.field3433 * var51) * 65535L / (long) (var49.field3426 * var55);
                            if (var56 < (long) var49.field3421) {
                                var48 = (class358) class26.field389.method2172(-1);
                            } else {
                                int var58 = 0;
                                if (var49.field3437 == 1) {
                                    var58 = (var55 >> 4) * var49.field3424;
                                } else if (var49.field3437 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3424;
                                }
                                if (var49.field3432 == 0) {
                                    if (var49.field3427 == 0) {
                                        var13 += (var48.field5103 - var58) * arg1;
                                        var14 += (var49.field3433 - var58) * arg1;
                                        var15 += (var48.field5104 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field5750 += (var48.field5103 - var58) * arg1;
                                        super.field5748 += (var49.field3433 - var58) * arg1;
                                        super.field5760 += (var48.field5104 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3426;
                                    int var60 = (var51 << 15) / var55 * var49.field3426;
                                    int var61 = (var52 << 15) / var55 * var49.field3426;
                                    if (var49.field3427 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field5750 += arg1 * var59 >> 15;
                                        super.field5748 += arg1 * var60 >> 15;
                                        super.field5760 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class358) class26.field389.method2172(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field1104 != null) {
                if (var8.field1055 == null) {
                    var8.field1055 = new int[var8.field1104.length];
                    for (int var62 = 0; var62 < var8.field1104.length; ++var62) {
                        class402.method2552((byte) -128, var8.field1104[var62]);
                        var8.field1055[var62] = ((class9) class50.field814.method1219((long) var8.field1104[var62], -127)).field117;
                    }
                }
                for (int var63 = 0; var63 < var8.field1055.length; ++var63) {
                    class238 var64 = class218.field3225[var8.field1055[var63]];
                    if (var64.field3427 == 0) {
                        var13 += var64.field3440 * arg1;
                        var14 += var64.field3433 * arg1;
                        var15 += var64.field3434 * arg1;
                        var16 = true;
                    } else {
                        super.field5750 += var64.field3440 * arg1;
                        super.field5748 += var64.field3433 * arg1;
                        super.field5760 += var64.field3434 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field3625 = (short) var13;
                        this.field3623 = (short) var14;
                        this.field3628 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field3627 <<= 1;
                }
            }
            super.field5750 = (int) ((long) super.field5750 + ((long) this.field3625 * (long) this.field3627 >> 23) * (long) arg1);
            super.field5748 = (int) ((long) super.field5748 + ((long) this.field3623 * (long) this.field3627 >> 23) * (long) arg1);
            super.field5760 = (int) ((long) super.field5760 + ((long) this.field3628 * (long) this.field3627 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
    private final void method1803() {
        this.field3630.field4904.field871[this.field3629] = null;
        class196.field2867[class185.field2723] = this;
        class185.field2723 = class185.field2723 + 1 & 1023;
        this.method2731((byte) 123);
        this.method2064(11);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Llm;IIIIIIIIIIIZ)V")
    public final void method1804(class347 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field3630 = arg0;
        super.field5750 = arg1 << class339.field4826;
        super.field5748 = arg2 << class339.field4826;
        super.field5760 = arg3 << class339.field4826;
        super.field5757 = arg9;
        this.field3626 = this.field3631 = (short) arg8;
        super.field5752 = arg10;
        super.field5751 = arg11;
        this.field3625 = (short) arg4;
        this.field3623 = (short) arg5;
        this.field3628 = (short) arg6;
        this.field3627 = arg7;
        super.field5754 = this.field3630.field4916.field5492;
        this.method1805();
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()V")
    private final void method1805() {
        int var1 = this.field3630.field4904.field868;
        if (this.field3630.field4904.field871[var1] != null) {
            this.field3630.field4904.field871[var1].method1803();
        }
        this.field3630.field4904.field871[var1] = this;
        this.field3629 = (short) this.field3630.field4904.field868;
        this.field3630.field4904.field868 = var1 + 1 & 8191;
        this.field3630.field4902.method2483(123, this);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Llm;IIIIIIIIIIIZ)V")
    public class251(class347 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field3630 = arg0;
        super.field5750 = arg1 << class339.field4826;
        super.field5748 = arg2 << class339.field4826;
        super.field5760 = arg3 << class339.field4826;
        super.field5757 = arg9;
        this.field3626 = this.field3631 = (short) arg8;
        super.field5752 = arg10;
        super.field5751 = arg11;
        this.field3625 = (short) arg4;
        this.field3623 = (short) arg5;
        this.field3628 = (short) arg6;
        this.field3627 = arg7;
        super.field5754 = this.field3630.field4916.field5492;
        this.method1805();
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(J)V")
    public final void method1806(long arg0) {
        int var3 = super.field5750 >> 19;
        int var4 = super.field5760 >> 19;
        int var5 = super.field5748 >> class339.field4826;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class139.field2209 && var4 >= 0 && var4 < class436.field6353) {
            class54 var6 = this.field3630.field4904;
            class66 var7 = this.field3630.field4898;
            class126[] var8 = class50.field816;
            int var9 = var8[var6.field880].method794(var3, var4);
            int var10;
            if (var6.field880 < 3) {
                var10 = var8[var6.field880 + 1].method794(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field1107) {
                if (var7.field1080 == -1 && var5 > var9) {
                    this.method1803();
                    return;
                }
                if (var7.field1080 >= 0 && var5 > var8[var7.field1080].method794(var3, var4)) {
                    this.method1803();
                    return;
                }
                if (var7.field1069 == -1 && var5 < var10) {
                    this.method1803();
                    return;
                }
                if (var7.field1069 >= 0 && var5 < var8[var7.field1069 + 1].method794(var3, var4)) {
                    this.method1803();
                    return;
                }
            }
            if (var3 >= var6.field875 && var3 <= var6.field879 && var4 >= var6.field877 && var4 <= var6.field879 && var5 <= var9 && var5 >= var10) {
                var6.field874.field428.method1006(116, this);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method794(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method794(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method794(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method794(var3, var4) - 1024) {
                    this.method1803();
                    return;
                }
                class168 var12 = class443.field6447[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class443.field6447[0][var3][var4].field2498 != null;
                    if (var11 == 3 && var13) {
                        this.method1803();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class443.field6447[var14][var3][var4] == null) {
                            var12 = class443.field6447[var14][var3][var4] = new class168(var14, var3, var4);
                            if (var13) {
                                ++var12.field2504;
                            }
                        }
                    }
                }
                if (var12.field2496 == null) {
                    var12.field2496 = new class30();
                    var12.field2492 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field2492) {
                    var12.field2496 = new class30();
                    var12.field2492 = (byte) ((int) (arg0 & 255L));
                }
                var12.field2496.field428.method1006(106, this);
            }
        } else {
            this.method1803();
        }
    }
}
