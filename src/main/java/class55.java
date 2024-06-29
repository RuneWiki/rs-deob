import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public abstract class class55 implements class90 {

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    private int field855 = -1;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
    private int field869 = 0;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
    private int field873;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "Lfc;")
    public class642 field866;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "Z")
    private boolean field861;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "[Lsa;")
    public static class780[] field870 = new class780[8];

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    private int field854;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    private int field858;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field856;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
    public static final void method600(int arg0) {
        class622 var1 = (class622) class108.field1547.method4254((byte) 8);
        if (arg0 != 0) {
            field874 = -46;
        }
        while (var1 != null) {
            class523.method3073((byte) 70, var1.field8778);
            var1 = (class622) class108.field1547.method4251(-92);
        }
        field865++;
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(B)V")
    public static void method601(byte arg0) {
        field870 = null;
        int var1 = -119 % ((arg0 - 47) / 63);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
    public void method602(int arg0, int arg1) {
        if (arg0 != 17154) {
            field870 = null;
        }
        field868++;
        if (this.field854 < arg1) {
            this.method607((byte) 23);
            if (this.field855 > 0) {
                OpenGL.glBindBufferARB(this.field873, this.field855);
                OpenGL.glBufferDataARBub(this.field873, arg1, null, 0, this.field861 ? 35040 : 35044);
                this.field866.field1838 += arg1 - this.field854;
            } else {
                this.field856 = this.field866.method999(false, arg1, -105);
            }
            this.field854 = arg1;
        }
        this.field858 = arg1;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZILjaggl/MapBuffer;)Ljaclib/memory/Buffer;")
    public final Buffer method603(boolean arg0, int arg1, MapBuffer arg2) {
        field857++;
        if (this.field869 == 0) {
            this.method607((byte) 23);
            if (this.field855 <= 0) {
                this.field869 = 2;
                return this.field856;
            }
            OpenGL.glBindBufferARB(this.field873, this.field855);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field873, this.field854, null, 0, this.field861 ? 35040 : 35044);
                if (this.field858 <= this.field866.field1808.field5268) {
                    this.field869 = 1;
                    return this.field866.field1808;
                }
            }
            if (!arg2.method237() && arg2.method238(this.field873, this.field858, 35001)) {
                this.field869 = 2;
                return arg2;
            }
        }
        if (arg1 != 35040) {
            this.field856 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BLjaggl/MapBuffer;)Z")
    public final boolean method604(byte arg0, MapBuffer arg1) {
        field872++;
        if (arg0 != -22) {
            this.method32(-104);
        }
        boolean var3 = true;
        if (this.field869 != 0) {
            if (this.field855 > 0) {
                OpenGL.glBindBufferARB(this.field873, this.field855);
                if (this.field869 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field873, 0, this.field854, this.field866.field1808.getAddress());
                } else {
                    var3 = arg1.method239();
                }
            }
            this.field869 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)Ljava/lang/String;")
    public static final String method605(int arg0) {
        if (arg0 != -31252) {
            field874 = -12;
        }
        field859++;
        if (class383.field5382 || class493.field6765 == null) {
            return "";
        } else if ((class493.field6765.field7690 == null || class493.field6765.field7690.length() == 0) && class493.field6765.field7689 != null && class493.field6765.field7689.length() > 0) {
            return class493.field6765.field7689;
        } else {
            return class493.field6765.field7690;
        }
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(B)J")
    public final long method606(byte arg0) {
        if (arg0 < 73) {
            this.field873 = 64;
        }
        field862++;
        return this.field855 == 0 ? this.field856.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)I")
    public int method35(byte arg0) {
        if (arg0 < 71) {
            this.field873 = -77;
        }
        field867++;
        return this.field858;
    }

    @OriginalMember(owner = "client!ms", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method32(16479);
        field863++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "(B)V")
    private final void method607(byte arg0) {
        field875++;
        if (arg0 != 23 || this.field855 >= 0) {
            return;
        }
        if (this.field866.field9136) {
            OpenGL.glGenBuffersARB(1, class420.field5826, 0);
            this.field855 = class420.field5826[0];
            OpenGL.glBindBufferARB(this.field873, this.field855);
        } else {
            this.field855 = 0;
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
    public void method32(int arg0) {
        if (this.field855 > 0) {
            this.field866.method3644(this.field858, this.field855, 27231);
            this.field855 = -1;
        }
        field864++;
        if (arg0 != 16479) {
            this.field861 = false;
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lfc;IZ)V")
    public class55(class642 arg0, int arg1, boolean arg2) {
        this.field873 = arg1;
        this.field866 = arg0;
        this.field861 = arg2;
    }

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "(B)V")
    public final void method608(byte arg0) {
        field871++;
        if (arg0 == -17 && this.field866.field9136) {
            OpenGL.glBindBufferARB(this.field873, this.field855);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILjaclib/memory/Source;)Z")
    public final boolean method609(int arg0, int arg1, Source arg2) {
        if (arg1 != 0) {
            method601((byte) 100);
        }
        field860++;
        if (arg0 > this.field854) {
            this.method607((byte) 23);
            if (this.field855 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field873, this.field855);
            OpenGL.glBufferDataARBa(this.field873, arg0, arg2.getAddress(), this.field861 ? 35040 : 35044);
            this.field866.field1838 += arg0 - this.field858;
            this.field854 = arg0;
        } else if (this.field855 > 0) {
            OpenGL.glBindBufferARB(this.field873, this.field855);
            OpenGL.glBufferSubDataARBa(this.field873, 0, this.field858, arg2.getAddress());
            this.field866.field1838 += arg0 - this.field858;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field858 = arg0;
        return true;
    }
}
