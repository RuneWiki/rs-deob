import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class378 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2193(int arg0, int arg1) {
        if (arg1 == 255) {
            field5336++;
            return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF275E) >> 16) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBI)I")
    public static final int method2194(int arg0, byte arg1, int arg2) {
        if (arg1 == -44) {
            field5335++;
            int var3 = arg0 - 1 & arg2 >> 31;
            return ((arg2 >>> 31) + arg2) % arg0 + var3;
        } else {
            return 33;
        }
    }
}
