import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class325 implements class707 {

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Ljava/lang/String;")
    private String field4554;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lwia;")
    private class791 field4557;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lbu;")
    public static class21 field4556 = new class21(13, -1);

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "[I")
    public static int[] field4552;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I", line = 6)
    public final int method2065(int arg0) {
        field4558++;
        if (this.field4557.method4328(this.field4554, (byte) 104)) {
            return 100;
        } else {
            if (arg0 != -6765) {
                this.field4554 = null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V", line = 21)
    public static void method2086(int arg0) {
        field4552 = null;
        field4556 = null;
        if (arg0 <= 44) {
            field4552 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Llj;", line = 32)
    public final class633 method2067(int arg0) {
        if (arg0 != -5905) {
            this.method2067(-109);
        }
        field4553++;
        return class633.field8887;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Z", line = 46)
    public static final boolean method2087(int arg0, int arg1, int arg2) {
        field4555++;
        if (arg1 >= -41) {
            field4556 = null;
        }
        return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lwia;Ljava/lang/String;)V", line = 62)
    public class325(class791 arg0, String arg1) {
        this.field4554 = arg1;
        this.field4557 = arg0;
    }
}
