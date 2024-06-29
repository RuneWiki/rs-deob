import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public abstract class class127 implements class299 {

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    private int field1521 = -1;

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "I")
    private int field1533 = 0;

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client!eda", name = "u", descriptor = "Z")
    private boolean field1540;

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "Lck;")
    public class221 field1525;

    @OriginalMember(owner = "client!eda", name = "h", descriptor = "Lofa;")
    public static class139 field1527 = new class139("RC", 1);

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "I")
    public static int field1537 = -1;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!eda", name = "i", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!eda", name = "s", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!eda", name = "t", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!eda", name = "v", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!eda", name = "w", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!eda", name = "x", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field1531;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILjaclib/memory/Source;)Z")
    public final boolean method816(int arg0, int arg1, Source arg2) {
        if (arg0 != 35040) {
            return false;
        }
        field1541++;
        if (arg1 > this.field1530) {
            this.method824((byte) 8);
            if (this.field1521 <= 0) {
                throw new RuntimeException("ARGH!");
            }
            OpenGL.glBindBufferARB(this.field1524, this.field1521);
            OpenGL.glBufferDataARBa(this.field1524, arg1, arg2.getAddress(), this.field1540 ? 35040 : 35044);
            this.field1525.field9544 += arg1 - this.field1522;
            this.field1530 = arg1;
        } else if (this.field1521 > 0) {
            OpenGL.glBindBufferARB(this.field1524, this.field1521);
            OpenGL.glBufferSubDataARBa(this.field1524, 0, this.field1522, arg2.getAddress());
            this.field1525.field9544 += arg1 - this.field1522;
        } else {
            throw new RuntimeException("ARGH!");
        }
        this.field1522 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)V")
    public static void method817(int arg0) {
        field1527 = null;
        if (arg0 != -1) {
            field1535 = -93;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IB)V")
    public void method818(int arg0, byte arg1) {
        field1543++;
        int var3 = 103 / ((49 - arg1) / 34);
        if (this.field1530 < arg0) {
            this.method824((byte) 8);
            if (this.field1521 <= 0) {
                this.field1531 = this.field1525.method3740(-3317, arg0, false);
            } else {
                OpenGL.glBindBufferARB(this.field1524, this.field1521);
                OpenGL.glBufferDataARBub(this.field1524, arg0, null, 0, this.field1540 ? 35040 : 35044);
                this.field1525.field9544 += arg0 - this.field1530;
            }
            this.field1530 = arg0;
        }
        this.field1522 = arg0;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)I")
    public int method819(byte arg0) {
        if (arg0 >= -108) {
            method825(-51, 52, -27, 4, 1);
        }
        field1526++;
        return this.field1522;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILjaggl/MapBuffer;)Z")
    public final boolean method820(int arg0, MapBuffer arg1) {
        if (arg0 != 6667) {
            this.method816(30, 6, null);
        }
        field1534++;
        boolean var3 = true;
        if (this.field1533 != 0) {
            if (this.field1521 > 0) {
                OpenGL.glBindBufferARB(this.field1524, this.field1521);
                if (this.field1533 == 1) {
                    OpenGL.glBufferSubDataARBa(this.field1524, 0, this.field1530, this.field1525.field9437.getAddress());
                } else {
                    var3 = arg1.method284();
                }
            }
            this.field1533 = 0;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)J")
    public final long method821(int arg0) {
        field1532++;
        if (arg0 != -9428) {
            field1538 = -25;
        }
        return this.field1521 == 0 ? this.field1531.getAddress() : 0L;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
    public void method474(int arg0) {
        field1536++;
        if (this.field1521 > 0) {
            this.field1525.method1418(-128, this.field1522, this.field1521);
            this.field1521 = -1;
        }
        if (arg0 >= -74) {
            this.method819((byte) 91);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZLjaggl/MapBuffer;B)Ljaclib/memory/Buffer;")
    public final Buffer method822(boolean arg0, MapBuffer arg1, byte arg2) {
        field1520++;
        if (this.field1533 == 0) {
            this.method824((byte) 8);
            if (this.field1521 <= 0) {
                this.field1533 = 2;
                return this.field1531;
            }
            OpenGL.glBindBufferARB(this.field1524, this.field1521);
            if (arg0) {
                OpenGL.glBufferDataARBub(this.field1524, this.field1530, null, 0, this.field1540 ? 35040 : 35044);
                if (this.field1525.field9437.field5129 >= this.field1522) {
                    this.field1533 = 1;
                    return this.field1525.field9437;
                }
            }
            if (!arg1.method283() && arg1.method282(this.field1524, this.field1522, 35001)) {
                this.field1533 = 2;
                return arg1;
            }
        }
        int var4 = 18 / ((arg2 - 61) / 48);
        return null;
    }

    @OriginalMember(owner = "client!eda", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method474(-86);
        field1529++;
        super.finalize();
    }

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "(I)V")
    public final void method823(int arg0) {
        if (this.field1525.field2900) {
            OpenGL.glBindBufferARB(this.field1524, this.field1521);
        }
        field1523++;
        if (arg0 != 18071) {
            field1538 = 30;
        }
    }

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "(B)V")
    private final void method824(byte arg0) {
        if (arg0 != 8) {
            this.method818(-1, (byte) 91);
        }
        field1528++;
        if (this.field1521 >= 0) {
            return;
        }
        if (this.field1525.field2900) {
            OpenGL.glGenBuffersARB(1, class665.field9102, 0);
            this.field1521 = class665.field9102[0];
            OpenGL.glBindBufferARB(this.field1524, this.field1521);
        } else {
            this.field1521 = 0;
        }
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lck;IZ)V")
    public class127(class221 arg0, int arg1, boolean arg2) {
        this.field1524 = arg1;
        this.field1540 = arg2;
        this.field1525 = arg0;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIIII)V")
    public static final void method825(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class108.field1334 <= arg2 && arg2 <= class592.field8242) {
            int var5 = class711.method3927(arg1, -116, class328.field4190, class112.field1386);
            int var6 = class711.method3927(arg3, arg4 - 126, class328.field4190, class112.field1386);
            class216.method1309(var5, arg0, var6, -128, arg2);
        }
        field1539++;
        if (arg4 != 0) {
            method825(-19, -51, 109, 83, -128);
        }
    }
}
