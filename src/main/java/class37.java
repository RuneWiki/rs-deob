import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class37 extends class370 {

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    private int field548 = -32768;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "I")
    private int field553 = 0;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "Z")
    public boolean field555 = false;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
    private int field552 = 0;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    private int field549 = -1;

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
    private int field563 = 0;

    @OriginalMember(owner = "client!dm", name = "U", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "Ldn;")
    private class357 field562;

    @OriginalMember(owner = "client!dm", name = "Y", descriptor = "Lko;")
    public static class348 field571 = new class348();

    @OriginalMember(owner = "client!dm", name = "ab", descriptor = "[B")
    public static byte[] field573 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!dm", name = "Z", descriptor = "Lao;")
    public static class188 field572 = new class188(9, -2);

    @OriginalMember(owner = "client!dm", name = "cb", descriptor = "I")
    public static int field575 = 10;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!dm", name = "N", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!dm", name = "O", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!dm", name = "W", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!dm", name = "X", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!dm", name = "bb", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "Lrb;")
    private class234 field565;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZILqa;I)Lc;", line = 3)
    private final class121 method290(boolean arg0, int arg1, class162 arg2, int arg3) {
        ++field547;
        class246 var5 = class450.field6582.method1475(arg3, arg0);
        class35 var6 = class145.field2135[super.field5538];
        class35 var7 = ~this.field567 > -4 ? class145.field2135[this.field567 + 1] : null;
        return !this.field555 ? var5.method1572((byte) 118, var6, arg1, super.field5539, var7, class311.field4455, true, this.field553, this.field563, arg2, this.field549, super.field5534, super.field5529) : var5.method1572((byte) 102, var6, arg1, super.field5539, var7, class311.field4455, true, -1, 0, arg2, -1, super.field5534, super.field5529);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIILqa;)Z", line = 17)
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        if (arg1 != -1) {
            return true;
        } else {
            ++field566;
            return false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILqa;)Lbw;", line = 35)
    public final class482 method114(int arg0, class162 arg1) {
        ++field554;
        class121 var3 = this.method290(true, 2048 | (~this.field552 != -1 ? 5 : 0), arg1, this.field551);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field552 != -1) {
                var3.method897(this.field552 * 2048);
            }
            if (arg0 != -6796) {
                this.field555 = true;
            }
            class413 var4 = arg1.method439();
            var4.method1008(super.field5529, super.field5534, super.field5539);
            if (this.field565 == null) {
                var3.method910(var4, (class361) null, 0);
            } else {
                class492 var5 = this.field565.method1519();
                arg1.method531(var3, var5, var4, (class361) null, 0);
            }
            this.field548 = var3.method918();
            this.method294(arg1, var3, -84);
            return null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 238)
    public class37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field567 = arg4;
        this.field552 = arg12;
        this.field551 = arg0;
        this.field568 = arg1 + arg2;
        class246 var14 = class450.field6582.method1475(this.field551, true);
        int var15 = var14.field3547;
        if (~var15 != 0) {
            this.field562 = class311.field4455.method1233(true, var15);
            this.field555 = false;
        } else {
            this.field555 = true;
        }
        if (~this.field568 == ~arg2) {
            class435.method2635(super.field5538, 232, super.field5539, this.field553, this.field562, false, super.field5529);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V", line = 75)
    public final void method291(byte arg0) {
        if (arg0 != 0) {
            this.field568 = -98;
        }
        ++field560;
        if (this.field565 != null) {
            this.field565.method1528();
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 94)
    public static void method292(int arg0) {
        field573 = null;
        field572 = null;
        if (arg0 >= -94) {
            method293(-29, 3);
        }
        field571 = null;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V", line = 110)
    public final void method117(int arg0) {
        ++field564;
        if (arg0 >= -127) {
            this.method121(87);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILqa;IZLha;I)V", line = 129)
    public final void method111(int arg0, int arg1, class162 arg2, int arg3, boolean arg4, class41 arg5, int arg6) {
        ++field561;
        if (arg3 <= 5) {
            this.field549 = 8;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)Z", line = 146)
    public final boolean method121(int arg0) {
        if (arg0 != 26923) {
            this.method295(14, -49);
        }
        ++field559;
        return false;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)I", line = 157)
    public static final int method293(int arg0, int arg1) {
        ++field570;
        return arg1 != 1023 ? -63 : 1023 & arg0;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)I", line = 171)
    public final int method107(boolean arg0) {
        if (arg0) {
            this.field551 = -80;
        }
        ++field556;
        return this.field548;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lqa;Lc;I)V", line = 184)
    private final void method294(class162 arg0, class121 arg1, int arg2) {
        ++field558;
        class46[] var4 = arg1.method913();
        if (arg2 >= -76) {
            this.finalize();
        }
        class113[] var5 = arg1.method890();
        if ((this.field565 == null || this.field565.field3402) && (var4 != null || var5 != null)) {
            this.field565 = new class234(class180.field2734);
        }
        if (this.field565 != null) {
            this.field565.method1518(arg0, (long) class180.field2734, var4, var5, false);
            this.field565.method1529(super.field5538, super.field5532, super.field5542, super.field5535, super.field5540);
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)V", line = 209)
    public final void method295(int arg0, int arg1) {
        ++field546;
        if (!this.field555) {
            this.field563 += arg1;
            while (this.field563 > this.field562.field5408[this.field553]) {
                this.field563 -= this.field562.field5408[this.field553];
                ++this.field553;
                if (this.field553 >= this.field562.field5395.length) {
                    this.field555 = true;
                    break;
                }
            }
            if (!this.field555) {
                class435.method2635(super.field5538, 232, super.field5539, this.field553, this.field562, false, super.field5529);
            }
            if (arg0 > -87) {
                this.finalize();
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "finalize", descriptor = "()V", line = 264)
    protected final void finalize() {
        if (this.field565 != null) {
            this.field565.method1528();
        }
        ++field569;
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(Lqa;I)V", line = 274)
    public final void method126(class162 arg0, int arg1) {
        ++field550;
        class121 var3 = this.method290(true, 0, arg0, this.field551);
        if (var3 != null) {
            this.method294(arg0, var3, -108);
        }
        if (arg1 >= -43) {
            this.method291((byte) -124);
        }
    }
}
