import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class265 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Z")
    public static boolean field4262 = false;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "[[B")
    public static byte[][] field4265 = new byte[250][];

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Lok;")
    public static class137 field4264;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static final void method1811(int arg0) {
        class392 var1 = class110.field1528;
        synchronized (class110.field1528) {
            class110.field1528.method2473((byte) -53);
            if (arg0 != 250) {
                field4265 = null;
            }
        }
        field4266++;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public static void method1812(int arg0) {
        field4265 = null;
        if (arg0 != 250) {
            method1813((byte) 83, -107L);
        }
        field4264 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BJ)V")
    public static final void method1813(byte arg0, long arg1) {
        int var3 = -18 % ((21 - arg0) / 43);
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        field4263++;
    }
}
