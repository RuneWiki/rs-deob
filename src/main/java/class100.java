import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class100 {

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1573 = 0;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1571;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B[BLfj;)V")
    public final void method708(byte arg0, byte[] arg1, class274 arg2) {
        field1574++;
        if (arg0 < 0) {
            return;
        }
        if (arg2.field4441[arg2.field4458] != 31 || arg2.field4441[arg2.field4458 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1571 == null) {
            this.field1571 = new Inflater(true);
        }
        try {
            this.field1571.setInput(arg2.field4441, arg2.field4458 + 10, -arg2.field4458 + -18 + arg2.field4441.length);
            this.field1571.inflate(arg1);
        } catch (Exception var4) {
            this.field1571.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1571.reset();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILgi;Z)Lud;")
    public static final class2 method709(int arg0, int arg1, class164 arg2, boolean arg3) {
        if (!arg3) {
            field1573 = -8;
        }
        field1572++;
        return class284.method1927(arg1, (byte) -78, arg0, arg2) ? class79.method573((byte) 91) : null;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class100() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(III)V")
    private class100(int arg0, int arg1, int arg2) {
    }
}
