import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class424 extends OutputStream {

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
    public static int field5896 = -1;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "I")
    public static int field5897 = 0;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!kfa", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field5899++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIILne;)V")
    public static final void method2496(int arg0, int arg1, int arg2, class203 arg3) {
        class172 var4 = class134.method1114(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field2595 = arg3;
        int var5 = class678.field9594 == class454.field6207 ? 1 : 0;
        if (arg3.method1170(16383)) {
            if (arg3.method1175((byte) 41)) {
                arg3.field10360 = class277.field3997[var5];
                class277.field3997[var5] = arg3;
                return;
            }
            arg3.field10360 = class5.field74[var5];
            class5.field74[var5] = arg3;
            class87.field1297 = true;
            return;
        }
        arg3.field10360 = class407.field5602[var5];
        class407.field5602[var5] = arg3;
    }
}
