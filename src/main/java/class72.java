import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class72 extends class207 {

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public static int field981 = 7000;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "Z")
    public static boolean field973 = false;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public static int field972 = field981;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "Z")
    public static boolean field979 = false;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "J")
    public static long field969;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(IB)I", line = 4)
    public final int method39(int arg0, byte arg1) {
        ++field976;
        if (arg1 != 69) {
            field981 = -122;
        }
        return 3;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)I", line = 26)
    public static final int method589(byte arg0) {
        ++field977;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class786.field10800.field3248 && !class786.field10800.field3233) {
            var1 = true;
            if (class706.field9663.field9953 < 512 && class706.field9663.field9953 != 0) {
                var1 = false;
            }
            if (!class248.field3232.startsWith("win")) {
                var2 = true;
            } else {
                var2 = true;
                var3 = true;
            }
        }
        if (class311.field4402) {
            var1 = false;
        }
        if (class468.field6608) {
            var3 = false;
        }
        if (class81.field1116) {
            var2 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class135.method947(127);
        } else {
            int var4 = -1;
            int var5 = -1;
            if (arg0 != 39) {
                method590(102, -19, 88);
            }
            if (var1) {
                try {
                    var4 = class400.method2437(1000, (byte) -87, 2);
                } catch (Exception var15) {
                }
            }
            int var6 = -1;
            if (var3) {
                try {
                    var6 = class400.method2437(1000, (byte) -87, 3);
                    if (~class125.field1721.field5141.method2541(43) == -4) {
                        class189 var7 = class375.field5490.method542();
                        long var8 = 281474976710655L & var7.field2462;
                        int var10 = var7.field2466;
                        if (~var10 != -4319) {
                            if (var10 == 4098) {
                                var2 &= ~var8 <= -60129613780L;
                            }
                        } else {
                            var2 &= var8 >= 64425238954L;
                        }
                    }
                } catch (Exception var14) {
                }
            }
            if (var2) {
                try {
                    var5 = class400.method2437(1000, (byte) -87, 1);
                } catch (Exception var13) {
                }
            }
            if (var4 == -1 && var5 == -1 && var6 == -1) {
                return class135.method947(124);
            } else {
                int var11 = (int) ((float) var5 * 1.1F);
                int var12 = (int) ((float) var6 * 1.1F);
                if (~var4 < ~var12 && ~var4 < ~var11) {
                    return class735.method4051(true, var4);
                } else {
                    return var12 <= var11 ? class409.method2458(1, -104, var11) : class409.method2458(3, -6, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IB)V", line = 196)
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        if (arg1 >= -7) {
            method590(7, 69, 32);
        }
        ++field970;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 207)
    public final void method37(int arg0) {
        int var2 = 89 % ((arg0 - -58) / 48);
        ++field980;
        super.field2669 = this.method36(-77);
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(ILrd;)V", line = 221)
    public class72(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)I", line = 224)
    public static final int method590(int arg0, int arg1, int arg2) {
        ++field971;
        if (arg1 != 17570) {
            return 37;
        } else {
            int var3 = arg2 >>> 31;
            return (arg2 + var3) / arg0 + -var3;
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)I", line = 237)
    public final int method36(int arg0) {
        ++field974;
        if (arg0 >= -14) {
            return 110;
        } else {
            return super.field2668.method2248(false) == class743.field10050 && super.field2668.method2254(41) ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)I", line = 265)
    public final int method591(int arg0) {
        if (arg0 != 43) {
            this.method36(117);
        }
        ++field978;
        return super.field2669;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lrd;)V", line = 279)
    public class72(class355 arg0) {
        super(arg0);
    }
}
