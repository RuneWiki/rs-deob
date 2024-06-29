import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public abstract class class438 implements class460 {

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    private int field5751 = 0;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    private int field5757 = -1;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "Ljc;")
    public class179 field5752;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    private int field5758;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "Z")
    private boolean field5744;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "[I")
    public static int[] field5760 = new int[64];

    @OriginalMember(owner = "client!du", name = "h", descriptor = "Liea;")
    public static class12 field5747 = new class12();

    @OriginalMember(owner = "client!du", name = "w", descriptor = "[Lvn;")
    public static class446[] field5762 = new class446[100];

    @OriginalMember(owner = "client!du", name = "z", descriptor = "I")
    public static int field5765 = 0;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    private int field5743;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    private int field5759;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!du", name = "x", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5756;

    @OriginalMember(owner = "client!du", name = "y", descriptor = "[I")
    public static int[] field5764;

    @OriginalMember(owner = "client!du", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() throws Throwable {
        this.method284((byte) 66);
        field5742++;
        super.finalize();
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)I", line = 23)
    public int method287(int arg0) {
        if (arg0 != 128) {
            this.field5752 = null;
        }
        field5740++;
        return this.field5743;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Ljaggl/MapBuffer;I)Z", line = 35)
    public final boolean method2504(MapBuffer arg0, int arg1) {
        field5754++;
        if (arg1 != -1) {
            this.method2508(103);
        }
        boolean var3 = true;
        if (this.field5751 != 0) {
            if (this.field5757 > 0) {
                OpenGL.glBindBufferARB(this.field5758, this.field5757);
                if (this.field5751 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field5758, 0, this.field5759, this.field5752.field8968.getAddress());
                } else {
                    var3 = arg0.method3179();
                }
            }
            this.field5751 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I[BLjava/io/File;I)V", line = 67)
    public static final void method2505(int arg0, byte[] arg1, File arg2, int arg3) throws IOException {
        field5750++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg1, arg3, arg0);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V", line = 84)
    public void method284(byte arg0) {
        if (this.field5757 > 0) {
            this.field5752.method1199(-11621, this.field5743, this.field5757);
            this.field5757 = -1;
        }
        if (arg0 < 33) {
            this.method2511(-60, null, 70);
        }
        field5741++;
    }

    @OriginalMember(owner = "client!du", name = "d", descriptor = "(I)J", line = 102)
    public final long method2506(int arg0) {
        field5745++;
        if (arg0 != 5678) {
            this.field5752 = null;
        }
        return this.field5757 == 0 ? this.field5756.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!du", name = "e", descriptor = "(I)V", line = 113)
    public static void method2507(int arg0) {
        int var1 = 113 / ((62 - arg0) / 42);
        field5747 = null;
        field5760 = null;
        field5762 = null;
        field5764 = null;
    }

    @OriginalMember(owner = "client!du", name = "f", descriptor = "(I)V", line = 125)
    private final void method2508(int arg0) {
        field5749++;
        if (this.field5757 >= arg0) {
            return;
        }
        if (this.field5752.field2447) {
            OpenGL.glGenBuffersARB(1, class643.field8230, 0);
            this.field5757 = class643.field8230[0];
            OpenGL.glBindBufferARB(this.field5758, this.field5757);
        } else {
            this.field5757 = 0;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II)V", line = 151)
    public void method2016(int arg0, int arg1) {
        field5746++;
        int var3 = 17 % ((arg1 - 24) / 59);
        if (this.field5759 < arg0) {
            this.method2508(0);
            if (this.field5757 <= 0) {
                this.field5756 = this.field5752.method3790(false, (byte) 20, arg0);
            } else {
                OpenGL.glBindBufferARB(this.field5758, this.field5757);
                OpenGL.glBufferDataARBub(this.field5758, arg0, null, 0, this.field5744 ? 35040 : 35044);
                this.field5752.field9107 += arg0 - this.field5759;
            }
            this.field5759 = arg0;
        }
        this.field5743 = arg0;
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Ljc;IZ)V", line = 184)
    public class438(class179 arg0, int arg1, boolean arg2) {
        this.field5752 = arg0;
        this.field5758 = arg1;
        this.field5744 = arg2;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V", line = 194)
    public final void method2509(boolean arg0) {
        if (this.field5752.field2447) {
            OpenGL.glBindBufferARB(this.field5758, this.field5757);
        }
        if (arg0) {
            this.method2506(74);
        }
        field5753++;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZILjaggl/MapBuffer;)Ljaclib/memory/Buffer;", line = 208)
    public final Buffer method2510(boolean arg0, int arg1, MapBuffer arg2) {
        field5748++;
        int var4 = -119 % ((arg1 + 35) / 51);
        if (this.field5751 == 0) {
            this.method2508(0);
            if (this.field5757 <= 0) {
                this.field5751 = 2;
                return this.field5756;
            }
            OpenGL.glBindBufferARB(this.field5758, this.field5757);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field5758, this.field5759, null, 0, this.field5744 ? 35040 : 35044);
                if (this.field5752.field8968.field5782 >= this.field5743) {
                    this.field5751 = 1;
                    return this.field5752.field8968;
                }
            }
            if (!arg2.method3180() && arg2.method3178(this.field5758, this.field5743, 35001)) {
                this.field5751 = 2;
                return arg2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILjaclib/memory/Source;I)Z", line = 260)
    public final boolean method2511(int arg0, Source arg1, int arg2) {
        field5761++;
        if (this.field5759 >= arg2) {
            if (this.field5757 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field5758, this.field5757);
            OpenGL.glBufferSubDataARBa(this.field5758, 0, this.field5743, arg1.getAddress());
            this.field5752.field9107 += arg2 - this.field5743;
        } else {
            this.method2508(0);
            if (this.field5757 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field5758, this.field5757);
            OpenGL.glBufferDataARBa(this.field5758, arg2, arg1.getAddress(), this.field5744 ? 35040 : 35044);
            this.field5752.field9107 += arg2 - this.field5743;
            this.field5759 = arg2;
        }
        this.field5743 = arg2;
        int var4 = 53 % ((arg0 + 29) / 48);
        return true;
    }
}
