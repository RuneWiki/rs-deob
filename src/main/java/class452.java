import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class452 extends class189 {

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public volatile int field6392 = -1;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Ljava/lang/String;")
    public volatile String field6393;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "F")
    public static float field6397;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Lfp;")
    public static class323 field6395;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Lha;")
    public static class58 field6394;

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 11)
    public class452(String arg0) {
        this.field6393 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBLjava/io/File;)[B", line = 19)
    public static final byte[] method2698(int arg0, byte arg1, File arg2) {
        field6396++;
        try {
            if (arg1 != -124) {
                method2698(72, (byte) 69, null);
            }
            byte[] var3 = new byte[arg0];
            class10.method69(var3, arg0, -21895, arg2);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 40)
    public static void method2699(int arg0) {
        field6394 = null;
        if (arg0 == 9413) {
            field6395 = null;
        }
    }
}
