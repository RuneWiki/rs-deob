import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class242 {

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[B")
    private byte[] field4223 = new byte[4];

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lei;")
    private class232 field4228;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    private int field4224;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "J")
    private long field4234;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lr;")
    private static class66 field4220 = class93.method641(43, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lr;")
    public static class66 field4229 = class93.method641(43, " )2>");

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lr;")
    public static class66 field4232 = field4220;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field4233 = 0;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lr;")
    public static class66 field4236 = class93.method641(43, ")4a=");

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lqc;")
    public static class245 field4227 = new class245(500);

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field4240 = 0;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    private int field4222;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    private int field4235;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "Lsg;")
    public static class247 field4238;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field4239;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Z")
    public static boolean field4225;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "[B")
    private byte[] field4230;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[Lpc;")
    public static class29[] field4231;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "[[[B")
    public static byte[][][] field4241;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)[B")
    public final byte[] method1594(byte arg0) throws IOException {
        field4226++;
        if (class3.method13(17161) > this.field4234) {
            throw new IOException("fdt");
        } else if (arg0 <= 15) {
            return null;
        } else {
            if (this.field4224 == 0) {
                if (this.field4228.field4066 == 2) {
                    throw new IOException("fds");
                }
                if (this.field4228.field4066 == 1) {
                    this.field4224 = 1;
                    this.field4239 = (DataInputStream) this.field4228.field4069;
                }
            }
            if (this.field4224 == 1) {
                int var2 = this.field4239.available();
                if (var2 > 0) {
                    if ((this.field4222 + var2) > 4) {
                        var2 = 4 - this.field4222;
                    }
                    this.field4222 += this.field4239.read(this.field4223, this.field4222, var2);
                    if (this.field4222 == 4) {
                        int var3 = (new class249(this.field4223)).method1652(-5528);
                        this.field4224 = 2;
                        this.field4230 = new byte[var3];
                    }
                }
            }
            if (this.field4224 == 2) {
                int var4 = this.field4239.available();
                if (var4 > 0) {
                    if ((this.field4235 + var4) > this.field4230.length) {
                        var4 = this.field4230.length - this.field4235;
                    }
                    this.field4235 += this.field4239.read(this.field4230, this.field4235, var4);
                    if (this.field4230.length == this.field4235) {
                        return this.field4230;
                    }
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1595(int arg0, boolean arg1) {
        if (arg1) {
            field4221++;
            return ((arg0 & 0x11196C85) >> 28) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILeh;Lub;IIILfa;)V")
    public static final void method1596(int arg0, int arg1, class37 arg2, class231 arg3, int arg4, int arg5, int arg6, class45 arg7) {
        if (arg0 != 19395) {
            method1597((byte) 123);
        }
        class217 var8 = new class217();
        var8.field3746 = arg5 * 128;
        var8.field3721 = arg6;
        field4237++;
        var8.field3733 = arg1 * 128;
        if (arg3 != null) {
            var8.field3735 = arg3.field4028;
            var8.field3724 = arg3.field4015;
            var8.field3739 = arg3.field4008 * 128;
            var8.field3741 = arg3.field4033;
            int var9 = arg3.field4020;
            var8.field3727 = arg3;
            var8.field3726 = arg3.field3997;
            int var10 = arg3.field4021;
            if (arg4 == 1 || arg4 == 3) {
                var10 = arg3.field4020;
                var9 = arg3.field4021;
            }
            var8.field3744 = (arg5 + var10) * 128;
            var8.field3720 = (arg1 + var9) * 128;
            if (arg3.field4027 != null) {
                var8.field3743 = true;
                var8.method1397(arg0 + 12111);
            }
            if (var8.field3735 != null) {
                var8.field3736 = var8.field3726 + ((int) (Math.random() * (double) (var8.field3741 - var8.field3726)));
            }
            class259.field4539.method866(var8, true);
        } else if (arg2 != null) {
            class206 var11 = arg2.field548;
            var8.field3742 = arg2;
            if (var11.field3541 != null) {
                var8.field3743 = true;
                var11 = var11.method1339(arg0 ^ 0xFFFFB461);
            }
            if (var11 != null) {
                var8.field3744 = (var11.field3561 + arg5) * 128;
                var8.field3720 = (arg1 + var11.field3561) * 128;
                var8.field3724 = class145.method995(arg2, false);
                var8.field3739 = var11.field3573 * 128;
            }
            class222.field3784.method866(var8, true);
        } else if (arg7 != null) {
            var8.field3720 = (arg7.field2060 + arg1) * 128;
            var8.field3744 = (arg7.field2060 + arg5) * 128;
            var8.field3732 = arg7;
            var8.field3724 = class40.method255(arg7, arg0 ^ 0xFFFFAE19);
            var8.field3739 = arg7.field828 * 128;
            class52.field921.method1380((byte) 119, var8, arg7.field815.method479(10908));
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lik;Ljava/net/URL;)V")
    public class242(class117 arg0, URL arg1) {
        this.field4228 = arg0.method774(arg1, 0);
        this.field4224 = 0;
        this.field4234 = class3.method13(17161) + 30000L;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
    public static void method1597(byte arg0) {
        field4238 = null;
        field4229 = null;
        field4220 = null;
        field4227 = null;
        field4231 = null;
        field4232 = null;
        int var1 = 59 % ((-arg0 - 19) / 34);
        field4241 = null;
        field4236 = null;
    }
}
