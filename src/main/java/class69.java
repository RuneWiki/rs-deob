import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class69 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lcga;")
    public static class449 field901 = new class449(24, -1);

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lhm;")
    public static class208 field903 = new class208(64);

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
    public static boolean field904 = false;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 10)
    public static void method550(byte arg0) {
        if (arg0 == 116) {
            field901 = null;
            field903 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILqf;)V", line = 31)
    public static final void method551(int arg0, class638 arg1) {
        field902++;
        int var2 = 0;
        arg1.method3582(122);
        for (int var3 = 0; var3 < class149.field1788; var3++) {
            int var15 = class95.field1239[var3];
            if ((class518.field6559[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class518.field6559[var15] = (byte) class364.method2113(class518.field6559[var15], 2);
                    var2--;
                } else {
                    int var16 = arg1.method3578(8, 1);
                    if (var16 == 0) {
                        var2 = class618.method3447(arg1, 36067);
                        class518.field6559[var15] = (byte) class364.method2113(class518.field6559[var15], 2);
                    } else {
                        class288.method1729(var15, arg1, 0);
                    }
                }
            }
        }
        arg1.method3576((byte) 36);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method3582(124);
        for (int var4 = 0; var4 < class149.field1788; var4++) {
            int var13 = class95.field1239[var4];
            if ((class518.field6559[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class518.field6559[var13] = (byte) class364.method2113(class518.field6559[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method3578(8, 1);
                    if (var14 == 0) {
                        var2 = class618.method3447(arg1, 36067);
                        class518.field6559[var13] = (byte) class364.method2113(class518.field6559[var13], 2);
                    } else {
                        class288.method1729(var13, arg1, 0);
                    }
                }
            }
        }
        arg1.method3576((byte) 36);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method3582(-3);
        for (int var5 = 0; var5 < class22.field245; var5++) {
            int var11 = class372.field4798[var5];
            if ((class518.field6559[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class518.field6559[var11] = (byte) class364.method2113(class518.field6559[var11], 2);
                } else {
                    int var12 = arg1.method3578(8, 1);
                    if (var12 == 0) {
                        var2 = class618.method3447(arg1, 36067);
                        class518.field6559[var11] = (byte) class364.method2113(class518.field6559[var11], 2);
                    } else if (class78.method607(arg1, 255, var11)) {
                        class518.field6559[var11] = (byte) class364.method2113(class518.field6559[var11], 2);
                    }
                }
            }
        }
        if (arg0 <= 17) {
            return;
        }
        arg1.method3576((byte) 36);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method3582(-20);
        for (int var6 = 0; var6 < class22.field245; var6++) {
            int var9 = class372.field4798[var6];
            if ((class518.field6559[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class518.field6559[var9] = (byte) class364.method2113(class518.field6559[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method3578(8, 1);
                    if (var10 == 0) {
                        var2 = class618.method3447(arg1, 36067);
                        class518.field6559[var9] = (byte) class364.method2113(class518.field6559[var9], 2);
                    } else if (class78.method607(arg1, 255, var9)) {
                        class518.field6559[var9] = (byte) class364.method2113(class518.field6559[var9], 2);
                    }
                }
            }
        }
        arg1.method3576((byte) 36);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class149.field1788 = 0;
        class22.field245 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class518.field6559[var7] = (byte) (class518.field6559[var7] >> 1);
            class365 var8 = class132.field1601[var7];
            if (var8 == null) {
                class372.field4798[class22.field245++] = var7;
            } else {
                class95.field1239[class149.field1788++] = var7;
            }
        }
    }
}
