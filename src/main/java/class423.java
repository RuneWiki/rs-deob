import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class423 extends OutputStream {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Lfn;")
    public static class52 field5814 = new class52(93, 12);

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Lfn;")
    public static class52 field5817 = new class52(104, 6);

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[I")
    public static int[] field5818 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static final void method2451(int arg0) {
        class121.field1696 = 0;
        if (arg0 != 2) {
            return;
        }
        field5816++;
        int var1 = (class2.field21.field6765 >> 7) + class153.field2204;
        int var2 = (class2.field21.field6746 >> 7) + class325.field4472;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class121.field1696 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class121.field1696 = 1;
        }
        if (class121.field1696 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class121.field1696 = 0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method2452(byte arg0) {
        field5814 = null;
        if (arg0 != 19) {
            method2452((byte) -11);
        }
        field5818 = null;
        field5817 = null;
    }

    @OriginalMember(owner = "client!uh", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field5815++;
        throw new IOException();
    }
}
