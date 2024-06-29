import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class445 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "[F")
    public static float[] field6179 = new float[16];

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field6180 = 0;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Z")
    public static boolean field6183 = false;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!uf", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field6182++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BC)C", line = 20)
    public static final char method2661(byte arg0, char arg1) {
        field6181++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else {
            if (arg0 != 104) {
                method2662((byte) 9);
            }
            if (arg1 == 'ß') {
                return 's';
            } else if (arg1 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg1 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 57)
    public static void method2662(byte arg0) {
        field6179 = null;
        if (arg0 >= -38) {
            method2661((byte) 51, (char) 65518);
        }
    }
}
