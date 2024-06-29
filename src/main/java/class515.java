import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class515 extends class215 implements class448 {

    @OriginalMember(owner = "client!bo", name = "X", descriptor = "Lpm;")
    public class415 field7501;

    @OriginalMember(owner = "client!bo", name = "K", descriptor = "Z")
    private boolean field7490;

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "F")
    public static float field7485 = 1.0F;

    @OriginalMember(owner = "client!bo", name = "Q", descriptor = "I")
    public static int field7495 = 0;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "Lao;")
    public static class191 field7482 = new class191(69, 6);

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!bo", name = "G", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!bo", name = "I", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!bo", name = "M", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!bo", name = "O", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!bo", name = "R", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!bo", name = "T", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!bo", name = "U", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!bo", name = "V", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!bo", name = "W", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBLza;)Le;", line = 3)
    public final class373 method39(int arg0, byte arg1, class287 arg2) {
        ++field7496;
        return arg1 != -54 ? null : this.field7501.method2544(0, 0, arg2, false, (byte) 6, false, arg0);
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(B)V", line = 15)
    public final void method42(byte arg0) {
        if (arg0 == 92) {
            ++field7491;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 27)
    public final void method45(int arg0) {
        ++field7499;
        if (arg0 != 9479) {
            method3070(-3);
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Z", line = 44)
    public final boolean method38(byte arg0) {
        ++field7498;
        if (arg0 != -89) {
            field7485 = -0.9239611F;
        }
        return this.field7501.method2545(11802);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)I", line = 55)
    public final int method48(byte arg0) {
        ++field7500;
        if (arg0 != -70) {
            this.method36((byte) 58, (class287) null);
        }
        return this.field7501.field5977;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(BLza;)V", line = 68)
    public final void method36(byte arg0, class287 arg1) {
        ++field7488;
        class373 var3 = this.field7501.method2544(super.field2936, super.field2934, arg1, true, (byte) 6, true, 262144);
        if (arg0 >= -120) {
            this.method39(-100, (byte) -87, (class287) null);
        }
        if (var3 != null) {
            int var4 = super.field2934 >> 7;
            int var5 = super.field2936 >> 7;
            this.field7501.method2536(var3, var4, false, var4, var5, arg1, var5, false);
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(BLza;)Luc;", line = 91)
    public final class23 method50(byte arg0, class287 arg1) {
        ++field7494;
        class373 var3 = this.field7501.method2544(super.field2936, super.field2934, arg1, true, (byte) 6, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            class124 var4 = arg1.method1183();
            var4.method743(super.field2934, super.field2933, super.field2936);
            class23 var5 = null;
            if (this.field7490) {
                var5 = class117.method703(1, -20);
            }
            if (this.field7501.field5954 == null) {
                var3.method2051(var4, var5 == null ? null : var5.field226[0], 0);
            } else {
                class336 var6 = this.field7501.field5954.method257();
                arg1.method1203(var3, var6, var4, var5 == null ? null : var5.field226[0], 0);
            }
            int var7 = super.field2934 >> 7;
            if (arg0 != -112) {
                this.method38((byte) -29);
            }
            int var8 = super.field2936 >> 7;
            this.field7501.method2536(var3, var7, false, var7, var8, arg1, var8, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)I", line = 133)
    public final int method46(int arg0) {
        ++field7492;
        int var2 = 2 / ((-18 - arg0) / 42);
        return this.field7501.field5938;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)I", line = 143)
    public final int method47(int arg0) {
        ++field7483;
        return arg0 != -15774 ? 78 : this.field7501.field5949;
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V", line = 155)
    public static void method3070(int arg0) {
        if (arg0 != 1) {
            field7487 = -51;
        }
        field7482 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIZILot;Lza;)V", line = 168)
    public final void method40(int arg0, int arg1, int arg2, boolean arg3, int arg4, class419 arg5, class287 arg6) {
        ++field7486;
        int var8 = 61 / ((61 - arg0) / 47);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLza;)V", line = 178)
    public final void method49(byte arg0, class287 arg1) {
        if (arg0 == -56) {
            this.field7501.method2534((byte) -128, arg1);
            ++field7493;
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)Z", line = 189)
    public final boolean method41(byte arg0) {
        if (arg0 != -62) {
            return true;
        } else {
            ++field7484;
            return false;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILza;)V", line = 204)
    public final void method44(int arg0, class287 arg1) {
        this.field7501.method2549(1, arg1);
        if (arg0 <= 122) {
            this.method38((byte) -95);
        }
        ++field7489;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lza;Ler;IIIIIZII)V", line = 217)
    public class515(class287 arg0, class70 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field868, arg1.field822, arg1.field831);
        this.field7501 = new class415(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field7490 = ~arg1.field886 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILza;BI)Z", line = 228)
    public final boolean method37(int arg0, class287 arg1, byte arg2, int arg3) {
        ++field7497;
        class373 var5 = this.field7501.method2544(super.field2936, super.field2934, arg1, false, (byte) 6, false, 131072);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 >= -64) {
                this.field7501 = null;
            }
            class124 var6 = arg1.method1183();
            var6.method743(super.field2934, super.field2933, super.field2936);
            return var5.method2026(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)Z", line = 247)
    public static final boolean method3071(int arg0, byte arg1) {
        if (arg1 < 87) {
            method3070(-42);
        }
        ++field7481;
        return arg0 == 0 || arg0 == 1 || ~arg0 == -3;
    }
}
