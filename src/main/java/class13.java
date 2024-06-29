import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 extends class396 {

    @OriginalMember(owner = "client!kh", name = "Lb", descriptor = "I")
    public static int field142 = -1;

    @OriginalMember(owner = "client!kh", name = "Db", descriptor = "Ljc;")
    public static class305 field134 = new class305("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!kh", name = "Cb", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!kh", name = "Eb", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!kh", name = "Fb", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!kh", name = "Gb", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!kh", name = "Hb", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!kh", name = "Jb", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!kh", name = "Kb", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!kh", name = "Mb", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!kh", name = "Nb", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!kh", name = "Ob", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!kh", name = "Pb", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!kh", name = "Ib", descriptor = "Lrp;")
    private class302 field139;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "(II)V", line = 3)
    public static final void method72(int arg0, int arg1) {
        if (arg1 == 12335) {
            ++field138;
            class184 var2 = class277.method1682(arg0, 7, -83);
            var2.method1075((byte) 105);
        }
    }

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "(I)V", line = 18)
    public final void method73(int arg0) {
        if (arg0 > 37) {
            ++field135;
            this.field141 = super.field5729 * 8;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V", line = 29)
    public class13(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(IB)V", line = 32)
    public final void method74(int arg0, byte arg1) {
        ++field133;
        if (arg1 > 2) {
            super.field5761[super.field5729++] = (byte) (arg0 + this.field139.method1798(256));
        }
    }

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "(I)I", line = 48)
    public final int method75(int arg0) {
        ++field136;
        if (arg0 != 9256) {
            field142 = -61;
        }
        int var2 = super.field5761[super.field5729++] - this.field139.method1798(256) & 255;
        return var2 < 128 ? var2 : (var2 + -128 << 8) + (255 & super.field5761[super.field5729++] - this.field139.method1798(256));
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(ZI)I", line = 64)
    public final int method76(boolean arg0, int arg1) {
        if (arg0) {
            this.field141 = -35;
        }
        ++field143;
        return arg1 * 8 - this.field141;
    }

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "(I)V", line = 80)
    public static void method77(int arg0) {
        field134 = null;
        if (arg0 >= -108) {
            method77(51);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I[I)V", line = 95)
    public final void method78(int arg0, int[] arg1) {
        this.field139 = new class302(arg1);
        ++field140;
        if (arg0 >= -56) {
            this.method74(15, (byte) -6);
        }
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(Z)V", line = 108)
    public final void method79(boolean arg0) {
        super.field5729 = (this.field141 + 7) / 8;
        ++field144;
        if (arg0) {
            this.method81(true);
        }
    }

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "(II)I", line = 119)
    public final int method80(int arg0, int arg1) {
        ++field137;
        int var3 = this.field141 >> 3;
        int var4 = -(this.field141 & 7) + 8;
        int var5 = 0;
        this.field141 += arg0;
        if (arg1 != 255) {
            return -112;
        } else {
            while (arg0 > var4) {
                var5 += (super.field5761[var3++] & class312.field4169[var4]) << -var4 + arg0;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg0 != var4) {
                var6 = (super.field5761[var3] >> var4 - arg0 & class312.field4169[arg0]) + var5;
            } else {
                var6 = (class312.field4169[var4] & super.field5761[var3]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(Z)Z", line = 155)
    public final boolean method81(boolean arg0) {
        if (arg0) {
            this.field141 = -74;
        }
        ++field145;
        int var2 = super.field5761[super.field5729] - this.field139.method1799((byte) 119) & 255;
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "(II)I", line = 171)
    public static final int method82(int arg0, int arg1) {
        ++field132;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 + -61440;
        int var4 = (arg1 * var3 >> 12) + arg0;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I[BII)V", line = 192)
    public final void method83(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 < -42) {
            for (int var5 = 0; arg2 > var5; ++var5) {
                arg1[arg0 + var5] = (byte) (super.field5761[super.field5729++] + -this.field139.method1798(256));
            }
            ++field146;
        }
    }
}
