import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class350 {

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "Lin;")
    public static class380 field4962 = new class380(72, 1);

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "[I")
    public static int[] field4963 = new int[1024];

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Lin;")
    public static class380 field4964 = new class380(99, -1);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILkja;)V", line = 4)
    public static final void method2123(int arg0, class373 arg1) {
        field4961++;
        int var2 = 0;
        arg1.method2220((byte) -125);
        for (int var3 = 0; var3 < class469.field6382; var3++) {
            int var15 = class464.field6311[var3];
            if ((class84.field1268[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class84.field1268[var15] = (byte) class694.method3895(class84.field1268[var15], 2);
                } else {
                    int var16 = arg1.method2222(8, 1);
                    if (var16 == 0) {
                        var2 = class256.method1684((byte) -90, arg1);
                        class84.field1268[var15] = (byte) class694.method3895(class84.field1268[var15], 2);
                    } else {
                        class768.method4245(147233862, arg1, var15);
                    }
                }
            }
        }
        arg1.method2223(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method2220((byte) -127);
        for (int var4 = 0; var4 < class469.field6382; var4++) {
            int var13 = class464.field6311[var4];
            if ((class84.field1268[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class84.field1268[var13] = (byte) class694.method3895(class84.field1268[var13], 2);
                } else {
                    int var14 = arg1.method2222(arg0 ^ 0xA, 1);
                    if (var14 == 0) {
                        var2 = class256.method1684((byte) -95, arg1);
                        class84.field1268[var13] = (byte) class694.method3895(class84.field1268[var13], 2);
                    } else {
                        class768.method4245(147233862, arg1, var13);
                    }
                }
            }
        }
        arg1.method2223(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method2220((byte) -114);
        if (arg0 != 2) {
            method2125((byte) 94, -28, 55);
        }
        for (int var5 = 0; var5 < class443.field6145; var5++) {
            int var11 = class319.field4541[var5];
            if ((class84.field1268[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class84.field1268[var11] = (byte) class694.method3895(class84.field1268[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method2222(8, 1);
                    if (var12 == 0) {
                        var2 = class256.method1684((byte) -117, arg1);
                        class84.field1268[var11] = (byte) class694.method3895(class84.field1268[var11], 2);
                    } else if (class228.method1544(255, arg1, var11)) {
                        class84.field1268[var11] = (byte) class694.method3895(class84.field1268[var11], 2);
                    }
                }
            }
        }
        arg1.method2223(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method2220((byte) -119);
        for (int var6 = 0; var6 < class443.field6145; var6++) {
            int var9 = class319.field4541[var6];
            if ((class84.field1268[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class84.field1268[var9] = (byte) class694.method3895(class84.field1268[var9], 2);
                } else {
                    int var10 = arg1.method2222(8, 1);
                    if (var10 == 0) {
                        var2 = class256.method1684((byte) -76, arg1);
                        class84.field1268[var9] = (byte) class694.method3895(class84.field1268[var9], 2);
                    } else if (class228.method1544(arg0 ^ 0xFD, arg1, var9)) {
                        class84.field1268[var9] = (byte) class694.method3895(class84.field1268[var9], 2);
                    }
                }
            }
        }
        arg1.method2223(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class443.field6145 = 0;
        class469.field6382 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class84.field1268[var7] = (byte) (class84.field1268[var7] >> 1);
            class21 var8 = class588.field8451[var7];
            if (var8 == null) {
                class319.field4541[class443.field6145++] = var7;
            } else {
                class464.field6311[class469.field6382++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 215)
    public static void method2124(int arg0) {
        if (arg0 == 2) {
            field4962 = null;
            field4963 = null;
            field4964 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BII)Z", line = 230)
    public static final boolean method2125(byte arg0, int arg1, int arg2) {
        if (arg0 != 17) {
            field4964 = null;
        }
        field4960++;
        return (arg2 & 0x100) != 0;
    }
}
