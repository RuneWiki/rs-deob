import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class class53 implements class471 {

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    private int field711 = 0;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    private int field700 = -1;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    private int field704;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "Lph;")
    private class442 field710;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "Z")
    private boolean field699;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field706 = 0;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "[[I")
    public static int[][] field720 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    private int field701;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    private int field703;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "Lha;")
    public static class116 field708;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field718;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)I")
    public int method288(int arg0) {
        field717++;
        return arg0 == 7224 ? this.field703 : 106;
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)V")
    private final void method289(int arg0) {
        field712++;
        if (this.field700 >= 0) {
            return;
        }
        if (arg0 <= 59) {
            this.field711 = -27;
        }
        if (this.field710.field6101) {
            OpenGL.glGenBuffersARB(1, class641.field9311, 0);
            this.field700 = class641.field9311[0];
            OpenGL.glBindBufferARB(this.field704, this.field700);
        } else {
            this.field700 = 0;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Z")
    public boolean method290(int arg0) {
        field721++;
        if (arg0 != 22526) {
            return false;
        }
        boolean var2 = true;
        if (this.field711 != 0) {
            if (this.field700 > 0) {
                OpenGL.glBindBufferARB(this.field704, this.field700);
                if (this.field711 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field704, 0, this.field701, this.field710.field8115.getAddress());
                } else {
                    var2 = this.field710.field6094.method3259();
                }
            }
            this.field711 = 0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
    public static void method291(boolean arg0) {
        field720 = null;
        if (!arg0) {
            field706 = -69;
        }
        field708 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)V")
    public void method292(boolean arg0, int arg1) {
        field714++;
        if (arg1 > this.field701) {
            this.method289(68);
            if (this.field700 <= 0) {
                this.field718 = this.field710.method3311(arg1, false, -20127);
            } else {
                OpenGL.glBindBufferARB(this.field704, this.field700);
                OpenGL.glBufferDataARBub(this.field704, arg1, null, 0, this.field699 ? 35040 : 35044);
                this.field710.field8294 += arg1 - this.field701;
            }
            this.field701 = arg1;
        }
        if (arg0) {
            this.field701 = -10;
        }
        this.field703 = arg1;
    }

    @OriginalMember(owner = "client!ts", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method296((byte) 36);
        field719++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZI)Z")
    public static final boolean method293(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method298(1, 9);
        }
        field716++;
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILjaclib/memory/Source;)Z")
    public final boolean method294(int arg0, int arg1, Source arg2) {
        field713++;
        if (arg0 != 35040) {
            this.field718 = null;
        }
        if (this.field701 >= arg1) {
            if (this.field700 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field704, this.field700);
            OpenGL.glBufferSubDataARBa(this.field704, 0, this.field703, arg2.getAddress());
            this.field710.field8294 += arg1 - this.field703;
        } else {
            this.method289(arg0 ^ 0x8887);
            if (this.field700 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field704, this.field700);
            OpenGL.glBufferDataARBa(this.field704, arg1, arg2.getAddress(), this.field699 ? 35040 : 35044);
            this.field710.field8294 += arg1 - this.field703;
            this.field701 = arg1;
        }
        this.field703 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(Z)J")
    public final long method295(boolean arg0) {
        if (arg0) {
            this.method289(93);
        }
        field709++;
        return this.field700 == 0 ? this.field718.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
    public void method296(byte arg0) {
        field705++;
        if (this.field700 > 0) {
            this.field710.method2563(this.field700, 100, this.field703);
            this.field700 = -1;
        }
        if (arg0 != 36) {
            method291(true);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public Buffer method297(byte arg0, boolean arg1) {
        field715++;
        if (this.field711 == 0) {
            this.method289(82);
            if (this.field700 <= 0) {
                this.field711 = 2;
                return this.field718;
            }
            OpenGL.glBindBufferARB(this.field704, this.field700);
            if (arg1) {
                OpenGL.glBufferDataARBub(this.field704, this.field701, null, 0, this.field699 ? 35040 : 35044);
                if (this.field703 <= this.field710.field8115.field7960) {
                    this.field711 = 1;
                    return this.field710.field8115;
                }
            }
            MapBuffer var3 = this.field710.field6094;
            if (!var3.method3260() && var3.method3261(this.field704, this.field703, 35001)) {
                this.field711 = 2;
                return var3;
            }
        }
        if (arg0 != 52) {
            method291(true);
        }
        return null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V")
    public static final void method298(int arg0, int arg1) {
        field702++;
        if (!class134.method708(-27, arg0)) {
            return;
        }
        class447[] var2 = class508.field7087[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class447 var4 = var2[var3];
            if (var4 != null) {
                var4.field6184 = 0;
                var4.field6212 = 0;
                var4.field6234 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lph;IZ)V")
    public class53(class442 arg0, int arg1, boolean arg2) {
        this.field704 = arg1;
        this.field710 = arg0;
        this.field699 = arg2;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)V")
    public final void method299(byte arg0) {
        if (arg0 > -58) {
            this.field703 = 108;
        }
        if (this.field710.field6101) {
            OpenGL.glBindBufferARB(this.field704, this.field700);
        }
        field707++;
    }
}
