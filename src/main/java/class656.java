import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class656 implements class691 {

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "[Lpk;")
    private class200[] field9119 = new class200[9];

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    private int field9122 = 0;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    private int field9144 = -1;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Lbi;")
    private class483 field9124;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    private int field9129;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    private int field9121;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    private int field9126;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field9135;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    private int field9142;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "Luj;")
    public static class387 field9141;

    @OriginalMember(owner = "client!mj", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        field9130++;
        this.field9124.method2792(this.field9129, (byte) 33);
        super.finalize();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)V", line = 15)
    public final void method3685(int arg0, byte arg1) {
        field9145++;
        if (this.field9144 == -1) {
            throw new RuntimeException();
        }
        if (arg1 != 17) {
            field9143 = 25;
        }
        OpenGL.glReadBuffer(class224.field2985[arg0]);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 31)
    public final void method3686(boolean arg0) {
        field9127++;
        OpenGL.glBindFramebufferEXT(36160, this.field9129);
        this.field9122 |= 0x4;
        this.field9144 = this.method3696((byte) 66);
        if (!arg0) {
            this.method3688(-53, -15);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V", line = 45)
    public static void method3687(byte arg0) {
        if (arg0 != -125) {
            field9137 = -46;
        }
        field9141 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V", line = 56)
    public final void method3688(int arg0, int arg1) {
        field9117++;
        if (this.field9119[arg1] != null) {
            this.field9119[arg1].method633(-113);
        }
        this.field9126 &= ~(0x1 << arg1);
        this.field9119[arg1] = null;
        int var3 = 85 / ((16 - arg0) / 38);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 72)
    public final void method3689(byte arg0) {
        field9118++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field9122 &= 0xFFFFFFFD;
        if (arg0 == 0) {
            this.field9144 = this.method3696((byte) 38);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 86)
    public final void method3690(int arg0) {
        field9134++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field9122 &= 0xFFFFFFFB;
        this.field9144 = this.method3696((byte) 39);
        if (arg0 != 28419) {
            this.method3689((byte) -122);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V", line = 107)
    public final void method3691(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field9116++;
        this.field9122 &= 0xFFFFFFFE;
        this.field9144 = this.method3696((byte) 51);
        int var2 = 96 % ((-arg0 - 40) / 53);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 119)
    public final void method3692(int arg0) {
        int var2 = 90 / ((18 - arg0) / 51);
        OpenGL.glBindFramebufferEXT(36008, this.field9129);
        field9120++;
        this.field9122 |= 0x1;
        this.field9144 = this.method3696((byte) 118);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)V", line = 132)
    public final void method3693(int arg0, int arg1) {
        field9125++;
        if (~this.field9144 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class224.field2985[arg1]);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lkk;III)V", line = 146)
    public final void method3694(class193 arg0, int arg1, int arg2, int arg3) {
        this.method3701(arg3, arg0, 0, arg2, (byte) -99);
        if (arg1 < -33) {
            field9132++;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILmt;)V", line = 157)
    public final void method3695(int arg0, int arg1, class400 arg2) {
        field9136++;
        if (this.field9144 == -1) {
            throw new RuntimeException();
        }
        int var4 = arg0 << arg1;
        if ((~var4 & this.field9126) == 0) {
            this.field9121 = arg2.field5082;
            this.field9142 = arg2.field5093;
        } else if (this.field9121 != arg2.field5082 || this.field9142 != arg2.field5093) {
            throw new RuntimeException();
        }
        arg2.method2239(36161, class224.field2985[arg1], this.field9144);
        this.field9119[arg1] = arg2;
        this.field9126 |= var4;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)I", line = 189)
    private final int method3696(byte arg0) {
        field9135++;
        if (arg0 <= 37) {
            return 74;
        } else if ((this.field9122 & 0x4) != 0) {
            return 36160;
        } else if ((this.field9122 & 0x2) == 0) {
            return (this.field9122 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lbi;)V", line = 396)
    public class656(class483 arg0) {
        if (!arg0.field6861) {
            throw new IllegalStateException("");
        }
        this.field9124 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class678.field9478, 0);
        this.field9129 = class678.field9478[0];
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V", line = 224)
    public final void method3697(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field9129);
        field9139++;
        this.field9122 |= 0x2;
        if (arg0 == -102) {
            this.field9144 = this.method3696((byte) 107);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lbq;III)V", line = 237)
    private final void method3698(class293 arg0, int arg1, int arg2, int arg3) {
        field9133++;
        if (this.field9144 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if ((~var5 & this.field9126) == 0) {
            this.field9121 = arg0.field3856;
            this.field9142 = arg0.field3862;
        } else if (this.field9121 != arg0.field3856 || this.field9142 != arg0.field3862) {
            throw new RuntimeException();
        }
        arg0.method1760(class224.field2985[arg2], 21271, this.field9144, arg1);
        if (arg3 < 31) {
            method3699(87);
        }
        this.field9119[arg2] = arg0;
        this.field9126 |= var5;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V", line = 269)
    public static final void method3699(int arg0) {
        while (true) {
            if (class609.field8448.method1237((byte) -107, class440.field5868) >= 15) {
                int var1 = class609.field8448.method1235(15, -4080);
                if (var1 != 32767) {
                    boolean var2 = false;
                    class592 var3 = (class592) class207.field2745.method1160((long) var1, 124);
                    if (var3 == null) {
                        class733 var4 = new class733();
                        var4.field189 = var1;
                        var3 = new class592(var4);
                        class207.field2745.method1153(var3, (long) var1, -1);
                        var2 = true;
                        class638.field8801[class54.field752++] = var3;
                    }
                    class733 var5 = var3.field8280;
                    class751.field10483[class646.field8947++] = var1;
                    var5.field231 = class194.field2656;
                    if (var5.field10192 != null && var5.field10192.method972(27961)) {
                        class408.method2274(var5, (byte) -23);
                    }
                    int var6 = class609.field8448.method1235(5, -4080);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class609.field8448.method1235(2, -4080);
                    int var8 = class609.field8448.method1235(1, -4080);
                    int var9 = (class609.field8448.method1235(3, -4080) + 4 & 0x5B400007) << 11;
                    int var10 = class609.field8448.method1235(5, -4080);
                    if (var10 > 15) {
                        var10 -= 32;
                    }
                    var5.method4090(class300.field3941.method3859(class609.field8448.method1235(14, -4080), (byte) -82), 0);
                    int var11 = class609.field8448.method1235(1, -4080);
                    if (var11 == 1) {
                        class414.field5284[class28.field502++] = var1;
                    }
                    var5.method92(var5.field10192.field1918, -112);
                    var5.field253 = var5.field10192.field1913 << 3;
                    if (var2) {
                        var5.method86(-7554, true, var9);
                    }
                    var5.method4091(var5.method82((byte) 49), var8 == 1, class380.field4847.field264[0] + var10, var7, class380.field4847.field260[0] + var6, (byte) 66);
                    if (var5.field10192.method972(27961)) {
                        class718.method4016(null, null, var5, (byte) 85, 0, var5.field5796, var5.field260[0], var5.field264[0]);
                    }
                    continue;
                }
            }
            field9128++;
            class609.field8448.method1234((byte) 63);
            if (arg0 < 22) {
                field9143 = -91;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILbq;)V", line = 350)
    public final void method3700(int arg0, int arg1, class293 arg2) {
        this.method3698(arg2, 0, arg1, 43);
        int var4 = 126 / ((18 - arg0) / 43);
        field9140++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILkk;IIB)V", line = 367)
    private final void method3701(int arg0, class193 arg1, int arg2, int arg3, byte arg4) {
        field9131++;
        if (this.field9144 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg3;
        if (arg4 != -99) {
            field9141 = null;
        }
        if ((this.field9126 & ~var6) == 0) {
            this.field9142 = arg1.field2643;
            this.field9121 = arg1.field2643;
        } else if (this.field9121 != arg1.field2643 || this.field9142 != arg1.field2643) {
            throw new RuntimeException();
        }
        arg1.method1288(this.field9144, class224.field2985[arg3], arg0, arg2, (byte) -114);
        this.field9119[arg3] = arg1;
        this.field9126 |= var6;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)Z", line = 409)
    public final boolean method3702(int arg0) {
        if (arg0 != -24937) {
            this.method3691(1);
        }
        field9138++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field9144);
        return var2 == 36053;
    }
}
