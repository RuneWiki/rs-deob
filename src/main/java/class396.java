import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class396 {

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "Lbj;")
    public static class162 field6024 = new class162(63, -1);

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "Lo;")
    public static class24 field6025;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZLnn;Ljava/lang/String;)I")
    public static final int method2460(boolean arg0, class289 arg1, String arg2) {
        field6023++;
        int var3 = arg1.field4399;
        byte[] var4 = class60.method535(-8218, arg2);
        arg1.method1823(var4.length, (byte) 119);
        arg1.field4399 += class142.field2354.method2336(8, var4, arg1.field4399, arg1.field4408, 0, var4.length);
        if (arg0) {
            method2460(true, null, null);
        }
        return arg1.field4399 - var3;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
    public static void method2461(byte arg0) {
        if (arg0 != 4) {
            field6025 = null;
        }
        field6025 = null;
        field6024 = null;
    }
}
