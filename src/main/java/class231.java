import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class231 extends class513 {

    @OriginalMember(owner = "client!cha", name = "x", descriptor = "D")
    public double field3358;

    @OriginalMember(owner = "client!cha", name = "w", descriptor = "[[S")
    public short[][] field3357;

    @OriginalMember(owner = "client!cha", name = "v", descriptor = "I")
    public static int field3356 = -1;

    @OriginalMember(owner = "client!cha", name = "y", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "([[SD)V")
    public class231(short[][] arg0, double arg1) {
        this.field3358 = arg1;
        this.field3357 = arg0;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)J")
    public final long method1566(byte arg0) {
        field3359++;
        if (arg0 != -9) {
            this.method1566((byte) -5);
        }
        return (long) (this.field3357[0].length | this.field3357.length << 0);
    }
}
