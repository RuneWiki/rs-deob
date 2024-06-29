import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class154 extends class184 {

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "[I")
    public static int[] field2766 = new int[100];

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "[I")
    public static int[] field2771 = new int[32];

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "Z")
    public static boolean field2764 = false;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "[Lw;")
    public static class275[] field2768 = new class275[50];

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "Lsf;")
    public static class108 field2769 = class140.method973(255, "(R");

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "Lsf;")
    public static class108 field2779 = class140.method973(255, "Impossible de trouver ");

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "B")
    public byte field2772;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "Lsf;")
    public class108 field2765;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "Lsf;")
    public class108 field2770;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "[I")
    public static int[] field2775;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILmh;III)V", line = 28)
    public static final void method1076(int arg0, class136 arg1, int arg2, int arg3, int arg4) {
        field2774++;
        if (class311.field5374 >= 400) {
            return;
        }
        if (arg1.field2396 != null) {
            arg1 = arg1.method938((byte) -35);
        }
        if (arg1 == null || !arg1.field2373) {
            return;
        }
        class108 var5 = arg1.field2414;
        if (arg4 > -116) {
            method1078((byte) 119);
        }
        if (arg1.field2351 != 0) {
            var5 = class117.method833(new class108[] { var5, class290.method2073(class95.field1513.field720, (byte) -32, arg1.field2351), class305.field5316, class117.field2035, class79.method518(false, arg1.field2351), class303.field5258 }, false);
        }
        if (class84.field1347 == 1) {
            class62.method428(arg3, -128, class288.field5045, class117.method833(new class108[] { class331.field5662, class81.field1263, var5 }, false), (long) arg0, (short) 13, arg2);
            class308.field5346++;
        } else if (!class172.field3132) {
            class6.field75++;
            class108[] var6 = arg1.field2410;
            if (class324.field5527) {
                var6 = class26.method174(var6, (byte) 119);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class223.field3947 != 0 || !var6[var7].method781(class92.field1453, -26321))) {
                        class84.field1309++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 28;
                        }
                        if (var7 == 1) {
                            var8 = 19;
                        }
                        if (var7 == 2) {
                            var8 = 2;
                        }
                        if (var7 == 3) {
                            var8 = 58;
                        }
                        if (var7 == 4) {
                            var8 = 32;
                        }
                        class62.method428(arg3, -127, var6[var7], class117.method833(new class108[] { class16.field206, var5 }, false), (long) arg0, var8, arg2);
                    }
                }
            }
            if (class223.field3947 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method781(class92.field1453, -26321)) {
                        short var10 = 0;
                        class169.field3033++;
                        short var11 = 0;
                        if (arg1.field2351 > class95.field1513.field720) {
                            var10 = 2000;
                        }
                        if (var9 == 0) {
                            var11 = 28;
                        }
                        if (var9 == 1) {
                            var11 = 19;
                        }
                        if (var9 == 2) {
                            var11 = 2;
                        }
                        if (var9 == 3) {
                            var11 = 58;
                        }
                        if (var9 == 4) {
                            var11 = 32;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class62.method428(arg3, -112, var6[var9], class117.method833(new class108[] { class16.field206, var5 }, false), (long) arg0, var11, arg2);
                    }
                }
            }
            class62.method428(arg3, -116, class149.field2725, class117.method833(new class108[] { class16.field206, var5 }, false), (long) arg0, (short) 1002, arg2);
        } else if ((class21.field324 & 0x2) == 2) {
            class162.field2897++;
            class62.method428(arg3, -117, class72.field1103, class117.method833(new class108[] { class131.field2248, class81.field1263, var5 }, false), (long) arg0, (short) 30, arg2);
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V", line = 174)
    public static void method1077(byte arg0) {
        field2775 = null;
        field2769 = null;
        field2766 = null;
        if (arg0 > -85) {
            method1078((byte) 125);
        }
        field2771 = null;
        field2779 = null;
        field2768 = null;
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V", line = 189)
    public static final void method1078(byte arg0) {
        field2777++;
        for (class163 var1 = (class163) class326.field5565.method13(0); var1 != null; var1 = (class163) class326.field5565.method15((byte) 47)) {
            if (var1.field2918 == -1) {
                var1.field2924 = 0;
                class330.method2261((byte) -29, var1);
            } else {
                var1.method1325(0);
            }
        }
        int var2 = -96 / ((arg0 + 72) / 46);
    }
}
