import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class101 extends class467 {

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public int field1447 = (int) (class224.method1457((byte) -62) / 1000L);

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "Ljava/lang/String;")
    public String field1448;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "S")
    public short field1453;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "Lcw;")
    public static class21 field1452;

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "Luha;")
    public static class723 field1451;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
    public static void method683(byte arg0) {
        field1452 = null;
        int var1 = -81 / ((-arg0 - 19) / 57);
        field1451 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
    public static final void method684(int arg0, int arg1) {
        class706 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class339 var4 = class155.field2126[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class314.field4059; var5++) {
                    for (int var6 = 0; var6 < class485.field6556; var6++) {
                        var2 = var4.method504(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class509.field7106;
                            int var8 = var5 << class509.field7106;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class339 var10 = class155.field2126[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1959(127, var5, var6) - var10.method1959(127, var5, var6);
                                    int var12 = var4.method1959(127, var5, var6 + 1) - var10.method1959(126, var5, var6 + 1);
                                    int var13 = var4.method1959(125, var5 + 1, var6 + 1) - var10.method1959(127, var5 + 1, var6 + 1);
                                    int var14 = var4.method1959(124, var5 + 1, var6) - var10.method1959(123, var5 + 1, var6);
                                    var10.method500(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZZII)V")
    public static final void method685(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field1449++;
        if (class393.method2393(arg3, -1)) {
            if (!arg1) {
                field1454 = -31;
            }
            class675.method3868(arg4, arg0, (byte) -120, class491.field6599[arg3], -1, arg2);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILpaa;)Lpaa;")
    public static final class712 method686(int arg0, class712 arg1) {
        field1450++;
        if (arg1.field10030 != arg0) {
            return class733.method4073(true, arg1.field10030);
        }
        int var2 = arg1.field9998 >>> 16;
        class395 var3 = new class395(class426.field5894);
        for (class14 var4 = (class14) var3.method2406((byte) 12); var4 != null; var4 = (class14) var3.method2407(72)) {
            if (var4.field194 == var2) {
                return class733.method4073(true, (int) var4.field7166);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class101(String arg0, int arg1) {
        this.field1448 = arg0;
        this.field1453 = (short) arg1;
    }

    static {
        new class747("", 76);
    }
}
