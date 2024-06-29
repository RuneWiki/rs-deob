import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class365 extends OutputStream {

    @OriginalMember(owner = "client!gha", name = "e", descriptor = "[[I")
    public static int[][] field5268 = new int[6][];

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "[I")
    public static int[] field5267 = null;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)V", line = 8)
    public static final void method2300(byte arg0) {
        field5266++;
        if (!class444.field6399) {
            class444.field6399 = true;
            int var1 = -54 / ((78 - arg0) / 38);
            class7.field61 = true;
            class495.field6971 += (24.0F - class495.field6971) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(BI)V", line = 25)
    public static final void method2301(byte arg0, int arg1) {
        field5265++;
        class778 var2 = class389.method2406(-117, (long) arg1, 10);
        var2.method4276(0);
        int var3 = 54 % ((-arg0 - 1) / 33);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)V", line = 40)
    public static void method2302(int arg0) {
        field5268 = null;
        if (arg0 <= -113) {
            field5267 = null;
        }
    }

    @OriginalMember(owner = "client!gha", name = "write", descriptor = "(I)V", line = 57)
    public final void write(int arg0) throws IOException {
        field5264++;
        throw new IOException();
    }
}
