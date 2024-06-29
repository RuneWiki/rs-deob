import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class57 extends class155 {

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
    public int field999 = 0;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "[Lvd;")
    public static class307[] field1002 = new class307[32768];

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field1004 = -1;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "Ljava/lang/String;")
    public static String field998;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "[Lek;")
    public static class250[] field1000;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "(I)V")
    public static void method365(int arg0) {
        field998 = null;
        field1002 = null;
        field1000 = null;
        if (arg0 != -3) {
            field1002 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static final void method366(byte arg0) {
        class133.field2194 = 0;
        field1001++;
        class292.field4791 = 0;
        class163.field2661 = 0;
        class240.field4059 = 0;
        if (arg0 == -106) {
            class130.field2149 = false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILab;B)V")
    private final void method367(int arg0, class249 arg1, byte arg2) {
        if (arg0 == 2) {
            this.field999 = arg1.method1821((byte) 51);
        }
        if (arg2 != -59) {
            this.field999 = -91;
        }
        field1003++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lab;I)V")
    public final void method368(class249 arg0, int arg1) {
        if (arg1 != 0) {
            this.method367(16, (class249) null, (byte) 117);
        }
        while (true) {
            int var3 = arg0.method1802((byte) 60);
            if (var3 == 0) {
                field1005++;
                return;
            }
            this.method367(var3, arg0, (byte) -59);
        }
    }
}
