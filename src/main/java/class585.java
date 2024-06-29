import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class585 extends class23 {

    @OriginalMember(owner = "client!jc", name = "Ac", descriptor = "I")
    public int field8457 = -1;

    @OriginalMember(owner = "client!jc", name = "Ec", descriptor = "I")
    public int field8461 = -1;

    @OriginalMember(owner = "client!jc", name = "Bc", descriptor = "I")
    public static int field8458 = 0;

    @OriginalMember(owner = "client!jc", name = "Hc", descriptor = "I")
    public static int field8464 = 0;

    @OriginalMember(owner = "client!jc", name = "Jc", descriptor = "[I")
    public static int[] field8466 = new int[2];

    @OriginalMember(owner = "client!jc", name = "zc", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!jc", name = "Cc", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!jc", name = "Dc", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!jc", name = "Fc", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!jc", name = "Gc", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!jc", name = "Ic", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!jc", name = "Kc", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!jc", name = "Lc", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!jc", name = "Mc", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!jc", name = "Nc", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!jc", name = "Oc", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!jc", name = "Pc", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!jc", name = "Qc", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!jc", name = "Rc", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!jc", name = "Sc", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!jc", name = "Tc", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!jc", name = "Uc", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!jc", name = "Wc", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!jc", name = "Xc", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!jc", name = "Yc", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!jc", name = "Vc", descriptor = "Lmt;")
    public class626 field8478;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        if (arg0 != -1) {
            method3372(true, (byte) -59, 41, -21);
        }
        ++field8468;
        return false;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
    public static final String method3372(boolean arg0, byte arg1, int arg2, int arg3) {
        ++field8467;
        if (arg3 >= 2 && arg3 <= 36) {
            if (arg0 && ~arg2 <= -1) {
                int var4 = 2;
                int var5 = arg2 / arg3;
                while (var5 != 0) {
                    var5 /= arg3;
                    ++var4;
                }
                char[] var6 = new char[var4];
                if (arg1 >= -108) {
                    method3376(true);
                }
                var6[0] = '+';
                for (int var7 = var4 + -1; var7 > 0; --var7) {
                    int var8 = arg2;
                    arg2 /= arg3;
                    int var9 = var8 - arg2 * arg3;
                    if (var9 >= 10) {
                        var6[var7] = (char) (var9 + 87);
                    } else {
                        var6[var7] = (char) (var9 + 48);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg2, arg3);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/util/Random;ZI)I")
    public static final int method3373(Random arg0, boolean arg1, int arg2) {
        ++field8471;
        if (~arg2 >= -1) {
            throw new IllegalArgumentException();
        } else if (class506.method2832(arg2, 3)) {
            return (int) (((long) arg0.nextInt() & 4294967295L) * (long) arg2 >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg2)) + Integer.MIN_VALUE;
            if (!arg1) {
                field8458 = -117;
            }
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class111.method604(0, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(ILqa;)Lud;")
    public final class119 method58(int arg0, class167 arg1) {
        int var3 = -102 / ((arg0 - 4) / 47);
        ++field8459;
        return null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILmt;)V")
    public final void method3374(int arg0, class626 arg1) {
        ++field8463;
        this.field8478 = arg1;
        if (super.field422 != null) {
            super.field422.method1855();
        }
        int var3 = 93 % ((arg0 - -17) / 46);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLqa;)Lqba;")
    public final class541 method59(byte arg0, class167 arg1) {
        ++field8469;
        if (this.field8478 != null && this.method3379(2048, arg1, (byte) -108)) {
            class105 var3 = arg1.method964();
            int var4 = super.field338.method160(true);
            var3.method359(var4);
            var3.method365(super.field6362, super.field6366 + -20, super.field6368);
            class362 var5 = this.method144((byte) 21);
            class626 var6 = this.field8478.field9085 == null ? this.field8478 : this.field8478.method3607(false, class257.field3191);
            if (class501.field6954.field7876 && var6.field9117 && var5.field5057) {
                class320 var7 = super.field368 != -1 && ~super.field391 == -1 ? class609.field8754.method535(super.field368, true) : null;
                class320 var8 = ~super.field350 == 0 || super.field398 && var7 != null ? null : class609.field8754.method535(super.field350, true);
                int var9 = 0;
                if (super.field379 != 0) {
                    var9 = this.method132(111);
                }
                class521 var10 = class277.method1717(var8 != null ? var8 : var7, var4, arg1, var8 != null ? super.field354 : super.field376, this.field8478.field9094, this.field8478.field9077 & 65535, super.field408, 9, 65535 & this.field8478.field9125, 255 & this.field8478.field9098, var9, 255 & this.field8478.field9113, super.field360, super.field393, super.field416[0]);
                if (var10 != null) {
                    arg1.method983(false);
                    var10.method1595(var3, (class378) null, 0);
                    arg1.method983(true);
                }
            }
            var3.method359(var4);
            var3.method365(super.field6362, super.field6366 + -5, super.field6368);
            class541 var11 = null;
            if (this.method3381(-27871)) {
                var11 = class296.method1818(16711680, super.field416.length);
            }
            if (super.field422 == null) {
                arg1.method202(super.field416, var3, var11 == null ? null : var11.field7564, 0);
            } else {
                class174 var12 = super.field422.method1864();
                arg1.method193(super.field416, var12, var3, var11 != null ? var11.field7564 : null, 0);
            }
            this.method128(false, super.field416, arg1, 0);
            super.field386 = class227.field2903;
            int var13 = 58 % ((-30 - arg0) / 63);
            super.field416[0] = super.field416[1] = super.field416[2] = super.field416[3] = null;
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(Z)I")
    public final int method141(boolean arg0) {
        ++field8476;
        if (this.field8478.field9085 != null) {
            class626 var2 = this.field8478.method3607(false, class257.field3191);
            if (var2 != null && ~var2.field9107 != 0) {
                return var2.field9107;
            }
        }
        if (!arg0) {
            this.field8478 = null;
        }
        return this.field8478.field9107 == -1 ? super.method141(true) : this.field8478.field9107;
    }

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "(I)Z")
    public final boolean method3375(int arg0) {
        int var2 = 50 / ((-29 - arg0) / 38);
        ++field8465;
        return this.field8478 != null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILqa;IZLlb;)V")
    public final void method54(int arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5, class239 arg6) {
        if (arg1 < 67) {
            this.field8478 = null;
        }
        ++field8480;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
    public final void method56(byte arg0) {
        ++field8456;
        if (arg0 == 52) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(Z)Z")
    public static final boolean method3376(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field8460;
            return class463.field6597 != 0 ? true : class115.field1466.method2089((byte) -57);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public final void method3377(int arg0, int arg1, int arg2) {
        ++field8475;
        int var4 = super.field419[0];
        int var5 = super.field417[0];
        if (arg0 == 0) {
            ++var5;
        }
        if (arg2 == 12967) {
            if (arg0 == 1) {
                ++var4;
                ++var5;
            }
            if (arg0 == 2) {
                ++var4;
            }
            if (~arg0 == -4) {
                ++var4;
                --var5;
            }
            if (arg0 == 4) {
                --var5;
            }
            if (arg0 == 5) {
                --var4;
                --var5;
            }
            if (arg0 == 6) {
                --var4;
            }
            if (~arg0 == -8) {
                ++var5;
                --var4;
            }
            if (super.field368 != -1 && class609.field8754.method535(super.field368, true).field4408 == 1) {
                super.field368 = -1;
            }
            if (super.field380 != -1) {
                class628 var6 = class410.field5636.method348(6410, super.field380);
                if (var6.field9162 && var6.field9152 != -1 && ~class609.field8754.method535(var6.field9152, true).field4408 == -2) {
                    super.field380 = -1;
                }
            }
            if (super.field357 != -1) {
                class628 var7 = class410.field5636.method348(arg2 ^ 11181, super.field357);
                if (var7.field9162 && var7.field9152 != -1 && class609.field8754.method535(var7.field9152, true).field4408 == 1) {
                    super.field357 = -1;
                }
            }
            if (super.field421 < 9) {
                ++super.field421;
            }
            for (int var8 = super.field421; ~var8 < -1; --var8) {
                super.field419[var8] = super.field419[var8 + -1];
                super.field417[var8] = super.field417[var8 + -1];
                super.field418[var8] = super.field418[var8 + -1];
            }
            super.field419[0] = var4;
            super.field418[0] = (byte) arg1;
            super.field417[0] = var5;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)I")
    public final int method103(byte arg0) {
        ++field8472;
        if (arg0 > -98) {
            this.method63(-41, 117, (class167) null, -45);
        }
        return super.field390;
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)V")
    public static void method3378(byte arg0) {
        field8466 = null;
        int var1 = -8 % ((14 - arg0) / 50);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method63(int arg0, int arg1, class167 arg2, int arg3) {
        ++field8473;
        if (this.field8478 != null && this.method3379(131072, arg2, (byte) -115)) {
            class105 var5 = arg2.method964();
            int var6 = super.field338.method160(true);
            if (arg3 >= -35) {
                this.field8478 = null;
            }
            var5.method359(var6);
            var5.method365(super.field6362, super.field6366, super.field6368);
            boolean var7 = false;
            for (int var8 = 0; ~var8 > ~super.field416.length; ++var8) {
                if (super.field416[var8] != null && super.field416[var8].method1598(arg0, arg1, var5, ~this.field8478.field9094 == -2)) {
                    var7 = true;
                    break;
                }
            }
            super.field416[0] = super.field416[1] = super.field416[2] = super.field416[3] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
    public final int method113(int arg0) {
        ++field8479;
        if (this.field8478.field9085 != null) {
            class626 var2 = this.field8478.method3607(false, class257.field3191);
            if (var2 != null && ~var2.field9089 != 0) {
                return var2.field9089;
            }
        }
        int var3 = -122 / ((arg0 - -75) / 45);
        return this.field8478.field9089;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILqa;B)Z")
    private final boolean method3379(int arg0, class167 arg1, byte arg2) {
        ++field8481;
        int var4 = arg0;
        class362 var5 = this.method144((byte) 126);
        int var6 = -110 / ((arg2 - 25) / 52);
        class320 var7 = ~super.field368 != 0 && ~super.field391 == -1 ? class609.field8754.method535(super.field368, true) : null;
        class320 var8 = ~super.field350 == 0 || super.field398 && var7 != null ? null : class609.field8754.method535(super.field350, true);
        int var9 = var5.field5071;
        int var10 = var5.field5040;
        if (~var9 != -1 || var10 != 0 || var5.field5055 != 0 || ~var5.field5043 != -1) {
            arg0 |= 7;
        }
        boolean var11 = super.field362 != 0 && class7.field61 >= super.field323 && super.field402 > class7.field61;
        if (var11) {
            arg0 |= 524288;
        }
        class521 var12 = super.field416[0] = this.field8478.method3608(super.field325, super.field354, class609.field8754, class257.field3191, arg1, super.field376, var7, var8, super.field328, true, super.field356, arg0, super.field359, class217.field2772, super.field378);
        if (var12 == null) {
            return false;
        } else {
            super.field390 = var12.method1579();
            this.method129(false, var12);
            int var13 = super.field338.method160(true);
            if (var9 == 0 && var10 == 0) {
                this.method142(0, -122, this.method104((byte) -92) << 9, var13, this.method104((byte) -92) << 9, 0);
            } else {
                this.method142(var5.field5037, -67, var9, var13, var10, var5.field5051);
                if (~super.field360 != -1) {
                    super.field416[0].method1580(super.field360);
                }
                if (~super.field393 != -1) {
                    super.field416[0].method1574(super.field393);
                }
                if (super.field408 != 0) {
                    super.field416[0].method1602(0, super.field408, 0);
                }
            }
            if (var11) {
                var12.method1578(super.field322, super.field406, super.field371, super.field362 & 255);
            }
            if (~super.field380 != 0 && ~super.field411 != 0) {
                class628 var14 = class410.field5636.method348(6410, super.field380);
                boolean var15 = var14.field9163 == 3 && (~var9 != -1 || ~var10 != -1);
                int var16 = var4;
                if (var15) {
                    var16 = var4 | 7;
                } else {
                    if (super.field349 != 0) {
                        var16 = var4 | 5;
                    }
                    if (~super.field374 != -1) {
                        var16 |= 2;
                    }
                }
                class521 var17 = super.field416[1] = var14.method3633(-17697, super.field387, var16, super.field411, arg1, super.field324, class609.field8754);
                if (var17 != null) {
                    if (super.field374 != 0) {
                        var17.method1602(0, -super.field374 << 2, 0);
                    }
                    if (~super.field349 != -1) {
                        var17.method1567(super.field349 * 2048);
                    }
                    if (var15) {
                        if (super.field360 != 0) {
                            var17.method1580(super.field360);
                        }
                        if (~super.field393 != -1) {
                            var17.method1574(super.field393);
                        }
                        if (~super.field408 != -1) {
                            var17.method1602(0, super.field408, 0);
                        }
                    }
                }
            } else {
                super.field416[1] = null;
            }
            if (super.field357 != -1 && ~super.field352 != 0) {
                class628 var18 = class410.field5636.method348(6410, super.field357);
                boolean var19 = var18.field9163 == 3 && (var9 != 0 || ~var10 != -1);
                int var20 = var4;
                if (var19) {
                    var20 = var4 | 7;
                } else {
                    if (super.field329 != 0) {
                        var20 = var4 | 5;
                    }
                    if (~super.field320 != -1) {
                        var20 |= 2;
                    }
                }
                class521 var21 = super.field416[3] = var18.method3638(true, super.field403, super.field352, class609.field8754, arg1, super.field358, var20);
                if (var21 != null) {
                    if (super.field320 != 0) {
                        var21.method1602(0, -super.field320 << 2, 0);
                    }
                    if (~super.field329 != -1) {
                        var21.method1567(super.field329 * 2048);
                    }
                    if (var19) {
                        if (super.field360 != 0) {
                            var21.method1580(super.field360);
                        }
                        if (~super.field393 != -1) {
                            var21.method1574(super.field393);
                        }
                        if (~super.field408 != -1) {
                            var21.method1602(0, super.field408, 0);
                        }
                    }
                }
            } else {
                super.field416[3] = null;
            }
            super.field416[2] = null;
            if (super.field423 != null) {
                if (super.field423.field2550 > class7.field61) {
                    if (~super.field423.field2544 >= ~class7.field61) {
                        class521 var22 = super.field423.method1257(var4 | 7, arg1, 3);
                        if (var22 != null) {
                            var22.method1602(super.field423.field2541 - super.field6362, -super.field6366 + super.field423.field2551 + 5, -super.field6368 + super.field423.field2553);
                            if (var13 != 0) {
                                var22.method1567(var13);
                            }
                            super.field416[2] = var22;
                        }
                    }
                } else {
                    super.field423 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZII)V")
    public final void method3380(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        super.field6358 = (byte) arg5;
        ++field8474;
        if (~super.field368 != 0 && class609.field8754.method535(super.field368, true).field4408 == 1) {
            super.field368 = -1;
        }
        if (super.field380 != -1) {
            class628 var7 = class410.field5636.method348(arg2 ^ 6410, super.field380);
            if (var7.field9162 && ~var7.field9152 != 0 && ~class609.field8754.method535(var7.field9152, true).field4408 == -2) {
                super.field380 = -1;
            }
        }
        if (super.field357 != -1) {
            class628 var8 = class410.field5636.method348(arg2 ^ 6410, super.field357);
            if (var8.field9162 && ~var8.field9152 != 0 && ~class609.field8754.method535(var8.field9152, true).field4408 == -2) {
                super.field357 = -1;
            }
        }
        if (!arg3) {
            int var9 = -super.field419[0] + arg0;
            int var10 = arg1 - super.field417[0];
            if (var9 >= -8 && ~var9 >= -9 && var10 >= -8 && ~var10 >= -9) {
                if (super.field421 < 9) {
                    ++super.field421;
                }
                for (int var11 = super.field421; ~var11 < -1; --var11) {
                    super.field419[var11] = super.field419[var11 + -1];
                    super.field417[var11] = super.field417[var11 + -1];
                    super.field418[var11] = super.field418[var11 + -1];
                }
                super.field419[0] = arg0;
                super.field417[0] = arg1;
                super.field418[0] = 1;
                return;
            }
        }
        super.field424 = 0;
        super.field420 = 0;
        super.field421 = arg2;
        super.field419[0] = arg0;
        super.field417[0] = arg1;
        super.field6362 = (super.field419[0] << 9) + (arg4 << 8);
        super.field6368 = (super.field417[0] << 9) + (arg4 << 8);
        if (super.field422 != null) {
            super.field422.method1855();
        }
    }

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "(I)Z")
    private final boolean method3381(int arg0) {
        if (arg0 != -27871) {
            this.field8461 = 58;
        }
        ++field8462;
        return this.field8478.field9078;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I")
    public final int method112(byte arg0) {
        ++field8470;
        if (this.field8478.field9085 != null) {
            class626 var2 = this.field8478.method3607(false, class257.field3191);
            if (var2 != null && ~var2.field9111 != 0) {
                return var2.field9111;
            }
        }
        if (arg0 != 93) {
            field8464 = 64;
        }
        return this.field8478.field9111;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Lqa;I)V")
    public final void method66(class167 arg0, int arg1) {
        ++field8477;
        if (this.field8478 != null) {
            if (super.field425 || this.method3379(0, arg0, (byte) -61)) {
                this.method128(super.field425, super.field416, arg0, 0);
                super.field416[arg1] = super.field416[1] = super.field416[2] = super.field416[3] = null;
            }
        }
    }
}
