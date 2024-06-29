import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class608 implements class126 {

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    private int field8638 = 0;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    private int field8650 = -1;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "Z")
    private boolean field8640;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Llh;")
    private class125 field8643;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    private int field8636;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "Liu;")
    public static class517 field8644 = new class517(24, -1);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    private int field8635;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    private int field8648;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field8652;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8637;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)J", line = 6)
    public final long method3456(byte arg0) {
        if (arg0 != -24) {
            field8634 = -36;
        }
        field8646++;
        return this.field8650 == 0 ? this.field8637.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 23)
    public Buffer method251(boolean arg0, byte arg1) {
        field8631++;
        if (arg1 != 60) {
            this.method248(96);
        }
        if (this.field8638 == 0) {
            this.method3460(true);
            if (this.field8650 <= 0) {
                this.field8638 = 2;
                return this.field8637;
            }
            OpenGL.glBindBufferARB(this.field8636, this.field8650);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field8636, this.field8648, null, 0, this.field8640 ? 35040 : 35044);
                if (this.field8643.field8968.field8121 >= this.field8635) {
                    this.field8638 = 1;
                    return this.field8643.field8968;
                }
            }
            MapBuffer var3 = this.field8643.field2058;
            if (!var3.method3308() && var3.method3309(this.field8636, this.field8635, 35001)) {
                this.field8638 = 2;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V", line = 72)
    public void method252(int arg0, int arg1) {
        if (this.field8648 < arg1) {
            this.method3460(true);
            if (this.field8650 > 0) {
                OpenGL.glBindBufferARB(this.field8636, this.field8650);
                OpenGL.glBufferDataARBub(this.field8636, arg1, null, 0, this.field8640 ? 35040 : 35044);
                this.field8643.field9036 += arg1 - this.field8648;
            } else {
                this.field8637 = this.field8643.method3584(false, false, arg1);
            }
            this.field8648 = arg1;
        }
        if (arg0 <= 29) {
            method3458(36, 34, -55, -98);
        }
        field8639++;
        this.field8635 = arg1;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Llh;IZ)V", line = 410)
    public class608(class125 arg0, int arg1, boolean arg2) {
        this.field8640 = arg2;
        this.field8643 = arg0;
        this.field8636 = arg1;
    }

    @OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V", line = 105)
    protected final void finalize() throws Throwable {
        this.method249(12416);
        field8641++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIZ)V", line = 116)
    public static final void method3457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8642++;
        class277.method1783((byte) -124, arg2);
        int var7 = 0;
        int var8 = arg2 - arg1;
        if (!arg6) {
            method3458(39, -127, -55, -8);
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class495.field6944[arg4];
        int var16 = arg3 - var8;
        class614.method3490(arg0, arg3 - arg2, -121, var15, var16);
        int var17 = arg3 + var8;
        class614.method3490(arg5, var16, -95, var15, var17);
        class614.method3490(arg0, var17, -127, var15, arg2 + arg3);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class594.field8452[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 <= var9) {
                    int[] var18 = class495.field6944[arg4 + var9];
                    int[] var19 = class495.field6944[arg4 - var9];
                    int var20 = arg3 + var7;
                    int var21 = arg3 - var7;
                    class614.method3490(arg0, var21, -105, var18, var20);
                    class614.method3490(arg0, var21, -121, var19, var20);
                } else {
                    int[] var22 = class495.field6944[arg4 + var9];
                    int[] var23 = class495.field6944[arg4 - var9];
                    int var24 = class594.field8452[var9];
                    int var25 = arg3 + var7;
                    int var26 = arg3 - var7;
                    int var27 = arg3 + var24;
                    int var28 = arg3 - var24;
                    class614.method3490(arg0, var26, -93, var22, var28);
                    class614.method3490(arg5, var28, -109, var22, var27);
                    class614.method3490(arg0, var27, -104, var22, var25);
                    class614.method3490(arg0, var26, -98, var23, var28);
                    class614.method3490(arg5, var28, -109, var23, var27);
                    class614.method3490(arg0, var27, -94, var23, var25);
                }
            }
            int[] var29 = class495.field6944[arg4 + var7];
            int[] var30 = class495.field6944[arg4 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var7 < var8) {
                int var33 = var11 < var7 ? class594.field8452[var7] : var11;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class614.method3490(arg0, var32, -107, var29, var35);
                class614.method3490(arg5, var35, -94, var29, var34);
                class614.method3490(arg0, var34, -94, var29, var31);
                class614.method3490(arg0, var32, -90, var30, var35);
                class614.method3490(arg5, var35, -100, var30, var34);
                class614.method3490(arg0, var34, -83, var30, var31);
            } else {
                class614.method3490(arg0, var32, -125, var29, var31);
                class614.method3490(arg0, var32, -124, var30, var31);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V", line = 245)
    public static final void method3458(int arg0, int arg1, int arg2, int arg3) {
        field8645++;
        if (arg1 == 0) {
            class26.field356++;
            class624.method3537(-108, class418.field6153);
        }
        if (arg1 == 1) {
            class442.field6460++;
            class624.method3537(-127, class38.field511);
        }
        class127.field2088.method1718(-3, class597.field8500 + arg2);
        class127.field2088.method1747(class382.field5687 + arg0, -29356);
        int var4 = -104 / ((-arg3 - 38) / 39);
        class127.field2088.method1698((byte) -114, class404.field6022.method2183(82, false) ? 1 : 0);
        class439.field6391 = arg2;
        class476.field6810 = arg0;
        class624.field8810 = false;
        class406.method2468((byte) 97);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjaclib/memory/Source;B)Z", line = 277)
    public final boolean method3459(int arg0, Source arg1, byte arg2) {
        field8652++;
        if (arg2 < 66) {
            return false;
        }
        if (this.field8648 >= arg0) {
            if (this.field8650 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field8636, this.field8650);
            OpenGL.glBufferSubDataARBa(this.field8636, 0, this.field8635, arg1.getAddress());
            this.field8643.field9036 += arg0 - this.field8635;
        } else {
            this.method3460(true);
            if (this.field8650 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field8636, this.field8650);
            OpenGL.glBufferDataARBa(this.field8636, arg0, arg1.getAddress(), this.field8640 ? 35040 : 35044);
            this.field8643.field9036 += arg0 - this.field8635;
            this.field8648 = arg0;
        }
        this.field8635 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)Z", line = 319)
    public boolean method245(int arg0) {
        field8651++;
        if (arg0 != -11359) {
            field8644 = null;
        }
        boolean var2 = true;
        if (this.field8638 != 0) {
            if (this.field8650 > 0) {
                OpenGL.glBindBufferARB(this.field8636, this.field8650);
                if (this.field8638 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field8636, 0, this.field8648, this.field8643.field8968.getAddress());
                } else {
                    var2 = this.field8643.field2058.method3307();
                }
            }
            this.field8638 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 350)
    public void method249(int arg0) {
        if (this.field8650 > 0) {
            this.field8643.method995(this.field8635, this.field8650, 32082);
            this.field8650 = -1;
        }
        field8633++;
        if (arg0 != 12416) {
            this.field8637 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I", line = 371)
    public int method248(int arg0) {
        if (arg0 == -920) {
            field8632++;
            return this.field8635;
        } else {
            return 31;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 386)
    private final void method3460(boolean arg0) {
        field8649++;
        if (this.field8650 >= 0) {
            return;
        }
        if (!arg0) {
            field8634 = 65;
        }
        if (this.field8643.field2068) {
            OpenGL.glGenBuffersARB(1, class177.field2587, 0);
            this.field8650 = class177.field2587[0];
            OpenGL.glBindBufferARB(this.field8636, this.field8650);
        } else {
            this.field8650 = 0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V", line = 420)
    public static void method3461(byte arg0) {
        if (arg0 > 67) {
            field8644 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V", line = 433)
    public final void method3462(int arg0) {
        field8647++;
        if (this.field8643.field2068) {
            OpenGL.glBindBufferARB(this.field8636, this.field8650);
        }
        if (arg0 != 1) {
            method3458(-94, -109, -54, -7);
        }
    }
}
