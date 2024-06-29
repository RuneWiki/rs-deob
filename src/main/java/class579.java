import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class579 extends IOException {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lcm;")
    public static class731 field8108;

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 4)
    public class579(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I", line = 7)
    public static final int method3304(int arg0, int arg1) {
        field8107++;
        int var2 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return arg1 == 2040235568 ? var6 & 0xFF : 71;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 26)
    public static void method3305(byte arg0) {
        field8108 = null;
        if (arg0 != 2) {
            method3304(-43, 48);
        }
    }
}
