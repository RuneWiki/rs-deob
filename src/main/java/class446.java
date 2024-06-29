import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public abstract class class446 implements class574 {

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    private int field6099 = -1;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    private int field6109 = 0;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    private int field6103;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "Ldc;")
    private class5 field6106;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "Z")
    private boolean field6102;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "Lcu;")
    public static class206 field6114 = new class206(26, 7);

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public static int field6116 = 0;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    private int field6113;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    private int field6115;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "Lxa;")
    public static class468 field6100;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6098;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "[I")
    public static int[] field6101;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V", line = 5)
    public void method26(int arg0, int arg1) {
        if (arg0 != -24955) {
            this.method27((byte) -121, false);
        }
        field6097++;
        if (this.field6113 < arg1) {
            this.method2515(false);
            if (this.field6099 <= 0) {
                this.field6098 = this.field6106.method847(true, arg1, false);
            } else {
                OpenGL.glBindBufferARB(this.field6103, this.field6099);
                OpenGL.glBufferDataARBub(this.field6103, arg1, null, 0, this.field6102 ? 35040 : 35044);
                this.field6106.field1809 += arg1 - this.field6113;
            }
            this.field6113 = arg1;
        }
        this.field6115 = arg1;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V", line = 36)
    public void method24(byte arg0) {
        if (this.field6099 > 0) {
            this.field6106.method59(this.field6099, (byte) 114, this.field6115);
            this.field6099 = -1;
        }
        if (arg0 != -93) {
            this.field6109 = -20;
        }
        field6110++;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V", line = 53)
    public static void method2512(boolean arg0) {
        field6114 = null;
        field6101 = null;
        if (arg0) {
            method2512(true);
        }
        field6100 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjaclib/memory/Source;I)Z", line = 67)
    public final boolean method2513(int arg0, Source arg1, int arg2) {
        field6112++;
        if (arg0 > this.field6113) {
            this.method2515(false);
            if (this.field6099 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field6103, this.field6099);
            OpenGL.glBufferDataARBa(this.field6103, arg0, arg1.getAddress(), this.field6102 ? 35040 : 35044);
            this.field6106.field1809 += arg0 - this.field6115;
            this.field6113 = arg0;
        } else if (this.field6099 > 0) {
            OpenGL.glBindBufferARB(this.field6103, this.field6099);
            OpenGL.glBufferSubDataARBa(this.field6103, 0, this.field6115, arg1.getAddress());
            this.field6106.field1809 += arg0 - this.field6115;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field6115 = arg0;
        if (arg2 < 35) {
            this.method2515(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "finalize", descriptor = "()V", line = 114)
    protected final void finalize() throws Throwable {
        this.method24((byte) -93);
        field6105++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)I", line = 123)
    public int method1656(int arg0) {
        field6094++;
        if (arg0 != -15151) {
            this.method24((byte) 86);
        }
        return this.field6115;
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V", line = 134)
    public final void method2514(int arg0) {
        if (arg0 != 0) {
            field6100 = null;
        }
        field6107++;
        if (this.field6106.field135) {
            OpenGL.glBindBufferARB(this.field6103, this.field6099);
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)V", line = 149)
    private final void method2515(boolean arg0) {
        field6111++;
        if (this.field6099 >= 0) {
            return;
        }
        if (this.field6106.field135) {
            OpenGL.glGenBuffersARB(1, class307.field4239, 0);
            this.field6099 = class307.field4239[0];
            OpenGL.glBindBufferARB(this.field6103, this.field6099);
        } else {
            this.field6099 = 0;
        }
        if (arg0) {
            this.method2516(-29);
        }
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)J", line = 175)
    public final long method2516(int arg0) {
        field6104++;
        if (arg0 > -98) {
            return 67L;
        } else if (this.field6099 == 0) {
            return this.field6098.getAddress();
        } else {
            return 0L;
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ldc;IZ)V", line = 291)
    public class446(class5 arg0, int arg1, boolean arg2) {
        this.field6103 = arg1;
        this.field6106 = arg0;
        this.field6102 = arg2;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(III)V", line = 192)
    public static final void method2517(int arg0, int arg1, int arg2) {
        class24 var3 = class703.field9899[arg0][arg1][arg2];
        if (var3 != null && var3.field422 != null) {
            var3.field422 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z", line = 207)
    public boolean method28(int arg0) {
        if (arg0 != 11390) {
            this.field6109 = -90;
        }
        field6095++;
        boolean var2 = true;
        if (this.field6109 != 0) {
            if (this.field6099 > 0) {
                OpenGL.glBindBufferARB(this.field6103, this.field6099);
                if (this.field6109 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field6103, 0, this.field6113, this.field6106.field1686.getAddress());
                } else {
                    var2 = this.field6106.field133.method3210();
                }
            }
            this.field6109 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 239)
    public Buffer method27(byte arg0, boolean arg1) {
        field6096++;
        if (this.field6109 == 0) {
            this.method2515(false);
            if (this.field6099 <= 0) {
                this.field6109 = 2;
                return this.field6098;
            }
            OpenGL.glBindBufferARB(this.field6103, this.field6099);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field6103, this.field6113, null, 0, this.field6102 ? 35040 : 35044);
                if (this.field6115 <= this.field6106.field1686.field8488) {
                    this.field6109 = 1;
                    return this.field6106.field1686;
                }
            }
            MapBuffer var3 = this.field6106.field133;
            if (!var3.method3209() && var3.method3211(this.field6103, this.field6115, 35001)) {
                this.field6109 = 2;
                return var3;
            }
        }
        if (arg0 != -64) {
            this.field6109 = -28;
        }
        return null;
    }
}
