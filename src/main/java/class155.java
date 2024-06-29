import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public abstract class class155 {

    @OriginalMember(owner = "client!un", name = "a", descriptor = "Lck;")
    public class733 field1968;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    private int field1974;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "Z")
    private boolean field1976;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    private int field1977;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "[I")
    public static int[] field1973 = new int[3];

    @OriginalMember(owner = "client!un", name = "k", descriptor = "Z")
    public static boolean field1978 = false;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Lgh;")
    public static class54 field1970 = new class54(11, 0, 1, 2);

    @OriginalMember(owner = "client!un", name = "m", descriptor = "[I")
    public static int[] field1980 = new int[1];

    @OriginalMember(owner = "client!un", name = "l", descriptor = "Ltq;")
    public static class536 field1979 = new class536(5);

    @OriginalMember(owner = "client!un", name = "n", descriptor = "Luw;")
    public static class208 field1981 = new class208(7, 6);

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "[S")
    public static short[] field1972;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(B)V", line = 4)
    public static void method875(byte arg0) {
        field1980 = null;
        int var1 = 114 / ((arg0 - 37) / 55);
        field1972 = null;
        field1981 = null;
        field1970 = null;
        field1979 = null;
        field1973 = null;
    }

    @OriginalMember(owner = "client!un", name = "finalize", descriptor = "()V", line = 21)
    protected final void finalize() throws Throwable {
        field1969++;
        this.field1968.method3944(33639, this.field1977, this.field1971);
        super.finalize();
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B[BI)V", line = 34)
    public final void method876(byte arg0, byte[] arg1, int arg2) {
        if (arg0 != -102) {
            return;
        }
        field1975++;
        this.method877((byte) 100);
        if (arg2 <= this.field1977) {
            OpenGL.glBufferSubDataARBub(this.field1974, 0, arg2, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field1974, arg2, arg1, 0, this.field1976 ? 35040 : 35044);
            this.field1968.field9823 += arg2 - this.field1977;
            this.field1977 = arg2;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lck;I[BIZ)V", line = 63)
    public class155(class733 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1968 = arg0;
        this.field1974 = arg1;
        this.field1976 = arg4;
        this.field1977 = arg3;
        OpenGL.glGenBuffersARB(1, class653.field8367, 0);
        this.field1971 = class653.field8367[0];
        this.method877((byte) -114);
        OpenGL.glBufferDataARBub(arg1, this.field1977, arg2, 0, this.field1976 ? 35040 : 35044);
        this.field1968.field9823 += this.field1977;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lck;ILjaclib/memory/Buffer;IZ)V", line = 87)
    public class155(class733 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field1974 = arg1;
        this.field1977 = arg3;
        this.field1968 = arg0;
        this.field1976 = arg4;
        OpenGL.glGenBuffersARB(1, class653.field8367, 0);
        this.field1971 = class653.field8367[0];
        this.method877((byte) 31);
        OpenGL.glBufferDataARBa(arg1, this.field1977, arg2.getAddress(), this.field1976 ? 35040 : 35044);
        this.field1968.field9823 += this.field1977;
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(B)V")
    public abstract void method877(byte arg0);
}
