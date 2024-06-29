import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class241 extends class696 {

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "[I")
    public static int[] field3101 = new int[4];

    @OriginalMember(owner = "client!aaa", name = "r", descriptor = "[I")
    public static int[] field3107 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "I")
    public int field3100;

    @OriginalMember(owner = "client!aaa", name = "n", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!aaa", name = "o", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!aaa", name = "p", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!aaa", name = "q", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!aaa", name = "s", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!aaa", name = "v", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!aaa", name = "w", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!aaa", name = "x", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "Lgl;")
    public static class618 field3102;

    @OriginalMember(owner = "client!aaa", name = "t", descriptor = "Ljava/lang/String;")
    public String field3109;

    @OriginalMember(owner = "client!aaa", name = "u", descriptor = "[S")
    public static short[] field3110;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lha;ZJ)V", line = 3)
    public static final void method1500(class454 arg0, boolean arg1, long arg2) {
        class274.field3468 = class204.field2590;
        class90.field1141 = 0;
        field3111++;
        class706.field9952 = 0;
        class204.field2590 = 0;
        long var4 = class97.method654((byte) 72);
        if (!arg1) {
            field3102 = null;
        }
        for (class428 var6 = (class428) class173.field2264.method1839(66); var6 != null; var6 = (class428) class173.field2264.method1836((byte) -26)) {
            if (var6.method2555(arg0, arg2)) {
                class90.field1141++;
            }
        }
        if (class525.field7424 && (arg2 % 100L) == 0L) {
            System.out.println("Particle system count: " + class173.field2264.method1842(0) + ", running: " + class90.field1141);
            System.out.println("Emitters: " + class706.field9952 + " Particles: " + class204.field2590 + ". Time taken: " + (class97.method654((byte) 81) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIBIII)Z", line = 38)
    public static final boolean method1501(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3106++;
        int var6 = -72 % ((arg2 - 23) / 55);
        for (int var7 = arg0; var7 <= arg4; var7++) {
            for (int var8 = arg5; var8 <= arg3; var8++) {
                if (class470.field6753[var7][var8] == arg1 && class706.field9951[var7][var8] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(Z)V", line = 67)
    public static void method1502(boolean arg0) {
        field3101 = null;
        field3102 = null;
        field3110 = null;
        if (arg0) {
            field3107 = null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V", line = 82)
    public static final void method1503(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class488.field6948[var1] = false;
        }
        if (arg0 != 4589) {
            method1500(null, true, -61L);
        }
        field3112++;
        class654.field9000 = 0;
        class335.field4311 = -1;
        class147.field1783 = -1;
        class276.field3497 = 1;
        class522.field7390 = -1;
        class737.field10329 = -1;
        class188.field2472 = 0;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lfc;)V", line = 122)
    public static final void method1504(class615 arg0) {
        if (class150.field1824 >= 65535) {
            return;
        }
        class621 var1 = arg0.field8615;
        class708.field9968[class150.field1824] = arg0;
        class399.field5524[class150.field1824] = false;
        class150.field1824++;
        int var2 = arg0.field8605;
        if (arg0.field8617) {
            var2 = 0;
        }
        int var3 = arg0.field8605;
        if (arg0.field8602) {
            var3 = class126.field1511 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method3404(-1) + class5.field54 - var1.method3399((byte) -108) >> class455.field6383;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method3404(-1) + var1.method3399((byte) -108) - class5.field54 >> class455.field6383;
            if (var7 >= class665.field9107) {
                var7 = class665.field9107 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field8604[var5++];
                int var10 = (var1.method3402(true) + class5.field54 - var1.method3399((byte) -108) >> class455.field6383) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class90.field1142) {
                    var11 = class90.field1142 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class374.field5261[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class374.field5261[var4][var12][var8] = var13 | (long) class150.field1824;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class374.field5261[var4][var12][var8] = var13 | (long) class150.field1824 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class374.field5261[var4][var12][var8] = var13 | (long) class150.field1824 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class374.field5261[var4][var12][var8] = var13 | (long) class150.field1824 << 48;
                    }
                }
            }
        }
    }
}
