import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class425 {

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Ljava/lang/String;")
    public String field6214;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "J")
    public long field6215;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Ljava/lang/String;")
    public String field6211;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public int field6209;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public int field6210;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Lpp;")
    public static class464 field6213 = new class464(24, -1);

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "Lpp;")
    public static class464 field6216 = new class464(8, 7);

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field6217 = 4;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method2544(boolean arg0, String arg1) {
        System.out.println("Error: " + class280.method1798(arg1, "%0a", -29810, "\n"));
        field6212++;
        if (arg0) {
            field6213 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
    public static void method2545(byte arg0) {
        if (arg0 != 63) {
            method2545((byte) 14);
        }
        field6213 = null;
        field6216 = null;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class425(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field6214 = arg1;
        this.field6215 = arg4;
        this.field6211 = arg3;
        this.field6209 = arg0;
        this.field6210 = arg2;
    }
}
