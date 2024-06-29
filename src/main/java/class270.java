import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class270 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field3935 = 0;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "[I")
    public static int[] field3936 = new int[4096];

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lgo;")
    public static class304 field3937 = new class304();

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[Z")
    public static boolean[] field3940 = new boolean[200];

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1825(int arg0) {
        field3938++;
        if (arg0 != -27471) {
            field3940 = null;
        }
        try {
            if (class347.field4785 == 1) {
                int var1 = class264.field3811.method2595((byte) -97);
                if (var1 > 0 && class264.field3811.method2610(-62466233)) {
                    int var2 = var1 - class449.field6386;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class264.field3811.method2611(-106, var2);
                } else {
                    class264.field3811.method2613((byte) 115);
                    class264.field3811.method2604((byte) -55);
                    if (class26.field278 == null) {
                        class347.field4785 = 0;
                    } else {
                        class347.field4785 = 2;
                    }
                    class93.field1308 = null;
                    class96.field1344 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class264.field3811.method2613((byte) 122);
            class96.field1344 = null;
            class93.field1308 = null;
            class347.field4785 = 0;
            class26.field278 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 60)
    public static void method1826(byte arg0) {
        field3936 = null;
        if (arg0 <= -97) {
            field3940 = null;
            field3937 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 78)
    public static final int method1827(String arg0, boolean arg1) {
        if (arg1) {
            return -18;
        } else {
            field3939++;
            return class427.method2552(arg0, 10, true, (byte) -126);
        }
    }
}
