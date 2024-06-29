import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class715 extends class49 {

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "[B")
    public byte[] field9933;

    @OriginalMember(owner = "client!kha", name = "x", descriptor = "I")
    public static int field9931 = 0;

    @OriginalMember(owner = "client!kha", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field9932 = new String[200];

    @OriginalMember(owner = "client!kha", name = "w", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Lha;I)V", line = 3)
    public static final void method4006(class473 arg0, int arg1) {
        class340.field4924 = new class485[class75.field842.length];
        field9930++;
        for (int var2 = arg1; var2 < class75.field842.length; var2++) {
            int var3 = class75.field842[var2];
            class300 var4 = class397.method2445(class92.field1077, (byte) 90, var3);
            class442 var5 = arg0.method179(var4, class279.method1823(class83.field1001, var3), true);
            class340.field4924[var2] = new class485(var5, var4);
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)V", line = 40)
    public static void method4007(int arg0) {
        field9932 = null;
        if (arg0 != 0) {
            method4006(null, -46);
        }
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "([B)V", line = 49)
    public class715(byte[] arg0) {
        this.field9933 = arg0;
    }
}
