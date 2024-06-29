import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class350 implements class5 {

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    private int field5040 = -1;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    private int field5043 = 0;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    private int field5033;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Lmc;")
    private class120 field5038;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Z")
    private boolean field5027;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Lvh;")
    public static class328 field5036 = new class328(200);

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field5047 = 1339;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "[I")
    public static int[] field5044 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "Ldd;")
    public static class647 field5045 = new class647("stellardawn", 1);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    private int field5028;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    private int field5041;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5039;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Z")
    public boolean method774(int arg0) {
        if (arg0 != -22324) {
            this.method776(false);
        }
        field5042++;
        boolean var2 = true;
        if (this.field5043 != 0) {
            if (this.field5040 > 0) {
                OpenGL.glBindBufferARB(this.field5033, this.field5040);
                if (this.field5043 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field5033, 0, this.field5041, this.field5038.field7937.getAddress());
                } else {
                    var2 = this.field5038.field1659.method3141();
                }
            }
            this.field5043 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BILjaclib/memory/Source;)Z")
    public final boolean method2076(byte arg0, int arg1, Source arg2) {
        field5029++;
        int var4 = 54 / ((arg0 + 31) / 44);
        if (this.field5041 >= arg1) {
            if (this.field5040 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field5033, this.field5040);
            OpenGL.glBufferSubDataARBa(this.field5033, 0, this.field5028, arg2.getAddress());
            this.field5038.field7945 += arg1 - this.field5028;
        } else {
            this.method2079(false);
            if (this.field5040 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field5033, this.field5040);
            OpenGL.glBufferDataARBa(this.field5033, arg1, arg2.getAddress(), this.field5027 ? 35040 : 35044);
            this.field5038.field7945 += arg1 - this.field5028;
            this.field5041 = arg1;
        }
        this.field5028 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public final void method2077(byte arg0) {
        if (arg0 <= -114) {
            if (this.field5038.field1668) {
                OpenGL.glBindBufferARB(this.field5033, this.field5040);
            }
            field5031++;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
    public static void method2078(byte arg0) {
        field5045 = null;
        field5044 = null;
        field5036 = null;
        if (arg0 != -5) {
            field5048 = 112;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(Z)V")
    private final void method2079(boolean arg0) {
        field5032++;
        if (this.field5040 >= 0) {
            return;
        }
        if (this.field5038.field1668) {
            OpenGL.glGenBuffersARB(1, class195.field2881, 0);
            this.field5040 = class195.field2881[0];
            OpenGL.glBindBufferARB(this.field5033, this.field5040);
        } else {
            this.field5040 = 0;
        }
        if (arg0) {
            this.method2079(false);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)I")
    public int method21(boolean arg0) {
        field5035++;
        if (arg0) {
            this.field5043 = 50;
        }
        return this.field5028;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public Buffer method779(byte arg0, boolean arg1) {
        field5046++;
        if (arg0 != -20) {
            this.method2076((byte) -80, -39, null);
        }
        if (this.field5043 == 0) {
            this.method2079(false);
            if (this.field5040 <= 0) {
                this.field5043 = 2;
                return this.field5039;
            }
            OpenGL.glBindBufferARB(this.field5033, this.field5040);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field5033, this.field5041, null, 0, this.field5027 ? 35040 : 35044);
                if (this.field5028 <= this.field5038.field7937.field8535) {
                    this.field5043 = 1;
                    return this.field5038.field7937;
                }
            }
            MapBuffer var3 = this.field5038.field1659;
            if (!var3.method3143() && var3.method3142(this.field5033, this.field5028, 35001)) {
                this.field5043 = 2;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)J")
    public final long method2080(byte arg0) {
        field5030++;
        if (arg0 <= 65) {
            this.method779((byte) -56, true);
        }
        return this.field5040 == 0 ? this.field5039.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILlt;I)V")
    public static final void method2081(int arg0, int arg1, int arg2, class620 arg3, int arg4) {
        field5034++;
        if (arg1 <= 77) {
            return;
        }
        for (class572 var5 = (class572) class240.field3451.method1270((byte) -25); var5 != null; var5 = (class572) class240.field3451.method1282(0)) {
            if (var5.field7708 == arg4 && arg0 << 9 == var5.field7691 && (arg2 << 9) == var5.field7701 && var5.field7695.field8621 == arg3.field8621) {
                if (var5.field7702 != null) {
                    class135.field1907.method3309(var5.field7702);
                    var5.field7702 = null;
                }
                if (var5.field7704 != null) {
                    class135.field1907.method3309(var5.field7704);
                    var5.field7704 = null;
                }
                var5.method2971(1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)V")
    public void method776(boolean arg0) {
        if (arg0) {
            this.method21(false);
        }
        if (this.field5040 > 0) {
            this.field5038.method860(100, this.field5028, this.field5040);
            this.field5040 = -1;
        }
        field5024++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)V")
    public void method777(int arg0, byte arg1) {
        if (this.field5041 < arg0) {
            this.method2079(false);
            if (this.field5040 > 0) {
                OpenGL.glBindBufferARB(this.field5033, this.field5040);
                OpenGL.glBufferDataARBub(this.field5033, arg0, null, 0, this.field5027 ? 35040 : 35044);
                this.field5038.field7945 += arg0 - this.field5041;
            } else {
                this.field5039 = this.field5038.method3249(arg0, (byte) 85, false);
            }
            this.field5041 = arg0;
        }
        field5037++;
        this.field5028 = arg0;
        if (arg1 != 73) {
            this.method2077((byte) 67);
        }
    }

    @OriginalMember(owner = "client!ah", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5025++;
        this.method776(false);
        super.finalize();
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)I")
    public static final int method2082(int arg0, int arg1) {
        int var8 = arg1 - 1;
        field5026++;
        int var2 = var8 | var8 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = -73 / ((arg0 - 82) / 44);
        int var7 = var5 | var5 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lmc;IZ)V")
    public class350(class120 arg0, int arg1, boolean arg2) {
        this.field5033 = arg1;
        this.field5038 = arg0;
        this.field5027 = arg2;
    }
}
