import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class318 extends class55 {

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "Lok;")
    private class257 field4282;

    @OriginalMember(owner = "client!iw", name = "s", descriptor = "Lac;")
    private class541 field4286;

    @OriginalMember(owner = "client!iw", name = "C", descriptor = "I")
    public int field4296;

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "[I")
    private int[] field4293;

    @OriginalMember(owner = "client!iw", name = "r", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!iw", name = "E", descriptor = "I")
    public int field4298;

    @OriginalMember(owner = "client!iw", name = "v", descriptor = "I")
    public int field4289;

    @OriginalMember(owner = "client!iw", name = "w", descriptor = "F")
    public float field4290;

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "Lqs;")
    private class604 field4278;

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!iw", name = "u", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!iw", name = "x", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!iw", name = "y", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!iw", name = "A", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!iw", name = "B", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!iw", name = "D", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!iw", name = "F", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!iw", name = "p", descriptor = "Lgk;")
    private class475 field4283;

    @OriginalMember(owner = "client!iw", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4287;

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field4279;

    @OriginalMember(owner = "client!iw", name = "q", descriptor = "[Ljha;")
    public static class695[] field4284;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V", line = 6)
    public static void method1900(int arg0) {
        if (arg0 == -22268) {
            field4284 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IZ)V", line = 16)
    public final void method1901(int arg0, boolean arg1) {
        if (!arg1) {
            method1905(-17);
        }
        this.field4287.method3783(arg0 * 4 + 3);
        field4281++;
        this.field4287.method3793(-1);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IBFII)V", line = 29)
    public final void method1902(int arg0, byte arg1, float arg2, int arg3, int arg4) {
        field4297++;
        if (arg1 <= 64) {
            return;
        }
        if (this.field4285 != -1) {
            class335 var6 = this.field4286.field636.method925(this.field4285, -28755);
            int var7 = var6.field4534 & 0xFF;
            if (var7 != 0 && var6.field4522 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg0 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field4533 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg3 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var12 << 8 & 0xFF00CA) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        this.field4287.method3783(arg4 * 4);
        if (arg2 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = (arg3 & 0xFF54) >> 8;
            int var17 = (int) ((float) var15 * arg2);
            int var18 = arg3 & 0xFF;
            int var19 = (int) ((float) var16 * arg2);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var20 = (int) ((float) var18 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var19 << 8 | var17 << 16 | var20;
        }
        this.field4287.method3793((byte) (arg3 >> 16));
        this.field4287.method3793((byte) (arg3 >> 8));
        this.field4287.method3793((byte) arg3);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "([IBI)V", line = 144)
    public final void method1903(int[] arg0, byte arg1, int arg2) {
        if (arg1 != 98) {
            return;
        }
        field4280++;
        int var4 = 0;
        class183 var5 = this.field4286.field7657;
        var5.field8520 = 0;
        if (this.field4286.field7608) {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg0[var12];
                short[] var14 = this.field4282.field3336[var13];
                int var15 = this.field4293[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method3423(var14[var17++] & 0xFFFF, arg1 + 1571862790);
                            var4++;
                            var5.method3423(var14[var17++] & 0xFFFF, arg1 + 1571862790);
                            var4++;
                            var5.method3423(var14[var17++] & 0xFFFF, 1571862888);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg0[var6];
                int var8 = this.field4293[var7];
                short[] var9 = this.field4282.field3336[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var5.method3446(var9[var11++] & 0xFFFF, 4);
                            var4++;
                            var4++;
                            var5.method3446(var9[var11++] & 0xFFFF, 4);
                            var5.method3446(var9[var11++] & 0xFFFF, 4);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field4278.method3342((byte) -47, var5.field8529, var5.field8520, 5123);
        this.field4286.method3011(this.field4283, this.field4282.field3369, this.field4282.field3378, this.field4282.field3376, arg1 - 98);
        this.field4286.method3040(this.field4285, (this.field4282.field3339 & 0x8) != 0, (this.field4282.field3339 & 0x7) != 0, (byte) -70);
        if (this.field4286.field7577) {
            this.field4286.method427(Integer.MAX_VALUE, this.field4289, this.field4296, this.field4298);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field4290, 1.0F / this.field4290, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field4286.method3011(this.field4283, this.field4282.field3369, this.field4282.field3378, this.field4282.field3376, 0);
        this.field4286.method3008(var4, 4, this.field4278, false, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZI)V", line = 268)
    public final void method1904(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        field4292++;
        this.field4287.method3795();
        class738 var3 = this.field4286.method2986(4, (byte) 78, this.field4279, false, arg1 * 4);
        this.field4283 = new class475(var3, 5121, 4, 0);
        this.field4279 = null;
        this.field4287 = null;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V", line = 284)
    public static final void method1905(int arg0) {
        class719.field10063 = new class563(8);
        field4288++;
        class577.field8099 = arg0;
        for (class550 var1 = (class550) class146.field1891.method113((byte) 15); var1 != null; var1 = (class550) class146.field1891.method119(false)) {
            var1.method3129();
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(BII)Z", line = 304)
    public static final boolean method1906(byte arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            method1900(46);
        }
        field4295++;
        return (arg1 & 0x60000) != 0 | class595.method3294(arg1, arg2, 16) || class662.method3746((byte) 115, arg1, arg2);
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V", line = 316)
    public static final void method1907(int arg0) {
        field4299++;
        if (class78.method590((byte) 57)) {
            if (class73.field784 == null) {
                class568.method3192((byte) -43);
            }
            class751.field10414 = true;
            class586.field8201 = 0;
        }
        if (arg0 != 0) {
            field4284 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IBII)V", line = 336)
    public final void method1908(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > 117) {
            this.field4293[this.field4282.field3727 * arg2 + arg3] = class344.method2020(this.field4293[this.field4282.field3727 * arg2 + arg3], 0x1 << arg0);
            field4291++;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IB)V", line = 355)
    public final void method1909(int arg0, byte arg1) {
        field4294++;
        this.field4279 = this.field4286.field7534.method3778(arg0 * 4, true);
        if (arg1 == -64) {
            this.field4287 = new Stream(this.field4279);
        }
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lok;IIIII)V", line = 369)
    public class318(class257 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4282 = arg0;
        this.field4286 = this.field4282.field3352;
        this.field4296 = arg4;
        this.field4293 = new int[this.field4282.field3728 * this.field4282.field3727];
        this.field4285 = arg1;
        this.field4298 = arg5;
        this.field4289 = arg3;
        this.field4290 = arg2;
        this.field4278 = new class604(this.field4286, 5123, null, 1);
    }
}
