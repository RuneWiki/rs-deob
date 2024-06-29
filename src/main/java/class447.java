import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class447 {

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public int field6243;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "Lhl;")
    private class529 field6244;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field6242 = 0;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V", line = 7)
    public static final void method2512(byte arg0) {
        field6245++;
        if (arg0 >= -57) {
            field6242 = 56;
        }
        for (int var1 = 0; var1 < class635.field8835; var1++) {
            class573 var2 = class643.field8975[var1];
            if (var2.field8069 == 3) {
                if (var2.field8062 == null) {
                    var2.field8057 = Integer.MIN_VALUE;
                } else {
                    class143.field1851.method2542(var2.field8062);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "finalize", descriptor = "()V", line = 41)
    protected final void finalize() throws Throwable {
        this.field6244.method2932(true, this.field6243);
        field6241++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILjava/io/File;)[B", line = 53)
    public static final byte[] method2513(int arg0, File arg1) {
        field6246++;
        int var2 = -127 % ((arg0 - 20) / 62);
        return class181.method1032(arg1, (byte) 78, (int) arg1.length());
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lhl;II)V", line = 63)
    public class447(class529 arg0, int arg1, int arg2) {
        this.field6243 = arg2;
        this.field6244 = arg0;
    }
}
