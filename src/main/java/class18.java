import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 extends class8 {

    @OriginalMember(owner = "client!cc", name = "fc", descriptor = "Loa;")
    private static class98 field377 = class38.method349(255, "Loaded wordpack");

    @OriginalMember(owner = "client!cc", name = "cc", descriptor = "Loa;")
    private static class98 field374 = class38.method349(255, "level)2");

    @OriginalMember(owner = "client!cc", name = "hc", descriptor = "Loa;")
    public static class98 field379 = field377;

    @OriginalMember(owner = "client!cc", name = "lc", descriptor = "Loa;")
    public static class98 field383 = field374;

    @OriginalMember(owner = "client!cc", name = "oc", descriptor = "Ln;")
    public static class90 field386 = new class90(50);

    @OriginalMember(owner = "client!cc", name = "xc", descriptor = "I")
    public static int field395 = 0;

    @OriginalMember(owner = "client!cc", name = "Cc", descriptor = "Loa;")
    private static class98 field400 = class38.method349(255, "Your account is already logged in)3");

    @OriginalMember(owner = "client!cc", name = "Ac", descriptor = "Loa;")
    private static class98 field398 = class38.method349(255, "Hidden");

    @OriginalMember(owner = "client!cc", name = "yc", descriptor = "Loa;")
    public static class98 field396 = class38.method349(255, ":  ");

    @OriginalMember(owner = "client!cc", name = "Bc", descriptor = "Loa;")
    public static class98 field399 = field398;

    @OriginalMember(owner = "client!cc", name = "zc", descriptor = "Loa;")
    public static class98 field397 = field400;

    @OriginalMember(owner = "client!cc", name = "Dc", descriptor = "Loa;")
    private static class98 field401 = class38.method349(255, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!cc", name = "uc", descriptor = "Loa;")
    public static class98 field392 = field401;

    @OriginalMember(owner = "client!cc", name = "dc", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!cc", name = "ec", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!cc", name = "gc", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!cc", name = "jc", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!cc", name = "kc", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!cc", name = "mc", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!cc", name = "nc", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!cc", name = "pc", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!cc", name = "qc", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!cc", name = "rc", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "client!cc", name = "sc", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!cc", name = "tc", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!cc", name = "wc", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!cc", name = "ic", descriptor = "Lqa;")
    private class111 field380;

    @OriginalMember(owner = "client!cc", name = "vc", descriptor = "Lve;")
    public static class145 field393;

    @OriginalMember(owner = "client!cc", name = "Ec", descriptor = "[I")
    public static int[] field402;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(IZ)V")
    public static final void method168(int arg0, boolean arg1) {
        ++field390;
        if (~(class73.field1536.field3657 >> 7) == ~class44.field1009 && ~(class73.field1536.field3667 >> 7) == ~class90.field2055) {
            class44.field1009 = 0;
        }
        int var2 = class131.field3082;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; ~var3 > ~var2; ++var3) {
            int var4;
            class55 var5;
            if (arg1) {
                var4 = 33538048;
                var5 = class73.field1536;
            } else {
                var5 = class33.field832[class65.field1394[var3]];
                var4 = class65.field1394[var3] << 14;
            }
            if (var5 != null && var5.method450(-2289)) {
                var5.field1229 = false;
                int var6 = var5.field3657 >> 7;
                if ((class94.field2151 && ~class131.field3082 < -51 || class131.field3082 > 200) && !arg1 && var5.field3655 == var5.field3626) {
                    var5.field1229 = true;
                }
                int var7 = var5.field3667 >> 7;
                if (~var6 <= -1 && var6 < 104 && ~var7 <= -1 && ~var7 > -105) {
                    if (var5.field1216 != null && var5.field1232 <= class119.field2680 && ~var5.field1221 < ~class119.field2680) {
                        var5.field1229 = false;
                        var5.field1223 = class31.method305(-111, var5.field3667, class114.field2572, var5.field3657);
                        class138.field3373.method264(class114.field2572, var5.field3657, var5.field3667, var5.field1223, 60, var5, var5.field3620, var4, var5.field1225, var5.field1206, var5.field1237, var5.field1224);
                    } else {
                        if (~(var5.field3657 & 127) == -65 && ~(var5.field3667 & 127) == -65) {
                            if (class5.field76[var6][var7] == class127.field2854) {
                                continue;
                            }
                            class5.field76[var6][var7] = class127.field2854;
                        }
                        var5.field1223 = class31.method305(-69, var5.field3667, class114.field2572, var5.field3657);
                        class138.field3373.method256(class114.field2572, var5.field3657, var5.field3667, var5.field1223, 60, var5, var5.field3620, var4, var5.field3639);
                    }
                }
            }
        }
        if (arg0 != 2879) {
            field399 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "(I)V")
    public static void method169(int arg0) {
        field402 = null;
        field374 = null;
        field398 = null;
        field377 = null;
        field400 = null;
        field397 = null;
        field393 = null;
        field379 = null;
        field383 = null;
        field401 = null;
        field396 = null;
        field392 = null;
        if (arg0 != -13764) {
            method169(-15);
        }
        field386 = null;
        field399 = null;
    }

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "(I)V")
    public final void method170(int arg0) {
        super.field182 = (this.field389 - -7) / 8;
        ++field384;
        if (arg0 != 33538048) {
            this.method178(0, -27);
        }
    }

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "(B)I")
    public final int method171(byte arg0) {
        if (arg0 <= 27) {
            return 120;
        } else {
            ++field391;
            return 255 & super.field132[super.field182++] + -this.field380.method905(115);
        }
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "(II)I")
    public static int method172(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZB)V")
    public static final void method173(boolean arg0, byte arg1) {
        ++field387;
        int var2 = 49 / ((-19 - arg1) / 50);
        if (class78.field1706 != null) {
            try {
                class8 var3 = new class8(4);
                var3.method95(arg0 ? 2 : 3, true);
                var3.method74(0, (byte) -35);
                class78.field1706.method278(var3.field132, (byte) 63, 4, 0);
            } catch (IOException var5) {
                try {
                    class78.field1706.method283(-30232);
                } catch (Exception var4) {
                }
                ++class36.field882;
                class78.field1706 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(Z)V")
    public final void method174(boolean arg0) {
        this.field389 = super.field182 * 8;
        if (arg0) {
            method168(-113, false);
        }
        ++field381;
    }

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "(II)I")
    public final int method175(int arg0, int arg1) {
        ++field378;
        int var3 = this.field389 >> 3;
        int var4 = 0;
        int var5 = -(this.field389 & 7) + 8;
        int var6 = 27 / ((arg0 - -85) / 33);
        this.field389 += arg1;
        while (arg1 > var5) {
            var4 += (super.field132[var3++] & class71.field1445[var5]) << arg1 - var5;
            arg1 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg1 != var5) {
            var7 = (super.field132[var3] >> -arg1 + var5 & class71.field1445[arg1]) + var4;
        } else {
            var7 = (class71.field1445[var5] & super.field132[var3]) + var4;
        }
        return var7;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[I)V")
    public final void method176(int arg0, int[] arg1) {
        this.field380 = new class111(arg1);
        if (arg0 > 44) {
            ++field385;
        }
    }

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "(II)V")
    public final void method177(int arg0, int arg1) {
        if (arg0 != 6624) {
            this.method178(-73, 124);
        }
        ++field376;
        super.field132[super.field182++] = (byte) (arg1 + this.field380.method905(-46));
    }

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "(II)I")
    public final int method178(int arg0, int arg1) {
        ++field375;
        return arg0 != 1833460135 ? -128 : arg1 * 8 + -this.field389;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method179(KeyEvent arg0, int arg1) {
        ++field382;
        int var2 = arg0.getKeyChar();
        if (arg1 != -65) {
            field399 = null;
        }
        if (~var2 >= -1 || ~var2 <= -257) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
    public class18(int arg0) {
        super(arg0);
    }
}
