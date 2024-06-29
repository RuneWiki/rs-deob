import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class21 extends class22 {

    @OriginalMember(owner = "client!wi", name = "yb", descriptor = "Z")
    private volatile boolean field455 = false;

    @OriginalMember(owner = "client!wi", name = "jb", descriptor = "I")
    private int field440 = -1;

    @OriginalMember(owner = "client!wi", name = "Bb", descriptor = "Z")
    private boolean field458 = false;

    @OriginalMember(owner = "client!wi", name = "db", descriptor = "Lbf;")
    private class47 field434;

    @OriginalMember(owner = "client!wi", name = "fb", descriptor = "Lbf;")
    private class47 field436;

    @OriginalMember(owner = "client!wi", name = "qb", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!wi", name = "cb", descriptor = "[S")
    public static short[] field433 = new short[256];

    @OriginalMember(owner = "client!wi", name = "eb", descriptor = "Lij;")
    public static class50 field435 = class78.method578(126, "loginscreen");

    @OriginalMember(owner = "client!wi", name = "lb", descriptor = "I")
    public static int field442 = 50;

    @OriginalMember(owner = "client!wi", name = "sb", descriptor = "[I")
    public static int[] field449 = new int[32];

    @OriginalMember(owner = "client!wi", name = "tb", descriptor = "[I")
    public static int[] field450 = new int[1000];

    @OriginalMember(owner = "client!wi", name = "Ab", descriptor = "I")
    public static int field457 = 0;

    @OriginalMember(owner = "client!wi", name = "mb", descriptor = "I")
    public static int field443 = 0;

    @OriginalMember(owner = "client!wi", name = "Cb", descriptor = "Z")
    public static boolean field459 = true;

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!wi", name = "bb", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!wi", name = "gb", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!wi", name = "kb", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!wi", name = "ob", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!wi", name = "pb", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!wi", name = "rb", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!wi", name = "ub", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!wi", name = "vb", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!wi", name = "wb", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!wi", name = "xb", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!wi", name = "zb", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!wi", name = "hb", descriptor = "Loe;")
    public static class207 field438;

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "Lda;")
    public static class22 field430;

    @OriginalMember(owner = "client!wi", name = "nb", descriptor = "Lda;")
    public static class22 field444;

    @OriginalMember(owner = "client!wi", name = "ib", descriptor = "[Z")
    private volatile boolean[] field439;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)V")
    public static void method153(byte arg0) {
        field430 = null;
        field438 = null;
        field449 = null;
        int var1 = -28 / ((2 - arg0) / 41);
        field444 = null;
        field433 = null;
        field450 = null;
        field435 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)I")
    public final int method154(byte arg0, int arg1) {
        ++field454;
        if (arg0 >= -88) {
            return -66;
        } else if (!this.method179((byte) -85, arg1)) {
            return 0;
        } else if (super.field507[arg1] != null) {
            return 100;
        } else {
            return this.field439[arg1] ? 100 : class191.method1296(this.field447, arg1, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V")
    public final void method155(int arg0, int arg1) {
        ++field437;
        if (this.method179((byte) -77, arg1)) {
            if (arg0 != 255) {
                this.method158((byte[]) null, false, (byte) 116, false, 84);
            }
            class120.method874(false, this.field447, arg1);
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(III)V")
    public final void method156(int arg0, int arg1, int arg2) {
        if (arg2 == 255) {
            this.field431 = arg1;
            ++field456;
            this.field432 = arg0;
            if (this.field436 == null) {
                class93.method713(255, true, (byte) 0, this.field447, this.field432, -69994256, this);
            } else {
                class68.method521((byte) -34, this.field436, this.field447, this);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
    public final void method157(int arg0, int arg1) {
        ++field446;
        if (this.method179((byte) 93, arg1)) {
            if (this.field434 != null && this.field439 != null && this.field439[arg1]) {
                class68.method521((byte) -34, this.field434, arg1, this);
            } else {
                class93.method713(this.field447, true, (byte) 2, arg1, super.field473[arg1], -69994256, this);
            }
            int var3 = -87 % ((arg0 - -36) / 56);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([BZBZI)V")
    public final void method158(byte[] arg0, boolean arg1, byte arg2, boolean arg3, int arg4) {
        if (arg2 > 48) {
            ++field452;
            if (!arg1) {
                arg0[arg0.length + -2] = (byte) (super.field480[arg4] >> 8);
                arg0[arg0.length + -1] = (byte) super.field480[arg4];
                if (this.field434 != null) {
                    class91.method707(arg4, (byte) 123, this.field434, arg0);
                    this.field439[arg4] = true;
                }
                if (arg3) {
                    super.field507[arg4] = class223.method1528(13744, false, arg0);
                    return;
                }
            } else {
                if (this.field455) {
                    throw new RuntimeException();
                }
                if (this.field436 != null) {
                    class91.method707(this.field447, (byte) 116, this.field436, arg0);
                }
                this.method184(arg0, 45);
                this.method161(true);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(B)I")
    public final int method159(byte arg0) {
        if (arg0 != -27) {
            return 26;
        } else {
            ++field451;
            if (this.field455) {
                return 100;
            } else if (super.field507 != null) {
                return 99;
            } else {
                int var2 = class191.method1296(255, this.field447, (byte) -101);
                if (var2 >= 100) {
                    var2 = 99;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(BI)I")
    public static final int method160(byte arg0, int arg1) {
        ++field441;
        int var2 = -116 % ((49 - arg0) / 52);
        return arg1 & 1023;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lbf;Lbf;IZZZ)V")
    public class21(class47 arg0, class47 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field434 = arg0;
        this.field436 = arg1;
        this.field458 = arg5;
        this.field447 = arg2;
        class137.method949(this, this.field447, 125);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    private final void method161(boolean arg0) {
        if (!arg0) {
            this.method161(false);
        }
        ++field445;
        this.field439 = new boolean[super.field507.length];
        for (int var2 = 0; ~var2 > ~this.field439.length; ++var2) {
            this.field439[var2] = false;
        }
        if (this.field434 == null) {
            this.field455 = true;
        } else {
            this.field440 = -1;
            for (int var3 = 0; var3 < this.field439.length; ++var3) {
                if (super.field490[var3] > 0) {
                    class154.method1087(this, (byte) 124, this.field434, var3);
                    this.field440 = var3;
                }
            }
            if (this.field440 == -1) {
                this.field455 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILbf;ZI[B)V")
    public final void method162(int arg0, class47 arg1, boolean arg2, int arg3, byte[] arg4) {
        ++field448;
        if (this.field436 != arg1) {
            if (!arg2 && ~this.field440 == ~arg0) {
                this.field455 = true;
            }
            if (arg4 == null || ~arg4.length >= -3) {
                this.field439[arg0] = false;
                if (this.field458 || arg2) {
                    class93.method713(this.field447, arg2, (byte) 2, arg0, super.field473[arg0], -69994256, this);
                }
                return;
            }
            class227.field3826.reset();
            class227.field3826.update(arg4, 0, arg4.length + -2);
            int var6 = (int) class227.field3826.getValue();
            int var7 = (65280 & arg4[arg4.length + -2] << 8) + (arg4[arg4.length - 1] & 255);
            if (~super.field473[arg0] != ~var6 || super.field480[arg0] != var7) {
                this.field439[arg0] = false;
                if (this.field458 || arg2) {
                    class93.method713(this.field447, arg2, (byte) 2, arg0, super.field473[arg0], -69994256, this);
                }
                return;
            }
            this.field439[arg0] = true;
            if (arg2) {
                super.field507[arg0] = class223.method1528(13744, false, arg4);
            }
        } else {
            if (this.field455) {
                throw new RuntimeException();
            }
            if (arg4 == null) {
                class93.method713(255, true, (byte) 0, this.field447, this.field432, -69994256, this);
                return;
            }
            class227.field3826.reset();
            class227.field3826.update(arg4, 0, arg4.length);
            int var8 = (int) class227.field3826.getValue();
            if (~this.field432 != ~var8) {
                class93.method713(255, true, (byte) 0, this.field447, this.field432, -69994256, this);
                return;
            }
            class217 var9;
            try {
                var9 = new class217(class86.method683(arg4, arg3 ^ 101));
            } catch (RuntimeException var12) {
                class93.method713(255, true, (byte) 0, this.field447, this.field432, arg3 + -69994255, this);
                return;
            }
            int var10 = var9.method1487(arg3 + 256);
            if (var10 != 5 && var10 != 6) {
                class93.method713(255, true, (byte) 0, this.field447, this.field432, -69994256, this);
                return;
            }
            int var11 = 0;
            if (var10 >= 6) {
                var11 = var9.method1466((byte) -15);
            }
            if (~this.field431 != ~var11) {
                class93.method713(255, true, (byte) 0, this.field447, this.field432, -69994256, this);
                return;
            }
            this.method184(arg4, 37);
            this.method161(true);
        }
        if (arg3 != -1) {
            this.field439 = null;
        }
    }
}
