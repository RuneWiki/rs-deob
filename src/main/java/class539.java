import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public abstract class class539 implements class695 {

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    private int field7448 = 0;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    private int field7458 = -1;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "Lbga;")
    public class358 field7471;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    private int field7467;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Z")
    private boolean field7462;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Z")
    public static boolean field7453 = false;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field7456 = new String[200];

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field7465 = 0;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    private int field7451;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    private int field7459;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "Lma;")
    public static class12 field7455;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Lcs;")
    public static class342 field7466;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field7460;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(FIFIF)F")
    public static final float method3102(float arg0, int arg1, float arg2, int arg3, float arg4) {
        field7450++;
        if (arg3 >= -59) {
            method3102(1.299765F, 45, -0.43444797F, -35, 0.059617087F);
        }
        float[] var5 = class716.field9748[arg1];
        return var5[2] * arg2 + var5[1] * arg0 + var5[0] * arg4;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILjaggl/MapBuffer;Z)Ljaclib/memory/Buffer;")
    public final Buffer method3103(int arg0, MapBuffer arg1, boolean arg2) {
        field7468++;
        if (arg0 != 0) {
            this.field7471 = null;
        }
        if (this.field7448 == 0) {
            this.method3109((byte) -36);
            if (this.field7458 <= 0) {
                this.field7448 = 2;
                return this.field7460;
            }
            OpenGL.glBindBufferARB(this.field7467, this.field7458);
            if (arg2) {
                OpenGL.glBufferDataARBub(this.field7467, this.field7451, null, 0, this.field7462 ? 35040 : 35044);
                if (this.field7459 <= this.field7471.field10088.field9170) {
                    this.field7448 = 1;
                    return this.field7471.field10088;
                }
            }
            if (!arg1.method3571() && arg1.method3570(this.field7467, this.field7459, 35001)) {
                this.field7448 = 2;
                return arg1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILjaclib/memory/Source;I)Z")
    public final boolean method3104(int arg0, Source arg1, int arg2) {
        field7457++;
        if (arg0 != 25625) {
            this.method3109((byte) -74);
        }
        if (arg2 > this.field7451) {
            this.method3109((byte) -36);
            if (this.field7458 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field7467, this.field7458);
            OpenGL.glBufferDataARBa(this.field7467, arg2, arg1.getAddress(), this.field7462 ? 35040 : 35044);
            this.field7471.field10177 += arg2 - this.field7459;
            this.field7451 = arg2;
        } else if (this.field7458 > 0) {
            OpenGL.glBindBufferARB(this.field7467, this.field7458);
            OpenGL.glBufferSubDataARBa(this.field7467, 0, this.field7459, arg1.getAddress());
            this.field7471.field10177 += arg2 - this.field7459;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field7459 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public void method878(int arg0) {
        if (arg0 != 23315) {
            field7466 = null;
        }
        field7461++;
        if (this.field7458 > 0) {
            this.field7471.method2269(this.field7459, this.field7458, 3089);
            this.field7458 = -1;
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)J")
    public final long method3105(int arg0) {
        field7470++;
        if (arg0 == 27819) {
            return this.field7458 == 0 ? this.field7460.getAddress() : 0L;
        } else {
            return 59L;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljaggl/MapBuffer;I)Z")
    public final boolean method3106(MapBuffer arg0, int arg1) {
        field7447++;
        boolean var3 = true;
        if (this.field7448 != arg1) {
            if (this.field7458 > 0) {
                OpenGL.glBindBufferARB(this.field7467, this.field7458);
                if (this.field7448 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field7467, 0, this.field7451, this.field7471.field10088.getAddress());
                } else {
                    var3 = arg0.method3572();
                }
            }
            this.field7448 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
    public static void method3107(int arg0) {
        field7455 = null;
        field7466 = null;
        field7456 = null;
        if (arg0 != 0) {
            method3102(-1.1717526F, -45, -2.0738192F, 18, -0.4863547F);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
    public void method1240(int arg0, int arg1) {
        field7464++;
        if (this.field7451 < arg1) {
            this.method3109((byte) -36);
            if (this.field7458 <= 0) {
                this.field7460 = this.field7471.method4109((byte) 47, false, arg1);
            } else {
                OpenGL.glBindBufferARB(this.field7467, this.field7458);
                OpenGL.glBufferDataARBub(this.field7467, arg1, null, 0, this.field7462 ? 35040 : 35044);
                this.field7471.field10177 += arg1 - this.field7451;
            }
            this.field7451 = arg1;
        }
        this.field7459 = arg1;
        if (arg0 != 15959) {
            field7456 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V")
    public final void method3108(int arg0) {
        field7454++;
        if (arg0 == 0 && this.field7471.field5171) {
            OpenGL.glBindBufferARB(this.field7467, this.field7458);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)I")
    public int method877(boolean arg0) {
        field7452++;
        if (arg0) {
            this.method3105(127);
        }
        return this.field7459;
    }

    @OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field7463++;
        this.method878(23315);
        super.finalize();
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
    private final void method3109(byte arg0) {
        field7469++;
        if (arg0 != -36) {
            this.field7448 = -3;
        }
        if (this.field7458 >= 0) {
            return;
        }
        if (this.field7471.field5171) {
            OpenGL.glGenBuffersARB(1, class680.field9217, 0);
            this.field7458 = class680.field9217[0];
            OpenGL.glBindBufferARB(this.field7467, this.field7458);
        } else {
            this.field7458 = 0;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lbga;IZ)V")
    public class539(class358 arg0, int arg1, boolean arg2) {
        this.field7471 = arg0;
        this.field7467 = arg1;
        this.field7462 = arg2;
    }
}
