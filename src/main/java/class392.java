import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class392 extends class604 {

    @OriginalMember(owner = "client!hea", name = "Q", descriptor = "Lhm;")
    public static class208 field5012 = new class208(5);

    @OriginalMember(owner = "client!hea", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field5015 = new String[200];

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!hea", name = "R", descriptor = "Ltea;")
    public static class224 field5013;

    @OriginalMember(owner = "client!hea", name = "S", descriptor = "Lxa;")
    public static class468 field5014;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(II)V")
    public static final void method2229(int arg0, int arg1) {
        if (arg1 != -21628) {
            method2230((byte) 97);
        }
        field5011++;
        class11.field106 = arg0;
        class185.field2189.method1218(96);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)V")
    public static void method2230(byte arg0) {
        field5015 = null;
        field5014 = null;
        field5013 = null;
        if (arg0 == -127) {
            field5012 = null;
        }
    }
}
