import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class17 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Ljava/lang/String;")
    public String field171;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Ljava/lang/String;")
    public String field173;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Ljava/lang/String;")
    public String field172;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 7)
    public class17(String arg0, String arg1, String arg2) {
        this.field171 = arg2;
        this.field173 = arg1;
        this.field172 = arg0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)I", line = 19)
    public static final int method95(byte arg0, int arg1) {
        if (arg0 > -8) {
            return 54;
        }
        field174++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xFE) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V", line = 73)
    public static final void method96() {
        class267.method1783(1, class504.field7090);
    }
}
