import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class137 implements class316 {

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    private int field1956 = 0;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    private int field1973 = -1;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    private int field1964;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Ltk;")
    public class347 field1962;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Z")
    private boolean field1960;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    private int field1967;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    private int field1972;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field1963;

    @OriginalMember(owner = "client!mc", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.method294((byte) 44);
        field1954++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V", line = 13)
    private final void method1003(byte arg0) {
        field1970++;
        if (this.field1973 >= 0) {
            return;
        }
        if (this.field1962.field4481) {
            OpenGL.glGenBuffersARB(1, class366.field4714, 0);
            this.field1973 = class366.field4714[0];
            OpenGL.glBindBufferARB(this.field1964, this.field1973);
        } else {
            this.field1973 = 0;
        }
        if (arg0 != -51) {
            this.field1964 = 69;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)I", line = 45)
    public int method297(int arg0) {
        field1968++;
        if (arg0 != 2) {
            this.method1010(true, null, (byte) -31);
        }
        return this.field1967;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljaggl/MapBuffer;B)Z", line = 56)
    public final boolean method1004(MapBuffer arg0, byte arg1) {
        field1961++;
        boolean var3 = true;
        if (arg1 != 126) {
            return true;
        }
        if (this.field1956 != 0) {
            if (this.field1973 > 0) {
                OpenGL.glBindBufferARB(this.field1964, this.field1973);
                if (this.field1956 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field1964, 0, this.field1972, this.field1962.field5448.getAddress());
                } else {
                    var3 = arg0.method3513();
                }
            }
            this.field1956 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Ltk;IZ)V", line = 310)
    public class137(class347 arg0, int arg1, boolean arg2) {
        this.field1964 = arg1;
        this.field1962 = arg0;
        this.field1960 = arg2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 93)
    public void method294(byte arg0) {
        if (arg0 != 44) {
            this.method1011(-27);
        }
        if (this.field1973 > 0) {
            this.field1962.method2016(this.field1973, -115, this.field1967);
            this.field1973 = -1;
        }
        field1966++;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V", line = 110)
    public final void method1005(byte arg0) {
        field1971++;
        int var2 = -30 / ((arg0 + 18) / 50);
        if (this.field1962.field4481) {
            OpenGL.glBindBufferARB(this.field1964, this.field1973);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lsl;Z)Lfga;", line = 122)
    public static final class258 method1006(class461 arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        field1959++;
        class452 var2 = class649.method3640(arg0, 1);
        int var3 = arg0.method2622(-539564808);
        int var4 = arg0.method2622(-539564808);
        int var5 = arg0.method2566(-2);
        return new class258(var2.field5981, var2.field5979, var2.field5983, var2.field5985, var2.field5988, var2.field5978, var2.field5987, var2.field5980, var2.field5976, var3, var4, var5);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjaclib/memory/Source;Z)Z", line = 141)
    public final boolean method1007(int arg0, Source arg1, boolean arg2) {
        field1953++;
        if (!arg2) {
            this.field1967 = -42;
        }
        if (arg0 > this.field1972) {
            this.method1003((byte) -51);
            if (this.field1973 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field1964, this.field1973);
            OpenGL.glBufferDataARBa(this.field1964, arg0, arg1.getAddress(), this.field1960 ? 35040 : 35044);
            this.field1962.field5572 += arg0 - this.field1967;
            this.field1972 = arg0;
        } else if (this.field1973 > 0) {
            OpenGL.glBindBufferARB(this.field1964, this.field1973);
            OpenGL.glBufferSubDataARBa(this.field1964, 0, this.field1967, arg1.getAddress());
            this.field1962.field5572 += arg0 - this.field1967;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field1967 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V", line = 186)
    public void method1008(int arg0, int arg1) {
        if (arg1 != 23833) {
            this.method1008(85, -124);
        }
        if (this.field1972 < arg0) {
            this.method1003((byte) -51);
            if (this.field1973 <= 0) {
                this.field1963 = this.field1962.method2359(arg0, false, arg1 ^ 0x5D19);
            } else {
                OpenGL.glBindBufferARB(this.field1964, this.field1973);
                OpenGL.glBufferDataARBub(this.field1964, arg0, null, 0, this.field1960 ? 35040 : 35044);
                this.field1962.field5572 += arg0 - this.field1972;
            }
            this.field1972 = arg0;
        }
        field1958++;
        this.field1967 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZII)I", line = 217)
    public static final int method1009(int arg0, boolean arg1, int arg2, int arg3) {
        field1955++;
        class515 var4 = class534.method3075(arg1, arg3, -82);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else if (arg0 > -123) {
            return -20;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field7228.length; var6++) {
                if (var4.field7226[var6] == arg2) {
                    var5 += var4.field7228[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLjaggl/MapBuffer;B)Ljaclib/memory/Buffer;", line = 252)
    public final Buffer method1010(boolean arg0, MapBuffer arg1, byte arg2) {
        if (arg2 >= -65) {
            return null;
        }
        field1965++;
        if (this.field1956 == 0) {
            this.method1003((byte) -51);
            if (this.field1973 <= 0) {
                this.field1956 = 2;
                return this.field1963;
            }
            OpenGL.glBindBufferARB(this.field1964, this.field1973);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field1964, this.field1972, null, 0, this.field1960 ? 35040 : 35044);
                if (this.field1967 <= this.field1962.field5448.field9420) {
                    this.field1956 = 1;
                    return this.field1962.field5448;
                }
            }
            if (!arg1.method3512() && arg1.method3514(this.field1964, this.field1967, 35001)) {
                this.field1956 = 2;
                return arg1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)J", line = 297)
    public final long method1011(int arg0) {
        field1957++;
        if (arg0 > -109) {
            this.method1010(false, null, (byte) -99);
        }
        return this.field1973 == 0 ? this.field1963.getAddress() : 0L;
    }
}
