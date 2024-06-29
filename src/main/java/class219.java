import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class219 {

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Lga;")
    public static class332 field2867;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Lga;")
    public static class332 field2868;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)I", line = 4)
    public static final int method1384(byte arg0, int arg1) {
        field2866++;
        int var2 = (arg1 & 0x55555555) + (arg1 >>> 1 & 0xD5555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        if (arg0 <= 83) {
            return 83;
        } else {
            int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 21)
    public static void method1385(int arg0) {
        field2867 = null;
        if (arg0 != 30036) {
            method1384((byte) -1, -28);
        }
        field2868 = null;
    }

    @OriginalMember(owner = "client!ng", name = "toString", descriptor = "()Ljava/lang/String;", line = 32)
    public final String toString() {
        field2865++;
        throw new IllegalStateException();
    }
}
