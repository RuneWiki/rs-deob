import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class479 extends class641 implements class532 {

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "Lwc;")
    public class62 field6389;

    @OriginalMember(owner = "client!uca", name = "x", descriptor = "Z")
    private boolean field6387;

    @OriginalMember(owner = "client!uca", name = "w", descriptor = "I")
    public static int field6386 = 0;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!uca", name = "v", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!uca", name = "y", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!uca", name = "A", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!uca", name = "B", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!uca", name = "C", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!uca", name = "D", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!uca", name = "E", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!uca", name = "F", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!uca", name = "G", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!uca", name = "H", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!uca", name = "I", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!uca", name = "J", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "Ldd;")
    private class660 field6381;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Loa;I)V", line = 4)
    public final void method138(class651 arg0, int arg1) {
        ++field6384;
        if (arg1 == 2215) {
            this.field6389.method497(true, arg0);
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(B)I", line = 17)
    public final int method151(byte arg0) {
        if (arg0 != 78) {
            return -58;
        } else {
            ++field6388;
            return this.field6389.field953;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)Z", line = 28)
    public final boolean method150(byte arg0) {
        ++field6382;
        if (arg0 >= -34) {
            method2677();
        }
        return this.field6389.method502((byte) 17);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLoa;)Lpe;", line = 39)
    public final class571 method145(byte arg0, class651 arg1) {
        ++field6398;
        if (arg0 != 124) {
            this.method150((byte) -60);
        }
        class358 var3 = this.field6389.method499(arg1, super.field8612, 2048, false, true, super.field8620, 25878);
        if (var3 == null) {
            return null;
        } else {
            class397 var4 = arg1.method455();
            var4.method576(super.field8620, super.field8616, super.field8612);
            class571 var5 = null;
            if (this.field6387) {
                var5 = class157.method1100((byte) -111, 1);
            }
            this.field6389.method495(var4, super.field8618, arg1, true, true, var3, super.field8622, super.field8610, super.field8611);
            if (this.field6389.field943 != null) {
                class174 var6 = this.field6389.field943.method2711();
                arg1.method392(var3, var6, var4, var5 != null ? var5.field7581[0] : null, 0);
            } else {
                var3.method1947(var4, var5 == null ? null : var5.field7581[0], 0);
            }
            if (this.field6381 != null) {
                class587.method3229(super.field8612, 2, super.field8620, super.field8616, this.field6381, var3);
            } else {
                this.field6381 = class516.method2881(super.field8616, true, var3, super.field8620, super.field8612);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(Z)I", line = 81)
    public final int method146(boolean arg0) {
        if (arg0) {
            this.field6389 = null;
        }
        ++field6395;
        return this.field6389.field947;
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(B)V", line = 93)
    public final void method142(byte arg0) {
        if (arg0 != -77) {
            this.field6381 = null;
        }
        ++field6390;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)Z", line = 104)
    public final boolean method139(int arg0) {
        ++field6396;
        if (arg0 != 2) {
            this.method151((byte) 85);
        }
        return false;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILoa;ILni;ZZI)V", line = 117)
    public final void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6) {
        if (!arg5) {
            this.field6381 = null;
        }
        ++field6392;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Z)V", line = 128)
    public final void method144(boolean arg0) {
        ++field6380;
        if (arg0) {
            this.field6381 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(Z)I", line = 140)
    public final int method152(boolean arg0) {
        if (!arg0) {
            this.method146(false);
        }
        ++field6393;
        return this.field6389.field952;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "()V", line = 151)
    public static final void method2677() {
        class55.method366(1, class13.field218);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILoa;)Ldd;", line = 154)
    public final class660 method143(int arg0, class651 arg1) {
        if (arg0 != 31358) {
            return null;
        } else {
            ++field6391;
            return this.field6381;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Loa;Z)V", line = 167)
    public final void method147(class651 arg0, boolean arg1) {
        ++field6397;
        class358 var3 = this.field6389.method499(arg0, super.field8612, 262144, arg1, true, super.field8620, 25878);
        if (var3 != null) {
            class397 var4 = arg0.method455();
            var4.method576(super.field8620, super.field8616, super.field8612);
            this.field6389.method495(var4, super.field8618, arg0, arg1, false, var3, super.field8622, super.field8610, super.field8611);
        }
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Loa;Lbd;IIIIIZIIIIIII)V", line = 192)
    public class479(class651 arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field821 == 1, class80.method630(true, arg12, arg13));
        this.field6389 = new class62(arg0, arg1, arg12, arg13, super.field8609, arg3, arg4, arg6, arg7, arg14);
        this.field6387 = ~arg1.field816 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Loa;BI)Lba;", line = 201)
    public final class358 method137(class651 arg0, byte arg1, int arg2) {
        if (arg1 != -47) {
            return null;
        } else {
            ++field6383;
            return this.field6389.method499(arg0, 0, arg2, false, false, 0, 25878);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BILoa;I)Z", line = 217)
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        int var5 = 6 % ((arg0 - -26) / 38);
        ++field6394;
        class358 var6 = this.field6389.method499(arg2, super.field8612, 131072, false, false, super.field8620, 25878);
        if (var6 == null) {
            return false;
        } else {
            class397 var7 = arg2.method455();
            var7.method576(super.field8620, super.field8616, super.field8612);
            return var6.method1931(arg3, arg1, var7, false);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Loa;B)V", line = 236)
    public final void method148(class651 arg0, byte arg1) {
        if (arg1 != 70) {
            this.method150((byte) 102);
        }
        ++field6385;
        this.field6389.method505(-30964, arg0);
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(Z)I", line = 248)
    public final int method729(boolean arg0) {
        ++field6399;
        return arg0 ? -89 : this.field6389.method503(true);
    }
}
