import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class26 extends class448 {

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    private int field455 = 0;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "Z")
    public boolean field443 = false;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    private int field451 = 0;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "I")
    private int field462 = -1;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    private int field450 = 0;

    @OriginalMember(owner = "client!ml", name = "Z", descriptor = "I")
    private int field463 = -32768;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "Lhi;")
    private class44 field447;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!ml", name = "ab", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!ml", name = "bb", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "Lwp;")
    private class330 field456;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Lqa;B)Lvs;", line = 5)
    public final class465 method172(class129 arg0, byte arg1) {
        ++field452;
        class507 var3 = this.method181(2048 | (this.field451 == 0 ? 0 : 5), this.field446, arg0, false);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field451 != -1) {
                var3.method522(this.field451 * 2048);
            }
            class142 var4 = arg0.method847();
            var4.method982(super.field6239, super.field6224, super.field6241);
            int var5 = -75 / ((48 - arg1) / 60);
            if (this.field456 != null) {
                class287 var6 = this.field456.method1969();
                arg0.method824(var3, var6, var4, (class530) null, 0);
            } else {
                var3.method520(var4, (class530) null, 0);
            }
            this.field463 = var3.method507();
            this.method182(arg0, var3, false);
            return null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 42)
    public final void method173(byte arg0) {
        if (arg0 == -32) {
            ++field464;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLrn;ZIILqa;I)V", line = 54)
    public final void method174(byte arg0, class242 arg1, boolean arg2, int arg3, int arg4, class129 arg5, int arg6) {
        ++field465;
        if (arg0 != 91) {
            this.method177(54);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 67)
    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field451 = arg12;
        this.field448 = arg1 + arg2;
        this.field446 = arg0;
        this.field449 = arg4;
        class76 var14 = class472.field6897.method1495((byte) 62, this.field446);
        int var15 = var14.field969;
        if (var15 == -1) {
            this.field443 = true;
        } else {
            this.field447 = class403.field5429.method1962(var15, false);
            this.field443 = false;
        }
        if (this.field448 == arg2) {
            class284.method1729(super.field6239, this.field455, 110, super.field6220, super.field6241, this.field447, false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLqa;)V", line = 93)
    public final void method175(byte arg0, class129 arg1) {
        if (arg0 != 91) {
            this.method179(113, true, -42, (class129) null);
        }
        ++field457;
        class507 var3 = this.method181(0, this.field446, arg1, false);
        if (var3 != null) {
            this.method182(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 109)
    public final void method176(int arg0) {
        if (arg0 != -1) {
            this.method181(113, 55, (class129) null, false);
        }
        ++field444;
        if (this.field456 != null) {
            this.field456.method1972();
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)Z", line = 135)
    public final boolean method177(int arg0) {
        if (arg0 != 5) {
            return true;
        } else {
            ++field460;
            return false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V", line = 148)
    public final void method178(int arg0, int arg1) {
        ++field453;
        if (!this.field443) {
            this.field450 += arg0;
            if (arg1 > 82) {
                while (~this.field450 < ~this.field447.field647[this.field455]) {
                    this.field450 -= this.field447.field647[this.field455];
                    ++this.field455;
                    if (~this.field455 <= ~this.field447.field640.length) {
                        this.field443 = true;
                        break;
                    }
                }
                if (!this.field443) {
                    class284.method1729(super.field6239, this.field455, 125, super.field6220, super.field6241, this.field447, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZILqa;)Z", line = 179)
    public final boolean method179(int arg0, boolean arg1, int arg2, class129 arg3) {
        if (arg1) {
            return false;
        } else {
            ++field458;
            return false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "(I)I", line = 190)
    public final int method180(int arg0) {
        ++field461;
        int var2 = 31 % (-arg0 / 33);
        return this.field463;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILqa;Z)Lc;", line = 205)
    private final class507 method181(int arg0, int arg1, class129 arg2, boolean arg3) {
        ++field459;
        class76 var5 = class472.field6897.method1495((byte) 62, arg1);
        if (arg3) {
            this.method172((class129) null, (byte) -84);
        }
        class251 var6 = class405.field5436[super.field6220];
        class251 var7 = this.field449 >= 3 ? null : class405.field5436[this.field449 + 1];
        return !this.field443 ? var5.method440(super.field6241, arg0, var6, super.field6224, var7, 8629, arg2, true, this.field450, this.field455, this.field462, super.field6239, class403.field5429) : var5.method440(super.field6241, arg0, var6, super.field6224, var7, 8629, arg2, true, 0, -1, -1, super.field6239, class403.field5429);
    }

    @OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V", line = 222)
    protected final void finalize() {
        ++field442;
        if (this.field456 != null) {
            this.field456.method1972();
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lqa;Lc;Z)V", line = 247)
    private final void method182(class129 arg0, class507 arg1, boolean arg2) {
        ++field454;
        class473[] var4 = arg1.method493();
        if (!arg2) {
            class165[] var5 = arg1.method476();
            if ((this.field456 == null || this.field456.field4234) && (var4 != null || var5 != null)) {
                this.field456 = new class330(class264.field3353);
            }
            if (this.field456 != null) {
                this.field456.method1966(arg0, (long) class264.field3353, var4, var5, false);
                this.field456.method1974(super.field6220, super.field6238, super.field6229, super.field6228, super.field6221);
            }
        }
    }
}
