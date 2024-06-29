import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class434 implements class447 {

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public int field6072;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "Lqca;")
    public static class115 field6070 = new class115(10, 2, 2, 0);

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field6075 = 0;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "Lcg;")
    public static class136 field6077;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Ljw;")
    public final class551 method930(int arg0) {
        if (arg0 != 17503) {
            field6075 = 1;
        }
        field6071++;
        return class519.field7368;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
    public static void method2623(int arg0) {
        if (arg0 != -17157) {
            method2625(-101, 116, null, 40);
        }
        field6077 = null;
        field6070 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIB)Ldm;")
    public static final class50 method2624(int arg0, int arg1, byte arg2) {
        field6076++;
        class50 var3 = class545.method3220(65535, arg0);
        if (arg1 == -1) {
            return var3;
        } else if (arg2 >= -39) {
            return null;
        } else if (var3 == null || var3.field863 == null || var3.field863.length <= arg1) {
            return null;
        } else {
            return var3.field863[arg1];
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IILkg;I)Lwga;")
    public static final class745 method2625(int arg0, int arg1, class271 arg2, int arg3) {
        field6074++;
        int var4 = arg2.field3881 | arg1 << 10;
        class745 var5 = (class745) class46.field677.method3236((long) var4 << 16, (byte) 107);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class515.field7336.method1478((byte) -72, class515.field7336.method1476(var4, (byte) 125));
        if (var6 == null) {
            int var9 = arg0 + 65536 << 10 | arg2.field3881;
            class745 var10 = (class745) class46.field677.method3236((long) var9 << 16, (byte) 107);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class515.field7336.method1478((byte) -72, class515.field7336.method1476(var9, (byte) -59));
            if (var11 == null) {
                int var14 = arg2.field3881 | arg3;
                class745 var15 = (class745) class46.field677.method3236((long) var14 << 16, (byte) 107);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class515.field7336.method1478((byte) -72, class515.field7336.method1476(var14, (byte) -3));
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class745 var17;
                    try {
                        var17 = class204.method1421(125, var16);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field10436 = arg2;
                    class46.field677.method3237((long) var14 << 16, var17, 16205);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class745 var12;
                try {
                    var12 = class204.method1421(109, var11);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field10436 = arg2;
                class46.field677.method3237((long) var9 << 16, var12, arg3 - 67091635);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class745 var7;
            try {
                var7 = class204.method1421(arg3 ^ 0x3FFFC72, var6);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field10436 = arg2;
            class46.field677.method3237((long) var4 << 16, var7, arg3 - 67091635);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)V")
    public static final void method2626(int arg0, int arg1, int arg2, int arg3) {
        field6073++;
        int var4 = arg3 << 3;
        int var5 = arg0 << 3;
        if (arg2 != 24811) {
            return;
        }
        int var6 = arg1 << 3;
        if (class666.field9338 == 2) {
            class717.field10039 = var6;
            class694.field9754 = var5;
            class239.field3371 = var4;
        }
        class321.field4568 = var4;
        class432.field6035 = var5;
        class181.method1295(115);
        class674.field9471 = true;
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(I)V")
    public class434(int arg0) {
        this.field6072 = arg0;
    }
}
