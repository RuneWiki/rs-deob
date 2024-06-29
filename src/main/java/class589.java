import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class589 {

    @OriginalMember(owner = "client!via", name = "e", descriptor = "I")
    public static int field8043 = 0;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!via", name = "b", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!via", name = "c", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!via", name = "d", descriptor = "Lvia;")
    public class589 field8042;

    @OriginalMember(owner = "client!via", name = "f", descriptor = "Lvia;")
    public class589 field8044;

    @OriginalMember(owner = "client!via", name = "d", descriptor = "(I)V")
    public final void method3310(int arg0) {
        field8039++;
        if (this.field8042 == null) {
            return;
        }
        this.field8042.field8044 = this.field8044;
        this.field8044.field8042 = this.field8042;
        this.field8042 = null;
        if (arg0 != 30305) {
            this.field8042 = null;
        }
        this.field8044 = null;
    }

    @OriginalMember(owner = "client!via", name = "e", descriptor = "(I)V")
    public static final void method3311(int arg0) {
        field8041++;
        if (arg0 != -32217) {
            field8043 = 123;
        }
        for (class377 var1 = (class377) class625.field8473.method679((byte) -86); var1 != null; var1 = (class377) class625.field8473.method681(-36)) {
            class655 var2 = var1.field5494;
            if (var2.field8841) {
                var1.method1102((byte) 63);
                var2.method3642((byte) -9);
            } else if (class572.field7788 >= var2.field8821) {
                var2.method3644(class643.field8659, -1);
                if (var2.field8841) {
                    var1.method1102((byte) 77);
                } else {
                    class359.method2278(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(I[BLjava/io/File;I)V")
    public static final void method3312(int arg0, byte[] arg1, File arg2, int arg3) throws IOException {
        field8040++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg1, arg0, arg3);
        } catch (EOFException var5) {
        }
        var4.close();
    }
}
