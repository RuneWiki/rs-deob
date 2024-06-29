import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public abstract class class308 implements class126 {

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    private int field4242 = -1;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
    private int field4252 = 0;

    @OriginalMember(owner = "client!vu", name = "r", descriptor = "I")
    private int field4259;

    @OriginalMember(owner = "client!vu", name = "w", descriptor = "Z")
    private boolean field4264;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "Ltba;")
    public class147 field4249;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field4251 = 0;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    private int field4247;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!vu", name = "s", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!vu", name = "t", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!vu", name = "u", descriptor = "I")
    private int field4262;

    @OriginalMember(owner = "client!vu", name = "x", descriptor = "Lf;")
    public static class702 field4265;

    @OriginalMember(owner = "client!vu", name = "v", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field4263;

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "Ljava/lang/Thread;")
    public static Thread field4258;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)V", line = 3)
    public static void method1864(int arg0) {
        if (arg0 != 0) {
            field4251 = -38;
        }
        field4258 = null;
        field4265 = null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILjaggl/MapBuffer;)Z", line = 16)
    public final boolean method1865(int arg0, MapBuffer arg1) {
        field4257++;
        boolean var3 = true;
        if (this.field4252 != 0) {
            if (this.field4242 > 0) {
                OpenGL.glBindBufferARB(this.field4259, this.field4242);
                if (this.field4252 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field4259, 0, this.field4247, this.field4249.field5159.getAddress());
                } else {
                    var3 = arg1.method3307();
                }
            }
            this.field4252 = 0;
        }
        return arg0 == 25079 ? var3 : false;
    }

    @OriginalMember(owner = "client!vu", name = "finalize", descriptor = "()V", line = 53)
    protected final void finalize() throws Throwable {
        this.method1122(-1620);
        field4261++;
        super.finalize();
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V", line = 64)
    public static final void method1866(byte arg0) {
        field4255++;
        int var1 = class306.field4223.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class306.field4223[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class327.field4442; var4++) {
                    if (class586.field8250[var4] == class111.field1540[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class586.field8250[class327.field4442] = class111.field1540[var2];
                    var3 = class327.field4442++;
                }
                class501 var5 = new class501(class306.field4223[var2]);
                int var6 = 0;
                while (class306.field4223[var2].length > var5.field6892 && var6 < 511 && class698.field9912 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2845(-1);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FBB) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class111.field1540[var2] >> 8) * 64 + (var10 - class498.field6774);
                    int var13 = (class111.field1540[var2] & 0xFF) * 64 + var11 - class613.field8555;
                    class568 var14 = class347.field4640.method2584(var5.method2845(-1), 1);
                    class393 var15 = (class393) class299.field4071.method970((byte) 89, (long) var7);
                    if (var15 == null && (var14.field8020 & 0x1) > 0 && class540.field7305 == var9 && var12 >= 0 && class401.field5620 > (var12 + var14.field8041) && var13 >= 0 && var14.field8041 + var13 < class257.field3508) {
                        class61 var16 = new class61();
                        var16.field1697 = var7;
                        class393 var17 = new class393(var16);
                        class299.field4071.method968((long) var7, var17, -1);
                        class31.field400[class254.field3465++] = var17;
                        class636.field8790[class698.field9912++] = var7;
                        var16.field1716 = class186.field2697;
                        var16.method500(var14, -14527);
                        var16.method892(103, var16.field674.field8041);
                        var16.field1748 = var16.field674.field8075 << 3;
                        var16.method894((byte) 97, true, var16.field674.field8068 + 4 << 11 & 0x381F);
                        var16.method502(var9, var13, (byte) 127, var12, true, var16.method881(arg0 ^ 0xFFFFFFDB));
                    }
                }
            }
        }
        if (arg0 != 81) {
            method1868((byte) 56, -31, 22);
        }
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(Z)V", line = 160)
    public final void method1867(boolean arg0) {
        if (arg0) {
            this.method905(true);
        }
        if (this.field4249.field2181) {
            OpenGL.glBindBufferARB(this.field4259, this.field4242);
        }
        field4244++;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BII)Z", line = 173)
    public static final boolean method1868(byte arg0, int arg1, int arg2) {
        field4243++;
        if (arg0 > -95) {
            method1868((byte) 10, -66, 44);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILjaclib/memory/Source;I)Z", line = 187)
    public final boolean method1869(int arg0, Source arg1, int arg2) {
        if (arg2 != 0) {
            return false;
        }
        field4248++;
        if (arg0 > this.field4247) {
            this.method1871(arg2);
            if (this.field4242 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field4259, this.field4242);
            OpenGL.glBufferDataARBa(this.field4259, arg0, arg1.getAddress(), this.field4264 ? 35040 : 35044);
            this.field4249.field5281 += arg0 - this.field4262;
            this.field4247 = arg0;
        } else if (this.field4242 > 0) {
            OpenGL.glBindBufferARB(this.field4259, this.field4242);
            OpenGL.glBufferSubDataARBa(this.field4259, 0, this.field4262, arg1.getAddress());
            this.field4249.field5281 += arg0 - this.field4262;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field4262 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Ltba;IZ)V", line = 455)
    public class308(class147 arg0, int arg1, boolean arg2) {
        this.field4259 = arg1;
        this.field4264 = arg2;
        this.field4249 = arg0;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljaggl/MapBuffer;IZ)Ljaclib/memory/Buffer;", line = 233)
    public final Buffer method1870(MapBuffer arg0, int arg1, boolean arg2) {
        field4250++;
        if (this.field4252 == 0) {
            this.method1871(arg1 + 1);
            if (this.field4242 <= 0) {
                this.field4252 = 2;
                return this.field4263;
            }
            OpenGL.glBindBufferARB(this.field4259, this.field4242);
            if (arg2) {
                OpenGL.glBufferDataARBub(this.field4259, this.field4247, null, 0, this.field4264 ? 35040 : 35044);
                if (this.field4262 <= this.field4249.field5159.field8670) {
                    this.field4252 = 1;
                    return this.field4249.field5159;
                }
            }
            if (!arg0.method3308() && arg0.method3306(this.field4259, this.field4262, 35001)) {
                this.field4252 = 2;
                return arg0;
            }
        }
        if (arg1 != -1) {
            this.method905(true);
        }
        return null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)V", line = 284)
    public void method1116(int arg0, int arg1) {
        field4254++;
        if (this.field4247 < arg0) {
            this.method1871(0);
            if (this.field4242 <= 0) {
                this.field4263 = this.field4249.method2215(false, arg0, 0);
            } else {
                OpenGL.glBindBufferARB(this.field4259, this.field4242);
                OpenGL.glBufferDataARBub(this.field4259, arg0, null, 0, this.field4264 ? 35040 : 35044);
                this.field4249.field5281 += arg0 - this.field4247;
            }
            this.field4247 = arg0;
        }
        int var3 = -76 / ((arg1 + 84) / 39);
        this.field4262 = arg0;
    }

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "(I)V", line = 311)
    private final void method1871(int arg0) {
        field4260++;
        if (arg0 <= this.field4242) {
            return;
        }
        if (this.field4249.field2181) {
            OpenGL.glGenBuffersARB(1, class206.field2887, 0);
            this.field4242 = class206.field2887[0];
            OpenGL.glBindBufferARB(this.field4259, this.field4242);
        } else {
            this.field4242 = 0;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V", line = 336)
    public void method1122(int arg0) {
        if (this.field4242 > 0) {
            this.field4249.method1029(this.field4262, arg0 ^ 0xFFFFF475, this.field4242);
            this.field4242 = -1;
        }
        field4256++;
        if (arg0 != -1620) {
            field4251 = -29;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "([[BILwca;)V", line = 352)
    public static final void method1872(byte[][] arg0, int arg1, class630 arg2) {
        field4253++;
        if (arg1 < 30) {
            field4251 = -82;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field3985; var4++) {
            class466.method2634(5);
            for (int var5 = 0; var5 < (class401.field5620 >> 3); var5++) {
                for (int var6 = 0; var6 < (class257.field3508 >> 3); var6++) {
                    int var7 = class281.field3846[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg2.field3981 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFEC9C) >> 14;
                            int var11 = (var7 & 0x3FFA) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class111.field1540.length; var13++) {
                                if (class111.field1540[var13] == var12 && arg0[var13] != null) {
                                    class501 var14 = new class501(arg0[var13]);
                                    arg2.method1781(-37, var10, var4, var9, class151.field2218, var11, var8, var14, var6 * 8, var5 * 8);
                                    arg2.method3527(var14, var11, var10, var4, var9, var3[0] == -1 ? var3 : null, var8, 2, var5 * 8, var6 * 8, class334.field4506);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class261.field3549 = class433.field6033.method3773(var3[0], var3[1], (byte) -78, var3[3], var3[2], class444.field6147);
            class14.field149 = var3[4];
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)J", line = 445)
    public final long method1873(byte arg0) {
        if (arg0 <= 113) {
            return 19L;
        } else {
            field4246++;
            return this.field4242 == 0 ? this.field4263.getAddress() : 0L;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)I", line = 466)
    public int method905(boolean arg0) {
        if (arg0) {
            field4245++;
            return this.field4262;
        } else {
            return -121;
        }
    }
}
