import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class336 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "[B")
    public byte[] field4547;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[S")
    public short[] field4543;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "[S")
    public short[] field4544;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "[S")
    public short[] field4546;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 4)
    public static final boolean method1996(String arg0, byte arg1) {
        field4545++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class148.field1904; var2++) {
            if (arg0.equalsIgnoreCase(class72.field775[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class82.field1110[var2])) {
                return true;
            }
        }
        if (arg1 <= 100) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I", line = 34)
    public static final int method1997(int arg0) {
        if (arg0 <= 106) {
            method1996(null, (byte) 101);
        }
        field4548++;
        return class30.field262++;
    }
}
