import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class93 {

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Lkaa;")
    public static class47 field1121 = new class47(29, 15);

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "[I")
    public static int[] field1122;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V", line = 3)
    public static void method696(byte arg0) {
        field1121 = null;
        if (arg0 != -23) {
            field1121 = null;
        }
        field1122 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILjava/io/File;)[B", line = 23)
    public static final byte[] method697(int arg0, int arg1, File arg2) {
        field1123++;
        try {
            byte[] var3 = new byte[arg1];
            class205.method1370(arg2, -33, var3, arg1);
            if (arg0 != 9233) {
                method697(-16, -36, null);
            }
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }
}
