import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class407 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lvm;")
    public static class687 field5653 = new class687();

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field5660 = 0;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lr;")
    public class184 field5657;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lka;")
    public class475 field5651;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Z")
    public static boolean field5658;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field5654;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Lbha;", line = 10)
    public static final class575 method2380(boolean arg0) {
        field5659++;
        class575 var1 = (class575) class330.field4713.method3873(arg0);
        if (var1 == null) {
            return new class575();
        } else {
            class168.field2590--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 28)
    public static final void method2381(byte arg0) {
        int var1 = -17 / ((arg0 - 6) / 44);
        field5655++;
        class175.field2647++;
        class583 var2 = class381.method2246(1, class128.field2105, class679.field9494);
        var2.field7637.method3823(-82, class343.method2050((byte) -112));
        var2.field7637.method3831(1182, class228.field3251);
        var2.field7637.method3831(1182, class199.field2993);
        var2.field7637.method3823(-21, class411.field5711.field3912.method74(true));
        class42.method309(var2, 0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILdia;I)Ltia;", line = 45)
    public static final class270 method2382(int arg0, int arg1, class235 arg2, int arg3) {
        field5652++;
        int var4 = arg0 << 10 | arg2.field3310;
        class270 var5 = (class270) class756.field10510.method1988((long) var4 << 16, -1);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class606.field7972.method2226(arg3 + 22037, class606.field7972.method2200(var4, (byte) 100));
        if (arg3 != -22038) {
            method2382(-128, -124, null, 72);
        }
        if (var6 == null) {
            int var9 = arg1 + 65536 << 10 | arg2.field3310;
            class270 var10 = (class270) class756.field10510.method1988((long) var9 << 16, -1);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class606.field7972.method2226(-1, class606.field7972.method2200(var9, (byte) 105));
            if (var11 == null) {
                int var14 = arg2.field3310 | 0x3FFFC00;
                class270 var15 = (class270) class756.field10510.method1988((long) var14 << 16, -1);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class606.field7972.method2226(-1, class606.field7972.method2200(var14, (byte) 103));
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class270 var17;
                    try {
                        var17 = class384.method2272((byte) -43, var16);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field3781 = arg2;
                    class756.field10510.method1987((long) var14 << 16, (byte) 113, var17);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class270 var12;
                try {
                    var12 = class384.method2272((byte) -43, var11);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field3781 = arg2;
                class756.field10510.method1987((long) var9 << 16, (byte) 83, var12);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class270 var7;
            try {
                var7 = class384.method2272((byte) -43, var6);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field3781 = arg2;
            class756.field10510.method1987((long) var4 << 16, (byte) 92, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILli;)Ljava/lang/String;", line = 131)
    public static final String method2383(int arg0, class433 arg1) {
        field5656++;
        if (arg0 <= 74) {
            method2381((byte) -54);
        }
        if (arg1.field5952 == null || arg1.field5952.length() == 0) {
            return arg1.field5965 == null || arg1.field5965.length() <= 0 ? arg1.field5960 : arg1.field5960 + class517.field6872.method2877(class713.field9854, (byte) -108) + arg1.field5965;
        } else if (arg1.field5965 == null || arg1.field5965.length() <= 0) {
            return arg1.field5960 + class517.field6872.method2877(class713.field9854, (byte) -108) + arg1.field5952;
        } else {
            return arg1.field5960 + class517.field6872.method2877(class713.field9854, (byte) -108) + arg1.field5965 + class517.field6872.method2877(class713.field9854, (byte) -108) + arg1.field5952;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 158)
    public static void method2384(int arg0) {
        if (arg0 == 2077735568) {
            field5654 = null;
            field5653 = null;
        }
    }
}
