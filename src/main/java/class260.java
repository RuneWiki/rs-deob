import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class260 extends class220 {

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "Luba;")
    public class327 field3594;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "S")
    private short field3587;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "S")
    private short field3588;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "S")
    private short field3586;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "S")
    private short field3591;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "S")
    private short field3592;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    private int field3589;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    private int field3593;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "S")
    private short field3590;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()V")
    private final void method1626() {
        int var1 = this.field3594.field4773.field1494;
        if (this.field3594.field4773.field1495[var1] != null) {
            this.field3594.field4773.field1495[var1].method1627();
        }
        this.field3594.field4773.field1495[var1] = this;
        this.field3590 = (short) this.field3594.field4773.field1494;
        this.field3594.field4773.field1494 = var1 + 1 & 8191;
        this.field3594.field4790.method2216(4, this);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()V")
    public final void method1627() {
        this.field3594.field4773.field1495[this.field3590] = null;
        class580.field8003[class626.field8522] = this;
        class626.field8522 = class626.field8522 + 1 & 1023;
        this.method2357(3553);
        this.method1282(-126);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Luba;IIIIIIIIIIIZZ)V")
    public final void method1628(class327 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3594 = arg0;
        super.field2856 = arg1 << 12;
        super.field2863 = arg2 << 12;
        super.field2858 = arg3 << 12;
        super.field2859 = arg9;
        this.field3588 = this.field3587 = (short) arg8;
        super.field2860 = arg10;
        super.field2864 = arg11;
        super.field2865 = arg13;
        this.field3586 = (short) arg4;
        this.field3591 = (short) arg5;
        this.field3592 = (short) arg6;
        this.field3589 = arg7;
        super.field2862 = this.field3594.field4764.field8158;
        this.method1626();
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(JI)V")
    public final void method1629(long arg0, int arg1) {
        this.field3587 = (short) (this.field3587 - arg1);
        if (this.field3587 <= 0) {
            this.method1627();
        } else {
            int var4 = super.field2856 >> 12;
            int var5 = super.field2863 >> 12;
            int var6 = super.field2858 >> 12;
            class117 var7 = this.field3594.field4773;
            class315 var8 = this.field3594.field4775;
            if (var8.field4539 != 0) {
                if (this.field3588 - this.field3587 <= var8.field4550) {
                    int var9 = var8.field4538 * arg1 + (this.field3593 >> 16 & 255) + (super.field2859 >> 8 & 65280);
                    int var10 = var8.field4595 * arg1 + (this.field3593 >> 8 & 255) + (super.field2859 & 65280);
                    int var11 = var8.field4567 * arg1 + (super.field2859 << 8 & 65280) + (this.field3593 & 255);
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
                    super.field2859 &= -16777216;
                    super.field2859 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field3593 &= -16777216;
                    this.field3593 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field3588 - this.field3587 <= var8.field4594) {
                    int var12 = var8.field4534 * arg1 + (this.field3593 >> 24 & 255) + (super.field2859 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field2859 &= 16777215;
                    super.field2859 |= (var12 & 65280) << 16;
                    this.field3593 &= 16777215;
                    this.field3593 |= (var12 & 255) << 24;
                }
            }
            if (var8.field4547 != -1 && this.field3588 - this.field3587 <= var8.field4596) {
                this.field3589 += var8.field4585 * arg1;
            }
            if (var8.field4570 != -1 && this.field3588 - this.field3587 <= var8.field4572) {
                super.field2860 += var8.field4571 * arg1;
            }
            int var13 = this.field3586;
            int var14 = this.field3591;
            int var15 = this.field3592;
            boolean var16 = false;
            if (var8.field4542 == 1) {
                int var17 = var4 - this.field3594.field4756;
                int var18 = var5 - this.field3594.field4763;
                int var19 = var6 - this.field3594.field4767;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18)) >> 2;
                long var21 = (long) (var8.field4524 * var20 * arg1);
                this.field3589 = (int) ((long) this.field3589 - ((long) this.field3589 * var21 >> 18));
            } else if (var8.field4542 == 2) {
                int var23 = var4 - this.field3594.field4756;
                int var24 = var5 - this.field3594.field4763;
                int var25 = var6 - this.field3594.field4767;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field4524 * var26 * arg1);
                this.field3589 = (int) ((long) this.field3589 - ((long) this.field3589 * var27 >> 28));
            }
            if (var8.field4533 != null) {
                class28 var29 = var7.field1503.field825;
                for (class28 var30 = var29.field276; var29 != var30; var30 = var30.field276) {
                    class649 var31 = (class649) var30;
                    class604 var32 = var31.field9197;
                    if (var32.field8262 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field4533.length; ++var34) {
                            if (var8.field4533[var34] == var32.field8248) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field9201;
                            int var36 = var5 - var31.field9195;
                            int var37 = var6 - var31.field9193;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field8264) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field9198 * var37 + var31.field9192 * var35 + var32.field8258 * var36) * 65535L / (long) (var32.field8252 * var40);
                                if (var41 >= (long) var32.field8260) {
                                    int var43 = 0;
                                    if (var32.field8261 == 1) {
                                        var43 = (var40 >> 4) * var32.field8251;
                                    } else if (var32.field8261 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field8251;
                                    }
                                    if (var32.field8266 == 0) {
                                        if (var32.field8263 == 0) {
                                            var13 += (var31.field9192 - var43) * arg1;
                                            var14 += (var32.field8258 - var43) * arg1;
                                            var15 += (var31.field9198 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field2856 += (var31.field9192 - var43) * arg1;
                                            super.field2863 += (var32.field8258 - var43) * arg1;
                                            super.field2858 += (var31.field9198 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field8252;
                                        int var45 = (var36 << 15) / var40 * var32.field8252;
                                        int var46 = (var37 << 15) / var40 * var32.field8252;
                                        if (var32.field8263 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field2856 += arg1 * var44 >> 15;
                                            super.field2863 += arg1 * var45 >> 15;
                                            super.field2858 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field4541 != null) {
                for (int var47 = 0; var47 < var8.field4541.length; ++var47) {
                    class649 var48 = (class649) class58.field810.method3168((byte) 26, (long) var8.field4541[var47]);
                    while (var48 != null) {
                        class604 var49 = var48.field9197;
                        int var50 = var4 - var48.field9201;
                        int var51 = var5 - var48.field9195;
                        int var52 = var6 - var48.field9193;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field8264) {
                            var48 = (class649) class58.field810.method3172(2721);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field9198 * var52 + var48.field9192 * var50 + var49.field8258 * var51) * 65535L / (long) (var49.field8252 * var55);
                            if (var56 < (long) var49.field8260) {
                                var48 = (class649) class58.field810.method3172(2721);
                            } else {
                                int var58 = 0;
                                if (var49.field8261 == 1) {
                                    var58 = (var55 >> 4) * var49.field8251;
                                } else if (var49.field8261 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field8251;
                                }
                                if (var49.field8266 == 0) {
                                    if (var49.field8263 == 0) {
                                        var13 += (var48.field9192 - var58) * arg1;
                                        var14 += (var49.field8258 - var58) * arg1;
                                        var15 += (var48.field9198 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field2856 += (var48.field9192 - var58) * arg1;
                                        super.field2863 += (var49.field8258 - var58) * arg1;
                                        super.field2858 += (var48.field9198 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field8252;
                                    int var60 = (var51 << 15) / var55 * var49.field8252;
                                    int var61 = (var52 << 15) / var55 * var49.field8252;
                                    if (var49.field8263 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field2856 += arg1 * var59 >> 15;
                                        super.field2863 += arg1 * var60 >> 15;
                                        super.field2858 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class649) class58.field810.method3172(2721);
                            }
                        }
                    }
                }
            }
            if (var8.field4587 != null) {
                if (var8.field4529 == null) {
                    var8.field4529 = new int[var8.field4587.length];
                    for (int var62 = 0; var62 < var8.field4587.length; ++var62) {
                        class573.method3239((byte) -110, var8.field4587[var62]);
                        var8.field4529[var62] = ((class360) class381.field5517.method2506(59, (long) var8.field4587[var62])).field5197;
                    }
                }
                for (int var63 = 0; var63 < var8.field4529.length; ++var63) {
                    class604 var64 = class537.field7375[var8.field4529[var63]];
                    if (var64.field8263 == 0) {
                        var13 += var64.field8253 * arg1;
                        var14 += var64.field8258 * arg1;
                        var15 += var64.field8254 * arg1;
                        var16 = true;
                    } else {
                        super.field2856 += var64.field8253 * arg1;
                        super.field2863 += var64.field8258 * arg1;
                        super.field2858 += var64.field8254 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field3586 = (short) var13;
                        this.field3591 = (short) var14;
                        this.field3592 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field3589 <<= 1;
                }
            }
            super.field2856 = (int) ((long) super.field2856 + ((long) (this.field3589 << 2) * (long) this.field3586 >> 23) * (long) arg1);
            super.field2863 = (int) ((long) super.field2863 + ((long) (this.field3589 << 2) * (long) this.field3591 >> 23) * (long) arg1);
            super.field2858 = (int) ((long) super.field2858 + ((long) (this.field3589 << 2) * (long) this.field3592 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Loa;J)V")
    public final void method1630(class689 arg0, long arg1) {
        int var4 = super.field2856 >> class428.field5949 + 12;
        int var5 = super.field2858 >> class428.field5949 + 12;
        int var6 = super.field2863 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class149.field1872 && var5 >= 0 && var5 < class334.field4887) {
            class117 var7 = this.field3594.field4773;
            class315 var8 = this.field3594.field4775;
            class176[] var9 = class397.field5666;
            int var10 = var7.field1510;
            class651 var11 = class145.field1841[var7.field1510][var4][var5];
            if (var11 != null) {
                var10 = var11.field9239;
            }
            int var12 = var9[var10].method150(var4, var5);
            int var13;
            if (var10 < class87.field1079 - 1) {
                var13 = var9[var10 + 1].method150(var4, var5);
            } else {
                var13 = var12 - (8 << class428.field5949);
            }
            if (var8.field4526) {
                if (var8.field4560 == -1 && var6 > var12) {
                    this.method1627();
                    return;
                }
                if (var8.field4560 >= 0 && var6 > var9[var8.field4560].method150(var4, var5)) {
                    this.method1627();
                    return;
                }
                if (var8.field4527 == -1 && var6 < var13) {
                    this.method1627();
                    return;
                }
                if (var8.field4527 >= 0 && var6 < var9[var8.field4527 + 1].method150(var4, var5)) {
                    this.method1627();
                    return;
                }
            }
            if (var4 >= var7.field1512 && var4 <= var7.field1507 && var5 >= var7.field1505 && var5 <= var7.field1508 && var6 <= var12 && var6 >= var13) {
                var7.field1509.field4141.method386((byte) 97, this);
            } else {
                int var14;
                for (var14 = class87.field1079 - 1; var14 > 0 && var6 > var9[var14].method150(var4, var5); --var14) {
                }
                if (var8.field4536 && var14 == 0 && var6 > var9[0].method150(var4, var5)) {
                    this.method1627();
                } else if (class87.field1079 - 1 == var14 && var9[var14].method150(var4, var5) - var6 > 8 << class428.field5949) {
                    this.method1627();
                } else {
                    class651 var15 = class145.field1841[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class145.field1841[0][var4][var5] == null) {
                            var15 = class145.field1841[0][var4][var5] = new class651(0, var4, var5);
                        }
                        boolean var16 = class145.field1841[0][var4][var5].field9225 != null;
                        if (var14 == 3 && var16) {
                            this.method1627();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class145.field1841[var17][var4][var5] == null) {
                                var15 = class145.field1841[var17][var4][var5] = new class651(var17, var4, var5);
                                if (var16) {
                                    ++var15.field9239;
                                }
                            }
                        }
                    }
                    if (var8.field4546) {
                        int var18 = super.field2856 >> 12;
                        int var19 = super.field2858 >> 12;
                        if (var15.field9220 != null) {
                            class162 var20 = var15.field9220.method134((byte) 126, arg0);
                            if (var20 != null && var20.method1098(var19, var6, var18, 110)) {
                                this.method1627();
                                return;
                            }
                        }
                        if (var15.field9224 != null) {
                            class162 var21 = var15.field9224.method134((byte) 126, arg0);
                            if (var21 != null && var21.method1098(var19, var6, var18, 116)) {
                                this.method1627();
                                return;
                            }
                        }
                        if (var15.field9227 != null) {
                            class162 var22 = var15.field9227.method134((byte) 122, arg0);
                            if (var22 != null && var22.method1098(var19, var6, var18, 66)) {
                                this.method1627();
                                return;
                            }
                        }
                        for (class82 var23 = var15.field9228; var23 != null; var23 = var23.field1024) {
                            class162 var24 = var23.field1027.method134((byte) 124, arg0);
                            if (var24 != null && var24.method1098(var19, var6, var18, 87)) {
                                this.method1627();
                                return;
                            }
                        }
                    }
                    if (var15.field9240 == null) {
                        var15.field9240 = new class309();
                        var15.field9232 = (byte) ((int) (arg1 & 255L));
                    } else if ((byte) ((int) (arg1 & 255L)) != var15.field9232) {
                        var15.field9240.field4141.method385(true);
                        var15.field9240.field4148 = false;
                        var15.field9232 = (byte) ((int) (arg1 & 255L));
                    }
                    var15.field9240.field4141.method386((byte) 127, this);
                }
            }
        } else {
            this.method1627();
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Luba;IIIIIIIIIIIZZ)V")
    public class260(class327 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3594 = arg0;
        super.field2856 = arg1 << 12;
        super.field2863 = arg2 << 12;
        super.field2858 = arg3 << 12;
        super.field2859 = arg9;
        this.field3588 = this.field3587 = (short) arg8;
        super.field2860 = arg10;
        super.field2864 = arg11;
        super.field2865 = arg13;
        this.field3586 = (short) arg4;
        this.field3591 = (short) arg5;
        this.field3592 = (short) arg6;
        this.field3589 = arg7;
        super.field2862 = this.field3594.field4764.field8158;
        this.method1626();
    }
}
