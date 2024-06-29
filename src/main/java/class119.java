import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 extends class88 {

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "[I")
    public static int[] field2702 = new int[5];

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field2704 = 50;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "[I")
    public static int[] field2699 = new int[field2704];

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "[I")
    public static int[] field2714 = new int[field2704];

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "[I")
    public static int[] field2703 = new int[field2704];

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "[I")
    public static int[] field2722 = new int[field2704];

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "[Ltd;")
    public static class136[] field2713 = new class136[500];

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "Ltd;")
    public static class136 field2719 = class145.method1172("(U0a )2 in: ", 45);

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "Ltd;")
    public static class136 field2709 = class145.method1172(" )2> <col=ffffff>", 45);

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field2711 = 0;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Ltd;")
    private static class136 field2701 = class145.method1172("flash2:", 45);

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "[Ltd;")
    public static class136[] field2708 = new class136[field2704];

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "Ltd;")
    public static class136 field2721 = field2701;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "[I")
    public static int[] field2727 = new int[field2704];

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "Ltd;")
    public static class136 field2725 = field2701;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "[I")
    public static int[] field2700 = new int[field2704];

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "[I")
    public static int[] field2724 = new int[field2704];

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    public int field2720;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public int field2723;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Lbb;")
    public static class10 field2716;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "[I")
    public int[] field2707;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "[I")
    public int[] field2717;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "[I")
    public int[] field2728;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "[Lw;")
    public class150[] field2710;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "[Lw;")
    public class150[] field2726;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "[[[B")
    public byte[][][] field2712;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILmd;)V")
    public static final void method931(int arg0, class87 arg1) {
        if (arg0 != 256) {
            method934(121);
        }
        field2706++;
        class118.field2687 = arg1;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
    public static void method932(byte arg0) {
        field2713 = null;
        field2703 = null;
        field2727 = null;
        field2725 = null;
        field2719 = null;
        field2699 = null;
        field2709 = null;
        field2708 = null;
        field2702 = null;
        if (arg0 < 76) {
            field2703 = null;
        }
        field2716 = null;
        field2724 = null;
        field2701 = null;
        field2722 = null;
        field2721 = null;
        field2700 = null;
        field2714 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lke;I)V")
    public static final void method933(class74 arg0, int arg1) {
        field2705++;
        if (arg1 != 150) {
            method934(-105);
        }
        int var2 = arg0.field1630;
        if (var2 == 324) {
            if (class5.field91 == -1) {
                class5.field91 = arg0.field1577;
                class106.field2494 = arg0.field1641;
            }
            if (class133.field3131.field2407) {
                arg0.field1577 = class5.field91;
            } else {
                arg0.field1577 = class106.field2494;
            }
        } else if (var2 == 325) {
            if (class5.field91 == -1) {
                class5.field91 = arg0.field1577;
                class106.field2494 = arg0.field1641;
            }
            if (class133.field3131.field2407) {
                arg0.field1577 = class106.field2494;
            } else {
                arg0.field1577 = class5.field91;
            }
        } else if (var2 == 327) {
            arg0.field1580 = 150;
            arg0.field1591 = (int) (Math.sin((double) class44.field1013 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1679 = 5;
            arg0.field1594 = 0;
        } else if (var2 == 328) {
            arg0.field1580 = 150;
            arg0.field1591 = (int) (Math.sin((double) class44.field1013 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1594 = 1;
            arg0.field1679 = 5;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public static final void method934(int arg0) {
        class37.field864.method1165((byte) -73);
        field2718++;
        class47.field1084.method1165((byte) -73);
        class31.field686.method1165((byte) -73);
        if (arg0 >= -107) {
            field2722 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lcd;ZI)V")
    public static final void method935(class19 arg0, boolean arg1, int arg2) {
        if (class3.field60 != null) {
            try {
                class3.field60.method144(1);
            } catch (Exception var9) {
            }
            class3.field60 = null;
        }
        field2715++;
        class3.field60 = arg0;
        class129.method1061((byte) 97, arg1);
        class132.field3113.field2995 = 0;
        class77.field1737 = 0;
        class1.field1 = null;
        int var3 = -50 / ((-arg2 - 91) / 35);
        class79.field1815 = null;
        while (true) {
            class77 var4 = (class77) class128.field3085.method107((byte) -115);
            if (var4 == null) {
                while (true) {
                    class77 var5 = (class77) class13.field250.method107((byte) -127);
                    if (var5 == null) {
                        if (class145.field3335 != 0) {
                            try {
                                class127 var6 = new class127(4);
                                var6.method1026(4, (byte) 127);
                                var6.method1026(class145.field3335, (byte) 127);
                                var6.method997(0, true);
                                class3.field60.method145(4, -6660, var6.field2960, 0);
                            } catch (IOException var8) {
                                try {
                                    class3.field60.method144(1);
                                } catch (Exception var7) {
                                }
                                class3.field60 = null;
                                class143.field3311++;
                            }
                        }
                        class16.field333 = 0;
                        class63.field1352 = class27.method233((byte) 103);
                        return;
                    }
                    class54.field1199.method163(-25373, var5);
                    class41.field964.method112(var5, (byte) 3, var5.field2090);
                    class149.field3429--;
                    class77.field1769++;
                }
            }
            class80.field1870.method112(var4, (byte) 3, var4.field2090);
            class63.field1334--;
            class80.field1828++;
        }
    }
}
