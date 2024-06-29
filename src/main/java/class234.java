import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class234 {

    @OriginalMember(owner = "client!or", name = "a", descriptor = "Lmba;")
    public static class217 field2868 = new class217();

    @OriginalMember(owner = "client!or", name = "c", descriptor = "Lcq;")
    public static class110 field2870 = new class110(14, 5);

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "[Lrb;")
    public static class383[] field2869;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V", line = 9)
    public static final void method1391(int arg0, int arg1) {
        if (class258.field3249 == arg1) {
            class291.field3642.method514(false, arg0);
        } else {
            class168.field1878 = arg0;
        }
        field2872++;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 25)
    public static void method1392(byte arg0) {
        field2870 = null;
        field2869 = null;
        int var1 = 2 / ((-arg0 - 68) / 51);
        field2868 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/io/File;ZI[B)V", line = 37)
    public static final void method1393(File arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field2871++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        try {
            if (arg1) {
                field2869 = null;
            }
            var4.readFully(arg3, 0, arg2);
        } catch (EOFException var5) {
        }
        var4.close();
    }
}
