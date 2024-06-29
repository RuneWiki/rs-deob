import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class209 extends class30 {

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "Lia;")
    public static class257 field3578 = class28.method234(-89, "");

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Z")
    public static boolean field3573 = true;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field3582 = 0;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "Lia;")
    private static class257 field3579 = class28.method234(81, "Loading)3)3)3");

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "Lia;")
    public static class257 field3583 = field3579;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public int field3581;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "Lmb;")
    public static class178 field3584;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "Lia;")
    public class257 field3585;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "Lld;")
    public static class51 field3571;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "[Lia;")
    public class257[] field3576;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
    public static void method1402(int arg0) {
        field3583 = null;
        if (arg0 != -23605) {
            method1406(109, -116, -114);
        }
        field3584 = null;
        field3579 = null;
        field3578 = null;
        field3571 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lad;I)V")
    public static final void method1403(class241 arg0, int arg1) {
        if (class7.field153 == arg0.field4122 || arg0.field4129 == -1 || arg0.field4144 != 0 || (arg0.field4139 + 1) > class186.method1263(0, arg0.field4129).field603[arg0.field4120]) {
            int var2 = arg0.field4122 - arg0.field4155;
            int var3 = class7.field153 - arg0.field4155;
            int var4 = arg0.field4161 * 128 + arg0.field4128 * 64;
            int var5 = arg0.field4153 * 128 + arg0.field4128 * 64;
            int var6 = arg0.field4134 * 128 + arg0.field4128 * 64;
            arg0.field4177 = ((var2 - var3) * var4 + var3 * var5) / var2;
            int var7 = arg0.field4147 * 128 + (arg0.field4128 * 64);
            arg0.field4143 = ((var2 - var3) * var6 + var3 * var7) / var2;
        }
        arg0.field4133 = 0;
        field3580++;
        if (arg0.field4130 == 0) {
            arg0.field4125 = 1024;
        }
        if (arg0.field4130 == arg1) {
            arg0.field4125 = 1536;
        }
        if (arg0.field4130 == 2) {
            arg0.field4125 = 0;
        }
        if (arg0.field4130 == 3) {
            arg0.field4125 = 512;
        }
        arg0.field4118 = arg0.field4125;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)V")
    public static final void method1404(byte arg0, int arg1) {
        field3572++;
        if (class217.field3675 == arg1 || arg0 != -38) {
            return;
        }
        boolean var2 = arg1 == 5 || arg1 == 8 || arg1 == 10 || arg1 == 28;
        if (class217.field3675 == 0) {
            class118.method838(true);
        }
        if (arg1 == 20 || arg1 == 40) {
            class82.field1599 = 0;
            class27.field529 = 0;
            class42.field852 = -4;
            class25.field487 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class76.field1482 != null) {
            class76.field1482.method1421((byte) 90);
            class76.field1482 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class16.field344 = 0;
            class32.field624 = 1;
            class21.field438 = 0;
            class158.field2781 = 0;
            class169.field2908 = 1;
            class2.method30(-127);
        }
        if (arg1 == 5) {
            class222.method1468(class42.field850, false);
        } else {
            method1407((byte) 107);
        }
        boolean var3 = class217.field3675 == 5 || class217.field3675 == 8 || class217.field3675 == 10 || class217.field3675 == 28;
        if (var3 != var2) {
            if (var2) {
                class124.field2228 = class164.field2870;
                if (class26.field513 == 0) {
                    class212.method1431(-89, 2);
                } else {
                    class12.method129(class259.field4502, -124, class164.field2870, 255, 2, false, 0);
                }
                class220.method1450(false, 4);
            } else {
                class212.method1431(-83, 2);
                class220.method1450(true, 4);
            }
        }
        if (arg1 == 8) {
            arg1 = class132.method922(-22749);
        }
        class217.field3675 = arg1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLad;)V")
    public static final void method1405(byte arg0, class241 arg1) {
        field3568++;
        if (arg1.field4146 == 0) {
            return;
        }
        if (arg1.field4171 != -1 && arg1.field4171 < 32768) {
            class197 var2 = class92.field1758[arg1.field4171];
            if (var2 != null) {
                int var3 = arg1.field4143 - var2.field4143;
                int var4 = arg1.field4177 - var2.field4177;
                if (var4 != 0 || var3 != 0) {
                    arg1.field4125 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        int var5 = 67 / ((arg0 + 26) / 39);
        if (arg1.field4171 >= 32768) {
            int var6 = arg1.field4171 - 32768;
            if (class173.field2958 == var6) {
                var6 = 2047;
            }
            class180 var7 = class55.field1180[var6];
            if (var7 != null) {
                int var8 = arg1.field4177 - var7.field4177;
                int var9 = arg1.field4143 - var7.field4143;
                if (var8 != 0 || var9 != 0) {
                    arg1.field4125 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field4184 != 0 || arg1.field4160 != 0) && (arg1.field4148 == 0 || arg1.field4133 > 0)) {
            int var10 = arg1.field4128 * 64 + arg1.field4177 - ((arg1.field4184 - class244.field4232 - class244.field4232) * 64) - 64;
            int var11 = arg1.field4143 - (64 - (arg1.field4128 * 64)) - ((-class231.field3878 + arg1.field4160 - class231.field3878) * 64);
            if (var10 != 0 || var11 != 0) {
                arg1.field4125 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field4184 = 0;
            arg1.field4160 = 0;
        }
        int var12 = arg1.field4125 - arg1.field4118 & 0x7FF;
        if (var12 == 0) {
            arg1.field4140 = 0;
            return;
        }
        arg1.field4140++;
        if (var12 <= 1024) {
            arg1.field4118 += arg1.field4146;
            boolean var13 = true;
            if (var12 < arg1.field4146 || var12 > (2048 - arg1.field4146)) {
                var13 = false;
                arg1.field4118 = arg1.field4125;
            }
            if (arg1.field4170 == arg1.field4165 && (arg1.field4140 > 25 || var13)) {
                if (arg1.field4178 == -1) {
                    arg1.field4170 = arg1.field4145;
                } else {
                    arg1.field4170 = arg1.field4178;
                }
            }
        } else {
            arg1.field4118 -= arg1.field4146;
            boolean var14 = true;
            if (arg1.field4146 > var12 || var12 > (2048 - arg1.field4146)) {
                arg1.field4118 = arg1.field4125;
                var14 = false;
            }
            if (arg1.field4170 == arg1.field4165 && (arg1.field4140 > 25 || var14)) {
                if (arg1.field4124 == -1) {
                    arg1.field4170 = arg1.field4145;
                } else {
                    arg1.field4170 = arg1.field4124;
                }
            }
        }
        arg1.field4118 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
    public static final void method1406(int arg0, int arg1, int arg2) {
        if (class158.field2783 > 0) {
            class154.method1079(101, class158.field2783);
            class158.field2783 = 0;
        }
        field3570++;
        int var3 = -36 % (-arg2 / 40);
        short var4 = 256;
        int var5 = 0;
        int var6 = class23.field451 * arg0;
        int var7 = 0;
        for (int var8 = 1; var8 < (var4 - 1); var8++) {
            int var9 = (var4 - var8) * class160.field2805[var8] / var4;
            if (var9 < 0) {
                var9 = 0;
            }
            var5 += var9;
            for (int var10 = var9; var10 < 128; var10++) {
                int var12 = class68.field1364[var5++];
                int var13 = class23.field445[var6++ + arg1];
                if (var12 == 0) {
                    class92.field1754.field3263[var7++] = var13;
                } else {
                    int var14 = 256 - var12 - 18;
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = var12 + 18;
                    int var16 = class139.field2480[var12];
                    if (var15 > 255) {
                        var15 = 255;
                    }
                    class92.field1754.field3263[var7++] = class30.method252(-16711936, class30.method252(16711935, var16) * var15 + (class30.method252(16711935, var13) * var14)) + class30.method252(var15 * class30.method252(var16, 65280) + class30.method252(var13, 65280) * var14, 16711680) >> 8;
                }
            }
            for (int var11 = 0; var11 < var9; var11++) {
                class92.field1754.field3263[var7++] = class23.field445[arg1 + (var6++)];
            }
            var6 += class23.field451 - 128;
        }
        class92.field1754.method477(arg1, arg0);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
    private static final void method1407(byte arg0) {
        field3566++;
        if (!class95.field1786) {
            return;
        }
        class203.field3496 = null;
        class95.field1786 = false;
        class231.field3881 = null;
        if (arg0 != 107) {
            method1405((byte) -125, (class241) null);
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)I")
    public static final int method1408(int arg0, int arg1) {
        int var2 = -100 % (-arg0 / 58);
        field3575++;
        return arg1 >>> 8;
    }
}
