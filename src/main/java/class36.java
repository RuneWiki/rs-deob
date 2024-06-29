import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class36 extends class287 implements class218 {

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "Z")
    private boolean field451;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "B")
    private byte field445;

    @OriginalMember(owner = "client!rq", name = "M", descriptor = "S")
    private short field455;

    @OriginalMember(owner = "client!rq", name = "eb", descriptor = "B")
    private byte field472;

    @OriginalMember(owner = "client!rq", name = "J", descriptor = "B")
    private byte field452;

    @OriginalMember(owner = "client!rq", name = "Q", descriptor = "Z")
    private boolean field459;

    @OriginalMember(owner = "client!rq", name = "X", descriptor = "Z")
    private boolean field465;

    @OriginalMember(owner = "client!rq", name = "A", descriptor = "Lns;")
    private class57 field443;

    @OriginalMember(owner = "client!rq", name = "H", descriptor = "Lfq;")
    private class87 field450;

    @OriginalMember(owner = "client!rq", name = "T", descriptor = "I")
    public static int field462 = 0;

    @OriginalMember(owner = "client!rq", name = "R", descriptor = "Lat;")
    public static class412 field460 = new class412();

    @OriginalMember(owner = "client!rq", name = "bb", descriptor = "Lsh;")
    public static class472 field469 = new class472(60, 3);

    @OriginalMember(owner = "client!rq", name = "cb", descriptor = "I")
    public static int field470 = 2;

    @OriginalMember(owner = "client!rq", name = "db", descriptor = "Lat;")
    public static class412 field471 = new class412();

    @OriginalMember(owner = "client!rq", name = "B", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!rq", name = "D", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!rq", name = "E", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!rq", name = "F", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!rq", name = "G", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!rq", name = "K", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!rq", name = "L", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!rq", name = "N", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!rq", name = "O", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!rq", name = "P", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!rq", name = "S", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!rq", name = "U", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!rq", name = "W", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!rq", name = "Y", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!rq", name = "Z", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!rq", name = "ab", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!rq", name = "fb", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ltq;I)V", line = 6)
    public final void method258(class63 arg0, int arg1) {
        if (arg1 != -22360) {
            method290(-31);
        }
        ++field449;
        Object var3 = null;
        class87 var5;
        if (this.field450 == null && this.field465) {
            class447 var4 = this.method287(true, arg0, 0, 131072);
            var5 = var4 == null ? null : var4.field6337;
        } else {
            var5 = this.field450;
            this.field450 = null;
        }
        if (var5 != null) {
            class299.method1868(var5, this.field472, super.field4392, super.field4387, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BILtq;)Lns;", line = 36)
    public final class57 method255(byte arg0, int arg1, class63 arg2) {
        ++field453;
        if (arg0 <= 108) {
            this.field459 = false;
        }
        return this.method285(true, arg1, arg2);
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)I", line = 48)
    public final int method244(byte arg0) {
        ++field454;
        return arg0 >= -8 ? -53 : this.field452;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)Z", line = 60)
    public final boolean method254(boolean arg0) {
        if (!arg0) {
            method288((byte) 80, 70);
        }
        ++field463;
        return this.field465;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIIIIII)V", line = 73)
    public static final void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field466;
        if (class161.method1094(2007241424, arg2)) {
            if (arg7 != -1) {
                field460 = null;
            }
            if (class361.field5469[arg2] != null) {
                client.method2774(class361.field5469[arg2], -1, arg6, arg9, arg8, arg4, arg5, arg1, arg0, arg3);
            } else {
                client.method2774(class467.field6572[arg2], -1, arg6, arg9, arg8, arg4, arg5, arg1, arg0, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZILtq;)Lns;", line = 93)
    private final class57 method285(boolean arg0, int arg1, class63 arg2) {
        ++field457;
        if (this.field443 != null && ~arg2.method583(this.field443.method402(), arg1) == -1) {
            return this.field443;
        } else {
            if (!arg0) {
                this.method287(true, (class63) null, 118, -32);
            }
            class447 var4 = this.method287(false, arg2, 0, arg1);
            return var4 != null ? var4.field6334 : null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLtq;)V", line = 117)
    public final void method256(byte arg0, class63 arg1) {
        ++field448;
        Object var3 = null;
        class87 var5;
        if (this.field450 == null && this.field465) {
            class447 var4 = this.method287(true, arg1, 0, 131072);
            var5 = var4 != null ? var4.field6337 : null;
        } else {
            var5 = this.field450;
            this.field450 = null;
        }
        if (arg0 != 82) {
            this.field452 = -48;
        }
        if (var5 != null) {
            class373.method2309(var5, this.field472, super.field4392, super.field4387, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "(B)I", line = 150)
    public final int method286(byte arg0) {
        ++field444;
        int var2 = 7 / ((63 - arg0) / 63);
        return this.field443 == null ? 0 : this.field443.method400();
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZLtq;II)Lri;", line = 160)
    private final class447 method287(boolean arg0, class63 arg1, int arg2, int arg3) {
        ++field468;
        class271 var5 = class206.field3124.method338((byte) 116, 65535 & this.field455);
        if (arg2 != 0) {
            field460 = null;
        }
        class48 var6;
        class48 var7;
        if (!this.field451) {
            if (~this.field472 > -4) {
                var6 = class483.field6781[this.field472 + 1];
            } else {
                var6 = null;
            }
            var7 = class483.field6781[this.field472];
        } else {
            var7 = class55.field765[this.field472];
            var6 = class483.field6781[0];
        }
        return var5.method1773(arg3, super.field4387, var7, super.field4392, arg1, this.field445, (byte) 100, arg0, var6, this.field452, super.field4377);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ltq;III)Z", line = 193)
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        ++field461;
        int var5 = 68 % ((-59 - arg2) / 58);
        class57 var6 = this.method285(true, 65536, arg0);
        if (var6 != null) {
            class315 var7 = arg0.method565();
            var7.method482(super.field4392, super.field4377, super.field4387);
            return var6.method423(arg1, arg3, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)V", line = 216)
    public static final void method288(byte arg0, int arg1) {
        int var2 = 102 / ((arg0 - -26) / 52);
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        ++field467;
        class5.field90 = arg1;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI)V", line = 230)
    public static final void method289(boolean arg0, int arg1) {
        if (!class337.field5038.field3925) {
            arg1 = -1;
        }
        ++field473;
        if (~class216.field3214 != ~arg1) {
            if (arg1 != -1) {
                class130 var2 = class42.field571.method126((byte) 14, arg1);
                class368 var3 = var2.method903(16711935);
                if (var3 != null) {
                    class21.field261.method1033(var3.method2263(), 17, var3.method2271(), var3.method2276(), new Point(var2.field1812, var2.field1818), class378.field5618);
                    class216.field3214 = arg1;
                } else {
                    arg1 = -1;
                }
            }
            if (arg0) {
                field470 = 68;
            }
            if (arg1 == -1 && class216.field3214 != -1) {
                class21.field261.method1033(-1, 17, -1, (int[]) null, new Point(), class378.field5618);
                class216.field3214 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)I", line = 271)
    public final int method250(byte arg0) {
        int var2 = -13 / ((-49 - arg0) / 60);
        ++field446;
        return this.field445;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(Z)V", line = 281)
    public final void method247(boolean arg0) {
        if (this.field443 != null) {
            this.field443.method422();
        }
        ++field464;
        if (arg0) {
            this.method258((class63) null, 35);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILtq;)V", line = 294)
    public final void method260(int arg0, class63 arg1) {
        ++field456;
        if (arg0 != 0) {
            field460 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(Z)I", line = 310)
    public final int method257(boolean arg0) {
        ++field458;
        if (arg0) {
            field469 = null;
        }
        return 65535 & this.field455;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(Ltq;I)Lcj;", line = 324)
    public final class123 method252(class63 arg0, int arg1) {
        ++field447;
        if (this.field443 == null) {
            return null;
        } else {
            class315 var3 = arg0.method565();
            if (arg1 != 2) {
                this.field465 = false;
            }
            var3.method482(super.field4392 - -super.field4378, super.field4377, super.field4387 - -super.field4385);
            class123 var4 = null;
            if (this.field459) {
                var4 = class225.method1462(1, -102);
            }
            this.field443.method404(var3, var4 != null ? var4.field1695[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "(I)V", line = 355)
    public static void method290(int arg0) {
        field460 = null;
        field471 = null;
        field469 = null;
        if (arg0 <= 9) {
            field469 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Ltq;Lvc;IIIIZIIIII)V", line = 367)
    public class36(class63 arg0, class271 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class317.method1952((byte) -97, arg11, arg10));
        this.field451 = arg6;
        this.field445 = (byte) arg10;
        this.field455 = (short) arg1.field4043;
        this.field472 = (byte) arg2;
        super.field4392 = (short) arg3;
        this.field452 = (byte) arg11;
        super.field4387 = (short) arg5;
        this.field459 = arg1.field4053 != 0 && !arg6;
        this.field465 = arg0.method581() && arg1.field4087 && !this.field451 && class337.field5038.field3952 != 0;
        class447 var13 = this.method287(this.field465, arg0, 0, 1024);
        if (var13 != null) {
            this.field443 = var13.field6334;
            this.field450 = var13.field6337;
        }
    }
}
