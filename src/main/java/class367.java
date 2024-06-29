import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class class367 {

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    private int field5702;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    private int field5705;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Z")
    private boolean field5704;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Lih;")
    public class214 field5710;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public int field5709;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lvt;")
    public static class516 field5707 = new class516();

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "[I")
    public static int[] field5703;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 4)
    public static final String method2331(int arg0, int[] arg1) {
        field5708++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class182.field2875;
        if (arg0 >= -54) {
            return null;
        }
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class204 var5 = class446.field6660.method2981((byte) 50, arg1[var4]);
            if (var5.field3228 != -1) {
                class138 var6 = (class138) class469.field6965.method1593((byte) 118, (long) var5.field3228);
                if (var6 == null) {
                    class523 var7 = class523.method3093(class536.field7881, var5.field3228, 0);
                    if (var7 != null) {
                        var6 = class305.field4873.method837(var7, true);
                        class469.field6965.method1595(var6, (long) var5.field3228, (byte) 39);
                    }
                }
                if (var6 != null) {
                    class315.field4961[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB[B)V", line = 56)
    public final void method2332(int arg0, byte arg1, byte[] arg2) {
        if (arg1 != 28) {
            return;
        }
        field5701++;
        this.method513((byte) 126);
        if (this.field5705 >= arg0) {
            OpenGL.glBufferSubDataARB(this.field5702, 0, arg0, arg2, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field5702, arg0, arg2, 0, this.field5704 ? 35040 : 35044);
            this.field5710.field3612 += arg0 - this.field5705;
            this.field5705 = arg0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 83)
    public static void method2333(int arg0) {
        if (arg0 == 98) {
            field5707 = null;
            field5703 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZII)Z", line = 97)
    public static final boolean method2334(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method2334(true, -103, 86);
        }
        field5706++;
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lih;I[BIZ)V", line = 113)
    public class367(class214 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field5702 = arg1;
        this.field5705 = arg3;
        this.field5704 = arg4;
        this.field5710 = arg0;
        OpenGL.glGenBuffersARB(1, class512.field7506, 0);
        this.field5709 = class512.field7506[0];
        this.method513((byte) 116);
        OpenGL.glBufferDataARBub(arg1, this.field5705, arg2, 0, this.field5704 ? 35040 : 35044);
        this.field5710.field3612 += this.field5705;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIII)V", line = 133)
    public static final void method2335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5711++;
        int var8 = arg0 + arg2;
        int var9 = arg6 - arg2;
        if (arg4 != 0) {
            return;
        }
        for (int var10 = arg0; var10 < var8; var10++) {
            class357.method2291(arg5, arg1, class209.field3294[var10], arg3, -1);
        }
        int var11 = arg2 + arg5;
        int var12 = arg3 - arg2;
        for (int var13 = arg6; var13 > var9; var13--) {
            class357.method2291(arg5, arg1, class209.field3294[var13], arg3, -1);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class209.field3294[var14];
            class357.method2291(arg5, arg1, var15, var11, -1);
            class357.method2291(var11, arg7, var15, var12, -1);
            class357.method2291(var12, arg1, var15, arg3, -1);
        }
    }

    @OriginalMember(owner = "client!wf", name = "finalize", descriptor = "()V", line = 179)
    protected final void finalize() throws Throwable {
        field5699++;
        this.field5710.method1428(this.field5709, this.field5705, -112);
        super.finalize();
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lih;ILjaggl/memory/NativeBuffer;IZ)V", line = 188)
    public class367(class214 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field5702 = arg1;
        this.field5704 = arg4;
        this.field5710 = arg0;
        this.field5705 = arg3;
        OpenGL.glGenBuffersARB(1, class512.field7506, 0);
        this.field5709 = class512.field7506[0];
        this.method513((byte) 103);
        OpenGL.glBufferDataARBa(arg1, this.field5705, arg2.method94(), this.field5704 ? 35040 : 35044);
        this.field5710.field3612 += this.field5705;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILii;IIII)V", line = 209)
    public static final void method2336(int arg0, class451 arg1, int arg2, int arg3, int arg4, int arg5) {
        field5700++;
        if (arg1.field6730 == -1 && arg1.field6738 == null) {
            return;
        }
        int var6 = 0;
        if (arg4 > arg1.field6735) {
            var6 += arg4 - arg1.field6735;
        } else if (arg4 < arg1.field6716) {
            var6 += arg1.field6716 - arg4;
        }
        int var7 = class510.field7403.field5121 * arg1.field6729 >> 8;
        if (arg1.field6721 < arg3) {
            var6 += arg3 - arg1.field6721;
        } else if (arg3 < arg1.field6740) {
            var6 += arg1.field6740 - arg3;
        }
        if (arg1.field6726 == arg5 || var6 - 64 > arg1.field6726 || class510.field7403.field5121 == 0 || arg1.field6727 != arg0) {
            if (arg1.field6723 != null) {
                class510.field7455.method1734(arg1.field6723);
                arg1.field6723 = null;
            }
            if (arg1.field6734 != null) {
                class510.field7455.method1734(arg1.field6734);
                arg1.field6734 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg1.field6726 - var6) * var7 / arg1.field6726;
        if (arg1.field6723 != null) {
            arg1.field6723.method2181(var8);
        } else if (arg1.field6730 >= 0) {
            class80 var9 = class80.method584(class471.field6971, arg1.field6730, 0);
            if (var9 != null) {
                class168 var10 = var9.method586().method1154(class247.field4238);
                class341 var11 = class341.method2174(var10, 100, var8);
                var11.method2177(-1);
                class510.field7455.method1740(var11);
                arg1.field6723 = var11;
            }
        }
        if (arg1.field6734 != null) {
            arg1.field6734.method2181(var8);
            if (!arg1.field6734.method1818(false)) {
                arg1.field6734 = null;
                return;
            }
            return;
        }
        if (arg1.field6738 == null || (arg1.field6725 -= arg2) > 0) {
            return;
        }
        int var12 = (int) ((double) arg1.field6738.length * Math.random());
        class80 var13 = class80.method584(class471.field6971, arg1.field6738[var12], 0);
        if (var13 == null) {
            return;
        }
        class168 var14 = var13.method586().method1154(class247.field4238);
        class341 var15 = class341.method2174(var14, 100, var8);
        var15.method2177(0);
        class510.field7455.method1740(var15);
        arg1.field6734 = var15;
        arg1.field6725 = arg1.field6717 + (int) (Math.random() * (double) (arg1.field6720 - arg1.field6717));
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)V")
    public abstract void method513(byte arg0);
}
