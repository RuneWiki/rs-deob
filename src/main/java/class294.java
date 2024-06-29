import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class294 extends class359 {

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Z")
    public static boolean field4213 = false;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field4216 = 0;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "[I")
    public static int[] field4217 = new int[250];

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Lkh;")
    public class11 field4212;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Z")
    public boolean field4214;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static void method1869(int arg0) {
        field4217 = null;
        if (arg0 != -11331) {
            field4213 = false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILqs;Lqs;)V")
    public static final void method1870(int arg0, class359 arg1, class359 arg2) {
        if (arg1.field5247 != null) {
            arg1.method2290((byte) 98);
        }
        if (arg0 < 53) {
            method1869(-101);
        }
        field4215++;
        arg1.field5243 = arg2;
        arg1.field5247 = arg2.field5247;
        arg1.field5247.field5243 = arg1;
        arg1.field5243.field5247 = arg1;
    }
}
