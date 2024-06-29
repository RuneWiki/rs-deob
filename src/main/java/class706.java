import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class706 extends class492 implements class281 {

    @OriginalMember(owner = "client!ki", name = "mb", descriptor = "B")
    private byte field9957;

    @OriginalMember(owner = "client!ki", name = "fb", descriptor = "Z")
    private boolean field9950;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "B")
    private byte field9943;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "Z")
    private boolean field9928;

    @OriginalMember(owner = "client!ki", name = "ib", descriptor = "Z")
    private boolean field9953;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "S")
    private short field9939;

    @OriginalMember(owner = "client!ki", name = "ob", descriptor = "Z")
    private boolean field9959;

    @OriginalMember(owner = "client!ki", name = "kb", descriptor = "Lr;")
    private class182 field9955;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "Lka;")
    public class470 field9941;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
    public static int field9931;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    public static int field9932;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
    public static int field9933;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
    public static int field9936;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "I")
    public static int field9937;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    public static int field9938;

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "I")
    public static int field9940;

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "I")
    public static int field9942;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    public static int field9944;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "I")
    public static int field9945;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "I")
    public static int field9946;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "I")
    public static int field9947;

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "I")
    public static int field9948;

    @OriginalMember(owner = "client!ki", name = "eb", descriptor = "I")
    public static int field9949;

    @OriginalMember(owner = "client!ki", name = "gb", descriptor = "I")
    public static int field9951;

    @OriginalMember(owner = "client!ki", name = "jb", descriptor = "I")
    public static int field9954;

    @OriginalMember(owner = "client!ki", name = "lb", descriptor = "I")
    public static int field9956;

    @OriginalMember(owner = "client!ki", name = "nb", descriptor = "I")
    public static int field9958;

    @OriginalMember(owner = "client!ki", name = "pb", descriptor = "I")
    public static int field9960;

    @OriginalMember(owner = "client!ki", name = "qb", descriptor = "I")
    public static int field9961;

    @OriginalMember(owner = "client!ki", name = "hb", descriptor = "Llca;")
    private class642 field9952;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "(I)Z")
    public final boolean method991(int arg0) {
        ++field9933;
        int var2 = 46 % ((65 - arg0) / 48);
        return this.field9953;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(ILha;)Llca;")
    public final class642 method983(int arg0, class58 arg1) {
        ++field9958;
        if (arg0 != 0) {
            this.method1243((byte) -124);
        }
        if (this.field9952 == null) {
            this.field9952 = class191.method1161(super.field4629, this.method3955(-1, 0, arg1), super.field4635, super.field4627, 4371);
        }
        return this.field9952;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILha;)Lka;")
    private final class470 method3955(int arg0, int arg1, class58 arg2) {
        ++field9935;
        if (arg0 != -1) {
            this.field9939 = 36;
        }
        if (this.field9941 != null && ~arg2.method418(this.field9941.method213(), arg1) == -1) {
            return this.field9941;
        } else {
            class42 var4 = this.method3958(arg2, false, false, arg1);
            return var4 != null ? var4.field475 : null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(Z)I")
    public final int method992(boolean arg0) {
        ++field9961;
        if (arg0) {
            return -70;
        } else {
            return this.field9941 != null ? this.field9941.method217() : 0;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public final void method982(int arg0) {
        ++field9927;
        if (arg0 == 2) {
            this.field9953 = false;
            if (this.field9941 != null) {
                this.field9941.method207(this.field9941.method213() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILha;)V")
    public final void method1244(int arg0, class58 arg1) {
        ++field9934;
        Object var3 = null;
        if (arg0 != 17513) {
            this.method995(-72, 77, (class58) null, 39);
        }
        class182 var5;
        if (this.field9955 == null && this.field9959) {
            class42 var4 = this.method3958(arg1, false, true, 262144);
            var5 = var4 == null ? null : var4.field474;
        } else {
            var5 = this.field9955;
            this.field9955 = null;
        }
        if (var5 != null) {
            class663.method3772(var5, super.field4633, super.field4635, super.field4629, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)I")
    public final int method1241(byte arg0) {
        if (arg0 != 99) {
            this.field9952 = null;
        }
        ++field9951;
        return 65535 & this.field9939;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lha;B)V")
    public final void method1238(class58 arg0, byte arg1) {
        ++field9945;
        Object var3 = null;
        class182 var5;
        if (this.field9955 == null && this.field9959) {
            class42 var4 = this.method3958(arg0, false, true, 262144);
            var5 = var4 != null ? var4.field474 : null;
        } else {
            var5 = this.field9955;
            this.field9955 = null;
        }
        if (arg1 >= -15) {
            this.field9959 = false;
        }
        if (var5 != null) {
            class158.method979(var5, super.field4633, super.field4635, super.field4629, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lm;ILaia;Lha;)V")
    public static final void method3956(class191 arg0, int arg1, class228 arg2, class58 arg3) {
        ++field9960;
        class131 var4 = arg2.method1322(-19, arg3);
        if (var4 != null) {
            int var5 = var4.method503();
            if (var4.method509() > var5) {
                var5 = var4.method509();
            }
            byte var6 = 10;
            int var7 = arg0.field2250;
            int var8 = arg0.field2253;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg2.field2646 != null) {
                var9 = class47.field511.method3142(class747.field10416, arg2.field2646, (int[]) null, (class131[]) null, 72);
                for (int var12 = 0; var12 < var9; ++var12) {
                    String var13 = class747.field10416[var12];
                    if (var9 + -1 > var12) {
                        var13 = var13.substring(0, var13.length() - 4);
                    }
                    int var14 = class107.field1126.method3149(var13);
                    if (~var10 > ~var14) {
                        var10 = var14;
                    }
                }
                var11 = class107.field1126.method3147() * var9 + class107.field1126.method3151() / 2;
            }
            int var15 = var5 / 2 + arg0.field2250;
            if (var7 < class656.field9387 + var5) {
                var7 = class656.field9387;
                var15 = var6 - (-(var10 / 2) - 5) + var5 / 2 + class656.field9387;
            } else if (~var7 < ~(-var5 + class656.field9389)) {
                var7 = -var5 + class656.field9389;
                var15 = -(var10 / 2) + -var6 + class656.field9389 + -(var5 / 2) + -5;
            }
            int var16 = arg0.field2253;
            if (var8 < class656.field9384 - -var5) {
                var8 = class656.field9384;
                var16 = var5 / 2 + (class656.field9384 - -var6);
            } else if (var8 > -var5 + class656.field9385) {
                var8 = -var5 + class656.field9385;
                var16 = -(var5 / 2) + class656.field9385 - (var6 + var11);
            }
            int var17 = 65535 & (int) (32767.0D * (Math.atan2((double) (-arg0.field2250 + var7), (double) (var8 - arg0.field2253)) / 3.141592653589793D));
            var4.method821((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            if (arg1 == 3) {
                int var18 = -2;
                int var19 = -2;
                int var20 = -2;
                int var21 = -2;
                if (arg2.field2646 != null) {
                    var19 = var16;
                    var18 = var15 - (var10 / 2 + 5);
                    var20 = var10 + var18 + 10;
                    var21 = 3 + var9 * class107.field1126.method3147() + var16;
                    if (arg2.field2636 != 0) {
                        arg3.method410(arg2.field2636, var18, -var16 + var21, -69, var16, var20 - var18);
                    }
                    if (~arg2.field2618 != -1) {
                        arg3.method371(var18, var16, arg2.field2618, -var16 + var21, 1, var20 - var18);
                    }
                    for (int var22 = 0; var9 > var22; ++var22) {
                        String var23 = class747.field10416[var22];
                        if (~var22 > ~(var9 - 1)) {
                            var23 = var23.substring(0, var23.length() + -4);
                        }
                        class107.field1126.method3146(arg3, var23, var15, var16, arg2.field2631, true);
                        var16 += class107.field1126.method3147();
                    }
                }
                if (~arg2.field2605 != 0 || arg2.field2646 != null) {
                    class385 var24 = new class385(arg0);
                    int var25 = var5 >> 1;
                    var24.field5356 = var21;
                    var24.field5357 = var19;
                    var24.field5364 = var20;
                    var24.field5367 = var18;
                    var24.field5360 = -var25 + var8;
                    var24.field5358 = var7 - -var25;
                    var24.field5363 = -var25 + var7;
                    var24.field5359 = var8 - -var25;
                    class685.field9680.method1721((byte) -118, var24);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLha;Lrr;IIII)V")
    public final void method987(boolean arg0, class58 arg1, class361 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!(arg2 instanceof class706)) {
            if (arg2 instanceof class578) {
                class578 var8 = (class578) arg2;
                if (this.field9941 != null && var8.field8177 != null) {
                    this.field9941.method230(var8.field8177, arg4, arg6, arg5, arg0);
                }
            }
        } else {
            class706 var9 = (class706) arg2;
            if (this.field9941 != null && var9.field9941 != null) {
                this.field9941.method230(var9.field9941, arg4, arg6, arg5, arg0);
            }
        }
        ++field9948;
        if (arg3 != 0) {
            this.field9959 = false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIZI)V")
    public static final void method3957(int arg0, int arg1, boolean arg2, int arg3) {
        ++field9937;
        class47 var4 = class258.method1546(9, arg3, (byte) 121);
        var4.method271((byte) 123);
        if (arg2) {
            var4.field507 = arg0;
            var4.field514 = arg1;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)Z")
    public final boolean method1239(boolean arg0) {
        ++field9930;
        return !arg0 ? false : this.field9959;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLha;)Llba;")
    public final class547 method994(byte arg0, class58 arg1) {
        ++field9947;
        if (this.field9941 == null) {
            return null;
        } else {
            if (arg0 != -112) {
                this.field9950 = true;
            }
            class165 var3 = arg1.method422();
            var3.method1019(super.field4635, super.field4627, super.field4629);
            class547 var4 = class652.method3702(this.field9928, -9477, 1);
            if (class626.field8994) {
                this.field9941.method188(var3, var4.field7870[0], class586.field8268, 0);
            } else {
                this.field9941.method228(var3, var4.field7870[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
    public final void method1237(byte arg0) {
        if (arg0 > -68) {
            this.field9952 = null;
        }
        if (this.field9941 != null) {
            this.field9941.method223();
        }
        ++field9932;
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)Z")
    public final boolean method989(int arg0) {
        if (arg0 >= -112) {
            method3959((byte) 112, -54, 33, 35, 58);
        }
        ++field9946;
        return this.field9941 == null ? false : this.field9941.method197();
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)I")
    public final int method1236(byte arg0) {
        if (arg0 != -78) {
            return 34;
        } else {
            ++field9936;
            return this.field9957;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)Z")
    public final boolean method986(int arg0) {
        int var2 = -27 % ((arg0 - -50) / 60);
        ++field9954;
        if (this.field9941 != null) {
            return !this.field9941.method202();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lha;I)V")
    public final void method990(class58 arg0, int arg1) {
        int var3 = 55 % ((-2 - arg1) / 62);
        ++field9938;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lha;ZZI)Lbt;")
    private final class42 method3958(class58 arg0, boolean arg1, boolean arg2, int arg3) {
        if (arg1) {
            return null;
        } else {
            ++field9929;
            class316 var5 = class445.field6442.method3972((byte) 109, this.field9939 & 65535);
            class278 var6;
            class278 var7;
            if (this.field9950) {
                var6 = class159.field1758[super.field4633];
                var7 = class11.field88[0];
            } else {
                if (super.field4633 < 3) {
                    var7 = class11.field88[super.field4633 + 1];
                } else {
                    var7 = null;
                }
                var6 = class11.field88[super.field4633];
            }
            return var5.method1894(this.field9943, -47, arg3, var7, arg2, super.field4629, arg0, super.field4627, this.field9957, var6, super.field4635);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I")
    public final int method1243(byte arg0) {
        if (arg0 != 117) {
            return 40;
        } else {
            ++field9944;
            return this.field9943;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BIIII)V")
    public static final void method3959(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9940;
        if (arg0 < -45) {
            class338.field4355 = arg1;
            class744.field10385 = arg2;
            class578.field8182 = arg4;
            class224.field2571 = arg3;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method995(int arg0, int arg1, class58 arg2, int arg3) {
        ++field9931;
        class470 var5 = this.method3955(arg3, 131072, arg2);
        if (var5 != null) {
            class165 var6 = arg2.method422();
            var6.method1019(super.field4635, super.field4627, super.field4629);
            return !class626.field8994 ? var5.method227(arg0, arg1, var6, false, 0) : var5.method191(arg0, arg1, var6, false, 0, class586.field8268);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lha;Lvc;IIIIIZIIZ)V")
    public class706(class58 arg0, class316 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class302.method1808((byte) 51, arg8, arg9));
        super.field4629 = arg6;
        this.field9957 = (byte) arg8;
        this.field9950 = arg7;
        this.field9943 = (byte) arg9;
        super.field4635 = arg4;
        this.field9928 = arg1.field4001 != 0 && !arg7;
        this.field9953 = arg10;
        this.field9939 = (short) arg1.field3962;
        this.field9959 = arg0.method376() && arg1.field4029 && !this.field9950 && ~class654.field9334.field9856.method2185(-121) != -1;
        int var12 = 2048;
        if (this.field9953) {
            var12 |= 65536;
        }
        class42 var13 = this.method3958(arg0, false, this.field9959, var12);
        if (var13 != null) {
            this.field9955 = var13.field474;
            this.field9941 = var13.field475;
            if (this.field9953) {
                this.field9941 = this.field9941.method237((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)I")
    public final int method985(int arg0) {
        ++field9942;
        if (arg0 != 4) {
            this.field9952 = null;
        }
        return this.field9941 != null ? this.field9941.method190() : 0;
    }
}
