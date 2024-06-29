import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 extends class107 {

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "Lpj;")
    public static class237 field233 = class33.method353("Texturen geladen)3", 109);

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
    public static int field235 = 0;

    @OriginalMember(owner = "client!fk", name = "Z", descriptor = "Lpj;")
    public static class237 field240 = class33.method353("Verbindung zum Update)2Server hergestellt)3", 126);

    @OriginalMember(owner = "client!fk", name = "ab", descriptor = "[I")
    public static int[] field241 = new int[1000];

    @OriginalMember(owner = "client!fk", name = "bb", descriptor = "Lpj;")
    public static class237 field242 = class33.method353("blinken3:", 90);

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lpe;")
    public static final class235 method127(int arg0, int arg1) {
        if (arg1 > -69) {
            field233 = null;
        }
        ++field236;
        class235 var2 = (class235) class227.field3881.method1549((long) arg0, 9447);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (arg0 < 32768) {
                var3 = class54.field1120.method1645(true, arg0, 1);
            } else {
                var3 = class273.field4738.method1645(true, arg0 & 32767, 1);
            }
            class235 var4 = new class235();
            if (var3 != null) {
                var4.method1572(new class32(var3), -117);
            }
            if (~arg0 <= -32769) {
                var4.method1573((byte) -51);
            }
            class227.field3881.method1552((byte) -112, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(III)I")
    private final int method128(int arg0, int arg1, int arg2) {
        if (arg1 != -15373) {
            field242 = null;
        }
        ++field230;
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        return 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)V")
    public static void method129(byte arg0) {
        field242 = null;
        int var1 = 121 % ((-56 - arg0) / 59);
        field240 = null;
        field241 = null;
        field233 = null;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class14() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(IB)Lpj;")
    public static final class237 method130(int arg0, byte arg1) {
        if (arg1 != 117) {
            field237 = -23;
        }
        ++field239;
        return class204.method1379(arg0, (byte) 113, false, 10);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            method132(78, -28, 32, -71, 112);
        }
        ++field232;
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int var4 = class185.field3233[arg1];
            for (int var5 = 0; class106.field1862 > var5; ++var5) {
                var3[var5] = this.method128(var4, -15373, class182.field3199[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIBIII)V")
    public static final void method131(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field238;
        if (arg3 == arg5) {
            class261.method1754(arg4, arg5, arg1, -120, arg0);
        } else {
            if (~class89.field1637 >= ~(-arg5 + arg0) && class94.field1676 >= arg0 + arg5 && -arg3 + arg4 >= class13.field215 && class34.field727 >= arg4 - -arg3) {
                class180.method1238(arg1, arg0, arg3, arg4, 24810, arg5);
            } else {
                class239.method1637(arg1, arg5, arg0, arg4, arg3, (byte) -91);
            }
            if (arg2 > -6) {
                field241 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII)V")
    public static final void method132(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field231;
        if (~class138.field2386 > -101) {
            class189.method1281(true);
        }
        class192.method1309(arg1, arg3, arg0 + arg1, arg2 + arg3);
        if (~class138.field2386 > -101) {
            int var5 = arg0 / 2 + arg1;
            byte var6 = 20;
            int var7 = arg2 / 2 + arg3 - 18 + -var6;
            class192.method1301(arg1, arg3, arg0, arg2, 0);
            class192.method1316(var5 + -152, var7, 304, 34, 9179409);
            class192.method1316(var5 + -151, var7 + 1, 302, 32, 0);
            class192.method1301(var5 + -150, var7 + 2, class138.field2386 * 3, 30, 9179409);
            class192.method1301(var5 + -150 - -(class138.field2386 * 3), var7 + 2, 300 - class138.field2386 * 3, 30, 0);
            class80.field1507.method1341(class234.field4054, var5, var6 + var7, 16777215, -1);
        } else {
            class38.field847 = class22.field405 - (int) ((float) arg2 / class169.field2966);
            if (arg4 != -8) {
                method129((byte) 16);
            }
            int var8 = -((int) ((float) arg2 / class169.field2966)) + class22.field405;
            class152.field2699 = -((int) ((float) arg0 / class169.field2966)) + class215.field3681;
            int var9 = -((int) ((float) arg0 / class169.field2966)) + class215.field3681;
            class94.field1674 = (int) ((float) (arg0 * 2) / class169.field2966);
            class20.field385 = (int) ((float) (arg2 * 2) / class169.field2966);
            int var10 = class22.field405 - -((int) ((float) arg2 / class169.field2966));
            int var11 = (int) ((float) arg0 / class169.field2966) + class215.field3681;
            class269.method1790(var9, var11, var10, arg0 + arg1, arg2 + arg3, arg3, false, var8, arg1);
            class21.method207(var9, arg0 + arg1, arg1, -13, var10, arg3, arg2 + arg3, var11, var8);
            class172.method1195(arg2 + arg3, 18353, var10, arg1, var11, var8, arg0 + arg1, var9, arg3);
            if (~class135.field2360 < -1) {
                --class135.field2360;
            }
            if (class129.field2259) {
                int var12 = arg0 + arg1 + -5;
                int var13 = arg3 - -arg2 + -8;
                class227.field3884.method1338(class238.method1626(new class237[] { class156.field2784, method130(class222.field3819, (byte) 117) }, arg4 ^ 31), var12, var13, 16776960, -1);
                int var17 = var13 - 15;
                int var14 = 16776960;
                Runtime var15 = Runtime.getRuntime();
                int var16 = (int) ((var15.totalMemory() + -var15.freeMemory()) / 1024L);
                if (~var16 < -65537) {
                    var14 = 16711680;
                }
                class227.field3884.method1338(class238.method1626(new class237[] { class101.field1790, method130(var16, (byte) 117), class162.field2891 }, arg4 ^ 36), var12, var17, var14, -1);
                var13 = var17 - 15;
            }
        }
    }
}
