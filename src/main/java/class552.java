import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class552 extends class39 {

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
    private int field7461 = 0;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "I")
    private int field7464 = 0;

    @OriginalMember(owner = "client!qs", name = "K", descriptor = "I")
    private int field7476 = 0;

    @OriginalMember(owner = "client!qs", name = "R", descriptor = "Z")
    public boolean field7483 = false;

    @OriginalMember(owner = "client!qs", name = "T", descriptor = "I")
    private int field7485 = -32768;

    @OriginalMember(owner = "client!qs", name = "Y", descriptor = "I")
    private int field7490 = -1;

    @OriginalMember(owner = "client!qs", name = "M", descriptor = "I")
    private int field7478;

    @OriginalMember(owner = "client!qs", name = "D", descriptor = "I")
    private int field7469;

    @OriginalMember(owner = "client!qs", name = "I", descriptor = "I")
    public int field7474;

    @OriginalMember(owner = "client!qs", name = "A", descriptor = "Lct;")
    private class131 field7466;

    @OriginalMember(owner = "client!qs", name = "J", descriptor = "Lgga;")
    public static class264 field7475 = new class264(8);

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!qs", name = "B", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!qs", name = "C", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!qs", name = "E", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!qs", name = "F", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!qs", name = "G", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!qs", name = "L", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!qs", name = "N", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!qs", name = "O", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!qs", name = "P", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!qs", name = "S", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!qs", name = "U", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!qs", name = "V", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!qs", name = "X", descriptor = "Lun;")
    public static class386 field7489;

    @OriginalMember(owner = "client!qs", name = "H", descriptor = "Lio;")
    private class401 field7473;

    @OriginalMember(owner = "client!qs", name = "Q", descriptor = "[Lfb;")
    public static class619[] field7482;

    @OriginalMember(owner = "client!qs", name = "W", descriptor = "[Z")
    public static boolean[] field7488;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZLoa;)V", line = 7)
    public final void method552(boolean arg0, class638 arg1) {
        if (!arg0) {
            this.method552(true, (class638) null);
        }
        ++field7479;
        class352 var3 = this.method3031(-1, arg1, 0, this.field7478);
        if (var3 != null) {
            class391 var4 = arg1.method401();
            var4.method1288(super.field509, super.field518, super.field514);
            this.method3037(var4, arg1, var3, -92);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Loa;B)Lac;", line = 28)
    public final class496 method551(class638 arg0, byte arg1) {
        ++field7477;
        if (arg1 >= -62) {
            this.method140(-16);
        }
        return null;
    }

    @OriginalMember(owner = "client!qs", name = "finalize", descriptor = "()V", line = 44)
    protected final void finalize() {
        if (this.field7473 != null) {
            this.field7473.method2291();
        }
        ++field7462;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 174)
    public class552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field7478 = arg0;
        this.field7469 = arg4;
        this.field7474 = arg2 - -arg1;
        this.field7464 = arg12;
        class586 var14 = class569.field7652.method2128(this.field7478, -1);
        int var15 = var14.field8185;
        if (~var15 != 0) {
            this.field7466 = class301.field4465.method2763(var15, 31696);
            this.field7483 = false;
        } else {
            this.field7483 = true;
        }
        if (this.field7474 == arg2) {
            class99.method769(false, super.field509, super.field520, this.field7466, super.field514, 50, this.field7461);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V", line = 58)
    public final void method142(boolean arg0) {
        ++field7470;
        if (arg0) {
            method3033(103, 16, 28, -66);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILoa;)Lwc;", line = 70)
    public final class60 method555(int arg0, class638 arg1) {
        ++field7471;
        class352 var3 = this.method3031(-1, arg1, (this.field7464 == arg0 ? 0 : 5) | 2048, this.field7478);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field7464 != -1) {
                var3.method225(this.field7464 * 2048);
            }
            class391 var4 = arg1.method401();
            var4.method1288(super.field509, super.field518, super.field514);
            this.method3037(var4, arg1, var3, arg0 + -91);
            if (this.field7473 != null) {
                class281 var5 = this.field7473.method2288();
                arg1.method434(var3, var5, var4, (class494) null, 0);
            } else {
                var3.method205(var4, (class494) null, 0);
            }
            this.field7485 = var3.method220();
            return null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILoa;I)Z", line = 105)
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        if (arg1 != -8003) {
            this.field7461 = 98;
        }
        ++field7465;
        return false;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILoa;II)Lba;", line = 116)
    private final class352 method3031(int arg0, class638 arg1, int arg2, int arg3) {
        ++field7463;
        class586 var5 = class569.field7652.method2128(arg3, arg0);
        class136 var6 = class31.field369[super.field520];
        class136 var7 = this.field7469 >= 3 ? null : class31.field369[this.field7469 + 1];
        return !this.field7483 ? var5.method3269(true, super.field514, this.field7461, arg2, this.field7476, class301.field4465, super.field518, arg1, this.field7490, (byte) -85, var6, super.field509, var7) : var5.method3269(true, super.field514, -1, arg2, 0, class301.field4465, super.field518, arg1, -1, (byte) 125, var6, super.field509, var7);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V", line = 130)
    public final void method3032(int arg0, int arg1) {
        ++field7484;
        if (!this.field7483) {
            this.field7476 += arg0;
            while (~this.field7466.field1810[this.field7461] > ~this.field7476) {
                this.field7476 -= this.field7466.field1810[this.field7461];
                ++this.field7461;
                if (this.field7461 >= this.field7466.field1806.length) {
                    this.field7483 = true;
                    break;
                }
            }
            if (arg1 == 8) {
                if (!this.field7483) {
                    class99.method769(false, super.field509, super.field520, this.field7466, super.field514, 50, this.field7461);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "(I)Z", line = 163)
    public final boolean method140(int arg0) {
        ++field7486;
        if (arg0 != 0) {
            this.method3031(81, (class638) null, -117, -67);
        }
        return false;
    }

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "(I)I", line = 203)
    public final int method179(int arg0) {
        if (arg0 != -1) {
            this.field7485 = -80;
        }
        ++field7460;
        return this.field7485;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)V", line = 214)
    public static final void method3033(int arg0, int arg1, int arg2, int arg3) {
        class288.field4014.method741(arg1, (byte) 27);
        if (arg0 != -1) {
            method3036(-103, (byte) 32, 127, 89, 84, 66);
        }
        ++field7480;
        class288.field4014.method752(103, arg2);
        class288.field4014.method740(arg3, true);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 242)
    public static void method3034(byte arg0) {
        field7475 = null;
        if (arg0 == -93) {
            field7489 = null;
            field7488 = null;
            field7482 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILgfa;IIZLoa;)V", line = 255)
    public final void method143(int arg0, int arg1, class687 arg2, int arg3, int arg4, boolean arg5, class638 arg6) {
        ++field7468;
        int var8 = -32 / (-arg3 / 54);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 265)
    public final void method3035(int arg0) {
        ++field7487;
        if (arg0 != -1) {
            this.field7461 = 79;
        }
        if (this.field7473 != null) {
            this.field7473.method2291();
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBIIII)V", line = 278)
    public static final void method3036(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= -104) {
            field7482 = null;
        }
        if (class274.field3872.field896 != 0 && ~arg2 != -1 && ~class357.field5108 > -51 && ~arg4 != 0) {
            class604.field8394[class357.field5108++] = new class629((byte) 1, arg4, arg2, arg0, arg3, arg5);
        }
        ++field7481;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lq;Loa;Lba;I)V", line = 295)
    private final void method3037(class391 arg0, class638 arg1, class352 arg2, int arg3) {
        arg2.method211(arg0);
        ++field7472;
        class34[] var5 = arg2.method221();
        class171[] var6 = arg2.method206();
        if (arg3 <= -30) {
            if ((this.field7473 == null || this.field7473.field5570) && (var5 != null || var6 != null)) {
                this.field7473 = class401.method2277(class239.field3440, true);
            }
            if (this.field7473 != null) {
                this.field7473.method2281(arg1, (long) class239.field3440, var5, var6, false);
                this.field7473.method2278(super.field520, super.field517, super.field516, super.field512, super.field519);
            }
        }
    }
}
