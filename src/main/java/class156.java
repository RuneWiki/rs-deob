import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public abstract class class156 extends class102 {

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    public static int field2772 = 0;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "Lqc;")
    public static class245 field2768 = new class245(64);

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static volatile int field2774 = -1;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "Ltg;")
    public static class215 field2775 = new class215(32);

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    public static int field2777 = 0;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "Lhg;")
    public static class91 field2773;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "[I")
    public static int[] field2776;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BJ)V")
    public static final void method1057(byte arg0, long arg1) {
        field2770++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class173.field3058 < 100 || class42.field690 == 1) || class173.field3058 >= 200) {
            class234.method1533(class85.field1679, -74, class176.field3097, 0);
            return;
        }
        class66 var3 = class87.method616(arg1, -1).method467(12688);
        for (int var4 = 0; var4 < class173.field3058; var4++) {
            if (class176.field3104[var4] == arg1) {
                class234.method1533(class85.field1679, 127, class212.method1372(2, new class66[] { var3, class91.field1755 }), 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class124.field2338; var5++) {
            if (class247.field4306[var5] == arg1) {
                class234.method1533(class85.field1679, 126, class212.method1372(2, new class66[] { class94.field1821, var3, class189.field3277 }), 0);
                return;
            }
        }
        if (var3.method463(class207.field3595.field815, (byte) 99)) {
            class234.method1533(class85.field1679, -89, class132.field2456, 0);
            return;
        }
        class233.field4077[class173.field3058] = var3;
        class256.field4495++;
        class176.field3104[class173.field3058] = arg1;
        class245.field4279[class173.field3058] = 0;
        class16.field202[class173.field3058] = class85.field1679;
        class17.field246[class173.field3058] = 0;
        class223.field3805[class173.field3058] = false;
        class173.field3058++;
        class252.field4434 = class15.field199;
        if (arg0 > 89) {
            class28.field412.method578(113, 30);
            class28.field412.method1651(true, arg1);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1058(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2771++;
        if (!arg4) {
            field2768 = null;
        }
        if ((arg3 - arg2) >= class165.field2972 && arg3 + arg2 <= class215.field3706 && (arg1 - arg2) >= class241.field4186 && class222.field3788 >= arg1 + arg2) {
            class256.method1716(arg0, arg4, arg2, arg3, arg1);
        } else {
            class105.method722((byte) 83, arg0, arg3, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILha;II)V")
    public static final void method1059(int arg0, class63 arg1, int arg2, int arg3) {
        field2765++;
        if (arg3 != -1198502738) {
            field2776 = null;
        }
        if (arg1.field1227 == 0) {
            arg1.field1138 = arg1.field1133;
        } else if (arg1.field1227 == 1) {
            arg1.field1138 = (arg2 - arg1.field1215) / 2 + arg1.field1133;
        } else if (arg1.field1227 == 2) {
            arg1.field1138 = arg2 - arg1.field1215 - arg1.field1133;
        } else if (arg1.field1227 == 3) {
            arg1.field1138 = arg1.field1133 * arg2 >> 14;
        } else if (arg1.field1227 == 4) {
            arg1.field1138 = (arg1.field1133 * arg2 >> 14) + (arg2 - arg1.field1215) / 2;
        } else {
            arg1.field1138 = arg2 - arg1.field1215 - (arg1.field1133 * arg2 >> 14);
        }
        if (arg1.field1143 == 0) {
            arg1.field1226 = arg1.field1237;
        } else if (arg1.field1143 == 1) {
            arg1.field1226 = (arg0 - arg1.field1196) / 2 + arg1.field1237;
        } else if (arg1.field1143 == 2) {
            arg1.field1226 = arg0 - arg1.field1196 - arg1.field1237;
        } else if (arg1.field1143 == 3) {
            arg1.field1226 = arg1.field1237 * arg0 >> 14;
        } else if (arg1.field1143 == 4) {
            arg1.field1226 = (arg1.field1237 * arg0 >> 14) + (arg0 - arg1.field1196) / 2;
        } else {
            arg1.field1226 = arg0 - arg1.field1196 - (arg1.field1237 * arg0 >> 14);
        }
        if (!class102.field1999 || client.method592(arg1) == 0 && arg1.field1219 != 0) {
            return;
        }
        if (arg1.field1138 < 0) {
            arg1.field1138 = 0;
        } else if (arg1.field1215 + arg1.field1138 > arg2) {
            arg1.field1138 = arg2 - arg1.field1215;
        }
        if (arg1.field1226 < 0) {
            arg1.field1226 = 0;
        } else if (arg0 < (arg1.field1226 + arg1.field1196)) {
            arg1.field1226 = arg0 - arg1.field1196;
            return;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)Lmb;")
    public static final class73 method1060(int arg0, int arg1) {
        field2766++;
        class73 var2 = (class73) class69.field1379.method1617(14366, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class161.field2886.method135(class107.method730(arg1 ^ 0x6F, arg0), 0, class199.method1298(arg1 ^ 0xFFFFFFA8, arg0));
        class73 var4 = new class73();
        if (arg1 != 1) {
            field2772 = -10;
        }
        var4.field1443 = arg0;
        if (var3 != null) {
            var4.method522(new class249(var3), -1);
        }
        class69.field1379.method1615(var4, 111, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method103(int arg0);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public static void method1061(boolean arg0) {
        field2773 = null;
        field2775 = null;
        if (arg0) {
            field2768 = null;
            field2776 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)Z")
    public abstract boolean method104(int arg0);
}
