import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class105 extends OutputStream {

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field1435 = 0;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field1438 = 0;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "Lnq;")
    public static class268 field1439;

    @OriginalMember(owner = "client!pq", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1436++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
    public static final void method749(int arg0) {
        field1437++;
        if (!class258.field3620) {
            return;
        }
        class24.field415 = null;
        if (arg0 < 32) {
            field1434 = -25;
        }
        class258.field3620 = false;
        class349.field4805 = null;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
    public static void method750(int arg0) {
        field1439 = null;
        if (arg0 != 0) {
            method749(11);
        }
    }
}
