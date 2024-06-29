import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class425 extends class188 {

    @OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
    private int field5800 = -1;

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "I")
    private int field5806 = -1;

    @OriginalMember(owner = "client!qba", name = "v", descriptor = "I")
    public int field5802;

    @OriginalMember(owner = "client!qba", name = "u", descriptor = "Lmea;")
    public static class451 field5801 = null;

    @OriginalMember(owner = "client!qba", name = "x", descriptor = "I")
    public static int field5804 = 0;

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!qba", name = "w", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!qba", name = "y", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!qba", name = "A", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)V")
    public static final void method2568(int arg0, int arg1, int arg2) {
        ++field5799;
        if (!(class117.field1802 > class117.field1796)) {
            if (class117.field1802 < class117.field1796) {
                class117.field1796 = (float) ((double) class117.field1796 - (double) class117.field1796 / 30.0D);
                if (class117.field1802 > class117.field1796) {
                    class117.field1796 = class117.field1802;
                }
                class665.method3789(-112);
                class117.field1793 = (int) class117.field1796 >> 1;
                class117.field1795 = class256.method1666(class117.field1793, 0);
            }
        } else {
            class117.field1796 = (float) ((double) class117.field1796 / 30.0D + (double) class117.field1796);
            if (class117.field1802 < class117.field1796) {
                class117.field1796 = class117.field1802;
            }
            class665.method3789(-89);
            class117.field1793 = (int) class117.field1796 >> 1;
            class117.field1795 = class256.method1666(class117.field1793, 0);
        }
        if (arg2 != -10065) {
            method2571(65);
        }
        if (~class138.field2063 != 0 && ~class67.field823 != 0) {
            int var3 = class138.field2063 - class671.field9338;
            if (var3 < 2 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = -class752.field10398 + class67.field823;
            if (var4 < 2 || ~var4 < -3) {
                var4 /= 8;
            }
            class671.field9338 += var3;
            class752.field10398 += var4;
            if (var3 == 0 && ~var4 == -1) {
                class67.field823 = -1;
                class138.field2063 = -1;
            }
            class665.method3789(125);
        }
        if (~class503.field7134 < -1) {
            --class788.field10817;
            if (~class788.field10817 == -1) {
                class788.field10817 = 100;
                --class503.field7134;
            }
        } else {
            class735.field10154 = -1;
            class399.field5481 = -1;
        }
        if (class467.field6578 && class776.field10670 != null) {
            for (class348 var5 = (class348) class776.field10670.method1731((byte) -115); var5 != null; var5 = (class348) class776.field10670.method1724(arg2 + 10065)) {
                class413 var6 = class117.field1786.method1231(69, var5.field4866.field6971);
                if (var5.method2207(arg0, arg1, (byte) -104)) {
                    if (var6.field5620 != null) {
                        if (var6.field5620[4] != null) {
                            class105.method738((long) var5.field4866.field6971, -1, true, var6.field5641, false, -1, false, var6.field5656, (long) var5.field4866.field6971, 0, (byte) -42, var6.field5620[4], 1002);
                        }
                        if (var6.field5620[3] != null) {
                            class105.method738((long) var5.field4866.field6971, -1, true, var6.field5641, false, -1, false, var6.field5656, (long) var5.field4866.field6971, 0, (byte) -42, var6.field5620[3], 1008);
                        }
                        if (var6.field5620[2] != null) {
                            class105.method738((long) var5.field4866.field6971, -1, true, var6.field5641, false, -1, false, var6.field5656, (long) var5.field4866.field6971, 0, (byte) -42, var6.field5620[2], 1007);
                        }
                        if (var6.field5620[1] != null) {
                            class105.method738((long) var5.field4866.field6971, -1, true, var6.field5641, false, -1, false, var6.field5656, (long) var5.field4866.field6971, 0, (byte) -42, var6.field5620[1], 1003);
                        }
                        if (var6.field5620[0] != null) {
                            class105.method738((long) var5.field4866.field6971, -1, true, var6.field5641, false, -1, false, var6.field5656, (long) var5.field4866.field6971, 0, (byte) -42, var6.field5620[0], 1006);
                        }
                    }
                    if (!var5.field4866.field6974) {
                        var5.field4866.field6974 = true;
                        class379.method2352(class502.field7115, var5.field4866.field6971, var6.field5656);
                    }
                    if (var5.field4866.field6974) {
                        class379.method2352(class710.field9864, var5.field4866.field6971, var6.field5656);
                    }
                } else if (var5.field4866.field6974) {
                    var5.field4866.field6974 = false;
                    class379.method2352(class217.field3365, var5.field4866.field6971, var6.field5656);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
    public final void method1319(int arg0) {
        ++field5805;
        OpenGL.glFramebufferTexture2DEXT(this.field5806, this.field5800, 3553, 0, 0);
        this.field5806 = -1;
        if (arg0 == -17115) {
            this.field5800 = -1;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIZII)V")
    public final void method2569(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field5807;
        if (arg2) {
            this.field5800 = -24;
        }
        OpenGL.glFramebufferTexture2DEXT(arg3, arg0, arg1, super.field2900, arg4);
        this.field5806 = arg3;
        this.field5800 = arg0;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 == 29592) {
            ++field5803;
            if (class618.field8645 <= arg7 && class463.field6533 >= arg0 && arg3 >= class734.field10153 && ~class407.field5535 <= ~arg4) {
                class317.method2056(arg1, arg7, false, arg4, arg3, arg2, arg6, arg0);
            } else {
                class48.method342(arg2, arg0, arg6, arg3, (byte) -120, arg1, arg4, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lqfa;IIZ[[BI)V")
    public class425(class106 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5802 = arg2;
        super.field2905.method808((byte) 34, this);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field2906, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1312((byte) -79, true);
    }

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "(I)V")
    public static void method2571(int arg0) {
        if (arg0 <= 126) {
            method2568(-76, -11, 70);
        }
        field5801 = null;
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lqfa;II)V")
    public class425(class106 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field5802 = arg2;
        super.field2905.method808((byte) 34, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field2906, arg2, arg2, 0, class434.method2600(-6407, super.field2906), 5121, (byte[]) null, 0);
        }
        this.method1312((byte) -79, true);
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lqfa;IIZ[[I)V")
    public class425(class106 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field5802 = arg2;
        super.field2905.method808((byte) 34, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, super.field2906, arg2, arg2, 0, 32993, super.field2905.field1474, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class665.method3784(arg2, var7 + 34069, (byte) 42, arg2, super.field2905.field1474, arg4[var7], super.field2906, 32993);
            }
        }
        this.method1312((byte) -79, true);
    }
}
