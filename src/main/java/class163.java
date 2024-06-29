import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class163 {

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "I")
    public static int field2324 = 0;

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "Lbw;")
    public static class143 field2326 = new class143(8);

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!eha", name = "e", descriptor = "Lsca;")
    public static class432 field2327;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V")
    public static void method1147(int arg0) {
        field2326 = null;
        field2327 = null;
        if (arg0 <= 72) {
            method1149(-87, (byte) 24, -79);
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(Ljc;B)V")
    public static final void method1148(class168 arg0, byte arg1) {
        field2323++;
        int var2 = 0;
        arg0.method1203(-26008);
        for (int var3 = 0; var3 < class468.field6665; var3++) {
            int var16 = class38.field500[var3];
            if ((class64.field1011[var16] & 0x1) == 0) {
                if (var2 > 0) {
                    class64.field1011[var16] = (byte) class430.method2658(class64.field1011[var16], 2);
                    var2--;
                } else {
                    int var17 = arg0.method1206(1, (byte) -90);
                    if (var17 == 0) {
                        var2 = class708.method3964((byte) 109, arg0);
                        class64.field1011[var16] = (byte) class430.method2658(class64.field1011[var16], 2);
                    } else {
                        class504.method3084((byte) -117, var16, arg0);
                    }
                }
            }
        }
        arg0.method1208((byte) 64);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method1203(-26008);
        for (int var4 = 0; var4 < class468.field6665; var4++) {
            int var14 = class38.field500[var4];
            if ((class64.field1011[var14] & 0x1) != 0) {
                if (var2 > 0) {
                    class64.field1011[var14] = (byte) class430.method2658(class64.field1011[var14], 2);
                    var2--;
                } else {
                    int var15 = arg0.method1206(1, (byte) -90);
                    if (var15 == 0) {
                        var2 = class708.method3964((byte) 125, arg0);
                        class64.field1011[var14] = (byte) class430.method2658(class64.field1011[var14], 2);
                    } else {
                        class504.method3084((byte) -75, var14, arg0);
                    }
                }
            }
        }
        arg0.method1208((byte) -84);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        int var5 = 55 % ((-arg1 - 49) / 44);
        arg0.method1203(-26008);
        for (int var6 = 0; var6 < class247.field3606; var6++) {
            int var12 = class669.field9537[var6];
            if ((class64.field1011[var12] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class64.field1011[var12] = (byte) class430.method2658(class64.field1011[var12], 2);
                } else {
                    int var13 = arg0.method1206(1, (byte) -90);
                    if (var13 == 0) {
                        var2 = class708.method3964((byte) 94, arg0);
                        class64.field1011[var12] = (byte) class430.method2658(class64.field1011[var12], 2);
                    } else if (class587.method3456(arg0, var12, 3)) {
                        class64.field1011[var12] = (byte) class430.method2658(class64.field1011[var12], 2);
                    }
                }
            }
        }
        arg0.method1208((byte) -33);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method1203(-26008);
        for (int var7 = 0; var7 < class247.field3606; var7++) {
            int var10 = class669.field9537[var7];
            if ((class64.field1011[var10] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class64.field1011[var10] = (byte) class430.method2658(class64.field1011[var10], 2);
                } else {
                    int var11 = arg0.method1206(1, (byte) -90);
                    if (var11 == 0) {
                        var2 = class708.method3964((byte) 120, arg0);
                        class64.field1011[var10] = (byte) class430.method2658(class64.field1011[var10], 2);
                    } else if (class587.method3456(arg0, var10, 3)) {
                        class64.field1011[var10] = (byte) class430.method2658(class64.field1011[var10], 2);
                    }
                }
            }
        }
        arg0.method1208((byte) 107);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class468.field6665 = 0;
        class247.field3606 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            class64.field1011[var8] = (byte) (class64.field1011[var8] >> 1);
            class639 var9 = class536.field7796[var8];
            if (var9 == null) {
                class669.field9537[class247.field3606++] = var8;
            } else {
                class38.field500[class468.field6665++] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1149(int arg0, byte arg1, int arg2) {
        field2325++;
        if (arg1 >= -120) {
            method1149(68, (byte) -5, -2);
        }
        return (arg2 & 0x22) != 0;
    }
}
