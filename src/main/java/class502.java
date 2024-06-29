import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class502 {

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Lnk;")
    public static class500 field7371 = new class500("LIVE", 0);

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "Lvp;")
    public static class123 field7372 = new class123(65, 15);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILir;)V")
    public static final void method2988(int arg0, class22 arg1) {
        field7370++;
        int var2 = arg1.field314 - class180.field2734;
        int var3 = arg1.field374 * arg0 + (arg1.method184(arg0 - 127) * 64);
        int var4 = arg1.field312 * 128 + arg1.method184(arg0 - 127) * 64;
        arg1.field408 = 0;
        arg1.field5539 += (var4 - arg1.field5539) / var2;
        arg1.field5529 += (var3 - arg1.field5529) / var2;
        if (arg1.field328 == 0) {
            arg1.method187(8192, 0);
        }
        if (arg1.field328 == 1) {
            arg1.method187(12288, 0);
        }
        if (arg1.field328 == 2) {
            arg1.method187(0, 0);
        }
        if (arg1.field328 == 3) {
            arg1.method187(4096, 0);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public static void method2989(int arg0) {
        if (arg0 != 128) {
            method2988(-76, null);
        }
        field7372 = null;
        field7371 = null;
    }
}
