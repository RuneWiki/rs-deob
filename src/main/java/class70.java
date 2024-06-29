import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class70 extends class404 implements class147 {

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "S")
    private short field953;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "Z")
    private boolean field960;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "B")
    private byte field943;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "B")
    private byte field966;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "B")
    private byte field952;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "Z")
    private boolean field954;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "Z")
    private boolean field964;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "Lw;")
    private class271 field962;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "Lba;")
    private class352 field945;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field946 = 999999;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!kl", name = "U", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!kl", name = "V", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "Lac;")
    private class496 field963;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I")
    public final int method554(int arg0) {
        if (arg0 != -18971) {
            this.method574((class638) null, 26, -128);
        }
        ++field951;
        return this.field953 & 65535;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)I")
    public final int method549(int arg0) {
        ++field948;
        if (arg0 != 12352) {
            this.field962 = null;
        }
        return this.field966;
    }

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "(I)V")
    public static final void method572(int arg0) {
        if (arg0 != 16912) {
            method573(1.202119F, 30, -1.427741F, 1.2603697F);
        }
        if (~class340.field4947 == -4) {
            class94.method690(4, (byte) 125);
        } else if (class340.field4947 == 7) {
            class94.method690(8, (byte) 125);
        } else if (class340.field4947 == 10) {
            class94.method690(11, (byte) 125);
        }
        ++field947;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(FIFF)I")
    public static final int method573(float arg0, int arg1, float arg2, float arg3) {
        ++field942;
        float var4 = !(arg2 < 0.0F) ? arg2 : -arg2;
        if (arg1 <= 63) {
            return 36;
        } else {
            float var5 = !(arg3 < 0.0F) ? arg3 : -arg3;
            float var6 = arg0 < 0.0F ? -arg0 : arg0;
            if (var5 > var4 && var6 < var5) {
                return !(arg3 > 0.0F) ? 1 : 0;
            } else if (var4 < var6 && var5 < var6) {
                return !(arg0 > 0.0F) ? 3 : 2;
            } else {
                return !(arg2 > 0.0F) ? 5 : 4;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Loa;II)Lba;")
    private final class352 method574(class638 arg0, int arg1, int arg2) {
        ++field959;
        if (arg2 != 5) {
            method572(-16);
        }
        if (this.field945 != null && arg0.method431(this.field945.method189(), arg1) == 0) {
            return this.field945;
        } else {
            class156 var4 = this.method576(arg0, false, (byte) 0, arg1);
            return var4 == null ? null : var4.field2355;
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)Z")
    public final boolean method562(int arg0) {
        ++field967;
        if (arg0 != 29008) {
            this.field953 = -33;
        }
        return this.field964;
    }

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)I")
    public final int method575(int arg0) {
        if (arg0 > -117) {
            this.field952 = -95;
        }
        ++field949;
        return this.field945 != null ? this.field945.method220() : 0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILoa;)Lba;")
    public final class352 method548(int arg0, int arg1, class638 arg2) {
        ++field961;
        if (arg0 != -585) {
            this.field954 = false;
        }
        return this.method574(arg2, arg1, 5);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Loa;ZBI)Lcda;")
    private final class156 method576(class638 arg0, boolean arg1, byte arg2, int arg3) {
        if (arg2 != 0) {
            return null;
        } else {
            ++field968;
            class620 var5 = class164.field2499.method2013(65535 & this.field953, false);
            class136 var6;
            class136 var7;
            if (this.field954) {
                var6 = class31.field369[0];
                var7 = class581.field8114[this.field943];
            } else {
                var7 = class31.field369[this.field943];
                if (this.field943 < 3) {
                    var6 = class31.field369[this.field943 + 1];
                } else {
                    var6 = null;
                }
            }
            return var5.method3458(arg3, var6, super.field5717, this.field966, var7, super.field5720, arg1, arg2 + 30, super.field5716, this.field952, arg0);
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
    public final void method550(int arg0) {
        if (arg0 <= -4) {
            if (this.field945 != null) {
                this.field945.method228();
            }
            ++field965;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLoa;)V")
    public final void method556(byte arg0, class638 arg1) {
        ++field950;
        Object var3 = null;
        class271 var5;
        if (this.field962 == null && this.field964) {
            class156 var4 = this.method576(arg1, true, (byte) 0, 262144);
            var5 = var4 != null ? var4.field2358 : null;
        } else {
            var5 = this.field962;
            this.field962 = null;
        }
        if (var5 != null) {
            class192.method1283(var5, this.field943, super.field5716, super.field5720, (boolean[]) null);
        }
        if (arg0 < 5) {
            this.method574((class638) null, 112, 64);
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Loa;Llt;IIIIZIIIII)V")
    public class70(class638 arg0, class620 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class380.method2202(29496, arg10, arg11));
        this.field953 = (short) arg1.field8621;
        this.field960 = ~arg1.field8592 != -1 && !arg6;
        this.field943 = (byte) arg2;
        super.field5716 = arg3;
        this.field966 = (byte) arg10;
        this.field952 = (byte) arg11;
        super.field5720 = arg5;
        this.field954 = arg6;
        this.field964 = arg0.method423() && arg1.field8563 && !this.field954 && ~class274.field3872.method543(class429.field6020, (byte) 20) != -1;
        class156 var13 = this.method576(arg0, this.field964, (byte) 0, 2048);
        if (var13 != null) {
            this.field962 = var13.field2358;
            this.field945 = var13.field2355;
        }
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)I")
    public final int method560(int arg0) {
        if (arg0 != 15654) {
            this.field943 = -110;
        }
        ++field944;
        return this.field952;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILoa;)Lwc;")
    public final class60 method555(int arg0, class638 arg1) {
        ++field941;
        if (this.field945 == null) {
            return null;
        } else {
            class391 var3 = arg1.method401();
            var3.method1288(super.field5716 - -super.field5715, super.field5717, super.field5720 + super.field5718);
            class60 var4 = null;
            if (this.field960) {
                var4 = class450.method2583(1, false);
            }
            this.field945.method205(var3, var4 != null ? var4.field818[0] : null, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(BLoa;)V")
    public final void method561(byte arg0, class638 arg1) {
        ++field955;
        Object var3 = null;
        class271 var5;
        if (this.field962 == null && this.field964) {
            class156 var4 = this.method576(arg1, true, (byte) 0, 262144);
            var5 = var4 != null ? var4.field2358 : null;
        } else {
            var5 = this.field962;
            this.field962 = null;
        }
        if (var5 != null) {
            class293.method1837(var5, this.field943, super.field5716, super.field5720, (boolean[]) null);
        }
        if (arg0 != 111) {
            this.method552(true, (class638) null);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        if (arg1 != -8003) {
            this.field943 = 102;
        }
        ++field958;
        class352 var5 = this.method574(arg2, 131072, 5);
        if (var5 != null) {
            class391 var6 = arg2.method401();
            var6.method1288(super.field5716, super.field5717, super.field5720);
            return var5.method237(arg0, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Loa;B)Lac;")
    public final class496 method551(class638 arg0, byte arg1) {
        if (this.field963 == null) {
            this.field963 = class687.method3783(super.field5716, super.field5717, this.method574(arg0, 0, 5), super.field5720, -97);
        }
        if (arg1 > -62) {
            this.method548(-113, 100, (class638) null);
        }
        ++field956;
        return this.field963;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZLoa;)V")
    public final void method552(boolean arg0, class638 arg1) {
        ++field957;
        if (!arg0) {
            this.field962 = null;
        }
    }
}
