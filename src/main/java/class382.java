import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class382 {

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field5192 = 0;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "J")
    public static long field5191 = 0L;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Z")
    public static boolean field5195 = false;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)V", line = 16)
    public static final void method2323(byte arg0, int arg1) {
        field5194++;
        if (arg0 < 34) {
            method2323((byte) -50, -7);
        }
        class547.field7432 = arg1;
        class663.field9208.method273(15);
    }
}
