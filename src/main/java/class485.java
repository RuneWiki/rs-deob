import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class485 {

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "Ldb;")
    public static class272 field7098 = new class272(1, 2, 2, 0);

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "Lkca;")
    public static class73 field7099 = new class73(38, 7);

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "Lkca;")
    public static class73 field7100 = new class73(62, 8);

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "[Lxa;")
    public static class433[] field7097;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2926(int arg0, int arg1, int arg2) {
        if (arg0 > -71) {
            return false;
        } else {
            field7096++;
            return (arg2 & 0x20) != 0;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V", line = 19)
    public static void method2927(byte arg0) {
        field7097 = null;
        int var1 = -28 % ((arg0 - 59) / 47);
        field7099 = null;
        field7100 = null;
        field7098 = null;
    }
}
