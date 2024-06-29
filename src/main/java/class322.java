import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class322 {

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field5084 = 0;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[I")
    public static int[] field5082 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "[I")
    public static int[] field5083 = new int[100];

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZI)V", line = 10)
    public static final void method2272(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = -57 / ((-arg1 - 50) / 56);
        field5079++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class318.field5024 = arg3;
        class61.field903 = arg0;
        class157.field2427 = arg2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lcd;B)Lcd;", line = 28)
    public static final class136 method2273(class136 arg0, byte arg1) {
        field5085++;
        if (arg0.field2090 != -1) {
            return class14.method140(arg0.field2090, 1036508464);
        }
        if (arg1 > -125) {
            method2272(55, -24, true, 10);
        }
        int var2 = arg0.field2069 >>> 16;
        class244 var3 = new class244(class210.field3304);
        for (class25 var4 = (class25) var3.method1746(0); var4 != null; var4 = (class25) var3.method1749(-50)) {
            if (var4.field376 == var2) {
                return class14.method140((int) var4.field4430, 1036508464);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lug;ZILug;Ldk;)V", line = 64)
    public static final void method2274(class253 arg0, boolean arg1, int arg2, class253 arg3, class226 arg4) {
        field5080++;
        class134.field1971 = arg1;
        class241.field3761 = arg3;
        class130.field1928 = arg0;
        int var5 = -103 % ((arg2 - 16) / 54);
        int var6 = class130.field1928.method1810(0) - 1;
        class269.field4188 = var6 * 256 + class130.field1928.method1826(0, var6);
        class297.field4585 = new String[] { null, null, null, null, class276.field4264 };
        class232.field3615 = arg4;
        class329.field5152 = new String[] { null, null, class341.field5304, null, null };
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 87)
    public static void method2275(int arg0) {
        field5082 = null;
        if (arg0 != 1) {
            method2274((class253) null, true, -48, (class253) null, (class226) null);
        }
        field5083 = null;
    }
}
