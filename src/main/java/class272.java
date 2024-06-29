import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class272 extends class96 {

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field3983;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public static int field3986 = 0;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "Z")
    public static boolean field3987 = false;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "[[[I")
    public static int[][][] field3985;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)Z")
    public final boolean method383(int arg0) {
        field3989++;
        return arg0 == 0 ? false : false;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)V")
    public static final void method1740(byte arg0) {
        class163.field2332.method586(-9);
        if (arg0 <= 16) {
            return;
        }
        field3981++;
        int var1 = class163.field2332.method594((byte) 116, 8);
        if (class294.field4642 > var1) {
            for (int var2 = var1; var2 < class294.field4642; var2++) {
                class144.field2060[class121.field1724++] = class14.field176[var2];
            }
        }
        if (var1 > class294.field4642) {
            throw new RuntimeException("gnpov1");
        }
        class294.field4642 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class14.field176[var3];
            class54 var5 = class20.field244[var4];
            int var6 = class163.field2332.method594((byte) 123, 1);
            if (var6 == 0) {
                class14.field176[class294.field4642++] = var4;
                var5.field4546 = class198.field2819;
            } else {
                int var7 = class163.field2332.method594((byte) 99, 2);
                if (var7 == 0) {
                    class14.field176[class294.field4642++] = var4;
                    var5.field4546 = class198.field2819;
                    class286.field4423[field3986++] = var4;
                } else if (var7 == 1) {
                    class14.field176[class294.field4642++] = var4;
                    var5.field4546 = class198.field2819;
                    int var8 = class163.field2332.method594((byte) 110, 3);
                    var5.method1946(1, -120, var8);
                    int var9 = class163.field2332.method594((byte) 91, 1);
                    if (var9 == 1) {
                        class286.field4423[field3986++] = var4;
                    }
                } else if (var7 == 2) {
                    class14.field176[class294.field4642++] = var4;
                    var5.field4546 = class198.field2819;
                    if (class163.field2332.method594((byte) 104, 1) == 1) {
                        int var11 = class163.field2332.method594((byte) 105, 3);
                        var5.method1946(2, -101, var11);
                        int var12 = class163.field2332.method594((byte) 89, 3);
                        var5.method1946(2, -111, var12);
                    } else {
                        int var10 = class163.field2332.method594((byte) 95, 3);
                        var5.method1946(0, -112, var10);
                    }
                    int var13 = class163.field2332.method594((byte) 100, 1);
                    if (var13 == 1) {
                        class286.field4423[field3986++] = var4;
                    }
                } else if (var7 == 3) {
                    class144.field2060[class121.field1724++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)V")
    public static void method1741(byte arg0) {
        int var1 = 54 / ((arg0 - 41) / 35);
        field3985 = null;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method382(int arg0) {
        if (arg0 == -14117) {
            field3984++;
            return this.field3983;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class272(Object arg0) {
        this.field3983 = arg0;
    }
}
