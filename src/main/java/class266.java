import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class266 extends RuntimeException {

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "Ljava/lang/String;")
    public String field3892;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3893;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field3891 = 1406;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field3890;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "[S")
    public static short[] field3895;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    public static void method1684(int arg0) {
        if (arg0 != 128) {
            method1685((byte) -83);
        }
        field3895 = null;
        field3890 = null;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
    public static final void method1685(byte arg0) {
        field3894++;
        class470 var1 = (class470) class97.field1274.method2655(15152);
        if (arg0 != 52) {
            field3895 = null;
        }
        while (var1 != null) {
            class143 var2 = var1.field6564;
            if (var2.field1878 < class390.field5481) {
                var1.method2891(arg0 ^ 0xFFFFFFB2);
                var2.method889((byte) -96);
            } else if (var2.field1869 <= class390.field5481) {
                if (var2.field1873 > 0) {
                    class378 var3 = (class378) class125.field1687.method2405((long) (var2.field1873 - 1), arg0 ^ 0xFFFFFFAE);
                    if (var3 != null) {
                        class429 var4 = var3.field5353;
                        if (var4.field1896 >= 0 && (class43.field494 * 128) > var4.field1896 && var4.field1899 >= 0 && var4.field1899 < (class500.field7068 * 128)) {
                            var2.method888(arg0 ^ 0x44, class390.field5481, class488.method2817(var4.field1896, true, var4.field1899, var2.field1904) - var2.field1866, var4.field1896, var4.field1899);
                        }
                    }
                }
                if (var2.field1873 < 0) {
                    int var5 = -var2.field1873 - 1;
                    class22 var6;
                    if (class343.field4982 == var5) {
                        var6 = class246.field3587;
                    } else {
                        var6 = class378.field5355[var5];
                    }
                    if (var6 != null && var6.field1896 >= 0 && var6.field1896 < (class43.field494 * 128) && var6.field1899 >= 0 && var6.field1899 < (class500.field7068 * 128)) {
                        var2.method888(arg0 + 51, class390.field5481, class488.method2817(var6.field1896, true, var6.field1899, var2.field1904) - var2.field1866, var6.field1896, var6.field1899);
                    }
                }
                var2.method896(class288.field4213, (byte) 84);
                class120.method806(var2, true);
            }
            var1 = (class470) class97.field1274.method2660((byte) 67);
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class266(Throwable arg0, String arg1) {
        this.field3892 = arg1;
        this.field3893 = arg0;
    }
}
