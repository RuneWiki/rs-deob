import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class127 extends OutputStream {

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Lpj;")
    public static class284 field1865 = new class284();

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Z")
    public static boolean field1867 = true;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field1869 = -1;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB[Ljk;IZI)V")
    public static final void method882(int arg0, byte arg1, class297[] arg2, int arg3, boolean arg4, int arg5) {
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class297 var7 = arg2[var6];
            if (var7 != null && var7.field4542 == arg5) {
                class160.method1081(arg3, arg0, var7, arg4, 1);
                class103.method752((byte) 118, arg0, arg3, var7);
                if (var7.field4594 > var7.field4675 - var7.field4531) {
                    var7.field4594 = var7.field4675 - var7.field4531;
                }
                if (var7.field4594 < 0) {
                    var7.field4594 = 0;
                }
                if (var7.field4656 > var7.field4555 - var7.field4627) {
                    var7.field4656 = var7.field4555 - var7.field4627;
                }
                if (var7.field4656 < 0) {
                    var7.field4656 = 0;
                }
                if (var7.field4553 == 0) {
                    class128.method886(78, var7, arg4);
                }
            }
        }
        field1862++;
        if (arg1 > -85) {
            field1866 = -52;
        }
    }

    @OriginalMember(owner = "client!kg", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1864++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method883(int arg0) {
        if (arg0 != 0) {
            field1869 = -113;
        }
        field1865 = null;
    }
}
