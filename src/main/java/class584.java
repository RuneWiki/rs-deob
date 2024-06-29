import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class584 extends class577 implements class231 {

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "Lel;")
    public class469 field8579;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "Z")
    private boolean field8587;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field8574 = 0;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "Z")
    public static boolean field8571 = false;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "Lh;")
    public static class572 field8581 = new class572("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field8573;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field8584;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field8585;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field8586;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "Lqba;")
    public static class345 field8576;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "Lpl;")
    private class558 field8580;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "[I")
    public static int[] field8591;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILqa;IB)Z", line = 4)
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        ++field8588;
        if (arg3 < 44) {
            return true;
        } else {
            class159 var5 = this.field8579.method2828((byte) 54, false, super.field8500, super.field8496, arg1, 131072, false);
            if (var5 == null) {
                return false;
            } else {
                class165 var6 = arg1.method428();
                var6.method353(super.field8496, super.field8502, super.field8500);
                return var5.method72(arg2, arg0, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLqa;)V", line = 25)
    public final void method174(byte arg0, class208 arg1) {
        this.field8579.method2836(arg1, -108);
        ++field8582;
        if (arg0 > -36) {
            this.method173((byte) 65);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lqa;IZIILco;I)V", line = 37)
    public final void method182(class208 arg0, int arg1, boolean arg2, int arg3, int arg4, class102 arg5, int arg6) {
        ++field8575;
        if (arg6 != 21130) {
            this.method190((byte) -29, -16, (class208) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)I", line = 49)
    public final int method173(byte arg0) {
        ++field8578;
        int var2 = -116 / ((-43 - arg0) / 49);
        return this.field8579.field6628;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)Z", line = 59)
    public final boolean method192(byte arg0) {
        ++field8586;
        return arg0 != -41 ? true : this.field8579.method2831((byte) 116);
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)Z", line = 70)
    public final boolean method180(byte arg0) {
        if (arg0 != 58) {
            this.method179(-123);
        }
        ++field8577;
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(BLqa;)V", line = 86)
    public final void method178(byte arg0, class208 arg1) {
        this.field8579.method2834(arg1, -21701);
        ++field8584;
        if (arg0 != 115) {
            this.method189((class208) null, 60);
        }
    }

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "(I)V", line = 99)
    public static void method3480(int arg0) {
        field8591 = null;
        field8581 = null;
        if (arg0 != 1) {
            method3480(-128);
        }
        field8576 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILqa;)V", line = 111)
    public final void method194(int arg0, class208 arg1) {
        if (arg0 == 0) {
            ++field8583;
            class159 var3 = this.field8579.method2828((byte) 47, true, super.field8500, super.field8496, arg1, 262144, true);
            if (var3 != null) {
                this.field8579.method2829(super.field8509, false, arg1, super.field8499, (byte) 80, var3, super.field8508, super.field8504);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)I", line = 127)
    public final int method183(int arg0) {
        if (arg0 != -19248) {
            return 108;
        } else {
            ++field8585;
            return this.field8579.field6615;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(ILqa;)Lin;", line = 138)
    public final class77 method181(int arg0, class208 arg1) {
        ++field8592;
        class159 var3 = this.field8579.method2828((byte) 29, false, super.field8500, super.field8496, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class165 var4 = arg1.method428();
            var4.method353(super.field8496, super.field8502, super.field8500);
            class77 var5 = null;
            if (arg0 < 0) {
                this.method194(96, (class208) null);
            }
            if (this.field8587) {
                var5 = class450.method2725(1, 26728);
            }
            if (this.field8579.field6607 != null) {
                class283 var6 = this.field8579.field6607.method1356();
                arg1.method511(var3, var6, var4, var5 != null ? var5.field1022[0] : null, 0);
            } else {
                var3.method93(var4, var5 != null ? var5.field1022[0] : null, 0);
            }
            if (this.field8580 != null) {
                class319.method1931(this.field8580, super.field8500, super.field8496, -126, var3, super.field8502);
            } else {
                this.field8580 = class115.method826(var3, super.field8496, 21979, super.field8500, super.field8502);
            }
            this.field8579.method2829(super.field8509, true, arg1, super.field8499, (byte) 44, var3, super.field8508, super.field8504);
            return var5;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lqa;Luh;IIIIIZIIIIIII)V", line = 180)
    public class584(class208 arg0, class145 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field2038 == 1, class244.method1546(arg12, arg13, (byte) 72));
        this.field8579 = new class469(arg0, arg1, arg12, arg13, super.field8501, arg3, arg4, arg6, arg7, arg14);
        this.field8587 = ~arg1.field2056 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BILqa;)Lr;", line = 193)
    public final class159 method190(byte arg0, int arg1, class208 arg2) {
        if (arg0 < 40) {
            return null;
        } else {
            ++field8589;
            return this.field8579.method2828((byte) 90, false, 0, 0, arg2, arg1, false);
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)I", line = 205)
    public final int method177(byte arg0) {
        if (arg0 != 40) {
            this.method180((byte) -116);
        }
        ++field8573;
        return this.field8579.method2826((byte) -105);
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V", line = 218)
    public final void method179(int arg0) {
        ++field8572;
        if (arg0 != 1) {
            this.method177((byte) 65);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lqa;I)Lpl;", line = 236)
    public final class558 method189(class208 arg0, int arg1) {
        if (arg1 != 31733) {
            this.method172(88);
        }
        ++field8593;
        return this.field8580;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V", line = 253)
    public final void method172(int arg0) {
        ++field8590;
        if (arg0 < 95) {
            this.method170(115);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)I", line = 263)
    public final int method170(int arg0) {
        if (arg0 >= -120) {
            this.method178((byte) -1, (class208) null);
        }
        ++field8570;
        return this.field8579.field6595;
    }
}
