import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("oh")
public class class138 extends class18 {

    @OriginalMember(owner = "oh", name = "hb", descriptor = "Z")
    private boolean field2667 = false;

    @OriginalMember(owner = "oh", name = "kb", descriptor = "Z")
    private volatile boolean field2670 = false;

    @OriginalMember(owner = "oh", name = "ib", descriptor = "I")
    private int field2668 = -1;

    @OriginalMember(owner = "oh", name = "nb", descriptor = "Lwb;")
    private class204 field2673;

    @OriginalMember(owner = "oh", name = "yb", descriptor = "Lwb;")
    private class204 field2684;

    @OriginalMember(owner = "oh", name = "jb", descriptor = "I")
    private int field2669;

    @OriginalMember(owner = "oh", name = "mb", descriptor = "Llf;")
    public static class109 field2672 = class35.method275("Anmelde)2Zeitlimit -Uberschritten)3", 2);

    @OriginalMember(owner = "oh", name = "fb", descriptor = "Llf;")
    public static class109 field2665 = class35.method275("::noclip", 2);

    @OriginalMember(owner = "oh", name = "sb", descriptor = "I")
    public static int field2678 = 1;

    @OriginalMember(owner = "oh", name = "ub", descriptor = "Llf;")
    private static class109 field2680 = class35.method275(" from your friend list first)3", 2);

    @OriginalMember(owner = "oh", name = "ob", descriptor = "Llf;")
    public static class109 field2674 = field2680;

    @OriginalMember(owner = "oh", name = "zb", descriptor = "Llf;")
    private static class109 field2685 = class35.method275("wave2:", 2);

    @OriginalMember(owner = "oh", name = "rb", descriptor = "Llf;")
    public static class109 field2677 = field2685;

    @OriginalMember(owner = "oh", name = "Bb", descriptor = "Llf;")
    private static class109 field2687 = class35.method275("Your account has been disabled)3", 2);

    @OriginalMember(owner = "oh", name = "wb", descriptor = "Llf;")
    public static class109 field2682 = field2687;

    @OriginalMember(owner = "oh", name = "cb", descriptor = "Llf;")
    public static class109 field2662 = field2685;

    @OriginalMember(owner = "oh", name = "ab", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "oh", name = "bb", descriptor = "I")
    private int field2661;

    @OriginalMember(owner = "oh", name = "db", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "oh", name = "gb", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "oh", name = "lb", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "oh", name = "pb", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "oh", name = "qb", descriptor = "I")
    private int field2676;

    @OriginalMember(owner = "oh", name = "tb", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "oh", name = "vb", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "oh", name = "xb", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "oh", name = "Ab", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "oh", name = "Cb", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "oh", name = "eb", descriptor = "[Z")
    private volatile boolean[] field2664;

    @OriginalMember(owner = "oh", name = "d", descriptor = "(I)I")
    public final int method984(int arg0) {
        ++field2679;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; ~super.field399.length < ~var4; ++var4) {
            if (super.field386[var4] > 0) {
                var2 += 100;
                var3 += this.method986(var4, 25677);
            }
        }
        if (arg0 != -31160) {
            field2674 = null;
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "oh", name = "e", descriptor = "(III)V")
    public final void method985(int arg0, int arg1, int arg2) {
        ++field2686;
        this.field2676 = arg2;
        this.field2661 = arg1;
        if (this.field2684 == null) {
            class85.method542(this.field2661, (byte) 0, this, true, 255, 108, this.field2669);
        } else {
            class111.method825(this.field2669, this, this.field2684, (byte) 77);
        }
        int var4 = 87 / ((arg0 - 33) / 54);
    }

    @OriginalMember(owner = "oh", name = "a", descriptor = "(IB)V")
    public final void method157(int arg0, byte arg1) {
        ++field2675;
        if (arg1 < -32) {
            class53.method349(arg0, this.field2669, 122);
        }
    }

    @OriginalMember(owner = "oh", name = "a", descriptor = "(II)V")
    public final void method152(int arg0, int arg1) {
        int var3 = -5 % ((-16 - arg1) / 49);
        ++field2660;
        if (this.field2673 != null && this.field2664 != null && this.field2664[arg0]) {
            class111.method825(arg0, this, this.field2673, (byte) -108);
        } else {
            class85.method542(super.field387[arg0], (byte) 2, this, true, this.field2669, 100, arg0);
        }
    }

    @OriginalMember(owner = "oh", name = "g", descriptor = "(II)I")
    private final int method986(int arg0, int arg1) {
        ++field2688;
        if (super.field399[arg0] != null) {
            return 100;
        } else {
            if (arg1 != 25677) {
                this.method992(-29);
            }
            return this.field2664[arg0] ? 100 : class28.method230(1023, this.field2669, arg0);
        }
    }

    @OriginalMember(owner = "oh", name = "a", descriptor = "([BIZZI)V")
    public final void method987(byte[] arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        int var6 = 126 / ((arg1 - 36) / 48);
        ++field2683;
        if (!arg2) {
            arg0[arg0.length - 2] = (byte) (super.field369[arg4] >> 8);
            arg0[arg0.length + -1] = (byte) super.field369[arg4];
            if (this.field2673 != null) {
                class204.method1343(arg0, arg4, this.field2673, 0);
                this.field2664[arg4] = true;
            }
            if (arg3) {
                super.field399[arg4] = class187.method1270(28199, arg0, false);
                return;
            }
        } else {
            if (this.field2670) {
                throw new RuntimeException();
            }
            if (this.field2684 != null) {
                class204.method1343(arg0, this.field2669, this.field2684, 0);
            }
            this.method169(arg0, 5540);
            this.method990((byte) 74);
        }
    }

    @OriginalMember(owner = "oh", name = "a", descriptor = "([BLwb;ZZI)V")
    public final void method988(byte[] arg0, class204 arg1, boolean arg2, boolean arg3, int arg4) {
        ++field2681;
        if (this.field2684 != arg1) {
            if (!arg3 && this.field2668 == arg4) {
                this.field2670 = true;
            }
            if (arg0 == null || ~arg0.length >= -3) {
                this.field2664[arg4] = false;
                if (this.field2667 || arg3) {
                    class85.method542(super.field387[arg4], (byte) 2, this, arg3, this.field2669, 114, arg4);
                }
                return;
            }
            class157.field2954.reset();
            class157.field2954.update(arg0, 0, arg0.length + -2);
            int var6 = (int) class157.field2954.getValue();
            int var7 = (65280 & arg0[arg0.length + -2] << 8) + (255 & arg0[arg0.length + -1]);
            if (super.field387[arg4] != var6 || ~super.field369[arg4] != ~var7) {
                this.field2664[arg4] = false;
                if (this.field2667 || arg3) {
                    class85.method542(super.field387[arg4], (byte) 2, this, arg3, this.field2669, 120, arg4);
                }
                return;
            }
            this.field2664[arg4] = true;
            if (arg3) {
                super.field399[arg4] = class187.method1270(28199, arg0, false);
            }
        } else {
            if (this.field2670) {
                throw new RuntimeException();
            }
            if (arg0 == null) {
                class85.method542(this.field2661, (byte) 0, this, true, 255, 122, this.field2669);
                return;
            }
            class157.field2954.reset();
            class157.field2954.update(arg0, 0, arg0.length);
            int var8 = (int) class157.field2954.getValue();
            if (this.field2661 != var8) {
                class85.method542(this.field2661, (byte) 0, this, true, 255, 104, this.field2669);
                return;
            }
            class86 var9;
            try {
                var9 = new class86(class134.method953((byte) -53, arg0));
            } catch (RuntimeException var12) {
                class85.method542(this.field2661, (byte) 0, this, true, 255, 114, this.field2669);
                return;
            }
            int var10 = var9.method598((byte) 96);
            if (var10 != 5 && ~var10 != -7) {
                class85.method542(this.field2661, (byte) 0, this, true, 255, 106, this.field2669);
                return;
            }
            int var11 = 0;
            if (var10 >= 6) {
                var11 = var9.method582(15);
            }
            if (~this.field2676 != ~var11) {
                class85.method542(this.field2661, (byte) 0, this, true, 255, 98, this.field2669);
                return;
            }
            this.method169(arg0, 5540);
            this.method990((byte) 126);
        }
        if (arg2) {
            this.method990((byte) -16);
        }
    }

    @OriginalMember(owner = "oh", name = "<init>", descriptor = "(Lwb;Lwb;IZZZ)V")
    public class138(class204 arg0, class204 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2667 = arg5;
        this.field2673 = arg0;
        this.field2684 = arg1;
        this.field2669 = arg2;
        class116.method855(0, this.field2669, this);
    }

    @OriginalMember(owner = "oh", name = "e", descriptor = "(I)V")
    public static void method989(int arg0) {
        field2682 = null;
        field2662 = null;
        field2672 = null;
        field2665 = null;
        field2687 = null;
        field2677 = null;
        field2674 = null;
        if (arg0 != -1) {
            field2662 = null;
        }
        field2685 = null;
        field2680 = null;
    }

    @OriginalMember(owner = "oh", name = "d", descriptor = "(B)V")
    private final void method990(byte arg0) {
        ++field2671;
        if (arg0 <= 64) {
            this.field2669 = 89;
        }
        this.field2664 = new boolean[super.field399.length];
        for (int var2 = 0; ~var2 > ~this.field2664.length; ++var2) {
            this.field2664[var2] = false;
        }
        if (this.field2673 == null) {
            this.field2670 = true;
        } else {
            this.field2668 = -1;
            for (int var3 = 0; this.field2664.length > var3; ++var3) {
                if (super.field386[var3] > 0) {
                    class84.method537(this.field2673, var3, this, (byte) 127);
                    this.field2668 = var3;
                }
            }
            if (this.field2668 == -1) {
                this.field2670 = true;
            }
        }
    }

    @OriginalMember(owner = "oh", name = "a", descriptor = "(IIIILbg;ZI)V")
    public static final void method991(int arg0, int arg1, int arg2, int arg3, class18 arg4, boolean arg5, int arg6) {
        class16.field302 = arg4;
        class8.field109 = arg6;
        if (arg0 != -24390) {
            method989(-121);
        }
        class145.field2803 = arg3;
        class84.field1711 = 1;
        class72.field1404 = arg1;
        ++field2663;
        class88.field1839 = arg5;
        class72.field1394 = arg2;
    }

    @OriginalMember(owner = "oh", name = "f", descriptor = "(I)I")
    public final int method992(int arg0) {
        ++field2666;
        if (this.field2670) {
            return 100;
        } else if (super.field399 != null) {
            return 99;
        } else if (arg0 > -16) {
            return -38;
        } else {
            int var2 = class28.method230(1023, 255, this.field2669);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }
}
