import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class410 extends class376 {

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field5956 = 2;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field5960 = 0;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lng;")
    public static class190 field5951 = new class190(50);

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public int field5949;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public int field5953;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public int field5957;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public int field5958;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public int field5959;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "Lci;")
    public static class261 field5962;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lrg;")
    public class383 field5946;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Lrg;")
    public class383 field5954;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Ljava/lang/String;")
    public String field5950;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Z")
    public boolean field5947;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Z")
    public static boolean field5952;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "[Ljava/lang/Object;")
    public Object[] field5961;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public static void method2628(int arg0) {
        int var1 = 95 / ((63 - arg0) / 54);
        field5962 = null;
        field5951 = null;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
    public static final void method2629(byte arg0) {
        field5945++;
        if (arg0 != 6) {
            field5951 = null;
        }
        class333.field4511 = new class383[class120.field1700.method1915(arg0 ^ 0x71)][];
        class270.field3678 = new boolean[class120.field1700.method1915(92)];
    }
}
