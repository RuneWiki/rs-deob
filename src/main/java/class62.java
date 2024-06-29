import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class62 {

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "Z")
    public static boolean field837 = false;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "Lgk;")
    public static class468 field833;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static void method438(int arg0) {
        if (arg0 != 256) {
            field837 = false;
        }
        field833 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZ)V")
    public static final void method439(int arg0, boolean arg1) {
        while (true) {
            if (class400.field5966.method1816(71, class158.field2386) >= 15) {
                int var2 = class400.field5966.method1823(15, arg0 + 13255);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (class88.field1375[var2] == null) {
                        class88.field1375[var2] = new class351();
                        class88.field1375[var2].field6015 = var2;
                        var3 = true;
                    }
                    class351 var4 = class88.field1375[var2];
                    class327.field5114[class519.field7609++] = var2;
                    var4.field6038 = class86.field1350;
                    if (var4.field5409 != null && var4.field5409.method1733(-1)) {
                        class145.method1052(var4, 0);
                    }
                    int var5 = class400.field5966.method1823(1, 13255);
                    if (var5 == 1) {
                        class40.field532[class58.field797++] = var2;
                    }
                    int var6 = class400.field5966.method1823(3, 13255) + 4 << 11 & 0x3E89;
                    int var7 = class400.field5966.method1823(1, 13255);
                    int var8;
                    if (arg1) {
                        var8 = class400.field5966.method1823(8, 13255);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = class400.field5966.method1823(5, arg0 ^ 0x33C7);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    int var9;
                    if (arg1) {
                        var9 = class400.field5966.method1823(8, 13255);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = class400.field5966.method1823(5, 13255);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    int var10 = class400.field5966.method1823(2, 13255);
                    var4.method2127(class373.field5641.method774(class400.field5966.method1823(14, arg0 + 13255), arg0 ^ 0xFFFFFFB0), (byte) -102);
                    var4.method2424(var4.field5409.field4128, (byte) 101);
                    var4.field5971 = var4.field5409.field4196 << 3;
                    if (var4.field5971 == 0) {
                        var4.method2413(0, arg0 ^ 0x3FFF);
                    } else if (var3) {
                        var4.method2413(var6, 16383);
                    }
                    var4.method2124(var7 == 1, class410.field6198.field6068[0] + var8, (byte) 24, class410.field6198.field6065[0] + var9, var4.method2419((byte) 111), var10);
                    if (var4.field5409.method1733(-1)) {
                        class454.method2644(0, null, var4, (byte) 38, null, var4.field7686, var4.field6065[0], var4.field6068[0]);
                    }
                    continue;
                }
            }
            field835++;
            class400.field5966.method1818(arg0 + 86);
            if (arg0 != 0) {
                method438(-124);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
    public class62(int arg0) {
        this.field836 = arg0;
    }

    @OriginalMember(owner = "client!ns", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field834++;
        throw new IllegalStateException();
    }
}
