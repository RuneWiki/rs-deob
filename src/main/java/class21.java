import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 implements Runnable {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field528 = 0;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Laf;")
    public static class7 field539 = class48.method406(40, "Titelbild geladen)3");

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field534 = -1;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Laf;")
    public static class7 field540 = class48.method406(40, "<col=ffffff>");

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field532 = -1;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Laf;")
    private static class7 field541 = class48.method406(40, " is already on your friend list");

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field546 = 0;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Laf;")
    private static class7 field535 = class48.method406(40, "Please reload this page)3");

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Laf;")
    public static class7 field538 = field535;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Laf;")
    public static class7 field548 = class48.method406(40, "event_opbase");

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Laf;")
    public static class7 field533 = field541;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Laf;")
    private static class7 field543 = class48.method406(40, "Loaded wordpack");

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "[I")
    public static int[] field537 = new int[2048];

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "Laf;")
    private static class7 field549 = class48.method406(40, "Loading fonts )2 ");

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Laf;")
    public static class7 field530 = field549;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Laf;")
    public static class7 field529 = field543;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Lr;")
    public static class118 field545;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lnb;")
    public static class92 field531;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZI)Laf;")
    public static final class7 method194(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = 1;
        field544++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        for (int var5 = arg1 / arg0; var5 != 0; var5 /= arg0) {
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = arg3; var8 < var4; var8++) {
            int var10 = arg1 % arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            arg1 /= arg0;
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class7 var9 = new class7();
        var9.field139 = var6;
        var9.field162 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)V")
    public static final void method195(byte arg0, int arg1) {
        field547++;
        int[] var2 = class9.field251.field989;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (103 - var5) * 512 * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class25.field670[arg1][var21][var5] & 0x18) == 0) {
                    class47.field1151.method1025(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class25.field670[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class47.field1151.method1025(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class9.field251.method340();
        int var6 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((238 - (10 - ((int) (Math.random() * 20.0D))) << 8) - (-((int) (Math.random() * 20.0D)) + -238) - 10);
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var8 = 1;
        if (arg0 != -67) {
            field541 = null;
        }
        while (var8 < 103) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class25.field670[arg1][var19][var8] & 0x18) == 0) {
                    class52.method428(var6, var19, var8, (byte) -117, var7, arg1);
                }
                if (arg1 < 3 && (class25.field670[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class52.method428(var6, var19, var8, (byte) -123, var7, arg1 + 1);
                }
            }
            var8++;
        }
        field528 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class47.field1151.method1023(class8.field186, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class155.method1214((byte) -99, var12).field1873;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class155.field3609[class8.field186].field2047;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var9 - 3 < var14 && (var16[var14 - 1][var15] & 0x12C0108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var14 < var9 + 3 && (var16[var14 + 1][var15] & 0x12C0180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var15 > var10 - 3 && (var16[var14][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class131.field3102[field528] = class98.field2336[var13];
                        class10.field263[field528] = var14;
                        class2.field21[field528] = var15;
                        field528++;
                    }
                }
            }
        }
        class102.field2425.method642(8430);
    }

    @OriginalMember(owner = "client!cf", name = "run", descriptor = "()V")
    public final void run() {
        field536++;
        try {
            while (true) {
                class94 var1 = class9.field240;
                class119 var2;
                synchronized (class9.field240) {
                    var2 = (class119) class9.field240.method758(255);
                }
                if (var2 == null) {
                    class79.method673(2, 100L);
                    Object var6 = class145.field3415;
                    synchronized (class145.field3415) {
                        if (class53.field1309 <= 1) {
                            class53.field1309 = 0;
                            class145.field3415.notifyAll();
                            return;
                        }
                        class53.field1309--;
                    }
                } else {
                    if (var2.field2817 == 0) {
                        var2.field2823.method1044((byte) -23, var2.field2824.length, var2.field2824, (int) var2.field3261);
                        class94 var4 = class9.field240;
                        synchronized (class9.field240) {
                            var2.method1124((byte) 62);
                        }
                    } else if (var2.field2817 == 1) {
                        var2.field2824 = var2.field2823.method1042(-23815, (int) var2.field3261);
                        class94 var3 = class9.field240;
                        synchronized (class9.field240) {
                            class151.field3538.method765(var2, 0);
                        }
                    }
                    Object var5 = class145.field3415;
                    synchronized (class145.field3415) {
                        if (class53.field1309 <= 1) {
                            class53.field1309 = 0;
                            class145.field3415.notifyAll();
                            return;
                        }
                        class53.field1309 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class144.method1169(var17, (byte) 86, null);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method196(int arg0) {
        field548 = null;
        field543 = null;
        field533 = null;
        field545 = null;
        if (arg0 != 19661064) {
            method196(-108);
        }
        field530 = null;
        field539 = null;
        field540 = null;
        field531 = null;
        field537 = null;
        field541 = null;
        field538 = null;
        field529 = null;
        field535 = null;
        field549 = null;
    }
}
