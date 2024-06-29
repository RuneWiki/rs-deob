import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class107 {

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
    public static final void method712(byte arg0) {
        if (arg0 < 102) {
            method713(-30, null, -119);
        }
        if (class161.method977(-3552)) {
            if (class390.field5937 == null) {
                class186.method1162((byte) 123);
            }
            class9.field99 = 0;
            class168.field2448 = true;
            try {
                class112.field1580 = class528.field7769.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        field1544++;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILmn;I)Laq;")
    public static final class340 method713(int arg0, class162 arg1, int arg2) {
        field1543++;
        byte[] var3 = arg1.method1010(arg0, (byte) 119);
        if (var3 == null) {
            return null;
        } else if (arg2 == -1) {
            return new class340(var3);
        } else {
            return null;
        }
    }
}
