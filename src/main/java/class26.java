import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class26 extends class167 implements class303 {

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "B")
    private byte field345;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Z")
    private boolean field346;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "B")
    private byte field349;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "Z")
    private boolean field350;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "Z")
    private boolean field360;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "S")
    private short field370;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "Z")
    private boolean field369;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "Li;")
    private class197 field348;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "Le;")
    private class285 field368;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field347 = 0;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "Lkc;")
    public static class157 field354 = new class157("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "Ljava/awt/Frame;")
    public static Frame field358;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "[I")
    public static int[] field365;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "[Lbe;")
    public static class150[] field357;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLza;Z)Luo;")
    private final class135 method155(int arg0, boolean arg1, class295 arg2, boolean arg3) {
        ++field353;
        class103 var5 = class452.field6629.method603((byte) 95, 65535 & this.field370);
        if (!arg1) {
            this.field349 = -78;
        }
        class11 var6;
        class11 var7;
        if (!this.field360) {
            var6 = class348.field5000[this.field349];
            if (~this.field349 <= -4) {
                var7 = null;
            } else {
                var7 = class348.field5000[this.field349 + 1];
            }
        } else {
            var7 = class348.field5000[0];
            var6 = class36.field554[this.field349];
        }
        return var5.method801(22, arg0, super.field2551, false, super.field2553, var7, arg2, var6, super.field2556, this.field345, arg3);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lza;I)V")
    public final void method156(class295 arg0, int arg1) {
        ++field359;
        Object var3 = null;
        class197 var5;
        if (this.field348 == null && this.field369) {
            class135 var4 = this.method155(262144, true, arg0, true);
            var5 = var4 == null ? null : var4.field2053;
        } else {
            var5 = this.field348;
            this.field348 = null;
        }
        if (var5 != null) {
            class161.method1135(var5, this.field349, super.field2551, super.field2556, (boolean[]) null);
        }
        if (arg1 > -109) {
            this.field345 = -4;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)I")
    public final int method157(byte arg0) {
        if (arg0 != -22) {
            return 39;
        } else {
            ++field364;
            return this.field345;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBILza;)Z")
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        ++field351;
        class285 var5 = this.method167((byte) 116, arg3, 131072);
        if (var5 != null) {
            class512 var6 = arg3.method541();
            var6.method955(super.field2551, super.field2553, super.field2556);
            return var5.method684(arg2, arg0, var6, false);
        } else {
            if (arg1 < 58) {
                field365 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
    public final int method159(int arg0) {
        ++field363;
        int var2 = 107 / ((78 - arg0) / 46);
        return 22;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)Z")
    public final boolean method160(byte arg0) {
        if (arg0 != 112) {
            this.method158(-27, (byte) -66, -59, (class295) null);
        }
        ++field362;
        return this.field369;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Llb;IZIBILza;)V")
    public final void method161(class186 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class295 arg6) {
        if (arg4 <= 54) {
            this.field346 = true;
        }
        if (arg0 instanceof class26) {
            class26 var8 = (class26) arg0;
            if (this.field368 != null && var8.field368 != null) {
                this.field368.method698(var8.field368, arg1, arg5, arg3, arg2);
            }
        }
        ++field343;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILza;B)Le;")
    public final class285 method162(int arg0, class295 arg1, byte arg2) {
        if (arg2 != -14) {
            this.field348 = null;
        }
        ++field361;
        return this.method167((byte) 119, arg1, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
    public static void method163(int arg0) {
        field365 = null;
        if (arg0 >= -59) {
            method163(16);
        }
        field358 = null;
        field357 = null;
        field354 = null;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Lza;I)V")
    public final void method164(class295 arg0, int arg1) {
        ++field341;
        if (arg1 == 1907) {
            Object var3 = null;
            class197 var5;
            if (this.field348 == null && this.field369) {
                class135 var4 = this.method155(262144, true, arg0, true);
                var5 = var4 != null ? var4.field2053 : null;
            } else {
                var5 = this.field348;
                this.field348 = null;
            }
            if (var5 != null) {
                class125.method903(var5, this.field349, super.field2551, super.field2556, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public final void method165(int arg0) {
        ++field352;
        if (this.field368 != null) {
            this.field368.method687();
        }
        if (arg0 != -8698) {
            field365 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(Lza;I)V")
    public final void method166(class295 arg0, int arg1) {
        if (arg1 < 7) {
            this.method155(65, true, (class295) null, false);
        }
        ++field356;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLza;I)Le;")
    private final class285 method167(byte arg0, class295 arg1, int arg2) {
        ++field366;
        if (this.field368 != null && arg1.method459(this.field368.method671(), arg2) == 0) {
            return this.field368;
        } else {
            if (arg0 < 112) {
                this.method164((class295) null, 80);
            }
            class135 var4 = this.method155(arg2, true, arg1, false);
            return var4 != null ? var4.field2051 : null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
    public final void method168(int arg0) {
        ++field344;
        this.field350 = false;
        if (this.field368 != null) {
            this.field368.method711(-65537 & this.field368.method671());
        }
        int var2 = -91 / ((arg0 - 43) / 56);
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)Z")
    public final boolean method169(int arg0) {
        if (arg0 != -28206) {
            return false;
        } else {
            ++field355;
            return this.field350;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)I")
    public final int method170(byte arg0) {
        ++field367;
        int var2 = 62 % ((arg0 - -11) / 47);
        return 65535 & this.field370;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLza;)Lql;")
    public final class121 method171(byte arg0, class295 arg1) {
        ++field342;
        if (this.field368 == null) {
            return null;
        } else if (arg0 != -96) {
            return null;
        } else {
            class512 var3 = arg1.method541();
            var3.method955(super.field2551, super.field2553, super.field2556);
            class121 var4 = null;
            if (this.field346) {
                var4 = class399.method2364(1, arg0 + -29656);
            }
            this.field368.method701(var3, var4 == null ? null : var4.field1878[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lza;Lpm;IIIIZIZ)V")
    public class26(class295 arg0, class103 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field1652, arg1.field1617, arg1.field1643);
        this.field345 = (byte) arg7;
        this.field346 = ~arg1.field1697 != -1 && !arg6;
        super.field2556 = arg5;
        super.field2551 = arg3;
        this.field349 = (byte) arg2;
        this.field350 = arg8;
        this.field360 = arg6;
        this.field370 = (short) arg1.field1646;
        this.field369 = arg0.method498() && arg1.field1614 && !this.field360 && ~class76.field1075.method1593(class195.field2849, 110) != -1;
        int var10 = 2048;
        if (this.field350) {
            var10 |= 65536;
        }
        class135 var11 = this.method155(var10, true, arg0, this.field369);
        if (var11 != null) {
            this.field348 = var11.field2053;
            this.field368 = var11.field2051;
            if (this.field350) {
                this.field368 = this.field368.method697((byte) 0, var10, false);
                return;
            }
        }
    }
}
