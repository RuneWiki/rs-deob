import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class class239 implements class591 {

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    private int field3852 = -1;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
    private int field3857 = 0;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    private int field3846;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "Z")
    private boolean field3853;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "Lom;")
    public class642 field3856;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    private int field3849;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    private int field3854;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3862;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)J", line = 3)
    public final long method1655(boolean arg0) {
        field3851++;
        if (arg0) {
            this.method924((byte) -93, -11);
        }
        return this.field3852 == 0 ? this.field3862.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I", line = 15)
    public int method695(byte arg0) {
        field3848++;
        if (arg0 < 37) {
            this.method1659(-20, 29, null);
        }
        return this.field3854;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIZII)V", line = 32)
    public static final void method1656(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class632.field8875 = arg2;
        class366.field5581 = arg0;
        class188.field3134 = arg5;
        if (!arg3) {
            return;
        }
        field3855++;
        class168.field2922 = arg4;
        class379.field5702 = arg1;
        if (class188.field3134 >= 100) {
            int var6 = class379.field5702 * 512 + 256;
            int var7 = class168.field2922 * 512 + 256;
            int var8 = class232.method1611(var7, var6, class582.field8234, (byte) 59) - class632.field8875;
            int var9 = var6 - class497.field7212;
            int var10 = var8 - class101.field1507;
            int var11 = var7 - class329.field4857;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class81.field1167 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class608.field8587 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            class40.field714 = 0;
            if (class81.field1167 < 1024) {
                class81.field1167 = 1024;
            }
            if (class81.field1167 > 3072) {
                class81.field1167 = 3072;
            }
        }
        class275.field4202 = -1;
        class87.field1279 = -1;
        class639.field8978 = 2;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILjaggl/MapBuffer;Z)Ljaclib/memory/Buffer;", line = 80)
    public final Buffer method1657(int arg0, MapBuffer arg1, boolean arg2) {
        field3863++;
        if (this.field3857 == 0) {
            this.method1660(256);
            if (this.field3852 <= 0) {
                this.field3857 = 2;
                return this.field3862;
            }
            OpenGL.glBindBufferARB(this.field3846, this.field3852);
            if (arg2) {
                OpenGL.glBufferDataARBub(this.field3846, this.field3849, null, 0, this.field3853 ? 35040 : 35044);
                if (this.field3856.field461.field6165 >= this.field3854) {
                    this.field3857 = 1;
                    return this.field3856.field461;
                }
            }
            if (!arg1.method3279() && arg1.method3280(this.field3846, this.field3854, 35001)) {
                this.field3857 = 2;
                return arg1;
            }
        }
        if (arg0 <= 51) {
            this.field3854 = 20;
        }
        return null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILjaggl/MapBuffer;)Z", line = 124)
    public final boolean method1658(int arg0, MapBuffer arg1) {
        field3859++;
        boolean var3 = true;
        if (this.field3857 != 0) {
            if (this.field3852 > 0) {
                OpenGL.glBindBufferARB(this.field3846, this.field3852);
                if (this.field3857 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field3846, 0, this.field3849, this.field3856.field461.getAddress());
                } else {
                    var3 = arg1.method3278();
                }
            }
            this.field3857 = 0;
        }
        if (arg0 != 7751) {
            this.method1658(116, null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILjaclib/memory/Source;)Z", line = 155)
    public final boolean method1659(int arg0, int arg1, Source arg2) {
        if (arg0 != 25163) {
            this.method695((byte) 26);
        }
        field3860++;
        if (arg1 > this.field3849) {
            this.method1660(256);
            if (this.field3852 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field3846, this.field3852);
            OpenGL.glBufferDataARBa(this.field3846, arg1, arg2.getAddress(), this.field3853 ? 35040 : 35044);
            this.field3856.field556 += arg1 - this.field3854;
            this.field3849 = arg1;
        } else if (this.field3852 > 0) {
            OpenGL.glBindBufferARB(this.field3846, this.field3852);
            OpenGL.glBufferSubDataARBa(this.field3846, 0, this.field3854, arg2.getAddress());
            this.field3856.field556 += arg1 - this.field3854;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field3854 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lom;IZ)V", line = 305)
    public class239(class642 arg0, int arg1, boolean arg2) {
        this.field3846 = arg1;
        this.field3853 = arg2;
        this.field3856 = arg0;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)V", line = 206)
    public void method924(byte arg0, int arg1) {
        if (arg0 >= -31) {
            return;
        }
        field3847++;
        if (this.field3849 < arg1) {
            this.method1660(256);
            if (this.field3852 > 0) {
                OpenGL.glBindBufferARB(this.field3846, this.field3852);
                OpenGL.glBufferDataARBub(this.field3846, arg1, null, 0, this.field3853 ? 35040 : 35044);
                this.field3856.field556 += arg1 - this.field3849;
            } else {
                this.field3862 = this.field3856.method426(false, arg1, 123);
            }
            this.field3849 = arg1;
        }
        this.field3854 = arg1;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V", line = 236)
    public void method697(int arg0) {
        field3858++;
        if (arg0 != -18934) {
            this.method695((byte) -24);
        }
        if (this.field3852 > 0) {
            this.field3856.method3627(this.field3852, 8960, this.field3854);
            this.field3852 = -1;
        }
    }

    @OriginalMember(owner = "client!wr", name = "finalize", descriptor = "()V", line = 256)
    protected final void finalize() throws Throwable {
        this.method697(-18934);
        field3861++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V", line = 265)
    private final void method1660(int arg0) {
        field3850++;
        if (this.field3852 >= 0) {
            return;
        }
        if (this.field3856.field9170) {
            OpenGL.glGenBuffersARB(1, class630.field8851, 0);
            this.field3852 = class630.field8851[0];
            OpenGL.glBindBufferARB(this.field3846, this.field3852);
        } else {
            this.field3852 = 0;
        }
        if (arg0 != 256) {
            this.field3849 = -84;
        }
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)V", line = 291)
    public final void method1661(int arg0) {
        if (this.field3856.field9170) {
            OpenGL.glBindBufferARB(this.field3846, this.field3852);
        }
        field3845++;
        int var2 = 21 % ((arg0 - 87) / 39);
    }
}
