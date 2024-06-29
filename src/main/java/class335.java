import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class335 {

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "Lol;")
    public static class187 field4520 = new class187("", 15);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V", line = 3)
    public static void method1918(int arg0) {
        if (arg0 > -122) {
            method1919(null, (byte) 54);
        }
        field4520 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lsi;B)V", line = 20)
    public static final void method1919(class391 arg0, byte arg1) {
        for (int var2 = 0; var2 < class124.field1847; var2++) {
            int var3 = arg0.method2332(2);
            int var4 = arg0.method2353((byte) 85);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class126.field1884[var3] != null) {
                class126.field1884[var3].field3393 = var4;
            }
        }
        field4521++;
        if (arg1 != -10) {
            field4520 = null;
        }
    }
}
