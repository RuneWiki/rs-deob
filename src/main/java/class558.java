import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class558 extends InputStream {

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "[[I")
    public static int[][] field7748 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public static void method3070(int arg0) {
        if (arg0 <= 97) {
            method3070(63);
        }
        field7748 = null;
    }

    @OriginalMember(owner = "client!uu", name = "read", descriptor = "()I")
    public final int read() {
        field7747++;
        class419.method2233(-28448, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
    public static final void method3071(byte arg0) throws IOException {
        if (class446.field5686 != null && class403.field5052 > 0) {
            int var1 = 0;
            while (true) {
                class704 var2 = (class704) class227.field2830.method237(91);
                if (var2 == null) {
                    class589.field8277 = 0;
                    class626.field8733 += var1;
                    break;
                }
                class446.field5686.method1230(var2.field9929.field8804, 0, var2.field9931, (byte) 116);
                class403.field5052 -= var2.field9931;
                var1 += var2.field9931;
                var2.method1871(-96);
                var2.field9929.method3488((byte) -122);
                var2.method3946((byte) -120);
            }
        }
        field7749++;
        if (arg0 < 78) {
            field7748 = null;
        }
    }
}
