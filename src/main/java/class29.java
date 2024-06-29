import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class29 extends InputStream {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Lqu;")
    public static class364 field256 = new class364(77, 2);

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[Lfc;")
    public static class323[] field260;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method126(int arg0) {
        field256 = null;
        if (arg0 == -23844) {
            field260 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([JB[Ljava/lang/Object;)V")
    public static final void method127(long[] arg0, byte arg1, Object[] arg2) {
        field261++;
        class500.method3008(arg0, 0, arg0.length - 1, arg2, 119);
        if (arg1 != -125) {
            field256 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static final void method128(byte arg0) {
        field259++;
        if (arg0 < 123) {
            return;
        }
        if (class192.field2903 == 2) {
            class463.method2749(1, 3);
        } else if (class192.field2903 == 6) {
            class463.method2749(1, 7);
        } else if (class192.field2903 == 9) {
            class463.method2749(1, 10);
        }
    }

    @OriginalMember(owner = "client!rc", name = "read", descriptor = "()I")
    public final int read() {
        field258++;
        class428.method2624(1, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILjava/io/File;)[B")
    public static final byte[] method129(int arg0, int arg1, File arg2) {
        field257++;
        try {
            int var3 = 26 / ((arg1 + 73) / 52);
            byte[] var4 = new byte[arg0];
            class368.method2246(arg0, 84, var4, arg2);
            return var4;
        } catch (IOException var5) {
            return null;
        }
    }
}
