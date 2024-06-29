import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class164 extends class376 implements class185 {

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "Z")
    private boolean field2543;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "B")
    private byte field2544;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "B")
    private byte field2564;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "S")
    private short field2555;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "Z")
    private boolean field2538;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "Z")
    private boolean field2545;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "Z")
    private boolean field2547;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "Lh;")
    private class452 field2552;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "Lcd;")
    private class198 field2556;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    public static int field2559 = 20;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "Lbg;")
    public static class310 field2541 = new class310(54, 0);

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "Lok;")
    public static class160 field2542;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)I", line = 3)
    public final int method173(int arg0) {
        ++field2546;
        return arg0 != 1438 ? -73 : this.field2564;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLqq;)V", line = 17)
    public final void method176(boolean arg0, class318 arg1) {
        if (!arg0) {
            this.field2543 = true;
        }
        ++field2537;
        Object var3 = null;
        class452 var5;
        if (this.field2552 == null && this.field2547) {
            class78 var4 = this.method1040(true, 262144, (byte) 29, arg1);
            var5 = var4 != null ? var4.field1381 : null;
        } else {
            var5 = this.field2552;
            this.field2552 = null;
        }
        if (var5 != null) {
            class90.method668(var5, this.field2544, super.field5477, super.field5486, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V", line = 48)
    public final void method168(int arg0) {
        ++field2554;
        this.field2543 = false;
        int var2 = -29 % ((arg0 - -53) / 62);
        if (this.field2556 != null) {
            this.field2556.method504(-65537 & this.field2556.method489());
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(ZLqq;)V", line = 66)
    public final void method172(boolean arg0, class318 arg1) {
        ++field2553;
        if (arg0) {
            this.method176(false, (class318) null);
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 78)
    public final void method163(int arg0) {
        ++field2539;
        if (this.field2556 != null) {
            this.field2556.method503();
        }
        if (arg0 != 8793) {
            this.field2545 = true;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLqq;)Lkm;", line = 91)
    public final class227 method169(byte arg0, class318 arg1) {
        if (arg0 > -11) {
            this.method174((byte) -101);
        }
        ++field2558;
        if (this.field2556 == null) {
            return null;
        } else {
            class496 var3 = arg1.method1976();
            var3.method198(super.field5477, super.field5490, super.field5486);
            class227 var4 = null;
            if (this.field2545) {
                var4 = class145.method951(1, 0);
            }
            this.field2556.method461(var3, var4 != null ? var4.field3476[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)Z", line = 124)
    public final boolean method164(int arg0) {
        if (arg0 != 0) {
            this.field2552 = null;
        }
        ++field2549;
        return this.field2543;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILqq;)Lcd;", line = 135)
    private final class198 method1038(int arg0, int arg1, class318 arg2) {
        if (arg1 != 22016) {
            this.field2552 = null;
        }
        ++field2551;
        if (this.field2556 != null && arg2.method1944(this.field2556.method489(), arg0) == 0) {
            return this.field2556;
        } else {
            class78 var4 = this.method1040(false, arg0, (byte) 29, arg2);
            return var4 == null ? null : var4.field1385;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lqq;Lin;IIIIZIZ)V", line = 156)
    public class164(class318 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field917, arg1.field900);
        this.field2543 = arg8;
        this.field2544 = (byte) arg2;
        this.field2564 = (byte) arg7;
        super.field5477 = arg3;
        this.field2555 = (short) arg1.field958;
        super.field5486 = arg5;
        this.field2538 = arg6;
        this.field2545 = arg1.field895 != 0 && !arg6;
        this.field2547 = arg0.method1934() && arg1.field921 && !this.field2538 && ~class463.field7116.field2974 != -1;
        int var10 = 2048;
        if (this.field2543) {
            var10 |= 65536;
        }
        class78 var11 = this.method1040(this.field2547, var10, (byte) 29, arg0);
        if (var11 != null) {
            this.field2552 = var11.field1381;
            this.field2556 = var11.field1385;
            if (this.field2543) {
                this.field2556 = this.field2556.method511((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILqq;Lps;ZZII)V", line = 193)
    public final void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        if (arg2 instanceof class164) {
            class164 var8 = (class164) arg2;
            if (this.field2556 != null && var8.field2556 != null) {
                this.field2556.method474(var8.field2556, arg6, arg0, arg5, arg3);
            }
        }
        if (arg4) {
            ++field2540;
        }
    }

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "(I)V", line = 215)
    public static void method1039(int arg0) {
        field2541 = null;
        field2542 = null;
        if (arg0 != 12545) {
            field2541 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZIBLqq;)Ldi;", line = 231)
    private final class78 method1040(boolean arg0, int arg1, byte arg2, class318 arg3) {
        if (arg2 != 29) {
            this.field2547 = true;
        }
        ++field2563;
        class56 var5 = class128.field2070.method916((byte) -15, this.field2555 & 65535);
        class343 var6;
        class343 var7;
        if (this.field2538) {
            var6 = class201.field3195[0];
            var7 = class262.field3978[this.field2544];
        } else {
            if (this.field2544 < 3) {
                var6 = class201.field3195[this.field2544 + 1];
            } else {
                var6 = null;
            }
            var7 = class201.field3195[this.field2544];
        }
        return var5.method391(this.field2564, super.field5486, true, super.field5477, var6, super.field5490, arg1, 22, arg3, var7, arg0);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lqq;BII)Z", line = 261)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -44) {
            this.field2545 = false;
        }
        ++field2561;
        class198 var5 = this.method1038(131072, 22016, arg0);
        if (var5 != null) {
            class496 var6 = arg0.method1976();
            var6.method198(super.field5477, super.field5490, super.field5486);
            return var5.method495(arg2, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)I", line = 283)
    public final int method174(byte arg0) {
        ++field2548;
        if (arg0 <= 113) {
            this.method167((class318) null, false, 121);
        }
        return this.field2555 & 65535;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLuj;)V", line = 297)
    public static final void method1041(boolean arg0, class249 arg1) {
        ++field2565;
        if (!arg0) {
            for (class286 var2 = (class286) class414.field5999.method8((byte) -98); var2 != null; var2 = (class286) class414.field5999.method17((byte) 69)) {
                if (var2.field4341 == arg1) {
                    if (var2.field4325 != null) {
                        class178.field2786.method2099(var2.field4325);
                        var2.field4325 = null;
                    }
                    var2.method1121(false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I", line = 330)
    public final int method170(boolean arg0) {
        ++field2557;
        if (!arg0) {
            this.field2556 = null;
        }
        return 22;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lqq;ZI)Lcd;", line = 341)
    public final class198 method167(class318 arg0, boolean arg1, int arg2) {
        ++field2550;
        return arg1 ? null : this.method1038(arg2, 22016, arg0);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Z", line = 352)
    public final boolean method161(int arg0) {
        if (arg0 != 15275) {
            this.field2556 = null;
        }
        ++field2562;
        return this.field2547;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lqq;I)V", line = 367)
    public final void method171(class318 arg0, int arg1) {
        ++field2560;
        Object var3 = null;
        if (arg1 != 1577) {
            field2541 = null;
        }
        class452 var5;
        if (this.field2552 == null && this.field2547) {
            class78 var4 = this.method1040(true, 262144, (byte) 29, arg0);
            var5 = var4 != null ? var4.field1381 : null;
        } else {
            var5 = this.field2552;
            this.field2552 = null;
        }
        if (var5 != null) {
            class208.method1275(var5, this.field2544, super.field5477, super.field5486, (boolean[]) null);
        }
    }
}
