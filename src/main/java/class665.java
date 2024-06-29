import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class665 implements class620 {

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
    private int field9178 = 0;

    @OriginalMember(owner = "client!eba", name = "B", descriptor = "I")
    private int field9188 = -1;

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "[Lfca;")
    private class635[] field9180 = new class635[9];

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "Ldw;")
    private class664 field9174;

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "I")
    private int field9186;

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "Lkr;")
    public static class602 field9170 = new class602(36, -2);

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public static int field9162;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    private int field9163;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "I")
    public static int field9171;

    @OriginalMember(owner = "client!eba", name = "l", descriptor = "I")
    public static int field9172;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
    private int field9175;

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!eba", name = "u", descriptor = "I")
    private int field9181;

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!eba", name = "w", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!eba", name = "x", descriptor = "I")
    public static int field9184;

    @OriginalMember(owner = "client!eba", name = "y", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!eba", name = "A", descriptor = "I")
    public static int field9187;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)I")
    private final int method3753(byte arg0) {
        field9172++;
        if ((this.field9178 & 0x4) != 0) {
            return 36160;
        } else if ((this.field9178 & 0x2) == 0) {
            if (arg0 != 29) {
                this.field9175 = 12;
            }
            return (this.field9178 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILbca;I)V")
    public final void method3754(int arg0, class473 arg1, int arg2) {
        field9167++;
        if (this.field9188 == -1) {
            throw new RuntimeException();
        }
        if (arg0 < 15) {
            this.method3765(-128, (byte) -9, null);
        }
        int var4 = 0x1 << arg2;
        if ((~var4 & this.field9175) == 0) {
            this.field9181 = arg1.field6545;
            this.field9163 = arg1.field6546;
        } else if (this.field9181 != arg1.field6545 || this.field9163 != arg1.field6546) {
            throw new RuntimeException();
        }
        arg1.method2870((byte) -72, this.field9188, class499.field6976[arg2]);
        this.field9180[arg2] = arg1;
        this.field9175 |= var4;
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(Z)V")
    public final void method3501(boolean arg0) {
        field9179++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        if (arg0) {
            this.field9178 &= 0xFFFFFFFD;
            this.field9188 = this.method3753((byte) 29);
        }
    }

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "(I)V")
    public final void method3503(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        if (arg0 == -19510) {
            field9176++;
            this.field9178 &= 0xFFFFFFFE;
            this.field9188 = this.method3753((byte) 29);
        }
    }

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "(I)Z")
    public final boolean method3755(int arg0) {
        if (arg0 == 0) {
            field9171++;
            int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field9188);
            return var2 == 36053;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
    public final void method3499(int arg0) {
        field9164++;
        OpenGL.glBindFramebufferEXT(36008, this.field9186);
        this.field9178 |= 0x1;
        if (arg0 != 31714) {
            method3760(-30, 74, 30, 27L);
        }
        this.field9188 = this.method3753((byte) 29);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZ)V")
    public final void method3756(int arg0, boolean arg1) {
        field9182++;
        if (this.field9188 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class499.field6976[arg0]);
        if (!arg1) {
            this.method3755(73);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)V")
    public final void method3500(boolean arg0) {
        if (arg0) {
            this.field9181 = -24;
        }
        OpenGL.glBindFramebufferEXT(36009, this.field9186);
        field9183++;
        this.field9178 |= 0x2;
        this.field9188 = this.method3753((byte) 29);
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(IZ)V")
    public final void method3757(int arg0, boolean arg1) {
        if (this.field9180[arg0] != null) {
            this.field9180[arg0].method2235(0);
        }
        field9166++;
        this.field9175 &= ~(0x1 << arg0);
        this.field9180[arg0] = null;
        if (arg1) {
            this.field9181 = 33;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BILifa;I)V")
    public final void method3758(byte arg0, int arg1, class413 arg2, int arg3) {
        this.method3764(arg3, arg2, arg1, 126, 0);
        int var5 = 11 % ((79 - arg0) / 33);
        field9185++;
    }

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "(I)V")
    public final void method3504(int arg0) {
        int var2 = -99 / ((31 - arg0) / 59);
        field9177++;
        OpenGL.glBindFramebufferEXT(36160, this.field9186);
        this.field9178 |= 0x4;
        this.field9188 = this.method3753((byte) 29);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)I")
    public static int method3759(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIJ)V")
    public static final void method3760(int arg0, int arg1, int arg2, long arg3) {
        field9187++;
        int var5 = (int) arg3 >> 14 & 0x1F;
        int var6 = ((int) arg3 & 0x31201E) >> 20;
        if (arg1 != 11) {
            return;
        }
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class21.method112(arg0, true, 1, arg2, var6, 0, 0, 0, var5);
            return;
        }
        class220 var8 = class20.field192.method716(6, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field2938;
            var10 = var8.field2887;
        } else {
            var9 = var8.field2887;
            var10 = var8.field2938;
        }
        int var11 = var8.field2969;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class21.method112(arg0, true, arg1 ^ 0xA, arg2, 0, var9, var10, var11, 0);
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(II)V")
    public final void method3761(int arg0, int arg1) {
        field9161++;
        if (this.field9188 == arg1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class499.field6976[arg0]);
    }

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "(I)V")
    public static void method3762(int arg0) {
        field9170 = null;
        if (arg0 < 34) {
            field9170 = null;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lfba;BII)V")
    private final void method3763(class350 arg0, byte arg1, int arg2, int arg3) {
        field9168++;
        if (this.field9188 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if ((this.field9175 & ~var5) == 0) {
            this.field9163 = arg0.field4972;
            this.field9181 = arg0.field4964;
        } else if (this.field9181 != arg0.field4964 || this.field9163 != arg0.field4972) {
            throw new RuntimeException();
        }
        arg0.method2237(arg3, class499.field6976[arg2], this.field9188, 15949);
        this.field9180[arg2] = arg0;
        int var6 = -11 / ((-arg1 - 79) / 42);
        this.field9175 |= var5;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILifa;III)V")
    private final void method3764(int arg0, class413 arg1, int arg2, int arg3, int arg4) {
        field9173++;
        if (this.field9188 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg0;
        if ((~var6 & this.field9175) == 0) {
            this.field9181 = arg1.field5856;
            this.field9163 = arg1.field5856;
        } else if (this.field9181 != arg1.field5856 || this.field9163 != arg1.field5856) {
            throw new RuntimeException();
        }
        if (arg3 < 102) {
            this.method3758((byte) 67, 8, null, 81);
        }
        arg1.method2578(arg4, (byte) -90, class499.field6976[arg0], arg2, this.field9188);
        this.field9180[arg0] = arg1;
        this.field9175 |= var6;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IBLfba;)V")
    public final void method3765(int arg0, byte arg1, class350 arg2) {
        this.method3763(arg2, (byte) 112, arg0, 0);
        if (arg1 > -47) {
            this.field9186 = 90;
        }
        field9169++;
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V")
    public final void method3502(int arg0) {
        field9184++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field9178 &= 0xFFFFFFFB;
        this.field9188 = this.method3753((byte) 29);
        if (arg0 != 24193) {
            this.method3764(-107, null, -85, -99, -66);
        }
    }

    @OriginalMember(owner = "client!eba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field9162++;
        this.field9174.method3719((byte) 111, this.field9186);
        super.finalize();
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Ldw;)V")
    public class665(class664 arg0) {
        if (!arg0.field9108) {
            throw new IllegalStateException("");
        }
        this.field9174 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class269.field3934, 0);
        this.field9186 = class269.field3934[0];
    }
}
