import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class152 {

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    private int field2503;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lhk;")
    public class111 field2494;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    private int field2497;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Z")
    private boolean field2499;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public int field2504;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2495 = 0;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lfja;")
    public static class783 field2502;

    @OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        field2506++;
        this.field2494.method992(3, this.field2497, this.field2504);
        super.finalize();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(CZ)I", line = 14)
    public static final int method1195(char arg0, boolean arg1) {
        if (arg1) {
            method1198(36, false, (byte) -117, 14);
        }
        field2501++;
        return arg0 >= '\u0000' && class287.field3961.length > arg0 ? class287.field3961[arg0] : -1;
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V", line = 42)
    public static void method1196(int arg0) {
        if (arg0 <= 70) {
            field2496 = -41;
        }
        field2502 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BI)V", line = 58)
    public final void method1197(int arg0, byte[] arg1, int arg2) {
        this.method177(-22194);
        if (arg2 != 0) {
            this.field2497 = -12;
        }
        field2498++;
        if (arg0 <= this.field2497) {
            OpenGL.glBufferSubDataARBub(this.field2503, 0, arg0, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field2503, arg0, arg1, 0, this.field2499 ? 35040 : 35044);
            this.field2494.field1951 += arg0 - this.field2497;
            this.field2497 = arg0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lhk;I[BIZ)V", line = 82)
    public class152(class111 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field2503 = arg1;
        this.field2494 = arg0;
        this.field2497 = arg3;
        this.field2499 = arg4;
        OpenGL.glGenBuffersARB(1, class455.field6203, 0);
        this.field2504 = class455.field6203[0];
        this.method177(-22194);
        OpenGL.glBufferDataARBub(arg1, this.field2497, arg2, 0, this.field2499 ? 35040 : 35044);
        this.field2494.field1951 += this.field2497;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lhk;ILjaclib/memory/Buffer;IZ)V", line = 101)
    public class152(class111 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field2499 = arg4;
        this.field2503 = arg1;
        this.field2497 = arg3;
        this.field2494 = arg0;
        OpenGL.glGenBuffersARB(1, class455.field6203, 0);
        this.field2504 = class455.field6203[0];
        this.method177(-22194);
        OpenGL.glBufferDataARBa(arg1, this.field2497, arg2.getAddress(), this.field2499 ? 35040 : 35044);
        this.field2494.field1951 += this.field2497;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZBI)V", line = 121)
    public static final void method1198(int arg0, boolean arg1, byte arg2, int arg3) {
        if (class524.field7128.method337((long) arg3, 1) == null) {
            if (class137.field2351) {
                class430 var4 = new class430(arg3, new class4(4096, class421.field5755, arg3), arg0, arg1);
                var4.field5868.method704(class657.field9094[class464.field6309], arg2 + 186);
                class524.field7128.method341((long) arg3, var4, (byte) 113);
            } else {
                class567.method3276(-1, arg1, arg3);
            }
        }
        if (arg2 != -98) {
            field2500 = 94;
        }
        field2505++;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public abstract void method177(int arg0);
}
