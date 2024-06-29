import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class593 {

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    private int field8045 = 0;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    private int field8043 = 0;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    private int field8051 = 1;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    private int field8047 = 1;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Lifa;")
    private class450 field8041 = new class450();

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "[Lld;")
    private class182[] field8062 = new class182[2];

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "Z")
    private boolean field8061 = true;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "Z")
    private boolean field8067 = true;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "Z")
    private boolean field8063 = false;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "Z")
    private boolean field8060 = true;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    private int field8064 = -1;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    private int field8069 = 0;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "Z")
    private boolean field8066 = true;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Lpc;")
    private class700 field8053;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Lvda;")
    private class195 field8042;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "Lvda;")
    private class195 field8055;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "Lvda;")
    private class195 field8056;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field8052;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "Lld;")
    private class182 field8059;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "Lvw;")
    private class322 field8065;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "Lvw;")
    private class322 field8068;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Z")
    private boolean field8057;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lnd;Z)V", line = 6)
    public final void method3395(class571 arg0, boolean arg1) {
        field8046++;
        arg0.field7842 = arg1;
        arg0.method3317((byte) 44);
        arg0.method2219(13630);
        this.method3400((byte) 29);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)Z", line = 19)
    private final boolean method3396(int arg0) {
        if (arg0 != 19349) {
            return true;
        }
        if (this.field8067) {
            if (this.field8065 != null) {
                this.field8065.method1921(arg0 ^ 0x4B95);
                this.field8065 = null;
            }
            if (this.field8059 != null) {
                this.field8059.method2346(10833);
                this.field8059 = null;
            }
            if (this.field8056 != null) {
                this.field8065 = new class322(this.field8053, 6402, this.field8047, this.field8051, this.field8053.field9720);
            }
            if (this.field8063) {
                this.field8059 = new class182(this.field8053, 34037, 6402, this.field8047, this.field8051);
            } else if (this.field8065 == null) {
                this.field8065 = new class322(this.field8053, 6402, this.field8047, this.field8051);
            }
            this.field8067 = false;
            this.field8060 = true;
            this.field8066 = true;
        }
        field8040++;
        if (this.field8061) {
            if (this.field8068 != null) {
                this.field8068.method1921(0);
                this.field8068 = null;
            }
            if (this.field8062[0] != null) {
                this.field8062[0].method2346(10833);
                this.field8062[0] = null;
            }
            if (this.field8062[1] != null) {
                this.field8062[1].method2346(arg0 - 8516);
                this.field8062[1] = null;
            }
            if (this.field8056 != null) {
                this.field8068 = new class322(this.field8053, this.field8064, this.field8047, this.field8051, this.field8053.field9720);
            }
            this.field8062[0] = new class182(this.field8053, 34037, this.field8064, this.field8047, this.field8051);
            this.field8062[1] = this.field8069 > 1 ? new class182(this.field8053, 34037, this.field8064, this.field8047, this.field8051) : null;
            this.field8060 = true;
            this.field8066 = true;
            this.field8061 = false;
        }
        if (this.field8060) {
            if (this.field8056 == null) {
                this.field8053.method3956(false, this.field8042);
                this.field8042.method1284(21450, 0);
                this.field8042.method1284(21450, 1);
                this.field8042.method1284(21450, 8);
                this.field8042.method1274(0, arg0 - 19349, this.field8062[0]);
                if (this.field8069 > 1) {
                    this.field8042.method1274(1, 0, this.field8062[1]);
                }
                if (this.field8063) {
                    this.field8042.method1274(8, 0, this.field8059);
                } else {
                    this.field8042.method1267(113, 8, this.field8065);
                }
                this.field8053.method3964(this.field8042, arg0 - 19350);
            } else {
                this.field8053.method3956(false, this.field8042);
                this.field8042.method1284(21450, 0);
                this.field8042.method1284(21450, 1);
                this.field8042.method1284(arg0 + 2101, 8);
                this.field8042.method1274(0, 0, this.field8062[0]);
                if (this.field8069 > 1) {
                    this.field8042.method1274(1, 0, this.field8062[1]);
                }
                if (this.field8063) {
                    this.field8042.method1274(8, 0, this.field8059);
                }
                this.field8053.method3964(this.field8042, -1);
                this.field8053.method3956(false, this.field8056);
                this.field8056.method1284(arg0 + 2101, 0);
                this.field8056.method1284(arg0 + 2101, 8);
                this.field8056.method1267(117, 0, this.field8068);
                this.field8056.method1267(124, 8, this.field8065);
                this.field8053.method3964(this.field8056, -1);
            }
            this.field8066 = true;
            this.field8060 = false;
        }
        if (this.field8066) {
            this.field8053.method3956(false, this.field8055);
            this.field8066 = !this.field8055.method1276((byte) 24);
            this.field8053.method3964(this.field8055, arg0 - 19350);
        }
        return !this.field8066;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIIII)Z", line = 154)
    public final boolean method3397(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field8044++;
        if (this.field8055 == null || this.field8041.method2724((byte) -65)) {
            return false;
        }
        if (arg0 > -113) {
            this.field8059 = null;
        }
        if (this.field8047 != arg4 || this.field8051 != arg2) {
            this.field8051 = arg2;
            this.field8047 = arg4;
            for (class379 var6 = this.field8041.method2725(37); var6 != this.field8041.field6367; var6 = var6.field4806) {
                ((class571) var6).method3309(this.field8047, this.field8051, (byte) -65);
            }
            this.field8067 = true;
            this.field8061 = true;
            this.field8060 = true;
        }
        if (!this.method3396(19349)) {
            return false;
        }
        this.field8045 = arg3;
        this.field8057 = true;
        this.field8043 = arg1;
        this.field8053.method3956(false, this.field8055);
        this.field8055.method1272(0, 18636);
        this.field8053.method3889(this.field8051 + this.field8045 - this.field8053.field9535, -1, -this.field8043);
        return true;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 199)
    public final void method3398(int arg0) {
        field8052++;
        if (!this.field8057) {
            return;
        }
        if (this.field8056 != null) {
            this.field8053.method3950((byte) -46, this.field8056);
            int var2 = 16384;
            this.field8053.method3943(this.field8042, -1297);
            this.field8056.method1278(99, 0);
            this.field8042.method1272(0, 18636);
            if (this.field8063) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field8047, this.field8051, 0, 0, this.field8047, this.field8051, var2, 9728);
            this.field8053.method3890(this.field8056, arg0 - 13700);
            this.field8053.method3968(this.field8042, -13419);
        }
        this.field8053.method3951(-128);
        this.field8053.method3888((byte) 92, 0);
        this.field8053.method3932(1, (byte) 68);
        this.field8053.method634();
        int var3 = 0;
        int var4 = 1;
        class571 var6;
        for (class571 var5 = (class571) this.field8041.method2725(arg0 - 926); var5 != null; var5 = var6) {
            var6 = (class571) this.field8041.method2726(-124);
            int var7 = var5.method3307(false);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method3303(this.field8059, this.field8062[var3], var8, (byte) -108);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field8053.method3964(this.field8042, -1);
                    this.field8053.method3889(0, -1, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field8051);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field8043, this.field8045);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field8043, this.field8051 + this.field8045);
                    OpenGL.glTexCoord2f((float) this.field8047, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field8043 + this.field8047, this.field8051 + this.field8045);
                    OpenGL.glTexCoord2f((float) this.field8047, (float) this.field8051);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field8047 + this.field8043, this.field8045);
                    OpenGL.glEnd();
                } else {
                    this.field8042.method1272(-(-var4), arg0 + 17673);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field8051);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field8051);
                    OpenGL.glTexCoord2f((float) this.field8047, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field8047, this.field8051);
                    OpenGL.glTexCoord2f((float) this.field8047, (float) this.field8051);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field8047, 0);
                    OpenGL.glEnd();
                }
                var5.method3310(var8, -31178);
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
            }
        }
        if (arg0 != 963) {
            this.method3396(124);
        }
        this.field8057 = false;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)Z", line = 304)
    public final boolean method3399(byte arg0) {
        if (arg0 <= 40) {
            this.method3396(-38);
        }
        field8058++;
        return this.field8055 != null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lpc;)V", line = 508)
    public class593(class700 arg0) {
        this.field8053 = arg0;
        if (this.field8053.field9841 && this.field8053.field9842) {
            this.field8055 = this.field8042 = new class195(this.field8053);
            if (this.field8053.field9720 > 1 && this.field8053.field9795 && this.field8053.field9864) {
                this.field8055 = this.field8056 = new class195(this.field8053);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V", line = 322)
    private final void method3400(byte arg0) {
        field8049++;
        if (arg0 != 29) {
            this.field8065 = null;
        }
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class571 var5 = (class571) this.field8041.method2725(37); var5 != null; var5 = (class571) this.field8041.method2726(arg0 ^ 0xFFFFFF9E)) {
            int var9 = var5.method3316(false);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method3307(false);
            var2 |= var5.method3304(true);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field8064 != var6) {
            this.field8064 = var6;
            this.field8061 = true;
        }
        int var7 = this.field8069 > 2 ? 2 : this.field8069;
        int var8 = var4 > 2 ? 2 : var4;
        if (var2 != this.field8063) {
            this.field8063 = var2;
            this.field8067 = true;
        }
        this.field8069 = var4;
        if (var7 != var8) {
            this.field8060 = this.field8061 = true;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V", line = 388)
    public final void method3401(byte arg0) {
        this.field8062 = null;
        this.field8059 = null;
        this.field8055 = this.field8056 = this.field8042 = null;
        this.field8065 = null;
        this.field8068 = null;
        field8050++;
        if (arg0 != -111) {
            return;
        }
        if (!this.field8041.method2724((byte) 83)) {
            for (class379 var2 = this.field8041.method2725(37); var2 != this.field8041.field6367; var2 = var2.field4806) {
                ((class571) var2).method3317((byte) 44);
            }
        }
        this.field8047 = this.field8051 = 1;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Lnd;Z)Z", line = 420)
    public final boolean method3402(class571 arg0, boolean arg1) {
        if (!arg1) {
            this.method3398(-96);
        }
        field8054++;
        if (this.field8055 != null) {
            if (arg0.method3308(84) || arg0.method3301(35632)) {
                this.field8041.method2732(arg0, 21939);
                this.method3400((byte) 29);
                if (this.method3396(19349)) {
                    if (this.field8047 != -1 && this.field8051 != -1) {
                        arg0.method3309(this.field8047, this.field8051, (byte) -114);
                    }
                    arg0.field7842 = true;
                    return true;
                }
            }
            this.method3395(arg0, false);
        }
        return false;
    }
}
