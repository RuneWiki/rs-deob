import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class138 implements Runnable {

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Lae;")
    private static class6 field3354 = class64.method474(114, "Loaded title screen");

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lae;")
    public static class6 field3349 = field3354;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Lae;")
    public static class6 field3355 = class64.method474(103, "sideicons");

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Lbd;")
    public static class12 field3352 = new class12(100);

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "[I")
    public static int[] field3356 = new int[50];

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field3358 = 0;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field3360 = -1;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field3365 = 0;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Lae;")
    public static class6 field3362 = class64.method474(106, "mapedge");

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Lae;")
    public static class6 field3364 = class64.method474(125, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field3366 = 1;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lae;")
    public static class6 field3359 = class64.method474(111, ":  ");

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Lsd;")
    public static class114 field3350;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lda;")
    public static class21 field3363;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Lo;")
    public static class89 field3361;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "[I")
    public static int[] field3357;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBIII)V", line = 4)
    public static final void method1113(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3351++;
        if (arg1 != -17) {
            field3352 = null;
        }
        for (int var5 = arg2; var5 <= arg2 + arg4; var5++) {
            for (int var6 = arg0; var6 <= arg0 + arg3; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class22.field560[0][var6][var5] = 127;
                    if (arg0 == var6 && var6 > 0) {
                        class137.field3331[0][var6][var5] = class137.field3331[0][var6 - 1][var5];
                    }
                    if (arg0 + arg3 == var6 && var6 < 103) {
                        class137.field3331[0][var6][var5] = class137.field3331[0][var6 + 1][var5];
                    }
                    if (arg2 == var5 && var5 > 0) {
                        class137.field3331[0][var6][var5] = class137.field3331[0][var6][var5 - 1];
                    }
                    if (arg2 + arg4 == var5 && var5 < 103) {
                        class137.field3331[0][var6][var5] = class137.field3331[0][var6][var5 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "run", descriptor = "()V", line = 53)
    public final void run() {
        field3348++;
        try {
            while (true) {
                class95 var1 = class21.field509;
                class87 var2;
                synchronized (class21.field509) {
                    var2 = (class87) class21.field509.method798(false);
                }
                if (var2 == null) {
                    class82.method696(3, 100L);
                    Object var6 = class7.field138;
                    synchronized (class7.field138) {
                        if (class37.field850 <= 1) {
                            class37.field850 = 0;
                            class7.field138.notifyAll();
                            return;
                        }
                        class37.field850--;
                    }
                } else {
                    if (var2.field2094 == 0) {
                        var2.field2093.method78(-1, var2.field2086, (int) var2.field1501, var2.field2086.length);
                        class95 var4 = class21.field509;
                        synchronized (class21.field509) {
                            var2.method498(112);
                        }
                    } else if (var2.field2094 == 1) {
                        var2.field2086 = var2.field2093.method80(-59, (int) var2.field1501);
                        class95 var3 = class21.field509;
                        synchronized (class21.field509) {
                            class30.field722.method785((byte) 77, var2);
                        }
                    }
                    Object var5 = class7.field138;
                    synchronized (class7.field138) {
                        if (class37.field850 <= 1) {
                            class37.field850 = 0;
                            class7.field138.notifyAll();
                            return;
                        }
                        class37.field850 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class78.method675(var17, 64, null);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 127)
    public static void method1114(int arg0) {
        field3359 = null;
        field3355 = null;
        field3352 = null;
        field3350 = null;
        field3362 = null;
        if (arg0 != 41) {
            field3358 = 92;
        }
        field3363 = null;
        field3349 = null;
        field3361 = null;
        field3356 = null;
        field3364 = null;
        field3354 = null;
        field3357 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lvb;BLba;I)V", line = 164)
    public static final void method1115(class129 arg0, byte arg1, class8 arg2, int arg3) {
        field3347++;
        byte[] var4 = null;
        class95 var5 = class21.field509;
        synchronized (class21.field509) {
            for (class87 var6 = (class87) class21.field509.method798(false); var6 != null; var6 = (class87) class21.field509.method792((byte) -87)) {
                if ((long) arg3 == var6.field1501 && var6.field2093 == arg2 && var6.field2094 == 0) {
                    var4 = var6.field2086;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg0.method1043(var4, arg3, true, arg2, (byte) -80);
            return;
        }
        if (arg1 > -88) {
            method1116(26, -42, null, 110, 14);
        }
        byte[] var7 = arg2.method80(-98, arg3);
        arg0.method1043(var7, arg3, true, arg2, (byte) -80);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILbb;II)V", line = 203)
    public static final void method1116(int arg0, int arg1, class9 arg2, int arg3, int arg4) {
        field3342++;
        if (arg3 != 41) {
            return;
        }
        class134.field3279.method941(arg3 ^ 0x23);
        class102.field2407.method1036(0, 0);
        arg2.method95(class64.field1392, 55, 28, 16777215, true);
        if (arg1 == 0) {
            arg2.method95(class92.field2183, 55, 41, 65280, true);
        }
        if (arg1 == 1) {
            arg2.method95(class61.field1337, 55, 41, 16776960, true);
        }
        if (arg1 == 2) {
            arg2.method95(class89.field2130, 55, 41, 16711680, true);
        }
        if (arg1 == 3) {
            arg2.method95(class52.field1169, 55, 41, 65535, true);
        }
        arg2.method95(class56.field1217, 184, 28, 16777215, true);
        if (arg4 == 0) {
            arg2.method95(class92.field2183, 184, 41, 65280, true);
        }
        if (arg4 == 1) {
            arg2.method95(class61.field1337, 184, 41, 16776960, true);
        }
        if (arg4 == 2) {
            arg2.method95(class89.field2130, 184, 41, 16711680, true);
        }
        arg2.method95(class116.field2723, 324, 28, 16777215, true);
        if (arg0 == 0) {
            arg2.method95(class92.field2183, 324, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg2.method95(class61.field1337, 324, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg2.method95(class89.field2130, 324, 41, 16711680, true);
        }
        arg2.method84(class60.field1311, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        try {
            Graphics var5 = class70.field1564.getGraphics();
            class134.field3279.method1(-64, var5, 0, 453);
        } catch (Exception var6) {
            class70.field1564.repaint();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Lqc;", line = 262)
    public static final class100 method1117(int arg0, int arg1) {
        field3346++;
        class100 var2 = (class100) class85.field2062.method128((byte) 125, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class63.field1382.method160(30605, 9, arg1);
        class100 var4 = new class100();
        var4.field2357 = arg1;
        if (arg0 != -24223) {
            method1116(-69, 110, null, -21, -85);
        }
        if (var3 != null) {
            var4.method841(false, new class77(var3));
        }
        var4.method845((byte) 93);
        class85.field2062.method130(var4, (long) arg1, (byte) 104);
        return var4;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 291)
    public static final void method1118(int arg0) {
        field3341++;
        class20.field389 = new class30(32);
        if (arg0 >= -94) {
            method1116(-28, -19, null, 63, -104);
        }
    }
}
