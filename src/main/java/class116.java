import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class class116 implements class615 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    private int field1762 = -1;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    private int field1777 = 0;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Lko;")
    public class529 field1766;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    private int field1765;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Z")
    private boolean field1770;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Lfba;")
    public static class27 field1771 = new class27(88, 3);

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "Lef;")
    public static class512 field1782;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    private int field1772;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    private int field1776;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field1767;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "[S")
    public static short[] field1780;

    static {
        new class174("", 76);
        field1782 = new class512();
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V", line = 6)
    public final void method864(boolean arg0) {
        if (arg0) {
            this.method870((byte) 89);
        }
        field1773++;
        if (this.field1766.field7665) {
            OpenGL.glBindBufferARB(this.field1765, this.field1762);
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)J", line = 20)
    public final long method865(int arg0) {
        field1764++;
        if (arg0 == 0) {
            return this.field1762 == 0 ? this.field1767.getAddress() : 0L;
        } else {
            return -71L;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljaclib/memory/Source;II)Z", line = 32)
    public final boolean method866(Source arg0, int arg1, int arg2) {
        field1768++;
        if (arg2 != 35044) {
            method871(26, (byte) 11, 126);
        }
        if (arg1 > this.field1772) {
            this.method870((byte) 15);
            if (this.field1762 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field1765, this.field1762);
            OpenGL.glBufferDataARBa(this.field1765, arg1, arg0.getAddress(), this.field1770 ? 35040 : 35044);
            this.field1766.field2385 += arg1 - this.field1776;
            this.field1772 = arg1;
        } else if (this.field1762 > 0) {
            OpenGL.glBindBufferARB(this.field1765, this.field1762);
            OpenGL.glBufferSubDataARBa(this.field1765, 0, this.field1776, arg0.getAddress());
            this.field1766.field2385 += arg1 - this.field1776;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field1776 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!eg", name = "finalize", descriptor = "()V", line = 76)
    protected final void finalize() throws Throwable {
        field1779++;
        this.method602((byte) 41);
        super.finalize();
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lko;IZ)V", line = 219)
    public class116(class529 arg0, int arg1, boolean arg2) {
        this.field1766 = arg0;
        this.field1765 = arg1;
        this.field1770 = arg2;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V", line = 92)
    public static void method867(int arg0) {
        field1782 = null;
        if (arg0 == -6999) {
            field1780 = null;
            field1771 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLjaggl/MapBuffer;)Z", line = 104)
    public final boolean method868(byte arg0, MapBuffer arg1) {
        field1763++;
        boolean var3 = true;
        if (this.field1777 != 0) {
            if (this.field1762 > 0) {
                OpenGL.glBindBufferARB(this.field1765, this.field1762);
                if (this.field1777 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field1765, 0, this.field1772, this.field1766.field2262.getAddress());
                } else {
                    var3 = arg1.method3727();
                }
            }
            this.field1777 = 0;
        }
        if (arg0 != 75) {
            field1782 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)I", line = 137)
    public int method600(int arg0) {
        int var2 = 6 % ((arg0 + 54) / 56);
        field1783++;
        return this.field1776;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V", line = 149)
    public void method602(byte arg0) {
        if (this.field1762 > 0) {
            this.field1766.method3196(this.field1762, 108, this.field1776);
            this.field1762 = -1;
        }
        if (arg0 != 41) {
            this.method602((byte) -84);
        }
        field1781++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLjaggl/MapBuffer;B)Ljaclib/memory/Buffer;", line = 175)
    public final Buffer method869(boolean arg0, MapBuffer arg1, byte arg2) {
        if (arg2 != -3) {
            this.method866(null, 75, 18);
        }
        field1761++;
        if (this.field1777 == 0) {
            this.method870((byte) 15);
            if (this.field1762 <= 0) {
                this.field1777 = 2;
                return this.field1767;
            }
            OpenGL.glBindBufferARB(this.field1765, this.field1762);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field1765, this.field1772, null, 0, this.field1770 ? 35040 : 35044);
                if (this.field1776 <= this.field1766.field2262.field9729) {
                    this.field1777 = 1;
                    return this.field1766.field2262;
                }
            }
            if (!arg1.method3728() && arg1.method3726(this.field1765, this.field1776, 35001)) {
                this.field1777 = 2;
                return arg1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V", line = 229)
    private final void method870(byte arg0) {
        field1774++;
        if (this.field1762 >= 0) {
            return;
        }
        if (this.field1766.field7665) {
            OpenGL.glGenBuffersARB(1, class159.field2533, 0);
            this.field1762 = class159.field2533[0];
            OpenGL.glBindBufferARB(this.field1765, this.field1762);
        } else {
            this.field1762 = 0;
        }
        if (arg0 != 15) {
            this.field1766 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V", line = 255)
    public void method604(int arg0, int arg1) {
        if (this.field1772 < arg0) {
            this.method870((byte) 15);
            if (this.field1762 > 0) {
                OpenGL.glBindBufferARB(this.field1765, this.field1762);
                OpenGL.glBufferDataARBub(this.field1765, arg0, null, 0, this.field1770 ? 35040 : 35044);
                this.field1766.field2385 += arg0 - this.field1772;
            } else {
                this.field1767 = this.field1766.method1154(false, arg0, -108);
            }
            this.field1772 = arg0;
        }
        field1769++;
        this.field1776 = arg0;
        if (arg1 <= 113) {
            this.method865(74);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBI)V", line = 285)
    public static final void method871(int arg0, byte arg1, int arg2) {
        field1778++;
        class313 var3 = class312.method1998((long) arg0, 7, -1);
        var3.method2001((byte) 122);
        var3.field4464 = arg2;
        if (arg1 != 116) {
            method867(6);
        }
    }
}
