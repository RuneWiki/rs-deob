import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class290 extends class155 {

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "[B")
    public byte[] field4623;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "[Lfi;")
    public static class229[] field4625 = new class229[0];

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
    public static void method1974(byte arg0) {
        field4625 = null;
        if (arg0 > -103) {
            method1974((byte) 32);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1975(String arg0, int arg1) {
        field4624++;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = ((var3 << 5) + ((long) arg0.charAt(var5))) - var3;
        }
        int var6 = 0 / ((arg1 - 31) / 59);
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B)V")
    public class290(byte[] arg0) {
        this.field4623 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Llc;ILlc;)V")
    public static final void method1976(class270 arg0, int arg1, class270 arg2) {
        int var3 = 100 / ((arg1 - 58) / 46);
        field4622++;
        class106.field1813 = arg2;
        class228.field3354 = arg0;
        class16.field174 = class106.field1813.method1891(3, -6);
    }
}
