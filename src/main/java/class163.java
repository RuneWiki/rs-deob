import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class163 {

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field2897 = -1;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lmb;")
    public static class96 field2895 = class243.method1708("0", (byte) 94);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field2891 = 0;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lff;")
    public static class3 field2892;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[[B")
    public static byte[][] field2894;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)Z")
    public static final boolean method1183(boolean arg0) {
        if (arg0) {
            method1184(46);
        }
        field2896++;
        try {
            return class75.method546(-209);
        } catch (IOException var4) {
            class260.method1798(7);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class6.field126 + "," + class46.field794 + "," + class252.field4365 + " - " + class47.field820 + "," + (class236.field4047.field4528[0] + class196.field3383) + "," + (class225.field3832 + class236.field4047.field4566[0]) + " - ";
            for (int var3 = 0; var3 < class47.field820 && var3 < 50; var3++) {
                var2 = var2 + class1.field4.field4144[var3] + ",";
            }
            client.method815(var2, (byte) -121, var5);
            class74.method533((byte) 62);
            return true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1184(int arg0) {
        field2894 = null;
        if (arg0 >= 24) {
            field2895 = null;
            field2892 = null;
        }
    }
}
