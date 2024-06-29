import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class506 extends class4 {

    @OriginalMember(owner = "client!hha", name = "w", descriptor = "D")
    public double field7037;

    @OriginalMember(owner = "client!hha", name = "v", descriptor = "[[S")
    public short[][] field7036;

    @OriginalMember(owner = "client!hha", name = "s", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7033 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!hha", name = "r", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!hha", name = "t", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!hha", name = "u", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)J", line = 3)
    public final long method3042(byte arg0) {
        if (arg0 > -41) {
            return 17L;
        } else {
            field7032++;
            return (long) (this.field7036.length << 0 | this.field7036[0].length);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIILuu;)Lej;", line = 16)
    public static final class179 method3043(int arg0, int arg1, int arg2, class237 arg3) {
        field7034++;
        byte[] var4 = arg3.method1572(arg1, 0, arg0);
        if (var4 == null) {
            return null;
        } else {
            if (arg2 <= 6) {
                method3043(26, 92, 48, null);
            }
            return new class179(var4);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V", line = 39)
    public static void method3044(int arg0) {
        if (arg0 < -16) {
            field7033 = null;
        }
    }

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "([[SD)V", line = 52)
    public class506(short[][] arg0, double arg1) {
        this.field7037 = arg1;
        this.field7036 = arg0;
    }
}
