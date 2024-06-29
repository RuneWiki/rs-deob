import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class88 extends class110 {

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field1873 = 0;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "Leh;")
    public static class47 field1875 = class195.method1282((byte) -4, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "Leh;")
    private static class47 field1874 = class195.method1282((byte) -4, "button near the top of that page)3");

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "[I")
    public static int[] field1880 = new int[256];

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "Leh;")
    private static class47 field1879 = class195.method1282((byte) -4, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "Leh;")
    public static class47 field1881 = field1879;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field1877 = 0;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "Leh;")
    public static class47 field1883 = field1874;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "B")
    public byte field1876;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "Leh;")
    public class47 field1872;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)V")
    public static final void method720(int arg0, int arg1, int arg2) {
        class188.field3644 = true;
        class64.field1393 = arg0;
        class206.field4051 = arg1;
        class191.field3691 = arg2;
        class108.field2237 = -1;
        class21.field396 = -1;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public static void method721(int arg0) {
        field1883 = null;
        field1881 = null;
        field1880 = null;
        if (arg0 == -12315) {
            field1874 = null;
            field1875 = null;
            field1879 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZBI)Leh;")
    public static final class47 method722(int arg0, boolean arg1, byte arg2, int arg3) {
        field1882++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = arg0 / arg3;
        int var5 = 1;
        if (arg2 <= 120) {
            return null;
        }
        while (var4 != 0) {
            var5++;
            var4 /= arg3;
        }
        int var6 = var5;
        if (arg0 < 0 || arg1) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = arg0 % arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
            arg0 /= arg3;
        }
        class47 var9 = new class47();
        var9.field940 = var6;
        var9.field960 = var7;
        return var9;
    }
}
