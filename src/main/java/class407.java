import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class407 extends class391 implements class339 {

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "B")
    private byte field5094;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "S")
    private short field5093;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "Z")
    private boolean field5109;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "Z")
    private boolean field5108;

    @OriginalMember(owner = "client!ub", name = "ob", descriptor = "Z")
    private boolean field5116;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "Z")
    private boolean field5106;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "Lha;")
    private class119 field5100;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "Lda;")
    private class474 field5103;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "[F")
    public static float[] field5088 = new float[4];

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "Z")
    public static boolean field5096 = false;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "[I")
    public static int[] field5097 = new int[256];

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!ub", name = "kb", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!ub", name = "lb", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!ub", name = "mb", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!ub", name = "nb", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "Ljl;")
    public static class126 field5098;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "Lsd;")
    private class362 field5091;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)I")
    public final int method65(byte arg0) {
        ++field5089;
        if (arg0 <= 126) {
            field5097 = null;
        }
        return this.field5093 & 65535;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
    public final void method81(boolean arg0) {
        if (arg0) {
            field5096 = false;
        }
        if (this.field5103 != null) {
            this.field5103.method726();
        }
        ++field5084;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lr;Lbda;IIIIIZIZ)V")
    public class407(class566 arg0, class441 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field5508);
        this.field5094 = (byte) arg8;
        this.field5093 = (short) arg1.field5504;
        this.field5109 = arg7;
        this.field5108 = arg1.field5560 != 0 && !arg7;
        this.field5116 = arg9;
        super.field6461 = arg4;
        super.field6464 = arg6;
        this.field5106 = arg0.method975() && arg1.field5558 && !this.field5109 && class301.field3698.method2703(class651.field9191, -117) != 0;
        int var11 = 2048;
        if (this.field5116) {
            var11 |= 65536;
        }
        class275 var12 = this.method2162(var11, true, this.field5106, arg0);
        if (var12 != null) {
            this.field5100 = var12.field3457;
            this.field5103 = var12.field3456;
            if (this.field5116) {
                this.field5103 = this.field5103.method711((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZZLr;)Lkj;")
    private final class275 method2162(int arg0, boolean arg1, boolean arg2, class566 arg3) {
        ++field5115;
        if (!arg1) {
            this.field5093 = 73;
        }
        class441 var5 = class428.field5352.method3138((byte) 75, this.field5093 & 65535);
        class272 var6;
        class272 var7;
        if (this.field5109) {
            var6 = class256.field3127[0];
            var7 = class699.field9887[super.field6456];
        } else {
            var7 = class256.field3127[super.field6456];
            if (super.field6456 < 3) {
                var6 = class256.field3127[super.field6456 + 1];
            } else {
                var6 = null;
            }
        }
        return var5.method2362(arg0, arg3, super.field6458, var7, super.field6461, -129, var6, super.field6464, arg2, 22, this.field5094);
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)I")
    public final int method71(int arg0) {
        int var2 = 39 % ((-43 - arg0) / 59);
        ++field5104;
        return this.field5103 != null ? this.field5103.method757() : 0;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)I")
    public final int method72(int arg0) {
        ++field5092;
        if (arg0 != -22496) {
            this.field5100 = null;
        }
        return this.field5103 != null ? this.field5103.method704() : 0;
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(B)Z")
    public final boolean method79(byte arg0) {
        ++field5114;
        if (arg0 >= -26) {
            this.method79((byte) -61);
        }
        return this.field5116;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILr;I)Z")
    public final boolean method75(int arg0, int arg1, class566 arg2, int arg3) {
        if (arg3 != 9678) {
            field5088 = null;
        }
        ++field5083;
        class474 var5 = this.method2164(131072, true, arg2);
        if (var5 != null) {
            class491 var6 = arg2.method995();
            var6.method914(super.field6461, super.field6458, super.field6464);
            return !class36.field498 ? var5.method744(arg0, arg1, var6, false) : var5.method738(arg0, arg1, var6, false, class432.field5406);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIBLr;Llo;II)V")
    public final void method77(boolean arg0, int arg1, byte arg2, class566 arg3, class488 arg4, int arg5, int arg6) {
        if (arg4 instanceof class407) {
            class407 var8 = (class407) arg4;
            if (this.field5103 != null && var8.field5103 != null) {
                this.field5103.method725(var8.field5103, arg1, arg5, arg6, arg0);
            }
        }
        int var9 = -106 % ((arg2 - -50) / 55);
        ++field5111;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lr;I)Lsd;")
    public final class362 method82(class566 arg0, int arg1) {
        if (this.field5091 == null) {
            this.field5091 = class286.method1606(-24294, super.field6458, this.method2164(0, true, arg0), super.field6464, super.field6461);
        }
        if (arg1 != -1660704056) {
            this.method67(false, (class566) null);
        }
        ++field5107;
        return this.field5091;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    public final void method66(int arg0) {
        ++field5110;
        if (arg0 == -1) {
            this.field5116 = false;
            if (this.field5103 != null) {
                this.field5103.method761(this.field5103.method764() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLr;)Log;")
    public final class101 method73(boolean arg0, class566 arg1) {
        ++field5113;
        if (this.field5103 == null) {
            return null;
        } else {
            if (arg0) {
                this.method66(25);
            }
            class491 var3 = arg1.method995();
            var3.method914(super.field6461, super.field6458, super.field6464);
            class101 var4 = null;
            if (this.field5108) {
                var4 = class676.method3794(!arg0, 1);
            }
            if (class36.field498) {
                this.field5103.method751(var3, var4 == null ? null : var4.field1361[0], class432.field5406, 0);
            } else {
                this.field5103.method717(var3, var4 == null ? null : var4.field1361[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "(B)V")
    public static void method2163(byte arg0) {
        field5097 = null;
        if (arg0 <= 54) {
            field5097 = null;
        }
        field5098 = null;
        field5088 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I")
    public final int method74(byte arg0) {
        if (arg0 != 42) {
            this.field5109 = false;
        }
        ++field5086;
        return 22;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZLr;)Lda;")
    private final class474 method2164(int arg0, boolean arg1, class566 arg2) {
        if (!arg1) {
            this.field5108 = true;
        }
        ++field5090;
        if (this.field5103 != null && ~arg2.method998(this.field5103.method764(), arg0) == -1) {
            return this.field5103;
        } else {
            class275 var4 = this.method2162(arg0, arg1, false, arg2);
            return var4 != null ? var4.field3456 : null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)I")
    public final int method78(byte arg0) {
        ++field5099;
        int var2 = 32 / ((12 - arg0) / 48);
        return this.field5094;
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(B)Z")
    public final boolean method68(byte arg0) {
        if (arg0 <= 114) {
            this.field5094 = 41;
        }
        ++field5085;
        return true;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        ++field5112;
        return arg0 != 3755 ? false : this.field5106;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)Z")
    public final boolean method83(byte arg0) {
        if (arg0 != 23) {
            this.field5103 = null;
        }
        ++field5105;
        return this.field5103 == null ? false : this.field5103.method740();
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZLr;)V")
    public final void method67(boolean arg0, class566 arg1) {
        ++field5087;
        if (arg0) {
            this.method81(false);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(BLr;)V")
    public final void method80(byte arg0, class566 arg1) {
        ++field5102;
        if (arg0 != -114) {
            this.field5091 = null;
        }
        Object var3 = null;
        class119 var5;
        if (this.field5100 == null && this.field5106) {
            class275 var4 = this.method2162(262144, true, true, arg1);
            var5 = var4 == null ? null : var4.field3457;
        } else {
            var5 = this.field5100;
            this.field5100 = null;
        }
        if (var5 != null) {
            class182.method1138(var5, super.field6456, super.field6461, super.field6464, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLr;)V")
    public final void method70(byte arg0, class566 arg1) {
        int var3 = 112 % ((arg0 - -19) / 34);
        ++field5095;
        Object var4 = null;
        class119 var6;
        if (this.field5100 == null && this.field5106) {
            class275 var5 = this.method2162(262144, true, true, arg1);
            var6 = var5 == null ? null : var5.field3457;
        } else {
            var6 = this.field5100;
            this.field5100 = null;
        }
        if (var6 != null) {
            class8.method63(var6, super.field6456, super.field6461, super.field6464, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIIIZII)V")
    public static final void method2165(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class500.field6600 = arg6;
        ++field5101;
        class400.field5020 = arg1;
        if (arg0) {
            method2165(false, 127, -94, 30, false, 54, 34);
        }
        class277.field3471 = arg5;
        class289.field3596 = arg2;
        class620.field8670 = arg3;
        if (arg4 && class620.field8670 >= 100) {
            class20.field292 = class400.field5020 * 512 - -256;
            class276.field3464 = class277.field3471 * 512 + 256;
            class571.field7982 = class467.method2469(class20.field292, class476.field6039, -20214, class276.field3464) + -class500.field6600;
        }
        class196.field2471 = -1;
        class306.field3890 = -1;
        class296.field3661 = 2;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if (~(1 & var1) == -2) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field5097[var0] = var1;
        }
    }
}
