import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public abstract class class316 implements class172 {

    @OriginalMember(owner = "client!afa", name = "q", descriptor = "I")
    private int field4971 = -1;

    @OriginalMember(owner = "client!afa", name = "l", descriptor = "I")
    private int field4966 = 0;

    @OriginalMember(owner = "client!afa", name = "t", descriptor = "Z")
    private boolean field4974;

    @OriginalMember(owner = "client!afa", name = "n", descriptor = "I")
    private int field4968;

    @OriginalMember(owner = "client!afa", name = "v", descriptor = "Lbea;")
    public class205 field4976;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    private int field4955;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
    private int field4958;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!afa", name = "k", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!afa", name = "m", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!afa", name = "p", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!afa", name = "r", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!afa", name = "s", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!afa", name = "u", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!afa", name = "o", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field4969;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "(I)V", line = 3)
    public final void method2154(int arg0) {
        field4965++;
        if (arg0 == 0 && this.field4976.field3446) {
            OpenGL.glBindBufferARB(this.field4968, this.field4971);
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "([Ljava/lang/Object;B[J)V", line = 17)
    public static final void method2155(Object[] arg0, byte arg1, long[] arg2) {
        field4967++;
        class522.method3142(0, arg2.length - 1, arg2, arg0, 2);
        if (arg1 <= 92) {
            method2161(true, null);
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(BLjaggl/MapBuffer;)Z", line = 29)
    public final boolean method2156(byte arg0, MapBuffer arg1) {
        field4964++;
        if (arg0 <= 37) {
            return true;
        }
        boolean var3 = true;
        if (this.field4966 != 0) {
            if (this.field4971 > 0) {
                OpenGL.glBindBufferARB(this.field4968, this.field4971);
                if (this.field4966 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field4968, 0, this.field4955, this.field4976.field5302.getAddress());
                } else {
                    var3 = arg1.method3392();
                }
            }
            this.field4966 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(BI)V", line = 66)
    public void method424(byte arg0, int arg1) {
        if (arg0 > -66) {
            return;
        }
        if (arg1 > this.field4955) {
            this.method2158(9418);
            if (this.field4971 > 0) {
                OpenGL.glBindBufferARB(this.field4968, this.field4971);
                OpenGL.glBufferDataARBub(this.field4968, arg1, null, 0, this.field4974 ? 35040 : 35044);
                this.field4976.field5318 += arg1 - this.field4955;
            } else {
                this.field4969 = this.field4976.method2284(false, arg1, 0);
            }
            this.field4955 = arg1;
        }
        field4961++;
        this.field4958 = arg1;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Ljaggl/MapBuffer;ZB)Ljaclib/memory/Buffer;", line = 100)
    public final Buffer method2157(MapBuffer arg0, boolean arg1, byte arg2) {
        field4959++;
        int var4 = 123 % ((arg2 - 29) / 62);
        if (this.field4966 == 0) {
            this.method2158(9418);
            if (this.field4971 <= 0) {
                this.field4966 = 2;
                return this.field4969;
            }
            OpenGL.glBindBufferARB(this.field4968, this.field4971);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field4968, this.field4955, null, 0, this.field4974 ? 35040 : 35044);
                if (this.field4958 <= this.field4976.field5302.field8800) {
                    this.field4966 = 1;
                    return this.field4976.field5302;
                }
            }
            if (!arg0.method3391() && arg0.method3393(this.field4968, this.field4958, 35001)) {
                this.field4966 = 2;
                return arg0;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "(I)V", line = 147)
    private final void method2158(int arg0) {
        field4963++;
        if (this.field4971 >= 0 || arg0 != 9418) {
            return;
        }
        if (this.field4976.field3446) {
            OpenGL.glGenBuffersARB(1, class145.field2440, 0);
            this.field4971 = class145.field2440[0];
            OpenGL.glBindBufferARB(this.field4968, this.field4971);
        } else {
            this.field4971 = 0;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V", line = 172)
    public void method431(int arg0) {
        if (arg0 != -5517) {
            this.field4976 = null;
        }
        if (this.field4971 > 0) {
            this.field4976.method1578(this.field4958, 8, this.field4971);
            this.field4971 = -1;
        }
        field4972++;
    }

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "(I)I", line = 190)
    public int method429(int arg0) {
        if (arg0 == 34962) {
            field4973++;
            return this.field4958;
        } else {
            return -90;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)J", line = 205)
    public final long method2159(byte arg0) {
        if (arg0 > -35) {
            this.field4958 = -46;
        }
        field4970++;
        return this.field4971 == 0 ? this.field4969.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(BLjaclib/memory/Source;I)Z", line = 217)
    public final boolean method2160(byte arg0, Source arg1, int arg2) {
        if (arg0 != -31) {
            this.field4976 = null;
        }
        field4960++;
        if (this.field4955 < arg2) {
            this.method2158(arg0 + 9449);
            if (this.field4971 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field4968, this.field4971);
            OpenGL.glBufferDataARBa(this.field4968, arg2, arg1.getAddress(), this.field4974 ? 35040 : 35044);
            this.field4976.field5318 += arg2 - this.field4958;
            this.field4955 = arg2;
        } else if (this.field4971 > 0) {
            OpenGL.glBindBufferARB(this.field4968, this.field4971);
            OpenGL.glBufferSubDataARBa(this.field4968, 0, this.field4958, arg1.getAddress());
            this.field4976.field5318 += arg2 - this.field4958;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field4958 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZLpba;)V", line = 258)
    public static final void method2161(boolean arg0, class304 arg1) {
        field4957++;
        class119 var2 = (class119) class415.field6359.method1558((long) arg1.field4197, (byte) -93);
        if (!arg0) {
            return;
        }
        if (var2 == null) {
            class24.method410(arg1.field4265[0], null, null, arg1.field4264[0], 0, arg1.field9695, (byte) 123, arg1);
        } else {
            var2.method1069(-96);
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIII)V", line = 278)
    public static final void method2162(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class340.field5510 = arg4;
        field4956++;
        class585.field8331 = arg2;
        if (arg1 != -17265) {
            method2155(null, (byte) -16, null);
        }
        class545.field7931 = arg3;
        class576.field8218 = arg0;
    }

    @OriginalMember(owner = "client!afa", name = "finalize", descriptor = "()V", line = 293)
    protected final void finalize() throws Throwable {
        field4962++;
        this.method431(-5517);
        super.finalize();
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lbea;IZ)V", line = 307)
    public class316(class205 arg0, int arg1, boolean arg2) {
        this.field4974 = arg2;
        this.field4968 = arg1;
        this.field4976 = arg0;
    }
}
