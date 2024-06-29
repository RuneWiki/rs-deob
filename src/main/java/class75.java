import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class75 {

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lkb;")
    public static class93 field1357 = class76.method390("Fps:", 0);

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lkb;")
    public static class93 field1358 = class76.method390("jolt", 0);

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Z")
    public static boolean field1359 = false;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lkb;")
    public static class93 field1362 = class76.method390("leuchten3:", 0);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Z")
    public static boolean field1356 = false;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static final void method386(int arg0) {
        if (arg0 != -23949) {
            field1361 = 81;
        }
        field1354++;
        try {
            if (class24.field365 == 1) {
                int var1 = class142.field2784.method977(true);
                if (var1 > 0 && class142.field2784.method958(false)) {
                    int var2 = var1 - class148.field2861;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class142.field2784.method986(16384, var2);
                } else {
                    class142.field2784.method981((byte) -92);
                    class142.field2784.method969((byte) -89);
                    if (class101.field1852 == null) {
                        class24.field365 = 0;
                    } else {
                        class24.field365 = 2;
                    }
                    class23.field351 = null;
                    class178.field3542 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class142.field2784.method981((byte) -92);
            class24.field365 = 0;
            class178.field3542 = null;
            class23.field351 = null;
            class101.field1852 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)Lrc;")
    public static final class157 method387(int arg0, byte arg1) {
        field1355++;
        class157 var2 = (class157) class43.field701.method680((long) arg0, (byte) 105);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class1.field22.method461(3, (byte) 95, arg0);
        class157 var4 = new class157();
        if (var3 != null) {
            var4.method1028(0, new class158(var3));
        }
        class43.field701.method678(true, var4, (long) arg0);
        if (arg1 >= -90) {
            field1357 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method388(byte arg0) {
        field1357 = null;
        field1362 = null;
        field1358 = null;
        int var1 = 101 % (-arg0 / 55);
    }
}
