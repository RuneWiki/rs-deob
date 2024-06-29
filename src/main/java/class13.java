import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field279 = 0;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lvc;")
    public static class137 field281 = null;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lvc;")
    private static class137 field284 = class45.method325("Continue", -46);

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field288 = 0;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lvc;")
    public static class137 field292 = field284;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field297 = 0;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lqa;")
    public static class105 field294;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Loa;")
    public static class93 field290;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)Z")
    public static final boolean method80(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 >> 14 & 0x7FFF;
        int var5 = class10.field220.method511(class28.field627, arg0, arg3, arg2);
        if (arg1 != 9824) {
            return true;
        }
        field287++;
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class126 var8 = class114.method886(arg1 - 9818, var4);
            int var9 = var8.field2922;
            if (var7 != 0) {
                var9 = (var9 >> 4 - var7) + (var9 << var7 & 0xF);
            }
            int var10;
            int var11;
            if (var7 == 0 || var7 == 2) {
                var11 = var8.field2971;
                var10 = var8.field2952;
            } else {
                var10 = var8.field2971;
                var11 = var8.field2952;
            }
            class88.method653(class104.field2412.field1624[0], arg0, 0, 2, var10, true, var9, class104.field2412.field1647[0], -111, arg3, var11, 0);
        } else {
            class88.method653(class104.field2412.field1624[0], arg0, var7, 2, 0, true, 0, class104.field2412.field1647[0], -98, arg3, 0, var6 + 1);
        }
        class12.field267 = 2;
        class78.field1741 = class38.field835;
        class137.field3188 = class36.field788;
        class53.field1185 = 0;
        return true;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)V")
    public static final synchronized void method81(byte arg0, int arg1) {
        field280++;
        if (!class131.method963(14251)) {
            return;
        }
        if (arg0 != 32) {
            method83(35);
        }
        class24.method208(arg1, (byte) 98);
        class104.field2408 = false;
        class132.field3077 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method82(int arg0) {
        field284 = null;
        if (arg0 != 0) {
            method83(-97);
        }
        field290 = null;
        field292 = null;
        field294 = null;
        field281 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static final synchronized void method83(int arg0) {
        field291++;
        if (arg0 == -31526) {
            class30.method232((byte) -76);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
    public static final synchronized void method84(int arg0) {
        field295++;
        if (arg0 == -6027 && class131.method963(14251)) {
            class122.method919(16);
            class132.field3077 = null;
            class104.field2408 = false;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLnb;IIILvc;Lvc;I)V")
    public static final synchronized void method85(boolean arg0, class88 arg1, int arg2, int arg3, int arg4, class137 arg5, class137 arg6, int arg7) {
        field296++;
        if (!class131.method963(14251)) {
            return;
        }
        int var8 = arg1.method641(1, arg5);
        int var9 = arg1.method654(28784, arg6, var8);
        method86(arg0, arg1, 11, arg2, var8, arg4, var9, arg3);
        if (arg7 > -107) {
            field290 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLnb;IIIIII)V")
    public static final synchronized void method86(boolean arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field282++;
        if (!class131.method963(arg2 + 14240)) {
            return;
        }
        class59.field1278 = arg0;
        if (arg2 != 11) {
            field294 = null;
        }
        class114.field2709 = -1;
        class132.field3077 = arg1;
        class34.field725 = arg4;
        class11.field231 = arg5;
        class39.field852 = arg7;
        class75.field1687 = arg3;
        class104.field2408 = true;
        class102.field2361 = arg6;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
    public static final void method87(int arg0) {
        field283++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        System.exit(1);
        if (arg0 >= -33) {
            method83(-99);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZLnb;III)V")
    public static final synchronized void method88(int arg0, int arg1, boolean arg2, class88 arg3, int arg4, int arg5, int arg6) {
        field286++;
        if (!class131.method963(arg5 ^ 0xFFFFC854)) {
            return;
        }
        class39.field852 = arg6;
        class59.field1278 = arg2;
        class75.field1687 = arg0;
        class114.field2709 = arg5;
        class102.field2361 = arg1;
        class11.field231 = -1;
        class34.field725 = arg4;
        class104.field2408 = true;
        class132.field3077 = arg3;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
    public static final synchronized void method89(int arg0) {
        field298++;
        int var1 = -109 / ((17 - arg0) / 52);
        if (!class131.method963(14251)) {
            return;
        }
        if (class104.field2408) {
            byte[] var2 = class64.method470(class132.field3077, class39.field852, class34.field725, (byte) 125, class102.field2361);
            if (var2 != null) {
                if (class11.field231 >= 0) {
                    class122.method915(class75.field1687, 0, class11.field231, class59.field1278, var2);
                } else if (class114.field2709 >= 0) {
                    class12.method74(98, class75.field1687, class59.field1278, class114.field2709, var2);
                } else {
                    class107.method779((byte) 90, var2, class59.field1278, class75.field1687);
                }
                class104.field2408 = false;
                class132.field3077 = null;
            }
        }
        class28.method220(2000);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(BI)Z")
    public static final boolean method90(byte arg0, int arg1) {
        if (arg0 < 46) {
            return false;
        } else {
            field293++;
            return (arg1 & 0x1) != 0;
        }
    }
}
